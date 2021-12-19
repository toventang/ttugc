package com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.deviceregister.b.a.a.d */
public final class C29880d extends AbstractC29876b {

    /* renamed from: a */
    private final SharedPreferences f71282a;

    /* renamed from: b */
    private final SharedPreferences f71283b;

    static {
        Covode.recordClassIndex(36290);
    }

    /* renamed from: c */
    private SharedPreferences m60228c(String str) {
        if ("device_id".equals(str)) {
            return this.f71283b;
        }
        return this.f71282a;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b
    /* renamed from: a */
    public final String mo52160a(String str) {
        String string = m60228c(str).getString(str, null);
        Logger.debug();
        return string;
    }

    public C29880d(Context context) {
        if (context != null) {
            this.f71282a = C34822d.m71158a(context, C29866a.m60187a(), 0);
            this.f71283b = C29866a.m60186a(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b
    /* renamed from: b */
    public final void mo52162b(String str) {
        SharedPreferences c = m60228c(str);
        if (c != null && c.contains(str)) {
            m60228c(str).edit().remove(str).apply();
        }
        mo52160a(str);
        super.mo52162b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b
    /* renamed from: a */
    public final void mo52161a(String str, String str2) {
        Logger.debug();
        if (!TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = m60228c(str).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
