package com.google.gson;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.i */
public final class C27919i extends AbstractC28019l implements Iterable<AbstractC28019l> {

    /* renamed from: a */
    private final List<AbstractC28019l> f65577a;

    static {
        Covode.recordClassIndex(33513);
    }

    /* renamed from: a */
    public final int mo46684a() {
        return this.f65577a.size();
    }

    public final int hashCode() {
        return this.f65577a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC28019l> iterator() {
        return this.f65577a.iterator();
    }

    public C27919i() {
        this.f65577a = new ArrayList();
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: b */
    public final Number mo46688b() {
        if (this.f65577a.size() == 1) {
            return this.f65577a.get(0).mo46688b();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: c */
    public final String mo46689c() {
        if (this.f65577a.size() == 1) {
            return this.f65577a.get(0).mo46689c();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: d */
    public final double mo46690d() {
        if (this.f65577a.size() == 1) {
            return this.f65577a.get(0).mo46690d();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: e */
    public final float mo46691e() {
        if (this.f65577a.size() == 1) {
            return this.f65577a.get(0).mo46691e();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: f */
    public final long mo46693f() {
        if (this.f65577a.size() == 1) {
            return this.f65577a.get(0).mo46693f();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: g */
    public final int mo46694g() {
        if (this.f65577a.size() == 1) {
            return this.f65577a.get(0).mo46694g();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: h */
    public final boolean mo46695h() {
        if (this.f65577a.size() == 1) {
            return this.f65577a.get(0).mo46695h();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: i */
    public final /* synthetic */ AbstractC28019l mo46697i() {
        if (this.f65577a.isEmpty()) {
            return new C27919i();
        }
        C27919i iVar = new C27919i(this.f65577a.size());
        for (AbstractC28019l lVar : this.f65577a) {
            iVar.mo46686a(lVar.mo46697i());
        }
        return iVar;
    }

    /* renamed from: a */
    public final AbstractC28019l mo46685a(int i) {
        return this.f65577a.get(i);
    }

    private C27919i(int i) {
        this.f65577a = new ArrayList(i);
    }

    /* renamed from: a */
    public final void mo46686a(AbstractC28019l lVar) {
        if (lVar == null) {
            lVar = C28021n.f65803a;
        }
        this.f65577a.add(lVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C27919i) || !((C27919i) obj).f65577a.equals(this.f65577a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo46687a(String str) {
        AbstractC28019l rVar;
        List<AbstractC28019l> list = this.f65577a;
        if (str == null) {
            rVar = C28021n.f65803a;
        } else {
            rVar = new C28025r(str);
        }
        list.add(rVar);
    }
}
