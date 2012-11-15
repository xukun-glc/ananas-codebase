package ananas.lib.xmpp.api;

public interface AXClientControl {

	int CTRL_GET_ACCOUNT = 1;
	int CTRL_CONNECT = 2;
	int CTRL_DISCONNECT = 3;
	int CTRL_CLOSE = 4;
	int CTRL_BIND_ACCOUNT = 5;

	void bindAccount(AXAccount account);

	AXAccount getAccount();

	void connect();

	void disconnect();

	void close();

}