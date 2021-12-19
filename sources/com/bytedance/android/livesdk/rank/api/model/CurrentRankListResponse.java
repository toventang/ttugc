package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class CurrentRankListResponse {
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "music_wave")
    public String musicWave;
    @AbstractC27891c(mo46611a = "ranks")
    public List<C10354h> ranks;
    @AbstractC27891c(mo46611a = "seats")
    public List<C10354h> seats;
    @AbstractC27891c(mo46611a = "self_info")
    public C10354h selfInfo;
    @AbstractC27891c(mo46611a = "total")
    public long total;

    static {
        Covode.recordClassIndex(11913);
    }
}
