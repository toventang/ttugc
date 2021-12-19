package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.s */
public final class C80627s {

    /* renamed from: a */
    public static final C80627s f180278a = new C80627s();

    private C80627s() {
    }

    static {
        Covode.recordClassIndex(93901);
    }

    /* renamed from: a */
    public static List<String> m139794a(JSONArray jSONArray) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                num = Integer.valueOf(jSONArray.length());
            } catch (Exception unused) {
            }
        } else {
            num = null;
        }
        int i = 0;
        if (num == null) {
            C89219l.m154715b();
        }
        int intValue = num.intValue();
        if (intValue >= 0) {
            while (true) {
                arrayList.add(jSONArray.getString(i));
                if (i == intValue) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
