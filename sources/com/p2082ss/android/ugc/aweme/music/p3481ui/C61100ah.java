package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.p003ss.com.vboost.C0004a;
import android.p003ss.com.vboost.EnumC0044d;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.powerpreload.task.C17827e;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.p122a.C2541b;
import com.bytedance.router.SmartRouter;
import com.bytedance.track.AbstractC22883b;
import com.bytedance.track.C22886c;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.bytedance.tux.widget.spring.EnumC23427e;
import com.bytedance.tux.widget.spring.EnumC23429g;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35669w;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41135h;
import com.p2082ss.android.ugc.aweme.detail.C41247m;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.metrics.C59240f;
import com.p2082ss.android.ugc.aweme.metrics.C59248m;
import com.p2082ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.p2082ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicDetail;
import com.p2082ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.p2082ss.android.ugc.aweme.music.model.RessoCollectInfo;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60719e;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60736n;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60794c;
import com.p2082ss.android.ugc.aweme.music.p3473h.C60802a;
import com.p2082ss.android.ugc.aweme.music.p3477l.C60833a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w;
import com.p2082ss.android.ugc.aweme.music.p3481ui.ProgressDialogC61165e;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3482a.C61091a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3482a.C61092b;
import com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60866r;
import com.p2082ss.android.ugc.aweme.music.presenter.C60860n;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2405bt.C34937a;
import com.p2082ss.android.ugc.aweme.p2757dg.C41472d;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.C80638a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67686b;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ReshootConfig;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68088c;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4161b.C79365a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.aweme.views.C81436g;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ah */
public class C61100ah extends AbstractC35600b implements C35658s.AbstractC35662a, AbstractC35669w, AbstractC60866r, C61225w.AbstractC61231a, AbstractC90252i, AbstractC90253j {

    /* renamed from: N */
    ImageView f138671N;

    /* renamed from: O */
    ImageView f138672O;

    /* renamed from: P */
    RecyclerView f138673P;

    /* renamed from: Q */
    View f138674Q;

    /* renamed from: R */
    View f138675R;

    /* renamed from: S */
    TextView f138676S;

    /* renamed from: T */
    TextView f138677T;

    /* renamed from: U */
    DmtStatusView f138678U;

    /* renamed from: V */
    ImageView f138679V;

    /* renamed from: W */
    ViewStub f138680W;

    /* renamed from: X */
    ViewStub f138681X;

    /* renamed from: Y */
    ViewStub f138682Y;

    /* renamed from: Z */
    RelativeLayout f138683Z;

    /* renamed from: aA */
    float f138684aA;

    /* renamed from: aB */
    float f138685aB;

    /* renamed from: aC */
    private TextView f138686aC;

    /* renamed from: aD */
    private View f138687aD;

    /* renamed from: aE */
    private ViewGroup f138688aE;

    /* renamed from: aF */
    private ViewGroup f138689aF;

    /* renamed from: aG */
    private ViewGroup f138690aG;

    /* renamed from: aH */
    private RecyclerView f138691aH;

    /* renamed from: aI */
    private RecyclerView f138692aI;

    /* renamed from: aJ */
    private C60736n f138693aJ;

    /* renamed from: aK */
    private C60719e f138694aK;

    /* renamed from: aL */
    private C64117cn f138695aL;

    /* renamed from: aM */
    private boolean f138696aM;

    /* renamed from: aN */
    private boolean f138697aN;

    /* renamed from: aO */
    private String f138698aO;

    /* renamed from: aP */
    private Music f138699aP;

    /* renamed from: aQ */
    private String f138700aQ;

    /* renamed from: aR */
    private String f138701aR;

    /* renamed from: aS */
    private SafeHandler f138702aS;

    /* renamed from: aT */
    private C61202u f138703aT;

    /* renamed from: aU */
    private C35658s f138704aU;

    /* renamed from: aV */
    private MusicDetail f138705aV;

    /* renamed from: aW */
    private int f138706aW;

    /* renamed from: aX */
    private String f138707aX;

    /* renamed from: aY */
    private Handler f138708aY;

    /* renamed from: aZ */
    private boolean f138709aZ;

    /* renamed from: aa */
    View f138710aa;

    /* renamed from: ab */
    View f138711ab;

    /* renamed from: ac */
    LinearLayout f138712ac;

    /* renamed from: ad */
    SpringLayout f138713ad;

    /* renamed from: ae */
    AbstractC17256a f138714ae;

    /* renamed from: af */
    public String f138715af;

    /* renamed from: ag */
    public C60860n f138716ag;

    /* renamed from: ah */
    public String f138717ah;

    /* renamed from: ai */
    boolean f138718ai;

    /* renamed from: aj */
    ProgressDialog f138719aj;

    /* renamed from: ak */
    public boolean f138720ak;

    /* renamed from: al */
    public ProgressDialogC61165e f138721al;

    /* renamed from: am */
    C61225w f138722am;

    /* renamed from: an */
    public String f138723an;

    /* renamed from: ao */
    C41472d f138724ao;

    /* renamed from: ap */
    boolean f138725ap;

    /* renamed from: aq */
    public String f138726aq;

    /* renamed from: ar */
    String f138727ar = "musician";

    /* renamed from: as */
    String f138728as = "spotlight";

    /* renamed from: at */
    public String f138729at = "";

    /* renamed from: au */
    public long f138730au;

    /* renamed from: av */
    public int f138731av;

    /* renamed from: aw */
    C61147bg f138732aw;

    /* renamed from: ax */
    public String f138733ax;

    /* renamed from: ay */
    public String f138734ay;

    /* renamed from: az */
    public int f138735az;

    /* renamed from: ba */
    private long f138736ba;

    /* renamed from: bb */
    private long f138737bb;

    /* renamed from: bc */
    private boolean f138738bc;

    /* renamed from: bd */
    private View f138739bd;

    /* renamed from: be */
    private boolean f138740be;

    /* renamed from: bf */
    private String f138741bf;

    /* renamed from: bg */
    private C80638a f138742bg;

    /* renamed from: bh */
    private boolean f138743bh;

    /* renamed from: bi */
    private long f138744bi;

    /* renamed from: d */
    ViewGroup f138745d;

    /* renamed from: e */
    TextView f138746e;

    /* renamed from: j */
    TextView f138747j;

    /* renamed from: k */
    SmartImageView f138748k;

    /* renamed from: l */
    View f138749l;

    /* renamed from: m */
    View f138750m;

    /* renamed from: n */
    TextView f138751n;

    /* renamed from: o */
    SmartImageView f138752o;

    /* renamed from: p */
    View f138753p;

    /* renamed from: q */
    CheckableImageView f138754q;

    /* renamed from: r */
    View f138755r;

    /* renamed from: s */
    TextView f138756s;

    /* renamed from: t */
    public ImageView f138757t;

    /* renamed from: u */
    ImageView f138758u;

