package com.p2082ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.SafeHandler */
public class SafeHandler extends Handler implements AbstractC1192f {

    /* renamed from: a */
    private final AbstractC1204m f81439a;

    static {
        Covode.recordClassIndex(41416);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.SafeHandler$1 */
    static /* synthetic */ class C344641 {

        /* renamed from: a */
        static final /* synthetic */ int[] f81440a;

        static {
            Covode.recordClassIndex(41417);
            int[] iArr = new int[AbstractC1196i.EnumC1198a.values().length];
            f81440a = iArr;
            try {
                iArr[AbstractC1196i.EnumC1198a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SafeHandler(AbstractC1204m mVar) {
        super(Looper.getMainLooper());
        this.f81439a = mVar;
        if (mVar != null) {
            mVar.getLifecycle().mo4012a(this);
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (C344641.f81440a[aVar.ordinal()] == 1) {
            removeCallbacksAndMessages(null);
            AbstractC1204m mVar2 = this.f81439a;
            if (mVar2 != null) {
                mVar2.getLifecycle().mo4013b(this);
            }
        }
    }
}
