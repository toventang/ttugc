package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.b */
public final class C18465b {

    /* renamed from: l */
    public static C18465b f44096l;

    /* renamed from: m */
    public static final C18466a f44097m = new C18466a((byte) 0);

    /* renamed from: a */
    public IHostFrameworkDepend f44098a;

    /* renamed from: b */
    public IHostLogDepend f44099b;

    /* renamed from: c */
    public IHostMediaDepend f44100c;

    /* renamed from: d */
    public IHostOpenDepend f44101d;

    /* renamed from: e */
    public IHostContextDepend f44102e;

    /* renamed from: f */
    public IHostStyleUIDepend f44103f;

    /* renamed from: g */
    public IHostRouterDepend f44104g;

    /* renamed from: h */
    public IHostUserDepend f44105h;

    /* renamed from: i */
    public IHostNetworkDepend f44106i;

    /* renamed from: j */
    public IHostPermissionDepend f44107j;

    /* renamed from: k */
    public IHostThreadPoolExecutorDepend f44108k;

    static {
        Covode.recordClassIndex(21159);
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.b$a */
    public static final class C18466a {
        static {
            Covode.recordClassIndex(21160);
        }

        private C18466a() {
        }

        /* renamed from: a */
        public static C18465b m34354a() {
            return new C18465b((byte) 0);
        }

        public /* synthetic */ C18466a(byte b) {
            this();
        }
    }

    private C18465b() {
    }

    /* renamed from: a */
    public final C18465b mo29614a(IHostUserDepend iHostUserDepend) {
        C89219l.m154719c(iHostUserDepend, "");
        this.f44105h = iHostUserDepend;
        return this;
    }

    /* renamed from: a */
    public final synchronized void mo29615a() {
        MethodCollector.m26663i(12067);
        if (f44096l == null) {
            f44096l = this;
        }
        MethodCollector.m26664o(12067);
    }

    public /* synthetic */ C18465b(byte b) {
        this();
    }

    /* renamed from: a */
    public final C18465b mo29605a(IHostContextDepend iHostContextDepend) {
        C89219l.m154719c(iHostContextDepend, "");
        this.f44102e = iHostContextDepend;
        return this;
    }

    /* renamed from: a */
    public final C18465b mo29606a(IHostFrameworkDepend iHostFrameworkDepend) {
        C89219l.m154719c(iHostFrameworkDepend, "");
        this.f44098a = iHostFrameworkDepend;
        return this;
    }

    /* renamed from: a */
    public final C18465b mo29607a(IHostLogDepend iHostLogDepend) {
        C89219l.m154719c(iHostLogDepend, "");
        this.f44099b = iHostLogDepend;
        return this;
    }

    /* renamed from: a */
    public final C18465b mo29608a(IHostMediaDepend iHostMediaDepend) {
        C89219l.m154719c(iHostMediaDepend, "");
        this.f44100c = iHostMediaDepend;
        return this;
    }

    /* renamed from: a */
    public final C18465b mo29609a(IHostNetworkDepend iHostNetworkDepend) {
        C89219l.m154719c(iHostNetworkDepend, "");
        this.f44106i = iHostNetworkDepend;
        return this;
    }

    /* renamed from: a */
    public final C18465b mo29610a(IHostOpenDepend iHostOpenDepend) {
        C89219l.m154719c(iHostOpenDepend, "");
        this.f44101d = iHostOpenDepend;
        return this;
    }

    /* renamed from: a */
    public final C18465b mo29611a(IHostPermissionDepend iHostPermissionDepend) {
        C89219l.m154719c(iHostPermissionDepend, "");
        this.f44107j = iHostPermissionDepend;
        return this;
    }

    /* renamed from: a */
    public final C18465b mo29612a(IHostRouterDepend iHostRouterDepend) {
        C89219l.m154719c(iHostRouterDepend, "");
        this.f44104g = iHostRouterDepend;
        return this;
    }

    /* renamed from: a */
    public final C18465b mo29613a(IHostStyleUIDepend iHostStyleUIDepend) {
        C89219l.m154719c(iHostStyleUIDepend, "");
        this.f44103f = iHostStyleUIDepend;
        return this;
    }
}
