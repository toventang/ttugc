package com.bytedance.android.livesdk.service.p625c.p628c;

import android.net.Uri;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.c.c */
public final class C10730c {

    /* renamed from: a */
    public static final C10730c f25849a = new C10730c();

    private C10730c() {
    }

    static {
        Covode.recordClassIndex(12327);
    }

    /* renamed from: a */
    public static final void m19321a() {
        HashMap hashMap = new HashMap();
        hashMap.put("cache", String.valueOf(m19323b()));
        hashMap.put("tag", "ttlive_sdk");
        hashMap.put("gift_icon_prefetch", String.valueOf(LivePrefetchGiftImageSetting.INSTANCE.getValue()));
        C6501b.C6502a.m13948a("ttlive_gift_icon_cache_hit").mo12652a((Map<String, String>) hashMap).mo12655b();
        C3868c.m9491a("ttlive_gift_icon_cache_hit", 0, hashMap);
    }

    /* renamed from: b */
    private static float m19323b() {
        GiftManager inst = GiftManager.inst();
        C89219l.m154716b(inst, "");
        List<GiftPage> giftPageList = inst.getGiftPageList();
        if (giftPageList != null && giftPageList.size() > 0) {
            float f = 0.0f;
            float f2 = 0.0f;
            for (GiftPage giftPage : giftPageList) {
                List<C9904t> list = giftPage.gifts;
                if (list != null && list.size() > 0) {
                    for (C9904t tVar : list) {
                        f2 += 1.0f;
                        C89219l.m154716b(tVar, "");
                        if (tVar.f23997b != null && tVar.f23997b.mUrls != null && tVar.f23997b.mUrls.size() > 0 && C3941k.m9612a(Uri.parse(tVar.f23997b.mUrls.get(0)))) {
                            f += 1.0f;
                        }
                    }
                }
            }
            if (f2 != 0.0f) {
                return f / f2;
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static final void m19322a(long j, long j2, String str) {
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        hashMap.put("time", String.valueOf(j));
        hashMap.put("tag", "ttlive_sdk");
        hashMap.put("gift_id", String.valueOf(j2));
        hashMap.put("gift_icon_url", str);
        C3868c.m9489a("ttlive_gift_icon_download_time", 0, j, hashMap);
        C6501b.C6502a.m13948a("ttlive_gift_icon_download_time").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
    }
}
