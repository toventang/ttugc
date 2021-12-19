package com.bytedance.android.livesdkapi.p691g;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.AbstractC11765f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdkapi.g.h */
public abstract class AbstractC11768h implements AbstractC11765f {

    /* renamed from: a */
    private final Set<AbstractC11765f.AbstractC11766a> f28124a = new HashSet();

    static {
        Covode.recordClassIndex(13458);
    }

    /* renamed from: a */
    public abstract void mo14901a(long j);

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public void mo15389a(Room room) {
    }

    /* renamed from: b */
    public String mo15376b(long j) {
        return "";
    }

    /* renamed from: b */
    public abstract List<Room> mo14902b();

    /* renamed from: b */
    public abstract void mo14903b(int i);

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: c */
    public abstract Room mo14904c(int i);

    /* renamed from: c */
    public void mo14905c() {
        this.f28124a.clear();
    }

    /* renamed from: d */
    public List<Room> mo15379d() {
        return new ArrayList();
    }

    /* renamed from: f */
    public final void mo18715f() {
        for (AbstractC11765f.AbstractC11766a aVar : this.f28124a) {
            aVar.mo13623c();
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final void mo18711a(AbstractC11765f.AbstractC11766a aVar) {
        this.f28124a.add(aVar);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: b */
    public final void mo18712b(AbstractC11765f.AbstractC11766a aVar) {
        this.f28124a.remove(aVar);
    }
}
