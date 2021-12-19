package com.bytedance.android.live.liveinteract.multilive.api;

import com.bytedance.android.live.liveinteract.multilive.p360c.C5594g;
import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7678c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89391z;

public interface MultiLiveApi {

    /* renamed from: a */
    public static final C5584a f14223a = C5584a.f14224a;

    static {
        Covode.recordClassIndex(6180);
    }

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/list_by_type/")
    AbstractC88403ab<C5832d<C5594g>> getListByType(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2, @AbstractC22018z(mo35807a = "channel_id") long j3, @AbstractC22018z(mo35807a = "list_type") int i);

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    @AbstractC22012t(mo35799a = "/webcast/linkmic_audience/turn_off_invitation/")
    AbstractC88979t<C5832d<C89391z>> turnOffInvitation(@AbstractC21997e(mo35786a = "room_id") long j);

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    @AbstractC22012t(mo35799a = "/webcast/linkmic_audience/update_setting/")
    AbstractC88979t<C5832d<C7678c>> updateAnchorPanelSettings(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "channel_id") long j2, @AbstractC21997e(mo35786a = "live_id") long j3, @AbstractC21997e(mo35786a = "new_layout") int i, @AbstractC21997e(mo35786a = "new_fix_mic_num") int i2, @AbstractC21997e(mo35786a = "new_allow_request_from_user") int i3, @AbstractC21997e(mo35786a = "new_allow_request_from_follower_only") int i4);

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi$a */
    public static final class C5584a {

        /* renamed from: a */
        static final /* synthetic */ C5584a f14224a = new C5584a();

        private C5584a() {
        }

        static {
            Covode.recordClassIndex(6181);
        }
    }
}
