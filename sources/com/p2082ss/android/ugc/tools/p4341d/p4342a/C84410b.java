package com.p2082ss.android.ugc.tools.p4341d.p4342a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.d.a.b */
public final class C84410b {

    /* renamed from: a */
    public static final C84411a f188732a = new C84411a((byte) 0);

    static {
        Covode.recordClassIndex(98375);
    }

    /* renamed from: com.ss.android.ugc.tools.d.a.b$a */
    public static final class C84411a {
        static {
            Covode.recordClassIndex(98376);
        }

        private C84411a() {
        }

        public /* synthetic */ C84411a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static void m145197a() {
        Keva repo = Keva.getRepo("bundle_survive_count_repo");
        C89219l.m154716b(repo, "");
        Map<String, ?> all = repo.getAll();
        C89219l.m154716b(all, "");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) value).intValue() > 1) {
                C89219l.m154716b(key, "");
                C89219l.m154721d(key, "");
                Keva.getRepo("large_transaction_repo").erase(key);
                Keva.getRepo("bundle_survive_count_repo").erase(key);
            }
        }
    }

    /* renamed from: a */
    public static byte[] m145198a(String str) {
        C89219l.m154721d(str, "");
        byte[] bytesJustDisk = Keva.getRepo("large_transaction_repo").getBytesJustDisk(str, new byte[0]);
        C89219l.m154716b(bytesJustDisk, "");
        return bytesJustDisk;
    }
}
