package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.f */
public abstract class AbstractC14696f {

    /* renamed from: b */
    private static final String f35719b = AbstractC14696f.class.getSimpleName();

    /* renamed from: a */
    public EnumC14698a f35720a;

    /* renamed from: a */
    public abstract String mo23699a(Uri uri);

    static {
        Covode.recordClassIndex(16793);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.f$1 */
    static /* synthetic */ class C146971 {

        /* renamed from: a */
        static final /* synthetic */ int[] f35721a;

        static {
            Covode.recordClassIndex(16794);
            int[] iArr = new int[EnumC14698a.values().length];
            f35721a = iArr;
            try {
                iArr[EnumC14698a.STATIC_DISPATCH_STRATEGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.f$a */
    public enum EnumC14698a {
        UNKNOWN_DISPATCH_STRATEGY,
        STATIC_DISPATCH_STRATEGY,
        WRR_DISPATCH_STRATEGY,
        CONSERVATIVE_DISPATCH_STRATEGY,
        OPTIMIZED_DISPATCH_STRATEGY,
        ROUTE_SELECTION_DISPATCH_STRATEGY,
        DISPATCH_STRATEGY_SUPPORTED_LAST;

        static {
            Covode.recordClassIndex(16795);
        }
    }

    public AbstractC14696f(EnumC14698a aVar) {
        this.f35720a = aVar;
    }
}
