package com.bytedance.ies.p1191d.p1192a.p1193a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17075a;
import com.bytedance.ies.p1191d.p1192a.AbstractC17107b;
import com.bytedance.ies.p1191d.p1192a.AbstractC17113e;
import com.bytedance.ies.p1191d.p1192a.AbstractC17121j;
import com.bytedance.ies.p1191d.p1192a.C17144y;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.a.a */
public final class C17076a extends AbstractC17107b implements AbstractC17080b {

    /* renamed from: f */
    public static C17076a f40646f;

    /* renamed from: g */
    public static final C17077a f40647g = new C17077a((byte) 0);

    /* renamed from: e */
    public final String f40648e;

    static {
        Covode.recordClassIndex(19533);
    }

    /* renamed from: com.bytedance.ies.d.a.a.a$a */
    public static final class C17077a implements AbstractC17080b {
        static {
            Covode.recordClassIndex(19534);
        }

        private C17077a() {
        }

        /* renamed from: a */
        public static C17078b m31550a() {
            return new C17078b("default_business");
        }

        public /* synthetic */ C17077a(byte b) {
            this();
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17125m
        /* renamed from: a */
        public final void mo26985a(String str) {
            C89219l.m154719c(str, "");
            C17076a aVar = C17076a.f40646f;
            if (aVar != null) {
                aVar.mo26985a(str);
            }
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17125m
        /* renamed from: b */
        public final List<C17144y> mo26986b(String str) {
            C89219l.m154719c(str, "");
            C17076a aVar = C17076a.f40646f;
            if (aVar != null) {
                return aVar.mo26986b(str);
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            if (r0 == null) goto L_0x0012;
         */
        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17125m
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.ies.p1191d.p1192a.C17144y mo26984a(com.bytedance.ies.p1191d.p1192a.C17147z r2, com.bytedance.ies.p1191d.p1192a.AbstractC17083aa r3) {
            /*
                r1 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154719c(r2, r0)
                p4600h.p4611f.p4613b.C89219l.m154719c(r3, r0)
                com.bytedance.ies.d.a.a.a r0 = com.bytedance.ies.p1191d.p1192a.p1193a.C17076a.f40646f
                if (r0 == 0) goto L_0x0016
                com.bytedance.ies.d.a.y r0 = r0.mo26984a(r2, r3)
                if (r0 != 0) goto L_0x0015
            L_0x0012:
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x0015:
                return r0
            L_0x0016:
                r0 = 0
                goto L_0x0012
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1191d.p1192a.p1193a.C17076a.C17077a.mo26984a(com.bytedance.ies.d.a.z, com.bytedance.ies.d.a.aa):com.bytedance.ies.d.a.y");
        }
    }

    /* renamed from: com.bytedance.ies.d.a.a.a$c */
    public static final class C17079c implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C17076a f40650a;

        static {
            Covode.recordClassIndex(19536);
        }

        public C17079c(C17076a aVar) {
            this.f40650a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final /* synthetic */ AbstractC18334e mo13316a() {
            return new C17081c(this.f40650a);
        }
    }

    /* renamed from: com.bytedance.ies.d.a.a.a$b */
    public static final class C17078b extends AbstractC17075a<C17076a> {

        /* renamed from: l */
        private String f40649l = "__prefetch";

        static {
            Covode.recordClassIndex(19535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17078b(String str) {
            super(str);
            C89219l.m154719c(str, "");
        }

        /* Return type fixed from 'com.bytedance.ies.d.a.b' to match base method */
        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17075a
        /* renamed from: a */
        public final /* synthetic */ C17076a mo26983a(String str, AbstractC17121j jVar, AbstractC17113e eVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(jVar, "");
            C89219l.m154719c(eVar, "");
            C17076a aVar = new C17076a(str, jVar, eVar, this.f40649l, (byte) 0);
            if (C89219l.m154714a((Object) aVar.f40711b, (Object) "default_business")) {
                C17076a.f40646f = aVar;
            }
            return aVar;
        }
    }

    private C17076a(String str, AbstractC17121j jVar, AbstractC17113e eVar, String str2) {
        super(str, jVar, eVar);
        this.f40648e = str2;
    }

    public /* synthetic */ C17076a(String str, AbstractC17121j jVar, AbstractC17113e eVar, String str2, byte b) {
        this(str, jVar, eVar, str2);
    }
}
