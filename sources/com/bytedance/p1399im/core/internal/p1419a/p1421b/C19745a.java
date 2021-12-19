package com.bytedance.p1399im.core.internal.p1419a.p1421b;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1421b.C19747b;
import com.bytedance.p1399im.core.internal.utils.HandlerC20049x;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1408d.p1410b.C19603a;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.b.a */
public class C19745a implements HandlerC20049x.AbstractC20050a {

    /* renamed from: b */
    private static C19745a f46927b;

    /* renamed from: a */
    public HandlerC20049x f46928a;

    /* renamed from: com.bytedance.im.core.internal.a.b.a$a */
    public class C19746a {

        /* renamed from: a */
        public List<C19603a> f46929a;

        /* renamed from: b */
        List<String> f46930b;

        /* renamed from: c */
        String f46931c;

        /* renamed from: d */
        int f46932d;

        static {
            Covode.recordClassIndex(22590);
        }
    }

    static {
        Covode.recordClassIndex(22589);
    }

    public C19745a() {
        C19483d.m36365a();
    }

    /* renamed from: a */
    public static C19745a m36988a() {
        MethodCollector.m26663i(9556);
        if (f46927b == null) {
            synchronized (C19745a.class) {
                try {
                    f46927b = new C19745a();
                } catch (Throwable th) {
                    MethodCollector.m26664o(9556);
                    throw th;
                }
            }
        }
        C19745a aVar = f46927b;
        MethodCollector.m26664o(9556);
        return aVar;
    }

    @Override // com.bytedance.p1399im.core.internal.utils.HandlerC20049x.AbstractC20050a
    /* renamed from: a */
    public final void mo31686a(Message message) {
        if (message.obj instanceof C19746a) {
            C19746a aVar = (C19746a) message.obj;
            switch (message.what) {
                case 101:
                    C19747b.m36993a(aVar.f46929a);
                    return;
                case 102:
                    List<C19603a> list = aVar.f46929a;
                    if (!(C19747b.f46933a || list == null || list.isEmpty())) {
                        StringBuilder sb = new StringBuilder();
                        for (C19603a aVar2 : list) {
                            if (aVar2 != null && !TextUtils.isEmpty(aVar2.mo31384a())) {
                                sb.append(",\"").append(aVar2.mo31384a()).append('\"');
                            }
                        }
                        String sb2 = sb.toString();
                        if (sb2.length() > 0) {
                            if (C19742b.m36979b("delete from fts_entity where " + C19747b.EnumC19748a.COLUMN_ID.key + " in " + ("(" + sb2.substring(1) + ")"))) {
                                C19747b.m36993a(list);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 103:
                    C19747b.m36997b(aVar.f46929a);
                    return;
                case 104:
                    C19747b.m36994a(aVar.f46930b, aVar.f46931c);
                    return;
                case 105:
                    C19747b.m36995a(aVar.f46930b, aVar.f46931c, aVar.f46932d);
                    return;
                default:
                    return;
            }
        }
    }
}
