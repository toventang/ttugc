package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.p2082ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListModel;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.d */
public class C84498d extends C84508g {

    /* renamed from: f */
    public final String f188868f;

    /* renamed from: g */
    public final String f188869g;

    /* renamed from: h */
    public final String f188870h;

    /* renamed from: m */
    private final int f188871m = 2;

    static {
        Covode.recordClassIndex(98463);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84508g
    /* renamed from: a */
    public final AbstractC88403ab<C20169f<InfoStickerListModel>> mo129464a(C84521m mVar) {
        C89219l.m154721d(mVar, "");
        AbstractC88403ab<C20169f<InfoStickerListModel>> a = AbstractC88403ab.m153596a((AbstractC88407af) new C84499a(this, mVar));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.d$a */
    static final class C84499a<T> implements AbstractC88407af<C20169f<? extends InfoStickerListModel>> {

        /* renamed from: a */
        final /* synthetic */ C84498d f188872a;

        /* renamed from: b */
        final /* synthetic */ C84521m f188873b;

        static {
            Covode.recordClassIndex(98464);
        }

        C84499a(C84498d dVar, C84521m mVar) {
            this.f188872a = dVar;
            this.f188873b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.ugc.effectplatform.model.net.InfoStickerListModel>>] */
        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(final AbstractC88405ad<C20169f<? extends InfoStickerListModel>> adVar) {
            C89219l.m154721d(adVar, "");
            this.f188872a.f188888i.invoke().mo78899a(this.f188872a.f188868f, this.f188872a.f188869g, this.f188872a.f188870h, (Integer) null, Integer.valueOf(this.f188873b.f188911a), new AbstractC86796e<InfoStickerListResponse>() {
                /* class com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84498d.C84499a.C845001 */

                static {
                    Covode.recordClassIndex(98465);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
                public final /* synthetic */ void onSuccess(InfoStickerListResponse infoStickerListResponse) {
                    InfoStickerListResponse infoStickerListResponse2 = infoStickerListResponse;
                    C89219l.m154721d(infoStickerListResponse2, "");
                    adVar.mo142931a(C20171g.m38149a(infoStickerListResponse2.getData()));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
                @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
                public final /* synthetic */ void onFail(InfoStickerListResponse infoStickerListResponse, C86840e eVar) {
                    C89219l.m154721d(eVar, "");
                    adVar.mo142933b(C84386a.m145135a(ListenerAdaptExtKt.toOldExceptionResult(eVar)));
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84498d(AbstractC89171a<? extends AbstractC84398d> aVar, int i, String str, String str2, String str3, C84521m mVar) {
        super(aVar, 2, str, str2, mVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(mVar, "");
        this.f188868f = str;
        this.f188869g = str2;
        this.f188870h = str3;
    }
}
