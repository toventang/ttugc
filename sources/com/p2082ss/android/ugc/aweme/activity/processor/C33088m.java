package com.p2082ss.android.ugc.aweme.activity.processor;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.ies.foundation.base.C17369d;
import com.bytedance.immersionbar.C20059f;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.m */
public final class C33088m extends AbstractC17350d {

    /* renamed from: d */
    private final C33103x f78651d = new C33103x(0, false, false, 7);

    static {
        Covode.recordClassIndex(39900);
    }

    /* renamed from: c */
    public final C33103x mo58861c() {
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
            return this.f78651d;
        }
        return t3;
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.m$b */
    static final class C33090b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33088m f78654a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f78655b;

        static {
            Covode.recordClassIndex(39902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33090b(C33088m mVar, ActivityC0945e eVar) {
            super(1);
            this.f78654a = mVar;
            this.f78655b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C23073a a = this.f78654a.mo58860a(this.f78655b);
            if (intValue != -1) {
                a.mo37503d(intValue);
            }
            a.f54627a.mo33415d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.m$c */
    static final class C33091c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33088m f78656a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f78657b;

        static {
            Covode.recordClassIndex(39903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33091c(C33088m mVar, ActivityC0945e eVar) {
            super(1);
            this.f78656a = mVar;
            this.f78657b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C23073a a = this.f78656a.mo58860a(this.f78657b);
            if (intValue != -1) {
                a.mo37505f(intValue);
            }
            a.f54627a.mo33415d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.m$d */
    static final class C33092d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33088m f78658a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f78659b;

        static {
            Covode.recordClassIndex(39904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33092d(C33088m mVar, ActivityC0945e eVar) {
            super(1);
            this.f78658a = mVar;
            this.f78659b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C23073a a = this.f78658a.mo58860a(this.f78659b);
            if (intValue != -1) {
                a.mo37501c(intValue);
            }
            a.f54627a.mo33415d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final C23073a mo58860a(ActivityC0945e eVar) {
        C23073a a = C23073a.C23074a.m43508a(eVar);
        if (!mo58861c().f78667a) {
            a.mo37495a(mo58861c().f78674h);
        }
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.m$a */
    static final class C33089a extends AbstractC89220m implements AbstractC89183m<Integer, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33088m f78652a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f78653b;

        static {
            Covode.recordClassIndex(39901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33089a(C33088m mVar, ActivityC0945e eVar) {
            super(2);
            this.f78652a = mVar;
            this.f78653b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Boolean bool) {
            int intValue = num.intValue();
            boolean booleanValue = bool.booleanValue();
            C23073a a = this.f78652a.mo58860a(this.f78653b);
            if (intValue != -1) {
                a.mo37494a(intValue);
            }
            if (booleanValue) {
                a.mo37499b(true);
            } else {
                a.mo37495a(this.f78652a.mo58861c().f78674h);
            }
            a.f54627a.mo33415d();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17350d, com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: b */
    public final void mo27658b(ActivityC17312a aVar, Bundle bundle) {
        ActivityC17312a aVar2;
        ActivityC17312a aVar3;
        ActivityC17312a aVar4;
        ActivityC17312a aVar5;
        boolean z;
        int i;
        C89219l.m154721d(aVar, "");
        super.mo27658b(aVar, bundle);
        C89219l.m154719c(aVar, "");
        if (C20059f.f47697a == 26) {
            TypedValue typedValue = new TypedValue();
            Window window = aVar.getWindow();
            if (!aVar.getTheme().resolveAttribute(R.attr.au8, typedValue, true) || typedValue.data == 0) {
                z = false;
            } else {
                z = true;
            }
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (z) {
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                i = systemUiVisibility | 16;
            } else {
                i = systemUiVisibility & -17;
            }
            if (i != systemUiVisibility) {
                window.getDecorView().setSystemUiVisibility(i);
            }
        }
        if (!mo58861c().f78675i) {
            C23073a a = mo58860a((ActivityC0945e) aVar);
            if (mo58861c().f78673g != -1) {
                a.mo37494a(mo58861c().f78673g);
            }
            if (mo58861c().f78669c) {
                a.mo37497b();
            }
            if (mo58861c().f78668b) {
                a.mo37493a();
            }
            if (mo58861c().f78667a) {
                a.mo37499b(true);
            } else {
                a.mo37495a(mo58861c().f78674h);
            }
            if (mo58861c().f78670d != -1) {
                a.mo37503d(mo58861c().f78670d);
            }
            if (mo58861c().f78671e != -1) {
                a.mo37501c(mo58861c().f78671e);
            }
            if (mo58861c().f78672f != -1) {
                a.mo37505f(mo58861c().f78672f);
            }
            a.f54627a.mo33415d();
            AbstractC89284h hVar = C33093n.f78660a;
            AbstractC89284h hVar2 = C33094o.f78661a;
            C33089a aVar6 = new C33089a(this, aVar);
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            WeakReference<ActivityC17312a> weakReference = this.f41643a;
            if (!(weakReference == null || (aVar5 = weakReference.get()) == null)) {
                C89219l.m154716b(aVar5, "");
                C17369d subscribeStore = aVar5.getViewModel().getSubscribeStore();
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
                    C1169aa.m3869a(tVar, new AbstractC17350d.C17352b(hVar, hVar2, aVar5, eVar, aVar6)).observe(aVar5, new AbstractC17350d.C17353c(hVar, hVar2, aVar5, eVar, aVar6));
                }
            }
            AbstractC89284h hVar3 = C33095p.f78662a;
            C33090b bVar = new C33090b(this, aVar);
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = null;
            WeakReference<ActivityC17312a> weakReference2 = this.f41643a;
            if (!(weakReference2 == null || (aVar4 = weakReference2.get()) == null)) {
                C89219l.m154716b(aVar4, "");
                C17369d subscribeStore2 = aVar4.getViewModel().getSubscribeStore();
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
                    C1169aa.m3869a(tVar2, new AbstractC17350d.C17354d(hVar3, aVar4, eVar2, bVar)).observe(aVar4, new AbstractC17350d.C17355e(hVar3, aVar4, eVar2, bVar));
                }
            }
            AbstractC89284h hVar4 = C33096q.f78663a;
            C33091c cVar = new C33091c(this, aVar);
            C89233z.C89238e eVar3 = new C89233z.C89238e();
            eVar3.element = null;
            WeakReference<ActivityC17312a> weakReference3 = this.f41643a;
            if (!(weakReference3 == null || (aVar3 = weakReference3.get()) == null)) {
                C89219l.m154716b(aVar3, "");
                C17369d subscribeStore3 = aVar3.getViewModel().getSubscribeStore();
                if (!subscribeStore3.f41688a.containsKey(C33103x.class)) {
                    subscribeStore3.f41688a.put(C33103x.class, new C1213t<>());
                }
                Map<Class<?>, C1213t<? extends AbstractC17362a>> map3 = subscribeStore3.f41688a;
                C1213t<? extends AbstractC17362a> tVar3 = map3.get(C33103x.class);
                if (map3.containsKey(C33103x.class) && tVar3 == null) {
                    tVar3 = new C1213t<>();
                    map3.put(C33103x.class, tVar3);
                }
                if ((tVar3 instanceof LiveData) && tVar3 != null) {
                    C1169aa.m3869a(tVar3, new AbstractC17350d.C17356f(hVar4, aVar3, eVar3, cVar)).observe(aVar3, new AbstractC17350d.C17357g(hVar4, aVar3, eVar3, cVar));
                }
            }
            AbstractC89284h hVar5 = C33097r.f78664a;
            C33092d dVar = new C33092d(this, aVar);
            C89233z.C89238e eVar4 = new C89233z.C89238e();
            eVar4.element = null;
            WeakReference<ActivityC17312a> weakReference4 = this.f41643a;
            if (weakReference4 != null && (aVar2 = weakReference4.get()) != null) {
                C89219l.m154716b(aVar2, "");
                C17369d subscribeStore4 = aVar2.getViewModel().getSubscribeStore();
                if (!subscribeStore4.f41688a.containsKey(C33103x.class)) {
                    subscribeStore4.f41688a.put(C33103x.class, new C1213t<>());
                }
                Map<Class<?>, C1213t<? extends AbstractC17362a>> map4 = subscribeStore4.f41688a;
                C1213t<? extends AbstractC17362a> tVar4 = map4.get(C33103x.class);
                if (map4.containsKey(C33103x.class) && tVar4 == null) {
                    tVar4 = new C1213t<>();
                    map4.put(C33103x.class, tVar4);
                }
                if ((tVar4 instanceof LiveData) && tVar4 != null) {
                    C1169aa.m3869a(tVar4, new AbstractC17350d.C17358h(hVar5, aVar2, eVar4, dVar)).observe(aVar2, new AbstractC17350d.C17359i(hVar5, aVar2, eVar4, dVar));
                }
            }
        }
    }
}
