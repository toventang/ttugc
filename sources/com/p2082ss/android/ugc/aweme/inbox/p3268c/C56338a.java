package com.p2082ss.android.ugc.aweme.inbox.p3268c;

import android.app.Dialog;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.c.a */
public final class C56338a {

    /* renamed from: a */
    public static final C56338a f128513a = new C56338a();

    private C56338a() {
    }

    static {
        Covode.recordClassIndex(66158);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.c.a$a */
    public static final class C56339a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Dialog f128514a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f128515b;

        /* renamed from: c */
        final /* synthetic */ TextView f128516c;

        static {
            Covode.recordClassIndex(66159);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f128516c.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            Dialog dialog = this.f128514a;
            if (dialog != null && dialog.isShowing()) {
                this.f128514a.dismiss();
            }
            SmartRouter.buildRoute(this.f128515b, "//privacy/suggest_account").withParam("enter_from", "notification_page").withParam("is_rec", 1).open();
        }

        public C56339a(Dialog dialog, ActivityC0945e eVar, TextView textView) {
            this.f128514a = dialog;
            this.f128515b = eVar;
            this.f128516c = textView;
        }
    }
}
