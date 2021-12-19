package com.bytedance.ies.p1208im.core.api.p1211b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17445c;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17422a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19480c;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.proto.SortType;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.im.core.api.b.a */
public abstract class AbstractC17420a {

    /* renamed from: a */
    public static final C17421a f41778a = new C17421a((byte) 0);

    static {
        Covode.recordClassIndex(19907);
    }

    /* renamed from: a */
    public abstract C19638h mo27720a(String str);

    /* renamed from: a */
    public abstract List<C19638h> mo27721a();

    /* renamed from: a */
    public abstract void mo27722a(long j, SortType sortType, Boolean bool, AbstractC19478a<List<C19638h>> aVar);

    /* renamed from: a */
    public abstract void mo27723a(AbstractC17422a aVar);

    /* renamed from: a */
    public abstract void mo27724a(String str, long j, int i, AbstractC19479b<C19638h> bVar);

    /* renamed from: a */
    public abstract void mo27725a(String str, AbstractC19479b<C19638h> bVar);

    /* renamed from: a */
    public abstract void mo27726a(List<String> list);

    /* renamed from: a */
    public abstract void mo27727a(List<String> list, Map<String, String> map, AbstractC19480c<C19638h> cVar);

    /* renamed from: b */
    public abstract C19638h mo27728b(String str);

    /* renamed from: b */
    public abstract void mo27729b(AbstractC17422a aVar);

    /* renamed from: b */
    public abstract void mo27730b(String str, AbstractC19479b<C19638h> bVar);

    /* renamed from: c */
    public abstract void mo27731c(String str);

    /* renamed from: c */
    public abstract void mo27732c(String str, AbstractC19479b<String> bVar);

    /* renamed from: d */
    public abstract boolean mo27733d(String str);

    /* renamed from: com.bytedance.ies.im.core.api.b.a$a */
    public static final class C17421a {
        static {
            Covode.recordClassIndex(19908);
        }

        private C17421a() {
        }

        /* renamed from: a */
        public static AbstractC17420a m32276a() {
            return C17445c.f41787a.mo27879b();
        }

        public /* synthetic */ C17421a(byte b) {
            this();
        }
    }
}
