package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9531ao;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class LiveUplinkStrategySetting {
    @Group(isDefault = true, value = "default group")
    private static final C9531ao DEFAULT = new C9531ao();
    public static final LiveUplinkStrategySetting INSTANCE = new LiveUplinkStrategySetting();
    private static final AbstractC89244h settingValue$delegate = C89250i.m154773a((AbstractC89171a) C9331a.f22785a);

    private final C9531ao getSettingValue() {
        return (C9531ao) settingValue$delegate.getValue();
    }

    private LiveUplinkStrategySetting() {
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>>, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> */
    public final Map<String, Map<String, Long>> getUplinkApiAllowedList() {
        return getSettingValue().f23135d;
    }

    public final long getWsUplinkWaitTimeout() {
        return getSettingValue().f23134c;
    }

    public final boolean supportUplink() {
        return getSettingValue().f23132a;
    }

    public final boolean supportHttpUplink() {
        if (getSettingValue().f23133b == 0) {
            return true;
        }
        return false;
    }

    public final boolean supportWSUplink() {
        if (getSettingValue().f23133b != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting$a */
    static final class C9331a extends AbstractC89220m implements AbstractC89171a<C9531ao> {

        /* renamed from: a */
        public static final C9331a f22785a = new C9331a();

        static {
            Covode.recordClassIndex(10554);
        }

        C9331a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9531ao invoke() {
            Object valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveUplinkStrategySetting.class);
            if (valueSafely != null) {
                return valueSafely;
            }
            LiveUplinkStrategySetting liveUplinkStrategySetting = LiveUplinkStrategySetting.INSTANCE;
            return LiveUplinkStrategySetting.DEFAULT;
        }
    }

    static {
        Covode.recordClassIndex(10553);
    }
}
