package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ch */
public final /* synthetic */ class C37108ch implements C17257b.AbstractC17259b {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87466a;

    /* renamed from: b */
    private final String[] f87467b;

    /* renamed from: c */
    private final String f87468c;

    static {
        Covode.recordClassIndex(44462);
    }

    public C37108ch(DialogInterface$OnShowListenerC37084bz bzVar, String[] strArr, String str) {
        this.f87466a = bzVar;
        this.f87467b = strArr;
        this.f87468c = str;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.C17257b.AbstractC17259b
    /* renamed from: a */
    public final void mo27360a() {
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87466a;
        String[] strArr = this.f87467b;
        DialogInterface$OnShowListenerC37084bz.m74808a(bzVar.f87387S, strArr[0], this.f87468c, "dismiss_gift_tooltip");
    }
}
