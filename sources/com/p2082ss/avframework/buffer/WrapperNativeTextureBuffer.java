package com.p2082ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.TextureBufferImpl;
import com.p2082ss.avframework.buffer.VideoFrame;

/* renamed from: com.ss.avframework.buffer.WrapperNativeTextureBuffer */
public class WrapperNativeTextureBuffer extends TextureBufferImpl implements VideoFrame.TextureBuffer {
    private long mNativeObj;

    static {
        Covode.recordClassIndex(99860);
    }

    private native void nativeRelease(long j);

    private native void nativeRetain(long j);

    private native VideoFrame.I420Buffer nativeToI420(long j);

    @Override // com.p2082ss.avframework.buffer.TextureBufferImpl, com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public void retain() {
        MethodCollector.m26663i(4671);
        nativeRetain(this.mNativeObj);
        MethodCollector.m26664o(4671);
    }

    @Override // com.p2082ss.avframework.buffer.TextureBufferImpl, com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        MethodCollector.m26663i(4668);
        VideoFrame.I420Buffer nativeToI420 = nativeToI420(this.mNativeObj);
        MethodCollector.m26664o(4668);
        return nativeToI420;
    }

    @Override // com.p2082ss.avframework.buffer.TextureBufferImpl, com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public synchronized void release() {
        MethodCollector.m26663i(4669);
        nativeRelease(this.mNativeObj);
        MethodCollector.m26664o(4669);
    }

    private void setROIInfoNative(long j) {
        if (j != 0) {
            setROIInfo(new RoiInfo(j));
        }
    }

    private static long isWrapperNativeFrame(VideoFrame videoFrame) {
        if (videoFrame == null || !(videoFrame.getBuffer() instanceof WrapperNativeTextureBuffer)) {
            return 0;
        }
        long j = ((WrapperNativeTextureBuffer) videoFrame.getBuffer()).mNativeObj;
        if (j != 0) {
            return j;
        }
        throw new AndroidRuntimeException("Wrapper texture buffer is null!, What happen!");
    }

    public WrapperNativeTextureBuffer(int i, int i2, int i3, long j) {
        this(i, i2, i3, new Matrix(), j);
        this.mNativeObj = j;
    }

    public WrapperNativeTextureBuffer(int i, int i2, int i3, Matrix matrix, long j) {
        super(i, i2, VideoFrame.TextureBuffer.Type.RGB, i3, matrix, (TextureBufferImpl.ToI420Interface) null, (Runnable) null);
        this.mNativeObj = j;
    }

    @Override // com.p2082ss.avframework.buffer.TextureBufferImpl, com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == i && i == 0 && i3 == i5 && i4 == i6) {
            retain();
            return this;
        }
        throw new AndroidRuntimeException("Please support matrix transcat and see construct method");
    }
}
