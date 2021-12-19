package com.bytedance.android.livesdk.chatroom.p489d;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.d.a */
public class C7413a {

    /* renamed from: h */
    private static C7413a f18385h;

    /* renamed from: a */
    public final List<AbstractC7258b> f18386a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f18387b = false;

    /* renamed from: c */
    public long f18388c = -1;

    /* renamed from: d */
    public long f18389d;

    /* renamed from: e */
    public EnterRoomConfig f18390e;

    /* renamed from: f */
    public final Map<String, Object> f18391f = new HashMap();

    /* renamed from: g */
    public final HandlerC11626a f18392g;

    /* renamed from: i */
    private final HandlerC11626a.AbstractC11627a f18393i;

    static {
        Covode.recordClassIndex(8180);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.d.a$b */
    public static class C7416b {

        /* renamed from: a */
        public static int f18398a = 100;

        static {
            Covode.recordClassIndex(8183);
        }
    }

    /* renamed from: b */
    public final long mo13618b() {
        long j = this.f18389d;
        long j2 = 0;
        if (this.f18388c > 0) {
            j2 = SystemClock.elapsedRealtime() - this.f18388c;
        }
        return j + j2;
    }

    /* renamed from: c */
    public final void mo13619c() {
        this.f18392g.removeMessages(C7416b.f18398a);
        for (AbstractC7258b bVar : this.f18386a) {
            mo13617a(bVar);
        }
    }

    public C7413a() {
        C74141 r2 = new HandlerC11626a.AbstractC11627a() {
            /* class com.bytedance.android.livesdk.chatroom.p489d.C7413a.C74141 */

            static {
                Covode.recordClassIndex(8181);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
            public final void handleMsg(Message message) {
                if (message.obj instanceof C7415a) {
                    C7415a aVar = (C7415a) message.obj;
                    if (aVar.f18397c == C7416b.f18398a) {
                        C7413a.this.f18386a.remove(aVar.f18395a);
                    }
                    if (aVar.f18395a != null) {
                        aVar.f18395a.mo13461a(aVar.f18396b);
                    }
                }
            }
        };
        this.f18393i = r2;
        this.f18392g = new HandlerC11626a(Looper.getMainLooper(), r2);
    }

    /* renamed from: a */
    public static C7413a m15292a() {
        MethodCollector.m26663i(4511);
        if (f18385h == null) {
            synchronized (C7413a.class) {
                try {
                    if (f18385h == null) {
                        f18385h = new C7413a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4511);
                    throw th;
                }
            }
        }
        C7413a aVar = f18385h;
        MethodCollector.m26664o(4511);
        return aVar;
    }

    /* renamed from: a */
    public final void mo13617a(AbstractC7258b bVar) {
        if (bVar != null) {
            Message obtain = Message.obtain();
            obtain.what = C7416b.f18398a;
            obtain.obj = new C7415a(C7416b.f18398a, bVar, this.f18391f);
            this.f18392g.sendMessageDelayed(obtain, bVar.f18059a - mo13618b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.d.a$a */
    public static class C7415a {

        /* renamed from: a */
        public AbstractC7258b f18395a;

        /* renamed from: b */
        public Map<String, Object> f18396b;

        /* renamed from: c */
        public int f18397c;

        static {
            Covode.recordClassIndex(8182);
        }

        public C7415a(int i, AbstractC7258b bVar, Map<String, Object> map) {
            this.f18397c = i;
            this.f18395a = bVar;
            this.f18396b = map;
        }
    }
}
