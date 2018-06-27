import com.zst.chat.service.ChatService;
import com.zst.chat.service.ClientType;
import com.zst.chat.service.LoginRequest;
import com.zst.chat.service.LoginResponse;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * Created by Ablert
 * on 2018/6/20.
 */
public class TestChat {

    public static void main(String[] args) throws TException {
        String ip = "10.1.26.190";
        int port = 9090;
        int timeOut = 1000;
        //创建transport
        TTransport transport = new TSocket(ip, port, timeOut);
        //创建TProtocol
        TProtocol protocol = new TBinaryProtocol(transport);
        //基于transport 和 protocol创建client
        ChatService.Client client = new ChatService.Client(protocol);
        transport.open();

        //调用client方法
        LoginRequest request = new LoginRequest();
        request.setMachineCode("");
        request.setUserName("zhanglin");
        request.setPassword("123456");
        request.setType(ClientType.PC);
        LoginResponse loginResponse = client.userLogin(request);
        System.out.println(loginResponse.getSessionId());
        transport.close();
    }

}
