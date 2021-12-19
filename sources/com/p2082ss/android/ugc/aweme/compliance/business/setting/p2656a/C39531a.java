package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2656a;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.a.a */
public final class C39531a {
    static {
        Covode.recordClassIndex(47237);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.a.a$a */
    public static class C39532a extends ClickableSpan {

        /* renamed from: a */
        private int f93235a;

        /* renamed from: b */
        private View.OnClickListener f93236b;

        static {
            Covode.recordClassIndex(47238);
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f93236b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f93235a);
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
        }

        public C39532a(int i, View.OnClickListener onClickListener) {
            this.f93235a = i;
            this.f93236b = onClickListener;
        }
    }
}
