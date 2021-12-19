package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.server.AbstractC13783d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.bytedance.common.wschannel.server.f */
public final class C13786f {

    /* renamed from: a */
    private static volatile C13772b f33529a;

    static {
        Covode.recordClassIndex(15834);
    }

    /* renamed from: a */
    public static C13772b m24873a(Context context) {
        MethodCollector.m26663i(12433);
        if (f33529a == null) {
            synchronized (C13772b.class) {
                try {
                    if (f33529a == null) {
                        HandlerThread handlerThread = new HandlerThread("wschannel");
                        handlerThread.start();
                        C13771a aVar = new C13771a();
                        C13789g gVar = new C13789g(context, aVar);
                        C13772b bVar = new C13772b(context, handlerThread.getLooper(), new AbstractC13785e() {
                            /* class com.bytedance.common.wschannel.server.C13786f.C137882 */

                            static {
                                Covode.recordClassIndex(15836);
                            }

                            @Override // com.bytedance.common.wschannel.server.AbstractC13785e
                            /* renamed from: a */
                            public final void mo22199a(Map<Integer, IWsApp> map) {
                            }

                            @Override // com.bytedance.common.wschannel.server.AbstractC13785e
                            /* renamed from: a */
                            public final Map<Integer, IWsApp> mo22198a() {
                                return Collections.emptyMap();
                            }
                        }, aVar, gVar, new AbstractC13783d() {
                            /* class com.bytedance.common.wschannel.server.C13786f.C137871 */

                            static {
                                Covode.recordClassIndex(15835);
                            }

                            @Override // com.bytedance.common.wschannel.server.AbstractC13783d
                            /* renamed from: a */
                            public final void mo22195a() {
                            }

                            @Override // com.bytedance.common.wschannel.server.AbstractC13783d
                            /* renamed from: a */
                            public final void mo22196a(AbstractC13783d.AbstractC13784a aVar) {
                            }

                            @Override // com.bytedance.common.wschannel.server.AbstractC13783d
                            /* renamed from: b */
                            public final boolean mo22197b() {
                                return true;
                            }
                        });
                        gVar.f33530a = bVar;
                        f33529a = bVar;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12433);
                    throw th;
                }
            }
        }
        C13772b bVar2 = f33529a;
        MethodCollector.m26664o(12433);
        return bVar2;
    }
}
