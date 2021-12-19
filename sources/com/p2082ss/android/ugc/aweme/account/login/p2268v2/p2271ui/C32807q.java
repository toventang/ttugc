package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.account.views.C33064a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.q */
public final class C32807q {

    /* renamed from: a */
    public static final C32807q f78161a = new C32807q();

    private C32807q() {
    }

    static {
        Covode.recordClassIndex(39586);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.q$a */
    public static final class C32808a extends AbstractC33066c {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f78162a;

        /* renamed from: b */
        final /* synthetic */ int f78163b;

        static {
            Covode.recordClassIndex(39587);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f78162a.onClick(view);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setFakeBoldText(true);
            super.updateDrawState(textPaint);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32808a(View.OnClickListener onClickListener, int i, int i2, int i3) {
            super(i2, i3);
            this.f78162a = onClickListener;
            this.f78163b = i;
        }
    }

    /* renamed from: a */
    public static void m67391a(TextView textView, View.OnClickListener onClickListener, int i, int i2) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(onClickListener, "");
        Context context = textView.getContext();
        String string = context.getString(i2);
        C89219l.m154716b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, string));
        int c = C0643b.m2378c(context, R.color.bh);
        C32808a aVar = new C32808a(onClickListener, c, c, c);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        C89219l.m154716b(spannableStringBuilder2, "");
        int a = C89361p.m154888a((CharSequence) spannableStringBuilder2, string, 0, false, 6);
        spannableStringBuilder.setSpan(aVar, a, string.length() + a, 34);
        textView.setHighlightColor(C0643b.m2378c(context, R.color.c9));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(C33064a.m67722a());
    }
}
