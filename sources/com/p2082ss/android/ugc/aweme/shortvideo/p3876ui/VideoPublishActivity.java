package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.common.C39099e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.AbstractC65488n;
import com.p2082ss.android.ugc.aweme.property.C65360bc;
import com.p2082ss.android.ugc.aweme.property.C65476i;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69743b;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71514q;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71416e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71824e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71894a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71905k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.viewmodel.VideoPublishViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73942ae;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73974az;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct;
import com.p2082ss.android.ugc.aweme.tools.draft.C78179az;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80461fw;
import com.p2082ss.android.ugc.aweme.utils.C80571if;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.C83891d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84409a;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.runtime.C85555d;
import com.p2082ss.ugc.aweme.performance.p4431a.C86654a;
import dmt.p4542av.video.C88168aj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity */
public class VideoPublishActivity extends ActivityC33402b implements SelectSaveLocalOptionActivity.AbstractC73323b, AbstractC73757k {

    /* renamed from: d */
    public C73560cj f164774d;

    /* renamed from: e */
    public VideoPublishEditModel f164775e;

    /* renamed from: f */
    public long f164776f;

    /* renamed from: g */
    private TextView f164777g;

    /* renamed from: h */
    private TextView f164778h;

    /* renamed from: i */
    private boolean f164779i;

    /* renamed from: j */
    private int f164780j;

    /* renamed from: k */
    private boolean f164781k;

    /* renamed from: l */
    private boolean f164782l;

    /* renamed from: m */
    private boolean f164783m;

    /* renamed from: n */
    private boolean f164784n;

