package com.p2082ss.ttvideoengine.p4428q;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.q.d */
public final class C86615d {

    /* renamed from: a */
    public Map<String, Object> f195161a = new HashMap();

    static {
        Covode.recordClassIndex(101843);
    }

    /* renamed from: com.ss.ttvideoengine.q.d$a */
    class C86616a {

        /* renamed from: a */
        public int f195162a;

        static {
            Covode.recordClassIndex(101844);
        }

        /* renamed from: a */
        public final void mo137874a() {
            this.f195162a++;
        }

        C86616a() {
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo137873a(String str) {
        MethodCollector.m26663i(6353);
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(6353);
            return null;
        }
        synchronized (this) {
            try {
                Map map = (Map) this.f195161a.get(str);
                if (map != null) {
                    hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("pause", Integer.valueOf(((C86616a) map.get("pause")).f195162a));
                    hashMap2.put("resume", Integer.valueOf(((C86616a) map.get("resume")).f195162a));
                    hashMap.put("st_play_task_op", hashMap2);
                }
            } finally {
                MethodCollector.m26664o(6353);
            }
        }
        return hashMap;
    }
}
