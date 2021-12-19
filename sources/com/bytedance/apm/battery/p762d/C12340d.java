package com.bytedance.apm.battery.p762d;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.apm.battery.C12311a;
import com.bytedance.apm.battery.p759a.C12313a;
import com.bytedance.apm.battery.p760b.AbstractC12322d;
import com.bytedance.apm.battery.p761c.C12324a;
import com.bytedance.apm.battery.p761c.C12328b;
import com.bytedance.apm.battery.p762d.p763a.C12334a;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12410d;
import com.bytedance.apm.p772e.C12447a;
import com.bytedance.apm.p779k.C12516b;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.d.d */
public final class C12340d extends AbstractC12339c<C12334a> implements AbstractC12322d {

    /* renamed from: e */
    private int[] f29738e;

    /* renamed from: f */
    private int f29739f;

    /* renamed from: g */
    private List<Long> f29740g = new ArrayList();

    /* renamed from: h */
    private int f29741h;

    /* renamed from: i */
    private final Object f29742i = new Object();

    /* renamed from: j */
    private final List<Long> f29743j = new ArrayList();

    static {
        Covode.recordClassIndex(14145);
    }

    @Override // com.bytedance.apm.battery.p760b.AbstractC12322d
    /* renamed from: a */
    public final String mo20049a() {
        return "android.app.IAlarmManager";
    }

