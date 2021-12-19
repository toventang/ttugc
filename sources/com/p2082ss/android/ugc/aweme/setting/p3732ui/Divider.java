package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.Divider */
public final class Divider extends LinearLayout {

    /* renamed from: a */
    private View f153284a;

    /* renamed from: b */
    private DmtTextView f153285b;

    /* renamed from: c */
    private View f153286c;

    static {
        Covode.recordClassIndex(80737);
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setLeftText(CharSequence charSequence) {
        int i;
        C89219l.m154721d(charSequence, "");
        DmtTextView dmtTextView = this.f153285b;
        if (dmtTextView != null) {
            dmtTextView.setText(charSequence);
        }
        DmtTextView dmtTextView2 = this.f153285b;
        if (dmtTextView2 != null) {
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            dmtTextView2.setVisibility(i);
        }
    }

    private /* synthetic */ Divider(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Divider(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        DmtTextView dmtTextView;
        ViewGroup.LayoutParams layoutParams;
        DmtTextView dmtTextView2;
        View view;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11634);
        View inflate = View.inflate(context, R.layout.bh3, this);
        this.f153284a = inflate;
        View view2 = null;
        if (inflate != null) {
            dmtTextView = (DmtTextView) inflate.findViewById(R.id.eyf);
        } else {
            dmtTextView = null;
        }
        this.f153285b = dmtTextView;
        View view3 = this.f153284a;
        this.f153286c = view3 != null ? view3.findViewById(R.id.f92) : view2;
        View view4 = this.f153284a;
        if (view4 != null) {
            view4.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ve, R.attr.xk, R.attr.af_});
        C89219l.m154716b(obtainStyledAttributes, "");
        if (obtainStyledAttributes.getBoolean(0, false) && (view = this.f153286c) != null) {
            view.setVisibility(8);
        }
        View view5 = this.f153286c;
        if (view5 != null) {
            view5.setBackgroundColor(C0643b.m2378c(context, R.color.b2));
        }
        View view6 = this.f153284a;
        if (view6 != null) {
            view6.setBackgroundColor(C0643b.m2378c(context, R.color.l));
        }
        String string = obtainStyledAttributes.getString(2);
        if (!TextUtils.isEmpty(string)) {
            DmtTextView dmtTextView3 = this.f153285b;
            if (dmtTextView3 != null) {
                dmtTextView3.setText(string);
            }
            DmtTextView dmtTextView4 = this.f153285b;
            if (dmtTextView4 != null) {
                dmtTextView4.setFontType(C17303d.f41573g);
            }
        } else {
            DmtTextView dmtTextView5 = this.f153285b;
            if (dmtTextView5 != null) {
                dmtTextView5.setVisibility(8);
            }
            View view7 = this.f153286c;
            if (view7 == null || (layoutParams = view7.getLayoutParams()) == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.m26664o(11634);
                throw nullPointerException;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) C13628n.m24520b(getContext(), 8.0f);
        }
        if (obtainStyledAttributes.getBoolean(1, false) && (dmtTextView2 = this.f153285b) != null) {
            dmtTextView2.setAllCaps(true);
        }
        DmtTextView dmtTextView6 = this.f153285b;
        if (dmtTextView6 != null) {
            dmtTextView6.setTextColor(C17177c.m31710b(getContext()));
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(11634);
    }
}
