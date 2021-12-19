package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.measurement.bp */
public final class C25846bp {

    /* renamed from: a */
    private static final C0484a<String, Uri> f60978a = new C0484a<>();

    static {
        Covode.recordClassIndex(31261);
    }

    /* renamed from: a */
    public static synchronized Uri m50044a(String str) {
        Uri uri;
        String str2;
        synchronized (C25846bp.class) {
            MethodCollector.m26663i(7349);
            C0484a<String, Uri> aVar = f60978a;
            uri = aVar.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                uri = Uri.parse(str2);
                aVar.put(str, uri);
            }
            MethodCollector.m26664o(7349);
        }
        return uri;
    }
}
