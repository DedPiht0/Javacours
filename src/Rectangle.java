public class Rectangle {
    int sideX;
    int sideY;

//    Rectangle () {
//        sideX = 15;
//        sideY = 15;
//
//    }

    Rectangle(int sideX, int sideY ) {
        this.sideX = sideX;
        this.sideY = sideY ;
    }

//    void square () {
//        System.out.println(sideX * sideY);

    int square () {
            return sideX * sideY;
    }

    void setSides (int newSideX, int newSideY){
        sideX = newSideX;
        sideY = newSideY;
    }



}
