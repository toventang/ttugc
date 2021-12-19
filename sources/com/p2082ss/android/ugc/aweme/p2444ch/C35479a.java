package com.p2082ss.android.ugc.aweme.p2444ch;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgFeedBottomNoticeBar;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ch.a */
public final class C35479a {

    /* renamed from: a */
    public static final C35479a f83674a = new C35479a();

    private C35479a() {
    }

    static {
        Covode.recordClassIndex(42664);
    }

    /* renamed from: com.ss.android.ugc.aweme.ch.a$a */
    public static final class View$OnClickListenerC35480a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ConstraintLayout f83675a;

        /* renamed from: b */
        final /* synthetic */ UgAwemeActivitySetting f83676b;

        /* renamed from: c */
        final /* synthetic */ Aweme f83677c;

        static {
            Covode.recordClassIndex(42665);
        }

        public View$OnClickListenerC35480a(ConstraintLayout constraintLayout, UgAwemeActivitySetting ugAwemeActivitySetting, Aweme aweme) {
            this.f83675a = constraintLayout;
            this.f83676b = ugAwemeActivitySetting;
            this.f83677c = aweme;
        }

        public final void onClick(View view) {
            UgFeedBottomNoticeBar ugFeedBottomNoticeBar;
            String jumpLink;
            ClickAgent.onClick(view);
            Context context = this.f83675a.getContext();
            String str = "";
            C89219l.m154716b(context, str);
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f83676b;
            if (!(ugAwemeActivitySetting == null || (ugFeedBottomNoticeBar = ugAwemeActivitySetting.getUgFeedBottomNoticeBar()) == null || (jumpLink = ugFeedBottomNoticeBar.getJumpLink()) == null)) {
                str = jumpLink;
            }
            if (TextUtils.isEmpty(str) || (!C89361p.m154874b(str, "http", false) && !C89361p.m154874b(str, "https", false))) {
                SmartRouter.buildRoute(context, str).open();
            } else {
                SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
            }
            C39162r.m79460a("text_link_click", new C33744d().mo59983a("group_id", this.f83677c.getAid()).f79943a);
        }
    }

    /* renamed from: a */
    public static boolean m72543a(Aweme aweme) {
        List<String> list;
        C89219l.m154721d(aweme, "");
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (!(awemeActivitySetting == null || aweme.getTextExtra() == null)) {
                if (!aweme.getTextExtra().isEmpty()) {
                    UgFeedBottomNoticeBar ugFeedBottomNoticeBar = awemeActivitySetting.getUgFeedBottomNoticeBar();
                    if (ugFeedBottomNoticeBar == null || (list = ugFeedBottomNoticeBar.getHashTagIds()) == null) {
                        list = new ArrayList<>();
                    }
                    if (!list.isEmpty()) {
                        for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                            C89219l.m154716b(textExtraStruct, "");
                            if (list.contains(textExtraStruct.getCid())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (C16041a e) {
            e.printStackTrace();
        }
    }
}
