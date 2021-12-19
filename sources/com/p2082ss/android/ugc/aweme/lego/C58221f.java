package com.p2082ss.android.ugc.aweme.lego;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58191c;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58194f;
import com.p2082ss.android.ugc.aweme.lego.component.C58190b;
import com.p2082ss.android.ugc.aweme.lego.p3390a.AbstractC58142d;
import com.p2082ss.android.ugc.aweme.lego.p3390a.EnumC58145f;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58143e;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58086a;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58088b;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58092d;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58095e;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58098f;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58100g;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58106i;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58109j;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58112k;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58115l;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58116m;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58117n;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58120o;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58123p;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58126q;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58133t;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58135u;
import com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58139w;
import com.p2082ss.android.ugc.aweme.lego.p3394d.AbstractC58203a;
import com.p2082ss.android.ugc.aweme.lego.p3394d.C58205b;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58216a;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58218b;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58219c;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58220d;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.p4260e.AbstractC81916a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89207b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.lego.f */
public final class C58221f {

    /* renamed from: a */
    public static long f132577a = 60000;

    /* renamed from: b */
    public static final C58220d f132578b = new C58220d();

    /* renamed from: c */
    public static final C58218b f132579c = new C58218b();

    /* renamed from: d */
    public static final C58219c f132580d = new C58219c();

    /* renamed from: e */
    public static final C58216a f132581e = new C58216a();

    /* renamed from: f */
    public static Context f132582f;

    /* renamed from: g */
    public static AbstractC58142d f132583g;

    /* renamed from: h */
    static boolean f132584h;

    /* renamed from: i */
    public static AbstractC58191c f132585i;

    /* renamed from: j */
    static Map<EnumC58148ab, List<AbstractC58252n>> f132586j = new LinkedHashMap();

    /* renamed from: k */
    public static AbstractC58194f f132587k;

    /* renamed from: l */
    public static final HashMap<EnumC58150ad, AbstractC81916a> f132588l = new HashMap<>();

    /* renamed from: m */
    static final HashMap<Integer, AbstractC81916a> f132589m = new HashMap<>();

    /* renamed from: n */
    public static final C58221f f132590n = new C58221f();

    /* renamed from: o */
    private static final int f132591o = 10;

    /* renamed from: p */
    private static final int f132592p = 11;

    /* renamed from: q */
    private static final int f132593q = 12;

    /* renamed from: r */
    private static final int f132594r = 13;

    /* renamed from: s */
    private static final int f132595s = 14;

    /* renamed from: t */
    private static final int f132596t = 15;

    /* renamed from: u */
    private static final int f132597u = 16;

    /* renamed from: v */
    private static final int f132598v = 20;

    /* renamed from: w */
    private static boolean f132599w;

    /* renamed from: x */
    private static Map<EnumC58148ab, List<Object>> f132600x = new LinkedHashMap();

    /* renamed from: y */
    private static int f132601y;

    /* renamed from: z */
    private static int f132602z;

    private C58221f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.f$d */
    public static class C58225d {

        /* renamed from: a */
        public boolean f132603a;

        /* renamed from: b */
        private List<AbstractC58252n>[] f132604b;

        /* renamed from: c */
        private List<AbstractC58252n> f132605c;

        /* renamed from: d */
        private List<AbstractC58252n> f132606d;

        /* renamed from: e */
        private Map<AbstractC58084a, String[]> f132607e;

        /* renamed from: f */
        private Map<String, AbstractC58252n> f132608f;

        /* renamed from: g */
        private int f132609g;

        /* renamed from: h */
        private boolean f132610h;

        static {
            Covode.recordClassIndex(68292);
        }

        public /* synthetic */ C58225d() {
            this(false);
        }

