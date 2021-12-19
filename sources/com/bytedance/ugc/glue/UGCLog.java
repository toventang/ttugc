package com.bytedance.ugc.glue;

import com.bytedance.covode.number.Covode;

public class UGCLog {
    private static UGCLog instance = new UGCLog();

    /* access modifiers changed from: protected */
    public void dImpl(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    public void eImpl(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    public void eImpl(String str, String str2, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void iImpl(String str, String str2) {
    }

    protected UGCLog() {
    }

    private static UGCLog getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    static {
        Covode.recordClassIndex(27512);
    }

    /* renamed from: d */
    public static void m44212d(String str, String str2) {
        getInstance().dImpl(str, str2);
    }

    /* renamed from: e */
    public static void m44213e(String str, String str2) {
        getInstance().eImpl(str, str2);
    }

    /* renamed from: i */
    public static void m44215i(String str, String str2) {
        getInstance().iImpl(str, str2);
    }

    /* renamed from: e */
    public static void m44214e(String str, String str2, Throwable th) {
        getInstance().eImpl(str, str2, th);
    }
}
