package domain.models;

import lombok.Data;

import java.util.List;
@Data
public class Cerveza {
    private int id;
    private String name;
    private String tagline;
    private String first_brewed;
    private String description;
    private String image_url;
    private double abv;
    private int ibu;
    private int target_fg;
    private int target_og;
    private int ebc;
    private int srm;
    private double ph;
    private int attenuation_level;
    private Volume volume;
    private BoilVolume boil_volume;
    private Method method;
    private Ingredients ingredients;
    private List<String> food_pairing;
    private String brewers_tips;
    private String contributed_by;

}
