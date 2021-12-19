package com.p2082ss.android.medialib.photomovie;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.AbstractC30003d;
import com.p2082ss.android.medialib.C29991c;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.photomovie.PhotoMovie */
public final class PhotoMovie implements AbstractC30003d {
    private static final String TAG = PhotoMovie.class.getSimpleName();
    private static AbstractC30019a mPhotoMovieListener;
    protected static volatile PhotoMovie mSingleton = null;
    private C29991c mAVCEncoderMark;

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$ProgressCallback */
    public interface ProgressCallback {
        static {
            Covode.recordClassIndex(36500);
        }

        void onProgress(int i);
    }

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$a */
    public interface AbstractC30019a {
        static {
            Covode.recordClassIndex(36501);
        }
    }

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$b */
    public static class C30020b {

        /* renamed from: a */
        public String[] f71644a;

        /* renamed from: b */
        public String f71645b;

        /* renamed from: c */
        public String f71646c;

        /* renamed from: d */
        public String[] f71647d;

        /* renamed from: e */
        public String[] f71648e;

        /* renamed from: f */
        public int[] f71649f;

        /* renamed from: g */
        public int f71650g;

        /* renamed from: h */
        public String f71651h;

        /* renamed from: i */
        public String f71652i;

        /* renamed from: j */
        public float f71653j;

        /* renamed from: k */
        public final C30021a f71654k;

        /* renamed from: l */
        public ProgressCallback f71655l;

        static {
            Covode.recordClassIndex(36502);
        }
    }

    private static native int nativeSynthetise(String[] strArr, String str, String str2, String[] strArr2, String[] strArr3, int[] iArr, int i, String str3, String str4, float f, int i2, int i3, int i4, ProgressCallback progressCallback);

    private native void onWriteFile(byte[] bArr, int i, int i2, int i3, int i4);

    private native int setCodecConfig(byte[] bArr, int i);

    private native int setColorFormat(int i);

    private native int setHardEncoderMarkStatus(boolean z);

    private static native void setMarkParams(String[] strArr, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6);

    private native void swapGlBuffer();

    public final void onInitMarkHardEncoderRet(int i) {
    }

    public final void onMarkEncoderData(ByteBuffer byteBuffer, int i, boolean z) {
    }

    public final void onMarkEncoderData(byte[] bArr, int i, boolean z) {
    }

    public PhotoMovie() {
        mSingleton = this;
    }

    public static void onNativeCallback_UninitMarkHardEncoder() {
        if (mSingleton != null) {
            mSingleton.onUninitMarkHardEncoder();
        }
    }

    @Override // com.p2082ss.android.medialib.AbstractC30003d
    public final void onMarkSwapGlBuffers() {
        MethodCollector.m26663i(2276);
        swapGlBuffer();
        MethodCollector.m26664o(2276);
    }

    static {
        Covode.recordClassIndex(36499);
        C30731d.m63118c();
    }

