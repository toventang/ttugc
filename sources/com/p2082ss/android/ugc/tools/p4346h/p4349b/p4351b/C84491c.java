package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.c */
public class C84491c extends AbstractC84484a<Effect, C84519k, CategoryEffectModel> {

    /* renamed from: f */
    public final AbstractC89171a<AbstractC84398d> f188856f;

    /* renamed from: g */
    public final String f188857g;

    /* renamed from: h */
    public final boolean f188858h;

    static {
        Covode.recordClassIndex(98456);
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.c$a */
    static final class C84492a<T> implements AbstractC88407af<C20169f<? extends CategoryEffectModel>> {

        /* renamed from: a */
        final /* synthetic */ C84491c f188859a;

        /* renamed from: b */
        final /* synthetic */ int f188860b;

        static {
            Covode.recordClassIndex(98457);
        }

        C84492a(C84491c cVar, int i) {
            this.f188859a = cVar;
            this.f188860b = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel>>] */
        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(final AbstractC88405ad<C20169f<? extends CategoryEffectModel>> adVar) {
            C89219l.m154721d(adVar, "");
            C84386a.m145138a(this.f188859a.f188856f.invoke(), this.f188859a.f188857g, true, "", this.f188860b, 0, new IFetchPanelInfoListener() {
                /* class com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84491c.C84492a.C844931 */

                static {
                    Covode.recordClassIndex(98458);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    adVar.mo142933b(C84386a.m145135a(exceptionResult));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
                    CategoryEffectModel categoryEffectModel;
                    PanelInfoModel panelInfoModel2 = panelInfoModel;
                    AbstractC88405ad adVar = adVar;
                    if (panelInfoModel2 != null) {
                        categoryEffectModel = panelInfoModel2.getCategoryEffectModel();
                    } else {
                        categoryEffectModel = null;
                    }
                    adVar.mo142931a(C20171g.m38149a(categoryEffectModel));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.c$b */
    static final class C84494b<T> implements AbstractC88407af<C20169f<? extends CategoryEffectModel>> {

        /* renamed from: a */
        final /* synthetic */ C84491c f188862a;

        /* renamed from: b */
        final /* synthetic */ C84519k f188863b;

        /* renamed from: c */
        final /* synthetic */ int f188864c;

        static {
            Covode.recordClassIndex(98459);
        }

        C84494b(C84491c cVar, C84519k kVar, int i) {
            this.f188862a = cVar;
            this.f188863b = kVar;
            this.f188864c = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel>>] */
        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(final AbstractC88405ad<C20169f<? extends CategoryEffectModel>> adVar) {
            C89219l.m154721d(adVar, "");
            if (this.f188862a.f188858h) {
                C84386a.m145137a(this.f188862a.f188856f.invoke(), this.f188862a.f188857g, this.f188863b.f188908e, true, this.f188864c, this.f188863b.f188904a, this.f188863b.f188905b, this.f188863b.f188906c, new IFetchCategoryEffectListener() {
                    /* class com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84491c.C84494b.C844951 */

                    static {
                        Covode.recordClassIndex(98460);
                    }

                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        adVar.mo142933b(C84386a.m145135a(exceptionResult));
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                        CategoryEffectModel categoryEffectModel;
                        CategoryPageModel categoryPageModel2 = categoryPageModel;
                        AbstractC88405ad adVar = adVar;
                        if (categoryPageModel2 != null) {
                            categoryEffectModel = categoryPageModel2.getCategoryEffects();
                        } else {
                            categoryEffectModel = null;
                        }
                        adVar.mo142931a(C20171g.m38149a(categoryEffectModel));
                    }
                });
                return;
            }
            AbstractC84398d invoke = this.f188862a.f188856f.invoke();
            String str = this.f188862a.f188857g;
            String str2 = this.f188863b.f188908e;
            int i = this.f188864c;
            int i2 = this.f188863b.f188904a;
            int i3 = this.f188863b.f188905b;
            String str3 = this.f188863b.f188906c;
            C844962 r9 = new IFetchCategoryEffectListener() {
                /* class com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84491c.C84494b.C844962 */

                static {
                    Covode.recordClassIndex(98461);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    adVar.mo142933b(C84386a.m145135a(exceptionResult));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryEffectModel categoryEffectModel;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    AbstractC88405ad adVar = adVar;
                    if (categoryPageModel2 != null) {
                        categoryEffectModel = categoryPageModel2.getCategoryEffects();
                    } else {
                        categoryEffectModel = null;
                    }
                    adVar.mo142931a(C20171g.m38149a(categoryEffectModel));
                }
            };
            C89219l.m154721d(invoke, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(r9, "");
            invoke.mo78896a(str, str2, AbstractC84398d.C84399a.f188714b, new C84386a.C84387a(invoke, str, str2, i, i2, i3, str3, r9), null);
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        AbstractC88403ab a;
        C89378p pVar = (C89378p) obj;
        C89219l.m154721d(pVar, "");
        int intValue = ((Number) pVar.component1()).intValue();
        C84519k kVar = (C84519k) pVar.component2();
        if (kVar.f188908e.length() == 0 && kVar.f188904a == 0) {
            a = AbstractC88403ab.m153596a((AbstractC88407af) new C84492a(this, intValue));
            C89219l.m154716b(a, "");
        } else {
            a = AbstractC88403ab.m153596a((AbstractC88407af) new C84494b(this, kVar, intValue));
            C89219l.m154716b(a, "");
        }
        AbstractC88979t d = a.mo142925c(new C84497c(kVar)).mo142930d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.c$c */
    static final class C84497c<T, R> implements AbstractC88434g<C20169f<? extends CategoryEffectModel>, C89378p<? extends C84519k, ? extends C89378p<? extends List<? extends Effect>, ? extends CategoryEffectModel>>> {

        /* renamed from: a */
        final /* synthetic */ C84519k f188867a;

        static {
            Covode.recordClassIndex(98462);
        }

        C84497c(C84519k kVar) {
            this.f188867a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C89378p<? extends C84519k, ? extends C89378p<? extends List<? extends Effect>, ? extends CategoryEffectModel>> apply(C20169f<? extends CategoryEffectModel> fVar) {
            String str;
            C20169f<? extends CategoryEffectModel> fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            CategoryEffectModelTemplate categoryEffectModelTemplate = (CategoryEffectModelTemplate) fVar2.mo33486a();
            if (categoryEffectModelTemplate == null) {
                return C89387v.m154943a(new C84519k(this.f188867a.f188904a, this.f188867a.f188905b, this.f188867a.f188906c, false, this.f188867a.f188908e), C89387v.m154943a(C89086z.INSTANCE, null));
            }
            List<Effect> effects = categoryEffectModelTemplate.getEffects();
            if (effects == null || effects.isEmpty()) {
                return C89387v.m154943a(new C84519k(this.f188867a.f188904a, this.f188867a.f188905b, this.f188867a.f188906c, false, this.f188867a.f188908e), C89387v.m154943a(C89086z.INSTANCE, categoryEffectModelTemplate));
            }
            if (this.f188867a.f188908e.length() == 0 && this.f188867a.f188904a == 0) {
                str = categoryEffectModelTemplate.getCategoryKey();
            } else {
                str = this.f188867a.f188908e;
            }
            return C89387v.m154943a(new C84519k(categoryEffectModelTemplate.getCursor(), categoryEffectModelTemplate.getSortingPosition(), categoryEffectModelTemplate.getVersion(), categoryEffectModelTemplate.hasMore(), str), C89387v.m154943a(categoryEffectModelTemplate.getEffects(), categoryEffectModelTemplate));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.AbstractC84484a
    /* renamed from: b */
    public final /* synthetic */ boolean mo129459b(C84519k kVar, C84519k kVar2) {
        C84519k kVar3 = kVar;
        C84519k kVar4 = kVar2;
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        if (kVar3.f188904a == kVar4.f188904a) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84491c(AbstractC89171a<? extends AbstractC84398d> aVar, String str, C84519k kVar, boolean z) {
        super(kVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        this.f188856f = aVar;
        this.f188857g = str;
        this.f188858h = z;
    }
}
