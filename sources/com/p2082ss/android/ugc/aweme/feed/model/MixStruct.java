package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.C67356c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.MixStruct */
public class MixStruct implements Serializable {
    @AbstractC27891c(mo46611a = "author")
    public User author;
    @AbstractC27891c(mo46611a = "auto_mix_author_info")
    public C67356c autoMixAuthorInfo;
    @AbstractC27891c(mo46611a = "cover_url")
    public UrlModel cover;
    @AbstractC27891c(mo46611a = "create_time")
    public long createTime;
    @AbstractC27891c(mo46611a = "desc")
    public String desc;
    @AbstractC27891c(mo46611a = "extra")
    public String extra;
    @AbstractC27891c(mo46611a = "icon_url")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "mix_id")
    public String mixId;
    @AbstractC27891c(mo46611a = "mix_name")
    public String mixName;
    @AbstractC27891c(mo46611a = "mix_type")
    public int mixType;
    @AbstractC27891c(mo46611a = "share_info")
    public ShareInfo shareInfo;
    @AbstractC27891c(mo46611a = "statis")
    public MixStatisStruct statis;
    @AbstractC27891c(mo46611a = "status")
    public MixStatusStruct status;
    @AbstractC27891c(mo46611a = "update_time")
    public long updateTime;

    static {
        Covode.recordClassIndex(58729);
    }
}
