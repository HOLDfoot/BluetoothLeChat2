package com.example.bluetoothlechat.bluetooth

import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattService

object ChatClient {

    var messageCharacteristic: BluetoothGattCharacteristic? = null
    var gatt: BluetoothGatt? = null
    var service: BluetoothGattService? = null

}