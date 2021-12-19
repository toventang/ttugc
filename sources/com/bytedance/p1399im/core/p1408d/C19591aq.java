package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.aq */
public class C19591aq implements Serializable {
    private transient Comparator<C19590ap> comparator = new Comparator<C19590ap>() {
        /* class com.bytedance.p1399im.core.p1408d.C19591aq.C195921 */

        static {
            Covode.recordClassIndex(22436);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C19590ap apVar, C19590ap apVar2) {
            C19590ap apVar3 = apVar;
            C19590ap apVar4 = apVar2;
            if (apVar3.start < apVar4.start) {
                return -1;
            }
            if (apVar3.start == apVar4.start) {
                return 0;
            }
            return 1;
        }
    };
    @AbstractC27891c(mo46611a = "list")
    public List<C19590ap> ranges;

    static {
        Covode.recordClassIndex(22435);
    }

    public C19591aq() {
    }

    public synchronized boolean isRangeListNullOrEmpty() {
        boolean a;
        MethodCollector.m26663i(8298);
        a = C19995d.m37744a(this.ranges);
        MethodCollector.m26664o(8298);
        return a;
    }

    public final synchronized String toString() {
        MethodCollector.m26663i(8300);
        List<C19590ap> list = this.ranges;
        if (list != null) {
            String obj = list.toString();
            MethodCollector.m26664o(8300);
            return obj;
        }
        MethodCollector.m26664o(8300);
        return "[]";
    }

    public synchronized C19591aq copy() {
        C19591aq aqVar;
        MethodCollector.m26663i(8297);
        aqVar = new C19591aq(new ArrayList());
        List<C19590ap> list = this.ranges;
        if (list != null) {
            for (C19590ap apVar : list) {
                aqVar.ranges.add(apVar.copy());
            }
        }
        MethodCollector.m26664o(8297);
        return aqVar;
    }

    public synchronized C19590ap getMaxRange() {
        MethodCollector.m26663i(8299);
        if (!C19995d.m37744a(this.ranges)) {
            List<C19590ap> list = this.ranges;
            C19590ap apVar = list.get(list.size() - 1);
            MethodCollector.m26664o(8299);
            return apVar;
        }
        MethodCollector.m26664o(8299);
        return null;
    }

    public C19591aq(List<C19590ap> list) {
        this.ranges = list;
    }

    public synchronized boolean check(long j) {
        MethodCollector.m26663i(8295);
        if (C19995d.m37744a(this.ranges)) {
            MethodCollector.m26664o(8295);
            return false;
        }
        for (C19590ap apVar : this.ranges) {
            if (apVar.start <= j && j <= apVar.end) {
                MethodCollector.m26664o(8295);
                return true;
            }
        }
        MethodCollector.m26664o(8295);
        return false;
    }

    public synchronized void merge(C19590ap apVar) {
        MethodCollector.m26663i(8296);
        if (!apVar.isValid()) {
            MethodCollector.m26664o(8296);
        } else if (C19995d.m37744a(this.ranges)) {
            ArrayList arrayList = new ArrayList();
            this.ranges = arrayList;
            arrayList.add(apVar);
            MethodCollector.m26664o(8296);
        } else {
            this.ranges.add(apVar);
            Collections.sort(this.ranges, this.comparator);
            LinkedList linkedList = new LinkedList();
            for (C19590ap apVar2 : this.ranges) {
                if (linkedList.isEmpty() || ((C19590ap) linkedList.getLast()).end + 1 < apVar2.start) {
                    linkedList.add(apVar2);
                } else {
                    ((C19590ap) linkedList.getLast()).end = Math.max(((C19590ap) linkedList.getLast()).end, apVar2.end);
                }
            }
            this.ranges = linkedList;
            MethodCollector.m26664o(8296);
        }
    }
}
