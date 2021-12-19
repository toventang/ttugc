package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import android.content.Intent;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47742y;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.a */
public final class C47202a {

    /* renamed from: a */
    public static final C47202a f109873a = new C47202a();

    private C47202a() {
    }

    static {
        Covode.recordClassIndex(55815);
    }

    /* renamed from: a */
    public static AbstractC0952i m90374a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        AbstractC0952i childFragmentManager = fragment.getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        return childFragmentManager;
    }

    /* renamed from: a */
    public static Fragment m90373a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        Fragment a = eVar.getSupportFragmentManager().mo3551a("user_favorites_fragment_tag");
        if (a == null) {
            a = new C47742y();
        }
        a.setUserVisibleHint(true);
        return a;
    }

    /* renamed from: a */
    public static String m90375a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
