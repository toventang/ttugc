package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.widget.TimeLockDesc */
public class TimeLockDesc extends FrameLayout {

    /* renamed from: a */
    private TextView f132034a = ((TextView) findViewById(R.id.ei0));

    /* renamed from: b */
    private ImageView f132035b = ((ImageView) findViewById(R.id.e6l));

    static {
        Covode.recordClassIndex(67944);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f132035b.setImageDrawable(drawable);
    }

    public void setText(String str) {
        this.f132034a.setText(str);
    }

    public TimeLockDesc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9375);
        inflate(getContext(), R.layout.acf, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.r7, R.attr.af5}, 0, 0);
        String string = obtainStyledAttributes.getString(0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f132035b.setImageDrawable(obtainStyledAttributes.getDrawable(1));
        }
        this.f132034a.setText(string);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(9375);
    }
}
