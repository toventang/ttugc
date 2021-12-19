package com.bytedance.bdlocation.traceroute;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class TraceRoute {

    /* renamed from: a */
    public AbstractC13215b f32295a;

    /* renamed from: b */
    public int f32296b = 64;

    /* renamed from: c */
    public int f32297c = 3;

    public native int execute(String[] strArr);

    static {
        Covode.recordClassIndex(15162);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("traceroute-lib", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "traceroute-lib");
    }

    public void appendResult(String str) {
        AbstractC13215b bVar = this.f32295a;
        if (bVar != null) {
            bVar.mo21342a(str);
        }
    }
}
