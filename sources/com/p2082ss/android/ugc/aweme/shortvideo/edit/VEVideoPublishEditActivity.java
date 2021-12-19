package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.p2217f.C31094b;
import com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.canvas.C35407r;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45830f;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.experiment.C46787cd;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.p2306ah.C33448b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40891f;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40894i;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40898m;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65366bf;
import com.p2082ss.android.ugc.aweme.property.p3609a.C65330a;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.setting.C68338q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C72452n;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70980c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70835b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3807a.C70786a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3807a.C70787b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71894a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71897c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71901g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71902h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71903i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71905k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73757k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72621b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.text.C75894b;
import com.p2082ss.android.ugc.aweme.sticker.text.C75896c;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75926c;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80461fw;
import com.p2082ss.android.ugc.aweme.utils.C80571if;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.widgetcompat.ProgressDialogC81636a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.gesture.EditGestureViewModel;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.gamora.editor.p4276c.AbstractC82074b;
import com.p2082ss.android.ugc.gamora.editor.p4276c.C82080c;
import com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.permission.C82949a;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83251y;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.runtime.C85555d;
import com.p2082ss.ugc.aweme.performance.p4431a.C86654a;
import dmt.p4542av.video.C88288n;
import dmt.p4542av.video.CompileProbeViewModel;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4568e.p4581g.C88858d;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity */
public class VEVideoPublishEditActivity extends AbstractActivityC33414h implements AbstractC73757k, AbstractC84919c, AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static String f158469e = "VEVideoPublishEditActivity";

    /* renamed from: A */
    private C21582f f158470A;

    /* renamed from: B */
    private boolean f158471B;

    /* renamed from: C */
    private AbstractC70977bq f158472C;

    /* renamed from: D */
    private final List<AbstractC84917a> f158473D = new ArrayList();

    /* renamed from: E */
    private C71529w.AbstractC71530a f158474E;

    /* renamed from: F */
    private final C70786a f158475F = new C70786a();

    /* renamed from: G */
    private AbstractC83251y f158476G;

    /* renamed from: H */
    private AbstractC82562e f158477H;

    /* renamed from: I */
    private final C80571if f158478I = new C80571if();

    /* renamed from: J */
    private final AbstractC63269z.AbstractC63271b f158479J = C70803ac.f158553a;

    /* renamed from: f */
    protected ViewGroup f158480f;

    /* renamed from: g */
    protected C69905c f158481g;

    /* renamed from: h */
    protected boolean f158482h;

    /* renamed from: i */
    public boolean f158483i;

    /* renamed from: j */
    protected boolean f158484j;

    /* renamed from: k */
    protected VideoPublishEditModel f158485k;

    /* renamed from: l */
    protected C56724i f158486l;

    /* renamed from: m */
    boolean f158487m;

    /* renamed from: n */
    boolean f158488n = false;

    /* renamed from: o */
    public boolean f158489o = false;

    /* renamed from: p */
    protected AbstractC82155c f158490p;

    /* renamed from: q */
    protected EditGestureViewModel f158491q;

    /* renamed from: r */
    protected EditStickerViewModel f158492r;

    /* renamed from: s */
    protected EditToolbarViewModel f158493s;

    /* renamed from: t */
    protected CompileProbeViewModel f158494t;

    /* renamed from: u */
    public AbstractC82561d f158495u;

    /* renamed from: v */
    public ProgressDialogC81636a f158496v;

    /* renamed from: w */
    boolean f158497w = true;

    /* renamed from: x */
    View f158498x;

    /* renamed from: y */
    private ViewGroup f158499y;

    /* renamed from: z */
    private int f158500z;

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87531a(AbstractC84917a aVar) {
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87532a(AbstractC84918b bVar) {
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87534b(AbstractC84918b bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final boolean bA_() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final String bz_() {
        return "video_edit_page";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(210, new RunnableC90250g(VEVideoPublishEditActivity.class, "onEvent", C71905k.class, ThreadMode.MAIN, 0, false));
        hashMap.put(204, new RunnableC90250g(VEVideoPublishEditActivity.class, "onEvent", C71897c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(211, new RunnableC90250g(VEVideoPublishEditActivity.class, "onEvent", C71901g.class, ThreadMode.MAIN, 0, false));
        hashMap.put(212, new RunnableC90250g(VEVideoPublishEditActivity.class, "onEvent", C71903i.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73757k
    public final boolean by_() {
        return this.f158484j;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    public final boolean cC_() {
        return this.f158497w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111762a(String str) {
        if (!"success".equals(str)) {
            C43213k.m86181a("draft recover failed, cause : ".concat(String.valueOf(str)));
            C63244g.m114602a().mo73275c().mo101847b().mo101853a(1, this.f158485k.creationId, str);
        }
        C63244g.m114602a().mo73275c().mo101847b().mo101853a(0, this.f158485k.creationId, str);
        C71429d.m126161b(this.f158485k.draftDir() + File.separator, C70637di.f158102e, this.f158485k.multiEditVideoRecordData);
        this.f158483i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111763a(String str, String str2) {
        this.f158485k.mUploadPath = str;
        C72621b.f162801a.put(str2, str);
        if (TextUtils.isEmpty(this.f158485k.commerceData) && this.f158485k.microAppModel == null) {
            runOnUiThread(new RunnableC70931ax(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111760a(C89386u uVar) {
        boolean booleanValue = ((Boolean) uVar.getFirst()).booleanValue();
        boolean booleanValue2 = ((Boolean) uVar.getSecond()).booleanValue();
        boolean booleanValue3 = ((Boolean) uVar.getThird()).booleanValue();
        this.f158476G.mo88191a(booleanValue, booleanValue2, booleanValue3);
        this.f158491q.mo33689c(new EditGestureViewModel.C82251c(booleanValue3));
        if (!booleanValue) {
            m125005Q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111759a(AbstractC31071f fVar) {
        if (fVar != null) {
            this.f158485k.setVideoLength(fVar.mo56368j());
            this.f158476G.mo88190a();
            C73991bj.m130128a("VideoPublishEditActivity, video duration " + fVar.mo56368j());
            VideoLengthChecker.m126409a().mo113256a(this, this.f158485k, this.f158495u);
            VideoPublishEditModel videoPublishEditModel = this.f158485k;
            C89219l.m154721d(videoPublishEditModel, "");
            if (C70934b.m125234a()) {
                C1731i.m5640b(new C70980c.CallableC70981a(videoPublishEditModel), C1731i.f5562a);
            }
            if (this.f158485k.isMvThemeVideoType() && fVar.mo56368j() > 0) {
                EditVideoSegment editVideoSegment = this.f158485k.getPreviewInfo().getVideoList().get(0);
                this.f158485k.getPreviewInfo().getVideoList().set(0, editVideoSegment.copy(editVideoSegment.getVideoPath(), editVideoSegment.getAudioPath(), new VideoFileInfo(editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight(), (long) fVar.mo56368j(), 30, 0)));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59491a(boolean z) {
        this.f158477H.mo87779a(z);
    }

    /* renamed from: a */
    public final void mo111761a(Boolean bool) {
        boolean a = C85555d.m147448b().mo131524a();
        this.f158495u.mo127621af();
        if ((!C68338q.m120618a() || m124994F() == null) && !a) {
            C72724a.m128203a().mo62192a(this, new Intent(), bool.booleanValue());
            C82080c.m142102a(new AbstractC82074b.C82075a(this));
            return;
        }
        m125017b(false, null, null);
    }

    /* renamed from: a */
    public final void mo111765a(boolean z, Intent intent, VideoPublishEditModel videoPublishEditModel) {
        if (z) {
            m125015b(intent, videoPublishEditModel);
        } else {
            C82080c.m142102a(new AbstractC82074b.C82075a(this));
        }
    }

    /* renamed from: a */
    public final void mo111758a(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        boolean a = C85555d.m147448b().mo131524a();
        if ((!C68338q.m120618a() || m124994F() == null) && !a) {
            m125015b(intent, videoPublishEditModel);
        } else {
            m125017b(true, intent, videoPublishEditModel);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111764a(Throwable th) {
        C63244g.m114602a().mo73275c().mo101847b().mo101853a(-1, this.f158485k.creationId, th.toString());
        C43213k.m86181a(th.toString());
        finish();
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final int bB_() {
        return C0643b.m2378c(this, R.color.c9);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ C89391z mo111785u() {
        m125016b("cancel");
        return null;
    }

    /* renamed from: F */
    private AbstractC31071f m124994F() {
        return this.f158490p.mo114778C().getValue();
    }

    /* renamed from: O */
    private boolean m125003O() {
        return m125019c((Boolean) true);
    }

    /* renamed from: Q */
    private void m125005Q() {
        this.f158495u.mo87618G().mo87910K();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ C89391z mo111786v() {
        m125016b("discard");
        mo111761a((Boolean) false);
        return null;
    }

    static {
        Covode.recordClassIndex(83262);
        C75894b.m133079a();
        C75896c.m133081a();
    }

    /* renamed from: I */
    private boolean m124997I() {
        if (!this.f158485k.isPhotoMvMode || this.f158485k.getOriginal() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    private boolean m125002N() {
        if (this.f158485k.veAudioRecorderParam == null) {
            return false;
        }
        if (this.f158485k.veAudioRecorderParam.hasRecord() || !this.f158485k.veAudioRecorderParam.getNeedOriginalSound()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final /* synthetic */ void mo111753A() {
        VideoPublishEditModel videoPublishEditModel = this.f158485k;
        AbstractC63175ai z = C63253l.f143623a.mo73330z();
        new C70787b(videoPublishEditModel);
        z.mo93812a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final /* synthetic */ C89391z mo111754B() {
        C39162r.m79460a("click_audio_clear_popup", m124993E().mo129406a("click_type", "not_now").f188764a);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final /* synthetic */ C89391z mo111755C() {
        this.f158493s.mo128237a(1);
        C39162r.m79460a("click_audio_clear_popup", m124993E().mo129406a("click_type", "select").f188764a);
        return null;
    }

    /* renamed from: m */
    public final Map mo111772m() {
        HashMap hashMap = new HashMap();
        VideoPublishEditModel videoPublishEditModel = this.f158485k;
        if (videoPublishEditModel != null) {
            hashMap.put("creation_id", videoPublishEditModel.creationId);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo111774o() {
        if (!TextUtils.isEmpty(this.f158485k.newDraftId)) {
            m125006R();
        }
        this.f158495u.mo87645a(true, this.f158482h, this.f158471B, (Runnable) new RunnableC70929av(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo111780p() {
        if (!TextUtils.isEmpty(this.f158485k.newDraftId)) {
            m125006R();
        }
        m125000L();
        mo87538j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ C89391z mo111787w() {
        m125016b("save");
        this.f158495u.mo127618a(this.f158482h, this.f158471B, new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.RunnableC707813 */

            static {
                Covode.recordClassIndex(83265);
            }

            public final void run() {
            }
        }, new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.RunnableC707824 */

            static {
                Covode.recordClassIndex(83266);
            }

            public final void run() {
                VEVideoPublishEditActivity.this.mo111771k();
            }
        });
        return null;
    }

    /* renamed from: E */
    private C84425b m124993E() {
        C84425b a = new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("creation_id", this.f158485k.creationId);
        if (!TextUtils.isEmpty(this.f158485k.newDraftId)) {
            a.mo129406a("new_draft_id", this.f158485k.newDraftId);
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void mo111784t() {
        if (!TextUtils.isEmpty(this.f158485k.newDraftId)) {
            m125006R();
        }
        C63244g.m114602a().mo73282j().mo101713a();
        C70005cr.m123611a().mo110451a(this.f158481g, C70005cr.m123611a().f156483b);
        C70005cr.m123611a().f156496p = "";
        m125000L();
        mo87538j();
    }

    /* renamed from: K */
    private void m124999K() {
        new C17197a.C17200a(this).mo27194b(R.string.g5w).mo27189a(R.string.g5x).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70816ap(this), false).mo27193a().mo27184b();
    }

    /* renamed from: L */
    private void m125000L() {
        C39078ad adVar;
        if (getIntent().hasExtra("extra_share_context") && (adVar = (C39078ad) getIntent().getSerializableExtra("extra_share_context")) != null && C63253l.f143623a.mo73311g().mo93793a(adVar) && adVar.mTargetSceneType == 1) {
            C63253l.f143623a.mo73311g().mo93790a(this, adVar, "Sharing canceled", 20013);
        }
    }

    /* renamed from: M */
    private void m125001M() {
        new C17197a.C17200a(this).mo27194b(R.string.z1).mo27196b(getString(R.string.a8y), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70819as(this), false).mo27192a(getString(R.string.cta), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70820at(this), false).mo27193a().mo27184b();
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b
    /* renamed from: f */
    public final Analysis mo59474f() {
        if (super.mo59474f() == null) {
            return super.mo59474f();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", this.f158485k.creationId);
        hashMap.put("is_story_shoot", "0");
        return super.mo59474f().setExtraMap(hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: h */
    public final void mo59496h() {
        if (this.f158472C.mo112109b() <= 0 || this.f158472C.mo112106a() <= 0) {
            C22708a.m42800a("edit page modifyDisplayView failed");
        }
        C33398a.f79357a.mo59450a(this.f158498x, this.f158472C.mo112106a(), this.f158472C.mo112109b());
        this.f158490p.mo120451Z();
    }

    /* renamed from: j */
    public final void mo87538j() {
        boolean a = C85555d.m147448b().mo131524a();
        this.f158495u.mo127621af();
        if ((!C68338q.m120618a() || m124994F() == null) && !a) {
            C82080c.m142102a(new AbstractC82074b.C82075a(this));
        } else {
            m125017b(false, null, null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C17233a.f41165a = false;
        C73975b.C73976a.f166071a.pause(this, "video_edit", this.f158485k.mShootWay, this.f158485k.creationId);
        C80461fw.m139466a("tool_edit_enter");
        C86654a.C86655a.m150135a().mo137922b("tool_edit");
        C85555d.m147448b().mo131523a(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo111782r() {
        if (this.f158485k.recordMode == 1) {
            VideoPublishEditModel videoPublishEditModel = this.f158485k;
            C89219l.m154721d(videoPublishEditModel, "");
            C39162r.m79460a("back_to_shoot_confirm", new C84425b().mo129406a("to_status", "cancel").mo129406a("prop_id", videoPublishEditModel.mStickerID).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).f188764a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ void mo111788x() {
        this.f158485k.clickGoNextBtnTime = System.currentTimeMillis();
        m125005Q();
        this.f158494t.mo142640a().mo127286a();
        this.f158488n = true;
        this.f158495u.mo87644a(this.f158482h, this.f158471B, new RunnableC70930aw(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void mo111783s() {
        if (!TextUtils.isEmpty(this.f158485k.newDraftId)) {
            m125006R();
        }
        C63244g.m114602a().mo73282j().mo101713a();
        C70005cr.m123611a().mo110451a(this.f158481g, C70005cr.m123611a().f156483b);
        C70005cr.m123611a().f156496p = "";
        m125000L();
        VideoPublishEditModel videoPublishEditModel = this.f158485k;
        C70980c.m125333a(videoPublishEditModel);
        m125018c(videoPublishEditModel);
        mo111758a(m125014b(videoPublishEditModel), this.f158485k);
    }

    /* renamed from: R */
    private void m125006R() {
        C84425b a = new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("creation_id", this.f158485k.creationId);
        if (this.f158485k.draftId != 0) {
            a.mo129403a("draft_id", this.f158485k.draftId);
        }
        if (!TextUtils.isEmpty(this.f158485k.newDraftId)) {
            a.mo129406a("new_draft_id", this.f158485k.newDraftId);
        }
        if (this.f158485k.mDraftToEditFrom == 0) {
            a.mo129406a("draft_way", "general_draft_list");
        }
        C80322d.m139251a("click_draft_edit_cancel", a.f188764a);
    }

    public void finish() {
        this.f158484j = false;
        VideoPublishEditModel videoPublishEditModel = this.f158485k;
        if (videoPublishEditModel != null && videoPublishEditModel.commerceData != null) {
            AbstractC81915c.m141874a(new C71902h(this.f158485k.commerceData));
        } else if (C65366bf.m117062a()) {
            AbstractC81915c.m141874a(new C71902h(null));
        }
        overridePendingTransition(0, R.anim.x);
        super.finish();
        VideoPublishEditModel videoPublishEditModel2 = this.f158485k;
        if (videoPublishEditModel2 != null && videoPublishEditModel2.mShootMode == 15) {
            overridePendingTransition(0, 0);
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f158485k;
        if (videoPublishEditModel3 != null && videoPublishEditModel3.isFromCrash() && C63244g.m114602a().mo73276d().mo101839h()) {
            overridePendingTransition(0, R.anim.x);
        }
    }

    /* renamed from: k */
    public final void mo111771k() {
        new C70974bn("VideoPublishFragment");
        final C43223c b = C70974bn.m125291b(this.f158485k);
        b.f100886I = System.currentTimeMillis();
        final AbstractC63275c c = C63244g.m114602a().mo73275c();
        if (!isFinishing()) {
            this.f158496v = ProgressDialogC81636a.m141497a(this, getString(R.string.etx));
        }
        C63244g.m114602a().mo73287o().mo104795o().mo104776a(b, this.f158485k, new IDraftService.DraftSaveListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.C707835 */

            static {
                Covode.recordClassIndex(83267);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveSuccess() {
                c.mo101851c(b);
                c.mo101844a(b, false);
                Context applicationContext = VEVideoPublishEditActivity.this.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                new C79459a(applicationContext).mo123052a(VEVideoPublishEditActivity.this.getString(R.string.fdg)).mo123053a();
                VEVideoPublishEditActivity.this.mo111761a((Boolean) true);
                if (VEVideoPublishEditActivity.this.f158496v != null) {
                    VEVideoPublishEditActivity.this.f158496v.dismiss();
                }
                C73991bj.m130128a("zyc draft save success");
            }

            @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                VEVideoPublishEditActivity.this.mo111761a((Boolean) false);
                if (VEVideoPublishEditActivity.this.f158496v != null) {
                    VEVideoPublishEditActivity.this.f158496v.dismiss();
                }
                C73991bj.m130128a("zyc draft save failed");
            }
        });
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", true);
        C73991bj.m130128a("VEVideoPublishEditActivity onResume");
        super.onResume();
        C86654a.C86655a.m150135a().mo137921a("tool_edit");
        C17233a.f41165a = true;
        C73975b.C73976a.f166071a.step("av_video_edit", "onResume");
        this.f158487m = false;
        this.f158497w = true;
        AbstractC82561d dVar = this.f158495u;
        if (dVar != null) {
            dVar.mo127620ae();
        }
        C85555d.m147448b().mo131523a(2);
        long longExtra = getIntent().getLongExtra("extra_start_enter_edit_page", 0);
        String a = m125009a(getIntent(), "extra_start_enter_edit_reason");
        if (a != null && TextUtils.equals(a, "click_next")) {
            this.f158478I.mo123791a("click_record_next", System.currentTimeMillis() - longExtra, true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        C63244g.m114602a().mo73287o().mo104788h().mo104821c();
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

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo111781q() {
        if (this.f158485k.recordMode == 1) {
            VideoPublishEditModel videoPublishEditModel = this.f158485k;
            C89219l.m154721d(videoPublishEditModel, "");
            C39162r.m79460a("back_to_shoot_confirm", new C84425b().mo129406a("to_status", "confirm").mo129406a("prop_id", videoPublishEditModel.mStickerID).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).f188764a);
        }
        m125000L();
        mo87538j();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void mo111789y() {
        this.f158495u.mo87618G().mo87914O();
        C70005cr.m123611a().mo110451a(this.f158481g, C70005cr.m123611a().f156483b);
        if (this.f158485k.mIsFromDraft) {
            this.f158485k.mMusicPath = this.f158495u.f184654v.mo127282j();
            if (!this.f158483i) {
                new C79459a(m125007a(this)).mo123050a(R.string.bvt).mo123053a();
                return;
            }
            if (!C80720e.m139927b(this.f158485k.mStickerPath)) {
                this.f158485k.mStickerPath = null;
                this.f158485k.mStickerID = "";
            }
            Intent a = mo111757a(this.f158485k);
            if (a != null) {
                mo111758a(a, this.f158485k);
            }
        } else if (this.f158485k.hasRetake()) {
            Intent intent = new Intent();
            m125013a(intent, this.f158485k.multiEditVideoRecordData);
            C70005cr.m123611a().mo70083a(this.f158485k.getOriginalRecordMusic());
            C72724a.m128203a().mo62201c((Activity) this, intent);
            mo87538j();
        } else if (this.f158485k.isCutSameVideoType()) {
            setResult(-1, C63253l.f143623a.mo73308d().mo101651a().mo101652a(this.f158485k.cutSameEditData));
            mo87538j();
        } else {
            C70968bl.m125270e(this.f158485k);
            C70005cr.m123611a().mo110456f();
            C70005cr.m123611a().mo110452a(this.f158485k.challenges);
            m125000L();
            if (this.f158485k.mShootMode == 15 || m124997I()) {
                setResult(-1);
            }
            Intent intent2 = new Intent();
            intent2.putExtra("edit_to_record_time", System.currentTimeMillis());
            setResult(-1, intent2);
            mo87538j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final /* synthetic */ void mo111756D() {
        C43213k.m86181a("VEVideoPublishEditActivity onCreate remove tmpDir and restoreDraftCopyFile mModel.draftDir() = " + this.f158485k.draftDir());
        C80720e.m139925b(new File(C70637di.f158102e));
        if (this.f158485k.isMultiVideoEdit()) {
            AbstractC88979t.m154310b(this.f158485k).mo143278b((AbstractC88398aa) new C88858d(C77807b.f174559a)).mo143292d(C70932ay.f158822a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C70944ba(this), new C70945bb(this));
        } else {
            if (this.f158485k.stitchParams == null) {
                C80720e.m139926b(this.f158485k.draftDir(), C70637di.f158102e);
            }
            C40984s.m82525a(new RunnableC70946bc(this));
        }
        if (this.f158485k.containBackgroundVideo) {
            VideoPublishEditModel videoPublishEditModel = this.f158485k;
            C89219l.m154721d(videoPublishEditModel, "");
            String a = C75926c.m133131a(videoPublishEditModel);
            String str = C70638dj.f158105h;
            C80720e.m139938e(str);
            C80720e.m139926b(a, str);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C75896c.m133082a(new C45830f());
        C82949a.f185358a = false;
        C63244g.m114602a().mo73255A().mo93902b(this.f158479J);
        C63244g.m114602a().mo73276d().mo101840i();
        C72452n.f162431a = false;
        C63253l.f143623a.mo73306b().mo101531a((AbstractC40891f) null);
        C63253l.f143623a.mo73306b().mo101552k().mo101565a(true);
        this.f158484j = false;
        C45989b.m88764a();
        VideoPublishEditModel videoPublishEditModel = this.f158485k;
        if (videoPublishEditModel != null && C70976bp.m125316l(videoPublishEditModel)) {
            C63253l.f143623a.mo73306b().mo101552k().mo101559a((AbstractC40894i) null);
            if (C70976bp.m125300a()) {
                C63253l.f143623a.mo73306b().mo101552k().mo101560a((AbstractC40898m) null);
            }
        }
        C73975b.C73976a.f166071a.leave(this, "video_edit");
        C84412c.m145200a(this);
        C72477c.m127864a("normal").mo114738a("at_edit_page");
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        if (!TextUtils.isEmpty(this.f158485k.mMusicPath) && this.f158485k.mCurMusicLength <= 0) {
            this.f158485k.mCurMusicLength = C63253l.f143623a.mo73306b().mo101542b(this.f158485k.mMusicPath);
        }
        VideoPublishEditModel videoPublishEditModel = this.f158485k;
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = C70968bl.m125280l(videoPublishEditModel).mo129406a("scene", "start_edit").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_edit_page");
        C73964ar arVar = C73964ar.f166038a;
        C89219l.m154716b(arVar, "");
        C84425b a2 = a.mo129404a("dalvikPss", arVar.f166040c);
        C73964ar arVar2 = C73964ar.f166038a;
        C89219l.m154716b(arVar2, "");
        C84425b a3 = a2.mo129404a("nativePss", arVar2.f166041d);
        C73964ar arVar3 = C73964ar.f166038a;
        C89219l.m154716b(arVar3, "");
        C84425b a4 = a3.mo129404a("otherPss", arVar3.f166043f);
        C73964ar arVar4 = C73964ar.f166038a;
        C89219l.m154716b(arVar4, "");
        C39162r.m79460a("av_memory_log", a4.mo129404a("totalPss", arVar4.f166042e).f188764a);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public boolean mo111790z() {
        float f;
        C71533z a;
        boolean a2 = C63244g.m114602a().mo73255A().mo93901a();
        if (this.f158495u.mo87634W()) {
            this.f158495u.mo127620ae();
            return false;
        }
        if (C82306a.m142358a(this.f158485k)) {
            if (this.f158485k.getOriginal() == 1 && ((this.f158485k.mIsFromDraft || this.f158485k.draftFromShoot) && (this.f158485k.mShootMode == 15 || this.f158485k.mShootMode == 2))) {
                if (C46787cd.m90133a() && !a2) {
                    m125020d(this.f158485k.draftFromShoot);
                    return true;
                } else if (this.f158485k.mIsFromDraft) {
                    m124999K();
                    return true;
                }
            }
        } else if (this.f158485k.getOriginal() == 1 && C35407r.f83543a && ((this.f158485k.mIsFromDraft || this.f158485k.draftFromShoot) && this.f158485k.mShootMode == 2)) {
            if (C46787cd.m90133a() && !a2) {
                m125020d(this.f158485k.draftFromShoot);
                return true;
            } else if (this.f158485k.mIsFromDraft) {
                m124999K();
                return true;
            }
        }
        if (this.f158485k.isDuet()) {
            if (!this.f158485k.mIsFromDraft || this.f158485k.duetFilesExist()) {
                if ((this.f158485k.mIsFromDraft || this.f158485k.draftFromShoot) && C46787cd.m90133a() && !a2) {
                    m125020d(this.f158485k.draftFromShoot);
                } else if (m125003O()) {
                    mo111789y();
                }
                return false;
            }
            mo87538j();
            return true;
        } else if (this.f158485k.isFromCrash()) {
            if (m125003O()) {
                mo111789y();
            }
            return false;
        } else {
            this.f158494t.mo142640a().mo127286a();
            C70835b.m125100a(this.f158485k);
            VideoPublishEditModel videoPublishEditModel = this.f158485k;
            AbstractC82155c cVar = this.f158490p;
            if (m124994F() != null) {
                f = m124994F().mo56245F();
            } else {
                f = -1.0f;
            }
            C70968bl.m125253a(videoPublishEditModel, cVar, f, "exit_edit");
            if (this.f158485k.recordMode != 1 && (!C13627m.m24498a(this.f158485k.getDuetFrom()) || this.f158485k.isReaction())) {
                m125000L();
                if (!TextUtils.isEmpty(this.f158485k.newDraftId)) {
                    m125006R();
                    mo87538j();
                    return true;
                }
                if (m125003O()) {
                    mo111789y();
                }
                return false;
            } else if (this.f158485k.recordMode == 1) {
                if (this.f158485k.draftFromShoot || this.f158485k.mIsFromDraft) {
                    if (!C46787cd.m90133a() || a2) {
                        C71533z a3 = C71533z.m126438a(Integer.valueOf((int) R.string.f5d), Integer.valueOf((int) R.string.a8y), Integer.valueOf((int) R.string.c45));
                        m125010a(a3.f160318a.intValue(), a3.f160319b.intValue(), a3.f160320c.intValue());
                    } else {
                        m125020d(this.f158485k.draftFromShoot);
                    }
                    return false;
                }
                new C17197a.C17200a(this).mo27189a(R.string.a25).mo27194b(R.string.a24).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70817aq(this), false).mo27190a(R.string.a21, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70818ar(this), false).mo27193a().mo27184b();
                return false;
            } else if (this.f158485k.isCutSameVideoType()) {
                if (this.f158485k.mIsFromDraft || this.f158485k.draftFromShoot) {
                    if (!C46787cd.m90133a() || a2) {
                        m125001M();
                    } else {
                        m125020d(this.f158485k.draftFromShoot);
                    }
                } else if (m125019c((Boolean) false)) {
                    mo111789y();
                }
                return false;
            } else if (this.f158485k.mOrigin == 0 && (this.f158485k.mIsFromDraft || this.f158485k.draftFromShoot)) {
                if (!C46787cd.m90133a() || a2) {
                    m125001M();
                } else {
                    m125020d(this.f158485k.draftFromShoot);
                }
                return false;
            } else if (this.f158485k.isMvThemeVideoType() && !m124997I() && (this.f158485k.mIsFromDraft || this.f158485k.draftFromShoot)) {
                if (!C46787cd.m90133a() || a2) {
                    m125001M();
                } else {
                    m125020d(this.f158485k.draftFromShoot);
                }
                return false;
            } else if (this.f158485k.mOrigin == 0 && this.f158485k.canvasVideoData != null) {
                if (m125019c((Boolean) false)) {
                    mo111789y();
                }
                return false;
            } else if (this.f158485k.mFromCut || this.f158485k.mOrigin == 0 || this.f158485k.mFromMultiCut) {
                if (this.f158485k.mIsFromDraft && (this.f158485k.mFromMultiCut || this.f158485k.mFromCut)) {
                    a = C71533z.m126438a(Integer.valueOf((int) R.string.f5d), Integer.valueOf((int) R.string.a8y), Integer.valueOf((int) R.string.c45));
                } else if (this.f158485k.mFromMultiCut || this.f158485k.mFromCut || this.f158485k.isPhotoMvMode || this.f158485k.canvasVideoData != null) {
                    a = C71533z.m126438a(Integer.valueOf((int) R.string.h8m), Integer.valueOf((int) R.string.a8y), Integer.valueOf((int) R.string.c45));
                } else {
                    a = C71533z.m126438a(Integer.valueOf((int) R.string.h8l), Integer.valueOf((int) R.string.a8y), Integer.valueOf((int) R.string.c45));
                }
                m125010a(a.f160318a.intValue(), a.f160319b.intValue(), a.f160320c.intValue());
                return false;
            } else if ((this.f158485k.mIsFromDraft || this.f158485k.draftFromShoot) && C46787cd.m90133a() && !a2) {
                m125020d(this.f158485k.draftFromShoot);
                return true;
            } else {
                if (m125003O()) {
                    mo111789y();
                }
                return false;
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C71897c cVar) {
        finish();
    }

    /* renamed from: a */
    private static Bundle m125008a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87533b(AbstractC84917a aVar) {
        this.f158473D.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: c */
    public final void mo87535c(AbstractC84917a aVar) {
        this.f158473D.remove(aVar);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C71903i iVar) {
        finish();
    }

    /* renamed from: a */
    private static Context m125007a(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        Context applicationContext = vEVideoPublishEditActivity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!C31094b.f74511a) {
            C31094b.f74512b = true;
            C73991bj.m130133d("ASVEPerformance EditorSceneLazyInit : " + C31094b.f74512b);
        }
    }

    /* renamed from: c */
    private static RecordScene m125018c(VideoPublishEditModel videoPublishEditModel) {
        RecordScene audioTrack = new RecordScene().musicPath(videoPublishEditModel.mMusicPath).musicStart(videoPublishEditModel.mMusicStart).faceBeauty(videoPublishEditModel.mFaceBeauty).videoSegment(videoPublishEditModel.mVideoSegmentsDesc).hardEncode(videoPublishEditModel.mHardEncode).mp4Path(videoPublishEditModel.videoPath()).maxDuration(videoPublishEditModel.maxDuration).audioTrack(videoPublishEditModel.audioTrack);
        C70005cr.m123611a().f156497q = audioTrack;
        return audioTrack;
    }

    /* renamed from: b */
    public final void mo111766b(int i) {
        this.f158480f.setBackgroundColor(i);
        this.f158499y.setBackgroundColor(i);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C71901g gVar) {
        if (this.f158485k.mShoutOutsData != null) {
            this.f158485k.mShoutOutsData.setPrice(gVar.f161101b);
            this.f158485k.mShoutOutsData.setDesc(gVar.f161100a);
            this.f158485k.mShoutOutsData.setBuyerMoneyDes(gVar.f161102c);
        }
    }

    /* renamed from: b */
    private void m125016b(String str) {
        String str2;
        if (this.f158485k.mDraftToEditFrom == 0) {
            str2 = "general_draft_list";
        } else {
            str2 = "shoot_page";
        }
        C80322d.m139251a("click_draft_edit_answer_sheet", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("creation_id", this.f158485k.creationId).mo129403a("draft_id", this.f158485k.draftId).mo129406a("new_draft_id", this.f158485k.newDraftId).mo129406a("shoot_way", this.f158485k.mShootWay).mo129406a("draft_way", str2).mo129406a("click_choice", str).f188764a);
    }

    /* renamed from: c */
    private boolean m125019c(Boolean bool) {
        boolean z;
        if (this.f158495u.mo87618G().mo87913N() || this.f158485k.hasInfoStickers()) {
            z = true;
        } else {
            z = false;
        }
        if (!C13617h.m24466b(this.f158485k.mEffectList) && this.f158485k.mTimeEffect == null && !m125002N() && !this.f158485k.isChangeMultiEditData() && !z) {
            return true;
        }
        C17197a.C17200a a = new C17197a.C17200a(this).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.atx, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70821au(this), false);
        if (bool.booleanValue()) {
            a.mo27189a(R.string.fcc).mo27194b(R.string.fcb);
        } else {
            a.mo27194b(R.string.h8m);
        }
        a.mo27193a().mo27184b().show();
        return false;
    }

    /* renamed from: d */
    private void m125020d(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (this.f158485k.recordMode == 1 || this.f158485k.mFromCut || this.f158485k.mOrigin == 0 || this.f158485k.mFromMultiCut) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f158485k.mShootMode == 15 || this.f158485k.mShootMode == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f158495u.mo87618G().mo87913N() || this.f158485k.hasInfoStickers()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!C13617h.m24466b(this.f158485k.mEffectList) && this.f158485k.mTimeEffect == null && !m125002N() && !this.f158485k.isChangeMultiEditData() && ((this.f158485k.getFilterName() == null || this.f158485k.getFilterName().equals("normal")) && !z4 && (this.f158485k.mMusicPath == null || this.f158485k.mMusicPath.equals("")))) {
            if (!z2) {
                mo111761a((Boolean) true);
                return;
            } else if (this.f158485k.draftFromShoot) {
                mo111789y();
                return;
            }
        }
        if (z3) {
            i = R.string.bcv;
            i2 = R.string.bcu;
        } else {
            i = R.string.bcs;
            i2 = R.string.bcr;
        }
        C70788aa.m125071a(i, i2, new C70810aj(this, z3), new C70811ak(this), new C70812al(this), new C70813am(this), z, z2, getSupportFragmentManager());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo111767b(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            this.f158490p.mo114801a(C88288n.C88289a.m153424a(this.f158485k.veAudioEffectParam));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo111769c(boolean z) {
        m125016b("back_to_camera");
        if (z && this.f158485k.mIsFromDraft) {
            mo111783s();
            return null;
        } else if (this.f158485k.recordMode == 1) {
            mo111784t();
            return null;
        } else {
            mo111789y();
            return null;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C71905k kVar) {
        this.f158485k.title = kVar.f161110a;
        this.f158485k.structList = kVar.f161113d;
        this.f158485k.isPrivate = kVar.f161114e;
        this.f158485k.challenges = kVar.f161115f;
        this.f158485k.commentSetting = kVar.f161116g;
        this.f158485k.compileProbeResult = kVar.f161119j;
        this.f158485k.commerceData = kVar.f161120k;
        this.f158485k.allowAutoCaptionSetting = kVar.f161125p;
        this.f158485k.allowDownloadSetting = kVar.f161121l;
        this.f158485k.microAppId = null;
        this.f158485k.microAppModel = null;
        this.f158485k.chain = kVar.f161111b;
        this.f158485k.disableDeleteChain = kVar.f161112c;
        this.f158485k.geofencingSetting = kVar.f161122m;
        this.f158485k.excludeUserList = kVar.f161123n;
        this.f158485k.allowRecommend = kVar.f161124o;
        this.f158485k.isDraftMusicIllegal = kVar.f161126q;
        this.f158485k.playlist_id = kVar.f161128s;
        this.f158485k.playlist_name = kVar.f161127r;
        this.f158485k.publishDuetMentionedUserList.clear();
        this.f158485k.publishDuetMentionedUserList.addAll(kVar.f161133x);
        if (kVar.f161129t) {
            C71073b.m125571b(this.f158485k);
            this.f158492r.mo33689c(new EditStickerViewModel.C82597n());
        }
        C71894a aVar = kVar.f161117h;
        VideoPublishEditModel videoPublishEditModel = this.f158485k;
        C89219l.m154721d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.mvCreateVideoData == null) {
            videoPublishEditModel.mVideoCoverStartTm = ((float) aVar.f161082a) / 1000.0f;
            videoPublishEditModel.setCoverPublishModel(aVar.f161084c);
        } else {
            C61288d dVar = videoPublishEditModel.mvCreateVideoData;
            dVar.videoCoverStartTime = aVar.f161082a;
            dVar.videoCoverImgPath = aVar.f161083b;
            videoPublishEditModel.setCoverPublishModel(aVar.f161084c);
        }
        if (kVar.f161131v != 0) {
            this.f158485k.musicUsageConfirmation = kVar.f161131v;
        }
        this.f158495u.mo127623am();
    }

    /* renamed from: b */
    private Intent m125014b(VideoPublishEditModel videoPublishEditModel) {
        Intent intent = new Intent();
        C72724a.m128203a().mo62190a((Activity) this, intent);
        intent.putExtra("draft_to_edit_from", this.f158500z);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) videoPublishEditModel.veCherEffectParam);
        }
        intent.putExtra("restore", 1);
        intent.putExtra("workspace", videoPublishEditModel.mWorkspace);
        intent.putExtra("translation_type", 3);
        List<InteractStickerStruct> a = C71073b.m125565a(videoPublishEditModel.getMainBusinessContext(), 12, EnumC71088d.TRACK_PAGE_EDIT);
        if (a != null && a.size() > 0) {
            videoPublishEditModel.qaStruct = a.get(0).getQaStruct();
        }
        intent.putExtra("video_edit_model", (Serializable) videoPublishEditModel);
        intent.putExtra("path", videoPublishEditModel.mMusicPath);
        intent.putExtra("creation_id", videoPublishEditModel.creationId);
        intent.putExtra("draft_id", videoPublishEditModel.draftId);
        intent.putExtra("new_draft_id", videoPublishEditModel.newDraftId);
        intent.putExtra("fromDraft", videoPublishEditModel.mIsFromDraft);
        C59213ah.f134852a = "video_post_page";
        videoPublishEditModel.removeChallengeFromTitleAndStruct(this.f158486l.mo93674b());
        if (!(videoPublishEditModel.veAudioEffectParam == null || videoPublishEditModel.veAudioEffectParam.getChallenge() == null)) {
            videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(videoPublishEditModel.veAudioEffectParam.getChallenge());
        }
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("video_title_chain", videoPublishEditModel.chain);
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.disableDeleteChain);
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.structList);
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("exclude_user_list", (Serializable) videoPublishEditModel.excludeUserList);
        intent.putExtra("allow_recommend", videoPublishEditModel.allowRecommend);
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        intent.putExtra("extra_publish_stage", videoPublishEditModel.publishStage);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel.getStitchParams());
        }
        if (videoPublishEditModel.hasRetake()) {
            m125013a(intent, videoPublishEditModel.multiEditVideoRecordData);
        }
        intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) videoPublishEditModel.draftDuetExtraInfo);
        intent.putExtra("extra_duet_layout", videoPublishEditModel.duetLayout);
        intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        return intent;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z) {
            C71529w.AbstractC71530a aVar = this.f158474E;
            C89219l.m154721d(aVar, "");
            HashSet hashSet = new HashSet();
            SharedPreferences a = C34822d.m71158a(C63247i.f143610a, "ai_music", 0);
            if (a.getBoolean("ai_music_guide_show", false) || C71529w.f160313k.getBoolean("show_combine_shoot_mode_tip", false)) {
                hashSet.add("music");
                hashSet.add("effect");
                hashSet.add("sticker");
                hashSet.add("voice");
                hashSet.add("text");
            }
            SharedPreferences.Editor edit = a.edit();
            C89219l.m154716b(edit, "");
            edit.remove("ai_music_guide_show").apply();
            SharedPreferences.Editor edit2 = C71529w.f160313k.edit();
            C89219l.m154716b(edit2, "");
            edit2.remove("show_combine_shoot_mode_tip").apply();
            C71529w.m126420a(hashSet);
            if (C71529w.f160314l) {
                C71529w.f160314l = false;
                Set<String> a2 = C71529w.m126418a();
                if (!a2.isEmpty()) {
                    C33448b.m68556a(C71529w.f160312j, a2);
                }
                int i = Integer.MAX_VALUE;
                String str = "";
                for (String str2 : C71529w.f160312j.keySet()) {
                    Integer num = C71529w.f160312j.get(str2);
                    if (num == null) {
                        C89219l.m154715b();
                    }
                    Integer num2 = num;
                    if (num2 == null || num2.intValue() != -1) {
                        Integer num3 = C71529w.f160312j.get(str2);
                        if (num3 == null) {
                            C89219l.m154715b();
                        }
                        if (C89219l.m154703a(num3.intValue(), i) < 0) {
                            Integer num4 = C71529w.f160312j.get(str2);
                            if (num4 == null) {
                                C89219l.m154715b();
                            }
                            i = num4.intValue();
                            C89219l.m154716b(str2, "");
                            str = str2;
                        }
                    }
                }
                if (C65330a.m117012a() && C71529w.f160312j.containsKey("music")) {
                    Integer num5 = C71529w.f160312j.get("music");
                    if (num5 == null) {
                        C89219l.m154715b();
                    }
                    Integer num6 = num5;
                    if ((num6 == null || num6.intValue() != -1) && C71516s.m126392b() && (!C89219l.m154714a((Object) str, (Object) "canvas_gesture"))) {
                        C71516s.m126391a().storeBoolean("shown", true);
                        str = "music";
                    }
                }
                if (str.length() > 0) {
                    switch (str.hashCode()) {
                        case -1890252483:
                            if (!str.equals("sticker")) {
                                return;
                            }
                            break;
                        case -1306084975:
                            if (str.equals("effect")) {
                                aVar.mo87563a();
                                return;
                            }
                            return;
                        case 3556653:
                            if (str.equals("text")) {
                                aVar.mo87569g();
                                return;
                            }
                            return;
                        case 104263205:
                            if (str.equals("music")) {
                                aVar.mo87564b();
                                return;
                            }
                            return;
                        case 112386354:
                            if (str.equals("voice")) {
                                aVar.mo87566d();
                                return;
                            }
                            return;
                        case 568411439:
                            if (!str.equals("countdown_sticker")) {
                                return;
                            }
                            break;
                        case 1302272874:
                            if (str.equals("cut_optimized")) {
                                aVar.mo87568f();
                                return;
                            }
                            return;
                        case 1523687778:
                            if (str.equals("canvas_gesture")) {
                                aVar.mo87567e();
                                return;
                            }
                            return;
                        case 1878342255:
                            if (!str.equals("custom_sticker")) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                    aVar.mo87565c();
                }
            }
        }
    }

    /* renamed from: a */
    public final Intent mo111757a(VideoPublishEditModel videoPublishEditModel) {
        C70980c.m125333a(videoPublishEditModel);
        if (!m125018c(videoPublishEditModel).isSegmentsNotValid() || m124997I()) {
            return m125014b(videoPublishEditModel);
        }
        if (this.f158485k.isPhotoMvMode) {
            m125010a(R.string.h8m, R.string.a8y, R.string.as0);
            return null;
        }
        m125010a(R.string.h8l, R.string.a8y, R.string.c45);
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: b */
    public final void mo59493b(boolean z) {
        this.f158477H.mo87780b(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x027a, code lost:
        if (r0.booleanValue() == false) goto L_0x0281;
     */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 1968
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: b */
    private void m125015b(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        this.f158484j = false;
        C82080c.m142102a(new AbstractC82074b.C82079e(this, intent, videoPublishEditModel));
    }

    /* renamed from: a */
    private static String m125009a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m125011a(Activity activity, Intent intent) {
        intent.setClass(activity, VEVideoPublishEditActivity.class);
        C84412c.m145199a(activity, intent, intent.getIntExtra("extra_request_code", 1002));
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        VideoPublishEditModel videoPublishEditModel;
        if (i != 4 || (videoPublishEditModel = this.f158485k) == null || !C70976bp.m125314j(videoPublishEditModel)) {
            for (AbstractC84917a aVar : this.f158473D) {
                if (aVar.onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
            if (i != 4) {
                return super.onKeyDown(i, keyEvent);
            }
            Fragment a = getSupportFragmentManager().mo3549a(R.id.dlw);
            if (a != null) {
                getSupportFragmentManager().mo3552a().mo3455a(a).mo3467b();
                return true;
            }
            mo111790z();
            return true;
        }
        finish();
        return true;
    }

    /* renamed from: a */
    public static void m125012a(Context context, Intent intent) {
        intent.setClass(context, VEVideoPublishEditActivity.class);
        C84412c.m145201a(context, intent);
    }

    /* renamed from: a */
    private void m125013a(Intent intent, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        intent.putParcelableArrayListExtra("original_segments", multiEditVideoStatusRecordData.originalSegments);
        intent.putExtra("original_music_start", multiEditVideoStatusRecordData.originalMusicStart);
        intent.putExtra("retake_shoot_mode", 2);
        if (this.f158485k.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) this.f158485k.getStitchParams());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59490a(int i, int i2) {
        this.f158477H.mo87778a(i, i2);
        this.f158490p.mo114811c(i);
        this.f158490p.mo114814d(i2);
    }

    /* renamed from: b */
    private void m125017b(final boolean z, final Intent intent, final VideoPublishEditModel videoPublishEditModel) {
        this.f158489o = false;
        m124994F().mo56307a(new VEListener.AbstractC85247p() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.C707802 */

            static {
                Covode.recordClassIndex(83264);
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85247p
            /* renamed from: a */
            public final void mo87653a() {
                VEVideoPublishEditActivity.this.f158489o = false;
                VEVideoPublishEditActivity.this.mo111765a(z, intent, videoPublishEditModel);
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85247p
            /* renamed from: b */
            public final void mo87654b() {
                VEVideoPublishEditActivity.this.f158489o = true;
                VEVideoPublishEditActivity.this.mo111765a(z, intent, videoPublishEditModel);
            }
        });
    }

    /* renamed from: a */
    private void m125010a(int i, int i2, int i3) {
        new C17197a.C17200a(this).mo27194b(i).mo27195b(i2, (DialogInterface.OnClickListener) null, false).mo27190a(i3, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70814an(this), false).mo27193a().mo27184b();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002) {
            Intent intent2 = new Intent();
            if (!(intent == null || m125008a(intent) == null)) {
                intent2.putExtra("edit result", "PublishEditActivity success".concat(String.valueOf(m125008a(intent).getString("publish result"))));
                intent2.putExtras(m125008a(intent));
            }
            setResult(i2, intent2);
            if (i2 == -1) {
                finish();
            }
        } else if (i == 8) {
            if (i2 == 9) {
                Intent intent3 = new Intent();
                if (!(intent == null || m125008a(intent) == null)) {
                    intent3.putExtras(m125008a(intent));
                }
                setResult(i2, intent3);
                finish();
            }
        } else if (i == 10004 && i2 == -1 && intent.hasExtra("custom_sticker") && intent.hasExtra("custom_sticker_image_info")) {
            this.f158495u.mo87640a((Effect) intent.getParcelableExtra("custom_sticker"), (CustomStickerInfo) intent.getParcelableExtra("custom_sticker_image_info"));
        }
    }
}
