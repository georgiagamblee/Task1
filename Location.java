public class Location {

    private static final String[] INACTIVE_SYMBOLS = { " ", "╴", "╷", "┐", "╶", "─", "┌", "┬", "╵", "┘", "│", "┤", "└", "┴", "├", "┼" };
	private static final String[] ACTIVE_SYMBOLS = { " ", "╸", "╻", "┓", "╺", "━", "┏", "┳", "╹", "┛", "┃", "┫", "┗", "┻", "┣", "╋" };

    private boolean canGoNorth;
    private boolean canGoEast;
    private boolean canGoSouth;
    private boolean canGoWest;
    private boolean canExit;
    private boolean playerHere;

    public Location(boolean canGoNorth, boolean canGoEast, boolean canGoSouth, boolean canGoWest, boolean canExit){
        this.canGoNorth = canGoNorth;
        this.canGoEast = canGoEast;
        this.canGoSouth = canGoSouth;
        this.canGoWest = canGoWest;
        this.canExit = canExit;
    }
    public boolean isExit(){
        if(canExit == true){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hasDirection(String direction){
        if(direction.equals("west")){
            return canGoWest;
        }
        if(direction.equals("north")){
            return canGoNorth;
        }
        if(direction.equals("south")){
            return canGoSouth;
        }
        if(direction.equals("east")){
            return canGoEast;
        }
        return false;
    }
    @Override
    public String toString(){
        String availableDirections = "Available directions:\n";
         if(this.canGoNorth == true){
            availableDirections += "north\n";
        }
        if(this.canGoEast == true){
            availableDirections += "east\n";
        }
        if(this.canGoSouth == true){
            availableDirections += "south\n";
        }
        if(this.canGoWest == true){
            availableDirections += "west\n";
        }
        return availableDirections;
    }

    public String mapRepresentation(){
       
        if(canGoWest && !canGoEast && !canGoSouth && !canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[1];
            }
            return INACTIVE_SYMBOLS[1];
        }

        if(!canGoWest && !canGoEast && canGoSouth && !canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[2];
            }
            return INACTIVE_SYMBOLS[2];
        }

        if(canGoWest && !canGoEast && canGoSouth && !canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[3];
            }
            return INACTIVE_SYMBOLS[3];
        }

        if(!canGoWest && canGoEast && !canGoSouth && !canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[4];
            }
            return INACTIVE_SYMBOLS[4];
        }

        if(canGoWest && canGoEast && !canGoSouth && !canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[5];
            }
            return INACTIVE_SYMBOLS[5];
        }

        if(!canGoWest && canGoEast && canGoSouth && !canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[6];
            }
            return INACTIVE_SYMBOLS[6];
        }

        if(canGoWest && canGoEast && canGoSouth && !canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[7];
            }
            return INACTIVE_SYMBOLS[7];
        }
        if(!canGoWest && !canGoEast && !canGoSouth && canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[8];
            }
            return INACTIVE_SYMBOLS[8];
        }

        if(canGoWest && !canGoEast && !canGoSouth && canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[9];
            }
            return INACTIVE_SYMBOLS[9];
        }

        if(!canGoWest && !canGoEast && canGoSouth && canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[10];
            }
            return INACTIVE_SYMBOLS[10];
        }

        if(canGoWest && !canGoEast && canGoSouth && canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[11];
            }
            return INACTIVE_SYMBOLS[11];
        }

        if(!canGoWest && canGoEast && !canGoSouth && canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[12];
            }
            return INACTIVE_SYMBOLS[12];
        }

        if(canGoWest && canGoEast && !canGoSouth && canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[13];
            }
            return INACTIVE_SYMBOLS[13];
        }

        if(!canGoWest && canGoEast && canGoSouth && canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[14];
            }
            return INACTIVE_SYMBOLS[14];
        }

        if(canGoWest && canGoEast && canGoSouth && canGoNorth){
            if(this.playerHere){
                return ACTIVE_SYMBOLS[15];
            }
            return INACTIVE_SYMBOLS[15];
        }


        if(this.playerHere){
            return ACTIVE_SYMBOLS[0];
        }
        return INACTIVE_SYMBOLS[0];

    }
    public void togglePlayerHere(){
        if(playerHere == true){
            this.playerHere = false;
        }
        this.playerHere = true;
    }
}
