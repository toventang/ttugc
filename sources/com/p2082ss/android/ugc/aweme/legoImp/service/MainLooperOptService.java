package com.p2082ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import android.util.Printer;
import android.view.Choreographer;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.monitor.collector.p1551a.C21471a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58262u;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58263v;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService */
public class MainLooperOptService implements AbstractC58262u {

    /* renamed from: a */
    public static final Boolean f132757a = false;

    /* renamed from: h */
    public static boolean f132758h = true;

    /* renamed from: k */
    public static Printer f132759k = null;

    /* renamed from: b */
    public Handler f132760b;

    /* renamed from: c */
    public Handler f132761c;

    /* renamed from: d */
    public Handler f132762d;

    /* renamed from: e */
    public MessageQueue f132763e;

    /* renamed from: f */
    public EnumC58297a f132764f;

    /* renamed from: g */
    public Map<EnumC58297a, Boolean> f132765g;

    /* renamed from: i */
    public int f132766i = 100;

    /* renamed from: j */
    public int f132767j = 101;

    /* renamed from: l */
    public Printer f132768l = new Printer() {
        /* class com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C582951 */

        /* renamed from: b */
        private boolean f132781b;

        static {
            Covode.recordClassIndex(68376);
        }

        public final void println(String str) {
            if (!(MainLooperOptService.f132759k == null || MainLooperOptService.f132759k == MainLooperOptService.this.f132768l)) {
                MainLooperOptService.f132759k.println(str);
            }
            if (!MainLooperOptService.f132758h || C58140b.m105076b()) {
                MainLooperOptService.f132757a.booleanValue();
                MainLooperOptService.this.mo95729d();
                if (MainLooperOptService.m105335c() == MainLooperOptService.this.f132768l) {
                    Looper.getMainLooper().setMessageLogging(MainLooperOptService.f132759k);
                }
            } else if (!MainLooperOptService.this.f132765g.get(MainLooperOptService.this.f132764f).booleanValue()) {
                int i = C582962.f132782a[MainLooperOptService.this.f132764f.ordinal()];
                if (i == 1) {
                    if (!this.f132781b) {
                        MainLooperOptService mainLooperOptService = MainLooperOptService.this;
                        boolean a = mainLooperOptService.mo95727a(mainLooperOptService.f132760b, MainLooperOptService.this.f132763e, MainLooperOptService.this.f132767j);
                        this.f132781b = a;
                        if (a) {
                            MainLooperOptService.f132757a.booleanValue();
                            MainLooperOptService mainLooperOptService2 = MainLooperOptService.this;
                            mainLooperOptService2.mo95725a(mainLooperOptService2.f132763e);
                        }
                    }
                    MainLooperOptService mainLooperOptService3 = MainLooperOptService.this;
                    if (mainLooperOptService3.mo95727a(mainLooperOptService3.f132760b, MainLooperOptService.this.f132763e, MainLooperOptService.this.f132766i)) {
                        MainLooperOptService.f132757a.booleanValue();
                        MainLooperOptService mainLooperOptService4 = MainLooperOptService.this;
                        mainLooperOptService4.mo95725a(mainLooperOptService4.f132763e);
                        MainLooperOptService.this.f132765g.put(EnumC58297a.WATCH_ACTIVITY, true);
                    }
                } else if (i == 2) {
                    MainLooperOptService mainLooperOptService5 = MainLooperOptService.this;
                    if (mainLooperOptService5.mo95727a(mainLooperOptService5.f132761c, MainLooperOptService.this.f132763e, 0)) {
                        MainLooperOptService.f132757a.booleanValue();
                        MainLooperOptService mainLooperOptService6 = MainLooperOptService.this;
                        mainLooperOptService6.mo95725a(mainLooperOptService6.f132763e);
                        MainLooperOptService.this.f132765g.put(EnumC58297a.WATCH_ON_MEASURE, true);
                    }
                } else if (i != 3) {
                    if (i == 4) {
                        MainLooperOptService mainLooperOptService7 = MainLooperOptService.this;
                        if (mainLooperOptService7.mo95727a(mainLooperOptService7.f132761c, MainLooperOptService.this.f132763e, 0)) {
                            MainLooperOptService.f132757a.booleanValue();
                            MainLooperOptService mainLooperOptService8 = MainLooperOptService.this;
                            mainLooperOptService8.mo95725a(mainLooperOptService8.f132763e);
                            MainLooperOptService.this.f132765g.put(EnumC58297a.WATCH_ON_DRAW, true);
                            MainLooperOptService.f132757a.booleanValue();
                        }
                    }
                } else if (MainLooperOptService.this.f132762d == null) {
                    MainLooperOptService.f132757a.booleanValue();
                    MainLooperOptService.this.f132765g.put(EnumC58297a.WATCH_WINDOW_FOCUS_CHANGE, true);
                } else {
                    MainLooperOptService mainLooperOptService9 = MainLooperOptService.this;
                    if (mainLooperOptService9.mo95727a(mainLooperOptService9.f132762d, MainLooperOptService.this.f132763e, 6)) {
                        MainLooperOptService.f132757a.booleanValue();
                        MainLooperOptService mainLooperOptService10 = MainLooperOptService.this;
                        mainLooperOptService10.mo95725a(mainLooperOptService10.f132763e);
                        MainLooperOptService.this.f132765g.put(EnumC58297a.WATCH_WINDOW_FOCUS_CHANGE, true);
                    }
                }
            }
        }
    };

