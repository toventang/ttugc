package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.broadcast.model.C3269m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.q */
public final class C3546q {

    /* renamed from: a */
    public static final C3546q f9849a = new C3546q();

    private C3546q() {
    }

    static {
        Covode.recordClassIndex(4030);
    }

    /* renamed from: a */
    public static String m8947a() {
        return " " + C3966y.m9657a((int) R.string.e33) + " >";
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.q$b */
    static final class C3548b extends AbstractC89220m implements AbstractC89172b<Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SpannableString f9853a;

        static {
            Covode.recordClassIndex(4032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3548b(SpannableString spannableString) {
            super(1);
            this.f9853a = spannableString;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            mo8820a(obj);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo8820a(Object obj) {
            C89219l.m154721d(obj, "");
            SpannableString spannableString = this.f9853a;
            spannableString.setSpan(obj, spannableString.length() - C3546q.m8947a().length(), this.f9853a.length(), 17);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.q$a */
    public static final class C3547a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f9850a;

        /* renamed from: b */
        final /* synthetic */ C3269m f9851b;

        /* renamed from: c */
        final /* synthetic */ DataChannel f9852c;

        static {
            Covode.recordClassIndex(4031);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            Context context = this.f9850a;
            C3269m mVar = this.f9851b;
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(mVar.f9359b + "&enter_from=toast");
            b.f17379c = true;
            b.f17378b = C3966y.m9657a((int) R.string.gi2);
            webViewManager.mo13248a(context, b);
            C6501b.C6502a.m13948a("livesdk_appeal_click").mo12643a(this.f9852c).mo12651a("enter_from", "toast").mo12651a("appeal_type", "general").mo12655b();
        }

        C3547a(Context context, C3269m mVar, DataChannel dataChannel) {
            this.f9850a = context;
            this.f9851b = mVar;
            this.f9852c = dataChannel;
        }
    }
}
