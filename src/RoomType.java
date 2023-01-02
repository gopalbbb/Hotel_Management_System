/**
 * Create enum class for room type
 * pass enum to main class
 *
 *
 *
  */

public enum RoomType {
	    STANDARD("STANDARD"),
	    DELUXE("DELUXE"),
		SUPERDELUXE("SUPERDELUXE");

	    String value;
	    RoomType(String value){
	        this.value=value;
	    }
	    static RoomType getByValue(String value){
	        for(RoomType r:RoomType.values()){
	            if (value.equals(value)){
	                return r;
	            }
	        }
	        return null;
	    }

	}

