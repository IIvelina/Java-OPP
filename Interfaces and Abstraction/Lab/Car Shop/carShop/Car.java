package carShop;

import java.io.Serializable;

public interface Car extends Serializable {
//public static final int TIRES = 4;
Integer TIRES = 4;

//getModel(): String
//+getColor(): String
//+getHorsePower(): Integer
//+countryProduced(): String

    //public String getModel();
    //public String getColor();
    //public Integer getHorsePower();
    //public String countryProduced();
    //не нужно да се пише, че методите са абстрактни,
    //то се подразира, защото ползваме интерфейс

   String getModel();
    String getColor();
    Integer getHorsePower();
}
