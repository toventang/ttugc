package com.bytedance.helios.sdk.anchor.p1093a;

import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.p1087a.AbstractC15300c;
import com.bytedance.helios.api.p1087a.C15297a;
import com.bytedance.helios.api.p1087a.C15298b;
import com.bytedance.helios.api.p1088b.C15302a;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.sdk.C15372c;
import com.bytedance.helios.sdk.C15427e;
import com.bytedance.helios.sdk.C15434f;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.anchor.AbstractC15369b;
import com.bytedance.helios.sdk.anchor.C15360a;
import com.bytedance.helios.sdk.p1097d.AbstractC15412n;
import com.bytedance.helios.sdk.p1097d.C15424v;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.anchor.a.b */
public final class C15362b implements AbstractC15369b {

    /* renamed from: a */
    public static final C15363a f37466a = new C15363a((byte) 0);

    /* renamed from: b */
    private final C0484a<String, Runnable> f37467b = new C0484a<>();

    /* renamed from: c */
    private final C15298b f37468c;

    static {
        Covode.recordClassIndex(17614);
    }

    @Override // com.bytedance.helios.sdk.anchor.AbstractC15369b
    /* renamed from: a */
    public final String mo25107a() {
        return "AnchorTaskPlanA";
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.a.b$a */
    public static final class C15363a {
        static {
            Covode.recordClassIndex(17615);
        }

        private C15363a() {
        }

        public /* synthetic */ C15363a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m28260a(String str) {
            boolean z;
            boolean z2;
            AbstractC15412n a = C15427e.m28378a(C15424v.f37657b);
            if (a != null) {
                List<C15318n> list = a.f37631c;
                if (!C89219l.m154714a((Object) str, (Object) "detectionAllPage") || !(!list.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List<C15372c> list2 = (List) it.next().f37368n.get("floating_view_activities");
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                            for (C15372c cVar : list2) {
                                arrayList.add(cVar.f37498c);
                            }
                            ArrayList arrayList2 = arrayList;
                            if (arrayList2 != null && arrayList2.contains(str)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                z2 = false;
                if (z || z2) {
                    return true;
                }
                return false;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.a.b$b */
    public static final class RunnableC15364b implements Runnable {

        /* renamed from: a */
        public AnchorInfoModel f37469a;

        /* renamed from: b */
        public int f37470b;

        static {
            Covode.recordClassIndex(17616);
        }

        public final void run() {
            boolean z;
            List<C15318n> list;
            boolean equals = TextUtils.equals(this.f37469a.getAnchorPage(), this.f37469a.getDetectionPage());
            C15434f a = C15434f.m28386a();
            C89219l.m154709a((Object) a, "");
            if (a.mo25169c()) {
                C15434f a2 = C15434f.m28386a();
                C89219l.m154709a((Object) a2, "");
                if (C89219l.m154714a((Object) a2.f37676e, (Object) this.f37469a.getDetectionPage())) {
                    C15434f a3 = C15434f.m28386a();
                    C89219l.m154709a((Object) a3, "");
                    if (a3.f37678g == this.f37470b || !equals) {
                        C15484f.m28491a("Helios-Log-Detection-Task", "skipDetectionTask runnable=" + hashCode() + " currentActivityPage=" + this.f37469a.getDetectionPage() + ' ' + "pageHashCode=" + this.f37470b + " isSamePage=" + equals, (String) null, 12);
                        return;
                    }
                }
            }
            Map<String, AbstractC15300c> map = C15298b.C15299a.m28208a().mCheckerMap;
            Iterator<T> it = this.f37469a.getMonitorEvents().iterator();
            loop0:
            while (true) {
                z = false;
                while (it.hasNext()) {
                    AbstractC15300c cVar = map.get(it.next());
                    if (cVar != null) {
                        list = cVar.getHoldingResources();
                    } else {
                        list = null;
                    }
                    if (z || (list != null && m28261a(list, this.f37469a, this.f37470b))) {
                        z = true;
                    }
                }
                break loop0;
            }
            if (z) {
                HandlerThreadC15486g.m28499b().postDelayed(this, this.f37469a.getAnchorTimeDelay());
                C15484f.m28491a("Helios-Log-Detection-Task", "continueDetectionTask runnable=" + hashCode() + " pageHashCode=" + this.f37470b, (String) null, 12);
            }
        }

        public RunnableC15364b(AnchorInfoModel anchorInfoModel, int i) {
            C89219l.m154719c(anchorInfoModel, "");
            this.f37469a = anchorInfoModel;
            this.f37470b = i;
        }

        /* renamed from: a */
        private static boolean m28261a(List<C15318n> list, AnchorInfoModel anchorInfoModel, int i) {
            int i2;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                C15302a aVar = t2.f37349A;
                if (aVar != null) {
                    i2 = aVar.f37318a;
                } else {
                    i2 = 0;
                }
                if (i2 < anchorInfoModel.getMaxAnchorCheckCount()) {
                    C15302a aVar2 = t2.f37349A;
                    if (aVar2 != null) {
                        j = aVar2.f37319b;
                    } else {
                        j = 0;
                    }
                    if (currentTimeMillis - j >= anchorInfoModel.getAnchorTimeDelay() && ((i == 0 && C89219l.m154714a((Object) anchorInfoModel.getDetectionPage(), (Object) "detectionAllPage")) || (i == t2.f37365k && C89219l.m154714a((Object) t2.f37364j, (Object) anchorInfoModel.getDetectionPage())))) {
                        arrayList.add(t);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                C15318n nVar = (C15318n) obj;
                boolean a = C15363a.m28260a(nVar.f37364j);
                if (a) {
                    C15484f.m28491a("Helios-Log-Detection-Task", "skipCheckResourceByFloatingView page=" + nVar.f37364j + " hashCode=" + i, (String) null, 12);
                    if (!(!a)) {
                    }
                }
                arrayList2.add(obj);
            }
            ArrayList<C15318n> arrayList3 = arrayList2;
            for (C15318n nVar2 : arrayList3) {
                C15302a aVar3 = nVar2.f37349A;
                if (aVar3 != null) {
                    aVar3.f37318a++;
                    aVar3.f37319b = currentTimeMillis;
                    C15484f.m28491a("Helios-Log-Detection-Task", "checkSelfResourceIsRelease pageHashCode=" + i + " eventId=" + nVar2.f37356b + " eventName=" + nVar2.f37357c + ' ' + "eventStartTime=" + nVar2.f37366l + " eventAnchorReportCount=" + aVar3.f37318a, (String) null, 12);
                    if (aVar3.f37318a == anchorInfoModel.getMaxAnchorCheckCount()) {
                        nVar2.f37374t = 4;
                        nVar2.f37377w = true;
                        C15320o.m28228a(nVar2, false);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    public C15362b(C15298b bVar) {
        C89219l.m154719c(bVar, "");
        this.f37468c = bVar;
    }

    /* renamed from: a */
    private final void m28256a(String str, String str2) {
        Runnable runnable = this.f37467b.get(str);
        if (runnable != null) {
            HandlerThreadC15486g.m28499b().removeCallbacks(runnable);
            C15484f.m28491a("Helios-Log-Detection-Task", "removeAnchorTask detectionTaskKey=" + str + " removeTag=" + str2, (String) null, 12);
        }
    }

    /* renamed from: a */
    private static AnchorInfoModel m28253a(String str, int i) {
        T t;
        String a = C15297a.m28206a(i);
        Iterator<T> it = HeliosEnvImpl.INSTANCE.getAnchorConfigList().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if ((TextUtils.equals(t2.getAnchorPage(), str) || t2.getAnchorPage().length() == 0) && (t2.getAnchorLifeCycle().contains(a) || (i == 9 && t2.getSkipAnchorActions().contains("floating_window_view")))) {
                break;
            }
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.helios.sdk.anchor.AbstractC15369b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25108a(com.bytedance.helios.sdk.anchor.C15360a r9, int r10) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.anchor.p1093a.C15362b.mo25108a(com.bytedance.helios.sdk.anchor.a, int):void");
    }

    @Override // com.bytedance.helios.sdk.anchor.AbstractC15369b
    /* renamed from: a */
    public final void mo25109a(C15360a aVar, Integer num) {
        C89219l.m154719c(aVar, "");
        if (num != null && num.intValue() == 8) {
            List<C15372c> list = aVar.f37464c;
            if (list != null) {
                for (T t : list) {
                    m28256a(t.f37498c, C15297a.m28206a(8));
                    m28256a(t.toString(), C15297a.m28206a(8));
                }
            }
            List<AnchorInfoModel> anchorConfigList = HeliosEnvImpl.INSTANCE.getAnchorConfigList();
            ArrayList<AnchorInfoModel> arrayList = new ArrayList();
            for (T t2 : anchorConfigList) {
                if (C89219l.m154714a((Object) t2.getDetectionPage(), (Object) "detectionAllPage")) {
                    arrayList.add(t2);
                }
            }
            for (AnchorInfoModel anchorInfoModel : arrayList) {
                if (C89361p.m154870a((CharSequence) anchorInfoModel.getAnchorPage())) {
                    m28256a("AppBackgroundTask", C15297a.m28206a(8));
                } else {
                    Set<String> keySet = this.f37467b.keySet();
                    C89219l.m154709a((Object) keySet, "");
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (T t3 : keySet) {
                        T t4 = t3;
                        C89219l.m154709a((Object) t4, "");
                        if (C89361p.m154929e((CharSequence) t4, (CharSequence) anchorInfoModel.getAnchorPage())) {
                            arrayList2.add(t3);
                        }
                    }
                    for (String str : arrayList2) {
                        m28256a(str, C15297a.m28206a(8));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m28255a(String str, AnchorInfoModel anchorInfoModel, int i) {
        if (C15363a.m28260a(anchorInfoModel.getDetectionPage())) {
            C15484f.m28491a("Helios-Log-Detection-Task", "skipAddTaskByFloatingView page=" + anchorInfoModel.getDetectionPage() + " hashCode=" + i, (String) null, 12);
            return;
        }
        m28256a(str, "addDetectionTask");
        this.f37467b.put(str, new RunnableC15364b(anchorInfoModel, i));
        Runnable runnable = this.f37467b.get(str);
        if (runnable != null) {
            HandlerThreadC15486g.m28499b().postDelayed(runnable, anchorInfoModel.getAnchorTimeDelay());
        }
        C15484f.m28491a("Helios-Log-Detection-Task", "runAnchorTask detectionTaskKey=" + str + " hashCode=" + i, (String) null, 12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0086, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r12, (java.lang.Object) r0.mo25171e())) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        if (r0.f37678g == r15.f37463b) goto L_0x00f6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m28254a(com.bytedance.helios.api.config.AnchorInfoModel r14, com.bytedance.helios.sdk.anchor.C15360a r15, int r16) {
        /*
        // Method dump skipped, instructions count: 486
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.anchor.p1093a.C15362b.m28254a(com.bytedance.helios.api.config.AnchorInfoModel, com.bytedance.helios.sdk.anchor.a, int):void");
    }
}
