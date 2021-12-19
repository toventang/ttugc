package com.google.android.gms.common.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.internal.AbstractC25458j;

/* renamed from: com.google.android.gms.common.internal.v */
public final class C25573v extends AbstractDialogInterface$OnClickListenerC25543f {

    /* renamed from: a */
    private final /* synthetic */ Intent f60642a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC25458j f60643b;

    /* renamed from: c */
    private final /* synthetic */ int f60644c = 2;

    static {
        Covode.recordClassIndex(30978);
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC25543f
    /* renamed from: a */
    public final void mo41813a() {
        Intent intent = this.f60642a;
        if (intent != null) {
            this.f60643b.startActivityForResult(intent, this.f60644c);
        }
    }

    public C25573v(Intent intent, AbstractC25458j jVar) {
        this.f60642a = intent;
        this.f60643b = jVar;
    }
}
