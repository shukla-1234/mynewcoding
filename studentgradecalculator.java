
int s_id = Integer.parseInt(jTextField1.getText());
String s_name = jTextField2.getText();
String s_sec = jTextField7.getText();
double physics = Double.parseDouble(jTextField3.getText());
double chemestry = Double.parseDouble(jTextField4.getText());
double maths = Double.parseDouble(jTextField8.getText());
double eng = Double.parseDouble(jTextField9.getText());


double total = physics + chemestry + maths + eng;
jTextField5.setText("" + total);


double per = (total / 400) * 100;
jTextField10.setText("" + per);
String grade = null;


if (per > 90) {
	grade = "A";
} else if ((per > 85) && (per < 90)) {
	grade = "B";
} else if ((per > 80) && (per < 85)) {
	grade = "C";
} else if ((per > 70) && (per < 80)) {
	grade = "D";
} else if ((per > 60) && (per < 70)) {
	grade = "E";
} else if ((per > 50) && (per < 60)) {
	grade = "Poor";
}

jTextField6.setText("" + grade);

jOptionPane1.showMessageDialog(null, "Hello: " + s_name + " of class: " + s_sec +
	"\nYour Grade is: " + grade);
