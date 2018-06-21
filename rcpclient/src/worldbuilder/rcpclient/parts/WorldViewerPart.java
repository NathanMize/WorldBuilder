package worldbuilder.rcpclient.parts;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import worldbuilder.rcpclient.data.IWorld;
import worldbuilder.rcpclient.test.TestDataProvider;

public class WorldViewerPart {

	private TreeViewer treeViewer;

	@Inject
	private MPart part;

	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		treeViewer = new TreeViewer(parent);
		
		TreeViewerColumn nameViewerColumn = new TreeViewerColumn(treeViewer, SWT.LEAD);
		nameViewerColumn.getColumn().setText("World");
		nameViewerColumn.getColumn().setWidth(170);
		nameViewerColumn.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				IWorld world = (IWorld) cell.getElement();
				cell.setImage(world.getIcon());
				cell.setText(world.getName());
			}
		});
		
		TreeViewerColumn descViewerColumn = new TreeViewerColumn(treeViewer, SWT.LEAD);
		descViewerColumn.getColumn().setText("Description");
		descViewerColumn.getColumn().setWidth(300);
		descViewerColumn.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				IWorld world = (IWorld) cell.getElement();
				cell.setText(world.getDescription());
			}
		});
		
		treeViewer.setContentProvider(new ITreeContentProvider() {

			@Override
			public Object[] getElements(Object inputElement) {
				return inputElement instanceof List ? ((List) inputElement).toArray() : null;
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				return null;
			}

			@Override
			public Object getParent(Object element) {
				return null;
			}

			@Override
			public boolean hasChildren(Object element) {
				return false;
			}
			
		});
		treeViewer.setInput(TestDataProvider.getTestWorlds());
		treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	@Focus
	public void setFocus() {
		treeViewer.getTree().setFocus();
	}

	@Persist
	public void save() {
		part.setDirty(false);
	}
}