package worldbuilder.rcpclient.data;

import java.util.List;

import org.eclipse.swt.graphics.Image;

public class AbstractWorld  implements IWorld {

	protected String name;
	protected String description;

	public AbstractWorld() {
		super();
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

	@Override
	public Image getIcon() {
		return null;
	}

	@Override
	public List<IViewerElement> getChildren() {
		return null;
	}

	@Override
	public IViewerElement getParent() {
		return null;
	}

}