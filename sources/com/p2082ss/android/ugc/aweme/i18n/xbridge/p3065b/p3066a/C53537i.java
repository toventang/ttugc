package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.app.Activity;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.i */
public final class C53537i implements IHostPermissionDepend {
    static {
        Covode.recordClassIndex(63113);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.i$a */
    public static final class C53538a implements C80611a.AbstractC80613a {

        /* renamed from: a */
        final /* synthetic */ OnPermissionGrantCallback f122896a;

        static {
            Covode.recordClassIndex(63114);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80611a.AbstractC80613a
        /* renamed from: a */
        public final void mo79924a() {
            this.f122896a.onAllGranted();
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80611a.AbstractC80613a
        /* renamed from: b */
        public final void mo79925b() {
            this.f122896a.onNotGranted();
        }

        C53538a(OnPermissionGrantCallback onPermissionGrantCallback) {
            this.f122896a = onPermissionGrantCallback;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
    public final boolean hasPermission(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        if (C0643b.m2367a(activity, str) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
    public final void requestPermission(Activity activity, OnPermissionGrantCallback onPermissionGrantCallback, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(onPermissionGrantCallback, "");
        C89219l.m154721d(str, "");
        String[] strArr = {str};
        C80611a.m139767a(activity, strArr, new C53538a(onPermissionGrantCallback));
    }
}
