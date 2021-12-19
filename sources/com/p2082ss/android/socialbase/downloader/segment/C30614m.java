package com.p2082ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.segment.m */
public final class C30614m {

    /* renamed from: a */
    final JSONObject f73150a;

    /* renamed from: b */
    public int f73151b;

    static {
        Covode.recordClassIndex(37149);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo54860a() {
        return this.f73150a.optInt("url_balance", 2);
    }

    /* renamed from: b */
    public final boolean mo54862b() {
        if (mo54860a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo54863c() {
        if (this.f73150a.optInt("segment_mode", 1) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo54866f() {
        return this.f73150a.optInt("ip_strategy", 0);
    }

    /* renamed from: d */
    public final long mo54864d() {
        long optInt = ((long) this.f73150a.optInt("segment_min_kb", 512)) * 1024;
        if (optInt < 65536) {
            return 65536;
        }
        return optInt;
    }

    /* renamed from: e */
    public final long mo54865e() {
        long optInt = (long) this.f73150a.optInt("read_timeout", -1);
        if (optInt >= 4000) {
            return optInt;
        }
        return -1;
    }

    public C30614m(JSONObject jSONObject) {
        this.f73150a = jSONObject;
    }

    /* renamed from: a */
    public final void mo54861a(int i) {
        this.f73151b = m62862b(i);
    }

    /* renamed from: b */
    private int m62862b(int i) {
        int optInt = this.f73150a.optInt("thread_count", 4);
        if (optInt > 16) {
            optInt = 16;
        }
        if (optInt <= 0) {
            if (mo54860a() > 0) {
                return i;
            }
            return 1;
        } else if (mo54860a() == 1) {
            return Math.min(optInt, i);
        } else {
            return optInt;
        }
    }
}
