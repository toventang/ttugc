package com.p2082ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42064b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.live.AbstractC58648k;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.services.publish.Publish;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C71818ev;
import com.p2082ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.story.model.C77379b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.port.internal.MainActivityCallback */
public class MainActivityCallback implements AbstractC74304x<C69831ai>, AbstractC74304x {

    /* renamed from: a */
    AbstractC72630h f143625a;

    /* renamed from: b */
    C63273a f143626b;

    /* renamed from: c */
    public IAVPublishService f143627c;

    /* renamed from: d */
    public C72678q f143628d;

    /* renamed from: e */
    public boolean f143629e;

    /* renamed from: f */
    private final String f143630f;

    /* renamed from: g */
    private C63283j f143631g;

    /* renamed from: h */
    private ActivityC0945e f143632h;

    static {
        Covode.recordClassIndex(74548);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onParallelPublishCancel() {
        Publish.isInPublish = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onParallelPublishPause() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onParallelPublishResume() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onProgressUpdate(int i, boolean z) {
    }

    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onSynthetiseSuccess(String str) {
    }

    /* renamed from: a */
    private void m114718a() {
        AbstractC72630h hVar = this.f143625a;
        if (hVar != null) {
            hVar.mo101825b(this);
        }
        this.f143625a = null;
        this.f143626b = null;
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        if (!this.f143632h.getClass().equals(AVExternalServiceImpl.m113114a().classnameService().getVideoPublishActivityClass())) {
            m114718a();
        }
    }

    /* renamed from: a */
    public static boolean m114719a(Activity activity) {
        if ((activity instanceof MainActivity) || (activity instanceof AbstractC58648k)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onError(C71818ev evVar) {
        AbstractC72630h hVar;
        String str;
        Publish.isInPublish = false;
        C63273a aVar = this.f143626b;
        if (!(aVar == null || (hVar = this.f143625a) == null)) {
            int b = hVar.mo101824b();
            Object a = this.f143625a.mo101822a();
            C51423a.m95787a("onError " + b + " and args is " + a);
            ActivityC0945e eVar = aVar.f143635a;
            AbstractC81915c.m141874a(new C77379b(1, null));
            if (evVar.isCauseByApiServerException()) {
                str = ((C34485a) evVar.getCause()).getErrorMsg();
            } else {
                str = null;
            }
            if (evVar.isCauseByNoSpaceLeft()) {
                str = eVar.getString(R.string.g5j);
            } else if (evVar.isUserNetworkBad()) {
                str = eVar.getString(R.string.g5g);
            }
            if (TextUtils.isEmpty(str)) {
                str = eVar.getString(R.string.ey9);
            }
            C71900f fVar = new C71900f(9, 99, null, str);
            fVar.f161092f = evVar.isRecover();
            fVar.f161093g = evVar.isCauseByApiServerException();
            if (aVar.f143637c && C63273a.m114727a()) {
                fVar.f161097k = true;
            } else if (aVar.f143637c || aVar.f143638d) {
                fVar.f161098l = true;
            }
            if (a instanceof BaseShortVideoContext) {
                fVar.f161099m = ((BaseShortVideoContext) a).getDraftPrimaryKey();
            }
            AbstractC81915c.m141875b(fVar);
            if (!aVar.f143637c && !aVar.f143638d && aVar.f143636b && !C39223a.m79589c().mo68606a(1)) {
                new C23144b(eVar).mo37635a(str).mo37637b();
            }
        }
        m114718a();
    }

    public MainActivityCallback(ActivityC0945e eVar, String str) {
        this(eVar, str, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onSuccess(C69831ai aiVar, boolean z) {
        boolean z2;
        boolean z3;
        String videoCoverPath;
        Publish.isInPublish = false;
        if (!(this.f143626b == null || !(aiVar instanceof CreateAwemeResponse) || this.f143625a == null)) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) aiVar;
            String str = "";
            if (!(createAwemeResponse == null || createAwemeResponse.aweme == null || createAwemeResponse.aweme.getVideo() == null || (videoCoverPath = createAwemeResponse.getVideoCoverPath()) == null)) {
                Aweme aweme = createAwemeResponse.aweme;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Uri.fromFile(new File(videoCoverPath)).toString());
                Video video = aweme.getVideo();
                if (video != null) {
                    if (video.getCover() != null) {
                        video.getCover().setUrlList(arrayList);
                    }
                    if (video.getDynamicCover() != null) {
                        video.getDynamicCover().setUrlList(arrayList);
                    }
                    C63283j jVar = this.f143631g;
                    String aid = aweme.getAid();
                    C89219l.m154721d(videoCoverPath, str);
                    if (aid != null) {
                        jVar.f143642a.storeString(aid, videoCoverPath);
                    }
                }
            }
            C63273a aVar = this.f143626b;
            int b = this.f143625a.mo101824b();
            Object a = this.f143625a.mo101822a();
            C51423a.m95787a("onSuccess " + b + " and response is " + aiVar.status_code + " extra is " + aiVar.extra);
            if (!(createAwemeResponse.aweme == null || createAwemeResponse.aweme.getVideo() == null)) {
                Video video2 = createAwemeResponse.aweme.getVideo();
                if (video2.getWidth() == 0 && video2.getHeight() == 0) {
                    video2.setWidth(aiVar.realVideoWidth);
                    video2.setHeight(aiVar.realVideoHeight);
                }
            }
            if (b == 0) {
                LocalVideoPlayerManager.m140055a().mo123960a(AVExternalServiceImpl.m113114a().infoService().convertToExposureData(a).getOutPutFile(), createAwemeResponse.aweme);
            }
            C77379b bVar = new C77379b(2, createAwemeResponse.aweme);
            bVar.f173617g = createAwemeResponse.notify;
            bVar.f173618h = createAwemeResponse.notifyExtra;
            boolean z4 = a instanceof BaseShortVideoContext;
            if (z4) {
                bVar.f173616f = ((BaseShortVideoContext) a).mSyncPlatforms;
            }
            if (createAwemeResponse.isReviewVideo == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (createAwemeResponse.hasStickerRedPacket) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 || z3 || C63273a.m114728a(aiVar)) {
                bVar.f173617g = new String[0];
                bVar.f173616f = null;
                bVar.f173618h = null;
            }
            AbstractC81915c.m141875b(bVar);
            if (!C63273a.m114728a(aiVar)) {
                CreateAwemeResponse.C69725b bVar2 = createAwemeResponse.responseMarker;
                if (!(bVar2 == null || bVar2.addToPlaylistFail == null || !bVar2.addToPlaylistFail.booleanValue())) {
                    new C23144b(aVar.f143635a).mo37635a(aVar.f143635a.getResources().getString(R.string.bqk)).mo37637b();
                }
                Aweme aweme2 = createAwemeResponse.aweme;
                if (createAwemeResponse.aweme.getAwemeType() == 40) {
                    aweme2 = C76706a.m134286l(createAwemeResponse.aweme);
                }
                AbstractC81915c.m141875b(new C49672ag(15, aweme2));
            } else {
                new C23144b(aVar.f143635a).mo37640e(R.string.gg4).mo37637b();
                C33744d dVar = new C33744d();
                if (aiVar.shoutoutData != null && !aiVar.shoutoutData.getShoutOutsMode().equals(C74418d.MODE_SEND)) {
                    C47809e.C47810a.f110762a.mo79877b("shoutouts_edit_post_success_time_" + C31575b.m65865g().getCurUserId(), new StringBuilder().append(System.currentTimeMillis()).toString());
                }
                if (aiVar.shoutoutData != null) {
                    dVar.mo59980a("reviewed", aiVar.shoutoutData.getReviewed());
                    if (!TextUtils.isEmpty(aiVar.shoutoutData.getOrderId())) {
                        dVar.mo59983a("enter_from", "video_edit_page");
                        dVar.mo59983a("order_id", aiVar.shoutoutData.getOrderId());
                    } else {
                        dVar.mo59983a("enter_from", "shoutouts_post_page");
                    }
                    C39162r.m79460a("show_review_remind_pop_up", dVar.f79943a);
                }
            }
            if (createAwemeResponse.aweme == null) {
                C33830n.m70668a("aweme_publish_error", new C33743c().mo59976a("user_info", "videoType:" + b + "response: " + aiVar.status_code + " " + aiVar.extra).mo59977a());
            }
            if (z4) {
                C42064b.m84190a((BaseShortVideoContext) a);
            }
            if (b == 0) {
                VideoExposureData convertToExposureData = AVExternalServiceImpl.m113114a().infoService().convertToExposureData(a);
                new Object();
                C71900f fVar = new C71900f(createAwemeResponse.aweme);
                fVar.f161095i = ((BaseShortVideoContext) a).excludeUserList;
                fVar.f161094h = aiVar;
                fVar.f161096j = convertToExposureData.getShootWay();
                if (aVar.f143637c && C63273a.m114727a()) {
                    fVar.f161097k = true;
                    AbstractC81915c.m141874a(fVar);
                } else if (aVar.f143637c || aVar.f143638d) {
                    AbstractC81915c.m141875b(fVar);
                } else {
                    AbstractC81915c.m141875b(fVar);
                    if (aVar.f143636b) {
                        new C23144b(aVar.f143635a).mo37640e(R.string.h3y).mo37637b();
                    }
                }
                C33744d a2 = new C33744d().mo59983a("creation_id", convertToExposureData.getCreationId());
                if (createAwemeResponse.aweme != null) {
                    str = createAwemeResponse.aweme.getAid();
                }
                C39162r.m79460a("video_publish_done", a2.mo59983a("group_id", str).f79943a);
            }
            ProfileBadgeServiceImpl.m67562b().mo57236a();
        }
        m114718a();
    }

    public MainActivityCallback(ActivityC0945e eVar, String str, boolean z) {
        this.f143630f = "MainActivityCallback";
        this.f143631g = new C63283j();
        IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
        this.f143627c = publishService;
        C72678q publishModel = publishService.getPublishModel(str);
        this.f143628d = publishModel;
        if (publishModel == null) {
            Toast makeText = Toast.makeText(eVar, (int) R.string.bqt, 0);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
            String concat = "MainActivityCallback getPublishModelFailed publishId:".concat(String.valueOf(str));
            C73991bj.m130131b(concat);
            C13468b.m24209a(concat);
            return;
        }
        this.f143629e = true;
        this.f143632h = eVar;
        eVar.runOnUiThread(new RunnableC63284k(this, eVar, str, z));
    }
}
