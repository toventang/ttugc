package com.p2082ss.android.ugc.aweme.p2436cc;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46917ex;
import com.p2082ss.android.ugc.aweme.p2436cc.p2438b.C35432a;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cc.c */
public final class C35434c {

    /* renamed from: a */
    public static final C35434c f83600a = new C35434c();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Long> f83601b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static AbstractC35423a f83602c = new C35432a();

    private C35434c() {
    }

    static {
        Covode.recordClassIndex(42610);
    }

    /* renamed from: b */
    public static final void m72464b(String str) {
        C89219l.m154721d(str, "");
        m72462a(str, EnumC35431b.SUCCESS);
    }

    /* renamed from: a */
    public static final void m72461a(String str) {
        C89219l.m154721d(str, "");
        if (C46917ex.f109335a && !TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = f83601b;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
            }
            concurrentHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public static final void m72462a(String str, EnumC35431b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        if (C46917ex.f109335a && !TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = f83601b;
            if (concurrentHashMap.containsKey(str)) {
                long j = 0;
                if (bVar == EnumC35431b.SUCCESS) {
                    Long l = concurrentHashMap.get(str);
                    if (l != null && l.longValue() > 0) {
                        j = System.currentTimeMillis() - l.longValue();
                    } else {
                        return;
                    }
                }
                m72463a(str, bVar, j);
                concurrentHashMap.remove(str);
            }
        }
    }

    /* renamed from: a */
    private static void m72463a(String str, EnumC35431b bVar, long j) {
        AbstractC35423a aVar = f83602c;
        if (aVar != null) {
            aVar.mo62327a(str, bVar, j);
        }
    }
}
