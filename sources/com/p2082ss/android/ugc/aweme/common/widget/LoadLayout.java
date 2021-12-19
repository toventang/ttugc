package com.p2082ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.widget.LoadLayout */
public class LoadLayout extends LinearLayout {

    /* renamed from: a */
    private ImageView f92417a;

    /* renamed from: b */
    private TextView f92418b;

    /* renamed from: c */
    private Animation f92419c;

    static {
        Covode.recordClassIndex(46802);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        MethodCollector.m26663i(7587);
        super.onFinishInflate();
        this.f92417a = (ImageView) findViewById(R.id.cfv);
        this.f92418b = (TextView) findViewById(R.id.cg1);
        this.f92419c = AnimationUtils.loadAnimation(getContext(), R.anim.cw);
        MethodCollector.m26664o(7587);
    }

    public void setLoadingText(int i) {
        this.f92418b.setText(i);
    }

    public void setLoadingText(String str) {
        this.f92418b.setText(str);
    }

    public void setLoadingViewSize(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        this.f92417a.setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f92417a.startAnimation(this.f92419c);
        } else {
            this.f92417a.clearAnimation();
        }
    }

    public LoadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(7584);
        MethodCollector.m26664o(7584);
    }
}
