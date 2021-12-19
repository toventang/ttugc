package com.bytedance.android.live.liveinteract.match.p295b.p299d;

import com.bytedance.android.livesdk.live.model.BattleResource;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleAnimationUrlSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.d.b */
public final class C4962b {

    /* renamed from: a */
    public static final C4962b f12938a = new C4962b();

    private C4962b() {
    }

    static {
        Covode.recordClassIndex(5545);
    }

    /* renamed from: a */
    public static final BattleResource m11162a() {
        BattleResource value = LiveInteractBattleAnimationUrlSetting.INSTANCE.getValue();
        if (value == null) {
            return BattleResource.C9299a.m17574a();
        }
        return value;
    }
}
