package com.p2082ss.android.ugc.aweme.journey.p3291a;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.a.a */
public final class C56834a {
    static {
        Covode.recordClassIndex(66719);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.a.a$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC56835a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TextView f129424a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f129425b;

        static {
            Covode.recordClassIndex(66720);
        }

        public final void onGlobalLayout() {
            int paddingLeft = this.f129424a.getPaddingLeft();
            int paddingRight = this.f129424a.getPaddingRight();
            if (TextUtils.ellipsize(this.f129425b, this.f129424a.getPaint(), (float) (((this.f129424a.getWidth() - paddingLeft) - paddingRight) * this.f129424a.getMaxLines()), TextUtils.TruncateAt.END).length() < this.f129425b.length()) {
                this.f129424a.getLayoutParams().height = this.f129424a.getHeight();
                this.f129424a.setMaxLines(999);
                C0823h.m2908a(this.f129424a, 1, 999, 1, 0);
            }
            this.f129424a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC56835a(TextView textView, CharSequence charSequence) {
            this.f129424a = textView;
            this.f129425b = charSequence;
        }
    }

    /* renamed from: a */
    public static final void m103085a(TextView textView) {
        C89219l.m154721d(textView, "");
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC56835a(textView, textView.getText()));
    }
}
