package com.p2082ss.android.medialib.photomovie;

import android.content.Context;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.medialib.photomovie.PhotoMoviePlayer */
public class PhotoMoviePlayer {

    /* renamed from: a */
    private long f71656a = nativeCreatePlayer();

    /* renamed from: b */
    private Context f71657b;

    private native long nativeCreatePlayer();

    private native long nativeGetDuration(long j);

    private native void nativeOnSizeChanged(long j, int i, int i2);

    private native int nativePause(long j);

    private native void nativePlayCover(long j, int i, int i2);

    private native int nativePrepare(long j, String[] strArr, String str, int i, int i2, int i3, int i4, int i5);

    private native void nativeRelease(long j);

    private native int nativeReset(long j);

    private native int nativeResume(long j);

    private native void nativeSeekTo(long j, long j2);

    private native void nativeSetFilter(long j, String str, String str2, float f);

    private native void nativeSetLoop(long j, boolean z);

    private native void nativeSetOrientation(long j, int i);

    private native int nativeStart(long j, Surface surface, int i, int i2);

    private native void nativeStop(long j);

    private native void nativeSwitchPlayMode(long j, int i);

    static {
        Covode.recordClassIndex(36503);
        C30731d.m63119d();
    }

    public PhotoMoviePlayer(Context context) {
        MethodCollector.m26663i(786);
        this.f71657b = context;
        MethodCollector.m26664o(786);
    }
}
