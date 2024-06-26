package cholog.di;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjection {
    private InjectionBean injectionBean;

    public ConstructorInjection(InjectionBean injectionBean) {
        this.injectionBean = injectionBean;
    }

    /*
        ConstructorInjection으로 InjectionBean 주입받기
         */
    public String sayHello() {
        return injectionBean.hello();
    }
}
