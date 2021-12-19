package com.bytedance.android.livesdk.model.message.p580d.p581a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.d.a.a */
public class C9746a {
    @AbstractC27891c(mo46611a = "from_user_id")

    /* renamed from: a */
    public long f23726a;
    @AbstractC27891c(mo46611a = "to_user_id")

    /* renamed from: b */
    public long f23727b;
    @AbstractC27891c(mo46611a = "cancel_type")

    /* renamed from: c */
    public int f23728c;

    static {
        Covode.recordClassIndex(11288);
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.d.a.a$a */
    public enum EnumC9747a {
        TYPE_UNKNOWN(-1),
        INVITE_CANCEL(0),
        APPLY_CANCEL(1);
        
        public int code;

        static {
            Covode.recordClassIndex(11289);
        }

        private EnumC9747a(int i) {
            this.code = i;
        }
    }
}
