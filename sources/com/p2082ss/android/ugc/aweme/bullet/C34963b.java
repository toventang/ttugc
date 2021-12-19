package com.p2082ss.android.ugc.aweme.bullet;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.b */
public final class C34963b {

    /* renamed from: a */
    public static final C34963b f82474a = new C34963b();

    private C34963b() {
    }

    static {
        Covode.recordClassIndex(41994);
    }

    /* renamed from: a */
    public static final IBulletService m71411a() {
        IBulletService f = BulletService.m71938f();
        C89219l.m154716b(f, "");
        return f;
    }

    /* renamed from: a */
    public static final void m71412a(Context context, String str, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        m71413a(context, str, null, bundle);
    }

    /* renamed from: a */
    public static final void m71413a(Context context, String str, String str2, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        BulletService.m71938f().mo61854a(context, str, str2, bundle);
    }
}
