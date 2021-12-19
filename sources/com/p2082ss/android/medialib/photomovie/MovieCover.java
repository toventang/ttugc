package com.p2082ss.android.medialib.photomovie;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.model.CoverInfo;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.medialib.photomovie.MovieCover */
public class MovieCover {
    private long mHandle;

    private native long nativeCreate(int i, int i2, int i3);

    private native void nativeDestroy(long j);

    private native CoverInfo nativeGetCover(long j, String[] strArr, String str, String str2, float f, int i, long j2, int i2, int i3);

    static {
        Covode.recordClassIndex(36498);
        C30731d.m63119d();
    }

    public MovieCover() {
        this(new C30021a());
    }

    public void destroy() {
        MethodCollector.m26663i(1307);
        nativeDestroy(this.mHandle);
        this.mHandle = 0;
        MethodCollector.m26664o(1307);
    }

    public MovieCover(C30021a aVar) {
        MethodCollector.m26663i(1128);
        this.mHandle = nativeCreate(aVar.f71658a, aVar.f71659b, aVar.f71660c);
        MethodCollector.m26664o(1128);
    }

    public CoverInfo getCover(String[] strArr, String str, int i, long j, int i2, int i3) {
        MethodCollector.m26663i(1131);
        CoverInfo nativeGetCover = nativeGetCover(this.mHandle, strArr, str, null, 1.0f, i, j, i2, i3);
        MethodCollector.m26664o(1131);
        return nativeGetCover;
    }

    public CoverInfo getCover(String[] strArr, String str, String str2, float f, int i, long j) {
        MethodCollector.m26663i(1297);
        CoverInfo nativeGetCover = nativeGetCover(this.mHandle, strArr, str, str2, f, i, j, 720, 1280);
        MethodCollector.m26664o(1297);
        return nativeGetCover;
    }

    public CoverInfo getCover(String[] strArr, String str, String str2, float f, int i, long j, int i2, int i3) {
        MethodCollector.m26663i(1304);
        CoverInfo nativeGetCover = nativeGetCover(this.mHandle, strArr, str, str2, f, i, j, i2, i3);
        MethodCollector.m26664o(1304);
        return nativeGetCover;
    }
}
