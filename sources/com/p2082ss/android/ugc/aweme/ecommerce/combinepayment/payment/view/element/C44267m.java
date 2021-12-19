package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m */
public final class C44267m extends LinearLayout implements AbstractC44225e {

    /* renamed from: d */
    public static final String f103228d = "need_save";

    /* renamed from: e */
    public static final C44268a f103229e = new C44268a((byte) 0);

    /* renamed from: a */
    public final int f103230a;

    /* renamed from: b */
    public final int f103231b;

    /* renamed from: c */
    public final int f103232c;

    /* renamed from: g */
    private C44086o f103233g;

    /* renamed from: h */
    private C44075e f103234h;

    /* renamed from: i */
    private final int f103235i;

    /* renamed from: j */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103236j;

    /* renamed from: k */
    private final AbstractC89244h f103237k;

    /* renamed from: l */
    private final AbstractC89244h f103238l;

    /* renamed from: m */
    private final AbstractC89244h f103239m;

    private final TuxIconView getIconView() {
        return (TuxIconView) this.f103239m.getValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.f103238l.getValue();
    }

    public final TuxCheckBox getCheckBox() {
        return (TuxCheckBox) this.f103237k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m$a */
    public static final class C44268a {
        static {
            Covode.recordClassIndex(52580);
        }

        private C44268a() {
        }

        public /* synthetic */ C44268a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final C44075e getElementDTO() {
        return this.f103234h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103236j;
    }

    public final C44086o getPaymentMethod() {
        return this.f103233g;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m$b */
    static final class C44269b extends AbstractC89220m implements AbstractC89171a<TuxCheckBox> {

        /* renamed from: a */
        final /* synthetic */ C44267m f103240a;

        /* renamed from: b */
        final /* synthetic */ Context f103241b;

        static {
            Covode.recordClassIndex(52581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44269b(C44267m mVar, Context context) {
            super(0);
            this.f103240a = mVar;
            this.f103241b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxCheckBox invoke() {
            TuxCheckBox tuxCheckBox = new TuxCheckBox(this.f103241b, null, 0, 6);
            tuxCheckBox.setSize(0);
            tuxCheckBox.setClickable(false);
            this.f103240a.addView(tuxCheckBox);
            return tuxCheckBox;
        }
    }

    static {
        Covode.recordClassIndex(52579);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final List<C44084m> getValue() {
        return C89070n.m154516a(new C44084m(f103228d, null, String.valueOf(getCheckBox().isChecked()), null, null, 24, null));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m$g */
    static final class C44274g extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C44267m f103248a;

        /* renamed from: b */
        final /* synthetic */ Context f103249b;

        static {
            Covode.recordClassIndex(52586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44274g(C44267m mVar, Context context) {
            super(0);
            this.f103248a = mVar;
            this.f103249b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            TuxTextView tuxTextView = new TuxTextView(this.f103249b, null, 0, 6);
            tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            tuxTextView.setTextColor(C0643b.m2378c(this.f103249b, R.color.c4));
            tuxTextView.setTuxFont(41);
            C23163i.m43668b(tuxTextView, Integer.valueOf(this.f103248a.f103232c), null, null, null, false, 30);
            this.f103248a.addView(tuxTextView);
            return tuxTextView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m$c */
    static final class C44270c extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C44267m f103242a;

        /* renamed from: b */
        final /* synthetic */ Context f103243b;

        static {
            Covode.recordClassIndex(52582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44270c(C44267m mVar, Context context) {
            super(0);
            this.f103242a = mVar;
            this.f103243b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            TuxIconView tuxIconView = new TuxIconView(this.f103243b, null, 0, 6);
            tuxIconView.setIconRes(R.raw.icon_info_circle);
            tuxIconView.setTintColorRes(R.attr.bj);
            tuxIconView.setIconHeight(this.f103242a.f103230a);
            tuxIconView.setIconWidth(this.f103242a.f103230a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f103242a.f103230a, this.f103242a.f103230a);
            layoutParams.gravity = 16;
            tuxIconView.setLayoutParams(layoutParams);
            C23163i.m43668b(tuxIconView, Integer.valueOf(this.f103242a.f103231b), null, null, null, false, 30);
            this.f103242a.addView(tuxIconView);
            return tuxIconView;
        }
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103234h = eVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103233g = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m$f */
    static final class C44273f extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44273f f103247a = new C44273f();

        static {
            Covode.recordClassIndex(52585);
        }

        C44273f() {
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

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103236j = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m$d */
    static final class View$OnClickListenerC44271d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f103244a;

        /* renamed from: b */
        final /* synthetic */ C44267m f103245b;

        static {
            Covode.recordClassIndex(52583);
        }

        View$OnClickListenerC44271d(String str, C44267m mVar) {
            this.f103244a = str;
            this.f103245b = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f103245b.getContext(), this.f103244a).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m$e */
    static final class View$OnClickListenerC44272e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44267m f103246a;

        static {
            Covode.recordClassIndex(52584);
        }

        View$OnClickListenerC44272e(C44267m mVar) {
            this.f103246a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103246a.getCheckBox().setChecked(!this.f103246a.getCheckBox().isChecked());
            this.f103246a.getOnValueChange().invoke(this.f103246a.getValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44267m(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7360);
        this.f103230a = (int) C13628n.m24520b(context, 14.0f);
        this.f103235i = (int) C13628n.m24520b(context, 16.0f);
        this.f103231b = (int) C13628n.m24520b(context, 4.0f);
        int b = (int) C13628n.m24520b(context, 8.0f);
        this.f103232c = b;
        this.f103236j = C44273f.f103247a;
        this.f103237k = C89250i.m154773a((AbstractC89171a) new C44269b(this, context));
        this.f103238l = C89250i.m154773a((AbstractC89171a) new C44274g(this, context));
        this.f103239m = C89250i.m154773a((AbstractC89171a) new C44270c(this, context));
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        setGravity(16);
        C23163i.m43660a((View) this, (Integer) null, Integer.valueOf(b), (Integer) null, Integer.valueOf(b), false, 21);
        MethodCollector.m26664o(7360);
    }

    public /* synthetic */ C44267m(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    public final void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj) {
        boolean z;
        String paramValue;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        if (list != null) {
            TuxCheckBox checkBox = getCheckBox();
            C44084m mVar = (C44084m) C89070n.m154561b((List) list, 0);
            if (mVar == null || (paramValue = mVar.getParamValue()) == null) {
                z = false;
            } else {
                z = Boolean.parseBoolean(paramValue);
            }
            checkBox.setChecked(z);
        }
        getTitleView().setText(eVar.f102751j);
        String str = oVar.f102810q;
        if (!C80538hl.m139614a(str) || str == null) {
            getIconView().setVisibility(8);
        } else {
            getIconView().setVisibility(0);
            getIconView().setOnClickListener(new View$OnClickListenerC44271d(str, this));
        }
        setOnClickListener(new View$OnClickListenerC44272e(this));
    }
}
