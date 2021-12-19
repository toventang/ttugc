package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.main.AbstractC59040ay;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.b.a.t */
public final class C34523t implements AbstractC59040ay {

    /* renamed from: a */
    private Context f81519a;

    /* renamed from: b */
    private SharedPreferences f81520b;

    static {
        Covode.recordClassIndex(41481);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: b */
    public final void mo60974b() {
        SharedPreferences.Editor edit = this.f81520b.edit();
        edit.putBoolean("shouldCleanEffectsAtFirstLaunch", false);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: c */
    public final long mo60976c() {
        return this.f81520b.getLong("cleanEffectsLastTime", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: e */
    public final boolean mo60980e() {
        return this.f81520b.getBoolean("hasShowUnloginContentLanguageDialog", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: f */
    public final boolean mo60981f() {
        return this.f81520b.getBoolean("isCheckContentLanguageDialogWhenFirstLaunch", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: g */
    public final void mo60982g() {
        SharedPreferences.Editor edit = this.f81520b.edit();
        edit.putBoolean("isCheckContentLanguageDialogWhenFirstLaunch", true);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: d */
    public final boolean mo60979d() {
        return this.f81520b.getBoolean("secondTabLastLandFollowTab", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: a */
    public final boolean mo60973a() {
        return this.f81520b.getBoolean("shouldCleanEffectsAtFirstLaunch", true);
    }

    public C34523t(Context context) {
        this.f81519a = context;
        this.f81520b = C34822d.m71158a(context, "MainTabPreferences", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: a */
    public final String mo60970a(String str) {
        return this.f81520b.getString("hasClickActivityDot", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: d */
    public final String mo60978d(String str) {
        return this.f81520b.getString("unloginContentLanguage", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: a */
    public final void mo60971a(long j) {
        SharedPreferences.Editor edit = this.f81520b.edit();
        edit.putLong("cleanEffectsLastTime", j);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: b */
    public final void mo60975b(String str) {
        SharedPreferences.Editor edit = this.f81520b.edit();
        edit.putString("hasClickActivityDot", str);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: c */
    public final void mo60977c(String str) {
        SharedPreferences.Editor edit = this.f81520b.edit();
        edit.putString("unloginContentLanguage", str);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59040ay
    /* renamed from: a */
    public final void mo60972a(boolean z) {
        SharedPreferences.Editor edit = this.f81520b.edit();
        edit.putBoolean("hasShowUnloginContentLanguageDialog", z);
        edit.apply();
    }
}
