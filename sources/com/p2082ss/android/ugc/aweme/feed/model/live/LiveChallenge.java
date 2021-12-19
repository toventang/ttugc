package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveChallenge */
public class LiveChallenge {
    @AbstractC27891c(mo46611a = "cha_name")
    public String challengeName;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "cid")
    public String cid;
    @AbstractC27891c(mo46611a = "is_commerce")
    public boolean isCommerce;
    @AbstractC27891c(mo46611a = "schema")
    public String schema;
    @AbstractC27891c(mo46611a = "sub_type")
    public int subType;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(58795);
    }

    public Challenge toAwemeChallenge() {
        Challenge challenge = new Challenge();
        challenge.setCid(this.cid);
        challenge.setChallengeName(this.challengeName);
        challenge.setSchema(this.schema);
        challenge.setType(this.type);
        challenge.setSubType(this.subType);
        return challenge;
    }
}
