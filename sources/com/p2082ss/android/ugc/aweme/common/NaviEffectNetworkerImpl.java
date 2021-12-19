package com.p2082ss.android.ugc.aweme.common;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.NaviEffectNetworkerImpl */
public final class NaviEffectNetworkerImpl implements IEffectNetWorker {

    /* renamed from: com.ss.android.ugc.aweme.common.NaviEffectNetworkerImpl$EffectNetworkAPI */
    public interface EffectNetworkAPI {
        static {
            Covode.recordClassIndex(46668);
        }

        @AbstractC22000h
        @AbstractC21991ae
        AbstractC21983b<TypedInput> doGet(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) LinkedHashMap<String, String> linkedHashMap);

        @AbstractC22012t
        @AbstractC21991ae
        AbstractC21983b<TypedInput> doPost(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21994b Map<String, ? extends Object> map);
    }

    static {
        Covode.recordClassIndex(46667);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public final InputStream execute(EffectRequest effectRequest) {
        InputStream inputStream = null;
        if (effectRequest == null) {
            return null;
        }
        try {
            inputStream = m79251a(effectRequest);
            return inputStream;
        } catch (Exception e) {
            e.printStackTrace();
            return inputStream;
        }
    }

    /* renamed from: a */
    private static InputStream m79251a(EffectRequest effectRequest) {
        C22099u<TypedInput> execute;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        try {
            Pair<String, String> a = C14759i.m27066a(effectRequest.getUrl(), linkedHashMap);
            String str = (String) a.first;
            String str2 = (String) a.second;
            boolean isUseCommonParams = effectRequest.isUseCommonParams();
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            AbstractC63196au networkService = createIAVServiceProxybyMonsterPlugin.getNetworkService();
            C89219l.m154716b(str, "");
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) networkService.createRetrofit(str, isUseCommonParams, EffectNetworkAPI.class);
            if (isUseCommonParams) {
                linkedHashMap.put("game_version", "1.0");
            }
            if (C89219l.m154714a((Object) "POST", (Object) effectRequest.getHttpMethod())) {
                AbstractC21983b<TypedInput> doPost = effectNetworkAPI.doPost(isUseCommonParams, Integer.MAX_VALUE, str2, effectRequest.getParams());
                if (doPost == null) {
                    C89219l.m154715b();
                }
                execute = doPost.execute();
                C89219l.m154716b(execute, "");
            } else {
                AbstractC21983b<TypedInput> doGet = effectNetworkAPI.doGet(isUseCommonParams, Integer.MAX_VALUE, str2, linkedHashMap);
                if (doGet == null) {
                    C89219l.m154715b();
                }
                execute = doGet.execute();
                C89219l.m154716b(execute, "");
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
