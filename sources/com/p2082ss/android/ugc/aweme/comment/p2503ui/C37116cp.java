package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftStruct;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cp */
final /* synthetic */ class C37116cp implements AbstractC1214u {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87476a;

    static {
        Covode.recordClassIndex(44470);
    }

    C37116cp(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87476a = bzVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87476a;
        GiftStruct giftStruct = (GiftStruct) obj;
        if (giftStruct == null) {
            bzVar.f87370B.setVisibility(8);
            bzVar.f87372D.setVisibility(8);
            return;
        }
        bzVar.f87370B.setVisibility(0);
        bzVar.f87372D.setVisibility(0);
        if (giftStruct.getIconList() != null && giftStruct.getIconList().getUrlList() != null && !giftStruct.getIconList().getUrlList().isEmpty()) {
            C20766v a = C20761r.m39061a(giftStruct.getIconList().getUrlList().get(0));
            a.f49092E = bzVar.f87372D;
            a.f49125v = EnumC20767w.CENTER_INSIDE;
            a.mo34186c();
        }
    }
}
