package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a;

import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.C34606a;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.e */
public final class C54852e extends AbstractC56237a {

    /* renamed from: a */
    public final String f125630a = "notice_under_16_session";

    static {
        Covode.recordClassIndex(64571);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: c */
    public final int mo91860c() {
        return 29;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    public final String bL_() {
        return this.f125630a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: b */
    public final AbstractC56238b mo91859b() {
        return new C54853a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: d */
    public final void mo91863d() {
        if (C55076b.m100723b() != null) {
            IIMunder16Proxy under16Proxy = C55076b.m100723b().getUnder16Proxy();
            C89219l.m154716b(under16Proxy, "");
            if (under16Proxy != null) {
                this.f128234m = under16Proxy.mo93023e();
                this.f128233l = C34606a.m70656a(2131232881);
                if (under16Proxy.mo93031m() < 10000000000L) {
                    mo93051a(under16Proxy.mo93031m() * 1000);
                } else {
                    mo93051a(under16Proxy.mo93031m());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.e$a */
    public static final class C54853a implements AbstractC56238b {

        /* renamed from: a */
        final /* synthetic */ C54852e f125631a;

        static {
            Covode.recordClassIndex(64572);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54853a(C54852e eVar) {
            this.f125631a = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.e$a$a */
        static final class DialogInterface$OnClickListenerC54854a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C54853a f125632a;

            static {
                Covode.recordClassIndex(64573);
            }

            DialogInterface$OnClickListenerC54854a(C54853a aVar) {
                this.f125632a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                if (i == 0) {
                    C55219n a = C55219n.m100965a();
                    C89219l.m154716b(a, "");
                    a.f126297a.edit().putBoolean("notice_under_16_deleted_state", true).commit();
                    C55102l a2 = C55102l.C55104a.m100801a();
                    if (a2 != null) {
                        a2.mo92010a(this.f125632a.f125631a.f125630a);
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b
        /* renamed from: a */
        public final void mo91861a(ActivityC0945e eVar, AbstractC56237a aVar, int i) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(aVar, "");
            if (i == 0) {
                C39110a aVar2 = new C39110a(eVar);
                aVar2.mo67871a(new String[]{eVar.getString(R.string.cdb)}, new DialogInterface$OnClickListenerC54854a(this));
                aVar2.f92306a.mo458b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.e$b */
    public static final class C54855b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ IIMunder16Proxy f125633a;

        static {
            Covode.recordClassIndex(64574);
        }

        public C54855b(IIMunder16Proxy iIMunder16Proxy) {
            this.f125633a = iIMunder16Proxy;
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f125633a.mo93027i();
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }
    }
}
