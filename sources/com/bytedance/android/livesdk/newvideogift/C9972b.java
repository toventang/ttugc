package com.bytedance.android.livesdk.newvideogift;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3957r;
import com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p425aa.C6559l;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11632d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58556b;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.newvideogift.b */
final /* synthetic */ class C9972b implements AbstractC11632d {

    /* renamed from: a */
    private final LiveNewVideoGiftWidget f24178a;

    static {
        Covode.recordClassIndex(11524);
    }

    C9972b(LiveNewVideoGiftWidget liveNewVideoGiftWidget) {
        this.f24178a = liveNewVideoGiftWidget;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11632d
    /* renamed from: a */
    public final void mo16761a(boolean z, String str, int i, int i2, String str2) {
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.f24178a;
        if (!z && C58556b.class.getSimpleName().equals(str)) {
            C6806c.m14603a((C6800c) AbstractC6804a.f16998bu, (Object) true);
        }
        LiveNewVideoGiftWidget.C9947b bVar = liveNewVideoGiftWidget.f24084f;
        long j = -1;
        String str3 = "";
        if (bVar.f24092a != null) {
            j = bVar.f24092a.getId();
            if (bVar.f24092a.getResourceModel() != null && !C3957r.m9644a(bVar.f24092a.getResourceModel().f21657b)) {
                str3 = bVar.f24092a.getResourceModel().f21657b.get(0);
            }
        }
        new C6559l().mo12692a("gift_id", Long.valueOf(j)).mo12692a("gift_resource", str3).mo12692a("extra", Integer.valueOf(i2)).mo12692a("code", Integer.valueOf(i)).mo12692a("error_info", str2).mo12693a("hotsoon_live_video_gift_play_success_rate", !z ? 1 : 0);
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "VIDEO_GIFT_PLAY_SUCCESS_RATE");
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_resource", str3);
        hashMap.put("extra", Integer.valueOf(i2));
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("error_info", str2);
        C6555i.m14021b().mo9215a("ttlive_gift", hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asset_id", Long.valueOf(j));
        hashMap2.put("url", str3);
        hashMap2.put("error_code", Integer.valueOf(i));
        hashMap2.put("error_msg", str2);
        hashMap2.put("asset_show_extra", Integer.valueOf(i2));
        hashMap2.put("gift_player_type", str);
        if (z) {
            C3868c.m9491a(C6542d.m13984a("ttlive_gift_asset_show_status"), 0, hashMap2);
            return;
        }
        C3868c.m9491a(C6542d.m13984a("ttlive_gift_asset_show_status"), 1, hashMap2);
        C3868c.m9491a(C6542d.m13985b("ttlive_gift_asset_show_status"), 1, hashMap2);
        C6499a.m13906a();
        C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_gift_asset_show_status", hashMap2);
    }
}
