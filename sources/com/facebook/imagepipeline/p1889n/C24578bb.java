package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1885j.C24456e;

/* renamed from: com.facebook.imagepipeline.n.bb */
public final class C24578bb implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    private final AbstractC24580bc<C24456e>[] f58399a;

    static {
        Covode.recordClassIndex(28722);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.n.bb$a */
    public class C24579a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: b */
        private final AbstractC24545al f58401b;

        /* renamed from: c */
        private final int f58402c;

        /* renamed from: d */
        private final C24363d f58403d;

        static {
            Covode.recordClassIndex(28723);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40279a(Throwable th) {
            if (!C24578bb.this.mo40438a(this.f58402c + 1, this.f58467e, this.f58401b)) {
                this.f58467e.mo40435b(th);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar = (C24456e) obj;
            if (eVar != null && (m46994b(i) || C24581bd.m47017a(eVar, this.f58403d))) {
                this.f58467e.mo40434b(eVar, i);
            } else if (m46992a(i)) {
                C24456e.m46681d(eVar);
                if (!C24578bb.this.mo40438a(this.f58402c + 1, this.f58467e, this.f58401b)) {
                    this.f58467e.mo40434b(null, 1);
                }
            }
        }

        public C24579a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar, int i) {
            super(kVar);
            this.f58401b = alVar;
            this.f58402c = i;
            this.f58403d = alVar.mo40413a().mResizeOptions;
        }
    }

    public C24578bb(AbstractC24580bc<C24456e>... bcVarArr) {
        AbstractC24580bc<C24456e>[] bcVarArr2 = (AbstractC24580bc[]) C24091i.m45617a(bcVarArr);
        this.f58399a = bcVarArr2;
        C24091i.m45616a(0, bcVarArr2.length);
    }

    /* renamed from: a */
    private int m47010a(int i, C24363d dVar) {
        while (true) {
            AbstractC24580bc<C24456e>[] bcVarArr = this.f58399a;
            if (i >= bcVarArr.length) {
                return -1;
            }
            if (bcVarArr[i].mo40439a(dVar)) {
                return i;
            }
            i++;
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        if (alVar.mo40413a().mResizeOptions == null) {
            kVar.mo40434b(null, 1);
        } else if (!mo40438a(0, kVar, alVar)) {
            kVar.mo40434b(null, 1);
        }
    }

    /* renamed from: a */
    public final boolean mo40438a(int i, AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        int a = m47010a(i, alVar.mo40413a().mResizeOptions);
        if (a == -1) {
            return false;
        }
        this.f58399a[a].mo40379a(new C24579a(kVar, alVar, a), alVar);
        return true;
    }
}
