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
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            GLogin()
//            GSignUp()
            BLogin()
//            BSignUp()
        }
    }
}

object AppColors {
    val LightGrey = Color.LightGray
    val White = Color.White
    val Black = Color.Black
    val LightBlack = Color(0xFF8D8D8D)
    val Unspec = Color.Unspecified
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
        fontSize = 15.sp,
        color = AppColors.LightBlack,
    )
}

@Composable
fun TextFieldPart() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Email") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightGrey,
                unfocusedBorderColor = AppColors.White,
            ),

            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightGrey,
                unfocusedBorderColor = AppColors.White,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )

        Text(
            text = "Forgot Password?",
            fontSize = 15.sp,
            color = AppColors.LightBlack,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
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
                .size(90.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.5.dp, Color.White),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Unspecified,
                contentColor = AppColors.Black
            ),
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = null,
                modifier = Modifier.size(50.dp),
            )
        }
        Button(
            modifier = Modifier
                .size(90.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.5.dp, Color.White),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Unspecified,
                contentColor = AppColors.Black
            ),
            contentPadding = PaddingValues(3.dp) // Change the inner padding here
        ) {
            Image(
                painter = painterResource(id = R.drawable.mac),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp),
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
            verticalArrangement = Arrangement.SpaceBetween,
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
        fontSize = 15.sp,
        color = AppColors.LightBlack,
    )
}

@Composable
fun TextFieldPartB() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Email") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightGrey,
                unfocusedBorderColor = AppColors.White,
            ),

            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightGrey,
                unfocusedBorderColor = AppColors.White,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )

        Text(
            text = "Forgot Password?",
            fontSize = 15.sp,
            color = AppColors.LightBlack,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
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
                .size(90.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.5.dp, Color.White),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = AppColors.Black
            ),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.google),
                contentDescription = null,
                modifier = Modifier.size(80.dp),
                tint = AppColors.Unspec
            )
        }
        Button(
            modifier = Modifier
                .size(90.dp),
            onClick = { /* Do something when button is clicked */ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.5.dp, Color.White),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.White,
                contentColor = AppColors.Black
            ),
            contentPadding = PaddingValues(3.dp) // Change the inner padding here
        ) {
            Image(
                painter = painterResource(id = R.drawable.mac),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp),
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
fun BLogin() {
    Surface(
        color = AppColors.Black,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
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
        fontSize = 15.sp,
        color = AppColors.LightBlack,
    )
}

@Composable
fun TextFieldPartSignUp() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Email") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightBlack,
                unfocusedBorderColor = AppColors.White,
            ),

            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightBlack,
                unfocusedBorderColor = AppColors.White,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Confirm password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightBlack,
                unfocusedBorderColor = AppColors.White,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
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
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            GreetingImageSignUp()
            TopPartSignUp()
            TextFieldPartSignUp()
            ButtonsPartSignUp()
        }
    }
}

//BSignUp------------------------------------

@Composable
fun GreetingImageBSignUp() {
    val image = painterResource(id = R.drawable.cadeado)
    Box {
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
        fontSize = 15.sp,
        color = AppColors.LightBlack,
    )
}

@Composable
fun TextFieldPartBSignUp() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Email") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightBlack,
                unfocusedBorderColor = AppColors.White,
            ),

            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightBlack,
                unfocusedBorderColor = AppColors.White,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Confirm password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.LightBlack,
                unfocusedBorderColor = AppColors.White,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
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
                containerColor = AppColors.White,
                contentColor = AppColors.Black,
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
fun BSignUp() {
    Surface(
        color = AppColors.Black,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),

            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,


            ) {
            GreetingImageBSignUp()
            TopPartBSignUp()
            TextFieldPartBSignUp()
            ButtonsPartBSignUp()
        }
    }
}

