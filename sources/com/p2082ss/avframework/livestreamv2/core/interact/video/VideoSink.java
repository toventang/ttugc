package com.p2082ss.avframework.livestreamv2.core.interact.video;

import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.ILayerControl;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.video.VideoSink */
public interface VideoSink {
    static {
        Covode.recordClassIndex(100455);
    }

    int consumeDualGameVideoFrame(ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i, int i2, int i3, int i4, long j);

    String getInteractId();

    ILayerControl.ILayer getRenderLayer();

    SurfaceView getSurfaceView();

    int getTextureID();

    TextureView getTextureView();

    boolean isValid();

    void onByteBufferVideoFrame(ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i, int i2, int i3, int i4, long j);

    void onTextureVideoFrame(int i, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, float[] fArr, int i4, long j);

    void setFitMode(boolean z);

    void setRenderAble(boolean z);
}
