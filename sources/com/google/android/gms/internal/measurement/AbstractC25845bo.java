package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.bo */
public abstract class AbstractC25845bo<T> {

    /* renamed from: a */
    public static final Object f60966a = new Object();

    /* renamed from: b */
    public static volatile AbstractC25854bx f60967b = null;

    /* renamed from: c */
    public static final AtomicInteger f60968c = new AtomicInteger();

    /* renamed from: d */
    private static volatile boolean f60969d = false;

    /* renamed from: e */
    private static final AtomicReference<Collection<AbstractC25845bo<?>>> f60970e = new AtomicReference<>();

    /* renamed from: f */
    private static C25860cc f60971f = new C25860cc(C25847bq.f60979a);

    /* renamed from: g */
    private final C25855by f60972g;

    /* renamed from: h */
    private final String f60973h;

    /* renamed from: i */
    private final T f60974i;

    /* renamed from: j */
    private volatile int f60975j;

    /* renamed from: k */
    private volatile T f60976k;

    /* renamed from: l */
    private final boolean f60977l;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo42198a(Object obj);

    /* renamed from: a */
    public final String mo42199a() {
        return m50040a(this.f60972g.f60983c);
    }

    static {
        Covode.recordClassIndex(31260);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo42200b() {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC25845bo.mo42200b():java.lang.Object");
    }

    /* renamed from: a */
    private final String m50040a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f60973h;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f60973h);
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    /* synthetic */ AbstractC25845bo(C25855by byVar, String str, Object obj) {
        this(byVar, str, obj, true);
    }

    private AbstractC25845bo(C25855by byVar, String str, T t, boolean z) {
        this.f60975j = -1;
        if (byVar.f60981a != null) {
            this.f60972g = byVar;
            this.f60973h = str;
            this.f60974i = t;
            this.f60977l = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
