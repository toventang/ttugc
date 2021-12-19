package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.c.g */
public class C9703g {
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: a */
    public ImageModel f23670a;

    /* renamed from: b */
    public EnumC9705b f23671b = EnumC9705b.NetWork;

    /* renamed from: c */
    public EnumC9704a f23672c = EnumC9704a.NONE;

    static {
        Covode.recordClassIndex(11245);
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.c.g$a */
    public enum EnumC9704a {
        NONE,
        OTHER;

        static {
            Covode.recordClassIndex(11246);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.c.g$b */
    public enum EnumC9705b {
        Local,
        NetWork;

        static {
            Covode.recordClassIndex(11247);
        }
    }
}
