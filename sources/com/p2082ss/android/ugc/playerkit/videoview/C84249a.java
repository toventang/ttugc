package com.p2082ss.android.ugc.playerkit.videoview;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.playerkit.videoview.a */
public final class C84249a implements AbstractC84292h {

    /* renamed from: a */
    public WeakReference<VideoViewComponent> f188422a;

    /* renamed from: b */
    private Set<AbstractC1204m> f188423b;

    static {
        Covode.recordClassIndex(98164);
    }

    /* renamed from: com.ss.android.ugc.playerkit.videoview.a$a */
    public static final class C84250a {

        /* renamed from: a */
        public static final C84249a f188424a = new C84249a((byte) 0);

        static {
            Covode.recordClassIndex(98165);
        }
    }

    private C84249a() {
        this.f188422a = new WeakReference<>(null);
        this.f188423b = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: j */
    public final AbstractC63042j.C63049g mo80281j() {
        VideoViewComponent videoViewComponent;
        WeakReference<VideoViewComponent> weakReference = this.f188422a;
        if (weakReference == null || (videoViewComponent = weakReference.get()) == null) {
            return null;
        }
        return videoViewComponent.mo80281j();
    }

    /* synthetic */ C84249a(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: a */
    public final void mo80280a(OnUIPlayListener onUIPlayListener) {
        VideoViewComponent videoViewComponent;
        WeakReference<VideoViewComponent> weakReference = this.f188422a;
        if (weakReference != null && (videoViewComponent = weakReference.get()) != null) {
            videoViewComponent.mo80280a(onUIPlayListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo129278a(VideoViewComponent videoViewComponent) {
        VideoViewComponent videoViewComponent2 = this.f188422a.get();
        if (videoViewComponent2 != null) {
            for (AbstractC1204m mVar : this.f188423b) {
                if (mVar != null) {
                    mVar.getLifecycle().mo4013b(videoViewComponent2);
                }
            }
        }
        this.f188422a = new WeakReference<>(videoViewComponent);
    }
}
