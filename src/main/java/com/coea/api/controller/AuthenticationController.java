//package com.coea.api.controller;
//
//import com.coea.api.domain.user.User;
//import com.coea.api.infra.security.DataTokenJWT;
//import com.coea.api.infra.security.TokenService;
//import com.coea.api.user.DataAuthentication;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/login")
//public class AuthenticationController {
//
//    @Autowired
//    private AuthenticationManager manager;
//
//    @Autowired
//    private TokenService tokenService;
//
//    @PostMapping
//    ResponseEntity login(@RequestBody @Valid DataAuthentication data){
//        var authenticationToken = new UsernamePasswordAuthenticationToken(data.user(), data.password());
//        var authentication = manager.authenticate(authenticationToken);
//
//        var tokenJWT = tokenService.generateToken((User) authentication.getPrincipal());
//
//        return ResponseEntity.ok(new DataTokenJWT(tokenJWT));
//    }
//}
