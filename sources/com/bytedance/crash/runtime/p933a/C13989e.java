package com.bytedance.crash.runtime.p933a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.runtime.p933a.AbstractC13983b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.runtime.a.e */
public final class C13989e {

    /* renamed from: a */
    private static volatile C13989e f34109a;

    /* renamed from: b */
    private final Context f34110b;

    /* renamed from: c */
    private final Map<CrashType, AbstractC13983b> f34111c = new HashMap();

    /* renamed from: d */
    private C13978a f34112d;

    /* renamed from: e */
    private C13986d f34113e;

    static {
        Covode.recordClassIndex(16054);
    }

    /* renamed from: a */
    public static C13989e m25320a() {
        if (f34109a == null) {
            Context context = C13933m.f33936a;
            if (context != null) {
                f34109a = new C13989e(context);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return f34109a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.a.e$2 */
    public static /* synthetic */ class C139912 {

        /* renamed from: a */
        static final /* synthetic */ int[] f34115a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.p933a.C13989e.C139912.<clinit>():void");
        }
    }

    private C13989e(Context context) {
        this.f34110b = context;
        try {
            this.f34112d = C13978a.m25303a();
            this.f34113e = new C13986d(context);
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public final C13864b mo22512a(List<C13864b> list) {
        if (list.isEmpty()) {
            return null;
        }
        C13864b bVar = new C13864b();
        JSONArray jSONArray = new JSONArray();
        for (C13864b bVar2 : list) {
            jSONArray.put(bVar2.f33757a);
        }
        bVar.mo22346a("data", (Object) jSONArray);
        Header a = Header.m25037a(this.f34110b);
        Header.addRuntimeHeader(a.f33753a);
        a.mo22332c();
        a.mo22333d();
        a.mo22334e();
        Header.m25039a(a);
        bVar.mo22338a(a);
        return bVar;
    }

    /* renamed from: a */
    private AbstractC13983b m25319a(CrashType crashType) {
        AbstractC13983b bVar = this.f34111c.get(crashType);
        if (bVar != null) {
            return bVar;
        }
        switch (C139912.f34115a[crashType.ordinal()]) {
            case 1:
                bVar = new C13992f(this.f34110b, this.f34112d, this.f34113e, false);
                break;
            case 2:
                bVar = new C13992f(this.f34110b, this.f34112d, this.f34113e, true);
                break;
            case 3:
                bVar = new C13993g(this.f34110b, this.f34112d, this.f34113e);
                break;
            case 4:
                bVar = new C13985c(CrashType.ANR, this.f34110b, this.f34112d, this.f34113e);
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                bVar = new C13985c(CrashType.DART, this.f34110b, this.f34112d, this.f34113e);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                bVar = new C13985c(CrashType.GAME, this.f34110b, this.f34112d, this.f34113e);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                bVar = new C13985c(CrashType.CUSTOM_JAVA, this.f34110b, this.f34112d, this.f34113e);
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                bVar = new AbstractC13983b(CrashType.ENSURE, this.f34110b, this.f34112d, this.f34113e) {
                    /* class com.bytedance.crash.runtime.p933a.C13989e.C139901 */

                    static {
                        Covode.recordClassIndex(16055);
                    }
                };
                break;
            default:
                return bVar;
        }
        this.f34111c.put(crashType, bVar);
        return bVar;
    }

    /* renamed from: a */
    public final C13864b mo22510a(CrashType crashType, C13864b bVar) {
        return mo22511a(crashType, bVar, null, false);
    }

    /* renamed from: a */
    public final C13864b mo22511a(CrashType crashType, C13864b bVar, AbstractC13983b.AbstractC13984a aVar, boolean z) {
        AbstractC13983b a;
        if (crashType == null || (a = m25319a(crashType)) == null) {
            return bVar;
        }
        return a.mo22506a(bVar, aVar, z);
    }
}
