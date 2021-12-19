package com.bytedance.bae.router.receiver;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.os.Build;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.router.device.WiredHeadsetDeviceManager;
import com.bytedance.bae.router.receiver.base.BaseAudioDeviceBroadcastReceiver;
import com.bytedance.covode.number.Covode;

public class WiredHeadsetBroadcastReceiver extends BaseAudioDeviceBroadcastReceiver {
    private WiredHeadsetDeviceManager mDeviceManager;

    static {
        Covode.recordClassIndex(15071);
    }

    public WiredHeadsetBroadcastReceiver(WiredHeadsetDeviceManager wiredHeadsetDeviceManager) {
        this.mDeviceManager = wiredHeadsetDeviceManager;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction()) && intent.hasExtra("state")) {
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra == 1) {
                if (intent.getIntExtra("microphone", -1) == 1) {
                    BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "Headset w/ mic connected");
                    this.mDeviceManager.onDeviceOnline();
                    this.mDeviceManager.reportHeadsetType(0);
                    return;
                }
                this.mDeviceManager.onDeviceOnline();
                this.mDeviceManager.reportHeadsetType(1);
                BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "Headset w/o mic connected");
            } else if (intExtra == 0) {
                BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "Headset disconnected");
                this.mDeviceManager.onDeviceOffline();
            } else {
                BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "Headset unknown event detected, state=".concat(String.valueOf(intExtra)));
            }
        } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction())) {
            BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "USB_DEVICE_ATTACHED");
            if (Build.VERSION.SDK_INT < 21) {
                BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "USB_DEVICE_ATTACHED needs api level 21");
                return;
            }
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            if (usbDevice == null) {
                BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "USB_DEVICE_ATTACHED null usb device");
                return;
            }
            int configurationCount = usbDevice.getConfigurationCount();
            boolean z = false;
            for (int i = 0; i < configurationCount; i++) {
                UsbConfiguration configuration = usbDevice.getConfiguration(i);
                if (configuration == null) {
                    BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "USB_DEVICE_ATTACHED null usb configuration");
                    return;
                }
                int interfaceCount = configuration.getInterfaceCount();
                for (int i2 = 0; i2 < interfaceCount; i2++) {
                    UsbInterface usbInterface = configuration.getInterface(i2);
                    if (usbInterface != null && usbInterface.getInterfaceClass() == 1) {
                        BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "USB_DEVICE_ATTACHED hasAudio");
                        z = true;
                    }
                }
            }
            if (z) {
                BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "Headset usb connected");
                this.mDeviceManager.onDeviceOnline();
                this.mDeviceManager.reportHeadsetType(2);
                return;
            }
            BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "Headset unknown usb device detected attached");
        } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction())) {
            BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "USB_DEVICE_DETACHED");
            if (Build.VERSION.SDK_INT < 21) {
                BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "USB_DEVICE_DETACHED needs api level 21");
                return;
            }
            UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
            if (usbDevice2 == null) {
                BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "USB_DEVICE_DETACHED null usb device");
                return;
            }
            int configurationCount2 = usbDevice2.getConfigurationCount();
            boolean z2 = false;
            for (int i3 = 0; i3 < configurationCount2; i3++) {
                UsbConfiguration configuration2 = usbDevice2.getConfiguration(i3);
                if (configuration2 == null) {
                    BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "USB_DEVICE_DETACHED null usb configuration");
                    return;
                }
                int interfaceCount2 = configuration2.getInterfaceCount();
                for (int i4 = 0; i4 < interfaceCount2; i4++) {
                    UsbInterface usbInterface2 = configuration2.getInterface(i4);
                    if (usbInterface2 != null && usbInterface2.getInterfaceClass() == 1) {
                        BaeLogging.m23628i("WiredHeadsetBroadcastReceiver", "USB_DEVICE_DETACHED hasAudio");
                        z2 = true;
                    }
                }
            }
            if (z2) {
                BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "Headset usb disconnected");
                this.mDeviceManager.onDeviceOffline();
                return;
            }
            BaeLogging.m23630w("WiredHeadsetBroadcastReceiver", "Headset unknown usb device detected datached");
        }
    }
}
