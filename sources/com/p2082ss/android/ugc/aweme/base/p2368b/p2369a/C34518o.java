package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.b.a.o */
public final class C34518o implements AbstractC51435a {

    /* renamed from: b */
    private Context f81509b;

    /* renamed from: c */
    private Keva f81510c;

    static {
        Covode.recordClassIndex(41476);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51435a
    /* renamed from: a */
    public final boolean mo60946a() {
        return this.f81510c.getBoolean("read_contact_denied", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51435a
    /* renamed from: a */
    public final void mo60945a(boolean z) {
        this.f81510c.storeBoolean("read_contact_denied", z);
    }

    public C34518o(Context context) {
        this.f81509b = context;
        this.f81510c = Keva.getRepoFromSp(context, "FriendsSharePreferences", 0);
    }
}
