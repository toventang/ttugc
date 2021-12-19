package com.bytedance.p1399im.core.p1408d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19771f;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19863d;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20046v;
import com.bytedance.p1399im.core.p1404a.C19483d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.bytedance.im.core.d.f */
public final class C19631f {

    /* renamed from: a */
    static int f46653a = 1;

    /* renamed from: b */
    public static ConcurrentHashMap<String, HashMap<Long, C19589ao>> f46654b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static boolean f46655c;

    /* renamed from: d */
    static List<String> f46656d = new ArrayList();

    /* renamed from: e */
    static final Handler f46657e = new HandlerC19636d(Looper.getMainLooper());

    /* renamed from: f */
    static AbstractC19667p f46658f = new C19633b();

    /* renamed from: g */
    public static final C19631f f46659g = new C19631f();

    /* renamed from: com.bytedance.im.core.d.f$b */
    public static final class C19633b extends AbstractC19520a {
        static {
            Covode.recordClassIndex(22477);
        }

        C19633b() {
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19667p, com.bytedance.p1399im.core.p1408d.AbstractC19520a
        /* renamed from: a */
        public final void mo28007a(Map<String, C19638h> map) {
            super.mo28007a(map);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19602b, com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28002a(C19638h hVar, int i) {
            C89219l.m154719c(hVar, "");
            super.mo28002a(hVar, i);
            if (!C19631f.f46654b.containsKey(hVar.getConversationId())) {
                List<String> list = C19631f.f46656d;
                String conversationId = hVar.getConversationId();
                C89219l.m154709a((Object) conversationId, "");
                list.add(conversationId);
            }
            if (C19631f.f46657e.hasMessages(C19631f.f46653a)) {
                C19631f.f46657e.sendEmptyMessageDelayed(C19631f.f46653a, 5000);
            }
        }
    }

    private C19631f() {
    }

    /* renamed from: com.bytedance.im.core.d.f$a */
    static final class RunnableC19632a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f46660a;

        static {
            Covode.recordClassIndex(22476);
        }

        RunnableC19632a(C89233z.C89238e eVar) {
            this.f46660a = eVar;
        }

        public final void run() {
            C20014q a = C20014q.m37816a();
            new ArrayList(this.f46660a.element);
            a.mo31910c();
        }
    }

    static {
        Covode.recordClassIndex(22475);
    }

