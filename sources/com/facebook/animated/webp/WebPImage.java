package com.facebook.animated.webp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.nativecode.C24632b;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c;
import com.facebook.imagepipeline.p1871a.p1872a.C24320b;
import com.facebook.imagepipeline.p1871a.p1873b.AbstractC24329c;
import java.nio.ByteBuffer;

public class WebPImage implements AbstractC24323c, AbstractC24329c {
    private long mNativeContext;

    static {
        Covode.recordClassIndex(28133);
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public boolean doesRenderSupportScaling() {
        return true;
    }

    public WebPImage() {
    }

    public void dispose() {
        MethodCollector.m26663i(1970);
        nativeDispose();
        MethodCollector.m26664o(1970);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(1880);
        nativeFinalize();
        MethodCollector.m26664o(1880);
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getDuration() {
        MethodCollector.m26663i(2132);
        int nativeGetDuration = nativeGetDuration();
        MethodCollector.m26664o(2132);
        return nativeGetDuration;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getFrameCount() {
        MethodCollector.m26663i(2123);
        int nativeGetFrameCount = nativeGetFrameCount();
        MethodCollector.m26664o(2123);
        return nativeGetFrameCount;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int[] getFrameDurations() {
        MethodCollector.m26663i(2142);
        int[] nativeGetFrameDurations = nativeGetFrameDurations();
        MethodCollector.m26664o(2142);
        return nativeGetFrameDurations;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getHeight() {
        MethodCollector.m26663i(2121);
        int nativeGetHeight = nativeGetHeight();
        MethodCollector.m26664o(2121);
        return nativeGetHeight;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getLoopCount() {
        MethodCollector.m26663i(2144);
        int nativeGetLoopCount = nativeGetLoopCount();
        MethodCollector.m26664o(2144);
        return nativeGetLoopCount;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getSizeInBytes() {
        MethodCollector.m26663i(2602);
        int nativeGetSizeInBytes = nativeGetSizeInBytes();
        MethodCollector.m26664o(2602);
        return nativeGetSizeInBytes;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getWidth() {
        MethodCollector.m26663i(2040);
        int nativeGetWidth = nativeGetWidth();
        MethodCollector.m26664o(2040);
        return nativeGetWidth;
    }

    WebPImage(long j) {
        this.mNativeContext = j;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24329c
    public AbstractC24323c decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public WebPFrame getFrame(int i) {
        MethodCollector.m26663i(2167);
        WebPFrame nativeGetFrame = nativeGetFrame(i);
        MethodCollector.m26664o(2167);
        return nativeGetFrame;
    }

    public static WebPImage create(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(1994);
        C24632b.m47148a();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        MethodCollector.m26664o(1994);
        return nativeCreateFromDirectByteBuffer;
    }

    public static WebPImage create(byte[] bArr) {
        MethodCollector.m26663i(1987);
        C24632b.m47148a();
        C24091i.m45617a(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(allocateDirect);
        MethodCollector.m26664o(1987);
        return nativeCreateFromDirectByteBuffer;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public C24320b getFrameInfo(int i) {
        C24320b.EnumC24321a aVar;
        C24320b.EnumC24322b bVar;
        MethodCollector.m26663i(2928);
        WebPFrame frame = getFrame(i);
        try {
            int nativeGetXOffset = frame.nativeGetXOffset();
            int nativeGetYOffset = frame.nativeGetYOffset();
            int nativeGetWidth = frame.nativeGetWidth();
            int nativeGetHeight = frame.nativeGetHeight();
            if (frame.nativeIsBlendWithPreviousFrame()) {
                aVar = C24320b.EnumC24321a.BLEND_WITH_PREVIOUS;
            } else {
                aVar = C24320b.EnumC24321a.NO_BLEND;
            }
            if (frame.nativeShouldDisposeToBackgroundColor()) {
                bVar = C24320b.EnumC24322b.DISPOSE_TO_BACKGROUND;
            } else {
                bVar = C24320b.EnumC24322b.DISPOSE_DO_NOT;
            }
            return new C24320b(i, nativeGetXOffset, nativeGetYOffset, nativeGetWidth, nativeGetHeight, aVar, bVar);
        } finally {
            frame.nativeDispose();
            MethodCollector.m26664o(2928);
        }
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24329c
    public AbstractC24323c decode(long j, int i) {
        return create(j, i);
    }

    public static WebPImage create(long j, int i) {
        boolean z;
        MethodCollector.m26663i(2005);
        C24632b.m47148a();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        WebPImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        MethodCollector.m26664o(2005);
        return nativeCreateFromNativeMemory;
    }
}
