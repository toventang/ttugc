package emotes.api;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import emotes.model.SubEmoteDetailResult;
import p4560f.p4561a.AbstractC88979t;

public interface EmoteApi {
    static {
        Covode.recordClassIndex(104405);
    }

    @AbstractC22000h(mo35789a = "/webcast/sub/privilege/get_sub_emote_detail/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.ROOM)
    AbstractC88979t<C5832d<SubEmoteDetailResult>> getEmotesDetail(@AbstractC22018z(mo35807a = "for_anchor") boolean z, @AbstractC22018z(mo35807a = "sec_anchor_id") String str);
}
