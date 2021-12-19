package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.C27998g;
import java.util.Map;

/* renamed from: com.google.gson.o */
public final class C28022o extends AbstractC28019l {

    /* renamed from: a */
    public final C27998g<String, AbstractC28019l> f65804a = new C27998g<>();

    static {
        Covode.recordClassIndex(33635);
    }

    public final int hashCode() {
        return this.f65804a.hashCode();
    }

    /* renamed from: a */
    public final C28022o mo46697i() {
        C28022o oVar = new C28022o();
        for (Map.Entry<String, AbstractC28019l> entry : this.f65804a.entrySet()) {
            oVar.mo46797a(entry.getKey(), entry.getValue().mo46697i());
        }
        return oVar;
    }

    /* renamed from: b */
    public final boolean mo46802b(String str) {
        return this.f65804a.containsKey(str);
    }

    /* renamed from: a */
    private static AbstractC28019l m56123a(Object obj) {
        if (obj == null) {
            return C28021n.f65803a;
        }
        return new C28025r(obj);
    }

    /* renamed from: c */
    public final AbstractC28019l mo46803c(String str) {
        return this.f65804a.get(str);
    }

    /* renamed from: d */
    public final C28025r mo46804d(String str) {
        return (C28025r) this.f65804a.get(str);
    }

    /* renamed from: e */
    public final C27919i mo46805e(String str) {
        return (C27919i) this.f65804a.get(str);
    }

    /* renamed from: f */
    public final C28022o mo46807f(String str) {
        return (C28022o) this.f65804a.get(str);
    }

    /* renamed from: a */
    public final AbstractC28019l mo46795a(String str) {
        return this.f65804a.remove(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C28022o) || !((C28022o) obj).f65804a.equals(this.f65804a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo46798a(String str, Boolean bool) {
        mo46797a(str, m56123a(bool));
    }

    /* renamed from: a */
    public final void mo46797a(String str, AbstractC28019l lVar) {
        if (lVar == null) {
            lVar = C28021n.f65803a;
        }
        this.f65804a.put(str, lVar);
    }

    /* renamed from: a */
    public final void mo46799a(String str, Character ch) {
        mo46797a(str, m56123a(ch));
    }

    /* renamed from: a */
    public final void mo46800a(String str, Number number) {
        mo46797a(str, m56123a(number));
    }

    /* renamed from: a */
    public final void mo46801a(String str, String str2) {
        mo46797a(str, m56123a((Object) str2));
    }
}
