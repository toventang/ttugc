package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j;
import com.bytedance.creativex.recorder.filter.p942a.C14212b;
import com.bytedance.creativex.recorder.filter.p943b.AbstractC14236d;
import com.bytedance.creativex.recorder.filter.p943b.C14223a;
import com.bytedance.creativex.recorder.filter.p943b.C14224b;
import com.bytedance.creativex.recorder.filter.p943b.C14225c;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.filter.C50644b;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73369ah;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ad */
public final class C73360ad extends C14225c<AbstractC73359ac> implements AbstractC73359ac {

    /* renamed from: a */
    private final AbstractC89244h f164849a;

    static {
        Covode.recordClassIndex(86097);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ad$b */
    static final class C73363b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73360ad f164852a;

        static {
            Covode.recordClassIndex(86100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73363b(C73360ad adVar) {
            super(0);
            this.f164852a = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            T value = this.f164852a.curSelectedFilter.f7727a.getValue();
            if (value != null) {
                this.f164852a.setFilterChosen(value, "", false, false, true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ad$a */
    static final class C73361a extends AbstractC89220m implements AbstractC89171a<C73369ah> {

        /* renamed from: a */
        final /* synthetic */ C73360ad f164850a;

        /* renamed from: b */
        final /* synthetic */ C14225c.C14226a f164851b;

        static {
            Covode.recordClassIndex(86098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73361a(C73360ad adVar, C14225c.C14226a aVar) {
            super(0);
            this.f164850a = adVar;
            this.f164851b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
            if (r2 != null) goto L_0x0050;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73369ah invoke() {
            /*
                r4 = this;
                java.lang.String r0 = "VideoRecordNewActivity"
                com.ss.android.ugc.aweme.filter.repository.internal.main.l r1 = com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50798l.C50799a.m95127a(r0)
                com.ss.android.ugc.aweme.shortvideo.ui.a.ad$a$1 r0 = new com.ss.android.ugc.aweme.shortvideo.ui.a.ad$a$1
                r0.<init>()
                com.ss.android.ugc.aweme.filter.repository.a.m r3 = com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50800m.m95128a(r1, r0)
                com.ss.android.ugc.aweme.shortvideo.ui.a.ad r0 = r4.f164850a
                androidx.lifecycle.t<java.util.List<com.bytedance.creativex.recorder.filter.a.e>> r0 = r0.filterSources
                java.lang.Object r0 = r0.getValue()
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L_0x003a
                java.util.Iterator r2 = r0.iterator()
            L_0x001f:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x005a
                java.lang.Object r1 = r2.next()
                r0 = r1
                com.bytedance.creativex.recorder.filter.a.e r0 = (com.bytedance.creativex.recorder.filter.p942a.C14215e) r0
                boolean r0 = com.bytedance.creativex.recorder.filter.p942a.C14216f.m25969a(r0)
                if (r0 == 0) goto L_0x001f
            L_0x0032:
                com.bytedance.creativex.recorder.filter.a.e r1 = (com.bytedance.creativex.recorder.filter.p942a.C14215e) r1
                if (r1 == 0) goto L_0x003a
                com.ss.android.ugc.aweme.filter.repository.a.m r2 = r1.f34499c
                if (r2 != 0) goto L_0x0050
            L_0x003a:
                com.bytedance.creativex.recorder.filter.b.c$a r0 = r4.f164851b
                com.ss.android.ugc.aweme.filter.repository.a.n r1 = r0.f34515b
                com.ss.android.ugc.aweme.shortvideo.ui.a.ad r0 = r4.f164850a
                com.bytedance.creativex.recorder.b.a.d r0 = r0.getCameraApiComponent()
                com.ss.android.ugc.asve.recorder.effect.a r0 = r0.mo22835w()
                com.ss.android.ugc.aweme.filter.repository.a.k r0 = com.bytedance.creativex.recorder.filter.p946e.C14258a.m26000a(r0)
                com.ss.android.ugc.aweme.filter.repository.a.m r2 = com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50800m.m95128a(r1, r0)
            L_0x0050:
                com.bytedance.creativex.recorder.filter.b.c$a r0 = r4.f164851b
                com.bytedance.creativex.recorder.filter.a.j r1 = r0.f34516c
                com.ss.android.ugc.aweme.shortvideo.ui.a.ah r0 = new com.ss.android.ugc.aweme.shortvideo.ui.a.ah
                r0.<init>(r3, r2, r1)
                return r0
            L_0x005a:
                r1 = 0
                goto L_0x0032
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73360ad.C73361a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.C14225c, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        C73369ah ahVar = (C73369ah) this.f164849a.getValue();
        C73363b bVar = new C73363b(this);
        C73364c cVar = new C73364c(this);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(cVar, "");
        String str = ahVar.f164861a.get(C63244g.m114602a().mo73290r().mo86010h().mo5560b());
        if (str != null && !ahVar.f164862b.getBoolean("Filter_Data_Has_Migrated_".concat(String.valueOf(str)), false)) {
            new C50644b(C73369ah.C73373d.f164872a, new C73369ah.C73374e(str)).mo85999a(new C73369ah.C73371b(ahVar, ahVar.f164865e.mo22977a(1), cVar, str, bVar), C73369ah.C73372c.f164871a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ad$c */
    static final class C73364c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73360ad f164853a;

        static {
            Covode.recordClassIndex(86101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73364c(C73360ad adVar) {
            super(1);
            this.f164853a = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            C14225c.setChosenFilterFromStoreInternal$default(this.f164853a, false, false, false, 6, null);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.C14225c
    public final void actualApplyFilter2Camera(C14212b bVar) {
        if (getCameraApiComponent() instanceof AbstractC14209z) {
            AbstractC14177d cameraApiComponent = getCameraApiComponent();
            Objects.requireNonNull(cameraApiComponent, "null cannot be cast to non-null type com.bytedance.creativex.recorder.camera.api.TikTokCameraApiComponent");
            AbstractC14209z zVar = (AbstractC14209z) cameraApiComponent;
            if (bVar == null) {
                zVar.mo22936a((FilterBean) this.curSelectedFilter.f7727a.getValue());
                return;
            }
            bVar.f34493a.setFilterFolder(bVar.f34495c);
            if (bVar.f34496d == null) {
                zVar.mo22937a(bVar.f34493a, (Float) null);
            } else {
                zVar.mo22937a(bVar.f34493a, bVar.f34496d);
            }
        } else {
            super.actualApplyFilter2Camera(bVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.C14225c
    public final void actualSaveDefaultFilte(FilterBean filterBean, AbstractC14220j jVar) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(jVar, "");
        if (jVar instanceof AbstractC14236d) {
            String resId = filterBean.getResId();
            C89219l.m154716b(resId, "");
            ((AbstractC14236d) jVar).mo22993a(resId);
            return;
        }
        super.actualSaveDefaultFilte(filterBean, jVar);
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.C14225c
    public final void actualSetFilterScroll(C14212b bVar, C14212b bVar2, float f) {
        float f2;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        AbstractC14177d cameraApiComponent = getCameraApiComponent();
        if (!(cameraApiComponent instanceof AbstractC14209z)) {
            cameraApiComponent = null;
        }
        AbstractC14209z zVar = (AbstractC14209z) cameraApiComponent;
        if (zVar != null) {
            FilterBean filterBean = bVar.f34493a;
            Float f3 = bVar.f34496d;
            float f4 = 0.0f;
            if (f3 != null) {
                f2 = f3.floatValue();
            } else {
                f2 = 0.0f;
            }
            C14224b bVar3 = new C14224b(filterBean, f2, bVar.f34494b);
            FilterBean filterBean2 = bVar2.f34493a;
            Float f5 = bVar2.f34496d;
            if (f5 != null) {
                f4 = f5.floatValue();
            }
            zVar.mo22780a(bVar3, new C14224b(filterBean2, f4, bVar2.f34494b), f);
            return;
        }
        super.actualSetFilterScroll(bVar, bVar2, f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73360ad(C21582f fVar, ActivityC0218d dVar, C14225c.C14226a aVar, AbstractC89172b<? super C14212b, C14212b> bVar, AbstractC89171a<Boolean> aVar2, AbstractC89172b<? super C14223a, C89391z> bVar2) {
        super(fVar, dVar, aVar, bVar, aVar2, bVar2);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.f164849a = C89250i.m154773a((AbstractC89171a) new C73361a(this, aVar));
    }
}
