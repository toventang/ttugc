package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.refresh.TuxRefreshLayout;
import com.bytedance.tux.widget.spring.EnumC23429g;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35570b;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35575g;
import com.p2082ss.android.ugc.aweme.challenge.service.AbstractC35547d;
import com.p2082ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.p2082ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.p2082ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import com.p2082ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.p2082ss.android.ugc.aweme.challenge.widget.MonitorSizeChangedLinearLayout;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.preview.service.AdsPreviewServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41102a;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41135h;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41245k;
import com.p2082ss.android.ugc.aweme.detail.C41247m;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.metrics.C59240f;
import com.p2082ss.android.ugc.aweme.metrics.C59253r;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p2436cc.EnumC35431b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.C80638a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.aweme.views.C81437h;
import com.p2082ss.android.ugc.aweme.views.SpannedGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.j */
public class C35612j extends AbstractC35600b implements AbstractC20380ar<C34499i>, AbstractC20527q, AbstractC90252i, AbstractC90253j {

    /* renamed from: u */
    public static final C35622d f83995u = new C35622d((byte) 0);

    /* renamed from: N */
    private final AbstractC89244h f83996N = C89250i.m154774a(EnumC89331m.NONE, new C35630l(this));

    /* renamed from: O */
    private final AbstractC89244h f83997O = C89250i.m154774a(EnumC89331m.NONE, new C35636r(this));

    /* renamed from: P */
    private final AbstractC89244h f83998P = C89250i.m154774a(EnumC89331m.NONE, new C35639u(this));

    /* renamed from: Q */
    private final AbstractC89244h f83999Q = C89250i.m154774a(EnumC89331m.NONE, new C35632n(this));

    /* renamed from: R */
    private final AbstractC89244h f84000R = C89250i.m154774a(EnumC89331m.NONE, new C35633o(this));

    /* renamed from: S */
    private final AbstractC89244h f84001S = C89250i.m154774a(EnumC89331m.NONE, new C35634p(this));

    /* renamed from: T */
    private final AbstractC89244h f84002T = C89250i.m154774a(EnumC89331m.NONE, new C35637s(this));

    /* renamed from: U */
    private final AbstractC89244h f84003U = C89250i.m154774a(EnumC89331m.NONE, new C35635q(this));

    /* renamed from: V */
    private final AbstractC89244h f84004V = C89250i.m154774a(EnumC89331m.NONE, new C35631m(this));

    /* renamed from: W */
    private AbstractC35558a f84005W;

    /* renamed from: X */
    private C35575g f84006X;

    /* renamed from: Y */
    private ChallengeDetail f84007Y;

    /* renamed from: Z */
    private int f84008Z = -1;

    /* renamed from: aa */
    private boolean f84009aa = true;

    /* renamed from: ab */
    private boolean f84010ab;

    /* renamed from: ac */
    private boolean f84011ac;

    /* renamed from: ad */
    private boolean f84012ad;

    /* renamed from: ae */
    private final lifecycleAwareLazy f84013ae;

    /* renamed from: af */
    private final AbstractC89244h f84014af;

    /* renamed from: ag */
    private final AbstractC89244h f84015ag;

    /* renamed from: ah */
    private C80638a f84016ah;

    /* renamed from: ai */
    private boolean f84017ai;

    /* renamed from: aj */
    private float f84018aj;

    /* renamed from: ak */
    private float f84019ak;

    /* renamed from: al */
    private int f84020al;

    /* renamed from: am */
    private SparseArray f84021am;

    /* renamed from: d */
    final AbstractC89244h f84022d = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: e */
    public AbstractC35547d f84023e;

    /* renamed from: j */
    public C35658s f84024j;

    /* renamed from: k */
    public String f84025k;

    /* renamed from: l */
    public Challenge f84026l;

    /* renamed from: m */
    boolean f84027m;

    /* renamed from: n */
    public int f84028n;

    /* renamed from: o */
    public String f84029o;

    /* renamed from: p */
    public String f84030p = "";

    /* renamed from: q */
    public String f84031q = "";

    /* renamed from: r */
    public AbstractC89171a<C89378p<Long, String>> f84032r;

    /* renamed from: s */
    public C34499i f84033s = new C34499i();

    /* renamed from: t */
    public final String f84034t;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$aa */
    public static final class C35614aa extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84036a;

