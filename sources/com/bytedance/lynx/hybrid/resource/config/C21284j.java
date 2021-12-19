package com.bytedance.lynx.hybrid.resource.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.lynx.hybrid.resource.config.j */
public class C21284j {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f50510a = {new C89232y(C89204ab.m154669a(C21284j.class), "customParams", "getCustomParams()Ljava/util/Map;")};

    /* renamed from: b */
    public C21275a f50511b;

    /* renamed from: c */
    public int f50512c;

    /* renamed from: d */
    public long f50513d;

    /* renamed from: e */
    public Integer f50514e;

    /* renamed from: f */
    public boolean f50515f;

    /* renamed from: g */
    public String f50516g;

    /* renamed from: h */
    public String f50517h;

    /* renamed from: i */
    public String f50518i;

    /* renamed from: j */
    public String f50519j;

    /* renamed from: k */
    public boolean f50520k;

    /* renamed from: l */
    public boolean f50521l;

    /* renamed from: m */
    public boolean f50522m;

    /* renamed from: n */
    public C21196a f50523n;

    /* renamed from: o */
    public String f50524o;

    /* renamed from: p */
    public String f50525p;

    /* renamed from: q */
    public boolean f50526q;

    /* renamed from: r */
    public boolean f50527r;

    /* renamed from: s */
    public final AbstractC89244h f50528s;

    /* renamed from: t */
    public String f50529t;

    /* renamed from: com.bytedance.lynx.hybrid.resource.config.j$a */
    static final class C21285a extends AbstractC89220m implements AbstractC89171a<Map<String, Object>> {

        /* renamed from: a */
        public static final C21285a f50530a = new C21285a();

        static {
            Covode.recordClassIndex(24903);
        }

        C21285a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    public /* synthetic */ C21284j() {
        this("");
    }

    static {
        Covode.recordClassIndex(24902);
    }

    public String toString() {
        return "[accessKey=" + this.f50529t + ", loaderConfig=" + this.f50511b + ", dynamic=" + this.f50514e + ',' + "onlyLocal=" + this.f50515f + ", channel=" + this.f50516g + ',' + "bundle=" + this.f50517h + ", group=" + this.f50518i + ",cdnUrl=" + this.f50519j + ',' + "enableCached:" + this.f50527r + ']';
    }

    /* renamed from: a */
    public final void mo34886a(C21275a aVar) {
        C89219l.m154719c(aVar, "");
        this.f50511b = aVar;
    }

    /* renamed from: b */
    public final void mo34888b(String str) {
        C89219l.m154719c(str, "");
        this.f50517h = str;
    }

    /* renamed from: c */
    public final void mo34889c(String str) {
        C89219l.m154719c(str, "");
        this.f50519j = str;
    }

    /* renamed from: d */
    public final void mo34890d(String str) {
        C89219l.m154719c(str, "");
        this.f50524o = str;
    }

    /* renamed from: e */
    public final void mo34891e(String str) {
        C89219l.m154719c(str, "");
        this.f50525p = str;
    }

    /* renamed from: f */
    public final void mo34892f(String str) {
        C89219l.m154719c(str, "");
        this.f50529t = str;
    }

    /* renamed from: a */
    public final void mo34887a(String str) {
        C89219l.m154719c(str, "");
        this.f50516g = str;
    }

    public C21284j(String str) {
        C89219l.m154719c(str, "");
        this.f50529t = str;
        this.f50511b = new C21275a(false);
        this.f50513d = 1000;
        this.f50516g = "";
        this.f50517h = "";
        this.f50519j = "";
        this.f50520k = true;
        this.f50521l = true;
        this.f50522m = true;
        this.f50524o = "";
        this.f50525p = "";
        this.f50527r = true;
        this.f50528s = C89250i.m154773a((AbstractC89171a) C21285a.f50530a);
    }

    /* renamed from: a */
    public C21284j mo34840a(C21284j jVar) {
        C89219l.m154719c(jVar, "");
        this.f50511b = jVar.f50511b;
        this.f50513d = jVar.f50513d;
        this.f50514e = jVar.f50514e;
        this.f50515f = jVar.f50515f;
        this.f50516g = jVar.f50516g;
        this.f50517h = jVar.f50517h;
        this.f50518i = jVar.f50518i;
        this.f50519j = jVar.f50519j;
        this.f50523n = jVar.f50523n;
        this.f50526q = jVar.f50526q;
        this.f50527r = jVar.f50527r;
        this.f50524o = jVar.f50524o;
        return this;
    }
}
