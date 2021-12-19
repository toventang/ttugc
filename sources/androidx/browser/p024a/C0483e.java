package androidx.browser.p024a;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p009a.AbstractC0067a;
import android.support.p009a.AbstractC0070b;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: androidx.browser.a.e */
public final class C0483e {

    /* renamed from: a */
    final AbstractC0067a f1830a;

    /* renamed from: b */
    public final ComponentName f1831b;

    /* renamed from: c */
    private final Object f1832c = new Object();

    /* renamed from: d */
    private final AbstractC0070b f1833d;

    static {
        Covode.recordClassIndex(548);
    }

    /* renamed from: a */
    public final boolean mo2043a(Uri uri, List<Bundle> list) {
        try {
            return this.f1833d.mo60a(this.f1830a, uri, (Bundle) null, (List<Bundle>) null);
        } catch (RemoteException unused) {
            return false;
        }
    }

    C0483e(AbstractC0070b bVar, AbstractC0067a aVar, ComponentName componentName) {
        this.f1833d = bVar;
        this.f1830a = aVar;
        this.f1831b = componentName;
    }
}
