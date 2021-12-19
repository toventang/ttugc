package com.p2082ss.android.ugc.aweme.web;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.web.l */
public final class C81632l {
    static {
        Covode.recordClassIndex(95029);
    }

    /* renamed from: a */
    public static String m141481a() {
        if (!((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe() || !"boe".equals(C80333dc.m139286g())) {
            return "4776c874d6caa9b5e7c3ed2234893fd9";
        }
        return "4c043a90fa5a49883a8a50a34d74c9e0";
    }

    /* renamed from: b */
    public static List<Pattern> m141482b() {
        ArrayList arrayList = new ArrayList();
        List<String> b = C36145b.m73641b().mo63269b(C17867d.m33078a(), "aweme_gecko_offline_host_prefix", String.class);
        try {
            if (!C13603b.m24435a((Collection) b)) {
                for (String str : b) {
                    arrayList.add(Pattern.compile(str));
                }
                return arrayList;
            }
        } catch (Exception e) {
            ALog.m59865d("OFFLINE PREFIX EXCEPTION", e.getMessage());
        }
        arrayList.add(Pattern.compile("s16.tiktokcdn.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("s0.ipstatp.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("www.tiktok.com/falcon/"));
        arrayList.add(Pattern.compile("m.tiktok.com/falcon/"));
        return arrayList;
    }
}
