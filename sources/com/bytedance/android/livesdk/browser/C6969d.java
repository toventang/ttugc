package com.bytedance.android.livesdk.browser;

import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2936j;
import com.bytedance.android.livesdk.container.AbstractC8241e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.d */
public final class C6969d implements AbstractC2936j {

    /* renamed from: a */
    public static final C6970a f17437a = new C6970a((byte) 0);

    /* renamed from: b */
    private Map<String, List<C4031a>> f17438b = new ConcurrentHashMap();

    /* renamed from: c */
    private Map<String, C4031a> f17439c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(7708);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.d$a */
    public static final class C6970a {
        static {
            Covode.recordClassIndex(7709);
        }

        private C6970a() {
        }

        public /* synthetic */ C6970a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.d$b */
    public static final class C6971b {

        /* renamed from: a */
        public static final C6969d f17440a = new C6969d();

        /* renamed from: b */
        public static final C6971b f17441b = new C6971b();

        private C6971b() {
        }

        static {
            Covode.recordClassIndex(7710);
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2936j
    /* renamed from: a */
    public final void mo7672a() {
        this.f17439c.clear();
        for (Map.Entry<String, List<C4031a>> entry : this.f17438b.entrySet()) {
            for (T t : entry.getValue()) {
                if (t.isAdded()) {
                    t.dismissAllowingStateLoss();
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2936j
    /* renamed from: b */
    public final List<AbstractC8241e> mo7677b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C4031a> entry : this.f17439c.entrySet()) {
            C4031a value = entry.getValue();
            if (value instanceof AbstractC8241e) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2936j
    /* renamed from: b */
    public final C4031a mo7676b(String str) {
        C89219l.m154721d(str, "");
        return this.f17439c.get(str);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2936j
    /* renamed from: a */
    public final void mo7673a(C4031a aVar) {
        C89219l.m154721d(aVar, "");
        this.f17439c.remove(aVar.mo9425j_());
        for (Map.Entry<String, List<C4031a>> entry : this.f17438b.entrySet()) {
            List<C4031a> value = entry.getValue();
            if (value.contains(aVar)) {
                value.remove(aVar);
                if (value.isEmpty()) {
                    this.f17438b.remove(entry.getKey());
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2936j
    /* renamed from: a */
    public final void mo7674a(String str) {
        C89219l.m154721d(str, "");
        List<C4031a> list = this.f17438b.get(str);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().dismissAllowingStateLoss();
            }
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2936j
    /* renamed from: a */
    public final void mo7675a(String str, C4031a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        List<C4031a> list = this.f17438b.get(str);
        Map<String, C4031a> map = this.f17439c;
        String j_ = aVar.mo9425j_();
        C89219l.m154716b(j_, "");
        map.put(j_, aVar);
        if (list == null) {
            list = new ArrayList<>();
            this.f17438b.put(str, list);
        }
        list.add(aVar);
    }
}
