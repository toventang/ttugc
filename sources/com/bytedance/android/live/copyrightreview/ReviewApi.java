package com.bytedance.android.live.copyrightreview;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.model.message.C9629az;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface ReviewApi {
    static {
        Covode.recordClassIndex(4342);
    }

    @AbstractC22000h(mo35789a = "/webcast/review/notification_confirm")
    AbstractC88979t<C5832d<C9629az>> confirmCopyright(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "confirm_type") int i, @AbstractC22018z(mo35807a = "confirm_value") int i2);

    @AbstractC22000h(mo35789a = "/webcast/review/notify_of_confirm_copyright/")
    AbstractC88979t<C5832d<Void>> notifyOfConfirmCopyright(@AbstractC22018z(mo35807a = "room_id") long j);
}
