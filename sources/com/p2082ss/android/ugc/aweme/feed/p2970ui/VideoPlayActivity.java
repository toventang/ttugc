package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.metrics.C59221ap;
import com.p2082ss.android.ugc.aweme.metrics.C59223ar;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity */
public final class VideoPlayActivity extends ActivityC17312a implements OnUIPlayListener {

    /* renamed from: g */
    public static final C50025a f115462g = new C50025a((byte) 0);

    /* renamed from: a */
    KeepSurfaceTextureView f115463a;

    /* renamed from: b */
    Video f115464b;

    /* renamed from: c */
    String f115465c = "";

    /* renamed from: d */
    String f115466d = "";

    /* renamed from: e */
    String f115467e = "";

    /* renamed from: f */
    float f115468f;

    /* renamed from: h */
    private View f115469h;

    /* renamed from: i */
    private ImageView f115470i;

    /* renamed from: j */
    private ImageButton f115471j;

    /* renamed from: k */
    private final AbstractC89244h f115472k = C89250i.m154773a((AbstractC89171a) C50030f.f115485a);

    /* renamed from: l */
    private String f115473l = "";

    /* renamed from: m */
    private boolean f115474m = true;

    /* renamed from: n */
    private boolean f115475n;

    /* renamed from: o */
    private boolean f115476o;

    /* renamed from: p */
    private String f115477p = "";

    /* renamed from: q */
    private String f115478q = "";

    /* renamed from: r */
    private String f115479r = "";

    /* renamed from: s */
    private SparseArray f115480s;

