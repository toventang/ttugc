package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p035f.C0671a;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tag.TuxTag;
import com.kakao.usermgmt.StringSet;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37593d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.experiment.C46959fx;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49495aa;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49525p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p2082ss.android.ugc.aweme.feed.p2977v.C50480a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50530af;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.widget.C50506a;
import com.p2082ss.android.ugc.aweme.feed.widget.C50507b;
import com.p2082ss.android.ugc.aweme.feed.widget.C50516i;
import com.p2082ss.android.ugc.aweme.feed.widget.C50517j;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.C58292e;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59253r;
import com.p2082ss.android.ugc.aweme.mix.MixHelperService;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74147f;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.translation.p4144ui.TranslationStatusView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cc */
public final class C50166cc extends AbstractC49544a {

    /* renamed from: a */
    public static boolean f115801a = C50480a.m94644a();

    /* renamed from: b */
    public static boolean f115802b = C46959fx.m90245a();

    /* renamed from: c */
    public static final int f115803c;

    /* renamed from: A */
    private boolean f115804A;

    /* renamed from: B */
    private boolean f115805B = C33403c.f79371a;

    /* renamed from: C */
    private List<TextExtraStruct> f115806C;

    /* renamed from: D */
    private String[] f115807D;

    /* renamed from: E */
    private View f115808E;

    /* renamed from: F */
    private View f115809F;

    /* renamed from: d */
    public MentionTextView f115810d;

    /* renamed from: e */
    public TextView f115811e;

    /* renamed from: f */
    public TranslationStatusView f115812f;

    /* renamed from: g */
    LinearLayout f115813g;

    /* renamed from: h */
    FrameLayout f115814h;

    /* renamed from: i */
    public C50153bv f115815i;

    /* renamed from: j */
    public AbstractC50087aw f115816j;

    /* renamed from: k */
    boolean f115817k;

    /* renamed from: l */
    boolean f115818l;

    /* renamed from: m */
    public SpannableStringBuilder f115819m;

    /* renamed from: n */
    public int f115820n;

    /* renamed from: o */
    public SpannableStringBuilder f115821o;

    /* renamed from: p */
    public int f115822p;

    /* renamed from: q */
    int f115823q;

    /* renamed from: r */
    TuxTag f115824r;

    /* renamed from: s */
    TextView f115825s;

    /* renamed from: t */
    public SpannableStringBuilder f115826t;

    /* renamed from: u */
    public int f115827u;

    /* renamed from: v */
    public int f115828v;

    /* renamed from: w */
    final int f115829w = AVExternalServiceImpl.m113114a().publishService().getAddVideosExperiConsuSideCode();

    /* renamed from: x */
    boolean f115830x = false;

    /* renamed from: y */
    private AbstractC38029b f115831y;

