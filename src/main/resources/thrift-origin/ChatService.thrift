
include "Struct.thrift"
include "Exception.thrift"
 
namespace java com.zst.chat.service
namespace cocoa ChatRoomService
namespace csharp ChatRoomService

service ChatService{
	// 登录
	Struct.LoginResponse userLogin(1: Struct.LoginRequest request);
	
	// 注销
	void userLogout(1: Struct.SessionInfo session);
	
	// 注册
	bool userRegister(1: Struct.RegisterRequest request);
	
	// 获取用户列表
	list<Struct.UserInfo> getUserList(1: Struct.SessionInfo session, 2: Struct.GetUserListRequest request)
		throws (1: Exception.InvalidSessionException e);
	
	// 发送消息
	Struct.SendMessageResponse sendMessage(1: Struct.SessionInfo session, 2: Struct.MessageInfo message)
		throws (1: Exception.InvalidSessionException e, 2: Exception.OperationException e2);
	
}