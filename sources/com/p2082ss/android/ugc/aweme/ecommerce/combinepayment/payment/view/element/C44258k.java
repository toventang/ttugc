package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.C43587b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k */
public final class C44258k extends AbstractC44228g {

    /* renamed from: b */
    private C44086o f103212b;

    /* renamed from: c */
    private C44075e f103213c;

    /* renamed from: d */
    private List<Region> f103214d;

    /* renamed from: e */
    private AbstractC89172b<? super EnumC44266l, C89391z> f103215e;

    /* renamed from: g */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103216g;

    /* renamed from: h */
    private SparseArray f103217h;

    static {
        Covode.recordClassIndex(52570);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    /* renamed from: a */
    public final View mo74090a(int i) {
        if (this.f103217h == null) {
            this.f103217h = new SparseArray();
        }
        View view = (View) this.f103217h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103217h.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final int getContentViewLayoutId() {
        return R.layout.p_;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g
    public final InputWithIndicator getInputView() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final C44075e getElementDTO() {
        return this.f103213c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z>, h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> */
    public final AbstractC89172b<EnumC44266l, C89391z> getOnRegionPanelStatus() {
        return this.f103215e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103216g;
    }

    public final C44086o getPaymentMethod() {
        return this.f103212b;
    }

    public final List<Region> getRegionList() {
        return this.f103214d;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k$b */
    static final class View$OnClickListenerC44260b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44258k f103220a;

        /* renamed from: b */
        final /* synthetic */ C44075e f103221b;

        static {
            Covode.recordClassIndex(52572);
        }

        View$OnClickListenerC44260b(C44258k kVar, C44075e eVar) {
            this.f103220a = kVar;
            this.f103221b = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k$b$a */
        static final class C44261a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC44260b f103222a;

            static {
                Covode.recordClassIndex(52573);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44261a(View$OnClickListenerC44260b bVar) {
                super(0);
                this.f103222a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f103222a.f103220a.getOnRegionPanelStatus().invoke(EnumC44266l.Close);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k$b$b */
        static final class C44262b extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC44260b f103223a;

            static {
                Covode.recordClassIndex(52574);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44262b(View$OnClickListenerC44260b bVar) {
                super(1);
                this.f103223a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
                List<? extends Region> list2 = list;
                C89219l.m154721d(list2, "");
                this.f103223a.f103220a.setRegionList(list2);
                this.f103223a.f103220a.mo75181b();
                this.f103223a.f103220a.mo74091a();
                this.f103223a.f103220a.getOnErrorClear().invoke();
                this.f103223a.f103220a.getOnValueChange().invoke(this.f103223a.f103220a.getValue());
                this.f103223a.f103220a.getOnRegionPanelStatus().invoke(EnumC44266l.Close);
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            Context context = this.f103220a.getContext();
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (eVar != null) {
                List<C44075e> list = this.f103221b.f102750i;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                C43587b.C43588a.m86626a(false, null, i, eVar.getSupportFragmentManager(), null, new C44261a(this), new C44262b(this), null, 147);
                this.f103220a.getOnRegionPanelStatus().invoke(EnumC44266l.Open);
            }
        }
    }

    /* renamed from: b */
    public final void mo75181b() {
        TuxTextView tuxTextView = (TuxTextView) mo74090a(R.id.efx);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(C89070n.m154551a(C89070n.m154584g((Iterable) this.f103214d), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C44265e.f103226a, 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A[SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m> getValue() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44258k.getValue():java.util.List");
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103213c = eVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103212b = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k$c */
    static final class C44263c extends AbstractC89220m implements AbstractC89172b<EnumC44266l, C89391z> {

        /* renamed from: a */
        public static final C44263c f103224a = new C44263c();

        static {
            Covode.recordClassIndex(52575);
        }

        C44263c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC44266l lVar) {
            C89219l.m154721d(lVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k$d */
    static final class C44264d extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44264d f103225a = new C44264d();

        static {
            Covode.recordClassIndex(52576);
        }

        C44264d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    public final void setOnRegionPanelStatus(AbstractC89172b<? super EnumC44266l, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103215e = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103216g = bVar;
    }

    public final void setRegionList(List<Region> list) {
        C89219l.m154721d(list, "");
        this.f103214d = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k$e */
    public static final class C44265e extends AbstractC89220m implements AbstractC89172b<Region, CharSequence> {

        /* renamed from: a */
        public static final C44265e f103226a = new C44265e();

        static {
            Covode.recordClassIndex(52577);
        }

        C44265e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(Region region) {
            Region region2 = region;
            C89219l.m154721d(region2, "");
            String str = region2.f101209a;
            if (str != null) {
                return str;
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k$a */
    static final class View$OnClickListenerC44259a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f103218a;

        /* renamed from: b */
        final /* synthetic */ C44258k f103219b;

        static {
            Covode.recordClassIndex(52571);
        }

        View$OnClickListenerC44259a(String str, C44258k kVar) {
            this.f103218a = str;
            this.f103219b = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f103219b.getContext(), this.f103218a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44258k(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f103214d = C89086z.INSTANCE;
        this.f103215e = C44263c.f103224a;
        this.f103216g = C44264d.f103225a;
    }

    public /* synthetic */ C44258k(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    public final void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj) {
        Region region;
        String str;
        String str2;
        String str3;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        super.mo75055a(eVar, oVar, list, obj);
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        String str4 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                if (C89219l.m154714a((Object) t.getElement(), (Object) "eg_ccdc_global_billing_address_country_regin")) {
                    String paramValue = t.getParamValue();
                    List c = paramValue != null ? C89361p.m154921c(paramValue, new String[]{","}) : null;
                    if (c != null) {
                        str = (String) C89070n.m154561b(c, 1);
                        str2 = (String) C89070n.m154561b(c, 2);
                        str3 = (String) C89070n.m154561b(c, 0);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    region = new Region(str, str2, str3);
                } else {
                    region = new Region(t.getParamValue(), null, null, 6);
                }
                arrayList.add(region);
            }
            this.f103214d = arrayList;
        }
        mo75181b();
        String str5 = eVar.f102753l;
        if (C80538hl.m139614a(str5)) {
            str4 = str5;
        }
        if (str4 != null) {
            View a = mo74090a(R.id.aj_);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) mo74090a(R.id.bh1);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) mo74090a(R.id.bh1)).setOnClickListener(new View$OnClickListenerC44259a(str4, this));
        } else {
            View a2 = mo74090a(R.id.aj_);
            C89219l.m154716b(a2, "");
            a2.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) mo74090a(R.id.bh1);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) mo74090a(R.id.efx);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setHint(eVar.f102749h);
        setOnClickListener(new View$OnClickListenerC44260b(this, eVar));
    }
}
