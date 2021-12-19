package com.p2082ss.android.ugc.aweme.components.video.playbox;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.xelement.AbstractC19055d;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61502d;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80255bm;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.p4207a.C80648a;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox */
public class DeclarativeVideoPlayBox extends AbstractC19055d implements AbstractC33974au, OnUIPlayListener {

    /* renamed from: i */
    public static SoftReference<AbstractC80747i> f94280i;

    /* renamed from: j */
    public static final C40164a f94281j = new C40164a((byte) 0);

    /* renamed from: A */
    private boolean f94282A;

    /* renamed from: B */
    private final IResourceLoaderService f94283B;

    /* renamed from: C */
    private boolean f94284C;

    /* renamed from: D */
    private int f94285D;

    /* renamed from: E */
    private AbstractC89187q<? super String, ? super Map<String, ? extends Object>, ? super AbstractC19055d, C89391z> f94286E;

    /* renamed from: F */
    private final AbstractC89244h f94287F;

    /* renamed from: G */
    private final AbstractC89244h f94288G;

    /* renamed from: H */
    private final AbstractC89244h f94289H;

    /* renamed from: I */
    private KeepSurfaceTextureView f94290I;

    /* renamed from: J */
    private KeepSurfaceTextureView f94291J;

    /* renamed from: K */
    private final RemoteImageView f94292K;

    /* renamed from: a */
    public boolean f94293a;

    /* renamed from: b */
    public Aweme f94294b;

    /* renamed from: c */
    public boolean f94295c;

    /* renamed from: d */
    public boolean f94296d;

    /* renamed from: e */
    public boolean f94297e;

    /* renamed from: f */
    public String f94298f;

    /* renamed from: g */
    public boolean f94299g;

    /* renamed from: h */
    public C80648a f94300h;

    /* renamed from: k */
    private Uri f94301k;

    /* renamed from: l */
    private boolean f94302l;

    /* renamed from: m */
    private int f94303m;

    /* renamed from: n */
    private String f94304n;

    /* renamed from: o */
    private int f94305o;

    /* renamed from: p */
    private boolean f94306p;

    /* renamed from: q */
    private String f94307q;

    /* renamed from: r */
    private boolean f94308r;

    /* renamed from: s */
    private boolean f94309s;

    /* renamed from: t */
    private boolean f94310t;

    /* renamed from: u */
    private float f94311u;

    /* renamed from: v */
    private float f94312v;

    /* renamed from: w */
    private boolean f94313w;

    /* renamed from: x */
    private int f94314x;

    /* renamed from: y */
    private int f94315y;

    /* renamed from: z */
    private String f94316z;

    static {
        Covode.recordClassIndex(47950);
    }

    private final AbstractC80747i getMPlayer() {
        return (AbstractC80747i) this.f94287F.getValue();
    }

    private final String getMReactSessionId() {
        return (String) this.f94289H.getValue();
    }

