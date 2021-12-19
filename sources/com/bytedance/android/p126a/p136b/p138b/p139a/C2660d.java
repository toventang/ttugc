package com.bytedance.android.p126a.p136b.p138b.p139a;

import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.p135h.C2646f;
import com.bytedance.android.p126a.p136b.C2651a;
import com.bytedance.android.p126a.p136b.p138b.C2665b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.a.b.b.a.d */
public final class C2660d extends AbstractC2656a {
    static {
        Covode.recordClassIndex(3048);
    }

    public C2660d(C2651a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2656a
    /* renamed from: a */
    public final C2665b mo7175a(C2665b bVar) {
        String str = bVar.f7957b;
        Map<String, String> map = bVar.f7960e.f7890l;
        if (map == null) {
            return super.mo7175a(bVar);
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (str.contains(entry.getKey())) {
                    String b = C2646f.m7660b(entry.getValue());
                    if (!TextUtils.isEmpty(b)) {
                        str = str.replace(entry.getKey(), b);
                    }
                }
            }
            C2665b.C2666a aVar = bVar.f7956a;
            aVar.f7961a = str;
            return aVar.mo7182a();
        } catch (Throwable unused) {
            return super.mo7175a(bVar);
        }
    }
}
