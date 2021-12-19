package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.C24618v;
import com.facebook.imagepipeline.p1892q.AbstractC24650c;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.at */
public final class C24557at implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    public final Executor f58327a;

    /* renamed from: b */
    public final AbstractC24113i f58328b;

    /* renamed from: c */
    private final AbstractC24544ak<C24456e> f58329c;

    /* renamed from: d */
    private final boolean f58330d = true;

    /* renamed from: e */
    private final AbstractC24650c f58331e;

    /* renamed from: f */
    private final C24373e f58332f;

    /* renamed from: g */
    private final C24373e f58333g;

    /* renamed from: h */
    private final AbstractC24380f f58334h;

    static {
        Covode.recordClassIndex(28701);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        this.f58329c.mo40379a(new C24558a(kVar, alVar, this.f58330d, this.f58331e, this.f58332f, this.f58333g, this.f58334h), alVar);
    }

    /* renamed from: com.facebook.imagepipeline.n.at$a */
    class C24558a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: a */
        public final boolean f58335a;

        /* renamed from: b */
        public final AbstractC24650c f58336b;

        /* renamed from: c */
        public final AbstractC24545al f58337c;

        /* renamed from: d */
        final C24373e f58338d;

        /* renamed from: f */
        final C24373e f58339f;

        /* renamed from: g */
        final AbstractC24380f f58340g;

        /* renamed from: h */
        public boolean f58341h;

        /* renamed from: i */
        public final C24618v f58342i;

        static {
            Covode.recordClassIndex(28702);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
            if (com.facebook.imagepipeline.p1892q.C24651d.f58569a.contains(java.lang.Integer.valueOf(r8.mo40306e())) != false) goto L_0x009c;
         */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo40278a(java.lang.Object r8, int r9) {
            /*
            // Method dump skipped, instructions count: 204
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24557at.C24558a.mo40278a(java.lang.Object, int):void");
        }

        C24558a(final AbstractC24596k<C24456e> kVar, AbstractC24545al alVar, boolean z, AbstractC24650c cVar, C24373e eVar, C24373e eVar2, AbstractC24380f fVar) {
            super(kVar);
            this.f58337c = alVar;
            this.f58335a = z;
            this.f58336b = cVar;
            this.f58338d = eVar;
            this.f58339f = eVar2;
            this.f58340g = fVar;
            this.f58342i = new C24618v(C24557at.this.f58327a, new C24618v.AbstractC24622a(C24557at.this) {
                /* class com.facebook.imagepipeline.p1889n.C24557at.C24558a.C245591 */

                static {
                    Covode.recordClassIndex(28703);
                }

                /* JADX WARNING: Removed duplicated region for block: B:54:0x0189 A[Catch:{ all -> 0x0192 }] */
                @Override // com.facebook.imagepipeline.p1889n.C24618v.AbstractC24622a
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo40422a(com.facebook.imagepipeline.p1885j.C24456e r18, int r19) {
                    /*
                    // Method dump skipped, instructions count: 407
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24557at.C24558a.C245591.mo40422a(com.facebook.imagepipeline.j.e, int):void");
                }
            }, 100);
            alVar.mo40414a(new C24587e(C24557at.this) {
                /* class com.facebook.imagepipeline.p1889n.C24557at.C24558a.C245602 */

                static {
                    Covode.recordClassIndex(28704);
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: a */
                public final void mo34237a() {
                    C24558a.this.f58342i.mo40456a();
                    C24558a.this.f58341h = true;
                    kVar.mo40432b();
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: c */
                public final void mo40397c() {
                    if (C24558a.this.f58337c.mo40421h()) {
                        C24558a.this.f58342i.mo40458b();
                    }
                }
            });
        }
    }

    public C24557at(Executor executor, AbstractC24113i iVar, AbstractC24544ak<C24456e> akVar, AbstractC24650c cVar, C24373e eVar, C24373e eVar2, AbstractC24380f fVar) {
        this.f58327a = (Executor) C24091i.m45617a(executor);
        this.f58328b = (AbstractC24113i) C24091i.m45617a(iVar);
        this.f58329c = (AbstractC24544ak) C24091i.m45617a(akVar);
        this.f58331e = (AbstractC24650c) C24091i.m45617a(cVar);
        this.f58332f = eVar;
        this.f58333g = eVar2;
        this.f58334h = fVar;
    }
}
