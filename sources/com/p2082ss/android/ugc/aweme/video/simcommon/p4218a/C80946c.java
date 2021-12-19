package com.p2082ss.android.ugc.aweme.video.simcommon.p4218a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34852c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.video.simcommon.a.c */
public final class C80946c implements AbstractC34852c {

    /* renamed from: a */
    public static final C80946c f180983a = new C80946c();

    /* renamed from: b */
    private static final List<C80950e> f180984b = C89070n.m154516a(C80950e.f180987a);

    private C80946c() {
    }

    static {
        Covode.recordClassIndex(94252);
    }

    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34852c
    /* renamed from: a */
    public final AbstractC81962a mo61717a(String str) {
        Iterator<T> it = f180984b.iterator();
        while (it.hasNext()) {
            it.next();
            C80950e.m140493a();
        }
        Iterator<T> it2 = f180984b.iterator();
        AbstractC81962a aVar = null;
        while (true) {
            if (it2.hasNext()) {
                aVar = it2.next().mo61717a(str);
                if (aVar != null) {
                    new StringBuilder("getAutoBitrateSet ").append(str).append(' ').append(aVar).append(" first ").append(Double.valueOf(aVar.mo61720a())).append(" second ").append(Double.valueOf(aVar.mo61721b())).append(" third ").append(Double.valueOf(aVar.mo61722c())).append(" fourth ").append(Double.valueOf(aVar.mo61723d())).append(" minBitrate ").append(Double.valueOf(aVar.mo61724e()));
                    break;
                }
            } else {
                break;
            }
        }
        return aVar;
    }
}
