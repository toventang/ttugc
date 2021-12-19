package com.google.firebase;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.C25611m;

/* renamed from: com.google.firebase.e */
public final class C27740e {

    /* renamed from: a */
    public final String f65178a;

    /* renamed from: b */
    public final String f65179b;

    /* renamed from: c */
    public final String f65180c;

    /* renamed from: d */
    public final String f65181d;

    /* renamed from: e */
    public final String f65182e;

    /* renamed from: f */
    public final String f65183f;

    /* renamed from: g */
    public final String f65184g;

    static {
        Covode.recordClassIndex(33324);
    }

    public final int hashCode() {
        return C25560p.m49306a(this.f65179b, this.f65178a, this.f65180c, this.f65181d, this.f65182e, this.f65183f, this.f65184g);
    }

    public final String toString() {
        return C25560p.m49307a(this).mo41827a("applicationId", this.f65179b).mo41827a("apiKey", this.f65178a).mo41827a("databaseUrl", this.f65180c).mo41827a("gcmSenderId", this.f65182e).mo41827a("storageBucket", this.f65183f).mo41827a("projectId", this.f65184g).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C27740e)) {
            return false;
        }
        C27740e eVar = (C27740e) obj;
        if (!C25560p.m49308a(this.f65179b, eVar.f65179b) || !C25560p.m49308a(this.f65178a, eVar.f65178a) || !C25560p.m49308a(this.f65180c, eVar.f65180c) || !C25560p.m49308a(this.f65181d, eVar.f65181d) || !C25560p.m49308a(this.f65182e, eVar.f65182e) || !C25560p.m49308a(this.f65183f, eVar.f65183f) || !C25560p.m49308a(this.f65184g, eVar.f65184g)) {
            return false;
        }
        return true;
    }

    C27740e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C25565r.m49321a(!C25611m.m49428a(str), "ApplicationId must be set.");
        this.f65179b = str;
        this.f65178a = str2;
        this.f65180c = str3;
        this.f65181d = str4;
        this.f65182e = str5;
        this.f65183f = str6;
        this.f65184g = str7;
    }
}
