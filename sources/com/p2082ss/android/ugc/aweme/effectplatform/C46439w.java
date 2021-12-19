package com.p2082ss.android.ugc.aweme.effectplatform;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.w */
public final class C46439w implements IEffectNetWorker {
    static {
        Covode.recordClassIndex(55020);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public final InputStream execute(EffectRequest effectRequest) {
        C22099u<TypedInput> execute;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Pair<String, String> a = C14759i.m27066a(effectRequest.getUrl(), linkedHashMap);
            String str = (String) a.second;
            boolean isUseCommonParams = effectRequest.isUseCommonParams();
            C63244g.m114602a().mo73295w();
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) C63244g.m114602a().mo73257C().createRetrofit((String) a.first, isUseCommonParams, EffectNetworkAPI.class);
            if ("POST".equals(effectRequest.getHttpMethod())) {
                execute = effectNetworkAPI.doPost(isUseCommonParams, Integer.MAX_VALUE, str, effectRequest.getParams()).execute();
            } else {
                execute = effectNetworkAPI.doGet(isUseCommonParams, Integer.MAX_VALUE, str, linkedHashMap).execute();
            }
            if (!execute.f52261a.mo35845a()) {
                return null;
            }
            InputStream in = execute.f52262b.mo11577in();
            effectRequest.setContentLength(execute.f52262b.length());
            return in;
        } catch (IOException e) {
            effectRequest.setErrorMsg(e.getMessage());
            return null;
        } catch (Exception e2) {
            effectRequest.setErrorMsg(e2.getMessage());
            return null;
        }
    }
}
