package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2531a.C37572a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sticker.model.C75441c;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailMissionLayout */
public final class CommerceStickerDetailMissionLayout extends FrameLayout {

    /* renamed from: a */
    HashMap f88814a;

    static {
        Covode.recordClassIndex(44989);
    }

    public CommerceStickerDetailMissionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailMissionLayout$a */
    static final class View$OnClickListenerC37582a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceStickerDetailMissionLayout f88815a;

        /* renamed from: b */
        final /* synthetic */ C75441c f88816b;

        /* renamed from: c */
        final /* synthetic */ HTCMissionModule f88817c;

        static {
            Covode.recordClassIndex(44990);
        }

        View$OnClickListenerC37582a(CommerceStickerDetailMissionLayout commerceStickerDetailMissionLayout, C75441c cVar, HTCMissionModule hTCMissionModule) {
            this.f88815a = commerceStickerDetailMissionLayout;
            this.f88816b = cVar;
            this.f88817c = hTCMissionModule;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            AbstractC37569a a = C37572a.m75786a();
            if (a != null) {
                Context context = this.f88815a.getContext();
                C89219l.m154716b(context, "");
                HTCMissionModule htcMissionModule = this.f88816b.getHtcMissionModule();
                if (htcMissionModule != null) {
                    str = htcMissionModule.getOpenUrl();
                } else {
                    str = null;
                }
                a.mo65411a(context, str, null, null, "click_variable_button", this.f88816b.getId());
            }
            CommerceStickerDetailMissionLayout.m75805a(this.f88817c, false);
        }
    }

    /* renamed from: a */
    public static void m75805a(HTCMissionModule hTCMissionModule, boolean z) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        Integer num;
        TcmConfig i;
        User a;
        if (z) {
            str = "mission_label_show";
        } else {
            str = "mission_label_click";
        }
        C33744d dVar = new C33744d();
        Integer num2 = null;
        if (hTCMissionModule != null) {
            str2 = hTCMissionModule.getMissionId();
        } else {
            str2 = null;
        }
        C33744d a2 = dVar.mo59983a("mission_id", str2);
        if (hTCMissionModule != null) {
            bool = hTCMissionModule.isEligibleUser();
        } else {
            bool = null;
        }
        String str4 = "1";
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            str3 = str4;
        } else {
            str3 = "0";
        }
        C33744d a3 = a2.mo59983a("eligibility", str3);
        if (hTCMissionModule != null) {
            num = hTCMissionModule.getMissionLabelType();
        } else {
            num = null;
        }
        C33744d a4 = a3.mo59982a("status", num).mo59983a("current_page", "2");
        AbstractC37569a a5 = C37572a.m75786a();
        if (!(a5 == null || (a = a5.mo65409a()) == null)) {
            num2 = Integer.valueOf(a.getFollowerCount());
        }
        C33744d a6 = a4.mo59982a("creator_followers", num2);
        ITcmService j = TcmServiceImpl.m135859j();
        if (!(j == null || (i = j.mo121266i()) == null || !i.isTcmCreator())) {
            str4 = "0";
        }
        C39162r.m79460a(str, a6.mo59983a("creator_type", str4).f79943a);
    }

    private /* synthetic */ CommerceStickerDetailMissionLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceStickerDetailMissionLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1746);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.r8, this, true);
        MethodCollector.m26664o(1746);
    }
}
