package com.p2082ss.android.ugc.aweme.feed.share;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.share.FeedShareHelper$doShow$observer$1 */
public final class FeedShareHelper$doShow$observer$1 implements AbstractC33974au {
    static {
        Covode.recordClassIndex(59023);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        }
    }

    FeedShareHelper$doShow$observer$1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.share.FeedShareHelper$doShow$observer$1$a */
    public static final class RunnableC49913a implements Runnable {

        /* renamed from: a */
        public static final RunnableC49913a f115059a = new RunnableC49913a();

        static {
            Covode.recordClassIndex(59024);
        }

        RunnableC49913a() {
        }

        public final void run() {
            WeakReference<Object> weakReference;
            if (!C17873f.f42636l && (weakReference = C49914a.f115061b) != null) {
                weakReference.get();
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        new Handler(Looper.getMainLooper()).post(RunnableC49913a.f115059a);
    }
}
