package com.bytedance.bae.router.device.base;

import com.bytedance.covode.number.Covode;

public interface IAudioDeviceManager {

    public interface HotplugDeviceListener extends NotHotPlugableDeviceListener {
        static {
            Covode.recordClassIndex(15063);
        }

        void onDeviceOffline();

        void onDeviceOnline();
    }

    public interface IHotplugDevice extends HotplugDeviceListener {
        static {
            Covode.recordClassIndex(15064);
        }

        int getOnlineState();
    }

    public interface INotHotPlugableDevice extends NotHotPlugableDeviceListener {
        static {
            Covode.recordClassIndex(15065);
        }

        void activeDevice();

        int getActiveState();

        void inactiveDevice();

        boolean isActive();
    }

    public interface NotHotPlugableDeviceListener {
        static {
            Covode.recordClassIndex(15066);
        }
    }

    public interface OnHotPlugDeviceCallback extends HotplugDeviceListener, OnNotHotPlugableDeviceCallback {
        static {
            Covode.recordClassIndex(15067);
        }
    }

    public interface OnNotHotPlugableDeviceCallback extends NotHotPlugableDeviceListener {
        static {
            Covode.recordClassIndex(15068);
        }

        void onError(int i, String str);
    }

    static {
        Covode.recordClassIndex(15061);
    }
}
