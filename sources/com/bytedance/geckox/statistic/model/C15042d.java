package com.bytedance.geckox.statistic.model;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1022i.C14957a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.geckox.statistic.model.d */
public class C15042d {

    /* renamed from: a */
    public int f36743a;

    /* renamed from: b */
    public int f36744b;

    /* renamed from: c */
    public int f36745c;

    /* renamed from: d */
    public boolean f36746d;

    /* renamed from: e */
    public boolean f36747e;

    /* renamed from: f */
    public long f36748f;

    /* renamed from: g */
    public long f36749g;

    /* renamed from: h */
    public long f36750h;

    /* renamed from: i */
    public long f36751i;

    /* renamed from: j */
    public long f36752j;

    /* renamed from: k */
    public long f36753k;

    /* renamed from: l */
    public long f36754l;

    /* renamed from: m */
    public long f36755m;

    /* renamed from: n */
    public long f36756n;

    /* renamed from: o */
    public long f36757o;

    /* renamed from: p */
    public long f36758p;

    /* renamed from: q */
    public long f36759q;

    /* renamed from: r */
    public long f36760r;

    /* renamed from: s */
    public long f36761s;

    /* renamed from: t */
    public long f36762t;

    /* renamed from: u */
    public Map<String, C15043a> f36763u = new HashMap();

    static {
        Covode.recordClassIndex(17208);
    }

    /* renamed from: com.bytedance.geckox.statistic.model.d$a */
    public static class C15043a {

        /* renamed from: a */
        public String f36764a;

        /* renamed from: b */
        public boolean f36765b;

        /* renamed from: c */
        public int f36766c;

        /* renamed from: d */
        public String f36767d;

        /* renamed from: e */
        public String f36768e;

        /* renamed from: f */
        public int f36769f;

        /* renamed from: g */
        public boolean f36770g;

        /* renamed from: h */
        public long f36771h = SystemClock.uptimeMillis();

        static {
            Covode.recordClassIndex(17209);
        }

        public C15043a(String str) {
            this.f36764a = str;
        }
    }

    /* renamed from: a */
    private C15043a m27691a(String str, boolean z) {
        C15043a aVar = this.f36763u.get(str);
        if (aVar == null) {
            aVar = new C15043a(str);
            this.f36763u.put(str, aVar);
            if (!z) {
                aVar.f36770g = true;
                C14957a.m27544b();
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final C15043a mo24324a(UpdatePackage updatePackage, boolean z) {
        if (updatePackage.getZstdFallback()) {
            return m27691a("fallback_", z);
        }
        if (updatePackage.getUpdateWithPatch()) {
            return m27691a("patch_", z);
        }
        return m27691a("full_", z);
    }
}
