package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86698b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86702f;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import java.io.InputStream;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient */
public final class KNNetworkClient implements AbstractC86700d {
    public static final Companion Companion = new Companion(null);
    private final IEffectNetWorker effectNetWrapper;

    static {
        Covode.recordClassIndex(95729);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(95730);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public KNNetworkClient(IEffectNetWorker iEffectNetWorker) {
        C89219l.m154719c(iEffectNetWorker, "");
        this.effectNetWrapper = iEffectNetWorker;
    }

    private final void logRequestedUrl(C86701e eVar) {
        try {
            C88060b.m153135a("KNNetworker", "request url: ".concat(String.valueOf(new C89350l("&?device_info=[^&]*").replace(eVar.f195511a, ""))));
        } catch (Exception e) {
            C88060b.m153136a("KNNetworker", "error in print url", e);
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d
    public final C86702f fetchFromNetwork(C86701e eVar) {
        String str;
        C89219l.m154719c(eVar, "");
        if (eVar.f195512b == EnumC86699c.POST) {
            str = "POST";
        } else {
            str = "GET";
        }
        logRequestedUrl(eVar);
        EffectRequest effectRequest = new EffectRequest(str, eVar.f195511a, eVar.f195516f);
        effectRequest.setContentType(eVar.f195515e);
        if (eVar.f195513c != null) {
            effectRequest.setHeaders(eVar.f195513c);
        }
        if (eVar.f195514d != null) {
            effectRequest.setBodyParams(eVar.f195514d);
        }
        try {
            InputStream execute = this.effectNetWrapper.execute(effectRequest);
            if (execute != null) {
                return new C86702f(200, new InputStreamByteRead(execute), effectRequest.getContentLength(), effectRequest.getErrorMsg());
            }
            return new C86702f(400, new C86698b(), 0, effectRequest.getErrorMsg());
        } catch (Exception e) {
            e.printStackTrace();
            C86698b bVar = new C86698b();
            String errorMsg = effectRequest.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = e.getMessage();
            }
            return new C86702f(400, bVar, 0, errorMsg);
        }
    }
}
