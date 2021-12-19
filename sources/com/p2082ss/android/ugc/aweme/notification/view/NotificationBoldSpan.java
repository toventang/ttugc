package com.p2082ss.android.ugc.aweme.notification.view;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan */
public class NotificationBoldSpan extends ForegroundColorSpan {
    static {
        Covode.recordClassIndex(73060);
    }

    public NotificationBoldSpan() {
        super(C0643b.m2378c(C17867d.m33078a(), R.color.bx));
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }
}
