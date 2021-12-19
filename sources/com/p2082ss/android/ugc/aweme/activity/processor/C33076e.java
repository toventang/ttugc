package com.p2082ss.android.ugc.aweme.activity.processor;

import android.content.Intent;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.e */
public final class C33076e extends AbstractC17350d {
    static {
        Covode.recordClassIndex(39888);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27648a(int i, Intent intent) {
        m67775a((Object) null, new C33077a(i, intent));
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.e$a */
    static final class C33077a extends AbstractC89220m implements AbstractC89183m<C33074d, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f78636a;

        /* renamed from: b */
        final /* synthetic */ Intent f78637b;

        static {
            Covode.recordClassIndex(39889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33077a(int i, Intent intent) {
            super(2);
            this.f78636a = i;
            this.f78637b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C33074d dVar, C89391z zVar) {
            C33074d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.f78633a.mo58848a(this.f78636a, this.f78637b);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final boolean mo27655a(int i, KeyEvent keyEvent) {
        Boolean bool = (Boolean) m67775a((Object) false, (AbstractC89183m) new C33078b(i, keyEvent));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.e$b */
    static final class C33078b extends AbstractC89220m implements AbstractC89183m<C33074d, Boolean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f78638a;

        /* renamed from: b */
        final /* synthetic */ KeyEvent f78639b;

        static {
            Covode.recordClassIndex(39890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33078b(int i, KeyEvent keyEvent) {
            super(2);
            this.f78638a = i;
            this.f78639b = keyEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(C33074d dVar, Boolean bool) {
            boolean z;
            C33074d dVar2 = dVar;
            Boolean bool2 = bool;
            C89219l.m154721d(dVar2, "");
            AbstractC33100u uVar = dVar2.f78633a;
            boolean z2 = false;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            if (uVar.mo58849a()) {
                if (uVar.mo58850a(this.f78638a, this.f78639b) || z) {
                    z2 = true;
                }
                z = z2;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private final <T> T m67775a(T t, AbstractC89183m<? super C33074d, ? super T, ? extends T> mVar) {
        List<AbstractC17362a> b = mo27704b().mo27699b();
        ArrayList arrayList = new ArrayList();
        for (T t2 : b) {
            if (t2 instanceof C33074d) {
                arrayList.add(t2);
            }
        }
        for (T t3 : C89070n.m154584g((Iterable) arrayList)) {
            t = (T) mVar.invoke(t3, t);
        }
        return t;
    }
}
