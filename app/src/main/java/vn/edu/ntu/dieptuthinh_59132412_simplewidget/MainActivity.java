package vn.edu.ntu.dieptuthinh_59132412_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtNgaySinh, edtSoThichKhac;
    RadioGroup RGGioiTinh;
    CheckBox CBXemPhim, CBNgheNhac, CBCafe, CBONha, CBNauAn;
    Button BTXacNhan;
    String TXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addView()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        RGGioiTinh = findViewById(R.id.RGGioiTinh);
        CBXemPhim = findViewById(R.id.CBXemPhim);
        CBNgheNhac = findViewById(R.id.CBNgheNhac);
        CBCafe = findViewById(R.id.CBCafe);
        CBONha = findViewById(R.id.CBONha);
        CBNauAn = findViewById(R.id.CBNauAn);
        edtSoThichKhac = findViewById(R.id.edtSoThichKhac);
        BTXacNhan = findViewById(R.id.BTXacNhan);
    }

    private void addEvent()
    {
        BTXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XacNhan();
            }
        });
    }

    private void XacNhan()
    {
        TXacNhan = edtTen.getText().toString() + "\n" + "Ngày sinh: " + edtNgaySinh.getText().toString()
                + "\n" + "Giới tính: ";
        if (RGGioiTinh.getCheckedRadioButtonId() == R.id.radioNam )
            TXacNhan += "Nam" + "\n" + "Sở thích: ";
        else
            TXacNhan += "Nữ" + "\n" + "Sở thích: ";
        if (CBXemPhim.isChecked())
            TXacNhan += "Xem phim; ";
        if (CBNgheNhac.isChecked())
            TXacNhan += "Nghe nhạc; ";
        if (CBCafe.isChecked())
            TXacNhan += "Đi cà phê với bạn; ";
        if (CBONha.isChecked())
            TXacNhan += "Ở nhà một mình; ";
        if (CBNauAn.isChecked())
            TXacNhan += "Vào bếp nấu ăn; ";

        TXacNhan += edtSoThichKhac.getText().toString();
        Toast.makeText(getApplicationContext(), TXacNhan, Toast.LENGTH_LONG).show();
    }
}
