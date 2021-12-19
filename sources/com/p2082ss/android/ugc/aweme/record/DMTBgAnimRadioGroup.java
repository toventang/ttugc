package com.p2082ss.android.ugc.aweme.record;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup */
public final class DMTBgAnimRadioGroup extends FrameLayout {

    /* renamed from: a */
    public int f149958a;

    /* renamed from: b */
    public float f149959b;

    /* renamed from: c */
    public float f149960c;

    /* renamed from: d */
    public AbstractC66762b f149961d;

    /* renamed from: e */
    public final View f149962e;

    /* renamed from: f */
    public final ValueAnimator f149963f;

    /* renamed from: g */
    private int f149964g;

    /* renamed from: h */
    private float f149965h;

    /* renamed from: i */
    private int f149966i;

    /* renamed from: j */
    private int f149967j;

    /* renamed from: k */
    private final LinearLayout f149968k;

    /* renamed from: l */
    private final View.OnClickListener f149969l;

    /* renamed from: com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup$b */
    public interface AbstractC66762b {
        static {
            Covode.recordClassIndex(78334);
        }

        /* renamed from: a */
        void mo88359a(int i);

        /* renamed from: b */
        boolean mo88360b(int i);
    }

    static {
        Covode.recordClassIndex(78332);
    }

    public DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final LinearLayout getContainer() {
        return this.f149968k;
    }

    public final int getItemTextNormalColor() {
        return this.f149966i;
    }

    public final int getItemTextSelectColor() {
        return this.f149967j;
    }

    public final float getItemTextSize() {
        return this.f149965h;
    }

    public final void setItemTextNormalColor(int i) {
        this.f149966i = i;
    }

    public final void setItemTextSelectColor(int i) {
        this.f149967j = i;
    }

    public final void setItemTextSize(float f) {
        this.f149965h = f;
    }

    public final void setOnItemChangeListener(AbstractC66762b bVar) {
        C89219l.m154721d(bVar, "");
        this.f149961d = bVar;
    }

    public final void setCurrentItem(int i) {
        AbstractC66762b bVar;
        if (!(i == this.f149958a || (bVar = this.f149961d) == null)) {
            bVar.mo88359a(i);
        }
        this.f149958a = i;
        mo105717a(this.f149968k.getChildAt(i), this.f149967j);
    }

    /* renamed from: com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup$a */
    static final class C66761a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DMTBgAnimRadioGroup f149970a;

        static {
            Covode.recordClassIndex(78333);
        }

        C66761a(DMTBgAnimRadioGroup dMTBgAnimRadioGroup) {
            this.f149970a = dMTBgAnimRadioGroup;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f149970a.f149962e.setX(this.f149970a.f149959b + ((this.f149970a.f149960c - this.f149970a.f149959b) * floatValue));
            if (floatValue == 1.0f) {
                DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f149970a;
                dMTBgAnimRadioGroup.mo105717a(dMTBgAnimRadioGroup.getContainer().getChildAt(this.f149970a.f149958a), this.f149970a.getItemTextSelectColor());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup$c */
    static final class View$OnClickListenerC66763c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DMTBgAnimRadioGroup f149971a;

        static {
            Covode.recordClassIndex(78335);
        }

        View$OnClickListenerC66763c(DMTBgAnimRadioGroup dMTBgAnimRadioGroup) {
            this.f149971a = dMTBgAnimRadioGroup;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f149971a;
            dMTBgAnimRadioGroup.f149959b = dMTBgAnimRadioGroup.f149962e.getX();
            DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = this.f149971a;
            C89219l.m154716b(view, "");
            dMTBgAnimRadioGroup2.f149960c = view.getX();
            int indexOfChild = this.f149971a.getContainer().indexOfChild(view);
            if (indexOfChild != this.f149971a.f149958a) {
                AbstractC66762b bVar = this.f149971a.f149961d;
                if (bVar == null || bVar.mo88360b(indexOfChild)) {
                    DMTBgAnimRadioGroup dMTBgAnimRadioGroup3 = this.f149971a;
                    dMTBgAnimRadioGroup3.mo105717a(dMTBgAnimRadioGroup3.getContainer().getChildAt(this.f149971a.f149958a), this.f149971a.getItemTextNormalColor());
                    this.f149971a.f149958a = indexOfChild;
                    AbstractC66762b bVar2 = this.f149971a.f149961d;
                    if (bVar2 != null) {
                        bVar2.mo88359a(indexOfChild);
                    }
                    this.f149971a.f149963f.start();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo105718a(String str) {
        MethodCollector.m26663i(10631);
        C89219l.m154721d(str, "");
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ar2, this.f149968k, false);
        if (a != null) {
            TextView textView = (TextView) a;
            textView.setText(str);
            textView.setTextSize(0, this.f149965h);
            textView.setTextColor(this.f149966i);
            textView.setOnClickListener(this.f149969l);
            this.f149968k.addView(textView);
            MethodCollector.m26664o(10631);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        MethodCollector.m26664o(10631);
        throw nullPointerException;
    }

    /* renamed from: a */
    public final void mo105717a(View view, int i) {
        if (view != null && (view instanceof TextView) && this.f149967j != -1) {
            ((TextView) view).setTextColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10775);
        super.onMeasure(i, i2);
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        this.f149964g = size;
        measureChild(this.f149962e, View.MeasureSpec.makeMeasureSpec(size / this.f149968k.getChildCount(), Integer.MIN_VALUE), i2);
        MethodCollector.m26664o(10775);
    }

    private /* synthetic */ DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10925);
        this.f149958a = -1;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f149962e = view;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f149968k = linearLayout;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new C66761a(this));
        this.f149963f = ofFloat;
        this.f149969l = new View$OnClickListenerC66763c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.y9, R.attr.ya, R.attr.yc, R.attr.yd}, 0, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f149965h = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f149966i = obtainStyledAttributes.getColor(1, 0);
        this.f149967j = obtainStyledAttributes.getColor(2, -1);
        obtainStyledAttributes.recycle();
        view.setBackground(drawable);
        addView(view);
        addView(linearLayout);
        MethodCollector.m26664o(10925);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(10776);
        super.onLayout(z, i, i2, i3, i4);
        View childAt = this.f149968k.getChildAt(this.f149958a);
        if (childAt != null) {
            this.f149962e.setX(childAt.getX());
        }
        MethodCollector.m26664o(10776);
    }
}
