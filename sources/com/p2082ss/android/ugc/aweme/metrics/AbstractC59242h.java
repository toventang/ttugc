package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;

/* renamed from: com.ss.android.ugc.aweme.metrics.h */
public abstract class AbstractC59242h<E extends AbstractC59242h> extends AbstractC59233c {

    /* renamed from: A */
    protected Boolean f135201A = false;

    /* renamed from: B */
    protected String f135202B;

    /* renamed from: C */
    protected String f135203C;

    /* renamed from: D */
    protected String f135204D;

    /* renamed from: E */
    protected int f135205E = 0;

    /* renamed from: F */
    protected String f135206F;

    /* renamed from: G */
    protected String f135207G;

    /* renamed from: H */
    protected String f135208H;

    /* renamed from: I */
    protected String f135209I;

    /* renamed from: J */
    protected String f135210J;

    /* renamed from: K */
    protected String f135211K;

    /* renamed from: L */
    protected String f135212L;

    /* renamed from: M */
    protected String f135213M;

    /* renamed from: N */
    protected String f135214N;

    /* renamed from: O */
    protected String f135215O;

    /* renamed from: P */
    public String f135216P;

    /* renamed from: Q */
    public String f135217Q;

    /* renamed from: R */
    public String f135218R;

    /* renamed from: S */
    public String f135219S;

    /* renamed from: T */
    public String f135220T;

    /* renamed from: U */
    protected Aweme f135221U;

    /* renamed from: V */
    public int f135222V = -1;

    /* renamed from: W */
    public String f135223W = "";

    /* renamed from: a */
    private String f135224a;

    /* renamed from: b */
    private String f135225b = "";

    /* renamed from: c */
    private String f135226c = "";

    /* renamed from: w */
    protected String f135227w;

    /* renamed from: x */
    protected String f135228x;

    /* renamed from: y */
    protected String f135229y;

    /* renamed from: z */
    protected Boolean f135230z = false;

