package com.bytedance.analytics;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.analytics.a */
public final class C2576a {

    /* renamed from: a */
    public static final C2578b f7761a = new C2578b((byte) 0);

    /* renamed from: b */
    public String f7762b;

    /* renamed from: c */
    public String f7763c;

    /* renamed from: d */
    public EnumC2579c f7764d;

    /* renamed from: e */
    public Fragment f7765e;

    /* renamed from: f */
    public boolean f7766f;

    /* renamed from: g */
    public String f7767g;

    /* renamed from: h */
    public Map<String, String> f7768h;

    /* renamed from: i */
    public int f7769i;

    static {
        Covode.recordClassIndex(2963);
    }

    /* renamed from: com.bytedance.analytics.a$b */
    public static final class C2578b {
        static {
            Covode.recordClassIndex(2965);
        }

        public /* synthetic */ C2578b(byte b) {
            this();
        }

        private C2578b() {
        }
    }

    /* renamed from: com.bytedance.analytics.a$a */
    public static final class C2577a {

        /* renamed from: a */
        public String f7770a = "";

        /* renamed from: b */
        public String f7771b = "";

        /* renamed from: c */
        public EnumC2579c f7772c = EnumC2579c.TODO;

        /* renamed from: d */
        public Fragment f7773d;

        /* renamed from: e */
        public boolean f7774e;

        /* renamed from: f */
        public String f7775f = "";

        /* renamed from: g */
        public Map<String, String> f7776g;

        static {
            Covode.recordClassIndex(2964);
        }

        /* renamed from: a */
        public final C2576a mo7055a() {
            return new C2576a(this);
        }

        /* renamed from: b */
        public final void mo7058b(String str) {
            C89219l.m154721d(str, "");
            this.f7771b = str;
        }

        /* renamed from: a */
        public final void mo7056a(EnumC2579c cVar) {
            C89219l.m154721d(cVar, "");
            this.f7772c = cVar;
        }

        /* renamed from: a */
        public final void mo7057a(String str) {
            C89219l.m154721d(str, "");
            this.f7770a = str;
        }
    }

    /* renamed from: com.bytedance.analytics.a$c */
    public enum EnumC2579c {
        Activity,
        Fragment,
        Dialog,
        Other,
        TODO;

        static {
            Covode.recordClassIndex(2966);
        }
    }

    public C2576a(C2577a aVar) {
        C89219l.m154721d(aVar, "");
        this.f7762b = aVar.f7770a;
        this.f7763c = aVar.f7771b;
        this.f7764d = aVar.f7772c;
        this.f7765e = aVar.f7773d;
        this.f7766f = aVar.f7774e;
        this.f7767g = aVar.f7775f;
        this.f7768h = aVar.f7776g;
    }
}
