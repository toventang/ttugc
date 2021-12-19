package com.bytedance.jedi.arch.ext.list.p1464a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.a */
public abstract class AbstractC20429a implements C20438e.AbstractC20440b {

    /* renamed from: a */
    private boolean f48351a;

    /* renamed from: b */
    public int f48352b;

    /* renamed from: c */
    private boolean f48353c;

    static {
        Covode.recordClassIndex(23950);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33736a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33737a(AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: b */
    public final void mo33765b() {
        if (!this.f48351a) {
            this.f48351a = true;
            mo33736a();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.p1464a.C20438e.AbstractC20440b
    /* renamed from: a */
    public final void mo33729a(int i) {
        this.f48353c = true;
        mo33737a(new C20430a(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.a.a$a */
    public static final class C20430a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20429a f48354a;

        /* renamed from: b */
        final /* synthetic */ int f48355b;

        static {
            Covode.recordClassIndex(23951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20430a(AbstractC20429a aVar, int i) {
            super(1);
            this.f48354a = aVar;
            this.f48355b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = this.f48355b - num.intValue();
            AbstractC20429a aVar = this.f48354a;
            aVar.f48352b = Math.max(aVar.f48352b, intValue);
            if (this.f48354a.f48352b > 0) {
                this.f48354a.mo33765b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo33764a(int i, Throwable th) {
        if (this.f48353c) {
            this.f48351a = false;
            if (th == null && i != 0) {
                int i2 = this.f48352b - i;
                this.f48352b = i2;
                if (i2 > 0) {
                    mo33765b();
                }
            }
        }
    }
}
