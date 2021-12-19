package com.p2082ss.android.ugc.tools.p4344f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.tools.f.b */
public final class C84425b {

    /* renamed from: a */
    public Map<String, String> f188764a = new HashMap();

    static {
        Covode.recordClassIndex(98390);
    }

    /* renamed from: com.ss.android.ugc.tools.f.b$a */
    public interface AbstractC84426a {

        /* renamed from: a */
        public static final AbstractC84426a f188765a = new AbstractC84426a() {
            /* class com.p2082ss.android.ugc.tools.p4344f.C84425b.AbstractC84426a.C844271 */

            static {
                Covode.recordClassIndex(98392);
            }

            @Override // com.p2082ss.android.ugc.tools.p4344f.C84425b.AbstractC84426a
            /* renamed from: a */
            public final String mo129410a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final AbstractC84426a f188766b = new AbstractC84426a() {
            /* class com.p2082ss.android.ugc.tools.p4344f.C84425b.AbstractC84426a.C844282 */

            static {
                Covode.recordClassIndex(98393);
            }

            @Override // com.p2082ss.android.ugc.tools.p4344f.C84425b.AbstractC84426a
            /* renamed from: a */
            public final String mo129410a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo129410a(String str);

        static {
            Covode.recordClassIndex(98391);
        }
    }

    /* renamed from: a */
    public final C84425b mo129408a(Map<? extends String, ? extends String> map) {
        if (map != null) {
            this.f188764a.putAll(map);
        }
        return this;
    }

    /* renamed from: a */
    public final C84425b mo129406a(String str, String str2) {
        return m145231a(str, str2, AbstractC84426a.f188765a);
    }

    /* renamed from: b */
    public final C84425b mo129409b(String str, boolean z) {
        if (!z) {
            return this;
        }
        return mo129403a(str, 1);
    }

    /* renamed from: a */
    public final C84425b mo129403a(String str, int i) {
        return m145231a(str, String.valueOf(i), AbstractC84426a.f188765a);
    }

    /* renamed from: a */
    public final C84425b mo129404a(String str, long j) {
        return m145231a(str, String.valueOf(j), AbstractC84426a.f188765a);
    }

    /* renamed from: a */
    public final C84425b mo129405a(String str, Object obj) {
        if (obj != null) {
            mo129406a(str, new C27910f().mo46674b(obj));
        }
        return this;
    }

    /* renamed from: a */
    public final C84425b mo129407a(String str, boolean z) {
        return m145231a(str, String.valueOf(z), AbstractC84426a.f188765a);
    }

    /* renamed from: a */
    private C84425b m145231a(String str, String str2, AbstractC84426a aVar) {
        this.f188764a.put(str, aVar.mo129410a(str2));
        return this;
    }
}
