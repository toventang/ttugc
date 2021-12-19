package com.bytedance.tux.button;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.AbstractC23168a;
import com.bytedance.tux.icon.C23169b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1708b.C22988k;
import com.bytedance.tux.p1708b.p1709a.AbstractC22974b;
import com.bytedance.tux.p1708b.p1709a.C22975c;
import com.bytedance.tux.p1708b.p1709a.C22976d;
import com.bytedance.tux.p1710c.C23006d;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;

public class TuxButton extends TuxTextView implements AbstractC23168a {

    /* renamed from: b */
    public static final C22997a f54416b = new C22997a((byte) 0);

    /* renamed from: a */
    public boolean f54417a;

    /* renamed from: e */
    private boolean f54418e;

    /* renamed from: f */
    private int f54419f;

    /* renamed from: g */
    private int f54420g;

    /* renamed from: h */
    private String f54421h;

    /* renamed from: i */
    private C23006d f54422i;

    /* renamed from: j */
    private int f54423j;

    /* renamed from: k */
    private int f54424k;

    /* renamed from: l */
    private boolean f54425l;

    /* renamed from: m */
    private final C23169b f54426m;

    /* renamed from: n */
    private final C22988k<TuxButton> f54427n;

    static {
        Covode.recordClassIndex(26916);
    }

    public TuxButton(Context context) {
        this(context, null, 0, 6);
    }

    public TuxButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: com.bytedance.tux.button.TuxButton$a */
    public static final class C22997a {
        static {
            Covode.recordClassIndex(26917);
        }

        private C22997a() {
        }

        public /* synthetic */ C22997a(byte b) {
            this();
        }
    }

    public final boolean getSupportClickWhenDisable() {
        return this.f54425l;
    }

    /* renamed from: a */
    public final void mo796a() {
        setMinWidth(0);
        setMaxWidth(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C23006d dVar = this.f54422i;
        if (dVar != null) {
            dVar.mo37387c();
        }
    }

    private final int getPaddingLeftValue() {
        if (getPaddingLeft() > 0) {
            return getPaddingLeft();
        }
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
    }

    private final int getPaddingRightValue() {
        if (getPaddingLeft() > 0) {
            return getPaddingRight();
        }
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
    }

    /* renamed from: b */
    private final void m43375b() {
        if (this.f54418e) {
            int i = 0;
            if (this.f54417a) {
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                this.f54426m.mo37668a(this.f54422i);
                int i2 = this.f54426m.f54834b;
                int a = C89241a.m154730a(((float) C89271h.m154769b(width - i2, 0)) / 2.0f);
                C23006d dVar = this.f54422i;
                if (dVar != null) {
                    dVar.setBounds(a, 0, i2 + a, this.f54426m.f54833a);
                }
                setCompoundDrawables(this.f54422i, null, null, null);
                return;
            }
            if (!TextUtils.isEmpty(getText())) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                i = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            }
            this.f54426m.mo37666a(i);
        }
    }

    public final void setSupportClickWhenDisable(boolean z) {
        this.f54425l = z;
    }

    public final void setButtonEndIcon(Integer num) {
        this.f54426m.mo37671b(num);
        m43375b();
    }

    public final void setButtonSize(int i) {
        this.f54419f = i;
        this.f54427n.mo37304a(this, R.attr.aok, i);
    }

    public final void setButtonStartIcon(Integer num) {
        this.f54426m.mo37669a(num);
        m43375b();
    }

    public final void setButtonVariant(int i) {
        this.f54420g = i;
        this.f54427n.mo37304a(this, R.attr.aom, i);
    }

    @Override // com.bytedance.tux.icon.AbstractC23168a
    public void setIconHeight(int i) {
        this.f54426m.f54833a = i;
        C23006d dVar = this.f54422i;
        if (dVar != null) {
            dVar.mo37375b(i);
        }
        m43375b();
    }

    public void setIconTintColor(int i) {
        this.f54426m.f54835c = Integer.valueOf(i);
        m43375b();
    }

    @Override // com.bytedance.tux.icon.AbstractC23168a
    public void setIconWidth(int i) {
        this.f54426m.f54834b = i;
        C23006d dVar = this.f54422i;
        if (dVar != null) {
            dVar.mo37371a(i);
        }
        m43375b();
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        if (this.f54418e) {
            this.f54427n.mo37302a(this);
        }
    }

    /* renamed from: com.bytedance.tux.button.TuxButton$b */
    final class C22998b extends AbstractC22974b<TuxButton> {

        /* renamed from: b */
        private final C22976d f54429b = new C22976d();

        /* renamed from: c */
        private final C22975c f54430c = new C22975c();

