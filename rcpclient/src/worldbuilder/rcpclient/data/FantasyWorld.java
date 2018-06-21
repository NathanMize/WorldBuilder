package worldbuilder.rcpclient.data;

import java.util.List;

import org.eclipse.swt.graphics.Image;
import worldbuilder.rcpclient.Activator;

public class FantasyWorld implements IWorld {
	private static final Image ICON = Activator.getImageDescriptor("icons/magic_wand.png").createImage();;
	private String name;
	private String description;

	public FantasyWorld(String name, String description) {
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
		return null;
	}

	@Override
	public List<ICreature> getCreatures() {
		return null;
	}

	@Override
	public List<IEvent> getEvents() {
		return null;
	}

}
