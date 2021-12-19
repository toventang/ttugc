package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ms.bd.o.r1 */
public final class C89929r1 extends AbstractC89926q1 {

    /* renamed from: a */
    long f203812a;

    static {
        Covode.recordClassIndex(106026);
    }

    /* access modifiers changed from: protected */
    @Override // p4646ms.p4647bd.p4648o.AbstractC89926q1
    /* renamed from: a */
    public final Object mo144468a(long j) {
        this.f203812a = j;
        m156041a(new C89930a());
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MethodCollector.m26663i(287);
        C89889h.m155966a(50331650, 0, this.f203812a, null, null);
        this.f203812a = -1;
        super.finalize();
        MethodCollector.m26664o(287);
    }

    /* renamed from: a */
    private synchronized void m156041a(C14731e.AbstractC14732a aVar) {
        MethodCollector.m26663i(285);
        C14731e.f35922k = aVar;
        MethodCollector.m26664o(285);
    }

    /* renamed from: ms.bd.o.r1$a */
    class C89930a implements C14731e.AbstractC14732a {
        static {
            Covode.recordClassIndex(106027);
        }

        C89930a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14732a
        /* renamed from: a */
        public final Map<String, String> mo23729a(String str, Map<String, List<String>> map) {
            int i;
            String str2;
            MethodCollector.m26663i(744);
            HashMap hashMap = new HashMap();
            if (str == null || map == null) {
                MethodCollector.m26664o(744);
                return hashMap;
            } else if (str.toLowerCase().contains((String) C89889h.m155966a(16777217, 0, 0, "cac90e", new byte[]{122, 119, 4, 93})) || str.toLowerCase().contains((String) C89889h.m155966a(16777217, 0, 0, "6860a0", new byte[]{47, 46, 81, 84, 77}))) {
                C89956y1.m156081a().mo144481b();
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<String>> next = it.next();
                    String key = next.getKey();
                    if (next.getValue() == null || next.getValue().size() <= 0) {
                        str2 = null;
                    } else {
                        str2 = next.getValue().get(0);
                    }
                    if (!(key == null || str2 == null)) {
                        arrayList.add(key);
                        arrayList.add(str2);
                    }
                }
                String[] strArr = (String[]) C89868b.m155937a(50331649, 0, C89929r1.this.f203812a, str, arrayList.toArray(new String[0]));
                if (strArr != null) {
                    HashMap hashMap2 = new HashMap();
                    for (i = 0; i < strArr.length; i += 2) {
                        hashMap2.put(strArr[i], strArr[i + 1]);
                    }
                    MethodCollector.m26664o(744);
                    return hashMap2;
                }
                MethodCollector.m26664o(744);
                return hashMap;
            } else {
                RuntimeException runtimeException = new RuntimeException((String) C89889h.m155966a(16777217, 0, 0, "34e6c8", new byte[]{43, 34, 86, 79, 73, 60, 36, 85, 54, 99, 98, 62, 2, 86, 76, 96, 56, 1, 32, 118, 49}));
                MethodCollector.m26664o(744);
                throw runtimeException;
            }
        }
    }
}
