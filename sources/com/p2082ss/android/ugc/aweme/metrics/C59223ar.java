package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.follow.p3001e.C51078a;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.p3437a.C59204a;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.metrics.ar */
public class C59223ar extends AbstractC59242h<C59223ar> {

    /* renamed from: X */
    public int f135009X = 1;

    /* renamed from: Y */
    public boolean f135010Y;

    /* renamed from: Z */
    public String f135011Z;

    /* renamed from: a */
    public String f135012a;

    /* renamed from: aA */
    private String f135013aA;

    /* renamed from: aB */
    private String f135014aB;

    /* renamed from: aC */
    private String f135015aC;

    /* renamed from: aD */
    private boolean f135016aD;

    /* renamed from: aE */
    private String f135017aE;

    /* renamed from: aF */
    private String f135018aF;

    /* renamed from: aG */
    private String f135019aG;

    /* renamed from: aH */
    private int f135020aH;

    /* renamed from: aI */
    private AwemeRelationRecommendModel f135021aI;

    /* renamed from: aJ */
    private int f135022aJ;

    /* renamed from: aK */
    private String f135023aK = "";

    /* renamed from: aL */
    private int f135024aL;

    /* renamed from: aM */
    private String f135025aM = "";

    /* renamed from: aN */
    private String f135026aN = "";

    /* renamed from: aO */
    private int f135027aO;

    /* renamed from: aP */
    private Long f135028aP = 0L;

    /* renamed from: aa */
    public String f135029aa;

    /* renamed from: ab */
    public String f135030ab;

    /* renamed from: ac */
    public String f135031ac;

    /* renamed from: ad */
    public String f135032ad;

    /* renamed from: ae */
    protected int f135033ae;

    /* renamed from: af */
    public String f135034af;

    /* renamed from: ag */
    public String f135035ag = "";

    /* renamed from: ah */
    public String f135036ah;

    /* renamed from: ai */
    public String f135037ai = "";

    /* renamed from: aj */
    public int f135038aj = -1;

    /* renamed from: ak */
    public String f135039ak = "";

    /* renamed from: al */
    public String f135040al = "";

    /* renamed from: am */
    public String f135041am = "";

    /* renamed from: an */
    public String f135042an = "";

    /* renamed from: ao */
    public String f135043ao = "";

    /* renamed from: ap */
    public String f135044ap = "";

    /* renamed from: aq */
    public int f135045aq = 0;

    /* renamed from: ar */
    public int f135046ar = 0;

    /* renamed from: as */
    public String f135047as = "";

    /* renamed from: at */
    public int f135048at = 0;

    /* renamed from: au */
    private String f135049au = "";

    /* renamed from: av */
    private int f135050av;

    /* renamed from: aw */
    private String f135051aw;

    /* renamed from: ax */
    private boolean f135052ax;

    /* renamed from: ay */
    private String f135053ay;

    /* renamed from: az */
    private String f135054az;

    /* renamed from: b */
    public String f135055b;

    /* renamed from: c */
    public String f135056c;

    /* renamed from: d */
    public String f135057d;

    /* renamed from: e */
    public String f135058e;

    /* renamed from: p */
    public String f135059p;

    /* renamed from: q */
    public String f135060q;

    /* renamed from: r */
    public String f135061r;

    /* renamed from: s */
    public String f135062s;

    /* renamed from: t */
    public String f135063t;

    /* renamed from: u */
    public boolean f135064u;

    /* renamed from: v */
    public String f135065v;

