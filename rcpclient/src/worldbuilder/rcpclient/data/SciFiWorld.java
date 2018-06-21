package worldbuilder.rcpclient.data;

import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import worldbuilder.rcpclient.Activator;

public class SciFiWorld implements IWorld{
	private static final Image ICON = Activator.getImageDescriptor("icons/atom.png").createImage();
	private String name;
	private String description;
	
	public SciFiWorld(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Image getIcon() {
		return ICON;
	}

	@Override
	public List<ILocation> getLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ICreature> getCreatures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEvent> getEvents() {
		// TODO Auto-generated method stub
		return null;
	}

}
