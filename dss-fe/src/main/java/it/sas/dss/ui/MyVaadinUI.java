package it.sas.dss.ui;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.event.FieldEvents.BlurEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Calendar;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.components.calendar.event.BasicEvent;

@Theme("mytheme")
@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = MyVaadinUI.class, widgetset = "it.sas.dss.AppWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        setContent(layout);
        
        DateField date = new DateField();
        date.setValue(new Date());
        date.setDateFormat("dd-MM-yyyy hh:mm");
        date.setWidth("10em");
//        date.addBlurListener(new MyBlurListener());
        
        layout.addComponent(date);
   
        
//        TextField tf = new TextField("test");
//        layout.addComponent(tf);
//        layout.setCaption("caption");
//        
//        Button button = new Button("Click Me");
//        button.addClickListener(new Button.ClickListener() {
//            public void buttonClick(ClickEvent event) {
//                layout.addComponent(new Label("Thank you for clicking"));
//            }
//        });
//        layout.addComponent(button);
        
        Calendar calendar = new Calendar("My Calendar");
        calendar.setWidth("600px");
        calendar.setHeight("300px");
        calendar.addActionHandler(new CalendarActionHandler());
        
        GregorianCalendar start = new GregorianCalendar();
        GregorianCalendar end   = new GregorianCalendar();
        end.add(java.util.Calendar.HOUR, 5);       
        
        
        
        calendar.addEvent(new BasicEvent("Calendar study",
                "Learning how to use Vaadin Calendar",
                start.getTime(), end.getTime()));
        
        layout.addComponent(calendar);
    }

}
