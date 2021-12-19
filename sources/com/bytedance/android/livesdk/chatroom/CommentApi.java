package com.bytedance.android.livesdk.chatroom;

import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.C7682d;
import com.bytedance.android.livesdk.chatroom.model.ChatExtra;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;

public interface CommentApi {
    static {
        Covode.recordClassIndex(8009);
    }

    @AbstractC22012t(mo35799a = "/webcast/screen_chat/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Barrage>> sendBarrage(@AbstractC21998f HashMap<String, String> hashMap);

    @AbstractC22012t(mo35799a = "/webcast/room/emote_chat/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C7682d>> sendEmote(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "emote_id_list") String str);

    @AbstractC22012t(mo35799a = "/webcast/room/chat/")
    @AbstractC21999g
    AbstractC88979t<C5830b<ChatResult, ChatExtra>> sendTextMessage(@AbstractC21998f HashMap<String, String> hashMap);
}
