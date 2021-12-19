package com.p2082ss.android.ugc.aweme.utils;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.if */
public final class C80571if {

    /* renamed from: a */
    public static final C80572a f180189a = new C80572a((byte) 0);

    /* renamed from: b */
    private final C0484a<String, Boolean> f180190b = new C0484a<>();

    static {
        Covode.recordClassIndex(93844);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.if$a */
    public static final class C80572a {
        static {
            Covode.recordClassIndex(93845);
        }

        private C80572a() {
        }

        public /* synthetic */ C80572a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m139667a(String str, long j) {
            C89219l.m154721d(str, "");
            AbstractC63269z A = C63244g.m114602a().mo73255A();
            if (A.mo93903b() && !A.mo93901a()) {
                C80322d.m139251a("tool_performance_ui_react_event", new C33744d().mo59983a("action_name", str).mo59981a("react_duration", j).f79943a);
            }
        }
    }

    /* renamed from: a */
    public final void mo123790a(String str, long j) {
        mo123791a(str, j, false);
    }

    /* renamed from: a */
    public final void mo123791a(String str, long j, boolean z) {
        C89219l.m154721d(str, "");
        if (!z || !C89219l.m154714a((Object) this.f180190b.get(str), (Object) true)) {
            this.f180190b.put(str, true);
            C80572a.m139667a(str, j);
        }
    }
}
