package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44161t;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a.C44048c;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a */
public final class C44185a extends LinearLayout implements AbstractC44225e {

    /* renamed from: c */
    public static final C44186a f103044c = new C44186a((byte) 0);

    /* renamed from: a */
    public final int f103045a;

    /* renamed from: b */
    public final int f103046b;

    /* renamed from: d */
    private C44086o f103047d;

    /* renamed from: e */
    private C44075e f103048e;

    /* renamed from: g */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103049g;

    /* renamed from: h */
    private C44161t f103050h;

    /* renamed from: i */
    private AbstractC89172b<? super EnumC44266l, C89391z> f103051i;

    /* renamed from: j */
    private AbstractC89172b<? super Boolean, C89391z> f103052j;

    /* renamed from: k */
    private Address f103053k;

    /* renamed from: l */
    private boolean f103054l;

    /* renamed from: m */
    private final AbstractC89244h f103055m;

    /* renamed from: n */
    private SparseArray f103056n;

    static {
        Covode.recordClassIndex(52497);
    }

    /* renamed from: a */
    private View m86968a() {
        if (this.f103056n == null) {
            this.f103056n = new SparseArray();
        }
        View view = (View) this.f103056n.get(R.id.ede);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.ede);
        this.f103056n.put(R.id.ede, findViewById);
        return findViewById;
    }

    public final TuxIconView getIconView() {
        return (TuxIconView) this.f103055m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$a */
    public static final class C44186a {
        static {
            Covode.recordClassIndex(52498);
        }

        private C44186a() {
        }

        public /* synthetic */ C44186a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m86970a(C44075e eVar, Address address) {
            C89219l.m154721d(eVar, "");
            if (address == null) {
                return false;
            }
            List<C44075e> list = eVar.f102750i;
            if (list != null) {
                for (T t : list) {
                    String str = t.f102742a;
                    if (str == null) {
                        return false;
                    }
                    int hashCode = str.hashCode();
                    if (hashCode != -304863367) {
                        if (hashCode != 1981981399) {
                            if (hashCode == 2002908406 && str.equals("eg_ccdc_global_billing_address_street_mobile")) {
                            }
                        } else if (str.equals("eg_ccdc_global_billing_address")) {
                        }
                    } else if (str.equals("eg_ccdc_global_billing_address_postal_code")) {
                    }
                    String a = address.mo73871a(t.f102742a);
                    if (a == null || a.length() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final C44075e getElementDTO() {
        return this.f103048e;
    }

    public final C44161t getLogger() {
        return this.f103050h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z>, h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> */
    public final AbstractC89172b<EnumC44266l, C89391z> getOnRegionPanelStatus() {
        return this.f103051i;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final AbstractC89172b<Boolean, C89391z> getOnUseShippingAddressChange() {
        return this.f103052j;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103049g;
    }

    public final C44086o getPaymentMethod() {
        return this.f103047d;
    }

    public final Address getShippingAddress() {
        return this.f103053k;
    }

    public final boolean getUseShippingAddress() {
        return this.f103054l;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$b */
    public static final class C44187b implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103057a;

        static {
            Covode.recordClassIndex(52499);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44185a.C44187b.C441881 */

                /* renamed from: a */
                public int f103058a;

                /* renamed from: b */
                final /* synthetic */ C44187b f103059b;

                static {
                    Covode.recordClassIndex(52500);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103058a < this.f103059b.f103057a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103059b.f103057a;
                    int i = this.f103058a;
                    this.f103058a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103059b = r1;
                }
            };
        }

        public C44187b(ViewGroup viewGroup) {
            this.f103057a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$d */
    public static final class C44190d implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103062a;

        static {
            Covode.recordClassIndex(52502);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44185a.C44190d.C441911 */

                /* renamed from: a */
                public int f103063a;

                /* renamed from: b */
                final /* synthetic */ C44190d f103064b;

                static {
                    Covode.recordClassIndex(52503);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103063a < this.f103064b.f103062a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103064b.f103062a;
                    int i = this.f103063a;
                    this.f103063a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103064b = r1;
                }
            };
        }

        public C44190d(ViewGroup viewGroup) {
            this.f103062a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$l */
    public static final class C44199l implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103084a;

        static {
            Covode.recordClassIndex(52511);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44185a.C44199l.C442001 */

                /* renamed from: a */
                public int f103085a;

                /* renamed from: b */
                final /* synthetic */ C44199l f103086b;

                static {
                    Covode.recordClassIndex(52512);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103085a < this.f103086b.f103084a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103086b.f103084a;
                    int i = this.f103085a;
                    this.f103085a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103086b = r1;
                }
            };
        }

        public C44199l(ViewGroup viewGroup) {
            this.f103084a = viewGroup;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final List<C44084m> getValue() {
        List<C44084m> value;
        C44187b<View> bVar = new C44187b(this);
        ArrayList arrayList = new ArrayList();
        for (View view : bVar) {
            if ((view instanceof AbstractC44225e) && (value = ((AbstractC44225e) view).getValue()) != null) {
                arrayList.add(value);
            }
        }
        return C89070n.m154528a((Iterable) arrayList);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$c */
    static final class C44189c extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C44185a f103060a;

        /* renamed from: b */
        final /* synthetic */ Context f103061b;

        static {
            Covode.recordClassIndex(52501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44189c(C44185a aVar, Context context) {
            super(0);
            this.f103060a = aVar;
            this.f103061b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            MethodCollector.m26663i(8162);
            TuxIconView tuxIconView = new TuxIconView(this.f103061b, null, 0, 6);
            tuxIconView.setIconRes(R.raw.icon_info_circle);
            tuxIconView.setTintColorRes(R.attr.bj);
            tuxIconView.setIconHeight(this.f103060a.f103045a);
            tuxIconView.setIconWidth(this.f103060a.f103045a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f103060a.f103045a, this.f103060a.f103045a);
            layoutParams.gravity = 16;
            tuxIconView.setLayoutParams(layoutParams);
            C23163i.m43668b(tuxIconView, Integer.valueOf(this.f103060a.f103046b), null, null, null, false, 30);
            ((ViewGroup) this.f103060a.findViewById(R.id.cf5)).addView(tuxIconView);
            MethodCollector.m26664o(8162);
            return tuxIconView;
        }
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103048e = eVar;
    }

    public final void setLogger(C44161t tVar) {
        this.f103050h = tVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103047d = oVar;
    }

    public final void setShippingAddress(Address address) {
        this.f103053k = address;
    }

    public final void setUseShippingAddress(boolean z) {
        this.f103054l = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$i */
    static final class C44196i extends AbstractC89220m implements AbstractC89172b<EnumC44266l, C89391z> {

        /* renamed from: a */
        public static final C44196i f103081a = new C44196i();

        static {
            Covode.recordClassIndex(52508);
        }

        C44196i() {
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$j */
    static final class C44197j extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        public static final C44197j f103082a = new C44197j();

        static {
            Covode.recordClassIndex(52509);
        }

        C44197j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$k */
    static final class C44198k extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44198k f103083a = new C44198k();

        static {
            Covode.recordClassIndex(52510);
        }

        C44198k() {
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
        this.f103051i = bVar;
    }

    public final void setOnUseShippingAddressChange(AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103052j = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103049g = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$f */
    static final class C44193f extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44075e f103069a;

        /* renamed from: b */
        final /* synthetic */ C44185a f103070b;

        /* renamed from: c */
        final /* synthetic */ C44086o f103071c;

        /* renamed from: d */
        final /* synthetic */ C44075e f103072d;

        static {
            Covode.recordClassIndex(52505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44193f(C44075e eVar, C44185a aVar, C44086o oVar, C44075e eVar2) {
            super(1);
            this.f103069a = eVar;
            this.f103070b = aVar;
            this.f103071c = oVar;
            this.f103072d = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
            C89219l.m154721d(list, "");
            this.f103070b.getOnValueChange().invoke(this.f103070b.getValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$h */
    static final class View$OnClickListenerC44195h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f103077a;

        /* renamed from: b */
        final /* synthetic */ CommonItemView f103078b;

        /* renamed from: c */
        final /* synthetic */ C44185a f103079c;

        /* renamed from: d */
        final /* synthetic */ C44075e f103080d;

        static {
            Covode.recordClassIndex(52507);
        }

        View$OnClickListenerC44195h(String str, CommonItemView commonItemView, C44185a aVar, C44075e eVar) {
            this.f103077a = str;
            this.f103078b = commonItemView;
            this.f103079c = aVar;
            this.f103080d = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f103078b.getContext(), this.f103077a).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$e */
    static final class C44192e extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, String> {

        /* renamed from: a */
        final /* synthetic */ C44075e f103065a;

        /* renamed from: b */
        final /* synthetic */ C44185a f103066b;

        /* renamed from: c */
        final /* synthetic */ C44086o f103067c;

        /* renamed from: d */
        final /* synthetic */ C44075e f103068d;

        static {
            Covode.recordClassIndex(52504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44192e(C44075e eVar, C44185a aVar, C44086o oVar, C44075e eVar2) {
            super(1);
            this.f103065a = eVar;
            this.f103066b = aVar;
            this.f103067c = oVar;
            this.f103068d = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(List<? extends C44084m> list) {
            boolean z;
            List<? extends C44084m> list2 = list;
            C89219l.m154721d(list2, "");
            String a = C44048c.m86895a(this.f103065a, this.f103067c, list2);
            C44161t logger = this.f103066b.getLogger();
            if (logger != null) {
                String c = this.f103067c.mo74952c();
                if (a == null) {
                    z = true;
                } else {
                    z = false;
                }
                logger.mo75010a((C44161t) c, (String) z, (boolean) this.f103065a.f102742a, (String) null);
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$g */
    public static final class C44194g extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f103073a = 700;

        /* renamed from: b */
        final /* synthetic */ CommonItemView f103074b;

        /* renamed from: c */
        final /* synthetic */ C44185a f103075c;

        /* renamed from: d */
        final /* synthetic */ C44075e f103076d;

        static {
            Covode.recordClassIndex(52506);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                CommonItemView commonItemView = this.f103074b;
                commonItemView.setChecked(!commonItemView.mo27138d());
                this.f103075c.setUseShippingAddress(this.f103074b.mo27138d());
                this.f103075c.getOnUseShippingAddressChange().invoke(Boolean.valueOf(this.f103075c.getUseShippingAddress()));
                this.f103075c.setAllElementsVisible(!this.f103074b.mo27138d());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44194g(CommonItemView commonItemView, C44185a aVar, C44075e eVar) {
            super(700);
            this.f103074b = commonItemView;
            this.f103075c = aVar;
            this.f103076d = eVar;
        }
    }

    public final void setAllElementsVisible(boolean z) {
        int i;
        for (View view : new C44199l(this)) {
            if (view instanceof AbstractC44225e) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44185a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7786);
        this.f103045a = (int) C13628n.m24520b(context, 14.0f);
        this.f103046b = (int) C13628n.m24520b(context, 4.0f);
        this.f103049g = C44198k.f103083a;
        this.f103051i = C44196i.f103081a;
        this.f103052j = C44197j.f103082a;
        this.f103054l = true;
        this.f103055m = C89250i.m154773a((AbstractC89171a) new C44189c(this, context));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        View.inflate(context, R.layout.o4, this);
        CommonItemView commonItemView = (CommonItemView) m86968a();
        C89219l.m154716b(commonItemView, "");
        C23163i.m43668b(commonItemView, null, 0, null, null, false, 29);
        C0792v.m2746a(m86968a(), (Drawable) null);
        MethodCollector.m26664o(7786);
    }

    public /* synthetic */ C44185a(Context context, byte b) {
        this(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r8 != null) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0185  */
    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75055a(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e r24, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o r25, java.util.List<com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m> r26, java.lang.Object r27) {
        /*
        // Method dump skipped, instructions count: 578
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44185a.mo75055a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, java.util.List, java.lang.Object):void");
    }
}
