package com.p2082ss.android.token;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1664o.AbstractC22511d;
import com.p2082ss.android.account.C29351f;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.ss.android.token.b */
public final class C30625b {

    /* renamed from: a */
    public String f73185a;

    /* renamed from: b */
    public Set<String> f73186b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public String f73187c;

    /* renamed from: d */
    public boolean f73188d = false;

    /* renamed from: e */
    public long f73189e = 600000;

    /* renamed from: f */
    public AbstractC30626a f73190f;

    /* renamed from: com.ss.android.token.b$a */
    public interface AbstractC30626a {
        static {
            Covode.recordClassIndex(37164);
        }

        /* renamed from: a */
        boolean mo54895a();
    }

    static {
        Covode.recordClassIndex(37163);
    }

    public C30625b() {
        String str;
        AbstractC22511d dVar = C29351f.f69673c;
        if (dVar == null || !dVar.mo36785a()) {
            str = C22306c.C22307a.f52737a + C22306c.C22307a.m41971a();
        } else {
            str = C22306c.C22307a.f52738b + C22306c.C22307a.m41971a();
        }
        this.f73185a = str;
        String a = C30633g.m62952a(str);
        if (a != null) {
            this.f73186b.add(a);
        }
    }
}
