package com.bytedance.android.live.annotation;

import com.bytedance.covode.number.Covode;

public @interface Group {
    static {
        Covode.recordClassIndex(3349);
    }

    boolean isDefault() default false;

    String value() default "";
}
