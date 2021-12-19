package com.lynx.p2031a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.a.f */
public final class C28192f {

    /* renamed from: a */
    private static AbstractC28191e f65988a;

    /* renamed from: b */
    private static AbstractC28181a f65989b;

    static {
        Covode.recordClassIndex(34138);
    }

    /* renamed from: a */
    public static AbstractC28191e m56294a() {
        final Class<?> cls;
        AbstractC28191e eVar = f65988a;
        if (eVar != null) {
            return eVar;
        }
        try {
            cls = Class.forName("com.lynx.fresco.FrescoImageLoader");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("com.lynx.glide.GlideImageLoader");
            } catch (ClassNotFoundException unused2) {
                throw new RuntimeException("can not find lynx ImageLoader!");
            }
        }
        C281931 r0 = new AbstractC28191e() {
            /* class com.lynx.p2031a.C28192f.C281931 */

            static {
                Covode.recordClassIndex(34139);
            }

            @Override // com.lynx.p2031a.AbstractC28191e
            /* renamed from: a */
            public final AbstractC28189d mo48222a() {
                try {
                    return (AbstractC28189d) cls.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("instance lynx ImageLoader failed", e);
                }
            }
        };
        f65988a = r0;
        return r0;
    }

    /* renamed from: b */
    public static AbstractC28181a m56295b() {
        Class<?> cls;
        AbstractC28181a aVar = f65989b;
        if (aVar != null) {
            return aVar;
        }
        try {
            cls = Class.forName("com.lynx.fresco.FrescoBitmapPool");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("com.lynx.glide.GlideBitmapPool");
            } catch (ClassNotFoundException unused2) {
                throw new RuntimeException("can not find lynx BitmapCache!");
            }
        }
        try {
            AbstractC28181a aVar2 = (AbstractC28181a) cls.newInstance();
            f65989b = aVar2;
            return aVar2;
        } catch (Exception e) {
            throw new RuntimeException("instance lynx BitmapCache failed", e);
        }
    }
}
