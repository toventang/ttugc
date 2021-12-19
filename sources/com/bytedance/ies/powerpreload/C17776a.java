package com.bytedance.ies.powerpreload;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.task.C17827e;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.UUID;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.a */
public final class C17776a {

    /* renamed from: com.bytedance.ies.powerpreload.a$a */
    public static final class C17777a implements InvocationHandler {

        /* renamed from: a */
        public static final C17777a f42447a = new C17777a();

        static {
            Covode.recordClassIndex(20341);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(20340);
    }

    /* renamed from: b */
    public static final String m32981b(Intent intent) {
        C89219l.m154719c(intent, "");
        return C17827e.m33010a(intent);
    }

    /* renamed from: a */
    public static final TaskTraceMetric m32980a(Bundle bundle) {
        C89219l.m154719c(bundle, "");
        C89219l.m154719c(bundle, "");
        String string = bundle.getString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
        if (string == null) {
            return null;
        }
        C89219l.m154709a((Object) string, "");
        return C17827e.f42531a.get(string);
    }

    /* renamed from: b */
    public static final String m32982b(Bundle bundle) {
        C89219l.m154719c(bundle, "");
        return C17827e.m33012a(bundle);
    }

    /* renamed from: a */
    public static final Intent m32979a(Intent intent) {
        C89219l.m154719c(intent, "");
        C89219l.m154719c(intent, "");
        String a = C17827e.m33010a(intent);
        if (a == null) {
            a = UUID.randomUUID().toString();
            intent.putExtra("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", a);
            C89219l.m154709a((Object) a, "");
        }
        if (C17827e.f42531a.get(a) == null) {
            C17827e.f42531a.put(a, new TaskTraceMetric());
        }
        return intent;
    }
}
