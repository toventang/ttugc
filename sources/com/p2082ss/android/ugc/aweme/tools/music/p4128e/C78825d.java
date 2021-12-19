package com.p2082ss.android.ugc.aweme.tools.music.p4128e;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.d */
public final class C78825d {

    /* renamed from: a */
    public static final C27910f f177140a;

    static {
        Covode.recordClassIndex(91968);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        f177140a = createIAVServiceProxybyMonsterPlugin.getNetworkService().getRetrofitFactoryGson();
    }
}
