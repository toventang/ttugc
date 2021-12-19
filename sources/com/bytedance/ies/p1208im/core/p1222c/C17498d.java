package com.bytedance.ies.p1208im.core.p1222c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C28022o;

/* renamed from: com.bytedance.ies.im.core.c.d */
public final class C17498d {

    /* renamed from: a */
    public static final C28022o f41884a = null;

    /* renamed from: b */
    public static final C17498d f41885b = new C17498d();

    private C17498d() {
    }

    static {
        Covode.recordClassIndex(19987);
    }

    /* renamed from: a */
    public static C28022o m32482a() {
        try {
            return (C28022o) SettingsManager.m29616a().mo25397a("im_config", C28022o.class, f41884a);
        } catch (Throwable unused) {
            return f41884a;
        }
    }
}
