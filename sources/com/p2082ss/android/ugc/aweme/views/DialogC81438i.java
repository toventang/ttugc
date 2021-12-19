package com.p2082ss.android.ugc.aweme.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.i */
public class DialogC81438i extends Dialog {

    /* renamed from: a */
    LinearLayout f182022a;

    /* renamed from: b */
    ProgressBar f182023b;

    /* renamed from: c */
    DmtTextView f182024c;

    /* renamed from: d */
    private String f182025d;

    static {
        Covode.recordClassIndex(94807);
    }

    public void dismiss() {
        super.dismiss();
        LinearLayout linearLayout = this.f182022a;
        ObjectAnimator.ofFloat(linearLayout, "alpha", linearLayout.getAlpha(), 0.0f).setDuration(300L).addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.views.DialogC81438i.C814391 */

            static {
                Covode.recordClassIndex(94808);
            }

            public final void onAnimationEnd(Animator animator) {
            }
        });
    }

    public void show() {
        super.show();
        ObjectAnimator.ofFloat(this.f182022a, "alpha", 0.0f, 1.0f).setDuration(300L).start();
    }

    public DialogC81438i(Context context) {
        super(context, R.style.fm);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.x1);
        this.f182022a = (LinearLayout) findViewById(R.id.ci3);
        this.f182023b = (ProgressBar) findViewById(R.id.d_6);
        this.f182024c = (DmtTextView) findViewById(R.id.cg1);
        this.f182023b.getIndeterminateDrawable().setColorFilter(C0643b.m2378c(getContext(), R.color.l), PorterDuff.Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
        if (!TextUtils.isEmpty(this.f182025d)) {
            C13628n.m24515a(this.f182024c, this.f182025d);
        }
    }

    public DialogC81438i(Context context, String str) {
        this(context);
        this.f182025d = str;
    }
}
