package helloworld.server.helloworld;

import helloworld.server.ServerSession;
import helloworld.shared.helloworld.HelloWorldFormData;
import helloworld.shared.helloworld.IHelloWorldService;

/**
 * @author austin
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
