package com.p2082ss.android.ugc.aweme.relation.dialog;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.dialog.c */
public final class C66907c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final TextView f150199a;

    /* renamed from: b */
    public String f150200b = "";

    static {
        Covode.recordClassIndex(78483);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.c$a */
    public static final class C66908a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C66907c f150201a;

        static {
            Covode.recordClassIndex(78484);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C66908a(C66907c cVar) {
            this.f150201a = cVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f150201a.f150199a.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f150201a.f150199a.getContext(), "//privacy/suggest_account").withParam("enter_from", "foru_boarding").withParam("previous_page", this.f150201a.f150200b).withParam("is_rec", 1).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66907c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.b7s);
        C89219l.m154716b(findViewById, "");
        this.f150199a = (TextView) findViewById;
    }
}