    public C12340d() {
        super("alarm");
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g, com.bytedance.apm.battery.p762d.AbstractC12339c
    /* renamed from: b */
    public final void mo20068b() {
        super.mo20068b();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f29742i) {
            this.f29740g.add(Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g, com.bytedance.apm.battery.p762d.AbstractC12339c
    /* renamed from: c */
    public final void mo20069c() {
        super.mo20069c();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f29742i) {
            this.f29740g.add(Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: a */
    public final void mo20083a(C12328b bVar, C12447a aVar) {
        if (this.f29734a.equals(aVar.f30227d)) {
            if (!aVar.f30225b) {
                bVar.f29689k += aVar.f30230g;
                return;
            }
            bVar.f29684f += aVar.f30230g;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p762d.AbstractC12339c
    /* renamed from: a */
    public final void mo20065a(long j, long j2) {
        int i = 0;
        this.f29739f = 0;
        this.f29738e = new int[2];
        this.f29743j.add(Long.valueOf(j));
        synchronized (this.f29742i) {
            this.f29743j.addAll(this.f29740g);
            this.f29740g.clear();
        }
        this.f29743j.add(Long.valueOf(j2));
        this.f29741h = 1;
        while (this.f29741h < this.f29743j.size()) {
            super.mo20065a(this.f29743j.get(this.f29741h - 1).longValue(), this.f29743j.get(this.f29741h).longValue());
            this.f29741h++;
        }
        int[] iArr = this.f29738e;
        if (iArr[0] + iArr[1] != 0) {
            int size = this.f29743j.size();
            long currentTimeMillis = System.currentTimeMillis();
            if ((!this.f29736c || size % 2 != 0) && (this.f29736c || size % 2 != 1)) {
                C12324a.C12327a.f29677a.mo20054a(new C12447a(true, currentTimeMillis, this.f29734a, (long) iArr[0]));
                C12324a.C12327a.f29677a.mo20054a(new C12447a(false, currentTimeMillis, this.f29734a, (long) iArr[1]));
            } else {
                C12324a.C12327a.f29677a.mo20054a(new C12447a(false, currentTimeMillis, this.f29734a, (long) iArr[0]));
                C12324a.C12327a.f29677a.mo20054a(new C12447a(true, currentTimeMillis, this.f29734a, (long) iArr[1]));
            }
        }
        this.f29743j.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        int[] iArr2 = this.f29738e;
        double d = (double) iArr2[0];
        double d2 = (double) iArr2[1];
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d + d2;
        double d4 = (double) (currentTimeMillis2 - this.f29735b);
        Double.isNaN(d4);
        double d5 = (d3 / d4) * 60000.0d * 10.0d;
        double d6 = (double) this.f29739f;
        double d7 = (double) (currentTimeMillis2 - this.f29735b);
        Double.isNaN(d6);
        Double.isNaN(d7);
        double d8 = (d6 / d7) * 60000.0d * 10.0d;
        if (d5 >= ((double) C12313a.f29630d)) {
            i = 49;
        }
        if (d8 >= ((double) C12313a.f29631e)) {
            i |= 50;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("wake_up_count", d5).put("normal_count", d8);
                if (this.f29737d != null && this.f29737d.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C12334a aVar : this.f29737d.values()) {
                        jSONArray.put(aVar.mo20073a());
                    }
                    jSONObject.put("detail", jSONArray);
                }
                C12516b.m22504a(jSONObject, "battery_trace");
                C12401a.m22303b().mo20179a(new C12410d("battery_trace", jSONObject));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.apm.battery.p760b.AbstractC12322d
    /* renamed from: a */
    public final void mo20050a(Method method, Object[] objArr) {
        long j;
        String str;
        long j2;
        try {
            String name = method.getName();
            int i = -1;
            if ("set".equals(name)) {
                C12334a aVar = new C12334a();
                boolean z = false;
                int i2 = 0;
                int i3 = -1;
                for (Object obj : objArr) {
                    if ((obj instanceof Integer) && !z) {
                        aVar.f29720a = ((Integer) obj).intValue();
                        z = true;
                    } else if (obj instanceof Long) {
                        if (i2 == 0) {
                            aVar.f29723d = ((Long) obj).longValue();
                            if (aVar.f29720a == 1 || aVar.f29720a == 0) {
                                j2 = aVar.f29723d;
                            } else {
                                j2 = (aVar.f29723d + System.currentTimeMillis()) - SystemClock.elapsedRealtime();
                            }
                            aVar.f29723d = j2;
                        } else if (i2 == 2) {
                            aVar.f29721b = ((Long) obj).longValue();
                        }
                        i2++;
                    } else if (obj instanceof PendingIntent) {
                        PendingIntent pendingIntent = (PendingIntent) obj;
                        if (Build.VERSION.SDK_INT > 23 || pendingIntent == null) {
                            str = "";
                        } else {
                            str = ((Intent) Reflect.m24529on(pendingIntent).call("getIntent").get()).toString();
                        }
                        aVar.f29722c = str;
                        i3 = pendingIntent.hashCode();
                    }
                }
                if (i3 != -1) {
                    if (aVar.f29721b == 0) {
                        j = aVar.f29723d;
                    } else {
                        j = -1;
                    }
                    aVar.f29724e = j;
                    if (C12311a.C12312a.f29626a.f29622b) {
                        aVar.f29725f = Thread.currentThread().getName();
                        aVar.f29726g = Thread.currentThread().getStackTrace();
                    }
                    this.f29737d.put(Integer.valueOf(i3), aVar);
                }
            } else if ("remove".equals(name)) {
                if (objArr[0] != null && (objArr[0] instanceof PendingIntent)) {
                    i = objArr[0].hashCode();
                }
                C12334a aVar2 = (C12334a) this.f29737d.get(Integer.valueOf(i));
                if (aVar2 != null && aVar2.f29721b > 0) {
                    aVar2.f29724e = System.currentTimeMillis();
                    this.f29737d.put(Integer.valueOf(i), aVar2);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.battery.d.a.b, long, long] */
    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p762d.AbstractC12339c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20067a(C12334a aVar, long j, long j2) {
        int i;
        C12334a aVar2 = aVar;
        if (aVar2.f29721b > 0) {
            long j3 = aVar2.f29723d;
            if (j3 < j) {
                j3 = (aVar2.f29721b + j) - ((j - aVar2.f29723d) % aVar2.f29721b);
            }
            long j4 = aVar2.f29724e;
            if (j4 <= j2 && aVar2.f29724e > 0) {
                j2 = j4;
            }
            long j5 = j2 - j3;
            if (j5 > 0) {
                i = ((int) (j5 / aVar2.f29721b)) + 1;
            } else {
                return;
            }
        } else if (j <= aVar2.f29723d && aVar2.f29723d <= j2) {
            i = 1;
        } else {
            return;
        }
        if (aVar2.f29720a == 2 || aVar2.f29720a == 0) {
            int[] iArr = this.f29738e;
            int i2 = this.f29741h % 2;
            iArr[i2] = iArr[i2] + i;
            return;
        }
        this.f29739f += i;
    }
}
