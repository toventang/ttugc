package com.bytedance.android.live.design.app.p232b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.design.app.b.d */
public final class C4067d {

    /* renamed from: a */
    public final List<C4064b> f11266a;

    /* renamed from: b */
    public int f11267b;

    static {
        Covode.recordClassIndex(4611);
    }

    /* renamed from: com.bytedance.android.live.design.app.b.d$a */
    public static final class C4068a {

        /* renamed from: a */
        public final List<C4064b> f11268a = new ArrayList();

        /* renamed from: b */
        public int f11269b = 0;

        static {
            Covode.recordClassIndex(4612);
        }

        /* renamed from: a */
        public final C4067d mo9516a() {
            return new C4067d(this, (byte) 0);
        }

        /* renamed from: a */
        public final C4068a mo9515a(C4064b bVar) {
            if (bVar != null) {
                this.f11268a.add(bVar);
            }
            return this;
        }
    }

    private C4067d(C4068a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f11266a = arrayList;
        arrayList.addAll(aVar.f11268a);
        this.f11267b = aVar.f11269b;
    }

    /* synthetic */ C4067d(C4068a aVar, byte b) {
        this(aVar);
    }
}
