package com.p2082ss.android.ugc.aweme.social.widget.card.rec;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.d */
public final class C74827d {

    /* renamed from: a */
    public final int f168178a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.d$b */
    public static final class C74829b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f168186a;

        /* renamed from: b */
        int f168187b;

        /* renamed from: c */
        final /* synthetic */ C74827d f168188c;

        static {
            Covode.recordClassIndex(87687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74829b(C74827d dVar, AbstractC89124d dVar2) {
            super(dVar2);
            this.f168188c = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f168186a = obj;
            this.f168187b |= Integer.MIN_VALUE;
            return this.f168188c.mo117890b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.d$c */
    public static final class C74830c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f168189a;

        /* renamed from: b */
        int f168190b;

        /* renamed from: c */
        final /* synthetic */ C74827d f168191c;

        static {
            Covode.recordClassIndex(87688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74830c(C74827d dVar, AbstractC89124d dVar2) {
            super(dVar2);
            this.f168191c = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f168189a = obj;
            this.f168190b |= Integer.MIN_VALUE;
            return this.f168191c.mo117889a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.d$d */
    public static final class C74831d extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f168192a;

        /* renamed from: b */
        int f168193b;

        /* renamed from: c */
        final /* synthetic */ C74827d f168194c;

        static {
            Covode.recordClassIndex(87689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74831d(C74827d dVar, AbstractC89124d dVar2) {
            super(dVar2);
            this.f168194c = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f168192a = obj;
            this.f168193b |= Integer.MIN_VALUE;
            return this.f168194c.mo117888a((C74828a) null, this);
        }
    }

    static {
        Covode.recordClassIndex(87685);
    }

    public C74827d(int i) {
        this.f168178a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo117890b(p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.friends.model.UploadContactsResult> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.C74829b
            if (r0 == 0) goto L_0x003b
            r4 = r6
            com.ss.android.ugc.aweme.social.widget.card.rec.d$b r4 = (com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.C74829b) r4
            int r0 = r4.f168187b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003b
            int r0 = r4.f168187b
            int r0 = r0 - r1
            r4.f168187b = r0
        L_0x0013:
            java.lang.Object r1 = r4.f168186a
            h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f168187b
            r2 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r2) goto L_0x0041
            p4600h.C89382r.m154942a(r1)
        L_0x0021:
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            return r1
        L_0x0027:
            p4600h.C89382r.m154942a(r1)
            com.ss.android.ugc.aweme.friends.service.a r1 = com.p2082ss.android.ugc.aweme.friends.service.C51648a.f118980a
            int r0 = r5.f168178a
            f.a.t r0 = r1.mo87314b(r0)
            r4.f168187b = r2
            java.lang.Object r1 = kotlinx.coroutines.p4638c.C89575b.m155515a(r0, r4)
            if (r1 != r3) goto L_0x0021
            return r3
        L_0x003b:
            com.ss.android.ugc.aweme.social.widget.card.rec.d$b r4 = new com.ss.android.ugc.aweme.social.widget.card.rec.d$b
            r4.<init>(r5, r6)
            goto L_0x0013
        L_0x0041:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.mo117890b(h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo117889a(p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.friends.model.FriendList<com.p2082ss.android.ugc.aweme.friends.model.Friend>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.C74830c
            if (r0 == 0) goto L_0x0049
            r6 = r8
            com.ss.android.ugc.aweme.social.widget.card.rec.d$c r6 = (com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.C74830c) r6
            int r0 = r6.f168190b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0049
            int r0 = r6.f168190b
            int r0 = r0 - r1
            r6.f168190b = r0
        L_0x0013:
            java.lang.Object r1 = r6.f168189a
            h.c.a.a r5 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r6.f168190b
            r4 = 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0027
            if (r0 != r4) goto L_0x004f
            p4600h.C89382r.m154942a(r1)
        L_0x0023:
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            return r1
        L_0x0027:
            p4600h.C89382r.m154942a(r1)
            com.ss.android.ugc.aweme.friends.service.a r2 = com.p2082ss.android.ugc.aweme.friends.service.C51648a.f118980a
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            java.lang.String r1 = r0.getCurUserId()
            if (r1 != 0) goto L_0x003a
            r1 = r3
        L_0x003a:
            int r0 = r7.f168178a
            f.a.t r0 = r2.mo87301a(r1, r0)
            r6.f168190b = r4
            java.lang.Object r1 = kotlinx.coroutines.p4638c.C89575b.m155515a(r0, r6)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x0049:
            com.ss.android.ugc.aweme.social.widget.card.rec.d$c r6 = new com.ss.android.ugc.aweme.social.widget.card.rec.d$c
            r6.<init>(r7, r8)
            goto L_0x0013
        L_0x004f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.mo117889a(h.c.d):java.lang.Object");
    }

    /* renamed from: a */
    public static void m131398a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C66652b.f149825a.mo105655a(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo117888a(com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.C74828a r13, p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.friends.model.RecommendList> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.C74831d
            if (r0 == 0) goto L_0x0051
            r2 = r14
            com.ss.android.ugc.aweme.social.widget.card.rec.d$d r2 = (com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.C74831d) r2
            int r0 = r2.f168193b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0051
            int r0 = r2.f168193b
            int r0 = r0 - r1
            r2.f168193b = r0
        L_0x0013:
            java.lang.Object r4 = r2.f168192a
            h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r2.f168193b
            r1 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r1) goto L_0x0057
            p4600h.C89382r.m154942a(r4)
        L_0x0021:
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r4, r0)
            return r4
        L_0x0027:
            p4600h.C89382r.m154942a(r4)
            com.ss.android.ugc.aweme.social.api.RecommendUserApiService r4 = com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService.f167940a
            int r0 = r13.f168180b
            java.lang.Integer r5 = p4600h.p4603c.p4605b.p4606a.C89108b.m154610a(r0)
            int r0 = r13.f168179a
            java.lang.Integer r6 = p4600h.p4603c.p4605b.p4606a.C89108b.m154610a(r0)
            java.lang.String r7 = r13.f168183e
            java.lang.String r8 = r13.f168184f
            r0 = 2
            java.lang.Integer r9 = p4600h.p4603c.p4605b.p4606a.C89108b.m154610a(r0)
            r10 = 0
            r11 = 96
            f.a.t r0 = com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi.C74714a.m131169a(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.f168193b = r1
            java.lang.Object r4 = kotlinx.coroutines.p4638c.C89575b.m155515a(r0, r2)
            if (r4 != r3) goto L_0x0021
            return r3
        L_0x0051:
            com.ss.android.ugc.aweme.social.widget.card.rec.d$d r2 = new com.ss.android.ugc.aweme.social.widget.card.rec.d$d
            r2.<init>(r12, r14)
            goto L_0x0013
        L_0x0057:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.mo117888a(com.ss.android.ugc.aweme.social.widget.card.rec.d$a, h.c.d):java.lang.Object");
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.d$a */
    public static final class C74828a {

        /* renamed from: a */
        public int f168179a;

        /* renamed from: b */
        public final int f168180b;

        /* renamed from: c */
        public final int f168181c;

        /* renamed from: d */
        public boolean f168182d;

        /* renamed from: e */
        public final String f168183e;

        /* renamed from: f */
        public final String f168184f;

        /* renamed from: g */
        public final int f168185g;

        static {
            Covode.recordClassIndex(87686);
        }

        public C74828a() {
            this(0, 0, false, (String) null, (String) null, 0, 127);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C74828a)) {
                return false;
            }
            C74828a aVar = (C74828a) obj;
            return this.f168179a == aVar.f168179a && this.f168180b == aVar.f168180b && this.f168181c == aVar.f168181c && this.f168182d == aVar.f168182d && C89219l.m154714a(this.f168183e, aVar.f168183e) && C89219l.m154714a(this.f168184f, aVar.f168184f) && this.f168185g == aVar.f168185g;
        }

        public final int hashCode() {
            int i = ((((this.f168179a * 31) + this.f168180b) * 31) + this.f168181c) * 31;
            boolean z = this.f168182d;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (i + i2) * 31;
            String str = this.f168183e;
            int i6 = 0;
            int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f168184f;
            if (str2 != null) {
                i6 = str2.hashCode();
            }
            return ((hashCode + i6) * 31) + this.f168185g;
        }

        public final String toString() {
            return "QueryParams(cursor=" + this.f168179a + ", step=" + this.f168180b + ", maxQueryCount=" + this.f168181c + ", hasMore=" + this.f168182d + ", recImprUsers=" + this.f168183e + ", userId=" + this.f168184f + ", scene=" + this.f168185g + ")";
        }

        public C74828a(int i, int i2, int i3, boolean z, String str, String str2, int i4) {
            C89219l.m154721d(str, "");
            this.f168179a = i;
            this.f168180b = i2;
            this.f168181c = i3;
            this.f168182d = z;
            this.f168183e = str;
            this.f168184f = str2;
            this.f168185g = i4;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C74828a(int r9, int r10, boolean r11, java.lang.String r12, java.lang.String r13, int r14, int r15) {
            /*
                r8 = this;
                r7 = r14
                r6 = r13
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r0 = r15 & 2
                if (r0 == 0) goto L_0x000e
                r0 = 20
                r2 = 20
            L_0x000e:
                r0 = r15 & 4
                if (r0 == 0) goto L_0x0018
                r0 = 2147483647(0x7fffffff, float:NaN)
                r3 = 2147483647(0x7fffffff, float:NaN)
            L_0x0018:
                r0 = r15 & 8
                if (r0 == 0) goto L_0x001e
                r0 = 1
                r4 = 1
            L_0x001e:
                r0 = r15 & 16
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0030
                com.ss.android.ugc.aweme.newfollow.c.e r0 = com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e.C61505a.f139616a
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
                java.lang.String r5 = r0.mo99159a()
                p4600h.p4611f.p4613b.C89219l.m154716b(r5, r1)
            L_0x0030:
                r0 = r15 & 32
                if (r0 == 0) goto L_0x0042
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
                java.lang.String r6 = r0.getCurUserId()
                if (r6 != 0) goto L_0x0042
                r6 = r1
            L_0x0042:
                r0 = r15 & 64
                if (r0 == 0) goto L_0x0048
                r0 = 0
                r7 = 0
            L_0x0048:
                r1 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d.C74828a.<init>(int, int, boolean, java.lang.String, java.lang.String, int, int):void");
        }
    }
}
