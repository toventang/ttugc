package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61566a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.v */
final class C34525v implements AbstractC61566a {

    /* renamed from: a */
    private Context f81523a;

    /* renamed from: b */
    private SharedPreferences f81524b;

    static {
        Covode.recordClassIndex(41483);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61566a
    /* renamed from: a */
    public final int mo60983a() {
        return this.f81524b.getInt("notice_count_latency", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61566a
    /* renamed from: b */
    public final void mo60984b() {
        SharedPreferences.Editor edit = this.f81524b.edit();
        edit.putBoolean("si_show_user_feed_back_point", true);
        edit.apply();
    }

    public C34525v(Context context) {
        this.f81523a = context;
        this.f81524b = C34822d.m71158a(context, "aweme-app", 0);
    }
}
