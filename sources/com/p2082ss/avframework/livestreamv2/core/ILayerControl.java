package com.p2082ss.avframework.livestreamv2.core;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.mixer.VideoMixer;

/* renamed from: com.ss.avframework.livestreamv2.core.ILayerControl */
public interface ILayerControl {

    /* renamed from: com.ss.avframework.livestreamv2.core.ILayerControl$ILayer */
    public interface ILayer {
        static {
            Covode.recordClassIndex(100216);
        }

        void dispose();

        int getHeight();

        VideoMixer.VideoMixerDescription getLayerDescription();

        int getRealFps();

        int getWidth();

        boolean isEnable();

        Canvas lockCanvas();

        String name();

        void pause();

        void resume();

        void setAnimationMode(int i, long j, RectF rectF);

        void setEnable(boolean z);

        void setVisibility(int i);

        void unlockCanvasAndPost(Canvas canvas, long j);

        void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription);
    }

    static {
        Covode.recordClassIndex(100215);
    }

    ILayer createLayer(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i, int i2);

    ILayer getLayer(String str);

    ILayer[] getLayers();

    ILayer getLocalOriginLayer();

    float getRealRenderFps();

    int layerSize();

    void setOriginTriggering(String str);
}
