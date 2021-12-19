package com.bytedance.android.livesdk.p433ac;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.bytedance.android.livesdk.ac.a */
public abstract class AbstractC6583a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    protected int f16463a = 0;

    static {
        Covode.recordClassIndex(7319);
    }

    /* renamed from: a */
    public abstract <T> void mo12739a(T t);

    public AbstractC6583a(View view) {
        super(view);
        if (Logger.debug()) {
            C3854a.m9453a(3, StringSet.type, "0");
        }
    }
}
