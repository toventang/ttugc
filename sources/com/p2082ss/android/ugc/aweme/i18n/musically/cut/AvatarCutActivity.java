package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.C63425ak;
import com.p2082ss.android.ugc.aweme.profile.edit.C63517a;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63803y;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63828ae;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3787a.C69748c;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity */
public class AvatarCutActivity extends ActivityC17312a implements View.OnClickListener, View.OnTouchListener, AbstractC63860x, AbstractC63984ap {

    /* renamed from: y */
    private static final String f122706y = AvatarCutActivity.class.getCanonicalName();

    /* renamed from: A */
    private int f122707A;

    /* renamed from: B */
    private int f122708B;

    /* renamed from: C */
    private int f122709C;

    /* renamed from: D */
    private int f122710D;

    /* renamed from: E */
    private int f122711E;

    /* renamed from: F */
    private C63517a f122712F;

    /* renamed from: G */
    private FrameLayout f122713G;

    /* renamed from: H */
    private int f122714H;

    /* renamed from: I */
    private TextView f122715I;

    /* renamed from: J */
    private int f122716J;

    /* renamed from: K */
    private TextView f122717K;

    /* renamed from: L */
    private TextView f122718L;

    /* renamed from: M */
    private int f122719M;

    /* renamed from: N */
    private float f122720N;

    /* renamed from: O */
    private int f122721O;

    /* renamed from: P */
    private C63828ae f122722P;

    /* renamed from: Q */
    private ProgressDialogC66468a f122723Q;

    /* renamed from: R */
    private C63425ak f122724R;

    /* renamed from: S */
    private float f122725S;

    /* renamed from: T */
    private float f122726T;

    /* renamed from: a */
    public MediaPlayer f122727a;

    /* renamed from: b */
    public TextureView f122728b;

    /* renamed from: c */
    public RelativeLayout f122729c;

    /* renamed from: d */
    public String f122730d;

    /* renamed from: e */
    public int f122731e;

    /* renamed from: f */
    FrameLayout f122732f;

    /* renamed from: g */
    public RecyclerView f122733g;

    /* renamed from: h */
    public ImageView f122734h;

    /* renamed from: i */
    public ImageView f122735i;

    /* renamed from: j */
    public int f122736j;

    /* renamed from: k */
    public int f122737k;

    /* renamed from: l */
    public int f122738l;

    /* renamed from: m */
    protected ProgressDialogC74145d f122739m;

    /* renamed from: n */
    public View f122740n;

    /* renamed from: o */
    public View f122741o;

    /* renamed from: p */
    public Runnable f122742p;

    /* renamed from: q */
    protected String f122743q;

    /* renamed from: r */
    public boolean f122744r;

    /* renamed from: s */
    public volatile boolean f122745s;

    /* renamed from: t */
    public Thread f122746t;

    /* renamed from: u */
    public long f122747u = -1;

    /* renamed from: v */
    public int f122748v;

    /* renamed from: w */
    public Runnable f122749w = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.RunnableC534717 */

        static {
            Covode.recordClassIndex(63043);
        }

