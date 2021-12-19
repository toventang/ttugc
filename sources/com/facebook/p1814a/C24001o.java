package com.facebook.p1814a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.C24710b;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.a.o */
class C24001o {

    /* renamed from: a */
    private static final String f56811a = C24001o.class.getSimpleName();

    /* renamed from: b */
    private List<C23909c> f56812b = new ArrayList();

    /* renamed from: c */
    private List<C23909c> f56813c = new ArrayList();

    /* renamed from: d */
    private int f56814d;

    /* renamed from: e */
    private C24710b f56815e;

    /* renamed from: f */
    private String f56816f;

    /* renamed from: g */
    private final int f56817g = 1000;

    static {
        Covode.recordClassIndex(28122);
    }

    /* renamed from: a */
    public final synchronized List<C23909c> mo39484a() {
        MethodCollector.m26663i(9946);
        if (C24677a.m47209a(this)) {
            MethodCollector.m26664o(9946);
            return null;
        }
        try {
            List<C23909c> list = this.f56812b;
            this.f56812b = new ArrayList();
            MethodCollector.m26664o(9946);
            return list;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            MethodCollector.m26664o(9946);
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo39485a(C23909c cVar) {
        int i;
        MethodCollector.m26663i(9507);
        if (C24677a.m47209a(this)) {
            MethodCollector.m26664o(9507);
            return;
        }
        try {
            int size = this.f56812b.size() + this.f56813c.size();
            if (C24677a.m47209a(this)) {
                i = 0;
            } else {
                i = 1000;
            }
            if (size >= i) {
                this.f56814d++;
                MethodCollector.m26664o(9507);
                return;
            }
            this.f56812b.add(cVar);
            MethodCollector.m26664o(9507);
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            MethodCollector.m26664o(9507);
        }
    }

    /* renamed from: a */
    public final synchronized void mo39486a(boolean z) {
        MethodCollector.m26663i(9658);
        if (C24677a.m47209a(this)) {
            MethodCollector.m26664o(9658);
            return;
        }
        if (z) {
            try {
                this.f56812b.addAll(this.f56813c);
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
                MethodCollector.m26664o(9658);
                return;
            }
        }
        this.f56813c.clear();
        this.f56814d = 0;
        MethodCollector.m26664o(9658);
    }

    public C24001o(C24710b bVar, String str) {
        this.f56815e = bVar;
        this.f56816f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (com.facebook.internal.p1894a.p1896b.C24677a.m47209a(r7) != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1 = com.facebook.p1814a.p1820e.C23930c.m45243a(com.facebook.p1814a.p1820e.C23930c.EnumC23932a.CUSTOM_APP_EVENTS, r7.f56815e, r7.f56816f, r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r7.f56814d <= 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1.put("num_skipped_events", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r0, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0077 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39483a(com.facebook.GraphRequest r8, android.content.Context r9, boolean r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.C24001o.mo39483a(com.facebook.GraphRequest, android.content.Context, boolean, boolean):int");
    }
}
