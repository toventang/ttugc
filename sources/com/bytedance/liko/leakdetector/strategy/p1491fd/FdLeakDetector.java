package com.bytedance.liko.leakdetector.strategy.p1491fd;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.liko.p1484b.AbstractC20838b;
import com.bytedance.liko.p1484b.C20837a;
import com.bytedance.liko.p1484b.C20841e;
import com.bytedance.liko.p1485c.C20842a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector */
public final class FdLeakDetector {
    public static final FdLeakDetector INSTANCE = new FdLeakDetector();
    private static Handler handler;
    private static final HandlerThread handlerThread = new HandlerThread("FdLeakThread");
    private static volatile boolean hasInstalled;

    private FdLeakDetector() {
    }

    static {
        Covode.recordClassIndex(24454);
    }

    public final void install() {
        if (!hasInstalled) {
            HandlerThread handlerThread2 = handlerThread;
            handlerThread2.start();
            HandlerC20875a aVar = new HandlerC20875a(this, handlerThread2.getLooper());
            handler = aVar;
            aVar.sendEmptyMessageDelayed(0, C20837a.f49276d);
            hasInstalled = true;
        }
    }

    public final void dumpFdAndReport() {
        if (C20837a.f49273a) {
            List<String> a = C20842a.m39191a();
            C89219l.m154719c("found " + a.size() + " fd", "");
            parse(a);
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector$a */
    public static final class HandlerC20875a extends Handler {

        /* renamed from: a */
        final /* synthetic */ FdLeakDetector f49361a;

        static {
            Covode.recordClassIndex(24455);
        }

        public final void handleMessage(Message message) {
            FdLeakDetector.INSTANCE.dumpFdAndReport();
            sendEmptyMessageDelayed(0, C20837a.f49276d);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC20875a(FdLeakDetector fdLeakDetector, Looper looper) {
            super(looper);
            this.f49361a = fdLeakDetector;
        }
    }

    public final String getTag(String str) {
        C89219l.m154719c(str, "");
        if (C89361p.m154908a((CharSequence) str, (CharSequence) ":", false)) {
            return C89361p.m154915b(str, new String[]{":"}).get(0);
        }
        if (!C89361p.m154908a((CharSequence) str, (CharSequence) "/", false)) {
            return str;
        }
        String substring = str.substring(0, C89361p.m154885a((CharSequence) str, "/"));
        C89219l.m154709a((Object) substring, "");
        return substring;
    }

    private final void parse(List<String> list) {
        T next;
        if (list.size() >= C20837a.f49274b || list.size() >= C20837a.f49275c) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : list) {
                linkedHashSet.add(t);
                String tag = INSTANCE.getTag(t);
                Integer num = linkedHashMap.get(tag);
                if (num != null) {
                    linkedHashMap.put(tag, Integer.valueOf(num.intValue() + 1));
                } else {
                    linkedHashMap.put(tag, 1);
                }
                Integer num2 = linkedHashMap2.get(t);
                if (num2 != null) {
                    linkedHashMap2.put(t, Integer.valueOf(num2.intValue() + 1));
                } else {
                    linkedHashMap2.put(t, 1);
                }
            }
            Iterator<T> it = linkedHashMap2.entrySet().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) next.getValue()).intValue();
                    do {
                        T next2 = it.next();
                        int intValue2 = ((Number) next2.getValue()).intValue();
                        if (intValue < intValue2) {
                            next = next2;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            T t2 = next;
            if (t2 != null && t2.getValue().intValue() >= C20837a.f49275c) {
                parseSingle(linkedHashSet, linkedHashMap2, t2);
            } else if (list.size() >= C20837a.f49274b) {
                parseTotal(list, linkedHashSet, linkedHashMap2, linkedHashMap);
            }
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector$b */
    public static final class C20876b<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Map f49362a;

        static {
            Covode.recordClassIndex(24456);
        }

        public C20876b(Map map) {
            this.f49362a = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i;
            Integer num = (Integer) this.f49362a.get(t2);
            int i2 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            Integer num2 = (Integer) this.f49362a.get(t);
            if (num2 != null) {
                i2 = num2.intValue();
            }
            return C89090a.m154604a(valueOf, Integer.valueOf(i2));
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector$c */
    public static final class C20877c<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Map f49363a;

        static {
            Covode.recordClassIndex(24457);
        }

        public C20877c(Map map) {
            this.f49363a = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i;
            Integer num = (Integer) this.f49363a.get(FdLeakDetector.INSTANCE.getTag(t2));
            int i2 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            Integer num2 = (Integer) this.f49363a.get(FdLeakDetector.INSTANCE.getTag(t));
            if (num2 != null) {
                i2 = num2.intValue();
            }
            return C89090a.m154604a(valueOf, Integer.valueOf(i2));
        }
    }

    private final void report(List<String> list, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FdLeakWarning: " + str + '\n');
        stringBuffer.append("at " + getClass().getName() + ".INSTANCE (FdLeakDetector.java:0)\n");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()) + '\n');
        }
        C89219l.m154719c("start report \n" + stringBuffer, "");
        AbstractC20838b bVar = C20841e.f49294a;
        if (bVar != null) {
            bVar.mo34260a(stringBuffer.toString());
        } else {
            C89219l.m154719c("reporter is null", "");
        }
    }

    private final void parseSingle(Set<String> set, Map<String, Integer> map, Map.Entry<String, Integer> entry) {
        List<String> a = C89070n.m154553a((Iterable) C89070n.m154590j(set), (Comparator) new C20876b(map));
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        for (String str : a) {
            arrayList.add(str + '(' + map.get(str) + ')');
        }
        report(arrayList, "found more than " + C20837a.f49275c + " fd(" + entry.getValue().intValue() + ") by single count with max fd:" + entry.getKey());
    }

    private final void parseTotal(List<String> list, Set<String> set, Map<String, Integer> map, Map<String, Integer> map2) {
        T next;
        List<String> a = C89070n.m154553a((Iterable) C89070n.m154590j(set), (Comparator) new C20877c(map2));
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        for (String str : a) {
            arrayList.add(str + '(' + map.get(str) + ')');
        }
        ArrayList arrayList2 = arrayList;
        StringBuilder append = new StringBuilder("found more than ").append(C20837a.f49274b).append(" fd(").append(list.size()).append(") by total count with max fd:");
        Iterator<T> it = map2.entrySet().iterator();
        String str2 = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) next.getValue()).intValue();
                do {
                    T next2 = it.next();
                    int intValue2 = ((Number) next2.getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        T t = next;
        if (t != null) {
            str2 = (String) t.getKey();
        }
        report(arrayList2, append.append(str2).toString());
    }
}
