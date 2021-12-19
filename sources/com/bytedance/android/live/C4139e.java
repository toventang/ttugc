package com.bytedance.android.live;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.utils.adapter.C9911a;
import com.bytedance.android.livesdk.model.utils.adapter.FeedItemTypeAdapter;
import com.bytedance.android.livesdk.model.utils.adapter.RoomTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.google.gson.EnumC27902d;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.e */
public final class C4139e {
    static {
        Covode.recordClassIndex(4706);
    }

    /* renamed from: com.bytedance.android.live.e$a */
    public static class C4140a {

        /* renamed from: a */
        public static final C27917g f11574a;

        /* renamed from: b */
        public static final C27910f f11575b;

        /* renamed from: c */
        public static final C27910f f11576c = new C27910f();

        static {
            Covode.recordClassIndex(4707);
            C27917g gVar = new C27917g();
            gVar.f65562b = EnumC27902d.LOWER_CASE_WITH_UNDERSCORES;
            C27917g a = gVar.mo46681a((Type) Room.class, (Object) new RoomTypeAdapter()).mo46681a((Type) FeedItem.class, (Object) new FeedItemTypeAdapter()).mo46681a((Type) Boolean.class, (Object) new C9911a()).mo46681a((Type) Boolean.TYPE, (Object) new C9911a());
            f11574a = a;
            f11575b = a.mo46682b();
        }
    }
}
