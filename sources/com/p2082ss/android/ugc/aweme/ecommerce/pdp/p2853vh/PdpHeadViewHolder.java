package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44674a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2849a.C44675a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44746n;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44772b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.HalfWaistBanner;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import dmt.viewpager.DmtRtlViewPager;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder */
public final class PdpHeadViewHolder extends AbsFullSpanVH<C44772b> implements AbstractC33974au {

    /* renamed from: f */
    public final TextView f104731f = ((TextView) this.itemView.findViewById(R.id.bmy));

    /* renamed from: g */
    public final ViewGroup f104732g = ((ViewGroup) this.itemView.findViewById(R.id.be5));

    /* renamed from: j */
    public C44675a f104733j;

    /* renamed from: k */
    public int f104734k;

    /* renamed from: l */
    public Boolean f104735l;

    /* renamed from: m */
    public Integer f104736m;

    /* renamed from: n */
    public final AbstractC0952i f104737n;

    /* renamed from: o */
    private final DmtRtlViewPager f104738o = ((DmtRtlViewPager) this.itemView.findViewById(R.id.aal));

    /* renamed from: p */
    private final AbstractC89244h f104739p;

    /* renamed from: q */
    private final HalfWaistView f104740q;

    static {
        Covode.recordClassIndex(53299);
    }

