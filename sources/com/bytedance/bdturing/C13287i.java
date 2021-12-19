package com.bytedance.bdturing;

import com.bytedance.bdturing.C13301m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.bdturing.i */
public class C13287i {

    /* renamed from: c */
    private static int f32490c = 6000;

    /* renamed from: a */
    public List<C13289a> f32491a = new ArrayList();

    /* renamed from: b */
    public volatile boolean f32492b = false;

    /* renamed from: d */
    private int f32493d;

    static {
        Covode.recordClassIndex(15249);
    }

    /* renamed from: a */
    private void m23906a() {
        try {
            C13301m.C13302a.f32548a.mo21472a(new Runnable() {
                /* class com.bytedance.bdturing.C13287i.RunnableC132881 */

                static {
                    Covode.recordClassIndex(15250);
                }

                public final void run() {
                    JSONException e;
                    ReentrantLock reentrantLock;
                    try {
                        int size = C13287i.this.f32491a.size() - 1;
                        double d = (double) C13287i.this.f32491a.get(size).f32499e;
                        while (size >= 0) {
                            C13289a aVar = C13287i.this.f32491a.get(size);
                            if (d >= ((double) aVar.f32499e) || size == 0) {
                                long j = aVar.f32499e;
                                float f = aVar.f32495a;
                                float f2 = aVar.f32496b;
                                int i = aVar.f32500f;
                                float f3 = aVar.f32497c;
                                float f4 = aVar.f32498d;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("timestamp", j);
                                    try {
                                        jSONObject.put("force", (double) f);
                                        jSONObject.put("majorRadius", (double) f2);
                                        jSONObject.put("phase", i);
                                        jSONObject.put("x", (double) f3);
                                        jSONObject.put("y", (double) f4);
                                        try {
                                            C13292k.f32507a.lockInterruptibly();
                                            C13292k.f32508b.add(jSONObject);
                                            reentrantLock = C13292k.f32507a;
                                        } catch (InterruptedException unused) {
                                            reentrantLock = C13292k.f32507a;
                                        } catch (Throwable th) {
                                            C13292k.f32507a.unlock();
                                            throw th;
                                        }
                                        reentrantLock.unlock();
                                    } catch (JSONException e2) {
                                        e = e2;
                                        C13285g.m23900a(e);
                                        d -= 33.3333d;
                                        C13285g.m23901a("uploadEvent use " + aVar.f32499e + " " + aVar.f32500f);
                                        size--;
                                    }
                                } catch (JSONException e3) {
                                    e = e3;
                                    C13285g.m23900a(e);
                                    d -= 33.3333d;
                                    C13285g.m23901a("uploadEvent use " + aVar.f32499e + " " + aVar.f32500f);
                                    size--;
                                }
                                d -= 33.3333d;
                                C13285g.m23901a("uploadEvent use " + aVar.f32499e + " " + aVar.f32500f);
                            } else {
                                C13285g.m23901a("uploadEvent abandon " + aVar.f32499e + " " + aVar.f32500f);
                            }
                            size--;
                        }
                        C13287i.this.f32491a.clear();
                        C13287i.this.f32492b = false;
                    } catch (Exception unused2) {
                        C13287i.this.f32492b = false;
                    } catch (Throwable th2) {
                        C13287i.this.f32492b = false;
                        throw th2;
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.bdturing.i$a */
    public class C13289a {

        /* renamed from: a */
        float f32495a;

        /* renamed from: b */
        float f32496b;

        /* renamed from: c */
        float f32497c;

        /* renamed from: d */
        float f32498d;

        /* renamed from: e */
        long f32499e;

        /* renamed from: f */
        int f32500f;

        static {
            Covode.recordClassIndex(15251);
        }

        C13289a() {
        }
    }

    public C13287i(int i) {
        int i2 = f32490c;
        this.f32493d = i2;
        if (i > i2) {
            this.f32493d = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r3 != 1) goto L_0x0067;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21455a(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.C13287i.mo21455a(android.view.MotionEvent):void");
    }
}