        static {
            Covode.recordClassIndex(26918);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C22998b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
        @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
        /* renamed from: a */
        public final /* synthetic */ Map mo37289a(TuxButton tuxButton, Map map) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154719c(tuxButton2, "");
            C89219l.m154719c(map, "");
            return super.mo37289a(tuxButton2, this.f54430c.mo37289a(tuxButton2, this.f54429b.mo37291a((TuxTextView) tuxButton2, (Map<Integer, ? extends Object>) map)));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
        @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
        /* renamed from: a */
        public final /* synthetic */ boolean mo37290a(TuxButton tuxButton, int i, Object obj) {
            C89219l.m154719c(tuxButton, "");
            C89219l.m154719c(obj, "");
            if (i != C22983g.m43342p().f54332a) {
                return false;
            }
            TuxButton tuxButton2 = TuxButton.this;
            C22983g.m43342p();
            C89219l.m154719c(obj, "");
            tuxButton2.setLoadingIcon(((Number) obj).intValue());
            return true;
        }
    }

    /* renamed from: a */
    public final void mo37348a(Integer num) {
        this.f54426m.mo37669a(num);
        this.f54426m.mo37671b(null);
        m43375b();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f54418e) {
            this.f54427n.mo37302a(this);
        }
        if (!z) {
            setLoading(false);
        }
    }

    @Override // com.bytedance.tux.icon.AbstractC23168a
    public void setIconTintColorRes(int i) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        Integer a = C23155d.m43641a(context, i);
        if (a != null) {
            setIconTintColor(a.intValue());
        }
    }

    public final void setLoadingIcon(int i) {
        C23006d dVar = this.f54422i;
        if (dVar != null) {
            dVar.mo37387c();
        }
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f54422i = new C23006d(context, i);
    }

    /* renamed from: a */
    public final void mo37349a(boolean z) {
        if (!z) {
            setMinTextSize(-1.0f);
        } else if (getMinTextSize() <= 0) {
            setMinTextSize(10.0f);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f54425l || isEnabled() || !isClickable() || motionEvent == null || motionEvent.getAction() != 1 || motionEvent.getX() > ((float) getWidth()) || motionEvent.getY() > ((float) getHeight())) {
            return super.onTouchEvent(motionEvent);
        }
        performClick();
        return true;
    }

    public final void setLoading(boolean z) {
        if (z != this.f54417a) {
            this.f54417a = z;
            if (z) {
                this.f54421h = getText().toString();
                setText("");
                C23006d dVar = this.f54422i;
                if (dVar != null) {
                    PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ROTATE", 0, 360);
                    C89219l.m154709a((Object) ofInt, "");
                    ValueAnimator valueAnimator = dVar.f54459h;
                    valueAnimator.setValues(ofInt);
                    valueAnimator.setInterpolator(new LinearInterpolator());
                    valueAnimator.setDuration(1000L);
                    valueAnimator.setRepeatMode(1);
                    valueAnimator.setRepeatCount(-1);
                    valueAnimator.addUpdateListener(new C23006d.C23007a(dVar, ofInt));
                    dVar.f54459h.start();
                    return;
                }
                return;
            }
            C23006d dVar2 = this.f54422i;
            if (dVar2 != null) {
                dVar2.mo37387c();
            }
            setText(this.f54421h);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m43375b();
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2 || getMinWidth() <= 0) {
            z = false;
        } else {
            z = true;
        }
        mo37698b(z);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TuxButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        this.f54419f = Integer.MIN_VALUE;
        this.f54420g = Integer.MIN_VALUE;
        this.f54421h = "";
        this.f54424k = Integer.MAX_VALUE;
        C22988k<TuxButton> kVar = new C22988k<>(new C22998b());
        this.f54427n = kVar;
        this.f54418e = true;
        C23169b bVar = new C23169b(this);
        this.f54426m = bVar;
        bVar.mo37667a(attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aoj, R.attr.aok, R.attr.aom, R.attr.ap8, R.attr.ap9, R.attr.apj, R.attr.apl, R.attr.apz, R.attr.arj}, i, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            this.f54419f = obtainStyledAttributes.getInt(1, -1);
            this.f54420g = obtainStyledAttributes.getInt(2, Integer.MIN_VALUE);
            mo37349a(obtainStyledAttributes.getBoolean(0, false));
            int resourceId = obtainStyledAttributes.getResourceId(7, 0);
            if (resourceId != 0) {
                this.f54422i = new C23006d(context, resourceId);
            }
            obtainStyledAttributes.recycle();
        }
        this.f54423j = getMinWidth();
        this.f54424k = getMaxWidth();
        setPadding(getPaddingLeftValue(), 0, getPaddingRightValue(), 0);
        setGravity(17);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        setCompoundDrawablePadding(C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
        setButtonSize(this.f54419f);
        setButtonVariant(this.f54420g);
        if (bVar.f54836d > 0.0f) {
            bVar.f54834b = (int) bVar.f54836d;
        }
        if (bVar.f54837e > 0.0f) {
            bVar.f54833a = (int) bVar.f54837e;
        }
        m43375b();
        int i2 = this.f54424k;
        if (i2 < Integer.MAX_VALUE) {
            setMaxWidth(i2);
        }
        int i3 = this.f54423j;
        if (i3 > 0) {
            setMinWidth(i3);
        }
        kVar.mo37303a(this, (int) R.attr.cu);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m43375b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.bo : i);
    }
}
