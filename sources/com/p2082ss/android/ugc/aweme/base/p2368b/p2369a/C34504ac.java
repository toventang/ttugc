package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.trill.share.p4384a.AbstractC85156a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.b.a.ac */
public final class C34504ac implements AbstractC85156a {

    /* renamed from: a */
    private Context f81490a;

    /* renamed from: b */
    private SharedPreferences f81491b;

    static {
        Covode.recordClassIndex(41462);
    }

    public C34504ac(Context context) {
        this.f81490a = context;
        this.f81491b = C34822d.m71158a(context, "VideoPublishManager", 0);
    }

    @Override // com.p2082ss.android.ugc.trill.share.p4384a.AbstractC85156a
    /* renamed from: a */
    public final void mo60940a(boolean z) {
        SharedPreferences.Editor edit = this.f81491b.edit();
        edit.putBoolean("is_aweme_private", z);
        edit.apply();
    }
}
