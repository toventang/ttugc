package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.task.C17827e;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fs */
public final class C80454fs {

    /* renamed from: a */
    public static final C80454fs f180031a = new C80454fs();

    /* renamed from: com.ss.android.ugc.aweme.utils.fs$a */
    public interface AbstractC80455a {
        static {
            Covode.recordClassIndex(93723);
        }

        /* renamed from: a */
        void mo62626a(String str, Map<String, String> map);
    }

    private C80454fs() {
    }

    static {
        Covode.recordClassIndex(93722);
    }

    /* renamed from: a */
    public static final void m139461a(String str, String str2, long j, long j2, long j3, boolean z, AbstractC80455a aVar) {
        boolean z2;
        String str3 = "";
        C89219l.m154721d(str2, str3);
        C89219l.m154721d(aVar, str3);
        boolean z3 = true;
        if (str2.length() != 0 && j2 > 0 && j3 > 0 && j > 0) {
            if (str != null) {
                str3 = str;
            }
            TaskTraceMetric a = C17827e.m33009a(str3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (a != null) {
                Long valueOf = Long.valueOf(a.f42512b);
                if (valueOf.longValue() >= j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && valueOf != null) {
                    linkedHashMap.put("to_execute_stime", String.valueOf(valueOf.longValue() - j));
                }
                Long valueOf2 = Long.valueOf(a.f42513c);
                if (valueOf2.longValue() >= j && valueOf2 != null) {
                    linkedHashMap.put("to_execute_etime", String.valueOf(valueOf2.longValue() - j));
                }
                Long valueOf3 = Long.valueOf(a.f42514d);
                if (valueOf3.longValue() >= j && valueOf3 != null) {
                    linkedHashMap.put("to_shoot_stime", String.valueOf(valueOf3.longValue() - j));
                }
                Long valueOf4 = Long.valueOf(a.f42515e);
                if (valueOf4.longValue() >= j && valueOf4 != null) {
                    linkedHashMap.put("to_shoot_etime", String.valueOf(valueOf4.longValue() - j));
                }
                if (a.f42513c <= 0) {
                    z3 = false;
                }
                linkedHashMap.put("preload_ab_open", String.valueOf(z3));
            }
            linkedHashMap.put("to_request_time", String.valueOf(j2 - j));
            linkedHashMap.put("to_response_time", String.valueOf(j3 - j));
            linkedHashMap.put("page_name", str2);
            linkedHashMap.put("preload_ab_setting", String.valueOf(z));
            aVar.mo62626a("power_preload_duration_key", linkedHashMap);
        }
    }
}
