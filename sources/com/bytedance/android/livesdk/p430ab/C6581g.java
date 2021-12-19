package com.bytedance.android.livesdk.p430ab;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.p456as.AbstractC6864c;
import com.bytedance.android.livesdk.p456as.C6863b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: com.bytedance.android.livesdk.ab.g */
public final class C6581g {

    /* renamed from: a */
    private static final AbstractC6864c f16461a = new C6863b();

    static {
        Covode.recordClassIndex(7317);
    }

    /* renamed from: b */
    public static String m14076b(User user) {
        if (user == null) {
            return "";
        }
        return user.displayId;
    }

    /* renamed from: a */
    public static String m14075a(User user) {
        CharSequence a = f16461a.mo13135a((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class), user);
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        return a.toString();
    }
}
