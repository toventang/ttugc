package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.ah */
final /* synthetic */ class RunnableC52239ah implements Runnable {

    /* renamed from: a */
    private final C52264i.C522684 f120350a;

    /* renamed from: b */
    private final C52154a f120351b;

    /* renamed from: c */
    private final String f120352c;

    static {
        Covode.recordClassIndex(61627);
    }

    RunnableC52239ah(C52264i.C522684 r1, C52154a aVar, String str) {
        this.f120350a = r1;
        this.f120351b = aVar;
        this.f120352c = str;
    }

    public final void run() {
        C52264i.C522684 r3 = this.f120350a;
        C52154a aVar = this.f120351b;
        String str = this.f120352c;
        C52264i.this.f120423N.mo87882a();
        if (aVar != null && !TextUtils.isEmpty(str)) {
            aVar.f120151b.setPin(true);
        }
        C52264i.this.f120433d.f120313g.mo88007b(aVar);
    }
}
