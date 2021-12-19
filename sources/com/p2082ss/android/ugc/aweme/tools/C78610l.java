package com.p2082ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14175b;

/* renamed from: com.ss.android.ugc.aweme.tools.l */
public class C78610l extends AbstractC14175b {

    /* renamed from: a */
    public boolean f176648a;

    /* renamed from: b */
    public boolean f176649b;

    /* renamed from: c */
    public boolean f176650c;

    /* renamed from: d */
    public int f176651d = 1;

    /* renamed from: e */
    public boolean f176652e;

    /* renamed from: f */
    public boolean f176653f = true;

    static {
        Covode.recordClassIndex(91744);
    }

    /* renamed from: a */
    public final boolean mo122513a() {
        if (this.f176651d == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "SwitchDurationConfigEvent{isShortMode=" + this.f176649b + "isEnabled=" + this.f176648a + '}';
    }

    public C78610l(boolean z, boolean z2) {
        this.f176649b = z;
        this.f176648a = z2;
    }
}
