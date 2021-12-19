package com.bytedance.android.livesdk.chatroom.backroom;

import android.app.Activity;
import com.bytedance.android.livesdk.chatroom.backroom.p483b.AbstractC7336a;
import com.bytedance.android.livesdk.chatroom.backroom.p483b.C7337b;
import com.bytedance.android.livesdk.chatroom.backroom.p483b.C7338c;
import com.bytedance.android.livesdk.chatroom.backroom.p483b.C7339d;
import com.bytedance.android.livesdk.chatroom.backroom.p483b.C7340e;
import com.bytedance.android.livesdk.chatroom.backroom.p486e.AbstractC7351b;
import com.bytedance.android.livesdk.chatroom.backroom.p486e.C7350a;
import com.bytedance.android.livesdk.chatroom.backroom.p486e.C7352c;
import com.bytedance.android.livesdk.watch.chatroom.AbstractC11323a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.b */
public final class C7334b {

    /* renamed from: a */
    public static final C7334b f18205a = new C7334b();

    /* renamed from: b */
    private static final AbstractC89244h f18206b = C89250i.m154773a((AbstractC89171a) C7335a.f18209a);

    /* renamed from: c */
    private static final ArrayList<AbstractC7351b> f18207c;

    /* renamed from: d */
    private static final ArrayList<AbstractC7336a> f18208d;

    /* renamed from: a */
    public static Map<Integer, AbstractC11323a> m15233a() {
        return (Map) f18206b.getValue();
    }

    private C7334b() {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.b$a */
    static final class C7335a extends AbstractC89220m implements AbstractC89171a<HashMap<Integer, AbstractC11323a>> {

        /* renamed from: a */
        public static final C7335a f18209a = new C7335a();

        static {
            Covode.recordClassIndex(8099);
        }

        C7335a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<Integer, AbstractC11323a> invoke() {
            return new HashMap();
        }
    }

    static {
        Covode.recordClassIndex(8098);
        ArrayList<AbstractC7351b> arrayList = new ArrayList<>();
        f18207c = arrayList;
        ArrayList<AbstractC7336a> arrayList2 = new ArrayList<>();
        f18208d = arrayList2;
        m15234a(arrayList2, new C7340e());
        m15234a(arrayList2, new C7337b());
        m15234a(arrayList2, new C7339d());
        m15234a(arrayList2, new C7338c());
        m15234a(arrayList, new C7350a());
        m15234a(arrayList, new C7352c());
    }

    /* renamed from: a */
    private static AbstractC11323a m15232a(int i) {
        AbstractC11323a aVar = m15233a().get(Integer.valueOf(i));
        if (aVar == null) {
            aVar = new C7330a(f18208d, f18207c);
        }
        if (m15233a().get(Integer.valueOf(i)) == null) {
            m15233a().put(Integer.valueOf(i), aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public final AbstractC11323a mo13571a(Activity activity) {
        int i;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        return m15232a(i);
    }

    /* renamed from: a */
    private static <T> void m15234a(ArrayList<T> arrayList, T t) {
        if (!arrayList.contains(t)) {
            arrayList.add(t);
        }
    }
}
