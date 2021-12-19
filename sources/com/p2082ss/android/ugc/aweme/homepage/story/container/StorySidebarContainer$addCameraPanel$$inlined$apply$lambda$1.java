package com.p2082ss.android.ugc.aweme.homepage.story.container;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StorySidebarContainer$addCameraPanel$$inlined$apply$lambda$1 */
public final class StorySidebarContainer$addCameraPanel$$inlined$apply$lambda$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C53058j f121975a;

    static {
        Covode.recordClassIndex(62585);
    }

    StorySidebarContainer$addCameraPanel$$inlined$apply$lambda$1(C53058j jVar) {
        this.f121975a = jVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        C53055h.m98052a("StoryToolsFragment >>> source:" + mVar + ", event:" + aVar);
        if (this.f121975a.f122015k && aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            this.f121975a.f122015k = false;
            this.f121975a.getStoryContainer().mo89484b();
        }
    }
}
