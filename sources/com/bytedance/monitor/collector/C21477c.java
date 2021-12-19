package com.bytedance.monitor.collector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.monitor.collector.c */
public final class C21477c extends AbstractC21475b {
    static {
        Covode.recordClassIndex(25104);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: b */
    public final void mo35058b(int i) {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: c */
    public final Pair<String, ?> mo35059c() {
        String str;
        try {
            if (!C21501k.f51022a) {
                return null;
            }
            String str2 = this.f50912a;
            if (!C21501k.f51022a) {
                str = null;
            } else {
                str = MonitorJni.doDumpAtrace();
            }
            return new Pair<>(str2, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public C21477c(int i) {
        super(i, "atrace_event");
    }

    /* renamed from: a */
    public final void mo35077a(long j) {
        try {
            if (C21501k.f51022a) {
                MonitorJni.doEnableAtrace(this.f50914c, j);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: a */
    public final Pair<String, ?> mo35057a(long j, long j2) {
        String str;
        try {
            if (!C21501k.f51022a) {
                return null;
            }
            String str2 = this.f50912a;
            if (!C21501k.f51022a) {
                str = null;
            } else {
                str = MonitorJni.doDumpAtraceRange(j, j2);
            }
            return new Pair<>(str2, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
