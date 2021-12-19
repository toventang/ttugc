package com.bytedance.ies.ugc.statisticlogger;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88958b;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.a */
public final class C18205a {

    /* renamed from: a */
    static final AbstractC88969g<Boolean> f43381a;

    /* renamed from: b */
    static final AbstractC88969g<Boolean> f43382b;

    /* renamed from: c */
    static final AbstractC88969g<EnumC18213b> f43383c;

    /* renamed from: d */
    static final String f43384d = "-2147483648";

    /* renamed from: e */
    public static final C18206a f43385e = new C18206a();

    /* renamed from: f */
    public static final C18205a f43386f = new C18205a();

    /* renamed from: g */
    private static final AbstractC88969g<String> f43387g;

    /* renamed from: h */
    private static final AbstractC88969g<String> f43388h;

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a$a */
    public static final class C18206a implements DeviceRegisterManager.AbstractC29864a {
        static {
            Covode.recordClassIndex(20863);
        }

        C18206a() {
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29065a(boolean z) {
            C18205a.f43381a.onNext(Boolean.valueOf(z));
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29066a(boolean z, boolean z2) {
            C18205a.f43382b.onNext(Boolean.valueOf(z));
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29064a(String str, String str2) {
            C89219l.m154716b(C1764a.m5928a("onDeviceIdChanged,did:%s,installId:%s", Arrays.copyOf(new Object[]{str, str2}, 2)), "");
            C18205a.m33882e();
            C18205a.f43383c.onNext(EnumC18213b.INSTANCE);
        }
    }

    private C18205a() {
    }

    /* renamed from: a */
    public static String m33878a() {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            return "";
        }
        return serverDeviceId;
    }

    /* renamed from: b */
    public static Map<String, String> m33879b() {
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        return hashMap;
    }

    /* renamed from: d */
    public static AbstractC88979t<EnumC18213b> m33881d() {
        AbstractC88979t<EnumC18213b> i = f43383c.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: e */
    public static void m33882e() {
        String a = m33878a();
        if (a != null) {
            f43387g.onNext(a);
        }
        String installId = AppLog.getInstallId();
        if (installId != null) {
            f43388h.onNext(installId);
        }
    }

    /* renamed from: f */
    public static void m33883f() {
        AbstractC88969g<String> gVar = f43387g;
        String str = f43384d;
        gVar.onNext(str);
        String a = m33878a();
        if (a != null) {
            gVar.onNext(a);
        }
        AbstractC88969g<String> gVar2 = f43388h;
        gVar2.onNext(str);
        String installId = AppLog.getInstallId();
        if (installId != null) {
            gVar2.onNext(installId);
        }
    }

    /* renamed from: c */
    public static AbstractC88979t<String> m33880c() {
        AbstractC88979t<String> a = f43387g.mo143294e().mo143189i().mo143266a(C88446a.f200695a).mo143268a(C18207b.f43389a).mo143268a(C18208c.f43390a);
        C89219l.m154716b(a, "");
        return a;
    }

    static {
        Covode.recordClassIndex(20862);
        AbstractC88969g<String> j = new C88958b().mo143230j();
        C89219l.m154716b(j, "");
        f43387g = j;
        AbstractC88969g<String> j2 = new C88958b().mo143230j();
        C89219l.m154716b(j2, "");
        f43388h = j2;
        AbstractC88969g<Boolean> j3 = new C88960c().mo143230j();
        C89219l.m154716b(j3, "");
        f43381a = j3;
        AbstractC88969g<Boolean> j4 = new C88960c().mo143230j();
        C89219l.m154716b(j4, "");
        f43382b = j4;
        AbstractC88969g<EnumC18213b> j5 = new C88960c().mo143230j();
        C89219l.m154716b(j5, "");
        f43383c = j5;
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a$b */
    static final class C18207b<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C18207b f43389a = new C18207b();

        static {
            Covode.recordClassIndex(20864);
        }

        C18207b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a$c */
    static final class C18208c<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C18208c f43390a = new C18208c();

        static {
            Covode.recordClassIndex(20865);
        }

        C18208c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            if (!C89361p.m154872a(C18205a.f43384d, str, true)) {
                return true;
            }
            return false;
        }
    }
}
