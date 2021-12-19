package com.p2082ss.android.ugc.aweme.kids.setting.p3367a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.a.a */
public final class C57802a {

    /* renamed from: a */
    public static final C57802a f131835a = new C57802a();

    /* renamed from: b */
    private static final IKidsAccountService f131836b = KidsAccountServiceImpl.m104406h();

    private C57802a() {
    }

    /* renamed from: b */
    public static boolean m104518b() {
        return f131836b.mo94317a();
    }

    /* renamed from: a */
    public static String m104517a() {
        AbstractC57153a b = f131836b.mo94318b();
        if (b != null) {
            return b.getUserId();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(67800);
    }
}
