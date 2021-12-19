package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39262u;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39238i;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.utils.C80625r;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask */
public final class FetchUltimateComplianceSettingsTask implements AbstractC58264w {

    /* renamed from: a */
    public static Context f132837a;

    /* renamed from: b */
    public static final C58334a f132838b = new C58334a((byte) 0);

    /* renamed from: c */
    private static final DeviceRegisterManager.AbstractC29864a f132839c = new C58336b();

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask$a */
    public static final class C58334a {
        static {
            Covode.recordClassIndex(68452);
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask$a$a */
        public static final class C58335a implements AbstractC39238i {
            static {
                Covode.recordClassIndex(68453);
            }

            C58335a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39238i
            /* renamed from: a */
            public final void mo68128a() {
                C58334a.m105700a(true, true);
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39238i
            /* renamed from: a */
            public final void mo68129a(C39262u uVar) {
                C89219l.m154721d(uVar, "");
                C58334a.m105700a(uVar.f92757a, uVar.f92758b);
            }
        }

        private C58334a() {
        }

        /* renamed from: a */
        public static void m105699a() {
            C39223a.m79596j().mo68698a(new C58335a());
        }

        public /* synthetic */ C58334a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m105700a(boolean z, boolean z2) {
            C80625r.f180272b = true;
            C80625r.f180273c = z;
            C80625r.f180274d = z2;
            C80625r.m139793a();
        }
    }

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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask$b */
    public static final class C58336b implements DeviceRegisterManager.AbstractC29864a {
        static {
            Covode.recordClassIndex(68454);
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29064a(String str, String str2) {
        }

        C58336b() {
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29065a(boolean z) {
            if (!TextUtils.isEmpty(DeviceRegisterManager.getDeviceId())) {
                C58334a.m105699a();
            }
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29066a(boolean z, boolean z2) {
            C58334a.m105699a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(68451);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        f132837a = context;
        if (TextUtils.isEmpty(DeviceRegisterManager.getDeviceId())) {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(f132839c);
        } else {
            C58334a.m105699a();
        }
    }
}
