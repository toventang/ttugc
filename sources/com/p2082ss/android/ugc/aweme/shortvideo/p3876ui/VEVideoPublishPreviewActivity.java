package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1205n;
import androidx.lifecycle.C1213t;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.p2724cz.C40902a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65409cs;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70979br;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71428c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70942f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3879b.AbstractC73486d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3879b.C73483a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3879b.C73485c;
import com.p2082ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.p2082ss.android.ugc.aweme.sticker.data.C75308c;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82027a;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88276k;
import dmt.p4542av.video.C88288n;
import dmt.p4542av.video.C88293q;
import dmt.p4542av.video.C88300w;
import dmt.p4542av.video.C88303z;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity */
public class VEVideoPublishPreviewActivity extends AbstractActivityC33414h {

    /* renamed from: A */
    private AbstractC70977bq f164717A;

    /* renamed from: e */
    public ImageView f164718e;

    /* renamed from: f */
    C88303z f164719f;

    /* renamed from: g */
    public SurfaceView f164720g;

    /* renamed from: h */
    C1205n f164721h = new C1205n(this);

    /* renamed from: i */
    C75308c f164722i;

    /* renamed from: j */
    PreviewFakeFeedView f164723j;

    /* renamed from: k */
    AbstractC73486d f164724k = C73485c.f165112a;

    /* renamed from: l */
    AbstractC73486d f164725l = C73485c.f165112a;

    /* renamed from: m */
    ImageView f164726m;

    /* renamed from: n */
    ImageView f164727n;

    /* renamed from: o */
    ImageView f164728o;

    /* renamed from: p */
    FrameLayout f164729p;

    /* renamed from: q */
    public View f164730q;

    /* renamed from: r */
    public View f164731r;

    /* renamed from: s */
    TextView f164732s;

    /* renamed from: t */
    C75309d f164733t;

    /* renamed from: u */
    private VideoPublishEditModel f164734u;

    /* renamed from: v */
    private String f164735v;

    /* renamed from: w */
    private UrlModel f164736w;

    /* renamed from: x */
    private int f164737x;

    /* renamed from: y */
    private String f164738y;

    /* renamed from: z */
    private String f164739z;

