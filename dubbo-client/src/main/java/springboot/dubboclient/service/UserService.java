package springboot.dubboclient.service;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import springboot.dubbo.service.ticketServer;

@Service
public class UserService {
    /**
     * 按照全类名进行匹配，看谁给注册中心里面注册了这个全类名的服务，因为发布就死按照全类名发布
     */
    @Reference
    ticketServer ticketServer;

    public void hello() {
        String ticker = ticketServer.getTicker();
        System.out.println("get到了"+ticker);
    }

}
