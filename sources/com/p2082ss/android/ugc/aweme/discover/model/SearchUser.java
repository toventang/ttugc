package com.p2082ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67397b;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchUser */
public class SearchUser {
    @AbstractC27891c(mo46611a = "ad_item")
    public Aweme adItem;
    @AbstractC27891c(mo46611a = "items")
    public List<Aweme> awemeCards;
    @AbstractC27891c(mo46611a = "challenges")
    public List<Challenge> challengeList;
    @AbstractC27891c(mo46611a = "dynamic_patch")
    public C42345d dynamicPatch;
    @AbstractC27891c(mo46611a = "effects")
    public List<NewFaceSticker> effectCards;
    public LogPbBean logPb;
    public GlobalDoodleConfig mGlobalDoodleConfig;
    @AbstractC27891c(mo46611a = "mix_cursor")
    public Long mixCursor;
    @AbstractC27891c(mo46611a = "mix_has_more")
    public Boolean mixHasMore;
    @AbstractC27891c(mo46611a = "musics")
    public List<Music> musicCards;
    @AbstractC27891c(mo46611a = "mix_list")
    public List<C59867d> playlists;
    @AbstractC27891c(mo46611a = "position")
    public List<Position> position;
    @AbstractC27891c(mo46611a = "product")
    public C67397b productGroup;
    public int rank;
    @AbstractC27891c(mo46611a = "remark_position")
    public List<Position> remarkPosition;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "uniqid_position")
    public List<Position> uniqidPosition;
    @AbstractC27891c(mo46611a = "user_info")
    public User user;

    static {
        Covode.recordClassIndex(50525);
    }

    public boolean isDynamicCard() {
        if (this.dynamicPatch != null) {
            return true;
        }
        return false;
    }

    public int getType() {
        if (isDynamicCard()) {
            return 999;
        }
        return 0;
    }

    public boolean isAladdin() {
        if (cardType() != 0) {
            return true;
        }
        return false;
    }

    public boolean isStar() {
        if (this.awemeCards == null && this.musicCards == null) {
            return false;
        }
        return true;
    }

    public int cardType() {
        if (!C13603b.m24435a((Collection) this.awemeCards)) {
            return 1;
        }
        if (!C13603b.m24435a((Collection) this.musicCards)) {
            return 2;
        }
        if (!C13603b.m24435a((Collection) this.effectCards)) {
            return 3;
        }
        return 0;
    }

    public boolean hasMedia() {
        C67397b bVar;
        if (!C13603b.m24435a((Collection) this.awemeCards) || !C13603b.m24435a((Collection) this.musicCards) || !C13603b.m24435a((Collection) this.effectCards) || ((bVar = this.productGroup) != null && !C13603b.m24435a((Collection) bVar.f151002b))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        C42345d dVar = this.dynamicPatch;
        int i2 = 0;
        if (dVar != null) {
            i = dVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 0) * 6;
        User user2 = this.user;
        if (!(user2 == null || user2.getUid() == null)) {
            i2 = this.user.getUid().hashCode();
        }
        return i3 + i2;
    }

    public SearchUser setUser(User user2) {
        this.user = user2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUser)) {
            return false;
        }
        SearchUser searchUser = (SearchUser) obj;
        if (!equals(this.dynamicPatch, searchUser.dynamicPatch)) {
            return false;
        }
        User user2 = this.user;
        if (user2 == null || searchUser.user == null) {
            return equals(user2, searchUser.user);
        }
        return TextUtils.equals(user2.getUid(), searchUser.user.getUid());
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
