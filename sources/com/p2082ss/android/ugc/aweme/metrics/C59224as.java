package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50557v;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.p3437a.C59204a;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.metrics.as */
public class C59224as extends AbstractC59242h<C59224as> {

    /* renamed from: X */
    public boolean f135066X;

    /* renamed from: Y */
    public int f135067Y = -1;

    /* renamed from: Z */
    public boolean f135068Z;

    /* renamed from: a */
    public long f135069a;

    /* renamed from: aA */
    public int f135070aA;

    /* renamed from: aB */
    public int f135071aB = 0;

    /* renamed from: aC */
    private String f135072aC;

    /* renamed from: aD */
    private String f135073aD;

    /* renamed from: aE */
    private String f135074aE = "";

    /* renamed from: aF */
    private String f135075aF;

    /* renamed from: aG */
    private int f135076aG;

    /* renamed from: aH */
    private String f135077aH;

    /* renamed from: aI */
    private boolean f135078aI;

    /* renamed from: aJ */
    private String f135079aJ;

    /* renamed from: aK */
    private String f135080aK;

    /* renamed from: aL */
    private String f135081aL;

    /* renamed from: aM */
    private String f135082aM;

    /* renamed from: aN */
    private String f135083aN;

    /* renamed from: aO */
    private int f135084aO;

    /* renamed from: aP */
    private boolean f135085aP;

    /* renamed from: aQ */
    private String f135086aQ;

    /* renamed from: aR */
    private String f135087aR;

    /* renamed from: aS */
    private String f135088aS;

    /* renamed from: aT */
    private String f135089aT;

    /* renamed from: aU */
    private int f135090aU = -1;

    /* renamed from: aV */
    private int f135091aV;

    /* renamed from: aW */
    private int f135092aW;

    /* renamed from: aX */
    private int f135093aX;

    /* renamed from: aY */
    private String f135094aY;

    /* renamed from: aZ */
    private int f135095aZ;

    /* renamed from: aa */
    public String f135096aa;

    /* renamed from: ab */
    public String f135097ab;

    /* renamed from: ac */
    public String f135098ac;

    /* renamed from: ad */
    public String f135099ad;

    /* renamed from: ae */
    public String f135100ae;

    /* renamed from: af */
    public String f135101af;

    /* renamed from: ag */
    public String f135102ag;

    /* renamed from: ah */
    public String f135103ah;

    /* renamed from: ai */
    public String f135104ai;

    /* renamed from: aj */
    public String f135105aj;

    /* renamed from: ak */
    public String f135106ak;

    /* renamed from: al */
    public String f135107al;

    /* renamed from: am */
    public String f135108am;

    /* renamed from: an */
    public String f135109an;

    /* renamed from: ao */
    public String f135110ao = "";

    /* renamed from: ap */
    public String f135111ap;

    /* renamed from: aq */
    public String f135112aq = "";

    /* renamed from: ar */
    public int f135113ar = -1;

    /* renamed from: as */
    public String f135114as = "";

    /* renamed from: at */
    public String f135115at = "";

    /* renamed from: au */
    public String f135116au = "";

    /* renamed from: av */
    public String f135117av = "";

    /* renamed from: aw */
    public String f135118aw = "";

    /* renamed from: ax */
    public String f135119ax = "";

    /* renamed from: ay */
    public String f135120ay = "";

    /* renamed from: az */
    public int f135121az;

    /* renamed from: b */
    public int f135122b = 1;

    /* renamed from: ba */
    private int f135123ba;

    /* renamed from: bb */
    private AwemeRelationRecommendModel f135124bb;

    /* renamed from: bc */
    private int f135125bc;

    /* renamed from: bd */
    private String f135126bd = "";

    /* renamed from: be */
    private int f135127be;

    /* renamed from: bf */
    private String f135128bf = "";

    /* renamed from: bg */
    private int f135129bg;

    /* renamed from: bh */
    private Long f135130bh = 0L;

    /* renamed from: c */
    public String f135131c;

    /* renamed from: d */
    public String f135132d;

    /* renamed from: e */
    public String f135133e;

    /* renamed from: p */
    public String f135134p;

    /* renamed from: q */
    public String f135135q;

    /* renamed from: r */
    public String f135136r;

    /* renamed from: s */
    public String f135137s;

