package SongPlayer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Dateedit {
    int year;
    int month;
    int date;

    Dateedit(String input){
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
            LocalDate parsedDate = LocalDate.parse(input, formatter);
            year = parsedDate.getYear();
            month = parsedDate.getMonthValue();
            date = parsedDate.getDayOfMonth();

        } catch (Exception e) {
            System.out.println("Invalid date format. Using current date");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Dateedit dateedit = (Dateedit) obj;
        return year == dateedit.year &&
                month == dateedit.month &&
                date == dateedit.date;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        result = 31 * result + date;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%02d", date, month, year);
    }

}


