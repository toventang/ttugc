package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j;
import com.bytedance.creativex.recorder.filter.p943b.AbstractC14236d;
import com.bytedance.keva.Keva;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ah */
public final class C73369ah {

    /* renamed from: f */
    public static final C73370a f164860f = new C73370a((byte) 0);

    /* renamed from: a */
    final Map<String, String> f164861a = C89041ag.m154421a(C89387v.m154943a("filtercomposer", "colorfilternew"), C89387v.m154943a("filtercomposerexperiment", "colorfilterexperiment"));

    /* renamed from: b */
    public final Keva f164862b = Keva.getRepo("Filter_Data_Migration");

    /* renamed from: c */
    public final AbstractC50705m f164863c;

    /* renamed from: d */
    public final AbstractC50705m f164864d;

    /* renamed from: e */
    public final AbstractC14220j f164865e;

    static {
        Covode.recordClassIndex(86106);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ah$a */
    public static final class C73370a {
        static {
            Covode.recordClassIndex(86107);
        }

        private C73370a() {
        }

        public /* synthetic */ C73370a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ah$e */
    static final class C73374e<T> implements AbstractC27255q {

        /* renamed from: a */
        public final /* synthetic */ String f164873a;

        static {
            Covode.recordClassIndex(86111);
        }

        C73374e(String str) {
            this.f164873a = str;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo5560b() {
            return this.f164873a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ah$d */
    static final class C73373d<T> implements AbstractC27255q {

        /* renamed from: a */
        public static final C73373d f164872a = new C73373d();

        static {
            Covode.recordClassIndex(86110);
        }

        C73373d() {
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ Object mo5560b() {
            return C63244g.m114602a().mo73290r().mo86007e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ah$c */
    static final class C73372c extends AbstractC89220m implements AbstractC89172b<ExceptionResult, C89391z> {

        /* renamed from: a */
        public static final C73372c f164871a = new C73372c();

        static {
            Covode.recordClassIndex(86109);
        }

        C73372c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(ExceptionResult exceptionResult) {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ah$b */
    static final class C73371b extends AbstractC89220m implements AbstractC89172b<List<? extends Effect>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73369ah f164866a;

        /* renamed from: b */
        final /* synthetic */ int f164867b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f164868c;

        /* renamed from: d */
        final /* synthetic */ String f164869d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f164870e;

        static {
            Covode.recordClassIndex(86108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73371b(C73369ah ahVar, int i, AbstractC89172b bVar, String str, AbstractC89171a aVar) {
            super(1);
            this.f164866a = ahVar;
            this.f164867b = i;
            this.f164868c = bVar;
            this.f164869d = str;
            this.f164870e = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            C89219l.m154721d(list2, "");
            for (T t : list2) {
                FilterBean filterBean = new FilterBean();
                filterBean.setId(Integer.parseInt(t.getEffectId()));
                filterBean.setFilterFolder(t.getUnzipPath());
                filterBean.setFilterFilePath(t.getUnzipPath());
                filterBean.setResId(t.getResourceId());
                filterBean.setExtra(t.getExtra());
                float a = this.f164866a.f164863c.mo86055a(filterBean);
                float a2 = this.f164866a.f164864d.mo86055a(filterBean);
                if (a2 == this.f164866a.f164864d.mo86058b(filterBean) && a2 != a) {
                    this.f164866a.f164864d.mo86057a(filterBean, a);
                }
                if (this.f164867b == Integer.parseInt(t.getEffectId()) && (this.f164866a.f164865e instanceof AbstractC14236d)) {
                    if ((true ^ C89219l.m154714a((Object) t.getResourceId(), (Object) ((AbstractC14236d) this.f164866a.f164865e).mo22994b())) && !((AbstractC14236d) this.f164866a.f164865e).mo22995c()) {
                        ((AbstractC14236d) this.f164866a.f164865e).mo22993a(t.getResourceId());
                        this.f164868c.invoke(t.getResourceId());
                    }
                }
            }
            this.f164866a.f164862b.storeBoolean("Filter_Data_Has_Migrated_" + this.f164869d, true);
            this.f164870e.invoke();
            return C89391z.f203057a;
        }
    }

    public C73369ah(AbstractC50705m mVar, AbstractC50705m mVar2, AbstractC14220j jVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar2, "");
        C89219l.m154721d(jVar, "");
        this.f164863c = mVar;
        this.f164864d = mVar2;
        this.f164865e = jVar;
    }
}
