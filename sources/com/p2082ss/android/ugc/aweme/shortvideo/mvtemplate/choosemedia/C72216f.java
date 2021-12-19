package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20531t;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.C59179f;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.f */
public final class C72216f {

    /* renamed from: a */
    static final C72059ad f161898a = new C72059ad();

    static {
        Covode.recordClassIndex(84881);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.f$a */
    static final class C72217a extends AbstractC89220m implements AbstractC89172b<OpeningChooseMediaPageState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f161899a;

        static {
            Covode.recordClassIndex(84882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72217a(AbstractC89172b bVar) {
            super(1);
            this.f161899a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OpeningChooseMediaPageState openingChooseMediaPageState) {
            C89219l.m154721d(openingChooseMediaPageState, "");
            this.f161899a.invoke(openingChooseMediaPageState);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final OpeningChooseMediaPageState m127413a(C72060ae aeVar) {
        C89219l.m154721d(aeVar, "");
        ActivityC0945e activity = aeVar.getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        return ((ChooseMediaState) ((BaseJediViewModel) C20531t.m38716a(activity).mo33800a(ChooseMediaViewModel.class)).mo33676a(aeVar)).getOpeningChooseMediaPageState();
    }

    /* renamed from: a */
    public static final void m127414a(C59179f fVar) {
        C89219l.m154721d(fVar, "");
        C39162r.m79460a("tool_performance_import_select_media", new C84425b().mo129407a("is_support", fVar.f134655a).mo129403a("error_code", fVar.f134659e).mo129406a("file_format", fVar.f134658d).f188764a);
    }

    /* renamed from: a */
    public static final void m127415a(AbstractC72051a aVar, AbstractC72055ac acVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(acVar, "");
        aVar.getLifecycle().mo4012a(new ChooseMediaExtensionKt$selectMediaList$1(aVar, acVar));
    }
}
