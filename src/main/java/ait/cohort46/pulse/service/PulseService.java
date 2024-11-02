package ait.cohort46.pulse.service;

import ait.cohort46.pulse.dto.PulseDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class PulseService {
    @Bean
    public Consumer<PulseDto> receiveData() {
        return p -> {
            long delay = System.currentTimeMillis() - p.getTimestamp();
            System.out.println("delay: " + delay + ", id: " + p.getId() + ", pulse: " + p.getPayload());
        };
    }
}
