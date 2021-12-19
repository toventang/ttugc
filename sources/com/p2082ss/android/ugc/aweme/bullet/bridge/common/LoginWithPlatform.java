package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginWithPlatform */
public final class LoginWithPlatform extends LoginMethod implements AbstractC33974au {

    /* renamed from: c */
    public static final C35029a f82634c = new C35029a((byte) 0);

    static {
        Covode.recordClassIndex(42124);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.p2082ss.android.ugc.aweme.bullet.bridge.common.LoginMethod
    /* renamed from: d */
    public final String mo25752d() {
        return "loginWithPlatform";
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.common.LoginMethod, com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginWithPlatform$a */
    public static final class C35029a {
        static {
            Covode.recordClassIndex(42125);
        }

        private C35029a() {
        }

        public /* synthetic */ C35029a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginWithPlatform(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }
}
