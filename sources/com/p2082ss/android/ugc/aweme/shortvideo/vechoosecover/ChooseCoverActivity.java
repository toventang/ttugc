package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1205n;
import androidx.lifecycle.C1213t;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.gyf.barlibrary.ImmersionBar;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.app.p2321b.C33716a;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71428c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70942f;
import com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.C74115m;
import com.p2082ss.android.ugc.aweme.sticker.data.C75308c;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.text.C75894b;
import com.p2082ss.android.ugc.aweme.sticker.text.C75896c;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82027a;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88257f;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88276k;
import dmt.p4542av.video.C88288n;
import dmt.p4542av.video.C88293q;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88300w;
import dmt.p4542av.video.C88303z;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.VEPreviewParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity */
public class ChooseCoverActivity extends ActivityC33402b implements C69980b.AbstractC69983a, VEEditorAutoStartStopArbiter.AbstractC88148a {

    /* renamed from: d */
    public VideoPublishEditModel f166349d;

    /* renamed from: e */
    public C88303z f166350e;

    /* renamed from: f */
    public C69980b f166351f;

    /* renamed from: g */
    public SurfaceView f166352g;

    /* renamed from: h */
    public ImageView f166353h;

    /* renamed from: i */
    C75308c f166354i;

    /* renamed from: j */
    private final C1205n f166355j = new C1205n(this);

    /* renamed from: k */
    private final C1213t<Bitmap> f166356k = new C1213t<>();

    /* renamed from: l */
    private final C1213t<Boolean> f166357l = new C1213t<>();

