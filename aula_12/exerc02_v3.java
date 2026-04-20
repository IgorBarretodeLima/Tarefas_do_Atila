import static java.lang.IO.println;

void main() {

    for (float i = 1.0f; i <= 5.01f; i+= 0.01f){
        println(String.format("%.2f" + i ));

    }
}
