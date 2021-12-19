package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public interface IPointDepend {
    static {
        Covode.recordClassIndex(18394);
    }

    PointModel getCurrentPoint();
}