        public final void run() {
            MethodCollector.m26663i(8520);
            if (AvatarCutActivity.this.f122746t != null) {
                try {
                    AvatarCutActivity.this.f122746t.join();
                } catch (InterruptedException unused) {
                }
            }
            if (!AvatarCutActivity.this.isActive()) {
                MethodCollector.m26664o(8520);
                return;
            }
            if (AvatarCutActivity.this.f122747u > 0) {
                long currentTimeMillis = System.currentTimeMillis() - AvatarCutActivity.this.f122747u;
                C33830n.m70667a("aweme_movie_publish", "crop_time", (float) currentTimeMillis);
                if (!TextUtils.isEmpty(AvatarCutActivity.this.f122743q)) {
                    new File(AvatarCutActivity.this.f122743q);
                    if (currentTimeMillis <= 0) {
                        MethodCollector.m26664o(8520);
                        return;
                    }
                }
                AvatarCutActivity.this.f122747u = -1;
            }
            AvatarCutActivity.this.mo90041c();
            MethodCollector.m26664o(8520);
        }
    };

    /* renamed from: x */
    public int f122750x = 0;

    /* renamed from: z */
    private int f122751z;

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61023a(User user, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61024a(Exception exc, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap
    /* renamed from: a */
    public final void mo90036a(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61025a(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90038b(AvatarUri avatarUri) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90039b(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90040b(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap
    /* renamed from: e */
    public final void mo90043e() {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: h */
    private float m98668h() {
        return ((float) this.f122719M) * 2.5f;
    }

    /* renamed from: i */
    private float m98669i() {
        return ((float) this.f122719M) * 5.0f;
    }

    /* renamed from: d */
    public final void mo90042d() {
        m98667g();
        mo90032a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        this.f122717K.performClick();
    }

    static {
        Covode.recordClassIndex(63034);
    }

    /* renamed from: j */
    private void m98670j() {
        ProgressDialogC66468a aVar = this.f122723Q;
        if (aVar != null && aVar.isShowing()) {
            this.f122723Q.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo90037b() {
        MediaPlayer mediaPlayer = this.f122727a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f122727a.stop();
            }
            this.f122727a.release();
            this.f122727a = null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        MethodCollector.m26663i(8327);
        C15477a.m28479e(this);
        try {
            this.f122746t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onDestroy();
        this.f122729c.removeCallbacks(this.f122742p);
        MethodCollector.m26664o(8327);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", true);
        super.onResume();
        if (this.f122744r) {
            C29339a.m58754b(this.f122749w);
            this.f122744r = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", false);
    }

    /* renamed from: a */
    public final void mo90032a() {
        MediaPlayer mediaPlayer = this.f122727a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f122727a.pause();
            }
            Runnable runnable = this.f122742p;
            if (runnable != null) {
                this.f122729c.removeCallbacks(runnable);
            }
            this.f122742p = new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.RunnableC534642 */

                static {
                    Covode.recordClassIndex(63036);
                }

                public final void run() {
                    if (AvatarCutActivity.this.f122727a != null) {
                        if (AvatarCutActivity.this.f122727a.isPlaying()) {
                            AvatarCutActivity.this.f122727a.pause();
                        }
                        AvatarCutActivity.this.f122742p = null;
                        AvatarCutActivity.this.mo90032a();
                    }
                }
            };
            this.f122727a.seekTo(this.f122736j);
            this.f122729c.postDelayed(this.f122742p, (long) this.f122737k);
            this.f122727a.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo90044f() {
        m98670j();
        Intent intent = new Intent();
        intent.putExtra("mp4", this.f122743q);
        intent.putExtra("dir", AVExternalServiceImpl.m113114a().configService().cacheConfig().rootDir());
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        mo90037b();
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

    /* renamed from: c */
    public final void mo90041c() {
        this.f122739m.dismiss();
        ProgressDialogC66468a aVar = this.f122723Q;
        if (aVar == null) {
            ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(this, getString(R.string.h8n));
            this.f122723Q = a;
            a.setIndeterminate(false);
            this.f122723Q.mo105415a(getResources().getDrawable(R.drawable.b7n));
        } else if (!aVar.isShowing()) {
            this.f122723Q.show();
            this.f122723Q.mo105414a();
        }
        this.f122712F.mo102162a(this.f122743q);
        this.f122712F.mo102164b();
    }

    /* renamed from: g */
    private void m98667g() {
        int x;
        if (!(((int) this.f122735i.getX()) == this.f122716J && ((int) this.f122734h.getX()) == this.f122738l - this.f122731e && (x = this.f122708B) <= 6000)) {
            x = (int) ((((this.f122735i.getX() - this.f122734h.getX()) - ((float) this.f122731e)) / ((float) this.f122719M)) * 1.2f * 1000.0f);
        }
        if (x >= 2500) {
            int x2 = (int) (((((float) this.f122750x) + this.f122734h.getX()) + ((float) this.f122731e)) - ((float) this.f122738l));
            if (x2 < 0) {
                x2 = 0;
            }
            double d = (double) this.f122720N;
            Double.isNaN(d);
            double d2 = (double) x2;
            Double.isNaN(d2);
            double d3 = d * 1000.0d * d2;
            double d4 = (double) this.f122714H;
            Double.isNaN(d4);
            int i = (int) (d3 / d4);
            if (x < 3000) {
                x = 3000;
            }
            int i2 = this.f122708B;
            if (x > i2) {
                x = i2;
            }
            if (x + i > i2) {
                i = i2 - x;
            }
            this.f122737k = x;
            m98666a(x);
            this.f122736j = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap
    /* renamed from: a */
    public final void mo90035a(Exception exc) {
        m98670j();
        C51423a.m95788a("", exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap
    /* renamed from: a */
    public final void mo90034a(AvatarUri avatarUri) {
        this.f122724R.mo102038a(avatarUri.uri);
        this.f122722P.mo103294a(this.f122724R.mo102037a());
    }

    /* renamed from: a */
    private void m98666a(int i) {
        int i2;
        float f = this.f122720N;
        if (((float) i) <= f * 5.0f * 1000.0f) {
            double d = (double) i;
            Double.isNaN(d);
            i2 = (int) Math.round(d / 1000.0d);
        } else {
            i2 = (int) (f * 5.0f);
        }
        if (i2 < 3) {
            i2 = 3;
        }
        float f2 = this.f122720N;
        if (((float) i2) > f2 * 5.0f) {
            i2 = Math.round(f2 * 5.0f);
        }
        this.f122715I.setText(getResources().getString(R.string.ad_, Integer.valueOf(i2)));
    }

    public void onClick(View view) {
        final float f;
        ClickAgent.onClick(view);
        if (view.getId() == this.f122717K.getId()) {
            finish();
        } else if (view.getId() == this.f122718L.getId()) {
            C63803y.m115397a("save_profile", "click_save", UGCMonitor.TYPE_PHOTO);
            this.f122729c.removeCallbacks(this.f122742p);
            this.f122742p = null;
            try {
                if (this.f122727a.isPlaying()) {
                    this.f122727a.pause();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f122747u = System.currentTimeMillis();
            ProgressDialogC74145d a = ProgressDialogC74145d.m130371a(this, getResources().getString(R.string.fvf));
            this.f122739m = a;
            a.setIndeterminate(false);
            m98667g();
            C29339a.m58752a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.RunnableC534631 */

                static {
                    Covode.recordClassIndex(63035);
                }

                public final void run() {
                    AvatarCutActivity.this.f122743q = AVExternalServiceImpl.m113114a().configService().cacheConfig().cacheDir() + UUID.randomUUID() + ".webp";
                    AVExternalServiceImpl.m113114a().abilityService().transformService().video2webp(AvatarCutActivity.this.f122730d, AvatarCutActivity.this.f122743q, AvatarCutActivity.this.f122736j, AvatarCutActivity.this.f122737k, new C53481g(this), new C53482h(this));
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public final /* synthetic */ void mo90047a(int i) {
                    if (!AvatarCutActivity.this.isDestroyed() && AvatarCutActivity.this.f122739m != null && AvatarCutActivity.this.f122739m.isShowing()) {
                        AvatarCutActivity.this.f122739m.setProgress(i);
                    }
                }
            });
        } else if (view.getId() == R.id.dnp) {
            float f2 = 1.0f;
            if (this.f122748v % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
                f2 = (((float) this.f122751z) * 1.0f) / ((float) this.f122707A);
                f = 1.0f;
            } else {
                f = (((float) this.f122751z) * 1.0f) / ((float) this.f122707A);
            }
            final float f3 = f2 - f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.C534728 */

                static {
                    Covode.recordClassIndex(63044);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    AvatarCutActivity.this.f122728b.setRotation(((float) AvatarCutActivity.this.f122748v) + (90.0f * animatedFraction));
                    AvatarCutActivity.this.f122728b.setScaleX(f + (f3 * animatedFraction));
                    AvatarCutActivity.this.f122728b.setScaleY(f + (f3 * animatedFraction));
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.C534739 */

                static {
                    Covode.recordClassIndex(63045);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    AvatarCutActivity.this.f122748v += 90;
                    if (AvatarCutActivity.this.f122748v >= 360) {
                        AvatarCutActivity.this.f122748v = 0;
                    }
                }
            });
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        MethodCollector.m26663i(8324);
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78671e = R.attr.m;
        xVar.f78672f = R.attr.m;
        xVar.f78674h = true;
        activityConfiguration(new C53477c(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.am9);
        this.f122732f = (FrameLayout) findViewById(R.id.ec_);
        this.f122719M = C13628n.m24504a(this) / 6;
        this.f122721O = (int) C13628n.m24520b(this, 2.0f);
        this.f122730d = ((AvatarCutActivityArgs) RouteArgExtension.INSTANCE.navArg(this, C53478d.f122768a).getValue()).getFilePath();
        this.f122729c = (RelativeLayout) findViewById(R.id.u2);
        this.f122733g = (RecyclerView) findViewById(R.id.dgn);
        this.f122715I = (TextView) findViewById(R.id.f5w);
        this.f122713G = (FrameLayout) findViewById(R.id.dnp);
        TextureView textureView = (TextureView) findViewById(R.id.ec6);
        this.f122728b = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.TextureView$SurfaceTextureListenerC534653 */

            static {
                Covode.recordClassIndex(63037);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                AvatarCutActivity.this.mo90037b();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Uri parse = Uri.parse(AvatarCutActivity.this.f122730d);
                AvatarCutActivity avatarCutActivity = AvatarCutActivity.this;
                avatarCutActivity.f122727a = MediaPlayer.create(avatarCutActivity, parse);
                if (AvatarCutActivity.this.f122727a == null) {
                    new C79459a(AvatarCutActivity.this).mo123050a(R.string.dpn).mo123053a();
                    AvatarCutActivity.this.finish();
                    return;
                }
                AvatarCutActivity.this.f122727a.setAudioStreamType(3);
                AvatarCutActivity.this.f122727a.setSurface(new Surface(surfaceTexture));
                AvatarCutActivity.this.f122727a.start();
                AvatarCutActivity.this.f122727a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.TextureView$SurfaceTextureListenerC534653.C534661 */

                    static {
                        Covode.recordClassIndex(63038);
                    }

                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        AvatarCutActivity.this.mo90032a();
                    }
                });
                AvatarCutActivity.this.f122727a.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.TextureView$SurfaceTextureListenerC534653.C534672 */

                    static {
                        Covode.recordClassIndex(63039);
                    }

                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (AvatarCutActivity.this.f122727a == null) {
                            return false;
                        }
                        AvatarCutActivity.this.f122727a.release();
                        AvatarCutActivity.this.f122727a = null;
                        return false;
                    }
                });
            }
        });
        int[] videoFileInfo = AVExternalServiceImpl.m113114a().abilityService().processService().getVideoFileInfo(this.f122730d);
        if (videoFileInfo[0] == 0) {
            int i = videoFileInfo[1];
            this.f122708B = i;
            this.f122737k = i;
            this.f122751z = videoFileInfo[2];
            this.f122707A = videoFileInfo[3];
            this.f122720N = 1.2f;
            int round = Math.round(1.2f * 1000.0f);
            this.f122711E = ((i + round) - 1) / round;
            int i2 = videoFileInfo[4];
            this.f122709C = i2;
            int i3 = videoFileInfo[5];
            this.f122710D = i3;
            String str = this.f122730d;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f122733g.getLayoutParams();
            layoutParams.width = C13628n.m24504a(this);
            this.f122738l = this.f122719M >> 1;
            layoutParams.leftMargin = 0;
            int i4 = this.f122719M;
            this.f122714H = i4;
            layoutParams.height = i4;
            this.f122733g.setLayoutParams(layoutParams);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(0);
            this.f122733g.mo4405a(new RecyclerView.AbstractC1371n() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.C534695 */

                static {
                    Covode.recordClassIndex(63041);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4753a(RecyclerView recyclerView, int i) {
                    super.mo4753a(recyclerView, i);
                    if (i == 0) {
                        AvatarCutActivity.this.mo90042d();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                    super.mo4754a(recyclerView, i, i2);
                    AvatarCutActivity.this.f122750x += i;
                }
            });
            this.f122733g.setLayoutManager(wrapLinearLayoutManager);
            this.f122733g.setAdapter(new C69748c(this, this.f122714H, this.f122737k, this.f122731e, str, i2, i3, this.f122711E));
            this.f122733g.mo4405a(new RecyclerView.AbstractC1371n() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.C534706 */

                static {
                    Covode.recordClassIndex(63042);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4753a(RecyclerView recyclerView, int i) {
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                    super.mo4754a(recyclerView, i, i2);
                    AvatarCutActivity.this.f122750x += i;
                    AvatarCutActivity.this.mo90042d();
                }
            });
            C13628n.m24521b(this);
            int a = C13628n.m24504a(this);
            ViewGroup.LayoutParams layoutParams2 = this.f122732f.getLayoutParams();
            layoutParams2.height = a;
            layoutParams2.width = a;
            this.f122732f.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f122728b.getLayoutParams();
            double d = (double) a;
            Double.isNaN(d);
            double d2 = (double) this.f122707A;
            Double.isNaN(d2);
            double d3 = d * 1.0d * d2;
            double d4 = (double) this.f122751z;
            Double.isNaN(d4);
            layoutParams3.height = (int) (d3 / d4);
            this.f122728b.setLayoutParams(layoutParams3);
            TextView textView = (TextView) findViewById(R.id.pf);
            this.f122717K = textView;
            textView.setOnClickListener(this);
            TextView textView2 = (TextView) findViewById(R.id.cs9);
            this.f122718L = textView2;
            textView2.setOnClickListener(this);
            ImageView imageView = new ImageView(this);
            this.f122735i = imageView;
            imageView.setPadding(0, 0, this.f122721O, 0);
            this.f122735i.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f122729c.addView(this.f122735i);
            this.f122735i.setImageResource(2131233473);
            int b = (int) (((float) this.f122719M) + C13628n.m24520b(this, 4.0f));
            double d5 = (double) b;
            Double.isNaN(d5);
            this.f122731e = (int) ((d5 * 3.0d) / 26.0d);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.f122731e + this.f122721O, b);
            layoutParams4.topMargin = (int) C13628n.m24520b(this, 5.0f);
            layoutParams4.addRule(10);
            layoutParams4.addRule(9);
            int i5 = this.f122711E;
            if (i5 >= 5) {
                i5 = 5;
            }
            double d6 = (double) i5;
            Double.isNaN(d6);
            double d7 = (double) this.f122719M;
            Double.isNaN(d7);
            double d8 = d6 * 1.0d * d7;
            double d9 = (double) this.f122738l;
            Double.isNaN(d9);
            layoutParams4.leftMargin = (int) (d8 + d9);
            int i6 = this.f122737k;
            float f = this.f122720N;
            if (((float) i6) < f * 5.0f * 1000.0f) {
                int round2 = Math.round(((float) i6) % (f * 1000.0f));
                float f2 = this.f122720N;
                layoutParams4.leftMargin -= (int) Math.ceil((double) ((((f2 * 1000.0f) - ((float) round2)) / (f2 * 1000.0f)) * ((float) layoutParams4.height)));
            }
            this.f122716J = layoutParams4.leftMargin;
            if (SharePrefCache.inst().getLongVideoPermitted().mo59941c().booleanValue() && this.f122737k >= 6000) {
                layoutParams4.leftMargin = Math.round(((((float) this.f122719M) * 1.0f) / 1.2f) * 6.0f) + this.f122738l;
            }
            this.f122735i.setLayoutParams(layoutParams4);
            this.f122735i.setTag("right");
            ImageView imageView2 = new ImageView(this);
            this.f122734h = imageView2;
            imageView2.setPadding(this.f122721O, 0, 0, 0);
            this.f122734h.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f122729c.addView(this.f122734h);
            this.f122734h.setImageResource(2131233473);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(this.f122731e + this.f122721O, b);
            layoutParams5.addRule(10);
            layoutParams5.addRule(9);
            layoutParams5.topMargin = (int) C13628n.m24520b(this, 5.0f);
            layoutParams5.leftMargin = this.f122738l - this.f122731e;
            this.f122734h.setLayoutParams(layoutParams5);
            this.f122734h.setOnTouchListener(this);
            this.f122735i.setOnTouchListener(this);
            this.f122734h.setTag("left");
            this.f122733g.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.RunnableC534684 */

                static {
                    Covode.recordClassIndex(63040);
                }

                public final void run() {
                    MethodCollector.m26663i(8663);
                    AvatarCutActivity.this.f122740n = new View(AvatarCutActivity.this);
                    AvatarCutActivity.this.f122741o = new View(AvatarCutActivity.this);
                    AvatarCutActivity.this.f122729c.addView(AvatarCutActivity.this.f122740n);
                    AvatarCutActivity.this.f122729c.addView(AvatarCutActivity.this.f122741o);
                    AvatarCutActivity.this.f122740n.setBackgroundColor(C0643b.m2378c(AvatarCutActivity.this.f122733g.getContext(), R.color.bh));
                    AvatarCutActivity.this.f122741o.setBackgroundColor(C0643b.m2378c(AvatarCutActivity.this.f122733g.getContext(), R.color.bh));
                    AvatarCutActivity avatarCutActivity = AvatarCutActivity.this;
                    avatarCutActivity.mo90033a(avatarCutActivity.f122738l - AvatarCutActivity.this.f122731e, (int) ((AvatarCutActivity.this.f122735i.getX() - AvatarCutActivity.this.f122734h.getX()) + ((float) AvatarCutActivity.this.f122735i.getWidth())));
                    MethodCollector.m26664o(8663);
                }
            });
            C63517a aVar = new C63517a();
            this.f122712F = aVar;
            aVar.f144681c = this;
            this.f122712F.mo102161a(this, (Fragment) null);
            this.f122722P = new C63828ae();
            this.f122724R = new C63425ak();
            this.f122722P.f144692c = this;
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
            MethodCollector.m26664o(8324);
            return;
        }
        new C79459a(this).mo123050a(R.string.f205096dmt).mo123053a();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
        MethodCollector.m26664o(8324);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61026a(boolean z) {
        ProgressDialogC66468a aVar;
        if (z && (aVar = this.f122723Q) != null && aVar.isShowing()) {
            this.f122723Q.setMessage(getString(R.string.h7r));
            this.f122723Q.mo105416b();
            new Handler().postDelayed(new RunnableC53479e(this), 500);
        }
    }

    /* renamed from: a */
    public final void mo90033a(int i, int i2) {
        int i3 = this.f122721O;
        int i4 = i + i3;
        int i5 = i2 - (i3 * 2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i5, (int) C13628n.m24520b(this, 2.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = (int) C13628n.m24520b(this, 5.0f);
        this.f122740n.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i5, (int) C13628n.m24520b(this, 2.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(9);
        layoutParams2.leftMargin = i4;
        layoutParams2.topMargin = ((int) C13628n.m24520b(this, 7.0f)) + this.f122714H;
        this.f122741o.setLayoutParams(layoutParams2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
