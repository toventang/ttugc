package com.bytedance.android.livesdk.p425aa;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.p425aa.p427b.AbstractC6508b;
import com.bytedance.android.livesdk.p425aa.p427b.C6507a;
import com.bytedance.android.livesdk.p425aa.p427b.C6509c;
import com.bytedance.android.livesdk.p425aa.p427b.C6510d;
import com.bytedance.android.livesdk.p425aa.p427b.C6511e;
import com.bytedance.android.livesdk.p425aa.p427b.C6514f;
import com.bytedance.android.livesdk.p425aa.p427b.C6516h;
import com.bytedance.android.livesdk.p425aa.p427b.C6518i;
import com.bytedance.android.livesdk.p425aa.p428c.C6526e;
import com.bytedance.android.livesdk.p425aa.p428c.C6527f;
import com.bytedance.android.livesdk.p425aa.p428c.C6528g;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6531i;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p425aa.p428c.C6534l;
import com.bytedance.android.livesdk.p425aa.p428c.C6537o;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.aa.b */
public final class C6501b {

    /* renamed from: b */
    public static final AbstractC89244h f16158b = C89250i.m154773a((AbstractC89171a) C6504c.f16168a);

    /* renamed from: c */
    public static final AbstractC89244h f16159c = C89250i.m154773a((AbstractC89171a) C6503b.f16167a);

    /* renamed from: d */
    public static final C6502a f16160d = new C6502a((byte) 0);

    /* renamed from: h */
    private static final Map<Class<? extends Object>, AbstractC6508b<? extends Object>> f16161h = C89041ag.m154421a(C89387v.m154943a(C6537o.class, new C6518i()), C89387v.m154943a(C6534l.class, new C6514f()), C89387v.m154943a(C6526e.class, new C6507a()), C89387v.m154943a(C6527f.class, new C6509c()), C89387v.m154943a(C6528g.class, new C6510d()), C89387v.m154943a(C6529h.class, new C6511e()));

    /* renamed from: i */
    private static final C6516h f16162i = new C6516h();

    /* renamed from: a */
    public final String f16163a;

    /* renamed from: e */
    private final List<Object> f16164e = new ArrayList();

    /* renamed from: f */
    private final Map<String, String> f16165f = new LinkedHashMap();

    /* renamed from: g */
    private final boolean f16166g;

    /* renamed from: com.bytedance.android.livesdk.aa.b$a */
    public static final class C6502a {
        static {
            Covode.recordClassIndex(7238);
        }

        /* renamed from: a */
        public static Handler m13947a() {
            return (Handler) C6501b.f16158b.getValue();
        }

        /* renamed from: b */
        public static ExecutorService m13950b() {
            return (ExecutorService) C6501b.f16159c.getValue();
        }

        private C6502a() {
        }

        public /* synthetic */ C6502a(byte b) {
            this();
        }

        /* renamed from: b */
        public static C6501b m13949b(String str) {
            C89219l.m154721d(str, "");
            return new C6501b(str, false);
        }

        /* renamed from: a */
        public static C6501b m13948a(String str) {
            C89219l.m154721d(str, "");
            return new C6501b(str, true);
        }
    }

    /* renamed from: a */
    public final void mo12653a(Object obj) {
        if (obj != null) {
            this.f16164e.add(obj);
        }
    }

