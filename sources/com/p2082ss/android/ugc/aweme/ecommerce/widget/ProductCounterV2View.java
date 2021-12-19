package com.p2082ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.ActivityC0580d;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View */
public final class ProductCounterV2View extends LinearLayout {

    /* renamed from: g */
    public static final C45583a f106150g = new C45583a((byte) 0);

    /* renamed from: a */
    public int f106151a;

    /* renamed from: b */
    public int f106152b;

    /* renamed from: c */
    public String f106153c;

    /* renamed from: d */
    public AbstractC89183m<? super Integer, ? super String, C89391z> f106154d;

    /* renamed from: e */
    public AbstractC89183m<? super Boolean, ? super Integer, C89391z> f106155e;

    /* renamed from: f */
    public AbstractC89171a<C89391z> f106156f;

    /* renamed from: h */
    private SparseArray f106157h;

    static {
        Covode.recordClassIndex(54078);
    }

    public ProductCounterV2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo76805a(int i) {
        if (this.f106157h == null) {
            this.f106157h = new SparseArray();
        }
        View view = (View) this.f106157h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f106157h.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View$a */
    public static final class C45583a {
        static {
            Covode.recordClassIndex(54080);
        }

        private C45583a() {
        }

        public /* synthetic */ C45583a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View$f */
    public static final class C45589f extends NumberKeyListener {
        static {
            Covode.recordClassIndex(54086);
        }

        public final int getInputType() {
            return 3;
        }

        C45589f() {
        }

        /* access modifiers changed from: protected */
        public final char[] getAcceptedChars() {
            return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        }
    }

    public final EditText getInput() {
        DmtEditText dmtEditText = (DmtEditText) mo76805a(R.id.af_);
        C89219l.m154716b(dmtEditText, "");
        return dmtEditText;
    }

    /* renamed from: a */
    public final void mo76806a() {
        int i;
        int c = C0643b.m2378c(getContext(), R.color.bz);
        int c2 = C0643b.m2378c(getContext(), R.color.bx);
        TuxIconView tuxIconView = (TuxIconView) mo76805a(R.id.afb);
        if (this.f106151a >= this.f106152b) {
            i = c;
        } else {
            i = c2;
        }
        tuxIconView.setTintColor(i);
        TuxIconView tuxIconView2 = (TuxIconView) mo76805a(R.id.afa);
        if (this.f106151a > 1) {
            c = c2;
        }
        tuxIconView2.setTintColor(c);
    }

    public final void setClickListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f106156f = aVar;
    }

    public final void setKeyBoardHeightListener(AbstractC89183m<? super Boolean, ? super Integer, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        this.f106155e = mVar;
    }

    public final void setQuantityChangeListener(AbstractC89183m<? super Integer, ? super String, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        this.f106154d = mVar;
    }

    public final void setSkuId(String str) {
        C89219l.m154721d(str, "");
        this.f106153c = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC89171a m88132a(ProductCounterV2View productCounterV2View) {
        AbstractC89171a<C89391z> aVar = productCounterV2View.f106156f;
        if (aVar == null) {
            C89219l.m154710a("clickListener");
        }
        return aVar;
    }

    public final void setMaxQuantity(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 200;
        }
        this.f106152b = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View$e */
    static final class View$OnClickListenerC45588e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProductCounterV2View f106165a;

        static {
            Covode.recordClassIndex(54085);
        }

        View$OnClickListenerC45588e(ProductCounterV2View productCounterV2View) {
            this.f106165a = productCounterV2View;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f106165a.f106151a > 1) {
                this.f106165a.f106154d.invoke(Integer.valueOf(this.f106165a.f106151a - 1), this.f106165a.f106153c);
            } else {
                new C23144b(this.f106165a).mo37640e(R.string.bg7).mo37637b();
            }
            ProductCounterV2View.m88132a(this.f106165a).invoke();
        }
    }

