package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.af */
public final /* synthetic */ class View$OnClickListenerC52237af implements View.OnClickListener {

    /* renamed from: a */
    private final C52264i f120348a;

    static {
        Covode.recordClassIndex(61625);
    }

    View$OnClickListenerC52237af(C52264i iVar) {
        this.f120348a = iVar;
    }

    public final void onClick(View view) {
        C52154a aVar;
        ClickAgent.onClick(view);
        C52264i iVar = this.f120348a;
        iVar.f120433d.mo87951a();
        iVar.f120420K.clear();
        if (iVar.f120419J != null && (iVar.f120419J instanceof C52154a) && (aVar = (C52154a) iVar.f120419J) != null) {
            C52155a aVar2 = iVar.f120423N;
            C89219l.m154721d(aVar, "");
            aVar2.f120164a = aVar.f120151b.path;
            StickerItemModel stickerItemModel = aVar.f120151b;
            C89219l.m154716b(stickerItemModel, "");
            aVar2.f120165b = stickerItemModel.getId();
            aVar2.f120167d = aVar;
            aVar2.f120173j.mo56311a(false);
            aVar2.f120173j.mo56344c(aVar2.f120172i);
            C52155a.AbstractC52156a aVar3 = aVar2.f120168e;
            if (aVar3 != null) {
                aVar3.mo87883a();
            }
        }
    }
}
