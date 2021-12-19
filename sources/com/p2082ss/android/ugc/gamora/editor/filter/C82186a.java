package com.p2082ss.android.ugc.gamora.editor.filter;

import com.bytedance.covode.number.Covode;
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

/* renamed from: com.ss.android.ugc.gamora.editor.filter.a */
public final class C82186a {

    /* renamed from: e */
    public static final C82187a f183868e = new C82187a((byte) 0);

    /* renamed from: a */
    public final Map<String, String> f183869a = C89041ag.m154421a(C89387v.m154943a("filtercomposer", "colorfilternew"), C89387v.m154943a("filtercomposerexperiment", "colorfilterexperiment"));

    /* renamed from: b */
    public final Keva f183870b = Keva.getRepo("Edit_Filter_Data_Migration");

    /* renamed from: c */
    public final AbstractC50705m f183871c;

    /* renamed from: d */
    public final AbstractC50705m f183872d;

    static {
        Covode.recordClassIndex(96014);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.a$a */
    public static final class C82187a {
        static {
            Covode.recordClassIndex(96015);
        }

        private C82187a() {
        }

        public /* synthetic */ C82187a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.a$e */
    public static final class C82191e<T> implements AbstractC27255q {

        /* renamed from: a */
        public final /* synthetic */ String f183878a;

        static {
            Covode.recordClassIndex(96019);
        }

        public C82191e(String str) {
            this.f183878a = str;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo5560b() {
            return this.f183878a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.a$d */
    public static final class C82190d<T> implements AbstractC27255q {

        /* renamed from: a */
        public static final C82190d f183877a = new C82190d();

        static {
            Covode.recordClassIndex(96018);
        }

        C82190d() {
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ Object mo5560b() {
            return C63244g.m114602a().mo73290r().mo86007e();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.a$c */
    public static final class C82189c extends AbstractC89220m implements AbstractC89172b<ExceptionResult, C89391z> {

        /* renamed from: a */
        public static final C82189c f183876a = new C82189c();

        static {
            Covode.recordClassIndex(96017);
        }

        C82189c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(ExceptionResult exceptionResult) {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.a$b */
    public static final class C82188b extends AbstractC89220m implements AbstractC89172b<List<? extends Effect>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82186a f183873a;

        /* renamed from: b */
        final /* synthetic */ String f183874b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f183875c;

        static {
            Covode.recordClassIndex(96016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82188b(C82186a aVar, String str, AbstractC89171a aVar2) {
            super(1);
            this.f183873a = aVar;
            this.f183874b = str;
            this.f183875c = aVar2;
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
                float a = this.f183873a.f183871c.mo86055a(filterBean);
                float a2 = this.f183873a.f183872d.mo86055a(filterBean);
                if (a2 == this.f183873a.f183872d.mo86058b(filterBean) && a2 != a) {
                    this.f183873a.f183872d.mo86057a(filterBean, a);
                }
            }
            this.f183873a.f183870b.storeBoolean("Edit_Filter_Data_Has_Migrated_" + this.f183874b, true);
            this.f183875c.invoke();
            return C89391z.f203057a;
        }
    }

    public C82186a(AbstractC50705m mVar, AbstractC50705m mVar2) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar2, "");
        this.f183871c = mVar;
        this.f183872d = mVar2;
    }
}
