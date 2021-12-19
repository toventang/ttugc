package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.r */
final class C34521r implements AbstractC57886a {

    /* renamed from: a */
    private Context f81515a;

    /* renamed from: b */
    private SharedPreferences f81516b;

    static {
        Covode.recordClassIndex(41479);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a
    /* renamed from: a */
    public final long mo60950a() {
        return this.f81516b.getLong("last_unlock_time", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a
    /* renamed from: b */
    public final long mo60952b() {
        return this.f81516b.getLong("last_append_video_time", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a
    /* renamed from: c */
    public final long mo60954c() {
        return this.f81516b.getLong("today_video_play_time", 0);
    }

    public C34521r(Context context) {
        this.f81515a = context;
        this.f81516b = C34822d.m71158a(context, "aweme-app", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a
    /* renamed from: a */
    public final void mo60951a(long j) {
        SharedPreferences.Editor edit = this.f81516b.edit();
        edit.putLong("last_unlock_time", j);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a
    /* renamed from: b */
    public final void mo60953b(long j) {
        SharedPreferences.Editor edit = this.f81516b.edit();
        edit.putLong("last_append_video_time", j);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a
    /* renamed from: c */
    public final void mo60955c(long j) {
        SharedPreferences.Editor edit = this.f81516b.edit();
        edit.putLong("today_video_play_time", j);
        edit.apply();
    }
}
