package springboot.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class TicketServiceImpl implements ticketServer{
    @Override
    public String getTicker() {
        return "《SBZZ》";
    }
}
