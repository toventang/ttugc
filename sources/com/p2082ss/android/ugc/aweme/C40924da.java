package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.buildconfigdiff.C34950c;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C56873q;
import com.p2082ss.android.ugc.aweme.journey.C56877r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.da */
public final class C40924da extends AbstractC56869p {

    /* renamed from: k */
    private final AbstractC89244h f95743k = C89250i.m154773a((AbstractC89171a) new C40926b(this));

    /* renamed from: l */
    private final AbstractC89244h f95744l = C89250i.m154773a((AbstractC89171a) C40925a.f95747a);

    /* renamed from: m */
    private Boolean f95745m;

    /* renamed from: n */
    private final AbstractC89244h f95746n = C89250i.m154773a((AbstractC89171a) C40927c.f95749a);

    static {
        Covode.recordClassIndex(48776);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: W_ */
    public final boolean mo70121W_() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: c */
    public final int mo63252c() {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: g */
    public final String mo63256g() {
        return "resurrected";
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: e */
    public final int mo63254e() {
        return ((Number) this.f95744l.getValue()).intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: f */
    public final int mo63255f() {
        return ((Number) this.f95746n.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.da$a */
    static final class C40925a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C40925a f95747a = new C40925a();

        static {
            Covode.recordClassIndex(48777);
        }

        C40925a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int b = C56873q.m103137b();
            Keva.getRepo("new_user_journey").storeInt("update_interest_ab_params_return_user", b);
            return Integer.valueOf(b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.da$c */
    static final class C40927c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C40927c f95749a = new C40927c();

        static {
            Covode.recordClassIndex(48779);
        }

        C40927c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            int a = C16048b.m29633a().mo25411a("return_user_journey", ClientExpManager.return_user_journey());
            if (a == C34950c.f82436b) {
                i = 100;
            } else if (a == C34950c.f82437c) {
                i = 101;
            } else {
                i = 0;
            }
            Keva.getRepo("new_user_journey").storeInt("update_interest_recommend_group_return_user", i);
            return Integer.valueOf(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: d */
    public final int mo63253d() {
        if (!((Boolean) this.f95743k.getValue()).booleanValue() || C89219l.m154714a((Object) this.f95745m, (Object) false)) {
            return 0;
        }
        if (this.f95745m == null) {
            return 1;
        }
        if (C16048b.m29633a().mo25411a("return_user_journey", ClientExpManager.return_user_journey()) == C34950c.f82435a) {
            return 0;
        }
        return 2;
    }

    /* renamed from: com.ss.android.ugc.aweme.da$b */
    static final class C40926b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C40924da f95748a;

        static {
            Covode.recordClassIndex(48778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40926b(C40924da daVar) {
            super(0);
            this.f95748a = daVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
            if (r4 == -1) goto L_0x000a;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke() {
            /*
                r9 = this;
                long r4 = com.p2082ss.android.ugc.aweme.C40317cr.f94482c
                r6 = -1
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 > 0) goto L_0x005d
            L_0x000a:
                com.ss.android.ugc.aweme.base.ui.anchor.a r0 = com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a.f81927a
                long r4 = r0.mo61328b()
            L_0x0010:
                r8 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 > 0) goto L_0x001a
            L_0x0015:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
                return r0
            L_0x001a:
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 - r4
                r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x0029
                goto L_0x0015
            L_0x0029:
                com.ss.android.ugc.aweme.da r0 = r9.f95748a
                h.h r0 = r0.f129512e
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x003a
                goto L_0x0015
            L_0x003a:
                boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80580in.m139689d()
                if (r0 == 0) goto L_0x0041
                goto L_0x0015
            L_0x0041:
                java.lang.String r0 = "new_user_journey"
                com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)
                java.lang.String r0 = "last_show_interest_select_time"
                long r0 = r1.getLong(r0, r2)
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r0
                long r1 = com.p2082ss.android.ugc.aweme.C35442ce.m72472a()
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x005b
                goto L_0x0015
            L_0x005b:
                r8 = 1
                goto L_0x0015
            L_0x005d:
                long r4 = com.p2082ss.android.ugc.aweme.C40317cr.f94482c
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x0010
                goto L_0x000a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.C40924da.C40926b.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: a */
    public final void mo70122a(boolean z) {
        if (this.f95745m == null) {
            this.f95745m = Boolean.valueOf(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: a */
    public final C56877r mo63251a(Context context, Boolean bool) {
        int i;
        C89219l.m154721d(context, "");
        String string = context.getString(R.string.cn4);
        String string2 = context.getString(R.string.den);
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            i = R.string.cn1;
        } else {
            i = R.string.del;
        }
        return new C56877r(string, string2, context.getString(i), context.getString(R.string.deg));
    }
}
