package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.measurement.internal.eo */
public final class C26363eo {

    /* renamed from: a */
    private final String f61931a;

    /* renamed from: b */
    private final boolean f61932b;

    /* renamed from: c */
    private boolean f61933c;

    /* renamed from: d */
    private boolean f61934d;

    /* renamed from: e */
    private final /* synthetic */ C26361em f61935e;

    static {
        Covode.recordClassIndex(31785);
    }

    /* renamed from: a */
    public final boolean mo43206a() {
        if (!this.f61933c) {
            this.f61933c = true;
            this.f61934d = this.f61935e.mo43196f().getBoolean(this.f61931a, this.f61932b);
        }
        return this.f61934d;
    }

    /* renamed from: a */
    public final void mo43205a(boolean z) {
        SharedPreferences.Editor edit = this.f61935e.mo43196f().edit();
        edit.putBoolean(this.f61931a, z);
        edit.apply();
        this.f61934d = z;
    }

    public C26363eo(C26361em emVar, String str, boolean z) {
        this.f61935e = emVar;
        C25565r.m49316a(str);
        this.f61931a = str;
        this.f61932b = z;
    }
}
