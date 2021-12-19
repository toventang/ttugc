package com.bytedance.ies.bullet.kit.p1148a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import java.io.InputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.f */
public final class C16342f extends C16610ap {

    /* renamed from: a */
    public String f39274a;

    /* renamed from: b */
    public String f39275b;

    /* renamed from: c */
    public boolean f39276c;

    /* renamed from: d */
    public String f39277d;

    /* renamed from: e */
    public String f39278e;

    /* renamed from: f */
    public String f39279f;

    /* renamed from: g */
    public String f39280g;

    /* renamed from: h */
    public boolean f39281h;

    static {
        Covode.recordClassIndex(18635);
    }

    @Override // com.bytedance.ies.bullet.service.base.C16610ap
    /* renamed from: a */
    public final InputStream mo25913a() {
        InputStream a = super.mo25913a();
        if (a == null) {
            return null;
        }
        if (a instanceof C16349i) {
            return a;
        }
        return new C16349i(this, a);
    }

    /* renamed from: a */
    public final void mo25914a(String str) {
        C89219l.m154719c(str, "");
        this.f39277d = str;
    }

    /* renamed from: b */
    public final void mo25915b(String str) {
        C89219l.m154719c(str, "");
        this.f39278e = str;
    }

    /* renamed from: c */
    public final void mo25916c(String str) {
        C89219l.m154719c(str, "");
        this.f39279f = str;
    }

    /* renamed from: d */
    public final void mo25917d(String str) {
        C89219l.m154719c(str, "");
        this.f39280g = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C16342f(Uri uri, boolean z, String str, long j) {
        super(uri, null, null, null, false, 0, z, null, null, str, j);
        C89219l.m154719c(uri, "");
        C89219l.m154719c(str, "");
        this.f39277d = "";
        this.f39278e = "";
        this.f39279f = "";
        this.f39280g = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16342f(Uri uri, boolean z, String str, long j, int i) {
        this(uri, (i & 64) != 0 ? true : z, (i & 512) != 0 ? "" : str, (i & 1024) != 0 ? 0 : j);
    }
}