    /* renamed from: a */
    public static void m36665a() {
        C19483d a = C19483d.m36365a();
        C89219l.m154709a((Object) a, "");
        if (a.mo31141b().f46228aJ) {
            C19640j a2 = C19640j.m36671a();
            C89219l.m154709a((Object) a2, "");
            List<C19638h> b = a2.mo31596b();
            if (!(b == null || b.isEmpty())) {
                f46655c = true;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) b, 10));
                for (T t : b) {
                    C89219l.m154709a((Object) t, "");
                    arrayList.add(t.getConversationId());
                }
                m36668a(arrayList, "sdk_init");
            }
        }
    }

    /* renamed from: com.bytedance.im.core.d.f$c */
    static final class RunnableC19634c implements Runnable {

        /* renamed from: a */
        public static final RunnableC19634c f46661a = new RunnableC19634c();

        static {
            Covode.recordClassIndex(22478);
        }

        RunnableC19634c() {
        }

        public final void run() {
            ArrayList arrayList;
            C19640j a = C19640j.m36671a();
            C89219l.m154709a((Object) a, "");
            List<C19638h> b = a.mo31596b();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C19638h hVar : b) {
                C89219l.m154709a((Object) hVar, "");
                if (hVar.getLastMessage() != null) {
                    arrayList2.add(hVar.getLastMessage());
                    arrayList3.add(hVar.getConversationId());
                }
            }
            ArrayList<List> arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            loop1:
            while (true) {
                arrayList = null;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    if (arrayList.size() == 100) {
                        arrayList4.add(arrayList);
                    }
                }
                break loop1;
            }
            if (arrayList != null) {
                arrayList4.add(arrayList);
            }
            for (List list : arrayList4) {
                C19631f.f46654b.putAll(C19771f.m37152a(list));
            }
            C20002j.m37778a(" ConvReadInfoHelperimczy loadAllConReadInfo readIndexMap = " + C19631f.f46654b);
            C20046v.m37932a(new RunnableC19637g(new AbstractC89171a<C89391z>(C20014q.m37816a()) {
                /* class com.bytedance.p1399im.core.p1408d.C19631f.RunnableC19634c.C196351 */

                static {
                    Covode.recordClassIndex(22479);
                }

                @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
                public final String getName() {
                    return "onQueryReadInfo";
                }

                @Override // p4600h.p4611f.p4613b.AbstractC89208c
                public final String getSignature() {
                    return "onQueryReadInfo()V";
                }

                @Override // p4600h.p4611f.p4613b.AbstractC89208c
                public final AbstractC89278d getOwner() {
                    return C89204ab.m154669a(C20014q.class);
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final void invoke() {
                    ((C20014q) this.receiver).mo31903b();
                }
            }));
            if (!C19631f.f46655c) {
                C19631f.m36665a();
            }
            C19640j.m36671a().mo31591a(C19631f.f46658f);
        }
    }

    /* renamed from: com.bytedance.im.core.d.f$d */
    public static final class HandlerC19636d extends Handler {
        static {
            Covode.recordClassIndex(22480);
        }

        HandlerC19636d(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C89219l.m154719c(message, "");
            if (message.what == C19631f.f46653a) {
                C19631f.m36668a(C19631f.f46656d, "sdk_con_update");
                C19631f.f46656d.clear();
            }
        }
    }

    /* renamed from: a */
    public static void m36666a(Collection<String> collection) {
        List<Long> list;
        C19483d a = C19483d.m36365a();
        C89219l.m154709a((Object) a, "");
        if (a.mo31141b().f46228aJ) {
            HashMap hashMap = new HashMap();
            for (String str : collection) {
                HashMap<Long, C19589ao> hashMap2 = f46654b.get(str);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                }
                C89219l.m154709a((Object) hashMap2, "");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<Long, C19589ao> entry : hashMap2.entrySet()) {
                    C19638h a2 = C19640j.m36671a().mo31586a(str);
                    if (a2 == null || (list = a2.getMemberIds()) == null) {
                        list = C89086z.INSTANCE;
                    }
                    long j = entry.getValue().f46506b;
                    if ((!list.isEmpty()) && !list.contains(Long.valueOf(j))) {
                        arrayList.add(Long.valueOf(j));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashMap2.remove(it.next());
                }
                hashMap.put(str, arrayList);
            }
            if (!hashMap.isEmpty()) {
                C20002j.m37778a(" ConvReadInfoHelpercheckRemoveNotMemberData deleteMap = ".concat(String.valueOf(hashMap)));
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    C19771f.m37149a((String) entry2.getKey(), (List) entry2.getValue());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m36667a(HashMap<String, HashMap<Long, C19589ao>> hashMap) {
        C19483d a = C19483d.m36365a();
        C89219l.m154709a((Object) a, "");
        if (a.mo31141b().f46228aJ && (!hashMap.isEmpty())) {
            C20002j.m37778a(" ConvReadInfoHelperimczy callUpdateReadIndex = ".concat(String.valueOf(hashMap)));
            C89233z.C89238e eVar = new C89233z.C89238e();
            T t = (T) hashMap.keySet();
            C89219l.m154709a((Object) t, "");
            eVar.element = t;
            for (String str : eVar.element) {
                C19771f.m37157b(str, hashMap.get(str));
            }
            C20046v.m37932a(new RunnableC19632a(eVar));
        }
    }

    /* renamed from: a */
    public static void m36668a(List<String> list, String str) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(str, "");
        C19483d a = C19483d.m36365a();
        C89219l.m154709a((Object) a, "");
        if (a.mo31141b().f46228aJ) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list) {
                C19638h a2 = C19640j.m36671a().mo31586a(str2);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C19638h hVar = (C19638h) it.next();
                C89219l.m154709a((Object) hVar, "");
                if (hVar.getLastMessage() != null) {
                    arrayList.add(hVar.getLastMessage());
                }
            }
            C20002j.m37779a(" ConvReadInfoHelperimczy updateNetReadInfo conList = ".concat(String.valueOf(list)), new Exception());
            C19863d.m37399a();
            C19863d.m37400a(arrayList, str, null);
        }
    }
}