        /* renamed from: b */
        private final void m105161b() {
            for (Map.Entry<AbstractC58084a, String[]> entry : this.f132607e.entrySet()) {
                int i = -1;
                Iterator a = C89207b.m154693a(entry.getValue());
                while (a.hasNext()) {
                    AbstractC58252n nVar = this.f132608f.get(a.next());
                    if (nVar != null) {
                        AbstractC58084a key = entry.getKey();
                        Objects.requireNonNull(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                        int ordinal = ((AbstractC58252n) key).mo28606f().ordinal();
                        if (ordinal == nVar.mo28606f().ordinal() && ordinal == EnumC58150ad.TASK_BACKGROUND.ordinal()) {
                            AbstractC81916a aVar = C58221f.f132589m.get(Integer.valueOf(ordinal));
                            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTrigger");
                            AbstractC58084a key2 = entry.getKey();
                            Objects.requireNonNull(key2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                            ((C58088b) aVar).mo95601a((AbstractC58252n) key2, nVar);
                        } else {
                            int indexOf = this.f132605c.indexOf(nVar);
                            if (indexOf > i) {
                                i = indexOf;
                            }
                        }
                    }
                }
                if (i > 0) {
                    AbstractC58084a key3 = entry.getKey();
                    Objects.requireNonNull(key3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                    this.f132605c.add(i + 1, key3);
                } else {
                    List<AbstractC58252n> list = this.f132606d;
                    AbstractC58084a key4 = entry.getKey();
                    Objects.requireNonNull(key4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                    list.add(key4);
                }
            }
            this.f132605c.addAll(0, this.f132606d);
            this.f132607e = new LinkedHashMap();
            this.f132608f = new LinkedHashMap();
            this.f132606d = new ArrayList();
            this.f132609g = 0;
        }

        /* renamed from: a */
        public final void mo95706a() {
            if (!this.f132610h) {
                List<AbstractC58252n>[] listArr = this.f132604b;
                if (listArr.length != 0) {
                    int length = listArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        List<AbstractC58252n> list = listArr[i];
                        int i3 = i2 + 1;
                        if (list == null) {
                            C89219l.m154715b();
                        }
                        for (T t : list) {
                            AbstractC81916a aVar = C58221f.f132589m.get(Integer.valueOf(i2));
                            if (aVar == null) {
                                C89219l.m154715b();
                            }
                            aVar.mo95627a((AbstractC58252n) t);
                        }
                        i++;
                        i2 = i3;
                    }
                    List<AbstractC58252n>[] listArr2 = this.f132604b;
                    int length2 = listArr2.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length2) {
                        List<AbstractC58252n> list2 = listArr2[i4];
                        int i6 = i5 + 1;
                        if (list2 == null) {
                            C89219l.m154715b();
                        }
                        if (list2.size() > 0) {
                            AbstractC81916a aVar2 = C58221f.f132589m.get(Integer.valueOf(i5));
                            if (aVar2 == null) {
                                C89219l.m154715b();
                            }
                            aVar2.mo95598a(list2);
                        }
                        i4++;
                        i5 = i6;
                    }
                    this.f132604b = new List[0];
                }
            } else if (!this.f132605c.isEmpty() || !this.f132606d.isEmpty()) {
                if (this.f132603a) {
                    m105161b();
                }
                for (AbstractC58252n nVar : this.f132605c) {
                    int ordinal = nVar.mo28606f().ordinal();
                    AbstractC81916a aVar3 = C58221f.f132589m.get(Integer.valueOf(ordinal));
                    if (aVar3 == null) {
                        C89219l.m154715b();
                    }
                    aVar3.mo95627a(nVar);
                    AbstractC81916a aVar4 = C58221f.f132589m.get(Integer.valueOf(ordinal));
                    if (aVar4 == null) {
                        C89219l.m154715b();
                    }
                    aVar4.mo95598a(C89070n.m154525d(nVar));
                }
                this.f132605c = new ArrayList();
            }
        }

        /* renamed from: a */
        public final C58225d mo95704a(AbstractC58252n nVar) {
            C89219l.m154721d(nVar, "");
            return mo95705a(nVar, true);
        }

        /* renamed from: b */
        public C58225d mo95701b(AbstractC58259r rVar) {
            C89219l.m154721d(rVar, "");
            return mo95704a(rVar);
        }

        /* renamed from: b */
        public C58225d mo95703b(AbstractC58264w wVar) {
            C89219l.m154721d(wVar, "");
            return mo95704a(wVar);
        }

        public C58225d(boolean z) {
            this.f132603a = z;
            this.f132604b = new List[EnumC58150ad.values().length];
            this.f132605c = new ArrayList();
            this.f132606d = new ArrayList();
            this.f132607e = new LinkedHashMap();
            this.f132608f = new LinkedHashMap();
            this.f132610h = true;
        }

        /* renamed from: b */
        public C58225d mo95699b(Class<? extends AbstractC58258q> cls) {
            C89219l.m154721d(cls, "");
            Object newInstance = cls.newInstance();
            C89219l.m154716b(newInstance, "");
            return mo95704a((AbstractC58252n) newInstance);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
            if (r0 != 2) goto L_0x0018;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.lego.C58221f.C58225d mo95705a(com.p2082ss.android.ugc.aweme.lego.AbstractC58252n r8, boolean r9) {
            /*
            // Method dump skipped, instructions count: 330
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.lego.C58221f.C58225d.mo95705a(com.ss.android.ugc.aweme.lego.n, boolean):com.ss.android.ugc.aweme.lego.f$d");
        }
    }

    /* renamed from: e */
    public static C58225d m105153e() {
        return new C58225d(false);
    }

    /* renamed from: a */
    public static boolean m105148a() {
        if ((f132601y & C58261t.f132692a) == C58261t.f132692a) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m105150b() {
        if ((f132602z & C58231h.f132619a) == C58231h.f132619a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m105151c() {
        return ((Boolean) C58267z.f132712g.getValue()).booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.f$e */
    static final class RunnableC58226e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f132611a;

        static {
            Covode.recordClassIndex(68293);
        }

        RunnableC58226e(C89233z.C89238e eVar) {
            this.f132611a = eVar;
        }

        public final void run() {
            C58225d dVar = new C58225d();
            for (AbstractC58252n nVar : this.f132611a.element) {
                dVar.mo95705a(nVar, false);
            }
            dVar.mo95706a();
        }
    }

    /* renamed from: d */
    public static void m105152d() {
        HashMap<EnumC58150ad, AbstractC81916a> hashMap = f132588l;
        AbstractC81916a aVar = hashMap.get(EnumC58150ad.SERVICE_BOOT_FINISH);
        if (aVar == null) {
            C89219l.m154715b();
        }
        aVar.mo95597a();
        AbstractC81916a aVar2 = hashMap.get(EnumC58150ad.TASK_BOOT_FINISH);
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        aVar2.mo95597a();
    }

    static {
        Covode.recordClassIndex(68288);
    }

    /* renamed from: a */
    public static C58225d m105141a(boolean z) {
        return new C58225d(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.f$a */
    public static final class C58222a extends C58225d {
        static {
            Covode.recordClassIndex(68289);
        }

        /* renamed from: a */
        public final C58222a mo95699b(Class<? extends AbstractC58258q> cls) {
            C89219l.m154721d(cls, "");
            C58225d b = super.mo95699b(cls);
            Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.Lego.InflateTransaction");
            return (C58222a) b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.f$b */
    public static final class C58223b extends C58225d {
        static {
            Covode.recordClassIndex(68290);
        }

        /* renamed from: a */
        public final C58223b mo95701b(AbstractC58259r rVar) {
            C89219l.m154721d(rVar, "");
            C58225d b = super.mo95701b(rVar);
            Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.Lego.RequestTransaction");
            return (C58223b) b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.f$c */
    public static final class C58224c extends C58225d {
        static {
            Covode.recordClassIndex(68291);
        }

        /* renamed from: a */
        public final C58224c mo95703b(AbstractC58264w wVar) {
            C89219l.m154721d(wVar, "");
            C58225d b = super.mo95703b(wVar);
            Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.Lego.TaskTransaction");
            return (C58224c) b;
        }
    }

    /* renamed from: a */
    public static <T> T m105142a(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
        AbstractC81916a aVar = f132588l.get(nVar.mo28606f());
        if (aVar != null) {
            return (T) aVar.mo95628b(nVar);
        }
        return null;
    }

    /* renamed from: b */
    public static <T> T m105149b(Class<? extends AbstractC58258q> cls) {
        C89219l.m154721d(cls, "");
        Object newInstance = cls.newInstance();
        C89219l.m154716b(newInstance, "");
        return (T) m105142a((AbstractC58252n) newInstance);
    }

    /* renamed from: a */
    public static <T> T m105143a(Class<? extends AbstractC58262u> cls) {
        C89219l.m154721d(cls, "");
        Object newInstance = cls.newInstance();
        C89219l.m154716b(newInstance, "");
        return (T) m105142a((AbstractC58252n) newInstance);
    }

    /* renamed from: a */
    public static void m105144a(EnumC58148ab abVar) {
        C89219l.m154721d(abVar, "");
        if (!f132600x.isEmpty() || !f132586j.isEmpty()) {
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) new ArrayList();
            List<Object> list = f132600x.get(abVar);
            if (list != null) {
                for (T t : list) {
                    Objects.requireNonNull(t, "null cannot be cast to non-null type () -> kotlin.collections.MutableList<com.ss.android.ugc.aweme.lego.LegoComponent>");
                    eVar.element.addAll((Collection) ((AbstractC89171a) C89206ad.m154679b(t, 0)).invoke());
                }
            }
            if (!eVar.element.isEmpty()) {
                C40780g.m82247d().execute(new RunnableC58226e(eVar));
            }
            List<AbstractC58252n> list2 = f132586j.get(abVar);
            if (list2 != null) {
                C58225d dVar = new C58225d();
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    dVar.mo95705a(it.next(), false);
                }
                dVar.mo95706a();
            }
            f132600x.remove(abVar);
            f132586j.remove(abVar);
        }
    }

    /* renamed from: a */
    public static void m105146a(AbstractC58191c cVar) {
        AbstractC81916a aVar;
        C89219l.m154721d(cVar, "");
        Context a = cVar.mo60043a();
        f132582f = a;
        f132585i = cVar;
        if (a == null) {
            C89219l.m154710a("context");
        }
        String b = C58227a.m105171b(a);
        AbstractC58194f fVar = f132587k;
        if (fVar != null) {
            fVar.mo60052a(EnumC58145f.COLD_BOOT_BEGIN);
        }
        C58205b.f132532b = Integer.valueOf(cVar.mo60045c().mo60048a());
        EnumC58150ad[] values = EnumC58150ad.values();
        for (EnumC58150ad adVar : values) {
            C89219l.m154721d(adVar, "");
            switch (C58139w.f132398a[adVar.ordinal()]) {
                case 1:
                    aVar = new C58112k();
                    break;
                case 2:
                    aVar = new C58095e();
                    break;
                case 3:
                    aVar = new C58088b();
                    break;
                case 4:
                    aVar = new C58116m();
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    aVar = new C58100g();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    aVar = new C58109j();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    aVar = new C58135u();
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    aVar = new C58117n();
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    aVar = new C58126q();
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    aVar = new C58120o();
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    aVar = new C58123p();
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    aVar = new C58092d();
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    aVar = new C58086a();
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    aVar = new C58115l();
                    break;
                case 15:
                    aVar = new C58106i();
                    break;
                case 16:
                    aVar = new C58133t();
                    break;
                case 17:
                    aVar = new C58098f();
                    break;
                default:
                    throw new IllegalArgumentException("uncorrect trigger type, please check");
            }
            f132588l.put(adVar, aVar);
            f132589m.put(Integer.valueOf(adVar.ordinal()), aVar);
        }
        if (!cVar.mo60046d()) {
            HandlerC58143e.f132402b.mo95648a();
        }
        Context context = f132582f;
        if (context == null) {
            C89219l.m154710a("context");
        }
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        C89219l.m154721d(application, "");
        application.registerActivityLifecycleCallbacks(new HandlerC58143e.C58144a());
        C58220d dVar = f132578b;
        Context context2 = f132582f;
        if (context2 == null) {
            C89219l.m154710a("context");
        }
        dVar.mo95690a(context2);
        C58218b bVar = f132579c;
        Context context3 = f132582f;
        if (context3 == null) {
            C89219l.m154710a("context");
        }
        bVar.mo95679a(context3);
        C58219c cVar2 = f132580d;
        Context context4 = f132582f;
        if (context4 == null) {
            C89219l.m154710a("context");
        }
        cVar2.mo95685a(context4);
        C58216a aVar2 = f132581e;
        Context context5 = f132582f;
        if (context5 == null) {
            C89219l.m154710a("context");
        }
        C89219l.m154721d(context5, "");
        aVar2.f132563a = context5;
        ((Application) context5).registerActivityLifecycleCallbacks(new C58216a.C58217a());
        if (cVar.mo60045c().mo60049b() == AbstractC58203a.EnumC58204a.WILD) {
            if (!f132599w) {
                cVar.mo60044b().mo60047a(new C58190b(0, "unexpected process init.process name ".concat(String.valueOf(b))));
                C58205b.f132531a = true;
            } else {
                throw new RuntimeException("unexpected process init, please contract with zhanghan.cloud");
            }
        }
        if (cVar.mo60045c().mo60049b() == AbstractC58203a.EnumC58204a.PRISON) {
            cVar.mo60044b().mo60047a(new C58190b(1, "prison process init.process name ".concat(String.valueOf(b))));
        }
        f132601y = Keva.getRepo("ab_repo_cold_boot").getInt("is_opt_lego_schedule", 2);
        f132602z = Keva.getRepo("ab_repo_cold_boot").getInt("is_opt_lego_add", 0);
    }

    /* renamed from: a */
    public static void m105147a(AbstractC58264w wVar) {
        C89219l.m154721d(wVar, "");
        if (wVar.mo28609i()) {
            f132578b.mo95691a(wVar);
        }
    }

    /* renamed from: a */
    public static void m105145a(EnumC58148ab abVar, AbstractC89171a<? extends List<? extends AbstractC58252n>> aVar) {
        C89219l.m154721d(abVar, "");
        C89219l.m154721d(aVar, "");
        List<Object> list = f132600x.get(abVar);
        if (list != null) {
            list.add(aVar);
            return;
        }
        f132600x.put(abVar, new ArrayList());
        List<Object> list2 = f132600x.get(abVar);
        if (list2 != null) {
            list2.add(aVar);
        }
    }

    /* renamed from: a */
    public final C58221f mo95697a(Class<? extends AbstractC58258q> cls, AbstractC58258q qVar) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(qVar, "");
        C58216a aVar = f132581e;
        String h = qVar.mo28608h();
        C89219l.m154716b(h, "");
        aVar.mo95670a(h, qVar);
        return this;
    }
}