    static {
        Covode.recordClassIndex(69586);
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: j */
    public final String mo96770j() {
        return this.f135012a;
    }

    public C59223ar() {
        super("video_play_finish");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        mo96790a("group_id", this.f135012a, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135055b, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("request_id", this.f135056c, AbstractC59233c.AbstractC59234a.f135178b);
        if (TextUtils.isEmpty(this.f135056c) && !TextUtils.isEmpty(this.f135031ac)) {
            mo96790a("request_id", this.f135031ac, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (!TextUtils.isEmpty(this.f135049au)) {
            mo96790a("is_auto_play", this.f135049au, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135013aA)) {
            mo96790a("district_code", this.f135013aA, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135014aB)) {
            mo96790a("sub_class", this.f135014aB, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96787a("is_highlighted", this.f135010Y);
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(C59204a.m108753a(this.f135056c, this.f135031ac));
            if (!TextUtils.isEmpty(this.f135031ac)) {
                mo96786a("impr_id", this.f135031ac);
            } else {
                mo96786a("impr_id", this.f135056c);
            }
        }
        if ("like".equals(this.f135058e) || "discovery".equals(this.f135169h) || this.f135027aO == 1) {
            mo96790a("enter_method", this.f135057d, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("content_source", this.f135058e, AbstractC59233c.AbstractC59234a.f135177a);
        if (C65724g.m117661a().mo104866a(this.f135012a)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        } else {
            mo96790a("previous_page", this.f135062s, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("previous_page_position", this.f135063t, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135064u) {
            mo96790a("is_instructive", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135050av != 0) {
            mo96790a("is_long_item", new StringBuilder().append(this.f135050av).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135060q)) {
            mo96790a(this.f135060q, this.f135061r, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135059p)) {
            mo96790a("playlist_type", this.f135059p, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135065v)) {
            mo96790a("video_type", this.f135065v, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96785a("is_promoted", this.f135022aJ);
        if (!TextUtils.isEmpty(this.f135051aw)) {
            mo96790a("impr_type", this.f135051aw, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C39223a.m79601o().mo68703a()) {
            mo96790a("is_teen_mode", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C59208ac.m108766b(this.f135169h)) {
            mo96790a("is_auto_play", C59209ad.m108781a(this.f135052ax), AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("enter_fullscreen", String.valueOf(this.f135009X), AbstractC59233c.AbstractC59234a.f135177a);
            mo96786a("notice_type", C51078a.f117813a);
            mo96785a("show_cnt", C51078a.f117814b);
            mo96786a("yellow_dot_logid", C51078a.f117815c);
        }
        if (!TextUtils.isEmpty(this.f135053ay)) {
            mo96790a("is_reposted", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_group_id", this.f135053ay, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_user_id", this.f135054az, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            if (this.f135016aD) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo96786a("relation_type", str);
            mo96786a("video_type", this.f135017aE);
            mo96786a("rec_uid", this.f135018aF);
        }
        if (!TextUtils.isEmpty(this.f135015aC)) {
            mo96790a("compilation_id", this.f135015aC, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        if (this.f135201A.booleanValue()) {
            mo96786a("is_fullscreen", "0");
        }
        String str2 = this.f135169h;
        String str3 = this.f135011Z;
        String str4 = this.f135029aa;
        String str5 = this.f135030ab;
        if (TextUtils.equals("challenge", str2)) {
            mo96786a("process_id", str3);
            mo96786a("tag_id", str5);
            mo96786a("rank_index", str4);
        }
        if (TextUtils.equals("single_song", this.f135169h)) {
            mo96786a("process_id", this.f135011Z);
        }
        if (!TextUtils.isEmpty(this.f135032ad)) {
            mo96790a("search_keyword", this.f135032ad, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135206F)) {
            mo96790a("search_result_id", this.f135206F, AbstractC59233c.AbstractC59234a.f135177a);
            if (TextUtils.isEmpty(this.f135208H)) {
                mo96790a("list_item_id", this.f135012a, AbstractC59233c.AbstractC59234a.f135177a);
            } else {
                mo96790a("list_item_id", this.f135208H, AbstractC59233c.AbstractC59234a.f135177a);
                mo96790a("search_third_item_id", this.f135012a, AbstractC59233c.AbstractC59234a.f135177a);
            }
        }
        if (!TextUtils.isEmpty(this.f135173l)) {
            mo96786a("creation_id", this.f135173l);
        }
        if (!TextUtils.isEmpty(this.f135019aG)) {
            mo96786a("follow_status", this.f135019aG);
        }
        if (!TextUtils.isEmpty(this.f135031ac)) {
            mo96786a("impr_id", this.f135031ac);
        }
        if ((TextUtils.equals(this.f135169h, "general_search") || TextUtils.equals(this.f135169h, "search_result") || TextUtils.equals(this.f135169h, "trending_page")) && !TextUtils.isEmpty(this.f135215O)) {
            mo96786a("search_id", this.f135215O);
        }
        if (C51487e.m95905b() && this.f135020aH != 0) {
            mo96786a("is_avatar", C51487e.m95906c());
        }
        mo96786a("relation_tag", new StringBuilder().append(this.f135033ae).toString());
        if (!TextUtils.isEmpty(this.f135034af)) {
            mo96786a("search_type", this.f135034af);
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f135021aI;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f135021aI.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.f135035ag)) {
            mo96786a("tag_line", this.f135035ag);
        }
        if (!TextUtils.isEmpty(this.f135036ah)) {
            mo96786a("music_id", this.f135036ah);
        }
        if (!TextUtils.isEmpty(this.f135047as)) {
            mo96786a("news_id", this.f135047as);
        }
        if (this.f135027aO == 1) {
            mo96786a("question_id", String.valueOf(this.f135028aP));
            mo96786a("qa_type", this.f135026aN);
            mo96786a("enter_from", this.f135169h);
        }
        if (!TextUtils.isEmpty(this.f135040al) && (TextUtils.equals(this.f135040al, "click_comment_chain") || TextUtils.equals(this.f135040al, "click_comment_bubble") || TextUtils.equals(this.f135040al, "push"))) {
            mo96786a("comment_enter_method", this.f135040al);
            mo96786a("last_group_id", this.f135041am);
        } else if (!TextUtils.isEmpty(this.f135040al) && TextUtils.equals(this.f135040al, "notification_page")) {
            mo96786a("comment_enter_method", "notification");
            mo96786a("last_group_id", this.f135041am);
        } else if (!TextUtils.isEmpty(this.f135040al) && TextUtils.equals(this.f135040al, UGCMonitor.EVENT_COMMENT)) {
            mo96786a("comment_enter_method", "comment_panel");
            mo96786a("last_group_id", this.f135041am);
        }
        if (!TextUtils.isEmpty(this.f135023aK)) {
            mo96786a("playlist_id", this.f135023aK);
            if (!TextUtils.isEmpty(this.f135039ak) && TextUtils.equals(this.f135169h, "playlist")) {
                mo96786a("search_id", this.f135039ak);
                mo96785a("is_from_video", this.f135038aj);
            }
            if (TextUtils.equals(this.f135169h, "playlist")) {
                mo96786a("playlist_previous_page", this.f135042an);
                mo96786a("from_group_id", this.f135025aM);
            }
        }
        if (!TextUtils.isEmpty(this.f135037ai)) {
            mo96786a("category_name", this.f135037ai);
        }
        int i = this.f135048at;
        if (i == 1) {
            mo96785a("is_from_playlist", i);
        }
        mo96785a("is_long", this.f135024aL);
        mo96785a("is_ad", C37699a.m76314s(this.f135221U) ? 1 : 0);
        mo96785a("is_splash", C37699a.m76204G(this.f135221U) ? 1 : 0);
        mo96786a("has_cla", this.f135044ap);
        mo96786a("has_tts", this.f135043ao);
        mo96785a("caption_length", this.f135046ar);
        mo96785a("caption_return_count", this.f135045aq);
    }

    /* renamed from: a */
    public final C59223ar mo96774a(String str) {
        this.f135169h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C59223ar mo96776k(String str) {
        this.f135031ac = str;
        return this;
    }

    /* renamed from: a */
    public final C59223ar mo96773a(C49812b bVar) {
        if (bVar != null) {
            this.f135173l = bVar.getCreationId();
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
    public final C59223ar mo96749g(Aweme aweme) {
        int i;
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135012a = aweme.getAid();
            this.f135055b = m108854c(aweme);
            this.f135056c = C59208ac.m108763b(aweme);
            this.f135051aw = C59208ac.m108776j(aweme);
            this.f135052ax = aweme.isImage();
            this.f135053ay = aweme.getRepostFromGroupId();
            this.f135054az = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f135015aC = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.f135020aH = aweme.getMutualRelation().getMutualType();
            }
            this.f135016aD = C80580in.m139680a(aweme);
            this.f135017aE = C59208ac.m108777k(aweme);
            this.f135018aF = C59208ac.m108778l(aweme);
            this.f135019aG = C59205aa.m108754a(aweme);
            this.f135203C = C59208ac.m108779m(aweme);
            this.f135204D = C59208ac.m108780n(aweme);
            if (aweme.getAuthor() != null) {
                i = aweme.getAuthor().getFollowStatus();
            } else {
                i = -2;
            }
            this.f135033ae = i;
            if (TextUtils.isEmpty(this.f135229y)) {
                this.f135229y = m108853b(aweme, 1);
            }
            this.f135021aI = aweme.getRelationRecommendInfo();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.f135022aJ = 1;
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.f135023aK = aweme.playlist_info.getMixId();
            }
            C80409eu.m139391a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.f135024aL = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.f135024aL = 1;
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
                        this.f135027aO = 1;
                        this.f135028aP = Long.valueOf(next.getQaStruct().getQuestionId());
                        if (!TextUtils.equals(aweme.getAid(), String.valueOf(next.getQaStruct().getItemId()))) {
                            this.f135026aN = "answer";
                        } else {
                            this.f135026aN = "question";
                        }
                    }
                }
            }
        }
        return this;
    }
}
