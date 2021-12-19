package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.measurement.internal.ep */
public final class C26364ep {

    /* renamed from: a */
    private final String f61936a;

    /* renamed from: b */
    private final String f61937b;

    /* renamed from: c */
    private final String f61938c;

    /* renamed from: d */
    private final long f61939d;

    /* renamed from: e */
    private final /* synthetic */ C26361em f61940e;

    static {
        Covode.recordClassIndex(31786);
    }

    /* renamed from: c */
    private final long m51820c() {
        return this.f61940e.mo43196f().getLong(this.f61936a, 0);
    }

    /* renamed from: b */
    private final void m51819b() {
        this.f61940e.mo43002c();
        long a = this.f61940e.mo43011l().mo41857a();
        SharedPreferences.Editor edit = this.f61940e.mo43196f().edit();
        edit.remove(this.f61937b);
        edit.remove(this.f61938c);
        edit.putLong(this.f61936a, a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair<String, Long> mo43207a() {
        long abs;
        this.f61940e.mo43002c();
        this.f61940e.mo43002c();
        long c = m51820c();
        if (c == 0) {
            m51819b();
            abs = 0;
        } else {
            abs = Math.abs(c - this.f61940e.mo43011l().mo41857a());
        }
        long j = this.f61939d;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            m51819b();
            return null;
        }
        String string = this.f61940e.mo43196f().getString(this.f61938c, null);
        long j2 = this.f61940e.mo43196f().getLong(this.f61937b, 0);
        m51819b();
        if (string == null || j2 <= 0) {
            return C26361em.f61898a;
        }
        return new Pair<>(string, Long.valueOf(j2));
    }

    /* renamed from: a */
    public final void mo43208a(String str) {
        boolean z;
        this.f61940e.mo43002c();
        if (m51820c() == 0) {
            m51819b();
        }
        if (str == null) {
            str = "";
        }
        long j = this.f61940e.mo43196f().getLong(this.f61937b, 0);
        if (j <= 0) {
            SharedPreferences.Editor edit = this.f61940e.mo43196f().edit();
            edit.putString(this.f61938c, str);
            edit.putLong(this.f61937b, 1);
            edit.apply();
            return;
        }
        long j2 = j + 1;
        if ((this.f61940e.mo43014o().mo43549g().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
            z = true;
        } else {
            z = false;
        }
        SharedPreferences.Editor edit2 = this.f61940e.mo43196f().edit();
        if (z) {
            edit2.putString(this.f61938c, str);
        }
        edit2.putLong(this.f61937b, j2);
        edit2.apply();
    }

    private C26364ep(C26361em emVar, String str, long j) {
        boolean z;
        this.f61940e = emVar;
        C25565r.m49316a(str);
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49324b(z);
        this.f61936a = String.valueOf(str).concat(":start");
        this.f61937b = String.valueOf(str).concat(":count");
        this.f61938c = String.valueOf(str).concat(":value");
        this.f61939d = j;
    }

    /* synthetic */ C26364ep(C26361em emVar, String str, long j, byte b) {
        this(emVar, str, j);
    }
}
