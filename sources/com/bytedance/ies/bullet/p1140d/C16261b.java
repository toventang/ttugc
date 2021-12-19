package com.bytedance.ies.bullet.p1140d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16651l;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.p2082ss.android.agilelogger.ALog;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.d.b */
public final class C16261b extends C16616a implements AbstractC16652m {

    /* renamed from: a */
    final AbstractC16651l f39063a;

    static {
        Covode.recordClassIndex(18554);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.d.b$a */
    public static final class CallableC16262a<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f39064a;

        static {
            Covode.recordClassIndex(18555);
        }

        CallableC16262a(AbstractC89171a aVar) {
            this.f39064a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            this.f39064a.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.d.b$c */
    static final class C16264c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16261b f39068a;

        /* renamed from: b */
        final /* synthetic */ Throwable f39069b;

        /* renamed from: c */
        final /* synthetic */ String f39070c;

        static {
            Covode.recordClassIndex(18557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16264c(C16261b bVar, Throwable th, String str) {
            super(0);
            this.f39068a = bVar;
            this.f39069b = th;
            this.f39070c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f39068a.mo25847a("onReject: " + this.f39069b.getMessage() + ", extra: " + this.f39070c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.d.b$b */
    static final class C16263b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16261b f39065a;

        /* renamed from: b */
        final /* synthetic */ EnumC16586p f39066b;

        /* renamed from: c */
        final /* synthetic */ String f39067c;

        static {
            Covode.recordClassIndex(18556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16263b(C16261b bVar, EnumC16586p pVar, String str) {
            super(0);
            this.f39065a = bVar;
            this.f39066b = pVar;
            this.f39067c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = C16265c.f39071a[this.f39066b.ordinal()];
            if (i == 1) {
                C16261b bVar = this.f39065a;
                String str = this.f39067c;
                if (!bVar.f39063a.mo25846a()) {
                    ALog.m59865d("bullet", str);
                }
            } else if (i == 2) {
                this.f39065a.mo25847a(this.f39067c);
            } else if (i != 3) {
                C16261b bVar2 = this.f39065a;
                String str2 = this.f39067c;
                if (!bVar2.f39063a.mo25846a()) {
                    ALog.m59869i("bullet", str2);
                }
            } else {
                C16261b bVar3 = this.f39065a;
                String str3 = this.f39067c;
                if (!bVar3.f39063a.mo25846a()) {
                    ALog.m59871w("bullet", str3);
                }
            }
            return C89391z.f203057a;
        }
    }

    public C16261b(AbstractC16651l lVar) {
        C89219l.m154719c(lVar, "");
        this.f39063a = lVar;
    }

    /* renamed from: a */
    private static void m30247a(AbstractC89171a<C89391z> aVar) {
        C1731i.m5636a(new CallableC16262a(aVar), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo25847a(String str) {
        if (!this.f39063a.mo25846a()) {
            ALog.m59866e("bullet", str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16652m
    /* renamed from: a */
    public final void mo25848a(String str, EnumC16586p pVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        m30247a(new C16263b(this, pVar, str));
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16652m
    /* renamed from: a */
    public final void mo25849a(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        m30247a(new C16264c(this, th, str));
    }
}
