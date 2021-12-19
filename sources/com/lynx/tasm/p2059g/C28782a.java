package com.lynx.tasm.p2059g;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.lynx.tasm.g.a */
public class C28782a {

    /* renamed from: a */
    public HashMap<String, String> f67870a = new HashMap<>();

    /* renamed from: b */
    public int f67871b = 0;

    static {
        Covode.recordClassIndex(34881);
    }

    /* renamed from: a */
    public final boolean mo49899a(C28782a aVar) {
        if (aVar == null) {
            return false;
        }
        this.f67870a = aVar.f67870a;
        this.f67871b++;
        return true;
    }

    /* renamed from: a */
    public final void mo49898a(HashMap hashMap, String str) {
        hashMap.put(str, this.f67870a);
    }
}