    static {
        Covode.recordClassIndex(69605);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo96770j() {
        return "";
    }

    /* renamed from: i */
    public final boolean mo96808i() {
        if (!TextUtils.equals(this.f135169h, "others_homepage") || TextUtils.isEmpty(this.f135215O)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo96806h() {
        if (TextUtils.equals(this.f135169h, "general_search") || TextUtils.equals(this.f135169h, "search_result") || TextUtils.equals(this.f135169h, "search_ecommerce") || TextUtils.equals(this.f135169h, "search_music") || mo96808i()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: d */
    public void mo96745d() {
        String str;
        if ("homepage_country".equals(this.f135169h) && !TextUtils.isEmpty(this.f135227w)) {
            mo96790a("country_name", this.f135227w, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (("others_homepage".equals(this.f135169h) || "collection_video".equals(this.f135169h) || "personal_homepage".equals(this.f135169h) || "playlist".equals(this.f135169h)) && !TextUtils.isEmpty(this.f135228x)) {
            mo96790a("tab_name", this.f135228x, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("order", this.f135229y, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel")) {
            C81469a.m141252a();
        }
        if (!TextUtils.isEmpty(this.f135170i)) {
            if (TextUtils.equals(this.f135169h, "homepage_fresh_topic") || this.f135171j) {
                mo96790a("topic_name", this.f135170i, AbstractC59233c.AbstractC59234a.f135177a);
            } else {
                mo96790a("trending_topic", this.f135170i, AbstractC59233c.AbstractC59234a.f135177a);
            }
        }
        if ("discovery_category".equals(this.f135169h) && !TextUtils.isEmpty(this.f135228x)) {
            mo96790a("discovery_category", this.f135228x, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("order", this.f135229y, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("enter_from", this.f135169h, AbstractC59233c.AbstractC59234a.f135177a);
        if (this.f135205E != 0) {
            mo96790a("topic_type", new StringBuilder().append(this.f135205E).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135212L)) {
            mo96786a("is_from_trending_card", this.f135212L);
        }
        if (!TextUtils.isEmpty(this.f135213M)) {
            mo96786a("trending_topic", this.f135213M);
        }
        if (!TextUtils.isEmpty(this.f135214N)) {
            mo96786a("trending_topic_id", this.f135214N);
        }
        if (TextUtils.equals(this.f135169h, "general_search")) {
            mo96786a("video_tag", this.f135174m);
        }
        if (mo96806h()) {
            mo96790a("rank", this.f135175n, AbstractC59233c.AbstractC59234a.f135177a);
            if (C41223i.f96336a) {
                str = "1";
            } else {
                str = "0";
            }
            mo96786a("is_fullscreen", str);
            if (!TextUtils.isEmpty(this.f135206F)) {
                mo96790a("search_result_id", this.f135206F, AbstractC59233c.AbstractC59234a.f135177a);
                if (TextUtils.isEmpty(this.f135208H)) {
                    mo96790a("list_item_id", mo96770j(), AbstractC59233c.AbstractC59234a.f135177a);
                } else {
                    mo96790a("list_item_id", this.f135208H, AbstractC59233c.AbstractC59234a.f135177a);
                }
            }
            if (!TextUtils.isEmpty(this.f135207G)) {
                mo96790a("list_result_type", this.f135207G, AbstractC59233c.AbstractC59234a.f135177a);
            }
            if (!TextUtils.isEmpty(this.f135209I)) {
                mo96790a("search_third_item_id", mo96770j(), AbstractC59233c.AbstractC59234a.f135177a);
            }
            if (!TextUtils.isEmpty(this.f135210J)) {
                mo96786a("impr_id", this.f135210J);
            } else {
                mo96786a("impr_id", this.f135211K);
            }
        }
        if (!TextUtils.isEmpty(this.f135215O)) {
            mo96786a("search_id", this.f135215O);
        }
        if (!TextUtils.isEmpty(this.f135216P)) {
            mo96786a("enter_from", this.f135216P);
        }
        if (!TextUtils.isEmpty(this.f135217Q)) {
            mo96786a("vs_entrance_type", this.f135217Q);
        }
        if (!TextUtils.isEmpty(this.f135218R)) {
            mo96786a("vs_session_id", this.f135218R);
        }
        if (!TextUtils.isEmpty(this.f135219S)) {
            mo96786a("result_id", this.f135219S);
        }
        if (!TextUtils.isEmpty(this.f135220T)) {
            mo96786a("vs_group_id", this.f135220T);
        }
        if (!TextUtils.isEmpty(this.f135224a)) {
            mo96786a("news_id", this.f135224a);
        }
        if (this.f135201A.booleanValue()) {
            mo96786a("is_fullscreen", "0");
        }
        if (!TextUtils.isEmpty(this.f135202B)) {
            mo96786a("is_pinned", this.f135202B);
        }
        if (TextUtils.equals(this.f135169h, "homepage_hot") || TextUtils.equals(this.f135169h, "homepage_follow")) {
            if (!TextUtils.isEmpty(this.f135203C)) {
                mo96790a("rec_type", this.f135203C, AbstractC59233c.AbstractC59234a.f135177a);
            }
            if (!TextUtils.isEmpty(this.f135204D)) {
                mo96790a("label_text", this.f135204D, AbstractC59233c.AbstractC59234a.f135177a);
            }
        }
        int i = this.f135222V;
        if (i >= 0) {
            mo96785a("follow_status", i);
        }
        if (!TextUtils.isEmpty(this.f135223W)) {
            mo96786a("story_type", this.f135223W);
        }
        if (!TextUtils.isEmpty(this.f135225b)) {
            mo96786a("story_collection_id", this.f135225b);
        }
        if (!TextUtils.isEmpty(this.f135226c)) {
            mo96786a("from_group_id", this.f135226c);
        }
    }

    /* renamed from: a */
    public final E mo96799a(Boolean bool) {
        this.f135230z = bool;
        return this;
    }

    /* renamed from: b */
    public final E mo96800b(Boolean bool) {
        this.f135201A = bool;
        return this;
    }

    /* renamed from: b_ */
    public E mo96752b_(String str) {
        this.f135225b = str;
        return this;
    }

    /* renamed from: c */
    public final E mo96801c(String str) {
        this.f135228x = str;
        return this;
    }

    /* renamed from: d */
    public final E mo96802d(String str) {
        this.f135229y = str;
        return this;
    }

    /* renamed from: e */
    public final E mo96803e(String str) {
        this.f135202B = str;
        return this;
    }

    /* renamed from: f */
    public final E mo96804f(String str) {
        this.f135206F = str;
        return this;
    }

    /* renamed from: g */
    public final E mo96805g(String str) {
        this.f135207G = str;
        return this;
    }

    /* renamed from: i */
    public final E mo96807i(String str) {
        this.f135208H = str;
        return this;
    }

    /* renamed from: j */
    public final E mo96809j(String str) {
        this.f135209I = str;
        return this;
    }

    /* renamed from: k */
    public E mo96776k(String str) {
        this.f135210J = str;
        return this;
    }

    /* renamed from: l */
    public final E mo96810l(String str) {
        this.f135215O = str;
        return this;
    }

    /* renamed from: m */
    public E mo96754m(String str) {
        this.f135224a = str;
        return this;
    }

    /* renamed from: n */
    public E mo96771n(String str) {
        this.f135226c = str;
        return this;
    }

    public AbstractC59242h(String str) {
        super(str);
    }

    /* renamed from: g */
    public E mo96749g(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getAuthor() != null) {
                this.f135227w = aweme.getAuthor().getRegion();
            }
            this.f135212L = aweme.isFromTrendingCard();
            this.f135213M = aweme.getTrendingName();
            this.f135214N = aweme.getTrendingId();
            this.f135221U = aweme;
        }
        mo96789a(aweme);
        mo96767b(aweme);
        return this;
    }
}
