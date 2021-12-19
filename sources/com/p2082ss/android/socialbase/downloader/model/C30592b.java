package com.p2082ss.android.socialbase.downloader.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g;
import com.p2082ss.android.socialbase.downloader.p2189k.C30528a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;

/* renamed from: com.ss.android.socialbase.downloader.model.b */
public final class C30592b {

    /* renamed from: a */
    public final String f72994a;

    /* renamed from: b */
    public final AbstractC30460g f72995b;

    /* renamed from: c */
    public final int f72996c;

    /* renamed from: d */
    private long f72997d;

    /* renamed from: e */
    private long f72998e;

    static {
        Covode.recordClassIndex(37124);
    }

    /* renamed from: a */
    public final boolean mo54794a() {
        int i = this.f72996c;
        if (i == 200 || i == 201 || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String mo54796c() {
        return this.f72995b.mo54234a("Etag");
    }

    /* renamed from: d */
    public final String mo54797d() {
        return this.f72995b.mo54234a("Content-Type");
    }

    /* renamed from: e */
    public final String mo54798e() {
        return C30535g.m62575b(this.f72995b, "Content-Range");
    }

    /* renamed from: g */
    public final String mo54800g() {
        return C30535g.m62575b(this.f72995b, "Cache-Control");
    }

    /* renamed from: f */
    public final String mo54799f() {
        String b = C30535g.m62575b(this.f72995b, "last-modified");
        if (TextUtils.isEmpty(b)) {
            return C30535g.m62575b(this.f72995b, "Last-Modified");
        }
        return b;
    }

    /* renamed from: h */
    public final long mo54801h() {
        if (this.f72997d <= 0) {
            this.f72997d = C30535g.m62535a(this.f72995b);
        }
        return this.f72997d;
    }

    /* renamed from: b */
    public final boolean mo54795b() {
        int i = this.f72996c;
        String a = this.f72995b.mo54234a("Accept-Ranges");
        if (C30528a.m62524a(16777216)) {
            if (i == 206 || i == 1) {
                return true;
            }
            return false;
        } else if (i >= 400 || (i != 206 && i != 1 && !"bytes".equals(a))) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public final long mo54803j() {
        if (this.f72998e <= 0) {
            if (!mo54802i()) {
                String e = mo54798e();
                if (!TextUtils.isEmpty(e)) {
                    this.f72998e = C30535g.m62536a(e);
                }
            } else {
                this.f72998e = -1;
            }
        }
        return this.f72998e;
    }

    /* renamed from: i */
    public final boolean mo54802i() {
        if (!C30528a.m62524a(8)) {
            return C30535g.m62560a(mo54801h());
        }
        AbstractC30460g gVar = this.f72995b;
        if (gVar != null) {
            if (C30528a.m62524a(8)) {
                if ("chunked".equals(gVar.mo54234a("Transfer-Encoding")) || C30535g.m62535a(gVar) == -1) {
                    return true;
                }
                return false;
            } else if (C30535g.m62535a(gVar) == -1) {
                return true;
            }
        }
        return false;
    }

    public C30592b(String str, AbstractC30460g gVar) {
        this.f72994a = str;
        this.f72996c = gVar.mo54233a();
        this.f72995b = gVar;
    }
}