    /* renamed from: z */
    private boolean f115832z;

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: l */
    public final boolean mo81290l() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this.f113951J);
            dataCenter.mo60189a("on_page_unselected", (AbstractC1214u<C33942b>) this.f113951J);
            dataCenter.mo60189a("on_bottom_layer_clicked", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    /* renamed from: a */
    public final void mo85321a(boolean z) {
        if (this.f113959R != null && this.f113953L != null && this.f113953L.getDesc() != null) {
            boolean a = C80471gb.m139483a(this.f113959R);
            boolean a2 = C0671a.m2407a().mo2695a(this.f113953L.getDesc());
            int i = 1;
            boolean z2 = false;
            boolean z3 = a != a2;
            try {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f115810d.getLayoutParams();
                if (z) {
                    if (!this.f115804A) {
                        if (z3) {
                            if (this.f115832z) {
                                return;
                            }
                        } else if (!this.f115832z) {
                            return;
                        }
                    }
                    this.f115804A = false;
                    this.f115832z = !this.f115832z;
                    MentionTextView mentionTextView = this.f115810d;
                    if (!a2) {
                        i = 0;
                    }
                    C0792v.m2759b((View) mentionTextView, i);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f115811e.getLayoutParams();
                    layoutParams2.gravity = a2 ? 83 : 85;
                    layoutParams2.leftMargin = C34728n.m70946a(15.0d);
                    int i2 = Build.VERSION.SDK_INT;
                    layoutParams2.setMarginStart((int) C13628n.m24520b(this.f113959R, 15.0f));
                    this.f115811e.setLayoutParams(layoutParams2);
                    z2 = z3;
                } else if (C0792v.m2768e(this.f115810d) != a) {
                    this.f115804A = true;
                    MentionTextView mentionTextView2 = this.f115810d;
                    if (!a) {
                        i = 0;
                    }
                    C0792v.m2759b((View) mentionTextView2, i);
                } else {
                    return;
                }
                if (z2) {
                    layoutParams.rightMargin = C34728n.m70946a(15.0d);
                    layoutParams.leftMargin = C34728n.m70946a(0.0d);
                    int i3 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginEnd((int) C13628n.m24520b(this.f113959R, 15.0f));
                    layoutParams.setMarginStart((int) C13628n.m24520b(this.f113959R, 0.0f));
                } else {
                    layoutParams.leftMargin = C34728n.m70946a(15.0d);
                    layoutParams.rightMargin = C34728n.m70946a(0.0d);
                    int i4 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginStart((int) C13628n.m24520b(this.f113959R, 15.0f));
                    layoutParams.setMarginEnd((int) C13628n.m24520b(this.f113959R, 0.0f));
                }
                this.f115810d.setLayoutParams(layoutParams);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo85320a(CharSequence charSequence) {
        try {
            if (C49495aa.m92734a()) {
                C51423a.m95784a(4, "VideoDescView", "VideoDescView_setDescSafely desc:".concat(String.valueOf(charSequence)));
            }
            if (f115801a) {
                String descLanguage = this.f113953L.getDescLanguage();
                if (!f115802b || this.f115826t == null || !charSequence.toString().contains("\n")) {
                    this.f115810d.mo124997a(charSequence, descLanguage);
                } else {
                    this.f115810d.mo124997a(this.f115826t, descLanguage);
                }
            } else if (this.f113953L.isAd()) {
                this.f115810d.setText(charSequence);
            } else {
                this.f115810d.mo124997a(charSequence, this.f113953L.getDescLanguage());
            }
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
    }

    /* renamed from: a */
    public final void mo85318a(Aweme aweme, boolean z) {
        List<TextExtraStruct> list;
        if (aweme != null) {
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            if (z && (list = this.f115806C) != null) {
                textExtra = list;
            }
            if (!aweme.isScheduleVideo()) {
                this.f115810d.mo124999a(textExtra, new C74147f(), new C50175ci(this));
            }
            CommerceChallengeServiceImpl.m75741e().mo65385a(this.f115810d, aweme, this.f113954M);
            if (textExtra != null && !TextUtils.isEmpty(aweme.getDesc())) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    if ((m94152b(textExtraStruct) && textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype() || 7 == textExtraStruct.getSubtype() || 5 == textExtraStruct.getSubtype()) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || (m94152b(textExtraStruct) && this.f115829w == 1 && textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) {
                        C37593d dVar = new C37593d(this.f113959R, (float) Math.round(((float) C13628n.m24504a(this.f113959R)) - (C13628n.m24520b(this.f113959R, 100.0f) + this.f113959R.getResources().getDimension(R.dimen.g5))), C0643b.m2378c(this.f113959R, R.color.a7), -1, textExtraStruct, false);
                        dVar.f88862b = C13628n.m24520b(this.f113959R, 12.0f);
                        dVar.f88863c = C13628n.m24520b(this.f113959R, 2.0f);
                        dVar.f88861a = C13628n.m24520b(this.f113959R, 13.0f);
                        this.f115810d.mo124996a(textExtraStruct.getStart(), textExtraStruct.getEnd(), dVar);
                        if (4 == textExtraStruct.getSubtype()) {
                            C39162r.m79460a("duet_with_show", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("music_id", C59208ac.m108770d(this.f113953L)).f79943a);
                        }
                    }
                }
            }
            this.f115810d.setAdHashTag(aweme);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo85319a(TextExtraStruct textExtraStruct) {
        String str;
        String str2;
        String str3;
        if (textExtraStruct != null) {
            boolean z = false;
            String str4 = "";
            if (textExtraStruct.getType() == 1) {
                CommerceChallengeServiceImpl.m75741e().mo65384a(textExtraStruct);
                if (CommerceChallengeServiceImpl.m75741e().mo65376a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null) {
                    CommerceChallengeServiceImpl.m75741e().mo65391b(this.f113954M, textExtraStruct.getHashTagName());
                }
                String uuid = UUID.randomUUID().toString();
                if (MSAdaptionService.m97895c().mo89377c(this.f113959R)) {
                    SmartRouter.buildRoute(this.f113959R, "//duo").withParam("duo_type", "duo_challenge").withParam("aweme_id", this.f113953L.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("extra_challenge_from", this.f113954M).open();
                } else {
                    C18285c.m34003a("cd_start_activity_to_request_net_duration");
                    C18285c.m34003a("cd_start_activity_to_show_header_duration");
                    C18285c.m34003a("cd_start_activity_to_show_list_duration");
                    SmartRouter.buildRoute(this.f113959R, "//challenge/detail").withParam("aweme_id", this.f113953L.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", this.f113954M).open(10086);
                }
                C39162r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(this.f113954M).setValue(this.f113953L.getAid()).setExtValueString(textExtraStruct.getCid()));
                C38000g.m77050a().mo65892d(this.f113959R, this.f113953L);
                C18129a.m33746a("draw_ad", "challenge_click", this.f113953L.getAwemeRawAd()).mo28902c();
                String searchResultId = FeedParamProvider.C49809a.m93270a(this.f113959R).getSearchResultId();
                if (TextUtils.isEmpty(searchResultId)) {
                    searchResultId = C59208ac.m108771e(this.f113953L);
                }
                if (this.f113953L.getBottomBarModel() != null) {
                    z = true;
                }
                C59253r rVar = (C59253r) new C59253r().mo96827o(this.f113954M).mo96740a(this.f113959R);
                if (this.f113953L.getAuthor() != null) {
                    str3 = this.f113953L.getAuthor().getUid();
                } else {
                    str3 = str4;
                }
                rVar.f135339p = str3;
                rVar.f135338e = this.f113953L.getAid();
                C59253r f = rVar.mo96749g(this.f113953L);
                f.f135320X = FeedParamProvider.C49809a.m93270a(this.f113959R).getPreviousPage();
                f.f135321Y = FeedParamProvider.C49809a.m93270a(this.f113959R).getPreviousPagePosition();
                f.f135322Z = z;
                f.f135341r = uuid;
                f.f135343t = (String) this.f113958Q.mo60195b("playlist_type", str4);
                f.f135345v = (String) this.f113958Q.mo60195b("playlist_id", str4);
                f.f135344u = (String) this.f113958Q.mo60195b("playlist_id_key", str4);
                C59253r rVar2 = (C59253r) f.mo96801c((String) this.f113958Q.mo60195b("tab_name", str4)).mo96802d(C59208ac.m108764b(this.f113953L, this.f113957P));
                rVar2.f135340q = textExtraStruct.getCid();
                C59253r rVar3 = (C59253r) ((C59253r) rVar2.mo96741a("click_in_video_name")).mo96828p(C59208ac.m108759a(this.f113953L, this.f113957P)).mo96804f(searchResultId).mo96810l(FeedParamProvider.C49809a.m93270a(this.f113959R).getSearchId());
                rVar3.f135324ab = FeedParamProvider.C49809a.m93270a(this.f113959R).getCategoryName();
                AbstractC59233c a = rVar3.mo96788a(C80632w.m139800a(this.f113953L, "enter_tag_detail", this.f113954M));
                C79900c.m138667a(a, this.f113953L, this.f113954M);
                a.mo96792f();
                C49907s.m93686a(EnumC48310af.CHALLENGE);
            } else if (textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype() || 7 == textExtraStruct.getSubtype() || 5 == textExtraStruct.getSubtype()) && m94152b(textExtraStruct) && this.f113953L.getDesc().charAt(textExtraStruct.getStart()) == '@')) {
                if (2 == textExtraStruct.getSubtype() || 3 == textExtraStruct.getSubtype()) {
                    if (this.f113953L.getVideoReplyStruct() != null) {
                        VideoReplyStruct videoReplyStruct = this.f113953L.getVideoReplyStruct();
                        String valueOf = videoReplyStruct.getAwemeId() != 0 ? String.valueOf(videoReplyStruct.getAwemeId()) : str4;
                        str = videoReplyStruct.getCommentId() != 0 ? String.valueOf(videoReplyStruct.getCommentId()) : str4;
                        if (videoReplyStruct.getAliasCommentId() != 0) {
                            str4 = String.valueOf(videoReplyStruct.getAliasCommentId());
                        }
                        str2 = str4;
                        str4 = valueOf;
                    } else {
                        str2 = str4;
                        str = str2;
                    }
                    if (2 == textExtraStruct.getSubtype()) {
                        C39162r.m79460a("click_comment_chain", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("to_group_id", str4).mo59983a("reply_comment_id", str).mo59983a("reply_user_id", textExtraStruct.getUserId()).f79943a);
                    }
                } else {
                    if (this.f113953L.getAwemeType() == 51) {
                        C39162r.m79460a("click_duet_icon", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("to_group_id", textExtraStruct.getAwemeId()).mo59983a("chain_type", "duet").f79943a);
                    } else if (this.f113953L.getAwemeType() == 52) {
                        C39162r.m79460a("click_react_icon", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("to_group_id", textExtraStruct.getAwemeId()).f79943a);
                    } else if (this.f113953L.getAwemeType() == 58) {
                        C39162r.m79460a("click_duet_icon", new C33744d().mo59983a("chain_type", "stitch").mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("to_group_id", textExtraStruct.getAwemeId()).f79943a);
                    }
                    str2 = str4;
                    str = str2;
                }
                if (!m94156p()) {
                    new C79459a(this.f113959R).mo123050a(R.string.dcq).mo123053a();
                } else if (2 == textExtraStruct.getSubtype()) {
                    SmartRouter.buildRoute(this.f113959R, "aweme://aweme/detail/").withParam("id", str4).withParam("refer", "click_comment_chain").withParam("cid", str + "," + str2).withParam("video_from", this.f113954M).withParam("last_group_id", this.f113953L.getAid()).open();
                } else if (7 == textExtraStruct.getSubtype() || 5 == textExtraStruct.getSubtype()) {
                    boolean enableQaSticker = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableQaSticker();
                    List<InteractStickerStruct> interactStickerStructs = this.f113953L.getInteractStickerStructs();
                    if (!enableQaSticker || interactStickerStructs == null || interactStickerStructs.isEmpty()) {
                        new C23144b(this.f115808E).mo37640e(R.string.f46).mo37637b();
                        return;
                    }
                    Long l = 0L;
                    Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InteractStickerStruct next = it.next();
                        if (next.getQaStruct() != null && next.getQaStruct().getQuestionId() != 0) {
                            l = Long.valueOf(next.getQaStruct().getQuestionId());
                            break;
                        }
                    }
                    if (l.longValue() == 0) {
                        new C79459a(this.f113959R).mo123050a(R.string.f46).mo123053a();
                    } else {
                        SmartRouter.buildRoute(this.f113959R, "aweme://qna/detail/").withParam("id", String.valueOf(l)).withParam("extra_question_from", this.f113954M).withParam("aweme_id", this.f113953L.getAid()).withParam("qid", String.valueOf(l)).withParam("enter_from", this.f113954M).withParam("enter_method", "click_anchor").withParam("process_id", UUID.randomUUID().toString()).open();
                    }
                } else if (4 == textExtraStruct.getSubtype()) {
                    Map<String, String> map = new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("music_id", C59208ac.m108770d(this.f113953L)).mo59983a("anchor_type", "duet").f79943a;
                    C39162r.m79460a("enter_anchor_detail", map);
                    SmartRouter.buildRoute(this.f113959R, "//duet/detail").withParam("id", this.f113953L.getAid()).withParam("author_id", this.f113953L.getAuthorUid()).withParam("origin_item_id", textExtraStruct.getAwemeId()).withParam("anchor_event_map", new HashMap(map)).open();
                } else {
                    SmartRouter.buildRoute(this.f113959R, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.f113954M).withParam("isChain", true).withParam("is_from_duet_chain", this.f113953L.getAwemeType() == 51).open();
                }
            } else if (textExtraStruct.getType() != 5 || textExtraStruct.getSubtype() != 6 || TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                C39162r.m79457a(StringSet.name, "video_at", this.f113953L.getAid(), textExtraStruct.getUserId());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("group_id", str4);
                    jSONObject.put("request_id", this.f113955N.get("request_id"));
                    jSONObject.put("enter_from", this.f113954M);
                    jSONObject.put("enter_method", "click_head");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (this.f113953L.getAuthor() != null) {
                    C39162r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(this.f113953L.getAuthor().getUid()).setJsonObject(jSONObject));
                    String searchResultId2 = FeedParamProvider.m93269a(this.f113959R).getSearchResultId();
                    if (TextUtils.isEmpty(searchResultId2)) {
                        searchResultId2 = C59208ac.m108771e(this.f113953L);
                    }
                    C33744d dVar = new C33744d();
                    if (textExtraStruct.getSubtype() == 11) {
                        dVar.mo59983a("is_from_bc_video", "1");
                    }
                    if (textExtraStruct.getUserId().equals(C31575b.m65865g().getCurUserId())) {
                        C39162r.m79460a("self_mention_click", new C33744d().mo59983a("enter_from", this.f113954M).f79943a);
                    }
                    C39162r.m79460a("enter_personal_detail", dVar.mo59983a("enter_from", this.f113954M).mo59980a("self_click", C31575b.m65865g().getCurUserId().equals(textExtraStruct.getUserId()) ? 1 : 0).mo59983a("to_user_id", textExtraStruct.getUserId()).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("enter_method", "video_at").mo59983a("search_id", FeedParamProvider.m93269a(this.f113959R).getSearchId()).mo59983a("search_result_id", searchResultId2).mo59978a(this.f113953L, "enter_personal_detail", this.f113954M).f79943a);
                }
                SmartRouter.buildRoute(this.f113959R, "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_user_id", textExtraStruct.getSecUid()).withParam("profile_from", "video_at").withParam("enter_from", this.f113954M).withParam("video_id", this.f113953L.getAid()).open();
            } else if (!m94156p()) {
                new C23144b(this.f115810d).mo37640e(R.string.dcq).mo37637b();
            } else {
                C39162r.m79460a("click_quote_icon", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("to_group_id", textExtraStruct.getAwemeId()).mo59983a("quote_type", "personal").f79943a);
                SmartRouter.buildRoute(this.f113959R, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.f113954M).withParam("isChain", true).withParam("is_from_duet_chain", this.f113953L.getAwemeType() == 51).withParam("feed_param_extra", new HashMap(new C33744d().mo59983a("is_from_add_video_chain", "1").f79943a)).open();
            }
        }
    }

    /* renamed from: o */
    private static boolean m94155o() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo85324c() {
        C39162r.m79460a("video_title", mo85315a("show"));
        return null;
    }

    /* renamed from: p */
    private static boolean m94156p() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean o = m94155o();
        C58029j.f132256h = o;
        return o;
    }

    /* renamed from: b */
    public final void mo85322b() {
        if (!mo81288j() && this.f115831y != null) {
            C38000g.m77052c().mo65918a(this.f113959R, this.f113953L, 1, this.f115831y);
        }
    }

    static {
        int i;
        Covode.recordClassIndex(59292);
        if (!f115801a) {
            i = 12;
        } else if (C49525p.m92764d()) {
            i = Integer.MAX_VALUE;
        } else {
            i = 10;
        }
        f115803c = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: k */
    public final boolean mo81289k() {
        if (super.mo81289k()) {
            return true;
        }
        if (!C38701br.m78512a(this.f113953L, 3) || !TextUtils.isEmpty(this.f113953L.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private void m94157q() {
        if (!(!f115802b || this.f115807D == null || this.f113953L.getContentDescExtra() == null)) {
            int length = this.f115807D.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = this.f115807D[i].length();
            }
            List<TextExtraStruct> contentDescExtra = this.f113953L.getContentDescExtra();
            ArrayList arrayList = new ArrayList();
            for (TextExtraStruct textExtraStruct : contentDescExtra) {
                int lineIndex = textExtraStruct.getLineIndex();
                int i2 = 0;
                for (int i3 = 0; i3 < lineIndex; i3++) {
                    i2 += iArr[i3];
                }
                int start = textExtraStruct.getStart() + i2 + lineIndex;
                int end = (textExtraStruct.getEnd() + start) - textExtraStruct.getStart();
                TextExtraStruct clone = textExtraStruct.clone();
                clone.setStart(start);
                clone.setEnd(end);
                arrayList.add(clone);
            }
            this.f115806C = arrayList;
        }
    }

    /* renamed from: r */
    private void m94158r() {
        String contentDesc = this.f113953L.getContentDesc();
        if (f115802b && contentDesc != null) {
            try {
                JSONArray jSONArray = new JSONArray(contentDesc);
                int length = jSONArray.length();
                String[] strArr = new String[length];
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = jSONArray.get(i2).toString();
                    i += strArr[i2].length();
                }
                this.f115828v = length - 1;
                this.f115827u = i;
                if (length > 1) {
                    this.f115826t = new SpannableStringBuilder(TextUtils.join("\n", strArr));
                    this.f115807D = strArr;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m94154e() {
        int i;
        if (this.f113953L.getTextExtra() != null && this.f113953L.getTextExtra().size() > 0) {
            for (TextExtraStruct textExtraStruct : this.f113953L.getTextExtra()) {
                if (textExtraStruct != null) {
                    if (textExtraStruct.getStart() < 0) {
                        textExtraStruct.setStart(0);
                    }
                    if (textExtraStruct.getEnd() > this.f113953L.getDesc().length()) {
                        textExtraStruct.setEnd(this.f113953L.getDesc().length());
                    }
                }
            }
        }
        if (this.f113959R != null) {
            if (f115801a) {
                i = 550;
            } else {
                C37699a.m76314s(this.f113953L);
                i = 200;
            }
            this.f115810d.setMaxSize(i);
            if (this.f115805B) {
                this.f115810d.setSpanSize((float) C34728n.m70949c(14.0d));
            } else {
                this.f115810d.setSpanSize((float) C34728n.m70949c(15.0d));
            }
            MentionTextView mentionTextView = this.f115810d;
            mentionTextView.setSpanColor(mentionTextView.getCurrentTextColor());
            this.f115810d.setSpanStyle(1);
            this.f115810d.setOnSpanClickListener(new C50178cl(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Object mo85325d() {
        if (this.f113953L != null && this.f115815i.f115768j == 2) {
            C39162r.m79460a("see_original_show", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("current_lang", SettingServiceImpl.m120782v().mo108872h()).f79943a);
        } else if (this.f113953L != null && this.f115815i.f115768j == 0) {
            C39162r.m79460a("see_translation_show", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("current_lang", this.f113953L.getDescLanguage()).f79943a);
        }
        if (!MixFeedService.m109435k().mo97326b(this.f113953L) || this.f113953L == null || this.f113953L.getPlaylist_info() == null || this.f113954M == null || this.f113954M.equals("playlist")) {
            return null;
        }
        String mixId = this.f113953L.getPlaylist_info().getMixId();
        C49812b a = FeedParamProvider.C49809a.m93270a(this.f113959R);
        MixFeedService.m109435k().mo97320a(this.f113954M, mixId, this.f113953L.getGroupId(), this.f113953L.getAuthorUid(), new C59538b(a.getPlaylistSearchId(), Integer.valueOf(a.getIsFromVideo()), a.getSearchType(), 0));
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: f */
    public final int mo81281f(C33942b bVar) {
        return super.mo81281f(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cc$a */
    public static class C50169a extends AbstractC50109bf {

        /* renamed from: c */
        private WeakReference<C50166cc> f115839c;

        /* renamed from: d */
        private SpannableStringBuilder f115840d;

        /* renamed from: e */
        private boolean f115841e;

        /* renamed from: f */
        private boolean f115842f;

        static {
            Covode.recordClassIndex(59295);
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-1);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C50166cc ccVar = this.f115839c.get();
            if (ccVar == null) {
                return;
            }
            if (this.f115842f) {
                ccVar.mo85322b();
            } else {
                ccVar.mo85317a(this.f115840d, this.f115841e);
            }
        }

        C50169a(C50166cc ccVar, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2) {
            this.f115839c = new WeakReference<>(ccVar);
            this.f115840d = spannableStringBuilder;
            this.f115841e = z;
            this.f115842f = z2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final boolean mo80933a(C33942b bVar) {
        return C50539g.m94742a(bVar, new C50176cj(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo85323b(final Aweme aweme) {
        this.f115810d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50166cc.ViewTreeObserver$OnGlobalLayoutListenerC501671 */

            static {
                Covode.recordClassIndex(59293);
            }

            /* JADX WARNING: Removed duplicated region for block: B:104:0x03d2  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0142  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x01c5  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x021c  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x028e A[SYNTHETIC, Splitter:B:64:0x028e] */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x02f4  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x0303  */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x033a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onGlobalLayout() {
                /*
                // Method dump skipped, instructions count: 1012
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50166cc.ViewTreeObserver$OnGlobalLayoutListenerC501671.onGlobalLayout():void");
            }
        });
    }

    /* renamed from: a */
    static boolean m94150a(Aweme aweme) {
        if (TextUtils.isEmpty(aweme.getDesc()) || C58956a.m108315a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m94153c(Aweme aweme) {
        if (f115801a) {
            return C50530af.m94719b();
        }
        if (C37699a.m76314s(aweme)) {
            return aweme.getAdDescMaxLines();
        }
        return C50530af.m94719b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, String> mo85315a(String str) {
        return new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("action_type", str).f79943a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo81277b(VideoItemParams videoItemParams) {
        super.mo81277b(videoItemParams);
        if (videoItemParams != null) {
            this.f115816j = videoItemParams.videoDescViewHost;
            this.f115831y = videoItemParams.mAdOpenCallBack;
            new Handler(Looper.getMainLooper()).post(new RunnableC50171ce(this, videoItemParams));
        }
    }

    /* renamed from: a */
    private static InputFilter[] m94151a(InputFilter[] inputFilterArr) {
        int length = inputFilterArr.length;
        if (inputFilterArr.length != 0) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (inputFilterArr[i2] instanceof InputFilter.LengthFilter) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            C51423a.m95784a(4, "VideoDescView", "descView,InputFilter size:".concat(String.valueOf(length)));
            if (i >= 0) {
                int i3 = length - 1;
                Object newInstance = Array.newInstance(InputFilter.class, i3);
                System.arraycopy(inputFilterArr, 0, newInstance, 0, i);
                if (i < i3) {
                    System.arraycopy(inputFilterArr, i + 1, newInstance, i, (length - i) - 1);
                }
                InputFilter[] inputFilterArr2 = (InputFilter[]) newInstance;
                if (inputFilterArr2 != null) {
                    return inputFilterArr2;
                }
            }
        }
        C51423a.m95784a(4, "VideoDescView", "not find InputFilter.LengthFilter,size:".concat(String.valueOf(length)));
        return new InputFilter[0];
    }

    /* renamed from: b */
    private boolean m94152b(TextExtraStruct textExtraStruct) {
        if (this.f113953L == null || this.f113953L.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > this.f113953L.getDesc().length() || textExtraStruct.getStart() >= this.f113953L.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80938c(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r5) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50166cc.mo80938c(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        boolean z;
        MethodCollector.m26663i(7306);
        boolean z2 = true;
        if (!this.f115830x) {
            View view = this.f115808E;
            if (view instanceof FrameLayout) {
                ((FrameLayout) view).addView(this.f115809F);
                this.f115830x = true;
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(7306);
        } else if (((Map) bVar.mo60212a()).get("aweme_state") == null) {
            C51423a.m95791b(6, "VideoDescView", "desc Aweme null and content visible " + this.f115809F.getVisibility());
            MethodCollector.m26664o(7306);
        } else {
            Map map = (Map) bVar.mo60212a();
            Aweme aweme = (Aweme) map.get("aweme_state");
            this.f115811e.setVisibility(4);
            this.f115811e.setText(this.f113959R.getString(R.string.bua));
            if (this.f115805B) {
                this.f115811e.setTextSize(14.0f);
            }
            this.f115810d.setMaxLines(m94153c(aweme));
            mo85320a("");
            if (((Boolean) map.get("isShowVideoDesc")).booleanValue()) {
                this.f113960S.setVisibility(0);
                mo85320a((CharSequence) map.get("desc"));
                z = true;
            } else {
                this.f113960S.setVisibility(8);
                z = false;
            }
            this.f115815i.mo85294a(aweme);
            this.f115815i.f115772o = false;
            if (((Boolean) map.get("isShowSplitVideoPartDescForFeed")).booleanValue()) {
                if (TextUtils.isEmpty(aweme.getDesc())) {
                    z = true;
                }
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) aweme.partN).append((CharSequence) " | ");
                append.append(this.f115810d.getText());
                mo85320a(append);
                this.f113960S.setVisibility(0);
            }
            if (((Boolean) map.get("isShowMixDesNumForFeed")).booleanValue()) {
                if (!TextUtils.isEmpty(aweme.getDesc())) {
                    z2 = z;
                }
                MixHelperService.m109027a();
                this.f113960S.setVisibility(0);
                z = z2;
            }
            if (z) {
                if (f115801a) {
                    this.f115810d.scrollTo(0, 0);
                    this.f115814h.getLayoutParams().height = -2;
                }
                Aweme aweme2 = (Aweme) map.get("aweme_state");
                String str = (String) map.get("event_type_state");
                int intValue = ((Integer) map.get("page_type_state")).intValue();
                if (Build.VERSION.SDK_INT < 21) {
                    this.f115813g.post(new RunnableC50179cm(this));
                }
                if (this.f113959R != null) {
                    mo85318a(aweme2, false);
                    try {
                        if (C80471gb.m139483a(this.f113959R)) {
                            if (f115801a) {
                                this.f115810d.setMovementMethod(C50517j.C50518a.m94697a());
                            } else {
                                this.f115810d.setMovementMethod(C50516i.m94696a());
                            }
                        } else if (f115801a) {
                            this.f115810d.setMovementMethod(C50507b.C50508a.m94688a());
                        } else {
                            this.f115810d.setMovementMethod(C50506a.m94687a());
                        }
                    } catch (IndexOutOfBoundsException e) {
                        C51423a.m95788a("", e);
                    }
                    if (CommerceChallengeServiceImpl.m75741e().mo65396d()) {
                        this.f115810d.post(new RunnableC50180cn(this, aweme2, str, intValue));
                        MethodCollector.m26664o(7306);
                        return;
                    }
                    mo85323b(aweme2);
                }
            }
            MethodCollector.m26664o(7306);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        boolean z;
        Boolean bool;
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (!bVar.f80277a.equals("video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        this.f113953L = CommerceChallengeServiceImpl.m75741e().mo65378a(this.f113953L);
        Aweme aweme = this.f113953L;
        hashMap.put("aweme_state", aweme);
        hashMap.put("isShowVideoDesc", Boolean.valueOf(m94150a(this.f113953L)));
        hashMap.put("event_type_state", this.f113954M);
        hashMap.put("page_type_state", Integer.valueOf(this.f113957P));
        m94158r();
        m94157q();
        if (this.f113953L.getDesc() != null) {
            this.f113953L.setCaptionLength(this.f113953L.getDesc().length());
        }
        boolean z2 = false;
        this.f115817k = false;
        C51423a.m95793c(4, "VideoDescView", "start to bind aweme des");
        MentionTextView mentionTextView = this.f115810d;
        if (mentionTextView != null) {
            this.f115810d.setFilters(m94151a(mentionTextView.getFilters()));
        }
        if (((Boolean) hashMap.get("isShowVideoDesc")).booleanValue()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f113953L.getDesc());
            m94154e();
            hashMap.put("desc", spannableStringBuilder);
        } else {
            C51423a.m95791b(4, "VideoDescView", "don't show desc,empty?" + TextUtils.isEmpty(this.f113953L.getDesc()));
        }
        if (this.f115815i == null) {
            C50153bv bvVar = new C50153bv(this.f113959R, this.f115812f, this.f115810d, this.f115811e, this.f115814h);
            this.f115815i = bvVar;
            bvVar.mo85301a(this.f113954M, this.f113957P);
        }
        this.f115813g.setOnClickListener(new View$OnClickListenerC50177ck(this));
        if (aweme == null || TextUtils.isEmpty(aweme.partN)) {
            z = false;
        } else {
            z = true;
        }
        hashMap.put("isShowSplitVideoPartDescForFeed", Boolean.valueOf(z));
        if (z && TextUtils.isEmpty(this.f113953L.getDesc())) {
            m94154e();
        }
        if (!FeedParamProvider.m93269a(this.f113959R).isHotSpot()) {
            MixHelperService.m109027a();
        }
        hashMap.put("isShowMixDesNumForFeed", false);
        if (MixFeedService.m109435k().mo97326b(this.f113953L)) {
            Aweme aweme2 = this.f113953L;
            if (aweme2 == null || aweme2.getStatus() == null) {
                bool = false;
            } else {
                if (aweme2.getStatus().getPrivateStatus() == 0) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            }
            if (bool.booleanValue() && TextUtils.isEmpty(this.f113953L.getDesc())) {
                m94154e();
            }
        }
        return new C33942b("uistate", hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        this.f115808E = view;
        View a = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.t0);
        this.f115809F = a;
        MentionTextView mentionTextView = (MentionTextView) a.findViewById(R.id.ajd);
        this.f115810d = mentionTextView;
        if (mentionTextView == null) {
            a = C58292e.m105313a(getClass().getName(), a, this.f113959R, R.layout.t0);
        }
        if (this.f115805B) {
            this.f115810d.setFontSize(5);
        }
        TextView textView = (TextView) a.findViewById(R.id.f68);
        this.f115811e = textView;
        textView.setTextSize(15.0f);
        this.f115811e.setOnClickListener(new View$OnClickListenerC50170cd(this));
        this.f115825s = (TextView) a.findViewById(R.id.d_m);
        this.f115824r = (TuxTag) a.findViewById(R.id.emr);
        this.f115812f = (TranslationStatusView) a.findViewById(R.id.eng);
        this.f115814h = (FrameLayout) a.findViewById(R.id.ajk);
        this.f115813g = (LinearLayout) a.findViewById(R.id.ajv);
    }

    public C50166cc(View view, boolean z) {
        super(view, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0188, code lost:
        if (r10 != false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85317a(android.text.SpannableStringBuilder r9, final boolean r10) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50166cc.mo85317a(android.text.SpannableStringBuilder, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85316a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z, boolean z2) {
        C50169a aVar = new C50169a(this, spannableStringBuilder2, z, z2);
        aVar.f115672a = 0;
        spannableStringBuilder.setSpan(aVar, 0, spannableStringBuilder.length(), 17);
    }

    /* renamed from: a */
    public final int mo85314a(CharSequence charSequence, String str, int i, int i2, int i3) {
        float f;
        try {
            float measureText = this.f115811e.getPaint().measureText(str);
            int width = this.f115810d.getWidth();
            float measureText2 = this.f115810d.getPaint().measureText(charSequence, i2, i3);
            if (this.f115805B) {
                f = this.f115810d.getPaint().measureText("...", 0, 3);
            } else {
                f = 0.0f;
            }
            float f2 = ((measureText2 + measureText) + f) - ((float) width);
            if (f2 <= 0.0f) {
                return 0;
            }
            int i4 = (i3 - i2) + 1;
            for (int i5 = 1; i5 <= i4; i5++) {
                if (this.f115810d.getPaint().measureText(charSequence, i3 - i5, i3) >= f2) {
                    return i5;
                }
            }
            return i + 1;
        } catch (Exception unused) {
            return i;
        }
    }
}
