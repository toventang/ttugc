package com.p2082ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.f */
public final class C46628f {

    /* renamed from: a */
    private static HashMap<String, C46516b> f108730a = new HashMap<>();

    static {
        Covode.recordClassIndex(55219);
    }

    /* renamed from: b */
    public static void m90008b(String str) {
        f108730a.remove(str);
    }

    /* renamed from: a */
    public static C46516b m90006a(String str) {
        return f108730a.get(str);
    }

    /* renamed from: a */
    public static void m90007a(String str, C46516b bVar) {
        f108730a.put(str, bVar);
    }
}
