package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter implements Filter {
    private final String uuid = UUID.randomUUID().toString();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (servletResponse instanceof HttpServletResponse) {
            HttpServletResponse httpServletResponse =
                    (HttpServletResponse) servletResponse;
            httpServletResponse.setHeader("Instance-Id", uuid);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
