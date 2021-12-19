package com.p2082ss.android.ugc.aweme.metrics;

import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50557v;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.follow.p3001e.C51078a;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.p3437a.C59204a;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80319cx;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.ap */
public class C59221ap extends AbstractC59242h<C59221ap> {

    /* renamed from: X */
    public String f134920X;

    /* renamed from: Y */
    public String f134921Y;

    /* renamed from: Z */
    public String f134922Z;

    /* renamed from: a */
    public String f134923a;

    /* renamed from: aA */
    private String f134924aA;

    /* renamed from: aB */
    private String f134925aB = "";

    /* renamed from: aC */
    private String f134926aC;

    /* renamed from: aD */
    private String f134927aD;

    /* renamed from: aE */
    private String f134928aE;

    /* renamed from: aF */
    private int f134929aF;

    /* renamed from: aG */
    private String f134930aG;

    /* renamed from: aH */
    private int f134931aH;

    /* renamed from: aI */
    private int f134932aI;

    /* renamed from: aJ */
    private boolean f134933aJ;

    /* renamed from: aK */
    private String f134934aK;

    /* renamed from: aL */
    private String f134935aL;

    /* renamed from: aM */
    private boolean f134936aM;

    /* renamed from: aN */
    private String f134937aN;

    /* renamed from: aO */
    private String f134938aO;

    /* renamed from: aP */
    private int f134939aP = -1;

    /* renamed from: aQ */
    private String f134940aQ;

    /* renamed from: aR */
    private String f134941aR;

    /* renamed from: aS */
    private String f134942aS;

    /* renamed from: aT */
    private String f134943aT;

    /* renamed from: aU */
    private String f134944aU;

    /* renamed from: aV */
    private String f134945aV;

    /* renamed from: aW */
    private String f134946aW;

    /* renamed from: aX */
    private boolean f134947aX;

    /* renamed from: aY */
    private String f134948aY;

    /* renamed from: aZ */
    private String f134949aZ;

    /* renamed from: aa */
    public String f134950aa;

    /* renamed from: ab */
    public String f134951ab;

    /* renamed from: ac */
    public boolean f134952ac;

    /* renamed from: ad */
    public String f134953ad;

    /* renamed from: ae */
    public int f134954ae;

    /* renamed from: af */
    public String f134955af;

    /* renamed from: ag */
    public boolean f134956ag;

    /* renamed from: ah */
    public String f134957ah;

    /* renamed from: ai */
    public String f134958ai = "";

    /* renamed from: aj */
    public String f134959aj = "";

    /* renamed from: ak */
    public String f134960ak = "";

    /* renamed from: al */
    public int f134961al = -1;

    /* renamed from: am */
    public String f134962am = "";

    /* renamed from: an */
    public String f134963an = "";

    /* renamed from: ao */
    public String f134964ao = "";

    /* renamed from: ap */
    public String f134965ap = "";

    /* renamed from: aq */
    public String f134966aq = "";

    /* renamed from: ar */
    public String f134967ar = "";

    /* renamed from: as */
    public int f134968as;

    /* renamed from: at */
    public int f134969at;

    /* renamed from: au */
    public int f134970au = 0;

    /* renamed from: av */
    private String f134971av;

    /* renamed from: aw */
    private String f134972aw;

    /* renamed from: ax */
    private String f134973ax;

    /* renamed from: ay */
    private String f134974ay = "0";

    /* renamed from: az */
    private Integer f134975az;

    /* renamed from: b */
    public String f134976b;

    /* renamed from: ba */
    private String f134977ba;

    /* renamed from: bb */
    private String f134978bb;

    /* renamed from: bc */
    private int f134979bc;

    /* renamed from: bd */
    private int f134980bd;

    /* renamed from: be */
    private String f134981be;

    /* renamed from: bf */
    private int f134982bf;

    /* renamed from: bg */
    private String f134983bg;

    /* renamed from: bh */
    private String f134984bh;

    /* renamed from: bi */
    private List<AnchorCommonStruct> f134985bi;

    /* renamed from: bj */
    private int f134986bj;

    /* renamed from: bk */
    private AwemeRelationRecommendModel f134987bk;

    /* renamed from: bl */
    private int f134988bl;

    /* renamed from: bm */
    private String f134989bm = "";

    /* renamed from: bn */
    private int f134990bn;

    /* renamed from: bo */
    private int f134991bo;

    /* renamed from: bp */
    private int f134992bp;

    /* renamed from: bq */
    private int f134993bq = 1;

    /* renamed from: br */
    private int f134994br = 1;

    /* renamed from: bs */
    private int f134995bs;

