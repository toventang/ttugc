package com.bytedance.ies.dmt.p1194ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.Divider */
public class Divider extends LinearLayout {

    /* renamed from: a */
    private View f41412a;

    /* renamed from: b */
    private TextView f41413b;

    /* renamed from: c */
    private View f41414c;

    static {
        Covode.recordClassIndex(19759);
    }

    public TextView getTxtLeft() {
        return this.f41413b;
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private Divider(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8497);
        View inflate = View.inflate(context, R.layout.bh3, this);
        this.f41412a = inflate;
        this.f41413b = (TextView) inflate.findViewById(R.id.eyf);
        this.f41414c = this.f41412a.findViewById(R.id.f92);
        this.f41412a.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        new StringBuilder("getBaseStyle() called with: context = [").append(context).append("], attrs = [").append(attributeSet).append("]");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ve, R.attr.xk, R.attr.af_});
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f41414c.setVisibility(8);
        }
        this.f41414c.setBackgroundColor(C0643b.m2378c(context, R.color.b2));
        this.f41412a.setBackgroundColor(C0643b.m2378c(context, R.color.l));
        String string = obtainStyledAttributes.getString(2);
        if (!TextUtils.isEmpty(string)) {
            this.f41413b.setText(string);
        } else {
            this.f41413b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.f41414c.getLayoutParams()).bottomMargin = (int) C13628n.m24520b(getContext(), 4.0f);
        }
        this.f41413b.setTextColor(C0643b.m2378c(context, R.color.c5));
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.f41413b.setAllCaps(true);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(8497);
    }
}
