package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19866e;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19585al;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.im.core.internal.b.a.d */
public class C19863d {

    /* renamed from: c */
    private static volatile C19863d f47163c;

    /* renamed from: a */
    public List<C19538ai> f47164a = new CopyOnWriteArrayList();

    /* renamed from: b */
    Handler f47165b = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19863d.HandlerC198641 */

        static {
            Covode.recordClassIndex(22708);
        }

        public final void handleMessage(Message message) {
            if (message.what == 100) {
                C19930x.m37536a();
                List<C19538ai> list = C19863d.this.f47164a;
                C198651 r1 = new AbstractC19479b<List<C19585al>>() {
                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19863d.HandlerC198641.C198651 */

                    static {
                        Covode.recordClassIndex(22709);
                    }

                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final void mo27860a(C19672u uVar) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final /* synthetic */ void mo27861a(List<C19585al> list) {
                        Iterator<Object> it = C20014q.m37816a().f47562h.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                };
                C19863d.m37399a();
                C19863d.m37400a(list, "on_get_ws_msg", r1);
                C19863d.this.f47164a.clear();
            }
        }
    };

    static {
        Covode.recordClassIndex(22707);
    }

    private C19863d() {
    }

    /* renamed from: a */
    public static C19863d m37399a() {
        MethodCollector.m26663i(10871);
        if (f47163c == null) {
            synchronized (C19863d.class) {
                try {
                    if (f47163c == null) {
                        f47163c = new C19863d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10871);
                    throw th;
                }
            }
        }
        C19863d dVar = f47163c;
        MethodCollector.m26664o(10871);
        return dVar;
    }

    /* renamed from: a */
    public static void m37400a(List<C19538ai> list, String str, AbstractC19479b<List<C19585al>> bVar) {
        ArrayList arrayList;
        C19866e eVar = new C19866e();
        C19866e.C198671 r4 = new AbstractC19479b<List<C19585al>>(new ArrayList(), bVar) {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19866e.C198671 */

            /* renamed from: a */
            final /* synthetic */ List f47169a;

            /* renamed from: b */
            final /* synthetic */ AbstractC19479b f47170b;

            static {
                Covode.recordClassIndex(22711);
            }

            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final void mo27860a(C19672u uVar) {
                AbstractC19479b bVar;
                C19866e eVar = C19866e.this;
                eVar.f47168a--;
                if (C19866e.this.f47168a <= 0 && this.f47169a.isEmpty() && (bVar = this.f47170b) != null) {
                    bVar.mo27860a(uVar);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final /* synthetic */ void mo27861a(List<C19585al> list) {
                AbstractC19479b bVar;
                C19866e eVar = C19866e.this;
                eVar.f47168a--;
                this.f47169a.addAll(list);
                if (C19866e.this.f47168a <= 0 && (bVar = this.f47170b) != null) {
                    bVar.mo27861a(this.f47169a);
                }
            }

            {
                this.f47169a = r2;
                this.f47170b = r3;
            }
        };
        ArrayList<List<C19538ai>> arrayList2 = new ArrayList();
        loop0:
        while (true) {
            arrayList = null;
            for (C19538ai aiVar : list) {
                if (aiVar.getSender() == C19483d.m36365a().f46157b.mo27953a()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aiVar);
                    if (arrayList.size() == 100) {
                        arrayList2.add(arrayList);
                    }
                }
            }
            break loop0;
        }
        for (List<C19538ai> list2 : arrayList2) {
            eVar.f47168a++;
            new C19861c(r4).mo31756a(list2, str);
        }
        if (arrayList != null) {
            eVar.f47168a++;
            new C19861c(r4).mo31756a(arrayList, str);
        }
    }
}
