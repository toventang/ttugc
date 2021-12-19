package com.bytedance.android.live.liveinteract.platform.p363a;

import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4432f;
import com.bytedance.android.live.liveinteract.cohost.p269b.C4598a;
import com.bytedance.android.live.liveinteract.multiguest.p323b.C5194a;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5647a;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5650b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC4432f(mo10206a = "LINKER_MANAGER")
/* renamed from: com.bytedance.android.live.liveinteract.platform.a.c */
public final class C5659c {

    /* renamed from: j */
    public static final C5660a f14381j = new C5660a((byte) 0);

    /* renamed from: a */
    public boolean f14382a;

    /* renamed from: b */
    public boolean f14383b;

    /* renamed from: c */
    public DataChannel f14384c;

    /* renamed from: d */
    public AbstractC5651b f14385d;

    /* renamed from: e */
    public List<AbstractC5651b> f14386e = new ArrayList();

    /* renamed from: f */
    public List<AbstractC5651b> f14387f = new ArrayList();

    /* renamed from: g */
    public List<AbstractC5651b> f14388g = new ArrayList();

    /* renamed from: h */
    public HashMap<C5647a.EnumC5648a, AbstractC5651b> f14389h = new HashMap<>();

    /* renamed from: i */
    public C5647a.EnumC5648a f14390i = C5647a.EnumC5648a.NONE;

    static {
        Covode.recordClassIndex(6256);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.a.c$a */
    public static final class C5660a {
        static {
            Covode.recordClassIndex(6257);
        }

        private C5660a() {
        }

        public /* synthetic */ C5660a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC5651b mo11439a() {
        return this.f14389h.get(this.f14390i);
    }

    /* renamed from: b */
    public final AbstractC5651b mo11442b(C5647a.EnumC5648a aVar) {
        C89219l.m154721d(aVar, "");
        return this.f14389h.get(aVar);
    }

    /* renamed from: a */
    public final void mo11441a(C5647a.EnumC5648a aVar) {
        C89219l.m154721d(aVar, "");
        if (this.f14389h.containsKey(aVar)) {
            this.f14389h.remove(aVar);
            if (this.f14390i == aVar) {
                this.f14385d = null;
                this.f14390i = C5647a.EnumC5648a.NONE;
            }
        }
    }

    /* renamed from: a */
    private static AbstractC5651b m12303a(long j, DataChannel dataChannel, C5647a.EnumC5648a aVar) {
        int i = C5662d.f14393b[aVar.ordinal()];
        if (i == 1) {
            return new C4598a(j, dataChannel);
        }
        if (i != 2) {
            return null;
        }
        return new C5194a(j, dataChannel);
    }

    /* renamed from: a */
    public final void mo11440a(long j, C5647a.EnumC5648a aVar, DataChannel dataChannel, C5650b bVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f14389h.containsKey(aVar) || this.f14389h.get(aVar) == null) {
            this.f14389h.put(aVar, m12303a(j, dataChannel, aVar));
        }
        AbstractC5651b bVar2 = this.f14389h.get(aVar);
        if (bVar2 != null) {
            this.f14386e.clear();
            List<AbstractC5651b> list = this.f14386e;
            C89219l.m154716b(bVar2, "");
            list.add(bVar2);
            bVar2.f14371g = bVar.f14365b;
            bVar2.f14372h = bVar.f14366c;
        } else {
            bVar2 = null;
        }
        this.f14385d = bVar2;
        this.f14384c = dataChannel;
        this.f14390i = aVar;
    }
}
