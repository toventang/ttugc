package com.p2082ss.android.account.share.data;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;

/* renamed from: com.ss.android.account.share.data.a */
public final class C29356a {

    /* renamed from: a */
    private String f69675a;

    /* renamed from: b */
    private Bundle f69676b;

    static {
        Covode.recordClassIndex(35744);
    }

    /* renamed from: a */
    public static C29356a m58786a() {
        return new C29356a();
    }

    /* renamed from: b */
    public final void mo51316b() {
        try {
            C29819a.m60076a(this.f69675a, this.f69676b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final C29356a mo51314a(String str) {
        this.f69675a = str;
        mo51315a("params_for_special", "uc_login");
        return this;
    }

    /* renamed from: a */
    public final C29356a mo51315a(String str, Object obj) {
        if (this.f69676b == null) {
            this.f69676b = new Bundle();
        }
        try {
            this.f69676b.putString(str, obj.toString());
        } catch (Exception unused) {
        }
        return this;
    }
}
