package it.mdps.gestguide.ui.components;

import it.mdps.gestguide.ui.services.UIFacade;

import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.SelectedTabChangeEvent;
import com.vaadin.ui.VerticalLayout;

public class Home extends VerticalLayout {

	private static final long serialVersionUID = -3234057581282243290L;
	
	private TabSheet tabSheet;
	private UIFacade uiFacade;
	
	public Home(UIFacade uiFacade){
		this.uiFacade = uiFacade;
		
		// Tab 1 content
        Reservation l1 = new Reservation();
        
        // Tab 2 content
        School l2 = new School(uiFacade);
        // Tab 3 content
        VerticalLayout l3 = new VerticalLayout();
        l3.setMargin(true);
        l3.addComponent(new Label("There are currently no issues."));

        tabSheet = new TabSheet();
        tabSheet.setSizeFull();

        tabSheet.addTab(l1, "Calendario", null);
        tabSheet.addTab(l2, "Autoscuole", null);
        tabSheet.addTab(l3, "---", null);
        
        tabSheet.addSelectedTabChangeListener(
                new TabSheet.SelectedTabChangeListener() {
            public void selectedTabChange(SelectedTabChangeEvent event) {
                // Find the tabsheet
                TabSheet tabsheet = event.getTabSheet();
                // Find the tab (here we know it's a layout)
                Component tab = (Component) tabsheet.getSelectedTab();
                // Get the tab caption from the tab object
                String caption = tabsheet.getTab(tab).getCaption();                
            } });
        

        addComponent(tabSheet);
	}
	

}