    public static PhotoMovie getInstance() {
        MethodCollector.m26663i(1554);
        synchronized (PhotoMovie.class) {
            try {
                if (mSingleton == null) {
                    synchronized (PhotoMovie.class) {
                        try {
                            if (mSingleton == null) {
                                mSingleton = new PhotoMovie();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(1554);
            }
        }
        PhotoMovie photoMovie = mSingleton;
        MethodCollector.m26664o(1554);
        return photoMovie;
    }

    public final void onUninitMarkHardEncoder() {
        MethodCollector.m26663i(2136);
        C85315al.m146637a(TAG, "onUninitMarkHardEncoder == enter");
        C29991c cVar = this.mAVCEncoderMark;
        if (cVar != null) {
            synchronized (cVar) {
                try {
                    if (cVar.f71562i != 0 && cVar.f71559f != null) {
                        if (cVar.f71562i == 2) {
                            try {
                                cVar.f71559f.stop();
                            } catch (Exception unused) {
                                C85315al.m146642d(C29991c.f71551a, "MediaCodec Exception");
                            }
                        }
                        try {
                            cVar.f71559f.release();
                        } catch (Exception unused2) {
                        }
                        cVar.f71559f = null;
                        if (cVar.f71560g != null) {
                            cVar.f71560g.release();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2136);
                    throw th;
                }
            }
            this.mAVCEncoderMark = null;
            C85315al.m146637a(TAG, "====== uninitAVCEncoder ======");
        }
        C85315al.m146637a(TAG, "onUninitMarkHardEncoder == exit");
        MethodCollector.m26664o(2136);
    }

    public static void setPhotoMovieListener(AbstractC30019a aVar) {
        mPhotoMovieListener = aVar;
    }

    public static PhotoMoviePlayer createPlayer(Context context) {
        return new PhotoMoviePlayer(context);
    }

    public static int calulateDuration(C30020b bVar) {
        if (bVar.f71644a.length == 0) {
            return 0;
        }
        return (bVar.f71644a.length * 2500) - 500;
    }

    public static void onNativeCallback_InitMarkHardEncoderRet(int i) {
        if (mSingleton != null) {
            mSingleton.onInitMarkHardEncoderRet(i);
        }
    }

    @Override // com.p2082ss.android.medialib.AbstractC30003d
    public final void onMarkSetCodecConfig(byte[] bArr) {
        MethodCollector.m26663i(2279);
        setCodecConfig(bArr, bArr.length);
        MethodCollector.m26664o(2279);
    }

    @Override // com.p2082ss.android.medialib.AbstractC30003d
    public final void setColorFormatMark(int i) {
        MethodCollector.m26663i(2001);
        setColorFormat(i);
        MethodCollector.m26664o(2001);
    }

    public final int synthetise(C30020b bVar) {
        MethodCollector.m26663i(1567);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            int nativeSynthetise = nativeSynthetise(bVar.f71644a, bVar.f71645b, bVar.f71646c, bVar.f71647d, bVar.f71648e, bVar.f71649f, bVar.f71650g, bVar.f71651h, bVar.f71652i, bVar.f71653j, bVar.f71654k.f71658a, bVar.f71654k.f71659b, bVar.f71654k.f71660c, bVar.f71655l);
            MethodCollector.m26664o(1567);
            return nativeSynthetise;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Don't synthetise photomovie in main thread");
        MethodCollector.m26664o(1567);
        throw illegalStateException;
    }

    @Override // com.p2082ss.android.medialib.AbstractC30003d
    public final void onMarkWriteFile(byte[] bArr, int i, int i2, int i3) {
        MethodCollector.m26663i(2275);
        onWriteFile(bArr, bArr.length, i, i2, i3);
        C85315al.m146639b(TAG, "onEncoderData: ...");
        MethodCollector.m26664o(2275);
    }

    public static int onNativeCallback_MarkencodeTexture(int i, int i2, int i3, int i4, boolean z) {
        if (mSingleton != null) {
            return mSingleton.onMarkEncodeData(i, i2, i3, i4, z);
        }
        return 0;
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, boolean z) {
        return onInitMarkHardEncoder(i, i2, i3, 1, 1, i4, z);
    }

    public final int onMarkEncodeData(int i, int i2, int i3, int i4, boolean z) {
        C29991c cVar = this.mAVCEncoderMark;
        if (cVar != null) {
            return cVar.mo52810a(i, i2, i3, i4, z);
        }
        return 0;
    }

    public final int onMarkEncoderData(int i, int i2, int i3, int i4, boolean z) {
        C29991c cVar = this.mAVCEncoderMark;
        if (cVar != null) {
            return cVar.mo52810a(i, i2, i3, i4, z);
        }
        return 0;
    }

    public static Surface onNativeCallback_InitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (mSingleton != null) {
            return mSingleton.onInitMarkHardEncoder(i, i2, i3, i4, i5, z);
        }
        return null;
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, boolean z) {
        MethodCollector.m26663i(1579);
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new C29991c();
        }
        C29991c.f71552b = this;
        Surface a = this.mAVCEncoderMark.mo52811a(i, i2, i3, z);
        if (a == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            MethodCollector.m26664o(1579);
            return null;
        }
        C85315al.m146637a(TAG, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        MethodCollector.m26664o(1579);
        return a;
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        MethodCollector.m26663i(2127);
        String str = TAG;
        C85315al.m146637a(str, "onInitMarkHardEncoder == enter");
        C85315al.m146637a(str, "width = " + i + "\theight = " + i2);
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new C29991c();
        }
        C29991c.f71552b = this;
        Surface a = this.mAVCEncoderMark.mo52811a(i, i2, i3, z);
        if (a == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            MethodCollector.m26664o(2127);
            return null;
        }
        C85315al.m146637a(str, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        C85315al.m146637a(str, "onInitMarkHardEncoder == exit");
        MethodCollector.m26664o(2127);
        return a;
    }

    public static void onNativeCallback_MarkParam(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (mSingleton != null) {
            mSingleton.onMarkParam(f, i, f2, f3, f4, f5, f6, f7);
        }
    }

    public final void onMarkParam(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        C29991c cVar = this.mAVCEncoderMark;
        if (cVar != null) {
            cVar.f71564k = f;
            cVar.f71565l = i;
            cVar.f71566m = f2;
            cVar.f71567n = f3;
            cVar.f71568o = f4;
            cVar.f71569p = f5;
            cVar.f71570q = f6;
            cVar.f71571r = f7;
            if (cVar.f71561h != null) {
                cVar.f71561h.mo52840b(cVar.f71564k);
                cVar.f71561h.mo52837a(cVar.f71566m, cVar.f71567n, cVar.f71568o, cVar.f71569p);
            }
        }
    }

    public final void setMarkParam(String[] strArr, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        MethodCollector.m26663i(1570);
        setMarkParams(strArr, str, z, i, i2, i3, i4, i5, i6);
        MethodCollector.m26664o(1570);
    }
}
