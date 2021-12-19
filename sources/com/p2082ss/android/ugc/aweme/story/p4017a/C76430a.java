package com.p2082ss.android.ugc.aweme.story.p4017a;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36389e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.services.story.IStoryService;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.story.a.a */
public final class C76430a {

    /* renamed from: a */
    public static final Keva f171681a = Keva.getRepo("repo_story_cold_start");

    /* renamed from: b */
    public static final C76430a f171682b = new C76430a();

    private C76430a() {
    }

    static {
        Covode.recordClassIndex(89402);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.a.a$b */
    public static final class View$OnClickListenerC76432b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76438b f171687a;

        static {
            Covode.recordClassIndex(89404);
        }

        public View$OnClickListenerC76432b(C76438b bVar) {
            this.f171687a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43787a(this.f171687a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.a.a$d */
    public static final class View$OnClickListenerC76434d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76438b f171692a;

        static {
            Covode.recordClassIndex(89406);
        }

        public View$OnClickListenerC76434d(C76438b bVar) {
            this.f171692a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43787a(this.f171692a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.a.a$f */
    public static final class View$OnClickListenerC76436f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76438b f171694a;

        static {
            Covode.recordClassIndex(89408);
        }

        public View$OnClickListenerC76436f(C76438b bVar) {
            this.f171694a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43787a(this.f171694a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.a.a$e */
    public static final class View$OnClickListenerC76435e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76438b f171693a;

        static {
            Covode.recordClassIndex(89407);
        }

        public View$OnClickListenerC76435e(C76438b bVar) {
            this.f171693a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43787a(this.f171693a);
            C76598h.m134184a("shoot_page", "popup", "click", "camera", 24);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.a.a$g */
    public static final class DialogInterface$OnDismissListenerC76437g implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ boolean f171695a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f171696b;

        static {
            Covode.recordClassIndex(89409);
        }

        DialogInterface$OnDismissListenerC76437g(boolean z, ActivityC0945e eVar) {
            this.f171695a = z;
            this.f171696b = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f171695a) {
                AbstractC81915c.m141874a(new C36389e(0, this.f171696b.hashCode()));
            }
            SpecActServiceImpl.m131497i().mo118026a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.a.a$a */
    public static final class View$OnClickListenerC76431a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76438b f171683a;

        /* renamed from: b */
        final /* synthetic */ String f171684b;

        /* renamed from: c */
        final /* synthetic */ Aweme f171685c;

        /* renamed from: d */
        final /* synthetic */ ActivityC0945e f171686d;

        static {
            Covode.recordClassIndex(89403);
        }

        public View$OnClickListenerC76431a(C76438b bVar, String str, Aweme aweme, ActivityC0945e eVar) {
            this.f171683a = bVar;
            this.f171684b = str;
            this.f171685c = aweme;
            this.f171686d = eVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            C76430a.m134025a(this.f171684b, this.f171685c, "click");
            IStoryService storyService = AVExternalServiceImpl.m113114a().storyService();
            ActivityC0945e eVar = this.f171686d;
            int i = C76430a.f171681a.getInt("key_setting", 0);
            if (1 <= i && 4 >= i) {
                z = true;
            } else {
                z = false;
            }
            storyService.startStoryActivity(eVar, new EnterStoryParam(null, "click_story_label", MainPageFragmentImpl.m43110j().mo37214f(), false, false, false, z, 49, null));
            C23226a.C23228b.m43787a(this.f171683a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.a.a$c */
    public static final class View$OnClickListenerC76433c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76438b f171688a;

        /* renamed from: b */
        final /* synthetic */ String f171689b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f171690c;

        /* renamed from: d */
        final /* synthetic */ boolean f171691d;

        static {
            Covode.recordClassIndex(89405);
        }

        public View$OnClickListenerC76433c(C76438b bVar, String str, ActivityC0945e eVar, boolean z) {
            this.f171688a = bVar;
            this.f171689b = str;
            this.f171690c = eVar;
            this.f171691d = z;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            C76430a.m134026a(this.f171689b, "click");
            IStoryService storyService = AVExternalServiceImpl.m113114a().storyService();
            ActivityC0945e eVar = this.f171690c;
            int i = C76430a.f171681a.getInt("key_setting", 0);
            if (1 <= i && 4 >= i) {
                z = true;
            } else {
                z = false;
            }
            storyService.startStoryActivity(eVar, new EnterStoryParam(null, "click_intro", MainPageFragmentImpl.m43110j().mo37214f(), false, false, false, z, 57, null));
            C23226a.C23228b.m43787a(this.f171688a);
        }
    }

    /* renamed from: a */
    public static void m134026a(String str, String str2) {
        C76598h.m134183a(str, "popup", "auto", str2);
    }

    /* renamed from: a */
    public static void m134024a(ActivityC0945e eVar, View view, boolean z) {
        new C23226a.C23227a().mo37812a(0).mo37816a(view).mo37815a(new DialogInterface$OnDismissListenerC76437g(z, eVar)).f55057a.show(eVar.getSupportFragmentManager(), "StoryEducationPanel");
        SpecActServiceImpl.m131497i().mo118026a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r7 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r3 == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        p4600h.p4611f.p4613b.C89219l.m154721d(r6, "");
        p4600h.p4611f.p4613b.C89219l.m154721d("popup", "");
        p4600h.p4611f.p4613b.C89219l.m154721d("click", "");
        p4600h.p4611f.p4613b.C89219l.m154721d(r8, "");
        com.p2082ss.android.ugc.aweme.common.C39162r.m79460a("story_post_guide", new com.p2082ss.android.ugc.aweme.app.p2328f.C33744d().mo59983a("enter_from", r6).mo59983a(com.kakao.usermgmt.StringSet.type, "popup").mo59983a("action_type", r8).mo59983a("enter_method", "click").mo59983a("group_id", r4).mo59983a("story_collection_id", r3).f79943a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m134025a(java.lang.String r6, com.p2082ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.String r8) {
        /*
            java.lang.String r0 = ""
            if (r7 == 0) goto L_0x000a
            java.lang.String r4 = r7.getAid()
            if (r4 != 0) goto L_0x000d
        L_0x000a:
            r4 = r0
            if (r7 == 0) goto L_0x0013
        L_0x000d:
            java.lang.String r3 = com.p2082ss.android.ugc.aweme.story.p4025d.C76706a.m134276b(r7)
            if (r3 != 0) goto L_0x0014
        L_0x0013:
            r3 = r0
        L_0x0014:
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            java.lang.String r5 = "popup"
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            java.lang.String r2 = "click"
            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
            com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
            r1.<init>()
            java.lang.String r0 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo59983a(r0, r6)
            java.lang.String r0 = "type"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo59983a(r0, r5)
            java.lang.String r0 = "action_type"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo59983a(r0, r8)
            java.lang.String r0 = "enter_method"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo59983a(r0, r2)
            java.lang.String r0 = "group_id"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo59983a(r0, r4)
            java.lang.String r0 = "story_collection_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo59983a(r0, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f79943a
            java.lang.String r0 = "story_post_guide"
            com.p2082ss.android.ugc.aweme.common.C39162r.m79460a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.p4017a.C76430a.m134025a(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
