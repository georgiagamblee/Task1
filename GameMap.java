public class GameMap {

  private int height;
  private int width;
  private Location[][] matrix;
  
  public GameMap(int h, int w){
    if(h < 0){
      this.height = 0;
    }
    else{
      this.height = h;
    }
    if(w < 0){
      this.width = 0;
    }
    else{
      this.width = w;
    }
    this.matrix = new Location[this.height][this.width];
  }

  public int getHeight(){
    return this.height;
  }

  public int getWidth(){
    return this.width;
  }

  public boolean setLocation(int h, int w, Location position){
    if(h > 0 && h < matrix.length && w > 0 && w > matrix.length){
      this.matrix[h][w] = position;
      return true;
    }
    return false;
  }

  public Location getLocation(int h, int w){
    if(h > 0 && h < matrix.length && w > 0 && w < matrix.length){
       return this.matrix[h][w];
    }
    return null;
  }

  @Override
  public String toString(){
    
  }
  

}
