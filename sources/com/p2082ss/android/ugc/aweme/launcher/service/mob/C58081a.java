package com.p2082ss.android.ugc.aweme.launcher.service.mob;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.launch.MobLaunchImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.launcher.service.mob.a */
public final class C58081a implements IMobLaunchApi {

    /* renamed from: a */
    public static final C58081a f132324a = new C58081a();

    /* renamed from: b */
    private final /* synthetic */ IMobLaunchApi f132325b;

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    /* renamed from: a */
    public final void mo60039a(String str) {
        this.f132325b.mo60039a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    /* renamed from: a */
    public final void mo60040a(String str, Uri uri, boolean z) {
        this.f132325b.mo60040a(str, uri, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    /* renamed from: a */
    public final void mo60041a(boolean z) {
        this.f132325b.mo60041a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    /* renamed from: b */
    public final void mo60042b(String str) {
        this.f132325b.mo60042b(str);
    }

    static {
        Covode.recordClassIndex(68131);
    }

    private C58081a() {
        IMobLaunchApi mobLaunchImpl;
        Object a = C81908b.m141854a(IMobLaunchApi.class, false);
        if (a != null) {
            mobLaunchImpl = (IMobLaunchApi) a;
        } else {
            mobLaunchImpl = new MobLaunchImpl();
        }
        C89219l.m154716b(mobLaunchImpl, "");
        this.f132325b = mobLaunchImpl;
    }
}