    static {
        Covode.recordClassIndex(71703);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final String mo62627a(int i) {
        return i == 0 ? "single_song" : i == 1 ? "single_song_fresh" : "";
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62587a(BaseResponse baseResponse) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C61100ah.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new RunnableC90250g(C61100ah.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new RunnableC90250g(C61100ah.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(38, new RunnableC90250g(C61100ah.class, "onMusicFeedBackEvent", C60794c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(39, new RunnableC90250g(C61100ah.class, "onEvent", C61091a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: h */
    public final int mo62639h() {
        return R.layout.al4;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: i */
    public final String mo62640i() {
        return this.f138717ah;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: l */
    public final AbstractC0974l mo62643l() {
        return this.f138695aL;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo98651a(Activity activity) {
        TextView textView;
        if (activity != null && (textView = this.f138686aC) != null && this.f138756s != null) {
            if (m110694a(activity, textView) || m110694a(activity, this.f138756s)) {
                this.f138686aC.setVisibility(8);
                this.f138756s.setVisibility(8);
                return;
            }
            this.f138686aC.setVisibility(0);
            this.f138756s.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62630a(Bundle bundle) {
        if (bundle != null) {
            this.f138717ah = bundle.getString("id");
            this.f138715af = bundle.getString("extra_music_from");
            this.f138698aO = bundle.getString("extra_previous_page_position");
            this.f96078K = bundle.getString("sticker_id");
            this.f138706aW = bundle.getInt("click_reason");
            this.f138723an = bundle.getString("aweme_id");
            this.f138707aX = bundle.getString("from_token");
            this.f138700aQ = bundle.getString("partnerMusicId");
            this.f138701aR = bundle.getString("partnerName");
            this.f138729at = bundle.getString("process_id");
            this.f138731av = bundle.getInt("extra_video_length", 0);
            this.f138741bf = bundle.getString("extra_track_info");
            if ("share_from_resso".equals(this.f138715af) && TextUtils.isEmpty(this.f138729at)) {
                this.f138729at = UUID.randomUUID().toString();
            }
            this.f138733ax = bundle.getString("shoot_enter_from", "");
            this.f138734ay = bundle.getString("banner_id", "");
            this.f138735az = bundle.getInt("is_bundled", 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60866r
    /* renamed from: a */
    public final void mo98513a(boolean z) {
        ImageView imageView = this.f138758u;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f138671N;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.f138672O;
        if (imageView3 != null) {
            imageView3.clearAnimation();
            this.f138672O.setVisibility(8);
        }
        if (z) {
            cb_();
            CheckableImageView checkableImageView = this.f138754q;
            if (checkableImageView != null) {
                checkableImageView.setVisibility(8);
            }
            this.f138758u.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
    /* renamed from: a */
    public final void mo98597a(final Effect effect, final MusicModel musicModel) {
        mo98654b(true);
        C59213ah.f134852a = "single_song";
        final ActivityC0945e activity = getActivity();
        if (TextUtils.isEmpty(this.f138726aq)) {
            this.f138726aq = UUID.randomUUID().toString();
        }
        AVExternalServiceImpl.m113114a().asyncService("MusicDetailFragment", new SimpleServiceLoadCallback() {
            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.C611011 */

            static {
                Covode.recordClassIndex(71704);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                String str;
                String str2 = "share_from_resso";
                if (!str2.equals(C61100ah.this.f138715af)) {
                    str2 = "single_song";
                }
                RecordConfig.Builder videoLength = new RecordConfig.Builder().creationId(C61100ah.this.f138726aq).startRecordTime(C61100ah.this.f138730au).decompressTime(j).reshootConfig(new ReshootConfig(true, true)).shootWay(C61100ah.this.mo98655d()).translationType(C68088c.m120390a()).musicWithSticker(effect).musicOrigin(str2).videoLength(Integer.valueOf(C61100ah.this.f138731av));
                String e = C61100ah.this.f138716ag.mo98505e();
                if (!TextUtils.isEmpty(e)) {
                    videoLength.shootFrom(e);
                }
                if (!TextUtils.isEmpty(C61100ah.this.f96078K)) {
                    videoLength.stickers(C60860n.m110461b(C61100ah.this.f96078K));
                    ArrayList<String> b = C60860n.m110461b(C61100ah.this.f96078K);
                    if (!b.isEmpty()) {
                        videoLength.musicSticker(b.get(0));
                    }
                }
                String musicSticker = videoLength.build().getMusicSticker();
                Effect effect = effect;
                MusicModel musicModel = musicModel;
                if (musicModel != null) {
                    str = musicModel.getMusicId();
                } else {
                    str = null;
                }
                videoLength.recordPresetResource(new RecordPresetResource(musicSticker, effect, str, musicModel));
                if (effect == null || !AVExternalServiceImpl.m113114a().abilityService().effectService().isEffectControlGame(effect)) {
                    asyncAVService.uiService().recordService().startRecord(activity, videoLength.build(), musicModel, true);
                } else {
                    asyncAVService.uiService().recordService().startRecord(activity, videoLength.build());
                }
                C60802a.m110392a(musicModel.getMusicId(), C61100ah.this.f138729at, C61100ah.this.f138726aq, C61100ah.this.f138723an, 0);
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60865q
    /* renamed from: a */
    public final void mo93928a(MusicDetail musicDetail) {
        C61202u uVar;
        ViewGroup viewGroup;
        MethodCollector.m26663i(2957);
        this.f138713ad.setRefreshing(false);
        if (!af_() || musicDetail == null) {
            MethodCollector.m26664o(2957);
        } else if (musicDetail.music == null || musicDetail.music.getMusicStatus() == 0 || musicDetail.music.getPlayUrl().getUrlList() == null || musicDetail.music.getPlayUrl().getUrlList().isEmpty()) {
            this.f138679V.setVisibility(4);
            this.f138712ac.setVisibility(0);
            MethodCollector.m26664o(2957);
        } else {
            if (!this.f138743bh) {
                this.f138743bh = true;
                C18285c.m34005a("music_detail_header", this.f138717ah, musicDetail);
            }
            if (TextUtils.isEmpty(this.f138717ah) || (musicDetail.music != null && !this.f138717ah.equals(musicDetail.music.getMid()))) {
                this.f138717ah = musicDetail.music.getMid();
                if (this.f96076I != null && this.f96076I.size() > 0) {
                    for (AbstractC41135h hVar : this.f96076I) {
                        if (hVar instanceof C35658s) {
                            ((C35658s) hVar).f84123c = this.f138717ah;
                            if (hVar instanceof C61202u) {
                                ((C61202u) hVar).f138954I = musicDetail.music;
                            }
                        }
                        hVar.mo62677j();
                    }
                }
            }
            this.f138699aP = musicDetail.music;
            if (this.f96076I.isEmpty()) {
                C31575b.m65859a();
                C31575b.f75524a.mo57069e().getCurUser().getMusicComplianceAccount();
                Fragment a = getChildFragmentManager().mo3551a(f96067v + 0);
                if (!(a instanceof C61202u) || (uVar = (C61202u) a) == null) {
                    Music music = this.f138699aP;
                    String str = this.f138717ah;
                    String str2 = this.f138715af;
                    String str3 = this.f138723an;
                    String str4 = this.f138698aO;
                    String str5 = this.f138729at;
                    C61139ba baVar = new C61139ba();
                    uVar = new C61202u();
                    Bundle bundle = new Bundle();
                    bundle.putInt("detail_aweme_list_type", 0);
                    bundle.putString("event_label", "single_song");
                    bundle.putString("detail_id", str);
                    bundle.putString("detail_aweme_from", str2);
                    bundle.putString("detail_aweme_from_aid", str3);
                    bundle.putString("detail_aweme_previous_page_position", str4);
                    bundle.putSerializable("detail_music_data", music);
                    bundle.putString("process_id", str5);
                    uVar.setArguments(bundle);
                    uVar.f84111G = baVar;
                }
                uVar.f84141z = this.f96074G == 0;
                uVar.f84133q = this.f138678U;
                uVar.f84110F = this;
                uVar.f84135s = this;
                this.f138703aT = uVar;
                this.f96076I.add(this.f138703aT);
                this.f83959a.add(0);
                this.f138704aU = (C35658s) getChildFragmentManager().mo3551a(f96067v + 1);
                this.f138697aN = true;
                this.f96077J.clear();
                for (Object obj : this.f96076I) {
                    this.f96077J.add(obj);
                }
                this.f138695aL.notifyDataSetChanged();
                this.f96069B.setAdapter(this.f138695aL);
                onPageSelected(this.f96074G);
            }
            m110698b(musicDetail);
            m110699c(musicDetail);
            if (musicDetail.music == null || musicDetail.music.getMusicOwnerInfos() == null) {
                m110703q();
            } else {
                List<MusicOwnerInfo> musicOwnerInfos = musicDetail.music.getMusicOwnerInfos();
                if (C13603b.m24435a((Collection) musicOwnerInfos)) {
                    m110703q();
                } else {
                    List<MusicOwnerInfo> a2 = m110692a(musicOwnerInfos);
                    if (C13603b.m24435a((Collection) a2)) {
                        m110703q();
                    } else {
                        if (this.f138689aF == null) {
                            this.f138689aF = (ViewGroup) this.f138680W.inflate();
                        }
                        if (this.f138692aI == null) {
                            this.f138692aI = (RecyclerView) this.f138689aF.findViewById(R.id.co3);
                            this.f138692aI.setLayoutManager(new WrapLinearLayoutManager(getContext()) {
                                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.C611075 */

                                static {
                                    Covode.recordClassIndex(71710);
                                }

                                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
                                /* renamed from: g */
                                public final boolean mo4368g() {
                                    return false;
                                }
                            });
                            this.f138692aI.mo4415b(new C81436g(C0643b.m2378c(getContext(), R.color.b6), (int) C13628n.m24520b(getActivity(), 0.5f), C13628n.m24520b(getActivity(), 16.0f), C13628n.m24520b(getActivity(), 16.0f)));
                            C60719e eVar = new C60719e();
                            this.f138694aK = eVar;
                            eVar.f137968a = new C61117al(this, a2);
                            this.f138694aK.mo67829d(false);
                            this.f138692aI.setAdapter(this.f138694aK);
                        }
                        C60719e eVar2 = this.f138694aK;
                        if (eVar2 != null) {
                            eVar2.mo62377b_(a2);
                        }
                        this.f138689aF.setVisibility(0);
                    }
                }
            }
            if (musicDetail.music == null || musicDetail.music.getMatchedPGCSoundInfo() == null || TextUtils.isEmpty(musicDetail.music.getMatchedPGCSoundInfo().getId())) {
                ViewGroup viewGroup2 = this.f138690aG;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
            } else {
                final MatchedPGCSoundInfo matchedPGCSoundInfo = musicDetail.music.getMatchedPGCSoundInfo();
                ActivityC0945e activity = getActivity();
                if (this.f138690aG == null && activity != null) {
                    C39162r.m79460a("show_music_feedback_entrance", new C33744d().mo59983a("enter_from", "single_song").mo59983a("music_id", this.f138717ah).mo59983a("process_id", this.f138729at).f79943a);
                    String showInfo = matchedPGCSoundInfo.getShowInfo();
                    ViewGroup viewGroup3 = (ViewGroup) this.f138682Y.inflate();
                    this.f138690aG = viewGroup3;
                    final TextView textView = (TextView) viewGroup3.findViewById(R.id.f11);
                    String string = getResources().getString(R.string.n, showInfo);
                    SpannableString spannableString = new SpannableString(string);
                    int lastIndexOf = string.lastIndexOf(showInfo);
                    int length = spannableString.length();
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(showInfo) && lastIndexOf >= 0) {
                        spannableString.setSpan(new StyleSpan(1), lastIndexOf, length, 17);
                        spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(getContext(), R.color.bx)), lastIndexOf, length, 17);
                        spannableString.setSpan(new ClickableSpan() {
                            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.C611086 */

                            static {
                                Covode.recordClassIndex(71711);
                            }

                            public final void updateDrawState(TextPaint textPaint) {
                                textPaint.setColor(C0643b.m2378c(textView.getContext(), R.color.bx));
                                textPaint.setUnderlineText(false);
                            }

                            public final void onClick(View view) {
                                String id = matchedPGCSoundInfo.getId();
                                String str = C61100ah.this.f138717ah;
                                C39162r.m79460a("enter_music_detail", new C33744d().mo59983a("enter_from", "single_song").mo59983a("enter_method", "music_feedback").mo59983a("music_id", id).mo59983a("from_music_id", str).mo59983a("process_id", C61100ah.this.f138729at).mo59983a("ugc_to_pgc_meta", "1").f79943a);
                                SmartRouter.buildRoute(C61100ah.this.getContext(), "aweme://music/detail/").withParam("id", matchedPGCSoundInfo.getId()).withParam("process_id", UUID.randomUUID().toString()).open();
                            }
                        }, lastIndexOf, length, 17);
                    }
                    textView.setHighlightColor(C0643b.m2378c(getContext(), R.color.c9));
                    textView.setMovementMethod(C34937a.m71327a());
                    textView.setText(spannableString);
                }
            }
            if (CommerceMediaServiceImpl.m77578f().mo66514b(musicDetail.music)) {
                this.f138679V.setVisibility(8);
                this.f138757t.setVisibility(8);
                this.f138755r.setVisibility(8);
                this.f138710aa.setVisibility(0);
                this.f138758u.setVisibility(8);
                this.f138671N.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.f138711ab.getLayoutParams();
                ViewGroup viewGroup4 = this.f138688aE;
                if ((viewGroup4 == null || viewGroup4.getVisibility() != 0) && ((viewGroup = this.f138689aF) == null || viewGroup.getVisibility() != 0)) {
                    layoutParams.height = C34728n.m70946a(4.0d);
                } else {
                    layoutParams.height = C34728n.m70946a(8.0d);
                }
                this.f138711ab.setLayoutParams(layoutParams);
                this.f138683Z.setVisibility(8);
            }
            MethodCollector.m26664o(2957);
        }
    }

    /* renamed from: a */
    public final void mo98652a(MusicOwnerInfo musicOwnerInfo) {
        if (musicOwnerInfo != null && musicOwnerInfo.getUid() != null && musicOwnerInfo.getSecUid() != null) {
            if (musicOwnerInfo.getEnterType() == 1) {
                C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_method", "click_musician_profile").mo59983a("to_user_id", musicOwnerInfo.getUid()).mo59983a(StringSet.type, this.f138728as).mo59983a("enter_from", "single_song").f79943a);
            } else {
                C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_method", "click_profile").mo59983a("to_user_id", musicOwnerInfo.getUid()).mo59983a(StringSet.type, this.f138727ar).mo59983a("enter_from", "single_song").f79943a);
            }
            SmartRouter.buildRoute(C17867d.m33078a(), "aweme://user/profile/").withParam("uid", musicOwnerInfo.getUid()).withParam("sec_user_id", musicOwnerInfo.getSecUid()).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60866r
    /* renamed from: a */
    public final void mo98512a(CharSequence charSequence) {
        TextView textView = this.f138677T;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60865q
    /* renamed from: a */
    public final void mo93929a(Exception exc) {
        this.f138713ad.setRefreshing(false);
        C51423a.m95790a((Throwable) exc);
        if (af_()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            this.f138678U.mo27387h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62589a(String str) {
        new C23144b(this).mo37635a(str).mo37637b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo70350a(int i, boolean z) {
        super.mo70350a(i, z);
        if (System.currentTimeMillis() - this.f138744bi >= 1000) {
            this.f138744bi = System.currentTimeMillis();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35662a
    /* renamed from: b */
    public final boolean mo62691b(int i) {
        MethodCollector.m26663i(3745);
        if (i == 0) {
            this.f138696aM = true;
        } else if (i == 1) {
            this.f138697aN = true;
        }
        if (this.f138703aT == null) {
            this.f138696aM = true;
        }
        if (this.f138704aU == null) {
            this.f138697aN = true;
        }
        if (this.f138696aM && this.f138697aN) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.w5, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.f8a)).setText("");
            TuxTextView tuxTextView = new TuxTextView(getContext());
            tuxTextView.setGravity(17);
            tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.c4));
            tuxTextView.setText(R.string.cxj);
            C61202u uVar = this.f138703aT;
            if (uVar != null) {
                uVar.mo62664a(inflate, tuxTextView);
            }
            C35658s sVar = this.f138704aU;
            if (sVar != null) {
                sVar.mo62664a(inflate, tuxTextView);
            }
        }
        MethodCollector.m26664o(3745);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62628a(float f, float f2) {
        this.f138740be = C41247m.m83131a(f, f2, this.f138740be, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
    /* renamed from: a */
    public final void mo98595a(MusicModel musicModel) {
        C39162r.m79460a("download_music", new C33744d().mo59983a("music_id", musicModel.getMusicId()).mo59983a("enter_from", "single_song").mo59983a("enter_method", "click_shoot").f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
    /* renamed from: a */
    public final void mo98598a(final String str, final MusicModel musicModel, int i) {
        C59213ah.f134852a = "single_song";
        boolean isRecording = AVExternalServiceImpl.m113114a().configService().shortVideoConfig().isRecording();
        final ActivityC0945e activity = getActivity();
        final long currentTimeMillis = System.currentTimeMillis() - this.f138730au;
        if (!isRecording || activity == null) {
            if (TextUtils.isEmpty(this.f138726aq)) {
                this.f138726aq = UUID.randomUUID().toString();
            }
            AVExternalServiceImpl.m113114a().asyncService("MusicDetailFragment", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.C611042 */

                static {
                    Covode.recordClassIndex(71707);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    String str = "share_from_resso";
                    if (!str.equals(C61100ah.this.f138715af)) {
                        str = "single_song";
                    }
                    RecordConfig.Builder shootExtraData = new RecordConfig.Builder().creationId(C61100ah.this.f138726aq).startRecordTime(C61100ah.this.f138730au).decompressTime(j).musicDownloadDuration(currentTimeMillis).reshootConfig(new ReshootConfig(true, true)).shootWay(C61100ah.this.mo98655d()).translationType(C68088c.m120390a()).musicWithSticker(C61100ah.this.f138716ag.mo98508k()).musicOrigin(str).videoLength(Integer.valueOf(C61100ah.this.f138731av)).shootExtraData(new ShootExtraData(C61100ah.this.f138733ax, C61100ah.this.f138734ay, Integer.valueOf(C61100ah.this.f138735az)));
                    String e = C61100ah.this.f138716ag.mo98505e();
                    if (!TextUtils.isEmpty(e)) {
                        shootExtraData.shootFrom(e);
                    }
                    if (!TextUtils.isEmpty(C61100ah.this.f96078K)) {
                        shootExtraData.stickers(C60860n.m110461b(C61100ah.this.f96078K));
                        ArrayList<String> b = C60860n.m110461b(C61100ah.this.f96078K);
                        if (!b.isEmpty()) {
                            shootExtraData.musicSticker(b.get(0));
                        }
                    }
                    if (C61100ah.this.f138716ag.mo98508k() == null || !AVExternalServiceImpl.m113114a().abilityService().effectService().isEffectControlGame(C61100ah.this.f138716ag.mo98508k())) {
                        shootExtraData.musicPath(str);
                        asyncAVService.uiService().recordService().startRecord(activity, shootExtraData.build(), musicModel, true);
                    } else {
                        asyncAVService.uiService().recordService().startRecord(activity, shootExtraData.build());
                    }
                    C60802a.m110392a(musicModel.getMusicId(), C61100ah.this.f138729at, C61100ah.this.f138726aq, C61100ah.this.f138723an, currentTimeMillis);
                }
            });
            return;
        }
        AVExternalServiceImpl.m113114a().publishService().addMusic(musicModel);
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", 0);
        activity.setResult(-1, intent);
        activity.finish();
        if (TextUtils.equals(this.f138715af, "choose_music_with_banner")) {
            activity.overridePendingTransition(0, R.anim.ah);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
    /* renamed from: a */
    public final void mo98596a(MusicModel musicModel, boolean z) {
        if (z) {
            this.f138720ak = true;
            SafeHandler safeHandler = new SafeHandler(getActivity());
            this.f138702aS = safeHandler;
            safeHandler.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.RunnableC611053 */

                static {
                    Covode.recordClassIndex(71708);
                }

                public final void run() {
                    if (C61100ah.this.f138720ak && C61100ah.this.getActivity() != null && !C61100ah.this.getActivity().isFinishing()) {
                        C61100ah ahVar = C61100ah.this;
                        ahVar.f138721al = ProgressDialogC61165e.C61167b.m110784a(ahVar.getActivity());
                        C61100ah.this.f138721al.setMessage(C61100ah.this.getActivity().getResources().getString(R.string.g1j));
                    }
                }
            }, 300);
            return;
        }
        ProgressDialogC61165e a = ProgressDialogC61165e.C61167b.m110785a(getActivity(), ProgressDialogC61165e.EnumC61166a.VISIBLE_AFTER_5S, new C61124ar(this, musicModel));
        this.f138719aj = a;
        a.setIndeterminate(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
    public final boolean bZ_() {
        return isAdded();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo98656e() {
        m110693a(true, false);
    }

    /* renamed from: m */
    private static boolean m110702m() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: q */
    private void m110703q() {
        ViewGroup viewGroup = this.f138689aF;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
    public final void bY_() {
        C58957c.m108322a(this, mo62627a(this.f96074G), "click_music_shoot");
    }

    /* renamed from: d */
    public final String mo98655d() {
        if ("share_from_resso".equals(this.f138715af)) {
            return "share_from_resso";
        }
        return "single_song";
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C60860n nVar = this.f138716ag;
        if (nVar != null) {
            nVar.ck_();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f138716ag.mo98504d();
    }

    /* renamed from: j */
    private void m110701j() {
        this.f138755r.setOnClickListener(new View$OnClickListenerC61116ak(this));
        this.f138754q.setOnStateChangeListener(this.f138716ag);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60866r
    /* renamed from: b */
    public final void mo98514b() {
        ImageView imageView = this.f138758u;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.f138671N;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = this.f138672O;
        if (imageView3 != null) {
            imageView3.clearAnimation();
            this.f138672O.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo98657g() {
        m110693a(true, true);
        C39162r.m79460a("refresh_page", new C33744d().mo59983a("enter_from", "single_song").f79943a);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        mo98654b(false);
        this.f138716ag.f138308p.mo128977a();
        this.f138722am.mo98758b();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60866r
    /* renamed from: c */
    public final void mo98516c() {
        MethodCollector.m26663i(2996);
        ImageView imageView = this.f138758u;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.f138671N;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        if (!(this.f138672O == null || getContext() == null)) {
            this.f138672O.setVisibility(0);
            this.f138672O.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.d2));
        }
        MethodCollector.m26664o(2996);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35669w
    public final void ca_() {
        if (!this.f138738bc) {
            this.f138738bc = true;
            String str = this.f138717ah;
            String str2 = this.f138729at;
            String str3 = this.f138723an;
            C39162r.m79460a("music_detail_load_time", new C33744d().mo59983a("enter_from", "single_song").mo59983a("music_id", str).mo59983a("process_id", str2).mo59983a("group_id", str3).mo59981a("ttl_duration", SystemClock.elapsedRealtime() - this.f138736ba).mo59981a("more_sounds_duration", this.f138737bb).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: k */
    public final void mo62642k() {
        View view = this.f138739bd;
        if (view != null) {
            this.f96084y = (ScrollableLayout) view.findViewById(R.id.dq9);
            this.f96085z = (TextView) this.f138739bd.findViewById(R.id.title);
            this.f96068A = this.f138739bd.findViewById(R.id.ej_);
            this.f96069B = (ViewPager) this.f138739bd.findViewById(R.id.fgn);
            this.f96070C = (DmtTabLayout) this.f138739bd.findViewById(R.id.ee7);
            this.f96072E = (ImageView) this.f138739bd.findViewById(R.id.pi);
        }
        super.mo62642k();
        this.f96085z.setAlpha(0.0f);
        this.f96070C.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60865q
    /* renamed from: a */
    public final void mo93927a() {
        this.f138679V.setVisibility(4);
        this.f138712ac.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.ah$a */
    public class C61112a extends ClickableSpan {

        /* renamed from: a */
        private MusicOwnerInfo f138782a;

        static {
            Covode.recordClassIndex(71715);
        }

        C61112a() {
        }

        public void onClick(View view) {
            if (!C58001a.m104815a(view, 1200)) {
                C61100ah.this.mo98652a(this.f138782a);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C0643b.m2378c(C61100ah.this.getContext(), R.color.c5));
            textPaint.setUnderlineText(false);
        }

        C61112a(MusicOwnerInfo musicOwnerInfo) {
            this.f138782a = musicOwnerInfo;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.ah$b */
    public class View$OnTouchListenerC61113b implements View.OnTouchListener {

        /* renamed from: a */
        long f138784a;

        static {
            Covode.recordClassIndex(71716);
        }

        View$OnTouchListenerC61113b() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f138784a = System.currentTimeMillis();
            } else if (action != 1 || System.currentTimeMillis() - this.f138784a > 300) {
                return true;
            } else {
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                if (text instanceof SpannedString) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                    int totalPaddingTop = y - textView.getTotalPaddingTop();
                    int scrollX = totalPaddingLeft + textView.getScrollX();
                    Layout layout = textView.getLayout();
                    int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
                    C61112a[] aVarArr = (C61112a[]) ((SpannedString) text).getSpans(offsetForHorizontal, offsetForHorizontal, C61112a.class);
                    if (aVarArr.length != 0) {
                        aVarArr[0].onClick(textView);
                        return true;
                    }
                }
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
    /* renamed from: d_ */
    public final void mo98602d_(final boolean z) {
        if (z) {
            mo98654b(z);
        } else {
            C29339a.m58754b(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.RunnableC611064 */

                static {
                    Covode.recordClassIndex(71709);
                }

                public final void run() {
                    if (C61100ah.this.f138719aj != null && C61100ah.this.f138719aj.isShowing()) {
                        C61100ah.this.f138719aj.setProgress(100);
                    }
                    C61100ah.this.mo98654b(z);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f138736ba = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private static boolean m110695a(Music music) {
        try {
            if (new JSONObject(music.getExtra()).getInt("has_edited") == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: e_ */
    public final void mo62592e_(Exception exc) {
        C51423a.m95790a((Throwable) exc);
        if (getActivity() != null) {
            C33615a.m68848a((Context) getActivity(), (Throwable) exc, (int) R.string.g1i);
        }
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        String str = aVar.f81610a;
        if (str != null && str.contains("/aweme/v1/music/detail/?")) {
            EventBus.m156962a().mo145397d(aVar);
            m110693a(true, false);
        }
    }

    @AbstractC90264r
    public void onEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (TextUtils.equals("music", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(getActivity(), this.f138750m, jVar);
        }
    }

    @AbstractC90264r
    public void onMusicFeedBackEvent(C60794c cVar) {
        new C79459a(getContext()).mo123050a(R.string.fzi).mo123053a();
    }

    /* renamed from: b */
    public final void mo98654b(boolean z) {
        if (z) {
            this.f138720ak = false;
            C80273bt.m139146b(this.f138721al);
            this.f138721al = null;
        }
        ProgressDialog progressDialog = this.f138719aj;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f138719aj.dismiss();
            this.f138719aj = null;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C61091a aVar) {
        if (getContext() != null && aVar.f138650a == getContext().hashCode() && aVar.f138651b != hashCode()) {
            this.f138716ag.mo98504d();
        }
    }

    /* renamed from: a */
    private static List<MusicOwnerInfo> m110692a(List<MusicOwnerInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!C13603b.m24435a((Collection) list)) {
            for (MusicOwnerInfo musicOwnerInfo : list) {
                if (!TextUtils.isEmpty(musicOwnerInfo.getUid()) && !TextUtils.isEmpty(musicOwnerInfo.getSecUid()) && !TextUtils.isEmpty(musicOwnerInfo.getNickName()) && !TextUtils.isEmpty(musicOwnerInfo.getHandle())) {
                    arrayList.add(musicOwnerInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m110697b(Activity activity) {
        MethodCollector.m26663i(5321);
        if (this.f138687aD == null) {
            this.f138687aD = ((ViewStub) activity.findViewById(R.id.fhj)).inflate();
        }
        this.f138754q = (CheckableImageView) this.f138687aD.findViewById(R.id.cnj);
        this.f138755r = this.f138687aD.findViewById(R.id.cdr);
        this.f138756s = (TextView) this.f138687aD.findViewById(R.id.ezq);
        if (this.f138687aD.getVisibility() != 0) {
            this.f138687aD.setVisibility(0);
        }
        m110701j();
        MethodCollector.m26664o(5321);
    }

    public void onEvent(C61092b bVar) {
        if (!bVar.f138652a || this.f138709aZ) {
            this.f138683Z.setVisibility(8);
        } else {
            this.f138683Z.setVisibility(0);
        }
    }

    @AbstractC90264r
    public void onVideoEvent(C49672ag agVar) {
        Aweme b;
        int userCount;
        if (agVar.f114315a == 2) {
            String str = (String) agVar.f114316b;
            if (af_() && this.f138705aV != null && !TextUtils.isEmpty(str) && (b = AwemeService.m70060b().mo60684b(str)) != null && b.getMusic() != null && b.getMusic().getId() == this.f138705aV.music.getId() && (userCount = this.f138705aV.music.getUserCount()) > 0) {
                this.f138705aV.music.setUserCount(userCount - 1);
                mo93928a(this.f138705aV);
            }
        }
    }

    /* renamed from: d */
    private void m110700d(MusicDetail musicDetail) {
        String str;
        String str2;
        int i;
        int i2;
        Music music = musicDetail.music;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<RelatedChallengeMusic> list = musicDetail.relatedChallengeMusicList;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            RelatedChallengeMusic relatedChallengeMusic = list.get(i3);
            if (relatedChallengeMusic.categoryType == 1) {
                Music music2 = relatedChallengeMusic.music;
                if (music2 != null) {
                    sb = sb.append(music2.getMid()).append(",");
                }
            } else if (relatedChallengeMusic.categoryType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (music != null) {
                    sb2 = sb2.append(challenge.getCid()).append(",");
                }
            }
        }
        if (TextUtils.equals(this.f138715af, "from_related_tag")) {
            str2 = this.f138717ah;
            str = "1";
        } else {
            str = "0";
            str2 = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str);
            jSONObject.put("enter_from", str2);
            JSONObject jSONObject2 = new JSONObject();
            String sb3 = sb.toString();
            if (sb.length() > 0) {
                i = sb.length() - 1;
            } else {
                i = 0;
            }
            jSONObject2.put("music", sb3.substring(0, i));
            String sb4 = sb2.toString();
            if (sb2.length() > 0) {
                i2 = sb2.length() - 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put("challenge", sb4.substring(0, i2));
            jSONObject.put("related", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C39162r.onEvent(MobClick.obtain().setEventName("extend_music").setLabelName("music").setValue(this.f138717ah).setJsonObject(jSONObject));
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60866r
    /* renamed from: b */
    public final void mo98515b(BaseResponse baseResponse) {
        Context context;
        RessoCollectInfo ressoCollectInfo;
        if (C34597d.m70639f().mo61055a("is_need_show_collect_succed_dialog", true)) {
            C17197a.C17200a a = new C17197a.C17200a(getActivity()).mo27194b(R.string.ph).mo27189a(R.string.pf).mo27190a(R.string.d7k, (DialogInterface.OnClickListener) null, false);
            a.f41093x = -3476230;
            a.f41077h = 2131233281;
            a.f41083n = new DialogInterface$OnDismissListenerC61120ao(this);
            a.mo27193a().mo27185c();
            this.f138725ap = true;
            C34597d.m70639f().mo61058b("is_need_show_collect_succed_dialog", false);
        } else if (!this.f138725ap && (context = getContext()) != null && (baseResponse instanceof CollectMusicResponse)) {
            CollectMusicResponse collectMusicResponse = (CollectMusicResponse) baseResponse;
            if (collectMusicResponse.action == 1 && C60833a.m110436a(context) && (ressoCollectInfo = collectMusicResponse.ressoCollectInfo) != null && ressoCollectInfo.getAddedOnResso()) {
                String str = "";
                if (C34597d.m70639f().mo61055a("is_need_show_sync_resso_collect_succed_guide", true)) {
                    ArrayList arrayList = new ArrayList();
                    C23322d.C23323a aVar = new C23322d.C23323a();
                    aVar.f55277d = R.string.d_l;
                    aVar.f55279f = new View$OnClickListenerC61121ap(ressoCollectInfo, context);
                    aVar.f55275b = R.attr.x;
                    arrayList.add(aVar);
                    C34597d.m70639f().mo61058b("is_need_show_sync_resso_collect_succed_guide", false);
                    C23319b bVar = (C23319b) new C23319b(context).mo38034a(EnumC23352h.BOTTOM).mo38041b(this.f138755r);
                    C89219l.m154719c(arrayList, str);
                    bVar.f55267c = arrayList;
                    bVar.mo38012d().mo38001a();
                    str = "Resso";
                } else {
                    new C23144b(this).mo37640e(R.string.d_k).mo37637b();
                }
                C39162r.m79460a("favorite_sync_toast_show", new C33744d().mo59983a("enter_from", "single_song").mo59983a("music_id", this.f138717ah).mo59983a("group_id", this.f138723an).mo59983a("process_id", this.f138729at).mo59983a("resso_track_id", Uri.parse(ressoCollectInfo.getDeepLink()).getQueryParameter("track_id")).mo59983a("anchor_type", str).f79943a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x012c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m110698b(com.p2082ss.android.ugc.aweme.music.model.MusicDetail r18) {
        /*
        // Method dump skipped, instructions count: 868
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.m110698b(com.ss.android.ugc.aweme.music.model.MusicDetail):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final AbstractC52856g mo70349a(ViewGroup viewGroup) {
        C80638a aVar = new C80638a(requireContext(), getLayoutInflater(), R.string.ft2);
        this.f138742bg = aVar;
        aVar.mo70370a(this.f138683Z);
        viewGroup.findViewById(R.id.e6q).setOnClickListener(new AbstractView$OnClickListenerC80259bp() {
            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.C611119 */

            static {
                Covode.recordClassIndex(71714);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                boolean z;
                String str;
                String str2;
                AbstractC22883b bVar;
                if (C61100ah.this.getActivity() == null || !MSAdaptionService.m97895c().mo89375b((Context) C61100ah.this.getActivity())) {
                    C61100ah.this.f138726aq = UUID.randomUUID().toString();
                    C61100ah.this.f138730au = System.currentTimeMillis();
                    boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                    boolean isRecording = AVExternalServiceImpl.m113114a().configService().shortVideoConfig().isRecording();
                    ActivityC0945e activity = C61100ah.this.getActivity();
                    C60860n nVar = C61100ah.this.f138716ag;
                    Context requireContext = C61100ah.this.requireContext();
                    String str3 = C61100ah.this.f138726aq;
                    if (!downloadEffectOrMusicAfterEnterCamera || (isRecording && activity != null)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    C33744d a = new C33744d().mo59983a("shoot_way", "single_song").mo59983a("enter_from", "single_song").mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(str3)).mo59983a("music_id", nVar.f138303k).mo59983a("group_id", nVar.f138307o).mo59982a("is_ui_shoot", (Object) true);
                    if (!TextUtils.isEmpty(nVar.f138296C)) {
                        a.mo59983a("from_banner_id", nVar.f138296C);
                    }
                    if ("homepage_hot".equals(nVar.f138304l)) {
                        a.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108760a(nVar.f138307o, 0)));
                    }
                    String e = nVar.mo98505e();
                    if (!TextUtils.isEmpty(e)) {
                        nVar.mo98501a(a);
                    }
                    nVar.mo98503b(a);
                    a.mo59983a("shoot_enter_from", nVar.f138297D);
                    a.mo59980a("is_bundled", nVar.f138298E);
                    AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("shoot", a.f79943a);
                    String str4 = "search_result";
                    if (nVar.f138302g == null || MusicService.m81198m().mo69308a(nVar.f138302g.convertToMusicModel(), requireContext, true)) {
                        C0004a.m2a(EnumC0044d.TT_TAB_PUBLISH_LOAD, 3000);
                        String str5 = nVar.f138315w;
                        if (C31575b.m65865g().getCurUser().isLive()) {
                            new C79459a(requireContext).mo123050a(R.string.co0).mo123053a();
                            return;
                        }
                        IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
                        if (!publishService.isParallelPublishEnabled() ? publishService.isPublishing() : !publishService.isPublishable()) {
                            new C79459a(requireContext).mo123050a(R.string.f94).mo123053a();
                        } else if (nVar.f138302g == null || TextUtils.isEmpty(nVar.f138302g.getOwnerBanShowInfo())) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("route", "1");
                                jSONObject.put("group_id", nVar.f138307o);
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            C59213ah.f134852a = "single_song";
                            C59213ah.f134854c = "click_music_publish";
                            C33744d a2 = new C33744d().mo59983a("creation_id", str3).mo59983a("shoot_way", "single_song").mo59983a("enter_from", nVar.f138306n).mo59983a("music_id", nVar.f138303k).mo59983a("process_id", str5).mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(str3)).mo59982a("is_ui_shoot", (Object) false).mo59983a("group_id", nVar.f138307o).mo59983a("previous_page_position", nVar.f138305m).mo59983a("search_type", SearchServiceImpl.m119336t().mo106227p().get("searchType")).mo59983a("shoot_enter_from", nVar.f138297D).mo59980a("is_bundled", nVar.f138298E);
                            if (!TextUtils.isEmpty(nVar.f138296C)) {
                                a2.mo59983a("from_banner_id", nVar.f138296C);
                            }
                            if ("homepage_hot".equals(nVar.f138304l)) {
                                a2.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108760a(nVar.f138307o, 0)));
                            }
                            if ("general_search".equals(nVar.f138304l) || str4.equals(nVar.f138304l)) {
                                AbstractC22883b a3 = C22886c.m43140a("Search", C67686b.class);
                                if (a3 != null) {
                                    bVar = (AbstractC22883b) a3.mo37219b();
                                } else {
                                    bVar = null;
                                }
                                C67686b bVar2 = (C67686b) bVar;
                                if (bVar2 != null) {
                                    a2.mo59983a("search_id", bVar2.f151709a.f151706a);
                                }
                            }
                            nVar.mo98503b(a2);
                            if (!TextUtils.isEmpty(nVar.mo98505e())) {
                                nVar.mo98501a(a2);
                            }
                            AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("shoot", a2.f79943a);
                            if (TextUtils.equals(str4, nVar.f138304l) || TextUtils.equals("general_search", nVar.f138304l) || TextUtils.equals("search_for_you_list", nVar.f138304l)) {
                                C33744d a4 = new C33744d().mo59983a("creation_id", str3).mo59983a("shoot_way", "single_song").mo59983a("music_id", nVar.f138303k);
                                if (TextUtils.equals("general_search", nVar.f138304l)) {
                                    str = "general";
                                } else {
                                    str = "music";
                                }
                                C33744d a5 = a4.mo59983a("search_type", str);
                                if (TextUtils.equals("general_search", nVar.f138304l)) {
                                    str2 = str4;
                                } else {
                                    str2 = nVar.f138304l;
                                }
                                C39162r.m79460a("search_shoot", a5.mo59983a("previous_page", str2).f79943a);
                            }
                            if (nVar.f138302g == null || MusicService.m81198m().mo69308a(nVar.f138302g.convertToMusicModel(), requireContext, true)) {
                                nVar.f138310r.mo98755a(nVar.f138301f, nVar.mo98509l(), nVar.f138294A, z);
                                return;
                            }
                            C33744d dVar = new C33744d();
                            if (!TextUtils.equals("general_search", nVar.f138304l)) {
                                str4 = nVar.f138304l;
                            }
                            C39162r.m79460a("user_music_failed", dVar.mo59983a("previous_page", str4).mo59983a("action_type", "shoot").mo59983a("music_id", nVar.f138303k).mo59983a("enter_from", nVar.f138304l).f79943a);
                        } else {
                            new C79459a(requireContext).mo123052a(nVar.f138302g.getOwnerBanShowInfo()).mo123053a();
                        }
                    } else {
                        C33744d dVar2 = new C33744d();
                        if (!TextUtils.equals("general_search", nVar.f138304l)) {
                            str4 = nVar.f138304l;
                        }
                        C33744d a6 = dVar2.mo59983a("previous_page", str4).mo59983a("action_type", "shoot").mo59983a("music_id", nVar.f138303k).mo59983a("enter_from", nVar.f138304l);
                        if (!TextUtils.isEmpty(e)) {
                            nVar.mo98501a(a6);
                        }
                        C39162r.m79460a("user_music_failed", a6.f79943a);
                    }
                } else {
                    Toast makeText = Toast.makeText(C61100ah.this.getActivity(), C61100ah.this.getString(R.string.bed), 0);
                    if (Build.VERSION.SDK_INT == 25) {
                        C80567ic.m139657a(makeText);
                    }
                    makeText.show();
                }
            }
        });
        return this.f138742bg.mo70369a(viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r16 == false) goto L_0x0046;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m110699c(com.p2082ss.android.ugc.aweme.music.model.MusicDetail r19) {
        /*
        // Method dump skipped, instructions count: 1155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.m110699c(com.ss.android.ugc.aweme.music.model.MusicDetail):void");
    }

    /* renamed from: b */
    public final void mo98653b(View view) {
        List<Aweme> p;
        int id = view.getId();
        if (id == R.id.pi) {
            C2541b.m7439c("music", "list");
            if (MSAdaptionService.m97895c().mo89377c(getContext())) {
                SmartRouter.buildRoute(getContext(), "//duo").withParam("duo_type", "duo_back").open();
                return;
            }
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (id == R.id.dxf) {
            C60860n nVar = this.f138716ag;
            ActivityC0945e activity2 = getActivity();
            C61202u uVar = this.f138703aT;
            if (uVar == null) {
                p = null;
            } else {
                p = uVar.mo62689p();
            }
            if (nVar.f138302g != null) {
                if (!MusicService.m81198m().mo69308a(nVar.f138302g.convertToMusicModel(), activity2, true)) {
                    C39162r.m79460a("user_music_failed", new C33744d().mo59983a("previous_page", "music_hot").mo59983a("action_type", "share").mo59983a("music_id", nVar.f138302g.getMid()).mo59983a("enter_from", nVar.f138304l).f79943a);
                    return;
                }
                activity2.getApplicationContext();
                C39162r.m79455a("click_share_button", "music_hot", nVar.f138302g.getMid(), 0);
                C59240f a = new C59240f().mo96797a("music_hot");
                a.f135198t = "music_hot";
                a.f135186a = nVar.f138307o;
                a.mo96792f();
            }
            if (nVar.f138301f != null) {
                C39162r.m79460a("share_single_song", new C33744d().mo59983a("song_id", nVar.f138301f.getMusicId()).mo59983a("enter_from", "single_song").mo59983a("process_id", nVar.f138315w).f79943a);
            }
            SecApiImpl.m119993a().reportData("share");
            if (nVar.f138302g != null && nVar.f138302g.getShareInfo() != null) {
                C68863ah.f154027a.mo109403a(activity2, nVar.f138302g, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0109: INVOKE  
                      (wrap: com.ss.android.ugc.aweme.share.ShareService : 0x00fc: SGET  (r11v2 com.ss.android.ugc.aweme.share.ShareService) =  com.ss.android.ugc.aweme.share.ah.a com.ss.android.ugc.aweme.share.ShareService)
                      (r12v0 'activity2' androidx.fragment.app.e)
                      (wrap: com.ss.android.ugc.aweme.music.model.Music : 0x00fe: IGET  (r13v0 com.ss.android.ugc.aweme.music.model.Music) = (r5v3 'nVar' com.ss.android.ugc.aweme.music.presenter.n) com.ss.android.ugc.aweme.music.presenter.n.g com.ss.android.ugc.aweme.music.model.Music)
                      (wrap: com.ss.android.ugc.aweme.music.presenter.n$1 : 0x0102: CONSTRUCTOR  (r14v0 com.ss.android.ugc.aweme.music.presenter.n$1) = (r5v3 'nVar' com.ss.android.ugc.aweme.music.presenter.n) call: com.ss.android.ugc.aweme.music.presenter.n.1.<init>(com.ss.android.ugc.aweme.music.presenter.n):void type: CONSTRUCTOR)
                      (r15v1 'p' java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
                      (wrap: java.lang.String : 0x0105: IGET  (r0v52 java.lang.String) = (r5v3 'nVar' com.ss.android.ugc.aweme.music.presenter.n) com.ss.android.ugc.aweme.music.presenter.n.w java.lang.String)
                     type: INTERFACE call: com.ss.android.ugc.aweme.share.ShareService.a(android.app.Activity, com.ss.android.ugc.aweme.music.model.Music, com.ss.android.ugc.aweme.sharer.ui.g, java.util.List, java.lang.String):void in method: com.ss.android.ugc.aweme.music.ui.ah.b(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0102: CONSTRUCTOR  (r14v0 com.ss.android.ugc.aweme.music.presenter.n$1) = (r5v3 'nVar' com.ss.android.ugc.aweme.music.presenter.n) call: com.ss.android.ugc.aweme.music.presenter.n.1.<init>(com.ss.android.ugc.aweme.music.presenter.n):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.music.ui.ah.b(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.music.presenter.n, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 514
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah.mo98653b(android.view.View):void");
            }

            @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
            /* renamed from: a */
            public final void mo62629a(int i, int i2) {
                super.mo62629a(i, i2);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
            /* renamed from: a_ */
            public final void mo98599a_(int i, boolean z) {
                ProgressDialog progressDialog;
                ProgressDialog progressDialog2;
                if (!z && (progressDialog = this.f138719aj) != null) {
                    progressDialog.setProgress(i);
                    if (i >= 98 && (progressDialog2 = this.f138719aj) != null) {
                        progressDialog2.setCancelable(true);
                    }
                }
            }

            /* renamed from: a */
            private static boolean m110696a(List<MusicOwnerInfo> list, String str) {
                if (!(list == null || list.size() == 0 || TextUtils.isEmpty(str))) {
                    for (MusicOwnerInfo musicOwnerInfo : list) {
                        if (TextUtils.equals(musicOwnerInfo.getUid(), str)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            /* renamed from: a */
            private void m110693a(boolean z, boolean z2) {
                if (!af_() || this.f138678U == null) {
                    SpringLayout springLayout = this.f138713ad;
                    if (springLayout != null) {
                        springLayout.setRefreshing(false);
                        return;
                    }
                    return;
                }
                getContext();
                if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132253e = m110702m();
                }
                if (!C58029j.f132253e) {
                    if (z) {
                        new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                    }
                    this.f138678U.mo27387h();
                } else {
                    this.f138678U.mo27384f();
                    if (!TextUtils.isEmpty(this.f138717ah) || TextUtils.isEmpty(this.f138700aQ)) {
                        C18285c.m34006b("md_start_activity_to_request_net_duration");
                        this.f138716ag.mo57616a(this.f138717ah, Integer.valueOf(this.f138706aW), 0, Boolean.valueOf(z2));
                    } else {
                        this.f138716ag.mo57616a(this.f138700aQ, this.f138701aR, 1, Boolean.valueOf(z2));
                    }
                    if (z) {
                        for (AbstractC41135h hVar : this.f96076I) {
                            hVar.mo62669a(false, z2);
                        }
                    }
                }
                if (z2) {
                    this.f138678U.mo27382d();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
            /* renamed from: b */
            public final void mo62635b(int i, int i2) {
                boolean z;
                super.mo62635b(i, i2);
                C41472d dVar = this.f138724ao;
                if (dVar != null && dVar.isShowing()) {
                    this.f138724ao.dismiss();
                }
                if (this.f138714ae != null && i > C34728n.m70946a(44.0d)) {
                    this.f138714ae.dismiss();
                }
                float f = 0.0f;
                if (this.f138685aB == 0.0f) {
                    if (this.f138745d.getVisibility() == 0) {
                        this.f138685aB = (float) (this.f138745d.getBottom() - this.f96068A.getBottom());
                    } else if (this.f138677T.getVisibility() == 0) {
                        this.f138685aB = (float) (this.f138677T.getBottom() - this.f96068A.getBottom());
                    }
                }
                if (this.f138684aA == 0.0f) {
                    this.f138684aA = (float) (this.f138750m.getBottom() - this.f96068A.getBottom());
                }
                float f2 = (float) i;
                float f3 = this.f138685aB;
                float f4 = this.f138684aA;
                float f5 = (f2 - f3) / (f4 - f3);
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                float f6 = f2 / f4;
                if (f6 >= 0.0f) {
                    f = f6;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                this.f96085z.setAlpha(f);
                ImageView imageView = this.f138757t;
                imageView.setAlpha(1.0f - f5);
                if (imageView.getAlpha() >= 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                imageView.setClickable(z);
                this.f138740be = C41247m.m83132a(f5, this.f138740be, this);
            }

            /* renamed from: a */
            private static boolean m110694a(Activity activity, TextView textView) {
                if (activity == null) {
                    return false;
                }
                String charSequence = textView.getText().toString();
                if (TextUtils.isEmpty(charSequence)) {
                    return false;
                }
                Rect rect = new Rect();
                textView.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
                int width = rect.width();
                double a = (double) C13628n.m24504a(activity);
                Double.isNaN(a);
                double b = (double) C13628n.m24520b(activity, 50.0f);
                Double.isNaN(b);
                if ((a / 2.0d) - b < ((double) width)) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                this.f138739bd = view;
                this.f138713ad = (SpringLayout) view.findViewById(R.id.dhb);
                if (!C79365a.m138152a()) {
                    this.f138713ad.setOverScrollMode(EnumC23427e.NONE);
                    this.f138713ad.setScrollMode(EnumC23429g.NONE);
                    this.f138713ad.setNestedHeader(null);
                } else {
                    this.f138713ad.setOnRefreshListener(new C61114ai(this));
                }
                this.f138745d = (ViewGroup) view.findViewById(R.id.cnw);
                this.f138746e = (TextView) view.findViewById(R.id.f03);
                this.f138747j = (TextView) view.findViewById(R.id.f17);
                this.f138748k = (SmartImageView) view.findViewById(R.id.cnl);
                this.f138749l = view.findViewById(R.id.ejf);
                this.f138750m = view.findViewById(R.id.bdv);
                this.f138751n = (TextView) view.findViewById(R.id.f_6);
                this.f138752o = (SmartImageView) view.findViewById(R.id.ry);
                this.f138757t = (ImageView) view.findViewById(R.id.bxu);
                this.f138758u = (ImageView) view.findViewById(R.id.co6);
                this.f138671N = (ImageView) view.findViewById(R.id.coe);
                this.f138672O = (ImageView) view.findViewById(R.id.cnv);
                this.f138673P = (RecyclerView) view.findViewById(R.id.eev);
                this.f138674Q = view.findViewById(R.id.ees);
                this.f138675R = view.findViewById(R.id.ak9);
                this.f138676S = (TextView) view.findViewById(R.id.atc);
                this.f138677T = (TextView) view.findViewById(R.id.coj);
                this.f138678U = (DmtStatusView) view.findViewById(R.id.e7i);
                this.f138679V = (ImageView) view.findViewById(R.id.dxf);
                this.f138680W = (ViewStub) view.findViewById(R.id.fhk);
                this.f138681X = (ViewStub) view.findViewById(R.id.fhp);
                this.f138682Y = (ViewStub) view.findViewById(R.id.d19);
                this.f138683Z = (RelativeLayout) view.findViewById(R.id.e6t);
                this.f138710aa = view.findViewById(R.id.ab3);
                this.f138711ab = view.findViewById(R.id.e4f);
                this.f138712ac = (LinearLayout) view.findViewById(R.id.cnq);
                View findViewById = view.findViewById(R.id.pi);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new View$OnClickListenerC61115aj(this));
                }
                View findViewById2 = view.findViewById(R.id.cnl);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new View$OnClickListenerC61125as(this));
                }
                View findViewById3 = view.findViewById(R.id.dxf);
                if (findViewById3 != null) {
                    findViewById3.setOnClickListener(new View$OnClickListenerC61126at(this));
                }
                View findViewById4 = view.findViewById(R.id.coe);
                if (findViewById4 != null) {
                    findViewById4.setOnClickListener(new View$OnClickListenerC61127au(this));
                }
                View findViewById5 = view.findViewById(R.id.co6);
                if (findViewById5 != null) {
                    findViewById5.setOnClickListener(new View$OnClickListenerC61128av(this));
                }
                View findViewById6 = view.findViewById(R.id.cnw);
                if (findViewById6 != null) {
                    findViewById6.setOnClickListener(new View$OnClickListenerC61129aw(this));
                }
                super.onViewCreated(view, bundle);
                if (!TextUtils.isEmpty(this.f138717ah) || !TextUtils.isEmpty(this.f138700aQ)) {
                    this.f96076I = new ArrayList();
                    this.f96077J = new ArrayList();
                    this.f83959a = new ArrayList();
                    this.f138695aL = new C64117cn(getChildFragmentManager(), this.f96077J, this.f83959a);
                    this.f138722am = new C61225w(getActivity(), this, false);
                    this.f138708aY = new SafeHandler(this);
                    C60860n nVar = new C60860n();
                    this.f138716ag = nVar;
                    nVar.mo67839a_(this);
                    C60860n nVar2 = this.f138716ag;
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        nVar2.f138303k = arguments.getString("id");
                        nVar2.f138304l = arguments.getString("extra_music_from");
                        nVar2.f138305m = arguments.getString("extra_previous_page_position");
                        nVar2.f138307o = arguments.getString("aweme_id");
                        nVar2.f138315w = arguments.getString("process_id");
                        nVar2.f138316x = arguments.getString("sticker_id");
                        if ("share_from_resso".equals(nVar2.f138304l)) {
                            nVar2.f138306n = "share_from_resso";
                        }
                        nVar2.f138294A = arguments.getInt("extra_video_length", 0);
                        nVar2.f138296C = arguments.getString("banner_id", "");
                        nVar2.f138295B = arguments.getString("extra_track_info");
                        nVar2.f138288d = C17827e.m33012a(arguments);
                        nVar2.f138289e = Long.valueOf(arguments.getLong("EXTRA_PRELOAD_PAGE_START_TIME"));
                        nVar2.f138297D = arguments.getString("shoot_enter_from", "");
                        nVar2.f138298E = arguments.getInt("is_bundled", 0);
                    }
                    this.f138716ag.f138310r = this.f138722am;
                    this.f138716ag.f138312t.observe(this, new C61130ax(this));
                    if ("share_from_resso".equals(this.f138715af)) {
                        this.f138716ag.f138315w = this.f138729at;
                        C59248m o = new C59248m().mo96819o("share_from_resso");
                        o.f135272p = this.f138717ah;
                        o.f135274r = this.f138729at;
                        o.mo96792f();
                    }
                    this.f138678U.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27407b(new C17273d.C17274a(getContext()).mo27457a(2131233181).mo27462b(R.string.gzs).mo27464c(R.string.gzr).mo27459a(EnumC17270a.BORDER, R.string.gzy, new View$OnClickListenerC61131ay(this)).f41365a));
                    m110693a(false, false);
                    return;
                }
                getActivity().finish();
            }

            @Override // androidx.fragment.app.Fragment
            public void onActivityResult(int i, int i2, Intent intent) {
                super.onActivityResult(i, i2, intent);
                if (i == 0 && i2 == -1 && intent != null) {
                    C60860n nVar = this.f138716ag;
                    String a = C60860n.m110458a(intent, "MUSIC_TITLE");
                    if (nVar.f138302g != null) {
                        nVar.f138302g.setMusicName(a);
                    }
                    if (nVar.f92287i != null) {
                        ((AbstractC60866r) nVar.f92287i).mo98512a((CharSequence) a);
                    }
                }
            }
        }
