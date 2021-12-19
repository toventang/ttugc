package com.p2082ss.android.ugc.aweme.base;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.l */
public class C34602l {

    /* renamed from: a */
    public String f81654a;

    /* renamed from: b */
    public List<String> f81655b = new ArrayList();

    static {
        Covode.recordClassIndex(41564);
    }

    /* renamed from: a */
    public final boolean mo61062a() {
        List<String> list = this.f81655b;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public C34602l(String str, List<String> list) {
        this.f81654a = str;
        if (!(list == null || list.isEmpty())) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    this.f81655b.add(str2);
                }
            }
        }
    }
}
