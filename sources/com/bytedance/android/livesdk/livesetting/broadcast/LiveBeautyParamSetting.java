package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.C9522ai;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class LiveBeautyParamSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9522ai DEFAULT = new C9522ai();
    public static final LiveBeautyParamSetting INSTANCE = new LiveBeautyParamSetting();
    private static final AbstractC89244h settingValue$delegate = C89250i.m154773a((AbstractC89171a) C9323a.f22760a);

    private final C9522ai getSettingValue() {
        return (C9522ai) settingValue$delegate.getValue();
    }

    private LiveBeautyParamSetting() {
    }

    public final C9522ai getValue() {
        return getSettingValue();
    }

    /* renamed from: com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting$a */
    static final class C9323a extends AbstractC89220m implements AbstractC89171a<C9522ai> {

        /* renamed from: a */
        public static final C9323a f22760a = new C9323a();

        static {
            Covode.recordClassIndex(10282);
        }

        C9323a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9522ai invoke() {
            Object valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveBeautyParamSetting.class);
            if (valueSafely != null) {
                return valueSafely;
            }
            LiveBeautyParamSetting liveBeautyParamSetting = LiveBeautyParamSetting.INSTANCE;
            return LiveBeautyParamSetting.DEFAULT;
        }
    }

    static {
        Covode.recordClassIndex(10281);
    }

    public final float getBeautyParam() {
        return getSettingValue().f23102b.f23106a * getSettingValue().f23102b.f23107b;
    }

    public final float getBigEyesParam() {
        return getSettingValue().f23103c.f23106a * getSettingValue().f23103c.f23107b;
    }

    public final float getBrighteningParam() {
        return getSettingValue().f23101a.f23106a * getSettingValue().f23101a.f23107b;
    }

    public final float getLiftParam() {
        return getSettingValue().f23104d.f23106a * getSettingValue().f23104d.f23107b;
    }

    public final float getSharpParam() {
        return getSettingValue().f23105e.f23106a * getSettingValue().f23105e.f23107b;
    }
}
