package it.sas.dss.ui;

import java.util.Date;

import com.vaadin.ui.components.calendar.event.CalendarEvent;

public class ReservationEvent implements CalendarEvent {

	private static final long serialVersionUID = -3172955333715620212L;
	
	private String id;
	private Date start;
	private Date end;
	private String caption;
	private String description;
	private String styleName;
	private boolean allDay;
	
	public String getId() {
		return id;
	}

	@Override
	public Date getStart() {
		return start;
	}

	@Override
	public Date getEnd() {
		return end;
	}

	@Override
	public String getCaption() {
		return caption;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getStyleName() {
		return styleName;
	}

	@Override
	public boolean isAllDay() {
		return allDay;
	}
}
