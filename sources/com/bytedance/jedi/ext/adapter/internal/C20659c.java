package com.bytedance.jedi.ext.adapter.internal;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.c */
public final class C20659c extends Fragment {

    /* renamed from: c */
    public static final String f48856c = C20659c.class.getCanonicalName();

    /* renamed from: d */
    public static final C20660a f48857d = new C20660a((byte) 0);

    /* renamed from: a */
    public Fragment f48858a;

    /* renamed from: b */
    final Set<AbstractC89171a<C89391z>> f48859b = new LinkedHashSet();

    /* renamed from: e */
    private final Map<AbstractC1196i, C20662d> f48860e = new WeakHashMap();

    /* renamed from: f */
    private HashMap f48861f;

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.c$a */
    public static final class C20660a {
        static {
            Covode.recordClassIndex(24196);
        }

        private C20660a() {
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.internal.c$a$a */
        public static final class C20661a extends AbstractC0952i.AbstractC0954b {

            /* renamed from: a */
            final /* synthetic */ C20659c f48862a;

            static {
                Covode.recordClassIndex(24197);
            }

            C20661a(C20659c cVar) {
                this.f48862a = cVar;
            }

            @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
            public final void onFragmentViewDestroyed(AbstractC0952i iVar, Fragment fragment) {
                C89219l.m154719c(iVar, "");
                C89219l.m154719c(fragment, "");
                if (fragment == this.f48862a.f48858a) {
                    iVar.mo3554a(this);
                    fragment.getChildFragmentManager().mo3552a().mo3455a(this.f48862a).mo3478e();
                    C20659c cVar = this.f48862a;
                    Iterator<T> it = cVar.f48859b.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                    cVar.f48859b.clear();
                }
            }
        }

        public /* synthetic */ C20660a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C20659c m38911a(ActivityC0945e eVar, Fragment fragment) {
            AbstractC0952i iVar;
            AbstractC0952i fragmentManager;
            if (eVar == null || (iVar = eVar.getSupportFragmentManager()) == null) {
                if (fragment == null) {
                    C89219l.m154707a();
                }
                iVar = fragment.getChildFragmentManager();
                C89219l.m154709a((Object) iVar, "");
            }
            Fragment a = iVar.mo3551a(C20659c.f48856c);
            if (!(a instanceof C20659c)) {
                a = null;
            }
            C20659c cVar = (C20659c) a;
            if (cVar == null) {
                cVar = new C20659c();
                cVar.f48858a = fragment;
                if (!(fragment == null || (fragmentManager = fragment.getFragmentManager()) == null)) {
                    fragmentManager.mo3555a((AbstractC0952i.AbstractC0954b) new C20661a(cVar), false);
                }
                iVar.mo3552a().mo3456a(cVar, C20659c.f48856c).mo3478e();
            }
            return cVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f48861f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(24195);
    }

    /* renamed from: a */
    public final C20662d mo33916a(AbstractC1196i iVar) {
        C89219l.m154719c(iVar, "");
        return this.f48860e.get(iVar);
    }

    /* renamed from: a */
    public final void mo33917a(AbstractC1196i iVar, C20662d dVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(dVar, "");
        this.f48860e.put(iVar, dVar);
    }
}
