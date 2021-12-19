package com.bytedance.android.livesdk.list;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.list.h */
public final class C9284h extends AbstractC11768h {

    /* renamed from: a */
    private EnterRoomConfig f22688a;

    /* renamed from: b */
    private List<Room> f22689b = new ArrayList();

    static {
        Covode.recordClassIndex(10202);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14898a() {
        return 1;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14899a(EnterRoomConfig enterRoomConfig) {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: a */
    public final void mo14901a(long j) {
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final void mo14903b(int i) {
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h, com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: c */
    public final Room mo14904c(int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final List<Room> mo14902b() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: d */
    public final List<Room> mo15379d() {
        return this.f22689b;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final EnterRoomConfig mo14900a(int i) {
        return this.f22688a;
    }

    public C9284h(EnterRoomConfig enterRoomConfig) {
        this.f22688a = enterRoomConfig == null ? new EnterRoomConfig() : enterRoomConfig;
    }
}
