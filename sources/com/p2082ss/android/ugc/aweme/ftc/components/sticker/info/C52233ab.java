package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.ab */
final /* synthetic */ class C52233ab implements AbstractC78486c {

    /* renamed from: a */
    private final C52264i f120343a;

    static {
        Covode.recordClassIndex(61621);
    }

    C52233ab(C52264i iVar) {
        this.f120343a = iVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c
    /* renamed from: a */
    public final void mo87979a(Object obj) {
        C52264i iVar = this.f120343a;
        C52154a aVar = (C52154a) obj;
        if ((!iVar.mo88019a() && !iVar.mo88021b()) || iVar.f120433d.f120317k != C52264i.f120409O) {
            return;
        }
        if (iVar.mo88021b()) {
            iVar.mo88015a(aVar, 1);
        } else {
            iVar.mo88015a(aVar, 0);
        }
    }
}
