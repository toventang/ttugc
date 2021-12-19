package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.m */
public final class C26527m {

    /* renamed from: a */
    final String f62454a;

    /* renamed from: b */
    final String f62455b;

    /* renamed from: c */
    final long f62456c;

    /* renamed from: d */
    final long f62457d;

    /* renamed from: e */
    final zzan f62458e;

    /* renamed from: f */
    private final String f62459f;

    static {
        Covode.recordClassIndex(31949);
    }

    public final String toString() {
        String str = this.f62454a;
        String str2 = this.f62455b;
        String valueOf = String.valueOf(this.f62458e);
        return new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("Event{appId='").append(str).append("', name='").append(str2).append("', params=").append(valueOf).append('}').toString();
    }

    /* renamed from: a */
    private static Object m52535a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26527m mo43655a(C26381ff ffVar, long j) {
        return new C26527m(ffVar, this.f62459f, this.f62454a, this.f62455b, this.f62456c, j, this.f62458e);
    }

    private C26527m(C26381ff ffVar, String str, String str2, String str3, long j, long j2, zzan zzan) {
        C25565r.m49316a(str2);
        C25565r.m49316a(str3);
        C25565r.m49314a(zzan);
        this.f62454a = str2;
        this.f62455b = str3;
        this.f62459f = TextUtils.isEmpty(str) ? null : str;
        this.f62456c = j;
        this.f62457d = j2;
        if (j2 != 0 && j2 > j) {
            ffVar.mo43016q().f61830f.mo43171a("Event created with reverse previous/current timestamps. appId, name", C26350eb.m51691a(str2), C26350eb.m51691a(str3));
        }
        this.f62458e = zzan;
    }

    C26527m(C26381ff ffVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzan zzan;
        C25565r.m49316a(str2);
        C25565r.m49316a(str3);
        this.f62454a = str2;
        this.f62455b = str3;
        this.f62459f = TextUtils.isEmpty(str) ? null : str;
        this.f62456c = j;
        this.f62457d = j2;
        if (j2 != 0 && j2 > j) {
            ffVar.mo43016q().f61830f.mo43170a("Event created with reverse previous/current timestamps. appId", C26350eb.m51691a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzan = new zzan(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    ffVar.mo43016q().f61827c.mo43169a("Param name can't be null");
                    it.remove();
                } else {
                    Object a = ffVar.mo43256e().mo43520a(next, m52535a(bundle2, next));
                    if (a == null) {
                        ffVar.mo43016q().f61830f.mo43170a("Param value can't be null", ffVar.mo43257f().mo43063b(next));
                        it.remove();
                    } else {
                        ffVar.mo43256e().mo43525a(bundle2, next, a);
                    }
                }
            }
            zzan = new zzan(bundle2);
        }
        this.f62458e = zzan;
    }
}
