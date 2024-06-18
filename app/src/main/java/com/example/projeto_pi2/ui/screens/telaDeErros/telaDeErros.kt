package com.example.projeto_pi2.ui.screens.telaDeErros

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.projeto_pi2.R
import com.example.projeto_pi2.frame1.openSans
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 *
 * Tela de log de erros.
 *
 */

@Composable
fun TelaDeErros(
    modifier: Modifier = Modifier,
    onSettingsClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        LogDeErros(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 73.0.dp,
                    y = 116.0.dp
                )
            )
        )
        Rectangle8(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 19.0.dp,
                    y = 181.0.dp
                )
            )
        )
        Rectangle9(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 19.0.dp,
                    y = 284.0.dp
                )
            )
        )
        Rectangle10(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 19.0.dp,
                    y = 387.0.dp
                )
            )
        )
        Rectangle11(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 19.0.dp,
                    y = 485.0.dp
                )
            )
        )
        Rectangle12(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 14.0.dp,
                    y = 181.0.dp
                )
            )
        )
        Rectangle13(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 13.0.dp,
                    y = 284.0.dp
                )
            )
        )
        Rectangle14(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 19.0.dp,
                    y = 387.0.dp
                )
            )
        )
        Rectangle15(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 19.0.dp,
                    y = 485.0.dp
                )
            )
        )
        P0087(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 25.0.dp,
                    y = 204.0.dp
                )
            )
        )
        P0442(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 25.0.dp,
                    y = 305.0.dp
                )
            )
        )
        P0234(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 408.0.dp
                )
            )
        )
        P0420(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 505.0.dp
                )
            )
        )
        PressONaRampaDeInjeOMuitoBaixa(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 115.0.dp,
                    y = 183.0.dp
                )
            )
        )
        FugaNoSistemaPeloMDuloDeComandoDoMotor(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 109.0.dp,
                    y = 288.0.dp
                )
            )
        )
        PressODeSobrealimentaOMuitoElevada(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 115.0.dp,
                    y = 389.0.dp
                )
            )
        )
        EficiNciaDoCatalisadorAbaixoDoLimiteDefinido(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 115.0.dp,
                    y = 487.0.dp
                )
            )
        )
        Ellipse1(
            onSettingsClick = onSettingsClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 19.0.dp,
                    y = 20.0.dp
                )
            )
        )
        IconAlignJustify(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 37.0.dp,
                    y = 43.0.dp
                )
            )
        ) {
            Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 355, heightDp = 567)
@Composable
private fun Frame4Preview() {
    MaterialTheme {
        RelayContainer {
            TelaDeErros(
                onSettingsClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LogDeErros(modifier: Modifier = Modifier) {
    RelayText(
        content = "Log de Erros",
        fontSize = 26.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 186,
            green = 19,
            blue = 19
        ),
        height = 1.1538461303710938.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(221.0.dp).requiredHeight(51.0.dp)
    )
}

@Composable
fun Rectangle8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_8),
        modifier = modifier.requiredWidth(317.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Rectangle9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_9),
        modifier = modifier.requiredWidth(317.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Rectangle10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_10),
        modifier = modifier.requiredWidth(317.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Rectangle11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_11),
        modifier = modifier.requiredWidth(317.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Rectangle12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_12),
        modifier = modifier.requiredWidth(90.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Rectangle13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_13),
        modifier = modifier.requiredWidth(90.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Rectangle14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_14),
        modifier = modifier.requiredWidth(90.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Rectangle15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_15),
        modifier = modifier.requiredWidth(90.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun P0087(modifier: Modifier = Modifier) {
    RelayText(
        content = "P0087",
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 238,
            green = 238,
            blue = 238
        ),
        height = 2.1428572082519532.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(65.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun P0442(modifier: Modifier = Modifier) {
    RelayText(
        content = "P0442",
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 238,
            green = 238,
            blue = 238
        ),
        height = 2.1428572082519532.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(65.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun P0234(modifier: Modifier = Modifier) {
    RelayText(
        content = "P0234",
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 238,
            green = 238,
            blue = 238
        ),
        height = 2.1428572082519532.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(65.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun P0420(modifier: Modifier = Modifier) {
    RelayText(
        content = "P0420",
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 238,
            green = 238,
            blue = 238
        ),
        height = 2.1428572082519532.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(65.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun PressONaRampaDeInjeOMuitoBaixa(modifier: Modifier = Modifier) {
    RelayText(
        content = "pressão na rampa de injeção muito baixa",
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 186,
            green = 19,
            blue = 19
        ),
        height = 1.0714286041259766.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(75.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun FugaNoSistemaPeloMDuloDeComandoDoMotor(modifier: Modifier = Modifier) {
    RelayText(
        content = "fuga no sistema pelo módulo\nde comando do motor",
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 186,
            green = 19,
            blue = 19
        ),
        height = 1.0714286041259766.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(75.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun PressODeSobrealimentaOMuitoElevada(modifier: Modifier = Modifier) {
    RelayText(
        content = "pressão de sobrealimentação\nmuito elevada",
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 186,
            green = 19,
            blue = 19
        ),
        height = 1.0714286041259766.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(75.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun EficiNciaDoCatalisadorAbaixoDoLimiteDefinido(modifier: Modifier = Modifier) {
    RelayText(
        content = "eficiência do catalisador abaixo do limite definido",
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 186,
            green = 19,
            blue = 19
        ),
        height = 1.0714286041259766.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(75.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Ellipse1(
    onSettingsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_ellipse_1),
        modifier = modifier.tappable(onTap = onSettingsClick).requiredWidth(67.0.dp).requiredHeight(66.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_vector),
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