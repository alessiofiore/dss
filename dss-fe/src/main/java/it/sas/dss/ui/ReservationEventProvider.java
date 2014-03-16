package it.sas.dss.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vaadin.ui.components.calendar.event.CalendarEvent;
import com.vaadin.ui.components.calendar.event.CalendarEventProvider;

@SuppressWarnings("serial")
public class ReservationEventProvider implements CalendarEventProvider {

	@Override
	public List<CalendarEvent> getEvents(Date startDate, Date endDate) {
		return new ArrayList<ReservationEvent>();
		
		
		return null;
	}

}
