package com.bytedance.android.livesdkapi.p676d;

import com.bytedance.android.livesdk.livesetting.hybrid.LiveGurdPatternsSetting;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.livesdkapi.d.c */
public final class C11621c {
    static {
        Covode.recordClassIndex(13288);
    }

    /* renamed from: a */
    public static List<Pattern> m20436a() {
        ArrayList arrayList = new ArrayList();
        for (String str : LiveGurdPatternsSetting.INSTANCE.getValue()) {
            arrayList.add(Pattern.compile(str));
        }
        return arrayList;
    }
}
