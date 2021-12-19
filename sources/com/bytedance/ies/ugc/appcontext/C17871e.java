package com.bytedance.ies.ugc.appcontext;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.appcontext.e */
public final class C17871e {

    /* renamed from: q */
    public static final C17872a f42608q = new C17872a((byte) 0);

    /* renamed from: a */
    public Application f42609a;

    /* renamed from: b */
    public boolean f42610b;

    /* renamed from: c */
    public C17873f.AbstractC17877d f42611c;

    /* renamed from: d */
    public String f42612d;

    /* renamed from: e */
    public Integer f42613e;

    /* renamed from: f */
    public String f42614f;

    /* renamed from: g */
    public String f42615g;

    /* renamed from: h */
    public String f42616h;

    /* renamed from: i */
    public boolean f42617i;

    /* renamed from: j */
    public long f42618j;

    /* renamed from: k */
    public String f42619k;

    /* renamed from: l */
    public int f42620l;

    /* renamed from: m */
    public String f42621m;

    /* renamed from: n */
    public boolean f42622n;

    /* renamed from: o */
    public int f42623o;

    /* renamed from: p */
    public boolean f42624p;

    static {
        Covode.recordClassIndex(20472);
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.e$a */
    public static final class C17872a {
        static {
            Covode.recordClassIndex(20473);
        }

        private C17872a() {
        }

        public /* synthetic */ C17872a(byte b) {
            this();
        }
    }

    private C17871e() {
        this.f42618j = -1;
        this.f42620l = -1;
    }

    /* renamed from: a */
    public final Application mo28446a() {
        Application application = this.f42609a;
        if (application == null) {
            C89219l.m154710a("context");
        }
        return application;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17871e(Application application, AbstractC89172b<? super C17871e, C89391z> bVar) {
        this();
        C89219l.m154721d(application, "");
        C89219l.m154721d(bVar, "");
        this.f42609a = application;
        bVar.invoke(this);
    }
}
