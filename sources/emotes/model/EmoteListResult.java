package emotes.model;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class EmoteListResult {
    @AbstractC27891c(mo46611a = "emote_list")
    List<EmoteModel> emoteList;

    static {
        Covode.recordClassIndex(104426);
    }

    public List<EmoteModel> getEmoteList() {
        return this.emoteList;
    }

    public void setEmoteList(List<EmoteModel> list) {
        this.emoteList = list;
    }
}
