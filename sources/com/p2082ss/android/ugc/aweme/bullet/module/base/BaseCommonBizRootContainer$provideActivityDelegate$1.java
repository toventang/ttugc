package com.p2082ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.business.WalletBusiness;
import com.p2082ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import org.greenrobot.eventbus.EventBus;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer$provideActivityDelegate$1 */
public final class BaseCommonBizRootContainer$provideActivityDelegate$1 extends CommonBizActivityDelegate implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC35203a f83120a;

    static {
        Covode.recordClassIndex(42358);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizActivityDelegate
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    BaseCommonBizRootContainer$provideActivityDelegate$1(AbstractC35203a aVar) {
        this.f83120a = aVar;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: e */
    public final void mo26829e(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f83120a.mo62081b("onStart");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: f */
    public final void mo26830f(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f83120a.mo62081b("onStop");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: b */
    public final void mo26222b(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f83120a.mo62081b("onResume");
        SSWebView sSWebView = this.f83120a.f83148i;
        if (sSWebView != null) {
            sSWebView.onResume();
            sSWebView.resumeTimers();
        }
        this.f83120a.f83165z.mo61972a(WalletBusiness.class);
        this.f83120a.f83160u = System.currentTimeMillis();
        this.f83120a.mo62005c(activity);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: d */
    public final void mo26224d(Activity activity) {
        C89219l.m154721d(activity, "");
        EventBus.m156962a().mo145395b(this.f83120a);
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            a.mo58917a(this.f83120a.f83148i);
        }
        this.f83120a.mo62003a(activity);
        this.f83120a.mo62081b("onDestroy");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r6.pauseTimers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        if (r8.f83120a.mo62009h() != false) goto L_0x0047;
     */
    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26223c(android.app.Activity r9) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer$provideActivityDelegate$1.mo26223c(android.app.Activity):void");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: a */
    public final void mo26820a(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        this.f83120a.f83165z.mo61973a(activity);
        EventBus.m156966a(EventBus.m156962a(), this.f83120a);
        C89219l.m154721d(activity, "");
        this.f83120a.mo62081b("onCreate");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: a */
    public final void mo26819a(Activity activity, Configuration configuration) {
        OpenURLHintLayout openURLHintLayout;
        C89219l.m154721d(activity, "");
        if (configuration != null && (openURLHintLayout = this.f83120a.f83147h) != null) {
            openURLHintLayout.setLayoutParams(new FrameLayout.LayoutParams((int) C13628n.m24520b(activity, (float) configuration.screenWidthDp), (int) C13628n.m24520b(activity, (float) configuration.screenHeightDp)));
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: a */
    public final void mo26818a(Activity activity, int i, String[] strArr, int[] iArr) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        C80611a.m139766a(activity, i, iArr);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
    /* renamed from: a */
    public final void mo26817a(Activity activity, int i, int i2, Intent intent) {
        String str;
        C89219l.m154721d(activity, "");
        if (this.f83120a.f83165z.mo61972a(WalletBusiness.class) != null && (str = this.f83120a.f83153n) != null && C89361p.m154908a((CharSequence) str, (CharSequence) "wallet/home", false)) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                a.mo58912a(i, i2, intent);
            }
        }
    }
}
