package com.p2082ss.android.ugc.aweme.report;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.report.a */
public final class C67104a extends ClickableSpan {

    /* renamed from: a */
    private final View.OnClickListener f150490a;

    /* renamed from: b */
    private final Context f150491b;

    static {
        Covode.recordClassIndex(78686);
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        this.f150490a.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        C89219l.m154721d(textPaint, "");
        textPaint.setColor(C0643b.m2378c(this.f150491b, R.color.l));
    }

    public C67104a(View.OnClickListener onClickListener, Context context) {
        C89219l.m154721d(onClickListener, "");
        C89219l.m154721d(context, "");
        this.f150490a = onClickListener;
        this.f150491b = context;
    }
}
