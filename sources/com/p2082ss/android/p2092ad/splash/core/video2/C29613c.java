package com.p2082ss.android.p2092ad.splash.core.video2;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.C29556v;
import com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.p2092ad.splash.p2109f.C29658m;
import java.util.HashMap;

/* renamed from: com.ss.android.ad.splash.core.video2.c */
public class C29613c implements AbstractC29612b {

    /* renamed from: a */
    private int f70607a;

    static {
        Covode.recordClassIndex(36009);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b
    /* renamed from: b */
    public void mo51424b() {
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b
    /* renamed from: b */
    public void mo51487b(int i) {
    }

    /* renamed from: b */
    public void mo51425b(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo51488c() {
    }

    /* renamed from: c */
    public void mo51426c(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo51490d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo51491d(int i) {
    }

    /* renamed from: d */
    public void mo51427d(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo51492e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo51635e(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo51636e(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo51637f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo51638g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo51639h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo51640i() {
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b
    /* renamed from: a */
    public void mo51421a() {
        mo51637f();
        mo51638g();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b
    /* renamed from: j */
    public final void mo51893j() {
        mo51490d();
        mo51492e();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b
    /* renamed from: c */
    public void mo51489c(int i) {
        mo51491d(i);
        mo51488c();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b
    /* renamed from: a */
    public void mo51422a(int i) {
        mo51635e(i);
        mo51639h();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b
    /* renamed from: a */
    public void mo51423a(int i, int i2) {
        mo51636e(i, i2);
        mo51640i();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b
    /* renamed from: f */
    public final void mo51892f(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f >= 0.0f) {
            if (f >= 0.75f) {
                int i3 = this.f70607a;
                if ((i3 & 8) == 0) {
                    this.f70607a = i3 | 8;
                    mo51427d(i, i2);
                }
            }
            if (f >= 0.5f) {
                int i4 = this.f70607a;
                if ((i4 & 4) == 0) {
                    this.f70607a = i4 | 4;
                    mo51426c(i, i2);
                }
            }
            if (f >= 0.25f) {
                int i5 = this.f70607a;
                if ((i5 & 2) == 0) {
                    this.f70607a = i5 | 2;
                    mo51425b(i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m59554a(C29455b bVar, HashMap<String, Object> hashMap) {
        String str;
        HashMap<String, Object> hashMap2 = hashMap;
        HashMap hashMap3 = new HashMap();
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.put("show_expected", Integer.valueOf(bVar.f70025c));
        if (bVar.f69978C) {
            str = "real_time";
        } else {
            str = "not_real_time";
        }
        hashMap2.put("show_type", str);
        int i = 1;
        hashMap2.put("play_order", 1);
        if (C29495h.f70200X != -1) {
            if (C29495h.f70200X != 1) {
                i = 2;
            }
            hashMap2.put("awemelaunch", Integer.valueOf(i));
        }
        hashMap2.put("ad_sequence", Integer.valueOf(C29556v.m59363a().mo51759p()));
        hashMap3.put("is_ad_event", "1");
        if (!C29657l.m59760a(bVar.f70032j)) {
            hashMap3.put("log_extra", bVar.f70032j);
        }
        hashMap3.put("ad_fetch_time", Long.valueOf(bVar.f70024b));
        C29446b.m58971a();
        C29446b.m58973a(bVar, 0, "play", hashMap3, hashMap2);
    }

    /* renamed from: a */
    protected static void m59552a(int i, C29455b bVar, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = hashMap;
        HashMap hashMap3 = new HashMap();
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.put("play_order", 1);
        hashMap3.put("duration", Long.toString((long) i));
        hashMap3.put("percent", Integer.toString(100));
        hashMap3.put("is_ad_event", "1");
        hashMap3.put("ad_fetch_time", Long.valueOf(bVar.f70024b));
        if (!C29657l.m59760a(bVar.f70032j)) {
            hashMap3.put("log_extra", bVar.f70032j);
        }
        C29446b.m58971a();
        C29446b.m58973a(bVar, 0, "play_over", hashMap3, hashMap2);
    }

    /* renamed from: a */
    protected static void m59553a(C29455b bVar, int i, int i2, int i3, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = hashMap;
        HashMap hashMap3 = new HashMap();
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        long j = (long) i;
        hashMap3.put("duration", Long.toString(j));
        hashMap3.put("percent", Integer.valueOf(C29658m.m59761a(j, (long) i2)));
        hashMap3.put("is_ad_event", "1");
        hashMap3.put("ad_fetch_time", Long.valueOf(bVar.f70024b));
        hashMap3.put("break_reason", Integer.valueOf(i3));
        if (!C29657l.m59760a(bVar.f70032j)) {
            hashMap3.put("log_extra", bVar.f70032j);
        }
        hashMap2.put("break_reason", Integer.valueOf(i3));
        hashMap2.put("play_order", 1);
        C29446b.m58971a();
        C29446b.m58973a(bVar, 0, "play_break", hashMap3, hashMap2);
    }
}
