package com.p2082ss.android.ugc.aweme.fragment.p3005a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.ies.foundation.base.C17369d;
import com.bytedance.ies.foundation.fragment.AbstractC17391d;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.fragment.a.b */
public final class C51418b extends AbstractC17391d {

    /* renamed from: d */
    private final C33103x f118489d = new C33103x(0, false, false, 7);

    static {
        Covode.recordClassIndex(60641);
    }

    /* renamed from: c */
    public final C33103x mo86849c() {
        T t;
        T t2;
        Iterator<T> it = mo27704b().mo27699b().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2 instanceof C33103x) {
                break;
            }
        }
        if (t2 instanceof C33103x) {
            t = t2;
        }
        T t3 = t;
        if (t3 == null) {
            return this.f118489d;
        }
        return t3;
    }

    /* renamed from: a */
    public final C23073a mo86848a(Fragment fragment) {
        return C23073a.C23074a.m43506a(fragment).mo37495a(mo86849c().f78674h);
    }

    /* renamed from: com.ss.android.ugc.aweme.fragment.a.b$a */
    static final class C51419a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51418b f118490a;

        /* renamed from: b */
        final /* synthetic */ Fragment f118491b;

        static {
            Covode.recordClassIndex(60642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51419a(C51418b bVar, Fragment fragment) {
            super(1);
            this.f118490a = bVar;
            this.f118491b = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (this.f118490a.mo86849c().f78673g != -1) {
                this.f118490a.mo86848a(this.f118491b).mo37494a(intValue).f54627a.mo33415d();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fragment.a.b$b */
    static final class C51420b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51418b f118492a;

        /* renamed from: b */
        final /* synthetic */ Fragment f118493b;

        static {
            Covode.recordClassIndex(60643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51420b(C51418b bVar, Fragment fragment) {
            super(1);
            this.f118492a = bVar;
            this.f118493b = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (this.f118492a.mo86849c().f78671e != -1) {
                this.f118492a.mo86848a(this.f118493b).mo37501c(intValue).f54627a.mo33415d();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.base.AbstractC17368c, com.bytedance.ies.foundation.fragment.AbstractC17390c
    /* renamed from: a */
    public final void mo27703a(AbstractC0952i iVar, C17372a aVar, View view, Bundle bundle) {
        C17372a aVar2;
        C17372a aVar3;
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        super.mo27703a(iVar, aVar, view, bundle);
        if (!mo86849c().f78675i && !(aVar.getParentFragment() instanceof C23226a)) {
            C23073a a = mo86848a(aVar);
            if (mo86849c().f78673g != -1) {
                a.mo37494a(mo86849c().f78673g);
            }
            if (mo86849c().f78669c) {
                a.mo37497b();
            }
            if (mo86849c().f78668b) {
                a.mo37493a();
            }
            if (mo86849c().f78667a) {
                a.mo37499b(true);
            } else {
                a.mo37495a(mo86849c().f78674h);
            }
            if (mo86849c().f78671e != -1) {
                a.mo37501c(mo86849c().f78671e);
            }
            a.f54627a.mo33415d();
            AbstractC89284h hVar = C51421c.f118494a;
            C51419a aVar4 = new C51419a(this, aVar);
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            WeakReference<C17372a> weakReference = this.f41721a;
            if (!(weakReference == null || (aVar3 = weakReference.get()) == null)) {
                C89219l.m154716b(aVar3, "");
                C17369d subscribeStore = aVar3.bo_().getSubscribeStore();
                if (!subscribeStore.f41688a.containsKey(C33103x.class)) {
                    subscribeStore.f41688a.put(C33103x.class, new C1213t<>());
                }
                Map<Class<?>, C1213t<? extends AbstractC17362a>> map = subscribeStore.f41688a;
                C1213t<? extends AbstractC17362a> tVar = map.get(C33103x.class);
                if (map.containsKey(C33103x.class) && tVar == null) {
                    tVar = new C1213t<>();
                    map.put(C33103x.class, tVar);
                }
                if ((tVar instanceof LiveData) && tVar != null) {
                    C1169aa.m3869a(tVar, new AbstractC17391d.C17393b(hVar, aVar3, eVar, aVar4)).observe(aVar3, new AbstractC17391d.C17394c(hVar, aVar3, eVar, aVar4));
                }
            }
            AbstractC89284h hVar2 = C51422d.f118495a;
            C51420b bVar = new C51420b(this, aVar);
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = null;
            WeakReference<C17372a> weakReference2 = this.f41721a;
            if (weakReference2 != null && (aVar2 = weakReference2.get()) != null) {
                C89219l.m154716b(aVar2, "");
                C17369d subscribeStore2 = aVar2.bo_().getSubscribeStore();
                if (!subscribeStore2.f41688a.containsKey(C33103x.class)) {
                    subscribeStore2.f41688a.put(C33103x.class, new C1213t<>());
                }
                Map<Class<?>, C1213t<? extends AbstractC17362a>> map2 = subscribeStore2.f41688a;
                C1213t<? extends AbstractC17362a> tVar2 = map2.get(C33103x.class);
                if (map2.containsKey(C33103x.class) && tVar2 == null) {
                    tVar2 = new C1213t<>();
                    map2.put(C33103x.class, tVar2);
                }
                if ((tVar2 instanceof LiveData) && tVar2 != null) {
                    C1169aa.m3869a(tVar2, new AbstractC17391d.C17395d(hVar2, aVar2, eVar2, bVar)).observe(aVar2, new AbstractC17391d.C17396e(hVar2, aVar2, eVar2, bVar));
                }
            }
        }
    }
}
