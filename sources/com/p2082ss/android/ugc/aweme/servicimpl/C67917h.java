package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.record.AbstractC66810d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72460e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83719b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.h */
public final class C67917h implements AbstractC67906c {

    /* renamed from: a */
    public ShortVideoContext f152130a;

    /* renamed from: b */
    private final int f152131b = 1;

    /* renamed from: c */
    private final int f152132c = 2;

    /* renamed from: d */
    private final int f152133d = 4;

    /* renamed from: e */
    private final int f152134e = 8;

    /* renamed from: f */
    private final C83719b f152135f = new C83719b();

    static {
        Covode.recordClassIndex(80086);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.h$a */
    static final class C67918a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C67917h f152136a;

        static {
            Covode.recordClassIndex(80087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67918a(C67917h hVar) {
            super(0);
            this.f152136a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f152136a.mo108513a());
        }
    }

    /* renamed from: f */
    private final boolean m120188f() {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        return shortVideoContext.mo110022c();
    }

    /* renamed from: k */
    private final boolean m120193k() {
        if (m120195m() || m120194l()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.h$b */
    static final class C67919b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67917h f152137a;

        static {
            Covode.recordClassIndex(80088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67919b(C67917h hVar) {
            super(0);
            this.f152137a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C67917h hVar = this.f152137a;
            if (C63238c.f143592s.mo93840a()) {
                hVar.mo108512a("shoot_way");
            } else {
                hVar.mo108512a("settings");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: i */
    private final boolean m120191i() {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!C78948b.m137764a(shortVideoContext)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f152130a;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155827l != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private final boolean m120195m() {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!shortVideoContext.f155752M) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f152130a;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155778aL) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m120186d() {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) "comment_reply", (Object) shortVideoContext.f155831p)) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f152130a;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext2.f155831p, (Object) "question_and_answer")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m120187e() {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext.f155817b.mo109889b()) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f152130a;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155817b.mo109890c()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m120190h() {
        if (mo108513a()) {
            ShortVideoContext shortVideoContext = this.f152130a;
            if (shortVideoContext == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (shortVideoContext.f155798ah) {
                return true;
            }
        }
        if (!m120189g() || !m120191i()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final boolean m120192j() {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!C89219l.m154714a((Object) "push", (Object) shortVideoContext.f155831p)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f152130a;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155798ah) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final boolean m120194l() {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!shortVideoContext.f155752M) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f152130a;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155763X != 15) {
            return false;
        }
        ShortVideoContext shortVideoContext3 = this.f152130a;
        if (shortVideoContext3 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!shortVideoContext3.f155778aL) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo108515c() {
        if (m120187e() || m120188f()) {
            return false;
        }
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext.mo110033i() || m120193k()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private final boolean m120189g() {
        if (m120188f()) {
            return false;
        }
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext.f155804an != 0) {
            ShortVideoContext shortVideoContext2 = this.f152130a;
            if (shortVideoContext2 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            int i = shortVideoContext2.f155804an;
            int i2 = this.f152133d;
            if ((i & i2) != i2) {
                return false;
            }
        }
        if (!C78948b.m137763a()) {
            return false;
        }
        ShortVideoContext shortVideoContext3 = this.f152130a;
        if (shortVideoContext3 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!shortVideoContext3.f155817b.mo109889b()) {
            ShortVideoContext shortVideoContext4 = this.f152130a;
            if (shortVideoContext4 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (!shortVideoContext4.f155817b.mo109890c()) {
                ShortVideoContext shortVideoContext5 = this.f152130a;
                if (shortVideoContext5 == null) {
                    C89219l.m154710a("shortVideoContext");
                }
                if (shortVideoContext5.f155765Z != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    private final boolean m120197o() {
        int i;
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!shortVideoContext.f155752M) {
            ShortVideoContext shortVideoContext2 = this.f152130a;
            if (shortVideoContext2 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (shortVideoContext2.f155817b.f155645a != 2) {
                return false;
            }
        }
        ShortVideoContext shortVideoContext3 = this.f152130a;
        if (shortVideoContext3 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext3.f155752M) {
            ShortVideoContext shortVideoContext4 = this.f152130a;
            if (shortVideoContext4 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            i = shortVideoContext4.f155763X;
        } else {
            i = C71833a.m126851b().shootMode;
        }
        if (i == 10 || i == 11 || i == 14) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo108514b() {
        if (m120187e() || m120188f()) {
            return false;
        }
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext.mo110033i() || m120193k()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private final boolean m120196n() {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext.f155831p, (Object) "single_song")) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f152130a;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext2.f155831p, (Object) "collection_music")) {
            return true;
        }
        ShortVideoContext shortVideoContext3 = this.f152130a;
        if (shortVideoContext3 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext3.f155831p, (Object) "draft_again")) {
            return true;
        }
        ShortVideoContext shortVideoContext4 = this.f152130a;
        if (shortVideoContext4 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext4.f155831p, (Object) "prop_page")) {
            return true;
        }
        ShortVideoContext shortVideoContext5 = this.f152130a;
        if (shortVideoContext5 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext5.f155831p, (Object) "anchor_combine_prop")) {
            return true;
        }
        ShortVideoContext shortVideoContext6 = this.f152130a;
        if (shortVideoContext6 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext6.f155831p, (Object) "challenge")) {
            return true;
        }
        ShortVideoContext shortVideoContext7 = this.f152130a;
        if (shortVideoContext7 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext7.f155831p, (Object) "comment_reply")) {
            return true;
        }
        ShortVideoContext shortVideoContext8 = this.f152130a;
        if (shortVideoContext8 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext8.f155831p, (Object) "question_and_answer")) {
            return true;
        }
        ShortVideoContext shortVideoContext9 = this.f152130a;
        if (shortVideoContext9 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (C89219l.m154714a((Object) shortVideoContext9.f155831p, (Object) "prop_reuse")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if (m120192j() == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00dc, code lost:
        if (m120192j() == false) goto L_0x00e5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo108513a() {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.servicimpl.C67917h.mo108513a():boolean");
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.h$d */
    static final class C67921d extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ C67917h f152139a;

        static {
            Covode.recordClassIndex(80090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67921d(C67917h hVar) {
            super(1);
            this.f152139a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.h$c */
    static final class C67920c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67917h f152138a;

        static {
            Covode.recordClassIndex(80089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67920c(C67917h hVar) {
            super(1);
            this.f152138a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C67917h hVar = this.f152138a;
            if (!booleanValue) {
                hVar.mo108512a("api");
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo108512a(String str) {
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        } else {
            C72460e.m127842a(shortVideoContext.f155831p, shortVideoContext.f155830o, str);
        }
    }

    /* renamed from: b */
    private final boolean m120185b(String str) {
        if (m120190h()) {
            return false;
        }
        AbstractC66810d l = C63244g.m114602a().mo73284l();
        ShortVideoContext shortVideoContext = this.f152130a;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        return C89219l.m154714a((Object) str, (Object) l.getDefaultShootTabTag(shortVideoContext));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ae, code lost:
        if (m120185b(com.p2082ss.android.ugc.aweme.utils.C80573ig.m139668a(com.p2082ss.android.ugc.aweme.servicimpl.EnumC67895ad.RECORD_COMBINE_180.getTagResId())) == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f1, code lost:
        if (m120185b(com.p2082ss.android.ugc.aweme.utils.C80573ig.m139668a(com.p2082ss.android.ugc.aweme.servicimpl.EnumC67895ad.RECORD_COMBINE_180.getTagResId())) != false) goto L_0x0091;
     */
    @Override // com.p2082ss.android.ugc.aweme.servicimpl.AbstractC67906c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a> mo108507a(com.bytedance.p1559o.C21582f r14) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.servicimpl.C67917h.mo108507a(com.bytedance.o.f):java.util.List");
    }
}
