package com.bytedance.android.live.broadcast.p192c.p193a;

import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdk.utils.p654b.C11232c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.c.a.q */
public final /* synthetic */ class RunnableC3212q implements Runnable {

    /* renamed from: a */
    private final long f9239a;

    static {
        Covode.recordClassIndex(3693);
    }

    RunnableC3212q(long j) {
        this.f9239a = j;
    }

    public final void run() {
        long j = this.f9239a;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        List<C9904t> stickerGifts = ((IGiftService) C6193a.m13435a(IGiftService.class)).getStickerGifts();
        if (stickerGifts.size() != 0) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            boolean z = true;
            HashMap hashMap = new HashMap();
            for (C9904t tVar : stickerGifts) {
                sb2.append(tVar.f23999d).append(",");
                if (((IGiftService) C6193a.m13435a(IGiftService.class)).getAssets("effects", tVar.f24009n) != null) {
                    sb3.append(tVar.f23999d).append(",");
                }
                if (((IGiftService) C6193a.m13435a(IGiftService.class)).isAssetsDownloaded("effects", tVar.f24009n)) {
                    if (z) {
                        sb.append(tVar.f23999d);
                        z = false;
                    } else {
                        sb.append(",").append(tVar.f23999d);
                    }
                }
            }
            hashMap.put("download_sticker_id", sb.toString());
            hashMap.put("all_sticker_id", sb2.toString());
            hashMap.put("asset_sticker_id", sb3.toString());
            hashMap.put("room_id", Long.valueOf(j));
            if (room != null) {
                hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
                hashMap.put("live_type", Integer.valueOf(room.getOrientation()));
            }
            C3868c.m9491a(C6542d.m13984a("service_sticker_gift_status"), 0, hashMap);
            ((C11231b) C3719d.C3720a.m9229a().mo9042d().reportFaceGift(j, sb.toString()).mo143271a(new C11191f()).mo143274a(new C11232c())).mo17979a(3).mo143254a(new C3213r(j, room), new C3214s(j, room));
        }
    }
}
