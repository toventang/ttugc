package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IPermissionDepend;
import com.bytedance.ies.android.base.runtime.depend.IPermissionRequestCallback;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.x */
public final class C37694x implements IPermissionDepend {
    static {
        Covode.recordClassIndex(45127);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.x$a */
    static final class C37695a implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ IPermissionRequestCallback f89057a;

        static {
            Covode.recordClassIndex(45128);
        }

        C37695a(IPermissionRequestCallback iPermissionRequestCallback) {
            this.f89057a = iPermissionRequestCallback;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            ArrayList arrayList = new ArrayList();
            C89219l.m154716b(strArr, "");
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str = strArr[i];
                int i3 = i2 + 1;
                if (i2 >= 0 && i2 < iArr.length && iArr[i2] == 0) {
                    arrayList.add(str);
                }
                i++;
                i2 = i3;
            }
            IPermissionRequestCallback iPermissionRequestCallback = this.f89057a;
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            iPermissionRequestCallback.onPermissionsGrant((String[]) array);
        }
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IPermissionDepend
    public final boolean requestPermission(Activity activity, IPermissionRequestCallback iPermissionRequestCallback, String... strArr) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(iPermissionRequestCallback, "");
        C89219l.m154721d(strArr, "");
        C35444b.m72473a(activity, strArr, new C37695a(iPermissionRequestCallback));
        return true;
    }
}
