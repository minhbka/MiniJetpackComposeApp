package com.minhbka.auth.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.minhbka.auth.R
import com.minhbka.miniapp.theme.MiniAppTheme
import com.minhbka.miniapp.theme.components.AppPreview
import com.minhbka.miniapp.theme.components.AppTextField

@Composable
fun LoginScreen() {
    Login()
}

@Composable
fun Login() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Icon(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 42.dp, bottom = 32.dp),
            painter = painterResource(id = R.drawable.ic_launcher),
            contentDescription = "app icon",
            tint = MaterialTheme.colorScheme.primary
        )

        AppTextField(
            value = "minhbka@gmail.com",
            label = R.string.email,
            hint = "yourname@domain.com",
            leadingIcon = Icons.Filled.Email,
            imeAction = ImeAction.Next,
            onValueChanged = {})

        AppTextField(
            value = "12345",
            label = R.string.password,
            hint = "password",
            leadingIcon = Icons.Filled.Lock,
            imeAction = ImeAction.Done,
            onValueChanged = {})

        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f)
            ) {
                Text(
                    text = stringResource(id = R.string.forgot_password),
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = stringResource(id = R.string.click_here_to_reset),
                    style = MaterialTheme.typography.bodySmall
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .padding(16.dp), onClick = { }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_forward),
                    contentDescription = "login"
                )

            }
        }
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 64.dp)
                .clickable { },
            text = stringResource(id = R.string.dont_have_account),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 64.dp)
                .clickable { },
            text = stringResource(R.string.agree_to_terms),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@AppPreview
@Composable
private fun LoginPreview() {
    MiniAppTheme {
        Surface (modifier = Modifier.fillMaxSize()){
            Login()
        }
    }

}