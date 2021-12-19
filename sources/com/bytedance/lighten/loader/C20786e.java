package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import com.facebook.fresco.animation.p1863b.AbstractC24280b;
import com.facebook.fresco.animation.p1863b.p1865b.AbstractC24281a;
import com.facebook.fresco.animation.p1863b.p1865b.AbstractC24282b;
import com.facebook.fresco.animation.p1863b.p1865b.C24285d;

/* renamed from: com.bytedance.lighten.loader.e */
final class C20786e implements AbstractC24281a {

    /* renamed from: a */
    private static final Class<?> f49182a = C24285d.class;

    /* renamed from: b */
    private final int f49183b;

    /* renamed from: c */
    private int[] f49184c;

    /* renamed from: d */
    private C20787f f49185d;

    static {
        Covode.recordClassIndex(24362);
    }

    public C20786e(int[] iArr, C20787f fVar) {
        this(iArr, fVar, (byte) 0);
    }

    private C20786e(int[] iArr, C20787f fVar, byte b) {
        this.f49183b = 3;
        this.f49184c = iArr;
        this.f49185d = fVar;
    }

    @Override // com.facebook.fresco.animation.p1863b.p1865b.AbstractC24281a
    /* renamed from: a */
    public final void mo34219a(AbstractC24282b bVar, AbstractC24280b bVar2, AbstractC24270a aVar, int i) {
        for (int i2 = 1; i2 <= this.f49183b; i2++) {
            int[] iArr = this.f49184c;
            int i3 = iArr[(this.f49185d.f49187b + i2) % iArr.length];
            if (i3 >= this.f49185d.f49186a.mo40050e()) {
                C24099a.m45656c(f49182a, "Preparing frame %d, last drawn: %d, but preparing frame is out of bounds", Integer.valueOf(i3), Integer.valueOf(i));
                return;
            }
            if (C24099a.m45645a(2)) {
                C24099a.m45636a(f49182a, "Preparing frame %d, last drawn: %d", Integer.valueOf(i3), Integer.valueOf(i));
            }
            bVar.mo40061a(bVar2, aVar, i3);
        }
    }
}
