package com.example.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource

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

        PlayerCard(
            fotoPlayerResId = R.drawable.kiboy,
            iconRoleResId = R.drawable.roam,
            namaStringResId = R.string.nama_player_2,
            negaraStringResId = R.string.negara_2,
            cardColorResId = R.color.card_kiboy
        )
        PlayerCard(
            fotoPlayerResId = R.drawable.sanz,
            iconRoleResId = R.drawable.mid,
            namaStringResId = R.string.nama_player_3,
            negaraStringResId = R.string.negara_3,
            cardColorResId = R.color.card_sanz
        )

        PlayerCard(
            fotoPlayerResId = R.drawable.lutpi,
            iconRoleResId = R.drawable.exp,
            namaStringResId = R.string.nama_player_4,
            negaraStringResId = R.string.negara_4,
            cardColorResId = R.color.card_lutpi
        )

        PlayerCard(
            fotoPlayerResId = R.drawable.kelra,
            iconRoleResId = R.drawable.gold,
            namaStringResId = R.string.nama_player_5,
            negaraStringResId = R.string.negara_5,
            cardColorResId = R.color.card_kelra
        )
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(id = R.string.footer_copy),
                fontSize = 14.sp,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 30.dp)
            )
        }
    }
}

@Composable
fun PlayerCard(
    fotoPlayerResId: Int,
    iconRoleResId: Int,
    namaStringResId: Int,
    negaraStringResId: Int,
    cardColorResId: Int
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = cardColorResId)
        )
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = fotoPlayerResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}