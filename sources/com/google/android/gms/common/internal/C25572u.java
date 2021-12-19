package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.internal.u */
public final class C25572u extends AbstractDialogInterface$OnClickListenerC25543f {

    /* renamed from: a */
    private final /* synthetic */ Intent f60639a;

    /* renamed from: b */
    private final /* synthetic */ Activity f60640b;

    /* renamed from: c */
    private final /* synthetic */ int f60641c;

    static {
        Covode.recordClassIndex(30977);
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC25543f
    /* renamed from: a */
    public final void mo41813a() {
        Intent intent = this.f60639a;
        if (intent != null) {
            this.f60640b.startActivityForResult(intent, this.f60641c);
        }
    }

    public C25572u(Intent intent, Activity activity, int i) {
        this.f60639a = intent;
        this.f60640b = activity;
        this.f60641c = i;
    }
}
