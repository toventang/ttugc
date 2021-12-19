package com.p2082ss.android.ugc.aweme.feed.adapter;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter$lifecycleObserver$1 */
public final class FullFeedPagerAdapter$lifecycleObserver$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C48306z f111300a;

    static {
        Covode.recordClassIndex(56773);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter$lifecycleObserver$1$a */
    static final class RunnableC48041a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FullFeedPagerAdapter$lifecycleObserver$1 f111301a;

        static {
            Covode.recordClassIndex(56774);
        }

        RunnableC48041a(FullFeedPagerAdapter$lifecycleObserver$1 fullFeedPagerAdapter$lifecycleObserver$1) {
            this.f111301a = fullFeedPagerAdapter$lifecycleObserver$1;
        }

        public final void run() {
            AbstractC1196i lifecycle;
            C48306z zVar = this.f111301a.f111300a;
            Fragment fragment = zVar.f111631i;
            if (!(fragment == null || (lifecycle = fragment.getLifecycle()) == null)) {
                lifecycle.mo4013b(zVar.f111954q);
            }
            zVar.f111953p.mo80376a();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    FullFeedPagerAdapter$lifecycleObserver$1(C48306z zVar) {
        this.f111300a = zVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            ExecutorC34605m.f81660a.execute(new RunnableC48041a(this));
        }
    }
}
