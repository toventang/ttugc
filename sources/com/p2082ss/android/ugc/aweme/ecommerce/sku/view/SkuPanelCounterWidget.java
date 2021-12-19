package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget */
public final class SkuPanelCounterWidget extends SkuPanelBaseWidget implements AbstractC33974au {

    /* renamed from: k */
    public static final C45451a f105899k = new C45451a((byte) 0);

    /* renamed from: h */
    public TuxIconView f105900h;

    /* renamed from: i */
    public TuxIconView f105901i;

    /* renamed from: j */
    public DmtEditText f105902j;

    /* renamed from: l */
    private final int f105903l = R.layout.qw;

    static {
        Covode.recordClassIndex(53936);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget$a */
    public static final class C45451a {
        static {
            Covode.recordClassIndex(53937);
        }

        private C45451a() {
        }

        public /* synthetic */ C45451a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget$f */
    public static final class C45460f extends NumberKeyListener {
        static {
            Covode.recordClassIndex(53946);
        }

        public final int getInputType() {
            return 3;
        }

        C45460f() {
        }

        /* access modifiers changed from: protected */
        public final char[] getAcceptedChars() {
            return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return this.f105903l;
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: i */
    public final void mo39087i() {
        super.mo39087i();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    /* renamed from: m */
    public final void mo76668m() {
        super.mo76668m();
        SkuPanelViewModel l = mo76667l();
        AbstractC88412b unused = selectSubscribe(l, C45479c.f105947a, C45480d.f105948a, new C20370ah(), new C45461g(this));
        AbstractC88412b unused2 = selectSubscribe(l, C45481e.f105949a, new C20370ah(), new C45462h(l, this));
    }

    /* renamed from: o */
    public final void mo76674o() {
        String str;
        IEventCenter a = EventCenter.m87158a();
        SkuPanelStarter.SkuEnterParams skuEnterParams = mo76667l().f106007e;
        if (skuEnterParams == null || (str = skuEnterParams.getProductId()) == null) {
            str = "";
        }
        String b = C80342dg.m139300a().mo46674b(new SkuPanelStarter.SkuOperationParams(str, 1));
        C89219l.m154716b(b, "");
        a.mo75479a("ec_sku_panel_operated", b);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    /* renamed from: n */
    public final void mo76669n() {
        super.mo76669n();
        this.f105900h = (TuxIconView) mo76666a(R.id.e28);
        this.f105901i = (TuxIconView) mo76666a(R.id.e29);
        this.f105902j = (DmtEditText) mo76666a(R.id.e27);
        if (C80471gb.m139482a()) {
            int i = Build.VERSION.SDK_INT;
            TuxIconView tuxIconView = this.f105900h;
            if (tuxIconView == null) {
                C89219l.m154710a("minusBtn");
            }
            tuxIconView.setBackground(C0643b.m2369a(mo39077a().getContext(), (int) R.drawable.xo));
            TuxIconView tuxIconView2 = this.f105901i;
            if (tuxIconView2 == null) {
                C89219l.m154710a("plusBtn");
            }
            tuxIconView2.setBackground(C0643b.m2369a(mo39077a().getContext(), (int) R.drawable.xn));
        }
        TuxIconView tuxIconView3 = this.f105901i;
        if (tuxIconView3 == null) {
            C89219l.m154710a("plusBtn");
        }
        tuxIconView3.setOnClickListener(new View$OnClickListenerC45454c(this));
        TuxIconView tuxIconView4 = this.f105900h;
        if (tuxIconView4 == null) {
            C89219l.m154710a("minusBtn");
        }
        tuxIconView4.setOnClickListener(new View$OnClickListenerC45456d(this));
        DmtEditText dmtEditText = this.f105902j;
        if (dmtEditText == null) {
            C89219l.m154710a("counterInput");
        }
        dmtEditText.setOnTouchListener(new View$OnTouchListenerC45458e(dmtEditText));
        DmtEditText dmtEditText2 = this.f105902j;
        if (dmtEditText2 == null) {
            C89219l.m154710a("counterInput");
        }
        dmtEditText2.addTextChangedListener(new C45452b(dmtEditText2, this));
        DmtEditText dmtEditText3 = this.f105902j;
        if (dmtEditText3 == null) {
            C89219l.m154710a("counterInput");
        }
        dmtEditText3.setKeyListener(new C45460f());
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtEditText m88014a(SkuPanelCounterWidget skuPanelCounterWidget) {
        DmtEditText dmtEditText = skuPanelCounterWidget.f105902j;
        if (dmtEditText == null) {
            C89219l.m154710a("counterInput");
        }
        return dmtEditText;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget$c */
    static final class View$OnClickListenerC45454c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SkuPanelCounterWidget f105908a;

        static {
            Covode.recordClassIndex(53940);
        }

        View$OnClickListenerC45454c(SkuPanelCounterWidget skuPanelCounterWidget) {
            this.f105908a = skuPanelCounterWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SkuPanelCounterWidget skuPanelCounterWidget = this.f105908a;
            skuPanelCounterWidget.withState(skuPanelCounterWidget.mo76667l(), new AbstractC89172b<SkuState, SkuState>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.View$OnClickListenerC45454c.C454551 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC45454c f105909a;

                static {
                    Covode.recordClassIndex(53941);
                }

                {
                    this.f105909a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ SkuState invoke(SkuState skuState) {
                    SkuState skuState2 = skuState;
                    C89219l.m154721d(skuState2, "");
                    if (skuState2.getCurrentQuantity() < skuState2.getCurrentMaxQuantity()) {
                        this.f105909a.f105908a.mo76667l().mo76701a(skuState2.getCurrentQuantity() + 1);
                    } else {
                        Context context = this.f105909a.f105908a.mo39077a().getContext();
                        C89219l.m154716b(context, "");
                        String string = context.getResources().getString(R.string.bg6, Integer.valueOf(skuState2.getCurrentMaxQuantity()));
                        C89219l.m154716b(string, "");
                        new C79459a(this.f105909a.f105908a.mo39077a().getContext()).mo123052a(string).mo123053a();
                    }
                    return skuState2;
                }
            });
            this.f105908a.mo76674o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget$d */
    static final class View$OnClickListenerC45456d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SkuPanelCounterWidget f105910a;

        static {
            Covode.recordClassIndex(53942);
        }

        View$OnClickListenerC45456d(SkuPanelCounterWidget skuPanelCounterWidget) {
            this.f105910a = skuPanelCounterWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SkuPanelCounterWidget skuPanelCounterWidget = this.f105910a;
            skuPanelCounterWidget.withState(skuPanelCounterWidget.mo76667l(), new AbstractC89172b<SkuState, SkuState>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.View$OnClickListenerC45456d.C454571 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC45456d f105911a;

                static {
                    Covode.recordClassIndex(53943);
                }

                {
                    this.f105911a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ SkuState invoke(SkuState skuState) {
                    SkuState skuState2 = skuState;
                    C89219l.m154721d(skuState2, "");
                    if (skuState2.getCurrentQuantity() > 1) {
                        this.f105911a.f105910a.mo76667l().mo76701a(skuState2.getCurrentQuantity() - 1);
                    } else {
                        new C79459a(this.f105911a.f105910a.mo39077a().getContext()).mo123050a(R.string.bg7).mo123053a();
                    }
                    return skuState2;
                }
            });
            this.f105910a.mo76674o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget$b */
    public static final class C45452b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ DmtEditText f105904a;

        /* renamed from: b */
        final /* synthetic */ SkuPanelCounterWidget f105905b;

        static {
            Covode.recordClassIndex(53938);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            int i = 0;
            if (str == null || str.length() == 0) {
                this.f105905b.mo76667l().mo76701a(0);
                return;
            }
            final int parseInt = Integer.parseInt(str);
            SkuPanelCounterWidget skuPanelCounterWidget = this.f105905b;
            skuPanelCounterWidget.withState(skuPanelCounterWidget.mo76667l(), new AbstractC89172b<SkuState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.C45452b.C454531 */

                /* renamed from: a */
                final /* synthetic */ C45452b f105906a;

                static {
                    Covode.recordClassIndex(53939);
                }

                {
                    this.f105906a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(SkuState skuState) {
                    SkuState skuState2 = skuState;
                    C89219l.m154721d(skuState2, "");
                    if (parseInt > skuState2.getCurrentMaxQuantity()) {
                        View view = this.f105906a.f105905b.f56005e;
                        if (view != null) {
                            Context context = this.f105906a.f105905b.mo39077a().getContext();
                            C89219l.m154716b(context, "");
                            String string = context.getResources().getString(R.string.bg6, Integer.valueOf(skuState2.getCurrentMaxQuantity()));
                            C89219l.m154716b(string, "");
                            new C23144b(view).mo37635a(string).mo37637b();
                        }
                        this.f105906a.f105904a.setText(String.valueOf(skuState2.getCurrentMaxQuantity()));
                    } else if (parseInt <= 0) {
                        View view2 = this.f105906a.f105905b.f56005e;
                        if (view2 != null) {
                            Context context2 = this.f105906a.f105905b.mo39077a().getContext();
                            C89219l.m154716b(context2, "");
                            String string2 = context2.getResources().getString(R.string.bg7);
                            C89219l.m154716b(string2, "");
                            new C23144b(view2).mo37635a(string2).mo37637b();
                        }
                        this.f105906a.f105904a.setText("1");
                    } else {
                        this.f105906a.f105905b.mo76667l().mo76701a(parseInt);
                    }
                    return C89391z.f203057a;
                }
            });
            DmtEditText dmtEditText = this.f105904a;
            Editable text = dmtEditText.getText();
            if (text != null) {
                i = text.length();
            }
            dmtEditText.setSelection(i);
        }

        C45452b(DmtEditText dmtEditText, SkuPanelCounterWidget skuPanelCounterWidget) {
            this.f105904a = dmtEditText;
            this.f105905b = skuPanelCounterWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget$e */
    static final class View$OnTouchListenerC45458e implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ DmtEditText f105912a;

        static {
            Covode.recordClassIndex(53944);
        }

        View$OnTouchListenerC45458e(DmtEditText dmtEditText) {
            this.f105912a = dmtEditText;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            this.f105912a.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.View$OnTouchListenerC45458e.RunnableC454591 */

                /* renamed from: a */
                final /* synthetic */ View$OnTouchListenerC45458e f105913a;

                static {
                    Covode.recordClassIndex(53945);
                }

                {
                    this.f105913a = r1;
                }

                public final void run() {
                    int i;
                    DmtEditText dmtEditText = this.f105913a.f105912a;
                    Editable text = this.f105913a.f105912a.getText();
                    if (text != null) {
                        i = text.length();
                    } else {
                        i = 0;
                    }
                    dmtEditText.setSelection(i);
                }
            });
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget$h */
    static final class C45462h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelViewModel f105915a;

        /* renamed from: b */
        final /* synthetic */ SkuPanelCounterWidget f105916b;

        static {
            Covode.recordClassIndex(53948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45462h(SkuPanelViewModel skuPanelViewModel, SkuPanelCounterWidget skuPanelCounterWidget) {
            super(2);
            this.f105915a = skuPanelViewModel;
            this.f105916b = skuPanelCounterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            AbstractC20477i iVar2 = iVar;
            final Boolean bool2 = bool;
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f105916b.mo76667l(), new AbstractC89172b<SkuState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.C45462h.C454631 */

                /* renamed from: a */
                final /* synthetic */ C45462h f105917a;

                static {
                    Covode.recordClassIndex(53949);
                }

                {
                    this.f105917a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(SkuState skuState) {
                    int i;
                    SkuState skuState2 = skuState;
                    C89219l.m154721d(skuState2, "");
                    Boolean bool = bool2;
                    if (bool != null && !C89219l.m154714a((Object) bool, (Object) true)) {
                        try {
                            String valueOf = String.valueOf(SkuPanelCounterWidget.m88014a(this.f105917a.f105916b).getText());
                            if (C89219l.m154714a((Object) valueOf, (Object) "")) {
                                i = 0;
                            } else {
                                i = Integer.parseInt(valueOf);
                            }
                            if (i > skuState2.getCurrentMaxQuantity()) {
                                this.f105917a.f105915a.mo76701a(skuState2.getCurrentMaxQuantity());
                                SkuPanelCounterWidget.m88014a(this.f105917a.f105916b).setText(String.valueOf(skuState2.getCurrentMaxQuantity()));
                                Context context = this.f105917a.f105916b.mo39077a().getContext();
                                C89219l.m154716b(context, "");
                                String string = context.getResources().getString(R.string.bg6, Integer.valueOf(skuState2.getCurrentMaxQuantity()));
                                C89219l.m154716b(string, "");
                                new C79459a(this.f105917a.f105916b.mo39077a().getContext()).mo123052a(string).mo123053a();
                            } else if (i <= 0) {
                                this.f105917a.f105915a.mo76701a(1);
                                SkuPanelCounterWidget.m88014a(this.f105917a.f105916b).setText("1");
                                new C79459a(this.f105917a.f105916b.mo39077a().getContext()).mo123050a(R.string.bg7).mo123053a();
                            } else {
                                this.f105917a.f105915a.mo76701a(i);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        KeyboardUtils.m70897c(SkuPanelCounterWidget.m88014a(this.f105917a.f105916b));
                        SkuPanelCounterWidget.m88014a(this.f105917a.f105916b).post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.C45462h.C454631.RunnableC454641 */

                            /* renamed from: a */
                            final /* synthetic */ C454631 f105919a;

                            static {
                                Covode.recordClassIndex(53950);
                            }

                            {
                                this.f105919a = r1;
                            }

                            public final void run() {
                                SkuPanelCounterWidget.m88014a(this.f105919a.f105917a.f105916b).clearFocus();
                            }
                        });
                        this.f105917a.f105916b.mo76674o();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget$g */
    static final class C45461g extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelCounterWidget f105914a;

        static {
            Covode.recordClassIndex(53947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45461g(SkuPanelCounterWidget skuPanelCounterWidget) {
            super(3);
            this.f105914a = skuPanelCounterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num, Integer num2) {
            int i;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            String str = "";
            C89219l.m154721d(iVar, str);
            DmtEditText a = SkuPanelCounterWidget.m88014a(this.f105914a);
            if (intValue != 0) {
                str = String.valueOf(intValue);
            }
            a.setText(str);
            int c = C0643b.m2378c(C17879g.m33104a(), R.color.bz);
            int c2 = C0643b.m2378c(C17879g.m33104a(), R.color.bx);
            TuxIconView tuxIconView = this.f105914a.f105901i;
            if (tuxIconView == null) {
                C89219l.m154710a("plusBtn");
            }
            if (intValue >= intValue2) {
                i = c;
            } else {
                i = c2;
            }
            tuxIconView.setTintColor(i);
            TuxIconView tuxIconView2 = this.f105914a.f105900h;
            if (tuxIconView2 == null) {
                C89219l.m154710a("minusBtn");
            }
            if (intValue > 1) {
                c = c2;
            }
            tuxIconView2.setTintColor(c);
            return C89391z.f203057a;
        }
    }
}
