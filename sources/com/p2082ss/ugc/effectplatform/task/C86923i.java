package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86795d;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.i */
public final class C86923i extends AbstractC86891b {

    /* renamed from: a */
    public final C86687a f195978a;

    /* renamed from: b */
    public final ProviderEffect f195979b;

    /* renamed from: c */
    public final String f195980c;

    static {
        Covode.recordClassIndex(102688);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.i$b */
    static final class C86925b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86923i f195982a;

        static {
            Covode.recordClassIndex(102690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86925b(C86923i iVar) {
            super(0);
            this.f195982a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f195982a.f195978a.f195443K.mo140037b(this.f195982a.f195980c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86925b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.i$c */
    public static final class C86926c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86923i f195983a;

        /* renamed from: b */
        final /* synthetic */ C86840e f195984b;

        static {
            Covode.recordClassIndex(102691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86926c(C86923i iVar, C86840e eVar) {
            super(0);
            this.f195983a = iVar;
            this.f195984b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195983a.f195978a.f195443K.mo140035a(this.f195983a.f195980c);
            if (a != null) {
                a.onFail(this.f195983a.f195979b, this.f195984b);
            }
            this.f195983a.f195978a.f195443K.mo140037b(this.f195983a.f195980c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.i$d */
    public static final class C86927d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86923i f195985a;

        /* renamed from: b */
        final /* synthetic */ int f195986b;

        /* renamed from: c */
        final /* synthetic */ long f195987c;

        static {
            Covode.recordClassIndex(102692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86927d(C86923i iVar, int i, long j) {
            super(0);
            this.f195985a = iVar;
            this.f195986b = i;
            this.f195987c = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195985a.f195978a.f195443K.mo140035a(this.f195985a.f195980c);
            if (!(a instanceof AbstractC86795d)) {
                a = null;
            }
            AbstractC86795d dVar = (AbstractC86795d) a;
            if (dVar != null) {
                dVar.onProgress(this.f195985a.f195979b, this.f195986b, this.f195987c);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.i$e */
    static final class C86928e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86923i f195988a;

        /* renamed from: b */
        final /* synthetic */ ProviderEffect f195989b;

        static {
            Covode.recordClassIndex(102693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86928e(C86923i iVar, ProviderEffect providerEffect) {
            super(0);
            this.f195988a = iVar;
            this.f195989b = providerEffect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195988a.f195978a.f195443K.mo140035a(this.f195988a.f195980c);
            if (a != null) {
                a.onSuccess(this.f195989b);
            }
            this.f195988a.f195978a.f195443K.mo140037b(this.f195988a.f195980c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0 A[SYNTHETIC] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139952a() {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.task.C86923i.mo139952a():void");
    }

    /* renamed from: a */
    private final void m150553a(C86840e eVar) {
        m150523a(new C86926c(this, eVar));
    }

    /* renamed from: com.ss.ugc.effectplatform.task.i$a */
    static final class C86924a extends AbstractC89220m implements AbstractC89183m<Integer, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86923i f195981a;

        static {
            Covode.recordClassIndex(102689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86924a(C86923i iVar) {
            super(2);
            this.f195981a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Long l) {
            this.f195981a.mo140611a(num.intValue(), l.longValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo140611a(int i, long j) {
        m150523a(new C86927d(this, i, j));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86923i(C86687a aVar, ProviderEffect providerEffect, String str) {
        super(str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(providerEffect, "");
        C89219l.m154719c(str, "");
        this.f195978a = aVar;
        this.f195979b = providerEffect;
        this.f195980c = str;
    }
}
