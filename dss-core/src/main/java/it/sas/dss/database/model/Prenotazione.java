package it.sas.dss.database.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the prenotazione database table.
 * 
 */
@Entity
@NamedQuery(name="Prenotazione.findAll", query="SELECT p FROM Prenotazione p")
public class Prenotazione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_inizio")
	private Date dataInizio;

	//bi-directional many-to-one association to Autoscuola
	@ManyToOne
	@JoinColumn(name="id_autoscuola")
	private Autoscuola autoscuola;

	//bi-directional many-to-one association to Iscrizione
	@ManyToOne
	@JoinColumn(name="id_iscrizione")
	private Iscrizione iscrizione;

	//bi-directional many-to-one association to Istruttore
	@ManyToOne
	@JoinColumn(name="id_istruttore")
	private Istruttore istruttore;

	//bi-directional many-to-one association to Mezzo
	@ManyToOne
	@JoinColumn(name="id_mezzo")
	private Mezzo mezzo;

	public Prenotazione() {
	}

	public Date getDataFine() {
		return this.dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Date getDataInizio() {
		return this.dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Autoscuola getAutoscuola() {
		return this.autoscuola;
	}

	public void setAutoscuola(Autoscuola autoscuola) {
		this.autoscuola = autoscuola;
	}

	public Iscrizione getIscrizione() {
		return this.iscrizione;
	}

	public void setIscrizione(Iscrizione iscrizione) {
		this.iscrizione = iscrizione;
	}

	public Istruttore getIstruttore() {
		return this.istruttore;
	}

	public void setIstruttore(Istruttore istruttore) {
		this.istruttore = istruttore;
	}

	public Mezzo getMezzo() {
		return this.mezzo;
	}

	public void setMezzo(Mezzo mezzo) {
		this.mezzo = mezzo;
	}

}