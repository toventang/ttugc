package com.bytedance.ext_power_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.assem.arch.p795b.AbstractC12659j;
import com.bytedance.assem.arch.p795b.AbstractC12711w;
import com.bytedance.assem.arch.p795b.C12682r;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tiktok.proxy.AbstractC22874b;
import com.bytedance.tiktok.proxy.AbstractC22875c;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import java.util.List;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public abstract class AssemPowerCell<ASSEM extends AbstractC12711w<? extends AbstractC22876d>, T extends AbstractC17641a> extends PowerCell<T> implements AbstractC12656g {

    /* renamed from: a */
    public ASSEM f35088a;

    /* renamed from: b */
    public View f35089b;

    /* renamed from: j */
    private final AbstractC1202k f35090j;

    static {
        Covode.recordClassIndex(16596);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final void mo23350a(T t) {
        C89219l.m154719c(t, "");
    }

    /* renamed from: e */
    public abstract ASSEM mo23352e();

    /* renamed from: com.bytedance.ext_power_list.AssemPowerCell$a */
    public static final class C14513a implements AbstractC22874b<PowerCell<T>, T> {

        /* renamed from: a */
        private C12682r f35091a;

        /* renamed from: b */
        private ASSEM f35092b;

        static {
            Covode.recordClassIndex(16597);
        }

        C14513a() {
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: a */
        public final void mo23354a() {
            C12682r e = m26516e();
            if (e != null) {
                e.mo20500j();
            }
            this.f35092b = null;
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: b */
        public final void mo23358b() {
            C12682r e = m26516e();
            if (e != null) {
                C12682r.m22821a(AbstractC1196i.EnumC1199b.CREATED, e, false);
            }
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: c */
        public final void mo23359c() {
            C12682r e = m26516e();
            if (e != null) {
                C12682r.m22821a(AbstractC1196i.EnumC1199b.CREATED, e, false);
            }
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: d */
        public final void mo23360d() {
            C12682r e = m26516e();
            if (e != null) {
                C12682r.m22821a(AbstractC1196i.EnumC1199b.DESTROYED, e, false);
            }
        }

        /* renamed from: e */
        private final C12682r m26516e() {
            AbstractC12659j jVar;
            ASSEM assem = this.f35092b;
            C12682r rVar = null;
            if (assem != null) {
                jVar = assem.f30901n;
            } else {
                jVar = null;
            }
            if (jVar instanceof C12682r) {
                rVar = jVar;
            }
            return rVar;
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: a */
        public final void mo23357a(boolean z) {
            C12682r e = m26516e();
            if (e != null) {
                C12682r.m22821a(AbstractC1196i.EnumC1199b.RESUMED, e, z);
            }
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: a */
        public final /* synthetic */ void mo23356a(int i, Object obj) {
            C89219l.m154719c(obj, "");
            C12682r e = m26516e();
            if (e != null) {
                e.mo20496a(i, obj);
            }
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: a */
        public final /* synthetic */ void mo23355a(int i, AbstractC22875c cVar, Object obj, List list, AbstractC89172b bVar, AbstractC89171a aVar) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(obj, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(aVar, "");
            this.f35092b = (ASSEM) ((AssemPowerCell) cVar).mo23351d();
            if (this.f35091a == null) {
                this.f35091a = new C12682r();
            }
            C12682r rVar = this.f35091a;
            if (rVar != null) {
                ASSEM assem = this.f35092b;
                if (assem == null) {
                    C89219l.m154707a();
                }
                rVar.mo20497a(assem, obj, list, bVar, aVar);
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12656g
    public final AbstractC1204m aN_() {
        return this.f42159c;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: f */
    public final AbstractC22874b<PowerCell<T>, T> mo23353f() {
        return new C14513a();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12656g
    public final View aM_() {
        View view = this.f35089b;
        if (view == null) {
            C89219l.m154710a("containerView");
        }
        return view;
    }

    /* renamed from: d */
    public final ASSEM mo23351d() {
        ASSEM assem = this.f35088a;
        if (assem == null) {
            C89219l.m154710a("assemAttach2Cell");
        }
        return assem;
    }

    public AssemPowerCell() {
        AssemPowerCell$dispatcher$1 assemPowerCell$dispatcher$1 = new AssemPowerCell$dispatcher$1(this);
        this.f35090j = assemPowerCell$dispatcher$1;
        getLifecycle().mo4012a(assemPowerCell$dispatcher$1);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12656g
    public final ActivityC0945e aL_() {
        Context context = aM_().getContext();
        if (context != null) {
            return (ActivityC0945e) context;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154719c(viewGroup, "");
        this.f35088a = mo23352e();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        ASSEM assem = this.f35088a;
        if (assem == null) {
            C89219l.m154710a("assemAttach2Cell");
        }
        View a = C1764a.m5927a(from, assem.mo20547D(), viewGroup, false);
        C89219l.m154709a((Object) a, "");
        C89219l.m154719c(a, "");
        this.f35089b = a;
        C12780d.m23006a(this, new C14514b(this));
        return aM_();
    }

    /* renamed from: com.bytedance.ext_power_list.AssemPowerCell$b */
    static final class C14514b extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemPowerCell f35093a;

        static {
            Covode.recordClassIndex(16598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14514b(AssemPowerCell assemPowerCell) {
            super(1);
            this.f35093a = assemPowerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154719c(assembler2, "");
            this.f35093a.mo23351d().mo20551d(this.f35093a.aM_());
            this.f35093a.mo23351d().mo20507a(this.f35093a.aM_());
            this.f35093a.mo23351d().f30896i = true;
            AbstractC12711w d = this.f35093a.mo23351d();
            AssemSupervisor a = assembler2.mo20573a(this.f35093a);
            if (a != null) {
                d.mo20587a(a);
                this.f35093a.mo23351d().mo20586a(this.f35093a);
                return C89391z.f203057a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
