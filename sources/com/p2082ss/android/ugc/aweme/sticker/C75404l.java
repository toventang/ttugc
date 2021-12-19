package com.p2082ss.android.ugc.aweme.sticker;

import android.app.Application;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.cukaie.closet.internal.C14416d;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65365be;
import com.p2082ss.android.ugc.aweme.shortvideo.C70641dm;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3957e.C75324d;
import com.p2082ss.android.ugc.aweme.sticker.p3957e.C75325e;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75424c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.AbstractC75461d;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75464f;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.C75475c;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.C75479a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75594h;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75589c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75657q;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76196m;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.p4014a.C76140a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.p4014a.C76141b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.C76123j;
import com.p2082ss.android.ugc.aweme.utils.C80249bj;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC83989b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84084i;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import java.lang.reflect.Type;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.l */
public final class C75404l {

    /* renamed from: com.ss.android.ugc.aweme.sticker.l$d */
    public static final class C75412d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C75412d f169493a = new C75412d();

        static {
            Covode.recordClassIndex(88331);
        }

        C75412d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(88323);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.l$a */
    public static final class C75405a extends AbstractC89220m implements AbstractC89171a<C75657q> {

        /* renamed from: a */
        final /* synthetic */ String f169480a;

        static {
            Covode.recordClassIndex(88324);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75405a(String str) {
            super(0);
            this.f169480a = str;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75657q invoke() {
            return new C75657q(this.f169480a);
        }
    }

    /* renamed from: a */
    public static final AbstractC75715t m132239a() {
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            return C75271c.f169234a;
        }
        return C75449o.f169546a;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.l$c */
    public static final class C75408c extends AbstractC89220m implements AbstractC89172b<AbstractC14343f.C14344a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f169485a;

        /* renamed from: b */
        final /* synthetic */ C21582f f169486b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f169487c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f169488d;

        static {
            Covode.recordClassIndex(88327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75408c(AbstractC89171a aVar, C21582f fVar, AbstractC89183m mVar, AbstractC89172b bVar) {
            super(1);
            this.f169485a = aVar;
            this.f169486b = fVar;
            this.f169487c = mVar;
            this.f169488d = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC14343f.C14344a aVar) {
            AbstractC89171a<? extends AbstractC75594h> aVar2;
            final AbstractC14343f.C14344a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            C75657q qVar = (C75657q) this.f169485a.invoke();
            C89219l.m154721d(qVar, "");
            aVar3.f34754f = qVar;
            aVar3.f34752d = C80249bj.f179731a;
            aVar3.f34751c = C754091.f169489a;
            aVar3.f34753e = C754102.f169490a;
            if (C70641dm.m124848c((ShortVideoContext) this.f169486b.mo35252b(ShortVideoContext.class, null))) {
                aVar2 = new AbstractC89171a<AbstractC75594h>(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.C75404l.C75408c.C754113 */

                    /* renamed from: a */
                    final /* synthetic */ C75408c f169491a;

                    static {
                        Covode.recordClassIndex(88330);
                    }

                    {
                        this.f169491a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ AbstractC75594h invoke() {
                        ActivityC0218d dVar = (ActivityC0218d) this.f169491a.f169486b.mo35249a((Type) ActivityC0218d.class, (String) null);
                        C75657q qVar = aVar3.f34754f;
                        AbstractC75715t a = C75404l.m132239a();
                        AbstractC84398d dVar2 = (AbstractC84398d) this.f169491a.f169486b.mo35249a((Type) AbstractC84398d.class, (String) null);
                        List<EffectCategoryModel> a2 = C75464f.C75465a.m132336a(dVar);
                        C89219l.m154716b(a2, "");
                        C89219l.m154721d(dVar, "");
                        C89219l.m154721d(qVar, "");
                        C89219l.m154721d(a, "");
                        C89219l.m154721d(dVar2, "");
                        C89219l.m154721d(a2, "");
                        C76402w wVar = new C76402w(dVar, qVar, a, dVar2, a2);
                        wVar.mo119317a(new C75325e());
                        wVar.mo119316a(new C75324d());
                        return wVar;
                    }
                };
            } else {
                aVar2 = (AbstractC89171a) this.f169487c.invoke(aVar3.f34754f, C75404l.m132239a());
            }
            aVar3.f34755g = aVar2;
            aVar3.f34757i = true;
            AbstractC89172b bVar = this.f169488d;
            if (bVar != null) {
                bVar.invoke(aVar3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.l$b */
    public static final class C75406b extends AbstractC89220m implements AbstractC89183m<C75657q, AbstractC75715t, AbstractC89171a<? extends C75589c>> {

        /* renamed from: a */
        final /* synthetic */ C21582f f169481a;

        static {
            Covode.recordClassIndex(88325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75406b(C21582f fVar) {
            super(2);
            this.f169481a = fVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC89171a<? extends C75589c> invoke(C75657q qVar, AbstractC75715t tVar) {
            final C75657q qVar2 = qVar;
            final AbstractC75715t tVar2 = tVar;
            C89219l.m154721d(qVar2, "");
            C89219l.m154721d(tVar2, "");
            return new AbstractC89171a<C75589c>(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.C75404l.C75406b.C754071 */

                /* renamed from: a */
                final /* synthetic */ C75406b f169482a;

                static {
                    Covode.recordClassIndex(88326);
                }

                {
                    this.f169482a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C75589c invoke() {
                    return C75404l.m132237a((ActivityC0218d) this.f169482a.f169481a.mo35249a((Type) ActivityC0218d.class, (String) null), qVar2, tVar2, (AbstractC84398d) this.f169482a.f169481a.mo35249a((Type) AbstractC84398d.class, (String) null));
                }
            };
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C75589c m132237a(ActivityC0218d dVar, C75657q qVar, AbstractC75715t tVar, AbstractC84398d dVar2) {
        List<EffectCategoryModel> a = C75464f.C75465a.m132336a(dVar);
        C89219l.m154716b(a, "");
        return m132238a(dVar, qVar, tVar, dVar2, a);
    }

    /* renamed from: a */
    public static final C75589c m132238a(ActivityC0218d dVar, C75657q qVar, AbstractC75715t tVar, AbstractC84398d dVar2, List<EffectCategoryModel> list) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(list, "");
        C75589c cVar = new C75589c(dVar, qVar, tVar, dVar2, list);
        cVar.mo119317a(new C75325e());
        cVar.mo119316a(new C75324d());
        return cVar;
    }

    /* renamed from: a */
    private static C84025h m132240a(String str, C21582f fVar, AbstractC89172b<? super AbstractC14343f.C14344a, C89391z> bVar, AbstractC83989b bVar2, AbstractC89171a<C75657q> aVar, AbstractC89183m<? super C75657q, ? super AbstractC75715t, ? extends AbstractC89171a<? extends AbstractC75594h>> mVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(mVar, "");
        return new C84025h(fVar, bVar2, new C75408c(aVar, fVar, mVar, bVar));
    }

    /* renamed from: a */
    public static final C75479a m132236a(C75574j jVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC84398d dVar2, AbstractC75429h hVar, C21582f fVar) {
        StickerPreferences stickerPreferences;
        C76140a aVar;
        AbstractC76329a aVar2;
        AbstractC75461d dVar3;
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(hVar, "");
        if (fVar == null || (stickerPreferences = (StickerPreferences) fVar.mo35252b(StickerPreferences.class, null)) == null) {
            C14401a aVar3 = new C14401a(new C14416d());
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            stickerPreferences = (StickerPreferences) aVar3.mo23215a(application, StickerPreferences.class);
        }
        C75479a aVar4 = new C75479a(jVar, oVar, dVar, hVar, new C75424c(), new C76196m(dVar2));
        C80249bj bjVar = C80249bj.f179731a;
        C89219l.m154721d(bjVar, "");
        aVar4.f169599c = bjVar;
        C75475c cVar = new C75475c(oVar, stickerPreferences, C75412d.f169493a);
        C89219l.m154721d(cVar, "");
        aVar4.f169603g.add(cVar);
        AbstractC76122i[] iVarArr = new AbstractC76122i[2];
        iVarArr[0] = new C76141b(oVar, hVar);
        if (fVar == null || (dVar3 = (AbstractC75461d) fVar.mo35252b(AbstractC75461d.class, null)) == null) {
            aVar = null;
        } else {
            aVar = new C76140a(dVar3);
        }
        iVarArr[1] = aVar;
        AbstractC76122i a = C76123j.m133522a(iVarArr);
        C89219l.m154721d(a, "");
        aVar4.f169597a = a;
        if (fVar != null) {
            AbstractC76085a aVar5 = (AbstractC76085a) fVar.mo35252b(AbstractC76085a.class, null);
            if (aVar5 != null) {
                C89219l.m154721d(aVar5, "");
                aVar4.f169598b = aVar5;
            }
            AbstractC76115b<C84984j, Fragment> bVar = (AbstractC76115b) fVar.mo35252b(AbstractC76115b.class, null);
            if (bVar != null) {
                C89219l.m154721d(bVar, "");
                aVar4.f169601e = bVar;
            }
        }
        if (!(!C65365be.m117061a() || fVar == null || (aVar2 = (AbstractC76329a) fVar.mo35252b(AbstractC76329a.class, null)) == null)) {
            C89219l.m154721d(aVar2, "");
            aVar4.f169602f = aVar2;
        }
        return aVar4;
    }

    /* renamed from: a */
    public static /* synthetic */ C84025h m132241a(String str, C21582f fVar, AbstractC89172b bVar, AbstractC83989b bVar2, AbstractC89171a aVar, AbstractC89183m mVar, int i) {
        if ((i & 4) != 0) {
            bVar = null;
        }
        if ((i & 8) != 0) {
            bVar2 = new C84084i();
        }
        if ((i & 16) != 0) {
            aVar = new C75405a(str);
        }
        if ((i & 32) != 0) {
            mVar = new C75406b(fVar);
        }
        return m132240a(str, fVar, bVar, bVar2, aVar, mVar);
    }
}
