package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3558b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b */
public final class C63115b {

    /* renamed from: a */
    public C63102f f143443a;

    /* renamed from: b */
    public List<String> f143444b;

    static {
        Covode.recordClassIndex(73957);
    }

    /* renamed from: a */
    public final String mo101340a(List<String> list) {
        int size = list.size();
        char[] cArr = new char[size];
        for (int i = 0; i < size; i++) {
            int indexOf = this.f143444b.indexOf(list.get(i));
            if (indexOf < 0) {
                return null;
            }
            cArr[i] = (char) (indexOf + 48);
        }
        Arrays.sort(cArr);
        return new String(cArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$a */
    public static class C63117a {

        /* renamed from: a */
        public ConditionConfig f143446a;

        /* renamed from: b */
        public String f143447b;

        static {
            Covode.recordClassIndex(73959);
        }

        public C63117a(ConditionConfig conditionConfig, String str) {
            this.f143446a = conditionConfig;
            this.f143447b = str;
        }
    }
}
