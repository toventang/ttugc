package com.p2082ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.bytertc.engine.mediaio.RTCVideoFrame */
public class RTCVideoFrame extends RefObject {
    public ByteBuffer buffer;
    public int buffer_type;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public EGLContext eglContext11;
    public android.opengl.EGLContext eglContext14;
    public ByteBuffer extend_data;
    public int format;
    public int glTarget;
    public int height;
    public int rotation;
    public int stride;
    public ByteBuffer supplementary_info;
    public int textureId;
    public long timestamp;
    public float[] transform;

    static {
        Covode.recordClassIndex(101114);
    }

    public RTCVideoFrame() {
        super(null);
    }

    public static RTCVideoFrame shallowCopy(RTCVideoFrame rTCVideoFrame) {
        RTCVideoFrame rTCVideoFrame2 = new RTCVideoFrame();
        rTCVideoFrame2.buffer = rTCVideoFrame.buffer;
        rTCVideoFrame2.buffer_type = rTCVideoFrame.buffer_type;
        rTCVideoFrame2.cropBottom = rTCVideoFrame.cropBottom;
        rTCVideoFrame2.cropLeft = rTCVideoFrame.cropLeft;
        rTCVideoFrame2.cropRight = rTCVideoFrame.cropRight;
        rTCVideoFrame2.cropTop = rTCVideoFrame.cropTop;
        rTCVideoFrame2.eglContext11 = rTCVideoFrame.eglContext11;
        rTCVideoFrame2.eglContext14 = rTCVideoFrame.eglContext14;
        rTCVideoFrame2.extend_data = rTCVideoFrame.extend_data;
        rTCVideoFrame2.supplementary_info = rTCVideoFrame.supplementary_info;
        rTCVideoFrame2.format = rTCVideoFrame.format;
        rTCVideoFrame2.glTarget = rTCVideoFrame.glTarget;
        rTCVideoFrame2.stride = rTCVideoFrame.stride;
        rTCVideoFrame2.height = rTCVideoFrame.height;
        rTCVideoFrame2.rotation = rTCVideoFrame.rotation;
        rTCVideoFrame2.textureId = rTCVideoFrame.textureId;
        rTCVideoFrame2.timestamp = rTCVideoFrame.timestamp;
        rTCVideoFrame2.transform = rTCVideoFrame.transform;
        return rTCVideoFrame2;
    }

    public RTCVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, long j, Runnable runnable) {
        super(runnable);
        this.stride = i;
        this.height = i2;
        this.format = 1;
        this.rotation = i3;
        this.timestamp = j;
        this.extend_data = byteBuffer2;
        this.supplementary_info = byteBuffer3;
        this.buffer = byteBuffer;
    }

    public RTCVideoFrame(int i, int i2, float[] fArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i3, int i4, int i5, long j, Runnable runnable) {
        super(runnable);
        this.stride = i3;
        this.height = i4;
        this.buffer_type = 1;
        this.format = i2;
        this.rotation = i5;
        this.timestamp = j;
        this.extend_data = byteBuffer;
        this.supplementary_info = byteBuffer2;
        this.textureId = i;
        this.transform = fArr;
    }
}