    public final void setQuantity(int i) {
        this.f106151a = i;
        ((DmtEditText) mo76805a(R.id.af_)).setText(String.valueOf(this.f106151a));
        if (((DmtEditText) mo76805a(R.id.af_)).hasFocus()) {
            ((DmtEditText) mo76805a(R.id.af_)).setSelection(String.valueOf(this.f106151a).length());
        }
        mo76806a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View$d */
    static final class View$OnClickListenerC45587d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProductCounterV2View f106164a;

        static {
            Covode.recordClassIndex(54084);
        }

        View$OnClickListenerC45587d(ProductCounterV2View productCounterV2View) {
            this.f106164a = productCounterV2View;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f106164a.f106151a < this.f106164a.f106152b) {
                this.f106164a.f106154d.invoke(Integer.valueOf(this.f106164a.f106151a + 1), this.f106164a.f106153c);
            } else {
                Context context = this.f106164a.getContext();
                C89219l.m154716b(context, "");
                String string = context.getResources().getString(R.string.bg6, Integer.valueOf(this.f106164a.f106152b));
                C89219l.m154716b(string, "");
                new C23144b(this.f106164a).mo37635a(string).mo37637b();
            }
            ProductCounterV2View.m88132a(this.f106164a).invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View$c */
    public static final class C45586c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ DmtEditText f106162a;

        /* renamed from: b */
        final /* synthetic */ ProductCounterV2View f106163b;

        static {
            Covode.recordClassIndex(54083);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            int parseInt;
            C89219l.m154721d(editable, "");
            String obj = editable.toString();
            ProductCounterV2View productCounterV2View = this.f106163b;
            if (obj.length() == 0) {
                parseInt = 0;
            } else {
                parseInt = Integer.parseInt(obj);
            }
            productCounterV2View.f106151a = parseInt;
            if (this.f106163b.f106151a > this.f106163b.f106152b) {
                ProductCounterV2View productCounterV2View2 = this.f106163b;
                productCounterV2View2.f106151a = productCounterV2View2.f106152b;
                Context context = this.f106162a.getContext();
                C89219l.m154716b(context, "");
                String string = context.getResources().getString(R.string.bg6, Integer.valueOf(this.f106163b.f106152b));
                C89219l.m154716b(string, "");
                new C23144b(this.f106163b).mo37635a(string).mo37637b();
                ((DmtEditText) this.f106162a.findViewById(R.id.af_)).setText(String.valueOf(this.f106163b.f106151a));
                this.f106162a.setSelection(String.valueOf(this.f106163b.f106151a).length());
            } else if (this.f106163b.f106151a <= 0) {
                C23144b bVar = new C23144b(this.f106163b);
                Context context2 = this.f106162a.getContext();
                C89219l.m154716b(context2, "");
                bVar.mo37635a(context2.getResources().getString(R.string.bg7)).mo37637b();
            }
            this.f106163b.mo76806a();
        }

        C45586c(DmtEditText dmtEditText, ProductCounterV2View productCounterV2View) {
            this.f106162a = dmtEditText;
            this.f106163b = productCounterV2View;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View$g */
    static final class C45590g extends AbstractC89220m implements AbstractC89183m<Integer, String, C89391z> {

        /* renamed from: a */
        public static final C45590g f106166a = new C45590g();

        static {
            Covode.recordClassIndex(54087);
        }

        C45590g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, String str) {
            num.intValue();
            C89219l.m154721d(str, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View$b */
    static final class View$OnTouchListenerC45584b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ DmtEditText f106159a;

        /* renamed from: b */
        final /* synthetic */ ProductCounterV2View f106160b;

        static {
            Covode.recordClassIndex(54081);
        }

        View$OnTouchListenerC45584b(DmtEditText dmtEditText, ProductCounterV2View productCounterV2View) {
            this.f106159a = dmtEditText;
            this.f106160b = productCounterV2View;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                this.f106159a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View.View$OnTouchListenerC45584b.RunnableC455851 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnTouchListenerC45584b f106161a;

                    static {
                        Covode.recordClassIndex(54082);
                    }

                    {
                        this.f106161a = r1;
                    }

                    public final void run() {
                        int i;
                        DmtEditText dmtEditText = this.f106161a.f106159a;
                        Editable text = this.f106161a.f106159a.getText();
                        if (text != null) {
                            i = text.length();
                        } else {
                            i = 0;
                        }
                        dmtEditText.setSelection(i);
                    }
                });
            }
            ProductCounterV2View.m88132a(this.f106160b).invoke();
            return false;
        }
    }

    private /* synthetic */ ProductCounterV2View(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProductCounterV2View(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8198);
        this.f106152b = 200;
        this.f106153c = "";
        this.f106154d = C45590g.f106166a;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.q8, this, true);
        if (context instanceof ActivityC0218d) {
            new KeyBoardVisibilityUtil((ActivityC0580d) context, 32, new AbstractC89183m<Boolean, Integer, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View.C455821 */

                /* renamed from: a */
                final /* synthetic */ ProductCounterV2View f106158a;

                static {
                    Covode.recordClassIndex(54079);
                }

                {
                    this.f106158a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
                    boolean booleanValue = bool.booleanValue();
                    int intValue = num.intValue();
                    if (!booleanValue && ((DmtEditText) this.f106158a.mo76805a(R.id.af_)).hasFocus()) {
                        if (this.f106158a.f106151a <= 0) {
                            this.f106158a.f106151a = 1;
                            ((DmtEditText) this.f106158a.mo76805a(R.id.af_)).setText(String.valueOf(this.f106158a.f106151a));
                        }
                        this.f106158a.f106154d.invoke(Integer.valueOf(this.f106158a.f106151a), this.f106158a.f106153c);
                        ((DmtEditText) this.f106158a.mo76805a(R.id.af_)).clearFocus();
                    }
                    AbstractC89183m<? super Boolean, ? super Integer, C89391z> mVar = this.f106158a.f106155e;
                    if (mVar == null) {
                        C89219l.m154710a("keyBoardHeightListener");
                    }
                    mVar.invoke(Boolean.valueOf(booleanValue), Integer.valueOf(intValue));
                    return C89391z.f203057a;
                }
            });
        }
        ((TuxIconView) mo76805a(R.id.afb)).setOnClickListener(new View$OnClickListenerC45587d(this));
        ((TuxIconView) mo76805a(R.id.afa)).setOnClickListener(new View$OnClickListenerC45588e(this));
        DmtEditText dmtEditText = (DmtEditText) mo76805a(R.id.af_);
        dmtEditText.setOnTouchListener(new View$OnTouchListenerC45584b(dmtEditText, this));
        dmtEditText.addTextChangedListener(new C45586c(dmtEditText, this));
        dmtEditText.setKeyListener(new C45589f());
        if (C80471gb.m139482a()) {
            int i = Build.VERSION.SDK_INT;
            TuxIconView tuxIconView = (TuxIconView) mo76805a(R.id.afa);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setBackground(C0643b.m2369a(getContext(), (int) R.drawable.xo));
            TuxIconView tuxIconView2 = (TuxIconView) mo76805a(R.id.afb);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setBackground(C0643b.m2369a(getContext(), (int) R.drawable.xn));
        }
        MethodCollector.m26664o(8198);
    }
}
