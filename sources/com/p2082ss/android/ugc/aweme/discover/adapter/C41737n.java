package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractLoadingLayout;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.n */
public final class C41737n extends AbstractLoadingLayout {

    /* renamed from: f */
    private int f97365f;

    static {
        Covode.recordClassIndex(49650);
    }

    public C41737n(Context context) {
        this(context, (byte) 0);
    }

    private C41737n(Context context, byte b) {
        this(context, (char) 0);
    }

    private C41737n(Context context, char c) {
        super(context, null);
        this.f97365f = 45;
        mo67949a(0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) C13628n.m24520b(getContext(), (float) this.f97365f), 1073741824));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractLoadingLayout
    /* renamed from: a */
    public final void mo67949a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.mo67949a(i, i2);
        if (this.f92390a != null) {
            View view = this.f92390a;
            if (i2 == 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        View view2 = this.f92391b;
        int i6 = 8;
        if (i2 == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.f92393d;
        if (i2 == 2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.f92392c;
        if (i2 == 3) {
            i6 = 0;
        }
        view4.setVisibility(i6);
        if (i2 == 0) {
            this.f97365f = 0;
        } else {
            this.f97365f = 45;
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        int i3;
        super.addView(view, i, i2);
        if (this.f92390a == view) {
            View view2 = this.f92390a;
            if (this.f92394e == 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view2.setVisibility(i3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractLoadingLayout
    /* renamed from: b */
    public final View mo67951b(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, 0);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(C0643b.m2378c(context, R.color.bz));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.cxi);
        appCompatTextView.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41737n.View$OnClickListenerC417381 */

            static {
                Covode.recordClassIndex(49651);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
            }
        });
        return appCompatTextView;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractLoadingLayout
    /* renamed from: c */
    public final View mo67952c(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, 0);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(C0643b.m2378c(context, R.color.bz));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.cxj);
        appCompatTextView.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41737n.View$OnClickListenerC417392 */

            static {
                Covode.recordClassIndex(49652);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
            }
        });
        return appCompatTextView;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractLoadingLayout
    /* renamed from: a */
    public final View mo67948a(Context context, AttributeSet attributeSet, int i) {
        MethodCollector.m26663i(6023);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, 0);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setTextColor(C0643b.m2378c(context, R.color.c5));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.cxk);
        ProgressBar progressBar = new ProgressBar(context, attributeSet, 0);
        progressBar.setId(R.id.cfv);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateDrawable(context.getResources().getDrawable(R.drawable.b3q));
        int b = (int) C13628n.m24520b(context, 15.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b, b);
        layoutParams.setMargins(0, 0, (int) C13628n.m24520b(context, 5.0f), 0);
        progressBar.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        linearLayout.setGravity(16);
        linearLayout.addView(progressBar);
        linearLayout.addView(appCompatTextView);
        MethodCollector.m26664o(6023);
        return linearLayout;
    }
}
