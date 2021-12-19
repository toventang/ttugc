package com.p2082ss.android.ugc.aweme.view;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28527o;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.util.C80134j;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.view.C81220e;
import org.greenrobot.eventbus.EventBus;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC28527o
/* renamed from: com.ss.android.ugc.aweme.view.EOYPlayer */
public final class EOYPlayer extends UISimpleView<C81220e> {

    /* renamed from: a */
    public static final C81088a f181229a = new C81088a((byte) 0);

    static {
        Covode.recordClassIndex(94411);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.EOYPlayer$a */
    public static final class C81088a {
        static {
            Covode.recordClassIndex(94414);
        }

        private C81088a() {
        }

        public /* synthetic */ C81088a(byte b) {
            this();
        }
    }

    public EOYPlayer(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "muted")
    public final void setMuted(boolean z) {
        ((C81220e) this.mView).setMuted(z);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        if (context == null) {
            C89219l.m154715b();
        }
        return new C81220e(context, (byte) 0);
    }

    @AbstractC28525m(mo49059a = "play")
    public final void switchPlay(boolean z) {
        if (z) {
            try {
                ((C81220e) this.mView).mo124699a();
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
                return;
            }
        } else {
            ((C81220e) this.mView).mo124700b();
        }
        C89379q.m157068constructorimpl(C89391z.f203057a);
    }

    @AbstractC28525m(mo49059a = "src")
    public final void setSrc(AbstractC28367a aVar) {
        C89219l.m154721d(aVar, "");
        ReadableType h = aVar.mo48559h();
        if (h != null && C81215d.f181501a[h.ordinal()] == 1) {
            String e = aVar.mo48556e();
            C89219l.m154716b(e, "");
            if (e.length() > 0) {
                String e2 = aVar.mo48556e();
                C89219l.m154716b(e2, "");
                Aweme a = C80134j.m138899a(e2);
                if (a != null) {
                    ((C81220e) this.mView).setSrc(a);
                    return;
                }
                return;
            }
            return;
        }
        aVar.mo48559h().name();
    }

    @AbstractC28528p
    public final void click(ReadableMap readableMap, Callback callback) {
        ActivityC0945e currentActivity$eoy_release;
        C89219l.m154721d(readableMap, "");
        C89219l.m154721d(callback, "");
        C81220e eVar = (C81220e) this.mView;
        String string = readableMap.getString("question_text");
        Aweme aweme = eVar.f181511b;
        if (aweme != null && (currentActivity$eoy_release = eVar.getCurrentActivity$eoy_release()) != null) {
            AbstractC80747i iVar = eVar.getMPlayVideoHelper().f139608e;
            C89219l.m154716b(iVar, "");
            eVar.f181510a = iVar.mo123892o();
            C49625h a = C49625h.m93072a();
            C89219l.m154716b(a, "");
            a.f114189a = eVar.getMPlayVideoHelper().f139608e;
            C49625h a2 = C49625h.m93072a();
            C89219l.m154716b(a2, "");
            AbstractC80747i iVar2 = eVar.getMPlayVideoHelper().f139608e;
            C89219l.m154716b(iVar2, "");
            a2.f114191c = iVar2.mo123891n();
            C49625h a3 = C49625h.m93072a();
            C89219l.m154716b(a3, "");
            a3.f114195g = false;
            SmartRoute withParam = SmartRouter.buildRoute(currentActivity$eoy_release, "aweme://aweme/detail/").withParam("id", aweme.getAid());
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            SmartRoute withParam2 = withParam.withParam("userid", g.getCurUserId()).withParam("enter_from", "eoy_hub").withParam("video_from", "eoy_detail");
            if (!(string == null || string.length() == 0)) {
                withParam2.withParam("question_content", string);
                withParam2.withParam("show_answer_question_button", 1);
            }
            SmartRoute withParam3 = withParam2.withParam("video_type", 28);
            if (!EventBus.m156962a().mo145393a(eVar)) {
                EventBus.m156966a(EventBus.m156962a(), eVar);
            }
            withParam3.open(10086, new C81220e.C81225d(eVar));
        }
    }
}
