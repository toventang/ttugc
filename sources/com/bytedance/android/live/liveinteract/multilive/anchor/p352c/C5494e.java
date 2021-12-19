package com.bytedance.android.live.liveinteract.multilive.anchor.p352c;

import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4429c;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multilive.anchor.p355f.C5523e;
import com.bytedance.android.live.liveinteract.platform.common.p373e.AbstractC5697a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.e */
public final class C5494e extends AbstractC5697a {
    @AbstractC4429c(mo10203a = "LAYOUT_MANAGER")

    /* renamed from: a */
    public C5523e f14070a;

    /* renamed from: b */
    private final AbstractC89244h f14071b = C89250i.m154773a((AbstractC89171a) C5496b.f14073a);

    /* renamed from: d */
    private final AbstractC5495a f14072d;

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.e$a */
    public interface AbstractC5495a {
        static {
            Covode.recordClassIndex(6090);
        }

        /* renamed from: g */
        long mo10989g(String str);

        /* renamed from: h */
        boolean mo11134h(String str);

        /* renamed from: i */
        boolean mo11136i(String str);

        /* renamed from: j */
        int mo11137j(String str);

        /* renamed from: k */
        int mo11139k(String str);
    }

    static {
        Covode.recordClassIndex(6089);
    }

    /* renamed from: a */
    private final HashMap<EnumC4422k, AbstractC5697a> m12002a() {
        return (HashMap) this.f14071b.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.e$b */
    static final class C5496b extends AbstractC89220m implements AbstractC89171a<HashMap<EnumC4422k, AbstractC5697a>> {

        /* renamed from: a */
        public static final C5496b f14073a = new C5496b();

        static {
            Covode.recordClassIndex(6091);
        }

        C5496b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<EnumC4422k, AbstractC5697a> invoke() {
            return new HashMap();
        }
    }

    public C5494e(AbstractC5495a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14072d = aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p373e.AbstractC5697a
    /* renamed from: a */
    public final void mo11301a(LiveCore.InteractConfig interactConfig) {
        super.mo11301a(interactConfig);
        Collection<AbstractC5697a> values = m12002a().values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().mo11301a(interactConfig);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i, int i2, List<? extends Region> list) {
        EnumC4422k kVar;
        C89219l.m154721d(list, "");
        if (this.f14070a == null) {
            C4431e.f12034a.mo10202b(this);
        }
        C5523e eVar = this.f14070a;
        if (eVar == null || (kVar = eVar.mo11313b()) == null) {
            kVar = EnumC4422k.FLOATING;
        }
        AbstractC5697a aVar = m12002a().get(kVar);
        if (aVar == null) {
            int i3 = C5497f.f14074a[kVar.ordinal()];
            if (i3 == 1) {
                aVar = new C5488b(this.f14072d);
            } else if (i3 == 2) {
                aVar = new C5486a(this.f14072d);
            } else if (i3 == 3) {
                aVar = new C5492d(this.f14072d);
            } else if (i3 != 4) {
                aVar = new C5498g(this.f14072d);
            } else {
                aVar = new C5490c(this.f14072d);
            }
            m12002a().put(kVar, aVar);
            aVar.mo11301a(this.f14427c);
        }
        String mixStream = aVar.mixStream(i, i2, list);
        C89219l.m154716b(mixStream, "");
        return mixStream;
    }
}
