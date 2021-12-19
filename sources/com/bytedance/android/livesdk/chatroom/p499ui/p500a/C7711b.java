package com.bytedance.android.livesdk.chatroom.p499ui.p500a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.a.b */
public final class C7711b {

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C7711b> f19174b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final C7712a f19175c = new C7712a((byte) 0);

    /* renamed from: a */
    public final ArrayList<C89378p<Integer, WeakReference<AbstractC7713b>>> f19176a = new ArrayList<>();

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.a.b$b */
    public interface AbstractC7713b {
        static {
            Covode.recordClassIndex(8508);
        }

        /* renamed from: l */
        void mo12711l();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.a.b$a */
    public static final class C7712a {
        static {
            Covode.recordClassIndex(8507);
        }

        private C7712a() {
        }

        public /* synthetic */ C7712a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C7711b m15759a(String str) {
            MethodCollector.m26663i(3152);
            C89219l.m154721d(str, "");
            if (!C7711b.f19174b.containsKey(str)) {
                synchronized (C7711b.class) {
                    try {
                        if (!C7711b.f19174b.containsKey(str)) {
                            C7711b.f19174b.put(str, new C7711b());
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(3152);
                        throw th;
                    }
                }
            }
            C7711b bVar = C7711b.f19174b.get(str);
            if (bVar == null) {
                C89219l.m154715b();
            }
            C7711b bVar2 = bVar;
            MethodCollector.m26664o(3152);
            return bVar2;
        }
    }

    static {
        Covode.recordClassIndex(8506);
    }

    /* renamed from: a */
    public final void mo13989a(AbstractC7713b bVar, int i) {
        AbstractC7713b bVar2;
        if (bVar != null) {
            this.f19176a.add(new C89378p<>(Integer.valueOf(i), new WeakReference(bVar)));
        }
        int size = this.f19176a.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f19176a.get(i2).getFirst().intValue() < i && (bVar2 = this.f19176a.get(i2).getSecond().get()) != null) {
                bVar2.mo12711l();
            }
        }
    }
}
