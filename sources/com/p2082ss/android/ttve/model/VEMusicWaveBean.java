package com.p2082ss.android.ttve.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.model.VEMusicWaveBean */
public class VEMusicWaveBean {
    private float[] waveBean;

    static {
        Covode.recordClassIndex(37235);
    }

    public float[] getWaveBean() {
        return this.waveBean;
    }

    public void setWaveBean(float[] fArr) {
        this.waveBean = fArr;
    }
}
