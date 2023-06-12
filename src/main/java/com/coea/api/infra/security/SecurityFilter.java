//package com.coea.api.infra.security;
//
//import com.coea.api.domain.user.UserRepository;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//
//@Component
//class SecurityFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private TokenService tokenService;
//
//    @Autowired
//    UserRepository userRepository;
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        System.out.println("chamando o filter");
//        var tokenJWT = recoverToken(request);
//
//
//        if(tokenJWT != null){
//            var subject = tokenService.getSubject(tokenJWT);
//            var user = userRepository.findByLogin(subject);
//
//            var authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            System.out.println("logado na requisição");
//        }
//
//        filterChain.doFilter(request, response);
//
//    }
//
//    private String recoverToken(HttpServletRequest request) {
//        var authorizationHeader = request.getHeader("Authorization");
//        if (authorizationHeader != null) {
//            return authorizationHeader.replace("Bearer ", "");
//        }
//        return null;
//    }
//}
