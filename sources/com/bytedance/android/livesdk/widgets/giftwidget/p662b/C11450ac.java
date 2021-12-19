package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.service.p625c.p630e.C10742a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ac */
public final /* synthetic */ class C11450ac implements LiveDialog.AbstractC4057b {

    /* renamed from: a */
    private final String f27469a;

    static {
        Covode.recordClassIndex(13109);
    }

    C11450ac(String str) {
        this.f27469a = str;
    }

    @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
    /* renamed from: a */
    public final void mo8359a(DialogInterface dialogInterface) {
        String str = this.f27469a;
        dialogInterface.dismiss();
        C10742a.m19333a(str, "dismiss");
    }
}
