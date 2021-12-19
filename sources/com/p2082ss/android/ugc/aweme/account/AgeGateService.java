package com.p2082ss.android.ugc.aweme.account;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34824bg;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAgeGateService;
import com.p2082ss.android.ugc.aweme.account.agegate.C31412b;
import com.p2082ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.model.CachedUserAgeInfo;
import com.p2082ss.android.ugc.aweme.account.util.C33052u;

/* renamed from: com.ss.android.ugc.aweme.account.AgeGateService */
public class AgeGateService implements IAgeGateService, AbstractC33974au {

    /* renamed from: a */
    public static boolean f75149a;

    /* renamed from: b */
    private boolean f75150b;

    /* renamed from: c */
    private AbstractC1204m f75151c;

    /* renamed from: d */
    private AbstractC34824bg f75152d;

    static {
        Covode.recordClassIndex(38076);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAgeGateService
    /* renamed from: a */
    public final IAgeGateService mo57197a() {
        this.f75150b = true;
        return this;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAgeGateService
    /* renamed from: b */
    public final void mo57201b() {
        CachedUserAgeInfo a = C33052u.m67703a();
        if (C36085cj.m73550d() && a != null) {
            C33052u.m67702a(a.getBirthday(), true, false);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        AbstractC1204m mVar = this.f75151c;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
            this.f75151c = null;
        }
        this.f75152d = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAgeGateService
    /* renamed from: a */
    public final int mo57196a(String str) {
        return C31566h.m65847a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAgeGateService
    /* renamed from: a */
    public final void mo57198a(Activity activity) {
        if (!(C17873f.m33102j() instanceof AccountDeletedActivity) && !f75149a) {
            f75149a = true;
            SmartRouter.buildRoute(activity, "//account/deleted").open();
        }
    }

    /* renamed from: a */
    public final void mo57395a(String str, boolean z) {
        AbstractC34824bg bgVar = this.f75152d;
        if (bgVar != null) {
            bgVar.mo61666a(str, z);
            this.f75152d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0035 A[RETURN] */
    @Override // com.p2082ss.android.ugc.aweme.IAgeGateService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo57200a(android.app.Activity r17, com.p2082ss.android.ugc.aweme.AbstractC34824bg r18) {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.AgeGateService.mo57200a(android.app.Activity, com.ss.android.ugc.aweme.bg):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.IAgeGateService
    /* renamed from: a */
    public final void mo57199a(Activity activity, AbstractC34824bg bgVar, String str, String str2, int i, String str3, int i2) {
        C31412b.m65629a(activity, str, str2, i, str3, i2);
        AbstractC1204m mVar = this.f75151c;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
            this.f75151c = null;
            this.f75152d = null;
        }
        this.f75152d = bgVar;
        if (!this.f75150b && (activity instanceof AbstractC1204m)) {
            AbstractC1204m mVar2 = (AbstractC1204m) activity;
            this.f75151c = mVar2;
            mVar2.getLifecycle().mo4012a(this);
        }
        this.f75150b = false;
    }
}
