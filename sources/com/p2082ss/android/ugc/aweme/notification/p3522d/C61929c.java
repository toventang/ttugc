package com.p2082ss.android.ugc.aweme.notification.p3522d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61536a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.notification.d.c */
public final class C61929c implements AbstractC58259r {

    /* renamed from: a */
    public static volatile String f140580a = "";

    /* renamed from: b */
    public static final C61930a f140581b = new C61930a((byte) 0);

    /* renamed from: c */
    private final C61933a.EnumC61952g f140582c;

    /* renamed from: d */
    private final String f140583d;

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.d.c$a */
    public static final class C61930a {
        static {
            Covode.recordClassIndex(72679);
        }

        private C61930a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.d.c$a$a */
        public static final class C61931a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            public static final C61931a f140584a = new C61931a();

            static {
                Covode.recordClassIndex(72680);
            }

            C61931a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C61933a.EnumC61952g gVar;
                if (C61536a.m111449b()) {
                    if (C61933a.m112075a().f140625d) {
                        gVar = C61933a.EnumC61952g.BOOT;
                    } else if (C61933a.m112075a().f140626e) {
                        gVar = C61933a.EnumC61952g.BOOT_LAZY;
                    }
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    String curUserId = g.getCurUserId();
                    C89219l.m154716b(curUserId, "");
                    Long g2 = C89361p.m154865g(curUserId);
                    if (g2 != null && g2.longValue() > 0 && C61929c.f140580a.length() == 0) {
                        C61929c.f140580a = curUserId;
                        C58221f.m105153e().mo95704a(new C61929c(gVar, curUserId)).mo95706a();
                    }
                }
                return C89391z.f203057a;
            }
        }

        public /* synthetic */ C61930a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        if (this.f140582c == C61933a.EnumC61952g.BOOT_LAZY) {
            return EnumC58147aa.IDLE;
        }
        return EnumC58147aa.NORMAL;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(72678);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.d.c$b */
    static final class C61932b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C61932b f140585a = new C61932b();

        static {
            Covode.recordClassIndex(72681);
        }

        C61932b() {
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            return C61933a.m112078c();
        }
    }

    public C61929c(C61933a.EnumC61952g gVar, String str) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(str, "");
        this.f140582c = gVar;
        this.f140583d = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        StringBuilder append = new StringBuilder("request ").append(this.f140582c).append(", ").append(this.f140583d).append(", ");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C39109f.m79400a("PreloadNoticeTask", append.append(g.getCurUserId()).toString());
        String str = this.f140583d;
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        if (!(!C89219l.m154714a((Object) str, (Object) g2.getCurUserId()))) {
            if (this.f140582c == C61933a.EnumC61952g.BOOT) {
                C61994d.m112120a(C61933a.C61953h.f140635a);
            } else if (this.f140582c == C61933a.EnumC61952g.BOOT_LAZY) {
                long j = C61933a.m112075a().f140628g;
                if (j <= 0) {
                    C61933a.m112078c();
                } else {
                    C1731i.m5631a(j).mo5532a(C61932b.f140585a);
                }
            }
        }
    }
}
