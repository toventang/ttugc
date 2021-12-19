package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.feed.model.Extra;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.AwemeSearchMusicList */
public class AwemeSearchMusicList {
    @AbstractC27891c(mo46611a = "query_correct_info")
    public MusicSearchCorrectInfo correctInfo;
    @AbstractC27891c(mo46611a = "cursor")
    public int cursor;
    @AbstractC27891c(mo46611a = "extra")
    public Extra extra;
    @AbstractC27891c(mo46611a = "global_doodle_config")
    public GlobalDoodleConfig globalDoodleConfig;
    @AbstractC27891c(mo46611a = "has_more")
    int hasMore;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "music_info_list")
    public List<SearchMusic> searchMusicList;

    static {
        Covode.recordClassIndex(71392);
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }
}
