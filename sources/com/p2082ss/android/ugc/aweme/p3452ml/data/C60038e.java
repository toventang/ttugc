package com.p2082ss.android.ugc.aweme.p3452ml.data;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4601a.C89047am;

/* renamed from: com.ss.android.ugc.aweme.ml.data.e */
public final class C60038e extends AbstractC60028a {

    /* renamed from: d */
    public static boolean f136756d = C59975a.f136570a;

    /* renamed from: e */
    public static final Set<String> f136757e = C89047am.m154438a((Object[]) new String[]{"enter_homepage_familiar", "enter_homepage_hot", "enter_homepage_message", "enter_homepage_follow", "enter_homepage_fresh", "enter_personal_homepage", "shoot"});

    /* renamed from: f */
    public static final C60039a f136758f = new C60039a((byte) 0);

    /* renamed from: c */
    final ConcurrentHashMap<String, AtomicInteger> f136759c;

    /* renamed from: com.ss.android.ugc.aweme.ml.data.e$a */
    public static final class C60039a {
        static {
            Covode.recordClassIndex(70504);
        }

        private C60039a() {
        }

        public /* synthetic */ C60039a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ml.data.e$b */
    public static final class C60040b {

        /* renamed from: a */
        static C60038e f136760a = new C60038e((byte) 0);

        /* renamed from: b */
        public static final C60040b f136761b = new C60040b();

        private C60040b() {
        }

        static {
            Covode.recordClassIndex(70505);
        }
    }

    private C60038e() {
        this.f136759c = new ConcurrentHashMap<>();
    }

    static {
        Covode.recordClassIndex(70503);
    }

    public /* synthetic */ C60038e(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo97488a(Map<String, Object> map, FeatureTypeConfig featureTypeConfig) {
        int i;
        if (map == null || featureTypeConfig == null || !featureTypeConfig.getEnable()) {
            return false;
        }
        for (String str : f136757e) {
            AtomicInteger atomicInteger = this.f136759c.get(str);
            if (atomicInteger != null) {
                i = atomicInteger.intValue();
            } else {
                i = 0;
            }
            map.put("g_" + str + "_cnt", Integer.valueOf(i));
        }
        return true;
    }
}
