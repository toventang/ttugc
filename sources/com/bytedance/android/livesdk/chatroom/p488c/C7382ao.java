package com.bytedance.android.livesdk.chatroom.p488c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.ao */
public class C7382ao {

    /* renamed from: a */
    public int f18297a;

    /* renamed from: b */
    public String f18298b;

    /* renamed from: c */
    public boolean f18299c;

    /* renamed from: d */
    public int f18300d;

    /* renamed from: e */
    public User f18301e;

    /* renamed from: f */
    public String f18302f;

    static {
        Covode.recordClassIndex(8149);
    }

    public C7382ao() {
        this(0, "");
    }

    public C7382ao(boolean z) {
        this(2, "", "", z);
    }

    public C7382ao(int i, String str) {
        this(i, str, "", false);
    }

    public C7382ao(String str, String str2) {
        this(1, str, str2, false);
        this.f18300d = 1;
    }

    private C7382ao(int i, String str, String str2, boolean z) {
        this.f18297a = i;
        this.f18298b = str;
        this.f18302f = str2;
        this.f18299c = z;
    }
}