    private final C40174j.TextureView$SurfaceTextureListenerC401751 getSurfaceListener() {
        return (C40174j.TextureView$SurfaceTextureListenerC401751) this.f94288G.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i, float f) {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onHostResume(mVar);
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onHostPause(mVar);
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onHostDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i, int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$a */
    public static final class C40164a {
        static {
            Covode.recordClassIndex(47951);
        }

        private C40164a() {
        }

        public /* synthetic */ C40164a(byte b) {
            this();
        }
    }

    public final KeepSurfaceTextureView getMTextureView() {
        return this.f94290I;
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$i */
    static final class C40172i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DeclarativeVideoPlayBox f94328a;

        /* renamed from: b */
        final /* synthetic */ int f94329b;

        /* renamed from: c */
        final /* synthetic */ boolean f94330c;

        static {
            Covode.recordClassIndex(47959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40172i(DeclarativeVideoPlayBox declarativeVideoPlayBox, int i, boolean z) {
            super(0);
            this.f94328a = declarativeVideoPlayBox;
            this.f94329b = i;
            this.f94330c = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$i$a */
        static final class RunnableC40173a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C80648a f94331a;

            static {
                Covode.recordClassIndex(47960);
            }

            RunnableC40173a(C80648a aVar) {
                this.f94331a = aVar;
            }

            public final void run() {
                this.f94331a.mo123836c();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            Video video;
            C80648a aVar = this.f94328a.f94300h;
            if (aVar != null) {
                float f = (float) this.f94329b;
                Aweme aweme = this.f94328a.f94294b;
                if (aweme == null || (video = aweme.getVideo()) == null) {
                    i = 100;
                } else {
                    i = video.getDuration();
                }
                float f2 = (f / ((float) i)) * 100.0f;
                AbstractC80747i iVar = aVar.f180326a;
                if (iVar != null) {
                    iVar.mo123931a(f2);
                }
                this.f94328a.mo69334a("onSeeked", C89041ag.m154428c(C89387v.m154943a("progress", Integer.valueOf(this.f94329b))));
                if (!this.f94330c) {
                    this.f94328a.postDelayed(new RunnableC40173a(aVar), 500);
                }
            }
            this.f94328a.f94299g = true ^ this.f94330c;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$f */
    public static final class RunnableC40169f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeclarativeVideoPlayBox f94323a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f94324b;

        static {
            Covode.recordClassIndex(47956);
        }

        RunnableC40169f(DeclarativeVideoPlayBox declarativeVideoPlayBox, AbstractC89171a aVar) {
            this.f94323a = declarativeVideoPlayBox;
            this.f94324b = aVar;
        }

        public final void run() {
            this.f94323a.mo69336b(this.f94324b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$g */
    static final class RunnableC40170g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeclarativeVideoPlayBox f94325a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f94326b;

        static {
            Covode.recordClassIndex(47957);
        }

        RunnableC40170g(DeclarativeVideoPlayBox declarativeVideoPlayBox, AbstractC89171a aVar) {
            this.f94325a = declarativeVideoPlayBox;
            this.f94326b = aVar;
        }

        public final void run() {
            this.f94325a.mo30343a(this.f94326b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$j */
    static final class C40174j extends AbstractC89220m implements AbstractC89171a<TextureView$SurfaceTextureListenerC401751> {

        /* renamed from: a */
        final /* synthetic */ DeclarativeVideoPlayBox f94332a;

        static {
            Covode.recordClassIndex(47961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40174j(DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(0);
            this.f94332a = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextureView$SurfaceTextureListenerC401751 invoke() {
            return new TextureView.SurfaceTextureListener(this) {
                /* class com.p2082ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox.C40174j.TextureView$SurfaceTextureListenerC401751 */

                /* renamed from: a */
                final /* synthetic */ C40174j f94333a;

                static {
                    Covode.recordClassIndex(47962);
                }

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    C89219l.m154721d(surfaceTexture, "");
                    return false;
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    C89219l.m154721d(surfaceTexture, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f94333a = r1;
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    C89219l.m154721d(surfaceTexture, "");
                    this.f94333a.f94332a.mo69333a(i, i2);
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    C89219l.m154721d(surfaceTexture, "");
                    this.f94333a.f94332a.mo69333a(i, i2);
                }
            };
        }
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    /* renamed from: a */
    public final void mo30341a() {
        if (this.f94313w) {
            mo69337e();
        }
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    /* renamed from: b */
    public final void mo30344b() {
        m81246h();
        this.f94299g = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$c */
    static final class C40166c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C40166c f94318a = new C40166c();

        static {
            Covode.recordClassIndex(47953);
        }

        C40166c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$h */
    public static final class C40171h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DeclarativeVideoPlayBox f94327a;

        static {
            Covode.recordClassIndex(47958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40171h(DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(0);
            this.f94327a = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            if (!this.f94327a.f94296d) {
                this.f94327a.f94299g = true;
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    /* renamed from: d */
    public void mo30346d() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            topActivity.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f94284C = true;
        m81245g();
    }

    /* renamed from: f */
    private final void m81244f() {
        if (this.f94302l) {
            C80648a aVar = this.f94300h;
            if (aVar != null) {
                aVar.mo123840g();
                return;
            }
            return;
        }
        C80648a aVar2 = this.f94300h;
        if (aVar2 != null) {
            float f = this.f94311u;
            aVar2.mo123833a(f, f);
        }
    }

    /* renamed from: g */
    private final void m81245g() {
        AbstractC80747i mPlayer;
        if (this.f94303m > 0 && (mPlayer = getMPlayer()) != null) {
            mPlayer.mo123916J();
        }
        C80648a aVar = this.f94300h;
        if (aVar != null) {
            aVar.mo123836c();
        }
        C80648a aVar2 = this.f94300h;
        if (aVar2 != null) {
            aVar2.mo123835b();
        }
    }

    /* renamed from: h */
    private final void m81246h() {
        AbstractC80747i mPlayer;
        C80648a aVar = this.f94300h;
        if (aVar != null) {
            aVar.mo123836c();
        }
        if (this.f94303m > 0 && (mPlayer = getMPlayer()) != null) {
            mPlayer.mo123916J();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$b */
    static final class C40165b extends AbstractC89220m implements AbstractC89171a<AbstractC80747i> {

        /* renamed from: a */
        final /* synthetic */ DeclarativeVideoPlayBox f94317a;

        static {
            Covode.recordClassIndex(47952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40165b(DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(0);
            this.f94317a = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC80747i invoke() {
            if (!this.f94317a.f94295c) {
                return C61502d.C61503a.f139613a.mo99158a();
            }
            SoftReference<AbstractC80747i> softReference = DeclarativeVideoPlayBox.f94280i;
            if (softReference == null || softReference.get() == null) {
                DeclarativeVideoPlayBox.f94280i = new SoftReference<>(C61502d.C61503a.f139613a.mo99158a());
            }
            SoftReference<AbstractC80747i> softReference2 = DeclarativeVideoPlayBox.f94280i;
            if (softReference2 != null) {
                return softReference2.get();
            }
            return null;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onHostDestroy() {
        Context context;
        AbstractC1196i lifecycle;
        Context context2 = getContext();
        AbstractC1204m mVar = null;
        if (!(context2 instanceof ContextWrapper)) {
            context2 = null;
        }
        ContextWrapper contextWrapper = (ContextWrapper) context2;
        if (contextWrapper != null) {
            context = contextWrapper.getBaseContext();
        } else {
            context = null;
        }
        if (context instanceof AbstractC1204m) {
            mVar = context;
        }
        AbstractC1204m mVar2 = mVar;
        if (mVar2 != null && (lifecycle = mVar2.getLifecycle()) != null) {
            lifecycle.mo4013b(this);
        }
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    /* renamed from: c */
    public void mo30345c() {
        if (this.f94294b != null) {
            m81246h();
            if (getMPlayer() != null) {
                mo69334a("onZoomChange", C89041ag.m154428c(C89387v.m154943a("zoom", 1)));
                return;
            }
            return;
        }
        Uri uri = this.f94301k;
        if (uri != null && uri.isHierarchical()) {
            m81246h();
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            if (createIMainServicebyMonsterPlugin != null) {
                Context context = getContext();
                String str = this.f94298f;
                createIMainServicebyMonsterPlugin.startVideoPlayActivity(context, str, "", this.f94306p, str, C13607d.m24442b(str), "hybrid", "", this.f94312v);
            }
            this.f94312v = 0.0f;
        }
    }

    public void requestLayout() {
        super.requestLayout();
        if (getWidth() > 0 && getHeight() > 0) {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getPaddingLeft() + getLeft(), getPaddingTop() + getTop(), getWidth() + getPaddingLeft() + getLeft(), getHeight() + getPaddingTop() + getTop());
        }
    }

    /* renamed from: e */
    public final void mo69337e() {
        C24229q.AbstractC24231b bVar;
        if (this.f94293a) {
            m81245g();
            this.f94291J = this.f94290I;
            KeepSurfaceTextureView keepSurfaceTextureView = new KeepSurfaceTextureView(getContext());
            keepSurfaceTextureView.setAlpha(0.0f);
            this.f94290I = keepSurfaceTextureView;
            addView(keepSurfaceTextureView, -1, -1);
            C80648a aVar = new C80648a(this.f94290I, this);
            this.f94300h = aVar;
            aVar.f180326a = getMPlayer();
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.f94290I;
            if (keepSurfaceTextureView2 != null) {
                keepSurfaceTextureView2.setSurfaceTextureListener(getSurfaceListener());
            }
            C80648a aVar2 = this.f94300h;
            if (aVar2 != null) {
                aVar2.f180330e = this.f94306p;
                Uri uri = this.f94301k;
                if (uri == null || !uri.isHierarchical()) {
                    aVar2.f180328c = this.f94294b;
                } else {
                    aVar2.f180329d = this.f94298f;
                }
            }
            requestLayout();
            String str = this.f94307q;
            if (this.f94292K.getTag() == null && C80255bm.m139102a(this.f94307q) && str != null) {
                RemoteImageView remoteImageView = this.f94292K;
                remoteImageView.setAlpha(1.0f);
                C24246a aVar3 = (C24246a) remoteImageView.getHierarchy();
                C89219l.m154716b(aVar3, "");
                String str2 = this.f94304n;
                int hashCode = str2.hashCode();
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && str2.equals("contain")) {
                        bVar = C24229q.AbstractC24231b.f57454d;
                        aVar3.mo39958a(bVar);
                        C34577e.m70608b(remoteImageView, this.f94307q, -1, -1);
                        remoteImageView.setTag(this.f94307q);
                    }
                } else if (str2.equals("cover")) {
                    bVar = C24229q.AbstractC24231b.f57458h;
                    aVar3.mo39958a(bVar);
                    C34577e.m70608b(remoteImageView, this.f94307q, -1, -1);
                    remoteImageView.setTag(this.f94307q);
                }
                bVar = C24229q.AbstractC24231b.f57452b;
                aVar3.mo39958a(bVar);
                C34577e.m70608b(remoteImageView, this.f94307q, -1, -1);
                remoteImageView.setTag(this.f94307q);
            }
        } else {
            m81244f();
        }
        mo30343a(new C40171h(this));
        this.f94313w = false;
        this.f94293a = false;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setAutoLifecycle(boolean z) {
        this.f94308r = z;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setAutoPlay(boolean z) {
        this.f94296d = z;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setDeviceChangeAware(boolean z) {
        this.f94309s = z;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setLoop(boolean z) {
        this.f94306p = z;
    }

    public final void setMTextureView(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f94290I = keepSurfaceTextureView;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setPreload(boolean z) {
        this.f94310t = z;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setRate(int i) {
        this.f94303m = i;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setSinglePlayer(boolean z) {
        this.f94295c = z;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setStateChangeReporter(AbstractC89187q<? super String, ? super Map<String, ? extends Object>, ? super AbstractC19055d, C89391z> qVar) {
        this.f94286E = qVar;
    }

    public /* synthetic */ DeclarativeVideoPlayBox(Context context) {
        this(context, null, 0);
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setObjectFit(String str) {
        C89219l.m154721d(str, "");
        this.f94304n = str;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setInitTime(int i) {
        boolean z;
        if (this.f94305o != i) {
            z = true;
        } else {
            z = false;
        }
        mo69335a(z);
        this.f94305o = i;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setMuted(boolean z) {
        boolean z2;
        if (this.f94302l != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo69335a(z2);
        this.f94302l = z;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setVolume(float f) {
        boolean z;
        if (this.f94311u != f) {
            z = true;
        } else {
            z = false;
        }
        mo69335a(z);
        this.f94311u = f;
    }

    /* renamed from: b */
    private final boolean m81243b(String str) {
        String str2;
        if (C89219l.m154714a((Object) str, (Object) this.f94298f)) {
            return true;
        }
        Aweme aweme = this.f94294b;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (C89219l.m154714a((Object) str, (Object) str2)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
        mo69334a("onBuffering", C89041ag.m154428c(C89387v.m154943a("buffer", Integer.valueOf(z ? 1 : 0))));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onHostPause(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        AbstractC80747i mPlayer = getMPlayer();
        if (mPlayer != null && mPlayer.mo123892o() && this.f94308r && !this.f94295c) {
            m81246h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        if (m81243b(str)) {
            mo69334a("onPause", new HashMap());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
        if (m81243b(str)) {
            mo69334a("onFirstCompleted", new HashMap());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C84208l lVar) {
        C89219l.m154721d(lVar, "");
        if (m81243b(lVar.f188032a)) {
            mo69334a("onPlayFailed", new HashMap());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
        if (m81243b(str)) {
            mo69334a("onPreparePlay", new HashMap());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(C84215n nVar) {
        C89219l.m154721d(nVar, "");
        if (m81243b(nVar.f188111a)) {
            mo69334a("onRenderReady", new HashMap());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
        if (m81243b(str)) {
            mo69334a("onPlay", new HashMap());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(C84208l lVar) {
        C89219l.m154721d(lVar, "");
        mo69334a("onError", C89041ag.m154428c(C89387v.m154943a("message", lVar.toString())));
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setPoster(String str) {
        C89219l.m154721d(str, "");
        mo69335a(!C89219l.m154714a((Object) this.f94307q, (Object) str));
        this.f94307q = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$e */
    static final class C40168e extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f94321a;

        /* renamed from: b */
        final /* synthetic */ DeclarativeVideoPlayBox f94322b;

        static {
            Covode.recordClassIndex(47955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40168e(String str, DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(1);
            this.f94321a = str;
            this.f94322b = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            DeclarativeVideoPlayBox declarativeVideoPlayBox = this.f94322b;
            declarativeVideoPlayBox.f94293a = declarativeVideoPlayBox.mo69335a(!C89219l.m154714a((Object) this.f94321a, (Object) declarativeVideoPlayBox.f94298f));
            DeclarativeVideoPlayBox declarativeVideoPlayBox2 = this.f94322b;
            declarativeVideoPlayBox2.f94297e = declarativeVideoPlayBox2.f94293a;
            this.f94322b.f94298f = this.f94321a;
            this.f94322b.mo69337e();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static Object m81242a(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (C89361p.m154874b(str, "video://", false)) {
                return Uri.parse(str);
            }
            return new Api.C33598b(Aweme.class).mo59944a(str);
        } catch (Throwable th) {
            Object r1 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            if (C89379q.m157073isFailureimpl(r1)) {
                return null;
            }
            return r1;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onHostResume(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        AbstractC80747i mPlayer = getMPlayer();
        if (mPlayer != null && !mPlayer.mo123892o() && this.f94308r && !this.f94299g && !this.f94295c) {
            mo30343a((AbstractC89171a<C89391z>) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        if (m81243b(str)) {
            int i = this.f94285D;
            this.f94285D = i + 1;
            mo69334a("onCompleted", C89041ag.m154428c(C89387v.m154943a("times", Integer.valueOf(i))));
            if (!this.f94306p && this.f94282A) {
                mo30342a(0, false);
                m81246h();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f) {
        long j;
        this.f94312v = f;
        C89378p[] pVarArr = new C89378p[1];
        AbstractC80747i mPlayer = getMPlayer();
        if (mPlayer != null) {
            j = mPlayer.mo123891n();
        } else {
            j = 0;
        }
        pVarArr[0] = C89387v.m154943a("progress", Integer.valueOf((int) j));
        mo69334a("onProgressChange", C89041ag.m154428c(pVarArr));
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox$d */
    static final class C40167d extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f94319a;

        /* renamed from: b */
        final /* synthetic */ DeclarativeVideoPlayBox f94320b;

        static {
            Covode.recordClassIndex(47954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40167d(String str, DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(1);
            this.f94319a = str;
            this.f94320b = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            String str;
            C16610ap apVar2 = apVar;
            C89219l.m154721d(apVar2, "");
            if (apVar2.f39755o != null) {
                str = "file:/" + apVar2.f39755o;
            } else {
                str = this.f94319a;
            }
            DeclarativeVideoPlayBox declarativeVideoPlayBox = this.f94320b;
            declarativeVideoPlayBox.f94293a = declarativeVideoPlayBox.mo69335a(!C89219l.m154714a((Object) str, (Object) declarativeVideoPlayBox.f94298f));
            DeclarativeVideoPlayBox declarativeVideoPlayBox2 = this.f94320b;
            declarativeVideoPlayBox2.f94297e = declarativeVideoPlayBox2.f94293a;
            this.f94320b.f94298f = str;
            this.f94320b.mo69337e();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    /* renamed from: a */
    public final void mo30343a(AbstractC89171a<C89391z> aVar) {
        Boolean bool;
        if (this.f94282A) {
            mo69336b(aVar);
            return;
        }
        C80648a aVar2 = this.f94300h;
        if (aVar2 != null) {
            bool = Boolean.valueOf(aVar2.mo123839f());
        } else {
            bool = null;
        }
        if (!C89219l.m154714a((Object) bool, (Object) true) || this.f94284C) {
            if (this.f94297e) {
                this.f94297e = false;
                C80648a aVar3 = this.f94300h;
                if (aVar3 != null) {
                    aVar3.mo123834a(this.f94305o);
                }
                m81244f();
            } else {
                C80648a aVar4 = this.f94300h;
                if (aVar4 != null) {
                    aVar4.mo123837d();
                }
            }
            this.f94299g = false;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        postDelayed(new RunnableC40170g(this, aVar), 100);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C84216o oVar) {
        C89219l.m154721d(oVar, "");
        if (m81243b(oVar.getId())) {
            KeepSurfaceTextureView keepSurfaceTextureView = this.f94290I;
            if (keepSurfaceTextureView != null) {
                keepSurfaceTextureView.setAlpha(1.0f);
            }
            this.f94292K.setAlpha(0.0f);
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.f94291J;
            if (keepSurfaceTextureView2 != null) {
                removeView(keepSurfaceTextureView2);
            }
            this.f94312v = 0.0f;
            mo69334a("onFirstFrame", new HashMap());
            mo69334a("onPlay", new HashMap());
            if (this.f94299g) {
                mo30344b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69336b(p4600h.p4611f.p4612a.AbstractC89171a<p4600h.C89391z> r9) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox.mo69336b(h.f.a.a):void");
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    public void setSrc(String str) {
        String queryParameter;
        int i;
        Integer e;
        Integer e2;
        C89219l.m154721d(str, "");
        if (!C89219l.m154714a((Object) this.f94316z, (Object) str)) {
            this.f94316z = str;
            this.f94297e = true;
        }
        Object a = m81242a(str);
        if (a != null) {
            String str2 = null;
            boolean z = false;
            r2 = 0;
            int i2 = 0;
            z = false;
            if (a instanceof Uri) {
                if (mo69335a(!C89219l.m154714a(this.f94301k, a))) {
                    this.f94293a = true;
                }
                Uri uri = (Uri) a;
                this.f94301k = uri;
                if (uri != null) {
                    str2 = uri.getQueryParameter("play_legacy");
                }
                if (C89219l.m154714a((Object) "false", (Object) str2)) {
                    this.f94282A = false;
                } else {
                    this.f94282A = true;
                }
                Uri uri2 = this.f94301k;
                this.f94314x = 0;
                this.f94315y = 0;
                if (uri2 != null && uri2.isHierarchical()) {
                    String queryParameter2 = uri2.getQueryParameter("width");
                    if (queryParameter2 == null || (e2 = C89361p.m154863e(queryParameter2)) == null) {
                        i = 0;
                    } else {
                        i = e2.intValue();
                    }
                    this.f94314x = i;
                    String queryParameter3 = uri2.getQueryParameter("height");
                    if (!(queryParameter3 == null || (e = C89361p.m154863e(queryParameter3)) == null)) {
                        i2 = e.intValue();
                    }
                    this.f94315y = i2;
                }
                Uri uri3 = this.f94301k;
                if (uri3 != null && uri3.isHierarchical() && (queryParameter = uri3.getQueryParameter("play_url")) != null) {
                    if (this.f94282A) {
                        boolean a2 = mo69335a(!C89219l.m154714a((Object) queryParameter, (Object) this.f94298f));
                        this.f94293a = a2;
                        this.f94297e = a2;
                        C89219l.m154716b(queryParameter, "");
                        this.f94298f = queryParameter;
                        mo69337e();
                        return;
                    }
                    C89219l.m154716b(queryParameter, "");
                    IResourceLoaderService iResourceLoaderService = this.f94283B;
                    if (iResourceLoaderService != null) {
                        iResourceLoaderService.loadAsync(queryParameter, new C16667j(""), new C40167d(queryParameter, this), new C40168e(queryParameter, this));
                    }
                }
            } else if (a instanceof Aweme) {
                if (this.f94301k == null) {
                    Aweme aweme = this.f94294b;
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    }
                    if (!C89219l.m154714a((Object) str2, (Object) ((Aweme) a).getAid())) {
                        z = true;
                    }
                }
                if (mo69335a(z)) {
                    this.f94293a = true;
                }
                this.f94294b = (Aweme) a;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo69335a(boolean z) {
        if (z) {
            this.f94313w = true;
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d
    /* renamed from: a */
    public final void mo30342a(int i, boolean z) {
        this.f94297e = true;
        this.f94305o = i;
        mo30343a(new C40172i(this, i, z));
    }

    /* renamed from: a */
    public final void mo69334a(String str, Map<String, ? extends Object> map) {
        System.out.println((Object) "DeclarativeVideoPlayBox- ".concat(String.valueOf(str)));
        AbstractC89187q<? super String, ? super Map<String, ? extends Object>, ? super AbstractC19055d, C89391z> qVar = this.f94286E;
        if (qVar != null) {
            qVar.invoke(str, map, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r1 <= r4) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r1 > r4) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r3 = r1 / r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69333a(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox.mo69333a(int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeclarativeVideoPlayBox(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        Context context2;
        AbstractC1196i lifecycle;
        C89219l.m154721d(context, "");
        AbstractC1204m mVar = null;
        this.f94303m = 166;
        this.f94304n = "fill";
        this.f94307q = "";
        this.f94311u = 1.0f;
        this.f94316z = "";
        this.f94282A = true;
        this.f94298f = "";
        this.f94283B = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class);
        this.f94285D = 1;
        this.f94299g = true;
        this.f94287F = C89250i.m154773a((AbstractC89171a) new C40165b(this));
        this.f94288G = C89250i.m154774a(EnumC89331m.NONE, new C40174j(this));
        this.f94289H = C89250i.m154773a((AbstractC89171a) C40166c.f94318a);
        RemoteImageView remoteImageView = new RemoteImageView(context);
        this.f94292K = remoteImageView;
        addView(remoteImageView, -1, -1);
        ContextWrapper contextWrapper = (ContextWrapper) (!(context instanceof ContextWrapper) ? null : context);
        if (contextWrapper != null) {
            context2 = contextWrapper.getBaseContext();
        } else {
            context2 = null;
        }
        AbstractC1204m mVar2 = context2 instanceof AbstractC1204m ? context2 : mVar;
        if (mVar2 != null && (lifecycle = mVar2.getLifecycle()) != null) {
            lifecycle.mo4012a(this);
        }
    }
}
