package com.benchmark.settings;

import com.bytedance.covode.number.Covode;

public class BTCDecodeSettings {
    public String decodeFile;
    public String decodeFrameSaveDir = "";
    private int dstHeight = 1280;
    private int dstWidth = 720;
    public boolean isDebug;
    private boolean isDecodeToSurface = true;
    private boolean useVC1;

    static {
        Covode.recordClassIndex(2869);
    }

    public int getDstHeight() {
        return this.dstHeight;
    }

    public int getDstWidth() {
        return this.dstWidth;
    }

    public boolean isDecodeToSurface() {
        return this.isDecodeToSurface;
    }

    public boolean isUseVC1() {
        return this.useVC1;
    }

    public BTCDecodeSettings(boolean z, int i, int i2, String str) {
        this.isDecodeToSurface = z;
        this.dstWidth = i;
        this.dstHeight = i2;
        this.decodeFile = str;
    }
}
