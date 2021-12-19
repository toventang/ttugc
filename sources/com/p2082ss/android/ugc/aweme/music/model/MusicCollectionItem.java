package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.music.p3465b.p3467b.AbstractC60713a;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCollectionItem */
public class MusicCollectionItem implements AbstractC60713a {
    @AbstractC27891c(mo46611a = "aweme_cover")
    public UrlModel awemeCover;
    @AbstractC27891c(mo46611a = "cover")
    public UrlModel cover;
    @AbstractC27891c(mo46611a = "is_hot")
    public boolean isHot;
    @AbstractC27891c(mo46611a = "level")
    public int level;
    @AbstractC27891c(mo46611a = "id_str")
    public String mcId;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String mcName;
    @AbstractC27891c(mo46611a = "share_info")
    public ShareInfo shareInfo;

    static {
        Covode.recordClassIndex(71404);
    }
}
