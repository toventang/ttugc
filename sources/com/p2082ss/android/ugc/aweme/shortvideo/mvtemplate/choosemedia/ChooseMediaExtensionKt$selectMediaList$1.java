package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20531t;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72055ac;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt$selectMediaList$1 */
public final class ChooseMediaExtensionKt$selectMediaList$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC72051a f161358a;

    /* renamed from: b */
    final /* synthetic */ AbstractC72055ac f161359b;

    static {
        Covode.recordClassIndex(84645);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC89290k kVar;
        this.f161358a.getLifecycle().mo4013b(this);
        ActivityC0945e activity = this.f161358a.getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        BaseJediViewModel baseJediViewModel = (BaseJediViewModel) C20531t.m38716a(activity).mo33800a(ChooseMediaViewModel.class);
        AbstractC72051a aVar = this.f161358a;
        AbstractC72055ac acVar = this.f161359b;
        if (C89219l.m154714a(acVar, AbstractC72055ac.C72056a.f161510a)) {
            kVar = C72218g.f161900a;
        } else if (C89219l.m154714a(acVar, AbstractC72055ac.C72057b.f161511a)) {
            kVar = C72219h.f161901a;
        } else if (C89219l.m154714a(acVar, AbstractC72055ac.C72058c.f161512a)) {
            kVar = C72220i.f161902a;
        } else {
            throw new C89376n();
        }
        AbstractC88412b unused = baseJediViewModel.mo33677a(aVar, kVar, new C20370ah(), new C72005a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt$selectMediaList$1$a */
    public static final class C72005a extends AbstractC89220m implements AbstractC89172b<C72059ad, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChooseMediaExtensionKt$selectMediaList$1 f161360a;

        static {
            Covode.recordClassIndex(84646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72005a(ChooseMediaExtensionKt$selectMediaList$1 chooseMediaExtensionKt$selectMediaList$1) {
            super(1);
            this.f161360a = chooseMediaExtensionKt$selectMediaList$1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C72059ad adVar) {
            C72059ad adVar2 = adVar;
            C89219l.m154721d(adVar2, "");
            ChooseMediaExtensionKt$selectMediaList$1 chooseMediaExtensionKt$selectMediaList$1 = this.f161360a;
            if (!(adVar2 == C72216f.f161898a || chooseMediaExtensionKt$selectMediaList$1 == null)) {
                this.f161360a.f161358a.mo114332a(adVar2.f161513a, adVar2.f161514b);
            }
            return C89391z.f203057a;
        }
    }

    ChooseMediaExtensionKt$selectMediaList$1(AbstractC72051a aVar, AbstractC72055ac acVar) {
        this.f161358a = aVar;
        this.f161359b = acVar;
    }
}
