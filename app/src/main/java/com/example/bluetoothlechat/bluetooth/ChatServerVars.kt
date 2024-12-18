package com.example.bluetoothlechat.bluetooth

import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattServer

object ChatServerVars {

    var messageCharacteristic: BluetoothGattCharacteristic? = null
    var gattServer: BluetoothGattServer? = null
    var device: BluetoothDevice? = null

}