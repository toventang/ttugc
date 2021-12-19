package com.bytedance.android.livesdk.chatroom.p492g;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p425aa.C6538d;
import com.bytedance.android.livesdk.p425aa.p428c.C6523c;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p561j.C9056bv;
import com.bytedance.android.livesdk.p561j.C9059by;
import com.bytedance.android.livesdk.p561j.C9060bz;
import com.bytedance.android.livesdk.p561j.C9062ca;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.k */
public final class C7589k {
    static {
        Covode.recordClassIndex(8362);
    }

    /* renamed from: a */
    public static boolean m15600a(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && enterRoomConfig.f28232b.f28279w > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m15602b(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null || !enterRoomConfig.f28233c.f28298O) {
            return "";
        }
        String str = enterRoomConfig.f28233c.f28284A;
        if (!C13627m.m24498a(str)) {
            return str;
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m15601a(DataChannel dataChannel) {
        if (dataChannel == null || !((Boolean) dataChannel.mo28318b(C9059by.class)).booleanValue() || !((Boolean) dataChannel.mo28318b(C9076co.class)).booleanValue() || !TextUtils.equals("message", (CharSequence) dataChannel.mo28318b(C9060bz.class))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m15603b(DataChannel dataChannel) {
        if (dataChannel == null || !((Boolean) dataChannel.mo28318b(C9059by.class)).booleanValue() || !((Boolean) dataChannel.mo28318b(C9076co.class)).booleanValue() || !TextUtils.equals("homepage_hot", (CharSequence) dataChannel.mo28318b(C9060bz.class))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m15604c(DataChannel dataChannel) {
        if (dataChannel == null || !((Boolean) dataChannel.mo28318b(C9059by.class)).booleanValue() || !((Boolean) dataChannel.mo28318b(C9076co.class)).booleanValue() || !TextUtils.equals("referral_task", (CharSequence) dataChannel.mo28318b(C9060bz.class))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static EnterRoomConfig m15598a(EnterRoomConfig enterRoomConfig, DataChannel dataChannel) {
        if (dataChannel != null && ((Boolean) dataChannel.mo28318b(C9059by.class)).booleanValue()) {
            enterRoomConfig.f28233c.f28298O = ((Boolean) dataChannel.mo28318b(C9059by.class)).booleanValue();
            enterRoomConfig.f28233c.f28299P = (String) dataChannel.mo28318b(C9060bz.class);
            enterRoomConfig.f28233c.f28307X = (String) dataChannel.mo28318b(C9056bv.class);
            enterRoomConfig.f28233c.f28306W = "full_screen";
            enterRoomConfig.f28233c.f28284A = (String) dataChannel.mo28318b(C9062ca.class);
        }
        return enterRoomConfig;
    }

    /* renamed from: a */
    public static void m15599a(boolean z, EnterRoomConfig enterRoomConfig) {
        String str;
        C6523c cVar;
        if (C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28298O) {
            if (!z || C13627m.m24498a(enterRoomConfig.f28233c.f28306W)) {
                str = "full_screen";
            } else {
                str = enterRoomConfig.f28233c.f28306W;
            }
            C6538d.m13981c(str);
            if (enterRoomConfig.f28233c.f28324ae != -1) {
                Long valueOf = Long.valueOf(enterRoomConfig.f28233c.f28324ae);
                C6529h b = C6538d.m13978b();
                if (b != null && (cVar = b.f16312d) != null) {
                    cVar.f16269g = valueOf;
                }
            }
        }
    }
}
