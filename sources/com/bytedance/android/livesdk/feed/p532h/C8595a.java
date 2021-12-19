package com.bytedance.android.livesdk.feed.p532h;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.android.livesdkapi.p691g.AbstractC11774m;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.h.a */
public final class C8595a extends AbstractC11768h implements AbstractC11774m {

    /* renamed from: a */
    private final List<EnterRoomConfig> f21243a = new ArrayList();

    /* renamed from: b */
    private final List<Room> f21244b = new ArrayList();

    static {
        Covode.recordClassIndex(9452);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final void mo14903b(int i) {
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final List<Room> mo14902b() {
        return this.f21244b;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14898a() {
        return this.f21243a.size();
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: c */
    public final void mo14905c() {
        super.mo14905c();
        this.f21243a.clear();
        this.f21244b.clear();
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14899a(EnterRoomConfig enterRoomConfig) {
        return this.f21243a.indexOf(enterRoomConfig);
    }

    public C8595a(List<Room> list) {
        m16832a(list);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final EnterRoomConfig mo14900a(int i) {
        return this.f21243a.get(i);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h, com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: c */
    public final Room mo14904c(int i) {
        if (i < 0 || i >= this.f21244b.size()) {
            return null;
        }
        return this.f21244b.get(i);
    }

    /* renamed from: a */
    private void m16832a(List<Room> list) {
        this.f21243a.clear();
        this.f21244b.clear();
        if (!C13617h.m24465a(list)) {
            this.f21244b.addAll(list);
            for (Room room : list) {
                this.f21243a.add(C11760a.m20718a(room, false));
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: a */
    public final void mo14901a(long j) {
        for (int i = 0; i < this.f21243a.size(); i++) {
            if (this.f21244b.get(i).getId() == j) {
                this.f21243a.remove(i);
                this.f21244b.remove(i);
                mo18715f();
                return;
            }
        }
    }
}
