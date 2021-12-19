package com.p2082ss.android.ugc.tools.view.base;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.base.HumbleViewModel */
public abstract class HumbleViewModel extends AbstractC1174ac implements AbstractC33974au {
    private boolean destroyed;
    private final AbstractC1204m lifecycleOwner;

    static {
        Covode.recordClassIndex(98927);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean isDestroyed() {
        return this.destroyed;
    }

    private final void destroy() {
        if (!this.destroyed) {
            this.destroyed = true;
            onCleared();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        destroy();
        this.lifecycleOwner.getLifecycle().mo4013b(this);
    }

    private final void observeLifecycle() {
        AbstractC1196i lifecycle = this.lifecycleOwner.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
            destroy();
        } else {
            this.lifecycleOwner.getLifecycle().mo4012a(this);
        }
    }

    public HumbleViewModel(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.lifecycleOwner = mVar;
        observeLifecycle();
    }
}
