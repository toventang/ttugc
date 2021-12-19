package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class Camera2AB {
    @AbstractC27891c(mo46611a = "camera_hw_level")
    private int cameraHWLevel;
    @AbstractC27891c(mo46611a = "camera_type")
    private int cameraType = 1;

    static {
        Covode.recordClassIndex(10223);
    }

    public int getCameraHWLevel() {
        return this.cameraHWLevel;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public Camera2AB() {
    }

    public void setCameraHWLevel(int i) {
        this.cameraHWLevel = i;
    }

    public void setCameraType(int i) {
        this.cameraType = i;
    }

    public Camera2AB(int i, int i2) {
        this.cameraType = i;
        this.cameraHWLevel = i2;
    }
}
