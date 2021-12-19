package com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49516h;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49782e;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.C49806f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4267g.p4268a.EnumC81991b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81990e;
import com.p2082ss.android.ugc.p4267g.p4268a.p4271c.C82001b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p4600h.C89376n;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.p.b.b */
public final class C49791b implements AbstractC49784a {

    /* renamed from: a */
    public static final C49792a f114544a = new C49792a((byte) 0);

    /* renamed from: b */
    private final List<AbstractC49782e> f114545b = new ArrayList();

    /* renamed from: c */
    private AbstractC49782e f114546c;

    /* renamed from: d */
    private EnumC81991b f114547d;

    /* renamed from: e */
    private HashMap<String, HashMap<String, Object>> f114548e;

    /* renamed from: f */
    private C82001b f114549f;

    /* renamed from: g */
    private final C49793b f114550g = new C49793b();

    /* renamed from: h */
    private final List<AbstractC89172b<Boolean, C89391z>> f114551h = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b */
    public static final class C49793b {

        /* renamed from: b */
        public static final C49795b f114552b = new C49795b((byte) 0);

        /* renamed from: a */
        public final AtomicBoolean f114553a = new AtomicBoolean(false);

        /* renamed from: c */
        private final AtomicLong f114554c = new AtomicLong(-1);

        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$a */
        public enum EnumC49794a {
            SHOW_TOAST,
            SHOW_BAR,
            SHOW_NO_NET_SCREEN;

            static {
                Covode.recordClassIndex(58899);
            }
        }

