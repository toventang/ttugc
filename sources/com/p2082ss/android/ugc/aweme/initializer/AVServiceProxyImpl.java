package com.p2082ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewStub;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11686g;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.p1199e.C17232c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.C27910f;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.C35470cg;
import com.p2082ss.android.ugc.aweme.C35478ch;
import com.p2082ss.android.ugc.aweme.C41482di;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.IRegionService;
import com.p2082ss.android.ugc.aweme.app.services.RegionService;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.AnchorListManager;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34473h;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34501a;
import com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p2082ss.android.ugc.aweme.challenge.data.C35505a;
import com.p2082ss.android.ugc.aweme.challenge.data.C35511d;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.AbstractC35531i;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.C35525d;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.C35527f;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.C35529g;
import com.p2082ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37632e;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.discover.hitrank.AbstractC42065c;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42064b;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.experiment.C46847dp;
import com.p2082ss.android.ugc.aweme.experiment.C46959fx;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.SummonFriendActivity;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.model.C58721a;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59215aj;
import com.p2082ss.android.ugc.aweme.metrics.C59239e;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.opensdk.p3540a.C62717a;
import com.p2082ss.android.ugc.aweme.opensdk.p3540a.p3541a.DialogC62718a;
import com.p2082ss.android.ugc.aweme.openshare.Share;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34908a;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34911d;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34912e;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3426m.C58975a;
import com.p2082ss.android.ugc.aweme.p3542p.AbstractC62752a;
import com.p2082ss.android.ugc.aweme.p4071t.C77717b;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g;
import com.p2082ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63170ad;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63171ae;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63172af;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63173ag;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63185al;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63188an;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63189ao;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63197av;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63201ay;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63211ba;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63214bc;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63215bd;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63224bi;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63230bn;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63231bo;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63255n;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63262t;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.IHashTagService;
import com.p2082ss.android.ugc.aweme.port.p3561in.ISchedulerService;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.IToolsProfileService;
import com.p2082ss.android.ugc.aweme.services.NetworkServiceImpl;
import com.p2082ss.android.ugc.aweme.services.appcontext.IAVAppContextManager;
import com.p2082ss.android.ugc.aweme.services.connection.IConnectionEntranceService;
import com.p2082ss.android.ugc.aweme.services.shoutout.AVAnchorPublishStruct;
import com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.C68865aj;
import com.p2082ss.android.ugc.aweme.share.p3752h.C68957b;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69745a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C71832f;
import com.p2082ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69799a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69801c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69802d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3874t.C73295a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3864e.C72874c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74047y;
import com.p2082ss.android.ugc.aweme.splash.SplashActivity;
import com.p2082ss.android.ugc.aweme.sticker.p3968o.p3969a.C75452a;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.IStoryService;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80213ah;
import com.p2082ss.android.ugc.aweme.utils.C80245bi;
import com.p2082ss.android.ugc.aweme.utils.C80522ha;
import com.p2082ss.android.ugc.aweme.utils.C80569id;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl */
public class AVServiceProxyImpl implements IAVServiceProxy {
    private AbstractC63255n abTestService;
    private AbstractC63269z accountService;
    private AbstractC63167ab applicationService;
    private AbstractC63262t avConverter;
    private AbstractC63169ac bridgeService;
    private AbstractC63170ad busiStickerService;
    private AbstractC63171ae businessGoodsService;
    private AbstractC63172af captchaService;
    private AbstractC63178ak challengeService;
    private AbstractC63175ai commerceService;
    private IHashTagService hashTagService;
    private AbstractC63186am liveService;
    private AbstractC63188an localHashTagService;
    private AbstractC63189ao miniAppService;
    private AbstractC63193as musicService;
    private AbstractC63196au networkService;
    private AbstractC63197av openSDKShareService;
    private IToolsProfileService profileService;
    private AbstractC63199ax publishService;
    private AbstractC63201ay regionService;
    private ISchedulerService schedulerService;
    private AbstractC63202az sharePrefService;
    private AbstractC63211ba shareService;
    private AbstractC63212bb shortVideoPluginService;
    private AbstractC63214bc stickerPropService;
    private AbstractC63215bd stickerShareService;
    private AbstractC63218be storyService;
    private AbstractC63219bf summonFriendService;
    private AbstractC63220bg syncShareService;
    private AbstractC63224bi toolsComponentService;
    private AbstractC63225bj uiService;
    private AbstractC63227bk unlockStickerService;
    private AbstractC63230bn videoCacheService;
    private AbstractC63232bp wikiService;

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$k */
    public static class C56751k implements AbstractC63188an {
        static {
            Covode.recordClassIndex(66615);
        }
    }

    static {
        Covode.recordClassIndex(66596);
    }

    static final /* synthetic */ boolean lambda$superEntrancePrivacyService$2$AVServiceProxyImpl(Context context) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public IConnectionEntranceService getXsEntranceService() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$a */
    public static class C56735a implements AbstractC63255n {
        static {
            Covode.recordClassIndex(66599);
        }

