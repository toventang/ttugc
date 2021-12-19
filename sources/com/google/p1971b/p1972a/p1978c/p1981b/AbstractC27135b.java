package com.google.p1971b.p1972a.p1978c.p1981b;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1983d.AbstractC27139b;
import com.google.p1971b.p1972a.p1983d.C27144d;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import com.google.p1971b.p1972a.p1993g.C27185j;

/* renamed from: com.google.b.a.c.b.b */
public abstract class AbstractC27135b<T> extends C27185j {

    /* renamed from: a */
    public final String f64260a;

    /* renamed from: b */
    public final String f64261b;

    /* renamed from: c */
    public final AbstractC27139b f64262c;

    /* renamed from: d */
    public C27144d f64263d = new C27144d();

    /* renamed from: e */
    public int f64264e = -1;

    /* renamed from: f */
    public Class<T> f64265f;

    /* renamed from: g */
    private final AbstractC27130a f64266g;

    static {
        Covode.recordClassIndex(32715);
    }

    /* renamed from: a */
    public AbstractC27135b<T> mo45179b(String str, Object obj) {
        return (AbstractC27135b) super.mo45179b(str, obj);
    }

    public AbstractC27135b(AbstractC27130a aVar, String str, String str2, AbstractC27139b bVar, Class<T> cls) {
        this.f64265f = (Class) C27159b.m53980a(cls);
        this.f64266g = (AbstractC27130a) C27159b.m53980a(aVar);
        this.f64260a = (String) C27159b.m53980a(str);
        this.f64261b = (String) C27159b.m53980a(str2);
        this.f64262c = null;
        String str3 = aVar.f64244f;
        if (str3 != null) {
            C27144d dVar = this.f64263d;
            String valueOf = String.valueOf(String.valueOf(str3));
            dVar.mo45187a(new StringBuilder(valueOf.length() + 1 + "Google-API-Java-Client".length()).append(valueOf).append(" ").append("Google-API-Java-Client").toString());
            return;
        }
        this.f64263d.mo45187a("Google-API-Java-Client");
    }
}
