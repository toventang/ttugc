package com.p2082ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.base.utils.C34721g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.g */
public class C75445g implements Serializable {
    @AbstractC27891c(mo46611a = "avatar_thumb")
    public UrlModel avatarThumb;
    @AbstractC27891c(mo46611a = "challenge_guide")
    public C75440b challengeGuide;
    @AbstractC27891c(mo46611a = "children")
    public List<String> children;
    @AbstractC27891c(mo46611a = "commerce_sticker")
    public C75441c commerceSticker;
    @AbstractC27891c(mo46611a = "desc")
    public String desc;
    @AbstractC27891c(mo46611a = "effect_id")
    public String effectId;
    @AbstractC27891c(mo46611a = "effect_source")
    public int effectSource;
    @AbstractC27891c(mo46611a = "effect_creator_type")
    public int effectType;
    @AbstractC27891c(mo46611a = "extra")
    public String extra;
    @AbstractC27891c(mo46611a = "icon_url")
    public UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public String f169545id;
    @AbstractC27891c(mo46611a = "is_favorite")
    public boolean isFavorite;
    @AbstractC27891c(mo46611a = "linked_anchors")
    public List<C75443e> linkedAnchors;
    public boolean mIsSelect;
    @AbstractC27891c(mo46611a = "sec_uid")
    public String mSecUid;
    @AbstractC27891c(mo46611a = "tags")
    public List<String> mTags;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27891c(mo46611a = "owner_id")
    public String ownerId;
    @AbstractC27891c(mo46611a = "owner_nickname")
    public String ownerName;
    @AbstractC27891c(mo46611a = "owner_verified_type")
    public int ownerVerifiedType;
    @AbstractC27891c(mo46611a = "related_aweme")
    public Aweme relatedAweme;
    @AbstractC27891c(mo46611a = "share_info")
    public ShareInfo shareInfo = new ShareInfo();
    @AbstractC27891c(mo46611a = "user_count")
    public long userCount;
    @AbstractC27891c(mo46611a = "vv_count")
    public long viewCount;

    static {
        Covode.recordClassIndex(88366);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f169545id});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C34721g.m70920a(this.f169545id, ((C75445g) obj).f169545id);
    }
}
