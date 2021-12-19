package com.p2082ss.android.ugc.aweme.newfollow;

import android.content.Context;
import com.bytedance.android.livesdkapi.view.C11879g;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;

/* renamed from: com.ss.android.ugc.aweme.newfollow.a */
public final class C61493a {
    static {
        Covode.recordClassIndex(72150);
    }

    /* renamed from: a */
    public static TextureRenderView m111333a(Context context, LiveRoomStruct liveRoomStruct) {
        boolean z;
        if (liveRoomStruct == null || !liveRoomStruct.liveTypeAudio) {
            z = false;
        } else {
            z = true;
        }
        if (!((Boolean) LiveOuterService.m107269s().mo95830d().mo12981a("live_mt_live_card_opt_switch", (Object) true)).booleanValue() || z) {
            return new TextureRenderView(context);
        }
        return new C11879g(context);
    }
}
