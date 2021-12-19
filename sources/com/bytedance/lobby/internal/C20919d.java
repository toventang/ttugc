package com.bytedance.lobby.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.p036g.C0692e;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.auth.C20886c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lobby.internal.d */
public final class C20919d {

    /* renamed from: a */
    private static volatile C20919d f49471a;

    /* renamed from: b */
    private Map<String, AbstractC20888d> f49472b = new C0484a();

    static {
        Covode.recordClassIndex(24525);
    }

    private C20919d() {
    }

    /* renamed from: a */
    public static C20919d m39339a() {
        MethodCollector.m26663i(6823);
        if (f49471a == null) {
            synchronized (C20919d.class) {
                try {
                    if (f49471a == null) {
                        f49471a = new C20919d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6823);
                    throw th;
                }
            }
        }
        C20919d dVar = f49471a;
        MethodCollector.m26664o(6823);
        return dVar;
    }

    /* renamed from: a */
    public final boolean mo34368a(String str) {
        AbstractC20888d b = mo34369b(str);
        if (b == null || !b.mo34350t_()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo34366a(AbstractC20888d dVar) {
        MethodCollector.m26663i(6967);
        this.f49472b.put(dVar.mo34362e().f49402b, dVar);
        MethodCollector.m26664o(6967);
    }

    /* renamed from: b */
    public final synchronized AbstractC20888d mo34369b(String str) {
        MethodCollector.m26663i(7120);
        LobbyCore.tryInitProviderConfig();
        AbstractC20888d dVar = this.f49472b.get(str);
        if (dVar != null) {
            dVar.mo34363f();
            MethodCollector.m26664o(7120);
            return dVar;
        }
        MethodCollector.m26664o(7120);
        return null;
    }

    /* renamed from: a */
    public static void m39340a(C20886c cVar) {
        Bundle bundle;
        MethodCollector.m26663i(7118);
        if (cVar.f49389d == null) {
            bundle = new Bundle();
        } else {
            bundle = cVar.f49389d;
        }
        bundle.putString("provider_id", cVar.f49387b);
        bundle.putInt("action_type", 1);
        if (cVar.f49388c != null) {
            C20914a a = C20914a.m39334a();
            String str = cVar.f49387b;
            AbstractC20884a aVar = cVar.f49388c;
            synchronized (a.f49464a) {
                try {
                    C0692e<String, Integer> eVar = new C0692e<>(str, 1);
                    List<AbstractC20884a> list = a.f49464a.get(eVar);
                    if (list == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar);
                        a.f49464a.put(eVar, arrayList);
                    } else if (!list.contains(aVar)) {
                        list.add(aVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7118);
                    throw th;
                }
            }
        }
        Intent intent = new Intent(cVar.f49386a, LobbyInvisibleActivity.class);
        intent.putExtras(bundle);
        cVar.f49386a.startActivityForResult(intent, 101);
        MethodCollector.m26664o(7118);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r5 != null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34367a(java.util.List<java.lang.String> r5, int r6) {
        /*
            r4 = this;
            boolean r0 = com.bytedance.lobby.C20879a.f49364a
            r3 = 0
            if (r0 == 0) goto L_0x004c
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x003f
        L_0x000d:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0014
            r3 = 1
        L_0x0014:
            com.bytedance.lobby.internal.LobbyCore.tryInitProviderConfig()
            java.util.Map<java.lang.String, com.bytedance.lobby.auth.d> r0 = r4.f49472b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = r2.next()
            com.bytedance.lobby.auth.d r1 = (com.bytedance.lobby.auth.AbstractC20888d) r1
            if (r3 == 0) goto L_0x003b
            com.bytedance.lobby.d r0 = r1.mo34362e()
            java.lang.String r0 = r0.f49402b
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0021
        L_0x003b:
            r1.mo34324a(r6)
            goto L_0x0021
        L_0x003f:
            r1 = 0
        L_0x0040:
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x000d
            r5.get(r1)
            int r1 = r1 + 1
            goto L_0x0040
        L_0x004c:
            if (r5 == 0) goto L_0x0014
            goto L_0x000d
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.internal.C20919d.mo34367a(java.util.List, int):void");
    }
}
