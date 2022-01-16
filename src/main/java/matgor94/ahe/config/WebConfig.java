package matgor94.ahe.config;

import matgor94.ahe.domain.model.OsobaEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class WebConfig {
    @Bean(name = "localResolver")
    public LocaleContextResolver getLocalContextResolver(){
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(new Locale("pl"));
        return sessionLocaleResolver;
    }

//    @Bean(name="user")
//    public OsobaEntity osobaEntity(){
//        OsobaEntity osobaEntity = new OsobaEntity();
//        return osobaEntity;
//    }
}
