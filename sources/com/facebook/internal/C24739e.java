package com.facebook.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AbstractC24265e;
import com.facebook.C24872m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.e */
public final class C24739e implements AbstractC24265e {

    /* renamed from: b */
    private static final String f58710b = C24739e.class.getSimpleName();

    /* renamed from: c */
    private static Map<Integer, AbstractC24740a> f58711c = new HashMap();

    /* renamed from: a */
    public Map<Integer, AbstractC24740a> f58712a = new HashMap();

    /* renamed from: com.facebook.internal.e$a */
    public interface AbstractC24740a {
        static {
            Covode.recordClassIndex(28893);
        }

        /* renamed from: a */
        boolean mo40568a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.e$b */
    public enum EnumC24741b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11);
        

        /* renamed from: a */
        private final int f58714a;

        public final int toRequestCode() {
            C24699ae.m47299a();
            return C24872m.f59048h + this.f58714a;
        }

        static {
            Covode.recordClassIndex(28894);
        }

        private EnumC24741b(int i) {
            this.f58714a = i;
        }
    }

    static {
        Covode.recordClassIndex(28892);
    }

    /* renamed from: a */
    private static synchronized AbstractC24740a m47367a(Integer num) {
        AbstractC24740a aVar;
        synchronized (C24739e.class) {
            MethodCollector.m26663i(8439);
            aVar = f58711c.get(num);
            MethodCollector.m26664o(8439);
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo40567b(int i, AbstractC24740a aVar) {
        C24699ae.m47301a(aVar, "callback");
        this.f58712a.put(Integer.valueOf(i), aVar);
    }

    /* renamed from: a */
    public static synchronized void m47368a(int i, AbstractC24740a aVar) {
        synchronized (C24739e.class) {
            MethodCollector.m26663i(8438);
            C24699ae.m47301a(aVar, "callback");
            if (f58711c.containsKey(Integer.valueOf(i))) {
                MethodCollector.m26664o(8438);
                return;
            }
            f58711c.put(Integer.valueOf(i), aVar);
            MethodCollector.m26664o(8438);
        }
    }

    @Override // com.facebook.AbstractC24265e
    /* renamed from: a */
    public final boolean mo40035a(int i, int i2, Intent intent) {
        AbstractC24740a aVar = this.f58712a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.mo40568a(i2, intent);
        }
        AbstractC24740a a = m47367a(Integer.valueOf(i));
        if (a != null) {
            return a.mo40568a(i2, intent);
        }
        return false;
    }
}
