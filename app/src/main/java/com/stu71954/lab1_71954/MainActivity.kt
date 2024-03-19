package com.stu71954.lab1_71954

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GLogin()
//            GSignUp()
//            BLogin()
//            BSignUp()
        }
    }
}

object AppColors {
    val LightGrey = Color(0xFFE1E1E1)
    val White = Color(0xFFEFEFEF)
    val Black = Color(0xFF131313)
    val LightBlack = Color(0xFF1D1D1D)
}


//GLogin------------------------------------

@Composable
fun GreetingImage() {
    val image = painterResource(id = R.drawable.cadeado)
    Box {
        Image(
            painter = image,
            contentDescription = null,
        )
    }
}

@Composable
fun TopPart(){
    Text(
        text = "Welcome back you've been missed!",
        fontSize = 18.sp,
        color = AppColors.LightBlack,
    )
}

@Composable
fun TextFieldPart() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),

    ) {
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Email") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.White,
                unfocusedContainerColor = AppColors.White,
                disabledContainerColor = AppColors.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.LightBlack,
                unfocusedTextColor = AppColors.LightBlack,
                focusedLabelColor = AppColors.LightBlack,
                ),
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        )
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Password") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.White,
                unfocusedContainerColor = AppColors.White,
                disabledContainerColor = AppColors.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.LightBlack,
                unfocusedTextColor = AppColors.LightBlack,
                focusedLabelColor = AppColors.LightBlack,

                ),
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        )

        Text(
            text = "Forgot Password?",
            fontSize = 15.sp,
            color = AppColors.LightBlack,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.End
        )
    }
}

@Composable
fun ButtonsPart(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.White,
                contentColor = AppColors.Black,
            ),
        ){
            Text(
                "Login",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Text(
            text = "Or continue with",
            fontSize = 15.sp,
            color = AppColors.LightBlack,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun LoginSocial() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Button(
            modifier = Modifier
                .padding(8.dp)
                .size(80.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.5.dp, Color.White),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.White,
                contentColor = AppColors.White
            ),
            contentPadding = PaddingValues(3.dp) // Change the inner padding here
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = null,
                modifier = Modifier
                    .height(90.dp)
                    .width(90.dp)
            )
        }
        Spacer(modifier = Modifier.width(15.dp))
        Button(
            modifier = Modifier
                .size(80.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.5.dp, Color.White),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.White,
                contentColor = AppColors.White,
            ),
            contentPadding = PaddingValues(3.dp) // Change the inner padding here
        ) {
            Image(
                painter = painterResource(id = R.drawable.mac),
                contentDescription = null,
                modifier = Modifier
                    .height(90.dp)
                    .width(90.dp),
            )
        }
    }
    Row (
        modifier = Modifier
            .padding(bottom = 10.dp)
    ){
        Text(
            text = "Not a member? ",
            fontSize = 15.sp,
            color = AppColors.LightBlack,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Register now",
            fontSize = 15.sp,
            color = AppColors.LightBlack,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun GLogin() {
    Surface(
        color = AppColors.LightGrey,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            GreetingImage()
            TopPart()
            TextFieldPart()
            ButtonsPart()
            LoginSocial()

              }
         }
    }

//GSignUp------------------------------------

@Composable
fun GreetingImageSignUp() {
    val image = painterResource(id = R.drawable.cadeado)
    Box {
        Image(
            painter = image,
            contentDescription = null,
        )
    }
}

@Composable
fun TopPartSignUp(){

    Text(
        text = "Let's create an account for you",
        fontSize = 20.sp,
        color = AppColors.LightBlack,
    )
}

@Composable
fun TextFieldPartSignUp() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically), // Change the vertical spacing here

    ) {
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Email") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.White,
                unfocusedContainerColor = AppColors.White,
                disabledContainerColor = AppColors.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.LightBlack,
                unfocusedTextColor = AppColors.LightBlack,
                focusedLabelColor = AppColors.LightBlack,
            ),
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)  // Change the height of the TextField here
        )
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Password") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.White,
                unfocusedContainerColor = AppColors.White,
                disabledContainerColor = AppColors.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.LightBlack,
                unfocusedTextColor = AppColors.LightBlack,
                focusedLabelColor = AppColors.LightBlack,
            ),
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        )

        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Confirm password") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.White,
                unfocusedContainerColor = AppColors.White,
                disabledContainerColor = AppColors.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.LightBlack,
                unfocusedTextColor = AppColors.LightBlack,
                focusedLabelColor = AppColors.LightBlack,
            ),
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        )

    }
}