    /* renamed from: m */
    private Choreographer f132769m;

    /* renamed from: n */
    private Class<?> f132770n;

    /* renamed from: o */
    private Class<?> f132771o;

    /* renamed from: p */
    private Class<?> f132772p;

    /* renamed from: q */
    private Class<?> f132773q;

    /* renamed from: r */
    private Class<?> f132774r;

    /* renamed from: s */
    private Class<?> f132775s;

    /* renamed from: t */
    private Method f132776t;

    /* renamed from: u */
    private Method f132777u;

    /* renamed from: v */
    private Method f132778v;

    /* renamed from: w */
    private Method f132779w;

    /* renamed from: a */
    private static Object m105331a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_legoImp_service_MainLooperOptService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_legoImp_service_MainLooperOptService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58263v.m105203a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "service_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$ResetTask */
    class ResetTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(68378);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BOOT_FINISH;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        private ResetTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            C51423a.m95787a("ResetTask");
            MainLooperOptService.this.mo95729d();
        }

        /* synthetic */ ResetTask(MainLooperOptService mainLooperOptService, byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58262u
    /* renamed from: b */
    public final EnumC58151ae mo95709b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: a */
    public final boolean mo95727a(Handler handler, MessageQueue messageQueue, int i) {
        try {
            Field declaredField = this.f132775s.getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            Message message = (Message) declaredField.get(messageQueue);
            while (message != null) {
                if (message.what == i && message.getTarget() == handler) {
                    Message obtain = Message.obtain(message);
                    handler.removeMessages(message.what);
                    handler.sendMessageAtFrontOfQueue(obtain);
                    return true;
                }
                message = m105329a(message);
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            f132757a.booleanValue();
            return false;
        }
    }

    /* renamed from: d */
    public final void mo95729d() {
        f132758h = false;
        this.f132760b = null;
        this.f132761c = null;
        this.f132762d = null;
        this.f132763e = null;
        this.f132769m = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(68375);
    }

    /* renamed from: c */
    public static Printer m105335c() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    private Method m105338m() {
        if (this.f132777u == null) {
            this.f132777u = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        }
        return this.f132777u;
    }

    /* renamed from: n */
    private Method m105339n() {
        if (this.f132778v == null) {
            this.f132778v = Field.class.getDeclaredMethod("get", Object.class);
        }
        return this.f132778v;
    }

    /* renamed from: o */
    private Method m105340o() {
        if (this.f132779w == null) {
            this.f132779w = AccessibleObject.class.getDeclaredMethod("setAccessible", Boolean.TYPE);
        }
        return this.f132779w;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$2 */
    static /* synthetic */ class C582962 {

        /* renamed from: a */
        static final /* synthetic */ int[] f132782a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 68377(0x10b19, float:9.5817E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a[] r0 = com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.EnumC58297a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C582962.f132782a = r2
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r0 = com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.EnumC58297a.WATCH_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C582962.f132782a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r0 = com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.EnumC58297a.WATCH_ON_MEASURE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C582962.f132782a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r0 = com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.EnumC58297a.WATCH_WINDOW_FOCUS_CHANGE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C582962.f132782a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r0 = com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.EnumC58297a.WATCH_ON_DRAW     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C582962.<clinit>():void");
        }
    }

    public MainLooperOptService() {
        try {
            this.f132769m = Choreographer.getInstance();
        } catch (Throwable th) {
            f132758h = false;
            th.getMessage();
            f132757a.booleanValue();
        }
    }

    /* renamed from: e */
    private Handler m105336e() {
        try {
            Object invoke = this.f132770n.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = this.f132770n.getDeclaredField("mH");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(invoke);
        } catch (Throwable th) {
            th.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a */
    public enum EnumC58297a {
        WATCH_INIT,
        WATCH_ACTIVITY,
        WATCH_ON_MEASURE,
        WATCH_WINDOW_FOCUS_CHANGE,
        WATCH_ON_DRAW;

        static {
            Covode.recordClassIndex(68379);
        }
    }

    /* renamed from: l */
    private Handler m105337l() {
        try {
            if (this.f132776t == null) {
                this.f132776t = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            }
            Object a = m105331a((Method) m105331a(this.f132776t, this.f132770n, new Object[]{"currentActivityThread", null}), (Object) null, new Object[0]);
            Field field = (Field) m105331a(m105338m(), this.f132770n, new Object[]{"mH"});
            m105331a(m105340o(), field, new Object[]{true});
            return (Handler) m105331a(m105339n(), field, new Object[]{a});
        } catch (Throwable th) {
            th.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n, com.p2082ss.android.ugc.aweme.lego.AbstractC58262u
    /* renamed from: a */
    public final void mo28600a(Context context) {
        mo95710b(context);
    }

    /* renamed from: b */
    public static MainLooperOptService m105334b(EnumC58297a aVar) {
        try {
            MainLooperOptService mainLooperOptService = (MainLooperOptService) C58221f.m105143a(MainLooperOptService.class);
            if (aVar == null) {
                return mainLooperOptService;
            }
            try {
                mainLooperOptService.mo95726a(aVar);
                return mainLooperOptService;
            } catch (Exception unused) {
                return mainLooperOptService;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private Handler m105328a(Choreographer choreographer) {
        try {
            Field declaredField = this.f132771o.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(choreographer);
        } catch (Throwable th) {
            th.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    /* renamed from: a */
    private Message m105329a(Message message) {
        try {
            Field declaredField = this.f132774r.getDeclaredField("next");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(message);
            if (obj != null) {
                return (Message) obj;
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    /* renamed from: b */
    private Handler m105332b(Choreographer choreographer) {
        try {
            Field field = (Field) m105331a(m105338m(), this.f132771o, new Object[]{"mHandler"});
            m105331a(m105340o(), field, new Object[]{true});
            return (Handler) m105331a(m105339n(), field, new Object[]{choreographer});
        } catch (Throwable th) {
            th.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    /* renamed from: a */
    private MessageQueue m105330a(Handler handler) {
        try {
            Field declaredField = this.f132773q.getDeclaredField("mQueue");
            declaredField.setAccessible(true);
            return (MessageQueue) declaredField.get(handler);
        } catch (Throwable th) {
            th.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    /* renamed from: b */
    private MessageQueue m105333b(Handler handler) {
        try {
            Field field = (Field) m105331a(m105338m(), this.f132773q, new Object[]{"mQueue"});
            m105331a(m105340o(), field, new Object[]{true});
            return (MessageQueue) m105331a(m105339n(), field, new Object[]{handler});
        } catch (Throwable th) {
            th.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    /* renamed from: b */
    public final Handler mo95728b(ViewParent viewParent) {
        try {
            Field field = (Field) m105331a(m105338m(), this.f132772p, new Object[]{"mHandler"});
            m105331a(m105340o(), field, new Object[]{true});
            return (Handler) m105331a(m105339n(), field, new Object[]{viewParent});
        } catch (Throwable th) {
            th.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    /* renamed from: a */
    public final Handler mo95724a(ViewParent viewParent) {
        try {
            Field declaredField = this.f132772p.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(viewParent);
        } catch (Throwable th) {
            th.getMessage();
            f132757a.booleanValue();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58262u
    /* renamed from: b */
    public final void mo95710b(Context context) {
        if (f132758h) {
            try {
                this.f132770n = Class.forName("android.app.ActivityThread");
                this.f132771o = Class.forName("android.view.Choreographer");
                this.f132772p = Class.forName("android.view.ViewRootImpl");
                this.f132773q = Class.forName("android.os.Handler");
                this.f132775s = Class.forName("android.os.MessageQueue");
                this.f132774r = Class.forName("android.os.Message");
                C51423a.m95787a("MainLooperOptService");
                this.f132769m.postFrameCallback(Choreographer$FrameCallbackC58299b.f132787a);
                try {
                    m105331a(C21471a.m40331a(this.f132771o, "postCallbackDelayedInternal", Integer.TYPE, Object.class, Object.class, Long.TYPE), this.f132769m, new Object[]{4, RunnableC58300c.f132788a, null, 0});
                } catch (Throwable unused) {
                }
                Handler e = m105336e();
                this.f132760b = e;
                if (e == null) {
                    this.f132760b = m105337l();
                }
                Handler a = m105328a(this.f132769m);
                this.f132761c = a;
                if (a == null) {
                    this.f132761c = m105332b(this.f132769m);
                }
                MessageQueue a2 = m105330a(this.f132760b);
                this.f132763e = a2;
                if (a2 == null) {
                    this.f132763e = m105333b(this.f132760b);
                }
                this.f132765g = new HashMap();
                if (!(this.f132760b == null || this.f132763e == null || this.f132761c == null)) {
                    for (EnumC58297a aVar : EnumC58297a.values()) {
                        this.f132765g.put(aVar, false);
                    }
                    this.f132765g.put(EnumC58297a.WATCH_INIT, true);
                    this.f132764f = EnumC58297a.WATCH_INIT;
                    Printer c = m105335c();
                    f132759k = c;
                    if (c == this.f132768l) {
                        f132759k = null;
                    }
                    Looper.getMainLooper().setMessageLogging(this.f132768l);
                }
                new C58221f.C58224c().mo95703b((AbstractC58264w) new ResetTask(this, (byte) 0)).mo95706a();
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo95725a(MessageQueue messageQueue) {
        if (f132757a.booleanValue()) {
            try {
                Field declaredField = this.f132775s.getDeclaredField("mMessages");
                declaredField.setAccessible(true);
                Message message = (Message) declaredField.get(messageQueue);
                while (message != null) {
                    int i = message.what;
                    message = m105329a(message);
                }
                f132757a.booleanValue();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo95726a(EnumC58297a aVar) {
        if (f132758h && C58140b.m105075a() && !C58140b.m105076b()) {
            f132757a.booleanValue();
            this.f132764f = aVar;
            this.f132765g.put(aVar, false);
        }
    }
}
