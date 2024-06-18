package com.example.projeto_pi2.ui.screens.telaDeSelecao

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.projeto_pi2.R
import com.example.projeto_pi2.frame1.openSans
import com.example.projeto_pi2.frame1.orbitron
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 *
 * Tela de seleção de dados.
 *
 */

@Composable
fun TelaDeSelecao(
    modifier: Modifier = Modifier,
    onSettingsClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        DadosSelecionados(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 67.0.dp,
                    y = 110.0.dp
                )
            )
        )
        Rectangle4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 40.0.dp,
                    y = 157.0.dp
                )
            )
        )
        Bateria(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 54.0.dp,
                    y = 194.0.dp
                )
            )
        )
        Rectangle6(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 40.0.dp,
                    y = 341.0.dp
                )
            )
        )
        Rpm(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 64.0.dp,
                    y = 384.0.dp
                )
            )
        )
        Rectangle5(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 40.0.dp,
                    y = 249.0.dp
                )
            )
        )
        Combustivel(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 47.0.dp,
                    y = 296.0.dp
                )
            )
        )
        Rectangle7(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 40.0.dp,
                    y = 441.0.dp
                )
            )
        )
        Radiador(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 52.0.dp,
                    y = 487.0.dp
                )
            )
        )
        Ellipse1(
            onSettingsClick = onSettingsClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 12.0.dp,
                    y = 31.0.dp
                )
            )
        )
        IconAlignJustify(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 54.0.dp
                )
            )
        ) {
            Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        CarBattery(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 59.0.dp,
                    y = 157.0.dp
                )
            )
        )
        GasStation(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 59.0.dp,
                    y = 249.0.dp
                )
            )
        )
        Speedometer(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 60.0.dp,
                    y = 333.0.dp
                )
            )
        )
        ToggleOn(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 202.0.dp,
                    y = 171.0.dp
                )
            )
        )
        ToggleOn1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 202.0.dp,
                    y = 263.0.dp
                )
            )
        )
        ToggleOn2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 202.0.dp,
                    y = 355.0.dp
                )
            )
        )
        CarRadiator(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 58.0.dp,
                    y = 429.0.dp
                )
            )
        )
        ToggleOff(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 202.0.dp,
                    y = 455.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 355, heightDp = 567)
@Composable
private fun Frame3Preview() {
    MaterialTheme {
        RelayContainer {
            TelaDeSelecao(
                onSettingsClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun DadosSelecionados(modifier: Modifier = Modifier) {
    RelayText(
        content = "Dados Selecionados",
        fontSize = 16.0.sp,
        fontFamily = orbitron,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.875.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(221.0.dp).requiredHeight(51.0.dp)
    )
}

@Composable
fun Rectangle4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_3_rectangle_4),
        modifier = modifier.requiredWidth(271.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Bateria(modifier: Modifier = Modifier) {
    RelayText(
        content = "Bateria",
        fontSize = 15.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.36181640625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun Rectangle6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_3_rectangle_6),
        modifier = modifier.requiredWidth(271.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Rpm(modifier: Modifier = Modifier) {
    RelayText(
        content = "Rpm",
        fontSize = 15.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.36181640625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(36.0.dp).requiredHeight(19.0.dp)
    )
}

@Composable
fun Rectangle5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_3_rectangle_5),
        modifier = modifier.requiredWidth(271.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Combustivel(modifier: Modifier = Modifier) {
    RelayText(
        content = "Combustivel",
        fontSize = 13.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.36181640625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(98.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Rectangle7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_3_rectangle_7),
        modifier = modifier.requiredWidth(271.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Radiador(modifier: Modifier = Modifier) {
    RelayText(
        content = "Radiador\n",
        fontSize = 13.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 87,
            green = 87,
            blue = 87
        ),
        height = 1.36181640625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(98.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Ellipse1(
    onSettingsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.frame_3_ellipse_1),
        modifier = modifier.tappable(onTap = onSettingsClick).requiredWidth(67.0.dp).requiredHeight(66.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_3_vector),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconAlignJustify(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(31.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun CarBattery(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_car_battery),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(37.0.dp)
    )
}

@Composable
fun GasStation(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_gas_station),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(54.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Speedometer(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_speedometer),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(45.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun ToggleOn(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_toggle_on),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(79.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun ToggleOn1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_toggle_on),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(79.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun ToggleOn2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_toggle_on),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(79.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun CarRadiator(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_car_radiator),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(49.0.dp).requiredHeight(76.0.dp)
    )
}

@Composable
fun ToggleOff(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_toggle_off),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(79.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 31,
            green = 30,
            blue = 28
        ),
        isStructured = false,
        radius = 2.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 25,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}