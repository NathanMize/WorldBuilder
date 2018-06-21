package worldbuilder.rcpclient.data;

import java.util.List;

public interface IWorld extends IViewerElement{
	public List<ILocation> getLocations();
	public List<ICreature> getCreatures();
	public List<IEvent> getEvents();
}
