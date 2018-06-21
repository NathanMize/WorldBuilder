package worldbuilder.rcpclient.test;

import java.util.ArrayList;
import java.util.List;

import worldbuilder.rcpclient.data.FantasyWorld;
import worldbuilder.rcpclient.data.IWorld;
import worldbuilder.rcpclient.data.SciFiWorld;

public class TestDataProvider {
	public static List<IWorld> getTestWorlds(){
		List<IWorld> worldList = new ArrayList<>();
		worldList.add(new FantasyWorld("fantasy world 1","abcd"));
		worldList.add(new FantasyWorld("fantasy world 2","efgh"));
		worldList.add(new FantasyWorld("fantasy world 3","ijkl"));
		worldList.add(new SciFiWorld("sci fi world 1","mnop"));
		worldList.add(new SciFiWorld("sci fi world 2","qrst"));
		worldList.add(new SciFiWorld("sci fi world 3","uvwx"));
		return worldList;
	}
}
