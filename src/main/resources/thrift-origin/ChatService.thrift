
include "Struct.thrift"
include "Exception.thrift"
 
namespace java com.zst.chat.service

service ChatService{
	// 登录
	Struct.LoginResponse userLogin(1: Struct.LoginRequest request)
		throws (1: Exception.OperationException e);
	
	// 注销
	void userLogout(1: Struct.SessionInfo session)
		throws (1: Exception.InvalidSessionException e);
	
	// 注册
	bool userRegister(1: Struct.RegisterRequest request)
		throws (1: Exception.OperationException e);
	
	// 获取用户列表
	list<Struct.UserInfo> getUserList(1: Struct.SessionInfo session, 2: Struct.GetUserListRequest request)
		throws (1: Exception.InvalidSessionException e, 2: Exception.OperationException e2);
	
	// 获取用户图像
	binary getUserLogo(1: Struct.SessionInfo session, 2: Struct.GetUserLogoRequest request)
		throws (1: Exception.InvalidSessionException e, 2: Exception.OperationException e2);
	
	// 发送消息
	Struct.SendMessageResponse sendMessage(1: Struct.SessionInfo session, 2: Struct.MessageInfo message)
		throws (1: Exception.InvalidSessionException e, 2: Exception.OperationException e2);
	
}