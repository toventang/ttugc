package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.ac */
public final class C19531ac {

    /* renamed from: a */
    public boolean f46361a;

    /* renamed from: b */
    public boolean f46362b;

    /* renamed from: c */
    public boolean f46363c;

    /* renamed from: d */
    public int f46364d;

    /* renamed from: e */
    public int f46365e;

    /* renamed from: f */
    public int f46366f;

    /* renamed from: g */
    public int f46367g;

    /* renamed from: h */
    public C19672u f46368h;

    /* renamed from: i */
    public List<C19590ap> f46369i = new ArrayList();

    /* renamed from: j */
    public C19591aq f46370j = new C19591aq();

    static {
        Covode.recordClassIndex(22375);
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Info{isSuccess:").append(this.f46361a).append(", reachBase:").append(this.f46362b).append(", reachLocal:").append(this.f46363c).append(", pullTimes:").append(this.f46364d).append(", msgCount:").append(this.f46365e).append(", validMsgCount:").append(this.f46366f).append(", leakMsgCount:").append(this.f46367g).append(", repairedRanges:").append(this.f46369i).append(", repairedMergedRanges:").append(this.f46370j).append(", errorMsg:");
        C19672u uVar = this.f46368h;
        String str2 = "";
        if (uVar != null) {
            str = uVar.f46730c;
        } else {
            str = str2;
        }
        StringBuilder append2 = append.append(str).append(", logId:");
        C19672u uVar2 = this.f46368h;
        if (uVar2 != null) {
            str2 = uVar2.f46733f;
        }
        return append2.append(str2).append("}").toString();
    }
}