        static {
            Covode.recordClassIndex(58898);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$b */
        public static final class C49795b {
            static {
                Covode.recordClassIndex(58900);
            }

            private C49795b() {
            }

            public /* synthetic */ C49795b(byte b) {
                this();
            }

            /* renamed from: a */
            public static void m93260a(EnumC49794a aVar, EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
                Object obj;
                C89391z zVar;
                String str;
                C89219l.m154721d(aVar, "");
                if (bVar != null && hashMap != null) {
                    try {
                        HashMap<String, Object> hashMap2 = hashMap.get("extra_info");
                        if (hashMap2 != null) {
                            Object obj2 = hashMap2.get("start_time");
                            if (obj2 != null && (obj2 instanceof Long)) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long longValue = currentTimeMillis - ((Number) obj2).longValue();
                                int i = C49801c.f114563a[aVar.ordinal()];
                                int i2 = 2;
                                if (i == 1) {
                                    str = "T";
                                } else if (i == 2) {
                                    str = "B";
                                } else if (i == 3) {
                                    str = "S";
                                } else {
                                    throw new C89376n();
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("start_time", obj2);
                                linkedHashMap.put("show_notice_time", Long.valueOf(currentTimeMillis));
                                linkedHashMap.put("notice_time", Long.valueOf(longValue));
                                int i3 = C49801c.f114564b[bVar.ordinal()];
                                if (i3 == 1) {
                                    i2 = 0;
                                } else if (i3 == 2) {
                                    i2 = 1;
                                } else if (i3 != 3) {
                                    i2 = -1;
                                }
                                linkedHashMap.put("detect_res", Integer.valueOf(i2));
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("extra_info", linkedHashMap);
                                C39162r.m79460a(C81990e.f183480a, new C33744d().mo59983a(C81990e.f183489j, str).mo59982a(C81990e.f183490k, hashMap3).f79943a);
                            }
                            zVar = C89391z.f203057a;
                        } else {
                            zVar = null;
                        }
                        obj = C89379q.m157068constructorimpl(zVar);
                    } catch (Throwable th) {
                        obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                    }
                    C89379q.m157067boximpl(obj);
                }
            }
        }

        /* renamed from: b */
        private final void m93255b() {
            this.f114554c.set(System.currentTimeMillis());
        }

        /* renamed from: c */
        private static boolean m93256c() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$c */
        public static final class RunnableC49796c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ List f114556a;

            static {
                Covode.recordClassIndex(58901);
            }

            RunnableC49796c(List list) {
                this.f114556a = list;
            }

            public final void run() {
                for (AbstractC89172b bVar : this.f114556a) {
                    bVar.invoke(false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$f */
        public static final class RunnableC49799f implements Runnable {

            /* renamed from: a */
            public static final RunnableC49799f f114560a = new RunnableC49799f();

            static {
                Covode.recordClassIndex(58904);
            }

            RunnableC49799f() {
            }

            public final void run() {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.h2n).mo123053a();
            }
        }

        /* renamed from: a */
        private final boolean m93254a() {
            if (System.currentTimeMillis() - this.f114554c.get() < 60000) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private static boolean m93257d() {
            if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
                return C58029j.f132256h;
            }
            boolean c = m93256c();
            C58029j.f132256h = c;
            return c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$d */
        public static final class RunnableC49797d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C49793b f114557a;

            /* renamed from: b */
            final /* synthetic */ List f114558b;

            static {
                Covode.recordClassIndex(58902);
            }

            RunnableC49797d(C49793b bVar, List list) {
                this.f114557a = bVar;
                this.f114558b = list;
            }

            public final void run() {
                this.f114557a.f114553a.set(true);
                for (AbstractC89172b bVar : this.f114558b) {
                    bVar.invoke(true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$e */
        public static final class RunnableC49798e implements Runnable {

            /* renamed from: a */
            public static final RunnableC49798e f114559a = new RunnableC49798e();

            static {
                Covode.recordClassIndex(58903);
            }

            RunnableC49798e() {
            }

            public final void run() {
                MethodCollector.m26663i(5914);
                if (!C49783b.m93234a()) {
                    MethodCollector.m26664o(5914);
                } else if (C49806f.f114574d == null || C49806f.f114574d.f114580a == null) {
                    MethodCollector.m26664o(5914);
                } else {
                    synchronized (C49806f.f114575e) {
                        try {
                            Message obtain = Message.obtain();
                            obtain.what = 0;
                            obtain.obj = new C49806f.C49808b("Detector can't find net");
                            if (!(C49806f.f114574d == null || C49806f.f114574d.f114580a == null)) {
                                try {
                                    C49806f.f114574d.f114580a.sendMessage(obtain);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        } finally {
                            MethodCollector.m26664o(5914);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo84335a(boolean z) {
            boolean z2;
            boolean a = C49783b.m93234a();
            C17867d.m33078a();
            boolean d = a & m93257d();
            if (!z || !m93254a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            return z2 & d;
        }

        /* renamed from: a */
        public final boolean mo84334a(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            if (!mo84335a(true)) {
                return false;
            }
            if ((!C49792a.m93253b() && !C49792a.m93252a()) || this.f114553a.get()) {
                return false;
            }
            m93255b();
            C34727m.m70944a(RunnableC49799f.f114560a);
            C49795b.m93260a(EnumC49794a.SHOW_TOAST, bVar, hashMap);
            return true;
        }
    }

    static {
        Covode.recordClassIndex(58896);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$a */
    public static final class C49792a {
        static {
            Covode.recordClassIndex(58897);
        }

        private C49792a() {
        }

        /* renamed from: a */
        public static boolean m93252a() {
            if (!C49806f.m93265a().booleanValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static boolean m93253b() {
            Boolean b = C49806f.m93267b();
            C89219l.m154716b(b, "");
            return b.booleanValue();
        }

        public /* synthetic */ C49792a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.AbstractC49784a
    /* renamed from: a */
    public final synchronized void mo84322a() {
        MethodCollector.m26663i(6398);
        m93244d();
        MethodCollector.m26664o(6398);
    }

    /* renamed from: c */
    private final synchronized void m93243c() {
        Integer num;
        MethodCollector.m26663i(6691);
        if (!C49783b.m93234a()) {
            MethodCollector.m26664o(6691);
        } else if (this.f114549f != null) {
            MethodCollector.m26664o(6691);
        } else if (this.f114547d == null) {
            MethodCollector.m26664o(6691);
        } else {
            AbstractC49782e eVar = this.f114546c;
            if (eVar != null) {
                num = Integer.valueOf(eVar.hashCode());
            } else {
                num = null;
            }
            C82001b bVar = new C82001b();
            bVar.mo127168a(C49516h.f113888a, new C49800c(this, num));
            this.f114549f = bVar;
            MethodCollector.m26664o(6691);
        }
    }

    /* renamed from: d */
    private synchronized void m93244d() {
        MethodCollector.m26663i(6981);
        try {
            C49793b bVar = this.f114550g;
            List<AbstractC89172b<Boolean, C89391z>> list = this.f114551h;
            C89219l.m154721d(list, "");
            try {
                bVar.f114553a.set(false);
                C34727m.m70944a(new C49793b.RunnableC49796c(list));
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th2) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th2));
        }
        try {
            this.f114546c = null;
            this.f114548e = null;
            this.f114547d = null;
            C82001b bVar2 = this.f114549f;
            if (bVar2 != null) {
                bVar2.mo127167a();
            }
            this.f114549f = null;
            Iterator<T> it = this.f114545b.iterator();
            while (it.hasNext()) {
                it.next().mo84320e();
            }
            this.f114545b.clear();
            C89379q.m157068constructorimpl(C89391z.f203057a);
            MethodCollector.m26664o(6981);
        } catch (Throwable th3) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th3));
            MethodCollector.m26664o(6981);
        }
    }

    /* renamed from: b */
    public final synchronized void mo84332b() {
        C89391z zVar;
        MethodCollector.m26663i(6537);
        try {
            if (!C49783b.m93234a()) {
                MethodCollector.m26664o(6537);
            } else if (!this.f114550g.mo84335a(true)) {
                MethodCollector.m26664o(6537);
            } else if (C49792a.m93253b() || C49792a.m93252a()) {
                EnumC81991b bVar = this.f114547d;
                if (bVar != null) {
                    int i = C49802d.f114565a[bVar.ordinal()];
                    if (i == 1 || i == 2) {
                        this.f114550g.mo84334a(this.f114547d, this.f114548e);
                    } else if (i == 3 && this.f114550g.mo84334a(this.f114547d, this.f114548e)) {
                        m93243c();
                    }
                    zVar = C89391z.f203057a;
                } else {
                    zVar = null;
                }
                C89379q.m157068constructorimpl(zVar);
                MethodCollector.m26664o(6537);
            } else {
                MethodCollector.m26664o(6537);
            }
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
            MethodCollector.m26664o(6537);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$c */
    public static final class C49800c extends AbstractC89220m implements AbstractC89172b<Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C49791b f114561a;

        /* renamed from: b */
        final /* synthetic */ Integer f114562b;

        static {
            Covode.recordClassIndex(58905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49800c(C49791b bVar, Integer num) {
            super(1);
            this.f114561a = bVar;
            this.f114562b = num;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Long l) {
            l.longValue();
            this.f114561a.mo84331a(this.f114562b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final synchronized void mo84333b(AbstractC89172b<? super Boolean, C89391z> bVar) {
        MethodCollector.m26663i(6234);
        C89219l.m154721d(bVar, "");
        this.f114551h.remove(bVar);
        MethodCollector.m26664o(6234);
    }

    /* renamed from: a */
    public final synchronized void mo84329a(AbstractC49782e eVar) {
        MethodCollector.m26663i(6235);
        C89219l.m154721d(eVar, "");
        if (this.f114546c == null) {
            this.f114546c = eVar;
        }
        this.f114545b.add(eVar);
        MethodCollector.m26664o(6235);
    }

    /* renamed from: a */
    public final synchronized void mo84330a(AbstractC89172b<? super Boolean, C89391z> bVar) {
        MethodCollector.m26663i(6086);
        C89219l.m154721d(bVar, "");
        if (!C49783b.m93234a()) {
            MethodCollector.m26664o(6086);
            return;
        }
        if (this.f114550g.f114553a.get()) {
            bVar.invoke(true);
        }
        this.f114551h.add(bVar);
        MethodCollector.m26664o(6086);
    }

    /* renamed from: a */
    public final synchronized void mo84331a(Integer num) {
        MethodCollector.m26663i(6838);
        if (!C49783b.m93234a()) {
            MethodCollector.m26664o(6838);
        } else if (C49792a.m93253b() || C49792a.m93252a()) {
            AbstractC49782e eVar = this.f114546c;
            if (!(eVar == null || !C89219l.m154714a(Integer.valueOf(eVar.hashCode()), num) || this.f114547d == null)) {
                if (C49792a.m93252a()) {
                    C49793b bVar = this.f114550g;
                    EnumC81991b bVar2 = this.f114547d;
                    HashMap<String, HashMap<String, Object>> hashMap = this.f114548e;
                    if (bVar.mo84335a(false) && C49792a.m93252a() && C49792a.m93253b()) {
                        C34727m.m70944a(C49793b.RunnableC49798e.f114559a);
                        C49793b.C49795b.m93260a(C49793b.EnumC49794a.SHOW_NO_NET_SCREEN, bVar2, hashMap);
                    }
                } else if (C49792a.m93253b()) {
                    C49793b bVar3 = this.f114550g;
                    List<AbstractC89172b<Boolean, C89391z>> list = this.f114551h;
                    EnumC81991b bVar4 = this.f114547d;
                    HashMap<String, HashMap<String, Object>> hashMap2 = this.f114548e;
                    C89219l.m154721d(list, "");
                    if (bVar3.mo84335a(false) && C49792a.m93253b()) {
                        C34727m.m70944a(new C49793b.RunnableC49797d(bVar3, list));
                        C49793b.C49795b.m93260a(C49793b.EnumC49794a.SHOW_BAR, bVar4, hashMap2);
                    }
                }
            }
            this.f114549f = null;
            MethodCollector.m26664o(6838);
        } else {
            MethodCollector.m26664o(6838);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.AbstractC49784a
    /* renamed from: a */
    public final synchronized void mo84323a(AbstractC49782e eVar, EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
        MethodCollector.m26663i(6397);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hashMap, "");
        if (!C49783b.m93234a()) {
            MethodCollector.m26664o(6397);
            return;
        }
        if (C89219l.m154714a(this.f114546c, eVar) && this.f114547d == null) {
            this.f114547d = bVar;
            this.f114548e = hashMap;
            if (C49792a.m93252a() || C49792a.m93253b()) {
                mo84332b();
                MethodCollector.m26664o(6397);
                return;
            }
        }
        MethodCollector.m26664o(6397);
    }
}
