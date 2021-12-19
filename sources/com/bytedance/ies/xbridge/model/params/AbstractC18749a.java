package com.bytedance.ies.xbridge.model.params;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18805o;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.model.params.a */
public abstract class AbstractC18749a {
    public static final C18750a Companion = new C18750a((byte) 0);

    static {
        Covode.recordClassIndex(21445);
    }

    /* renamed from: com.bytedance.ies.xbridge.model.params.a$a */
    public static final class C18750a {
        static {
            Covode.recordClassIndex(21446);
        }

        private C18750a() {
        }

        public /* synthetic */ C18750a(byte b) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ Long m34817a(AbstractC18754n nVar, String str) {
            C89219l.m154719c(nVar, "");
            C89219l.m154719c(str, "");
            int i = C18751b.f44529a[nVar.mo29766i(str).mo29707a().ordinal()];
            if (i == 1) {
                return Long.valueOf((long) nVar.mo29762e(str));
            }
            if (i != 2) {
                return null;
            }
            return Long.valueOf((long) nVar.mo29761d(str));
        }

        /* renamed from: a */
        public static int m34816a(AbstractC18754n nVar, String str, int i) {
            C89219l.m154719c(nVar, "");
            C89219l.m154719c(str, "");
            if (nVar.mo29757a(str)) {
                if (nVar.mo29766i(str).mo29707a() == EnumC18805o.Int) {
                    return C18586i.m34537a(nVar, str, i);
                }
                if (nVar.mo29766i(str).mo29707a() == EnumC18805o.Number) {
                    return (int) C18586i.m34536a(nVar, str, (double) i);
                }
            }
            return i;
        }
    }

    public List<String> provideParamList() {
        return C89086z.INSTANCE;
    }
}
