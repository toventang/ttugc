package com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.c.c */
public final class C78259c implements AbstractC78258b {

    /* renamed from: a */
    private final AbstractC89244h f175781a = C89250i.m154773a((AbstractC89171a) C78261b.f175784a);

    /* renamed from: b */
    private final AbstractC89244h f175782b = C89250i.m154773a((AbstractC89171a) C78260a.f175783a);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.c.c$c */
    public static final class C78262c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f175785a;

        /* renamed from: b */
        int f175786b;

        /* renamed from: c */
        final /* synthetic */ C78259c f175787c;

        /* renamed from: d */
        Object f175788d;

        static {
            Covode.recordClassIndex(91377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78262c(C78259c cVar, AbstractC89124d dVar) {
            super(dVar);
            this.f175787c = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f175785a = obj;
            this.f175786b |= Integer.MIN_VALUE;
            return this.f175787c.mo122155a(this);
        }
    }

    static {
        Covode.recordClassIndex(91374);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.c.c$a */
    static final class C78260a extends AbstractC89220m implements AbstractC89171a<IExternalService> {

        /* renamed from: a */
        public static final C78260a f175783a = new C78260a();

        static {
            Covode.recordClassIndex(91375);
        }

        C78260a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IExternalService invoke() {
            return AVExternalServiceImpl.m113114a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c.AbstractC78258b
    /* renamed from: a */
    public final Object mo122154a() {
        return this.f175781a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.c.c$b */
    static final class C78261b extends AbstractC89220m implements AbstractC89171a<AbstractC32846a> {

        /* renamed from: a */
        public static final C78261b f175784a = new C78261b();

        static {
            Covode.recordClassIndex(91376);
        }

        C78261b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC32846a invoke() {
            return C63244g.m114602a().mo73255A().mo93906e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[LOOP:0: B:10:0x0032->B:12:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c.AbstractC78258b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo122155a(p4600h.p4603c.AbstractC89124d<? super java.util.List<? extends com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel>> r6) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c.C78259c.mo122155a(h.c.d):java.lang.Object");
    }
}
