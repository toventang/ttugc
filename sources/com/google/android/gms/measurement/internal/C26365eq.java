package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.measurement.internal.eq */
public final class C26365eq {

    /* renamed from: a */
    private final String f61941a;

    /* renamed from: b */
    private final long f61942b;

    /* renamed from: c */
    private boolean f61943c;

    /* renamed from: d */
    private long f61944d;

    /* renamed from: e */
    private final /* synthetic */ C26361em f61945e;

    static {
        Covode.recordClassIndex(31787);
    }

    /* renamed from: a */
    public final long mo43209a() {
        if (!this.f61943c) {
            this.f61943c = true;
            this.f61944d = this.f61945e.mo43196f().getLong(this.f61941a, this.f61942b);
        }
        return this.f61944d;
    }

    /* renamed from: a */
    public final void mo43210a(long j) {
        SharedPreferences.Editor edit = this.f61945e.mo43196f().edit();
        edit.putLong(this.f61941a, j);
        edit.apply();
        this.f61944d = j;
    }

    public C26365eq(C26361em emVar, String str, long j) {
        this.f61945e = emVar;
        C25565r.m49316a(str);
        this.f61941a = str;
        this.f61942b = j;
    }
}
