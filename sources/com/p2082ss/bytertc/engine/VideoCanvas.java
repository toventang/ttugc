package com.p2082ss.bytertc.engine;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.VideoCanvas */
public class VideoCanvas {
    public boolean isScreen;
    public int renderMode;
    public View renderView;
    public String roomId;
    public String uid;

    static {
        Covode.recordClassIndex(100944);
    }

    public VideoCanvas() {
    }

    public String toString() {
        return "VideoCanvas{, textureView=" + this.renderView + ", renderMode=" + this.renderMode + ", roomId=" + this.roomId + ", uid='" + this.uid + '\'' + ", isScreen=" + this.isScreen + '}';
    }

    public VideoCanvas(SurfaceView surfaceView, int i, String str, boolean z) {
        this.renderView = surfaceView;
        this.renderMode = i;
        this.roomId = this.roomId;
        this.uid = str;
        this.isScreen = z;
    }

    public VideoCanvas(TextureView textureView, int i, String str, boolean z) {
        this.renderView = textureView;
        this.renderMode = i;
        this.roomId = "";
        this.uid = str;
        this.isScreen = z;
    }

    public VideoCanvas(SurfaceView surfaceView, int i, String str, String str2, boolean z) {
        this.renderView = surfaceView;
        this.renderMode = i;
        this.roomId = str;
        this.uid = str2;
        this.isScreen = z;
    }

    public VideoCanvas(TextureView textureView, int i, String str, String str2, boolean z) {
        this.renderView = textureView;
        this.renderMode = i;
        this.roomId = str;
        this.uid = str2;
        this.isScreen = z;
    }
}
