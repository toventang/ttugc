package com.bytedance.android.livesdk.p437ag;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ag.e */
public final class C6668e {

    /* renamed from: a */
    Map<String, List<Object>> f16561a = new HashMap();

    static {
        Covode.recordClassIndex(7406);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.ag.e$a */
    public static final class C6669a {

        /* renamed from: a */
        public static final C6668e f16562a = new C6668e();

        static {
            Covode.recordClassIndex(7407);
        }
    }

    /* renamed from: a */
    public final List<Object> mo12808a(String str) {
        List<Object> list = this.f16561a.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f16561a.put(str, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12810b(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                Iterator<Object> it = mo12808a(str).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12811c(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                Iterator<Object> it = mo12808a(str).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12809a(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                Iterator<Object> it = mo12808a(str).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
