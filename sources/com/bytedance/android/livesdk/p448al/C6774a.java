package com.bytedance.android.livesdk.p448al;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.C4128c;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.al.a */
public final class C6774a {

    /* renamed from: a */
    public static final C6774a f16817a = new C6774a();

    private C6774a() {
    }

    static {
        Covode.recordClassIndex(7512);
    }

    /* renamed from: com.bytedance.android.livesdk.al.a$a */
    public static final class C6775a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Runnable f16818a;

        static {
            Covode.recordClassIndex(7513);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
        }

        C6775a(Runnable runnable) {
            this.f16818a = runnable;
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f16818a.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.al.a$b */
    public static final class DialogInterface$OnClickListenerC6776b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f16819a;

        static {
            Covode.recordClassIndex(7514);
        }

        DialogInterface$OnClickListenerC6776b(Runnable runnable) {
            this.f16819a = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f16819a.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.al.a$c */
    public static final class DialogInterface$OnClickListenerC6777c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f16820a;

        static {
            Covode.recordClassIndex(7515);
        }

        DialogInterface$OnClickListenerC6777c(Runnable runnable) {
            this.f16820a = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f16820a.run();
        }
    }

    /* renamed from: a */
    public static final Dialog m14562a(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(runnable2, "");
        C89219l.m154721d(runnable3, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String a = C3966y.m9657a((int) R.string.e28);
        String a2 = C3966y.m9660a((int) R.string.ejj, a);
        spannableStringBuilder.append((CharSequence) a2);
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a)) {
            C89219l.m154716b(a2, "");
            C89219l.m154716b(a, "");
            int a3 = C89361p.m154888a((CharSequence) a2, a, 0, false, 6);
            if (a3 != -1) {
                C4128c.m10032a(spannableStringBuilder, a3, a.length() + a3, 700);
            }
            if (runnable != null) {
                spannableStringBuilder.setSpan(new C6775a(runnable), a3, a.length() + a3, 33);
            }
        }
        DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(context);
        aVar.f22247d = 2131234857;
        DialogC9148b.C9149a a4 = aVar.mo15243a(R.string.ejm);
        a4.f22246c = spannableStringBuilder;
        DialogC9148b.C9149a a5 = a4.mo15249b(R.string.ejl, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6776b(runnable2), false).mo15244a(R.string.ejk, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6777c(runnable3), false);
        a5.f22256m = false;
        DialogC9148b a6 = a5.mo15247a();
        C89219l.m154716b(a6, "");
        return a6;
    }
}
