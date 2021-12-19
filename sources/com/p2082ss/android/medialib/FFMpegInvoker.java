package com.p2082ss.android.medialib;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.medialib.FFMpegInvoker */
public class FFMpegInvoker {
    public native int addFastReverseVideo(String str, String str2);

    public native int stopReverseVideo();

    static {
        Covode.recordClassIndex(36398);
        C30731d.m63118c();
    }
}
