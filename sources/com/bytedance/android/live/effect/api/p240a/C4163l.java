package com.bytedance.android.live.effect.api.p240a;

import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.live.effect.api.a.l */
public final class C4163l {

    /* renamed from: f */
    private static final List<C4148a> f11591f;

    /* renamed from: g */
    private static final List<String> f11592g;

    /* renamed from: a */
    public final List<C4148a> f11593a;

    /* renamed from: b */
    public final List<String> f11594b;

    /* renamed from: c */
    public final AbstractC4149b f11595c;

    /* renamed from: d */
    public final List<String> f11596d;

    /* renamed from: e */
    public final List<String> f11597e;

    /* renamed from: com.bytedance.android.live.effect.api.a.l$a */
    public static class C4164a {

        /* renamed from: a */
        List<C4148a> f11598a;

        /* renamed from: b */
        public List<String> f11599b;

        /* renamed from: c */
        public List<String> f11600c;

        /* renamed from: d */
        public AbstractC4149b f11601d;

        static {
            Covode.recordClassIndex(4734);
        }

        /* renamed from: a */
        public final C4163l mo9872a() {
            return new C4163l(this);
        }
    }

    static {
        Covode.recordClassIndex(4733);
        LinkedList linkedList = new LinkedList();
        f11591f = linkedList;
        LinkedList linkedList2 = new LinkedList();
        f11592g = linkedList2;
        linkedList.add(new C4148a("beauty", Arrays.asList(1, 2, 3)));
        linkedList.add(new C4148a(C4147a.f11586d, Arrays.asList(1, 2, 3)));
        linkedList.add(new C4148a("effect_gift", Arrays.asList(1, 3)));
        linkedList.add(new C4148a("livegame", Collections.singletonList(3)));
        linkedList.add(new C4148a("livemoneygame", Collections.singletonList(3)));
        linkedList.add(new C4148a(C4147a.f11583a, Collections.singletonList(2)));
        linkedList.add(new C4148a(C4147a.f11584b, Collections.singletonList(2)));
        linkedList.add(new C4148a(C4147a.f11585c, Collections.singletonList(2)));
        linkedList2.add(C4147a.f11586d);
        linkedList2.add("makeupforever");
    }

    public C4163l(C4164a aVar) {
        List<String> list;
        List<String> list2;
        List<C4148a> list3;
        this.f11595c = aVar.f11601d;
        if (aVar.f11599b == null) {
            list = Collections.emptyList();
        } else {
            list = aVar.f11599b;
        }
        this.f11594b = list;
        if (aVar.f11600c == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = aVar.f11600c;
        }
        this.f11596d = list2;
        if (aVar.f11598a == null || aVar.f11598a.isEmpty()) {
            list3 = f11591f;
        } else {
            list3 = aVar.f11598a;
        }
        this.f11593a = list3;
        this.f11597e = f11592g;
    }
}
