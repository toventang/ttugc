package com.p2082ss.android.ugc.aweme.services.sparrow;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2689cq.AbstractC40316c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.p3617d.C65605a;
import com.p2082ss.android.ugc.aweme.service.IPublishXService;
import com.p2082ss.android.ugc.aweme.service.ISparrowService;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.C71818ev;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73925y;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.sparrow.PublishXServiceImpl */
public final class PublishXServiceImpl implements AbstractC40316c {
    static {
        Covode.recordClassIndex(79965);
    }

    private final String eventConclusion(Throwable th) {
        if (!(th instanceof C71818ev)) {
            return "no conclusion available";
        }
        if (isQuietlySyntheticCancel((C71818ev) th)) {
            return "User cancelled publish, no need to handle";
        }
        if (th.getCause() instanceof C65605a) {
            return "Debug mock publish failure enabled";
        }
        return "no conclusion available";
    }

    private final int eventExplanation(Throwable th) {
        if ((th instanceof C71818ev) && (th.getCause() instanceof C65605a)) {
            return 1;
        }
        return -1;
    }

    private final String eventMessage(Throwable th) {
        if ((th instanceof C71818ev) && isQuietlySyntheticCancel((C71818ev) th)) {
            return "User cancelled publish";
        }
        return "no message available";
    }

    private final boolean isQuietlySyntheticCancel(C71818ev evVar) {
        Throwable cause = evVar.getCause();
        if ((cause instanceof C71798ef) && ((C71798ef) cause).getCode() == -66666) {
            return true;
        }
        if (!(cause instanceof C73925y) || ((C73925y) cause).getErrorCode() != -39993) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2689cq.AbstractC40316c
    public final void reportPublishFailure(Throwable th, boolean z) {
        C89219l.m154721d(th, "");
        IPublishXService a = ((ISparrowService) ServiceManager.get().getService(ISparrowService.class)).mo106974a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("message", eventMessage(th));
        linkedHashMap.put("conclusion", eventConclusion(th));
        linkedHashMap.put("explanation", Integer.valueOf(eventExplanation(th)));
        String a2 = C63244g.m114602a().mo73295w().mo93763a();
        C89219l.m154716b(a2, "");
        linkedHashMap.put("did", a2);
        linkedHashMap.put("uid", C63244g.m114602a().mo73255A().mo93904c());
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        linkedHashMap.put("network_type", C80422fe.m139426b(application).toString());
        IAVSettingsService avSettingsService = AVServiceImpl.m113116a().avSettingsService();
        C89219l.m154716b(avSettingsService, "");
        String vESDKVersion = avSettingsService.getVESDKVersion();
        C89219l.m154716b(vESDKVersion, "");
        linkedHashMap.put("vesdk_version", vESDKVersion);
        IAVSettingsService avSettingsService2 = AVServiceImpl.m113116a().avSettingsService();
        C89219l.m154716b(avSettingsService2, "");
        String effectVersion = avSettingsService2.getEffectVersion();
        C89219l.m154716b(effectVersion, "");
        linkedHashMap.put("effectsdk_version", effectVersion);
        a.mo106971a(th, linkedHashMap);
    }
}
