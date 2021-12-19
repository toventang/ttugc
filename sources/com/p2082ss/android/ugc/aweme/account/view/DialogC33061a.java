package com.p2082ss.android.ugc.aweme.account.view;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.view.a */
public final class DialogC33061a extends Dialog {

    /* renamed from: a */
    private LinearLayout f78613a;

    /* renamed from: b */
    private String f78614b;

    static {
        Covode.recordClassIndex(39869);
    }

    public final void dismiss() {
        super.dismiss();
    }

    public final void show() {
        super.show();
        ObjectAnimator.ofFloat(this.f78613a, "alpha", 0.0f, 1.0f).setDuration(300L).start();
    }

    public DialogC33061a(Context context) {
        super(context, R.style.u8);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fw);
        this.f78613a = (LinearLayout) findViewById(R.id.akk);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.akj);
        ((ProgressBar) findViewById(R.id.akl)).getIndeterminateDrawable().setColorFilter(C0643b.m2378c(getContext(), R.color.l), PorterDuff.Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
        boolean z = !TextUtils.isEmpty(this.f78614b);
        if (tuxTextView == null) {
            return;
        }
        if (z) {
            tuxTextView.setVisibility(0);
            tuxTextView.setText(this.f78614b);
            return;
        }
        tuxTextView.setVisibility(8);
    }

    public DialogC33061a(Context context, String str) {
        this(context);
        this.f78614b = str;
    }
}
