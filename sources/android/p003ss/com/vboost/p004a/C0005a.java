package android.p003ss.com.vboost.p004a;

import android.p003ss.com.vboost.CapabilityType;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: android.ss.com.vboost.a.a */
public class C0005a {

    /* renamed from: a */
    private static final String f26a = C0005a.class.getName();

    /* renamed from: b */
    private final LinkedHashMap<String, String> f27b = new LinkedHashMap<>(64);

    static {
        Covode.recordClassIndex(8);
    }

    /* renamed from: a */
    public final Set<CapabilityType> mo4a() {
        String str = this.f27b.get("support_capability_set");
        if (str == null) {
            return null;
        }
        TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(str);
        HashSet hashSet = new HashSet();
        for (String str2 : simpleStringSplitter) {
            hashSet.add(CapabilityType.valueOf(Integer.parseInt(str2)));
        }
        if (hashSet.size() == 0) {
            return null;
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo6a(EnumC0006b bVar) {
        m7b("cpu_core_limit_by", Integer.toString(bVar.ordinal()));
    }

    /* renamed from: a */
    public final void mo7a(C0008d dVar) {
        m6a("task_priority_limit_rule", dVar.f36a + "," + dVar.f37b + "," + dVar.f38c);
    }

    /* renamed from: a */
    public final void mo8a(Set<CapabilityType> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<CapabilityType> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getIndex());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        m6a("support_capability_set", sb.toString());
    }

    /* renamed from: b */
    private void m7b(String str, String str2) {
        this.f27b.remove(str);
        this.f27b.put(str, str2);
    }

    /* renamed from: a */
    private void m6a(String str, String str2) {
        if (str.indexOf(61) == -1 && str.indexOf(59) == -1 && str.indexOf(0) == -1 && str2.indexOf(61) == -1 && str2.indexOf(59) == -1 && str2.indexOf(0) == -1) {
            m7b(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo5a(CapabilityType capabilityType, List<C0007c> list) {
        String str;
        String str2;
        String str3 = capabilityType.getName() + "_limit_rule";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            C0007c cVar = list.get(i);
            sb.append("(");
            String str4 = "1";
            if (cVar.f29a) {
                str = str4;
            } else {
                str = "0";
            }
            sb.append(str).append(":").append(cVar.f30b).append(":").append(cVar.f31c);
            sb.append(",");
            if (cVar.f32d) {
                str2 = str4;
            } else {
                str2 = "0";
            }
            sb.append(str2).append(":").append(cVar.f33e);
            sb.append(",");
            if (!cVar.f34f) {
                str4 = "0";
            }
            sb.append(str4).append(":").append(cVar.f35g);
            sb.append(")");
            if (i != list.size() - 1) {
                sb.append(',');
            }
        }
        m6a(str3, sb.toString());
    }
}
