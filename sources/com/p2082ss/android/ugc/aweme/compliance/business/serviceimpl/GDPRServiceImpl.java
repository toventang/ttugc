package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo;
import com.p2082ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39231b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService;
import com.p2082ss.android.ugc.aweme.compliance.business.personalization.p2653a.C39438a;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.GDPRServiceImpl */
public final class GDPRServiceImpl implements IGDPRService {
    static {
        Covode.recordClassIndex(47227);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    /* renamed from: c */
    public final void mo68664c() {
        C39608b.m80419e();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    /* renamed from: b */
    public final int mo68663b() {
        return C39608b.m80420f();
    }

    /* renamed from: d */
    public static IGDPRService m80263d() {
        MethodCollector.m26663i(9657);
        Object a = C81908b.m141854a(IGDPRService.class, false);
        if (a != null) {
            IGDPRService iGDPRService = (IGDPRService) a;
            MethodCollector.m26664o(9657);
            return iGDPRService;
        }
        if (C81908b.f183149aE == null) {
            synchronized (IGDPRService.class) {
                try {
                    if (C81908b.f183149aE == null) {
                        C81908b.f183149aE = new GDPRServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9657);
                    throw th;
                }
            }
        }
        GDPRServiceImpl gDPRServiceImpl = (GDPRServiceImpl) C81908b.f183149aE;
        MethodCollector.m26664o(9657);
        return gDPRServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    /* renamed from: a */
    public final boolean mo68662a() {
        Boolean bool;
        Boolean bool2;
        AdPersonalitySettings i = C39608b.m80423i();
        Boolean bool3 = null;
        if (i != null) {
            bool = i.isShowSettings();
        } else {
            bool = null;
        }
        if (!C89219l.m154714a((Object) bool, (Object) true)) {
            if (C39608b.m80422h() == 2) {
                NewPersAdSettings g = C39608b.m80421g();
                if (g != null) {
                    bool2 = g.getShowMode1P();
                } else {
                    bool2 = null;
                }
                if (!C89219l.m154714a((Object) bool2, (Object) true)) {
                    NewPersAdSettings g2 = C39608b.m80421g();
                    if (g2 != null) {
                        bool3 = g2.getShowMode3P();
                    }
                    if (C89219l.m154714a((Object) bool3, (Object) true)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    /* renamed from: a */
    public final void mo68660a(Activity activity) {
        CopyWritingInfo copyWritingInfo;
        String str;
        String str2;
        Integer promptStyle;
        String title;
        String str3 = "";
        C89219l.m154721d(activity, str3);
        C89219l.m154721d(activity, str3);
        AdPersonalitySettings i = C39608b.m80423i();
        String str4 = null;
        if (i != null) {
            copyWritingInfo = i.getCopyWriting();
        } else {
            copyWritingInfo = null;
        }
        SpannableStringBuilder a = C39438a.m80133a(activity, copyWritingInfo);
        DmtTextView dmtTextView = new DmtTextView(activity);
        dmtTextView.setHighlightColor(C0643b.m2378c(activity, R.color.c9));
        dmtTextView.setText(a);
        dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
        dmtTextView.setGravity(17);
        C17197a.C17200a aVar = new C17197a.C17200a(activity);
        aVar.f41059E = true;
        if (copyWritingInfo == null || (str = copyWritingInfo.getConfirm()) == null) {
            str = str3;
        }
        C17197a.C17200a a2 = aVar.mo27192a(str, (DialogInterface.OnClickListener) C39438a.DialogInterface$OnClickListenerC39442d.f93069a, false);
        if (copyWritingInfo == null || (str2 = copyWritingInfo.getCheckSettings()) == null) {
            str2 = str3;
        }
        C17197a.C17200a b = a2.mo27196b(str2, (DialogInterface.OnClickListener) new C39438a.DialogInterface$OnClickListenerC39443e(activity), false);
        if (!(copyWritingInfo == null || (title = copyWritingInfo.getTitle()) == null)) {
            str3 = title;
        }
        b.f41070a = str3;
        b.f41064J = dmtTextView;
        b.f41067M = false;
        AdPersonalitySettings i2 = C39608b.m80423i();
        if (i2 != null) {
            str4 = i2.getBusiness();
        }
        if (!C89219l.m154714a((Object) str4, (Object) "lat_strategy_update")) {
            b.f41060F = true;
        }
        b.mo27193a().mo27185c();
        C39162r.m79460a("ads_notify_show", new C33744d().mo59983a("enter_from", "homepage_hot").f79943a);
        AdPersonalitySettings i3 = C39608b.m80423i();
        if (i3 != null && (promptStyle = i3.getPromptStyle()) != null && promptStyle.intValue() == 1) {
            C39162r.m79460a("revised_PA_old_prompt_EU_show", new C33744d().f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    /* renamed from: a */
    public final void mo68661a(Context context, AbstractC39231b bVar) {
        C89219l.m154721d(context, "");
        C39438a.m80135a(context, bVar);
    }
}