    /* renamed from: t */
    public double f135138t;

    /* renamed from: u */
    public String f135139u;

    /* renamed from: v */
    public String f135140v;

    static {
        Covode.recordClassIndex(69587);
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: j */
    public final String mo96770j() {
        return this.f135072aC;
    }

    public C59224as() {
        super("play_time");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        int i;
        String str;
        mo96786a("has_tts", this.f135119ax);
        mo96786a("has_cla", this.f135120ay);
        mo96790a("group_id", this.f135072aC, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135073aD, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("duration", String.valueOf(this.f135069a), AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("player_type", this.f135131c, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("fps", this.f135075aF, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page", this.f135139u, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page", this.f135139u, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page_position", this.f135140v, AbstractC59233c.AbstractC59234a.f135177a);
        if (this.f135066X) {
            mo96790a("is_instructive", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135074aE)) {
            mo96790a("is_auto_play", this.f135074aE, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135081aL)) {
            mo96790a("district_code", this.f135081aL, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135082aM)) {
            mo96790a("sub_class", this.f135082aM, AbstractC59233c.AbstractC59234a.f135177a);
        }
        int i2 = this.f135067Y;
        if (i2 != -1) {
            mo96785a("rank_index", i2);
        }
        if (C59208ac.m108762a(this.f135169h)) {
            if (!TextUtils.isEmpty(this.f135107al)) {
                mo96786a("impr_id", this.f135107al);
            } else {
                mo96786a("impr_id", this.f135132d);
            }
            mo96794h(C59204a.m108753a(this.f135132d, this.f135107al));
        }
        if ("like".equals(this.f135134p) || "discovery".equals(this.f135169h) || this.f135129bg == 1) {
            mo96790a("enter_method", this.f135133e, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("content_source", this.f135134p, AbstractC59233c.AbstractC59234a.f135177a);
        if (C65724g.m117661a().mo104866a(this.f135072aC)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135076aG != 0) {
            mo96790a("is_long_item", new StringBuilder().append(this.f135076aG).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel")) {
            C81469a.m141252a();
        }
        if (!TextUtils.isEmpty(this.f135136r)) {
            mo96790a(this.f135136r, this.f135137s, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135135q)) {
            mo96790a("playlist_type", this.f135135q, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("volume_value", String.valueOf(this.f135138t), AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f135077aH)) {
            mo96790a("impr_type", this.f135077aH, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C39223a.m79601o().mo68703a()) {
            mo96790a("is_teen_mode", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C59208ac.m108766b(this.f135169h)) {
            mo96790a("is_auto_play", C59209ad.m108781a(this.f135078aI), AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("enter_fullscreen", String.valueOf(this.f135122b), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135079aJ)) {
            mo96790a("is_reposted", new StringBuilder().append(this.f135091aV).toString(), AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_group_id", this.f135079aJ, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_user_id", this.f135080aK, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            if (this.f135085aP) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo96786a("relation_type", str);
            mo96786a("video_type", this.f135086aQ);
            mo96786a("rec_uid", this.f135087aR);
        }
        mo96785a("is_promoted", this.f135125bc);
        C50557v.m94786a(this.f135169h, new C59225at(this));
        mo96787a("is_highlighted", this.f135068Z);
        if (!TextUtils.isEmpty(this.f135083aN)) {
            mo96790a("compilation_id", this.f135083aN, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135096aa)) {
            mo96790a("carrier_type", this.f135096aa, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135097ab)) {
            mo96790a("refer_seed_id", this.f135097ab, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135098ac)) {
            mo96790a("refer_seed_name", this.f135098ac, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135099ad)) {
            mo96790a("from_group_id", this.f135099ad, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135100ae)) {
            mo96790a("data_type", this.f135100ae, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135101af)) {
            mo96786a("refer_commodity_id", this.f135101af);
        }
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        mo96790a("request_id", this.f135132d, AbstractC59233c.AbstractC59234a.f135178b);
        if (TextUtils.isEmpty(this.f135132d) && !TextUtils.isEmpty(this.f135107al)) {
            mo96790a("request_id", this.f135107al, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (!TextUtils.isEmpty(this.f135102ag)) {
            mo96790a("search_keyword", this.f135102ag, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135206F)) {
            mo96790a("search_result_id", this.f135206F, AbstractC59233c.AbstractC59234a.f135177a);
            if (TextUtils.isEmpty(this.f135208H)) {
                mo96790a("list_item_id", this.f135072aC, AbstractC59233c.AbstractC59234a.f135177a);
            } else {
                mo96790a("list_item_id", this.f135208H, AbstractC59233c.AbstractC59234a.f135177a);
                mo96790a("search_third_item_id", this.f135072aC, AbstractC59233c.AbstractC59234a.f135177a);
            }
            if (!TextUtils.isEmpty(this.f135107al)) {
                mo96786a("impr_id", this.f135107al);
            }
        }
        if (!TextUtils.isEmpty(this.f135207G)) {
            mo96790a("list_result_type", this.f135207G, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135173l)) {
            mo96786a("creation_id", this.f135173l);
        }
        if (TextUtils.equals(this.f135169h, "general_search") && (i = this.f135084aO) > 0) {
            float f = 1.0f;
            float f2 = (((float) this.f135069a) * 1.0f) / ((float) i);
            if (f2 <= 1.0f) {
                f = f2;
            }
            mo96790a("percentage", String.valueOf(f), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135228x)) {
            mo96786a("tab_name", this.f135228x);
        }
        if (!TextUtils.isEmpty(this.f135104ai)) {
            mo96786a("region", this.f135104ai);
        }
        if (!TextUtils.isEmpty(this.f135088aS)) {
            mo96786a("relation_tag", this.f135088aS);
        }
        if (this.f135092aW != 0) {
            mo96790a("is_media", new StringBuilder().append(this.f135092aW).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135093aX != 0) {
            mo96790a("is_history", new StringBuilder().append(this.f135093aX).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135090aU != -1) {
            mo96790a("is_fullscreen", new StringBuilder().append(this.f135090aU).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135094aY)) {
            mo96790a("eid", this.f135094aY, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135095aZ != 0) {
            mo96790a("from_tag_id", new StringBuilder().append(this.f135095aZ).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135105aj)) {
            mo96786a("tag_id", this.f135105aj);
        }
        if (!TextUtils.isEmpty(this.f135106ak)) {
            mo96786a("parent_tag_id", this.f135106ak);
        }
        if (!TextUtils.isEmpty(this.f135089aT)) {
            mo96786a("follow_status", this.f135089aT);
        }
        if ("compilation_detail".equals(this.f135169h)) {
            if ("from_mix_video".equals(this.f135103ah)) {
                mo96786a("page_type", "simple");
            } else {
                mo96786a("page_type", "complete");
            }
        }
        String str2 = this.f135107al;
        if (str2 != null) {
            mo96786a("impr_id", str2);
        }
        if ((TextUtils.equals(this.f135169h, "general_search") || TextUtils.equals(this.f135169h, "search_result") || TextUtils.equals(this.f135169h, "trending_page")) && !TextUtils.isEmpty(this.f135215O)) {
            mo96786a("search_id", this.f135215O);
        }
        if (!TextUtils.isEmpty(this.f135108am)) {
            Aweme b = AwemeService.m70060b().mo60684b(this.f135108am);
            mo96786a("feed_group_id", b.getAid());
            mo96786a("feed_author_id", b.getAuthorUid());
        }
        if (C51487e.m95905b() && this.f135123ba != 0) {
            mo96786a("is_avatar", C51487e.m95906c());
        }
        if (!TextUtils.isEmpty(this.f135109an)) {
            mo96786a("search_type", this.f135109an);
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f135124bb;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f135124bb.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.f135110ao)) {
            mo96786a("tag_line", this.f135110ao);
        }
        if (!TextUtils.isEmpty(this.f135111ap)) {
            mo96786a("music_id", this.f135111ap);
        }
        if (this.f135129bg == 1) {
            mo96786a("question_id", String.valueOf(this.f135130bh));
            mo96786a("qa_type", this.f135128bf);
            mo96786a("enter_from", this.f135169h);
            mo96788a(C50560y.m94792b("homepage_hot", this.f135099ad));
        }
        if (!TextUtils.isEmpty(this.f135115at) && (TextUtils.equals(this.f135115at, "click_comment_chain") || TextUtils.equals(this.f135115at, "click_comment_bubble") || TextUtils.equals(this.f135115at, "push"))) {
            mo96786a("comment_enter_method", this.f135115at);
            mo96786a("last_group_id", this.f135116au);
        } else if (!TextUtils.isEmpty(this.f135115at) && TextUtils.equals(this.f135115at, "notification_page")) {
            mo96786a("comment_enter_method", "notification");
            mo96786a("last_group_id", this.f135116au);
        } else if (!TextUtils.isEmpty(this.f135115at) && TextUtils.equals(this.f135115at, UGCMonitor.EVENT_COMMENT)) {
            mo96786a("comment_enter_method", "comment_panel");
            mo96786a("last_group_id", this.f135116au);
        }
        if (!TextUtils.isEmpty(this.f135126bd)) {
            mo96786a("playlist_id", this.f135126bd);
            if (!TextUtils.isEmpty(this.f135114as) && TextUtils.equals(this.f135169h, "playlist")) {
                mo96786a("search_id", this.f135114as);
                mo96785a("is_from_video", this.f135113ar);
            }
            if (TextUtils.equals(this.f135169h, "playlist")) {
                mo96786a("playlist_previous_page", this.f135117av);
                mo96786a("from_group_id", this.f135118aw);
            }
        }
        int i3 = this.f135071aB;
        if (i3 == 1) {
            mo96785a("is_from_playlist", i3);
        }
        if (!TextUtils.isEmpty(this.f135112aq)) {
            mo96786a("category_name", this.f135112aq);
        }
        mo96785a("is_long", this.f135127be);
        mo96785a("caption_length", this.f135121az);
        mo96785a("caption_return_count", this.f135070aA);
    }

    /* renamed from: a */
    public final C59224as mo96778a(String str) {
        this.f135169h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C59224as mo96776k(String str) {
        this.f135107al = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C59224as mo96771n(String str) {
        this.f135099ad = str;
        return this;
    }

    /* renamed from: o */
    public final C59224as mo96780o(String str) {
        this.f135173l = str;
        return this;
    }

    /* renamed from: a */
    public final C59224as mo96777a(float f) {
        try {
            this.f135075aF = String.valueOf(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: b */
    public final void mo96767b(Aweme aweme) {
        super.mo96767b(aweme);
        if (TextUtils.isEmpty(this.f135175n)) {
            this.f135175n = m108853b(aweme, 1);
        }
    }

    /* renamed from: f */
    public final C59224as mo96749g(Aweme aweme) {
        int i;
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135072aC = aweme.getAid();
            this.f135073aD = m108854c(aweme);
            this.f135077aH = C59208ac.m108776j(aweme);
            this.f135078aI = aweme.isImage();
            this.f135091aV = aweme.isForwardAweme() ? 1 : 0;
            this.f135079aJ = aweme.getRepostFromGroupId();
            this.f135080aK = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f135083aN = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.f135123ba = aweme.getMutualRelation().getMutualType();
            }
            this.f135085aP = C80580in.m139680a(aweme);
            this.f135086aQ = C59208ac.m108777k(aweme);
            this.f135087aR = C59208ac.m108778l(aweme);
            this.f135088aS = "";
            if (aweme.getVideo() != null) {
                i = aweme.getVideo().getDuration();
            } else {
                i = 0;
            }
            this.f135084aO = i;
            this.f135089aT = C59205aa.m108754a(aweme);
            this.f135203C = C59208ac.m108779m(aweme);
            this.f135204D = C59208ac.m108780n(aweme);
            if (TextUtils.isEmpty(this.f135229y)) {
                this.f135229y = m108853b(aweme, 1);
            }
            this.f135124bb = aweme.getRelationRecommendInfo();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.f135125bc = 1;
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.f135126bd = aweme.playlist_info.getMixId();
            }
            C80409eu.m139391a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.f135127be = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.f135127be = 1;
            }
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
                Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InteractStickerStruct next = it.next();
                    if (next.getQaStruct() != null) {
                        this.f135129bg = 1;
                        this.f135130bh = Long.valueOf(next.getQaStruct().getQuestionId());
                        if (!TextUtils.equals(aweme.getAid(), String.valueOf(next.getQaStruct().getItemId()))) {
                            this.f135128bf = "answer";
                        } else {
                            this.f135128bf = "question";
                        }
                    }
                }
            }
        }
        return this;
    }
}
