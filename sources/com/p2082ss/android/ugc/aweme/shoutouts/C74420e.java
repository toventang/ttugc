package com.p2082ss.android.ugc.aweme.shoutouts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65610b;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.publish.Publish;
import com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.p2082ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69783m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.C69787n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoPublishActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72588aa;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72692z;
import com.p2082ss.android.ugc.aweme.shoutouts.ShoutOutVideoDownloader;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.e */
public final class C74420e implements IShoutOutsService {

    /* renamed from: a */
    private boolean f167356a = true;

    /* renamed from: b */
    private boolean f167357b = true;

    /* renamed from: c */
    private int f167358c;

    /* renamed from: d */
    private boolean f167359d;

    static {
        Covode.recordClassIndex(87198);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final int getAuthorCount() {
        return this.f167358c;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getInFollowingTab() {
        return this.f167357b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getInMainTab() {
        return this.f167356a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getUseShoutoutAuthor() {
        return this.f167359d;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final C74428i getShoutOutSettingsModel() {
        return C74427h.m130883a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.e$b */
    static final class CallableC74422b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C74420e f167364a;

        static {
            Covode.recordClassIndex(87200);
        }

        CallableC74422b(C74420e eVar) {
            this.f167364a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            MethodCollector.m26663i(6518);
            synchronized (this.f167364a) {
                try {
                    C84902i.m145899c(C74424f.m130880a());
                } catch (Throwable th) {
                    MethodCollector.m26664o(6518);
                    throw th;
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(6518);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.e$a */
    public static final class C74421a implements IDraftService.DraftSaveListener {

        /* renamed from: a */
        final /* synthetic */ C74420e f167360a;

        /* renamed from: b */
        final /* synthetic */ C43223c f167361b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f167362c;

        /* renamed from: d */
        final /* synthetic */ VideoPublishEditModel f167363d;

        static {
            Covode.recordClassIndex(87199);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
        public final void onDraftSaveSuccess() {
            AbstractC63275c c = C63244g.m114602a().mo73275c();
            C43223c cVar = this.f167361b;
            C89219l.m154716b(cVar, "");
            c.mo101844a(cVar, true);
            AbstractC63194at.AbstractC63195a a = C63238c.f143566D.mo73308d().mo101651a();
            C43223c cVar2 = this.f167361b;
            C89219l.m154716b(cVar2, "");
            a.mo101660b(cVar2);
            if (this.f167362c != null) {
                new C72692z(this.f167362c, new C72588aa(this.f167362c, this.f167363d)).mo114966a(this.f167361b);
            }
            this.f167360a.mo117048a(this.f167362c, this.f167363d);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
        public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
            C89219l.m154721d(draftSaveResult, "");
            this.f167360a.mo117048a(this.f167362c, this.f167363d);
        }

        C74421a(C74420e eVar, C43223c cVar, ActivityC0945e eVar2, VideoPublishEditModel videoPublishEditModel) {
            this.f167360a = eVar;
            this.f167361b = cVar;
            this.f167362c = eVar2;
            this.f167363d = videoPublishEditModel;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setAuthorCount(int i) {
        this.f167358c = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setInFollowingTab(boolean z) {
        this.f167357b = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setInMainTab(boolean z) {
        this.f167356a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setUseShoutoutAuthor(boolean z) {
        this.f167359d = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean isShoutoutPostDialog(Object obj) {
        if (obj != null && (obj instanceof VideoPublishEditModel)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.mShoutOutsData == null || !(!C89219l.m154714a((Object) videoPublishEditModel.mShoutOutsData.getShoutOutsMode(), (Object) C74418d.MODE_POST))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.e$c */
    static final class C74423c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f167365a;

        /* renamed from: b */
        final /* synthetic */ String f167366b;

        /* renamed from: c */
        final /* synthetic */ ShoutoutVideoDownloadListener f167367c;

        static {
            Covode.recordClassIndex(87201);
        }

        C74423c(ActivityC0945e eVar, String str, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener) {
            this.f167365a = eVar;
            this.f167366b = str;
            this.f167367c = shoutoutVideoDownloadListener;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (!this.f167365a.isFinishing()) {
                ShoutOutVideoDownloader shoutOutVideoDownloader = new ShoutOutVideoDownloader(this.f167366b, C74424f.m130880a(), String.valueOf(System.currentTimeMillis()) + "shoutout.mp4", this.f167367c, this.f167365a);
                shoutOutVideoDownloader.f167271f.getLifecycle().mo4012a(shoutOutVideoDownloader);
                shoutOutVideoDownloader.f167266a = Downloader.with(C40963b.m82473a()).url(shoutOutVideoDownloader.f167267b).name(shoutOutVideoDownloader.f167269d).savePath(shoutOutVideoDownloader.f167268c).retryCount(3).subThreadListener(new ShoutOutVideoDownloader.C74376b(shoutOutVideoDownloader)).download();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivity(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        C84911q.m145921a("SHOUTOUTTOOLSstartShoutoutsPublishActivity");
        intent.setClass(activity, ShoutOutsPublishActivity.class);
        C84412c.m145201a(activity, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void publishShoutOuts(ActivityC0945e eVar, Object obj) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(obj, "");
        C69905c cVar = C70005cr.m123611a().f156482a;
        if ((cVar == null || cVar.isCommerceMusic()) && C63238c.f143594u.mo93903b()) {
            C70005cr.m123611a().mo110453c();
            C70005cr a = C70005cr.m123611a();
            C89219l.m154716b(a, "");
            a.f156488g = false;
            C70005cr a2 = C70005cr.m123611a();
            C89219l.m154716b(a2, "");
            a2.f156489h = false;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            C43223c a3 = C73560cj.m129685a(videoPublishEditModel);
            StringBuilder sb = new StringBuilder("[handleSaveDraftBeforePublishNew]: creation id = ");
            C89219l.m154716b(a3, "");
            C43213k.m86181a(sb.append(a3.mo73676f()).toString());
            C70005cr.m123611a().f156496p = a3.mo73726r();
            C69787n.m123312a(new AbstractC69783m.C69786c(a3, 1, videoPublishEditModel, new C74421a(this, a3, eVar, videoPublishEditModel)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivityFromNative(Activity activity, C74418d dVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(dVar, "");
        Intent intent = new Intent(activity, ShoutOutsPublishActivity.class);
        if (!TextUtils.isEmpty(dVar.getProductId()) && dVar.getPrice() != null) {
            C74426g price = dVar.getPrice();
            if (price == null) {
                C89219l.m154715b();
            }
            if (price.getMoneyDes() != null) {
                C84911q.m145921a("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromNative");
                intent.putExtra("shout_out_from_dl", true);
                if (TextUtils.isEmpty(dVar.getCoverUrl())) {
                    dVar.setReviewed(1);
                }
                intent.putExtra("shout_out_data", dVar);
                C84412c.m145201a(activity, intent);
            }
        }
    }

    /* renamed from: a */
    public final void mo117048a(ActivityC0945e eVar, VideoPublishEditModel videoPublishEditModel) {
        setInMainTab(true);
        setInFollowingTab(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        videoPublishEditModel.setSaveModel(C63244g.m114602a().mo73287o().mo104794n().mo104626a(videoPublishEditModel, 1, true, C65610b.f147850a));
        C77816g.m135934a(C72700q.m128164a(videoPublishEditModel), C72700q.m128165b(videoPublishEditModel), EnumC77814e.PUBLISH, EnumC77814e.SEND_REQUEST);
        videoPublishEditModel.userClickPublishTime = uptimeMillis;
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        Intent intent = eVar.getIntent();
        if (intent == null) {
            C89219l.m154715b();
        }
        bundle.putInt("extra_stick_point_type", intent.getIntExtra("extra_stick_point_type", 0));
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", 0);
        C51423a.m95787a("VideoPublishService.createBundleParams()  bundle=".concat(String.valueOf(bundle)));
        C39162r.m79460a("av_video_memory", new C33744d().mo59983a("log", "VideoPublishService.createBundleParams()  bundle=".concat(String.valueOf(bundle))).f79943a);
        Publish.PublishBundle = bundle;
        C69787n.m123312a(new AbstractC69783m.C69785b(eVar, bundle, null));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivityFromDL(Activity activity, Uri uri) {
        C74381a aVar;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        Intent intent = new Intent(activity, ShoutOutsPublishActivity.class);
        String queryParameter = uri.getQueryParameter("product_id");
        String queryParameter2 = uri.getQueryParameter("data");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
            C84911q.m145926b("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL pid data empty ");
            return;
        }
        try {
            C74418d dVar = (C74418d) new C27910f().mo46670a(queryParameter2, C74418d.class);
            if (dVar != null) {
                dVar.setProductId(queryParameter);
                if (dVar != null) {
                    C74426g price = dVar.getPrice();
                    if (price != null) {
                        aVar = price.getBuyerMoneyDes();
                    } else {
                        aVar = null;
                    }
                    dVar.setBuyerMoneyDes(aVar);
                    C74426g price2 = dVar.getPrice();
                    if (price2 != null) {
                        price2.setBuyerMoneyDes(null);
                    }
                    intent.putExtra("shout_out_from_dl", true);
                    intent.putExtra("shout_out_data", dVar);
                    intent.putExtra("route_uri", uri.toString());
                    C84412c.m145201a(activity, intent);
                    return;
                }
            }
            C84911q.m145926b("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL null shoutOutsData ");
        } catch (Exception e) {
            C84911q.m145926b("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL" + e.toString());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startDownLoadVideo(ActivityC0945e eVar, String str, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(shoutoutVideoDownloadListener, "");
        if (C63238c.m114591a()) {
            new C79459a(eVar).mo123050a(R.string.bzt).mo123053a();
            C84911q.m145921a("SHOUTOUTTOOLSstartDownLoadVideo isRecording");
            return;
        }
        C1731i.m5640b(new CallableC74422b(this), C1731i.f5562a).mo5534a(new C74423c(eVar, str, shoutoutVideoDownloadListener), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishSyncActivity(Activity activity, String str, String str2, String str3) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C63238c.m114591a()) {
            Context applicationContext = activity.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            new C79459a(applicationContext).mo123050a(R.string.bzt).mo123053a();
            C84911q.m145921a("SHOUTOUTTOOLSstartShoutoutsPublishSyncActivity isRecording ");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_enter_from_shoutout_sync", true);
        intent.putExtra("extra_shoutout_video_path", str);
        intent.putExtra("extra_shoutout_pid", str2);
        intent.putExtra("extra_shoutout_music_id", str3);
        intent.setClass(activity, VideoPublishActivity.class);
        C84412c.m145201a(activity, intent);
    }
}
