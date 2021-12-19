package com.google.android.play.core.p1966e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.v */
public final class C27050v {

    /* renamed from: a */
    private final Context f64019a;

    static {
        Covode.recordClassIndex(32526);
    }

    C27050v(Context context) {
        this.f64019a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Set<String> mo44751a() {
        Set<String> stringSet;
        MethodCollector.m26663i(12997);
        try {
            stringSet = C34822d.m71158a(this.f64019a, "playcore_split_install_internal", 0).getStringSet("deferred_uninstall_module_list", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            MethodCollector.m26664o(12997);
        } catch (Exception unused) {
            HashSet hashSet = new HashSet();
            MethodCollector.m26664o(12997);
            return hashSet;
        }
        return stringSet;
    }
}
