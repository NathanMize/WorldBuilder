package worldbuilder.rcpclient.data;

import org.eclipse.swt.graphics.Image;
import worldbuilder.rcpclient.Activator;

public class SciFiWorld extends AbstractWorld{
	private static final Image ICON = Activator.getImageDescriptor("icons/atom.png").createImage();
	public SciFiWorld(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public Image getIcon() {
		return ICON;
	}

}
