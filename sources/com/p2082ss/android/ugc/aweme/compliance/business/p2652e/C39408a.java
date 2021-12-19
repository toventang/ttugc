package com.p2082ss.android.ugc.aweme.compliance.business.p2652e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2661b.C39614a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.e.a */
public final class C39408a implements AbstractC68342a {

    /* renamed from: a */
    public static final C39408a f93013a = new C39408a();

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60119a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    private C39408a() {
    }

    static {
        Covode.recordClassIndex(47095);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60118a(C68348f fVar) {
        int i;
        Integer defaultVpaContentChoice;
        C89219l.m154721d(fVar, "");
        C39614a aVar = C39608b.f93371b;
        if (fVar.f152968ad == 0) {
            ComplianceSetting c = aVar.mo69034c();
            if (c == null || (defaultVpaContentChoice = c.getDefaultVpaContentChoice()) == null) {
                i = 1;
            } else {
                i = defaultVpaContentChoice.intValue();
            }
        } else {
            i = fVar.f152968ad;
        }
        aVar.mo69026a(i);
    }
}
