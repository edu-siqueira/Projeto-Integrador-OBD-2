package com.example.projeto_pi2.ui.screens.telaInicial

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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
import com.example.projeto_pi2.frame1.orbitron
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

    @Composable
    fun Tela_Inicial(
        modifier: Modifier = Modifier,
        frame1BackgroundColor: Color = Color(
            alpha = 0,
            red = 0,
            green = 0,
            blue = 0
        ),
        emailTextContent: String = "",
        senhaTextContent: String = "",
        criarUmaContaTextContent: String = "",
        entrarTextContent: String = "",
        sejaBemVindoTextContent: String = "",
        esqueceuASenhaTextContent: String = "",
        onEmailClick: () -> Unit = {},
        onPasswordClick: () -> Unit = {},
        onClick: () -> Unit = {}
    ) {
        TopLevel(
            frame1BackgroundColor = frame1BackgroundColor,
            modifier = modifier
        ) {
            TopLevelSynth {
                SejaBemVindo(sejaBemVindoTextContent = sejaBemVindoTextContent)
                Rectangle2(onEmailClick = onEmailClick)
                Rectangle3(onPasswordClick = onPasswordClick)
                Rectangle4(onClick = onClick)
                EsqueceuASenha(esqueceuASenhaTextContent = esqueceuASenhaTextContent)
                Rectangle5()
            }
            Email(
                emailTextContent = emailTextContent,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 62.0.dp,
                        y = 178.0.dp
                    )
                )
            )
            Senha(
                senhaTextContent = senhaTextContent,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 61.0.dp,
                        y = 241.0.dp
                    )
                )
            )
            CriarUmaConta(
                criarUmaContaTextContent = criarUmaContaTextContent,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 92.0.dp,
                        y = 425.0.dp
                    )
                )
            )
            Entrar(
                entrarTextContent = entrarTextContent,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 99.0.dp,
                        y = 301.0.dp
                    )
                )
            )
        }
    }

    @Preview(widthDp = 353, heightDp = 552)
    @Composable
    private fun Frame1Preview() {
        MaterialTheme {
            RelayContainer {
                com.example.projeto_pi2.frame1.Frame1(
                    frame1BackgroundColor = Color(
                        alpha = 255,
                        red = 30,
                        green = 29,
                        blue = 27
                    ),
                    emailTextContent = "Email",
                    senhaTextContent = "Senha",
                    criarUmaContaTextContent = "Criar uma conta",
                    entrarTextContent = "Entrar",
                    sejaBemVindoTextContent = "Seja Bem-Vindo!",
                    onEmailClick = {},
                    onPasswordClick = {},
                    onClick = {},
                    esqueceuASenhaTextContent = "Esqueceu a senha?",
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
            }
        }
    }

    @Composable
    fun SejaBemVindo(
        sejaBemVindoTextContent: String,
        modifier: Modifier = Modifier
    ) {
        RelayText(
            content = sejaBemVindoTextContent,
            fontSize = 24.0.sp,
            fontFamily = orbitron,
            color = Color(
                alpha = 255,
                red = 215,
                green = 166,
                blue = 16
            ),
            height = 1.25.em,
            fontWeight = FontWeight(700.0.toInt()),
            maxLines = -1,
            modifier = modifier.requiredWidth(275.0.dp).requiredHeight(64.0.dp)
        )
    }

    @Composable
    fun Rectangle2(
        onEmailClick: () -> Unit,
        modifier: Modifier = Modifier
    ) {
        RelayVector(
            vector = painterResource(R.drawable.frame_1_rectangle_2),
            modifier = modifier.tappable(onTap = onEmailClick).requiredWidth(249.0.dp).requiredHeight(46.0.dp)
        )
    }

    @Composable
    fun Rectangle3(
        onPasswordClick: () -> Unit,
        modifier: Modifier = Modifier
    ) {
        RelayVector(
            vector = painterResource(R.drawable.frame_1_rectangle_3),
            modifier = modifier.tappable(onTap = onPasswordClick).requiredWidth(249.0.dp).requiredHeight(46.0.dp)
        )
    }

    @Composable
    fun Rectangle4(
        onClick: () -> Unit,
        modifier: Modifier = Modifier
    ) {
        RelayVector(
            vector = painterResource(R.drawable.frame_1_rectangle_4),
            modifier = modifier.tappable(onTap = onClick).requiredWidth(249.0.dp).requiredHeight(46.0.dp)
        )
    }

    @Composable
    fun EsqueceuASenha(
        esqueceuASenhaTextContent: String,
        modifier: Modifier = Modifier
    ) {
        RelayText(
            content = esqueceuASenhaTextContent,
            fontSize = 11.0.sp,
            fontFamily = openSans,
            color = Color(
                alpha = 255,
                red = 215,
                green = 166,
                blue = 16
            ),
            height = 2.727272644042969.em,
            fontWeight = FontWeight(700.0.toInt()),
            maxLines = -1,
            modifier = modifier.requiredWidth(197.0.dp).requiredHeight(39.0.dp)
        )
    }

    @Composable
    fun Rectangle5(modifier: Modifier = Modifier) {
        RelayVector(
            vector = painterResource(R.drawable.frame_1_rectangle_5),
            modifier = modifier.requiredWidth(249.0.dp).requiredHeight(46.0.dp)
        )
    }

    @Composable
    fun TopLevelSynth(
        modifier: Modifier = Modifier,
        content: @Composable RelayContainerScope.() -> Unit
    ) {
        RelayContainer(
            mainAxisAlignment = MainAxisAlignment.Start,
            padding = PaddingValues(
                start = 39.0.dp,
                top = 90.0.dp,
                end = 39.0.dp,
                bottom = 90.0.dp
            ),
            itemSpacing = 17.0,
            radius = 2.0,
            content = content,
            modifier = modifier.alpha(alpha = 100.0f)
        )
    }

    @Composable
    fun Email(
        emailTextContent: String,
        modifier: Modifier = Modifier
    ) {
        RelayText(
            content = emailTextContent,
            fontFamily = orbitron,
            color = Color(
                alpha = 255,
                red = 215,
                green = 166,
                blue = 16
            ),
            height = 2.1428572082519532.em,
            fontWeight = FontWeight(700.0.toInt()),
            maxLines = -1,
            modifier = modifier.requiredWidth(61.0.dp).requiredHeight(39.0.dp)
        )
    }

    @Composable
    fun Senha(
        senhaTextContent: String,
        modifier: Modifier = Modifier
    ) {
        RelayText(
            content = senhaTextContent,
            fontFamily = orbitron,
            color = Color(
                alpha = 255,
                red = 215,
                green = 166,
                blue = 16
            ),
            height = 2.1428572082519532.em,
            fontWeight = FontWeight(700.0.toInt()),
            maxLines = -1,
            modifier = modifier.requiredWidth(61.0.dp).requiredHeight(39.0.dp)
        )
    }

    @Composable
    fun CriarUmaConta(
        criarUmaContaTextContent: String,
        modifier: Modifier = Modifier
    ) {
        RelayText(
            content = criarUmaContaTextContent,
            fontFamily = orbitron,
            color = Color(
                alpha = 255,
                red = 215,
                green = 166,
                blue = 16
            ),
            height = 2.1428572082519532.em,
            fontWeight = FontWeight(700.0.toInt()),
            maxLines = -1,
            modifier = modifier.requiredWidth(164.0.dp).requiredHeight(39.0.dp)
        )
    }

    @Composable
    fun Entrar(
        entrarTextContent: String,
        modifier: Modifier = Modifier
    ) {
        RelayText(
            content = entrarTextContent,
            fontSize = 21.0.sp,
            fontFamily = orbitron,
            color = Color(
                alpha = 255,
                red = 255,
                green = 255,
                blue = 255
            ),
            height = 1.6666667175292968.em,
            fontWeight = FontWeight(700.0.toInt()),
            maxLines = -1,
            modifier = modifier.requiredWidth(155.0.dp).requiredHeight(39.0.dp)
        )
    }

    @Composable
    fun TopLevel(
        frame1BackgroundColor: Color,
        modifier: Modifier = Modifier,
        content: @Composable RelayContainerScope.() -> Unit
    ) {
        RelayContainer(
            backgroundColor = frame1BackgroundColor,
            isStructured = false,
            radius = 2.0,
            content = content,
            modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
        )
    }