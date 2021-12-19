package com.p2082ss.android.ugc.aweme.childhook;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a.AbstractC35681d;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a.C35678a;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a.C35679b;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a.C35680c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.childhook.a */
public final class C35677a {

    /* renamed from: a */
    public static final C35677a f84179a = new C35677a();

    private C35677a() {
    }

    static {
        Covode.recordClassIndex(42907);
    }

    /* renamed from: a */
    public static boolean m72831a(Intent intent) {
        C89219l.m154721d(intent, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35678a());
        arrayList.add(new C35680c());
        arrayList.add(new C35679b());
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((AbstractC35681d) arrayList.get(i)).mo62725a(intent)) {
                    return ((AbstractC35681d) arrayList.get(i)).mo62726b(intent);
                }
            }
        }
        return true;
    }
}
