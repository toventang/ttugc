package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.internal.C25446d;

/* renamed from: com.google.android.gms.common.api.internal.at */
public interface AbstractC25383at {
    static {
        Covode.recordClassIndex(30782);
    }

    /* renamed from: a */
    <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41563a(T t);

    /* renamed from: a */
    void mo41564a();

    /* renamed from: a */
    void mo41565a(int i);

    /* renamed from: a */
    void mo41566a(Bundle bundle);

    /* renamed from: a */
    void mo41567a(ConnectionResult connectionResult, C25335a<?> aVar, boolean z);

    /* renamed from: b */
    <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41569b(T t);

    /* renamed from: b */
    boolean mo41572b();

    /* renamed from: c */
    void mo41574c();
}
