package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IVideoStream extends IStream {
    static {
        Covode.recordClassIndex(27599);
    }

    float getFrameRate();

    int getHeight();

    int getResolution();

    int getSupportSR();

    int getWidth();
}
