package com.bytedance.android.livesdk.chatroom.p488c;

import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.q */
public class C7400q {

    /* renamed from: a */
    public int f18334a;

    /* renamed from: b */
    public int f18335b;

    /* renamed from: c */
    public Room f18336c;

    /* renamed from: d */
    public AbstractC6571a f18337d;

    static {
        Covode.recordClassIndex(8167);
    }

    public C7400q(int i) {
        this.f18334a = i;
    }

    public C7400q(Room room) {
        this.f18334a = 26;
        this.f18336c = room;
    }

    public C7400q(int i, byte b) {
        this.f18334a = 7;
        this.f18335b = i;
    }
}
