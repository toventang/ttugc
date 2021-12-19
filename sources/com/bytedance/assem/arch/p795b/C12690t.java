package com.bytedance.assem.arch.p795b;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.b.t */
public final class C12690t {
    static {
        Covode.recordClassIndex(14510);
    }

    /* renamed from: com.bytedance.assem.arch.b.t$a */
    static final class RunnableC12691a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f30891a;

        static {
            Covode.recordClassIndex(14511);
        }

        RunnableC12691a(AbstractC89171a aVar) {
            this.f30891a = aVar;
        }

        public final void run() {
            this.f30891a.invoke();
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.t$b */
    static final class C12692b extends AbstractC89220m implements AbstractC89171a<Assembler> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f30892a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f30893b;

        static {
            Covode.recordClassIndex(14512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12692b(AbstractC12693u uVar, AbstractC89277c cVar) {
            super(0);
            this.f30892a = uVar;
            this.f30893b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Assembler invoke() {
            ActivityC0945e b;
            AbstractC12693u uVar = this.f30892a;
            if (uVar.az_() instanceof ActivityC0945e) {
                Context az_ = this.f30892a.az_();
                if (az_ != null) {
                    b = (ActivityC0945e) az_;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                b = C12777b.m23004b(uVar);
                if (b == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            AbstractC1174ac a = C1181ae.m3881a(b, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
            C89219l.m154709a((Object) a, "");
            Assembler assembler = (Assembler) a;
            assembler.mo20580a(this.f30892a, this.f30893b);
            return assembler;
        }
    }

    /* renamed from: a */
    public static final <REUSED extends AbstractC12693u<? extends AbstractC22876d>> void m22848a(REUSED reused, AbstractC89277c<? extends AbstractC12693u<?>> cVar) {
        C89219l.m154719c(reused, "");
        C89219l.m154719c(cVar, "");
        C12692b bVar = new C12692b(reused, cVar);
        if (C12787j.f31109c) {
            C12787j.m23009a().execute(new RunnableC12691a(bVar));
        } else {
            bVar.invoke();
        }
    }

    /* renamed from: a */
    public static final void m22849a(AbstractC22876d dVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        if (!(dVar instanceof AbstractC12693u)) {
            dVar = null;
        }
        AbstractC12693u uVar = (AbstractC12693u) dVar;
        if (uVar == null) {
            aVar.invoke();
        } else if (uVar.f30897j) {
            aVar.invoke();
        } else {
            AbstractC12789k kVar = C12787j.f31108b;
            if (kVar != null) {
                kVar.mo20639a("reused assem: " + uVar + " is not viewcreated!", new RuntimeException("reused assem: " + uVar + " is not viewcreated!"));
            }
        }
    }

    /* renamed from: a */
    public static final <ASSEM extends AbstractC12693u<? extends AbstractC22876d>> void m22847a(ASSEM assem, AbstractC89172b<? super Assembler, C89391z> bVar) {
        ActivityC0945e b;
        C89219l.m154719c(assem, "");
        C89219l.m154719c(bVar, "");
        if (assem.az_() instanceof ActivityC0945e) {
            Context az_ = assem.az_();
            if (az_ != null) {
                b = (ActivityC0945e) az_;
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        } else {
            b = C12777b.m23004b(assem);
            if (b == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        AbstractC1174ac a = C1181ae.m3881a(b, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
        C89219l.m154709a((Object) a, "");
        Assembler assembler = (Assembler) a;
        C12752d b2 = assembler.mo20583b(assem);
        if (b2 == null) {
            b2 = new C12752d(assembler.mo20583b(assem.bE_()));
            assembler.mo20578a(assem, b2);
        }
        C12753e c = assembler.mo20584c(assem);
        if (c == null) {
            c = new C12753e(assembler.mo20584c(assem.bE_()));
            assembler.mo20579a(assem, c);
        }
        AssemSupervisor a2 = assembler.mo20573a(assem);
        if (a2 == null) {
            a2 = AssemSupervisor.C12742a.m22921a(assem, b, b2, c);
            a2.mo20568a(assem.mo20528t());
            assembler.mo20577a(assem, a2);
        }
        bVar.invoke(assembler);
        a2.mo20570b();
    }
}
