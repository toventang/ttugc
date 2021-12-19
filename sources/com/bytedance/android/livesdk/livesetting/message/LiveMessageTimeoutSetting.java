package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9527al;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class LiveMessageTimeoutSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9527al DEFAULT = new C9527al();
    public static final LiveMessageTimeoutSetting INSTANCE = new LiveMessageTimeoutSetting();
    private static final AbstractC89244h settingValue$delegate = C89250i.m154773a((AbstractC89171a) C9330a.f22784a);

    private final C9527al getSettingValue() {
        return (C9527al) settingValue$delegate.getValue();
    }

    private LiveMessageTimeoutSetting() {
    }

    public final long getHttpFetchMonitorTimeout() {
        return getSettingValue().f23125a;
    }

    public final long getHttpFetchRequestTimeout() {
        return getSettingValue().f23126b;
    }

    public final long getWsConnectTimeout() {
        return getSettingValue().f23127c;
    }

    /* renamed from: com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting$a */
    static final class C9330a extends AbstractC89220m implements AbstractC89171a<C9527al> {

        /* renamed from: a */
        public static final C9330a f22784a = new C9330a();

        static {
            Covode.recordClassIndex(10549);
        }

        C9330a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9527al invoke() {
            Object valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveMessageTimeoutSetting.class);
            if (valueSafely != null) {
                return valueSafely;
            }
            LiveMessageTimeoutSetting liveMessageTimeoutSetting = LiveMessageTimeoutSetting.INSTANCE;
            return LiveMessageTimeoutSetting.DEFAULT;
        }
    }

    static {
        Covode.recordClassIndex(10548);
    }
}
