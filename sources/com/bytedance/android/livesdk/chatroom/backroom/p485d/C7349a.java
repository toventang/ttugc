package com.bytedance.android.livesdk.chatroom.backroom.p485d;

import com.bytedance.android.livesdk.livesetting.roomfunction.ReturnBackSettingsSetting;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.d.a */
public final class C7349a {

    /* renamed from: a */
    public static AbstractC11768h f18227a;

    /* renamed from: b */
    public static final C7349a f18228b = new C7349a();

    private C7349a() {
    }

    static {
        Covode.recordClassIndex(8113);
    }

    /* renamed from: a */
    public static boolean m15251a() {
        return ReturnBackSettingsSetting.INSTANCE.getValue().mo13893a();
    }

    /* renamed from: b */
    public static boolean m15252b() {
        if (ReturnBackSettingsSetting.INSTANCE.getValue().mo13894b() || ReturnBackSettingsSetting.INSTANCE.getValue().mo13896d()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m15253c() {
        if (ReturnBackSettingsSetting.INSTANCE.getValue().mo13895c() || ReturnBackSettingsSetting.INSTANCE.getValue().mo13896d()) {
            return true;
        }
        return false;
    }
}
