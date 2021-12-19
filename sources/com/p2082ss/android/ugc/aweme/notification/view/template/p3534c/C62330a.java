package com.p2082ss.android.ugc.aweme.notification.view.template.p3534c;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61615a;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62323a;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62327b;
import com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomButton;
import com.p2082ss.android.ugc.aweme.notification.view.template.p3533b.C62328a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a */
public final class C62330a implements AbstractC62323a {
    static {
        Covode.recordClassIndex(73115);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$a */
    static final class View$OnClickListenerC62331a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNotice f141455a;

        /* renamed from: b */
        final /* synthetic */ C61615a f141456b;

        /* renamed from: c */
        final /* synthetic */ NoticeTemplateBottomButton f141457c;

        /* renamed from: d */
        final /* synthetic */ AbstractC62327b f141458d;

        /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$a$b */
        static final class C62333b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C62333b f141460a = new C62333b();

            static {
                Covode.recordClassIndex(73118);
            }

            C62333b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(73116);
        }

        View$OnClickListenerC62331a(MusNotice musNotice, C61615a aVar, NoticeTemplateBottomButton noticeTemplateBottomButton, AbstractC62327b bVar) {
            this.f141455a = musNotice;
            this.f141456b = aVar;
            this.f141457c = noticeTemplateBottomButton;
            this.f141458d = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$a$a */
        static final class C62332a implements AbstractC88428a {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62331a f141459a;

            static {
                Covode.recordClassIndex(73117);
            }

            C62332a(View$OnClickListenerC62331a aVar) {
                this.f141459a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88428a
            /* renamed from: a */
            public final void mo8579a() {
                new C23144b(this.f141459a.f141457c).mo37640e(R.string.cv4).mo37637b();
            }
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            User d = C62328a.m112752d(this.f141455a);
            if (d == null || (str = d.getUid()) == null) {
                str = "";
            }
            String c = C62328a.m112751c(this.f141455a);
            if (c == null) {
                c = "";
            }
            C89219l.m154721d(str, "");
            C89219l.m154721d(c, "");
            C39162r.m79460a("click_ignore", new C33744d().mo59983a("enter_from", "message").mo59983a("account_type", c).mo59983a("to_user_id", str).f79943a);
            C61615a aVar = this.f141456b;
            if (aVar != null) {
                MusNotificationApiManager.f140430a.ignoreLinkNotice(aVar.f139820b).mo142941b(C88925a.m154180b(C88946a.f201991c)).mo142937a(C88391a.m153580a(C88392a.f200660a)).mo142935a(new C62332a(this), C62333b.f141460a);
            }
            this.f141458d.mo100299a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$b */
    public static final class C62334b implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ NoticeTemplateBottomButton f141461a;

        static {
            Covode.recordClassIndex(73119);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        C62334b(NoticeTemplateBottomButton noticeTemplateBottomButton) {
            this.f141461a = noticeTemplateBottomButton;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            if (followStatus != null) {
                this.f141461a.mo73175a(followStatus.followStatus, followStatus.followerStatus);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$d */
    public static final class C62338d extends C51086a.C51094g {

        /* renamed from: a */
        final /* synthetic */ MusNotice f141466a;

        static {
            Covode.recordClassIndex(73123);
        }

        C62338d(MusNotice musNotice) {
            this.f141466a = musNotice;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            super.mo63346a(i, user);
            String c = C62328a.m112751c(this.f141466a);
            if (c == null) {
                c = "";
            }
            C89219l.m154721d(c, "");
            if (user != null) {
                C39162r.m79460a("follow", new C33744d().mo59983a("enter_from", "message").mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59983a("to_user_id", user.getUid()).mo59983a("req_id", user.getRequestId()).mo59983a("account_type", c).mo59983a("enter_method", "follow_button").f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$c */
    static final class C62335c implements C51086a.AbstractC51092e {

        /* renamed from: a */
        final /* synthetic */ NoticeTemplateBottomButton f141462a;

        /* renamed from: b */
        final /* synthetic */ AbstractC62327b f141463b;

        static {
            Covode.recordClassIndex(73120);
        }

        C62335c(NoticeTemplateBottomButton noticeTemplateBottomButton, AbstractC62327b bVar) {
            this.f141462a = noticeTemplateBottomButton;
            this.f141463b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            if (followStatus == null || followStatus.followStatus != 4) {
                this.f141462a.postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.view.template.p3534c.C62330a.C62335c.RunnableC623372 */

                    /* renamed from: a */
                    final /* synthetic */ C62335c f141465a;

                    static {
                        Covode.recordClassIndex(73122);
                    }

                    {
                        this.f141465a = r1;
                    }

                    public final void run() {
                        this.f141465a.f141463b.mo100300b();
                    }
                }, 200);
            } else {
                this.f141462a.postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.view.template.p3534c.C62330a.C62335c.RunnableC623361 */

                    /* renamed from: a */
                    final /* synthetic */ C62335c f141464a;

                    static {
                        Covode.recordClassIndex(73121);
                    }

                    {
                        this.f141464a = r1;
                    }

                    public final void run() {
                        this.f141464a.f141463b.mo100300b();
                    }
                }, 500);
            }
            C89219l.m154716b(followStatus, "");
            String str = followStatus.userId;
            C89219l.m154716b(str, "");
            int i = followStatus.followStatus;
            C89219l.m154721d("notification_page", "");
            C89219l.m154721d(str, "");
            if (i == 0) {
                C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("to_user_id", str).f79943a);
            } else {
                C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("to_user_id", str).f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62323a
    /* renamed from: a */
    public final void mo100316a(MusNotice musNotice, AbstractC62327b bVar) {
        C89219l.m154721d(musNotice, "");
        C89219l.m154721d(bVar, "");
        NoticeTemplateBottomButton positiveButton = bVar.getPositiveButton();
        C51086a aVar = new C51086a(positiveButton, new C62338d(musNotice));
        User d = C62328a.m112752d(musNotice);
        if (d != null) {
            aVar.mo86508a(d);
        }
        aVar.f117878d = new C62334b(positiveButton);
        aVar.f117880f = new C62335c(positiveButton, bVar);
        NoticeTemplateBottomButton negativeButton = bVar.getNegativeButton();
        negativeButton.setOnClickListener(new View$OnClickListenerC62331a(musNotice, C62328a.m112749a(musNotice), negativeButton, bVar));
        negativeButton.setText(R.string.cv5);
        negativeButton.setButtonVariant(1);
    }
}
