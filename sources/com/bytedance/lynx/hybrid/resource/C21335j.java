package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import java.io.InputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.j */
public final class C21335j extends C21294e {

    /* renamed from: a */
    public String f50659a;

    /* renamed from: b */
    public String f50660b;

    /* renamed from: c */
    public boolean f50661c;

    /* renamed from: d */
    public String f50662d;

    /* renamed from: e */
    public String f50663e;

    /* renamed from: f */
    public String f50664f;

    /* renamed from: g */
    public String f50665g;

    /* renamed from: h */
    public boolean f50666h;

    static {
        Covode.recordClassIndex(24953);
    }

    @Override // com.bytedance.lynx.hybrid.resource.p1528d.C21294e
    /* renamed from: a */
    public final InputStream mo34899a() {
        InputStream a = super.mo34899a();
        if (a == null) {
            return null;
        }
        if (a instanceof C21336k) {
            return a;
        }
        return new C21336k(this, a);
    }

    /* renamed from: a */
    public final void mo34936a(String str) {
        C89219l.m154719c(str, "");
        this.f50662d = str;
    }

    /* renamed from: b */
    public final void mo34937b(String str) {
        C89219l.m154719c(str, "");
        this.f50663e = str;
    }

    /* renamed from: c */
    public final void mo34938c(String str) {
        C89219l.m154719c(str, "");
        this.f50664f = str;
    }

    /* renamed from: d */
    public final void mo34939d(String str) {
        C89219l.m154719c(str, "");
        this.f50665g = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C21335j(Uri uri, boolean z, String str, long j) {
        super(uri, null, null, null, false, 0, z, null, null, str, j);
        C89219l.m154719c(uri, "");
        C89219l.m154719c(str, "");
        this.f50662d = "";
        this.f50663e = "";
        this.f50664f = "";
        this.f50665g = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21335j(Uri uri, boolean z, String str, long j, int i) {
        this(uri, (i & 64) != 0 ? true : z, (i & 512) != 0 ? "" : str, (i & 1024) != 0 ? 0 : j);
    }
}
