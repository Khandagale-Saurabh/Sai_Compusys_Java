import java.awt.*;

class frame11 extends Frame
{
	private Label l;
	public frame11(String tit)
	{
	super(tit);
	setSize(200,0303);
	setVisible(true);
	l=new Label("saurabh");
	add(l);
	TextField t=new TextField("SSSS",20);
	add(t);
	 t.setBackground(Color.green);

	TextArea ta=new TextArea("",202,202);

     add(ta);
     ta.setBackground(Color.blue);
    }
	public static void main(String s[])
	{
		frame11 a=new frame11("Sai_baba");
	}


}