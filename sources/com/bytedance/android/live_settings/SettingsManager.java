package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89216i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89278d;

public final class SettingsManager {
    public static final SettingsManager INSTANCE = new SettingsManager();
    private static final String[] STRING_ARRAY_DEFAULT_VALUE = new String[0];
    private static AtomicBoolean hasInit = new AtomicBoolean(false);
    private static AtomicBoolean hasMonitor = new AtomicBoolean(false);
    private static final Map<String, C6411c> modelMap = new LinkedHashMap();
    private static final List<C6411c> models = new ArrayList();
    public static AbstractC6412d monitor;
    private static final List<String> settingKeys = new ArrayList();

    private SettingsManager() {
    }

    public final List<C6411c> getModels() {
        return models;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live_settings.SettingsManager$a */
    public static final /* synthetic */ class C6398a extends C89216i implements AbstractC89172b<Class<?>, Boolean> {
        static {
            Covode.recordClassIndex(7130);
        }

        C6398a(SettingsManager settingsManager) {
            super(1, settingsManager);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "getBooleanValueInternal";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "getBooleanValueInternal(Ljava/lang/Class;)Z";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(SettingsManager.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154719c(cls2, "");
            return Boolean.valueOf(((SettingsManager) this.receiver).getBooleanValueInternal(cls2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live_settings.SettingsManager$b */
    public static final /* synthetic */ class C6399b extends C89216i implements AbstractC89172b<Class<?>, Double> {
        static {
            Covode.recordClassIndex(7131);
        }

        C6399b(SettingsManager settingsManager) {
            super(1, settingsManager);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "getDoubleValueInternal";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "getDoubleValueInternal(Ljava/lang/Class;)D";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(SettingsManager.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Double invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154719c(cls2, "");
            return Double.valueOf(((SettingsManager) this.receiver).getDoubleValueInternal(cls2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live_settings.SettingsManager$c */
    public static final /* synthetic */ class C6400c extends C89216i implements AbstractC89172b<Class<?>, Float> {
        static {
            Covode.recordClassIndex(7132);
        }

        C6400c(SettingsManager settingsManager) {
            super(1, settingsManager);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "getFloatValueInternal";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "getFloatValueInternal(Ljava/lang/Class;)F";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(SettingsManager.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Float invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154719c(cls2, "");
            return Float.valueOf(((SettingsManager) this.receiver).getFloatValueInternal(cls2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live_settings.SettingsManager$d */
    public static final /* synthetic */ class C6401d extends C89216i implements AbstractC89172b<Class<?>, Integer> {
        static {
            Covode.recordClassIndex(7133);
        }

        C6401d(SettingsManager settingsManager) {
            super(1, settingsManager);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "getIntValueInternal";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "getIntValueInternal(Ljava/lang/Class;)I";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(SettingsManager.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154719c(cls2, "");
            return Integer.valueOf(((SettingsManager) this.receiver).getIntValueInternal(cls2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live_settings.SettingsManager$e */
    public static final /* synthetic */ class C6402e extends C89216i implements AbstractC89172b<Class<?>, Long> {
        static {
            Covode.recordClassIndex(7134);
        }

        C6402e(SettingsManager settingsManager) {
            super(1, settingsManager);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "getLongValueInternal";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "getLongValueInternal(Ljava/lang/Class;)J";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(SettingsManager.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Long invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154719c(cls2, "");
            return Long.valueOf(((SettingsManager) this.receiver).getLongValueInternal(cls2));
        }
    }

    /* renamed from: com.bytedance.android.live_settings.SettingsManager$f */
    static final /* synthetic */ class C6403f extends C89216i implements AbstractC89172b<Class<?>, String[]> {
        static {
            Covode.recordClassIndex(7135);
        }

        C6403f(SettingsManager settingsManager) {
            super(1, settingsManager);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "getStringArrayValueInternal";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "getStringArrayValueInternal(Ljava/lang/Class;)[Ljava/lang/String;";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(SettingsManager.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String[] invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154719c(cls2, "");
            return ((SettingsManager) this.receiver).getStringArrayValueInternal(cls2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live_settings.SettingsManager$g */
    public static final /* synthetic */ class C6404g extends C89216i implements AbstractC89172b<Class<?>, String> {
        static {
            Covode.recordClassIndex(7136);
        }

        C6404g(SettingsManager settingsManager) {
            super(1, settingsManager);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "getStringValueInternal";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "getStringValueInternal(Ljava/lang/Class;)Ljava/lang/String;";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(SettingsManager.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154719c(cls2, "");
            return ((SettingsManager) this.receiver).getStringValueInternal(cls2);
        }
    }

    public final long getLatestSettingsSavedTime() {
        return SaveSettingsValue.getLatestSettingsSavedTime();
    }

    public final AbstractC6412d getMonitor() {
        AbstractC6412d dVar = monitor;
        if (dVar == null) {
            C89219l.m154710a("monitor");
        }
        return dVar;
    }

    static {
        Covode.recordClassIndex(7129);
    }

    public final void setMonitor(AbstractC6412d dVar) {
        C89219l.m154719c(dVar, "");
        monitor = dVar;
    }

    public final boolean contains(String str) {
        C89219l.m154719c(str, "");
        return settingKeys.contains(str);
    }

    public final void saveSettingsValue(C28022o oVar) {
        if (oVar != null) {
            List<C6411c> list = models;
            if (list != null) {
                SaveSettingsValue.save(oVar, (ArrayList) list);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    public final boolean getBooleanValue(Class<?> cls) {
        C89219l.m154719c(cls, "");
        if (hasInit.get()) {
            return ((Boolean) getValueAndReport("getBooleanValue", new C6398a(this), cls)).booleanValue();
        }
        Boolean bool = (Boolean) C6405a.m13773a(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getBooleanValueInternal(Class<?> cls) {
        C6411c cVar = modelMap.get(cls.getName());
        boolean z = false;
        if (cVar != null) {
            String str = cVar.f15984d;
            AbstractC28019l lVar = cVar.f15985e;
            if (lVar != null) {
                z = lVar.mo46695h();
            }
            return C6405a.m13777a(str, z);
        }
        Boolean bool = (Boolean) C6405a.m13773a(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final double getDoubleValue(Class<?> cls) {
        C89219l.m154719c(cls, "");
        if (hasInit.get()) {
            return ((Number) getValueAndReport("getDoubleValue", new C6399b(this), cls)).doubleValue();
        }
        Double d = (Double) C6405a.m13773a(cls);
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public final double getDoubleValueInternal(Class<?> cls) {
        C6411c cVar = modelMap.get(cls.getName());
        double d = 0.0d;
        if (cVar != null) {
            String str = cVar.f15984d;
            AbstractC28019l lVar = cVar.f15985e;
            if (lVar != null) {
                d = lVar.mo46690d();
            }
            return C6405a.m13769a(str, d);
        }
        Double d2 = (Double) C6405a.m13773a(cls);
        if (d2 != null) {
            return d2.doubleValue();
        }
        return 0.0d;
    }

    public final float getFloatValue(Class<?> cls) {
        C89219l.m154719c(cls, "");
        if (hasInit.get()) {
            return ((Number) getValueAndReport("getFloatValue", new C6400c(this), cls)).floatValue();
        }
        Float f = (Float) C6405a.m13773a(cls);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float getFloatValueInternal(Class<?> cls) {
        C6411c cVar = modelMap.get(cls.getName());
        float f = 0.0f;
        if (cVar != null) {
            String str = cVar.f15984d;
            AbstractC28019l lVar = cVar.f15985e;
            if (lVar != null) {
                f = lVar.mo46691e();
            }
            return C6405a.m13770a(str, f);
        }
        Float f2 = (Float) C6405a.m13773a(cls);
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public final int getIntValue(Class<?> cls) {
        C89219l.m154719c(cls, "");
        if (hasInit.get()) {
            return ((Number) getValueAndReport("getIntValue", new C6401d(this), cls)).intValue();
        }
        Integer num = (Integer) C6405a.m13773a(cls);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int getIntValueInternal(Class<?> cls) {
        C6411c cVar = modelMap.get(cls.getName());
        int i = 0;
        if (cVar != null) {
            String str = cVar.f15984d;
            AbstractC28019l lVar = cVar.f15985e;
            if (lVar != null) {
                i = lVar.mo46694g();
            }
            return C6405a.m13771a(str, i);
        }
        Integer num = (Integer) C6405a.m13773a(cls);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final long getLongValue(Class<?> cls) {
        C89219l.m154719c(cls, "");
        if (hasInit.get()) {
            return ((Number) getValueAndReport("getLongValue", new C6402e(this), cls)).longValue();
        }
        Long l = (Long) C6405a.m13773a(cls);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    public final long getLongValueInternal(Class<?> cls) {
        C6411c cVar = modelMap.get(cls.getName());
        long j = 0;
        if (cVar != null) {
            String str = cVar.f15984d;
            AbstractC28019l lVar = cVar.f15985e;
            if (lVar != null) {
                j = lVar.mo46693f();
            }
            return C6405a.m13772a(str, j);
        }
        Long l = (Long) C6405a.m13773a(cls);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    public final String[] getStringArrayValue(Class<?> cls) {
        C89219l.m154719c(cls, "");
        if (hasInit.get()) {
            return (String[]) getValueAndReport("getStringArrayValue", new C6403f(this), cls);
        }
        String[] strArr = (String[]) C6405a.m13773a(cls);
        if (strArr == null) {
            return STRING_ARRAY_DEFAULT_VALUE;
        }
        return strArr;
    }

    public final String[] getStringArrayValueInternal(Class<?> cls) {
        C6411c cVar = modelMap.get(cls.getName());
        if (cVar == null) {
            String[] strArr = (String[]) C6405a.m13773a(cls);
            if (strArr == null) {
                return STRING_ARRAY_DEFAULT_VALUE;
            }
            return strArr;
        }
        String[] a = C6405a.m13778a(cVar.f15984d, new String[0]);
        if (a != null && a.length != 0) {
            return a;
        }
        String[] strArr2 = (String[]) C6405a.m13773a(cls);
        if (strArr2 == null) {
            return STRING_ARRAY_DEFAULT_VALUE;
        }
        return strArr2;
    }

    public final String getStringValue(Class<?> cls) {
        C89219l.m154719c(cls, "");
        if (hasInit.get()) {
            return (String) getValueAndReport("getStringValue", new C6404g(this), cls);
        }
        String str = (String) C6405a.m13773a(cls);
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getStringValueInternal(Class<?> cls) {
        String str;
        C6411c cVar = modelMap.get(cls.getName());
        if (cVar != null) {
            String str2 = cVar.f15984d;
            AbstractC28019l lVar = cVar.f15985e;
            if (lVar == null || (str = lVar.mo46689c()) == null) {
                str = "";
            }
            String a = C6405a.m13775a(str2, str);
            C89219l.m154709a((Object) a, "");
            return a;
        }
        String str3 = (String) C6405a.m13773a(cls);
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T getValueSafelyInternal(Class<?> cls) {
        C6411c cVar = modelMap.get(cls.getName());
        if (cVar == null) {
            return (T) C6405a.m13773a(cls);
        }
        try {
            T t = null;
            Object a = C6405a.m13774a(cVar.f15984d, C6405a.m13779b(cls), null);
            boolean z = a instanceof Object;
            T t2 = a;
            if (!z) {
                t2 = null;
            }
            if (t2 != null) {
                if (!C89219l.m154714a((Object) String.valueOf(t2), (Object) "\"\"")) {
                    t = t2;
                }
                if (t != null) {
                    return t;
                }
            }
            return (T) C6405a.m13773a(cls);
        } catch (Throwable th) {
            AbstractC6412d dVar = monitor;
            if (dVar == null) {
                C89219l.m154710a("monitor");
            }
            dVar.mo12560a("getValueSafely", "exception: " + th.getMessage() + " ,class name: " + cls.getSimpleName());
            return (T) C6405a.m13773a(cls);
        }
    }

    public final <T> T getValueSafely(Class<?> cls) {
        C89219l.m154719c(cls, "");
        if (!hasInit.get()) {
            return (T) C6405a.m13773a(cls);
        }
        if (hasMonitor.get()) {
            return (T) getValueSafelyInternal(cls);
        }
        hasMonitor.set(true);
        long nanoTime = System.nanoTime();
        T t = (T) getValueSafelyInternal(cls);
        AbstractC6412d dVar = monitor;
        if (dVar == null) {
            C89219l.m154710a("monitor");
        }
        dVar.mo12559a("getValueSafely", System.nanoTime() - nanoTime);
        return t;
    }

    private final <T> T getValueAndReport(String str, AbstractC89172b<? super Class<?>, ? extends T> bVar, Class<?> cls) {
        if (hasMonitor.get()) {
            return (T) bVar.invoke(cls);
        }
        hasMonitor.compareAndSet(false, true);
        long nanoTime = System.nanoTime();
        T t = (T) bVar.invoke(cls);
        AbstractC6412d dVar = monitor;
        if (dVar == null) {
            C89219l.m154710a("monitor");
        }
        dVar.mo12559a(str, System.nanoTime() - nanoTime);
        return t;
    }

    private final <T> T getValueByKeyInternal(String str, Class<?> cls, T t) {
        return t instanceof Integer ? (T) Integer.valueOf(C6405a.m13771a(str, t.intValue())) : t instanceof Boolean ? (T) Boolean.valueOf(C6405a.m13777a(str, t.booleanValue())) : t instanceof Long ? (T) Long.valueOf(C6405a.m13772a(str, t.longValue())) : t instanceof Float ? (T) Float.valueOf(C6405a.m13770a(str, t.floatValue())) : t instanceof Double ? (T) Double.valueOf(C6405a.m13769a(str, t.doubleValue())) : t instanceof String ? (T) C6405a.m13775a(str, t) : ((t instanceof String[]) && t != null) ? (T) C6405a.m13778a(str, (String[]) t) : (T) C6405a.m13774a(str, cls, t);
    }

    public final <T> T getValueByKey(String str, Class<?> cls, T t) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        if (!hasInit.get()) {
            return t;
        }
        if (hasMonitor.get()) {
            return (T) getValueByKeyInternal(str, cls, t);
        }
        hasMonitor.compareAndSet(false, true);
        long nanoTime = System.nanoTime();
        T t2 = (T) getValueByKeyInternal(str, cls, t);
        AbstractC6412d dVar = monitor;
        if (dVar == null) {
            C89219l.m154710a("monitor");
        }
        dVar.mo12559a("getValueByKey", System.nanoTime() - nanoTime);
        return t2;
    }

    public final void init(boolean z, AbstractC6415g gVar, AbstractC6412d dVar) {
        C89219l.m154719c(gVar, "");
        C6405a.m13776a(z);
        if (dVar == null) {
            dVar = new C6413e(z);
        }
        monitor = dVar;
        List<C6411c> list = models;
        list.addAll(gVar.mo12561a());
        List<String> list2 = settingKeys;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f15984d);
        }
        list2.addAll(arrayList);
        modelMap.putAll(gVar.mo12562b());
        hasInit.compareAndSet(false, true);
    }
}
