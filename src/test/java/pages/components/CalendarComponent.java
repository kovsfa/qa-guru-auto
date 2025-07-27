package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    SelenideElement dateOfBirth = $("#dateOfBirthInput"),
            monthOfBirth = $(".react-datepicker__month-select"),
            yearOfBirth = $(".react-datepicker__year-select"),
            dayOfBirth = $(".react-datepicker__day--0");


    public void setDate(String day, String month, String year) {
        $(dateOfBirth).click();
        $(monthOfBirth).selectOptionByValue(month);
        $(yearOfBirth).selectOptionByValue(year);
        $(dayOfBirth + day).click();
    }
}
