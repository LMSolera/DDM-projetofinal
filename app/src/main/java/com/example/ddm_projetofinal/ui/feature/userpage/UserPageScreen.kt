package com.example.ddm_projetofinal.ui.feature.userpage

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ddm_projetofinal.model.User
import com.example.ddm_projetofinal.model.usuario1

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UserPageScreen (
    userInfo: User
) {
    Scaffold (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .safeDrawingPadding()
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            Text (
                text = "AppName",
                fontSize = 24.sp,
                fontWeight = FontWeight(1000)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Icon (
                modifier = Modifier
                    .background(Color(0xFFE8DCFD), MaterialTheme.shapes.extraLarge)
                    .wrapContentHeight()
                    .wrapContentWidth()
                    .padding(8.dp)
                    .size(80.dp),
                imageVector = Icons.Default.Person,
                contentDescription = "Ícone de pessoa",

            )

            Spacer(modifier = Modifier.height(16.dp))

            Card (
                border = BorderStroke(1.dp, Color(0xFFC9C3CF)),
                colors = CardColors(
                    Color(0xFFFCF5FD),
                    Color(0xFF000000),
                    Color(0xFF000000),
                    Color(0xFF000000)
                ),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column (
                    modifier = Modifier
                        .padding(14.dp)
                ) {
                    Text (
                        text = userInfo.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(750)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text (
                        text = userInfo.email,
                        fontSize = 16.sp
                    )

                    Spacer(modifier = Modifier.height(60.dp))

                    Text (
                        text = "Alterar Senha",
                        fontSize = 16.sp,
                        color = Color(0xFF22084A),
                        fontWeight = FontWeight(750),
                        modifier = Modifier
                            .clickable {

                            }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text (
                        text = "Alterar Email",
                        fontSize = 16.sp,
                        color = Color(0xFF22084A),
                        fontWeight = FontWeight(750),
                        modifier = Modifier
                            .clickable {

                            }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text (
                        text = "Alterar Nome de Usuário",
                        fontSize = 16.sp,
                        color = Color(0xFF22084A),
                        fontWeight = FontWeight(750),
                        modifier = Modifier
                            .clickable {

                            }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun UserPageScrenPreview () {
    UserPageScreen(usuario1)
}