        private C56735a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63255n
        /* renamed from: b */
        public final boolean mo93760b() {
            return C68957b.m121641a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63255n
        /* renamed from: c */
        public final boolean mo93761c() {
            return C46847dp.m90162a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63255n
        /* renamed from: d */
        public final boolean mo93762d() {
            return C46959fx.m90245a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63255n
        /* renamed from: a */
        public final int mo93759a() {
            return C16048b.m29633a().mo25412a(true, "ins_share_type", 0);
        }

        /* synthetic */ C56735a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$b */
    public static class C56736b implements AbstractC63167ab {
        static {
            Covode.recordClassIndex(66600);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: l */
        public final void mo93783l() {
            C17964b.f42784c = true;
        }

        private C56736b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: b */
        public final int mo93771b() {
            return C17867d.f42590n;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: d */
        public final Class<? extends ActivityC0945e> mo93775d() {
            return SplashActivity.class;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: e */
        public final Class<? extends ActivityC0945e> mo93776e() {
            return SplashActivity.class;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: j */
        public final String mo93781j() {
            return C17867d.f42595s;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: m */
        public final boolean mo93784m() {
            return C17873f.f42636l;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: a */
        public final String mo93763a() {
            return AppLog.getServerDeviceId();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: c */
        public final Application mo93774c() {
            return C17879g.m33104a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: h */
        public final int mo93779h() {
            return (int) C17867d.m33083d();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: i */
        public final String mo93780i() {
            return C17867d.m33085f();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: k */
        public final void mo93782k() {
            C80569id.m139662a(10);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: n */
        public final boolean mo93785n() {
            return C80213ah.m139041a().f179684a;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: f */
        public final ActivityC0945e mo93777f() {
            Activity j = C17873f.m33102j();
            if (j != null && (j instanceof ActivityC0945e)) {
                return (ActivityC0945e) j;
            }
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: g */
        public final boolean mo93778g() {
            for (Activity activity : ActivityStack.getActivityStack()) {
                if (activity instanceof MainActivity) {
                    return true;
                }
            }
            return false;
        }

        /* synthetic */ C56736b(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: b */
        public final void mo93772b(ActivityC0945e eVar) {
            new MainActivityCallback(eVar, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: a */
        public final void mo93766a(final AbstractC63167ab.AbstractC63168a aVar) {
            new AbstractC62752a() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56736b.C567371 */

                static {
                    Covode.recordClassIndex(66601);
                }

                @Override // com.p2082ss.android.ugc.aweme.p3542p.AbstractC62752a
                /* renamed from: a */
                public final void mo93786a() {
                    aVar.mo101618a(false);
                }
            }.mo93786a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q
        /* renamed from: b */
        public final boolean mo93773b(String str) {
            return C36125t.m73598a(C36125t.m73591a(), str);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: a */
        public final void mo93764a(ActivityC0945e eVar) {
            Bundle bundle = new Bundle();
            bundle.putString(C34792be.f82123b, C34792be.f82126e);
            Hox.C15490a.m28529a(eVar).mo25211b("Following", bundle);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: a */
        public final void mo93767a(String str) {
            C49907s.m93686a(EnumC48310af.valueOf(str));
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: a */
        public final boolean mo93770a(long j) {
            LocalVideoPlayerManager a = LocalVideoPlayerManager.m140055a();
            a.mo123963c();
            return a.f180556a.mo123973a(j);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: a */
        public final void mo93765a(ActivityC0945e eVar, String str) {
            C89219l.m154721d(eVar, "");
            if (str != null) {
                AbstractC42065c cVar = (AbstractC42065c) C34501a.m70486a(C17867d.m33078a(), AbstractC42065c.class);
                if ((C89361p.m154908a((CharSequence) str, (CharSequence) "153070", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "153071", false)) && C42064b.f98061a) {
                    if (!cVar.mo60943a()) {
                        cVar.mo60944b();
                        C42064b.f98061a = false;
                        new C23144b(eVar).mo37640e(R.string.c_o).mo37637b();
                    }
                    C42066d.m84194a(C42064b.f98062b, C42064b.f98063c, 7, null);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: a */
        public final void mo93768a(String str, String str2) {
            C59215aj ajVar = new C59215aj();
            ajVar.mo96790a("shoot_way", str, AbstractC59233c.AbstractC59234a.f135177a);
            ajVar.mo96790a("shoot_type", str2, AbstractC59233c.AbstractC59234a.f135177a);
            ajVar.mo96792f();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab
        /* renamed from: a */
        public final void mo93769a(String str, String str2, String str3) {
            C59239e eVar = new C59239e();
            eVar.f135180a = str;
            eVar.f135181b = str2;
            eVar.f135182c = str3;
            eVar.mo96792f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$c */
    public static class C56738c implements AbstractC63169ac {
        static {
            Covode.recordClassIndex(66602);
        }

        private C56738c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: c */
        public final void mo93797c() {
            AnchorListManager.m70432a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: b */
        public final AVAnchorPublishStruct mo93794b() {
            List<AnchorPublishStruct> f = AnchorListManager.f81425f.mo60889f();
            if (C13603b.m24435a((Collection) f)) {
                return null;
            }
            AnchorPublishStruct anchorPublishStruct = null;
            for (int i = 0; i < f.size(); i++) {
                if (f.get(i).type == 40) {
                    anchorPublishStruct = f.get(i);
                }
            }
            String str = anchorPublishStruct.title;
            List<String> urlList = anchorPublishStruct.icon.getUrlList();
            if (C13603b.m24435a((Collection) urlList)) {
                return null;
            }
            String str2 = urlList.get(0);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return null;
            }
            return new AVAnchorPublishStruct(str2, "", str);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: a */
        public final boolean mo93792a() {
            return C77717b.m135749a();
        }

        /* synthetic */ C56738c(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: a */
        public final C39078ad mo93787a(BaseShortVideoContext baseShortVideoContext) {
            return C80522ha.m139584a(baseShortVideoContext);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: b */
        public final boolean mo93796b(Context context) {
            return C58975a.m108348c(context);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: a */
        public final String mo93788a(Context context) {
            return PropReuseServiceImpl.m116994c().mo104480a(context);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: a */
        public final void mo93789a(Activity activity) {
            if (activity instanceof MainActivity) {
                ActivityC0945e eVar = (ActivityC0945e) activity;
                if (Hox.C15490a.m28529a(eVar).mo25213b("HOME")) {
                    Bundle bundle = new Bundle();
                    bundle.putString(C34792be.f82123b, C34792be.f82125d);
                    Hox.C15490a.m28529a(eVar).mo25208a("HOME", bundle);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: b */
        public final void mo93795b(BaseShortVideoContext baseShortVideoContext) {
            Activity b;
            String str;
            C39078ad a = C80522ha.m139584a(baseShortVideoContext);
            if (a != null && !a.mIsFromDraft && C80522ha.m139587a(a) && (b = C17879g.m33105b()) != null) {
                if (TextUtils.isEmpty(a.mAppName)) {
                    str = b.getString(R.string.gbz);
                } else {
                    str = a.mAppName;
                }
                new DialogC62718a(b, str, "share success", new DialogC62718a.AbstractC62721a(b, a) {
                    /* class com.p2082ss.android.ugc.aweme.p4071t.C77717b.C777192 */

                    /* renamed from: a */
                    final /* synthetic */ Activity f174300a;

                    /* renamed from: b */
                    final /* synthetic */ C39078ad f174301b;

                    static {
                        Covode.recordClassIndex(90769);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.opensdk.p3540a.p3541a.DialogC62718a.AbstractC62721a
                    /* renamed from: a */
                    public final void mo37044a() {
                        C68865aj ajVar = new C68865aj(this.f174300a, this.f174301b);
                        if (ajVar.f154030a != null) {
                            Share.Response response = new Share.Response();
                            response.errorCode = 0;
                            response.state = ajVar.f154030a.mState;
                            response.subErrorCode = 0;
                            ajVar.mo109441a(ajVar.f154030a, response);
                        }
                        C33744d a = new C33744d().mo59983a("launch_from", this.f174301b.mClientKey);
                        String str = "";
                        if (!(this.f174301b.getShareRequestBundle() == null || this.f174301b.getShareRequestBundle().getBundle("_bytedance_params_extra") == null)) {
                            str = this.f174301b.getShareRequestBundle().getBundle("_bytedance_params_extra").getString("style_id", str);
                        }
                        C39162r.m79460a("return_to_origin_app", a.mo59983a("style_id", str).f79943a);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.opensdk.p3540a.p3541a.DialogC62718a.AbstractC62721a
                    /* renamed from: b */
                    public final void mo37045b() {
                        C33744d a = new C33744d().mo59983a("launch_from", this.f174301b.mClientKey);
                        String str = "";
                        if (!(this.f174301b.getShareRequestBundle() == null || this.f174301b.getShareRequestBundle().getBundle("_bytedance_params_extra") == null)) {
                            str = this.f174301b.getShareRequestBundle().getBundle("_bytedance_params_extra").getString("style_id", str);
                        }
                        C39162r.m79460a("stay_in_tt", a.mo59983a("style_id", str).f79943a);
                        Intent intent = new Intent();
                        intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                        this.f174300a.sendBroadcast(intent);
                    }

                    {
                        this.f174300a = r1;
                        this.f174301b = r2;
                    }
                }).show();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: a */
        public final void mo93791a(String str) {
            C77717b.m135748a(str, (String) null);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: a */
        public final boolean mo93793a(C39078ad adVar) {
            return C80522ha.m139587a(adVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac
        /* renamed from: a */
        public final void mo93790a(Activity activity, C39078ad adVar, String str, int i) {
            if (activity == null) {
                activity = C17873f.m33102j();
            }
            new C68865aj(activity, adVar).mo109440a(str, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$e */
    static class C56740e implements AbstractC63172af {
        static {
            Covode.recordClassIndex(66604);
        }

        private C56740e() {
        }

        /* synthetic */ C56740e(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$f */
    public static class C56741f implements AbstractC63178ak {
        static {
            Covode.recordClassIndex(66605);
        }

        private C56741f() {
        }

        /* synthetic */ C56741f(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63173ag
        /* renamed from: a */
        public final AVChallenge mo93807a(String str) {
            return C69799a.m123324a(ChallengeApi.m72576a(str, 0, false, null).challenge);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak
        /* renamed from: a */
        public final AbstractC63178ak.AbstractC63180b mo93803a(final AbstractC63178ak.AbstractC63179a<AVChallenge> aVar) {
            C39101b bVar = new C39101b();
            bVar.mo67838a((AbstractC39085b) new C35525d());
            bVar.mo67839a_(new AbstractC39102c() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56741f.C567454 */

                static {
                    Covode.recordClassIndex(66609);
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                /* renamed from: a */
                public final void mo59511a(Exception exc) {
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                public final void aW_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                /* renamed from: b */
                public final void mo59515b() {
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                /* renamed from: b */
                public final void mo59516b(Exception exc) {
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                public final void bl_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                /* renamed from: c */
                public final void mo59522c(Exception exc) {
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                /* renamed from: f */
                public final void mo59525f() {
                    aVar.mo101620a();
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                /* renamed from: c */
                public final void mo59523c(List list, boolean z) {
                    C69799a.m123325a((List<Challenge>) list);
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                /* renamed from: a */
                public final void mo59512a(List list, boolean z) {
                    aVar.mo101621a(C69799a.m123325a((List<Challenge>) list));
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                /* renamed from: b */
                public final void mo59517b(List list, boolean z) {
                    C69799a.m123325a((List<Challenge>) list);
                }
            });
            return new C56779i(bVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak
        /* renamed from: a */
        public final AbstractC63178ak.AbstractC63181c mo93804a(final AbstractC63178ak.AbstractC63183e eVar) {
            C35529g gVar = new C35529g();
            gVar.mo67838a(new C35527f());
            gVar.mo67839a_(new AbstractC35531i() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56741f.C567443 */

                static {
                    Covode.recordClassIndex(66608);
                }

                @Override // com.p2082ss.android.ugc.aweme.challenge.p2451g.AbstractC35531i
                /* renamed from: a */
                public final void mo62425a() {
                    eVar.mo101623b();
                }

                @Override // com.p2082ss.android.ugc.aweme.challenge.p2451g.AbstractC35531i
                /* renamed from: b */
                public final void mo62427b() {
                    eVar.mo101624c();
                }

                @Override // com.p2082ss.android.ugc.aweme.challenge.p2451g.AbstractC35531i
                /* renamed from: a */
                public final void mo62426a(SearchSugChallengeList searchSugChallengeList) {
                    eVar.mo101622a(C69802d.m123331a(searchSugChallengeList));
                }
            });
            return new C56778h(gVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak
        /* renamed from: a */
        public final AbstractC63178ak.AbstractC63182d mo93805a(Fragment fragment) {
            final RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(RecommendHashTagViewModel.class);
            return new AbstractC63178ak.AbstractC63182d() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56741f.C567421 */

                static {
                    Covode.recordClassIndex(66606);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63182d
                /* renamed from: a */
                public final C71832f mo93809a() {
                    return C69801c.m123329a(recommendHashTagViewModel.mo62515a().getValue());
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63182d
                /* renamed from: a */
                public final void mo93810a(AbstractC63178ak.C63184f fVar) {
                    recommendHashTagViewModel.mo62516a(fVar);
                }
            };
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak
        /* renamed from: a */
        public final AbstractC63178ak.AbstractC63182d mo93806a(ActivityC0945e eVar) {
            final RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(RecommendHashTagViewModel.class);
            recommendHashTagViewModel.mo62515a().observe(eVar, new C56777g(eVar));
            return new AbstractC63178ak.AbstractC63182d() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56741f.C567432 */

                static {
                    Covode.recordClassIndex(66607);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63182d
                /* renamed from: a */
                public final C71832f mo93809a() {
                    return C69801c.m123329a(recommendHashTagViewModel.mo62515a().getValue());
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63182d
                /* renamed from: a */
                public final void mo93810a(AbstractC63178ak.C63184f fVar) {
                    recommendHashTagViewModel.mo62516a(fVar);
                }
            };
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63173ag
        /* renamed from: a */
        public final void mo93808a(String str, AbstractC0688a<AVChallenge> aVar) {
            ChallengeModule challengeModule = new ChallengeModule();
            ChallengeModule.C728301 r3 = new AbstractC27645k<ChallengeDetail>(new C56780j(aVar)) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule.C728301 */

                /* renamed from: a */
                final /* synthetic */ AbstractC34583a f163431a;

                static {
                    Covode.recordClassIndex(85519);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                    this.f163431a.mo61039a(null);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(ChallengeDetail challengeDetail) {
                    this.f163431a.mo61039a(challengeDetail);
                }

                {
                    this.f163431a = r2;
                }
            };
            if (!CommerceChallengeServiceImpl.m75741e().mo65393b(str) && !CommerceChallengeServiceImpl.m75741e().mo65393b((String) null)) {
                C27646l.m55298a(challengeModule.f163430a.fetchChallengeDetail(str, null, 0, 0), r3, ExecutorC34605m.f81660a);
            } else if (!C80580in.m139687c()) {
                C27646l.m55298a(challengeModule.f163430a.fetchCommerceChallengeDetail(str, null, 0, 0), r3, ExecutorC34605m.f81660a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$g */
    public static class C56746g implements AbstractC63175ai {

        /* renamed from: a */
        boolean f129310a;

        static {
            Covode.recordClassIndex(66610);
        }

        private C56746g() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63261s
        /* renamed from: i */
        public final boolean mo93831i() {
            return this.f129310a;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63261s
        /* renamed from: a */
        public final boolean mo93822a(Context context, String str) {
            return C38767w.m78643a(context, str, false);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63261s
        /* renamed from: a */
        public final boolean mo93823a(Context context, String str, String str2) {
            return C38767w.m78639a(context, str, str2);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final void mo93820a(ViewStub viewStub, AbstractC63199ax.AbstractC63200a aVar) {
            TcmServiceImpl.m135859j().mo121252a(viewStub, aVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final AbstractC63175ai.AbstractC63176a mo93812a() {
            return new AbstractC63175ai.AbstractC63176a() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56746g.C567471 */

                static {
                    Covode.recordClassIndex(66611);
                }
            };
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: f */
        public final void mo93828f() {
            TcmServiceImpl.m135859j().mo121265h();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: b */
        public final Boolean mo93824b() {
            return Boolean.valueOf(TcmServiceImpl.m135859j().mo121254a());
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: c */
        public final BcAdModel mo93825c() {
            return TcmServiceImpl.m135859j().mo121263f();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: d */
        public final String mo93826d() {
            return TcmServiceImpl.m135859j().mo121257b();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: e */
        public final boolean mo93827e() {
            return TcmServiceImpl.m135859j().mo121264g();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: h */
        public final String mo93830h() {
            return TcmServiceImpl.m135859j().mo121260c();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: g */
        public final int mo93829g() {
            AbstractC32846a aVar = (AbstractC32846a) ServiceManager.get().getService(AbstractC32846a.class);
            if (aVar == null) {
                return 0;
            }
            return aVar.mo58670m();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: j */
        public final boolean mo93832j() {
            TcmConfig i = TcmServiceImpl.m135859j().mo121266i();
            if (i == null) {
                return false;
            }
            return i.isTcmCreator();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63261s
        /* renamed from: a */
        public final void mo93821a(boolean z) {
            this.f129310a = z;
        }

        /* synthetic */ C56746g(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final Mission mo93813a(String str) {
            return PublishExtensionModel.fromString(str).mission;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final String mo93815a(C43223c cVar) {
            String str = cVar.f100900W.f100868q;
            PublishExtensionModel fromString = PublishExtensionModel.fromString("");
            fromString.shopOrderShareStructInfo = PublishExtensionModel.fromString(str).shopOrderShareStructInfo;
            return PublishExtensionModel.toString(fromString);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final String mo93816a(String str, Mission mission) {
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
            fromString.mission = mission;
            return new C27910f().mo46674b(fromString);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final String mo93817a(String str, String str2) {
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
            fromString.outerStarAtlas = str2;
            return new C27910f().mo46674b(fromString);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final String mo93818a(String str, boolean z) {
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
            fromString.fromCommercialSoundPage = z;
            return new C27910f().mo46674b(fromString);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final void mo93819a(Activity activity, boolean z) {
            TcmServiceImpl.m135859j().mo121249a(activity, z);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final int mo93811a(Context context, Activity activity, Boolean bool, Boolean bool2, Boolean bool3, List<AVTextExtraStruct> list) {
            return TcmServiceImpl.m135859j().mo121246a(context, activity, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), list);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai
        /* renamed from: a */
        public final Boolean mo93814a(Activity activity, Context context, Boolean bool, List<AVTextExtraStruct> list, CheckBAShowLoading checkBAShowLoading, CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, CheckBADetagBA checkBADetagBA) {
            return Boolean.valueOf(TcmServiceImpl.m135859j().mo121255a(activity, context, bool.booleanValue(), list, checkBAShowLoading, checkBAHideLoading, checkBAToPublish, checkBADetagBA));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$h */
    static class C56748h implements IHashTagService {
        static {
            Covode.recordClassIndex(66612);
        }

        private C56748h() {
        }

        /* synthetic */ C56748h(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IHashTagService
        public final void saveLocalHashTag(boolean z, String str) {
            C35511d a = C35511d.m72605a();
            C35505a aVar = new C35505a(str, true);
            a.f83744b.remove(aVar);
            a.f83744b.add(0, aVar);
            if (a.f83743a > 0 && a.f83744b.size() > a.f83743a) {
                a.f83744b.remove(a.f83744b.size() - 1);
            }
            a.mo62412b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$i */
    static class C56749i implements AbstractC63185al {
        static {
            Covode.recordClassIndex(66613);
        }

        private C56749i() {
        }

        /* synthetic */ C56749i(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$m */
    public static class C56753m implements AbstractC63201ay {
        static {
            Covode.recordClassIndex(66617);
        }

        private C56753m() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63267x
        /* renamed from: c */
        public final String mo93849c() {
            return C58071d.m104914h();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63267x, com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63201ay
        /* renamed from: a */
        public final String mo93847a() {
            IRegionService b = RegionService.m69268b();
            if (b != null) {
                return b.mo60087a();
            }
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63267x
        /* renamed from: b */
        public final Boolean mo93848b() {
            return Boolean.valueOf(C58071d.m104909c());
        }

        /* synthetic */ C56753m(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$n */
    static class C56754n implements AbstractC63202az {
        static {
            Covode.recordClassIndex(66618);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: a */
        public final String mo93851a() {
            return "guide";
        }

        private C56754n() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: b */
        public final AbstractC63202az.AbstractC63203a<Boolean> mo93853b() {
            return new AbstractC63202az.AbstractC63203a<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56754n.C567551 */

                static {
                    Covode.recordClassIndex(66619);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ Boolean mo93860a() {
                    return SharePrefCache.inst().getIsAwemePrivate().mo59941c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ void mo93861a(Boolean bool) {
                    SharePrefCache.inst().getIsAwemePrivate().mo59940b(bool);
                }
            };
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: c */
        public final AbstractC63202az.AbstractC63203a<Boolean> mo93856c() {
            return new AbstractC63202az.AbstractC63203a<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56754n.C567573 */

                static {
                    Covode.recordClassIndex(66621);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ Boolean mo93860a() {
                    return SharePrefCache.inst().getAutoSaveVideo().mo59941c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ void mo93861a(Boolean bool) {
                    SharePrefCache.inst().getAutoSaveVideo().mo59940b(bool);
                }
            };
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: d */
        public final AbstractC63202az.AbstractC63203a<Boolean> mo93857d() {
            return new AbstractC63202az.AbstractC63203a<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56754n.C567584 */

                static {
                    Covode.recordClassIndex(66622);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ Boolean mo93860a() {
                    return SharePrefCache.inst().hasShowHighQualityVideoTips().mo59941c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ void mo93861a(Boolean bool) {
                    SharePrefCache.inst().hasShowHighQualityVideoTips().mo59940b(bool);
                }
            };
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: e */
        public final AbstractC63202az.AbstractC63203a<Integer> mo93858e() {
            return new AbstractC63202az.AbstractC63203a<Integer>() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56754n.C567595 */

                static {
                    Covode.recordClassIndex(66623);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ Integer mo93860a() {
                    return SharePrefCache.inst().getStoryInfoStickerMaxCount().mo59941c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ void mo93861a(Integer num) {
                    SharePrefCache.inst().getStoryInfoStickerMaxCount().mo59940b(num);
                }
            };
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: f */
        public final AbstractC63202az.AbstractC63203a<Integer> mo93859f() {
            return new AbstractC63202az.AbstractC63203a<Integer>() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56754n.C567562 */

                static {
                    Covode.recordClassIndex(66620);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ Integer mo93860a() {
                    return SharePrefCache.inst().getStoryTextStickerMaxCount().mo59941c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az.AbstractC63203a
                /* renamed from: a */
                public final /* synthetic */ void mo93861a(Integer num) {
                    SharePrefCache.inst().getStoryTextStickerMaxCount().mo59940b(num);
                }
            };
        }

        /* synthetic */ C56754n(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: a */
        public final int mo93850a(String str, int i) {
            return C34597d.m70634a().mo61048a(str, i);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: b */
        public final void mo93854b(String str, int i) {
            C34597d.m70634a().mo61056b(str, i);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: a */
        public final boolean mo93852a(String str, boolean z) {
            return C34597d.m70634a().mo61055a(str, z);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az
        /* renamed from: b */
        public final void mo93855b(String str, boolean z) {
            C34597d.m70634a().mo61058b(str, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$o */
    static class C56760o implements AbstractC63211ba {
        static {
            Covode.recordClassIndex(66624);
        }

        private C56760o() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63211ba
        /* renamed from: a */
        public final boolean mo93862a() {
            return C68863ah.f154027a.mo109410a();
        }

        /* synthetic */ C56760o(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63211ba
        /* renamed from: a */
        public final boolean mo93863a(C69905c cVar, String str) {
            return C68863ah.f154027a.mo109412a(cVar, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$p */
    static class C56761p implements AbstractC63215bd {
        static {
            Covode.recordClassIndex(66625);
        }

        private C56761p() {
        }

        /* synthetic */ C56761p(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$r */
    static class C56764r implements AbstractC63219bf {
        static {
            Covode.recordClassIndex(66628);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf
        /* renamed from: a */
        public final boolean mo93879a(int i) {
            return i == 2;
        }

        private C56764r() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf
        /* renamed from: b */
        public final List<C34912e> mo93880b() {
            return m102886a(IMService.createIIMServicebyMonsterPlugin(false).getRecentIMUsers());
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf
        /* renamed from: a */
        public final List<C34912e> mo93874a() {
            return m102886a(IMService.createIIMServicebyMonsterPlugin(false).getAllFollowIMUsers());
        }

        /* synthetic */ C56764r(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf
        /* renamed from: a */
        public final void mo93877a(Fragment fragment) {
            SummonFriendActivity.m96386a(fragment, "", 0);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf
        /* renamed from: a */
        public final User mo93873a(Intent intent) {
            if (intent != null) {
                return (User) intent.getSerializableExtra("extra_data");
            }
            return null;
        }

        /* renamed from: b */
        private static List<User> m102887b(List<IMUser> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (IMUser iMUser : list) {
                    arrayList.add(IMUser.toUser(iMUser));
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private static List<C34912e> m102886a(List<IMUser> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (IMUser iMUser : list) {
                    arrayList.add(new C34912e(IMUser.toUser(iMUser), iMUser.isMentionEnabled()));
                }
            }
            return arrayList;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf
        /* renamed from: a */
        public final List<C34912e> mo93875a(long j) {
            C34911d a = SummonFriendApi.m95876a(j);
            ArrayList arrayList = new ArrayList();
            for (User user : a.f82366a) {
                for (C34908a aVar : a.f82367b) {
                    if (aVar.f82361a.equals(user.getUid())) {
                        boolean z = false;
                        if (aVar.f82362b.get(0).f82364b == 0) {
                            z = true;
                        }
                        arrayList.add(new C34912e(user, z));
                    }
                }
            }
            return arrayList;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf
        /* renamed from: a */
        public final List<User> mo93876a(List<User> list, String str) {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (User user : list) {
                    arrayList.add(IMUser.fromUser(user));
                }
            }
            return m102887b(createIIMServicebyMonsterPlugin.searchFollowIMUser(arrayList, str));
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf
        /* renamed from: a */
        public final void mo93878a(Fragment fragment, String str, int i) {
            SummonFriendActivity.m96386a(fragment, str, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$s */
    static class C56765s implements AbstractC63225bj {
        static {
            Covode.recordClassIndex(66629);
        }

        private C56765s() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj
        /* renamed from: a */
        public final int mo93881a() {
            return C17175b.C17176a.f40922a.f40921a;
        }

        /* synthetic */ C56765s(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj
        /* renamed from: a */
        public final Drawable mo93883a(Context context) {
            return context.getResources().getDrawable(2131232314);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj
        /* renamed from: a */
        public final AbstractC84919c mo93884a(Activity activity) {
            if (activity instanceof AbstractC34473h) {
                return C80245bi.m139087a((AbstractC84919c) activity);
            }
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj
        /* renamed from: a */
        public final boolean mo93885a(String str) {
            return C17232c.m31804a().mo27258a(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj
        /* renamed from: a */
        public final Dialog mo93882a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
            C17197a.C17200a aVar = new C17197a.C17200a(context);
            aVar.mo27194b(R.string.bas);
            return aVar.mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC56782l(onClickListener), false).mo27190a(R.string.bar, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC56783m(onClickListener2), false).mo27193a().mo27185c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public ISuperEntrancePrivacyService superEntrancePrivacyService() {
        return C56775e.f129334a;
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$d */
    public static class C56739d implements AbstractC63170ad {
        static {
            Covode.recordClassIndex(66603);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63170ad
        /* renamed from: a */
        public final void mo93798a() {
            CommerceStickerServiceImpl.m75788c().mo65420a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63170ad
        /* renamed from: b */
        public final void mo93802b(String str) {
            CommerceStickerServiceImpl.m75788c().mo65426b(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63170ad
        /* renamed from: a */
        public final void mo93800a(String str) {
            CommerceStickerServiceImpl.m75788c().mo65422a(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63170ad
        /* renamed from: a */
        public final void mo93799a(Boolean bool, String str, String str2, String str3, Boolean bool2) {
            CommerceStickerServiceImpl.m75788c().mo65424a(bool.booleanValue(), str, str2, str3, bool2);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63170ad
        /* renamed from: a */
        public final void mo93801a(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4) {
            CommerceStickerServiceImpl.m75788c().mo65423a(str, bool.booleanValue(), bool2.booleanValue(), str2, str3, str4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$j */
    static class C56750j implements AbstractC63186am {

        /* renamed from: a */
        private final Map<Class, Object> f129312a;

        /* renamed from: b */
        private final Map<AbstractC63186am.AbstractC63187a, AbstractC11686g> f129313b;

        static {
            Covode.recordClassIndex(66614);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: a */
        public final boolean mo93840a() {
            return C77717b.m135749a();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: c */
        public final void mo93844c() {
            LiveOuterService.m107269s().mo95829c().mo96133b();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: d */
        public final AbstractC63279g mo93845d() {
            return LiveOuterService.m107269s().mo95833g();
        }

        private C56750j() {
            HashMap hashMap = new HashMap();
            this.f129312a = hashMap;
            this.f129313b = new HashMap();
            hashMap.put(AbstractC63185al.class, new C56749i((byte) 0));
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: b */
        public final boolean mo93843b() {
            if (!LiveOuterService.m107269s().mo95829c().mo96132a() || LiveOuterService.m107269s().mo95830d() == null) {
                return false;
            }
            return true;
        }

        /* synthetic */ C56750j(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: a */
        public final void mo93834a(Context context) {
            LiveOuterService.m107269s().mo95829c().mo96127a(context);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: b */
        public final void mo93842b(boolean z) {
            LiveOuterService.m107269s().mo95829c().mo96134b(z);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: a */
        public final void mo93835a(C35470cg cgVar) {
            LiveOuterService.m107269s().mo95829c().mo96129a(cgVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: b */
        public final void mo93841b(AbstractC63186am.AbstractC63187a aVar) {
            AbstractC11686g gVar = this.f129313b.get(aVar);
            if (gVar != null) {
                this.f129313b.remove(aVar);
                LiveOuterService.m107269s().mo95834h().mo8700b(gVar);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: a */
        public final void mo93836a(C35478ch chVar) {
            LiveOuterService.m107269s().mo95829c().mo96130a(chVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: a */
        public final void mo93838a(AbstractC63186am.AbstractC63187a aVar) {
            AbstractC11686g gVar = this.f129313b.get(aVar);
            if (gVar == null) {
                aVar.getClass();
                gVar = new C56781k(aVar);
                this.f129313b.put(aVar, gVar);
            }
            LiveOuterService.m107269s().mo95834h().mo8698a(gVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: a */
        public final void mo93839a(boolean z) {
            LiveOuterService.m107269s().mo95829c().mo96131a(z);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am
        /* renamed from: a */
        public final void mo93837a(FilterBean filterBean, int i) {
            AbstractC81915c.m141874a(new C58721a(filterBean, i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$q */
    static class C56762q implements AbstractC63218be {

        /* renamed from: a */
        private AbstractC27255q<IStoryService> f129319a;

        static {
            Covode.recordClassIndex(66626);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: a */
        public final boolean mo93867a() {
            return C76660b.m134242b();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: b */
        public final boolean mo93868b() {
            return C76660b.m134246f();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: c */
        public final boolean mo93869c() {
            return C76660b.m134247g();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: d */
        public final boolean mo93870d() {
            return C76660b.m134248h();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: e */
        public final boolean mo93871e() {
            return C76660b.m134249i();
        }

        private C56762q() {
            this.f129319a = new AbstractC27255q<IStoryService>() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C56762q.C567631 */

                /* renamed from: b */
                private IStoryService f129321b;

                static {
                    Covode.recordClassIndex(66627);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.p1998c.p1999a.AbstractC27255q
                /* renamed from: b */
                public final /* synthetic */ IStoryService mo5560b() {
                    if (this.f129321b == null) {
                        this.f129321b = StoryServiceImpl.m135668l();
                    }
                    return this.f129321b;
                }
            };
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: f */
        public final int[] mo93872f() {
            return this.f129319a.mo5560b().mo120160h();
        }

        /* synthetic */ C56762q(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: a */
        public final void mo93865a(ActivityC0945e eVar) {
            this.f129319a.mo5560b().mo120141a(eVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: a */
        public final void mo93866a(String str) {
            C77260g.f173332a.mo120158f().mo120168a(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be
        /* renamed from: a */
        public final void mo93864a(Activity activity, Aweme aweme) {
            AwemeService.m70060b().mo60677a(aweme);
            SmartRoute withParam = SmartRouter.buildRoute(activity, "aweme://story/detail").withParam("query_mine_story_from_cache", true).withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("video_from", "STORY_ENTRANCE_PREVIEW");
            AbstractC76504c d = C77260g.f173332a.mo120156d();
            if (d != null && (activity instanceof ActivityC0218d)) {
                d.mo120229a(C77260g.f173332a.mo120157e().mo120170a(), (ActivityC0218d) activity, withParam);
            }
            AVExternalServiceImpl.m113114a().publishService().setPublishStatus(11);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public IAVAppContextManager getAVAppContextManager() {
        return new IAVAppContextManager() {
            /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C567331 */

            static {
                Covode.recordClassIndex(66597);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.appcontext.IAVAppContextManager
            public final long getUpdateVersionCode() {
                return C17867d.m33083d();
            }

            @Override // com.p2082ss.android.ugc.aweme.services.appcontext.IAVAppContextManager
            public final long getVersionCode() {
                return C17867d.m33087h();
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63173ag getChallengeService() {
        return getChallengeServiceInternal();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63178ak getDmtChallengeService() {
        return getChallengeServiceInternal();
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$t */
    public static class C56766t implements AbstractC63232bp, AbstractC90252i, AbstractC90253j {

        /* renamed from: b */
        private List<AbstractC63231bo> f129322b = new ArrayList();

        static {
            Covode.recordClassIndex(66630);
        }

        @Override // org.greenrobot.eventbus.AbstractC90252i
        public Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(157, new RunnableC90250g(C56766t.class, "onWikiActivityClose", C37632e.class, ThreadMode.MAIN, 0, false));
            hashMap.put(158, new RunnableC90250g(C56766t.class, "onAsyncAnchor", C37609a.class, ThreadMode.MAIN, 0, false));
            return hashMap;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp
        /* renamed from: b */
        public final boolean mo93890b() {
            return AnchorListManager.m70436b();
        }

        C56766t() {
            EventBus.m156966a(EventBus.m156962a(), this);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp
        /* renamed from: a */
        public final boolean mo93888a() {
            List<AnchorPublishStruct> f = AnchorListManager.f81425f.mo60889f();
            if (f != null && !f.isEmpty()) {
                for (int i = 0; i < f.size(); i++) {
                    if (f.get(i).type == EnumC31359ab.WIKIPEDIA.getTYPE()) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp
        /* renamed from: c */
        public final String mo93891c() {
            StringBuilder sb = new StringBuilder();
            if (AnchorListManager.m70438d() != null) {
                for (AnchorPublishStruct anchorPublishStruct : AnchorListManager.f81425f.mo60889f()) {
                    sb.append(AnchorListManager.m70431a(anchorPublishStruct));
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp
        /* renamed from: d */
        public final String mo93892d() {
            StringBuilder sb = new StringBuilder();
            if (AnchorListManager.m70438d() != null) {
                for (AnchorPublishStruct anchorPublishStruct : AnchorListManager.f81425f.mo60889f()) {
                    if (anchorPublishStruct.hadNew) {
                        sb.append("1");
                    } else {
                        sb.append("0");
                    }
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp
        /* renamed from: a */
        public final void mo93887a(AbstractC63231bo boVar) {
            this.f129322b.add(boVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp
        /* renamed from: b */
        public final void mo93889b(AbstractC63231bo boVar) {
            this.f129322b.remove(boVar);
        }

        @AbstractC90264r(mo145422a = ThreadMode.MAIN)
        public void onAsyncAnchor(C37609a aVar) {
            for (AbstractC63231bo boVar : this.f129322b) {
                boVar.mo101714a(aVar.f88909a);
            }
        }

        @AbstractC90264r(mo145422a = ThreadMode.MAIN)
        public void onWikiActivityClose(C37632e eVar) {
            for (AbstractC63231bo boVar : this.f129322b) {
                boVar.mo101714a(null);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp
        /* renamed from: a */
        public final void mo93886a(Context context, Map<String, String> map) {
            String str;
            List<AnchorPublishStruct> f = AnchorListManager.f81425f.mo60889f();
            if (f != null) {
                for (int i = 0; i < f.size(); i++) {
                    AnchorPublishStruct anchorPublishStruct = f.get(i);
                    if (anchorPublishStruct.type == EnumC31359ab.WIKIPEDIA.getTYPE()) {
                        if (anchorPublishStruct.webUrl != null) {
                            str = anchorPublishStruct.webUrl;
                        } else {
                            str = "";
                        }
                        AddWikiActivity.C81638a.m141513a(context, str, map);
                        return;
                    }
                }
            }
        }
    }

    private AbstractC63178ak getChallengeServiceInternal() {
        if (this.challengeService == null) {
            this.challengeService = new C56741f((byte) 0);
        }
        return this.challengeService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy, com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63255n getABService() {
        if (this.abTestService == null) {
            this.abTestService = new C56735a((byte) 0);
        }
        return this.abTestService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63262t getAVConverter() {
        if (this.avConverter == null) {
            this.avConverter = C56774d.f129333a;
        }
        return this.avConverter;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63269z getAccountService() {
        if (this.accountService == null) {
            this.accountService = new C56768a();
        }
        return this.accountService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy, com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63167ab getApplicationService() {
        if (this.applicationService == null) {
            this.applicationService = new C56736b((byte) 0);
        }
        return this.applicationService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy, com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63169ac getBridgeService() {
        if (this.bridgeService == null) {
            this.bridgeService = new C56738c((byte) 0);
        }
        return this.bridgeService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63170ad getBusiStickerService() {
        if (this.busiStickerService == null) {
            this.busiStickerService = new C56739d();
        }
        return this.busiStickerService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63171ae getBusinessGoodsService() {
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new AbstractC63171ae() {
                /* class com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C567342 */

                static {
                    Covode.recordClassIndex(66598);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63171ae
                /* renamed from: a */
                public final void mo93758a(String str) {
                    C74047y.m130205a(str);
                }
            };
        }
        return this.businessGoodsService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63172af getCaptureService() {
        if (this.captchaService == null) {
            this.captchaService = new C56740e((byte) 0);
        }
        return this.captchaService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy, com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63175ai getCommerceService() {
        if (this.commerceService == null) {
            this.commerceService = new C56746g((byte) 0);
        }
        return this.commerceService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public IHashTagService getHashTagService() {
        if (this.hashTagService == null) {
            this.hashTagService = new C56748h((byte) 0);
        }
        return this.hashTagService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63214bc getIStickerPropService() {
        if (this.stickerPropService == null) {
            this.stickerPropService = new C75452a();
        }
        return this.stickerPropService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63186am getLiveService() {
        if (this.liveService == null) {
            this.liveService = new C56750j((byte) 0);
        }
        return this.liveService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63188an getLocalHashTagService() {
        if (this.localHashTagService == null) {
            this.localHashTagService = new C56751k();
        }
        return this.localHashTagService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63189ao getMiniAppService() {
        if (this.miniAppService == null) {
            this.miniAppService = new C56752l();
        }
        return this.miniAppService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63193as getMusicService() {
        if (this.musicService == null) {
            this.musicService = new C56785o();
        }
        return this.musicService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63196au getNetworkService() {
        if (this.networkService == null) {
            this.networkService = new NetworkServiceImpl();
        }
        return this.networkService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public IToolsProfileService getProfileService() {
        if (this.profileService == null) {
            this.profileService = new C41482di();
        }
        return this.profileService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63199ax getPublishService() {
        if (this.publishService == null) {
            this.publishService = new C56787p();
        }
        return this.publishService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy, com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63201ay getRegionService() {
        if (this.regionService == null) {
            this.regionService = new C56753m((byte) 0);
        }
        return this.regionService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public ISchedulerService getSchedulerService() {
        if (this.schedulerService == null) {
            this.schedulerService = C56773c.f129332a;
        }
        return this.schedulerService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63211ba getShareService() {
        if (this.shareService == null) {
            this.shareService = new C56760o((byte) 0);
        }
        return this.shareService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy, com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63212bb getShortVideoPluginService() {
        if (this.shortVideoPluginService == null) {
            this.shortVideoPluginService = new C73295a();
        }
        return this.shortVideoPluginService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63202az getSpService() {
        if (this.sharePrefService == null) {
            this.sharePrefService = new C56754n((byte) 0);
        }
        return this.sharePrefService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63215bd getStickerShareService() {
        if (this.stickerShareService == null) {
            this.stickerShareService = new C56761p((byte) 0);
        }
        return this.stickerShareService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63218be getStoryService() {
        if (this.storyService == null) {
            this.storyService = new C56762q((byte) 0);
        }
        return this.storyService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63219bf getSummonFriendService() {
        if (this.summonFriendService == null) {
            this.summonFriendService = new C56764r((byte) 0);
        }
        return this.summonFriendService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63220bg getSyncShareService() {
        if (this.syncShareService == null) {
            this.syncShareService = C68863ah.f154027a.mo109416b();
        }
        return this.syncShareService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63224bi getToolsComponentService() {
        if (this.toolsComponentService == null) {
            this.toolsComponentService = new C56788q();
        }
        return this.toolsComponentService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63225bj getUiService() {
        if (this.uiService == null) {
            this.uiService = new C56765s((byte) 0);
        }
        return this.uiService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63230bn getVideoCacheService() {
        if (this.videoCacheService == null) {
            this.videoCacheService = C56776f.f129335a;
        }
        return this.videoCacheService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63232bp getWikiService() {
        if (this.wikiService == null) {
            this.wikiService = new C56766t();
        }
        return this.wikiService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVServiceProxy
    public AbstractC63197av openSDKService() {
        if (this.openSDKShareService == null) {
            this.openSDKShareService = new C62717a();
        }
        return this.openSDKShareService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public AbstractC63227bk unlockStickerService() {
        if (this.unlockStickerService == null) {
            this.unlockStickerService = new C72874c();
        }
        return this.unlockStickerService;
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$l */
    public static class C56752l implements AbstractC63189ao {
        static {
            Covode.recordClassIndex(66616);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63189ao
        /* renamed from: a */
        public final void mo93846a(String str) {
            C59320c.C59324a.f135560a.mo96989a().tryMoveMiniAppActivityToFront(str);
        }
    }

    public static IAVServiceProxy createIAVServiceProxybyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(6429);
        Object a = C81908b.m141854a(IAVServiceProxy.class, z);
        if (a != null) {
            IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) a;
            MethodCollector.m26664o(6429);
            return iAVServiceProxy;
        }
        if (C81908b.f183202bE == null) {
            synchronized (IAVServiceProxy.class) {
                try {
                    if (C81908b.f183202bE == null) {
                        C81908b.f183202bE = new AVServiceProxyImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6429);
                    throw th;
                }
            }
        }
        AVServiceProxyImpl aVServiceProxyImpl = (AVServiceProxyImpl) C81908b.f183202bE;
        MethodCollector.m26664o(6429);
        return aVServiceProxyImpl;
    }

    static final /* synthetic */ C69745a lambda$getAVConverter$1$AVServiceProxyImpl(C69831ai aiVar) {
        if (!(aiVar instanceof CreateAwemeResponse)) {
            return null;
        }
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) aiVar;
        if (createAwemeResponse.aweme == null) {
            return null;
        }
        C69745a aVar = new C69745a();
        aVar.aid = createAwemeResponse.aweme.getAid();
        aVar.captionStruct = C50539g.m94751e(createAwemeResponse.aweme);
        return aVar;
    }

    static final /* synthetic */ void lambda$getVideoCacheService$3$AVServiceProxyImpl(String str, C69831ai aiVar) {
        if (aiVar instanceof CreateAwemeResponse) {
            LocalVideoPlayerManager.m140055a().mo123960a(str, ((CreateAwemeResponse) aiVar).aweme);
        }
    }
}
