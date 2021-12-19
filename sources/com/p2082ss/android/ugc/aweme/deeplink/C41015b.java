package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.deeplink.b */
public class C41015b {

    /* renamed from: a */
    private static C41015b f95900a;

    static {
        Covode.recordClassIndex(48885);
    }

    private C41015b() {
    }

    /* renamed from: a */
    public static C41015b m82628a() {
        MethodCollector.m26663i(10867);
        if (f95900a == null) {
            synchronized (C41015b.class) {
                try {
                    if (f95900a == null) {
                        f95900a = new C41015b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10867);
                    throw th;
                }
            }
        }
        C41015b bVar = f95900a;
        MethodCollector.m26664o(10867);
        return bVar;
    }

    /* renamed from: a */
    public static boolean m82629a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || !Pattern.compile("\\d+\\.\\d+\\.\\d+").matcher(str).matches()) {
            return false;
        }
        String[] split = C17867d.m33088i().split("\\.");
        String[] split2 = str.split("\\.");
        for (int i = 0; i < split.length; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt < parseInt2) {
                SmartRouter.buildRoute(context, "//main/update_tips").withParam("debug_url", str2).withParam("version_required", str).addFlags(603979776).open();
                HashMap hashMap = new HashMap();
                hashMap.put("schema_url", str2);
                C39162r.m79460a("schema_update_toast_show", hashMap);
                return true;
            } else if (parseInt > parseInt2) {
                break;
            }
        }
        return false;
    }
}
