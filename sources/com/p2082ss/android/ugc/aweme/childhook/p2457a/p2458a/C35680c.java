package com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.childhook.a.a.c */
public final class C35680c implements AbstractC35681d {
    static {
        Covode.recordClassIndex(42910);
    }

    @Override // com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a.AbstractC35681d
    /* renamed from: a */
    public final boolean mo62725a(Intent intent) {
        C89219l.m154721d(intent, "");
        return TextUtils.equals(intent.getAction(), "android.intent.action.VIEW");
    }

    @Override // com.p2082ss.android.ugc.aweme.childhook.p2457a.p2458a.AbstractC35681d
    /* renamed from: b */
    public final boolean mo62726b(Intent intent) {
        C89219l.m154721d(intent, "");
        if (!TextUtils.equals(intent.getPackage(), "com.google.android.gms") || intent.getData() == null || (!C89361p.m154908a((CharSequence) String.valueOf(intent.getData()), (CharSequence) "com.zhiliaoapp.musically", false) && !C89361p.m154908a((CharSequence) String.valueOf(intent.getData()), (CharSequence) "com.ss.android.ugc.trill", false))) {
            return false;
        }
        return true;
    }
}
