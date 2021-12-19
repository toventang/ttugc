package com.bytedance.android.live.broadcast.p199h;

import com.bytedance.android.live.broadcast.stream.p207c.AbstractC3686a;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.broadcast.h.b */
public class C3244b implements AbstractC3686a {

    /* renamed from: a */
    public AbstractC3243a f9297a;

    /* renamed from: b */
    private Room f9298b;

    /* renamed from: c */
    private AbstractC88412b f9299c;

    static {
        Covode.recordClassIndex(3725);
    }

    /* renamed from: a */
    public final void mo8581a() {
        AbstractC88412b bVar = this.f9299c;
        if (bVar != null && !bVar.isDisposed()) {
            this.f9299c.dispose();
        }
    }

    public C3244b(Room room) {
        this.f9298b = room;
    }

    @Override // com.bytedance.android.live.broadcast.stream.p207c.AbstractC3686a
    /* renamed from: a */
    public final void mo8582a(int i, int i2) {
        this.f9299c = C3719d.C3720a.m9229a().mo9041c().sendStatus(this.f9298b.getId(), i, this.f9298b.getStreamId(), i2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3245c(this), new C3246d(this));
    }
}
