package com.bytedance.ies.ugc.aweme.rich.p1271c.p1273b;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1270b.C18141a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18145d;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18146e;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18147f;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import java.util.ArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.rich.c.b.a */
public final class C18149a implements AbstractC18146e {

    /* renamed from: a */
    public final ArrayList<Integer> f43213a = new ArrayList<>();

    /* renamed from: b */
    public final SparseArray<Bundle> f43214b = new SparseArray<>();

    /* renamed from: c */
    public C18141a f43215c;

    /* renamed from: d */
    private final AbstractC89244h f43216d = C89250i.m154773a((AbstractC89171a) C18150a.f43219a);

    /* renamed from: e */
    private final Context f43217e;

    /* renamed from: f */
    private final AbstractC18145d f43218f;

    static {
        Covode.recordClassIndex(20790);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c
    /* renamed from: a */
    public final Context mo28928a() {
        return this.f43217e;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c
    /* renamed from: b */
    public final C18141a mo28929b() {
        return this.f43215c;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.c.b.a$a */
    static final class C18150a extends AbstractC89220m implements AbstractC89171a<Bundle> {

        /* renamed from: a */
        public static final C18150a f43219a = new C18150a();

        static {
            Covode.recordClassIndex(20791);
        }

        C18150a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Bundle invoke() {
            return new Bundle();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18146e
    /* renamed from: c */
    public final C18147f mo28932c() {
        C18151b bVar = new C18151b(this.f43214b, this.f43213a, this.f43218f, this);
        for (Integer num : bVar.f43222c) {
            int intValue = num.intValue();
            Bundle bundle = bVar.f43221b.get(intValue);
            if (bundle == null) {
                bundle = new Bundle();
            }
            AbstractC18143b a = bVar.f43223d.mo28930a(intValue, bVar.f43224e, bundle);
            if (a != null) {
                if (!(a instanceof AbstractC18142a)) {
                    C89219l.m154719c("Task skipped!!! If you have IRichAsyncTask, pls invoke executeAsync!", "");
                    Thread currentThread = Thread.currentThread();
                    C89219l.m154709a((Object) currentThread, "");
                    currentThread.getName();
                } else if (a.mo28927b()) {
                    C18148g a2 = ((AbstractC18142a) a).mo28925a();
                    a.mo28926a(a2.f43211a);
                    bVar.f43220a.put(String.valueOf(intValue), a2.f43212b);
                    if (a2.f43211a) {
                        String jSONObject = bVar.f43220a.toString();
                        C89219l.m154709a((Object) jSONObject, "");
                        return new C18147f(true, intValue, jSONObject);
                    }
                } else {
                    continue;
                }
            }
        }
        String jSONObject2 = bVar.f43220a.toString();
        C89219l.m154709a((Object) jSONObject2, "");
        return new C18147f(false, Integer.MIN_VALUE, jSONObject2);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18146e
    /* renamed from: a */
    public final AbstractC18146e mo28931a(int i, Bundle bundle) {
        this.f43213a.add(Integer.valueOf(i));
        this.f43214b.put(i, bundle);
        return this;
    }

    public C18149a(Context context, AbstractC18145d dVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(dVar, "");
        this.f43217e = context;
        this.f43218f = dVar;
    }
}
