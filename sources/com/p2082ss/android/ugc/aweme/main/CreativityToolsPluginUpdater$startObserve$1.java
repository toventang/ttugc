package com.p2082ss.android.ugc.aweme.main;

import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater$startObserve$1 */
public final class CreativityToolsPluginUpdater$startObserve$1 implements AbstractC1192f {

    /* renamed from: a */
    final /* synthetic */ C59078e f134231a;

    static {
        Covode.recordClassIndex(69309);
    }

    public CreativityToolsPluginUpdater$startObserve$1(C59078e eVar) {
        this.f134231a = eVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            this.f134231a.mo96600a();
        }
    }
}
