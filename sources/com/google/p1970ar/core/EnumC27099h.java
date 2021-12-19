package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.h */
public enum EnumC27099h {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class);
    

    /* renamed from: i */
    final int f64162i;

    /* renamed from: j */
    private final Class<?> f64163j;

    static {
        Covode.recordClassIndex(32679);
    }

    /* renamed from: a */
    public static EnumC27099h m53865a(Class<? extends Trackable> cls) {
        EnumC27099h[] values = values();
        for (EnumC27099h hVar : values) {
            Class<?> cls2 = hVar.f64163j;
            if (cls2 != null && cls2.equals(cls)) {
                return hVar;
            }
        }
        return UNKNOWN_TO_JAVA;
    }

    private EnumC27099h(int i, Class cls) {
        this.f64162i = i;
        this.f64163j = cls;
    }
}
