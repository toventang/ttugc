package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi */
public interface RecommendMusicApi {
    static {
        Covode.recordClassIndex(97453);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/music/detail/")
    AbstractC88979t<SimpleMusic> getMusicDetail(@AbstractC89736t(mo144292a = "music_id") String str);

    @AbstractC89722f(mo144276a = "/tiktok/v1/music/recommend/effect/")
    AbstractC88979t<RecommendMusic> getRecommendMusic(@AbstractC89736t(mo144292a = "effect_id") String str);
}
