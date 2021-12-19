package com.google.android.play.core.p1966e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.e.aq */
final class RunnableC27011aq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C27032e f63921a;

    /* renamed from: b */
    final /* synthetic */ C27013as f63922b;

    static {
        Covode.recordClassIndex(32487);
    }

    RunnableC27011aq(C27013as asVar, C27032e eVar) {
        this.f63922b = asVar;
        this.f63921a = eVar;
    }

    public final void run() {
        C27010ap apVar = this.f63922b.f63924a;
        List<String> list = this.f63921a.f63984a;
        List<String> a = C27013as.m53671a(this.f63921a.f63985b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(list));
        }
        if (!a.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(a));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        apVar.mo44661a(AbstractC27034f.m53722a(bundle));
    }
}
