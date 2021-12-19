package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34734r;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.q */
public final class C62135q {
    static {
        Covode.recordClassIndex(72889);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.q$a */
    public static final class RunnableC62136a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f141042a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f141043b;

        /* renamed from: c */
        final /* synthetic */ BaseNotice f141044c;

        /* renamed from: d */
        final /* synthetic */ int f141045d;

        static {
            Covode.recordClassIndex(72890);
        }

        RunnableC62136a(TextView textView, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, int i) {
            this.f141042a = textView;
            this.f141043b = spannableStringBuilder;
            this.f141044c = baseNotice;
            this.f141045d = i;
        }

        public final void run() {
            TextView textView = this.f141042a;
            C62135q.m112363a(textView, this.f141043b, this.f141044c, this.f141045d, textView.getWidth());
        }
    }

    /* renamed from: a */
    public static final void m112363a(TextView textView, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, int i, int i2) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(spannableStringBuilder, "");
        C89219l.m154721d(baseNotice, "");
        if (i2 == 0) {
            textView.post(new RunnableC62136a(textView, spannableStringBuilder, baseNotice, i));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setBreakStrategy(0);
        }
        String valueOf = String.valueOf(AbstractView$OnLongClickListenerC62118k.m112311a(baseNotice, textView.getContext()));
        AbstractView$OnLongClickListenerC62118k.m112312a(spannableStringBuilder, baseNotice, textView.getContext());
        TextPaint paint = textView.getPaint();
        C89219l.m154716b(paint, "");
        textView.setText(m112362a(spannableStringBuilder, paint, i2, i, valueOf.length(), (int) textView.getPaint().measureText(valueOf)));
    }

    /* renamed from: a */
    private static SpannableStringBuilder m112362a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        C89219l.m154721d(spannableStringBuilder, "");
        C89219l.m154721d(textPaint, "");
        return C34734r.m70964a(spannableStringBuilder, textPaint, i, i2, i3, i4);
    }
}
