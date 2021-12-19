package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.utils.C34721g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42365g;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.discover.model.SearchOperationInfo;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.h */
public class C42411h extends AbstractC61496a {

    /* renamed from: a */
    public String f98791a;
    @AbstractC27891c(mo46611a = "user_list")

    /* renamed from: b */
    public List<SearchUser> f98792b;
    @AbstractC27891c(mo46611a = "music_list")

    /* renamed from: c */
    public List<Music> f98793c;
    @AbstractC27891c(mo46611a = "challenge_list")

    /* renamed from: d */
    public List<SearchChallenge> f98794d;
    @AbstractC27891c(mo46611a = "has_top_user")

    /* renamed from: e */
    public boolean f98795e;
    @AbstractC27891c(mo46611a = "related_word_list")

    /* renamed from: f */
    public List<C42365g> f98796f;
    @AbstractC27891c(mo46611a = "card_info")

    /* renamed from: g */
    public C42410g f98797g;
    @AbstractC27891c(mo46611a = "dynamic_patch")

    /* renamed from: h */
    public C42345d f98798h;
    @AbstractC27891c(mo46611a = "feature_account_title")

    /* renamed from: i */
    String f98799i;
    @AbstractC27891c(mo46611a = "card_title")

    /* renamed from: j */
    String f98800j;
    @AbstractC27891c(mo46611a = "activity_info")

    /* renamed from: k */
    public SearchOperationInfo f98801k;
    @AbstractC27891c(mo46611a = "view_more")

    /* renamed from: l */
    public boolean f98802l = true;
    @AbstractC27891c(mo46611a = "words_query_record")

    /* renamed from: m */
    public RecommendWordMob f98803m;
    @AbstractC27891c(mo46611a = "hotspot_info")

    /* renamed from: n */
    public C42435q f98804n;
    @AbstractC27891c(mo46611a = "collection_live")

    /* renamed from: o */
    public C42321c f98805o;

    /* renamed from: p */
    public int f98806p = -1;

    /* renamed from: q */
    public LogPbBean f98807q;

    /* renamed from: r */
    public transient boolean f98808r;

    /* renamed from: s */
    public transient boolean f98809s;

    /* renamed from: t */
    public transient int f98810t;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: u */
    private int f98811u;
    @AbstractC27891c(mo46611a = "aweme_info")

    /* renamed from: v */
    private Aweme f98812v;

    static {
        Covode.recordClassIndex(50356);
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public Aweme getAweme() {
        return this.f98812v;
    }

    /* renamed from: a */
    public final boolean mo71599a() {
        if (this.f98811u == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo71600b() {
        if (TextUtils.isEmpty(this.f98800j)) {
            return "";
        }
        return this.f98800j;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public int getFeedType() {
        int i = this.f98811u;
        if (i == 1) {
            return 65280;
        }
        if (i == 2) {
            return 65456;
        }
        if (i == 3) {
            return 65457;
        }
        if (i == 4) {
            return 65458;
        }
        if (i == 6) {
            return 1048336;
        }
        if (i == 12) {
            return 65467;
        }
        if (i == 46) {
            return 65515;
        }
        if (i != 998) {
            if (i != 999) {
                return i;
            }
            return 65514;
        } else if (this.f98797g != null) {
            return 998;
        } else {
            return -1;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.f98811u * 31;
        Aweme aweme = this.f98812v;
        int i11 = 0;
        if (aweme != null) {
            i = aweme.hashCode();
        } else {
            i = 0;
        }
        int i12 = (i10 + i) * 31;
        List<SearchUser> list = this.f98792b;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 31;
        List<Music> list2 = this.f98793c;
        if (list2 != null) {
            i3 = list2.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        List<SearchChallenge> list3 = this.f98794d;
        if (list3 != null) {
            i4 = list3.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        List<C42365g> list4 = this.f98796f;
        if (list4 != null) {
            i5 = list4.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        C42345d dVar = this.f98798h;
        if (dVar != null) {
            i6 = dVar.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 31;
        String str = this.f98799i;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        C42410g gVar = this.f98797g;
        if (gVar != null) {
            i8 = gVar.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        C42435q qVar = this.f98804n;
        if (qVar != null) {
            i9 = qVar.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        C42321c cVar = this.f98805o;
        if (cVar != null) {
            i11 = cVar.hashCode();
        }
        return i20 + i11;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public void setAweme(Aweme aweme) {
        this.f98812v = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public void setFeedType(int i) {
        this.f98811u = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d, com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public void setRequestId(String str) {
        super.setRequestId(str);
        Aweme aweme = this.f98812v;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42411h)) {
            return false;
        }
        C42411h hVar = (C42411h) obj;
        if (this.f98811u == hVar.f98811u && C34721g.m70920a(this.f98812v, hVar.f98812v) && C34721g.m70920a(this.f98792b, hVar.f98792b) && C34721g.m70920a(this.f98793c, hVar.f98793c) && C34721g.m70920a(this.f98794d, hVar.f98794d) && C34721g.m70920a(this.f98796f, hVar.f98796f) && C34721g.m70920a(this.f98798h, hVar.f98798h) && C34721g.m70920a(this.f98799i, hVar.f98799i) && C34721g.m70920a(this.f98804n, hVar.f98804n)) {
            return C34721g.m70920a(this.f98805o, hVar.f98805o);
        }
        return false;
    }
}