    static {
        Covode.recordClassIndex(86078);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final String bz_() {
        return "video_post_page";
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73757k
    public final boolean by_() {
        return this.f164781k;
    }

    /* renamed from: j */
    private boolean m129415j() {
        if (getIntent().getIntExtra("fromDraft", 0) != 0) {
            return true;
        }
        return false;
    }

    public void finish() {
        this.f164781k = false;
        super.finish();
        overridePendingTransition(0, R.anim.x);
    }

    /* renamed from: h */
    public final VideoPublishViewModel mo115987h() {
        return (VideoPublishViewModel) C20531t.m38716a(this).mo33800a(VideoPublishViewModel.class);
    }

    /* renamed from: m */
    private void m129417m() {
        C73942ae.m130037a(this, new C73556cf(this));
        C73942ae.m130038b(this, new C73557cg(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
    /* renamed from: b */
    public final void mo114956b() {
        if (this.f164774d.f165266I != null) {
            this.f164774d.f165266I.mo114937b().mo114956b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
    /* renamed from: a */
    public final void mo114954a() {
        if (this.f164774d.f165266I != null) {
            this.f164774d.f165266I.mo114937b().mo114954a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b
    /* renamed from: f */
    public final Analysis mo59474f() {
        if (super.mo59474f() == null) {
            return super.mo59474f();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", this.f164775e.creationId);
        hashMap.put("is_story_shoot", "0");
        return super.mo59474f().setExtraMap(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C84425b mo115986g() {
        C84425b a = new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("creation_id", this.f164775e.creationId);
        if (!TextUtils.isEmpty(this.f164775e.newDraftId)) {
            a.mo129406a("new_draft_id", this.f164775e.newDraftId);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo115988i() {
        C73560cj cjVar = (C73560cj) getSupportFragmentManager().mo3549a(R.id.b82);
        if (cjVar != null) {
            cjVar.mo116153c("enter_video_edit_page");
            cjVar.mo116160k();
            cjVar.mo116161l();
            Intent a = C78179az.m136668a(cjVar.f165268K, this.f164780j);
            a.setClass(this, VEVideoPublishEditActivity.class);
            C84412c.m145201a(this, a);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        this.f164776f = System.currentTimeMillis();
        if (getSupportFragmentManager().mo3564e() > 0) {
            getSupportFragmentManager().mo3562c();
            return;
        }
        mo115987h().mo116262a(m129415j(), this.f164775e.mIsFromDraft);
        C84911q.m145922a("VideoPublishActivity", "system back event");
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        this.f164781k = false;
        super.onDestroy();
        C73975b.C73976a.f166071a.leave(this, "video_publish");
        AVCommerceServiceImpl.m102988h().mo93970g();
        C84412c.m145200a(this);
        AVCommerceServiceImpl.m102988h().mo93970g();
        C72477c.m127864a("normal").mo114738a("at_post_page");
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        if (this.f164775e != null) {
            C73975b.C73976a.f166071a.pause(this, "video_publish", this.f164775e.creationId, this.f164775e.mShootWay);
        }
        C80461fw.m139466a("tool_publish_enter");
        C86654a.C86655a.m150135a().mo137922b("tool_publish");
        C85555d.m147448b().mo131523a(5);
    }

    /* renamed from: n */
    private void m129418n() {
        long currentTimeMillis;
        long longExtra = getIntent().getLongExtra("draft_to_edit_start_time", -1);
        if (longExtra == -1) {
            currentTimeMillis = -1;
        } else {
            currentTimeMillis = System.currentTimeMillis() - longExtra;
        }
        long longExtra2 = getIntent().getLongExtra("draft_modify_time", -1);
        long longExtra3 = getIntent().getLongExtra("draft_file_size", -1);
        int i = 1;
        EditPreviewInfo previewInfo = this.f164775e.getPreviewInfo();
        if (previewInfo != null) {
            i = previewInfo.getVideoList().size();
        }
        C80322d.m139251a("tool_performance_draft_to_publish", new C84425b().mo129404a("duration", currentTimeMillis).mo129404a("video_size", longExtra3).mo129403a("video_count", i).mo129406a("music_id", this.f164775e.musicId).mo129404a("modify_time", longExtra2).f188764a);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (this.f164776f != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f164776f;
            if (currentTimeMillis < 10000) {
                C80571if.C80572a.m139667a("click_back_in_publish", currentTimeMillis);
            }
            this.f164776f = -1;
        }
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

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onResume() {
        VideoPublishEditModel videoPublishEditModel;
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", true);
        super.onResume();
        C86654a.C86655a.m150135a().mo137921a("tool_publish");
        C85555d.m147448b().mo131523a(4);
        if (!(this.f164784n || (videoPublishEditModel = this.f164775e) == null || videoPublishEditModel.clickGoNextBtnTime == -1)) {
            this.f164784n = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f164775e.clickGoNextBtnTime;
            C80322d.m139251a("tool_performance_publish_first_frame", new C84425b().mo129406a("shoot_way", this.f164775e.mShootWay).mo129406a("enter_from", this.f164775e.enterFrom).mo129406a("content_type", C71817eu.m126792c(this.f164775e)).mo129406a("content_source", C71817eu.m126790a(this.f164775e)).mo129406a("creation_id", this.f164775e.creationId).mo129404a("first_frame_duration", currentTimeMillis).f188764a);
            C80571if.C80572a.m139667a("click_next_in_edit", currentTimeMillis);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", false);
    }

    /* renamed from: k */
    private void m129416k() {
        final boolean j = m129415j();
        if (!j) {
            if (this.f164775e.mIsFromDraft) {
                this.f164778h.setVisibility(0);
            }
            this.f164775e.challenges = (List) getIntent().getSerializableExtra("challenge");
            this.f164775e.tagId = m129413a(getIntent(), "tag_id");
        } else {
            this.f164777g.setText(R.string.a23);
            this.f164778h.setVisibility(0);
            if (this.f164775e.isShoutout()) {
                this.f164777g.setText("");
                this.f164778h.setVisibility(8);
            }
            this.f164775e.mIsFromDraft = true;
            VideoLengthChecker.m126409a().mo113255a(this, this.f164775e);
            m129418n();
            C84911q.m145921a("[Filter Intensity] VideoPublishActivity FromDraftBox mSelectedFilterIntensity:" + this.f164775e.mSelectedFilterIntensity + " mSelectedId:" + this.f164775e.mSelectedId + " mUseFilter:" + this.f164775e.mUseFilter);
        }
        this.f164778h.setOnClickListener(new View$OnClickListenerC73555ce(this, j));
        this.f164777g.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoPublishActivity.C733441 */

            static {
                Covode.recordClassIndex(86079);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                VideoPublishActivity.this.f164776f = System.currentTimeMillis();
                VideoPublishActivity.this.mo115987h().mo116262a(j, VideoPublishActivity.this.f164775e.mIsFromDraft);
            }
        });
        m129417m();
        Bundle bundle = new Bundle();
        bundle.putSerializable("args", this.f164775e);
        bundle.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
        bundle.putInt("extra_stick_point_type", getIntent().getIntExtra("extra_stick_point_type", 0));
        bundle.putBoolean("enter_record_from_other_platform", this.f164779i);
        bundle.putBoolean("extra_enter_from_live", this.f164782l);
        bundle.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
        if (getIntent().getBooleanExtra("review_video_fast_publish", false)) {
            bundle.putBoolean("review_video_fast_publish", true);
        }
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C73560cj cjVar = (C73560cj) supportFragmentManager.mo3549a(R.id.b82);
        this.f164774d = cjVar;
        if (cjVar == null) {
            C73560cj cjVar2 = new C73560cj();
            this.f164774d = cjVar2;
            cjVar2.setArguments(bundle);
            supportFragmentManager.mo3552a().mo3453a(R.id.b82, this.f164774d).mo3467b();
        }
        m129414a(j);
        C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
    }

    /* renamed from: a */
    private static Bundle m129412a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    /* renamed from: a */
    private void m129414a(boolean z) {
        C71824e.m126819a(this.f164775e, z);
        C71824e.m126818a(this.f164775e);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
    /* renamed from: a */
    public final void mo114955a(int i) {
        if (this.f164774d.f165266I != null) {
            this.f164774d.f165266I.mo114937b().mo114955a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo115982a(Boolean bool) {
        C71894a aVar;
        if (this.f164775e.isShoutout()) {
            new C17197a.C17200a(this).mo27194b(R.string.bo9).mo27190a(R.string.bo8, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73558ch(this), false).mo27195b(R.string.bo_, DialogInterface$OnClickListenerC73559ci.f165255a, false).mo27193a().mo27185c();
            return null;
        } else if (C83891d.m144283a(this.f164775e)) {
            new C79459a(this).mo123050a(R.string.o2).mo123053a();
            return null;
        } else {
            if (!bool.booleanValue()) {
                C39162r.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                if (this.f164775e == null) {
                    C84911q.m145927c("VideoPublishActivity model == null saveInfoForEdit failed");
                } else {
                    int a = C39099e.m79372a(this);
                    VideoPublishEditModel videoPublishEditModel = this.f164775e;
                    C70968bl.m125250a(a, videoPublishEditModel, (Intent) null, C88168aj.m153237a(videoPublishEditModel.videoPath()), "click_back_button");
                    C73560cj cjVar = (C73560cj) getSupportFragmentManager().mo3549a(R.id.b82);
                    cjVar.mo116153c("enter_video_edit_page");
                    cjVar.mo116160k();
                    cjVar.mo116161l();
                    VideoPublishEditModel videoPublishEditModel2 = cjVar.f165268K;
                    String str = videoPublishEditModel2.title;
                    String str2 = videoPublishEditModel2.chain;
                    boolean z = videoPublishEditModel2.disableDeleteChain;
                    List list = videoPublishEditModel2.structList;
                    int i = videoPublishEditModel2.isPrivate;
                    List list2 = videoPublishEditModel2.challenges;
                    C89219l.m154721d(videoPublishEditModel2, "");
                    if (videoPublishEditModel2.isMvThemeVideoType()) {
                        aVar = new C71894a(videoPublishEditModel2.mvCreateVideoData.videoCoverStartTime, videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath, videoPublishEditModel2.getCoverPublishModel());
                    } else {
                        aVar = new C71894a((int) (videoPublishEditModel2.mVideoCoverStartTm * 1000.0f), videoPublishEditModel2.getCoverPublishModel());
                    }
                    C71905k kVar = new C71905k(str, str2, z, list, i, list2, aVar, videoPublishEditModel2.stickerChallenge, videoPublishEditModel2.compileProbeResult, videoPublishEditModel2.geofencingSetting, videoPublishEditModel2.changeStickerStruct);
                    kVar.f161116g = videoPublishEditModel2.commentSetting;
                    kVar.f161120k = videoPublishEditModel2.commerceData;
                    kVar.f161125p = videoPublishEditModel2.allowAutoCaptionSetting;
                    kVar.f161121l = videoPublishEditModel2.allowDownloadSetting;
                    kVar.f161123n = videoPublishEditModel2.excludeUserList;
                    kVar.f161124o = videoPublishEditModel2.allowRecommend;
                    kVar.f161126q = videoPublishEditModel2.isDraftMusicIllegal;
                    kVar.f161127r = videoPublishEditModel2.playlist_name;
                    kVar.f161128s = videoPublishEditModel2.playlist_id;
                    kVar.f161131v = videoPublishEditModel2.musicUsageConfirmation;
                    kVar.f161132w = videoPublishEditModel2.tagUserList;
                    DuetStickerStruct a2 = C71073b.m125559a(videoPublishEditModel2.getMainBusinessContext());
                    if (!(a2 == null || a2.getUserList() == null || a2.getUserList().size() <= 0)) {
                        for (DuetStickerUserStruct duetStickerUserStruct : a2.getUserList()) {
                            kVar.f161133x.add(duetStickerUserStruct.f169298e);
                        }
                    }
                    AbstractC81915c.m141874a(kVar);
                }
            } else {
                mo115988i();
            }
            mo115984a("back event");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo115984a(String str) {
        C73560cj cjVar = this.f164774d;
        if (SettingsManager.m29616a().mo25400a("tool_enable_publish_area_config", true)) {
            cjVar.f165348w.setEnabled(false);
            cjVar.f165349x.setEnabled(false);
        }
        C63244g.m114602a().mo73287o().mo104783c();
        if (!TextUtils.isEmpty(str)) {
            C84911q.m145922a("VideoPublishActivity", "finish video publish page, reason: ".concat(String.valueOf(str)));
            C70005cr.m123611a().f156496p = "";
            finish();
            C67296h.m119241c();
            return;
        }
        throw new IllegalArgumentException("finish reason can't be empty");
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        VideoPublishActivity videoPublishActivity;
        boolean z;
        int i;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", true);
        C84911q.m145928d("VideoPublishActivity onCreate");
        C73975b.C73976a.f166071a.enter(this, "video_publish");
        C80461fw.m139467a("tool_publish_enter", C65360bc.m117058b(), (long) C65360bc.m117059c());
        C65476i.m117206a(this, AbstractC65488n.C65490b.f147705a);
        try {
            super.onCreate(bundle);
        } catch (Exception e) {
            if (!C73974az.m130103a(bundle, e) || !C73974az.m130104a(this)) {
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
                throw e;
            }
            C84911q.m145922a("VideoPublishActivity", "view state restore crash fixed");
        }
        this.f164781k = true;
        setContentView(R.layout.ce);
        this.f164777g = (TextView) findViewById(R.id.pf);
        this.f164778h = (TextView) findViewById(R.id.a0w);
        Intent intent = getIntent();
        C84412c.m145202a(this, intent, bundle);
        try {
            this.f164775e = (VideoPublishEditModel) intent.getSerializableExtra("args");
            this.f164779i = intent.getBooleanExtra("enter_record_from_other_platform", false);
            this.f164782l = intent.getBooleanExtra("extra_enter_from_live", false);
            this.f164783m = intent.getBooleanExtra("extra_enter_from_shoutout_sync", false);
        } catch (RuntimeException e2) {
            if (m129412a(getIntent()) != null) {
                i = C84409a.m145194a(m129412a(getIntent()));
            } else {
                i = 0;
            }
            C84911q.m145926b("StickerInfo, " + e2.getMessage() + ", bundleSize: " + i);
            C63244g.m114602a().mo73263I().mo101629a("bundle_stickerinfo", 0, new C69840ar().mo110189a("exception", e2.getMessage()).mo110187a("bundleSize", Integer.valueOf(i)).mo110191a());
        }
        if (this.f164775e == null) {
            if (this.f164783m) {
                new C70974bn("shoutOuts");
                String a = m129413a(intent, "extra_shoutout_video_path");
                String a2 = m129413a(intent, "extra_shoutout_pid");
                String a3 = m129413a(intent, "extra_shoutout_music_id");
                VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
                this.f164775e = videoPublishEditModel;
                videoPublishEditModel.creationId = UUID.randomUUID().toString();
                videoPublishEditModel.mOrigin = 0;
                videoPublishEditModel.mFromCut = true;
                videoPublishEditModel.isFastImport = true;
                videoPublishEditModel.mShootWay = C74418d.shootWay;
                int[] iArr = new int[10];
                if (VEUtils.getVideoFileInfo(a, iArr) == 0) {
                    EditVideoSegment editVideoSegment = new EditVideoSegment(a, null, new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7], iArr[6]));
                    editVideoSegment.setVideoCutInfo(new VideoCutInfo(0, editVideoSegment.getVideoFileInfo().getDuration(), 1.0f, 0));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(editVideoSegment);
                    videoPublishEditModel.setPreviewInfo(new C71416e(C63244g.m114602a().mo73281i().getVideoWidth(), C63244g.m114602a().mo73281i().getVideoHeight()).mo113021a(arrayList));
                    videoPublishEditModel.videoWidth();
                    ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
                    arrayList2.add(new ImportVideoInfo(iArr[0], iArr[1], iArr[6], iArr[8], a, (long) iArr[3], (long) iArr[3], null, null, iArr[7], 1.0f, a));
                    videoPublishEditModel.importInfoList = arrayList2;
                    videoPublishEditModel.mDir = C70638dj.f158101d;
                    Workspace a4 = C69743b.m123265a(videoPublishEditModel);
                    videoPublishEditModel.mOutputFile = a4.mo110099h().getPath();
                    videoPublishEditModel.mEncodedAudioOutputFile = a4.mo110100i().getPath();
                    videoPublishEditModel.mParallelUploadOutputFile = a4.mo110101j().getPath();
                    videoPublishEditModel.videoCount = 1;
                    videoPublishEditModel.voiceVolume = 1.0f;
                    videoPublishEditModel.mShootMode = -1;
                    videoPublishEditModel.mDuetFrom = null;
                    videoPublishEditModel.musicVolume = 1.0f;
                    C63244g.m114602a().mo73275c();
                    videoPublishEditModel.setNewVersion(3);
                    videoPublishEditModel.generateVideoCoverPath();
                    C71514q qVar = new C71514q(videoPublishEditModel);
                    videoPublishEditModel.mShoutOutsData = new C74418d();
                    videoPublishEditModel.mShoutOutsData.setShoutOutsMode(C74418d.MODE_POST);
                    videoPublishEditModel.mShoutOutsData.setProductId(a2);
                    videoPublishEditModel.mShoutOutsData.setMusicId(a3);
                    videoPublishEditModel.mShoutOutsData.setPostVideoPath(a);
                    qVar.mo112108a(false, false);
                }
                m129416k();
            } else {
                C84911q.m145926b("VideoPublishActivity onCreate error, model == null");
                HashMap hashMap = new HashMap();
                hashMap.put("intent", intent.toString());
                C22708a.m42801a("VideoPublishActivity onCreate error, model == null", hashMap);
            }
            videoPublishActivity = this;
        } else {
            m129416k();
            videoPublishActivity = this;
            if (C80285bz.m139187a(videoPublishActivity.f164775e) && !C80285bz.m139189b(videoPublishActivity.f164775e)) {
                C80285bz.m139190c(videoPublishActivity.f164775e);
                EditPreviewInfo previewInfo = videoPublishActivity.f164775e.getPreviewInfo();
                C89219l.m154721d(previewInfo, "");
                if (previewInfo.getPreviewVideoLength() == 0 || previewInfo.getPreviewVideoLength() < 61000) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    new C17197a.C17200a(videoPublishActivity).mo27195b(R.string.bc6, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73551ca(videoPublishActivity), false).mo27190a(R.string.bc7, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73552cb(videoPublishActivity), false).mo27189a(R.string.bc9).mo27194b(R.string.bci).mo27193a().mo27184b();
                } else {
                    new C17197a.C17200a(videoPublishActivity).mo27195b(R.string.bc6, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73553cc(videoPublishActivity), false).mo27190a(R.string.bc7, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73554cd(videoPublishActivity), false).mo27189a(R.string.bc9).mo27194b(R.string.bc8).mo27193a().mo27184b();
                }
                C39162r.m79460a("show_audio_clear_popup", mo115986g().f188764a);
            }
        }
        if (videoPublishActivity.f164775e != null) {
            int intExtra = intent.getIntExtra("draft_to_edit_from", 0);
            videoPublishActivity.f164780j = intExtra;
            videoPublishActivity.f164775e.mDraftToEditFrom = intExtra;
            VideoPublishEditModel videoPublishEditModel2 = videoPublishActivity.f164775e;
            videoPublishEditModel2.mCropVideo = videoPublishEditModel2.isChangeMultiEditData();
        }
        C72477c.m127864a("normal").mo114739a("at_post_page", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m129413a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo115983a(Boolean bool, Boolean bool2) {
        C84425b a = new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("creation_id", this.f164775e.creationId);
        if (this.f164775e.draftId != 0) {
            a.mo129403a("draft_id", this.f164775e.draftId);
        }
        if (!TextUtils.isEmpty(this.f164775e.newDraftId)) {
            a.mo129406a("new_draft_id", this.f164775e.newDraftId);
        }
        if (this.f164775e.mDraftToEditFrom == 0) {
            a.mo129406a("draft_way", "general_draft_list");
        }
        C80322d.m139251a("click_draft_edit_cancel", a.f188764a);
        if (!bool.booleanValue() && bool2.booleanValue()) {
            Intent intent = new Intent();
            if (this.f164780j == 0) {
                intent.setFlags(536870912);
                C72724a.m128203a().mo62192a((Activity) this, intent, false);
            }
        }
        if (bool.booleanValue()) {
            C63244g.m114602a().mo73275c().mo101846a(false);
            mo115984a("cancel draft box edit");
            C84425b a2 = new C84425b().mo129406a("creation_id", this.f164775e.creationId).mo129406a("shoot_way", this.f164775e.mShootWay);
            if (this.f164775e.draftId != 0) {
                a2.mo129403a("draft_id", this.f164775e.draftId);
            }
            if (!TextUtils.isEmpty(this.f164775e.newDraftId)) {
                a2.mo129406a("new_draft_id", this.f164775e.newDraftId);
            }
            C39162r.m79460a("video_post_page_cancel", a2.f188764a);
        }
        C63244g.m114602a().mo73287o().mo104782b();
        return null;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C80611a.m139766a(this, i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C73560cj cjVar = this.f164774d;
        if (cjVar != null && cjVar.isAdded()) {
            this.f164774d.onActivityResult(i, i2, intent);
        }
    }
}
