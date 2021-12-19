package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bi */
public class C9676bi {
    @AbstractC27891c(mo46611a = "question_id")

    /* renamed from: a */
    public long f23546a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: b */
    public String f23547b;
    @AbstractC27891c(mo46611a = "answer_status")

    /* renamed from: c */
    public int f23548c;
    @AbstractC27891c(mo46611a = "create_time")

    /* renamed from: d */
    public long f23549d;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: e */
    public User f23550e;

    static {
        Covode.recordClassIndex(11218);
    }

    public C9676bi() {
    }

    public C9676bi(String str, int i, User user) {
        this.f23546a = 0;
        this.f23547b = str;
        this.f23548c = i;
        this.f23549d = 0;
        this.f23550e = user;
    }
}
