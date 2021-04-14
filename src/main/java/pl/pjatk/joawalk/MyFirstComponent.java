package pl.pjatk.joawalk;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {
    public MyFirstComponent(MySecondComponent mySecondComponent,
                            CustomProperties properties,
                            CarPOJO carPOJO,
                            List<String> defaultData,
                            List<String>anotherDefaultData,
                            List<CarPOJO>carPOJOS){
        //System.out.println("Hello from MyFirstComponent");
        //mySecondComponent.helloFromMethod();
        //carPOJO.print();
        //System.out.println(defaultData);
        //System.out.println(anotherDefaultData);
        //System.out.println(carPOJOS);
        System.out.println(properties.getProperty());
    }
}

