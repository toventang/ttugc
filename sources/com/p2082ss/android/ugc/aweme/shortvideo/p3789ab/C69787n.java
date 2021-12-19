package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.p2338ar.C33932a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69783m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.C69780k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89376n;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.n */
public final class C69787n extends C33932a {

    /* renamed from: a */
    public static final C69787n f155959a = new C69787n();

    private C69787n() {
    }

    static {
        Covode.recordClassIndex(82193);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.n$a */
    public static final class C69788a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f155960a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69783m f155961b;

        static {
            Covode.recordClassIndex(82194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69788a(AbstractC69783m mVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f155961b = mVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C69788a(this.f155961b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C69788a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f155960a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC69783m.C69786c cVar = (AbstractC69783m.C69786c) this.f155961b;
                this.f155960a = 1;
                cVar.f155955a.f100904d = cVar.f155956b;
                cVar.f155955a.f100900W.f100846bs = C63244g.m114602a().mo73267M();
                obj = C89624i.m155554a(C89546bf.f203267b, new C69780k.C69781a(cVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DraftSaveResult draftSaveResult = (DraftSaveResult) obj;
            if (draftSaveResult.isSuc()) {
                ((AbstractC69783m.C69786c) this.f155961b).f155958d.onDraftSaveSuccess();
            } else {
                ((AbstractC69783m.C69786c) this.f155961b).f155958d.onDraftSaveFailed(draftSaveResult);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static <RETURN_VALUE> RETURN_VALUE m123312a(AbstractC69783m<RETURN_VALUE> mVar) {
        C89219l.m154721d(mVar, "");
        if (mVar instanceof AbstractC69783m.C69785b) {
            AbstractC69783m.C69785b bVar = (AbstractC69783m.C69785b) mVar;
            m123313a(bVar.f155952a, bVar.f155953b, bVar.f155954c);
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (mVar instanceof AbstractC69783m.C69786c) {
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C31068c.f74429a), null, null, new C69788a(mVar, null), 3);
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (mVar instanceof AbstractC69783m.C69784a) {
            ((AbstractC69783m.C69784a) mVar).f155951a.finish();
            return (RETURN_VALUE) C89391z.f203057a;
        } else {
            throw new C89376n();
        }
    }

    /* renamed from: a */
    private static void m123313a(ActivityC0945e eVar, Bundle bundle, String str) {
        AbstractC72480e b = C72479d.m127867b(C72477c.f162474a);
        b.mo114742d();
        b.mo114739a("after_click_publish", true);
        b.mo114737a(1);
        C65682o.m117573a(eVar, bundle, str);
    }
}
