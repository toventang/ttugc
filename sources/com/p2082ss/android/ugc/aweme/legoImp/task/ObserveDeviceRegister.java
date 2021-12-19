package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister */
public class ObserveDeviceRegister implements AbstractC58264w {

    /* renamed from: a */
    private static DeviceRegisterManager.AbstractC29864a f132914a = new DeviceRegisterManager.AbstractC29864a() {
        /* class com.p2082ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister.C583721 */

        static {
            Covode.recordClassIndex(68551);
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29066a(boolean z, boolean z2) {
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29065a(boolean z) {
            CommonFeedLaunchServiceImpl.m91019b().mo80039a(!z);
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29064a(String str, String str2) {
            C31575b.m65861c().onDeviceRegistrationInfoChanged();
        }
    };

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(68550);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(f132914a);
    }
}