    /* renamed from: bt */
    private Boolean f134996bt = false;

    /* renamed from: bu */
    private Long f134997bu = 0L;

    /* renamed from: c */
    public String f134998c;

    /* renamed from: d */
    public boolean f134999d;

    /* renamed from: e */
    public String f135000e;

    /* renamed from: p */
    public int f135001p = 1;

    /* renamed from: q */
    public String f135002q;

    /* renamed from: r */
    public String f135003r;

    /* renamed from: s */
    protected String f135004s;

    /* renamed from: t */
    public String f135005t;

    /* renamed from: u */
    public String f135006u;

    /* renamed from: v */
    public String f135007v;

    static {
        Covode.recordClassIndex(69584);
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: j */
    public final String mo96770j() {
        return this.f134972aw;
    }

    /* renamed from: b */
    private void m108811b() {
        try {
            if (Settings.System.getInt(C17867d.m33078a().getContentResolver(), "accelerometer_rotation") == 0) {
                this.f134932aI = 0;
            } else {
                this.f134932aI = 1;
            }
        } catch (Throwable unused) {
        }
    }

    public C59221ap() {
        super("video_play");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        String str2;
        String str3;
        String str4;
        mo96785a("has_cla", this.f134994br);
        mo96785a("has_tts", this.f134993bq);
        mo96790a("author_id", this.f134973ax, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("group_id", this.f134972aw, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f134973ax, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("player_type", this.f134923a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("request_id", this.f135211K, AbstractC59233c.AbstractC59234a.f135178b);
        if (TextUtils.isEmpty(this.f135211K) && !TextUtils.isEmpty(this.f135210J)) {
            mo96790a("request_id", this.f135210J, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (!TextUtils.isEmpty(this.f135229y)) {
            mo96790a("order", this.f135229y, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("feed_count", this.f134926aC, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page", this.f134976b, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page_position", this.f134998c, AbstractC59233c.AbstractC59234a.f135177a);
        String str5 = "1";
        if (this.f134999d) {
            mo96790a("is_instructive", str5, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", str5, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("is_photo", this.f134974ay, AbstractC59233c.AbstractC59234a.f135177a);
        Integer num = this.f134975az;
        if (num != null) {
            mo96790a("detail", String.valueOf(num), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134925aB)) {
            mo96790a("is_auto_play", this.f134925aB, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134924aA)) {
            mo96790a("share_mode", "token", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("uid", this.f134924aA, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134937aN)) {
            mo96790a("district_code", this.f134937aN, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134938aO)) {
            mo96790a("sub_class", this.f134938aO, AbstractC59233c.AbstractC59234a.f135177a);
        }
        int i = this.f134939aP;
        if (i > 0) {
            mo96790a("rank_index", String.valueOf(i), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134927aD)) {
            mo96790a("enter_from_request", this.f134927aD, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (!TextUtils.isEmpty(this.f135000e)) {
            mo96790a("search_keyword", this.f135000e, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135206F)) {
            mo96790a("search_result_id", this.f135206F, AbstractC59233c.AbstractC59234a.f135177a);
            if (TextUtils.isEmpty(this.f135208H)) {
                mo96790a("list_item_id", this.f134972aw, AbstractC59233c.AbstractC59234a.f135177a);
            } else {
                mo96790a("list_item_id", this.f135208H, AbstractC59233c.AbstractC59234a.f135177a);
                mo96790a("search_third_item_id", this.f134972aw, AbstractC59233c.AbstractC59234a.f135177a);
            }
        }
        if (!TextUtils.isEmpty(this.f135207G)) {
            mo96790a("list_result_type", this.f135207G, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(this.f135211K);
            if (!TextUtils.isEmpty(this.f135210J)) {
                mo96794h(C59204a.m108753a(this.f135211K, this.f135210J));
            } else {
                mo96786a("impr_id", this.f135211K);
            }
        }
        if (!TextUtils.isEmpty(this.f135004s)) {
            mo96786a("video_type", this.f135004s);
        }
        List<AnchorCommonStruct> list = this.f134985bi;
        if (list != null && list.size() > 0 && this.f135169h.equalsIgnoreCase("anchor_detail")) {
            AnchorCommonStruct anchorCommonStruct = this.f134985bi.get(0);
            if (!TextUtils.isEmpty(anchorCommonStruct.getLogExtra())) {
                try {
                    JSONObject jSONObject = new JSONObject(anchorCommonStruct.getLogExtra());
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            mo96786a(next, (String) obj);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                mo96786a("anchor_type", "movie");
                mo96786a("anchor_entry", anchorCommonStruct.getKeyword());
            }
        }
        mo96785a("is_promoted", this.f134988bl);
        mo96785a("is_qa", this.f134990bn);
        mo96785a("is_cr", this.f134991bo);
        mo96785a("is_ad", this.f134992bp);
        if (this.f134990bn == 1) {
            mo96786a("question_id", String.valueOf(this.f134997bu));
            mo96786a("qa_type", this.f134989bm);
            mo96786a("enter_from", this.f135169h);
        }
        if (!TextUtils.isEmpty(this.f134928aE)) {
            mo96790a("account_type", this.f134928aE, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("is_bytevc1", String.valueOf(this.f134931aH), AbstractC59233c.AbstractC59234a.f135177a);
        if ("like".equals(this.f135003r) || "homepage_fresh".equalsIgnoreCase(this.f135169h) || "homepage_channel".equals(this.f135169h) || TextUtils.equals("homepage_fresh_topic", this.f135169h) || "homepage_fresh_search".equalsIgnoreCase(this.f135169h) || "ec_impressed_page".equalsIgnoreCase(this.f135169h) || "discovery".equals(this.f135169h) || "from_chat".equals(this.f134953ad) || this.f134990bn == 1) {
            mo96790a("enter_method", this.f135002q, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("content_source", this.f135003r, AbstractC59233c.AbstractC59234a.f135177a);
        if (C65724g.m117661a().mo104866a(this.f134972aw)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f134929aF != 0) {
            mo96790a("is_long_item", new StringBuilder().append(this.f134929aF).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135168g.get("enter_play_method") == null) {
            mo96790a("enter_play_method", "manul_play", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134921Y)) {
            mo96790a(this.f134921Y, this.f134922Z, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134920X)) {
            mo96790a("playlist_type", this.f134920X, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134950aa)) {
            mo96790a("rule_id", this.f134950aa, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134930aG)) {
            mo96790a("impr_type", this.f134930aG, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("is_auto_rotate", String.valueOf(this.f134932aI), AbstractC59233c.AbstractC59234a.f135177a);
        if (C39223a.m79601o().mo68703a()) {
            mo96790a("is_teen_mode", str5, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C59208ac.m108766b(this.f135169h)) {
            mo96790a("is_auto_play", C59209ad.m108781a(this.f134933aJ), AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("enter_fullscreen", String.valueOf(this.f135001p), AbstractC59233c.AbstractC59234a.f135177a);
            mo96786a("notice_type", C51078a.f117813a);
            mo96786a("show_cnt", String.valueOf(C51078a.f117814b));
            mo96786a("yellow_dot_logid", C51078a.f117815c);
        }
        if (!TextUtils.isEmpty(this.f134934aK)) {
            mo96790a("is_reposted", str5, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_group_id", this.f134934aK, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_user_id", this.f134935aL, AbstractC59233c.AbstractC59234a.f135177a);
            if (this.f134936aM) {
                str4 = str5;
            } else {
                str4 = "0";
            }
            mo96790a("is_text_empty", str4, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            if (this.f134947aX) {
                str3 = "follow";
            } else {
                str3 = "unfollow";
            }
            mo96786a("relation_type", str3);
            mo96786a("video_type", this.f134948aY);
            mo96786a("rec_uid", this.f134949aZ);
        }
        if (TextUtils.equals("challenge", this.f135169h)) {
            String str6 = this.f135005t;
            String str7 = this.f135006u;
            String str8 = this.f135007v;
            mo96786a("process_id", str6);
            mo96786a("tag_id", str8);
            mo96786a("rank_index", str7);
            mo96786a("tag_id", this.f135007v);
        }
        if ("from_chat".equals(this.f134953ad)) {
            if ("group_chat".equals(this.f135169h)) {
                str2 = "group";
            } else {
                str2 = "private";
            }
            mo96786a("chat_type", str2);
            mo96790a("enter_from", "chat", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals("single_song", this.f135169h)) {
            mo96786a("process_id", this.f135005t);
        }
        if (!TextUtils.isEmpty(this.f135228x)) {
            mo96786a("tab_name", this.f135228x);
        }
        C50557v.m94786a(this.f135169h, new C59222aq(this));
        if (!TextUtils.isEmpty(this.f134940aQ)) {
            mo96790a("compilation_id", this.f134940aQ, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134941aR)) {
            mo96790a("carrier_type", this.f134941aR, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134942aS)) {
            mo96790a("refer_seed_id", this.f134942aS, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134943aT)) {
            mo96790a("refer_seed_name", this.f134943aT, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134944aU)) {
            mo96790a("from_group_id", this.f134944aU, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134945aV)) {
            mo96790a("data_type", this.f134945aV, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134946aW)) {
            mo96786a("refer_commodity_id", this.f134946aW);
        }
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", str5);
        }
        if (this.f135201A.booleanValue()) {
            mo96786a("is_fullscreen", "0");
        }
        if (!TextUtils.isEmpty(this.f135173l)) {
            mo96786a("creation_id", this.f135173l);
        }
        if (!TextUtils.isEmpty(this.f134978bb)) {
            mo96786a("region", this.f134978bb);
        }
        mo96786a("play_order", String.valueOf(this.f134954ae));
        if (!TextUtils.isEmpty(this.f134977ba)) {
            mo96786a("relation_tag", this.f134977ba);
        }
        if (this.f134979bc != 0) {
            mo96790a("is_media", new StringBuilder().append(this.f134979bc).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f134980bd != 0) {
            mo96790a("is_history", new StringBuilder().append(this.f134980bd).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134981be)) {
            mo96790a("eid", this.f134981be, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f134982bf != 0) {
            mo96790a("from_tag_id", new StringBuilder().append(this.f134982bf).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134951ab)) {
            mo96786a("parent_tag_id", this.f134951ab);
        }
        mo96786a("is_highlighted", String.valueOf(this.f134952ac));
        if (!TextUtils.isEmpty(this.f134983bg)) {
            mo96786a("follow_status", this.f134983bg);
        }
        if ("compilation_detail".equals(this.f135169h)) {
            if ("from_mix_video".equals(this.f134953ad)) {
                mo96786a("page_type", "simple");
            } else {
                mo96786a("page_type", "complete");
            }
        }
        if (!TextUtils.isEmpty(this.f135210J)) {
            mo96786a("impr_id", this.f135210J);
        } else {
            mo96786a("impr_id", this.f135211K);
        }
        if ((TextUtils.equals(this.f135169h, "general_search") || TextUtils.equals(this.f135169h, "search_result") || TextUtils.equals(this.f135169h, "trending_page")) && !TextUtils.isEmpty(this.f135215O)) {
            mo96786a("search_id", this.f135215O);
        }
        if (!TextUtils.isEmpty(this.f134984bh)) {
            mo96786a("to_user_id", this.f134984bh);
        }
        if (!TextUtils.isEmpty(this.f134971av)) {
            mo96786a("content_type", this.f134971av);
        }
        if (!TextUtils.isEmpty(this.f134955af)) {
            mo96786a("music_id", this.f134955af);
        }
        if (!TextUtils.isEmpty(this.f134963an) && (TextUtils.equals(this.f134963an, "click_comment_chain") || TextUtils.equals(this.f134963an, "click_comment_bubble") || TextUtils.equals(this.f134963an, "push"))) {
            mo96786a("comment_enter_method", this.f134963an);
            mo96786a("last_group_id", this.f134964ao);
        } else if (!TextUtils.isEmpty(this.f134963an) && TextUtils.equals(this.f134963an, "notification_page")) {
            mo96786a("comment_enter_method", "notification");
            mo96786a("last_group_id", this.f134964ao);
        } else if (!TextUtils.isEmpty(this.f134963an) && TextUtils.equals(this.f134963an, UGCMonitor.EVENT_COMMENT)) {
            mo96786a("comment_enter_method", "comment_panel");
            mo96786a("last_group_id", this.f134964ao);
        }
        if (this.f134956ag) {
            str = str5;
        } else {
            str = "0";
        }
        mo96786a("ugc_to_pgc_meta", str);
        if (!TextUtils.isEmpty(this.f134957ah)) {
            mo96786a("search_type", this.f134957ah);
        }
        if (C51487e.m95905b() && this.f134986bj != 0) {
            mo96786a("is_avatar", C51487e.m95906c());
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f134987bk;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f134987bk.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.f134958ai)) {
            mo96786a("tag_line", this.f134958ai);
        }
        if (!TextUtils.isEmpty(this.f134959aj)) {
            mo96786a("playlist_id", this.f134959aj);
            if (!TextUtils.isEmpty(this.f134962am) && TextUtils.equals(this.f135169h, "playlist")) {
                mo96786a("search_id", this.f134962am);
                mo96785a("is_from_video", this.f134961al);
            }
            if (TextUtils.equals(this.f135169h, "playlist")) {
                mo96786a("playlist_previous_page", this.f134965ap);
                mo96786a("from_group_id", this.f134966aq);
            }
        }
        int i2 = this.f134970au;
        if (i2 == 1) {
            mo96785a("is_from_playlist", i2);
        }
        if (!TextUtils.isEmpty(this.f134960ak)) {
            mo96786a("category_name", this.f134960ak);
        }
        if (!TextUtils.isEmpty(this.f134967ar)) {
            mo96786a("news_id", this.f134967ar);
        }
        mo96785a("is_long", this.f134995bs);
        if (!this.f134996bt.booleanValue()) {
            str5 = "0";
        }
        mo96786a("is_giftable", str5);
        mo96785a("caption_length", this.f134968as);
        mo96785a("caption_return_count", this.f134969at);
    }

    /* renamed from: a */
    public final C59221ap mo96764a(String str) {
        this.f135169h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C59221ap mo96754m(String str) {
        this.f134967ar = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C59221ap mo96771n(String str) {
        this.f134944aU = str;
        return this;
    }

    /* renamed from: o */
    public final C59221ap mo96772o(String str) {
        this.f135004s = str;
        return this;
    }

    /* renamed from: a */
    public final C59221ap mo96765a(boolean z) {
        this.f134993bq = !z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public final C59221ap mo96766b(boolean z) {
        this.f134994br = !z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public final C59221ap mo96763a(C49812b bVar) {
        if (bVar != null) {
            this.f135173l = bVar.getCreationId();
        }
        return this;
    }

    /* renamed from: f */
    public final C59221ap mo96749g(Aweme aweme) {
        super.mo96749g(aweme);
        if (aweme != null) {
            m108812h(aweme);
            this.f135211K = C59208ac.m108763b(aweme);
        }
        m108811b();
        return this;
    }

    public C59221ap(String str) {
        super(str);
        this.f135172k = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: b */
    public final void mo96767b(Aweme aweme) {
        super.mo96767b(aweme);
        if (TextUtils.isEmpty(this.f135175n)) {
            this.f135175n = m108853b(aweme, 1);
        }
    }

    /* renamed from: h */
    private void m108812h(Aweme aweme) {
        String str;
        if (aweme != null) {
            this.f134971av = aweme.getLiveType();
            this.f134972aw = aweme.getAid();
            this.f134973ax = m108854c(aweme);
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            this.f134974ay = str;
            this.f134933aJ = aweme.isImage();
            this.f134930aG = C59208ac.m108776j(aweme);
            this.f134934aK = aweme.getRepostFromGroupId();
            this.f134935aL = aweme.getRepostFromUserId();
            this.f134936aM = C80319cx.m139241a(aweme);
            if (aweme.getMixInfo() != null) {
                this.f134940aQ = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.f134986bj = aweme.getMutualRelation().getMutualType();
            }
            this.f134947aX = C80580in.m139680a(aweme);
            this.f134948aY = C59208ac.m108777k(aweme);
            this.f134949aZ = C59208ac.m108778l(aweme);
            this.f134977ba = "";
            this.f134983bg = C59205aa.m108754a(aweme);
            this.f135203C = C59208ac.m108779m(aweme);
            this.f135204D = C59208ac.m108780n(aweme);
            this.f134987bk = aweme.getRelationRecommendInfo();
            this.f134992bp = aweme.isAd() ? 1 : 0;
            this.f134996bt = Boolean.valueOf(aweme.getAllowGift());
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.f134988bl = 1;
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
                        this.f134990bn = 1;
                        this.f134997bu = Long.valueOf(next.getQaStruct().getQuestionId());
                        if (!TextUtils.equals(aweme.getAid(), String.valueOf(next.getQaStruct().getItemId()))) {
                            this.f134989bm = "answer";
                        } else {
                            this.f134989bm = "question";
                        }
                    }
                }
            }
            if (this.f135221U.getTextExtra() != null && this.f135221U.getTextExtra().size() > 0) {
                Iterator<TextExtraStruct> it2 = this.f135221U.getTextExtra().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().getSubtype() == 2) {
                            this.f134991bo = 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C80409eu.m139391a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.f134995bs = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.f134995bs = 1;
            }
        }
    }

    /* renamed from: c */
    public final C59221ap mo96768c(Aweme aweme, int i) {
        super.mo96749g(aweme);
        if (aweme != null) {
            m108812h(aweme);
            this.f135211K = m108852a(aweme, i);
            this.f135229y = m108853b(aweme, i);
            if (TextUtils.isEmpty(this.f135229y)) {
                this.f135229y = m108853b(aweme, 1);
            }
            this.f134926aC = String.valueOf(aweme.getFeedCount());
            if (aweme.getAnchors() != null) {
                this.f134985bi = aweme.getAnchors();
            }
        }
        m108811b();
        return this;
    }
}
