
	public enum RoomType {
	    STANDARD("STANDARD"),
	    DELUX("DELUX"),
	    SUPERDELUX("SUPERDELUX");

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

