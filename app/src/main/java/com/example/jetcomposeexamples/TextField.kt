package com.example.jetcomposeexamples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@ExperimentalMaterialApi
@Composable
fun CustomTextField() {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        var text by remember { mutableStateOf(" ") }
//        TextField( // normal text field
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(text = "type here") },
//            modifier = Modifier.background(Color.Cyan),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon")
            },
            // key board type
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search // the right bottom button
            ),
            keyboardActions = KeyboardActions(
                onSearch = { text = "Search Button Clicked!" }
            )
        )
    }
}