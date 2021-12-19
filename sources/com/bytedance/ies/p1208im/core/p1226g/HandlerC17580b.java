package com.bytedance.ies.p1208im.core.p1226g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.g.b */
public final class HandlerC17580b extends Handler {

    /* renamed from: b */
    private static final C17581a f42041b = new C17581a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f42042a = C89250i.m154773a((AbstractC89171a) C17582b.f42043a);

    static {
        Covode.recordClassIndex(20069);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, Set<C17587d>> mo28019a() {
        return (Map) this.f42042a.getValue();
    }

    /* renamed from: com.bytedance.ies.im.core.g.b$a */
    static final class C17581a {
        static {
            Covode.recordClassIndex(20070);
        }

        private C17581a() {
        }

        public /* synthetic */ C17581a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.im.core.g.b$b */
    static final class C17582b extends AbstractC89220m implements AbstractC89171a<Map<String, Set<C17587d>>> {

        /* renamed from: a */
        public static final C17582b f42043a = new C17582b();

        static {
            Covode.recordClassIndex(20071);
        }

        C17582b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Set<C17587d>> invoke() {
            return new LinkedHashMap();
        }
    }

    public HandlerC17580b() {
        super(Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo28022b() {
        C17415a.m32255b().mo27836b("MsgSender_MQ", "clear");
        mo28019a().clear();
    }

    /* renamed from: a */
    private final void m32606a(C17587d dVar) {
        C17415a.m32255b().mo27827a("MsgSender_MQ", "cancelTimeOut[" + dVar.f42053a + "]: " + dVar);
        removeMessages(dVar.f42063k);
    }

    public final void handleMessage(Message message) {
        C89219l.m154721d(message, "");
        C17415a.m32255b().mo27836b("MsgSender_MQ", "handleMessage[" + message.obj + ']');
        Object obj = message.obj;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        mo28020a((String) obj, true, C19672u.m36755a().mo31630a("MQ timeout").f46736a);
    }

    /* renamed from: a */
    private final void m32607a(Map<String, Set<C17587d>> map, C19638h hVar) {
        Set<C17587d> set;
        Integer num;
        MethodCollector.m26663i(6979);
        synchronized (this) {
            try {
                set = map.get(hVar.getConversationId());
            } finally {
                MethodCollector.m26664o(6979);
            }
        }
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("notifyPending[").append(hVar.getConversationId()).append("]: ");
        if (set != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        b.mo27836b("MsgSender_MQ", append.append(num).toString());
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                it.next().mo28026a(hVar);
            }
            return;
        }
        MethodCollector.m26664o(6979);
    }

    /* renamed from: b */
    private final void m32609b(Map<String, Set<C17587d>> map, C19638h hVar) {
        Set<C17587d> remove;
        Integer num;
        MethodCollector.m26663i(7134);
        synchronized (this) {
            try {
                remove = map.remove(hVar.getConversationId());
            } finally {
                MethodCollector.m26664o(7134);
            }
        }
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("notifySend[").append(hVar.getConversationId()).append("]: ");
        if (remove != null) {
            num = Integer.valueOf(remove.size());
        } else {
            num = null;
        }
        b.mo27836b("MsgSender_MQ", append.append(num).toString());
        if (remove != null) {
            for (T t : remove) {
                m32606a(t);
                t.mo28027a(hVar, true);
            }
            return;
        }
        MethodCollector.m26664o(7134);
    }

    /* renamed from: a */
    private final void m32608a(Map<String, Set<C17587d>> map, String str, C19672u uVar) {
        Set<C17587d> remove;
        Integer num;
        C19672u uVar2;
        MethodCollector.m26663i(7131);
        synchronized (this) {
            try {
                remove = map.remove(str);
            } finally {
                MethodCollector.m26664o(7131);
            }
        }
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("notifyError[").append(str).append("]: ");
        if (remove != null) {
            num = Integer.valueOf(remove.size());
        } else {
            num = null;
        }
        b.mo27836b("MsgSender_MQ", append.append(num).append(", ").append(uVar).toString());
        if (remove != null) {
            for (T t : remove) {
                m32606a(t);
                if (uVar == null) {
                    uVar2 = C19672u.m36755a().mo31630a("UnKnown error").f46736a;
                } else {
                    uVar2 = uVar;
                }
                C89219l.m154716b(uVar2, "");
                t.mo28028a(uVar2);
            }
            return;
        }
        MethodCollector.m26664o(7131);
    }

    /* renamed from: a */
    public final void mo28020a(String str, boolean z, C19672u uVar) {
        Boolean bool;
        C89219l.m154721d(str, "");
        C19638h a = C19640j.m36671a().mo31586a(str);
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("dequeue[").append(str).append("], ");
        if (a != null) {
            bool = Boolean.valueOf(a.isTemp());
        } else {
            bool = null;
        }
        b.mo27836b("MsgSender_MQ", append.append(bool).append(", ").append(z).toString());
        if (a == null || (a.isTemp() && z)) {
            m32608a(mo28019a(), str, uVar);
        } else if (a.isTemp()) {
            m32607a(mo28019a(), a);
        } else {
            m32609b(mo28019a(), a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo28021a(Map<String, Set<C17587d>> map, String str, C17587d dVar) {
        Integer num;
        MethodCollector.m26663i(6835);
        Set<C17587d> set = map.get(str);
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("putPayload[").append(str).append("]: ");
        if (set != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        b.mo27827a("MsgSender_MQ", append.append(num).toString());
        if (set == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(dVar);
            map.put(str, linkedHashSet);
            MethodCollector.m26664o(6835);
            return;
        }
        set.add(dVar);
        MethodCollector.m26664o(6835);
    }
}
