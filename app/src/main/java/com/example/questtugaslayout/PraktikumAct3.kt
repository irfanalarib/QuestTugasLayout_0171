package com.example.questtugaslayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TampilanRosterOnic(modifier : Modifier = Modifier){
    Column(modifier = modifier
        .fillMaxSize()
        .padding (top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(id = R.string.header_mpl),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black)
        Text(
            text = stringResource(id = R.string.header_team),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )
        Spacer(modifier = Modifier.height(16.dp))

        PlayerCard(
            fotoPlayerResId = R.drawable.kairi,
            iconRoleResId = R.drawable.jungle,
            namaStringResId = R.string.nama_player_1,
            negaraStringResId = R.string.negara_1,
            cardColorResId = R.color.card_kairi
        )
    }
}