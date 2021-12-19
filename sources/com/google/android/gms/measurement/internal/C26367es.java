package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.measurement.internal.es */
public final class C26367es {

    /* renamed from: a */
    private final String f61947a;

    /* renamed from: b */
    private final String f61948b = null;

    /* renamed from: c */
    private boolean f61949c;

    /* renamed from: d */
    private String f61950d;

    /* renamed from: e */
    private final /* synthetic */ C26361em f61951e;

    static {
        Covode.recordClassIndex(31789);
    }

    /* renamed from: a */
    public final String mo43213a() {
        if (!this.f61949c) {
            this.f61949c = true;
            this.f61950d = this.f61951e.mo43196f().getString(this.f61947a, null);
        }
        return this.f61950d;
    }

    /* renamed from: a */
    public final void mo43214a(String str) {
        if (this.f61951e.mo43018s().mo43641d(null, C26530p.f62538ax) || !C26510jz.m52405c(str, this.f61950d)) {
            SharedPreferences.Editor edit = this.f61951e.mo43196f().edit();
            edit.putString(this.f61947a, str);
            edit.apply();
            this.f61950d = str;
        }
    }

    public C26367es(C26361em emVar, String str) {
        this.f61951e = emVar;
        C25565r.m49316a(str);
        this.f61947a = str;
    }
}
