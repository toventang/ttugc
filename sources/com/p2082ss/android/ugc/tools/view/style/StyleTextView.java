package com.p2082ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.StyleTextView */
public class StyleTextView extends AppCompatTextView {

    /* renamed from: a */
    private Typeface f189888a;

    static {
        Covode.recordClassIndex(98968);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    public String toString() {
        return super.toString() + ", text: " + getText();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StyleTextView(Context context) {
        this(context, null);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C89219l.m154721d(view, "");
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        this.f189888a = C84980f.m146052a(EnumC84965a.MEDIUM.getFONT_NAME());
        m146031a(context, attributeSet);
    }

    /* renamed from: a */
    private void m146031a(Context context, AttributeSet attributeSet) {
        C89219l.m154721d(context, "");
        C84981g.m146056a((TextView) this, attributeSet, false);
        GradientDrawable a = C84981g.m146054a(context, attributeSet, false);
        if (a != null) {
            setBackground(a);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
            C89219l.m154716b(obtainStyledAttributes, "");
            boolean z = obtainStyledAttributes.getBoolean(4, true);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(19);
            obtainStyledAttributes.recycle();
            if (!z) {
                return;
            }
            if (colorStateList != null) {
                setTextColor(colorStateList);
                return;
            }
        }
        setTextColor(context.getResources().getColor(R.color.ua));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f189888a = C84980f.m146052a(EnumC84965a.MEDIUM.getFONT_NAME());
        m146031a(context, null);
    }
}
