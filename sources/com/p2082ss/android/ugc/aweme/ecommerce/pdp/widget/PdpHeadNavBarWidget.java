package com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44674a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44770d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget */
public final class PdpHeadNavBarWidget extends JediBaseWidget implements AbstractC33974au {

    /* renamed from: j */
    public static final int f105069j = C45563h.f106105a;

    /* renamed from: k */
    public static final C45046b f105070k = new C45046b((byte) 0);

    /* renamed from: h */
    public boolean f105071h;

    /* renamed from: i */
    public final AbstractC0952i f105072i;

    /* renamed from: l */
    private final AbstractC89244h f105073l;

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return R.layout.pp;
    }

    /* renamed from: l */
    public final PdpViewModel mo76167l() {
        return (PdpViewModel) this.f105073l.getValue();
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$b */
    public static final class C45046b {
        static {
            Covode.recordClassIndex(53473);
        }

        private C45046b() {
        }

        public /* synthetic */ C45046b(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(53471);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$a */
    public static final class C45045a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f105074a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f105075b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105076c;

        static {
            Covode.recordClassIndex(53472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45045a(Widget widget, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f105074a = widget;
            this.f105075b = cVar;
            this.f105076c = cVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget.C45045a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_widget_PdpHeadNavBarWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87728x1a94f2ff(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: m */
    public final void mo76168m() {
        View view;
        TuxIconView tuxIconView;
        View view2;
        LinearLayout linearLayout;
        if (!mo76167l().f104160q && (view = this.f56005e) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.e05)) != null && tuxIconView.getVisibility() == 0 && (view2 = this.f56005e) != null && (linearLayout = (LinearLayout) view2.findViewById(R.id.d05)) != null && linearLayout.getVisibility() == 0) {
            mo76167l().f104160q = true;
            C44720k kVar = mo76167l().f104162s;
            if (kVar != null) {
                kVar.mo75875c();
            }
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: c */
    public final void mo39080c() {
        super.mo39080c();
        View view = this.f56005e;
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.d05);
            if (linearLayout != null) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), mo76167l().mo75824b(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.cft);
            if (constraintLayout != null) {
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), mo76167l().mo75824b(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
            }
            if (mo76167l().f104166w) {
                ((TuxIconView) view.findViewById(R.id.a73)).setIconRes(R.raw.icon_arrow_left_ltr);
            } else {
                ((TuxIconView) view.findViewById(R.id.a73)).setIconRes(R.raw.icon_x_mark);
            }
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.a73);
            if (tuxIconView != null) {
                tuxIconView.setOnClickListener(new C45049e(this));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.a6q);
            C89219l.m154716b(appCompatImageView, "");
            appCompatImageView.setOnClickListener(new C45050f(this));
            if (mo76167l().f104159p) {
                TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.tl);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(8);
                TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.tl);
                C89219l.m154716b(tuxIconView3, "");
                tuxIconView3.setOnClickListener(new C45051g(this));
            }
            TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.clv);
            C89219l.m154716b(tuxIconView4, "");
            tuxIconView4.setOnClickListener(new C45052h(this));
            AbstractC88412b unused = selectSubscribe(mo76167l(), C45075n.f105115a, new C20370ah(), new C45054i(view, this));
            AbstractC88412b unused2 = selectSubscribe(mo76167l(), C45076o.f105116a, new C20370ah(), new C45055j(view, this));
        }
        AbstractC88412b unused3 = selectSubscribe(mo76167l(), C45077p.f105117a, new C20370ah(), new C45057l(this));
        AbstractC88412b unused4 = selectSubscribe(mo76167l(), C45078q.f105118a, C45079r.f105119a, new C20370ah(), new C45058m(this));
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        AbstractC88412b unused5 = selectSubscribe(mo76167l(), C45080s.f105120a, new C20370ah(), new C45059n(this, aVar));
        AbstractC88412b unused6 = selectSubscribe(mo76167l(), C45081t.f105121a, new C20370ah(), new C45056k(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$e */
    public static final class C45049e extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105079a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpHeadNavBarWidget f105080b;

        static {
            Covode.recordClassIndex(53476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45049e(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(700);
            this.f105080b = pdpHeadNavBarWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f105080b.mo76167l().mo75831i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$f */
    public static final class C45050f extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105081a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpHeadNavBarWidget f105082b;

        static {
            Covode.recordClassIndex(53477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45050f(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(700);
            this.f105082b = pdpHeadNavBarWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f105082b.mo76167l().mo75831i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$g */
    public static final class C45051g extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105083a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpHeadNavBarWidget f105084b;

        static {
            Covode.recordClassIndex(53478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45051g(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(700);
            this.f105084b = pdpHeadNavBarWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            C44720k kVar;
            if (view != null && (kVar = this.f105084b.mo76167l().f104162s) != null) {
                kVar.mo75863a("collection", (Boolean) null, (Boolean) null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$h */
    public static final class C45052h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105085a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpHeadNavBarWidget f105086b;

        static {
            Covode.recordClassIndex(53479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45052h(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(700);
            this.f105086b = pdpHeadNavBarWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            SellerInfo sellerInfo;
            if (view != null) {
                C44720k kVar = this.f105086b.mo76167l().f104162s;
                if (kVar != null) {
                    ProductPackStruct productPackStruct = this.f105086b.mo76167l().f104150d;
                    if (productPackStruct == null || (sellerInfo = productPackStruct.f104676d) == null || (str = sellerInfo.f104704a) == null) {
                        str = "";
                    }
                    kVar.mo75881e(str);
                }
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                IPdpStarter.C44631a.m87370a(context, this.f105086b.f105072i, this.f105086b.mo76167l().mo75834l(), new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget.C45052h.C450531 */

                    /* renamed from: a */
                    final /* synthetic */ C45052h f105087a;

                    static {
                        Covode.recordClassIndex(53480);
                    }

                    {
                        this.f105087a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        C44720k kVar = this.f105087a.f105086b.mo76167l().f104162s;
                        if (kVar != null) {
                            kVar.mo75868b();
                        }
                        return C89391z.f203057a;
                    }
                });
                C44720k kVar2 = this.f105086b.mo76167l().f104162s;
                if (kVar2 != null) {
                    kVar2.mo75863a("more_function", (Boolean) null, (Boolean) null);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$o */
    public static final class C45061o extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105099a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpHeadNavBarWidget f105100b;

        /* renamed from: c */
        final /* synthetic */ CartEntry f105101c;

        static {
            Covode.recordClassIndex(53488);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f105100b.mo76167l().mo75815a(view.getContext());
                C44720k kVar = this.f105100b.mo76167l().f104162s;
                if (kVar != null) {
                    kVar.mo75879d();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45061o(PdpHeadNavBarWidget pdpHeadNavBarWidget, CartEntry cartEntry) {
            super(700);
            this.f105100b = pdpHeadNavBarWidget;
            this.f105101c = cartEntry;
        }
    }

    public PdpHeadNavBarWidget(AbstractC0952i iVar) {
        this.f105072i = iVar;
        AbstractC89277c a = C89204ab.m154669a(PdpViewModel.class);
        this.f105073l = C89250i.m154773a((AbstractC89171a) new C45045a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$c */
    static final class C45047c implements DmtTabLayout.AbstractC17288b {

        /* renamed from: a */
        final /* synthetic */ PdpHeadNavBarWidget f105077a;

        static {
            Covode.recordClassIndex(53474);
        }

        C45047c(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            this.f105077a = pdpHeadNavBarWidget;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
        /* renamed from: a */
        public final void mo27573a(DmtTabLayout.C17294f fVar) {
            this.f105077a.mo76167l().f104167x = true;
            PdpViewModel l = this.f105077a.mo76167l();
            String str = "";
            C89219l.m154716b(fVar, str);
            l.mo75814a(fVar.f41524e, true);
            int i = fVar.f41524e;
            if (i == 0) {
                str = "overview";
            } else if (i == 1) {
                str = "reviews";
            } else if (i == 2) {
                str = "description";
            }
            C44720k kVar = this.f105077a.mo76167l().f104162s;
            if (kVar != null) {
                kVar.mo75873b(str, (HashMap<String, Object>) null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$d */
    static final class C45048d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44770d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f105078a;

        static {
            Covode.recordClassIndex(53475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45048d(List list) {
            super(2);
            this.f105078a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44770d dVar) {
            C44770d dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(dVar2, "");
            DmtTabLayout.C17294f fVar = (DmtTabLayout.C17294f) C89070n.m154561b(this.f105078a, dVar2.f104451a);
            if (fVar != null) {
                fVar.mo27592a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$n */
    static final class C45059n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadNavBarWidget f105095a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f105096b;

        static {
            Covode.recordClassIndex(53486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45059n(PdpHeadNavBarWidget pdpHeadNavBarWidget, C89233z.C89234a aVar) {
            super(2);
            this.f105095a = pdpHeadNavBarWidget;
            this.f105096b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            AbstractC20477i iVar2 = iVar;
            final int intValue = num.intValue();
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f105095a.mo76167l(), new AbstractC89172b<PdpMainState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget.C45059n.C450601 */

                /* renamed from: a */
                final /* synthetic */ C45059n f105097a;

                static {
                    Covode.recordClassIndex(53487);
                }

                {
                    this.f105097a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(PdpMainState pdpMainState) {
                    LinearLayout linearLayout;
                    LinearLayout linearLayout2;
                    DmtTabLayout dmtTabLayout;
                    LinearLayout linearLayout3;
                    LinearLayout linearLayout4;
                    boolean z;
                    PdpMainState pdpMainState2 = pdpMainState;
                    C89219l.m154721d(pdpMainState2, "");
                    if (pdpMainState2.getLoadingStatus() == -1) {
                        float f = (1.0f / ((float) PdpHeadNavBarWidget.f105069j)) * ((float) intValue);
                        View view = this.f105097a.f105095a.f56005e;
                        if (!(view == null || (linearLayout4 = (LinearLayout) view.findViewById(R.id.d05)) == null)) {
                            if (f > 0.9f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            linearLayout4.setClickable(z);
                        }
                        if (f > 0.05f) {
                            View view2 = this.f105097a.f105095a.f56005e;
                            if (!(view2 == null || (linearLayout3 = (LinearLayout) view2.findViewById(R.id.d05)) == null)) {
                                linearLayout3.setVisibility(0);
                            }
                            View view3 = this.f105097a.f105095a.f56005e;
                            if (view3 != null && (dmtTabLayout = (DmtTabLayout) view3.findViewById(R.id.d06)) != null && dmtTabLayout.getVisibility() == 0 && !this.f105097a.f105096b.element) {
                                this.f105097a.f105096b.element = true;
                                C44720k kVar = this.f105097a.f105095a.mo76167l().f104162s;
                                if (kVar != null) {
                                    kVar.mo75864a("overview", (HashMap<String, Object>) null);
                                }
                                C44720k kVar2 = this.f105097a.f105095a.mo76167l().f104162s;
                                if (kVar2 != null) {
                                    kVar2.mo75864a("description", (HashMap<String, Object>) null);
                                }
                                C44720k kVar3 = this.f105097a.f105095a.mo76167l().f104162s;
                                if (kVar3 != null) {
                                    kVar3.mo75864a("reviews", (HashMap<String, Object>) null);
                                }
                            }
                        } else {
                            View view4 = this.f105097a.f105095a.f56005e;
                            if (!(view4 == null || (linearLayout = (LinearLayout) view4.findViewById(R.id.d05)) == null)) {
                                linearLayout.setVisibility(8);
                            }
                        }
                        View view5 = this.f105097a.f105095a.f56005e;
                        if (!(view5 == null || (linearLayout2 = (LinearLayout) view5.findViewById(R.id.d05)) == null)) {
                            linearLayout2.setAlpha(f);
                        }
                    }
                    this.f105097a.f105095a.mo76168m();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$l */
    static final class C45057l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadNavBarWidget f105093a;

        static {
            Covode.recordClassIndex(53484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45057l(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(2);
            this.f105093a = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            View view;
            LinearLayout linearLayout;
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            if (!(intValue == -1 || (view = this.f105093a.f56005e) == null || (linearLayout = (LinearLayout) view.findViewById(R.id.d05)) == null)) {
                linearLayout.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$j */
    static final class C45055j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44674a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f105090a;

        /* renamed from: b */
        final /* synthetic */ PdpHeadNavBarWidget f105091b;

        static {
            Covode.recordClassIndex(53482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45055j(View view, PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(2);
            this.f105090a = view;
            this.f105091b = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44674a aVar) {
            LinearLayout linearLayout;
            C44674a aVar2 = aVar;
            C89219l.m154721d(iVar, "");
            View view = this.f105091b.f56005e;
            if (!(view == null || (linearLayout = (LinearLayout) view.findViewById(R.id.d05)) == null || linearLayout.getVisibility() != 0)) {
                TuxIconView tuxIconView = (TuxIconView) this.f105090a.findViewById(R.id.e05);
                C89219l.m154716b(tuxIconView, "");
                if (tuxIconView.getVisibility() == 0) {
                    this.f105091b.mo76167l().mo75816a(this.f105090a.getContext(), aVar2, this.f105090a.findViewById(R.id.e05));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$i */
    static final class C45054i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, ProductDetailReview, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f105088a;

        /* renamed from: b */
        final /* synthetic */ PdpHeadNavBarWidget f105089b;

        static {
            Covode.recordClassIndex(53481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45054i(View view, PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(2);
            this.f105088a = view;
            this.f105089b = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, ProductDetailReview productDetailReview) {
            List<ReviewItemStruct> list;
            boolean z;
            ProductDetailReview productDetailReview2 = productDetailReview;
            C89219l.m154721d(iVar, "");
            if (productDetailReview2 != null) {
                list = productDetailReview2.f104666c;
            } else {
                list = null;
            }
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f105088a.findViewById(R.id.d06);
                C89219l.m154716b(dmtTabLayout, "");
                dmtTabLayout.setVisibility(8);
            } else {
                DmtTabLayout dmtTabLayout2 = (DmtTabLayout) this.f105088a.findViewById(R.id.d06);
                C89219l.m154716b(dmtTabLayout2, "");
                dmtTabLayout2.setVisibility(0);
                PdpHeadNavBarWidget pdpHeadNavBarWidget = this.f105089b;
                View view = pdpHeadNavBarWidget.f56005e;
                if (view != null && !pdpHeadNavBarWidget.f105071h) {
                    pdpHeadNavBarWidget.f105071h = true;
                    DmtTabLayout dmtTabLayout3 = (DmtTabLayout) view.findViewById(R.id.d06);
                    Integer[] numArr = {Integer.valueOf((int) R.string.bgy), Integer.valueOf((int) R.string.bgz), Integer.valueOf((int) R.string.bgx)};
                    ArrayList arrayList = new ArrayList(3);
                    int i = 0;
                    do {
                        int intValue = numArr[i].intValue();
                        DmtTabLayout.C17294f a = dmtTabLayout3.mo27516a(0);
                        if (a.f41527h != null) {
                            a.mo27591a(a.f41527h.getResources().getText(intValue));
                            C89219l.m154716b(a, "");
                            DmtTabLayout.C17296h hVar = a.f41528i;
                            C89219l.m154716b(hVar, "");
                            TextView textView = hVar.getTextView();
                            C89219l.m154716b(textView, "");
                            textView.setAllCaps(false);
                            C89219l.m154716b(a, "");
                            dmtTabLayout3.mo27522a(a);
                            arrayList.add(a);
                            i++;
                        } else {
                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                        }
                    } while (i < 3);
                    dmtTabLayout3.setOnTabClickListener(new C45047c(pdpHeadNavBarWidget));
                    C89219l.m154716b(dmtTabLayout3, "");
                    dmtTabLayout3.setTabMode(0);
                    dmtTabLayout3.setAutoFillWhenScrollable(true);
                    AbstractC88412b unused = pdpHeadNavBarWidget.selectSubscribe(pdpHeadNavBarWidget.mo76167l(), C45074m.f105114a, new C20370ah(), new C45048d(arrayList));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$k */
    static final class C45056k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, CartEntry, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadNavBarWidget f105092a;

        static {
            Covode.recordClassIndex(53483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45056k(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(2);
            this.f105092a = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, CartEntry cartEntry) {
            Integer num;
            CartEntry cartEntry2 = cartEntry;
            C89219l.m154721d(iVar, "");
            PdpHeadNavBarWidget pdpHeadNavBarWidget = this.f105092a;
            View view = pdpHeadNavBarWidget.f56005e;
            if (view != null) {
                pdpHeadNavBarWidget.mo76167l();
                if (PdpViewModel.m87376a(cartEntry2)) {
                    TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e05);
                    C89219l.m154716b(tuxIconView, "");
                    tuxIconView.setVisibility(0);
                    if (!(cartEntry2 == null || (num = cartEntry2.f104634b) == null)) {
                        int intValue = num.intValue();
                        if (intValue > 0) {
                            TuxAlertBadge tuxAlertBadge = (TuxAlertBadge) view.findViewById(R.id.e07);
                            C89219l.m154716b(tuxAlertBadge, "");
                            tuxAlertBadge.setVisibility(0);
                            ((TuxAlertBadge) view.findViewById(R.id.e07)).setCount(intValue);
                        } else {
                            TuxAlertBadge tuxAlertBadge2 = (TuxAlertBadge) view.findViewById(R.id.e07);
                            C89219l.m154716b(tuxAlertBadge2, "");
                            tuxAlertBadge2.setVisibility(8);
                        }
                    }
                    TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.e05);
                    C89219l.m154716b(tuxIconView2, "");
                    tuxIconView2.setOnClickListener(new C45061o(pdpHeadNavBarWidget, cartEntry2));
                } else {
                    TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.e05);
                    C89219l.m154716b(tuxIconView3, "");
                    tuxIconView3.setVisibility(8);
                    TuxAlertBadge tuxAlertBadge3 = (TuxAlertBadge) view.findViewById(R.id.e07);
                    C89219l.m154716b(tuxAlertBadge3, "");
                    tuxAlertBadge3.setVisibility(8);
                }
                pdpHeadNavBarWidget.mo76168m();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget$m */
    static final class C45058m extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Float, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadNavBarWidget f105094a;

        static {
            Covode.recordClassIndex(53485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45058m(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
            super(3);
            this.f105094a = pdpHeadNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Float f, Integer num) {
            ConstraintLayout constraintLayout;
            View view;
            ConstraintLayout constraintLayout2;
            ConstraintLayout constraintLayout3;
            float floatValue = f.floatValue();
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            if (floatValue >= 1.0f) {
                View view2 = this.f105094a.f56005e;
                if (!(view2 == null || (constraintLayout3 = (ConstraintLayout) view2.findViewById(R.id.cft)) == null)) {
                    constraintLayout3.setVisibility(0);
                }
            } else {
                View view3 = this.f105094a.f56005e;
                if (!(view3 == null || (constraintLayout = (ConstraintLayout) view3.findViewById(R.id.cft)) == null)) {
                    constraintLayout.setVisibility(8);
                }
            }
            if (!(intValue != -1 || (view = this.f105094a.f56005e) == null || (constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.cft)) == null)) {
                constraintLayout2.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }
}
