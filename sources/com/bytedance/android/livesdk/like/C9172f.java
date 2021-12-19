package com.bytedance.android.livesdk.like;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.like.f */
public final /* synthetic */ class C9172f implements AbstractC89172b {

    /* renamed from: a */
    private final LikeHelper f22339a;

    /* renamed from: b */
    private final Room f22340b;

    /* renamed from: c */
    private final boolean f22341c;

    /* renamed from: d */
    private final boolean f22342d;

    /* renamed from: e */
    private final boolean f22343e;

    /* renamed from: f */
    private final DataChannel f22344f;

    static {
        Covode.recordClassIndex(10079);
    }

    C9172f(LikeHelper likeHelper, Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel) {
        this.f22339a = likeHelper;
        this.f22340b = room;
        this.f22341c = z;
        this.f22342d = z2;
        this.f22343e = z3;
        this.f22344f = dataChannel;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        return this.f22339a.mo15267a(this.f22340b, this.f22341c, this.f22342d, this.f22343e, this.f22344f, (Room) obj);
    }
}
