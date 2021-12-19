package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.C6903bd;
import com.bytedance.android.livesdk.p456as.C6875i;
import com.bytedance.android.livesdk.service.p625c.p631f.C10748d;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.x */
public final /* synthetic */ class DialogInterface$OnClickListenerC11508x implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C11505v f27584a;

    /* renamed from: b */
    private final C6875i f27585b;

    /* renamed from: c */
    private final long[] f27586c;

    /* renamed from: d */
    private final C6903bd f27587d;

    static {
        Covode.recordClassIndex(13167);
    }

    DialogInterface$OnClickListenerC11508x(C11505v vVar, C6875i iVar, long[] jArr, C6903bd bdVar) {
        this.f27584a = vVar;
        this.f27585b = iVar;
        this.f27586c = jArr;
        this.f27587d = bdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C11505v vVar = this.f27584a;
        long[] jArr = this.f27586c;
        C6903bd bdVar = this.f27587d;
        dialogInterface.dismiss();
        C6875i.m14730a(vVar.f27578a, "saved_uid_recharge", jArr[0]);
        C10748d.m19337a(0);
        vVar.mo18321b(bdVar);
    }
}
