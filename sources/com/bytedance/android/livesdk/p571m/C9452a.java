package com.bytedance.android.livesdk.p571m;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p571m.C9454b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.m.a */
public final class C9452a {

    /* renamed from: a */
    public static final AbstractC89244h f22985a = C89250i.m154773a((AbstractC89171a) C9453a.f22987a);

    /* renamed from: b */
    public static final C9452a f22986b = new C9452a();

    private C9452a() {
    }

    /* renamed from: com.bytedance.android.livesdk.m.a$a */
    static final class C9453a extends AbstractC89220m implements AbstractC89171a<ArrayList<String>> {

        /* renamed from: a */
        public static final C9453a f22987a = new C9453a();

        static {
            Covode.recordClassIndex(10961);
        }

        C9453a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayList<String> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("live_merge");
            arrayList.add("homepage_hot");
            arrayList.add("live_end");
            arrayList.add("feed");
            return arrayList;
        }
    }

    static {
        Covode.recordClassIndex(10960);
    }

    /* renamed from: b */
    public static void m17754b(Room room, String str, String str2, C9454b.EnumC9455a aVar) {
        C89219l.m154721d(aVar, "");
        if (room != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            C9454b.m17755a(room, str, str2, aVar);
        }
    }

    /* renamed from: a */
    public static void m17753a(Room room, String str, String str2, C9454b.EnumC9455a aVar) {
        C89219l.m154721d(aVar, "");
        if (room != null) {
            C6779a.m14563a().mo13053a(new C9461f(room.getId()));
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6o);
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            C9454b.m17755a(room, str, str2, aVar);
        }
    }
}
