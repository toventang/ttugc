package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.livestreamv2.RenderView;
import com.p2082ss.avframework.livestreamv2.core.ILayerControl;
import com.p2082ss.avframework.mixer.VideoMixer;

/* renamed from: com.ss.avframework.livestreamv2.core.ILayerControlExt */
public interface ILayerControlExt extends ILayerControl {

    /* renamed from: com.ss.avframework.livestreamv2.core.ILayerControlExt$ILayerExt */
    public interface ILayerExt extends ILayerControl.ILayer {
        static {
            Covode.recordClassIndex(100218);
        }

        int getMixerOutHeight();

        int getMixerOutWidth();

        void renderFrame(VideoFrame videoFrame);

        void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture);
    }

    static {
        Covode.recordClassIndex(100217);
    }

    ILayerExt createLayerExt(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i, int i2, int i3);

    RenderView getRenderView();

    VideoMixer getVideoMixer();

    boolean isFitMode();

    boolean isMirror(boolean z);

    void pause();

    void resume();

    void setFitMode(boolean z);

    void setLocalOrigin(String str);

    void setMirror(boolean z, boolean z2);
}
