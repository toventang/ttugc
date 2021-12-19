package com.bytedance.ies.ugc.aweme.plugin.p1265a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1266b.C18123a;
import com.bytedance.ies.ugc.aweme.plugin.p1266b.EnumC18124b;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18127c;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ies.ugc.aweme.plugin.a.a */
public final class C18115a {

    /* renamed from: a */
    public boolean f43114a;

    /* renamed from: b */
    public boolean f43115b;

    /* renamed from: c */
    public boolean f43116c;

    /* renamed from: d */
    public boolean f43117d;

    /* renamed from: e */
    public boolean f43118e;

    /* renamed from: f */
    public long f43119f;

    /* renamed from: g */
    public EnumC18124b f43120g;

    /* renamed from: h */
    public List<String> f43121h;

    /* renamed from: i */
    public List<String> f43122i;

    /* renamed from: j */
    public boolean f43123j;

    /* renamed from: k */
    public AbstractC18127c f43124k;

    /* renamed from: l */
    public boolean f43125l;

    static {
        Covode.recordClassIndex(20755);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.plugin.a.a$a */
    public static final class C18116a {

        /* renamed from: a */
        public boolean f43126a = true;

        /* renamed from: b */
        public boolean f43127b = C18123a.f43179d;

        /* renamed from: c */
        public boolean f43128c = C18123a.f43179d;

        /* renamed from: d */
        public boolean f43129d = C18123a.f43179d;

        /* renamed from: e */
        public boolean f43130e;

        /* renamed from: f */
        public long f43131f = C18123a.f43177b;

        /* renamed from: g */
        public EnumC18124b f43132g = EnumC18124b.KEEP;

        /* renamed from: h */
        public List<String> f43133h;

        /* renamed from: i */
        public boolean f43134i = true;

        /* renamed from: j */
        public AbstractC18127c f43135j;

        /* renamed from: k */
        public boolean f43136k = true;

        static {
            Covode.recordClassIndex(20756);
        }

        /* renamed from: a */
        public final C18115a mo28875a() {
            return new C18115a(this, (byte) 0);
        }

        /* renamed from: a */
        public final C18116a mo28874a(int i) {
            this.f43127b = true;
            this.f43131f = TimeUnit.MINUTES.toMillis((long) i);
            return this;
        }
    }

    private C18115a(C18116a aVar) {
        this.f43114a = aVar.f43126a;
        this.f43115b = aVar.f43127b;
        this.f43116c = aVar.f43128c;
        this.f43117d = aVar.f43129d;
        this.f43118e = aVar.f43130e;
        this.f43119f = aVar.f43131f;
        this.f43120g = aVar.f43132g;
        this.f43121h = aVar.f43133h;
        this.f43123j = aVar.f43134i;
        this.f43124k = aVar.f43135j;
        this.f43125l = aVar.f43136k;
    }

    /* synthetic */ C18115a(C18116a aVar, byte b) {
        this(aVar);
    }
}
