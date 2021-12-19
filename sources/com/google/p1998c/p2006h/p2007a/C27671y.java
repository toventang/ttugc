package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;

/* renamed from: com.google.c.h.a.y */
public final class C27671y {
    static {
        Covode.recordClassIndex(33251);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0001 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: a */
    public static <V> V m55319a(Future<V> future) {
        boolean z = false;
        V v = future;
        while (true) {
            try {
                v = (V) v.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
                v = v;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
