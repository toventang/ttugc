package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.auth.api.signin.AbstractC25293a;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
public final class C25308h implements AbstractC25293a {
    static {
        Covode.recordClassIndex(30698);
    }

    @Override // com.google.android.gms.auth.api.signin.AbstractC25293a
    /* renamed from: b */
    public final AbstractC25478k<Status> mo41383b(AbstractC25357i iVar) {
        return C25309i.m48666a(iVar, iVar.mo41525b(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.AbstractC25293a
    /* renamed from: a */
    public final Intent mo41382a(AbstractC25357i iVar) {
        return C25309i.m48665a(iVar.mo41525b(), ((C25307g) iVar.mo41517a(C25253a.f59866b)).f60055a);
    }
}