        static {
            Covode.recordClassIndex(42838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35614aa(C35612j jVar) {
            super(1);
            this.f84036a = jVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$aa$a */
        public static final class C35615a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ Activity f84037a;

            /* renamed from: b */
            final /* synthetic */ RecordConfig.Builder f84038b;

            /* renamed from: c */
            final /* synthetic */ Challenge f84039c;

            static {
                Covode.recordClassIndex(42839);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                asyncAVService.uiService().recordService().startRecord(this.f84037a, this.f84038b.build(), this.f84039c);
            }

            C35615a(Activity activity, RecordConfig.Builder builder, Challenge challenge) {
                this.f84037a = activity;
                this.f84038b = builder;
                this.f84039c = challenge;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            Challenge challenge;
            Intent intent;
            String str2;
            Music music;
            String str3;
            String str4 = "";
            C89219l.m154721d(view, str4);
            if (this.f84036a.getActivity() == null || !MSAdaptionService.m97895c().mo89375b((Context) this.f84036a.getActivity())) {
                this.f84036a.f84029o = UUID.randomUUID().toString();
                C35612j jVar = this.f84036a;
                if (TextUtils.equals(jVar.mo62634b().getEnterFrom(), "from_message")) {
                    str = "click_join_button";
                } else {
                    str = "click_tag_publish";
                }
                C59213ah.f134854c = str;
                C59213ah.f134852a = "challenge";
                Challenge challenge2 = jVar.f84026l;
                if (challenge2 != null && challenge2.isCommerce()) {
                    List<Music> connectMusics = challenge2.getConnectMusics();
                    if (connectMusics != null) {
                        music = (Music) C89070n.m154583g((List) connectMusics);
                    } else {
                        music = null;
                    }
                    C33743c a = new C33743c().mo59976a("shoot_way", "challenge");
                    String cid = challenge2.getCid();
                    if (cid == null) {
                        cid = str4;
                    }
                    C33743c a2 = a.mo59976a("challenge_id", cid);
                    String challengeName = challenge2.getChallengeName();
                    if (challengeName == null) {
                        challengeName = str4;
                    }
                    C33743c a3 = a2.mo59976a("challenge_name", challengeName);
                    if (music == null || (str3 = music.getMid()) == null) {
                        str3 = str4;
                    }
                    C33743c a4 = a3.mo59976a("music_id_to_bind", str3);
                    String stickerId = challenge2.getStickerId();
                    if (stickerId == null) {
                        stickerId = str4;
                    }
                    C33743c a5 = a4.mo59976a("sticker_id_to_bind", stickerId);
                    String mvId = challenge2.getMvId();
                    if (mvId != null) {
                        str4 = mvId;
                    }
                    C12290b.m22060a("shoot_monitor", 0, a5.mo59976a("mv_id_to_bind", str4).mo59977a());
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("route", "1");
                    jSONObject.put("group_id", jVar.mo62634b().getAwemeId());
                    jSONObject.put("impr_type", C59208ac.m108776j(AwemeService.m70060b().mo60684b(jVar.mo62634b().getAwemeId())));
                    if (!TextUtils.isEmpty(jVar.mo62634b().getEnterFrom())) {
                        jSONObject.put("challenge_from", jVar.mo62634b().getEnterFrom());
                    }
                    if (!TextUtils.isEmpty(jVar.mo62634b().getEnterpriseUid())) {
                        jSONObject.put("page_uid", jVar.mo62634b().getEnterpriseUid());
                    }
                    jSONObject.put("impr_type", C59208ac.m108776j(AwemeService.m70060b().mo60684b(jVar.mo62634b().getAwemeId())));
                    MobClick labelName = new MobClick().setEventName("shoot").setLabelName("challenge");
                    String str5 = jVar.f84025k;
                    if (str5 == null) {
                        C89219l.m154710a("mChallengeId");
                    }
                    C39162r.onEvent(labelName.setValue(str5).setJsonObject(jSONObject));
                    C33744d a6 = new C33744d().mo59983a("creation_id", jVar.f84029o).mo59983a("shoot_way", "challenge");
                    String str6 = jVar.f84025k;
                    if (str6 == null) {
                        C89219l.m154710a("mChallengeId");
                    }
                    C33744d a7 = a6.mo59983a("tag_id", str6).mo59983a("parent_tag_id", jVar.mo62634b().getParentTagId()).mo59983a("impr_type", C59208ac.m108776j(AwemeService.m70060b().mo60684b(jVar.mo62634b().getAwemeId()))).mo59983a("group_id", jVar.mo62634b().getAwemeId()).mo59983a("enter_from", "challenge").mo59983a("enter_method", "click_mv_publish").mo59983a("shoot_enter_from", jVar.mo62634b().getShootEnterFrom()).mo59982a("is_bundled", jVar.mo62634b().isBundled());
                    if (!TextUtils.isEmpty(jVar.mo62634b().getBannerId())) {
                        a7.mo59983a("from_banner_id", jVar.mo62634b().getBannerId());
                    }
                    if ("homepage_hot".equals(jVar.mo62634b().getEnterFrom())) {
                        a7.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108760a(jVar.mo62634b().getAwemeId(), 0)));
                    }
                    a7.mo59983a("process_id", jVar.f84030p);
                    C39162r.m79460a("shoot", a7.f79943a);
                    boolean equals = TextUtils.equals("general_search", jVar.mo62634b().getEnterFrom());
                    String str7 = "search_result";
                    boolean equals2 = TextUtils.equals(str7, jVar.mo62634b().getEnterFrom());
                    boolean equals3 = TextUtils.equals("search_for_you_list", jVar.mo62634b().getEnterFrom());
                    if (equals || equals2 || equals3) {
                        C33744d a8 = new C33744d().mo59983a("creation_id", jVar.f84029o).mo59983a("shoot_way", "challenge");
                        String str8 = jVar.f84025k;
                        if (str8 == null) {
                            C89219l.m154710a("mChallengeId");
                        }
                        C33744d a9 = a8.mo59983a("tag_id", str8);
                        if (equals) {
                            str2 = "general";
                        } else {
                            str2 = "tag";
                        }
                        C33744d a10 = a9.mo59983a("search_type", str2);
                        if (!equals) {
                            str7 = jVar.mo62634b().getEnterFrom();
                        }
                        C39162r.m79460a("search_shoot", a10.mo59983a("previous_page", str7).f79943a);
                    }
                    ActivityC0945e activity = jVar.getActivity();
                    if (!(activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("from_notification", false))) {
                        String a11 = C35612j.m72713a(intent, "rule_id");
                        if (!TextUtils.isEmpty(a11)) {
                            C33744d dVar = new C33744d();
                            String str9 = jVar.f84025k;
                            if (str9 == null) {
                                C89219l.m154710a("mChallengeId");
                            }
                            C39162r.m79460a("shoot_from_push", dVar.mo59983a("tag_id", str9).mo59983a("route", "1").mo59983a("group_id", jVar.mo62634b().getAwemeId()).mo59983a("rule_id", a11).f79943a);
                        }
                    }
                } catch (JSONException unused) {
                }
                if (AVExternalServiceImpl.m113114a().publishService().checkIsAlreadyPublished(this.f84036a.getContext()) && (challenge = this.f84036a.f84026l) != null) {
                    RecordConfig.Builder shootWay = new RecordConfig.Builder().shootWay("challenge");
                    String str10 = this.f84036a.f84029o;
                    if (str10 == null) {
                        C89219l.m154715b();
                    }
                    RecordConfig.Builder shootExtraData = shootWay.creationId(str10).challenge(challenge).translationType(3).musicType(1).shootExtraData(new ShootExtraData(this.f84036a.mo62634b().getShootEnterFrom(), this.f84036a.mo62634b().getBannerId(), this.f84036a.mo62634b().isBundled()));
                    boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                    boolean isRecording = AVExternalServiceImpl.m113114a().configService().shortVideoConfig().isRecording();
                    ActivityC0945e activity2 = this.f84036a.getActivity();
                    if (downloadEffectOrMusicAfterEnterCamera && (!isRecording || activity2 == null)) {
                        shootExtraData.recordPresetResource(new RecordPresetResource(challenge.getStickerId(), null, null, null));
                    }
                    if (activity2 != null) {
                        AVExternalServiceImpl.m113114a().asyncService("ChallengeDetail", new C35615a(activity2, shootExtraData, challenge));
                    }
                }
            } else {
                Toast makeText = Toast.makeText(this.f84036a.getActivity(), this.f84036a.getString(R.string.bed), 0);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$b */
    public static final class C35619b extends AbstractC89220m implements AbstractC89183m<ChallengeDetailState, Bundle, ChallengeDetailState> {
        public static final C35619b INSTANCE = new C35619b();

        static {
            Covode.recordClassIndex(42843);
        }

        public C35619b() {
            super(2);
        }

        public final ChallengeDetailState invoke(ChallengeDetailState challengeDetailState, Bundle bundle) {
            C89219l.m154719c(challengeDetailState, "");
            return challengeDetailState;
        }
    }

    static {
        Covode.recordClassIndex(42836);
    }

    /* renamed from: q */
    private final View m72719q() {
        return (View) this.f83997O.getValue();
    }

    /* renamed from: r */
    private final View m72720r() {
        return (View) this.f83998P.getValue();
    }

    /* renamed from: s */
    private final RelativeLayout m72721s() {
        return (RelativeLayout) this.f83999Q.getValue();
    }

    /* renamed from: t */
    private final View m72722t() {
        return (View) this.f84000R.getValue();
    }

    /* renamed from: u */
    private final ImageView m72723u() {
        return (ImageView) this.f84003U.getValue();
    }

    /* renamed from: v */
    private final MonitorSizeChangedLinearLayout m72724v() {
        return (MonitorSizeChangedLinearLayout) this.f84004V.getValue();
    }

    /* renamed from: w */
    private final ChallengeDetailJediViewModel m72725w() {
        return (ChallengeDetailJediViewModel) this.f84013ae.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final String mo62627a(int i) {
        return i != 0 ? i != 1 ? "" : "challenge_fresh" : "challenge";
    }

    /* renamed from: b */
    public final View mo62633b(int i) {
        if (this.f84021am == null) {
            this.f84021am = new SparseArray();
        }
        View view = (View) this.f84021am.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f84021am.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final ChallengeDetailParam mo62634b() {
        return (ChallengeDetailParam) this.f83996N.getValue();
    }

    /* renamed from: c */
    public final SpringLayout mo62636c() {
        return (SpringLayout) this.f84001S.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final DmtStatusView mo62637e() {
        return (DmtStatusView) this.f84002T.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C35612j.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new RunnableC90250g(C35612j.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(49, new RunnableC90250g(C35612j.class, "onMusicCollectEvent", C60793b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: h */
    public final int mo62639h() {
        return R.layout.mw;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$d */
    public static final class C35622d {
        static {
            Covode.recordClassIndex(42846);
        }

        private C35622d() {
        }

        public /* synthetic */ C35622d(byte b) {
            this();
        }

        /* renamed from: a */
        public static Bundle m72748a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$f */
    public static final class C35624f implements SpannedGridLayoutManager.AbstractC81418b {
        static {
            Covode.recordClassIndex(42848);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.SpannedGridLayoutManager.AbstractC81418b
        /* renamed from: a */
        public final boolean mo62654a() {
            return true;
        }

        C35624f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.views.SpannedGridLayoutManager.AbstractC81418b
        /* renamed from: a */
        public final SpannedGridLayoutManager.C81420d mo62653a(int i) {
            if (i == 0) {
                return new SpannedGridLayoutManager.C81420d(2, 2);
            }
            return new SpannedGridLayoutManager.C81420d(1, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$g */
    public static final class C35625g implements SpannedGridLayoutManager.AbstractC81418b {
        static {
            Covode.recordClassIndex(42849);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.SpannedGridLayoutManager.AbstractC81418b
        /* renamed from: a */
        public final boolean mo62654a() {
            return false;
        }

        C35625g() {
        }

        @Override // com.p2082ss.android.ugc.aweme.views.SpannedGridLayoutManager.AbstractC81418b
        /* renamed from: a */
        public final SpannedGridLayoutManager.C81420d mo62653a(int i) {
            if (i == 0) {
                return new SpannedGridLayoutManager.C81420d(2, 2);
            }
            return new SpannedGridLayoutManager.C81420d(1, 1);
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f84033s;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: a */
    public final void mo62632a(boolean z, boolean z2) {
        getContext();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m72726x();
        }
        if (!C58029j.f132253e) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            mo62637e().mo27387h();
            mo62636c().setRefreshing(false);
        } else {
            mo62637e().mo27384f();
            C18285c.m34006b("cd_start_activity_to_request_net_duration");
            m72725w().mo62698a(mo62634b().getCid(), mo62634b().getClickReason(), mo62634b().isHashTag(), z2, mo62634b().getPreviewToken());
            List<AbstractC41135h> list = this.f96076I;
            if (z && list != null) {
                for (AbstractC41135h hVar : list) {
                    hVar.mo62669a(false, true);
                }
            }
        }
        if (z2) {
            mo62637e().mo27382d();
            mo62628a(0.0f, -60.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$t */
    static final class C35638t extends AbstractC89220m implements AbstractC89171a<HashMap<Integer, View>> {

        /* renamed from: a */
        public static final C35638t f84062a = new C35638t();

        static {
            Covode.recordClassIndex(42862);
        }

        C35638t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<Integer, View> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: g */
    public final List<AbstractC41135h> mo62638g() {
        List<AbstractC41135h> list = this.f96076I;
        C89219l.m154716b(list, "");
        return list;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$a */
    public static final class C35613a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f84035a;

        static {
            Covode.recordClassIndex(42837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35613a(AbstractC89277c cVar) {
            super(0);
            this.f84035a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f84035a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$ac */
    public static final class RunnableC35617ac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35612j f84041a;

        static {
            Covode.recordClassIndex(42841);
        }

        RunnableC35617ac(C35612j jVar) {
            this.f84041a = jVar;
        }

        public final void run() {
            ScrollableLayout scrollableLayout = this.f84041a.f96084y;
            if (scrollableLayout != null) {
                scrollableLayout.setMaxScrollHeight(Integer.MAX_VALUE);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$m */
    static final class C35631m extends AbstractC89220m implements AbstractC89171a<MonitorSizeChangedLinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84055a;

        static {
            Covode.recordClassIndex(42855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35631m(C35612j jVar) {
            super(0);
            this.f84055a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MonitorSizeChangedLinearLayout invoke() {
            return this.f84055a.mo62633b(R.id.be4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$n */
    static final class C35632n extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84056a;

        static {
            Covode.recordClassIndex(42856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35632n(C35612j jVar) {
            super(0);
            this.f84056a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f84056a.mo62633b(R.id.e6t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$o */
    static final class C35633o extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84057a;

        static {
            Covode.recordClassIndex(42857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35633o(C35612j jVar) {
            super(0);
            this.f84057a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f84057a.mo62633b(R.id.e6q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$p */
    static final class C35634p extends AbstractC89220m implements AbstractC89171a<TuxRefreshLayout> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84058a;

        static {
            Covode.recordClassIndex(42858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35634p(C35612j jVar) {
            super(0);
            this.f84058a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxRefreshLayout invoke() {
            return this.f84058a.mo62633b(R.id.c5p);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$q */
    static final class C35635q extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84059a;

        static {
            Covode.recordClassIndex(42859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35635q(C35612j jVar) {
            super(0);
            this.f84059a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f84059a.mo62633b(R.id.dxf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$r */
    static final class C35636r extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84060a;

        static {
            Covode.recordClassIndex(42860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35636r(C35612j jVar) {
            super(0);
            this.f84060a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f84060a.mo62633b(R.id.e7_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$s */
    static final class C35637s extends AbstractC89220m implements AbstractC89171a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84061a;

        static {
            Covode.recordClassIndex(42861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35637s(C35612j jVar) {
            super(0);
            this.f84061a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.f84061a.mo62633b(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$u */
    static final class C35639u extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84063a;

        static {
            Covode.recordClassIndex(42863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35639u(C35612j jVar) {
            super(0);
            this.f84063a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f84063a.mo62633b(R.id.ejf);
        }
    }

    /* renamed from: x */
    private static boolean m72726x() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: i */
    public final String mo62640i() {
        String str = this.f84025k;
        if (str == null) {
            C89219l.m154710a("mChallengeId");
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: k */
    public final void mo62642k() {
        super.mo62642k();
        DmtTabLayout dmtTabLayout = this.f96070C;
        if (dmtTabLayout != null) {
            dmtTabLayout.setBackgroundResource(R.color.l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$i */
    static final class C35627i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84051a;

        static {
            Covode.recordClassIndex(42851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35627i(C35612j jVar) {
            super(0);
            this.f84051a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f84051a.mo62632a(true, true);
            C39162r.m79460a("refresh_page", new C33744d().mo59983a("enter_from", "challenge").f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$v */
    static final class C35640v extends AbstractC89220m implements AbstractC89171a<ChallengeDetailViewModel> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84064a;

        static {
            Covode.recordClassIndex(42864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35640v(C35612j jVar) {
            super(0);
            this.f84064a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ChallengeDetailViewModel invoke() {
            ActivityC0945e activity = this.f84064a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            return ChallengeDetailViewModel.C35676a.m72830a(activity);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo62644m() {
        FrameLayout frameLayout = (FrameLayout) mo62633b(R.id.s0);
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(2131231565);
        }
        this.f84010ab = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$c */
    public static final class C35620c extends AbstractC89220m implements AbstractC89171a<ChallengeDetailJediViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f84043a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f84044b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f84045c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f84046d;

        static {
            Covode.recordClassIndex(42844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35620c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f84043a = fragment;
            this.f84044b = aVar;
            this.f84045c = cVar;
            this.f84046d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f84043a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f84044b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f84045c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m72747xfde60287(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel> r0 = com.p2082ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.challenge.ui.j$c$1 r0 = new com.ss.android.ugc.aweme.challenge.ui.j$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35612j.C35620c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_challenge_ui_ChallengeDetailFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m72747xfde60287(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$l */
    static final class C35630l extends AbstractC89220m implements AbstractC89171a<ChallengeDetailParam> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84054a;

        static {
            Covode.recordClassIndex(42854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35630l(C35612j jVar) {
            super(0);
            this.f84054a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ChallengeDetailParam invoke() {
            Object value = this.f84054a.f84022d.getValue();
            if (value == null) {
                return new ChallengeDetailParam(null, null, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262143, null);
            }
            return value;
        }
    }

    /* renamed from: j */
    public final List<Aweme> mo62641j() {
        List<Aweme> p;
        if (this.f96076I == null || !(this.f96076I.get(this.f96074G) instanceof C35658s)) {
            return C89086z.INSTANCE;
        }
        Object obj = this.f96076I.get(this.f96074G);
        if (!(obj instanceof C35658s)) {
            obj = null;
        }
        C35658s sVar = (C35658s) obj;
        if (sVar == null || (p = sVar.mo62689p()) == null) {
            return C89086z.INSTANCE;
        }
        return p;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ChallengeDetail challengeDetail = this.f84007Y;
        if (challengeDetail != null && challengeDetail.previewStatus == 1) {
            IAdsPreviewService a = AdsPreviewServiceImpl.m77711a();
            RelativeLayout relativeLayout = (RelativeLayout) mo62633b(R.id.dku);
            C89219l.m154716b(relativeLayout, "");
            a.mo66935b(relativeLayout);
        }
        super.onDestroyView();
        SparseArray sparseArray = this.f84021am;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$ad */
    public static final class RunnableC35618ad implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35612j f84042a;

        static {
            Covode.recordClassIndex(42842);
        }

        RunnableC35618ad(C35612j jVar) {
            this.f84042a = jVar;
        }

        public final void run() {
            User author;
            C35612j jVar = this.f84042a;
            if (jVar.mo62633b(R.id.ry) != null) {
                SpringLayout springLayout = (SpringLayout) jVar.mo62633b(R.id.c5p);
                if (springLayout != null) {
                    springLayout.setOnScrollChangeListener(new C35616ab(jVar));
                }
                Challenge challenge = jVar.f84026l;
                if (challenge != null) {
                    String challengeBgUrl = challenge.getChallengeBgUrl();
                    UrlModel backgroundImageUrl = challenge.getBackgroundImageUrl();
                    if (!(!C35570b.m72676a(challengeBgUrl) && backgroundImageUrl == null && (challenge.getSubType() != 1 || (author = challenge.getAuthor()) == null || author.getAvatarLarger() == null))) {
                        jVar.f84027m = true;
                    }
                    if (!TextUtils.isEmpty(challengeBgUrl)) {
                        C20766v a = C20761r.m39061a(challengeBgUrl).mo34179a(jVar.getTag());
                        a.f49092E = (SmartImageView) jVar.mo62633b(R.id.ry);
                        a.mo34186c();
                        jVar.mo62644m();
                    } else if (backgroundImageUrl != null) {
                        C20766v a2 = C20761r.m39060a(C34735v.m70965a(backgroundImageUrl)).mo34179a(jVar.getTag());
                        a2.f49092E = (SmartImageView) jVar.mo62633b(R.id.ry);
                        a2.mo34186c();
                        jVar.mo62644m();
                    } else {
                        User author2 = challenge.getAuthor();
                        if (author2 != null && challenge.getSubType() == 1) {
                            C20766v a3 = C20761r.m39060a(C34735v.m70965a(author2.getAvatarLarger())).mo34179a(jVar.getTag());
                            a3.f49092E = (SmartImageView) jVar.mo62633b(R.id.ry);
                            a3.mo34186c();
                            jVar.mo62644m();
                        }
                    }
                }
            }
        }
    }

    public C35612j() {
        AbstractC89277c a = C89204ab.m154669a(ChallengeDetailJediViewModel.class);
        C35613a aVar = new C35613a(a);
        this.f84013ae = new lifecycleAwareLazy(this, aVar, new C35620c(this, aVar, a, C35619b.INSTANCE));
        this.f84014af = C89250i.m154774a(EnumC89331m.NONE, new C35640v(this));
        this.f84015ag = C89250i.m154774a(EnumC89331m.NONE, C35638t.f84062a);
        this.f84034t = "msadapt";
        this.f84020al = -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: l */
    public final AbstractC0974l mo62643l() {
        int a;
        SpannedGridLayoutManager.AbstractC81418b fVar;
        String str;
        this.f96076I = new ArrayList();
        this.f96077J = new ArrayList();
        this.f83959a = new ArrayList();
        boolean z = false;
        Fragment a2 = getChildFragmentManager().mo3551a(AbstractC41102a.f96067v + 0);
        boolean z2 = a2 instanceof C35658s;
        C35658s sVar = a2;
        if (!z2) {
            if (mo62634b().getChallengeType() == Math.abs(2) || (a = C16048b.m29633a().mo25412a(true, "[Discover] Hashtag - Instagram layout", 1)) == 1) {
                fVar = null;
            } else if (a != 3) {
                fVar = new C35625g();
            } else {
                fVar = new C35624f();
            }
            C35657r rVar = new C35657r(mo62634b().getParentTagId());
            String str2 = this.f84025k;
            if (str2 == null) {
                C89219l.m154710a("mChallengeId");
            }
            boolean isHashTag = mo62634b().isHashTag();
            if (mo62634b().isHashTag()) {
                str = this.f84025k;
                if (str == null) {
                    C89219l.m154710a("mChallengeId");
                }
            } else {
                str = "";
            }
            String enterFrom = mo62634b().getEnterFrom();
            String str3 = this.f84030p;
            String awemeId = mo62634b().getAwemeId();
            C35607h hVar = new C35607h(null, 1, null);
            hVar.setPreloadInfoInvoke(this.f84032r);
            C35658s sVar2 = new C35658s();
            Bundle bundle = new Bundle();
            bundle.putSerializable("detail_config", rVar);
            bundle.putInt("detail_aweme_list_type", 2);
            bundle.putString("event_label", "challenge");
            bundle.putString("detail_id", str2);
            bundle.putBoolean("extra_challenge_is_hashtag", isHashTag);
            bundle.putString("extra_challenge_hashtag_name", str);
            bundle.putString("detail_aweme_from", enterFrom);
            bundle.putString("detail_aweme_from_aid", awemeId);
            bundle.putString("process_id", str3);
            bundle.putString("group_id", awemeId);
            sVar2.setArguments(bundle);
            sVar2.f84111G = hVar;
            sVar2.f84112H = fVar;
            C35658s sVar3 = sVar2;
            sVar3.f84137u = new C35623e(this);
            if (this.f96074G == 0) {
                z = true;
            }
            sVar3.f84141z = z;
            sVar3.f84133q = mo62637e();
            sVar3.f84105A = true;
            sVar = sVar2;
        }
        Objects.requireNonNull(sVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
        C35658s sVar4 = (C35658s) sVar;
        this.f84024j = sVar4;
        if (sVar4 == null) {
            C89219l.m154710a("mHotFragment");
        }
        sVar4.f84133q = mo62637e();
        List list = this.f96076I;
        C35658s sVar5 = this.f84024j;
        if (sVar5 == null) {
            C89219l.m154710a("mHotFragment");
        }
        list.add(sVar5);
        List list2 = this.f96077J;
        C35658s sVar6 = this.f84024j;
        if (sVar6 == null) {
            C89219l.m154710a("mHotFragment");
        }
        list2.add(sVar6);
        this.f83959a.add(2);
        return new C64117cn(getChildFragmentManager(), this.f96077J, this.f83959a);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$k */
    static final class View$OnClickListenerC35629k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35612j f84053a;

        static {
            Covode.recordClassIndex(42853);
        }

        View$OnClickListenerC35629k(C35612j jVar) {
            this.f84053a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84053a.mo62632a((C35612j) true, false);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m72714a(C35612j jVar) {
        String str = jVar.f84025k;
        if (str == null) {
            C89219l.m154710a("mChallengeId");
        }
        return str;
    }

    /* renamed from: b */
    public static final /* synthetic */ C35658s m72717b(C35612j jVar) {
        C35658s sVar = jVar.f84024j;
        if (sVar == null) {
            C89219l.m154710a("mHotFragment");
        }
        return sVar;
    }

    /* renamed from: b */
    private final void m72718b(View view) {
        m72715a(view, new C35614aa(this));
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        C89219l.m154721d(aVar, "");
        String str = aVar.f81610a;
        if (str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/challenge/detail/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            mo62632a(true, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$h */
    public static final class View$OnClickListenerC35626h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35612j f84049a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f84050b;

        static {
            Covode.recordClassIndex(42850);
        }

        View$OnClickListenerC35626h(C35612j jVar, AbstractC89172b bVar) {
            this.f84049a = jVar;
            this.f84050b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                AbstractC35547d dVar = this.f84049a.f84023e;
                if (dVar == null) {
                    C89219l.m154710a("mCommerceDelegate");
                }
                C89219l.m154716b(view, "");
                if (!dVar.mo62533a(view.getId())) {
                    this.f84050b.invoke(view);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$w */
    static final class C35641w extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84065a;

        static {
            Covode.recordClassIndex(42865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35641w(C35612j jVar) {
            super(1);
            this.f84065a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            if (MSAdaptionService.m97895c().mo89377c(this.f84065a.getContext())) {
                SmartRouter.buildRoute(this.f84065a.getContext(), "//duo").withParam("duo_type", "duo_back").open();
            } else {
                ActivityC0945e activity = this.f84065a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$e */
    static final class C35623e implements AbstractC41245k {

        /* renamed from: a */
        final /* synthetic */ C35612j f84048a;

        static {
            Covode.recordClassIndex(42847);
        }

        C35623e(C35612j jVar) {
            this.f84048a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41245k
        /* renamed from: a */
        public final void mo62652a(boolean z) {
            if (z) {
                if (TextUtils.equals(this.f84048a.mo62634b().getEnterFrom(), "from_related_tag")) {
                    C59253r rVar = new C59253r();
                    rVar.f135340q = C35612j.m72714a(this.f84048a);
                    C59253r p = rVar.mo96828p(C35612j.m72717b(this.f84048a).mo62536b());
                    String enterFrom = this.f84048a.mo62634b().getEnterFrom();
                    if (enterFrom == null) {
                        enterFrom = "";
                    }
                    C59253r o = p.mo96827o(enterFrom);
                    o.f135323aa = this.f84048a.mo62634b().getParentTagId();
                    o.mo96792f();
                    C35612j jVar = this.f84048a;
                    String jSONObject = C35612j.m72717b(jVar).mo62535a().toString();
                    C89219l.m154716b(jSONObject, "");
                    jVar.f84031q = jSONObject;
                }
            } else if (this.f84048a.mo62636c().f55533g) {
                this.f84048a.mo62636c().setRefreshing(false);
            }
        }
    }

    @AbstractC90264r
    public final void onMusicCollectEvent(C60793b bVar) {
        MusicModel musicModel;
        Music music;
        T t;
        C89219l.m154721d(bVar, "");
        if (af_() && (musicModel = bVar.f138151b) != null && (music = musicModel.getMusic()) != null) {
            int i = bVar.f138150a;
            music.setCollectStatus(i);
            Challenge challenge = this.f84026l;
            if (challenge != null && challenge.getConnectMusics() != null) {
                Challenge challenge2 = this.f84026l;
                if (challenge2 == null) {
                    C89219l.m154715b();
                }
                List<Music> connectMusics = challenge2.getConnectMusics();
                C89219l.m154716b(connectMusics, "");
                Iterator<T> it = connectMusics.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    C89219l.m154716b(t2, "");
                    if (C89219l.m154714a((Object) t2.getMid(), (Object) music.getMid())) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    t3.setCollectStatus(i);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$j */
    static final class C35628j extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84052a;

        static {
            Covode.recordClassIndex(42852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35628j(C35612j jVar) {
            super(1);
            this.f84052a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            if (this.f84052a.f84026l != null) {
                C35612j jVar = this.f84052a;
                jVar.getContext();
                Challenge challenge = jVar.f84026l;
                if (challenge == null) {
                    C89219l.m154715b();
                }
                C39162r.m79455a("click_share_button", "challenge_hot", challenge.getCid(), 0);
                C59240f a = new C59240f().mo96797a("challenge_hot");
                String awemeId = this.f84052a.mo62634b().getAwemeId();
                if (awemeId == null) {
                    awemeId = "";
                }
                a.f135186a = awemeId;
                a.mo96792f();
                C39162r.m79460a("share_challenge", new C33744d().mo59983a("enter_from", "challenge").mo59983a("group_id", this.f84052a.mo62634b().getAwemeId()).mo59983a("challenge_id", C35612j.m72714a(this.f84052a)).mo59983a("process_id", this.f84052a.f84030p).f79943a);
                ShareService shareService = C68863ah.f154027a;
                ActivityC0945e activity = this.f84052a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                shareService.mo109401a(activity, this.f84052a.f84026l, this.f84052a.mo62641j(), C35612j.m72714a(this.f84052a), this.f84052a.mo62634b().isHashTag(), this.f84052a.f84031q, this.f84052a.f84030p, this.f84052a.mo62634b().getParentTagId());
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r
    public final void onVideoEvent(C49672ag agVar) {
        Aweme b;
        List<Challenge> challengeList;
        C89219l.m154721d(agVar, "");
        if (agVar.f114315a == 2 && af_() && this.f84026l != null) {
            Object obj = agVar.f114316b;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (!(TextUtils.isEmpty(str) || (b = AwemeService.m70060b().mo60684b(str)) == null || (challengeList = b.getChallengeList()) == null)) {
                for (T t : challengeList) {
                    C89219l.m154716b(t, "");
                    String cid = t.getCid();
                    Challenge challenge = this.f84026l;
                    if (challenge == null) {
                        C89219l.m154715b();
                    }
                    if (C13627m.m24499a(cid, challenge.getCid())) {
                        Challenge challenge2 = this.f84026l;
                        if (challenge2 == null) {
                            C89219l.m154715b();
                        }
                        if (challenge2.getUserCount() > 0) {
                            Challenge challenge3 = this.f84026l;
                            if (challenge3 == null) {
                                C89219l.m154715b();
                            }
                            Challenge challenge4 = this.f84026l;
                            if (challenge4 == null) {
                                C89219l.m154715b();
                            }
                            challenge3.setUserCount(challenge4.getUserCount() - 1);
                            mo62631a(this.f84007Y);
                        }
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62630a(Bundle bundle) {
        String cid = mo62634b().getCid();
        String str = "";
        if (cid == null) {
            cid = str;
        }
        this.f84025k = cid;
        this.f84008Z = mo62634b().getShowTabIndex();
        String processId = mo62634b().getProcessId();
        if (processId != null) {
            str = processId;
        }
        this.f84030p = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0222  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62631a(com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail r22) {
        /*
        // Method dump skipped, instructions count: 964
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35612j.mo62631a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    /* renamed from: a */
    static String m72713a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$y */
    static final class C35643y extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, ChallengeDetail, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84067a;

        static {
            Covode.recordClassIndex(42867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35643y(C35612j jVar) {
            super(2);
            this.f84067a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, ChallengeDetail challengeDetail) {
            ChallengeDetail challengeDetail2 = challengeDetail;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(challengeDetail2, "");
            this.f84067a.mo62631a(challengeDetail2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m72715a(View view, AbstractC89172b<? super View, C89391z> bVar) {
        view.setOnClickListener(new View$OnClickListenerC35626h(this, bVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$z */
    static final class C35644z extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84068a;

        static {
            Covode.recordClassIndex(42868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35644z(C35612j jVar) {
            super(2);
            this.f84068a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            C35612j jVar = this.f84068a;
            if (jVar.af_()) {
                C35434c.m72462a("challenge_detail", EnumC35431b.FAIL);
                jVar.mo62636c().setRefreshing(false);
                new C23144b(jVar).mo37640e(R.string.dcq).mo37637b();
                jVar.mo62637e().mo27387h();
                ActivityC0945e activity = jVar.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                C33615a.m68848a(activity, th2, (int) R.string.g1i);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62628a(float f, float f2) {
        if (CommerceChallengeServiceImpl.m75741e().mo65395c(this.f84026l)) {
            super.mo62628a(f, f2);
        } else {
            this.f84011ac = C41247m.m83131a(f, f2, this.f84011ac, this);
        }
        AbstractC35547d dVar = this.f84023e;
        if (dVar == null) {
            C89219l.m154710a("mCommerceDelegate");
        }
        dVar.mo62531a(f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: b */
    public final void mo62635b(int i, int i2) {
        int i3;
        super.mo62635b(i, i2);
        AbstractC35547d dVar = this.f84023e;
        if (dVar == null) {
            C89219l.m154710a("mCommerceDelegate");
        }
        dVar.mo62534b(i);
        if (this.f84005W != null) {
            float f = 0.0f;
            if (this.f84020al != m72724v().getBottom()) {
                int bottom = m72724v().getBottom();
                View view = this.f96068A;
                C89219l.m154716b(view, "");
                float bottom2 = (float) ((bottom - view.getBottom()) - m72719q().getHeight());
                this.f84018aj = bottom2;
                float b = bottom2 - C13628n.m24520b(getContext(), 20.0f);
                this.f84019ak = b;
                if (b < 0.0f) {
                    this.f84019ak = 0.0f;
                }
                this.f84020al = m72724v().getBottom();
            }
            if (i == 0) {
                m72720r().setBackground(new ColorDrawable(C0643b.m2378c(m72720r().getContext(), R.color.c9)));
            } else {
                m72720r().setBackground(new ColorDrawable(C0643b.m2378c(m72720r().getContext(), R.color.l)));
            }
            AbstractC35558a aVar = this.f84005W;
            if (aVar != null) {
                i3 = aVar.getAvatarContainerHight();
            } else {
                i3 = 1;
            }
            float f2 = ((float) i) / ((float) i3);
            if (f2 >= 0.0f) {
                if (f2 > 1.0f) {
                    f = 1.0f;
                } else {
                    f = f2;
                }
            }
            TextView textView = this.f96085z;
            C89219l.m154716b(textView, "");
            textView.setAlpha(f);
            if (!CommerceChallengeServiceImpl.m75741e().mo65395c(this.f84026l)) {
                this.f84011ac = C41247m.m83132a(f, this.f84011ac, this);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62629a(int i, int i2) {
        boolean z;
        super.mo62629a(i, i2);
        Set<Map.Entry> entrySet = ((HashMap) this.f84015ag.getValue()).entrySet();
        if (entrySet != null) {
            for (Map.Entry entry : entrySet) {
                Object value = entry.getValue();
                C89219l.m154716b(value, "");
                View view = (View) value;
                Integer num = (Integer) entry.getKey();
                if (num != null && num.intValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                view.setSelected(z);
            }
        }
        if (this.f96076I != null) {
            Object obj = this.f96076I.get(i);
            AbstractC41135h hVar = (AbstractC41135h) obj;
            C89219l.m154716b(hVar, "");
            if (!hVar.mo62674d()) {
                obj = null;
            }
            AbstractC41135h hVar2 = (AbstractC41135h) obj;
            if (hVar2 != null) {
                hVar2.mo62677j();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        int identifier;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(mo62634b().getCid())) {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        DmtTabLayout dmtTabLayout = this.f96070C;
        C89219l.m154716b(dmtTabLayout, "");
        dmtTabLayout.setVisibility(8);
        TextView textView = this.f96085z;
        C89219l.m154716b(textView, "");
        textView.setVisibility(0);
        if (MSAdaptionService.m97895c().mo89377c(getContext())) {
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo62633b(R.id.pi);
            C89219l.m154716b(autoRTLImageView, "");
            autoRTLImageView.setVisibility(8);
        }
        AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) mo62633b(R.id.pi);
        C89219l.m154716b(autoRTLImageView2, "");
        m72715a(autoRTLImageView2, new C35641w(this));
        int i2 = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            i = 0;
        } else {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        float dimension = getResources().getDimension(R.dimen.a0s);
        m72719q().getLayoutParams().height = i;
        m72719q().setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = mo62637e().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (((float) i) + dimension);
        m72715a(m72723u(), new C35628j(this));
        ChallengeDetailLegacyServiceImpl.m72544a().mo57211a(m72723u());
        mo62637e().setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27407b(C81437h.m141212a(getContext(), new View$OnClickListenerC35629k(this))));
        getResources().getDimensionPixelSize(R.dimen.ea);
        mo62636c().setScrollMode(EnumC23429g.NONE);
        mo62636c().setOnRefreshListener(new C35627i(this));
        m72724v().setOnSizeChangedListener(new C35642x(this));
        Context context2 = getContext();
        if (context2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context2, "");
        C89219l.m154721d(context2, "");
        this.f84006X = new C35575g(context2);
        AbstractC35547d a = ChallengeDetailProvicer.m72635b().mo62520a(view, this);
        C89219l.m154716b(a, "");
        this.f84023e = a;
        AbstractC20468h.C20469a.m38667a(this, m72725w(), C35645k.f84069a, (C20370ah) null, new C35644z(this), (AbstractC89172b) null, new C35643y(this), 10);
        mo62632a((C35612j) false, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$ab */
    static final class C35616ab extends AbstractC89220m implements AbstractC89187q<Integer, Integer, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84040a;

        static {
            Covode.recordClassIndex(42840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35616ab(C35612j jVar) {
            super(3);
            this.f84040a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Integer num, Integer num2, Boolean bool) {
            int intValue = num.intValue();
            num2.intValue();
            bool.booleanValue();
            int i = this.f84040a.f84028n;
            View b = this.f84040a.mo62633b(R.id.e7_);
            C89219l.m154716b(b, "");
            int height = i + b.getHeight();
            LinearLayout linearLayout = (LinearLayout) this.f84040a.mo62633b(R.id.ejf);
            C89219l.m154716b(linearLayout, "");
            float height2 = (float) ((height + linearLayout.getHeight()) - intValue);
            int i2 = this.f84040a.f84028n;
            View b2 = this.f84040a.mo62633b(R.id.e7_);
            C89219l.m154716b(b2, "");
            int height3 = i2 + b2.getHeight();
            LinearLayout linearLayout2 = (LinearLayout) this.f84040a.mo62633b(R.id.ejf);
            C89219l.m154716b(linearLayout2, "");
            float height4 = height2 / ((float) (height3 + linearLayout2.getHeight()));
            SmartImageView smartImageView = (SmartImageView) this.f84040a.mo62633b(R.id.ry);
            if (smartImageView != null) {
                smartImageView.setScaleY(height4);
            }
            SmartImageView smartImageView2 = (SmartImageView) this.f84040a.mo62633b(R.id.ry);
            if (smartImageView2 != null) {
                smartImageView2.setScaleX(height4);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$x */
    static final class C35642x extends AbstractC89220m implements AbstractC89188r<Integer, Integer, Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35612j f84066a;

        static {
            Covode.recordClassIndex(42866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35642x(C35612j jVar) {
            super(4);
            this.f84066a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, Integer num3, Integer num4) {
            ViewGroup.LayoutParams layoutParams;
            num.intValue();
            int intValue = num2.intValue();
            num3.intValue();
            num4.intValue();
            this.f84066a.f84028n = intValue;
            SmartImageView smartImageView = (SmartImageView) this.f84066a.mo62633b(R.id.ry);
            if (!(smartImageView == null || (layoutParams = smartImageView.getLayoutParams()) == null)) {
                int i = this.f84066a.f84028n;
                View b = this.f84066a.mo62633b(R.id.e7_);
                C89219l.m154716b(b, "");
                int height = i + b.getHeight();
                LinearLayout linearLayout = (LinearLayout) this.f84066a.mo62633b(R.id.ejf);
                C89219l.m154716b(linearLayout, "");
                layoutParams.height = height + linearLayout.getHeight();
            }
            SmartImageView smartImageView2 = (SmartImageView) this.f84066a.mo62633b(R.id.ry);
            if (smartImageView2 != null) {
                smartImageView2.requestLayout();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
