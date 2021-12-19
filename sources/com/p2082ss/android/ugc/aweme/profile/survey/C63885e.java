package com.p2082ss.android.ugc.aweme.profile.survey;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2716ct.C40760a;
import com.p2082ss.android.ugc.aweme.profile.survey.C63883d;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.e */
public final /* synthetic */ class C63885e implements AbstractC1729g {

    /* renamed from: a */
    private final C63883d f144818a;

    static {
        Covode.recordClassIndex(75313);
    }

    public C63885e(C63883d dVar) {
        this.f144818a = dVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C63883d dVar = this.f144818a;
        if (!C80214ai.m139043a(iVar)) {
            if (dVar.f144817b != null) {
                C63883d.AbstractC63884a aVar = dVar.f144817b;
                iVar.mo5546e();
                aVar.mo103423a();
            }
            return null;
        }
        C40760a aVar2 = (C40760a) iVar.mo5545d();
        if (dVar.f144817b != null) {
            C63883d.AbstractC63884a aVar3 = dVar.f144817b;
            if (aVar2 == null || aVar2.f95416a == 0) {
                aVar2 = null;
            }
            aVar3.mo103424a(aVar2);
        }
        return null;
    }
}
