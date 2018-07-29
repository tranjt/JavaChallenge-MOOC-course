
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int days;
        if (comparedDate.year > this.year) {
            days = (comparedDate.year - this.year)*360 
                    + (comparedDate.month - this.month)*30
                    + (comparedDate.day - this.day);
            return days/360;
        } else {
             days = (this.year - comparedDate.year)*360 
                    + (this.month - comparedDate.month)*30
                    + (this.day - comparedDate.day);
            return days/360;
        }
        

    }

}
