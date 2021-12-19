package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.OrderSubmitSpanVH */
public final class OrderSubmitSpanVH extends AbsFullSpanVH<C43939d> implements AbstractC33974au {

    /* renamed from: f */
    private final AbstractC89244h f102347f;

    static {
        Covode.recordClassIndex(52188);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        AbstractC88412b unused = selectSubscribe((OrderSubmitViewModel) this.f102347f.getValue(), C43938c.f102447a, new C20370ah(), C43905b.f102351a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.OrderSubmitSpanVH$a */
    public static final class C43904a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f102348a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102349b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102350c;

        static {
            Covode.recordClassIndex(52189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43904a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102348a = jediViewHolder;
            this.f102349b = cVar;
            this.f102350c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.OrderSubmitSpanVH.C43904a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_OrderSubmitSpanVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86809xaaf24ec0(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderSubmitSpanVH(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        C89219l.m154721d(viewGroup, "");
        MethodCollector.m26663i(8656);
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102347f = C89250i.m154773a((AbstractC89171a) new C43904a(this, a, a));
        MethodCollector.m26664o(8656);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        C43939d dVar = (C43939d) obj;
        C89219l.m154721d(dVar, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        RecyclerView.C1367j jVar = new RecyclerView.C1367j(-1, (int) C13628n.m24520b(view.getContext(), dVar.f102448a));
        jVar.leftMargin = dVar.f102450c;
        jVar.rightMargin = dVar.f102450c;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view2.setLayoutParams(jVar);
        this.itemView.setPadding(dVar.f102450c, 0, dVar.f102450c, 0);
        this.itemView.setBackgroundColor(dVar.f102451d);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        C44998a.C44999a.m87685a(view3, dVar.f102449b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.OrderSubmitSpanVH$b */
    static final class C43905b extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C43939d>, Boolean, C89391z> {

        /* renamed from: a */
        public static final C43905b f102351a = new C43905b();

        static {
            Covode.recordClassIndex(52190);
        }

        C43905b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C43939d> jediSimpleViewHolder, Boolean bool) {
            int i;
            JediSimpleViewHolder<C43939d> jediSimpleViewHolder2 = jediSimpleViewHolder;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(jediSimpleViewHolder2, "");
            View view = jediSimpleViewHolder2.itemView;
            C89219l.m154716b(view, "");
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            return C89391z.f203057a;
        }
    }
}
