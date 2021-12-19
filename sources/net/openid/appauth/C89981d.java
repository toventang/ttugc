package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: net.openid.appauth.d */
public final class C89981d {

    /* renamed from: a */
    public String f203881a;

    /* renamed from: b */
    public String f203882b;

    /* renamed from: c */
    public C89988g f203883c;

    /* renamed from: d */
    public C90013s f203884d;

    /* renamed from: e */
    public C89982e f203885e;

    /* renamed from: f */
    public final Object f203886f = new Object();

    /* renamed from: g */
    public List<Object> f203887g;

    /* renamed from: h */
    private C89993i f203888h;

    static {
        Covode.recordClassIndex(106152);
    }

    public C89981d() {
    }

    /* renamed from: a */
    public final Long mo144635a() {
        if (this.f203885e != null) {
            return null;
        }
        C90013s sVar = this.f203884d;
        if (sVar != null && sVar.f204050d != null) {
            return this.f203884d.f204051e;
        }
        C89988g gVar = this.f203883c;
        if (gVar == null || gVar.f203951f == null) {
            return null;
        }
        return this.f203883c.f203952g;
    }

    public C89981d(C89988g gVar, C89982e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4 = false;
        if (gVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (eVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C90009p.m156200a(z ^ z2, "exactly one of authResponse or authError should be non-null");
        this.f203887g = null;
        if (gVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C90009p.m156200a((eVar != null ? true : z4) ^ z3, "exactly one of authResponse or authException should be non-null");
        if (eVar == null) {
            this.f203883c = gVar;
            this.f203888h = null;
            this.f203884d = null;
            this.f203881a = null;
            this.f203885e = null;
            if (gVar.f203954i != null) {
                str = gVar.f203954i;
            } else {
                str = gVar.f203947b.f203925i;
            }
            this.f203882b = str;
        } else if (eVar.type == 1) {
            this.f203885e = eVar;
        }
    }
}
