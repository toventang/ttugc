package com.p2082ss.android.ugc.aweme.account.views;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.views.c */
public abstract class AbstractC33066c extends ClickableSpan {

    /* renamed from: a */
    private int f78622a;

    /* renamed from: b */
    private int f78623b;

    /* renamed from: d */
    public boolean f78624d;

    static {
        Covode.recordClassIndex(39875);
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        if (this.f78624d) {
            i = this.f78623b;
        } else {
            i = this.f78622a;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public AbstractC33066c(int i, int i2) {
        this.f78622a = i;
        this.f78623b = i2;
    }
}