    /* renamed from: n */
    public final PdpViewModel mo70807n() {
        return (PdpViewModel) this.f104739p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$a */
    public static final class C44893a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104741a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f104742b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104743c;

        static {
            Covode.recordClassIndex(53300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44893a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f104741a = jediViewHolder;
            this.f104742b = cVar;
            this.f104743c = cVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpHeadViewHolder.C44893a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpHeadViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87588x4fef250a(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C44998a.C44999a.m87685a(view, false);
        ViewGroup viewGroup = this.f104732g;
        C89219l.m154716b(viewGroup, "");
        ViewGroup viewGroup2 = this.f104732g;
        C89219l.m154716b(viewGroup2, "");
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin += mo70807n().mo75824b();
            marginLayoutParams = marginLayoutParams2;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
        AbstractC88412b unused = selectSubscribe(mo70807n(), C44935b.f104846a, new C20370ah(), new C44902i(this));
        AbstractC88412b unused2 = selectSubscribe(mo70807n(), C44936c.f104847a, new C20370ah(), new C44903j(this));
        AbstractC88412b unused3 = selectSubscribe(mo70807n(), C44937d.f104848a, new C20370ah(), new C44904k(this));
        AbstractC88412b unused4 = selectSubscribe(mo70807n(), C44951e.f104884a, new C20370ah(), new C44905l(this));
        AbstractC88412b unused5 = selectSubscribe(mo70807n(), C44934a.f104845a, new C20370ah(), new C44901h(this));
    }

    /* renamed from: o */
    public final void mo70808o() {
        if (!mo70807n().f104160q) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e05);
            C89219l.m154716b(tuxIconView, "");
            if (tuxIconView.getVisibility() == 0) {
                ViewGroup viewGroup = this.f104732g;
                C89219l.m154716b(viewGroup, "");
                if (viewGroup.getAlpha() > 0.0f) {
                    mo70807n().f104160q = true;
                    C44720k kVar = mo70807n().f104162s;
                    if (kVar != null) {
                        kVar.mo75875c();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$g */
    public static final class C44900g implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104752a;

        static {
            Covode.recordClassIndex(53307);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44900g(PdpHeadViewHolder pdpHeadViewHolder) {
            this.f104752a = pdpHeadViewHolder;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            String str;
            this.f104752a.f104734k = i;
            TextView textView = this.f104752a.f104731f;
            C89219l.m154716b(textView, "");
            textView.setText(C45563h.m88111a(String.valueOf(i + 1), String.valueOf(((C44772b) this.f104752a.aQ_()).f104456a.size())));
            Image image = (Image) C89070n.m154561b((List) ((C44772b) this.f104752a.aQ_()).f104456a, i);
            if (image != null) {
                C44720k kVar = this.f104752a.mo70807n().f104162s;
                if (kVar != null) {
                    kVar.mo75871b(image.getUri());
                }
                if (this.f104752a.mo70807n().f104156m) {
                    str = "viewer";
                } else {
                    str = "main";
                }
                C44720k kVar2 = this.f104752a.mo70807n().f104162s;
                if (kVar2 != null) {
                    boolean z = this.f104752a.mo70807n().f104148b;
                    String uri = image.getUri();
                    if (uri == null) {
                        uri = "";
                    }
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(uri, "");
                    new C44746n(str, z, uri).mo76746c(kVar2.f104318a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$b */
    public static final class C44894b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104744a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpHeadViewHolder f104745b;

        static {
            Covode.recordClassIndex(53301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44894b(PdpHeadViewHolder pdpHeadViewHolder) {
            super(700);
            this.f104745b = pdpHeadViewHolder;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f104745b.mo70807n().mo75831i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$c */
    public static final class C44895c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104746a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpHeadViewHolder f104747b;

        static {
            Covode.recordClassIndex(53302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44895c(PdpHeadViewHolder pdpHeadViewHolder) {
            super(700);
            this.f104747b = pdpHeadViewHolder;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            SellerInfo sellerInfo;
            if (view != null) {
                C44720k kVar = this.f104747b.mo70807n().f104162s;
                if (kVar != null) {
                    ProductPackStruct productPackStruct = this.f104747b.mo70807n().f104150d;
                    if (productPackStruct == null || (sellerInfo = productPackStruct.f104676d) == null || (str = sellerInfo.f104704a) == null) {
                        str = "";
                    }
                    kVar.mo75881e(str);
                }
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                IPdpStarter.C44631a.m87370a(context, this.f104747b.f104737n, this.f104747b.mo70807n().mo75834l(), new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpHeadViewHolder.C44895c.C448961 */

                    /* renamed from: a */
                    final /* synthetic */ C44895c f104748a;

                    static {
                        Covode.recordClassIndex(53303);
                    }

                    {
                        this.f104748a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        C44720k kVar = this.f104748a.f104747b.mo70807n().f104162s;
                        if (kVar != null) {
                            kVar.mo75868b();
                        }
                        return C89391z.f203057a;
                    }
                });
                C44720k kVar2 = this.f104747b.mo70807n().f104162s;
                if (kVar2 != null) {
                    kVar2.mo75863a("more_function", (Boolean) null, (Boolean) null);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$d */
    static final class C44897d extends AbstractC89220m implements AbstractC89172b<Image, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104749a;

        static {
            Covode.recordClassIndex(53304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44897d(PdpHeadViewHolder pdpHeadViewHolder) {
            super(1);
            this.f104749a = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Image image) {
            Image image2 = image;
            C89219l.m154721d(image2, "");
            C44720k kVar = this.f104749a.mo70807n().f104162s;
            if (kVar != null) {
                kVar.mo75880d(image2.getUri());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$f */
    static final class C44899f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104751a;

        static {
            Covode.recordClassIndex(53306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44899f(PdpHeadViewHolder pdpHeadViewHolder) {
            super(1);
            this.f104751a = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f104751a.mo70807n().mo33689c(PdpViewModel.C44662s.f104218a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$m */
    public static final class C44906m extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104758a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpHeadViewHolder f104759b;

        /* renamed from: c */
        final /* synthetic */ CartEntry f104760c;

        static {
            Covode.recordClassIndex(53313);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                C44720k kVar = this.f104759b.mo70807n().f104162s;
                if (kVar != null) {
                    kVar.mo75879d();
                }
                this.f104759b.mo70807n().mo75815a(view.getContext());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44906m(PdpHeadViewHolder pdpHeadViewHolder, CartEntry cartEntry) {
            super(700);
            this.f104759b = pdpHeadViewHolder;
            this.f104760c = cartEntry;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        HalfWaistBanner halfWaistBanner;
        boolean z;
        C89219l.m154721d(obj, "");
        ProductPackStruct productPackStruct = mo70807n().f104150d;
        String str = null;
        if (productPackStruct != null) {
            halfWaistBanner = productPackStruct.f104696x;
        } else {
            halfWaistBanner = null;
        }
        if (halfWaistBanner == null) {
            HalfWaistView halfWaistView = this.f104740q;
            C89219l.m154716b(halfWaistView, "");
            halfWaistView.setVisibility(8);
        } else {
            this.f104740q.setHalfWaistUi(halfWaistBanner);
            HalfWaistView halfWaistView2 = this.f104740q;
            C89219l.m154716b(halfWaistView2, "");
            halfWaistView2.setVisibility(0);
        }
        List<Image> list = ((C44772b) aQ_()).f104456a;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = this.f104731f;
            C89219l.m154716b(textView, "");
            textView.setVisibility(8);
            View view = this.itemView;
            C89219l.m154716b(view, "");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.aam);
            C89219l.m154716b(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
        } else {
            TextView textView2 = this.f104731f;
            C89219l.m154716b(textView2, "");
            textView2.setVisibility(0);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(R.id.aam);
            C89219l.m154716b(appCompatImageView2, "");
            appCompatImageView2.setVisibility(8);
            List<Image> list2 = ((C44772b) aQ_()).f104456a;
            DmtRtlViewPager dmtRtlViewPager = this.f104738o;
            C89219l.m154716b(dmtRtlViewPager, "");
            C44675a aVar = new C44675a(list2, dmtRtlViewPager, "pdp_head");
            this.f104733j = aVar;
            aVar.f104239a = mo70807n().f104148b;
            C44675a aVar2 = this.f104733j;
            if (aVar2 != null) {
                aVar2.f104240b = new C44897d(this);
            }
            C44675a aVar3 = this.f104733j;
            if (aVar3 != null) {
                aVar3.f104242d = new C44898e(this);
            }
            C44675a aVar4 = this.f104733j;
            if (aVar4 != null) {
                aVar4.f104241c = new C44899f(this);
            }
            DmtRtlViewPager dmtRtlViewPager2 = this.f104738o;
            C89219l.m154716b(dmtRtlViewPager2, "");
            dmtRtlViewPager2.setAdapter(this.f104733j);
            TextView textView3 = this.f104731f;
            C89219l.m154716b(textView3, "");
            textView3.setText(C45563h.m88111a(String.valueOf(this.f104734k + 1), String.valueOf(((C44772b) aQ_()).f104456a.size())));
            DmtRtlViewPager dmtRtlViewPager3 = this.f104738o;
            C89219l.m154716b(dmtRtlViewPager3, "");
            dmtRtlViewPager3.setCurrentItem(this.f104734k);
            C44720k kVar = mo70807n().f104162s;
            if (kVar != null) {
                Image image = (Image) C89070n.m154561b((List) ((C44772b) aQ_()).f104456a, this.f104734k);
                if (image != null) {
                    str = image.getUri();
                }
                kVar.mo75871b(str);
            }
            this.f104738o.setOnPageChangeListener(new C44900g(this));
        }
        View view3 = this.itemView;
        if (mo70807n().f104159p) {
            C89219l.m154716b(view3, "");
            TuxIconView tuxIconView = (TuxIconView) view3.findViewById(R.id.tl);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(8);
        }
        if (mo70807n().f104166w) {
            C89219l.m154716b(view3, "");
            ((TuxIconView) view3.findViewById(R.id.a73)).setIconRes(R.raw.icon_arrow_left_ltr);
        } else {
            C89219l.m154716b(view3, "");
            ((TuxIconView) view3.findViewById(R.id.a73)).setIconRes(R.raw.icon_x_mark);
        }
        TuxIconView tuxIconView2 = (TuxIconView) view3.findViewById(R.id.a73);
        C89219l.m154716b(tuxIconView2, "");
        tuxIconView2.setOnClickListener(new C44894b(this));
        TuxIconView tuxIconView3 = (TuxIconView) view3.findViewById(R.id.clv);
        C89219l.m154716b(tuxIconView3, "");
        tuxIconView3.setOnClickListener(new C44895c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$e */
    static final class C44898e extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104750a;

        static {
            Covode.recordClassIndex(53305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44898e(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.f104750a = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            this.f104750a.mo70807n().f104156m = booleanValue;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$j */
    static final class C44903j extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44772b>, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104755a;

        static {
            Covode.recordClassIndex(53310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44903j(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.f104755a = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44772b> jediSimpleViewHolder, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(jediSimpleViewHolder, "");
            C44675a aVar = this.f104755a.f104733j;
            if (aVar != null) {
                aVar.f104239a = booleanValue;
            }
            this.f104755a.f104735l = Boolean.valueOf(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$l */
    static final class C44905l extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44772b>, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104757a;

        static {
            Covode.recordClassIndex(53312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44905l(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.f104757a = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44772b> jediSimpleViewHolder, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(jediSimpleViewHolder, "");
            this.f104757a.f104736m = Integer.valueOf(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$i */
    static final class C44902i extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44772b>, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104754a;

        static {
            Covode.recordClassIndex(53309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44902i(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.f104754a = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44772b> jediSimpleViewHolder, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(jediSimpleViewHolder, "");
            if (floatValue >= 0.0f) {
                ViewGroup viewGroup = this.f104754a.f104732g;
                C89219l.m154716b(viewGroup, "");
                viewGroup.setAlpha(floatValue);
            }
            this.f104754a.mo70808o();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$h */
    static final class C44901h extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44772b>, C44674a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104753a;

        static {
            Covode.recordClassIndex(53308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44901h(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.f104753a = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44772b> jediSimpleViewHolder, C44674a aVar) {
            int i;
            JediSimpleViewHolder<C44772b> jediSimpleViewHolder2 = jediSimpleViewHolder;
            C44674a aVar2 = aVar;
            C89219l.m154721d(jediSimpleViewHolder2, "");
            float f = 1.0f / ((float) C45563h.f106105a);
            Integer num = this.f104753a.f104736m;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            float f2 = f * ((float) i);
            if (!(!C89219l.m154714a((Object) this.f104753a.f104735l, (Object) true)) && f2 < 0.05f) {
                View view = jediSimpleViewHolder2.itemView;
                C89219l.m154716b(view, "");
                TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e05);
                C89219l.m154716b(tuxIconView, "");
                if (tuxIconView.getVisibility() == 0) {
                    PdpViewModel n = this.f104753a.mo70807n();
                    View view2 = jediSimpleViewHolder2.itemView;
                    C89219l.m154716b(view2, "");
                    Context context = view2.getContext();
                    View view3 = jediSimpleViewHolder2.itemView;
                    C89219l.m154716b(view3, "");
                    n.mo75816a(context, aVar2, view3.findViewById(R.id.e05));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PdpHeadViewHolder(android.view.ViewGroup r5, androidx.fragment.app.AbstractC0952i r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559012(0x7f0d0264, float:1.8743356E38)
            r0 = 0
            android.view.View r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a.m87492a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f104737n = r6
            android.view.View r1 = r4.itemView
            r0 = 2131363211(0x7f0a058b, float:1.8346224E38)
            android.view.View r0 = r1.findViewById(r0)
            dmt.viewpager.DmtRtlViewPager r0 = (dmt.viewpager.DmtRtlViewPager) r0
            r4.f104738o = r0
            android.view.View r1 = r4.itemView
            r0 = 2131365039(0x7f0a0caf, float:1.8349932E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f104731f = r0
            android.view.View r1 = r4.itemView
            r0 = 2131364710(0x7f0a0b66, float:1.8349265E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.f104732g = r0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f104739p = r0
            android.view.View r1 = r4.itemView
            r0 = 2131363210(0x7f0a058a, float:1.8346222E38)
            android.view.View r0 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView r0 = (com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView) r0
            r4.f104740q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpHeadViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.i):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$k */
    static final class C44904k extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44772b>, CartEntry, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpHeadViewHolder f104756a;

        static {
            Covode.recordClassIndex(53311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44904k(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.f104756a = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44772b> jediSimpleViewHolder, CartEntry cartEntry) {
            Integer num;
            CartEntry cartEntry2 = cartEntry;
            C89219l.m154721d(jediSimpleViewHolder, "");
            PdpHeadViewHolder pdpHeadViewHolder = this.f104756a;
            View view = pdpHeadViewHolder.itemView;
            pdpHeadViewHolder.mo70807n();
            if (PdpViewModel.m87376a(cartEntry2)) {
                C89219l.m154716b(view, "");
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
                tuxIconView2.setOnClickListener(new C44906m(pdpHeadViewHolder, cartEntry2));
            } else {
                C89219l.m154716b(view, "");
                TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.e05);
                C89219l.m154716b(tuxIconView3, "");
                tuxIconView3.setVisibility(8);
                TuxAlertBadge tuxAlertBadge3 = (TuxAlertBadge) view.findViewById(R.id.e07);
                C89219l.m154716b(tuxAlertBadge3, "");
                tuxAlertBadge3.setVisibility(8);
            }
            pdpHeadViewHolder.mo70808o();
            return C89391z.f203057a;
        }
    }
}
