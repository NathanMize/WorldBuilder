package worldbuilder.rcpclient.data;

import java.util.List;

import org.eclipse.swt.graphics.Image;

public interface IViewerElement {
	public String getName();
	public String getDescription();
	public Image getIcon();
	public List<IViewerElement> getChildren();
	public IViewerElement getParent();
}
