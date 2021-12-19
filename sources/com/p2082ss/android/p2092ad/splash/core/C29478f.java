package com.p2082ss.android.p2092ad.splash.core;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ad.splash.core.f */
public final class C29478f {

    /* renamed from: a */
    public boolean f70135a = true;

    /* renamed from: b */
    private String f70136b;

    /* renamed from: c */
    private String f70137c;

    /* renamed from: d */
    private String f70138d;

    /* renamed from: e */
    private String f70139e;

    /* renamed from: f */
    private String f70140f;

    /* renamed from: g */
    private String f70141g;

    /* renamed from: h */
    private String f70142h;

    /* renamed from: i */
    private String f70143i;

    /* renamed from: j */
    private String f70144j;

    /* renamed from: k */
    private String f70145k;

    /* renamed from: l */
    private String f70146l;

    /* renamed from: m */
    private String f70147m;

    /* renamed from: n */
    private long f70148n;

    /* renamed from: o */
    private String f70149o;

    /* renamed from: p */
    private String f70150p;

    /* renamed from: q */
    private String f70151q;

    /* renamed from: r */
    private String f70152r;

    /* renamed from: s */
    private String f70153s;

    static {
        Covode.recordClassIndex(35872);
    }

    /* renamed from: f */
    private String m59066f() {
        if (m59065a(this.f70138d)) {
            this.f70138d = C29495h.f70211ah.mo51345k();
        }
        return this.f70138d;
    }

    /* renamed from: g */
    private String m59067g() {
        if (m59065a(this.f70139e)) {
            this.f70139e = C29495h.f70211ah.mo28676c();
        }
        return this.f70139e;
    }

    /* renamed from: h */
    private String m59068h() {
        if (m59065a(this.f70140f)) {
            this.f70140f = C29495h.f70211ah.mo28677d();
        }
        return this.f70140f;
    }

    /* renamed from: i */
    private String m59069i() {
        if (m59065a(this.f70142h)) {
            this.f70142h = C29495h.f70211ah.mo28679f();
        }
        return this.f70142h;
    }

    /* renamed from: j */
    private String m59070j() {
        if (m59065a(this.f70143i)) {
            this.f70143i = C29495h.f70211ah.mo51346l();
        }
        return this.f70143i;
    }

    /* renamed from: k */
    private String m59071k() {
        if (m59065a(this.f70144j)) {
            this.f70144j = C29495h.f70211ah.mo28680g();
        }
        return this.f70144j;
    }

    /* renamed from: l */
    private String m59072l() {
        if (m59065a(this.f70147m)) {
            this.f70147m = C29495h.f70211ah.mo28682i();
        }
        return this.f70147m;
    }

    /* renamed from: m */
    private String m59073m() {
        if (m59065a(this.f70146l)) {
            this.f70146l = C29495h.f70211ah.mo51347m();
        }
        return this.f70146l;
    }

    /* renamed from: n */
    private String m59074n() {
        if (m59065a(this.f70149o)) {
            this.f70149o = C29495h.f70211ah.mo28683j();
        }
        return this.f70149o;
    }

    /* renamed from: o */
    private String m59075o() {
        if (m59065a(this.f70150p)) {
            this.f70150p = C29495h.f70211ah.mo51348n();
        }
        return this.f70150p;
    }

    /* renamed from: p */
    private String m59076p() {
        if (m59065a(this.f70151q)) {
            this.f70151q = C29495h.f70211ah.mo51349o();
        }
        return this.f70151q;
    }

    /* renamed from: q */
    private String m59077q() {
        if (m59065a(this.f70152r)) {
            this.f70152r = C29495h.f70211ah.mo51350p();
        }
        return this.f70152r;
    }

    /* renamed from: r */
    private String m59078r() {
        if (m59065a(this.f70153s)) {
            this.f70153s = C29495h.f70211ah.mo51351q();
        }
        return this.f70153s;
    }

    /* renamed from: a */
    public final String mo51563a() {
        if (m59065a(this.f70136b)) {
            this.f70136b = C29495h.f70211ah.mo28674a();
        }
        return this.f70136b;
    }

    /* renamed from: b */
    public final String mo51564b() {
        if (m59065a(this.f70137c)) {
            this.f70137c = C29495h.f70211ah.mo28675b();
        }
        return this.f70137c;
    }

    /* renamed from: c */
    public final String mo51565c() {
        if (m59065a(this.f70141g)) {
            this.f70141g = C29495h.f70211ah.mo28678e();
        }
        return this.f70141g;
    }

    /* renamed from: d */
    public final String mo51566d() {
        if (m59065a(this.f70145k)) {
            this.f70145k = C29495h.f70211ah.mo28681h();
        }
        return this.f70145k;
    }

    /* renamed from: e */
    public final long mo51567e() {
        if (this.f70148n == 0 && C29495h.f70211ah != null) {
            this.f70148n = 0;
        }
        return this.f70148n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(mo51565c())) {
            sb.append("&channel=").append(Uri.encode(mo51565c()));
        }
        if (!TextUtils.isEmpty(mo51563a())) {
            sb.append("&aid=").append(Uri.encode(mo51563a()));
        }
        if (!TextUtils.isEmpty(m59078r())) {
            sb.append("&gaid=").append(Uri.encode(m59078r()));
        }
        if (!TextUtils.isEmpty(mo51564b())) {
            sb.append("&app_name=").append(Uri.encode(mo51564b()));
        }
        if (!TextUtils.isEmpty(m59068h())) {
            sb.append("&update_version_code=").append(Uri.encode(m59068h()));
        }
        if (!TextUtils.isEmpty(m59066f())) {
            sb.append("&version_code=").append(Uri.encode(m59066f()));
        }
        if (!TextUtils.isEmpty(m59067g())) {
            sb.append("&version_name=").append(Uri.encode(m59067g()));
        }
        if (!TextUtils.isEmpty(m59069i())) {
            sb.append("&manifest_version_code=").append(Uri.encode(m59069i()));
        }
        if (!TextUtils.isEmpty(m59070j())) {
            sb.append("&language=").append(Uri.encode(m59070j()));
        } else if (!C29495h.m59095a().f70661i) {
            sb.append("&language=zh");
        }
        if (!TextUtils.isEmpty(m59071k())) {
            sb.append("&iid=").append(Uri.encode(m59071k()));
        }
        if (!TextUtils.isEmpty(mo51566d())) {
            sb.append("&device_id=").append(Uri.encode(mo51566d()));
        }
        if (!TextUtils.isEmpty(m59072l())) {
            sb.append("&openudid=").append(Uri.encode(m59072l()));
        }
        if (!TextUtils.isEmpty(m59073m())) {
            sb.append("&uuid=").append(Uri.encode(m59073m()));
        }
        if (this.f70135a) {
            if (!TextUtils.isEmpty(m59074n())) {
                sb.append("&ab_version=").append(Uri.encode(m59074n()));
            }
            if (!TextUtils.isEmpty(m59075o())) {
                sb.append("&ab_client=").append(Uri.encode(m59075o()));
            }
            if (!TextUtils.isEmpty(m59076p())) {
                sb.append("&ab_group=").append(Uri.encode(m59076p()));
            }
            if (!TextUtils.isEmpty(m59077q())) {
                sb.append("&ab_feature=").append(Uri.encode(m59077q()));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m59065a(String str) {
        if (!TextUtils.isEmpty(str) || C29495h.f70211ah == null) {
            return false;
        }
        return true;
    }
}
