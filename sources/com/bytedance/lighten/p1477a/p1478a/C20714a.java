package com.bytedance.lighten.p1477a.p1478a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lighten.a.a.a */
public class C20714a {

    /* renamed from: a */
    public List<String> f48941a = new ArrayList();

    static {
        Covode.recordClassIndex(24287);
    }

    /* renamed from: a */
    public final boolean mo34125a() {
        List<String> list = this.f48941a;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public C20714a(List<String> list) {
        if (!(list == null || list.isEmpty())) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    this.f48941a.add(str);
                }
            }
        }
    }
}
