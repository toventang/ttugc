package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingNumber;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder */
public final class PdpReviewHeadViewHolder extends AbsFullSpanVH<ProductDetailReview> implements AbstractC33974au {

    /* renamed from: f */
    final AbstractC89244h f104779f;

    /* renamed from: g */
    public ProductDetailReview f104780g;

    static {
        Covode.recordClassIndex(53321);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C44998a.C44999a.m87685a(view, false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: g */
    public final void mo33829g() {
        super.mo33829g();
        mo76082a(new C44955i(aQ_(), (byte) 0));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder$a */
    public static final class C44913a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104781a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f104782b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104783c;

        static {
            Covode.recordClassIndex(53322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44913a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f104781a = jediViewHolder;
            this.f104782b = cVar;
            this.f104783c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewHeadViewHolder.C44913a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpReviewHeadViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87602xcd9c5682(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder$b */
    public static final class C44914b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104784a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpReviewHeadViewHolder f104785b;

        static {
            Covode.recordClassIndex(53323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44914b(PdpReviewHeadViewHolder pdpReviewHeadViewHolder) {
            super(700);
            this.f104785b = pdpReviewHeadViewHolder;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                ((PdpViewModel) this.f104785b.f104779f.getValue()).mo75827e(context);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PdpReviewHeadViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559014(0x7f0d0266, float:1.874336E38)
            r0 = 0
            android.view.View r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a.m87492a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f104779f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewHeadViewHolder.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        ProductDetailReview productDetailReview = (ProductDetailReview) obj;
        C89219l.m154721d(productDetailReview, "");
        this.f104780g = productDetailReview;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ah2);
        C89219l.m154716b(tuxTextView, "");
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        tuxTextView.setText(view2.getContext().getString(R.string.bha, String.valueOf(productDetailReview.f104665b)));
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        ((RatingNumber) view3.findViewById(R.id.deh)).setStyle(2);
        if (productDetailReview.f104664a != null) {
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            RatingNumber ratingNumber = (RatingNumber) view4.findViewById(R.id.deh);
            C89219l.m154716b(ratingNumber, "");
            ratingNumber.setVisibility(0);
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            TuxIconView tuxIconView = (TuxIconView) view5.findViewById(R.id.e6e);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            View view6 = this.itemView;
            C89219l.m154716b(view6, "");
            ((RatingNumber) view6.findViewById(R.id.deh)).getScore().setText(String.valueOf(productDetailReview.f104664a.floatValue()));
        } else {
            View view7 = this.itemView;
            C89219l.m154716b(view7, "");
            RatingNumber ratingNumber2 = (RatingNumber) view7.findViewById(R.id.deh);
            C89219l.m154716b(ratingNumber2, "");
            ratingNumber2.setVisibility(8);
            View view8 = this.itemView;
            C89219l.m154716b(view8, "");
            TuxIconView tuxIconView2 = (TuxIconView) view8.findViewById(R.id.e6e);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        View view9 = this.itemView;
        C89219l.m154716b(view9, "");
        view9.setOnClickListener(new C44914b(this));
    }
}
