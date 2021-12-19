package com.p2082ss.android.ugc.aweme.kids.setting.base;

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
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.base.Divider */
public final class Divider extends LinearLayout {

    /* renamed from: a */
    private View f131838a;

    /* renamed from: b */
    private TuxTextView f131839b;

    /* renamed from: c */
    private View f131840c;

    static {
        Covode.recordClassIndex(67805);
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setLeftText(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        TuxTextView tuxTextView = this.f131839b;
        if (tuxTextView != null) {
            tuxTextView.setText(charSequence);
        }
    }

    private /* synthetic */ Divider(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Divider(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        TuxTextView tuxTextView;
        ViewGroup.LayoutParams layoutParams;
        View view;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11260);
        View inflate = View.inflate(context, R.layout.ads, this);
        this.f131838a = inflate;
        View view2 = null;
        if (inflate != null) {
            tuxTextView = (TuxTextView) inflate.findViewById(R.id.eyf);
        } else {
            tuxTextView = null;
        }
        this.f131839b = tuxTextView;
        View view3 = this.f131838a;
        this.f131840c = view3 != null ? view3.findViewById(R.id.f92) : view2;
        View view4 = this.f131838a;
        if (view4 != null) {
            view4.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ve, R.attr.xk, R.attr.af_});
        C89219l.m154716b(obtainStyledAttributes, "");
        if (obtainStyledAttributes.getBoolean(0, false) && (view = this.f131840c) != null) {
            view.setVisibility(8);
        }
        View view5 = this.f131840c;
        if (view5 != null) {
            view5.setBackgroundColor(C0643b.m2378c(context, R.color.b2));
        }
        View view6 = this.f131838a;
        if (view6 != null) {
            view6.setBackgroundColor(C0643b.m2378c(context, R.color.l));
        }
        String string = obtainStyledAttributes.getString(2);
        if (!TextUtils.isEmpty(string)) {
            TuxTextView tuxTextView2 = this.f131839b;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(string);
            }
            TuxTextView tuxTextView3 = this.f131839b;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(62);
            }
        } else {
            TuxTextView tuxTextView4 = this.f131839b;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(8);
            }
            View view7 = this.f131840c;
            if (view7 == null || (layoutParams = view7.getLayoutParams()) == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.m26664o(11260);
                throw nullPointerException;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) C13628n.m24520b(getContext(), 8.0f);
        }
        TuxTextView tuxTextView5 = this.f131839b;
        if (tuxTextView5 != null) {
            tuxTextView5.setTextColor(C17177c.m31710b(getContext()));
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(11260);
    }
}
