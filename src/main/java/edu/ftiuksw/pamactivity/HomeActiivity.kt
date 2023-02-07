package edu.ftiuksw.pamactivity


import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.ftiuksw.pamactivity.ui.theme.PAMActivityTheme

class HomeActiivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""
                    Head(username)
                }
            }
        }
    }
}

@Composable
fun Head(name: String) {
    val power = painterResource(id = R.drawable.power)
    val toggle = painterResource(id = R.drawable.group_1)
    val info = painterResource(id = R.drawable.group_20)
    val trans = painterResource(id = R.drawable.group_21)
    val beli = painterResource(id = R.drawable.group_22)
    val informasi = painterResource(id = R.drawable.group_23)
    val topup = painterResource(id = R.drawable.group_24)
    val bayar = painterResource(id = R.drawable.group_25)
    val banner = painterResource(id = R.drawable.group_19)
    val online = painterResource(id = R.drawable.eclipse)
    val home = painterResource(id = R.drawable.vector)
    val docs = painterResource(id = R.drawable.group_14)
    val setting = painterResource(id = R.drawable.vector_1)
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF262626)),
            horizontalArrangement  = Arrangement.spacedBy(8.dp)
        ){
        Image(
            painter = online,
            contentDescription = "",
            modifier = Modifier
                .size(10.dp)
                .align(Alignment.CenterVertically)
        )
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle
                        (
                        fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive,
                        fontSize = 50.sp,
                        color = Color.White,
                    )
                ){
                    append("BSG")
                }
                withStyle(
                    style = SpanStyle
                        (
                        fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
                        fontSize = 50.sp,
                        color = Color.White
                    )
                ){
                    append("touch")
                }
            }
        )
        Image(
            painter = power,
            contentDescription = "",
            alignment = Alignment.CenterEnd,
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.CenterVertically),
        )
        }
        Column() {
            Text(//norek
                text = "672019253",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Black)
            )
            Text(//nama
                text = "$name",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Black)
            )
            Text(//tabungan
                text = "12345678901234",
                color = Color(0xFF998852),
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Black)
            )
            Image(
                painter = toggle,
                contentDescription = "",
                Modifier
                    .fillMaxWidth()
                    .background(color = Color(0XFFBF1E2E))
                    .size(18.dp)
            )

            Text(//beranda
                text = "Beranda",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Black)
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(50.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .paddingFromBaseline(top = 10.dp, bottom = 10.dp)
            ) {
                Image(
                    painter = info,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
                Image(
                    painter = trans,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
                Image(
                    painter = beli,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(50.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .paddingFromBaseline(top = 10.dp, bottom = 10.dp)
            ) {
                Text(//info
                    text = "Info Rekening",
                    color = Color(0XFFBF1E2E),
                    fontSize = 12.sp,
                )
                Text(//transfer
                    text = "Transfer",
                    color = Color(0XFFBF1E2E),
                    fontSize = 12.sp,
                )
                Text(//pembelian
                    text = "Pembelian",
                    color = Color(0XFFBF1E2E),
                    fontSize = 12.sp,
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(50.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .paddingFromBaseline(top = 10.dp, bottom = 10.dp)
            ) {
                Image(
                    painter = bayar,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
                Image(
                    painter = informasi,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
                Image(
                    painter = topup,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(50.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .paddingFromBaseline(top = 10.dp, bottom = 10.dp)
            ) {
                Text(//pembayaran
                    text = "Pembayaran",
                    color = Color(0XFFBF1E2E),
                    fontSize = 12.sp,
                )
                Text(//topup
                    text = "Top up",
                    color = Color(0XFFBF1E2E),
                    fontSize = 12.sp,
                )
                Text(//informasi
                    text = "Informasi",
                    color = Color(0XFFBF1E2E),
                    fontSize = 12.sp,
                )
            }
            Image(
                painter = banner,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(50.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .paddingFromBaseline(top = 15.dp, bottom = 0.dp)
                    .background(color = Color(0xFF262626))
            ) {
                Image(
                    painter = home,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
                Image(
                    painter = docs,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
                Image(
                    painter = setting,
                    contentDescription = "",
                    Modifier
                        .size(50.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(50.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .paddingFromBaseline(top = 15.dp, bottom = 0.dp)
                    .background(color = Color(0xFF262626))
            ) {
                Text(//beranda
                    text = "Beranda",
                    color = Color(0XFFBF1E2E),
                    fontSize = 12.sp,
                )
                Text(//mutasi
                    text = "Mutasi Rekening",
                    color = Color.White,
                    fontSize = 12.sp,
                )
                Text(//setting
                    text = "Pengaturan",
                    color = Color.White,
                    fontSize = 12.sp,
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMActivityTheme {
        Head("EBEN HAEZER BERTHO NADILEHON TAMBUNAN")
    }
}