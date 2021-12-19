package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.ICreationToolsPluginService */
public interface ICreationToolsPluginService {
    static {
        Covode.recordClassIndex(79623);
    }

    void asyncService(Context context, AbstractC89172b<? super Long, String> bVar, boolean z, String str, IExternalService.ServiceLoadCallback serviceLoadCallback);

    void forcePreload(Context context, String str);

    boolean isReady();

    AbstractC88979t<PluginState> pluginState();

    void preload(Context context, String str);
}
