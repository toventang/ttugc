package com.p2082ss.android.ugc.aweme.journey.step.swipeup;

import android.graphics.Matrix;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49418a;
import com.p2082ss.android.ugc.aweme.video.C80709c;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.e */
public final class C57038e {

    /* renamed from: j */
    public static final C57039a f129866j = new C57039a((byte) 0);

    /* renamed from: a */
    public VideoViewComponent f129867a;

    /* renamed from: b */
    RemoteImageView f129868b;

    /* renamed from: c */
    public C57022a f129869c;

    /* renamed from: d */
    final C49418a f129870d = new C49418a();

    /* renamed from: e */
    public boolean f129871e;

    /* renamed from: f */
    public Aweme f129872f;

    /* renamed from: g */
    boolean f129873g;

    /* renamed from: h */
    public View f129874h;

    /* renamed from: i */
    public AbstractC57040b f129875i;

    /* renamed from: k */
    private C57044f f129876k;

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.e$b */
    public interface AbstractC57040b {
        static {
            Covode.recordClassIndex(66929);
        }

        /* renamed from: a */
        void mo94178a();
    }

    static {
        Covode.recordClassIndex(66927);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.e$a */
    public static final class C57039a {
        static {
            Covode.recordClassIndex(66928);
        }

        private C57039a() {
        }

        public /* synthetic */ C57039a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.e$d */
    public static final class SurfaceHolder$CallbackC57042d implements SurfaceHolder.Callback {
        static {
            Covode.recordClassIndex(66931);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C89219l.m154721d(surfaceHolder, "");
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C89219l.m154721d(surfaceHolder, "");
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C89219l.m154721d(surfaceHolder, "");
        }

        SurfaceHolder$CallbackC57042d() {
        }
    }

    /* renamed from: a */
    public final void mo94190a() {
        RemoteImageView remoteImageView = this.f129868b;
        if (remoteImageView == null) {
            C89219l.m154710a("mCoverView");
        }
        remoteImageView.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo94191b() {
        RemoteImageView remoteImageView = this.f129868b;
        if (remoteImageView == null) {
            C89219l.m154710a("mCoverView");
        }
        remoteImageView.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo94193d() {
        this.f129871e = false;
        int i = this.f129870d.f113577a;
        if (i == 0) {
            mo94192c();
        } else if (i == 3) {
            C57022a aVar = this.f129869c;
            if (aVar == null) {
                C89219l.m154710a("mPlayVideoHelper");
            }
            aVar.mo94179a();
            this.f129870d.f113577a = 4;
        }
    }

    /* renamed from: e */
    public final void mo94194e() {
        this.f129871e = false;
        int i = this.f129870d.f113577a;
        if (i == 1 || i == 2 || i == 4) {
            C57022a aVar = this.f129869c;
            if (aVar == null) {
                C89219l.m154710a("mPlayVideoHelper");
            }
            aVar.f129837b.mo129267b();
            this.f129870d.f113577a = 3;
        }
    }

    /* renamed from: c */
    public final void mo94192c() {
        VideoViewComponent videoViewComponent = this.f129867a;
        if (videoViewComponent == null) {
            C89219l.m154710a("mVideoView");
        }
        C84294j jVar = videoViewComponent.f188405b;
        C89219l.m154716b(jVar, "");
        if (!jVar.mo129315c()) {
            this.f129871e = true;
            return;
        }
        int i = this.f129870d.f113577a;
        if (i == 0) {
            C57022a aVar = this.f129869c;
            if (aVar == null) {
                C89219l.m154710a("mPlayVideoHelper");
            }
            if (aVar.mo94180b()) {
                aVar.f129837b.mo129268b(aVar.f129838c);
                VideoViewComponent videoViewComponent2 = aVar.f129837b;
                Aweme aweme = aVar.f129836a;
                if (aweme == null) {
                    C89219l.m154715b();
                }
                videoViewComponent2.mo129263a(aweme.getVideo(), C16048b.m29633a().mo25412a(true, "decoder_type", 0));
                aVar.f129837b.mo129274h();
            }
            this.f129871e = false;
            this.f129870d.f113577a = 2;
        } else if (i == 3) {
            mo94193d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.e$f */
    public static final class C57044f extends C80709c {

        /* renamed from: a */
        final /* synthetic */ C57038e f129881a;

        /* renamed from: b */
        final /* synthetic */ boolean f129882b;

        static {
            Covode.recordClassIndex(66933);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompletedFirstTime(String str) {
            super.onPlayCompletedFirstTime(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(C84216o oVar) {
            super.onRenderFirstFrame(oVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str) {
            super.onPlayCompleted(str);
            this.f129881a.f129875i.mo94178a();
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(C84208l lVar) {
            super.onPlayFailed(lVar);
            this.f129881a.mo94190a();
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderReady(C84215n nVar) {
            super.onRenderReady(nVar);
            this.f129881a.mo94191b();
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onResumePlay(String str) {
            super.onResumePlay(str);
            this.f129881a.mo94191b();
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(float f) {
            super.onPlayProgressChange(f);
            if (this.f129882b && f >= 85.0f) {
                C57022a aVar = this.f129881a.f129869c;
                if (aVar == null) {
                    C89219l.m154710a("mPlayVideoHelper");
                }
                aVar.f129837b.mo129260a(90.0f);
                this.f129881a.f129875i.mo94178a();
                this.f129881a.mo94194e();
            }
        }

        C57044f(C57038e eVar, boolean z) {
            this.f129881a = eVar;
            this.f129882b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.e$e */
    public static final class C57043e implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ C57038e f129880a;

        static {
            Covode.recordClassIndex(66932);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57043e(C57038e eVar) {
            this.f129880a = eVar;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            if (this.f129880a.f129871e) {
                this.f129880a.f129871e = false;
                this.f129880a.mo94192c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.e$c */
    public static final class C57041c implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ C57038e f129877a;

        /* renamed from: b */
        final /* synthetic */ boolean f129878b;

        /* renamed from: c */
        final /* synthetic */ float f129879c;

        static {
            Covode.recordClassIndex(66930);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            float f;
            if (this.f129878b) {
                VideoViewComponent videoViewComponent = this.f129877a.f129867a;
                if (videoViewComponent == null) {
                    C89219l.m154710a("mVideoView");
                }
                C84294j jVar = videoViewComponent.f188405b;
                C89219l.m154716b(jVar, "");
                TextureView textureView = (TextureView) jVar.mo129311a();
                float f2 = this.f129879c;
                float f3 = ((float) i2) / ((float) i);
                int i3 = i / 2;
                float f4 = 1.0f;
                if (f3 > f2) {
                    f4 = f2 / f3;
                    f = 1.0f;
                } else {
                    f = f2 / f3;
                }
                if (textureView != null) {
                    Matrix matrix = new Matrix();
                    matrix.setScale(f4, f, (float) i3, 0.0f);
                    textureView.setTransform(matrix);
                }
            }
        }

        C57041c(C57038e eVar, boolean z, float f) {
            this.f129877a = eVar;
            this.f129878b = z;
            this.f129879c = f;
        }
    }

    public C57038e(View view, AbstractC57040b bVar, boolean z) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f129874h = view;
        this.f129875i = bVar;
        this.f129876k = new C57044f(this, z);
        VideoViewComponent videoViewComponent = new VideoViewComponent((byte) 0);
        this.f129867a = videoViewComponent;
        View view2 = this.f129874h;
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        videoViewComponent.mo129261a((ViewGroup) view2);
        VideoViewComponent videoViewComponent2 = this.f129867a;
        if (videoViewComponent2 == null) {
            C89219l.m154710a("mVideoView");
        }
        videoViewComponent2.mo129266a(new C57043e(this));
        VideoViewComponent videoViewComponent3 = this.f129867a;
        if (videoViewComponent3 == null) {
            C89219l.m154710a("mVideoView");
        }
        this.f129869c = new C57022a(videoViewComponent3, this.f129876k);
        View findViewById = this.f129874h.findViewById(R.id.afn);
        C89219l.m154716b(findViewById, "");
        this.f129868b = (RemoteImageView) findViewById;
        this.f129874h.setTag(this);
    }
}
