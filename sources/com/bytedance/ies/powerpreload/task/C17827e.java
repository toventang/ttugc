package com.bytedance.ies.powerpreload.task;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.task.e */
public final class C17827e {

    /* renamed from: a */
    public static final LruCache<String, TaskTraceMetric> f42531a = new LruCache<>(16);

    /* renamed from: b */
    public static final C17827e f42532b = new C17827e();

    private C17827e() {
    }

    static {
        Covode.recordClassIndex(20392);
    }

    /* renamed from: a */
    public static final TaskTraceMetric m33009a(String str) {
        return f42531a.remove(str);
    }

    /* renamed from: a */
    public static final String m33010a(Intent intent) {
        C89219l.m154719c(intent, "");
        return m33011a(intent, "PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
    }

    /* renamed from: a */
    public static final String m33012a(Bundle bundle) {
        C89219l.m154719c(bundle, "");
        return bundle.getString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
    }

    /* renamed from: a */
    private static String m33011a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