@Composable
fun ButtonsPartSignUp(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp),

            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.White,
                contentColor = AppColors.LightBlack,
            ),
        ){
            Text(
                "Sign Up",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
            )

        }
    }
    Row (
        modifier = Modifier
            .padding(bottom = 10.dp)
    ) {
        Text(
            text = "Already a member? ",
            fontSize = 15.sp,
            color = AppColors.LightBlack,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Login now",
            fontSize = 15.sp,
            color = AppColors.LightBlack,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun GSignUp() {
    Surface(
        color = AppColors.LightGrey,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            GreetingImageSignUp()
            TopPartSignUp()
            TextFieldPartSignUp()
            ButtonsPartSignUp()
        }
    }
}

//BLogin------------------------------------

@Composable
fun GreetingImageB() {
    val image = painterResource(id = R.drawable.cadeado)
    Box {
        Image(
            painter = image,
            contentDescription = null,
        )
    }
}

@Composable
fun TopPartB(){
    Text(
        text = "Welcome back you've been missed!",
        fontSize = 18.sp,
        color = AppColors.LightGrey,
    )
}

@Composable
fun TextFieldPartB() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically)

    ) {
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Email") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.LightBlack,
                unfocusedContainerColor = AppColors.LightBlack,
                disabledContainerColor = AppColors.LightBlack,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.White,
                unfocusedTextColor = AppColors.LightGrey,
                focusedLabelColor = AppColors.LightGrey,

            ),
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        )

        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Password") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.LightBlack,
                unfocusedContainerColor = AppColors.LightBlack,
                disabledContainerColor = AppColors.LightBlack,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.White,
                unfocusedTextColor = AppColors.LightGrey,
                ),

            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)

        )

        Text(
            text = "Forgot Password?",
            fontSize = 15.sp,
            color = AppColors.LightGrey,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.End
        )
    }
}

@Composable
fun ButtonsPartB(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .alpha(0.8f),

            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.LightBlack,
            ),
        ){
            Text(
                "Login",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = AppColors.White
            )
        }
        Text(
            text = "Or continue with",
            fontSize = 15.sp,
            color = AppColors.LightGrey,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun LoginSocialB() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Button(
            modifier = Modifier
                .padding(8.dp)
                .size(80.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.5.dp, AppColors.LightGrey),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.LightBlack,
                contentColor = AppColors.Black
            ),
            contentPadding = PaddingValues(3.dp) // Change the inner padding here
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = null,
                modifier = Modifier
                    .height(90.dp)
                    .width(90.dp)
            )
        }

        Spacer(modifier = Modifier.width(15.dp))

        Button(
            modifier = Modifier
                .size(80.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.5.dp, AppColors.LightGrey),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.LightBlack,
                contentColor = AppColors.White
            ),
            contentPadding = PaddingValues(3.dp) // Change the inner padding here
        ) {
            Image(
                painter = painterResource(id = R.drawable.mac),
                contentDescription = null,
                colorFilter = ColorFilter.tint(AppColors.White),
                modifier = Modifier
                    .height(90.dp)
                    .width(90.dp),
            )
        }
    }

    Row (
        modifier = Modifier
            .padding(bottom = 10.dp)
    ){
        Text(
            text = "Not a member? ",
            fontSize = 15.sp,
            color = AppColors.LightGrey,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Register now",
            fontSize = 15.sp,
            color = AppColors.LightGrey,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun BLogin() {
    Surface(
        color = AppColors.Black,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            GreetingImageB()
            TopPartB()
            TextFieldPartB()
            ButtonsPartB()
            LoginSocialB()

        }
    }
}

//BSignUp------------------------------------

@Composable
fun GreetingImageBSignUp() {
    val image = painterResource(id = R.drawable.cadeado)
    Box (
        modifier = Modifier
            .padding(top = 20.dp),
    ){
        Image(
            painter = image,
            contentDescription = null,
        )
    }
}

@Composable
fun TopPartBSignUp(){

    Text(
        text = "Let's create an account for you",
        fontSize = 18.sp,
        color = AppColors.LightGrey,
    )
}

@Composable
fun TextFieldPartBSignUp() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically)

    ) {
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Email") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.LightBlack,
                unfocusedContainerColor = AppColors.LightBlack,
                disabledContainerColor = AppColors.LightBlack,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.White,
                unfocusedTextColor = AppColors.LightGrey,
                focusedLabelColor = AppColors.LightGrey,
            ),

            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        )
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Password") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = AppColors.LightBlack,
                unfocusedContainerColor = AppColors.LightBlack,
                disabledContainerColor = AppColors.LightBlack,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = AppColors.White,
                unfocusedTextColor = AppColors.LightGrey,
                focusedLabelColor = AppColors.LightGrey,
            ),
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
        )

       TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Confirm password") },
           colors = TextFieldDefaults.colors(
               focusedContainerColor = AppColors.LightBlack,
               unfocusedContainerColor = AppColors.LightBlack,
               disabledContainerColor = AppColors.LightBlack,
               focusedIndicatorColor = Color.Transparent,
               unfocusedIndicatorColor = Color.Transparent,
               focusedTextColor = AppColors.White,
               unfocusedTextColor = AppColors.LightGrey,
               focusedLabelColor = AppColors.LightGrey,
            ),

            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
        )

    }
}

@Composable
fun ButtonsPartBSignUp(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp),

            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.LightBlack,
                contentColor = AppColors.White,
            ),
        ){
            Text(
                "Sign Up",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
            )

        }
    }
    Row (
        modifier = Modifier
            .padding(bottom = 10.dp)
    ) {
        Text(
            text = "Already a member? ",
            fontSize = 15.sp,
            color = AppColors.LightGrey,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Login now",
            fontSize = 15.sp,
            color = AppColors.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun BSignUp() {
    Surface(
        color = AppColors.Black,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),

            verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            GreetingImageBSignUp()
            TopPartBSignUp()
            TextFieldPartBSignUp()
            ButtonsPartBSignUp()
        }
    }
}

