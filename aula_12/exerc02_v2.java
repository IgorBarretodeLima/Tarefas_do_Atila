import static java.lang.IO.*;
void main()
{
    float i= 1.0f ;
    do{

    println(String.format("%.2f" + i ));
    i += 0.01f;

}while (i<= 5.0f);

}
