package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lobby.auth.C20886c;
import com.bytedance.lobby.internal.C20919d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23048e;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63425ak;
import com.p2082ss.android.ugc.aweme.profile.edit.AbstractC63524b;
import com.p2082ss.android.ugc.aweme.profile.edit.AbstractC63525c;
import com.p2082ss.android.ugc.aweme.profile.edit.AbstractC63526d;
import com.p2082ss.android.ugc.aweme.profile.edit.C63534h;
import com.p2082ss.android.ugc.aweme.profile.edit.C63541m;
import com.p2082ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.p2082ss.android.ugc.aweme.profile.edit.api.C63521a;
import com.p2082ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.ViewTreeObserver$OnGlobalLayoutListenerC63560c;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63736b;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63743e;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63745g;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.model.UserBioPermission;
import com.p2082ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63497d;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63498e;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63766ae;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63803y;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64024bj;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64032bk;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63821a;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63828ae;
import com.p2082ss.android.ugc.aweme.profile.service.C63866a;
import com.p2082ss.android.ugc.aweme.profile.settings.C63875b;
import com.p2082ss.android.ugc.aweme.profile.settings.C63876c;
import com.p2082ss.android.ugc.aweme.profile.settings.C63877d;
import com.p2082ss.android.ugc.aweme.services.external.IDonationService;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68069d;
import com.p2082ss.android.ugc.aweme.setting.verification.C68706b;
import com.p2082ss.android.ugc.aweme.setting.verification.C68707c;
import com.p2082ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80346dk;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.p4376e.C85084a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bm */
public class C64048bm extends AbstractC63978aj implements AbstractC63524b, AbstractC63525c, AbstractC63526d, AbstractC63852p, AbstractC63860x, AbstractC64019be, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private static final boolean f145241a = false;

    /* renamed from: o */
    protected static final List<String> f145242o = Arrays.asList(UGCMonitor.TYPE_PHOTO, "video", "nickname", "supported_ngo", "bio", "instagram", "twitter", "youtube", "category", "website", "bio_email");

    /* renamed from: A */
    protected boolean f145243A;

    /* renamed from: B */
    protected LinearLayout f145244B;

    /* renamed from: C */
    protected LinearLayout f145245C;

    /* renamed from: D */
    protected TextView f145246D;

    /* renamed from: E */
    protected TuxTextCell f145247E;

    /* renamed from: F */
    protected TuxTextCell f145248F;

    /* renamed from: G */
    protected TuxTextCell f145249G;

    /* renamed from: H */
    protected TuxTextCell f145250H;

    /* renamed from: I */
    protected TuxTextCell f145251I;

    /* renamed from: J */
    protected TuxTextCell f145252J;

    /* renamed from: K */
    protected TuxTextCell f145253K;

    /* renamed from: L */
    protected TuxTextCell f145254L;

    /* renamed from: M */
    protected TuxTextCell f145255M;

    /* renamed from: N */
    protected TuxTextCell f145256N;

    /* renamed from: O */
    protected View f145257O;

    /* renamed from: P */
    protected TuxTextCell f145258P;

    /* renamed from: Q */
    protected TuxTextCell f145259Q;

    /* renamed from: R */
    protected TuxTextCell f145260R;

    /* renamed from: S */
    protected InstagramPresenter f145261S;

    /* renamed from: T */
    protected C63534h f145262T;

    /* renamed from: U */
    protected C63541m f145263U;

    /* renamed from: V */
    String f145264V = "";

    /* renamed from: W */
    protected boolean f145265W = false;

    /* renamed from: X */
    User f145266X;

    /* renamed from: b */
    private boolean f145267b = false;

    /* renamed from: c */
    private C68707c f145268c;

    /* renamed from: d */
    private int f145269d = 0;

    /* renamed from: e */
    private ProfileNgoStruct f145270e;

    /* renamed from: p */
    protected List<String> f145271p;

    /* renamed from: q */
    C33744d f145272q = new C33744d();

    /* renamed from: r */
    protected AnimatedImageView f145273r;

    /* renamed from: s */
    protected DmtStatusView f145274s;

    /* renamed from: t */
    protected TuxNavBar f145275t;

    /* renamed from: u */
    protected C63828ae f145276u;

    /* renamed from: v */
    protected C63821a f145277v;

    /* renamed from: w */
    protected boolean f145278w;

    /* renamed from: x */
    protected boolean f145279x;

    /* renamed from: y */
    protected User f145280y;

    /* renamed from: z */
    protected C63425ak f145281z;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo103582b() {
        return R.layout.anj;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(365, new RunnableC90250g(C64048bm.class, "onEditCategorySuccessEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(366, new RunnableC90250g(C64048bm.class, "onAppStoreLinkSuccess", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo103581a(View view) {
        this.f145274s.setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.cpv);
        this.f145275t = tuxNavBar;
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23187b a = new C23187b().mo37738a(R.raw.icon_arrow_left_ltr);
        a.f54930b = true;
        tuxNavBar.setNavActions(aVar.mo37732a(a.mo37740a((AbstractC23190d) new C64088cb(this, view))).mo37731a(new C23194g().mo37753a((String) getText(R.string.bk_))));
        C63821a aVar2 = new C63821a();
        this.f145277v = aVar2;
        aVar2.f144681c = this;
        this.f145277v.mo102165b(getActivity(), this);
        C63828ae aeVar = new C63828ae();
        this.f145276u = aeVar;
        aeVar.f144692c = this;
        this.f145268c = new C68707c();
        this.f145260R.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103619a(String str, TuxTextCell tuxTextCell) {
        String language;
        String str2;
        int i;
        int i2;
        int i3;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1008549514:
                if (str.equals("app_store_link")) {
                    c = 0;
                    break;
                }
                break;
            case -994687732:
                if (str.equals("pronouns")) {
                    c = 1;
                    break;
                }
                break;
            case -991745245:
                if (str.equals("youtube")) {
                    c = 2;
                    break;
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    c = 3;
                    break;
                }
                break;
            case -265713450:
                if (str.equals("username")) {
                    c = 4;
                    break;
                }
                break;
            case -180337243:
                if (str.equals("bio_email")) {
                    c = 5;
                    break;
                }
                break;
            case 97544:
                if (str.equals("bio")) {
                    c = 6;
                    break;
                }
                break;
            case 28903346:
                if (str.equals("instagram")) {
                    c = 7;
                    break;
                }
                break;
            case 50511102:
                if (str.equals("category")) {
                    c = '\b';
                    break;
                }
                break;
            case 70690926:
                if (str.equals("nickname")) {
                    c = '\t';
                    break;
                }
                break;
            case 746049438:
                if (str.equals("navi_view")) {
                    c = '\n';
                    break;
                }
                break;
            case 1083235153:
                if (str.equals("nonprofit")) {
                    c = 11;
                    break;
                }
                break;
            case 1224335515:
                if (str.equals("website")) {
                    c = '\f';
                    break;
                }
                break;
        }
        String str3 = "";
        switch (c) {
            case 0:
                if (C80580in.m139683b() != null && C80580in.m139683b().getAccountType() == 3) {
                    C39162r.m79460a("ttelite_BA_download_click_edit", new C33744d().mo59983a("enter_from", "ba_profile").f79943a);
                }
                ActivityC0945e activity = getActivity();
                String a = C63875b.m115571a();
                Locale a2 = C53457c.m98651a(C17867d.m33078a());
                if (!(a2 == null || (language = a2.getLanguage()) == null)) {
                    str3 = language;
                }
                SmartRouter.buildRoute(activity, C89361p.m154868a(a, "((locale))", str3)).open();
                return;
            case 1:
                if (!C58001a.m104815a(tuxTextCell, 1200) && af_() && !this.f145265W) {
                    User user = this.f145266X;
                    if (user == null || user.getPronounsInfo() == null || this.f145266X.getPronounsInfo().getPronouns() == null) {
                        str2 = this.f145280y.getPronounsInfo().getPronouns();
                    } else {
                        str2 = this.f145266X.getPronounsInfo().getPronouns();
                    }
                    C63803y.m115397a("enter_profile_pronoun", "click_pronoun", "pronoun");
                    String string = getString(R.string.exs);
                    if (str2 == null) {
                        str2 = str3;
                    }
                    C89219l.m154721d(string, str3);
                    C89219l.m154721d(str2, str3);
                    ViewTreeObserver$OnGlobalLayoutListenerC63560c cVar = new ViewTreeObserver$OnGlobalLayoutListenerC63560c();
                    Bundle bundle = new Bundle();
                    bundle.putString("content_name", string);
                    bundle.putString("content_value", str2);
                    cVar.setArguments(bundle);
                    cVar.setUserVisibleHint(true);
                    C64092cf cfVar = new C64092cf(this);
                    C89219l.m154721d(cfVar, str3);
                    cVar.f144243c = cfVar;
                    cVar.show(getActivity().getSupportFragmentManager(), "EditPronounDialog");
                    return;
                }
                return;
            case 2:
                if (getContext().getString(R.string.bkh).equals(m115810a(this.f145259Q))) {
                    C63541m mVar = this.f145263U;
                    if (!((Boolean) mVar.f144218g.getValue()).booleanValue()) {
                        C63541m.m115144a(mVar, new Exception("Google service is not available, aborting."), (String) null, "before_goto_URL", (YoutubeApi.C63518a) null, 10);
                    } else {
                        C80214ai.m139042a(new C63541m.RunnableC63543b(mVar), "YoutubeApi");
                    }
                    this.f145274s.mo27384f();
                    i = 0;
                } else {
                    m115814a(getResources().getString(R.string.h0t), getResources().getString(R.string.h0u), new DialogInterface$OnClickListenerC64062bw(this));
                    i = 1;
                }
                C39162r.m79460a("click_social_account_bind", new C33744d().mo59980a("status", i).mo59983a("platform", "youtube").f79943a);
                return;
            case 3:
                if (getContext().getString(R.string.bka).equals(m115810a(this.f145260R))) {
                    this.f145262T.mo102193a();
                    this.f145274s.mo27384f();
                    i3 = 0;
                } else {
                    m115814a(getResources().getString(R.string.h0q), getResources().getString(R.string.h0r), new DialogInterface$OnClickListenerC64060bu(this));
                    i3 = 1;
                }
                C39162r.m79460a("click_social_account_bind", new C33744d().mo59980a("status", i3).mo59983a("platform", "twitter").f79943a);
                return;
            case 4:
                mo103623b(tuxTextCell);
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                if (!C58001a.m104815a(tuxTextCell, 1200) && af_()) {
                    String a3 = m115810a(this.f145253K);
                    if (!a3.equals(getString(R.string.bjx))) {
                        str3 = a3;
                    }
                    C63803y.m115397a("enter_profile_mail", "click_mail", "mail");
                    C64039bl a4 = C64039bl.m115798a(getString(R.string.bjy), str3, getResources().getString(R.string.bly), 0, true);
                    a4.setUserVisibleHint(true);
                    a4.mo103607a(new C64056bq(this));
                    a4.mo103590a(this);
                    a4.f145225h = C64057br.f145291a;
                    a4.f145224g = false;
                    a4.show(getActivity().getSupportFragmentManager(), "EditMailDialog");
                    return;
                }
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                if (!C58001a.m104815a(tuxTextCell, 1200) && af_() && !this.f145265W) {
                    String a5 = m115810a(this.f145251I);
                    if (!a5.equals(getString(R.string.bjr))) {
                        str3 = a5;
                    }
                    C63803y.m115397a("enter_profile_bio", "click_bio", "bio");
                    C64024bj a6 = C64024bj.C64025a.m115784a(getString(R.string.bjs), str3);
                    a6.setUserVisibleHint(true);
                    a6.mo103592a(new C64093cg(this));
                    a6.show(getActivity().getSupportFragmentManager(), "EditNicknameDialog");
                    return;
                }
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                if (getContext().getString(R.string.bjw).equals(m115810a(this.f145258P))) {
                    InstagramPresenter instagramPresenter = this.f145261S;
                    instagramPresenter.f144146g = true;
                    C20886c.C20887a aVar = new C20886c.C20887a(instagramPresenter.f144142c);
                    aVar.f49390a = "instagram";
                    aVar.f49392c = instagramPresenter;
                    C20886c a7 = aVar.mo34322a();
                    C20919d.m39339a();
                    C20919d.m39340a(a7);
                    this.f145274s.mo27384f();
                    i2 = 0;
                } else {
                    m115814a(getResources().getString(R.string.h0j), getResources().getString(R.string.h0k), new DialogInterface$OnClickListenerC64061bv(this));
                    i2 = 1;
                }
                C39162r.m79460a("click_social_account_bind", new C33744d().mo59980a("status", i2).mo59983a("platform", "instagram").f79943a);
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                SmartRouter.buildRoute(getActivity(), C63876c.m115573a(3, "settings")).open();
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                if (!C58001a.m104815a(tuxTextCell, 1200) && af_() && !this.f145265W) {
                    this.f145268c.mo109185a(this.f145280y, new C68706b() {
                        /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm.C640513 */

                        static {
                            Covode.recordClassIndex(75495);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.setting.verification.C68706b
                        /* renamed from: a */
                        public final void mo69127a(VerificationResponse verificationResponse) {
                            if (verificationResponse.isEmpty()) {
                                C64048bm.this.mo103625g();
                            } else if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
                                new C79459a(C17867d.m33078a()).mo123052a(C64048bm.this.getString(R.string.fbk)).mo123053a();
                            } else if (verificationResponse.isCerted()) {
                                if (C68707c.C68708a.m121149f()) {
                                    String string = C64048bm.this.getString(R.string.fbh);
                                    String string2 = C64048bm.this.getString(R.string.fbg);
                                    if (!(string == null || string2 == null)) {
                                        ((C23048e) new C23048e(C64048bm.this.getActivity()).mo37413d(string2).mo37411b(string)).mo37443a(R.string.fbj, new DialogInterface$OnClickListenerC64095ci(this)).mo37444a((DialogInterface.OnClickListener) null).mo37442a().mo37396b().show();
                                        return;
                                    }
                                }
                                C64048bm.this.mo103625g();
                            } else if (verificationResponse.isUpdating()) {
                                new C79459a(C17867d.m33078a()).mo123052a(C64048bm.this.getString(R.string.fbl)).mo123053a();
                            }
                        }
                    });
                    return;
                }
                return;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                ProfileNaviServiceImpl.m65406a().mo57248b(getActivity(), tuxTextCell, "edit_profile_page");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                C39162r.m79460a("edit_nonprofit_link", new C31376a().mo57399a("enter_from", "personal_homepage").mo57399a("user_id", C63497d.m115066a()).mo57399a("enter_method", "click_edit_ngo_profile").f75156a);
                String a8 = m115810a(this.f145254L);
                if (a8.equals(getContext().getString(R.string.dhc))) {
                    mo103628i();
                    return;
                }
                String string2 = getResources().getString(R.string.dhd, a8);
                C23208a.C23209a a9 = new C23208a.C23214e().mo37785a(R.string.dha).mo37786a(new View$OnClickListenerC64058bs(this));
                C23208a.C23209a b = new C23208a.C23214e().mo37785a(R.string.dhb).mo37786a(new View$OnClickListenerC64059bt(this)).mo37789b(1);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a9);
                arrayList.add(b);
                new C23208a.C23211b().mo37794a(string2).mo37799b(arrayList).mo37800b().show(getFragmentManager(), "nonprofit");
                return;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                if (!C58001a.m104815a(tuxTextCell, 1200) && af_() && !this.f145265W) {
                    String a10 = m115810a(this.f145252J);
                    if (a10.equals(getString(R.string.bkf))) {
                        a10 = str3;
                    }
                    C63803y.m115397a("enter_profile_website", "click_website", "website");
                    C64032bk a11 = C64032bk.C64033a.m115795a(a10, str3);
                    a11.setUserVisibleHint(true);
                    a11.mo103590a(this);
                    C64055bp bpVar = new C64055bp(this);
                    C89219l.m154721d(bpVar, str3);
                    a11.f145204f = bpVar;
                    a11.show(getActivity().getSupportFragmentManager(), "EditWebsiteDialog");
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final boolean mo103621a(IDonationService.OrganizationModel organizationModel) {
        int i = 0;
        if (organizationModel == null || !(organizationModel.getNgoId() == null || organizationModel.getName() == null)) {
            ProfileNgoStruct profileNgoStruct = null;
            if (organizationModel != null) {
                ProfileNgoStruct profileNgoStruct2 = new ProfileNgoStruct();
                if (organizationModel.getName() != null) {
                    profileNgoStruct2.setName(organizationModel.getName());
                    if (organizationModel.getNgoId() != null) {
                        profileNgoStruct2.setId(organizationModel.getNgoId().intValue());
                        if (organizationModel.getDonateLink() != null) {
                            profileNgoStruct2.setDonationLink(organizationModel.getDonateLink());
                        }
                        if (organizationModel.getIcon() != null) {
                            profileNgoStruct2.setIconUrl(organizationModel.getIcon().getUri());
                        }
                        profileNgoStruct = profileNgoStruct2;
                    }
                }
            }
            this.f145266X.setProfileNgoStruct(profileNgoStruct);
            C63828ae aeVar = this.f145276u;
            if (organizationModel != null) {
                i = organizationModel.getNgoId().intValue();
            }
            if (!aeVar.f144690a) {
                aeVar.f144690a = true;
                C31575b.m65865g().updateSupportedNgo(aeVar.f144691b, i, aeVar.f144693d);
            }
            this.f145274s.mo27384f();
            return true;
        }
        new C79459a(getActivity()).mo123050a(R.string.fdk).mo123053a();
        this.f145274s.setVisibility(8);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103616a(DialogInterface dialogInterface) {
        C80214ai.m139042a(new C63541m.RunnableC63549f(this.f145263U), "BoltsUtils");
        dialogInterface.dismiss();
        this.f145274s.mo27384f();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public void mo61023a(User user, int i) {
        C33744d dVar;
        this.f145279x = true;
        String str = "bold";
        if (i == 0) {
            mo103617a(this.f145248F, (CharSequence) this.f145266X.getNickname(), true);
            mo103620a("nickname", false, str);
        } else if (i == 2) {
            boolean isEmpty = TextUtils.isEmpty(this.f145266X.getSignature());
            if (TextUtils.isEmpty(this.f145266X.getSignature())) {
                str = "blank";
            }
            mo103620a("bio", isEmpty, str);
            m115822q(this.f145266X.getSignature());
        } else if (i == 4) {
            C34577e.m70592a(this.f145273r, user.getAvatarMedium());
        } else if (i == 12) {
            String str2 = "";
            m115820o((String) AbstractC27242j.fromNullable(this.f145266X.getProfileNgoStruct()).transform(C64063bx.f145297a).mo45306or(str2));
            String str3 = "remove_nonprofit_link";
            if (this.f145266X.getProfileNgoStruct() != null) {
                if (this.f145270e != null) {
                    str3 = "change_nonprofit_link";
                } else {
                    str3 = "add_nonprofit_link";
                }
                dVar = new C33744d();
                str2 = this.f145266X.getProfileNgoStruct().getDonationLink();
            } else {
                dVar = new C33744d();
                ProfileNgoStruct profileNgoStruct = this.f145270e;
                if (profileNgoStruct != null) {
                    str2 = profileNgoStruct.getDonationLink();
                }
            }
            C39162r.m79460a(str3, dVar.mo59983a("link", str2).mo59983a("link_type", "nonprofit").f79943a);
            m115812a(this.f145266X.getProfileNgoStruct());
        } else if (i == 112) {
            if (this.f145267b) {
                this.f145267b = false;
                C39162r.m79460a("ttelite_save_email", new C33744d().mo59983a("is_success", "1").f79943a);
            }
            m115821p(user.getBioUrl());
            mo90036a(user.getBioEmail());
        } else if (i == 116) {
            C63803y.m115395a(1, this.f145269d, (String) null);
            m115826u(this.f145266X.getUniqueId());
        }
        this.f145274s.mo27382d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo103620a(String str, boolean z, String str2) {
        List<String> list = this.f145271p;
        if (list != null) {
            if (z) {
                if (list.contains(str)) {
                    this.f145271p.remove(str);
                }
            } else if (!this.f145271p.contains(str)) {
                this.f145271p.add(str);
            }
            if (str.equals("bio_email")) {
                str = "email";
            }
            this.f145272q.mo59983a(str, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61024a(Exception exc, int i) {
        if (af_() && this.f145276u != null && this.f145277v != null) {
            CaptchaHelperServiceImpl.m72448a();
            if (4 == i) {
                this.f145274s.setVisibility(8);
                this.f145277v.mo103277d();
                if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 20022) {
                    C29823c.m60080a(getActivity(), "profile_image_setting", "review_failure");
                }
            }
            if (i == 116) {
                String str = null;
                Exception exc2 = (!(exc instanceof ExecutionException) || !(exc.getCause() instanceof C34485a)) ? exc : (Exception) exc.getCause();
                if (exc2 instanceof C34485a) {
                    C34485a aVar = (C34485a) exc2;
                    str = String.valueOf(aVar.getErrorCode());
                    C80346dk.m139312a(str, aVar.getErrorMsg(), this.f145264V, getContext());
                    mo103584d();
                }
                C63803y.m115395a(0, this.f145269d, str);
            } else if (i != 116) {
                C33615a.m68848a((Context) getActivity(), (Throwable) exc, (int) R.string.ewo);
            }
            C85084a.m146294a(exc.getMessage(), "user");
            this.f145274s.setVisibility(8);
            this.f145277v.mo103277d();
            if (this.f145267b) {
                this.f145267b = false;
                C39162r.m79460a("ttelite_save_email", new C33744d().mo59983a("is_success", "0").f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61026a(boolean z) {
        if (z) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.h7r).mo123053a();
            AbstractC81915c.m141874a(new C63498e());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61025a(String str, boolean z) {
        if (af_()) {
            this.f145274s.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                new C79459a(C17867d.m33078a()).mo123052a(str).mo123053a();
                if (z && getActivity() != null) {
                    getActivity().finish();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo103618a(TuxTextCell tuxTextCell, boolean z, String str) {
        List<String> list = this.f145271p;
        if (list != null) {
            if (z) {
                if (list.contains(str)) {
                    this.f145271p.remove(str);
                }
            } else if (!this.f145271p.contains(str)) {
                this.f145271p.add(str);
            }
            this.f145272q.mo59983a(str, z ? "bold" : "blank");
            mo103617a(tuxTextCell, (CharSequence) null, this.f145271p.contains(str));
        }
    }

    /* renamed from: a */
    public final void mo103617a(TuxTextCell tuxTextCell, CharSequence charSequence, boolean z) {
        AbstractC23293c.C23302f fVar = (AbstractC23293c.C23302f) tuxTextCell.getAccessory();
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = fVar.f55228c.getLabel();
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C23155d.m43641a(getContext(), z ? R.attr.bc : R.attr.bk).intValue()), 0, charSequence.length(), 17);
            fVar.mo37964a(spannableStringBuilder);
            tuxTextCell.setAccessory(fVar);
        }
    }

    /* renamed from: d */
    private void mo103584d() {
        this.f145274s.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ Object mo103636m() {
        TuxTextCell tuxTextCell = this.f145248F;
        if (tuxTextCell == null) {
            return null;
        }
        mo103623b(tuxTextCell);
        return null;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f145265W = C39223a.m79589c().mo68606a(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo103632k() {
        DmtStatusView dmtStatusView = this.f145274s;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        C63821a aVar = this.f145277v;
        if (aVar != null) {
            aVar.mo103277d();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        C68707c cVar = this.f145268c;
        if (cVar != null) {
            cVar.f153712a.mo142944a();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C63821a aVar = this.f145277v;
        if (aVar != null) {
            aVar.mo103277d();
        }
        C63821a aVar2 = this.f145277v;
        if (aVar2 != null) {
            aVar2.f144681c = null;
        }
        C63828ae aeVar = this.f145276u;
        if (aeVar != null) {
            aeVar.f144692c = null;
        }
        this.f145274s.setVisibility(8);
    }

    static {
        Covode.recordClassIndex(75492);
    }

    /* renamed from: g */
    public final void mo103625g() {
        TuxTextCell tuxTextCell = this.f145248F;
        if (tuxTextCell != null) {
            String a = m115810a(tuxTextCell);
            C63803y.m115397a("enter_profile_name", "click_name", StringSet.name);
            C64039bl a2 = C64039bl.m115798a(getString(R.string.bk4), a, "", 30, false);
            a2.setUserVisibleHint(true);
            a2.mo103607a(new C64090cd(this));
            a2.show(getActivity().getSupportFragmentManager(), "EditWebsiteDialog");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo103628i() {
        AbstractC0952i fragmentManager;
        DialogInterface$OnCancelListenerC0944d selectDonationDialog = AVExternalServiceImpl.m113114a().donationService().getSelectDonationDialog(new IDonationService.OnDonationOrgChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm.C640491 */

            static {
                Covode.recordClassIndex(75493);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onDismiss() {
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onShow() {
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onOrgSelected(IDonationService.OrganizationModel organizationModel) {
                C64048bm bmVar = C64048bm.this;
                bmVar.mo103617a(bmVar.f145254L, (CharSequence) organizationModel.getName(), false);
                C64048bm.this.mo103621a(organizationModel);
            }
        });
        if (!selectDonationDialog.isAdded() && (fragmentManager = getFragmentManager()) != null) {
            selectDonationDialog.show(fragmentManager, "profile_edit_select_donation");
        }
    }

    /* renamed from: j */
    public final void mo103634l() {
        if (af_()) {
            if (this.f145271p != null) {
                C64314y.m116179a("leave", this.f145272q);
            }
            if (getArguments().getBoolean("change_to_ba", false)) {
                AbstractC81915c.m141874a(new C68069d());
            }
            getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo103639n() {
        if (af_() && !this.f145265W) {
            C63803y.m115397a("replace_profile_photo", "click_head", UGCMonitor.TYPE_PHOTO);
            this.f145277v.mo103276a(getActivity(), this.f145273r, C31575b.m65865g().getCurUser());
        }
    }

    /* renamed from: h */
    public final void mo103627h() {
        boolean z;
        String string;
        String str;
        String str2;
        Date date = new Date(this.f145280y.getHandleModified() * 1000);
        int abs = Math.abs((int) ((new Date().getTime() - date.getTime()) / 86400000));
        if (this.f145269d == 0) {
            C63803y.m115397a("enter_profile_username", "click_username", "username");
        }
        if (abs > 30) {
            z = true;
            string = getString(R.string.bkt);
        } else {
            z = false;
            BDDateFormat bDDateFormat = new BDDateFormat("LL");
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.add(5, 30);
            string = getString(R.string.h5d, bDDateFormat.mo21223a(instance.getTime().getTime(), Locale.getDefault()));
        }
        if (this.f145249G != null) {
            if (!m115827v(this.f145264V)) {
                str = this.f145264V;
            } else {
                str = "";
            }
            int i = this.f145269d;
            if (i == 1) {
                str2 = "personal_homepage";
            } else if (i == 2) {
                str2 = "modify_username_notify";
            } else if (i == 3) {
                str2 = "tiktok_message";
            } else {
                str2 = "edit_profile_page";
            }
            String string2 = getString(R.string.bke);
            C89219l.m154721d(string2, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(string, "");
            C89219l.m154721d(str2, "");
            C64104cm cmVar = new C64104cm();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", string2);
            bundle.putString("content_value", str);
            bundle.putString("enter_from", str2);
            bundle.putBoolean("is_edit_enabled", z);
            bundle.putString("edit_hint", string);
            bundle.putInt("content_max_length", 24);
            bundle.putBoolean("is_enable_null", false);
            cmVar.setArguments(bundle);
            cmVar.setUserVisibleHint(true);
            C64091ce ceVar = new C64091ce(this);
            C89219l.m154721d(ceVar, "");
            cmVar.f145426b = ceVar;
            cmVar.show(getActivity().getSupportFragmentManager(), "EditUserNameDialog");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.edit.AbstractC63525c
    /* renamed from: a */
    public final void mo102184a() {
        if (getContext() != null) {
            this.f145274s.setVisibility(8);
            new C79459a(getContext()).mo123052a(getString(R.string.h1d)).mo123053a();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo103583c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        char c;
        String str2;
        String str3;
        this.f145281z = new C63425ak();
        this.f145266X = new User();
        User curUser = C31575b.m65865g().getCurUser();
        this.f145280y = curUser;
        if (curUser != null) {
            this.f145265W = C39223a.m79589c().mo68606a(4);
            List<String> list = this.f145280y.boldFields;
            this.f145271p = list;
            if (list != null) {
                int accountType = this.f145280y.getAccountType();
                if (accountType == 0) {
                    str = "normal";
                } else if (accountType == 1) {
                    str = "proaccount";
                } else if (accountType == 2) {
                    str = "creator";
                } else if (accountType != 3) {
                    str = "";
                } else {
                    str = "business";
                }
                this.f145272q.mo59983a("account_type", str);
                for (String str4 : f145242o) {
                    str4.hashCode();
                    switch (str4.hashCode()) {
                        case -991745245:
                            if (str4.equals("youtube")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -916346253:
                            if (str4.equals("twitter")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -477583675:
                            if (str4.equals("supported_ngo")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -180337243:
                            if (str4.equals("bio_email")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 97544:
                            if (str4.equals("bio")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 28903346:
                            if (str4.equals("instagram")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 50511102:
                            if (str4.equals("category")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 70690926:
                            if (str4.equals("nickname")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106642994:
                            if (str4.equals(UGCMonitor.TYPE_PHOTO)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 112202875:
                            if (str4.equals("video")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1224335515:
                            if (str4.equals("website")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    String str5 = "is_edited";
                    String str6 = "default";
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            C33744d dVar = this.f145272q;
                            if (this.f145271p.contains(str4)) {
                                str2 = "bold";
                            } else {
                                str2 = "blank";
                            }
                            dVar.mo59983a(str4, str2);
                            break;
                        case 3:
                            C33744d dVar2 = this.f145272q;
                            if (this.f145271p.contains(str4)) {
                                str3 = "bold";
                            } else {
                                str3 = "blank";
                            }
                            dVar2.mo59983a("email", str3);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            C33744d dVar3 = this.f145272q;
                            if (this.f145271p.contains(str4)) {
                                str6 = "bold";
                            }
                            dVar3.mo59983a(str4, str6);
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            C33744d dVar4 = this.f145272q;
                            if (!this.f145271p.contains(str4)) {
                                str5 = str6;
                            }
                            dVar4.mo59983a(str4, str5);
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            C33744d dVar5 = this.f145272q;
                            if (!this.f145271p.contains(str4)) {
                                str5 = "blank";
                            }
                            dVar5.mo59983a(str4, str5);
                            break;
                    }
                }
            }
            mo103620a("bio", TextUtils.isEmpty(this.f145280y.getSignature()), "");
            mo103617a(this.f145248F, (CharSequence) this.f145280y.getNickname(), false);
            m115811a(this.f145248F, "nickname");
            m115826u(C80580in.m139684b(this.f145280y));
            User user = this.f145280y;
            if (user == null || this.f145265W || user.getPronounsInfo() == null || this.f145280y.getPronounsInfo().getEnableEditPronouns() == null || !this.f145280y.getPronounsInfo().getEnableEditPronouns().booleanValue()) {
                this.f145250H.setVisibility(8);
                this.f145272q.mo59983a("pronouns", "null");
            } else {
                String pronouns = this.f145280y.getPronounsInfo().getPronouns();
                if (TextUtils.isEmpty(pronouns)) {
                    mo103617a(this.f145250H, (CharSequence) getString(R.string.p7), false);
                    this.f145272q.mo59983a("pronouns", "blank");
                } else {
                    mo103617a(this.f145250H, (CharSequence) pronouns, true);
                    this.f145272q.mo59983a("pronouns", "bold");
                }
                m115811a(this.f145250H, "pronouns");
            }
            User user2 = this.f145280y;
            if (user2 != null) {
                m115822q(user2.getSignature());
                m115821p(user2.getBioUrl());
                mo90036a(user2.getBioEmail());
                m115823r(user2.getBizAccountInfo() != null ? user2.getBizAccountInfo().getDownloadAppLinkToShowInEditProfile() : null);
                m115824s(user2.getCategory());
                if (C63766ae.m115318a()) {
                    UserBioPermission bioPermission = user2.getBioPermission();
                    if (bioPermission != null) {
                        TuxTextCell tuxTextCell = this.f145252J;
                        if (bioPermission.getEnableUrl()) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        tuxTextCell.setVisibility(i4);
                        TuxTextCell tuxTextCell2 = this.f145253K;
                        if (bioPermission.getEnableEmail()) {
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        tuxTextCell2.setVisibility(i5);
                        TuxTextCell tuxTextCell3 = this.f145255M;
                        if (bioPermission.getEnableDownloadAppLink()) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        tuxTextCell3.setVisibility(i6);
                        if (!bioPermission.getEnableUrl()) {
                            this.f145272q.mo59983a("website", "");
                        }
                        if (!bioPermission.getEnableEmail()) {
                            this.f145272q.mo59983a("email", "");
                        }
                    } else {
                        this.f145252J.setVisibility(8);
                        this.f145253K.setVisibility(8);
                        this.f145255M.setVisibility(8);
                        this.f145272q.mo59983a("website", "");
                        this.f145272q.mo59983a("email", "");
                    }
                    if (user2.getAccountType() == 2 || user2.getAccountType() == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    TuxTextCell tuxTextCell4 = this.f145256N;
                    if (z2) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    tuxTextCell4.setVisibility(i3);
                    i = 8;
                } else {
                    if (C63866a.f144791a.shouldShowBioUrl()) {
                        i2 = 0;
                        this.f145252J.setVisibility(0);
                        i = 8;
                    } else {
                        i2 = 0;
                        i = 8;
                        this.f145252J.setVisibility(8);
                        this.f145272q.mo59983a("website", "");
                    }
                    if (C63866a.f144791a.shouldShowBioEmail()) {
                        this.f145253K.setVisibility(i2);
                    } else {
                        this.f145253K.setVisibility(i);
                        this.f145272q.mo59983a("email", "");
                    }
                    this.f145255M.setVisibility(i);
                    this.f145256N.setVisibility(i);
                }
                if (this.f145256N.getVisibility() == i) {
                    this.f145272q.mo59983a("category", "");
                }
            } else {
                i = 8;
            }
            User user3 = this.f145280y;
            if (user3 == null) {
                this.f145254L.setVisibility(i);
            } else if (!C63736b.m115266a()) {
                this.f145254L.setVisibility(i);
            } else {
                this.f145254L.setVisibility(0);
                m115812a(user3.getProfileNgoStruct());
                m115820o(user3.getProfileNgoStruct() != null ? user3.getProfileNgoStruct().getName() : null);
            }
            if (C63745g.f144501a) {
                mo103617a(this.f145247E, "", false);
                this.f145247E.setVisibility(0);
                m115811a(this.f145247E, "navi_view");
            } else {
                this.f145247E.setVisibility(8);
            }
            if (Math.abs((int) ((new Date().getTime() - new Date(this.f145280y.getHandleModified() * 1000).getTime()) / 86400000)) >= 30 && this.f145269d != 0) {
                C1731i.m5631a(500).mo5534a(new C64087ca(this), C1731i.f5564c, null);
            }
            this.f145266X.setSignature(this.f145280y.getSignature());
            C34577e.m70592a(this.f145273r, this.f145280y.getAvatarMedium());
            this.f145278w = false;
            if (!TextUtils.isEmpty(this.f145280y.getInsId())) {
                z = true;
                mo103617a(this.f145258P, (CharSequence) this.f145280y.getInsId(), true);
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(this.f145280y.getYoutubeChannelTitle())) {
                mo103617a(this.f145259Q, this.f145280y.getYoutubeChannelTitle(), z);
            }
            if (!TextUtils.isEmpty(this.f145280y.getTwitterName())) {
                mo103617a(this.f145260R, this.f145280y.getTwitterName(), z);
            }
            List<String> list2 = this.f145271p;
            if (list2 != null) {
                mo103617a(this.f145248F, (CharSequence) null, list2.contains("nickname"));
                mo103617a(this.f145254L, (CharSequence) null, this.f145271p.contains("supported_ngo"));
                mo103617a(this.f145258P, (CharSequence) null, this.f145271p.contains("instagram"));
                mo103617a(this.f145259Q, (CharSequence) null, this.f145271p.contains("youtube"));
                mo103617a(this.f145260R, (CharSequence) null, this.f145271p.contains("twitter"));
            }
            User user4 = this.f145280y;
            if (C17867d.m33090k() || C63743e.m115268a()) {
                this.f145257O.setVisibility(8);
                this.f145260R.setVisibility(8);
                this.f145258P.setVisibility(8);
                this.f145259Q.setVisibility(8);
                this.f145272q.mo59983a("twitter", "");
                this.f145272q.mo59983a("instagram", "");
                this.f145272q.mo59983a("youtube", "");
                return;
            }
            boolean twitter = C63877d.m115574a().getTwitter();
            boolean ins = C63877d.m115574a().getIns();
            boolean youtube = C63877d.m115574a().getYoutube();
            if (twitter || !TextUtils.isEmpty(user4.getTwitterName())) {
                this.f145260R.setVisibility(0);
            } else {
                this.f145260R.setVisibility(8);
                this.f145272q.mo59983a("twitter", "");
            }
            if (ins || !TextUtils.isEmpty(user4.getInsId())) {
                this.f145258P.setVisibility(0);
            } else {
                this.f145258P.setVisibility(8);
                this.f145272q.mo59983a("instagram", "");
            }
            if (youtube || !TextUtils.isEmpty(user4.getYoutubeChannelTitle())) {
                this.f145259Q.setVisibility(0);
            } else {
                this.f145259Q.setVisibility(8);
                this.f145272q.mo59983a("youtube", "");
            }
            m115811a(this.f145258P, "instagram");
            m115811a(this.f145259Q, "youtube");
            m115811a(this.f145260R, "twitter");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo103583c();
    }

    /* renamed from: h */
    static String m115819h(String str) {
        return "tiktok.com/@".concat(String.valueOf(str));
    }

    /* renamed from: t */
    private static String m115825t(String str) {
        while (str.contains("\n\n")) {
            str = str.replaceAll("\n\n", "\n");
        }
        return str;
    }

    /* renamed from: w */
    private static boolean m115828w(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.edit.AbstractC63526d
    /* renamed from: e */
    public final void mo102186e(final String str) {
        C80214ai.m139044b(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm.RunnableC640524 */

            static {
                Covode.recordClassIndex(75496);
            }

            public final void run() {
                if (C64048bm.this.getContext() != null) {
                    if (TextUtils.isEmpty(str)) {
                        C64048bm bmVar = C64048bm.this;
                        bmVar.mo103617a(bmVar.f145259Q, (CharSequence) C64048bm.this.getContext().getString(R.string.bkh), false);
                    } else {
                        C64048bm bmVar2 = C64048bm.this;
                        bmVar2.mo103617a(bmVar2.f145259Q, (CharSequence) str, true);
                    }
                    C64048bm bmVar3 = C64048bm.this;
                    bmVar3.mo103618a(bmVar3.f145259Q, TextUtils.isEmpty(str), "youtube");
                    C64048bm.this.f145274s.setVisibility(8);
                }
            }
        }, "BoltsUtils");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.edit.AbstractC63526d
    /* renamed from: f */
    public final void mo102187f(String str) {
        C80214ai.m139044b(new RunnableC64064by(this, str), "BoltsUtils");
    }

    /* renamed from: a */
    private static String m115810a(TuxTextCell tuxTextCell) {
        AbstractC23293c.C23302f fVar = (AbstractC23293c.C23302f) tuxTextCell.getAccessory();
        if (fVar == null || fVar.f55228c.getLabel() == null) {
            return "";
        }
        return fVar.f55228c.getLabel().toString();
    }

    /* renamed from: b */
    private void m115816b(boolean z) {
        if (z) {
            this.f145244B.setVisibility(0);
            this.f145245C.setVisibility(8);
            m115815b(this.f145249G);
            return;
        }
        this.f145244B.setVisibility(8);
        this.f145245C.setVisibility(0);
    }

    /* renamed from: v */
    private boolean m115827v(String str) {
        if (this.f145265W) {
            return false;
        }
        if (!str.matches("[0-9A-Za-z_.]*") || m115828w(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo103624c(DialogInterface dialogInterface) {
        C63534h hVar = this.f145262T;
        hVar.f144196d = false;
        C63521a.m115114a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: INVOKE  
              (wrap: com.ss.android.ugc.aweme.profile.edit.h$2 : 0x0007: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.profile.edit.h$2) = (r1v0 'hVar' com.ss.android.ugc.aweme.profile.edit.h) call: com.ss.android.ugc.aweme.profile.edit.h.2.<init>(com.ss.android.ugc.aweme.profile.edit.h):void type: CONSTRUCTOR)
             type: STATIC call: com.ss.android.ugc.aweme.profile.edit.api.a.a(com.ss.android.ugc.aweme.profile.edit.api.a$a):void in method: com.ss.android.ugc.aweme.profile.ui.bm.c(android.content.DialogInterface):void, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.profile.edit.h$2) = (r1v0 'hVar' com.ss.android.ugc.aweme.profile.edit.h) call: com.ss.android.ugc.aweme.profile.edit.h.2.<init>(com.ss.android.ugc.aweme.profile.edit.h):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.ui.bm.c(android.content.DialogInterface):void, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.profile.edit.h, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.profile.edit.h r1 = r2.f145262T
            r0 = 0
            r1.f144196d = r0
            com.ss.android.ugc.aweme.profile.edit.h$2 r0 = new com.ss.android.ugc.aweme.profile.edit.h$2
            r0.<init>()
            com.p2082ss.android.ugc.aweme.profile.edit.api.C63521a.m115114a(r0)
            r3.dismiss()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r2.f145274s
            r0.mo27384f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm.mo103624c(android.content.DialogInterface):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo103629i(String str) {
        if (af_()) {
            this.f145274s.setVisibility(8);
            new C79459a(getContext()).mo123052a(str).mo123053a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ boolean mo103637m(String str) {
        String str2;
        this.f145243A = true;
        this.f145266X.setBioUrl(str);
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!TextUtils.isEmpty(str)) {
            str2 = "bold";
        } else {
            str2 = "blank";
        }
        mo103620a("website", isEmpty, str2);
        m115821p(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo103623b(View view) {
        if (!C58001a.m104815a(view, 1200) && af_() && !this.f145265W) {
            this.f145268c.mo109185a(this.f145280y, new C68706b() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm.C640502 */

                static {
                    Covode.recordClassIndex(75494);
                }

                @Override // com.p2082ss.android.ugc.aweme.setting.verification.C68706b
                /* renamed from: a */
                public final void mo69127a(VerificationResponse verificationResponse) {
                    if (verificationResponse.isEmpty()) {
                        C64048bm.this.mo103627h();
                    } else if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
                        new C79459a(C17867d.m33078a()).mo123052a(C64048bm.this.getString(R.string.fbk)).mo123053a();
                    } else if (verificationResponse.isCerted()) {
                        if (C68707c.C68708a.m121148e()) {
                            String string = C64048bm.this.getString(R.string.fbf);
                            String string2 = C64048bm.this.getString(R.string.fbe);
                            if (!(string == null || string2 == null)) {
                                ((C23048e) new C23048e(C64048bm.this.getActivity()).mo37413d(string2).mo37411b(string)).mo37443a(R.string.fbj, new DialogInterface$OnClickListenerC64094ch(this)).mo37444a((DialogInterface.OnClickListener) null).mo37442a().mo37396b().show();
                                return;
                            }
                        }
                        C64048bm.this.mo103627h();
                    } else if (verificationResponse.isUpdating()) {
                        new C79459a(C17867d.m33078a()).mo123052a(C64048bm.this.getString(R.string.fbl)).mo123053a();
                    }
                }
            });
        }
    }

    /* renamed from: o */
    private void m115820o(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            mo103617a(this.f145254L, (CharSequence) getString(R.string.dhc), false);
        } else {
            mo103617a(this.f145254L, (CharSequence) str, false);
        }
        List<String> list = this.f145271p;
        if (list != null) {
            mo103617a(this.f145254L, (CharSequence) null, list.contains("supported_ngo"));
        }
        m115811a(this.f145254L, "nonprofit");
    }

    /* renamed from: p */
    private void m115821p(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo103617a(this.f145252J, (CharSequence) str, false);
        } else {
            mo103617a(this.f145252J, (CharSequence) getString(R.string.bkf), false);
        }
        List<String> list = this.f145271p;
        if (list != null) {
            mo103617a(this.f145252J, (CharSequence) null, list.contains("website"));
        }
        m115811a(this.f145252J, "website");
    }

    /* renamed from: q */
    private void m115822q(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo103617a(this.f145251I, (CharSequence) str, false);
        } else {
            mo103617a(this.f145251I, (CharSequence) getString(R.string.bjr), false);
        }
        List<String> list = this.f145271p;
        if (list != null) {
            mo103617a(this.f145251I, (CharSequence) null, list.contains("bio"));
        }
        m115811a(this.f145251I, "bio");
    }

    /* renamed from: r */
    private void m115823r(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo103617a(this.f145255M, (CharSequence) str, false);
        } else {
            mo103617a(this.f145255M, (CharSequence) getString(R.string.c), false);
        }
        m115811a(this.f145255M, "app_store_link");
    }

    /* renamed from: s */
    private void m115824s(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo103617a(this.f145256N, (CharSequence) str, false);
        } else {
            mo103617a(this.f145256N, (CharSequence) getString(R.string.ad3), false);
        }
        if (this.f145271p != null) {
            mo103617a(this.f145256N, (CharSequence) null, true);
        }
        m115811a(this.f145256N, "category");
    }

    /* renamed from: u */
    private void m115826u(String str) {
        this.f145264V = str;
        this.f145246D.setText(m115819h(str));
        mo103617a(this.f145249G, (CharSequence) this.f145264V, true);
        this.f145246D.setTextColor(getContext().getResources().getColor(R.color.bx));
        m115816b(m115827v(this.f145264V));
        m115811a(this.f145249G, "username");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo103622b(DialogInterface dialogInterface) {
        InstagramPresenter instagramPresenter = this.f145261S;
        instagramPresenter.f144146g = false;
        instagramPresenter.f144144e.updateInsId(instagramPresenter.f144143d, "", 0);
        dialogInterface.dismiss();
        this.f145274s.mo27384f();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.edit.AbstractC63525c
    /* renamed from: d */
    public final void mo102185d(String str) {
        if (getContext() != null) {
            if (TextUtils.isEmpty(str)) {
                mo103617a(this.f145260R, (CharSequence) getContext().getString(R.string.bka), false);
            } else {
                mo103617a(this.f145260R, (CharSequence) str, true);
            }
            mo103618a(this.f145260R, TextUtils.isEmpty(str), "twitter");
            this.f145274s.setVisibility(8);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onAppStoreLinkSuccess(C47959j jVar) {
        JSONObject optJSONObject;
        if (jVar.f111077b != null && TextUtils.equals(jVar.f111077b.optString("eventName"), "download_app_link_success") && (optJSONObject = jVar.f111077b.optJSONObject("data")) != null) {
            String optString = optJSONObject.optString("android_download_app_link");
            if (TextUtils.isEmpty(optString)) {
                optString = optJSONObject.optString("ios_download_app_link");
            }
            m115823r(optString);
            C31575b.m65865g().queryUser();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEditCategorySuccessEvent(C47959j jVar) {
        JSONObject optJSONObject;
        if (jVar.f111077b != null && TextUtils.equals(jVar.f111077b.optString("eventName"), "edit_category_success") && (optJSONObject = jVar.f111077b.optJSONObject("data")) != null) {
            String optString = optJSONObject.optString("category_name");
            if (!TextUtils.isEmpty(optString)) {
                m115824s(optString);
                this.f145280y.setCategory(optString);
                C31575b.m65865g().queryUser();
            }
        }
    }

    /* renamed from: b */
    private void m115815b(TuxTextCell tuxTextCell) {
        AbstractC23293c.C23302f fVar = (AbstractC23293c.C23302f) tuxTextCell.getAccessory();
        if (fVar != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.f55228c.getLabel());
            C22999a aVar = new C22999a();
            aVar.f54431a = R.raw.icon_exclamation_mark_circle_fill;
            aVar.f54432b = C34728n.m70946a(12.0d);
            aVar.f54433c = C34728n.m70946a(12.0d);
            aVar.f54435e = Integer.valueOf((int) R.attr.ay);
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) "0");
            spannableStringBuilder.setSpan(aVar.mo37369b(getContext()), 0, 1, 17);
            fVar.mo37964a(spannableStringBuilder);
            tuxTextCell.setAccessory(fVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.edit.AbstractC63524b
    /* renamed from: c */
    public final void mo102183c(String str) {
        if (getContext() != null) {
            if (TextUtils.isEmpty(str)) {
                mo103617a(this.f145258P, (CharSequence) getContext().getString(R.string.bjw), false);
            } else {
                mo103617a(this.f145258P, (CharSequence) str, true);
            }
            mo103618a(this.f145258P, TextUtils.isEmpty(str), "instagram");
            this.f145274s.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo103626g(String str) {
        if (TextUtils.isEmpty(str)) {
            new C79459a(getActivity()).mo123050a(R.string.dfh).mo123053a();
            this.f145274s.setVisibility(8);
            return false;
        } else if (TextUtils.isEmpty(str.trim())) {
            new C79459a(getActivity()).mo123050a(R.string.dfj).mo123053a();
            this.f145274s.setVisibility(8);
            return false;
        } else if (!TextUtils.equals(str, C31575b.m65865g().getCurUser().getNickname())) {
            this.f145266X.setNickname(str);
            this.f145276u.mo103295b(str);
            this.f145274s.mo27384f();
            return true;
        } else {
            this.f145281z.f143977a = "";
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo103631j(String str) {
        UserPronounsInfo userPronounsInfo = new UserPronounsInfo();
        userPronounsInfo.setPronouns(str);
        this.f145266X.setPronouns(userPronounsInfo);
        mo61026a(true);
        if (!str.equals("")) {
            mo103617a(this.f145250H, (CharSequence) str, true);
            mo103620a("pronouns", false, "bold");
            return;
        }
        mo103617a(this.f145250H, (CharSequence) getString(R.string.p7), false);
        mo103620a("pronouns", true, "blank");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ boolean mo103633k(String str) {
        if (!TextUtils.equals(str, C31575b.m65865g().getCurUser().getSignature())) {
            String t = m115825t(str);
            int length = t.length() - 1;
            if (length >= 0 && t.charAt(length) == '\n') {
                t = t.substring(0, length);
            }
            this.f145266X.setSignature(t);
            this.f145281z.f143978b = t;
            this.f145274s.mo27384f();
            this.f145276u.mo103296c(t);
            this.f145243A = true;
            return true;
        }
        this.f145281z.f143978b = null;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ boolean mo103635l(String str) {
        String str2;
        this.f145267b = true;
        if (!TextUtils.equals(str, C31575b.m65865g().getCurUser().getBioEmail())) {
            String t = m115825t(str);
            int length = t.length() - 1;
            if (length >= 0 && t.charAt(length) == '\n') {
                t = t.substring(0, length);
            }
            this.f145243A = true;
            this.f145281z.f143988l = t;
            this.f145274s.mo27384f();
            this.f145266X.setEmail(t);
            this.f145276u.mo103294a(this.f145281z.mo102037a());
            boolean isEmpty = TextUtils.isEmpty(t);
            if (!TextUtils.isEmpty(t)) {
                str2 = "bold";
            } else {
                str2 = "blank";
            }
            mo103620a("bio_email", isEmpty, str2);
            return true;
        }
        this.f145281z.f143988l = null;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ int mo103638n(String str) {
        String uniqueId;
        User curUser = C31575b.m65865g().getCurUser();
        if (TextUtils.isEmpty(curUser.getUniqueId())) {
            uniqueId = curUser.getShortId();
        } else {
            uniqueId = curUser.getUniqueId();
        }
        if (str.equals(uniqueId)) {
            this.f145281z.f143979c = "";
            return 0;
        } else if (C80346dk.m139311a(str, getContext())) {
            this.f145276u.mo103293a(str);
            this.f145274s.mo27384f();
            this.f145266X.setUniqueId(str);
            return 1;
        } else {
            mo103584d();
            this.f145281z.f143979c = "";
            return 2;
        }
    }

    /* renamed from: a */
    private void m115812a(ProfileNgoStruct profileNgoStruct) {
        if (profileNgoStruct == null || profileNgoStruct.getName().isEmpty()) {
            this.f145270e = null;
        } else {
            this.f145270e = this.f145280y.getProfileNgoStruct();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public void mo90038b(AvatarUri avatarUri) {
        this.f145277v.mo103277d();
        if (this.f145276u == null || avatarUri == null) {
            new C79459a(getActivity()).mo123050a(R.string.nd).mo123053a();
        }
    }

    /* renamed from: a */
    private void mo90036a(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo103617a(this.f145253K, (CharSequence) str, false);
        } else {
            mo103617a(this.f145253K, (CharSequence) getString(R.string.bjx), false);
        }
        List<String> list = this.f145271p;
        if (list != null) {
            mo103617a(this.f145253K, (CharSequence) null, list.contains("bio_email"));
        }
        m115811a(this.f145253K, "bio_email");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public void mo90039b(Exception exc) {
        mo103632k();
        if (af_() && this.f145277v != null) {
            if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 20022) {
                C29823c.m60080a(getActivity(), "profile_image_setting", "review_failure");
            }
            C33615a.m68848a((Context) getActivity(), (Throwable) exc, (int) R.string.nd);
            C85084a.m146294a(exc.getMessage(), "avatar");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public void mo90040b(String str) {
        this.f145279x = true;
        Uri parse = Uri.parse("file://".concat(String.valueOf(str)));
        C24428k.m46551a().mo40247e().mo40228a(parse);
        C34577e.m70608b(this.f145273r, parse.toString(), (int) C13628n.m24520b(getContext(), 84.0f), (int) C13628n.m24520b(getContext(), 84.0f));
    }

    /* renamed from: a */
    private void m115811a(TuxTextCell tuxTextCell, String str) {
        AbstractC23293c.C23302f fVar = (AbstractC23293c.C23302f) tuxTextCell.getAccessory();
        if (fVar != null) {
            fVar.mo37962a(new View$OnClickListenerC64089cc(this, str, tuxTextCell));
        }
    }

    /* renamed from: a */
    public static Object m115809a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7183);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(7183);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        UrlModel urlModel;
        if (i == 1001) {
            C63541m mVar = this.f145263U;
            if (intent == null) {
                C63541m.m115144a(mVar, new Exception("onActivityResult called with null Intent"), (String) null, "goto_URL_and_auth", (YoutubeApi.C63518a) null, 10);
            } else {
                C1731i.m5640b(new C63541m.CallableC63545d(mVar, intent), C1731i.f5562a).mo5532a((AbstractC1729g) new C63541m.C63548e(mVar));
            }
        } else {
            if (!(i != 10002 || intent == null || (urlModel = (UrlModel) intent.getSerializableExtra("path")) == null)) {
                C34577e.m70592a(this.f145273r, urlModel);
                C31575b.m65865g().getCurUser().setAvatarUpdateReminder(false);
                List<String> list = C31575b.m65865g().getCurUser().boldFields;
                if (list != null) {
                    if (list.size() > 0 && !list.contains(UGCMonitor.TYPE_PHOTO)) {
                        list.add(UGCMonitor.TYPE_PHOTO);
                        C31575b.m65865g().getCurUser().setBoldFields(list);
                    }
                    mo103620a(UGCMonitor.TYPE_PHOTO, false, "is_edited");
                }
            }
            this.f145277v.mo102163a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, mo103582b(), viewGroup, false);
        this.f145273r = (AnimatedImageView) a.findViewById(R.id.be7);
        this.f145274s = (DmtStatusView) a.findViewById(R.id.e7i);
        this.f145244B = (LinearLayout) a.findViewById(R.id.bpq);
        this.f145245C = (LinearLayout) a.findViewById(R.id.cdy);
        this.f145246D = (TextView) a.findViewById(R.id.d0z);
        this.f145247E = (TuxTextCell) a.findViewById(R.id.cr8);
        this.f145248F = (TuxTextCell) a.findViewById(R.id.csm);
        this.f145249G = (TuxTextCell) a.findViewById(R.id.fah);
        this.f145250H = (TuxTextCell) a.findViewById(R.id.da8);
        this.f145251I = (TuxTextCell) a.findViewById(R.id.sl);
        this.f145252J = (TuxTextCell) a.findViewById(R.id.fih);
        this.f145253K = (TuxTextCell) a.findViewById(R.id.chs);
        this.f145254L = (TuxTextCell) a.findViewById(R.id.ctf);
        this.f145255M = (TuxTextCell) a.findViewById(R.id.kk);
        this.f145256N = (TuxTextCell) a.findViewById(R.id.a21);
        this.f145257O = a.findViewById(R.id.sk);
        this.f145258P = (TuxTextCell) a.findViewById(R.id.bp2);
        this.f145259Q = (TuxTextCell) a.findViewById(R.id.fk6);
        this.f145260R = (TuxTextCell) a.findViewById(R.id.f7q);
        View findViewById = a.findViewById(R.id.f9p);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC64053bn(this));
        }
        View findViewById2 = a.findViewById(R.id.cdy);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC64054bo(this));
        }
        View findViewById3 = a.findViewById(R.id.be7);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC64065bz(this));
        }
        if (getArguments() != null) {
            this.f145269d = getArguments().getInt("need_focus_id_input", 0);
        }
        mo103581a(a);
        EventBus.m156966a(EventBus.m156962a(), this);
        return a;
    }

    /* renamed from: a */
    private void m115814a(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        if (this.f43437f) {
            ((C23048e) new C23048e(getActivity()).mo37411b(str).mo37413d(str2)).mo37443a(R.string.a7h, onClickListener).mo37442a().mo37396b().show();
        }
    }
}
