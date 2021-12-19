package com.p2082ss.android.ugc.aweme.app.p2317a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33748g;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.a.b */
public final class C33566b {

    /* renamed from: a */
    public static final C33566b f79726a = new C33566b();

    /* renamed from: b */
    private static final Map<String, C33565a> f79727b = new LinkedHashMap();

    /* renamed from: c */
    private static final C33565a f79728c = new C33565a(C33748g.m69095b(), (String) null, 4);

    private C33566b() {
    }

    static {
        List<ApiConfigEntity> configList;
        Covode.recordClassIndex(40455);
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            SpringApiLimitConfig springApiLimitConfig = iESSettingsProxy.getSpringApiLimitConfig();
            C89219l.m154716b(springApiLimitConfig, "");
            if (!(springApiLimitConfig == null || (configList = springApiLimitConfig.getConfigList()) == null)) {
                for (T t : configList) {
                    Map<String, C33565a> map = f79727b;
                    C89219l.m154716b(t, "");
                    String apiName = t.getApiName();
                    C89219l.m154716b(apiName, "");
                    Boolean isBanned = t.getIsBanned();
                    C89219l.m154716b(isBanned, "");
                    boolean booleanValue = isBanned.booleanValue();
                    Long delayTime = t.getDelayTime();
                    C89219l.m154716b(delayTime, "");
                    long longValue = delayTime.longValue();
                    String apiName2 = t.getApiName();
                    C89219l.m154716b(apiName2, "");
                    map.put(apiName, new C33565a(booleanValue, longValue, apiName2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C33565a m68781a(String str) {
        C89219l.m154721d(str, "");
        C33565a aVar = f79727b.get(str);
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
