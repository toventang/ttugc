package com.p2082ss.android.ugc.aweme.share.silent;

import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.C20886c;
import com.bytedance.lobby.internal.C20919d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.silent.l */
public final /* synthetic */ class DialogInterface$OnClickListenerC69464l implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C69461j f155181a;

    static {
        Covode.recordClassIndex(81802);
    }

    DialogInterface$OnClickListenerC69464l(C69461j jVar) {
        this.f155181a = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C69461j jVar = this.f155181a;
        if (jVar.getContext() instanceof ActivityC0945e) {
            C39162r.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("success"));
            jVar.f155165a = "twitter";
            C20886c.C20887a aVar = new C20886c.C20887a((ActivityC0945e) jVar.getContext());
            aVar.f49390a = "twitter";
            aVar.f49392c = new C69469q(jVar);
            C20886c a = aVar.mo34322a();
            C20919d.m39339a();
            C20919d.m39340a(a);
        }
    }
}
