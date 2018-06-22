package worldbuilder.rcpclient.data;

import org.eclipse.swt.graphics.Image;
import worldbuilder.rcpclient.Activator;

public class FantasyWorld extends AbstractWorld {
	private static final Image ICON = Activator.getImageDescriptor("icons/magic_wand.png").createImage();;
	public FantasyWorld(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public Image getIcon() {
		return ICON;
	}

}
