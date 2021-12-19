package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.C25116a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.h */
public abstract class AbstractC25157h {
    static {
        Covode.recordClassIndex(30523);
    }

    /* renamed from: a */
    public abstract String mo41064a();

    /* renamed from: b */
    public abstract Integer mo41065b();

    /* renamed from: c */
    public abstract C25156g mo41066c();

    /* renamed from: d */
    public abstract long mo41067d();

    /* renamed from: e */
    public abstract long mo41068e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Map<String, String> mo41070f();

    /* renamed from: i */
    public static AbstractC25158a m48227i() {
        C25116a.C25117a aVar = new C25116a.C25117a();
        aVar.f59535a = new HashMap();
        return aVar;
    }

    /* renamed from: g */
    public final Map<String, String> mo41141g() {
        return Collections.unmodifiableMap(mo41070f());
    }

    /* renamed from: h */
    public final AbstractC25158a mo41142h() {
        return new C25116a.C25117a().mo41076a(mo41064a()).mo41075a(mo41065b()).mo41074a(mo41066c()).mo41073a(mo41067d()).mo41079b(mo41068e()).mo41077a(new HashMap(mo41070f()));
    }

    /* renamed from: c */
    public final String mo41140c(String str) {
        String str2 = mo41070f().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: a */
    public final int mo41138a(String str) {
        String str2 = mo41070f().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: b */
    public final long mo41139b(String str) {
        String str2 = mo41070f().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: com.google.android.datatransport.runtime.h$a */
    public static abstract class AbstractC25158a {
        static {
            Covode.recordClassIndex(30524);
        }

        /* renamed from: a */
        public abstract AbstractC25158a mo41073a(long j);

        /* renamed from: a */
        public abstract AbstractC25158a mo41074a(C25156g gVar);

        /* renamed from: a */
        public abstract AbstractC25158a mo41075a(Integer num);

        /* renamed from: a */
        public abstract AbstractC25158a mo41076a(String str);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract AbstractC25158a mo41077a(Map<String, String> map);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Map<String, String> mo41078a();

        /* renamed from: b */
        public abstract AbstractC25158a mo41079b(long j);

        /* renamed from: b */
        public abstract AbstractC25157h mo41080b();

        /* renamed from: a */
        public final AbstractC25158a mo41143a(String str, int i) {
            mo41078a().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final AbstractC25158a mo41144a(String str, long j) {
            mo41078a().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public final AbstractC25158a mo41145a(String str, String str2) {
            mo41078a().put(str, str2);
            return this;
        }
    }
}
