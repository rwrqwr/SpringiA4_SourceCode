package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import soundsystem.properties.BlankDisc;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeggers(){
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("no1.Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("no.2Sg");
        tracks.add("no.3get");
        tracks.add("no.4gfasdgt");

        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackcounter() {
        return new TrackCounter();
    }

}
