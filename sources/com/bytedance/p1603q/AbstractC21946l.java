package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1603q.C21940h;
import com.bytedance.p1603q.p1605b.AbstractC21932a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.q.l */
public abstract class AbstractC21946l<IN, OUT> extends AbstractC21935d<IN, OUT> {

    /* renamed from: b */
    public Map<String, C21947a> f51938b;

    static {
        Covode.recordClassIndex(25612);
    }

    AbstractC21946l() {
    }

    /* renamed from: com.bytedance.q.l$a */
    public static final class C21947a {

        /* renamed from: a */
        List<C21940h> f51939a = new ArrayList();

        static {
            Covode.recordClassIndex(25613);
        }

        /* renamed from: a */
        public final C21947a mo35700a(C21940h hVar) {
            this.f51939a.add(hVar);
            return this;
        }

        /* renamed from: a */
        public final C21947a mo35701a(List<C21940h> list) {
            this.f51939a.addAll(list);
            return this;
        }
    }

    /* renamed from: com.bytedance.q.l$b */
    public static final class C21948b {

        /* renamed from: a */
        public AbstractC21932a f51940a;

        /* renamed from: b */
        private Map<String, C21947a> f51941b = new HashMap();

        static {
            Covode.recordClassIndex(25614);
        }

        /* renamed from: a */
        public final C21940h mo35702a(Class<? extends AbstractC21946l> cls) {
            C21940h.C21941a a = new C21940h.C21941a().mo35698a(cls);
            a.f51929c = new Object[]{this.f51941b};
            a.f51928b = this.f51940a;
            return a.mo35699a();
        }

        /* renamed from: a */
        public final C21947a mo35703a(String str) {
            if (!this.f51941b.containsKey(str)) {
                C21947a aVar = new C21947a();
                this.f51941b.put(str, aVar);
                return aVar;
            }
            throw new IllegalArgumentException("duplicated branch name");
        }
    }

    /* renamed from: a */
    static boolean m41274a(List<C21940h> list) {
        if (!list.isEmpty() && list.get(list.size() - 1).f51924a == C21939g.class) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        if (objArr == null || objArr.length != 1 || objArr[0] == null) {
            throw new IllegalStateException("args error");
        }
        try {
            this.f51938b = (Map) objArr[0];
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
