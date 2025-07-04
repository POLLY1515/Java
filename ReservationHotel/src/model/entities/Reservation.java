package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	//O dado esta como staico para que nao seja instanciado 
	//um novo simpleDateFormate pra cada objeto reservation que a aplicacao tiver
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}

	
	public  long duration() {//getTime devolve a quantidade de milisegundos da data
		long diff = checkOut.getTime() - checkIn.getTime();
		//conveterndo milissegundos para dias 
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
	}
	

	public String updateDate(Date checkIn, Date checkOut) {
		
		 //criando uma data com o horario de agora
		 Date now = new Date();
		 if(checkIn.before(now) || checkOut.before(now)){
			 //before anterior
			 return("Reservation dates update must be future");
		 }
		 if(!checkOut.after(checkIn)) {
			 return("Check-out date must be after check-in date");
		 }
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}

	@Override
	public String toString() {
		return "Room"
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out "
				+ sdf.format(checkOut)
				+ ","
				+ duration()
				+ " nights";
	}
	
	
	
}
