package com.facebook.animated.gif;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c;
import com.facebook.imagepipeline.p1871a.p1872a.C24320b;
import com.facebook.imagepipeline.p1871a.p1873b.AbstractC24329c;
import com.facebook.imageutils.C24658b;
import java.nio.ByteBuffer;

public class GifImage implements AbstractC24323c, AbstractC24329c {
    private static volatile boolean sInitialized;
    private long mNativeContext;

    static {
        Covode.recordClassIndex(28131);
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native GifImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public boolean doesRenderSupportScaling() {
        return false;
    }

    public GifImage() {
    }

    public void dispose() {
        MethodCollector.m26663i(554);
        nativeDispose();
        MethodCollector.m26664o(554);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(553);
        nativeFinalize();
        MethodCollector.m26664o(553);
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getDuration() {
        MethodCollector.m26663i(561);
        int nativeGetDuration = nativeGetDuration();
        MethodCollector.m26664o(561);
        return nativeGetDuration;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getFrameCount() {
        MethodCollector.m26663i(559);
        int nativeGetFrameCount = nativeGetFrameCount();
        MethodCollector.m26664o(559);
        return nativeGetFrameCount;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int[] getFrameDurations() {
        MethodCollector.m26663i(588);
        int[] nativeGetFrameDurations = nativeGetFrameDurations();
        MethodCollector.m26664o(588);
        return nativeGetFrameDurations;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getHeight() {
        MethodCollector.m26663i(557);
        int nativeGetHeight = nativeGetHeight();
        MethodCollector.m26664o(557);
        return nativeGetHeight;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getSizeInBytes() {
        MethodCollector.m26663i(601);
        int nativeGetSizeInBytes = nativeGetSizeInBytes();
        MethodCollector.m26664o(601);
        return nativeGetSizeInBytes;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getWidth() {
        MethodCollector.m26663i(556);
        int nativeGetWidth = nativeGetWidth();
        MethodCollector.m26664o(556);
        return nativeGetWidth;
    }

    private static synchronized void ensure() {
        synchronized (GifImage.class) {
            MethodCollector.m26663i(525);
            if (!sInitialized) {
                sInitialized = true;
                C24658b.m47175a("gifimage");
            }
            MethodCollector.m26664o(525);
        }
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public int getLoopCount() {
        MethodCollector.m26663i(595);
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            MethodCollector.m26664o(595);
            return 1;
        } else if (nativeGetLoopCount != 0) {
            int i = nativeGetLoopCount + 1;
            MethodCollector.m26664o(595);
            return i;
        } else {
            MethodCollector.m26664o(595);
            return 0;
        }
    }

    GifImage(long j) {
        this.mNativeContext = j;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24329c
    public AbstractC24323c decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public GifFrame getFrame(int i) {
        MethodCollector.m26663i(598);
        GifFrame nativeGetFrame = nativeGetFrame(i);
        MethodCollector.m26664o(598);
        return nativeGetFrame;
    }

    private static C24320b.EnumC24322b fromGifDisposalMethod(int i) {
        if (i == 0) {
            return C24320b.EnumC24322b.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return C24320b.EnumC24322b.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return C24320b.EnumC24322b.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return C24320b.EnumC24322b.DISPOSE_TO_PREVIOUS;
        }
        return C24320b.EnumC24322b.DISPOSE_DO_NOT;
    }

    public static GifImage create(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(535);
        ensure();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        MethodCollector.m26664o(535);
        return nativeCreateFromDirectByteBuffer;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c
    public C24320b getFrameInfo(int i) {
        MethodCollector.m26663i(675);
        GifFrame frame = getFrame(i);
        try {
            return new C24320b(i, frame.nativeGetXOffset(), frame.nativeGetYOffset(), frame.nativeGetWidth(), frame.nativeGetHeight(), C24320b.EnumC24321a.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.nativeGetDisposalMode()));
        } finally {
            frame.nativeDispose();
            MethodCollector.m26664o(675);
        }
    }

    public static GifImage create(byte[] bArr) {
        MethodCollector.m26663i(528);
        ensure();
        C24091i.m45617a(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(allocateDirect);
        MethodCollector.m26664o(528);
        return nativeCreateFromDirectByteBuffer;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24329c
    public AbstractC24323c decode(long j, int i) {
        return create(j, i);
    }

    public static GifImage create(long j, int i) {
        boolean z;
        MethodCollector.m26663i(540);
        ensure();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        MethodCollector.m26664o(540);
        return nativeCreateFromNativeMemory;
    }
}
