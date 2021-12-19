package com.p2082ss.android.pushmanager.p2172a;

import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.ss.android.pushmanager.a.a */
public final class C30206a {

    /* renamed from: a */
    private final int f72048a = 20;

    /* renamed from: b */
    private final TreeMap<C30208a, C30208a> f72049b = new TreeMap<>(new Comparator<C30208a>() {
        /* class com.p2082ss.android.pushmanager.p2172a.C30206a.C302071 */

        static {
            Covode.recordClassIndex(36713);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C30208a aVar, C30208a aVar2) {
            C30208a aVar3 = aVar;
            C30208a aVar4 = aVar2;
            if (aVar3 == null) {
                return 1;
            }
            if (aVar4 == null) {
                return -1;
            }
            if (aVar3.equals(aVar4)) {
                return 0;
            }
            if (aVar3.f72052b > aVar4.f72052b) {
                return 1;
            }
            return -1;
        }
    });

    static {
        Covode.recordClassIndex(36712);
    }

    /* renamed from: com.ss.android.pushmanager.a.a$a */
    public class C30208a {

        /* renamed from: a */
        public Long f72051a;

        /* renamed from: b */
        public long f72052b;

        static {
            Covode.recordClassIndex(36714);
        }

        public final int hashCode() {
            return this.f72051a.hashCode();
        }

        public final String toString() {
            return String.valueOf(this.f72051a) + "|" + String.valueOf(this.f72052b);
        }

        public C30208a() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C30208a) || obj == null) {
                return super.equals(obj);
            }
            return this.f72051a.equals(((C30208a) obj).f72051a);
        }
    }

    /* renamed from: a */
    public final synchronized String mo53634a() {
        String str;
        MethodCollector.m26663i(11263);
        str = "";
        try {
            StringBuilder sb = new StringBuilder();
            Set<Map.Entry<C30208a, C30208a>> entrySet = this.f72049b.entrySet();
            int i = 0;
            for (Map.Entry<C30208a, C30208a> entry : entrySet) {
                C30208a value = entry.getValue();
                if (value != null) {
                    if (i != entrySet.size() - 1) {
                        sb.append(value.toString()).append("@");
                    } else {
                        sb.append(value.toString());
                    }
                    i++;
                }
            }
            str = sb.toString();
            Logger.debug();
        } catch (Throwable unused) {
        }
        MethodCollector.m26664o(11263);
        return str;
    }

    /* renamed from: a */
    public final synchronized boolean mo53636a(C30208a aVar) {
        MethodCollector.m26663i(10966);
        if (aVar == null) {
            MethodCollector.m26664o(10966);
            return false;
        }
        boolean containsKey = this.f72049b.containsKey(aVar);
        Logger.debug();
        MethodCollector.m26664o(10966);
        return containsKey;
    }

    /* renamed from: b */
    public final synchronized C30208a mo53637b(C30208a aVar) {
        C30208a aVar2;
        Exception e;
        MethodCollector.m26663i(11107);
        try {
            aVar2 = this.f72049b.get(aVar);
            try {
                Logger.debug();
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            aVar2 = null;
            e.printStackTrace();
            MethodCollector.m26664o(11107);
            return aVar2;
        }
        MethodCollector.m26664o(11107);
        return aVar2;
    }

    /* renamed from: c */
    public final synchronized void mo53638c(C30208a aVar) {
        MethodCollector.m26663i(11109);
        try {
            Logger.debug();
            if (Logger.debug()) {
                mo53634a();
            }
            if (this.f72049b.size() >= this.f72048a && !mo53636a(aVar)) {
                Logger.debug();
                TreeMap<C30208a, C30208a> treeMap = this.f72049b;
                treeMap.remove(treeMap.firstKey());
            }
            if (mo53636a(aVar)) {
                Logger.debug();
                this.f72049b.remove(aVar);
            }
            this.f72049b.put(aVar, aVar);
            if (Logger.debug()) {
                mo53634a();
            }
            Logger.debug();
            MethodCollector.m26664o(11109);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(11109);
        }
    }

    /* renamed from: a */
    public final synchronized void mo53635a(String str) {
        String[] split;
        MethodCollector.m26663i(11585);
        if (C13627m.m24498a(str)) {
            MethodCollector.m26664o(11585);
            return;
        }
        Logger.debug();
        try {
            this.f72049b.clear();
            String[] split2 = str.split("@");
            if (split2 != null) {
                for (String str2 : split2) {
                    C30208a aVar = new C30208a();
                    if (!(str2 == null || (split = str2.split("\\|")) == null || split.length != 2)) {
                        aVar.f72051a = Long.valueOf(split[0]);
                        aVar.f72052b = Long.valueOf(split[1]).longValue();
                    }
                    mo53638c(aVar);
                }
            }
            MethodCollector.m26664o(11585);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(11585);
        }
    }
}
