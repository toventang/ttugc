package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.record.AbstractC66810d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72460e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.f */
public final class C67910f implements AbstractC67906c {

    /* renamed from: a */
    public static final C67911a f152118a = new C67911a((byte) 0);

    /* renamed from: b */
    private ShortVideoContext f152119b;

    /* renamed from: c */
    private final int f152120c = 1;

    /* renamed from: d */
    private final int f152121d = 2;

    /* renamed from: e */
    private final int f152122e = 4;

    /* renamed from: f */
    private final int f152123f = 8;

    static {
        Covode.recordClassIndex(80079);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$a */
    public static final class C67911a {
        static {
            Covode.recordClassIndex(80080);
        }

        private C67911a() {
        }

        public /* synthetic */ C67911a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$b */
    static final class C67912b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C67910f f152124a;

        static {
            Covode.recordClassIndex(80081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67912b(C67910f fVar) {
            super(0);
            this.f152124a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f152124a.mo108511a());
        }
    }

    /* renamed from: d */
    private final boolean m120175d() {
        ShortVideoContext shortVideoContext = this.f152119b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        return shortVideoContext.mo110022c();
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$c */
    static final class C67913c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67910f f152125a;

        static {
            Covode.recordClassIndex(80082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67913c(C67910f fVar) {
            super(0);
            this.f152125a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C67910f fVar = this.f152125a;
            if (C63238c.f143592s.mo93840a()) {
                fVar.mo108510a("shoot_way");
            } else {
                fVar.mo108510a("settings");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: g */
    private final boolean m120178g() {
        ShortVideoContext shortVideoContext = this.f152119b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!C78948b.m137764a(shortVideoContext)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f152119b;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155827l != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m120172b() {
        ShortVideoContext shortVideoContext = this.f152119b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) "comment_reply", (Object) shortVideoContext.f155831p)) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f152119b;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext2.f155831p, (Object) "question_and_answer")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m120174c() {
        ShortVideoContext shortVideoContext = this.f152119b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext.f155817b.mo109889b()) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f152119b;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155817b.mo109890c()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m120177f() {
        if (mo108511a()) {
            ShortVideoContext shortVideoContext = this.f152119b;
            if (shortVideoContext == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (shortVideoContext.f155798ah) {
                return true;
            }
        }
        if (!m120176e() || !m120178g()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final boolean m120179h() {
        ShortVideoContext shortVideoContext = this.f152119b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!C89219l.m154714a((Object) "push", (Object) shortVideoContext.f155831p)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f152119b;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155798ah) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m120176e() {
        if (m120175d()) {
            C73991bj.m130128a("BottomTabService:stitchMode not support mv.");
            return false;
        }
        ShortVideoContext shortVideoContext = this.f152119b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext.f155804an != 0) {
            ShortVideoContext shortVideoContext2 = this.f152119b;
            if (shortVideoContext2 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            int i = shortVideoContext2.f155804an;
            int i2 = this.f152122e;
            if ((i & i2) != i2) {
                StringBuilder sb = new StringBuilder("BottomTabService:tabs not right.tab:");
                ShortVideoContext shortVideoContext3 = this.f152119b;
                if (shortVideoContext3 == null) {
                    C89219l.m154710a("shortVideoContext");
                }
                StringBuilder append = sb.append(shortVideoContext3.f155804an).append(",mask:");
                ShortVideoContext shortVideoContext4 = this.f152119b;
                if (shortVideoContext4 == null) {
                    C89219l.m154710a("shortVideoContext");
                }
                C73991bj.m130128a(append.append(shortVideoContext4.f155804an & this.f152122e).toString());
                return false;
            }
        }
        if (!C78948b.m137763a()) {
            C73991bj.m130128a("BottomTabService:ab not support mv.");
            return false;
        }
        ShortVideoContext shortVideoContext5 = this.f152119b;
        if (shortVideoContext5 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!shortVideoContext5.f155817b.mo109889b()) {
            ShortVideoContext shortVideoContext6 = this.f152119b;
            if (shortVideoContext6 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (!shortVideoContext6.f155817b.mo109890c()) {
                ShortVideoContext shortVideoContext7 = this.f152119b;
                if (shortVideoContext7 == null) {
                    C89219l.m154710a("shortVideoContext");
                }
                if (shortVideoContext7.f155765Z == null) {
                    return true;
                }
                C73991bj.m130128a("BottomTabService:shoutOut not support mv.");
                return false;
            }
        }
        C73991bj.m130128a("BottomTabService:duet/react mode not support mv.");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (m120179h() == false) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo108511a() {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.servicimpl.C67910f.mo108511a():boolean");
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$e */
    static final class C67915e extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ C67910f f152127a;

        static {
            Covode.recordClassIndex(80084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67915e(C67910f fVar) {
            super(1);
            this.f152127a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$d */
    static final class C67914d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67910f f152126a;

        static {
            Covode.recordClassIndex(80083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67914d(C67910f fVar) {
            super(1);
            this.f152126a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C67910f fVar = this.f152126a;
            if (!booleanValue) {
                fVar.mo108510a("api");
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo108510a(String str) {
        ShortVideoContext shortVideoContext = this.f152119b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        } else {
            C72460e.m127842a(shortVideoContext.f155831p, shortVideoContext.f155830o, str);
        }
    }

    /* renamed from: b */
    private final boolean m120173b(String str) {
        if (m120177f()) {
            return false;
        }
        AbstractC66810d l = C63244g.m114602a().mo73284l();
        ShortVideoContext shortVideoContext = this.f152119b;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        return C89219l.m154714a((Object) str, (Object) l.getDefaultShootTabTag(shortVideoContext));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027b, code lost:
        if (m120173b(com.p2082ss.android.ugc.aweme.utils.C80573ig.m139668a(com.p2082ss.android.ugc.aweme.servicimpl.EnumC67895ad.RECORD_COMBINE_180.getTagResId())) == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        if (r2.f155763X == 14) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018d, code lost:
        if ((r3 & r2) == r2) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        if ((r3 & r2) == r2) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021e  */
    @Override // com.p2082ss.android.ugc.aweme.servicimpl.AbstractC67906c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a> mo108507a(com.bytedance.p1559o.C21582f r18) {
        /*
        // Method dump skipped, instructions count: 699
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.servicimpl.C67910f.mo108507a(com.bytedance.o.f):java.util.List");
    }
}
