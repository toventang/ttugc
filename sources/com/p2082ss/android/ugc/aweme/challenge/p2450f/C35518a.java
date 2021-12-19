package com.p2082ss.android.ugc.aweme.challenge.p2450f;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.f.a */
public final class C35518a {

    /* renamed from: a */
    public static final C35518a f83757a = new C35518a();

    private C35518a() {
    }

    static {
        Covode.recordClassIndex(42714);
    }

    /* renamed from: a */
    public static C35519b m72615a(TextView textView, CharSequence charSequence) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(charSequence, "");
        if (textView.getWidth() <= 0) {
            return new C35519b();
        }
        DmtTextView dmtTextView = new DmtTextView(textView.getContext());
        dmtTextView.setTextSize(0, textView.getTextSize());
        dmtTextView.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        dmtTextView.setTypeface(textView.getTypeface());
        dmtTextView.setIncludeFontPadding(textView.getIncludeFontPadding());
        dmtTextView.setText(charSequence);
        dmtTextView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new C35519b(Integer.valueOf(dmtTextView.getMeasuredWidth()), Integer.valueOf(dmtTextView.getMeasuredHeight()), Integer.valueOf(dmtTextView.getLineCount()));
    }
}
