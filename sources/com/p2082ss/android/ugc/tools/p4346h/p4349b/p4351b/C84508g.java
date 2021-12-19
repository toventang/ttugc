package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.p2082ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListModel;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.g */
public class C84508g extends AbstractC84484a<InfoStickerEffect, C84521m, InfoStickerListModel> {

    /* renamed from: i */
    public final AbstractC89171a<AbstractC84398d> f188888i;

    /* renamed from: j */
    public final int f188889j;

    /* renamed from: k */
    public final String f188890k;

    /* renamed from: l */
    public final String f188891l;

    static {
        Covode.recordClassIndex(98473);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC88403ab<C20169f<InfoStickerListModel>> mo129464a(C84521m mVar) {
        C89219l.m154721d(mVar, "");
        AbstractC88403ab<C20169f<InfoStickerListModel>> a = AbstractC88403ab.m153596a((AbstractC88407af) new C84509a(this, mVar));
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.h.b.b.g$a */
    public static final class C84509a<T> implements AbstractC88407af<C20169f<? extends InfoStickerListModel>> {

        /* renamed from: a */
        final /* synthetic */ C84508g f188892a;

        /* renamed from: b */
        final /* synthetic */ C84521m f188893b;

        static {
            Covode.recordClassIndex(98474);
        }

        C84509a(C84508g gVar, C84521m mVar) {
            this.f188892a = gVar;
            this.f188893b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.ugc.effectplatform.model.net.InfoStickerListModel>>] */
        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(final AbstractC88405ad<C20169f<? extends InfoStickerListModel>> adVar) {
            C89219l.m154721d(adVar, "");
            this.f188892a.f188888i.invoke().mo78885a(this.f188892a.f188889j, this.f188892a.f188890k, this.f188892a.f188891l, (Integer) null, Integer.valueOf(this.f188893b.f188911a), new AbstractC86796e<InfoStickerListResponse>() {
                /* class com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84508g.C84509a.C845101 */

                static {
                    Covode.recordClassIndex(98475);
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

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        C89378p pVar = (C89378p) obj;
        C89219l.m154721d(pVar, "");
        ((Number) pVar.component1()).intValue();
        C84521m mVar = (C84521m) pVar.component2();
        AbstractC88979t<R> d = mo129464a(mVar).mo142925c(new C84511b(mVar)).mo142930d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.g$b */
    static final class C84511b<T, R> implements AbstractC88434g<C20169f<? extends InfoStickerListModel>, C89378p<? extends C84521m, ? extends C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>>> {

        /* renamed from: a */
        final /* synthetic */ C84521m f188895a;

        static {
            Covode.recordClassIndex(98476);
        }

        C84511b(C84521m mVar) {
            this.f188895a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C89378p<? extends C84521m, ? extends C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> apply(C20169f<? extends InfoStickerListModel> fVar) {
            int i;
            C20169f<? extends InfoStickerListModel> fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            InfoStickerListModel infoStickerListModel = (InfoStickerListModel) fVar2.mo33486a();
            boolean z = false;
            if (infoStickerListModel == null) {
                return new C89378p(new C84521m(this.f188895a.f188911a, false), new C89378p(C89086z.INSTANCE, null));
            }
            if (infoStickerListModel.getSticker_list() != null) {
                List<InfoStickerEffect> sticker_list = infoStickerListModel.getSticker_list();
                if (sticker_list == null) {
                    C89219l.m154715b();
                } else if (!sticker_list.isEmpty()) {
                    Integer cursor = infoStickerListModel.getCursor();
                    if (cursor != null) {
                        i = cursor.intValue();
                    } else {
                        i = 0;
                    }
                    Boolean has_more = infoStickerListModel.getHas_more();
                    if (has_more != null) {
                        z = has_more.booleanValue();
                    }
                    C84521m mVar = new C84521m(i, z);
                    List<InfoStickerEffect> sticker_list2 = infoStickerListModel.getSticker_list();
                    if (sticker_list2 == null) {
                        sticker_list2 = C89086z.INSTANCE;
                    }
                    return new C89378p(mVar, new C89378p(sticker_list2, infoStickerListModel));
                }
            }
            return new C89378p(new C84521m(this.f188895a.f188911a, false), new C89378p(C89086z.INSTANCE, infoStickerListModel));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.AbstractC84484a
    /* renamed from: b */
    public final /* synthetic */ boolean mo129459b(C84521m mVar, C84521m mVar2) {
        C84521m mVar3 = mVar;
        C84521m mVar4 = mVar2;
        C89219l.m154721d(mVar3, "");
        C89219l.m154721d(mVar4, "");
        if (mVar3.f188911a == mVar4.f188911a) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84508g(AbstractC89171a<? extends AbstractC84398d> aVar, int i, String str, String str2, C84521m mVar) {
        super(mVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(mVar, "");
        this.f188888i = aVar;
        this.f188889j = i;
        this.f188890k = str;
        this.f188891l = str2;
    }
}
