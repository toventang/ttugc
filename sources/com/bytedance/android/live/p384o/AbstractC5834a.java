package com.bytedance.android.live.p384o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.o.a */
public interface AbstractC5834a extends AbstractC2953a {
    static {
        Covode.recordClassIndex(6441);
    }

    Fragment getSubscribeInfoListFragment(Context context, String str);

    void openUserSubscribeEntry(Context context, Room room, String str);

    void openUserSubscribeState(Context context, Room room, String str);
}