    static {
        Covode.recordClassIndex(59149);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f115480s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f115480s == null) {
            this.f115480s = new SparseArray();
        }
        View view = (View) this.f115480s.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f115480s.put(i, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final VideoViewComponent mo85132a() {
        return (VideoViewComponent) this.f115472k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity$a */
    public static final class C50025a {
        static {
            Covode.recordClassIndex(59150);
        }

        private C50025a() {
        }

        public /* synthetic */ C50025a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity$f */
    static final class C50030f extends AbstractC89220m implements AbstractC89171a<VideoViewComponent> {

        /* renamed from: a */
        public static final C50030f f115485a = new C50030f();

        static {
            Covode.recordClassIndex(59155);
        }

        C50030f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoViewComponent invoke() {
            return new VideoViewComponent();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        if (mo85132a().mo129273g()) {
            mo85133a(false);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onResume", true);
        super.onResume();
        if (!mo85132a().mo129273g() && this.f115464b != null && !this.f115476o) {
            mo85133a(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        C59221ap o = new C59221ap().mo96764a(this.f115477p).mo96772o(this.f115478q);
        o.f134958ai = this.f115479r;
        o.mo96792f();
        mo85132a().mo129265a(this.f115463a);
        mo85132a().mo129268b(this);
        C84294j.m144981a(this.f115463a).mo129312a(new C50029e(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        mo85132a().mo80280a(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity$e */
    public static final class C50029e implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ VideoPlayActivity f115484a;

        static {
            Covode.recordClassIndex(59154);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50029e(VideoPlayActivity videoPlayActivity) {
            this.f115484a = videoPlayActivity;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            KeepSurfaceTextureView keepSurfaceTextureView;
            VideoPlayActivity videoPlayActivity = this.f115484a;
            if (videoPlayActivity.f115464b == null) {
                Video video = new Video();
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setBytevc1(false);
                ArrayList arrayList = new ArrayList();
                C89070n.m154534a((Collection) arrayList, (AbstractC89306h) C89361p.m154890a(videoPlayActivity.f115465c, new String[]{","}));
                videoUrlModel.setUrlList(arrayList);
                videoUrlModel.setSourceId(videoPlayActivity.f115467e);
                videoUrlModel.setUrlKey(videoPlayActivity.f115467e);
                if (videoUrlModel.getUrlList().size() == 1) {
                    List<String> urlList = videoUrlModel.getUrlList();
                    C89219l.m154716b(urlList, "");
                    videoUrlModel.setUri((String) C89070n.m154579f((List) urlList));
                }
                video.setPlayAddr(videoUrlModel);
                if (!C89361p.m154870a((CharSequence) videoPlayActivity.f115466d)) {
                    UrlModel urlModel = new UrlModel();
                    ArrayList arrayList2 = new ArrayList();
                    C89070n.m154534a((Collection) arrayList2, (AbstractC89306h) C89361p.m154890a(videoPlayActivity.f115466d, new String[]{","}));
                    urlModel.setUri((String) C89070n.m154583g((List) arrayList2));
                    urlModel.setUrlList(arrayList2);
                    video.setCover(urlModel);
                }
                video.setSourceId(videoPlayActivity.f115467e);
                videoPlayActivity.f115464b = video;
            }
            videoPlayActivity.mo85132a().mo129262a(videoPlayActivity.f115464b);
            if (videoPlayActivity.f115468f > 0.0f && (keepSurfaceTextureView = videoPlayActivity.f115463a) != null) {
                keepSurfaceTextureView.setAlpha(0.0f);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
        if (lVar != null) {
            Integer.valueOf(lVar.f188035d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity$b */
    static final class View$OnClickListenerC50026b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlayActivity f115481a;

        static {
            Covode.recordClassIndex(59151);
        }

        View$OnClickListenerC50026b(VideoPlayActivity videoPlayActivity) {
            this.f115481a = videoPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f115481a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity$c */
    static final class View$OnClickListenerC50027c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlayActivity f115482a;

        static {
            Covode.recordClassIndex(59152);
        }

        View$OnClickListenerC50027c(VideoPlayActivity videoPlayActivity) {
            this.f115482a = videoPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f115482a.mo85133a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity$d */
    static final class View$OnClickListenerC50028d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlayActivity f115483a;

        static {
            Covode.recordClassIndex(59153);
        }

        View$OnClickListenerC50028d(VideoPlayActivity videoPlayActivity) {
            this.f115483a = videoPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f115483a.mo85133a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
        View view = this.f115469h;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C59223ar a = new C59223ar().mo96774a(this.f115477p);
        a.f135065v = this.f115478q;
        a.mo96792f();
        if (!this.f115474m) {
            finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        View view = this.f115469h;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.f115468f > 0.0f) {
            KeepSurfaceTextureView keepSurfaceTextureView = this.f115463a;
            if (keepSurfaceTextureView != null) {
                keepSurfaceTextureView.setAlpha(1.0f);
            }
            mo85132a().mo129260a(this.f115468f);
        }
    }

    /* renamed from: a */
    public final void mo85133a(boolean z) {
        if (this.f115475n) {
            if (!mo85132a().mo129273g() && this.f115464b != null) {
                mo85132a().mo129262a(this.f115464b);
                ImageButton imageButton = this.f115471j;
                if (imageButton != null) {
                    imageButton.setVisibility(8);
                }
                this.f115475n = false;
                this.f115476o = false;
            }
        } else if (mo85132a().mo129273g()) {
            mo85132a().mo129267b();
            ImageButton imageButton2 = this.f115471j;
            if (imageButton2 != null) {
                imageButton2.setVisibility(0);
            }
            this.f115475n = true;
            if (z) {
                this.f115476o = true;
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.w_);
        this.f115463a = (KeepSurfaceTextureView) findViewById(R.id.fe8);
        this.f115469h = findViewById(R.id.cg3);
        this.f115470i = (ImageView) findViewById(R.id.a6z);
        this.f115471j = (ImageButton) findViewById(R.id.czi);
        ImageView imageView = this.f115470i;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC50026b(this));
        }
        KeepSurfaceTextureView keepSurfaceTextureView = this.f115463a;
        if (keepSurfaceTextureView != null) {
            keepSurfaceTextureView.setOnClickListener(new View$OnClickListenerC50027c(this));
        }
        ImageButton imageButton = this.f115471j;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View$OnClickListenerC50028d(this));
        }
        String a = m93918a(getIntent(), "play_addr_string");
        String str = "";
        if (a == null) {
            a = str;
        }
        this.f115465c = a;
        String a2 = m93918a(getIntent(), "cover_image_string");
        if (a2 == null) {
            a2 = str;
        }
        this.f115466d = a2;
        this.f115474m = getIntent().getBooleanExtra("loop", true);
        String a3 = m93918a(getIntent(), "video_id");
        if (a3 == null) {
            a3 = str;
        }
        this.f115467e = a3;
        String a4 = m93918a(getIntent(), "video_md5");
        if (a4 == null) {
            a4 = str;
        }
        this.f115473l = a4;
        String a5 = m93918a(getIntent(), "enter_from");
        if (a5 == null) {
            a5 = str;
        }
        this.f115477p = a5;
        String a6 = m93918a(getIntent(), "video_type");
        if (a6 == null) {
            a6 = str;
        }
        this.f115478q = a6;
        String a7 = m93918a(getIntent(), "tag_line");
        if (a7 != null) {
            str = a7;
        }
        this.f115479r = str;
        this.f115468f = getIntent().getFloatExtra("progress", 0.0f);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m93918a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
