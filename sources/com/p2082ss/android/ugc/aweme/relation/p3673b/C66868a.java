package com.p2082ss.android.ugc.aweme.relation.p3673b;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.b.a */
public final class C66868a {
    static {
        Covode.recordClassIndex(78443);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b.a$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC66869a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TextView f150144a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f150145b;

        static {
            Covode.recordClassIndex(78444);
        }

        public final void onGlobalLayout() {
            int paddingLeft = this.f150144a.getPaddingLeft();
            int paddingRight = this.f150144a.getPaddingRight();
            if (TextUtils.ellipsize(this.f150145b, this.f150144a.getPaint(), (float) (((this.f150144a.getWidth() - paddingLeft) - paddingRight) * this.f150144a.getMaxLines()), TextUtils.TruncateAt.END).length() < this.f150145b.length()) {
                this.f150144a.getLayoutParams().height = this.f150144a.getHeight();
                this.f150144a.setMaxLines(999);
                C0823h.m2908a(this.f150144a, 1, 999, 1, 0);
            }
            this.f150144a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC66869a(TextView textView, CharSequence charSequence) {
            this.f150144a = textView;
            this.f150145b = charSequence;
        }
    }

    /* renamed from: a */
    public static final void m118582a(TextView textView) {
        C89219l.m154721d(textView, "");
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC66869a(textView, textView.getText()));
    }
}
