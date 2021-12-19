package com.bytedance.ies.dmt.p1194ui.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.a */
public final class C17187a extends DmtTextView {

    /* renamed from: a */
    private int f40965a;

    /* renamed from: b */
    private int f40966b;

    /* renamed from: c */
    private int f40967c;

    /* renamed from: e */
    private CharSequence f40968e;

    static {
        Covode.recordClassIndex(19647);
    }

    /* renamed from: a */
    private void m31740a() {
        int measuredHeight = getMeasuredHeight();
        if (this.f40967c != measuredHeight) {
            this.f40967c = measuredHeight;
            m31741a(measuredHeight, this.f40965a);
        }
    }

    /* renamed from: c */
    private void m31744c() {
        int i;
        int i2;
        if (this.f40966b == 2) {
            i = (int) C13628n.m24520b(getContext(), 4.0f);
            i2 = i;
        } else {
            i = 0;
            i2 = 0;
        }
        super.setPadding(i, 0, i2, 0);
    }

    /* renamed from: b */
    private void m31742b() {
        float b;
        int i;
        int i2;
        int i3 = this.f40966b;
        if (i3 == 1) {
            b = C13628n.m24520b(getContext(), 8.0f);
        } else if (i3 != 2) {
            b = C13628n.m24520b(getContext(), 6.0f);
        } else {
            i = (int) C13628n.m24520b(getContext(), 16.0f);
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth >= i) {
                i2 = i;
                i = measuredWidth;
                setMeasuredDimension(i, i2);
                m31740a();
            }
            i2 = i;
            setMeasuredDimension(i, i2);
            m31740a();
        }
        i = (int) b;
        i2 = i;
        setMeasuredDimension(i, i2);
        m31740a();
    }

    public C17187a(Context context) {
        this(context, (byte) 0);
    }

    public final void setBadgeColor(int i) {
        this.f40965a = i;
        m31741a(this.f40967c, i);
    }

    public final void setCount(int i) {
        setText(String.valueOf(i));
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtTextView
    /* renamed from: a */
    public final void mo27162a(AttributeSet attributeSet) {
        super.mo27162a(attributeSet);
        m31743b(attributeSet);
        setTextSize(1, 12.0f);
        setGravity(17);
    }

    public final void setMode(int i) {
        if (this.f40966b != i) {
            this.f40966b = i;
            if (i != 2) {
                this.f40968e = getText();
                setText("");
            } else if (TextUtils.isEmpty(getText()) && !TextUtils.isEmpty(this.f40968e)) {
                setText(this.f40968e);
            }
            m31744c();
            m31742b();
        }
    }

    /* renamed from: b */
    private void m31743b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ji, R.attr.jj});
        this.f40965a = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(R.color.b9));
        setMode(obtainStyledAttributes.getInt(1, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m31742b();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(1, 12.0f);
    }

    private C17187a(Context context, byte b) {
        this(context, (char) 0);
    }

    private C17187a(Context context, char c) {
        super(context, null, 0);
        this.f40966b = -1;
        mo27162a(null);
    }

    /* renamed from: a */
    private void m31741a(int i, int i2) {
        float b = (float) ((int) C13628n.m24520b(getContext(), (float) i));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{b, b, b, b, b, b, b, b}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        setBackground(shapeDrawable);
    }

    @Override // android.widget.TextView, com.bytedance.ies.dmt.p1194ui.widget.DmtTextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        SpannableStringBuilder spannableStringBuilder;
        String str = "";
        if (this.f40966b != 2 || TextUtils.isEmpty(charSequence)) {
            this.f40968e = charSequence;
            spannableStringBuilder = str;
        } else {
            try {
                Integer valueOf = Integer.valueOf(charSequence.toString());
                if (valueOf.intValue() > 99) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("99+");
                    spannableStringBuilder2.setSpan(new C17190c("+"), 2, 3, 17);
                    spannableStringBuilder = spannableStringBuilder2;
                } else {
                    if (valueOf.intValue() < 0) {
                        charSequence = str;
                    }
                    spannableStringBuilder = charSequence;
                }
            } catch (Exception unused) {
                throw new IllegalArgumentException("Excepted a int but get ".concat(String.valueOf(charSequence)));
            }
        }
        super.setText(spannableStringBuilder, bufferType);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        m31744c();
    }
}
