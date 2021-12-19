package com.p2082ss.android.ugc.aweme.social.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.service.C74742b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.ext.a */
public final class C74729a {
    static {
        Covode.recordClassIndex(87568);
    }

    /* renamed from: a */
    public static final <T extends TuxTextView> void m131189a(T t, User user, Aweme aweme, Integer num) {
        C89219l.m154721d(t, "");
        C74742b.f168000a.mo117776a(t, user, aweme, num);
    }

    /* renamed from: a */
    public static /* synthetic */ void m131190a(TuxTextView tuxTextView, User user, Aweme aweme, Integer num, int i) {
        if ((i & 1) != 0) {
            user = null;
        }
        if ((i & 2) != 0) {
            aweme = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        m131189a(tuxTextView, user, aweme, num);
    }
}
