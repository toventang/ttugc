package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3212b;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19663l;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55075a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55654e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55670k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3212b.C55676a;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.b */
public final class C55680b {

    /* renamed from: e */
    public static final C55681a f127021e = new C55681a((byte) 0);

    /* renamed from: a */
    public boolean f127022a;

    /* renamed from: b */
    public ViewGroup f127023b;

    /* renamed from: c */
    public C55676a f127024c;

    /* renamed from: d */
    public C55670k f127025d;

    /* renamed from: f */
    private final CountDownTimer f127026f = new CountDownTimerC55684d(this);

    static {
        Covode.recordClassIndex(65463);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.b$a */
    public static final class C55681a {
        static {
            Covode.recordClassIndex(65464);
        }

        private C55681a() {
        }

        public /* synthetic */ C55681a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.b$b */
    public static final class C55682b implements AbstractC19479b<C19638h> {
        static {
            Covode.recordClassIndex(65465);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo27861a(C19638h hVar) {
        }

        C55682b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.b$c */
    public static final class C55683c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55680b f127027a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f127028b;

        static {
            Covode.recordClassIndex(65466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55683c(C55680b bVar, AbstractC89171a aVar) {
            super(0);
            this.f127027a = bVar;
            this.f127028b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MethodCollector.m26663i(5314);
            ViewGroup viewGroup = this.f127027a.f127023b;
            if (viewGroup != null) {
                viewGroup.removeView(this.f127027a.f127024c);
            }
            this.f127027a.f127022a = false;
            AbstractC89171a aVar = this.f127028b;
            if (aVar != null) {
                aVar.invoke();
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(5314);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.b$d */
    public static final class CountDownTimerC55684d extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C55680b f127029a;

        static {
            Covode.recordClassIndex(65467);
        }

        public final void onTick(long j) {
        }

        public final void onFinish() {
            Integer num;
            String str = null;
            this.f127029a.mo92571a((AbstractC89171a<C89391z>) null);
            C33744d a = new C33744d().mo59983a("enter_from", C55076b.m100723b().getEnterFrom()).mo59983a("action_type", "auto");
            C55670k kVar = this.f127029a.f127025d;
            if (kVar != null) {
                num = kVar.f126989t;
            } else {
                num = null;
            }
            C33744d a2 = a.mo59982a("chat_cnt", num);
            C55670k kVar2 = this.f127029a.f127025d;
            if (kVar2 != null) {
                str = kVar2.f126990u;
            }
            C39162r.m79460a("close_message_inner_push", a2.mo59983a("from_user_id", str).f79943a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC55684d(C55680b bVar) {
            super(5000, 50);
            this.f127029a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo92571a(AbstractC89171a<C89391z> aVar) {
        C55676a aVar2 = this.f127024c;
        if (aVar2 != null && this.f127022a) {
            C55683c cVar = new C55683c(this, aVar);
            float f = (-((float) aVar2.getMeasuredHeight())) - ((float) aVar2.f127002c);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar2.f127000a, "translationY", 0.0f, f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new C55676a.C55678b(f, cVar));
            ofFloat.start();
        }
        this.f127026f.cancel();
        this.f127024c = null;
        this.f127023b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.b$e */
    public static final class C55685e extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55680b f127030a;

        /* renamed from: b */
        final /* synthetic */ C55670k f127031b;

        static {
            Covode.recordClassIndex(65468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55685e(C55680b bVar, C55670k kVar) {
            super(1);
            this.f127030a = bVar;
            this.f127031b = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            C19638h a;
            Map<String, String> map;
            Map<String, String> ext;
            Integer num2;
            int intValue = num.intValue();
            if (intValue != 0) {
                String str = null;
                if (intValue == 1) {
                    C55670k kVar = this.f127030a.f127025d;
                    if (!(kVar == null || (a = AbstractC17420a.C17421a.m32276a().mo27720a(kVar.f126972c)) == null)) {
                        C19663l settingInfo = a.getSettingInfo();
                        if (settingInfo == null || (ext = settingInfo.getExt()) == null || (map = C89041ag.m154431d(ext)) == null || map.isEmpty()) {
                            map = new LinkedHashMap<>();
                        }
                        map.put("a:s_awe_push_close", "1");
                        C19663l settingInfo2 = a.getSettingInfo();
                        if (settingInfo2 != null) {
                            settingInfo2.setExt(map);
                        }
                        if (kVar.f126972c != null) {
                            AbstractC17427b.C17428a.m32308a(kVar.f126972c).mo27741a(map, new C55682b());
                        }
                    }
                } else if (intValue == 3) {
                    this.f127030a.mo92571a((AbstractC89171a<C89391z>) null);
                    C33744d a2 = new C33744d().mo59983a("enter_from", C55076b.m100723b().getEnterFrom()).mo59983a("action_type", "slide_up");
                    C55670k kVar2 = this.f127030a.f127025d;
                    if (kVar2 != null) {
                        num2 = kVar2.f126989t;
                    } else {
                        num2 = null;
                    }
                    C33744d a3 = a2.mo59982a("chat_cnt", num2);
                    C55670k kVar3 = this.f127030a.f127025d;
                    if (kVar3 != null) {
                        str = kVar3.f126990u;
                    }
                    C39162r.m79460a("close_message_inner_push", a3.mo59983a("from_user_id", str).f79943a);
                }
            } else {
                this.f127030a.mo92571a(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3212b.C55680b.C55685e.C556861 */

                    /* renamed from: a */
                    final /* synthetic */ C55685e f127032a;

                    static {
                        Covode.recordClassIndex(65469);
                    }

                    {
                        this.f127032a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        C55670k kVar = this.f127032a.f127030a.f127025d;
                        if (kVar != null) {
                            if (kVar.f126970a != 1) {
                                if (kVar.f126985p && C16048b.m29633a().mo25412a(true, "polymeric_message_after_launch", 0) == 1) {
                                    C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://main").mo63248a("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION").mo63249a());
                                }
                                C55654e.f126932b.mo92543a(kVar.f126972c);
                                Integer num = kVar.f126971b;
                                int i = C19489e.AbstractC19490a.f46180a;
                                if (num != null && num.intValue() == i) {
                                    ChatRoomActivity.C54401a.m99731a(C56245a.C56247b.m102214a((Context) C55075a.m100721a(), C55085g.m100751a(String.valueOf(AbstractC17427b.C17428a.m32311c(kVar.f126972c)), C55080c.m100730a(kVar.f126972c))).mo93274c("inner_push").mo93271b("cell").f128281a);
                                } else {
                                    int i2 = C19489e.AbstractC19490a.f46181b;
                                    if (num != null && num.intValue() == i2) {
                                        ChatRoomActivity.C54401a.m99731a(C56245a.C56247b.m102212a(C55075a.m100721a(), 3, kVar.f126972c).mo93274c("inner_push").mo93271b("cell").f128281a);
                                    }
                                }
                            } else {
                                C55654e.f126932b.mo92543a(kVar.f126972c);
                                if (kVar.f126988s.size() == 1) {
                                    ChatRoomActivity.C54401a.m99731a(C56245a.C56247b.m102213a(C55075a.m100721a(), (IMContact) C89070n.m154560b(kVar.f126988s, 0)).mo93274c("inner_push").mo93271b("cell").f128281a);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("enter_from", "inner_push");
                                    Activity a = C55075a.m100721a();
                                    if (a != null) {
                                        IMService.Companion.get().openSessionListActivity(a, bundle);
                                    }
                                }
                            }
                        }
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo92570a(C55670k kVar) {
        ViewGroup viewGroup;
        String str;
        MethodCollector.m26663i(3190);
        if (kVar != null) {
            this.f127025d = kVar;
            AbstractC56220e b = C55076b.m100723b();
            if (b != null) {
                viewGroup = b.getCurrentDecorView(C55075a.m100721a());
            } else {
                viewGroup = null;
            }
            this.f127023b = viewGroup;
            this.f127026f.cancel();
            this.f127026f.start();
            if (this.f127022a) {
                C55676a aVar = this.f127024c;
                if (aVar != null) {
                    aVar.mo92563a(this.f127025d);
                }
            } else {
                Activity a = C55075a.m100721a();
                if (a == null) {
                    MethodCollector.m26664o(3190);
                    return;
                }
                this.f127022a = true;
                C55676a aVar2 = new C55676a(a, (byte) 0);
                aVar2.mo92563a(this.f127025d);
                aVar2.mo92562a();
                aVar2.setActionListener(new C55685e(this, kVar));
                this.f127024c = aVar2;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 48;
                layoutParams.topMargin = C13628n.m24525e(C55075a.m100721a());
                ViewGroup viewGroup2 = this.f127023b;
                if (viewGroup2 != null) {
                    viewGroup2.addView(this.f127024c, layoutParams);
                }
            }
            C39162r.m79460a("show_message_inner_push", new C33744d().mo59983a("enter_from", C55076b.m100723b().getEnterFrom()).mo59982a("chat_cnt", kVar.f126989t).mo59983a("from_user_id", kVar.f126990u).f79943a);
            if (kVar.f126970a == 3) {
                Integer num = kVar.f126971b;
                int i = C19489e.AbstractC19490a.f46180a;
                if (num != null && num.intValue() == i) {
                    str = "private";
                } else {
                    str = "group";
                }
                C55059b.m100696c(str);
            }
            MethodCollector.m26664o(3190);
            return;
        }
        MethodCollector.m26664o(3190);
    }
}