    /* renamed from: m */
    private final C1213t<C88296t> f166358m = new C1213t<>();

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b.AbstractC69983a
    /* renamed from: b */
    public final C1213t<C88296t> mo110437b() {
        return this.f166358m;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b.AbstractC69983a
    /* renamed from: c */
    public final VideoPublishEditModel mo110438c() {
        return this.f166349d;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.f166355j;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b.AbstractC69983a
    /* renamed from: a */
    public final AbstractC31071f mo110436a() {
        return this.f166350e.f200423w;
    }

    static {
        Covode.recordClassIndex(86846);
        C75894b.m133079a();
        C75896c.m133081a();
        C75896c.m133084b();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.w, R.anim.x);
    }

    @Override // dmt.p4542av.video.VEEditorAutoStartStopArbiter.AbstractC88148a
    /* renamed from: g */
    public final void mo88412g() {
        runOnUiThread(new RunnableC74109g(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        C69980b bVar = this.f166351f;
        if (bVar != null) {
            bVar.mo110431a(new C74110h(this));
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        this.f166355j.mo4018b(AbstractC1196i.EnumC1199b.DESTROYED);
        this.f166350e.f200423w.mo56395z();
        this.f166350e.mo142796b();
        C71428c.m126152c();
        super.onDestroy();
        C84412c.m145200a(this);
        if (C74115m.f166417a != null) {
            C40964c cVar = C40964c.C40968c.f95804a;
            C40964c.AbstractC40966a aVar = C74115m.f166417a;
            if (aVar == null) {
                C89219l.m154710a("appLifecycleCallback");
            }
            cVar.mo70146b(aVar);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$a */
    class C74095a extends AbstractC0952i.AbstractC0954b {
        static {
            Covode.recordClassIndex(86848);
        }

        C74095a() {
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentDetached(AbstractC0952i iVar, Fragment fragment) {
            super.onFragmentDetached(iVar, fragment);
            if (fragment instanceof C69980b) {
                Intent intent = new Intent();
                intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", (Serializable) ChooseCoverActivity.this.f166349d);
                ChooseCoverActivity.this.setResult(-1, intent);
                ChooseCoverActivity.this.finish();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo116481a(int i, int i2, int i3) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ChooseCoverActivity.this.f166353h.getLayoutParams();
            layoutParams.topMargin = i;
            layoutParams.width = i2;
            layoutParams.height = i3;
            ChooseCoverActivity.this.f166353h.setLayoutParams(layoutParams);
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentActivityCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
            super.onFragmentActivityCreated(iVar, fragment, bundle);
            if (fragment instanceof C69980b) {
                C69980b bVar = (C69980b) fragment;
                if (ChooseCoverActivity.this.f166350e.f200422v != null) {
                    ChooseCoverActivity.this.f166350e.f200422v.mo142667a(true, false);
                }
                View view = bVar.getView();
                if (view != null) {
                    view.postDelayed(new RunnableC74112j(this, bVar), 300);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo116476a(Boolean bool) {
        if (!bool.booleanValue()) {
            super.onBackPressed();
        }
        return bool;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        int videoWidth;
        int videoHeight;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        getWindow().setSoftInputMode(34);
        setContentView(R.layout.cb);
        C84412c.m145202a(this, getIntent(), bundle);
        if (!C33716a.m69034a(this)) {
            C71827ew.m126823a((Activity) this);
        }
        C63238c.m114590a(C71815es.m126788a());
        this.f166353h = (ImageView) findViewById(R.id.fdc);
        this.f166352g = (SurfaceView) findViewById(R.id.d69);
        this.f166349d = (VideoPublishEditModel) getIntent().getSerializableExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL");
        C88303z zVar = new C88303z(this.f166349d.videoEditorType);
        this.f166350e = zVar;
        zVar.mo142791a(2);
        if (this.f166349d.notUseCanvasSize()) {
            int[] c = C88257f.m153370c(this.f166349d);
            videoWidth = c[0];
            videoHeight = c[1];
        } else if (this.f166349d.mVideoCanvasWidth <= 0 || this.f166349d.mVideoCanvasHeight <= 0) {
            videoWidth = this.f166349d.videoWidth();
            videoHeight = this.f166349d.videoHeight();
            if (videoHeight == 0 || videoWidth == 0) {
                if (this.f166349d.getOriginal() == 0) {
                    iVideoConfigService = C63238c.f143589p;
                } else {
                    iVideoConfigService = C63238c.f143588o;
                }
                videoWidth = iVideoConfigService.getVideoWidth();
                if (this.f166349d.getOriginal() == 0) {
                    iVideoConfigService2 = C63238c.f143589p;
                } else {
                    iVideoConfigService2 = C63238c.f143588o;
                }
                videoHeight = iVideoConfigService2.getVideoHeight();
            }
        } else {
            videoWidth = this.f166349d.mVideoCanvasWidth;
            videoHeight = this.f166349d.mVideoCanvasHeight;
        }
        VEPreviewParams b = C71413b.m126124b(this.f166349d);
        if (this.f166349d.notUseCanvasSize()) {
            int[] c2 = C88257f.m153370c(this.f166349d);
            b.mCanvasWidth = c2[0];
            b.mCanvasHeight = c2[1];
        } else {
            b.mCanvasWidth = this.f166349d.mVideoCanvasWidth;
            b.mCanvasHeight = this.f166349d.mVideoCanvasHeight;
        }
        C1213t tVar = new C1213t();
        tVar.setValue(b);
        C1213t tVar2 = new C1213t();
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f200089i = this.f166349d.isFastImport;
        vEPreviewMusicParams.f200081a = this.f166349d.mMusicPath;
        vEPreviewMusicParams.f200082b = this.f166349d.mMusicStart;
        String str = this.f166349d.mMusicPath;
        C89219l.m154721d(this.f166349d, "");
        vEPreviewMusicParams.f200083c = C80418fa.m139406a(str);
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar == null || cVar.getShootDuration() <= 0 || Math.abs(vEPreviewMusicParams.f200083c - cVar.getShootDuration()) < 1000) {
            vEPreviewMusicParams.f200084d = vEPreviewMusicParams.f200083c;
        } else {
            vEPreviewMusicParams.f200084d = cVar.getShootDuration();
        }
        vEPreviewMusicParams.f200085e = this.f166349d.musicVolume;
        vEPreviewMusicParams.f200086f = this.f166349d.musicId;
        vEPreviewMusicParams.f200087g = this.f166349d.previewStartTime;
        if (this.f166349d.getStitchParams() != null) {
            long duration = this.f166349d.getStitchParams().getDuration();
            vEPreviewMusicParams.f200090j = 0;
            vEPreviewMusicParams.f200091k = (int) duration;
        }
        vEPreviewMusicParams.f200094n = this.f166349d.recordBgmDelay;
        if (this.f166349d.loudnessBalanceParam != null) {
            vEPreviewMusicParams.f200095o = this.f166349d.loudnessBalanceParam.getBgmLoudness();
            vEPreviewMusicParams.f200097q = this.f166349d.loudnessBalanceParam.getAvgLoudness();
            vEPreviewMusicParams.f200096p = this.f166349d.loudnessBalanceParam.getPeakLoudness();
        }
        tVar2.setValue(vEPreviewMusicParams);
        C88271g gVar = new C88271g();
        C1213t<InfoStickerModel> tVar3 = new C1213t<>();
        tVar3.setValue(this.f166349d.infoStickerModel);
        C88276k<C88300w> kVar = new C88276k<>();
        C88300w a = C46344a.m89393a(this.f166350e.f200397H.mo142744d(), this.f166349d);
        if (a != null) {
            kVar.setValue(a);
        }
        C1213t tVar4 = new C1213t();
        tVar4.setValue(new C70936b(this.f166349d.autoEnhanceOn, this.f166349d.autoEnhanceType, C70942f.m125238a(), C70942f.m125239b()));
        C1213t<C82027a> tVar5 = new C1213t<>();
        tVar5.setValue(new C82027a(this.f166349d.isFastImport, this.f166349d.isAudioEnhance));
        this.f166350e.f200405e = tVar;
        this.f166350e.f200406f = tVar2;
        this.f166350e.f200409i = gVar;
        this.f166350e.f200407g = new C1213t();
        this.f166350e.f200408h = this.f166358m;
        this.f166350e.mo142794a(new ArrayList<>());
        this.f166350e.f200410j = kVar;
        C88276k<C88288n> kVar2 = new C88276k<>();
        C1213t<AudioRecorderParam> tVar6 = new C1213t<>();
        this.f166350e.f200412l = tVar6;
        this.f166350e.f200411k = kVar2;
        this.f166350e.f200413m = new C1213t();
        this.f166350e.f200414n = new C1213t();
        this.f166350e.f200415o = new C1213t();
        this.f166350e.mo142793a(new C1213t<>());
        this.f166350e.f200416p = tVar3;
        this.f166350e.f200419s = tVar4;
        this.f166350e.f200421u = tVar5;
        this.f166355j.mo4018b(AbstractC1196i.EnumC1199b.STARTED);
        this.f166350e.mo142792a(this, this, this.f166352g, this.f166349d);
        if (this.f166349d.mTimeEffect != null && this.f166349d.mTimeEffect.getKey().equals("1")) {
            if (this.f166349d.isFastImport || this.f166349d.isCutSameVideoType()) {
                this.f166350e.f200423w.mo56296a(this.f166349d.getPreviewInfo().getReverseVideoArray(), this.f166349d.getPreviewInfo().getReverseAudioArray());
                this.f166350e.f200423w.mo56312a(this.f166349d.getPreviewInfo().getTempVideoArray());
            } else {
                this.f166350e.f200423w.mo56329b(this.f166349d.getPreviewInfo().getReverseVideoArray());
            }
            this.f166350e.f200423w.mo56338c(true);
            if (this.f166349d.isFastImport || this.f166349d.isCutSameVideoType()) {
                this.f166350e.f200423w.mo56313a(this.f166350e.f200423w.mo56300a().f191689j, this.f166350e.f200423w.mo56300a().f191690k, b.mVolume);
            }
        }
        if (this.f166349d.mEffectList != null) {
            C88293q.m153433a(this.f166349d.mEffectList, gVar);
        }
        if (this.f166349d.veAudioRecorderParam != null) {
            tVar6.setValue(this.f166349d.veAudioRecorderParam);
        }
        if (this.f166349d.veAudioEffectParam != null) {
            this.f166349d.veAudioEffectParam.setShowErrorToast(false);
            this.f166349d.veAudioEffectParam.setPreprocessResult(null);
            kVar2.setValue(C88288n.C88289a.m153424a(this.f166349d.veAudioEffectParam));
        }
        AbstractC50707o d = C63238c.f143565C.mo73290r().mo86006d();
        FilterBean a2 = C71817eu.m126789a(this.f166349d, d);
        float f = this.f166349d.mSelectedFilterIntensity;
        if (f == -1.0f) {
            f = 0.8f;
        }
        this.f166350e.f200423w.mo56337c(C50648c.m94911b(a2), f);
        if (!(this.f166349d.mSelectedFilterResId == null || C50691c.m94987a(d.mo86071f(), this.f166349d.mSelectedFilterResId) == null || this.f166349d.mSelectedFilterIntensity == -1.0f)) {
            this.f166350e.f200397H.mo142725a(a2);
        }
        C70635dg.m124826a(this.f166352g, videoWidth, videoHeight);
        final View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity.ViewTreeObserver$OnPreDrawListenerC740941 */

            static {
                Covode.recordClassIndex(86847);
            }

            public final boolean onPreDraw() {
                decorView.getViewTreeObserver().removeOnPreDrawListener(this);
                ImmersionBar.with(ChooseCoverActivity.this).fitsSystemWindows(true).statusBarColor(R.color.e).statusBarDarkFont(true).init();
                return true;
            }
        });
        if (bundle != null && (getSupportFragmentManager().mo3551a("cover") instanceof C69980b)) {
            this.f166351f = (C69980b) getSupportFragmentManager().mo3551a("cover");
        } else {
            this.f166351f = new C69980b();
            getSupportFragmentManager().mo3552a().mo3454a(R.id.c73, this.f166351f, "cover").mo3473c();
        }
        this.f166357l.observe(this, new C74105c(this));
        this.f166356k.observe(this, new C74106d(this));
        this.f166351f.f156422t = this.f166357l;
        this.f166351f.f156421s = this.f166356k;
        getSupportFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) new C74095a(), false);
        C74104b bVar = new C74104b(this);
        C89219l.m154721d(bVar, "");
        C40964c.C40968c.f95804a.mo70143a(new C74115m.C74116a(bVar));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", false);
    }

    /* renamed from: a */
    private void m130300a(View view, int i) {
        view.setBackgroundColor(-1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int top = this.f166352g.getTop() + i;
        if (top > 0) {
            layoutParams.height = top;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo116477a(int i, int i2, int i3, int i4) {
        View findViewById;
        PollingStickerView pollingStickerView;
        LiveCDEditStickerView liveCDEditStickerView;
        List<InteractStickerStruct> a;
        TextView textView;
        float b;
        float f;
        float f2;
        int i5;
        VideoPublishEditModel videoPublishEditModel = this.f166349d;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f166349d;
            if (!(videoPublishEditModel2 == null || videoPublishEditModel2.getMainBusinessContext() == null || (a = C71073b.m125565a(this.f166349d.getMainBusinessContext(), 11, EnumC71088d.TRACK_PAGE_EDIT)) == null || a.isEmpty() || a.get(0).getCaptionStruct() == null || (textView = (TextView) findViewById(R.id.etc)) == null)) {
                C75309d captionStruct = a.get(0).getCaptionStruct();
                if (captionStruct.getVideoWidth() == null || captionStruct.getVideoWidth().intValue() == 0) {
                    b = (((float) i3) * 1.0f) / ((float) C70636dh.m124831b(this));
                    f = ((float) C83090d.f185668t) * b;
                    f2 = ((float) C83090d.f185667s) * b;
                    i5 = C83090d.f185666r;
                } else {
                    b = (((float) i3) * 1.0f) / ((float) captionStruct.getVideoWidth().intValue());
                    f = ((float) captionStruct.getMarginStart().intValue()) * b;
                    f2 = ((float) captionStruct.getMarginTop().intValue()) * b;
                    i5 = captionStruct.getMarginBottom().intValue();
                }
                this.f166354i = new C75308c(captionStruct.getUtterances());
                textView.post(new RunnableC74108f(this, textView, i, f, captionStruct, i2, f2, i4, ((float) i5) * b, b));
            }
            List<InteractStickerStruct> a2 = C71073b.m125565a(this.f166349d.getMainBusinessContext(), 10, EnumC71088d.TRACK_PAGE_EDIT);
            if (!(a2 == null || a2.isEmpty() || a2.get(0).getCountDownStickerStruct() == null || (liveCDEditStickerView = (LiveCDEditStickerView) findViewById(R.id.d64)) == null)) {
                m130300a(findViewById(R.id.ffa), i2);
                liveCDEditStickerView.mo112563a(a2.get(0).getCountDownStickerStruct());
                liveCDEditStickerView.setTouchEnable(true);
                liveCDEditStickerView.setEditEnable(false);
                NormalTrackTimeStamp a3 = C71073b.m125560a(a2.get(0));
                if (a3 != null) {
                    m130301a(liveCDEditStickerView, i, i2, i3, i4, a3);
                }
            }
            List<InteractStickerStruct> a4 = C71073b.m125565a(this.f166349d.getMainBusinessContext(), 1, EnumC71088d.TRACK_PAGE_EDIT);
            if (!(a4 == null || a4.isEmpty() || a4.get(0).getPollStruct() == null || (pollingStickerView = (PollingStickerView) findViewById(R.id.d66)) == null)) {
                m130300a(findViewById(R.id.ffa), i2);
                pollingStickerView.mo112626a(a4.get(0).getPollStruct());
                pollingStickerView.setTouchEnable(true);
                pollingStickerView.mo112624a();
                pollingStickerView.setEditEnable(false);
                NormalTrackTimeStamp a5 = C71073b.m125560a(a4.get(0));
                if (a5 != null) {
                    m130301a(pollingStickerView, i, i2, i3, i4, a5);
                }
            }
            List<InteractStickerStruct> a6 = C71073b.m125565a(this.f166349d.getMainBusinessContext(), 16, EnumC71088d.TRACK_PAGE_EDIT);
            if (a6 != null && !a6.isEmpty() && a6.get(0).getDuetStickerStruct() != null && (findViewById = findViewById(R.id.d5z)) != null) {
                m130300a(findViewById(R.id.ffa), i2);
                NormalTrackTimeStamp a7 = C71073b.m125560a(a6.get(0));
                if (a7 != null) {
                    m130301a(findViewById, i, i2, i3, i4, a7);
                }
            }
        }
    }

    /* renamed from: a */
    private void m130301a(View view, int i, int i2, int i3, int i4, NormalTrackTimeStamp normalTrackTimeStamp) {
        int i5 = this.f166350e.f200423w.mo56330b().width;
        int i6 = this.f166350e.f200423w.mo56330b().height;
        view.post(new RunnableC74107e(this, normalTrackTimeStamp, i5, Math.min(((float) i3) / ((float) i5), ((float) i4) / ((float) i6)), i6, view, i, i2, i4));
    }
}
