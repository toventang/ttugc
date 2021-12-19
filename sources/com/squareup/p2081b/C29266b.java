package com.squareup.p2081b;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2081b.AbstractC29315y;
import com.squareup.p2081b.C29299t;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.b */
public final class C29266b extends AbstractC29315y {

    /* renamed from: a */
    private static final int f69423a = 22;

    /* renamed from: b */
    private final AssetManager f69424b;

    static {
        Covode.recordClassIndex(35615);
    }

    public C29266b(Context context) {
        this.f69424b = context.getAssets();
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: a */
    public final boolean mo51062a(C29312w wVar) {
        Uri uri = wVar.f69562d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: b */
    public final AbstractC29315y.C29316a mo51063b(C29312w wVar) {
        MethodCollector.m26663i(11328);
        AbstractC29315y.C29316a aVar = new AbstractC29315y.C29316a(this.f69424b.open(wVar.f69562d.toString().substring(f69423a)), C29299t.EnumC29305d.DISK);
        MethodCollector.m26664o(11328);
        return aVar;
    }
}
