package com.facebook.imagepipeline.p1871a.p1873b;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1879d.C24382h;
import com.facebook.imagepipeline.p1880e.AbstractC24410e;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.imagepipeline.a.b.b */
public final class C24328b {

    /* renamed from: a */
    public static AbstractC24335f f57689a;

    /* renamed from: b */
    public static int f57690b;
    private static AbstractC24327a sImpl;
    private static boolean sImplLoaded;

    static {
        Covode.recordClassIndex(28470);
    }

    /* renamed from: a */
    public static AbstractC24327a m46299a(AbstractC24357f fVar, AbstractC24410e eVar, C24382h<AbstractC24026e, AbstractC24454c> hVar) {
        if (!sImplLoaded) {
            try {
                sImpl = (AbstractC24327a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(AbstractC24357f.class, AbstractC24410e.class, C24382h.class).newInstance(fVar, eVar, hVar);
            } catch (Throwable unused) {
            }
            if (sImpl != null) {
                sImplLoaded = true;
            }
        }
        return sImpl;
    }
}
