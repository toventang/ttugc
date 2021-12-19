package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;

/* renamed from: com.bytedance.jedi.arch.s */
public final class C20530s {

    /* renamed from: a */
    private final C1175ad f48607a;

    static {
        Covode.recordClassIndex(24055);
    }

    /* renamed from: a */
    public final <T extends JediViewModel> T mo33800a(Class<T> cls) {
        AbstractC1174ac a;
        if (cls.getCanonicalName() != null) {
            String name = cls.getName();
            C1175ad adVar = this.f48607a;
            if (cls.equals(ScopeViewModel.class)) {
                a = adVar.mo3984a(name, cls);
            } else {
                a = adVar.mo3984a(name, cls);
                C1171ab.m3870a(a, adVar);
            }
            return (T) ((JediViewModel) a);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C20530s(C1182af afVar, C1175ad.AbstractC1177b bVar) {
        this.f48607a = new C1175ad(afVar, bVar);
    }
}
