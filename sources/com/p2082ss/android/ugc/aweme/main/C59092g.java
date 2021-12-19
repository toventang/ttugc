package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3426m.C58975a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.g */
public final class C59092g {

    /* renamed from: a */
    public static final C59092g f134498a = new C59092g();

    private C59092g() {
    }

    static {
        Covode.recordClassIndex(69440);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.main.g$a */
    public static final class CallableC59093a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f134499a;

        static {
            Covode.recordClassIndex(69441);
        }

        CallableC59093a(String str) {
            this.f134499a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            if (C58975a.m108348c(C17867d.m33078a())) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("earphone_status", new C33744d().mo59983a("plugin_type", this.f134499a).mo59983a("to_status", str).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m108569a(String str) {
        C89219l.m154721d(str, "");
        if (C39223a.m79597k().mo68722f()) {
            C1731i.m5640b(new CallableC59093a(str), C39162r.m79452a());
        }
    }

    /* renamed from: a */
    public static final void m108570a(String str, String str2, Aweme aweme) {
        String str3;
        String authorUid;
        if (C39223a.m79597k().mo68722f()) {
            C33744d a = new C33744d().mo59983a("video_status", str);
            String str4 = "";
            if (str2 == null) {
                str2 = str4;
            }
            C33744d a2 = a.mo59983a("enter_from", str2);
            if (aweme == null || (str3 = aweme.getAid()) == null) {
                str3 = str4;
            }
            C33744d a3 = a2.mo59983a("group_id", str3);
            if (!(aweme == null || (authorUid = aweme.getAuthorUid()) == null)) {
                str4 = authorUid;
            }
            C39162r.m79460a("earphone_unplug", a3.mo59983a("author_id", str4).f79943a);
        }
    }
}
