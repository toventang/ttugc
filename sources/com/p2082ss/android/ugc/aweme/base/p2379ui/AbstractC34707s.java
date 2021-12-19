package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.ui.s */
public abstract class AbstractC34707s extends ClickableSpan {

    /* renamed from: a */
    public boolean f81986a;

    /* renamed from: b */
    public final int f81987b;

    /* renamed from: c */
    public final int f81988c;

    static {
        Covode.recordClassIndex(41694);
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        C89219l.m154721d(textPaint, "");
        super.updateDrawState(textPaint);
        if (this.f81986a) {
            i = this.f81988c;
        } else {
            i = this.f81987b;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public AbstractC34707s(int i, int i2) {
        this.f81987b = i;
        this.f81988c = i2;
    }
}
