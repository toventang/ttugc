package com.facebook.p1814a;

import android.os.Build;
import android.os.Bundle;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24798j;
import com.facebook.EnumC25029u;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24783w;
import com.facebook.p1814a.p1818c.C23912a;
import com.facebook.p1814a.p1819d.C23915a;
import com.facebook.p1814a.p1823h.C23977a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.a.c */
public final class C23909c implements Serializable {

    /* renamed from: a */
    private static final HashSet<String> f56605a = new HashSet<>();
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final JSONObject f56606b;

    /* renamed from: c */
    private final boolean f56607c;

    /* renamed from: d */
    private final boolean f56608d;

    /* renamed from: e */
    private final String f56609e;

    /* renamed from: f */
    private final String f56610f;

    public final boolean getIsImplicit() {
        return this.f56607c;
    }

    public final JSONObject getJSONObject() {
        return this.f56606b;
    }

    public final String getName() {
        return this.f56609e;
    }

    /* renamed from: com.facebook.a.c$a */
    static class C23910a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a */
        private final String f56611a;

        /* renamed from: b */
        private final boolean f56612b;

        /* renamed from: c */
        private final boolean f56613c;

        static {
            Covode.recordClassIndex(28031);
        }

        private Object readResolve() {
            return new C23909c(this.f56611a, this.f56612b, this.f56613c, null, (byte) 0);
        }
    }

    /* renamed from: com.facebook.a.c$b */
    static class C23911b implements Serializable {
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: a */
        private final String f56614a;

        /* renamed from: b */
        private final boolean f56615b;

        /* renamed from: c */
        private final boolean f56616c;

        /* renamed from: d */
        private final String f56617d;

        static {
            Covode.recordClassIndex(28032);
        }

        private Object readResolve() {
            return new C23909c(this.f56614a, this.f56615b, this.f56616c, this.f56617d, (byte) 0);
        }

        private C23911b(String str, boolean z, boolean z2, String str2) {
            this.f56614a = str;
            this.f56615b = z;
            this.f56616c = z2;
            this.f56617d = str2;
        }

        /* synthetic */ C23911b(String str, boolean z, boolean z2, String str2, byte b) {
            this(str, z, z2, str2);
        }
    }

    static {
        Covode.recordClassIndex(28030);
    }

    private Object writeReplace() {
        return new C23911b(this.f56606b.toString(), this.f56607c, this.f56608d, this.f56610f, (byte) 0);
    }

    public final boolean isChecksumValid() {
        if (this.f56610f == null) {
            return true;
        }
        return m45210a().equals(this.f56610f);
    }

    public final String toString() {
        return C1764a.m5928a("\"%s\", implicit: %b, json: %s", new Object[]{this.f56606b.optString("_eventName"), Boolean.valueOf(this.f56607c), this.f56606b.toString()});
    }

    /* renamed from: a */
    private String m45210a() {
        if (Build.VERSION.SDK_INT > 19) {
            return m45214b(this.f56606b.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.f56606b.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str).append(" = ").append(this.f56606b.optString(str)).append('\n');
        }
        return m45214b(sb.toString());
    }

    /* renamed from: b */
    private static String m45214b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(C1764a.m5928a("%02x", new Object[]{Byte.valueOf(digest[i])}));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            C24693ad.m47255a("Failed to generate checksum: ", (Exception) e);
            return "0";
        } catch (UnsupportedEncodingException e2) {
            C24693ad.m47255a("Failed to generate checksum: ", (Exception) e2);
            return "1";
        }
    }

    /* renamed from: a */
    private Map<String, String> m45211a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            m45213a(str);
            Object com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m45215x29758541(bundle, str);
            if ((com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) || (com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof Number)) {
                hashMap.put(str, com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get.toString());
            } else {
                throw new C24798j(C1764a.m5928a("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, str}));
            }
        }
        C23915a.m45223a(hashMap);
        C23977a.m45339a(hashMap, this.f56609e);
        C23912a.m45218a(hashMap, this.f56609e);
        return hashMap;
    }

    /* renamed from: a */
    private static void m45213a(String str) {
        boolean contains;
        MethodCollector.m26663i(5813);
        if (str == null) {
            str = "<None Provided>";
        } else if (str.length() != 0 && str.length() <= 40) {
            HashSet<String> hashSet = f56605a;
            synchronized (hashSet) {
                try {
                    contains = hashSet.contains(str);
                } finally {
                    MethodCollector.m26664o(5813);
                }
            }
            if (contains) {
                MethodCollector.m26664o(5813);
                return;
            } else if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
                synchronized (hashSet) {
                    try {
                        hashSet.add(str);
                    } finally {
                        MethodCollector.m26664o(5813);
                    }
                }
                return;
            } else {
                C24798j jVar = new C24798j(C1764a.m5928a("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
                MethodCollector.m26664o(5813);
                throw jVar;
            }
        }
        C24798j jVar2 = new C24798j(C1764a.m5929a(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, 40}));
        MethodCollector.m26664o(5813);
        throw jVar2;
    }

    /* renamed from: com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
    public static Object m45215x29758541(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private C23909c(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f56606b = jSONObject;
        this.f56607c = z;
        this.f56609e = jSONObject.optString("_eventName");
        this.f56610f = str2;
        this.f56608d = z2;
    }

    /* synthetic */ C23909c(String str, boolean z, boolean z2, String str2, byte b) {
        this(str, z, z2, str2);
    }

    /* renamed from: a */
    private JSONObject m45212a(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        m45213a(str2);
        JSONObject jSONObject = new JSONObject();
        String a = C23977a.m45337a(str2);
        jSONObject.put("_eventName", a);
        jSONObject.put("_eventName_md5", m45214b(a));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> a2 = m45211a(bundle);
            for (String str3 : a2.keySet()) {
                jSONObject.put(str3, a2.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f56608d) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f56607c) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C24783w.m47441a(EnumC25029u.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    public C23909c(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        this.f56607c = z;
        this.f56608d = z2;
        this.f56609e = str2;
        this.f56606b = m45212a(str, str2, d, bundle, uuid);
        this.f56610f = m45210a();
    }
}
