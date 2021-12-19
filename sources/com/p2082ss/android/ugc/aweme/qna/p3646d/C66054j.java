package com.p2082ss.android.ugc.aweme.qna.p3646d;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.translation.api.TranslationApi;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.d.j */
public final class C66054j {

    /* renamed from: a */
    public final C27910f f148746a = new C27910f();

    static {
        Covode.recordClassIndex(77560);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qna.d.j$a */
    public static final class C66055a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f148747a;

        /* renamed from: b */
        final /* synthetic */ C66054j f148748b;

        /* renamed from: c */
        final /* synthetic */ String f148749c;

        /* renamed from: d */
        final /* synthetic */ List f148750d;

        /* renamed from: e */
        final /* synthetic */ AbstractC66053i f148751e;

        /* renamed from: f */
        final /* synthetic */ C66059m f148752f;

        /* renamed from: g */
        final /* synthetic */ String f148753g;

        /* renamed from: h */
        final /* synthetic */ String f148754h;

        static {
            Covode.recordClassIndex(77561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66055a(C66054j jVar, String str, List list, AbstractC66053i iVar, C66059m mVar, String str2, String str3, AbstractC89124d dVar) {
            super(2, dVar);
            this.f148748b = jVar;
            this.f148749c = str;
            this.f148750d = list;
            this.f148751e = iVar;
            this.f148752f = mVar;
            this.f148753g = str2;
            this.f148754h = str3;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C66055a(this.f148748b, this.f148749c, this.f148750d, this.f148751e, this.f148752f, this.f148753g, this.f148754h, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C66055a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f148747a == 0) {
                C89382r.m154942a(obj);
                AbstractFutureC27655q<C79027a> a = TranslationApi.m137860a(this.f148749c, this.f148748b.f148746a.mo46674b(this.f148750d), 2);
                C89219l.m154716b(a, "");
                C27646l.m55298a(a, new AbstractC27645k<C79027a>(this) {
                    /* class com.p2082ss.android.ugc.aweme.qna.p3646d.C66054j.C66055a.C660561 */

                    /* renamed from: a */
                    final /* synthetic */ C66055a f148755a;

                    static {
                        Covode.recordClassIndex(77562);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f148755a = r1;
                    }

                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                    public final void onFailure(Throwable th) {
                        C89219l.m154721d(th, "");
                        this.f148755a.f148751e.mo105095a(this.f148755a.f148752f);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                    public final /* synthetic */ void onSuccess(C79027a aVar) {
                        List<C79030c> list;
                        C79027a aVar2 = aVar;
                        if (aVar2 == null || (list = aVar2.f177634a) == null || list.isEmpty()) {
                            this.f148755a.f148751e.mo105095a(this.f148755a.f148752f);
                            return;
                        }
                        AbstractC66053i iVar = this.f148755a.f148751e;
                        String str = this.f148755a.f148753g;
                        String str2 = this.f148755a.f148754h;
                        C79030c cVar = list.get(0);
                        C89219l.m154716b(cVar, "");
                        String str3 = cVar.f177641a;
                        C89219l.m154716b(str3, "");
                        iVar.mo105095a(new C66059m(true, str, str2, str3));
                    }
                }, ExecutorC34605m.f81660a);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    private static C66059m m117868a(String str, String str2) {
        return new C66059m(false, str, str2, null);
    }

    /* renamed from: a */
    public final void mo105105a(C66058l lVar, AbstractC66053i iVar) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(iVar, "");
        if (!lVar.f148758b.f148640a.isEmpty()) {
            String str = lVar.f148758b.f148641b;
            List<C66057k> list = lVar.f148758b.f148640a;
            String str2 = lVar.f148757a;
            String str3 = lVar.f148758b.f148640a.get(0).f148756a;
            C66059m a = m117868a(str2, str3);
            try {
                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C66055a(this, str, list, iVar, a, str2, str3, null), 3);
            } catch (Exception unused2) {
                iVar.mo105095a(a);
            }
        }
    }
}
