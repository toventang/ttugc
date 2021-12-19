package com.bytedance.jedi.scene;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class SceneLifecycleAwareLazy<T extends AbstractC1174ac> extends lifecycleAwareLazy<T> implements AbstractC33974au {
    static {
        Covode.recordClassIndex(24211);
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SceneLifecycleAwareLazy(AbstractC1204m mVar, AbstractC89171a<String> aVar, AbstractC89171a<? extends T> aVar2) {
        super(mVar, aVar, aVar2);
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar2, "");
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    /* renamed from: a */
    public final void mo33796a(AbstractC1204m mVar, T t, AbstractC89171a<String> aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(t, "");
        C89219l.m154719c(aVar, "");
        AbstractC22219j jVar = ((AbstractC22219j) mVar).f52551o;
        if (jVar != null) {
            C89219l.m154719c(jVar, "");
            C89219l.m154719c(t, "");
            C89219l.m154719c(aVar, "");
            C1182af viewModelStore = jVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            String invoke = aVar.invoke();
            if (viewModelStore.mo3996a(invoke) == null) {
                viewModelStore.mo3998a(invoke, t);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SceneLifecycleAwareLazy(AbstractC1204m mVar, AbstractC89171a aVar, AbstractC89171a aVar2, int i, C89214g gVar) {
        this(mVar, (i & 2) != 0 ? null : aVar, aVar2);
    }
}
