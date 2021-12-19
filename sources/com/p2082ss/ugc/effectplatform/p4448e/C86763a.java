package com.p2082ss.ugc.effectplatform.p4448e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.algorithm.EnumC86835b;
import com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.p4448e.C86769d;
import java.util.List;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.ugc.effectplatform.e.a */
public final class C86763a {

    /* renamed from: e */
    public static final C86764a f195662e = new C86764a((byte) 0);

    /* renamed from: a */
    public ModelInfo f195663a;

    /* renamed from: b */
    public EnumC86835b f195664b;

    /* renamed from: c */
    public final C86734a f195665c;

    /* renamed from: d */
    public final AbstractC86700d f195666d;

    /* renamed from: f */
    private C86769d f195667f;

    static {
        Covode.recordClassIndex(102462);
    }

    /* renamed from: com.ss.ugc.effectplatform.e.a$a */
    public static final class C86764a {
        static {
            Covode.recordClassIndex(102463);
        }

        private C86764a() {
        }

        public /* synthetic */ C86764a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.e.a$b */
    public static final class C86765b implements AbstractC86768c {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f195668a;

        static {
            Covode.recordClassIndex(102464);
        }

        @Override // com.p2082ss.ugc.effectplatform.p4448e.AbstractC86768c
        /* renamed from: a */
        public final void mo140019a(int i, long j) {
        }

        C86765b(C89233z.C89238e eVar) {
            this.f195668a = eVar;
        }

        @Override // com.p2082ss.ugc.effectplatform.p4448e.AbstractC86768c
        /* renamed from: a */
        public final void mo140020a(C86772e eVar) {
            C89219l.m154719c(eVar, "");
            if (!eVar.mo140029a()) {
                this.f195668a.element = (T) eVar.f195685f;
            }
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.e.a$c */
    public static final class C86766c implements AbstractC86779j {

        /* renamed from: a */
        final /* synthetic */ C86763a f195669a;

        static {
            Covode.recordClassIndex(102465);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C86766c(C86763a aVar) {
            this.f195669a = aVar;
        }

        @Override // com.p2082ss.ugc.effectplatform.p4448e.AbstractC86779j
        /* renamed from: a */
        public final String mo140021a(C88044c cVar, long j, AbstractC86768c cVar2) {
            C89219l.m154719c(cVar, "");
            C86734a aVar = this.f195669a.f195665c;
            C86763a aVar2 = this.f195669a;
            if (aVar2.f195664b != null) {
                EnumC86835b bVar = aVar2.f195664b;
                if (bVar == null) {
                    C89219l.m154710a("fetchModelType");
                }
                C86763a aVar3 = this.f195669a;
                if (aVar3.f195663a != null) {
                    ModelInfo modelInfo = aVar3.f195663a;
                    if (modelInfo == null) {
                        C89219l.m154710a("modelInfo");
                    }
                    return aVar.mo139973a(bVar, modelInfo, cVar);
                }
                throw new IllegalArgumentException("modelInfo is required!");
            }
            throw new IllegalArgumentException("fetchModelType is required!");
        }
    }

    public C86763a(C86734a aVar, AbstractC86700d dVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(dVar, "");
        this.f195665c = aVar;
        this.f195666d = dVar;
        this.f195667f = new C86769d.C86770a().mo140024a(dVar).mo140027a(new C86766c(this)).mo140025a(EnumC86773f.ALGORITHM).mo140028a();
    }

    /* renamed from: a */
    public final long mo140018a(ModelInfo modelInfo, EnumC86835b bVar) {
        List<String> url;
        C89219l.m154719c(modelInfo, "");
        C89219l.m154719c(bVar, "");
        this.f195663a = modelInfo;
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        this.f195664b = bVar;
        if (file_url != null) {
            List<String> url_list = file_url.getUrl_list();
            if (url_list != null && url_list.isEmpty()) {
                this.f195664b = EnumC86835b.ZIP;
            }
            List<String> zip_url_list = file_url.getZip_url_list();
            if (zip_url_list != null && zip_url_list.isEmpty()) {
                this.f195664b = EnumC86835b.ORIGIN;
            }
        }
        ExtendedUrlModel file_url2 = modelInfo.getFile_url();
        if (file_url2 == null || (url = file_url2.getUrl(bVar)) == null || url.isEmpty()) {
            throw new RuntimeException("model " + modelInfo.getName() + " download url is empty! type: " + bVar);
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        for (String str : url) {
            long a = this.f195667f.mo140023a(str, new C86765b(eVar));
            if (a > 0) {
                return a;
            }
        }
        T t = eVar.element;
        if (t == null) {
            return -1;
        }
        throw t;
    }
}
