package com.squareup.p2081b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2081b.AbstractC29315y;
import com.squareup.p2081b.C29299t;
import java.io.InputStream;

/* renamed from: com.squareup.b.g */
public class C29278g extends AbstractC29315y {

    /* renamed from: a */
    final Context f69456a;

    static {
        Covode.recordClassIndex(35627);
    }

    C29278g(Context context) {
        this.f69456a = context;
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: a */
    public boolean mo51062a(C29312w wVar) {
        return "content".equals(wVar.f69562d.getScheme());
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: b */
    public AbstractC29315y.C29316a mo51063b(C29312w wVar) {
        return new AbstractC29315y.C29316a(mo51078c(wVar), C29299t.EnumC29305d.DISK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final InputStream mo51078c(C29312w wVar) {
        MethodCollector.m26663i(11029);
        InputStream openInputStream = this.f69456a.getContentResolver().openInputStream(wVar.f69562d);
        MethodCollector.m26664o(11029);
        return openInputStream;
    }
}
