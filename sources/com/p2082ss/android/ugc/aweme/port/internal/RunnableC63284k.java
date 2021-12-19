package com.p2082ss.android.ugc.aweme.port.internal;

import android.graphics.Bitmap;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.AbstractC58648k;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.port.internal.k */
public final /* synthetic */ class RunnableC63284k implements Runnable {

    /* renamed from: a */
    private final MainActivityCallback f143643a;

    /* renamed from: b */
    private final ActivityC0945e f143644b;

    /* renamed from: c */
    private final String f143645c;

    /* renamed from: d */
    private final boolean f143646d;

    static {
        Covode.recordClassIndex(74561);
    }

    RunnableC63284k(MainActivityCallback mainActivityCallback, ActivityC0945e eVar, String str, boolean z) {
        this.f143643a = mainActivityCallback;
        this.f143644b = eVar;
        this.f143645c = str;
        this.f143646d = z;
    }

    public final void run() {
        MainActivityCallback mainActivityCallback = this.f143643a;
        ActivityC0945e eVar = this.f143644b;
        String str = this.f143645c;
        boolean z = this.f143646d;
        eVar.getLifecycle().mo4012a(mainActivityCallback);
        mainActivityCallback.f143625a = new AbstractC72630h(str) {
            /* class com.p2082ss.android.ugc.aweme.port.internal.MainActivityCallback.C632721 */

            /* renamed from: a */
            final /* synthetic */ String f143633a;

            static {
                Covode.recordClassIndex(74549);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h
            /* renamed from: a */
            public final Object mo101822a() {
                return MainActivityCallback.this.f143628d.f162938k;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h
            /* renamed from: b */
            public final int mo101824b() {
                return MainActivityCallback.this.f143628d.f162935h;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h
            /* renamed from: c */
            public final int mo101826c() {
                return MainActivityCallback.this.f143628d.f162936i;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h
            /* renamed from: e */
            public final String mo101828e() {
                return MainActivityCallback.this.f143628d.f162929b;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h
            /* renamed from: d */
            public final Bitmap mo101827d() {
                return MainActivityCallback.this.f143627c.getCover(MainActivityCallback.this.f143628d);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h
            /* renamed from: a */
            public final void mo101823a(AbstractC74304x xVar) {
                MainActivityCallback.this.f143627c.addPublishCallback(xVar, this.f143633a);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h
            /* renamed from: b */
            public final void mo101825b(AbstractC74304x xVar) {
                MainActivityCallback.this.f143627c.removePublishCallback(xVar);
            }

            {
                this.f143633a = r2;
            }
        };
        mainActivityCallback.f143625a.mo101823a(mainActivityCallback);
        mainActivityCallback.f143626b = new C63273a(eVar);
        AbstractC81915c.m141874a(new C71900f(2));
        if (eVar instanceof MainActivity) {
            if (z && mainActivityCallback.f143628d.f162936i != -1) {
                ((MainActivity) eVar).changeTabAfterPublish(mainActivityCallback.f143628d.f162936i);
            }
            ((MainActivity) eVar).onPublishServiceConnected(mainActivityCallback.f143625a, mainActivityCallback.f143625a.mo101822a(), str, mainActivityCallback.f143628d);
        } else if (eVar instanceof AbstractC58648k) {
            mainActivityCallback.f143625a.mo101822a();
        }
    }
}
