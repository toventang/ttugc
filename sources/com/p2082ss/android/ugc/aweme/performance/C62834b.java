package com.p2082ss.android.ugc.aweme.performance;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.block.AbstractC12350a;
import com.bytedance.apm.block.p766a.C12363e;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.monitor.collector.AbstractC21470a;
import com.bytedance.services.apm.api.AbstractC22711d;
import com.p2082ss.android.ugc.aweme.performance.C62827a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.performance.b */
public class C62834b extends AbstractC12350a implements AbstractC22711d {

    /* renamed from: d */
    private static C62834b f142490d;

    /* renamed from: b */
    final List<C62827a> f142491b = new ArrayList();

    /* renamed from: c */
    public boolean f142492c;

    static {
        Covode.recordClassIndex(73660);
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public final void mo20033a(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public final void mo20108a(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: b */
    public final void mo20035b(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: c */
    public final void mo20109c(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: l_ */
    public final void mo20110l_() {
    }

    private C62834b() {
    }

    /* renamed from: a */
    public static C62834b m113231a() {
        MethodCollector.m26663i(7314);
        if (f142490d == null) {
            synchronized (C62834b.class) {
                try {
                    if (f142490d == null) {
                        f142490d = new C62834b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7314);
                    throw th;
                }
            }
        }
        C62834b bVar = f142490d;
        MethodCollector.m26664o(7314);
        return bVar;
    }

    @Override // com.bytedance.apm.block.AbstractC12350a
    /* renamed from: a */
    public final void mo20106a(String str) {
        super.mo20106a(str);
        if (this.f142492c) {
            for (C62827a aVar : this.f142491b) {
                C89219l.m154721d(str, "");
                if (aVar.f142469d) {
                    try {
                        C62827a.C62828a aVar2 = aVar.f142467b;
                        if (aVar2 != null) {
                            C12363e eVar = C12364f.f29788r.f29790b;
                            C89219l.m154716b(eVar, "");
                            if (eVar.mo20118a()) {
                                aVar2.f142477b = true;
                            }
                        }
                        aVar.f142466a.mo100796a(AbstractC21470a.f50893b, str);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // com.bytedance.apm.block.AbstractC12350a
    /* renamed from: a */
    public final void mo20105a(long j, long j2, long j3, long j4, boolean z) {
        super.mo20105a(j, j2, j3, j4, z);
        if (this.f142492c) {
            for (C62827a aVar : this.f142491b) {
                if (aVar.f142469d) {
                    try {
                        C62827a.C62828a aVar2 = aVar.f142467b;
                        if (aVar2 != null) {
                            if (z) {
                                aVar2.f142478c = true;
                            }
                            if (aVar.f142468c.size() > 20000) {
                                aVar.f142468c.poll();
                            }
                            aVar.f142468c.add(aVar2);
                            aVar.f142467b = null;
                        }
                        if (aVar.f142466a.f142480e >= 0) {
                            aVar.f142466a.f142476a = AbstractC21470a.f50893b;
                            if (aVar.f142466a.f142476a - aVar.f142466a.f142480e > ((long) aVar.f142471f)) {
                                C62827a.C62828a aVar3 = aVar.f142466a;
                                C62827a.C62828a aVar4 = new C62827a.C62828a(aVar3.f142480e, aVar3.f142481f);
                                aVar4.f142476a = aVar3.f142476a;
                                aVar4.f142479d = aVar3.f142479d;
                                aVar4.f142477b = aVar3.f142477b;
                                aVar4.f142478c = aVar3.f142478c;
                                aVar.f142467b = aVar4;
                                String.valueOf(aVar.f142466a.f142476a - aVar.f142466a.f142480e);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
