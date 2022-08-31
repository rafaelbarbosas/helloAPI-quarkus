package br.com.bb.compra.service.impl;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.bb.compra.service.HelloService;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@Named("helloServiceImpl")
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    @Override
    public String getCurrentHour() {
        return "Agora são " + 
            LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) +
            ", não se esqueça!";
    }

}
