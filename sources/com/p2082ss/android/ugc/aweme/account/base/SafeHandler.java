package com.p2082ss.android.ugc.aweme.account.base;

import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.account.base.SafeHandler */
public class SafeHandler extends Handler implements AbstractC33974au {

    /* renamed from: a */
    protected boolean f75544a;

    /* renamed from: b */
    private final AbstractC1204m f75545b;

    static {
        Covode.recordClassIndex(38314);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void destroy() {
        this.f75544a = true;
        removeCallbacksAndMessages(null);
    }

    public SafeHandler(AbstractC1204m mVar) {
        this.f75545b = mVar;
        mVar.getLifecycle().mo4012a(this);
    }
}
