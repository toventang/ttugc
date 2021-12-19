package com.bytedance.android.livesdk.usermanage;

import android.content.DialogInterface;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.usermanage.c */
final /* synthetic */ class DialogInterface$OnClickListenerC11059c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final DialogC11058b f26617a;

    static {
        Covode.recordClassIndex(12680);
    }

    DialogInterface$OnClickListenerC11059c(DialogC11058b bVar) {
        this.f26617a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogC11058b bVar = this.f26617a;
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = DialogC11058b.m19687b();
        }
        if (!C58029j.f132253e) {
            C11226ao.m19882a(bVar.f26614S, (int) R.string.edd);
        } else {
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).kickOut(bVar, true, bVar.f26612Q, bVar.f26613R);
        }
        if (bVar.f26615T != null) {
            bVar.f26615T.mo11984a();
        }
        C6501b.C6502a.m13948a("blocked_list_toast_click").mo12652a(bVar.mo17886c()).mo12654b("relation").mo12658d("live_detail").mo12656c("click").mo12661f("yes").mo12655b();
    }
}
