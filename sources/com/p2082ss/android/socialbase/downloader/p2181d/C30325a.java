package com.p2082ss.android.socialbase.downloader.p2181d;

import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.p2181d.C30326b;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.ss.android.socialbase.downloader.d.a */
public final class C30325a implements AbstractC30330e {

    /* renamed from: a */
    public AbstractC30330e f72346a;

    static {
        Covode.recordClassIndex(36837);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final long mo53837a() {
        return this.f72346a.mo53837a();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: b */
    public final boolean mo53840b() {
        return this.f72346a.mo53840b();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: c */
    public final boolean mo53841c() {
        return this.f72346a.mo53841c();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: d */
    public final boolean mo53842d() {
        return this.f72346a.mo53842d();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: e */
    public final String mo53843e() {
        return this.f72346a.mo53843e();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: f */
    public final boolean mo53844f() {
        return this.f72346a.mo53844f();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: g */
    public final File mo53845g() {
        return this.f72346a.mo53845g();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: h */
    public final long mo53846h() {
        return this.f72346a.mo53846h();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: i */
    public final FileInputStream mo53847i() {
        return this.f72346a.mo53847i();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: j */
    public final FileOutputStream mo53848j() {
        return this.f72346a.mo53848j();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: k */
    public final File mo53849k() {
        return this.f72346a.mo53849k();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: l */
    public final String mo53850l() {
        return this.f72346a.mo53850l();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: m */
    public final int mo53851m() {
        return this.f72346a.mo53851m();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: o */
    public final String mo53853o() {
        return this.f72346a.mo53853o();
    }

    /* renamed from: n */
    public final boolean mo53852n() {
        if (this.f72346a.mo53851m() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final boolean mo53838a(long j) {
        return this.f72346a.mo53838a(j);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final boolean mo53839a(C30325a aVar) {
        return this.f72346a.mo53839a(aVar);
    }

    public C30325a(String str, String str2) {
        this(str, str2, true, true);
    }

    public C30325a(String str, String str2, boolean z, boolean z2) {
        MethodCollector.m26663i(9310);
        int a = C30326b.m61483a(str);
        if (a == 1) {
            this.f72346a = new C30329d(str, str2, z);
            MethodCollector.m26664o(9310);
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            C30326b.C30327a aVar = C30326b.f72347a.get(a);
            if (aVar != null) {
                try {
                    Cursor query = C30399c.m61674B().getContentResolver().query(aVar.f72348a, null, aVar.f72350c + " = ?", new String[]{parse.getLastPathSegment()}, null);
                    if (query == null || !query.moveToFirst()) {
                        Throwable th = new Throwable("Fail to check Uri with cursor.");
                        MethodCollector.m26664o(9310);
                        throw th;
                    }
                    C30535g.m62556a(query);
                    this.f72346a = new C30331f(parse, a, z2);
                    MethodCollector.m26664o(9310);
                } catch (Throwable th2) {
                    C30535g.m62556a(null);
                    MethodCollector.m26664o(9310);
                    throw th2;
                }
            } else {
                Throwable th3 = new Throwable("Fail to check Uri, type error :".concat(String.valueOf(a)));
                MethodCollector.m26664o(9310);
                throw th3;
            }
        } catch (Throwable th4) {
            this.f72346a = new C30328c(th4.toString());
            MethodCollector.m26664o(9310);
        }
    }
}
