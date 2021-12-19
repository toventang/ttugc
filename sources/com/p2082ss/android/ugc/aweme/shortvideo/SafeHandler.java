package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.SafeHandler */
public class SafeHandler extends Handler implements AbstractC1192f {

    /* renamed from: a */
    final AbstractC1204m f155738a;

    static {
        Covode.recordClassIndex(82131);
    }

    /* renamed from: a */
    public final void mo109999a() {
        removeCallbacksAndMessages(null);
        mo116380a(new RunnableC70634df(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.SafeHandler$1 */
    static /* synthetic */ class C697361 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155739a;

        static {
            Covode.recordClassIndex(82132);
            int[] iArr = new int[AbstractC1196i.EnumC1198a.values().length];
            f155739a = iArr;
            try {
                iArr[AbstractC1196i.EnumC1198a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SafeHandler(AbstractC1204m mVar) {
        super(Looper.getMainLooper());
        this.f155738a = mVar;
        mo116380a(new RunnableC70633de(this));
    }

    /* renamed from: a */
    private void mo116380a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (C697361.f155739a[aVar.ordinal()] == 1) {
            mo109999a();
        }
    }
}
