package emotes.model;

import com.bytedance.android.live.base.model.emoji.C2974c;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class SubEmoteDetailResult {
    @AbstractC27891c(mo46611a = "current_emote_detail")
    EmoteListResult currentEmoteDetail;
    @AbstractC27891c(mo46611a = "current_status")
    int currentState;
    @AbstractC27891c(mo46611a = "emote_config")
    C2974c emoteConfig;
    @AbstractC27891c(mo46611a = "stable_emote_detail")
    EmoteListResult stableEmoteDetail;

    static {
        Covode.recordClassIndex(104427);
    }

    public EmoteListResult getCurrentEmoteDetail() {
        return this.currentEmoteDetail;
    }

    public int getCurrentState() {
        return this.currentState;
    }

    public C2974c getEmoteConfig() {
        return this.emoteConfig;
    }

    public EmoteListResult getStableEmoteDetail() {
        return this.stableEmoteDetail;
    }

    public void setCurrentEmoteDetail(EmoteListResult emoteListResult) {
        this.currentEmoteDetail = emoteListResult;
    }

    public void setCurrentState(int i) {
        this.currentState = i;
    }

    public void setEmoteConfig(C2974c cVar) {
        this.emoteConfig = cVar;
    }

    public void setStableEmoteDetail(EmoteListResult emoteListResult) {
        this.stableEmoteDetail = emoteListResult;
    }
}
