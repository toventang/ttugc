package com.bytedance.ies.p1208im.core.api.p1211b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17445c;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17423b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.api.b.b */
public abstract class AbstractC17427b {

    /* renamed from: a */
    public static final C17428a f41779a = new C17428a((byte) 0);

    static {
        Covode.recordClassIndex(19914);
    }

    /* renamed from: a */
    public abstract void mo27734a();

    /* renamed from: a */
    public abstract void mo27735a(AbstractC17423b bVar);

    /* renamed from: a */
    public abstract void mo27736a(AbstractC19479b<String> bVar);

    /* renamed from: a */
    public abstract void mo27737a(String str, int i, Map<String, String> map, AbstractC19479b<C19537ah> bVar);

    /* renamed from: a */
    public abstract void mo27738a(String str, AbstractC19479b<C19638h> bVar);

    /* renamed from: a */
    public abstract void mo27739a(List<String> list, Map<String, String> map, AbstractC19479b<List<C19537ah>> bVar);

    /* renamed from: a */
    public abstract void mo27740a(Map<String, String> map);

    /* renamed from: a */
    public abstract void mo27741a(Map<String, String> map, AbstractC19479b<C19638h> bVar);

    /* renamed from: a */
    public abstract void mo27742a(boolean z, AbstractC19479b<C19638h> bVar);

    /* renamed from: b */
    public abstract String mo27743b();

    /* renamed from: b */
    public abstract void mo27744b(AbstractC19479b<String> bVar);

    /* renamed from: b */
    public abstract void mo27745b(String str, AbstractC19479b<C19537ah> bVar);

    /* renamed from: b */
    public abstract void mo27746b(List<String> list, Map<String, String> map, AbstractC19479b<List<C19537ah>> bVar);

    /* renamed from: b */
    public abstract void mo27747b(Map<String, String> map, AbstractC19479b<C19638h> bVar);

    /* renamed from: b */
    public abstract void mo27748b(boolean z, AbstractC19479b<C19638h> bVar);

    /* renamed from: c */
    public abstract C19638h mo27749c();

    /* renamed from: d */
    public abstract void mo27750d();

    /* renamed from: e */
    public abstract void mo27751e();

    /* renamed from: com.bytedance.ies.im.core.api.b.b$a */
    public static final class C17428a {
        static {
            Covode.recordClassIndex(19915);
        }

        private C17428a() {
        }

        public /* synthetic */ C17428a(byte b) {
            this();
        }

        /* renamed from: c */
        public static long m32311c(String str) {
            return C17445c.f41787a.mo27875a(str);
        }

        /* renamed from: a */
        public static AbstractC17427b m32308a(String str) {
            C89219l.m154721d(str, "");
            return C17445c.f41787a.mo27881c(str);
        }

        /* renamed from: b */
        public static String m32310b(String str) {
            String b = C17445c.f41787a.mo27880b(str);
            if (b == null) {
                return "";
            }
            return b;
        }

        /* renamed from: a */
        public static String m32309a(long j) {
            String b = C17445c.f41787a.mo27880b(String.valueOf(j));
            if (b == null) {
                return "";
            }
            return b;
        }
    }
}
