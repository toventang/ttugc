package com.bytedance.router.route;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public interface IRouteAction {
    static {
        Covode.recordClassIndex(25904);
    }

    Object open(Context context, String str, Bundle bundle);
}
