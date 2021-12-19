package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.g */
public final class C46595g {

    /* renamed from: a */
    public static C46595g f108645a;

    /* renamed from: b */
    public static final C46596a f108646b = new C46596a((byte) 0);

    static {
        Covode.recordClassIndex(55185);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.g$a */
    public static final class C46596a {
        static {
            Covode.recordClassIndex(55186);
        }

        private C46596a() {
        }

        /* renamed from: a */
        public static C46595g m89935a() {
            MethodCollector.m26663i(13246);
            if (C46595g.f108645a == null) {
                synchronized (C46595g.class) {
                    try {
                        if (C46595g.f108645a == null) {
                            C46595g.f108645a = new C46595g((byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13246);
                        throw th;
                    }
                }
            }
            C46595g gVar = C46595g.f108645a;
            if (gVar == null) {
                C89219l.m154715b();
            }
            MethodCollector.m26664o(13246);
            return gVar;
        }

        public /* synthetic */ C46596a(byte b) {
            this();
        }
    }

    private C46595g() {
    }

    public /* synthetic */ C46595g(byte b) {
        this();
    }

    /* renamed from: a */
    public static List<C46605i> m89932a(int i) {
        if (!C46597h.m89940b(i)) {
            return null;
        }
        return C46597h.f108651e.mo79191a(i);
    }

    /* renamed from: b */
    public static int m89934b(int i) {
        C46597h.f108651e.mo79191a(i);
        List<C46605i> list = C46597h.f108650d.get(Integer.valueOf(i));
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public static List<C46605i> m89933a(int i, int i2) {
        if (!C46597h.m89940b(i)) {
            return null;
        }
        List<C46605i> a = C46597h.f108651e.mo79191a(i);
        ArrayList arrayList = new ArrayList();
        if (i2 < a.size()) {
            int i3 = 0;
            int i4 = 0;
            for (C46605i iVar : a) {
                if (i4 >= i2 && i4 < i2 + 20) {
                    arrayList.add(iVar);
                }
                i4++;
                if (i4 >= i2 + 20) {
                    break;
                }
            }
            int size = 20 - arrayList.size();
            if (size > 0) {
                do {
                    arrayList.add(new C46605i());
                    i3++;
                } while (i3 < size);
            }
        }
        return arrayList;
    }
}
