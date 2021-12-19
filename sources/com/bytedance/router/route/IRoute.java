package com.bytedance.router.route;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public interface IRoute {
    static {
        Covode.recordClassIndex(25903);
    }

    String getHost();

    Bundle getParams();

    String getPath();

    String getScheme();

    String getUrl();

    void open(Context context);
}
