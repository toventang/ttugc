package com.p2082ss.android.ugc.aweme.p4173ug.amplify;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.b */
public final class C79565b {
    static {
        Covode.recordClassIndex(92772);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.b$a */
    public static final class C79566a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f178546a;

        /* renamed from: b */
        final /* synthetic */ URLSpan f178547b;

        static {
            Covode.recordClassIndex(92773);
        }

        public final void onClick(View view) {
            String str;
            C89219l.m154721d(view, "");
            AbstractC89172b bVar = this.f178546a;
            URLSpan uRLSpan = this.f178547b;
            if (uRLSpan != null) {
                str = uRLSpan.getURL();
            } else {
                str = null;
            }
            bVar.invoke(str);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C0643b.m2378c(C17867d.m33078a(), R.color.bx));
        }

        public C79566a(AbstractC89172b bVar, URLSpan uRLSpan) {
            this.f178546a = bVar;
            this.f178547b = uRLSpan;
        }
    }
}
