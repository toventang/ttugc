package com.p2082ss.android.ugc.aweme.services.ttep;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService */
public interface ITTEPAbilityService {
    static {
        Covode.recordClassIndex(80001);
    }

    void downloadEffectAndJumpShootPage(ActivityC0945e eVar, AbstractC89171a<Boolean> aVar, String str, AbstractC89172b<? super Integer, C89391z> bVar, AbstractC89172b<? super Boolean, C89391z> bVar2);

    void downloadPreviewEffectAndResource(String str, String str2, IDownloadCallback iDownloadCallback);

    void downloadPreviewEffectAndResourceWithoutLogin(String str, String str2, IDownloadCallback iDownloadCallback);
}
