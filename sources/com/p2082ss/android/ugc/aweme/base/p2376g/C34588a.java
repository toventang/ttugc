package com.p2082ss.android.ugc.aweme.base.p2376g;

import android.content.Context;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34596c;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34598e;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.g.a */
public final class C34588a {

    /* renamed from: e */
    private static final C27910f f81624e = new C27910f();

    /* renamed from: f */
    private static final Type f81625f = new C27895a<Map<String, Map<String, Long>>>() {
        /* class com.p2082ss.android.ugc.aweme.base.p2376g.C34588a.C345891 */

        static {
            Covode.recordClassIndex(41551);
        }
    }.type;

    /* renamed from: a */
    private final String f81626a;

    /* renamed from: b */
    private Context f81627b;

    /* renamed from: c */
    private EnumC34591a f81628c;

    /* renamed from: d */
    private final String f81629d;

    /* renamed from: g */
    private Map<String, Long> f81630g;

    /* renamed from: h */
    private Map<String, Long> f81631h;

    /* renamed from: i */
    private Map<String, Long> f81632i;

    /* renamed from: j */
    private Map<String, Map<String, Long>> f81633j;

    static {
        Covode.recordClassIndex(41550);
    }

    /* renamed from: b */
    public final synchronized JSONObject mo61046b() {
        JSONObject jSONObject;
        MethodCollector.m26663i(8375);
        jSONObject = new JSONObject(mo61045a());
        MethodCollector.m26664o(8375);
        return jSONObject;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.g.a$2 */
    static /* synthetic */ class C345902 {

        /* renamed from: a */
        static final /* synthetic */ int[] f81634a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 41552(0xa250, float:5.8227E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.base.g.a$a[] r0 = com.p2082ss.android.ugc.aweme.base.p2376g.C34588a.EnumC34591a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.base.p2376g.C34588a.C345902.f81634a = r2
                com.ss.android.ugc.aweme.base.g.a$a r0 = com.p2082ss.android.ugc.aweme.base.p2376g.C34588a.EnumC34591a.PERSISTENT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.base.p2376g.C34588a.C345902.f81634a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.base.g.a$a r0 = com.p2082ss.android.ugc.aweme.base.p2376g.C34588a.EnumC34591a.APP_ALIVE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.p2376g.C34588a.C345902.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.g.a$a */
    public enum EnumC34591a {
        PERSISTENT,
        APP_ALIVE;

        static {
            Covode.recordClassIndex(41553);
        }
    }

    /* renamed from: a */
    public final synchronized String mo61045a() {
        String b;
        MethodCollector.m26663i(8374);
        b = f81624e.mo46674b(this.f81633j);
        MethodCollector.m26664o(8374);
        return b;
    }

    /* renamed from: c */
    private C34598e m70621c(String str) {
        return C34596c.m70633a(this.f81627b, str);
    }

    /* renamed from: a */
    public final synchronized C34588a mo61044a(String str) {
        C34588a b;
        MethodCollector.m26663i(8091);
        b = m70620b(str);
        MethodCollector.m26664o(8091);
        return b;
    }

    /* renamed from: b */
    private synchronized C34588a m70620b(String str) {
        long valueOf;
        MethodCollector.m26663i(8234);
        Long l = this.f81630g.get(str);
        if (l == null) {
            valueOf = 1L;
        } else {
            valueOf = Long.valueOf(l.longValue() + 1);
        }
        this.f81630g.put(str, valueOf);
        if (this.f81628c == EnumC34591a.PERSISTENT) {
            m70621c(this.f81629d).mo61057b("raw", mo61045a());
        }
        MethodCollector.m26664o(8234);
        return this;
    }

    public C34588a(Context context, String str) {
        this(context, str, EnumC34591a.PERSISTENT);
    }

    private C34588a(Context context, String str, EnumC34591a aVar) {
        this.f81630g = new LinkedHashMap();
        this.f81631h = new C0484a();
        this.f81632i = new LinkedHashMap();
        C0484a aVar2 = new C0484a();
        this.f81633j = aVar2;
        aVar2.put("events", this.f81630g);
        this.f81633j.put("durations", this.f81632i);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f81627b = applicationContext;
        this.f81626a = str;
        this.f81628c = aVar;
        if (!TextUtils.isEmpty(str)) {
            String str2 = str + "_funnel";
            this.f81629d = str2;
            int i = C345902.f81634a[aVar.ordinal()];
            if (i == 1) {
                Map map = (Map) f81624e.mo46671a(m70621c(str2).mo61051a("raw", ""), f81625f);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        Map<String, Long> map2 = this.f81633j.get(entry.getKey());
                        if (!(map2 == null || entry.getValue() == null)) {
                            map2.putAll((Map) entry.getValue());
                        }
                    }
                }
            } else if (i == 2) {
                m70621c(str2).mo61050a().clear().apply();
            }
        } else {
            throw new IllegalArgumentException("name is null");
        }
    }
}
