package com.p2082ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.legacy.AbstractC58082a;
import com.p2082ss.android.ugc.aweme.legacy.AbstractC58083b;
import com.p2082ss.android.ugc.aweme.login.CallableC58959e;
import com.p2082ss.android.ugc.aweme.login.CallableC58960f;
import com.p2082ss.android.ugc.aweme.login.CallableC58961g;
import com.p2082ss.android.ugc.aweme.login.CallableC58962h;
import com.p2082ss.android.ugc.aweme.net.AbstractC61331d;
import com.p2082ss.android.ugc.aweme.net.C61305b;
import com.p2082ss.android.ugc.aweme.net.EnumC61379i;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2232ac.C31366b;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.services.a */
public final class C33844a implements AbstractC34817bf {

    /* renamed from: a */
    private final C33845a f80135a = new C33845a();

    /* renamed from: b */
    private final C33846b f80136b = new C33846b();

    static {
        Covode.recordClassIndex(40757);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.services.a$a */
    public static final class C33845a implements IAccountService.AbstractC31271a {
        static {
            Covode.recordClassIndex(40758);
        }

        C33845a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31271a
        /* renamed from: a */
        public final C1731i<Bundle> mo57081a(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            C1731i<Bundle> b = C1731i.m5640b(new CallableC58959e(bundle), C1731i.f5564c);
            C89219l.m154716b(b, "");
            return b;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31271a
        /* renamed from: b */
        public final C1731i<Bundle> mo57083b(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            C1731i<Bundle> b = C1731i.m5640b(new CallableC58960f(bundle), C1731i.f5564c);
            C89219l.m154716b(b, "");
            return b;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31271a
        /* renamed from: a */
        public final C1731i<Bundle> mo57082a(Bundle bundle, C31366b bVar) {
            C1731i<Bundle> b;
            C89219l.m154721d(bundle, "");
            C89219l.m154721d(bVar, "");
            if (bVar.f75142a) {
                b = C1731i.m5640b(new CallableC58962h(bundle, bVar), C1731i.f5563b);
            } else {
                b = C1731i.m5640b(new CallableC58961g(bundle, bVar), C1731i.f5563b);
            }
            C89219l.m154716b(b, "");
            return b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.services.a$b */
    public static final class C33846b implements AbstractC58083b {
        static {
            Covode.recordClassIndex(40759);
        }

        C33846b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.app.services.a$b$a */
        public static final class C33847a implements AbstractC61331d<Object> {

            /* renamed from: a */
            final /* synthetic */ AbstractC58082a f80137a;

            static {
                Covode.recordClassIndex(40760);
            }

            @Override // com.p2082ss.android.ugc.aweme.net.AbstractC61331d
            /* renamed from: a */
            public final void mo60109a(Exception exc) {
            }

            @Override // com.p2082ss.android.ugc.aweme.net.AbstractC61331d
            /* renamed from: a */
            public final void mo60108a() {
                this.f80137a.mo58814a();
            }

            C33847a(AbstractC58082a aVar) {
                this.f80137a = aVar;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.legacy.AbstractC58083b
        /* renamed from: a */
        public final void mo60106a() {
            C81079v.m140776O().mo123908B();
        }

        @Override // com.p2082ss.android.ugc.aweme.legacy.AbstractC58083b
        /* renamed from: a */
        public final void mo60107a(String str, AbstractC58082a aVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar, "");
            C29844g gVar = new C29844g(str);
            gVar.mo52130a(StringSet.type, "0");
            C61305b bVar = new C61305b(gVar.toString(), EnumC61379i.GET, String.class);
            bVar.f139225a = new C33847a(aVar);
            bVar.mo98934a(C17867d.m33078a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34817bf
    /* renamed from: e */
    public final IAccountService.AbstractC31271a mo60104e() {
        return this.f80135a;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34817bf
    /* renamed from: f */
    public final AbstractC58083b mo60105f() {
        return this.f80136b;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34817bf
    /* renamed from: b */
    public final String mo60101b() {
        return C39223a.m79597k().mo68718b();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34817bf
    /* renamed from: c */
    public final String mo60102c() {
        return C39223a.m79597k().mo68719c();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34817bf
    /* renamed from: d */
    public final int mo60103d() {
        return C39223a.m79594h().mo68581a();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34817bf
    /* renamed from: a */
    public final boolean mo60100a() {
        C39223a.m79597k().mo68717a();
        mo60101b();
        mo60102c();
        if (!C39223a.m79597k().mo68717a() || TextUtils.isEmpty(mo60101b()) || TextUtils.isEmpty(mo60102c())) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34817bf
    /* renamed from: a */
    public final void mo60099a(Activity activity) {
        IExternalService a = AVExternalServiceImpl.m113114a();
        a.publishService().cancelSynthetise(activity);
        a.abilityService().effectService().clearCacheInFTC();
    }
}
