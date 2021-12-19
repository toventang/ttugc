package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.live.broadcast.C3010ab;
import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.model.C3256c;
import com.bytedance.android.live.broadcast.model.C3269m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.s */
public final class C3553s {
    static {
        Covode.recordClassIndex(4037);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.s$d */
    public static final class C3557d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f9867a;

        static {
            Covode.recordClassIndex(4041);
        }

        public C3557d(Context context) {
            this.f9867a = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            Context context = this.f9867a;
            C6497a b = C3049b.C3050a.m8358b("ttlive_fetch_ban_status_all", th).mo12633b("preview");
            b.f16149e = true;
            b.mo12632a();
            C11264f.m19957a(context, th);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.s$b */
    static final class View$OnClickListenerC3555b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f9863a;

        /* renamed from: b */
        final /* synthetic */ String f9864b;

        static {
            Covode.recordClassIndex(4039);
        }

        View$OnClickListenerC3555b(Context context, String str) {
            this.f9863a = context;
            this.f9864b = str;
        }

        public final void onClick(View view) {
            C6501b.C6502a.m13948a("livesdk_enter_live_appeal_page").mo12639a().mo12651a("enter_from", "popup").mo12651a("appeal_type", "general").mo12655b();
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f9863a;
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f9864b + "&enter_from=toast");
            b.f17379c = true;
            b.f17378b = C3966y.m9657a((int) R.string.gi2);
            webViewManager.mo13248a(context, b);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.s$c */
    public static final class C3556c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f9865a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f9866b;

        static {
            Covode.recordClassIndex(4040);
        }

        public C3556c(Context context, DataChannel dataChannel) {
            this.f9865a = context;
            this.f9866b = dataChannel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3256c cVar;
            long j;
            C5832d dVar = (C5832d) obj;
            if (dVar != null && (cVar = (C3256c) dVar.data) != null) {
                Context context = this.f9865a;
                DataChannel dataChannel = this.f9866b;
                String str = "";
                C89219l.m154721d(cVar, str);
                C6497a a = C3051c.C3052a.m8360b("ttlive_fetch_ban_status_all").mo12633b("preview").mo12628a("ban_time", Long.valueOf(cVar.f9313a)).mo12627a("ban_duration", Integer.valueOf(cVar.f9314b)).mo12627a("ban_count", Integer.valueOf(cVar.f9315c)).mo12629a("ban_reason", cVar.f9318f).mo12625a("is_ban_forever", Boolean.valueOf(cVar.f9316d));
                a.f16147c = true;
                a.mo12632a();
                if (cVar.f9316d) {
                    j = -1;
                } else {
                    j = cVar.f9313a + ((long) cVar.f9314b);
                }
                if (dataChannel != null) {
                    C3269m mVar = new C3269m(j, cVar.f9317e);
                    dataChannel.mo28315b(C3010ab.class, mVar);
                    C3051c.C3052a.m8359a("ttlive_blocked_detail_url").mo12633b("preview").mo12629a("url", mVar.f9359b).mo12632a();
                    String str2 = mVar.f9358a;
                    if (str2 != null) {
                        str = str2;
                    }
                    String str3 = mVar.f9359b;
                    SpannableString spannableString = new SpannableString(C3966y.m9657a((int) R.string.eax));
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), 0, spannableString.length(), 33);
                    DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(context);
                    aVar.f22246c = str;
                    aVar.f22244a = C3966y.m9657a((int) R.string.eaw);
                    aVar.mo15244a(R.string.e3m, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC3554a.f9862a, false).mo15246a(spannableString, new View$OnClickListenerC3555b(context, str3)).mo15247a().show();
                    C6501b.C6502a.m13948a("livesdk_live_appeal_popup_show").mo12639a().mo12656c("show").mo12655b();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.s$a */
    static final class DialogInterface$OnClickListenerC3554a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC3554a f9862a = new DialogInterface$OnClickListenerC3554a();

        static {
            Covode.recordClassIndex(4038);
        }

        DialogInterface$OnClickListenerC3554a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }
}
