package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IDeviceInfo {
    static {
        Covode.recordClassIndex(27594);
    }

    int getHDRInfo();

    int getHWDecodeMaxLength();

    int getScreenFps();

    int getScreenHeight();

    int getScreenWidth();
}
