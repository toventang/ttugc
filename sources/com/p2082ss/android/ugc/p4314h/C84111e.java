package com.p2082ss.android.ugc.p4314h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30091m;
import com.p2082ss.android.ugc.p4314h.C84114f;
import com.p2082ss.android.ugc.p4314h.C84116g;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.h.e */
public final class C84111e implements C84116g.AbstractC84117a {

    /* renamed from: a */
    private volatile double f187701a = -1.0d;

    /* renamed from: b */
    private AbstractC84112a f187702b;

    /* renamed from: com.ss.android.ugc.h.e$a */
    public interface AbstractC84112a {
        static {
            Covode.recordClassIndex(98008);
        }

        /* renamed from: a */
        Map<String, Object> mo118416a();
    }

    static {
        Covode.recordClassIndex(98007);
    }

    /* renamed from: com.ss.android.ugc.h.e$b */
    public static class C84113b extends Exception {

        /* renamed from: a */
        private int f187703a;

        /* renamed from: b */
        private String f187704b;

        static {
            Covode.recordClassIndex(98009);
        }

        public final int getCode() {
            return this.f187703a;
        }

        public final String getMsg() {
            return this.f187704b;
        }

        public C84113b(int i, String str) {
            this.f187703a = i;
            this.f187704b = str;
        }
    }

    public C84111e(AbstractC84112a aVar) {
        this.f187702b = aVar;
    }

    @Override // com.p2082ss.android.ugc.p4314h.C84116g.AbstractC84117a
    /* renamed from: b */
    public final double mo118415b(Queue<C84119i> queue, C84119i[] iVarArr) {
        return this.f187701a;
    }

    @Override // com.p2082ss.android.ugc.p4314h.C84116g.AbstractC84117a
    /* renamed from: a */
    public final double mo118414a(Queue<C84119i> queue, C84119i[] iVarArr) {
        int i;
        String str;
        C30091m mVar = C84114f.C84115a.f187706a.f187705a;
        if (mVar == null || !mVar.mo53465c() || !mVar.mo53464b()) {
            this.f187701a = -1.0d;
            if (mVar == null) {
                i = 0;
                str = "component is null";
            } else {
                i = 3;
                str = "component is not initialized ready";
            }
            throw new C84113b(i, str);
        }
        queue.toArray(iVarArr);
        HashMap hashMap = new HashMap();
        int min = Math.min(iVarArr.length, queue.size());
        int i2 = min - 1;
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = min - i3;
            hashMap.put("f".concat(String.valueOf(i4)), Float.valueOf((float) iVarArr[i3].f187722c));
            hashMap.put("s".concat(String.valueOf(i4)), Float.valueOf(((float) iVarArr[i3].f187721b) / 8000.0f));
            hashMap.put("i".concat(String.valueOf(i4)), Float.valueOf(((float) iVarArr[i2].f187724e) - ((float) iVarArr[i3].f187724e)));
        }
        hashMap.putAll(this.f187702b.mo118416a());
        this.f187701a = (double) mVar.f71806b.mo53454a(hashMap, mVar.mo53460a(), mVar.f71808d.output, mVar.f71808d.feature_list);
        if (this.f187701a != -1.0d) {
            return this.f187701a;
        }
        if (!mVar.f71806b.mo53459a()) {
            throw new C84113b(4, "evaluator is not initialized");
        }
        throw new C84113b(5, "evaluator calculate error");
    }
}