    static {
        Covode.recordClassIndex(86064);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.f164721h;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: h */
    public final void mo59496h() {
        C33398a.f79357a.mo59450a(this.f164720g, this.f164717A.mo112111c(), this.f164717A.mo112112d());
    }

    /* renamed from: k */
    public final void mo115950k() {
        this.f164723j.bringToFront();
        this.f164727n.bringToFront();
        this.f164726m.bringToFront();
        this.f164728o.bringToFront();
    }

    /* renamed from: l */
    public final void mo115951l() {
        VideoPublishEditModel videoPublishEditModel = this.f164734u;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null) {
            m129394o();
            m129395p();
            m129396q();
            m129397r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo115953n() {
        boolean z;
        if (this.f164724k != C73483a.f165110a) {
            z = true;
        } else {
            z = false;
        }
        C84425b d = mo115949d(z);
        d.mo129406a("click_preview_entrance_time", this.f164739z);
        C39162r.m79460a("click_preview_back_page_button", d.f188764a);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        super.onBackPressed();
        if (C65409cs.m117124b()) {
            mo115953n();
        }
        mo115952m();
        mo87538j();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        this.f164721h.mo4017a(AbstractC1196i.EnumC1199b.DESTROYED);
        this.f164719f.f200423w.mo56251L();
        this.f164719f.mo142796b();
        C71428c.m126152c();
        super.onDestroy();
        C84412c.m145200a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo115952m() {
        PollingStickerView pollingStickerView = (PollingStickerView) findViewById(R.id.d66);
        if (pollingStickerView != null) {
            pollingStickerView.setVisibility(8);
        }
        LiveCDEditStickerView liveCDEditStickerView = (LiveCDEditStickerView) findViewById(R.id.d64);
        if (liveCDEditStickerView != null) {
            liveCDEditStickerView.setVisibility(8);
        }
        ImageView imageView = this.f164726m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.f164727n;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.f164728o;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        PreviewFakeFeedView previewFakeFeedView = this.f164723j;
        if (previewFakeFeedView != null) {
            previewFakeFeedView.setVisibility(8);
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

    /* renamed from: o */
    private void m129394o() {
        List<InteractStickerStruct> a;
        VideoPublishEditModel videoPublishEditModel = this.f164734u;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null && (a = C71073b.m125565a(this.f164734u.getMainBusinessContext(), 11, EnumC71088d.TRACK_PAGE_EDIT)) != null && !a.isEmpty() && a.get(0) != null) {
            InteractStickerStruct interactStickerStruct = a.get(0);
            if (interactStickerStruct.getCaptionStruct() != null && !C84892d.m145850a(interactStickerStruct.getCaptionStruct().getUtterances())) {
                this.f164733t = interactStickerStruct.getCaptionStruct();
                TextView textView = (TextView) findViewById(R.id.etc);
                this.f164732s = textView;
                if (textView != null) {
                    this.f164722i = new C75308c(this.f164733t.getUtterances());
                    this.f164732s.setMaxWidth(C83090d.f185670v);
                    this.f164732s.postDelayed(new RunnableC73537bu(this), 300);
                }
            }
        }
    }

    /* renamed from: p */
    private void m129395p() {
        LiveCDEditStickerView liveCDEditStickerView;
        List<InteractStickerStruct> a = C71073b.m125565a(this.f164734u.getMainBusinessContext(), 10, EnumC71088d.TRACK_PAGE_EDIT);
        if (a != null && !a.isEmpty() && a.get(0).getCountDownStickerStruct() != null && (liveCDEditStickerView = (LiveCDEditStickerView) findViewById(R.id.d64)) != null) {
            View findViewById = findViewById(R.id.ffa);
            m129389a(findViewById);
            m129392a(liveCDEditStickerView, a.get(0).getCountDownStickerStruct());
            NormalTrackTimeStamp a2 = C71073b.m125560a(a.get(0));
            if (a2 != null) {
                m129390a(liveCDEditStickerView, findViewById, a2);
            }
        }
    }

    /* renamed from: q */
    private void m129396q() {
        PollingStickerView pollingStickerView;
        List<InteractStickerStruct> a = C71073b.m125565a(this.f164734u.getMainBusinessContext(), 1, EnumC71088d.TRACK_PAGE_EDIT);
        if (a != null && !a.isEmpty() && a.get(0).getPollStruct() != null && (pollingStickerView = (PollingStickerView) findViewById(R.id.d66)) != null) {
            View findViewById = findViewById(R.id.ffa);
            m129389a(findViewById);
            m129393a(pollingStickerView, a.get(0).getPollStruct());
            NormalTrackTimeStamp a2 = C71073b.m125560a(a.get(0));
            if (a2 != null) {
                m129390a(pollingStickerView, findViewById, a2);
            }
        }
    }

    /* renamed from: r */
    private void m129397r() {
        View findViewById;
        List<InteractStickerStruct> a = C71073b.m125565a(this.f164734u.getMainBusinessContext(), 16, EnumC71088d.TRACK_PAGE_EDIT);
        if (a != null && !a.isEmpty() && a.get(0).getDuetStickerStruct() != null && (findViewById = findViewById(R.id.d5z)) != null) {
            View findViewById2 = findViewById(R.id.ffa);
            m129389a(findViewById2);
            NormalTrackTimeStamp a2 = C71073b.m125560a(a.get(0));
            if (a2 != null) {
                m129390a(findViewById, findViewById2, a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo87538j() {
        setResult(-1);
        if (Build.VERSION.SDK_INT >= 21) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
            ofFloat.addUpdateListener(new C73536bt(this));
            ofFloat.addListener(new Animator.AnimatorListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VEVideoPublishPreviewActivity.C733341 */

                static {
                    Covode.recordClassIndex(86065);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    VEVideoPublishPreviewActivity.this.f164720g.setVisibility(4);
                }
            });
            ofFloat.setDuration(100L);
            ofFloat.start();
            this.f164718e.bringToFront();
            this.f164718e.setAlpha(1.0f);
            this.f164718e.setVisibility(0);
            finishAfterTransition();
            return;
        }
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo115948c(boolean z) {
        C39162r.m79460a("click_on_preview_page", mo115949d(z).f188764a);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    /* renamed from: a */
    private void m129389a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int height = ((FrameLayout.LayoutParams) this.f164720g.getLayoutParams()).topMargin + ((this.f164720g.getHeight() - this.f164719f.f200423w.mo56330b().height) / 2);
        if (height > 0) {
            layoutParams.height = height;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
            view.bringToFront();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: b */
    public final void mo59493b(boolean z) {
        float f;
        PreviewFakeFeedView previewFakeFeedView = this.f164723j;
        float f2 = 62.0f;
        if (previewFakeFeedView != null) {
            if (z) {
                f = 62.0f;
            } else {
                f = 1.0f;
            }
            previewFakeFeedView.setBottomMargin((int) C84912r.m145930a(this, f));
        }
        View view = this.f164731r;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (!z) {
                f2 = 0.0f;
            }
            layoutParams.bottomMargin = (int) C84912r.m145930a(this, f2);
            this.f164731r.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C84425b mo115949d(boolean z) {
        return new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("creation_id", this.f164734u.creationId).mo129406a("shoot_way", this.f164734u.mShootWay).mo129406a("content_source", C71817eu.m126790a(this.f164734u)).mo129403a("is_virtual_feed", z ? 1 : 0).mo129406a("content_type", C71817eu.m126792c(this.f164734u)).mo129406a("from_group_id", C70747dv.m124972a()).mo129406a("last_group_id", this.f164738y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Point mo115947a(PointF pointF) {
        Point point = new Point();
        point.set((int) (((float) this.f164720g.getWidth()) * pointF.x), (int) (((float) this.f164720g.getHeight()) * pointF.y));
        return point;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59491a(boolean z) {
        int a = (int) C84912r.m145930a(this, 13.0f);
        int a2 = (int) C84912r.m145930a(this, 3.0f);
        ImageView imageView = this.f164727n;
        if (imageView != null) {
            m129391a((View) imageView, true, a2);
        }
        ImageView imageView2 = this.f164726m;
        if (imageView2 != null) {
            m129391a((View) imageView2, true, a2);
        }
        ImageView imageView3 = this.f164728o;
        if (imageView3 != null) {
            m129391a((View) imageView3, true, a2);
        }
        PreviewFakeFeedView previewFakeFeedView = this.f164723j;
        if (!(previewFakeFeedView == null || previewFakeFeedView.getPreviewTitle() == null)) {
            m129391a((View) this.f164723j, true, a);
        }
        View view = this.f164730q;
        if (view != null) {
            m129391a(view, false, 0);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.cc);
        C84412c.m145202a(this, getIntent(), bundle);
        C63238c.m114590a(C71815es.m126788a());
        this.f164729p = (FrameLayout) findViewById(R.id.c73);
        if (C65409cs.m117124b()) {
            this.f164731r = findViewById(R.id.d67);
            this.f164730q = findViewById(R.id.d68);
            this.f164728o = (ImageView) findViewById(R.id.d65);
            ImageView imageView = (ImageView) findViewById(R.id.d5w);
            this.f164726m = imageView;
            imageView.setVisibility(0);
            this.f164726m.setOnClickListener(new View$OnClickListenerC73533bq(this));
            ImageView imageView2 = (ImageView) findViewById(R.id.d5s);
            this.f164727n = imageView2;
            imageView2.setVisibility(0);
            this.f164727n.setOnClickListener(new View$OnClickListenerC73534br(this));
            if (C65409cs.m117124b()) {
                PreviewFakeFeedView previewFakeFeedView = (PreviewFakeFeedView) findViewById(R.id.d60);
                this.f164723j = previewFakeFeedView;
                previewFakeFeedView.setVisibility(0);
            }
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.fdc);
        this.f164718e = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = VideoCoverBitmapHolder.f164604a;
        if (bitmap != null) {
            this.f164718e.setImageBitmap(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float b = (float) C70636dh.m124831b(this);
            float f = (float) height;
            float f2 = (float) width;
            float f3 = ((f * 1.0f) / f2) * b;
            float a = (float) C70636dh.m124828a(this);
            if (f3 > a) {
                b = a * ((f2 * 1.0f) / f);
                f3 = a;
            }
            ViewGroup.LayoutParams layoutParams = this.f164718e.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) b;
                layoutParams.height = (int) f3;
                this.f164718e.setLayoutParams(layoutParams);
            }
        }
        C0792v.m2752a(this.f164718e, "transition_view_v1");
        C0792v.m2752a(findViewById(R.id.e4l), "transition_view_v2");
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.d69);
        this.f164720g = surfaceView;
        surfaceView.setVisibility(4);
        this.f164729p.setOnClickListener(new View$OnClickListenerC73535bs(this));
        this.f164738y = m129388a(getIntent(), "extra_publish_preview_last_group_id");
        this.f164737x = getIntent().getIntExtra("extra_publish_preview_permission", -1);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) getIntent().getSerializableExtra("args");
        this.f164734u = videoPublishEditModel;
        AbstractC70977bq a2 = C70979br.m125332a(videoPublishEditModel);
        this.f164717A = a2;
        a2.mo112108a(this.f164734u.getCoverPublishModel().getNeedExpandCompiledSize(), false);
        this.f164735v = m129388a(getIntent(), "extra_publish_preview_anchor_text");
        this.f164736w = (UrlModel) getIntent().getSerializableExtra("extra_publish_preview_anchor_icon_url");
        this.f164719f = new C88303z(this.f164734u.videoEditorType);
        VEPreviewParams b2 = C71413b.m126124b(this.f164734u);
        b2.mCanvasWidth = this.f164717A.mo112111c();
        b2.mCanvasHeight = this.f164717A.mo112112d();
        C1213t tVar = new C1213t();
        tVar.setValue(b2);
        C1213t tVar2 = new C1213t();
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f200089i = this.f164734u.isFastImport;
        vEPreviewMusicParams.f200088h = 2;
        vEPreviewMusicParams.f200081a = this.f164734u.mMusicPath;
        vEPreviewMusicParams.f200082b = this.f164734u.mMusicStart;
        String str = this.f164734u.mMusicPath;
        C89219l.m154721d(this.f164734u, "");
        vEPreviewMusicParams.f200083c = C80418fa.m139406a(str);
        if (C70005cr.m123611a().f156482a == null || Math.abs(vEPreviewMusicParams.f200083c - C70005cr.m123611a().f156482a.getShootDuration()) < 1000) {
            vEPreviewMusicParams.f200084d = vEPreviewMusicParams.f200083c;
        } else {
            vEPreviewMusicParams.f200084d = C70005cr.m123611a().f156482a.getShootDuration();
        }
        vEPreviewMusicParams.f200085e = this.f164734u.musicVolume;
        vEPreviewMusicParams.f200086f = this.f164734u.musicId;
        vEPreviewMusicParams.f200087g = this.f164734u.previewStartTime;
        if (this.f164734u.getStitchParams() != null) {
            long duration = this.f164734u.getStitchParams().getDuration();
            vEPreviewMusicParams.f200090j = 0;
            vEPreviewMusicParams.f200091k = (int) duration;
        }
        vEPreviewMusicParams.f200094n = this.f164734u.recordBgmDelay;
        if (this.f164734u.loudnessBalanceParam != null) {
            vEPreviewMusicParams.f200095o = this.f164734u.loudnessBalanceParam.getBgmLoudness();
            vEPreviewMusicParams.f200096p = this.f164734u.loudnessBalanceParam.getPeakLoudness();
            vEPreviewMusicParams.f200097q = this.f164734u.loudnessBalanceParam.getAvgLoudness();
        }
        vEPreviewMusicParams.f200092l = this.f164734u.isSoundLoop.booleanValue();
        vEPreviewMusicParams.f200093m = C80285bz.m139187a(this.f164734u);
        tVar2.setValue(vEPreviewMusicParams);
        C88271g gVar = new C88271g();
        C1213t<InfoStickerModel> tVar3 = new C1213t<>();
        tVar3.setValue(this.f164734u.infoStickerModel);
        C88276k<C88300w> kVar = new C88276k<>();
        C88300w a3 = C46344a.m89393a(this.f164719f.f200397H.mo142744d(), this.f164734u);
        if (a3 != null) {
            kVar.setValue(a3);
        }
        C1213t<C82027a> tVar4 = new C1213t<>();
        tVar4.setValue(new C82027a(this.f164734u.isFastImport, this.f164734u.isAudioEnhance));
        this.f164719f.f200405e = tVar;
        this.f164719f.f200406f = tVar2;
        this.f164719f.f200409i = gVar;
        this.f164719f.f200407g = new C1213t();
        this.f164719f.f200408h = new C1213t();
        this.f164719f.mo142794a(new ArrayList<>());
        this.f164719f.f200410j = kVar;
        C88276k<C88288n> kVar2 = new C88276k<>();
        this.f164719f.f200411k = kVar2;
        this.f164719f.f200413m = new C1213t();
        this.f164719f.f200414n = new C1213t();
        this.f164719f.f200415o = new C1213t();
        this.f164719f.mo142793a(new C1213t<>());
        this.f164719f.f200416p = tVar3;
        C1213t<AudioRecorderParam> tVar5 = new C1213t<>();
        this.f164719f.f200412l = tVar5;
        C1213t tVar6 = new C1213t();
        tVar6.setValue(new C70936b(this.f164734u.autoEnhanceOn, this.f164734u.autoEnhanceType, C70942f.m125238a(), C70942f.m125239b()));
        this.f164719f.f200419s = tVar6;
        this.f164719f.f200421u = tVar4;
        this.f164721h.mo4017a(AbstractC1196i.EnumC1199b.STARTED);
        this.f164719f.mo142792a(this, this, this.f164720g, this.f164734u);
        if (this.f164734u.mTimeEffect != null && this.f164734u.mTimeEffect.getKey().equals("1")) {
            if (this.f164734u.isFastImport || this.f164734u.isCutSameVideoType()) {
                this.f164719f.f200423w.mo56296a(this.f164734u.getPreviewInfo().getReverseVideoArray(), this.f164734u.getPreviewInfo().getReverseAudioArray());
                this.f164719f.f200423w.mo56312a(this.f164734u.getPreviewInfo().getTempVideoArray());
            } else {
                this.f164719f.f200423w.mo56329b(this.f164734u.getPreviewInfo().getReverseVideoArray());
            }
            this.f164719f.f200423w.mo56338c(true);
            if (this.f164734u.isFastImport || this.f164734u.isCutSameVideoType()) {
                this.f164719f.f200423w.mo56313a(this.f164719f.f200423w.mo56300a().f191689j, this.f164719f.f200423w.mo56300a().f191690k, b2.mVolume);
            }
        }
        if (this.f164734u.mEffectList != null) {
            C88293q.m153433a(this.f164734u.mEffectList, gVar);
        }
        if (this.f164734u.veAudioRecorderParam != null) {
            tVar5.setValue(this.f164734u.veAudioRecorderParam);
        }
        if (this.f164734u.veAudioEffectParam != null) {
            this.f164734u.veAudioEffectParam.setShowErrorToast(false);
            this.f164734u.veAudioEffectParam.setPreprocessResult(null);
            kVar2.setValue(C88288n.C88289a.m153424a(this.f164734u.veAudioEffectParam));
        }
        FilterBean a4 = C71817eu.m126789a(this.f164734u, C63238c.f143565C.mo73290r().mo86006d());
        float f4 = this.f164734u.mSelectedFilterIntensity;
        if (f4 == -1.0f) {
            f4 = 0.8f;
        }
        this.f164719f.f200423w.mo56337c(C50648c.m94911b(a4), f4);
        if (C65409cs.m117124b()) {
            this.f164723j.mo115849a(this.f164734u, this.f164735v, this.f164736w, this.f164737x);
        }
        if (!(this.f164734u.mSelectedFilterResId == null || C50691c.m94987a(C63244g.m114602a().mo73290r().mo86006d().mo86071f(), this.f164734u.mSelectedFilterResId) == null)) {
            this.f164719f.f200397H.mo142725a(a4);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            getWindow().setSharedElementEnterTransition(autoTransition);
            getWindow().setSharedElementExitTransition(autoTransition);
            autoTransition.addListener((Transition.TransitionListener) new C40902a() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VEVideoPublishPreviewActivity.C733352 */

                static {
                    Covode.recordClassIndex(86066);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40902a
                public final void onTransitionStart(Transition transition) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new C73540bx(this));
                    ofFloat.addListener(new Animator.AnimatorListener() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VEVideoPublishPreviewActivity.C733352.C733361 */

                        static {
                            Covode.recordClassIndex(86067);
                        }

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40902a
                public final void onTransitionEnd(Transition transition) {
                    VEVideoPublishPreviewActivity.this.f164720g.bringToFront();
                    VEVideoPublishPreviewActivity.this.f164720g.setVisibility(0);
                    if (C65409cs.m117124b()) {
                        VEVideoPublishPreviewActivity.this.f164731r.bringToFront();
                        VEVideoPublishPreviewActivity.this.f164730q.bringToFront();
                        VEVideoPublishPreviewActivity.this.f164730q.setVisibility(0);
                        VEVideoPublishPreviewActivity.this.f164731r.setVisibility(0);
                    }
                    VEVideoPublishPreviewActivity.this.f164718e.setAlpha(0.0f);
                    VEVideoPublishPreviewActivity.this.f164718e.setVisibility(8);
                    VEVideoPublishPreviewActivity.this.mo115951l();
                    if (C65409cs.m117124b()) {
                        VEVideoPublishPreviewActivity.this.mo115950k();
                    }
                }
            });
            getWindow().setReturnTransition(new AutoTransition());
        } else {
            this.f164720g.setVisibility(0);
            this.f164720g.bringToFront();
            if (C65409cs.m117124b()) {
                this.f164731r.bringToFront();
                this.f164731r.setVisibility(0);
                this.f164730q.bringToFront();
                this.f164730q.setVisibility(0);
            }
            this.f164718e.setVisibility(4);
            this.f164718e.setAlpha(0);
            mo115951l();
            if (C65409cs.m117124b()) {
                mo115950k();
            }
        }
        this.f164739z = String.valueOf(System.currentTimeMillis() / 1000);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m129388a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m129392a(LiveCDEditStickerView liveCDEditStickerView, CountDownStickerStruct countDownStickerStruct) {
        liveCDEditStickerView.mo112563a(countDownStickerStruct);
        liveCDEditStickerView.setTouchEnable(true);
        liveCDEditStickerView.setEditEnable(false);
    }

    /* renamed from: a */
    private static void m129393a(PollingStickerView pollingStickerView, PollStruct pollStruct) {
        pollingStickerView.mo112626a(pollStruct);
        pollingStickerView.setTouchEnable(true);
        pollingStickerView.mo112624a();
        pollingStickerView.setEditEnable(false);
    }

    /* renamed from: a */
    private void m129390a(View view, View view2, NormalTrackTimeStamp normalTrackTimeStamp) {
        view.post(new RunnableC73538bv(this, normalTrackTimeStamp, view, view2));
    }

    /* renamed from: a */
    private void m129391a(View view, boolean z, int i) {
        int c = C70636dh.m124833c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            i += c;
        }
        layoutParams.topMargin = i;
        view.setLayoutParams(layoutParams);
    }
}
