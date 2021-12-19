package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35484a;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.g */
public final class C35606g extends AbstractC35484a {

    /* renamed from: b */
    public boolean f83982b;

    /* renamed from: c */
    private TextPaint f83983c;

    /* renamed from: d */
    private int f83984d;

    /* renamed from: e */
    private int f83985e = 4;

    /* renamed from: f */
    private boolean f83986f;

    /* renamed from: g */
    private String f83987g;

    /* renamed from: h */
    private TextView f83988h;

    static {
        Covode.recordClassIndex(42830);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0084  */
    @Override // com.p2082ss.android.ugc.aweme.challenge.AbstractC35484a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString mo62373a(android.text.SpannableString r14) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35606g.mo62373a(android.text.SpannableString):android.text.SpannableString");
    }

    public C35606g(TextPaint textPaint, int i, String str) {
        this.f83983c = textPaint;
        this.f83984d = i;
        this.f83987g = str;
        this.f83986f = true;
        this.f83985e = 2;
    }

    /* renamed from: a */
    private static int m72707a(TextView textView, int i, CharSequence charSequence) {
        MethodCollector.m26663i(924);
        TextView textView2 = new TextView(textView.getContext());
        textView2.setTextSize(0, textView.getTextSize());
        textView2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        textView2.setTypeface(textView.getTypeface());
        textView2.setIncludeFontPadding(textView.getIncludeFontPadding());
        textView2.setText(charSequence);
        textView2.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = textView2.getMeasuredHeight();
        MethodCollector.m26664o(924);
        return measuredHeight;
    }

    public C35606g(TextView textView, TextPaint textPaint, int i, String str) {
        this.f83983c = textPaint;
        this.f83984d = i;
        this.f83987g = str;
        this.f83986f = true;
        this.f83985e = 4;
        this.f83988h = textView;
    }
}
