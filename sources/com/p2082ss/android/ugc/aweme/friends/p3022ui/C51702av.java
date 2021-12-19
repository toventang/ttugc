package com.p2082ss.android.ugc.aweme.friends.p3022ui;

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

/* renamed from: com.ss.android.ugc.aweme.friends.ui.av */
public final class C51702av extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final TextView f119183a;

    /* renamed from: b */
    public String f119184b = "";

    static {
        Covode.recordClassIndex(61065);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.av$a */
    public static final class C51703a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C51702av f119185a;

        static {
            Covode.recordClassIndex(61066);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C51703a(C51702av avVar) {
            this.f119185a = avVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f119185a.f119183a.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f119185a.f119183a.getContext(), "//privacy/suggest_account").withParam("enter_from", "foru").withParam("previous_page", this.f119185a.f119184b).withParam("is_rec", 1).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51702av(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.b7s);
        C89219l.m154716b(findViewById, "");
        this.f119183a = (TextView) findViewById;
    }
}
