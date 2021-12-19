package com.bytedance.p1469l.p1473b.p1474a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20696f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.l.b.a.f */
public final class C20708f implements AbstractC20696f {
    static {
        Covode.recordClassIndex(24281);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.p1469l.p1470a.p1471a.AbstractC20696f
    /* renamed from: a */
    public final void mo34109a(Context context) {
        SharedPreferences a;
        if (context != null && (a = C34822d.m71158a(context, "ttlive_sdk_shared_pref_cache", 4)) != null) {
            a.edit().putLong("key_ttlive_sdk_flow_remind", System.currentTimeMillis()).apply();
        }
    }

    @Override // com.bytedance.p1469l.p1470a.p1471a.AbstractC20696f
    /* renamed from: b */
    public final boolean mo34110b(Context context) {
        SharedPreferences a;
        if (context == null || (a = C34822d.m71158a(context, "ttlive_sdk_shared_pref_cache", 4)) == null) {
            return false;
        }
        if (((int) ((System.currentTimeMillis() - a.getLong("key_ttlive_sdk_flow_remind", 0)) / 86400000)) <= 30) {
            return true;
        }
        return false;
    }
}
