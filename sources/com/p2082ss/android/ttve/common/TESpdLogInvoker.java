package com.p2082ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.ttve.common.TESpdLogInvoker */
public class TESpdLogInvoker {
    public native void close();

    public native int error(String str);

    public native String getLogFiles(String str);

    public native int info(int i, String str);

    public native int initSpdLog(String str, int i, int i2);

    public native void setLevel(int i);

    public native int warn(String str);

    static {
        Covode.recordClassIndex(37181);
        C30731d.m63114a();
    }
}
