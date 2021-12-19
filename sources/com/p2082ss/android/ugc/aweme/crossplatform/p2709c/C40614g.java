package com.p2082ss.android.ugc.aweme.crossplatform.p2709c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.g */
public final class C40614g {

    /* renamed from: d */
    public static final C40615a f95046d = new C40615a((byte) 0);

    /* renamed from: a */
    public long f95047a;

    /* renamed from: b */
    public boolean f95048b;

    /* renamed from: c */
    public final C40610e f95049c;

    static {
        Covode.recordClassIndex(48454);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.g$a */
    public static final class C40615a {
        static {
            Covode.recordClassIndex(48455);
        }

        private C40615a() {
        }

        public /* synthetic */ C40615a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo69768a() {
        C39162r.m79460a("stay_time", new C33744d().mo59983a(StringSet.type, this.f95049c.f95041c).mo59983a("project_name", this.f95049c.f95039a).mo59983a("enter_from", this.f95049c.f95040b).mo59981a("duration", System.currentTimeMillis() - this.f95047a).f79943a);
    }

    public C40614g(C40610e eVar) {
        C89219l.m154721d(eVar, "");
        this.f95049c = eVar;
    }
}
