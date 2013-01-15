package com.saas.golf.web.servlet.filter;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JsonpCallbackFilter implements Filter {

	private static Log LOG = LogFactory.getLog(JsonpCallbackFilter.class);

	@SuppressWarnings("unchecked")
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
		
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		Map<String, String[]> parms = httpRequest.getParameterMap();
		if (parms.containsKey("callback")) {
			OutputStream out = httpResponse.getOutputStream();
			GenericResponseWrapper wrapper = new GenericResponseWrapper(httpResponse);
			chain.doFilter(request, wrapper);
			
			byte[] jsonpResponse1 = new String(parms.get("callback")[0] + "(").getBytes();
			//byte[] jsonpResponse2 =  wrapper.getData();
			String json = new String(wrapper.getData());
			LOG.info("--> " + json);
			String[] encodeObjectIDs = json.split("\\}\\,\\{");
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < encodeObjectIDs.length; i++) {
				String encodeObjectID = encodeObjectIDs[i];
				//LOG.info("--> " + encodeObjectID);
				String tmp = encodeObjectID.substring(encodeObjectID.indexOf("id\":") + 4);				
				String tmp2 = tmp.substring(0, tmp.indexOf(','));
				sb.append(encodeObjectID.replaceFirst(tmp2, "\"" + tmp2 + "\""));
				if (i < (encodeObjectIDs.length - 1)) {
					sb.append("},{");
				}
			}
			byte[] jsonpResponse3 = new String(");").getBytes();
			byte[] jsonpResponse2 = sb.toString().getBytes();
			
			wrapper.setContentType("text/javascript;charset=UTF-8");
			wrapper.setContentLength(jsonpResponse1.length + jsonpResponse2.length + jsonpResponse3.length);

			out.write(jsonpResponse1);
			out.write(jsonpResponse2);
			out.write(jsonpResponse3);

			out.close();
		} else {
			chain.doFilter(request, response);
		}
		} catch (Exception e) {
			LOG.error(e, e);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public class GenericResponseWrapper extends HttpServletResponseWrapper {
		private ByteArrayOutputStream output;
		private int contentLength;
		private String contentType;

		public GenericResponseWrapper(HttpServletResponse response) {
			super(response);
			output = new ByteArrayOutputStream();
		}

		public byte[] getData() {
			return output.toByteArray();
		}

		public ServletOutputStream getOutputStream() {
			return new FilterServletOutputStream(output);
		}

		public PrintWriter getWriter() {
			return new PrintWriter(getOutputStream(), true);
		}

		public void setContentLength(int length) {
			this.contentLength = length;
			super.setContentLength(length);
		}

		public int getContentLength() {
			return contentLength;
		}

		public void setContentType(String type) {
			this.contentType = type;
			super.setContentType(type);
		}

		public String getContentType() {
			return contentType;
		}

	}

	public class FilterServletOutputStream extends ServletOutputStream {
		private DataOutputStream stream;

		public FilterServletOutputStream(OutputStream output) {
			stream = new DataOutputStream(output);
		}

		public void write(int b) throws IOException {
			stream.write(b);

		}

		public void write(byte[] b) throws IOException {
			stream.write(b);
		}

		public void write(byte[] b, int off, int len) throws IOException {
			stream.write(b, off, len);
		}
	}

}
