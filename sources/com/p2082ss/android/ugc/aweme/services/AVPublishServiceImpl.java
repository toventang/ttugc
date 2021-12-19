package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.external.C47166i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import com.p2082ss.android.ugc.aweme.publish.C65686s;
import com.p2082ss.android.ugc.aweme.publish.CallableC65685r;
import com.p2082ss.android.ugc.aweme.scheduler.C67294f;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.scheduler.C67327j;
import com.p2082ss.android.ugc.aweme.scheduler.PublishService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.setting.C68039bx;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73762p;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73514bm;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73793t;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73812u;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73813v;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoPublishActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.C74087e;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77390a;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80345dj;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import p077b.C1731i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AVPublishServiceImpl */
public class AVPublishServiceImpl implements IAVPublishService {
    private static AVPublishServiceImpl sInstance;
    public ActivityC0945e liveActivity;
    private C17197a liveDialog;
    private IAVPublishService.onLivePublishCallback livePublishCallback;
    private IAVPublishService.LiveThumCallback liveThumCallback;
    public Dialog mShoutOutsUploadRecoverDialog;
    public AbstractC73762p mUploadRecoverPopView;

    static {
        Covode.recordClassIndex(79551);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_AVPublishServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m120100x2258cc79(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void addChallenge(Challenge challenge) {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean getKitManageRegister() {
        return C70005cr.f156480s;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public IAVPublishService.onLivePublishCallback getLivePublishCallback() {
        return this.livePublishCallback;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public IAVPublishService.LiveThumCallback getLiveThumCallback() {
        return this.liveThumCallback;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public C69905c getCurMusic() {
        return C70005cr.m123611a().f156482a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public Boolean getHasOpenCommercialSoundPage() {
        return C70005cr.m123611a().f156489h;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public String getShootWay() {
        return C70005cr.m123611a().f156486e;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isParallelPublishEnabled() {
        return C68747m.m121180a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPhotoMvModeMusic() {
        return C70005cr.m123611a().f156483b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishing() {
        return C67296h.m119245e();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void resetNewCreateWay() {
        C70005cr.m123611a().mo110453c();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean restoreWorkExperimentDisableCover() {
        if (!C68039bx.f152400a) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public int getAddVideosExperiConsuSideCode() {
        return C16048b.m29633a().mo25412a(true, "studio_add_tt_videos_in_caption_consumption", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public String getCurrentPublishTaskId() {
        if (C68747m.m121180a()) {
            return C67327j.f150875b.mo106173f();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public int getParallelPublishTaskSize() {
        return C63244g.m114602a().mo73287o().mo104785e();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public Boolean isFromCommercialSoundPage() {
        return Boolean.valueOf(C70005cr.m123611a().f156488g.booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isInShoutout() {
        return C70005cr.m123611a().f156494n.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean needRestore() {
        return C63238c.f143565C.mo73276d().mo101835d();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean usedBusiSticker() {
        return C70005cr.m123611a().f156493m.booleanValue();
    }

    static final /* synthetic */ Boolean lambda$tryRestorePublish$0$AVPublishServiceImpl() {
        if (C63238c.m114591a()) {
            return false;
        }
        return Boolean.valueOf(C63238c.f143565C.mo73276d().mo101834c());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelRestoreOnMain() {
        RecordScene b = C71833a.m126851b();
        C72867e.m128688b(b.creationId);
        C70005cr.m123611a().f156498r = false;
        C70005cr.m123611a();
        C70005cr.m123612a(b);
        C71833a.m126843a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public AVChallenge getCurChallenge() {
        if (C13603b.m24435a((Collection) C70005cr.m123611a().f156485d)) {
            return null;
        }
        return C70005cr.m123611a().f156485d.get(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isParallelPublishTaskFinished() {
        if (!C68747m.m121180a() || C67327j.f150875b.mo106168b() > 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void showUploadingDialog() {
        C17197a aVar = this.liveDialog;
        if (aVar != null && !aVar.mo27183a()) {
            this.liveDialog.mo27185c();
        }
        this.liveDialog = null;
    }

    public static AVPublishServiceImpl getInstance() {
        MethodCollector.m26663i(6069);
        if (sInstance == null) {
            synchronized (C47166i.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AVPublishServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6069);
                    throw th;
                }
            }
        }
        AVPublishServiceImpl aVPublishServiceImpl = sInstance;
        MethodCollector.m26664o(6069);
        return aVPublishServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean enableShowPrePublishUserSwitch() {
        if (!C74087e.m130277a() || !C63244g.m114602a().mo73255A().mo93903b() || C63244g.m114602a().mo73255A().mo93901a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishable() {
        if (C68747m.m121180a()) {
            if (StoryPublishServiceImpl.m135314a().isStoryPublishing()) {
                return false;
            }
            return true;
        } else if (isPublishing() || StoryPublishServiceImpl.m135314a().isStoryPublishing()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public List<C72678q> getAllPublishModel() {
        if (C68747m.m121180a()) {
            C73991bj.m130128a("getAllPublishModel size=" + C67327j.f150875b.mo106168b());
            return C67327j.f150875b.mo106172e();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : C67296h.f150793a.mo106182b(null)) {
            if (!(t.f150840b instanceof AbstractC72685x.C72686a)) {
                arrayList.add(t.f150844f);
            }
        }
        C73991bj.m130128a("getAllPublishModel size=" + arrayList.size());
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setKitManageRegister(boolean z) {
        C70005cr.f156480s = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean checkIsAlreadyPublished(Context context) {
        C70005cr.m123611a();
        return C70005cr.m123613a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean endWithHashTag(String str) {
        return C80345dj.m139307a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean inPublishPage(Context context) {
        C70005cr.m123611a();
        return C70005cr.m123616g();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishServiceRunning(Context context) {
        return C67296h.m119245e();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setMusicChooseType(int i) {
        C70005cr.m123611a().f156487f = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setPublishStatus(int i) {
        C70005cr.m123611a().mo110449a(i);
    }

    /* renamed from: lambda$showLighteningPublishSuccessPopWindow$4$AVPublishServiceImpl */
    static final /* synthetic */ void m120102x178101df(C73793t tVar) {
        if (tVar.isShowing()) {
            tVar.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void addMusic(MusicModel musicModel) {
        C70005cr.m123611a().mo70083a(C63238c.f143581h.mo101543b(musicModel));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelRestoreOnMain(Activity activity) {
        C63238c.f143565C.mo73276d().mo101830a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean containEmoji(String str) {
        return Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?])").matcher(str).find();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$uploadRecoverPopViewSetVisibility$2$AVPublishServiceImpl(boolean z) {
        AbstractC73762p pVar = this.mUploadRecoverPopView;
        if (pVar != null && pVar.isShowing()) {
            this.mUploadRecoverPopView.mo116122a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setCurMusic(MusicModel musicModel) {
        C70005cr.m123611a().mo70083a(C63238c.f143581h.mo101543b(musicModel));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setFakeMusic(MusicModel musicModel) {
        C70005cr.m123611a().f156484c = C63238c.f143581h.mo101543b(musicModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setFromCommercialSoundPage(boolean z) {
        C70005cr.m123611a().f156488g = Boolean.valueOf(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setHasOpenCommercialSoundPage(boolean z) {
        C70005cr.m123611a().f156489h = Boolean.valueOf(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setHashTagRegex(String str) {
        if (!TextUtils.isEmpty(str)) {
            C80345dj.f179877a = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelSynthetise(Context context) {
        C63244g.m114602a().mo73287o().mo104790j().mo104829a(context, "MainBusiness");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public Bitmap getCover(C72678q qVar) {
        Bitmap b = C67296h.m119236b(qVar);
        if (b != null) {
            return b;
        }
        if (C82306a.m142357a()) {
            return C77390a.m135321a(qVar);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public ViewGroup getPublishAddVideoContainer(Activity activity) {
        C73560cj cjVar;
        if (activity == null || !(activity instanceof VideoPublishActivity) || (cjVar = ((VideoPublishActivity) activity).f164774d) == null) {
            return null;
        }
        return cjVar.f165260C;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public C72678q getPublishModel(String str) {
        C72678q c;
        if (!C82306a.m142357a() || TextUtils.isEmpty(str) || (c = C77390a.m135331c(str)) == null) {
            return C67296h.m119229a(str);
        }
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setDestroyFlag(Activity activity) {
        C73560cj cjVar;
        if (activity != null && (activity instanceof VideoPublishActivity) && (cjVar = ((VideoPublishActivity) activity).f164774d) != null && cjVar.f165343r != null) {
            cjVar.f165343r.f160930u = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void removePublishCallback(AbstractC74304x<C69831ai> xVar) {
        C89219l.m154721d(xVar, "");
        C73991bj.m130133d("PublishScheduler | removeCallback call " + ((String) null));
        if (C68747m.m121180a()) {
            C67296h.f150794b.execute(new C67296h.RunnableC67308l(xVar));
        } else {
            C67296h.f150794b.execute(new C67296h.RunnableC67309m(xVar));
        }
        if (C82306a.m142357a()) {
            C77390a.m135326a(xVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void uploadRecoverPopViewSetVisibility(boolean z) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            AbstractC73762p pVar = this.mUploadRecoverPopView;
            if (pVar != null && pVar.isShowing()) {
                this.mUploadRecoverPopView.mo116122a(z);
                return;
            }
            return;
        }
        this.mUploadRecoverPopView.mo116123c().runOnUiThread(new AVPublishServiceImpl$$Lambda$2(this, z));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean processPublish(ActivityC0945e eVar, Intent intent) {
        return C65682o.m117577a(eVar, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void startPublish(ActivityC0945e eVar, Bundle bundle) {
        C65682o.m117573a(eVar, bundle, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void publishFromDraft(final ActivityC0945e eVar, final C43223c cVar) {
        AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("WaterMark", new SimpleServiceLoadCallback() {
            /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.C678531 */

            static {
                Covode.recordClassIndex(79557);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public void onLoad(AsyncAVService asyncAVService, long j) {
                C65682o.m117574a(eVar, cVar);
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void showRestoreWorkDialog(Activity activity, String str) {
        C63238c.f143565C.mo73276d().mo101831a(activity, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void addPublishCallback(AbstractC74304x<C69831ai> xVar, String str) {
        if (C82306a.m142357a() && str != null && C77390a.m135331c(str) != null) {
            C77390a.m135325a(new C67294f(xVar), str, false);
        } else if (C67296h.m119229a(str) != null) {
            C67296h.m119235a(new C67294f(xVar), str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void showLighteningPublishSuccessPopWindow(final ActivityC0945e eVar, Aweme aweme) {
        if (eVar.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            final C73793t tVar = new C73793t(eVar, aweme);
            C678584 r4 = new AbstractC33974au() {
                /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.C678584 */

                static {
                    Covode.recordClassIndex(79562);
                }

                @Override // androidx.lifecycle.AbstractC1202k
                public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
                    if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
                public void onDestroy() {
                    eVar.getLifecycle().mo4013b(this);
                    tVar.dismiss();
                }
            };
            tVar.setOnDismissListener(new AVPublishServiceImpl$$Lambda$3(eVar, r4));
            new SafeHandler(eVar).postDelayed(new AVPublishServiceImpl$$Lambda$4(tVar), 4000);
            tVar.mo116124d();
            eVar.getLifecycle().mo4012a(r4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void showLivePublishFailedPopwindow(final ActivityC0945e eVar, final String str) {
        ActivityC0945e eVar2 = this.liveActivity;
        if (eVar2 != null && !eVar2.isFinishing()) {
            this.liveActivity.runOnUiThread(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.RunnableC678595 */

                static {
                    Covode.recordClassIndex(79563);
                }

                public void run() {
                    new C73812u(AVPublishServiceImpl.this.liveActivity, str);
                }
            });
        } else if (eVar != null && !eVar.isFinishing()) {
            eVar.runOnUiThread(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.RunnableC678606 */

                static {
                    Covode.recordClassIndex(79564);
                }

                public void run() {
                    new C73812u(eVar, str);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void tryRestorePublish(ActivityC0945e eVar, AbstractC89172b<Boolean, Void> bVar) {
        if (isPublishing()) {
            return;
        }
        if (isPublishServiceRunning(eVar)) {
            C40970e.m82485a("continue publish");
            m120100x2258cc79("wht_publish", "continuePublish");
            C84911q.m145928d("PublishServiceImpl continue publish");
            C40971f.m82489a("AVPublishServiceImpl !isPublishing() isPublishServiceRunning");
            C63238c.f143576c.mo93772b(eVar);
            return;
        }
        C1731i.m5640b(AVPublishServiceImpl$$Lambda$0.$instance, C77807b.f174559a).mo5534a(new AVPublishServiceImpl$$Lambda$1(bVar), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void hideUploadRecoverWindow(Context context, boolean z) {
        Dialog dialog = this.mShoutOutsUploadRecoverDialog;
        if (dialog != null && dialog.isShowing()) {
            if (C68747m.m121180a()) {
                C63244g.m114602a().mo73287o().mo104793m().mo104826b();
            } else {
                C63244g.m114602a().mo73287o().mo104793m().mo104825a(null);
            }
            PublishService.C67284a.m119208a();
            C84911q.m145928d("Publish | remove recover path by dismiss panel so");
            this.mShoutOutsUploadRecoverDialog.dismiss();
            this.mShoutOutsUploadRecoverDialog = null;
        }
        AbstractC73762p pVar = this.mUploadRecoverPopView;
        if (pVar != null && pVar.isShowing()) {
            if (z) {
                new C79459a(context).mo123050a(R.string.z0).mo123053a();
            }
            this.mUploadRecoverPopView.dismiss();
            this.mUploadRecoverPopView = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void setCurMusic(MusicModel musicModel, Boolean bool, Boolean bool2) {
        C70005cr.m123611a().mo110451a(C63238c.f143581h.mo101543b(musicModel), bool2.booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void showLivePublishSuccessPopwindow(final ActivityC0945e eVar, final String str, final String str2) {
        ActivityC0945e eVar2 = this.liveActivity;
        if (eVar2 != null && !eVar2.isFinishing()) {
            this.liveActivity.runOnUiThread(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.RunnableC678617 */

                static {
                    Covode.recordClassIndex(79565);
                }

                public void run() {
                    new C73813v(AVPublishServiceImpl.this.liveActivity, str, str2);
                }
            });
        } else if (eVar != null && !eVar.isFinishing()) {
            eVar.runOnUiThread(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.RunnableC678628 */

                static {
                    Covode.recordClassIndex(79566);
                }

                public void run() {
                    new C73813v(eVar, str, str2);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void showUploadRecoverIfNeed(final boolean z, final ActivityC0945e eVar, final String str, final String str2, final String str3) {
        AbstractC73762p pVar = this.mUploadRecoverPopView;
        if (pVar != null && pVar.isShowing()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("scene", str);
            C22708a.m42801a("show multiple upload recover popup", hashMap);
        }
        m120100x2258cc79("AVPublishServiceImpl", "showUploadRecoverIfNeed");
        if (!C68747m.m121180a() || str3 == null) {
            C65682o.m117572a(eVar, new IDraftService.OnGetRecoverDraftCallback() {
                /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.C678563 */

                static {
                    Covode.recordClassIndex(79560);
                }

                /* renamed from: com_ss_android_ugc_aweme_services_AVPublishServiceImpl$3_com_ss_android_ugc_aweme_lancet_LogLancet_d */
                public static int m120104xecba1148(String str, String str2) {
                    return 0;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService.OnGetRecoverDraftCallback
                public void onFail() {
                    IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(eVar, IVideoRecordPreferences.class);
                    String uploadRecoverPath = iVideoRecordPreferences.getUploadRecoverPath("");
                    m120104xecba1148("sofina", "showUploadRecoverIfNeed isServerException = " + z + "  " + uploadRecoverPath);
                    if (z || !TextUtils.isEmpty(uploadRecoverPath)) {
                        iVideoRecordPreferences.setUploadRecoverPath("");
                        new C79459a(eVar).mo123050a(R.string.a56).mo123053a();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService.OnGetRecoverDraftCallback
                public void onSuccess(final C43223c cVar) {
                    m120104xecba1148("AVPublishServiceImpl", "showUploadRecoverIfNeed onSuccess");
                    if (cVar.f100900W.f100788aU == null || cVar.f100900W.f100788aU.getShoutOutsMode().equals(C74418d.MODE_POST)) {
                        AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("AVPublishServiceImpl", new SimpleServiceLoadCallback() {
                            /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.C678563.C678571 */

                            static {
                                Covode.recordClassIndex(79561);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public void onLoad(AsyncAVService asyncAVService, long j) {
                                AVPublishServiceImpl.this.mUploadRecoverPopView = C73514bm.m129649a(eVar, cVar, z, false);
                                if (!TextUtils.isEmpty(str2)) {
                                    AVPublishServiceImpl.this.mUploadRecoverPopView.mo116121a(str2);
                                    C39162r.m79460a("show_publish_unavailable_sound_toast", new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("creation_id", cVar.mo73676f()).mo129406a("user_id", C63238c.f143594u.mo93906e().mo58660c()).f188764a);
                                }
                                AVPublishServiceImpl.this.mUploadRecoverPopView.mo116124d();
                            }
                        });
                    } else if (!"AvApiFragmentObserver onAttach".equals(str)) {
                        AVPublishServiceImpl.this.mShoutOutsUploadRecoverDialog = C73514bm.m129648a(eVar, cVar);
                    }
                }
            });
            return;
        }
        C1731i.m5640b(new CallableC65685r(str3), C77807b.f174559a).mo5534a(new C65686s(new IDraftService.OnGetRecoverDraftCallback() {
            /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.C678542 */

            static {
                Covode.recordClassIndex(79558);
            }

            /* renamed from: com_ss_android_ugc_aweme_services_AVPublishServiceImpl$2_com_ss_android_ugc_aweme_lancet_LogLancet_d */
            public static int m120103x52194ec7(String str, String str2) {
                return 0;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService.OnGetRecoverDraftCallback
            public void onFail() {
                m120103x52194ec7("sofina", "showUploadRecoverIfNeed isServerException = " + z + "  " + str3);
                if (z || !TextUtils.isEmpty(str3)) {
                    new C79459a(eVar).mo123050a(R.string.a56).mo123053a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService.OnGetRecoverDraftCallback
            public void onSuccess(final C43223c cVar) {
                m120103x52194ec7("AVPublishServiceImpl", "showUploadRecoverIfNeed onSuccess");
                if (cVar.f100900W.f100788aU == null || cVar.f100900W.f100788aU.getShoutOutsMode().equals(C74418d.MODE_POST)) {
                    AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("AVPublishServiceImpl", new SimpleServiceLoadCallback() {
                        /* class com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl.C678542.C678551 */

                        static {
                            Covode.recordClassIndex(79559);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                        public void onLoad(AsyncAVService asyncAVService, long j) {
                            AVPublishServiceImpl.this.mUploadRecoverPopView = C73514bm.m129649a(eVar, cVar, z, true);
                            if (!TextUtils.isEmpty(str2)) {
                                AVPublishServiceImpl.this.mUploadRecoverPopView.mo116121a(str2);
                                C39162r.m79460a("show_publish_unavailable_sound_toast", new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("creation_id", cVar.mo73676f()).mo129406a("user_id", C63238c.f143594u.mo93906e().mo58660c()).f188764a);
                            }
                            AVPublishServiceImpl.this.mUploadRecoverPopView.mo116124d();
                        }
                    });
                } else if (!"AvApiFragmentObserver onAttach".equals(str)) {
                    AVPublishServiceImpl.this.mShoutOutsUploadRecoverDialog = C73514bm.m129648a(eVar, cVar);
                }
            }
        }), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService
    public void addMyVideoChain(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        HashTagMentionEditText hashTagMentionEditText;
        String str7 = str;
        if (activity != null && (activity instanceof VideoPublishActivity)) {
            C73560cj cjVar = ((VideoPublishActivity) activity).f164774d;
            if (cjVar != null) {
                hashTagMentionEditText = cjVar.f165350y;
            } else {
                hashTagMentionEditText = null;
            }
            try {
                if (C63238c.f143580g.mo93848b().booleanValue()) {
                    str7 = str2;
                }
                if (hashTagMentionEditText != null) {
                    hashTagMentionEditText.mo116537a(str7, str3, str4, str5, str6, i, i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
