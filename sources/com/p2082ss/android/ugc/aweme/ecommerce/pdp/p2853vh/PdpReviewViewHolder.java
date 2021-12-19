package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.widget.FlowLayout;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingStar;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText;
import com.p2082ss.android.ugc.aweme.ecommerce.review.viewholder.C45234a;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder */
public final class PdpReviewViewHolder extends AbsFullSpanVH<ReviewItemStruct> implements AbstractC33974au {

    /* renamed from: f */
    public ReviewItemStruct f104786f;

    /* renamed from: g */
    private final AbstractC89244h f104787g;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$d */
    final /* synthetic */ class RunnableC44921d implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f104802a;

        static {
            Covode.recordClassIndex(53331);
        }

        RunnableC44921d(AbstractC89171a aVar) {
            this.f104802a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f104802a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(53324);
    }

    /* renamed from: n */
    public final PdpViewModel mo70807n() {
        return (PdpViewModel) this.f104787g.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$b */
    static final class C44916b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpReviewViewHolder f104791a;

        /* renamed from: b */
        final /* synthetic */ FlowLayout f104792b;

        /* renamed from: c */
        final /* synthetic */ List f104793c;

        /* renamed from: d */
        final /* synthetic */ int f104794d;

        static {
            Covode.recordClassIndex(53326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44916b(PdpReviewViewHolder pdpReviewViewHolder, FlowLayout flowLayout, List list, int i) {
            super(0);
            this.f104791a = pdpReviewViewHolder;
            this.f104792b = flowLayout;
            this.f104793c = list;
            this.f104794d = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            final int width = (this.f104792b.getWidth() - (C45563h.f106110f * 3)) / 4;
            FlowLayout flowLayout = this.f104792b;
            List list = this.f104793c;
            C45234a.m87822a(flowLayout, list.subList(0, Math.min(4, list.size())), new AbstractC89171a<View>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewViewHolder.C44916b.C449171 */

                /* renamed from: a */
                final /* synthetic */ C44916b f104795a;

                static {
                    Covode.recordClassIndex(53327);
                }

                {
                    this.f104795a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ View invoke() {
                    View a = C44766a.m87492a(this.f104795a.f104792b.getContext(), R.layout.q4, this.f104795a.f104792b, false);
                    ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                        layoutParams.width = width;
                        layoutParams.height = width;
                        a.setLayoutParams(layoutParams);
                    }
                    return a;
                }
            }, new AbstractC89187q<View, Image, Integer, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewViewHolder.C44916b.C449182 */

                /* renamed from: a */
                final /* synthetic */ C44916b f104797a;

                static {
                    Covode.recordClassIndex(53328);
                }

                {
                    this.f104797a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$b$2$a */
                public static final class C44919a extends AbstractView$OnClickListenerC80259bp {

                    /* renamed from: a */
                    final /* synthetic */ long f104798a = 700;

                    /* renamed from: b */
                    final /* synthetic */ C449182 f104799b;

                    static {
                        Covode.recordClassIndex(53329);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C44919a(C449182 r3) {
                        super(700);
                        this.f104799b = r3;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
                    /* renamed from: a */
                    public final void mo60873a(View view) {
                        if (view != null) {
                            PdpViewModel n = this.f104799b.f104797a.f104791a.mo70807n();
                            Context context = view.getContext();
                            C89219l.m154716b(context, "");
                            n.mo75827e(context);
                        }
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89187q
                public final /* synthetic */ C89391z invoke(View view, Image image, Integer num) {
                    View view2 = view;
                    Image image2 = image;
                    int intValue = num.intValue();
                    C89219l.m154721d(image2, "");
                    C20766v a = C45562g.m88109a(image2.toThumbFirstImageUrlModel());
                    a.f49125v = EnumC20767w.CENTER_CROP;
                    a.f49115l = R.color.j;
                    a.f49126w = C45562g.f106103a;
                    a.f49092E = (SmartImageView) view2.findViewById(R.id.djm);
                    a.mo34186c();
                    view2.setOnClickListener(new C44919a(this));
                    if (intValue == 3) {
                        C23163i.m43668b(view2, null, null, 0, null, false, 27);
                    }
                    if (this.f104797a.f104794d <= 0 || intValue != 3) {
                        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.dx2);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setVisibility(8);
                    } else {
                        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.dx2);
                        C89219l.m154716b(tuxTextView2, "");
                        tuxTextView2.setVisibility(0);
                        if (C80471gb.m139482a()) {
                            TuxTextView tuxTextView3 = (TuxTextView) view2.findViewById(R.id.dx2);
                            C89219l.m154716b(tuxTextView3, "");
                            tuxTextView3.setText(new StringBuilder().append(this.f104797a.f104794d).append('+').toString());
                        } else {
                            TuxTextView tuxTextView4 = (TuxTextView) view2.findViewById(R.id.dx2);
                            C89219l.m154716b(tuxTextView4, "");
                            tuxTextView4.setText("+" + this.f104797a.f104794d);
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$a */
    public static final class C44915a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104788a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f104789b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104790c;

        static {
            Covode.recordClassIndex(53325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44915a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f104788a = jediViewHolder;
            this.f104789b = cVar;
            this.f104790c = cVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewViewHolder.C44915a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpReviewViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87607x9e631482(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$c */
    public static final class C44920c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104800a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpReviewViewHolder f104801b;

        static {
            Covode.recordClassIndex(53330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44920c(PdpReviewViewHolder pdpReviewViewHolder) {
            super(700);
            this.f104801b = pdpReviewViewHolder;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                PdpViewModel n = this.f104801b.mo70807n();
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                n.mo75827e(context);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PdpReviewViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559021(0x7f0d026d, float:1.8743374E38)
            r0 = 0
            android.view.View r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a.m87492a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f104787g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewViewHolder.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        String str;
        float f;
        String str2;
        Image image;
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) obj;
        C89219l.m154721d(reviewItemStruct, "");
        this.f104786f = reviewItemStruct;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fag);
        C89219l.m154716b(tuxTextView, "");
        ReviewItemStruct.User user = reviewItemStruct.f105346g;
        if (user == null || (str = user.f105362b) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.e1x);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(reviewItemStruct.f105341b);
        RatingStar ratingStar = (RatingStar) view.findViewById(R.id.e6f);
        C89219l.m154716b(ratingStar, "");
        ratingStar.setVisibility(0);
        RatingStar ratingStar2 = (RatingStar) view.findViewById(R.id.e6f);
        Float c = C89361p.m154861c(reviewItemStruct.f105340a.f105354b);
        if (c != null) {
            f = c.floatValue();
        } else {
            f = 0.0f;
        }
        ratingStar2.setRate(f);
        RatingStar ratingStar3 = (RatingStar) view.findViewById(R.id.e6_);
        C89219l.m154716b(ratingStar3, "");
        ratingStar3.setVisibility(8);
        if (!reviewItemStruct.f105340a.mo76271a()) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            str2 = view2.getContext().getString(R.string.bh_);
        } else {
            str2 = reviewItemStruct.f105340a.f105355c;
        }
        if (C80538hl.m139614a(reviewItemStruct.f105340a.f105355c) || !reviewItemStruct.f105340a.mo76272b()) {
            ViewMoreText viewMoreText = (ViewMoreText) view.findViewById(R.id.djk);
            C89219l.m154716b(viewMoreText, "");
            viewMoreText.setVisibility(0);
        } else {
            ViewMoreText viewMoreText2 = (ViewMoreText) view.findViewById(R.id.djk);
            C89219l.m154716b(viewMoreText2, "");
            viewMoreText2.setVisibility(8);
        }
        ViewMoreText.m87804a((ViewMoreText) view.findViewById(R.id.djk), str2, 2, false, null, 8);
        ReviewItemStruct.User user2 = reviewItemStruct.f105346g;
        if (user2 != null) {
            image = user2.f105363c;
        } else {
            image = null;
        }
        C20766v a = C45562g.m88108a(image);
        a.f49115l = R.drawable.ccg;
        a.f49092E = (SmartImageView) view.findViewById(R.id.nz);
        a.mo34186c();
        view.setOnClickListener(new C44920c(this));
        ((FlowLayout) view.findViewById(R.id.djq)).setGravity(-1);
        FlowLayout flowLayout = (FlowLayout) view.findViewById(R.id.djq);
        C89219l.m154716b(flowLayout, "");
        List<Image> list = reviewItemStruct.f105340a.f105356d;
        if (list == null || list.isEmpty()) {
            flowLayout.setVisibility(8);
            return;
        }
        flowLayout.setVisibility(0);
        C44916b bVar = new C44916b(this, flowLayout, list, list.size() - 4);
        if (flowLayout.getWidth() == 0) {
            flowLayout.post(new RunnableC44921d(bVar));
        } else {
            bVar.invoke();
        }
    }
}
