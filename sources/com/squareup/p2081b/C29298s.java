package com.squareup.p2081b;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.AbstractC29251y;
import com.squareup.p2075a.C29217d;
import com.squareup.p2075a.C29243t;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import com.squareup.p2081b.AbstractC29285j;
import java.io.File;

/* renamed from: com.squareup.b.s */
public final class C29298s implements AbstractC29285j {

    /* renamed from: a */
    public final C29243t f69513a;

    static {
        Covode.recordClassIndex(35647);
    }

    public C29298s(Context context) {
        this(C29262ae.m58616b(context));
    }

    private C29298s(C29243t tVar) {
        this.f69513a = tVar;
    }

    private C29298s(File file) {
        this(file, C29262ae.m58601a(file));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C29298s(java.io.File r3, long r4) {
        /*
            r2 = this;
            com.squareup.a.t r1 = new com.squareup.a.t
            r1.<init>()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.mo51011a(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.mo51012b(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.mo51013c(r0)
            r2.<init>(r1)
            com.squareup.a.t r1 = r2.f69513a     // Catch:{ IOException -> 0x0021 }
            com.squareup.a.c r0 = new com.squareup.a.c     // Catch:{ IOException -> 0x0021 }
            r0.<init>(r3, r4)     // Catch:{ IOException -> 0x0021 }
            r1.mo51009a(r0)     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2081b.C29298s.<init>(java.io.File, long):void");
    }

    @Override // com.squareup.p2081b.AbstractC29285j
    /* renamed from: a */
    public final AbstractC29285j.C29286a mo51057a(Uri uri, int i) {
        C29217d dVar;
        boolean z;
        if (i == 0) {
            dVar = null;
        } else if (EnumC29295q.isOfflineOnly(i)) {
            dVar = C29217d.f69214b;
        } else {
            C29217d.C29218a aVar = new C29217d.C29218a();
            if (!EnumC29295q.shouldReadFromDiskCache(i)) {
                aVar.mo50951a();
            }
            if (!EnumC29295q.shouldWriteToDiskCache(i)) {
                aVar.mo50952b();
            }
            dVar = aVar.mo50953c();
        }
        C29246v.C29247a a = new C29246v.C29247a().mo51023a(uri.toString());
        if (dVar != null) {
            a.mo51021a(dVar);
        }
        C29249x a2 = this.f69513a.mo51008a(a.mo51025a()).mo50954a();
        int i2 = a2.f69352c;
        if (i2 < 300) {
            if (a2.f69358i != null) {
                z = true;
            } else {
                z = false;
            }
            AbstractC29251y yVar = a2.f69356g;
            return new AbstractC29285j.C29286a(yVar.mo51042c(), z, yVar.mo50878a());
        }
        a2.f69356g.close();
        throw new AbstractC29285j.C29287b(i2 + " " + a2.f69353d, i, i2);
    }
}
