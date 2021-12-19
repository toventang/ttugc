package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class XElementInitializerLite {
    public static final C18936a Companion = new C18936a((byte) 0);
    public static final AbstractC89244h instance$delegate = C89250i.m154773a((AbstractC89171a) C18937b.f44819a);
    private XElementConfigLite localConfig;

    /* renamed from: com.bytedance.ies.xelement.XElementInitializerLite$a */
    public static final class C18936a {
        static {
            Covode.recordClassIndex(21682);
        }

        private C18936a() {
        }

        public /* synthetic */ C18936a(byte b) {
            this();
        }
    }

    private XElementInitializerLite() {
    }

    /* renamed from: com.bytedance.ies.xelement.XElementInitializerLite$b */
    static final class C18937b extends AbstractC89220m implements AbstractC89171a<XElementInitializerLite> {

        /* renamed from: a */
        public static final C18937b f44819a = new C18937b();

        static {
            Covode.recordClassIndex(21683);
        }

        C18937b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ XElementInitializerLite invoke() {
            return new XElementInitializerLite(null);
        }
    }

    public final XElementConfigLite getConfig() {
        XElementConfigLite xElementConfigLite = this.localConfig;
        if (xElementConfigLite == null) {
            C89219l.m154710a("localConfig");
        }
        return xElementConfigLite;
    }

    static {
        Covode.recordClassIndex(21681);
    }

    public /* synthetic */ XElementInitializerLite(C89214g gVar) {
        this();
    }

    public final void setConfig(XElementConfigLite xElementConfigLite) {
        C89219l.m154719c(xElementConfigLite, "");
        this.localConfig = xElementConfigLite;
    }
}