    /* renamed from: a */
    public final C6501b mo12651a(String str, String str2) {
        C89219l.m154721d(str, "");
        m13920a(str, (Object) str2);
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12650a(String str, Number number) {
        C89219l.m154721d(str, "");
        m13920a(str, (Object) number);
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12646a(String str, long j) {
        C89219l.m154721d(str, "");
        m13920a(str, (Object) Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12647a(String str, Boolean bool) {
        C89219l.m154721d(str, "");
        m13920a(str, (Object) bool);
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12649a(String str, Float f) {
        C89219l.m154721d(str, "");
        if (f != null && !Float.isNaN(f.floatValue()) && !Float.isInfinite(f.floatValue())) {
            this.f16165f.put(str, String.valueOf(f.floatValue()));
        }
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12648a(String str, Double d) {
        C89219l.m154721d(str, "");
        if (d != null && !Double.isNaN(d.doubleValue()) && !Double.isInfinite(d.doubleValue())) {
            this.f16165f.put(str, String.valueOf(d.doubleValue()));
        }
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12652a(Map<String, String> map) {
        if (map != null) {
            this.f16165f.putAll(map);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.aa.b$d */
    public static final class RunnableC6505d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6501b f16169a;

        static {
            Covode.recordClassIndex(7241);
        }

        RunnableC6505d(C6501b bVar) {
            this.f16169a = bVar;
        }

        public final void run() {
            this.f16169a.mo12657c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.aa.b$e */
    public static final class RunnableC6506e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6501b f16170a;

        static {
            Covode.recordClassIndex(7242);
        }

        RunnableC6506e(C6501b bVar) {
            this.f16170a = bVar;
        }

        public final void run() {
            this.f16170a.mo12657c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.aa.b$b */
    static final class C6503b extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C6503b f16167a = new C6503b();

        static {
            Covode.recordClassIndex(7239);
        }

        C6503b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            return C40780g.m82242a(C40787l.m82269a(EnumC40793o.SERIAL).mo70028a());
        }
    }

    /* renamed from: d */
    public final Map<String, String> mo12659d() {
        mo12639a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m13921b(linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: com.bytedance.android.livesdk.aa.b$c */
    static final class C6504c extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C6504c f16168a = new C6504c();

        static {
            Covode.recordClassIndex(7240);
        }

        C6504c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            HandlerThread handlerThread = new HandlerThread("live_logger");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    /* renamed from: a */
    public final C6501b mo12639a() {
        m13919a((C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class));
        return this;
    }

    /* renamed from: b */
    public final void mo12655b() {
        if (ThreadPoolOptExperiment.INSTANCE.isEnableLog()) {
            C6502a.m13950b().submit(new RunnableC6505d(this));
        } else {
            C6502a.m13947a().post(new RunnableC6506e(this));
        }
    }

    static {
        Covode.recordClassIndex(7237);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        if (p4600h.p4622m.C89361p.m154872a("us", r3, true) != false) goto L_0x00e0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12657c() {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p425aa.C6501b.mo12657c():void");
    }

    /* renamed from: a */
    private final C6501b m13919a(C6529h hVar) {
        mo12653a((Object) hVar);
        return this;
    }

    /* renamed from: b */
    public final C6501b mo12654b(String str) {
        mo12651a("event_belong", str);
        return this;
    }

    /* renamed from: c */
    public final C6501b mo12656c(String str) {
        mo12651a("event_type", str);
        return this;
    }

    /* renamed from: d */
    public final C6501b mo12658d(String str) {
        mo12651a("event_page", str);
        return this;
    }

    /* renamed from: e */
    public final C6501b mo12660e(String str) {
        mo12651a("event_module", str);
        return this;
    }

    /* renamed from: f */
    public final C6501b mo12661f(String str) {
        mo12651a("action_type", str);
        return this;
    }

    /* renamed from: g */
    public final C6501b mo12662g(String str) {
        mo12651a("anchor_id", str);
        return this;
    }

    /* renamed from: h */
    public final C6501b mo12663h(String str) {
        mo12651a("room_id", str);
        return this;
    }

    /* renamed from: b */
    private final void m13921b(Map<String, String> map) {
        for (T t : this.f16164e) {
            AbstractC6508b<? extends Object> bVar = f16161h.get(t.getClass());
            if (!(bVar instanceof AbstractC6508b)) {
                bVar = null;
            }
            AbstractC6508b<? extends Object> bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.mo12666a(map, t);
            }
        }
    }

    /* renamed from: a */
    public final C6501b mo12640a(C6526e eVar) {
        mo12653a((Object) eVar);
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12641a(C6527f fVar) {
        mo12653a((Object) fVar);
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12642a(C6528g gVar) {
        mo12653a((Object) gVar);
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12643a(DataChannel dataChannel) {
        C6529h hVar;
        if (dataChannel != null) {
            hVar = (C6529h) dataChannel.mo28318b(C6531i.class);
        } else {
            hVar = null;
        }
        m13919a(hVar);
        return this;
    }

    /* renamed from: a */
    public final C6501b mo12644a(String str) {
        mo12651a("live_type", str);
        return this;
    }

    /* renamed from: a */
    private final void m13920a(String str, Object obj) {
        if (obj != null) {
            this.f16165f.put(str, obj.toString());
        }
    }

    public C6501b(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f16163a = str;
        this.f16166g = z;
    }

    /* renamed from: a */
    public final C6501b mo12645a(String str, int i) {
        C89219l.m154721d(str, "");
        m13920a(str, (Object) Integer.valueOf(i));
        return this;
    }
}
