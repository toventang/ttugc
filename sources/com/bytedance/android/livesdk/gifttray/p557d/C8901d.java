package com.bytedance.android.livesdk.gifttray.p557d;

import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSelfTrayDisplayStrategySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayExpSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gifttray.d.d */
public final class C8901d {

    /* renamed from: a */
    public static final C8901d f21944a = new C8901d();

    private C8901d() {
    }

    static {
        Covode.recordClassIndex(9785);
    }

    /* renamed from: a */
    public static boolean m17250a(C8871a aVar) {
        boolean z;
        boolean z2;
        if (aVar == null) {
            return true;
        }
        if ((aVar.f21841f || LiveGiftTrayExpSetting.INSTANCE.getValue() <= 0) && LiveGiftTrayExpSetting.INSTANCE.getValue() != 3) {
            z = false;
        } else {
            z = true;
        }
        if (LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() == 0 || LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() == 2 || ((LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() == 1 || LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() == 3) && !aVar.f21842g)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!aVar.f21833A || !z2) && (aVar.f21833A || !z)) {
            return false;
        }
        return true;
    }
}
