package com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a;

import android.content.ComponentName;
import android.content.Intent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.childhook.C35691d;
import com.p2082ss.android.ugc.aweme.childhook.C35692e;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.childhook.a.a.a */
public final class C35678a implements AbstractC35681d {
    static {
        Covode.recordClassIndex(42908);
    }

    @Override // com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a.AbstractC35681d
    /* renamed from: a */
    public final boolean mo62725a(Intent intent) {
        C89219l.m154721d(intent, "");
        if (intent.getComponent() != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a.AbstractC35681d
    /* renamed from: b */
    public final boolean mo62726b(Intent intent) {
        List<String> list;
        String str;
        C89219l.m154721d(intent, "");
        C35691d dVar = C35692e.f84187a;
        if (dVar == null || (list = dVar.f84184b) == null) {
            list = C89086z.INSTANCE;
        }
        if (!(!list.isEmpty())) {
            return false;
        }
        for (String str2 : list) {
            ComponentName component = intent.getComponent();
            if (component == null || (str = component.getClassName()) == null) {
                str = "";
            }
            if (C13627m.m24499a(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
