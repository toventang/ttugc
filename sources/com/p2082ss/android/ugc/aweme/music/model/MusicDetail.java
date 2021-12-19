package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicDetail */
public class MusicDetail extends BaseResponse {
    @AbstractC27891c(mo46611a = "billboard_type")
    public int billboardType;
    @AbstractC27891c(mo46611a = "bind_commerce_challenge")
    public boolean bindCommerceChallenge;
    @AbstractC27891c(mo46611a = "edition_uid")
    public int editionUid;
    @AbstractC27891c(mo46611a = "music_info")
    public Music music;
    @AbstractC27891c(mo46611a = "rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @AbstractC27891c(mo46611a = "similar_music_ids")
    public List<String> similarMusicIds;
    @AbstractC27891c(mo46611a = "top_bodydance_avatars")
    public List<UrlModel> topBodydanceAvatars;

    static {
        Covode.recordClassIndex(71406);
    }
}
