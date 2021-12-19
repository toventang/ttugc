package com.bytedance.ies.bullet.kit.lynx.p1152a;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.p1152a.AbstractC16372a;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.a.b */
public final class C16373b<K, V extends AbstractC16372a> extends LruCache<K, V> {
    static {
        Covode.recordClassIndex(18669);
    }

    public C16373b(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        AbstractC16372a aVar = (AbstractC16372a) obj2;
        if (aVar != null) {
            return aVar.mo25963b();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.LruCache
    public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        AbstractC16372a aVar = (AbstractC16372a) obj2;
        super.entryRemoved(z, obj, aVar, obj3);
        if (aVar != null) {
            aVar.mo25721a();
        }
    }
}
