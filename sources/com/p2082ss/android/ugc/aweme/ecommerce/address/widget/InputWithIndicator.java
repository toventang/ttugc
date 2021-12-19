package com.p2082ss.android.ugc.aweme.ecommerce.address.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45556c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator */
public final class InputWithIndicator extends LinearLayout {

    /* renamed from: d */
    public static final C43577a f101592d = new C43577a((byte) 0);

    /* renamed from: a */
    public AbstractC89171a<Boolean> f101593a;

    /* renamed from: b */
    public int f101594b;

    /* renamed from: c */
    public View.OnClickListener f101595c;

    /* renamed from: e */
    private boolean f101596e;

    /* renamed from: f */
    private C43585a f101597f;

    /* renamed from: g */
    private ImageView f101598g;

    /* renamed from: h */
    private int f101599h;

    /* renamed from: i */
    private View.OnFocusChangeListener f101600i;

    /* renamed from: j */
    private AbstractC89172b<? super Boolean, C89391z> f101601j;

    /* renamed from: k */
    private SparseArray f101602k;

    static {
        Covode.recordClassIndex(51815);
    }

    public InputWithIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static /* synthetic */ void getIndicatorType$annotations() {
    }

    /* renamed from: a */
    public final View mo74041a(int i) {
        if (this.f101602k == null) {
            this.f101602k = new SparseArray();
        }
        View view = (View) this.f101602k.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101602k.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator$a */
    public static final class C43577a {
        static {
            Covode.recordClassIndex(51819);
        }

        private C43577a() {
        }

        public /* synthetic */ C43577a(byte b) {
            this();
        }
    }

    public final boolean getEnableAutoHide() {
        return this.f101596e;
    }

    public final View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.f101600i;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final AbstractC89172b<Boolean, C89391z> getOnIndicatorVisibleChangeListener() {
        return this.f101601j;
    }

    public final EditText getEditText() {
        DmtEditText dmtEditText = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        return dmtEditText;
    }

    public final int getInputType() {
        DmtEditText dmtEditText = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        return dmtEditText.getInputType();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator$b */
    static final class C43578b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ InputWithIndicator f101606a;

        static {
            Covode.recordClassIndex(51820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43578b(InputWithIndicator inputWithIndicator) {
            super(0);
            this.f101606a = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            DmtEditText dmtEditText = (DmtEditText) this.f101606a.mo74041a(R.id.bol);
            C89219l.m154716b(dmtEditText, "");
            Editable text = dmtEditText.getText();
            boolean z = false;
            if (text != null && text.length() > 0) {
                DmtEditText dmtEditText2 = (DmtEditText) this.f101606a.mo74041a(R.id.bol);
                C89219l.m154716b(dmtEditText2, "");
                if (dmtEditText2.isFocused()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    private final C43585a getClearButton() {
        if (this.f101597f == null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            this.f101597f = new C43585a(context, (byte) 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            C43585a aVar = this.f101597f;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.setLayoutParams(layoutParams);
        }
        C43585a aVar2 = this.f101597f;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        return aVar2;
    }

    private final ImageView getImageView() {
        MethodCollector.m26663i(9702);
        if (this.f101598g == null) {
            this.f101598g = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            ImageView imageView = this.f101598g;
            if (imageView == null) {
                C89219l.m154715b();
            }
            imageView.setLayoutParams(layoutParams);
        }
        ImageView imageView2 = this.f101598g;
        if (imageView2 == null) {
            C89219l.m154715b();
        }
        MethodCollector.m26664o(9702);
        return imageView2;
    }

    public final String getText() {
        String obj;
        DmtEditText dmtEditText = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        Editable text = dmtEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = C89361p.m154910b((CharSequence) obj).toString();
        if (obj2 == null) {
            return "";
        }
        return obj2;
    }

    public final void setEnableAutoHide(boolean z) {
        this.f101596e = z;
    }

    public final void setIndicatorSize(int i) {
        this.f101599h = i;
    }

    public final void setOnEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f101600i = onFocusChangeListener;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator$c */
    static final class C43579c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        public static final C43579c f101607a = new C43579c();

        static {
            Covode.recordClassIndex(51821);
        }

        C43579c() {
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

    public final void setAutoHideRules(AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f101593a = aVar;
    }

    public final void setIndicatorClickListener(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        this.f101595c = onClickListener;
    }

    public final void setOnIndicatorVisibleChangeListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f101601j = bVar;
    }

    public final void setContainerPadding(int i) {
        ((FrameLayout) mo74041a(R.id.bom)).setPadding(i, i, i, i);
    }

    public final void setMaxLength(int i) {
        if (i > 0) {
            C45556c.m88106a((EditText) mo74041a(R.id.bol), i);
        }
    }

    public final void setHint(String str) {
        DmtEditText dmtEditText = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        dmtEditText.setHint(str);
    }

    public final void setInputType(int i) {
        DmtEditText dmtEditText = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        dmtEditText.setInputType(i);
    }

    public final void setMaxLines(int i) {
        DmtEditText dmtEditText = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        dmtEditText.setMaxLines(i);
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        C89219l.m154721d(textWatcher, "");
        ((DmtEditText) mo74041a(R.id.bol)).addTextChangedListener(textWatcher);
    }

    public final void setIndicatorVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        FrameLayout frameLayout = (FrameLayout) mo74041a(R.id.bok);
        C89219l.m154716b(frameLayout, "");
        frameLayout.setVisibility(i);
        FrameLayout frameLayout2 = (FrameLayout) mo74041a(R.id.bom);
        C89219l.m154716b(frameLayout2, "");
        frameLayout2.setVisibility(i);
        this.f101601j.invoke(Boolean.valueOf(z));
    }

    public final void setText(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        ((DmtEditText) mo74041a(R.id.bol)).setText(charSequence);
        if (charSequence.length() > 0) {
            DmtEditText dmtEditText = (DmtEditText) mo74041a(R.id.bol);
            C89219l.m154716b(dmtEditText, "");
            ((DmtEditText) mo74041a(R.id.bol)).setSelection(String.valueOf(dmtEditText.getText()).length());
        }
    }

    private /* synthetic */ InputWithIndicator(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InputWithIndicator(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9705);
        this.f101596e = true;
        this.f101593a = new C43578b(this);
        this.f101601j = C43579c.f101607a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091, 16843104, 16843296, R.attr.p3, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.p9, R.attr.p_});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f101594b = obtainStyledAttributes.getInt(4, 0);
        this.f101599h = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        String string = obtainStyledAttributes.getString(7);
        int i = obtainStyledAttributes.getInt(0, Integer.MAX_VALUE);
        int i2 = obtainStyledAttributes.getInt(1, 0);
        int i3 = obtainStyledAttributes.getInt(2, 1);
        float f = (float) obtainStyledAttributes.getInt(9, 15);
        int color = obtainStyledAttributes.getColor(6, C0643b.m2378c(context, R.color.bx));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        View.inflate(context, R.layout.op, this);
        int resourceId = obtainStyledAttributes.getResourceId(8, 80);
        if (resourceId != 80) {
            DmtEditText dmtEditText = (DmtEditText) mo74041a(R.id.bol);
            C89219l.m154716b(dmtEditText, "");
            dmtEditText.setId(resourceId);
        }
        obtainStyledAttributes.recycle();
        setMaxLength(i2);
        setMaxLines(i);
        DmtEditText dmtEditText2 = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText2, "");
        C23163i.m43660a((View) dmtEditText2, (Integer) null, Integer.valueOf(dimensionPixelSize), (Integer) null, Integer.valueOf(dimensionPixelSize), false, 21);
        DmtEditText dmtEditText3 = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText3, "");
        dmtEditText3.setHint(string);
        DmtEditText dmtEditText4 = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText4, "");
        dmtEditText4.setTextSize(f);
        DmtEditText dmtEditText5 = (DmtEditText) mo74041a(R.id.bol);
        C89219l.m154716b(dmtEditText5, "");
        dmtEditText5.setInputType(i3);
        ((DmtEditText) mo74041a(R.id.bol)).setTextColor(color);
        ((DmtEditText) mo74041a(R.id.bol)).addTextChangedListener(new C45571l(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator.C435741 */

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f101603a;

            static {
                Covode.recordClassIndex(51816);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f101603a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l
            public final void afterTextChanged(Editable editable) {
                if (this.f101603a.getEnableAutoHide()) {
                    InputWithIndicator inputWithIndicator = this.f101603a;
                    inputWithIndicator.setIndicatorVisible(inputWithIndicator.f101593a.invoke().booleanValue());
                }
            }
        });
        ((DmtEditText) mo74041a(R.id.bol)).setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator.View$OnFocusChangeListenerC435752 */

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f101604a;

            static {
                Covode.recordClassIndex(51817);
            }

            {
                this.f101604a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                View.OnFocusChangeListener onEditTextFocusChangeListener = this.f101604a.getOnEditTextFocusChangeListener();
                if (onEditTextFocusChangeListener != null) {
                    onEditTextFocusChangeListener.onFocusChange(view, z);
                }
                InputWithIndicator inputWithIndicator = this.f101604a;
                boolean z2 = false;
                if (z) {
                    DmtEditText dmtEditText = (DmtEditText) inputWithIndicator.mo74041a(R.id.bol);
                    C89219l.m154716b(dmtEditText, "");
                    Editable text = dmtEditText.getText();
                    if (text != null && text.length() > 0) {
                        z2 = true;
                    }
                }
                inputWithIndicator.setIndicatorVisible(z2);
            }
        });
        ((FrameLayout) mo74041a(R.id.bok)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator.View$OnClickListenerC435763 */

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f101605a;

            static {
                Covode.recordClassIndex(51818);
            }

            {
                this.f101605a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f101605a.f101594b == 1) {
                    DmtEditText dmtEditText = (DmtEditText) this.f101605a.mo74041a(R.id.bol);
                    C89219l.m154716b(dmtEditText, "");
                    dmtEditText.setText((CharSequence) null);
                }
                View.OnClickListener onClickListener = this.f101605a.f101595c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
        if (this.f101594b == 1 && this.f101596e) {
            FrameLayout frameLayout = (FrameLayout) mo74041a(R.id.bom);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
        }
        if (this.f101599h <= 0) {
            this.f101599h = C34728n.m70946a(16.0d);
        }
        FrameLayout frameLayout2 = (FrameLayout) mo74041a(R.id.bom);
        C89219l.m154716b(frameLayout2, "");
        int i4 = this.f101599h;
        C89219l.m154721d(frameLayout2, "");
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i4;
        frameLayout2.setLayoutParams(layoutParams);
        if (this.f101594b == 1) {
            C43585a clearButton = getClearButton();
            ((FrameLayout) mo74041a(R.id.bom)).removeAllViews();
            ((FrameLayout) mo74041a(R.id.bom)).addView(clearButton);
        }
        MethodCollector.m26664o(9705);
    }
}
