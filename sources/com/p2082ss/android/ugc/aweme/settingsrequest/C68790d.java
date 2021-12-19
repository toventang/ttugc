package com.p2082ss.android.ugc.aweme.settingsrequest;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz;
import com.p2082ss.android.ugc.aweme.setting.model.C68174d;
import com.p2082ss.android.ugc.aweme.utils.gecko.C80487c;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.d */
public class C68790d implements AbstractC68041bz.AbstractC68043a {
    static {
        Covode.recordClassIndex(81067);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz.AbstractC68043a
    /* renamed from: a */
    public void mo96447a(C68174d dVar) {
        SettingsRequestServiceImpl.m65417i().mo57278a(dVar);
        GeckoConfig m = C68174d.m120432m();
        if (m != null && !C13603b.m24435a((Collection) m.getInitialChannel())) {
            List<String> initialChannel = m.getInitialChannel();
            List<String> initialHighPriorityChannel = m.getInitialHighPriorityChannel();
            List<String> dynamicChannel = m.getDynamicChannel();
            if (initialChannel != null) {
                C80487c.C80488a.m139510a().f180078a.mo123764a(initialChannel);
            }
            if (!C13603b.m24435a((Collection) initialHighPriorityChannel)) {
                C80487c.C80488a.m139510a().f180079b.mo123764a(initialHighPriorityChannel);
            }
            if (!C13603b.m24435a((Collection) dynamicChannel)) {
                C80487c.C80488a.m139510a().f180080c.mo123764a(dynamicChannel);
            }
            new StringBuilder("dynamicChannels: ").append(dynamicChannel).append(", highPriorityChannels: ").append(initialHighPriorityChannel);
        }
    }
}
