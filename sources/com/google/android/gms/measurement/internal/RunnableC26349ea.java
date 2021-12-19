package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ea */
public final class RunnableC26349ea implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f61819a;

    /* renamed from: b */
    private final /* synthetic */ String f61820b;

    /* renamed from: c */
    private final /* synthetic */ Object f61821c;

    /* renamed from: d */
    private final /* synthetic */ Object f61822d;

    /* renamed from: e */
    private final /* synthetic */ Object f61823e;

    /* renamed from: f */
    private final /* synthetic */ C26350eb f61824f;

    static {
        Covode.recordClassIndex(31771);
    }

    public final void run() {
        C26361em b = this.f61824f.f62077z.mo43253b();
        if (b.mo43287w()) {
            if (this.f61824f.f61825a == 0) {
                if (this.f61824f.mo43018s().mo43643e()) {
                    C26350eb ebVar = this.f61824f;
                    ebVar.mo43019t();
                    ebVar.f61825a = 'C';
                } else {
                    C26350eb ebVar2 = this.f61824f;
                    ebVar2.mo43019t();
                    ebVar2.f61825a = 'c';
                }
            }
            if (this.f61824f.f61826b < 0) {
                C26350eb ebVar3 = this.f61824f;
                ebVar3.mo43018s();
                ebVar3.f61826b = 31000;
            }
            char charAt = "01VDIWEA?".charAt(this.f61819a);
            char c = this.f61824f.f61825a;
            long j = this.f61824f.f61826b;
            String a = C26350eb.m51693a(true, this.f61820b, this.f61821c, this.f61822d, this.f61823e);
            String sb = new StringBuilder(String.valueOf(a).length() + 24).append("2").append(charAt).append(c).append(j).append(":").append(a).toString();
            if (sb.length() > 1024) {
                sb = this.f61820b.substring(0, 1024);
            }
            b.f61903c.mo43208a(sb);
        }
    }

    RunnableC26349ea(C26350eb ebVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f61824f = ebVar;
        this.f61819a = i;
        this.f61820b = str;
        this.f61821c = obj;
        this.f61822d = obj2;
        this.f61823e = obj3;
    }
}
