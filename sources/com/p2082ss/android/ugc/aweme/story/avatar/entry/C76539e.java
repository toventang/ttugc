package com.p2082ss.android.ugc.aweme.story.avatar.entry;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.avatar.EnumC76586o;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.e */
public final class C76539e {
    static {
        Covode.recordClassIndex(89524);
    }

    /* renamed from: a */
    public static final EnumC76533d m134143a(EnumC76586o oVar) {
        C89219l.m154721d(oVar, "");
        int i = C76540f.f171854a[oVar.ordinal()];
        if (i == 1) {
            return EnumC76533d.WESTWINDOW;
        }
        if (i == 2) {
            return EnumC76533d.FEED;
        }
        if (i == 3) {
            return EnumC76533d.INBOX;
        }
        if (i == 4) {
            return EnumC76533d.PROFILE;
        }
        if (i == 5) {
            return EnumC76533d.FOLLOW_LIST;
        }
        throw new C89376n();
    }
}
