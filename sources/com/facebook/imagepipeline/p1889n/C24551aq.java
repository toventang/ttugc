package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.C24618v;
import com.facebook.imagepipeline.p1892q.AbstractC24650c;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.aq */
public final class C24551aq implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    public final Executor f58310a;

    /* renamed from: b */
    public final AbstractC24113i f58311b;

    /* renamed from: c */
    private final AbstractC24544ak<C24456e> f58312c;

    /* renamed from: d */
    private final boolean f58313d;

    /* renamed from: e */
    private final AbstractC24650c f58314e;

    static {
        Covode.recordClassIndex(28695);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        this.f58312c.mo40379a(new C24552a(kVar, alVar, this.f58313d, this.f58314e), alVar);
    }

    /* renamed from: com.facebook.imagepipeline.n.aq$a */
    class C24552a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: a */
        public final boolean f58315a;

        /* renamed from: b */
        public final AbstractC24650c f58316b;

        /* renamed from: c */
        public final AbstractC24545al f58317c;

        /* renamed from: d */
        public boolean f58318d;

        /* renamed from: f */
        public final C24618v f58319f;

        static {
            Covode.recordClassIndex(28696);
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24551aq.C24552a.mo40278a(java.lang.Object, int):void");
        }

        C24552a(final AbstractC24596k<C24456e> kVar, AbstractC24545al alVar, boolean z, AbstractC24650c cVar) {
            super(kVar);
            this.f58317c = alVar;
            this.f58315a = z;
            this.f58316b = cVar;
            this.f58319f = new C24618v(C24551aq.this.f58310a, new C24618v.AbstractC24622a(C24551aq.this) {
                /* class com.facebook.imagepipeline.p1889n.C24551aq.C24552a.C245531 */

                static {
                    Covode.recordClassIndex(28697);
                }

                /* JADX WARNING: Removed duplicated region for block: B:41:0x014b A[Catch:{ all -> 0x0154 }] */
                @Override // com.facebook.imagepipeline.p1889n.C24618v.AbstractC24622a
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo40422a(com.facebook.imagepipeline.p1885j.C24456e r18, int r19) {
                    /*
                    // Method dump skipped, instructions count: 345
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24551aq.C24552a.C245531.mo40422a(com.facebook.imagepipeline.j.e, int):void");
                }
            }, 100);
            alVar.mo40414a(new C24587e(C24551aq.this) {
                /* class com.facebook.imagepipeline.p1889n.C24551aq.C24552a.C245542 */

                static {
                    Covode.recordClassIndex(28698);
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: a */
                public final void mo34237a() {
                    C24552a.this.f58319f.mo40456a();
                    C24552a.this.f58318d = true;
                    kVar.mo40432b();
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: c */
                public final void mo40397c() {
                    if (C24552a.this.f58317c.mo40421h()) {
                        C24552a.this.f58319f.mo40458b();
                    }
                }
            });
        }
    }

    public C24551aq(Executor executor, AbstractC24113i iVar, AbstractC24544ak<C24456e> akVar, boolean z, AbstractC24650c cVar) {
        this.f58310a = (Executor) C24091i.m45617a(executor);
        this.f58311b = (AbstractC24113i) C24091i.m45617a(iVar);
        this.f58312c = (AbstractC24544ak) C24091i.m45617a(akVar);
        this.f58314e = (AbstractC24650c) C24091i.m45617a(cVar);
        this.f58313d = z;
    }
}
