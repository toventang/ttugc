package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.tencent.wcdb.database.g */
public final class C87253g {

    /* renamed from: a */
    public final String f197708a;

    /* renamed from: b */
    public final String f197709b;

    /* renamed from: c */
    public String f197710c;

    /* renamed from: d */
    public int f197711d;

    /* renamed from: e */
    public int f197712e;

    /* renamed from: f */
    public Locale f197713f;

    /* renamed from: g */
    public boolean f197714g;

    /* renamed from: h */
    public boolean f197715h;

    /* renamed from: i */
    public int f197716i;

    /* renamed from: j */
    public boolean f197717j;

    /* renamed from: k */
    public boolean f197718k;

    /* renamed from: l */
    public final ArrayList<SQLiteCustomFunction> f197719l = new ArrayList<>();

    static {
        Covode.recordClassIndex(103142);
    }

    /* renamed from: a */
    public final boolean mo141242a() {
        return this.f197708a.equalsIgnoreCase(":memory:");
    }

    public C87253g(C87253g gVar) {
        if (gVar != null) {
            this.f197708a = gVar.f197708a;
            this.f197709b = gVar.f197709b;
            mo141241a(gVar);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    /* renamed from: a */
    public final void mo141241a(C87253g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("other must not be null.");
        } else if (this.f197708a.equals(gVar.f197708a)) {
            this.f197711d = gVar.f197711d;
            this.f197712e = gVar.f197712e;
            this.f197713f = gVar.f197713f;
            this.f197714g = gVar.f197714g;
            this.f197715h = gVar.f197715h;
            this.f197717j = gVar.f197717j;
            this.f197718k = gVar.f197718k;
            this.f197716i = gVar.f197716i;
            this.f197710c = gVar.f197710c;
            this.f197719l.clear();
            this.f197719l.addAll(gVar.f197719l);
        } else {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
    }

    public C87253g(String str, int i) {
        String str2;
        if (str != null) {
            this.f197708a = str;
            this.f197709b = str;
            this.f197711d = i;
            this.f197716i = 2;
            this.f197712e = 25;
            this.f197713f = Locale.getDefault();
            if ((i & 256) != 0) {
                str2 = "vfslog";
            } else {
                str2 = null;
            }
            this.f197710c = str2;
            return;
        }
        throw new IllegalArgumentException("path must not be null.");
    }
}
