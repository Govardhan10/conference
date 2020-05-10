import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.pluralsight"})
public class AppConfig {

    /*
    @Bean(name= "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
//        --------- Constructor Injection ----------------
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }
     */
}
