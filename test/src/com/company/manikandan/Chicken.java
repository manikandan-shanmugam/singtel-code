package com.company.manikandan;

public class Chicken extends Bird {

    String sound;

    @Override
    public boolean fly() {
        return false;
    }

    // consider rooster only have sound different
    public boolean sing(String type) {
        switch (type) {
            case "Rooster":
                sound = "Cock-a-doodle-doo";
                break;
            default:
                sound = "Cluck, cluck";
        }
        return super.sing(sound);
    }

    public boolean sing(String type, String senLan){
       if( type=="Rooster") {
           switch (senLan) {
               case "Danish":
                   sound = "kykyliky";
                   break;
               case "Tamil": //native tongue
                   sound = "cookorako";
                   break;
               default:
                   sound = "";
           }
       }

        return super.sing(sound);
    }
}
