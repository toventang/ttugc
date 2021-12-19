package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.q.ar */
public final class C49854ar {

    /* renamed from: a */
    public static final C49854ar f114930a = new C49854ar();

    /* renamed from: b */
    private static final AbstractC89244h f114931b = C89250i.m154773a((AbstractC89171a) C49855a.f114932a);

    /* renamed from: a */
    public static HashMap<String, String> m93566a() {
        return (HashMap) f114931b.getValue();
    }

    private C49854ar() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.q.ar$a */
    static final class C49855a extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        public static final C49855a f114932a = new C49855a();

        static {
            Covode.recordClassIndex(58962);
        }

        C49855a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            return new HashMap();
        }
    }

    static {
        Covode.recordClassIndex(58961);
    }

    /* renamed from: a */
    public static boolean m93567a(String str) {
        C89219l.m154721d(str, "");
        if (C49856as.f114933a == null) {
            C49856as.f114933a = Boolean.valueOf(SettingsManager.m29616a().mo25400a("player_duplicate_detector", true));
        }
        Boolean bool = C49856as.f114933a;
        if (bool == null) {
            C89219l.m154715b();
        }
        if (!bool.booleanValue() || m93566a().size() <= 0) {
            return false;
        }
        Collection<String> values = m93566a().values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) str, (Object) it.next())) {
                return true;
            }
        }
        return false;
    }
}
