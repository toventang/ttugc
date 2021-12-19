package com.bytedance.android.livesdkapi.p675c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.c.a */
public interface AbstractC11616a extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdkapi.c.a$a */
    public interface AbstractC11617a {
        static {
            Covode.recordClassIndex(13284);
        }

        /* renamed from: a */
        void mo13992a();
    }

    static {
        Covode.recordClassIndex(13283);
    }

    /* renamed from: a */
    void mo18411a(Context context, String str, long j);

    /* renamed from: a */
    void mo18412a(Context context, String str, long j, AbstractC11617a aVar);

    /* renamed from: a */
    void mo18413a(Uri uri, EnterRoomConfig enterRoomConfig);

    /* renamed from: a */
    void mo18414a(String str, String str2, Map<String, String> map, Map<String, String> map2);
}
