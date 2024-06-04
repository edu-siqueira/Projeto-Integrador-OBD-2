package com.example.projeto_pi2.telaPrincipal

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.projeto_pi2.R
import com.example.projeto_pi2.frame1.orbitron
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.RowScopeInstanceImpl.weight
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * Tela principal do aplicativo.
 */
@Composable
fun Tela_Principal(
    modifier: Modifier = Modifier,
    errorsCountTextContent: String = "",
    voltsTextContent: String = "",
    rpmTextContent: String,
    param67TextContent: String = "",
    onErrorClick: () -> Unit = {},
    onSettingsClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Class3ErroSDetectados(
            onErrorClick = onErrorClick,
            errorsCountTextContent = errorsCountTextContent,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 67.0.dp,
                    y = 163.0.dp
                )
            )
        )
        Vector(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f))
        Rectangle2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 222.0.dp
                )
            )
        )
        Bateria(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 42.0.dp,
                    y = 269.0.dp
                )
            )
        )
        Class145Volts(
            voltsTextContent = voltsTextContent,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 121.0.dp,
                    y = 246.0.dp
                )
            )
        )
        Rectangle3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 409.0.dp
                )
            )
        )
        Rpm(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 46.0.dp,
                    y = 457.0.dp
                )
            )
        )
        rpmTextValue(
            rpmTextContent = rpmTextContent,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 145.0.dp,
                    y = 436.0.dp
                )
            )
        )
        Ellipse1(
            onSettingsClick = onSettingsClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 11.0.dp,
                    y = 29.0.dp
                )
            )
        )
        IconAlignJustify(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 29.0.dp,
                    y = 52.0.dp
                )
            )
        ) {
            Vector1(modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f))
        }
        Rectangle4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 313.0.dp
                )
            )
        )
        Speedometer(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 41.0.dp,
                    y = 406.0.dp
                )
            )
        )
        GasStation(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 45.0.dp,
                    y = 303.0.dp
                )
            )
        )
        CarBattery(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 44.0.dp,
                    y = 226.0.dp
                )
            )
        )
        CombustVel(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 36.0.dp,
                    y = 365.0.dp
                )
            )
        )
        gasTextValue(
            param67TextContent = param67TextContent,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 152.0.dp,
                    y = 334.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 355, heightDp = 567)
@Composable
private fun Frame2Preview() {
    MaterialTheme {
        RelayContainer {
            Tela_Principal(
                errorsCountTextContent = "3 Erro(s) detectados",
                onErrorClick = {},
                voltsTextContent = "14.5 Volts",
                rpmTextContent = "",
                onSettingsClick = {},
                param67TextContent = "67%",
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Class3ErroSDetectados(
    onErrorClick: () -> Unit,
    errorsCountTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = errorsCountTextContent,
        fontSize = 16.0.sp,
        fontFamily = orbitron,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.875.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .tappable(onTap = onErrorClick)
            .requiredWidth(221.0.dp)
            .requiredHeight(51.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_2_vector),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 152.0.dp,
                    top = 109.0.dp,
                    end = 152.41998291015625.dp,
                    bottom = 412.4782257080078.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_2_rectangle_2),
        modifier = modifier
            .requiredWidth(293.0.dp)
            .requiredHeight(73.0.dp)
            .relayDropShadow(
                color = Color(
                    alpha = 63,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                borderRadius = 10.0.dp,
                blur = 4.0.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}

@Composable
fun Bateria(modifier: Modifier = Modifier) {
    RelayText(
        content = "Bateria",
        fontSize = 12.0.sp,
        fontFamily = orbitron,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.253999948501587.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(54.0.dp)
            .requiredHeight(26.0.dp)
    )
}

@Composable
fun Class145Volts(
    voltsTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = voltsTextContent,
        fontSize = 21.0.sp,
        fontFamily = orbitron,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.253999982561384.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(134.0.dp)
            .requiredHeight(36.0.dp)
    )
}

@Composable
fun Rectangle3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_2_rectangle_3),
        modifier = modifier
            .requiredWidth(293.0.dp)
            .requiredHeight(73.0.dp)
            .relayDropShadow(
                color = Color(
                    alpha = 63,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                borderRadius = 10.0.dp,
                blur = 4.0.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}

@Composable
fun Rpm(modifier: Modifier = Modifier) {
    RelayText(
        content = "Rpm",
        fontSize = 12.0.sp,
        fontFamily = orbitron,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.253999948501587.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        overflow = TextOverflow.Visible,
        maxLines = 1,
        modifier = modifier.requiredHeight(19.0.dp)
    )
}

@Composable
fun rpmTextValue(
    rpmTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = rpmTextContent + " rpm",
        fontSize = 21.0.sp,
        fontFamily = orbitron,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.253999982561384.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.widthIn(max = 200.dp) // Definir a largura máxima conforme necessário
            .requiredHeight(31.0.dp)
    )
}

@Composable
fun Ellipse1(
    onSettingsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.frame_2_ellipse_1),
        modifier = modifier
            .tappable(onTap = onSettingsClick)
            .requiredWidth(67.0.dp)
            .requiredHeight(66.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_2_vector1),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .requiredWidth(31.0.dp)
            .requiredHeight(20.0.dp)
    )
}

@Composable
fun Rectangle4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_2_rectangle_4),
        modifier = modifier
            .requiredWidth(293.0.dp)
            .requiredHeight(73.0.dp)
            .relayDropShadow(
                color = Color(
                    alpha = 63,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                borderRadius = 10.0.dp,
                blur = 4.0.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}

@Composable
fun Speedometer(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_2_speedometer),
        contentScale = ContentScale.Fit,
        modifier = modifier
            .requiredWidth(45.0.dp)
            .requiredHeight(61.0.dp)
    )
}

@Composable
fun GasStation(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_2_gas_station),
        contentScale = ContentScale.Fit,
        modifier = modifier
            .requiredWidth(47.0.dp)
            .requiredHeight(74.0.dp)
    )
}

@Composable
fun CarBattery(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_2_car_battery),
        contentScale = ContentScale.Fit,
        modifier = modifier
            .requiredWidth(46.0.dp)
            .requiredHeight(43.0.dp)
    )
}

@Composable
fun CombustVel(modifier: Modifier = Modifier) {
    RelayText(
        content = "Combustível",
        fontSize = 12.0.sp,
        fontFamily = orbitron,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.253999948501587.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun gasTextValue(
    param67TextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = param67TextContent,
        fontSize = 21.0.sp,
        fontFamily = orbitron,
        color = Color(
            alpha = 255,
            red = 215,
            green = 166,
            blue = 16
        ),
        height = 1.253999982561384.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(81.0.dp)
            .requiredHeight(36.0.dp)
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
            red = 30,
            green = 29,
            blue = 27
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}