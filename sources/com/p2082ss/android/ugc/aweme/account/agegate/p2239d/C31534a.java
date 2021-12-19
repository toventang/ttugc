package com.p2082ss.android.ugc.aweme.account.agegate.p2239d;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.agegate.model.C31541b;
import com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.C31942i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.d.a */
public final class C31534a extends C39088c<C31541b, AbstractC31539a> {

    /* renamed from: a */
    public C31541b f75422a;

    /* renamed from: b */
    public DateFormat f75423b = DateFormat.getDateInstance(1, new Locale(((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a(), C58071d.m104907a()));

    static {
        Covode.recordClassIndex(38251);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public final void mo57527b() {
        super.mo57527b();
        ((AbstractC31539a) this.f92287i).mo57433b(true);
    }

    /* renamed from: e */
    private String m65774e() {
        if (this.f75422a.mData == null || this.f75422a.mData.getLogPb() == null) {
            return "";
        }
        return this.f75422a.mData.getLogPb().getImprId();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        super.mo57528c();
        C31942i.m66311a(1, this.f75422a.mo57541a() ? 1 : 0, "");
        if (this.f92287i == null) {
            return;
        }
        if (this.f75422a.mData.getAgeGatePostAction() == 1) {
            C39223a.m79603q().mo68627a(true, new RunnableC31535b(this));
        } else {
            mo57529d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo57529d() {
        int i;
        ((AbstractC31539a) this.f92287i).mo57433b(false);
        if (this.f75422a.mo57541a()) {
            m65773a(0, -1, "");
            ((AbstractC31539a) this.f92287i).mo57456o();
            if (AccountService.m65215a().mo57069e().isLogin() || !this.f75422a.mo57551i()) {
                C39223a.m79604r().mo68635a(8);
            } else {
                C39223a.m79594h().mo68582a(true);
                SecApiImpl.m119993a().updateCollectMode(null);
                C39223a.m79604r().mo68635a(3);
            }
            ((AbstractC31539a) this.f92287i).mo57446b((AgeGateResponse) this.f75422a.mData);
            return;
        }
        if (this.f75422a.mData != null) {
            i = this.f75422a.mData.getStatus_code();
        } else {
            i = 1;
        }
        m65773a(1, i, m65774e());
        if (this.f75422a.mo57542b()) {
            ((AbstractC31539a) this.f92287i).mo57443a((AgeGateResponse) this.f75422a.mData);
            if (!this.f75422a.mo57548g() && !this.f75422a.mo57549h()) {
                C39223a.m79604r().mo68644g();
                if (this.f75422a.mData.getRegisterAgeGatePostAction() != 1) {
                    ((AbstractC31539a) this.f92287i).mo57448c(this.f75422a.mData.getStatus_msg());
                    return;
                }
            }
            ((AbstractC31539a) this.f92287i).mo57446b((AgeGateResponse) this.f75422a.mData);
            return;
        }
        if (this.f75422a.mo57547f()) {
            if (!this.f75422a.mo57548g()) {
                C39223a.m79604r().mo68644g();
            }
            ((AbstractC31539a) this.f92287i).mo57444a(this.f75422a.mo57543c(), this.f75422a.mData.getStatus_code());
        } else {
            ((AbstractC31539a) this.f92287i).mo57449d(this.f75422a.mo57543c());
        }
        ((AbstractC31539a) this.f92287i).mo57432b(this.f75422a.mData.getStatus_code());
    }

    /* renamed from: a */
    public final Date mo57523a(String str) {
        try {
            return this.f75423b.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        int i;
        LogPbBean logPb;
        super.mo57526a_(exc);
        boolean z = exc instanceof C34485a;
        String str = "";
        if (z) {
            C34485a aVar = (C34485a) exc;
            i = aVar.getErrorCode();
            if ((aVar.getRawResponse() instanceof AgeGateResponse) && (logPb = ((AgeGateResponse) aVar.getRawResponse()).getLogPb()) != null) {
                str = logPb.getImprId();
            }
        } else {
            i = 1;
        }
        m65773a(1, i, str);
        C31942i.m66311a(0, 0, exc.getMessage());
        if (this.f92287i != null) {
            ((AbstractC31539a) this.f92287i).mo57433b(false);
            if (z) {
                C34485a aVar2 = (C34485a) exc;
                int errorCode = aVar2.getErrorCode();
                if (this.f75422a.f75434c.contains(Integer.valueOf(errorCode))) {
                    if (!this.f75422a.mo57548g()) {
                        C39223a.m79604r().mo68644g();
                    }
                    ((AbstractC31539a) this.f92287i).mo57444a(aVar2.getErrorMsg(), errorCode);
                } else {
                    ((AbstractC31539a) this.f92287i).mo57449d(aVar2.getErrorMsg());
                }
                ((AbstractC31539a) this.f92287i).mo57432b(aVar2.getErrorCode());
                return;
            }
            ((AbstractC31539a) this.f92287i).mo57449d(null);
            ((AbstractC31539a) this.f92287i).mo57432b(-1);
        }
    }

    public C31534a(EnumC32594j jVar, EnumC32592i iVar) {
        this.f75422a = new C31541b(jVar, iVar);
    }

    /* renamed from: a */
    public final void mo57525a(boolean z, boolean z2) {
        boolean z3;
        String d = ((C31541b) this.f92286h).mo57545d();
        if (!z || z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        mo57616a(d, Boolean.valueOf(z3), Boolean.valueOf(z2));
        if (z3 || z2) {
            C31566h.f75502a = d;
        }
    }

    /* renamed from: a */
    public final void mo57524a(int i, int i2, int i3) {
        ((C31541b) this.f92286h).mo57540a(i, i2, i3);
        ((AbstractC31539a) this.f92287i).mo57430a(this.f75423b.format(new Date(i - 1900, i2 - 1, i3)));
    }

    /* renamed from: a */
    private static void m65773a(int i, int i2, String str) {
        C33743c cVar = new C33743c();
        cVar.mo59974a("status", Integer.valueOf(i)).mo59976a(StringSet.type, "/aweme/v3/verification/age/");
        if (i == 1) {
            cVar.mo59974a("error_message", Integer.valueOf(i2));
            cVar.mo59976a("tns_logId", str);
        }
        C32837b.m67404a("compliance_api_status", "", cVar.mo59977a());
    }
}
