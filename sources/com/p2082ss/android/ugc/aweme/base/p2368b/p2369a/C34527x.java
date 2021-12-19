package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61568c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.x */
final class C34527x implements AbstractC61568c {

    /* renamed from: a */
    private Context f81527a;

    /* renamed from: b */
    private SharedPreferences f81528b;

    static {
        Covode.recordClassIndex(41485);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61568c
    /* renamed from: a */
    public final void mo60985a() {
        SharedPreferences.Editor edit = this.f81528b.edit();
        edit.putBoolean("stick_game_assistant", true);
        edit.apply();
    }

    public C34527x(Context context) {
        this.f81527a = context;
        this.f81528b = C34822d.m71158a(context, "IMPreferences", 0);
    }
}
