package com.p2082ss.android.ugc.aweme.notification.view.template.p3532a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61622d;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62323a;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62327b;
import com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomButton;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.a.a */
public final class C62324a implements AbstractC62323a {
    static {
        Covode.recordClassIndex(73109);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.a.a$b */
    public static final class View$OnClickListenerC62326b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NoticeTemplateBottomButton f141453a;

        /* renamed from: b */
        final /* synthetic */ AbstractC62327b f141454b;

        static {
            Covode.recordClassIndex(73111);
        }

        View$OnClickListenerC62326b(NoticeTemplateBottomButton noticeTemplateBottomButton, AbstractC62327b bVar) {
            this.f141453a = noticeTemplateBottomButton;
            this.f141454b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f141454b.mo100299a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.a.a$a */
    public static final class View$OnClickListenerC62325a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f141451a;

        /* renamed from: b */
        final /* synthetic */ NoticeTemplateBottomButton f141452b;

        static {
            Covode.recordClassIndex(73110);
        }

        View$OnClickListenerC62325a(String str, NoticeTemplateBottomButton noticeTemplateBottomButton) {
            this.f141451a = str;
            this.f141452b = noticeTemplateBottomButton;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f141452b.getContext(), this.f141451a).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62323a
    /* renamed from: a */
    public final void mo100316a(MusNotice musNotice, AbstractC62327b bVar) {
        C61621c cVar;
        List<C61622d> list;
        C89219l.m154721d(musNotice, "");
        C89219l.m154721d(bVar, "");
        C61630e eVar = musNotice.templateNotice;
        if (!(eVar == null || (cVar = eVar.f139886b) == null || (list = cVar.f139856q) == null)) {
            for (T t : list) {
                Integer num = t.f139858b;
                if (num != null) {
                    if (num.intValue() == 0) {
                        m112744a(bVar.getNegativeButton(), t, bVar);
                    } else if (num.intValue() == 2) {
                        m112744a(bVar.getPositiveButton(), t, bVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m112744a(NoticeTemplateBottomButton noticeTemplateBottomButton, C61622d dVar, AbstractC62327b bVar) {
        noticeTemplateBottomButton.setText(dVar.f139857a);
        m112745b(noticeTemplateBottomButton, dVar, bVar);
    }

    /* renamed from: b */
    private static void m112745b(NoticeTemplateBottomButton noticeTemplateBottomButton, C61622d dVar, AbstractC62327b bVar) {
        String str = dVar.f139859c;
        if (str == null || !C80537hk.m139613a(str)) {
            List<Integer> list = dVar.f139860d;
            if (list != null && (!list.isEmpty()) && list.get(0).intValue() == 1) {
                noticeTemplateBottomButton.setOnClickListener(new View$OnClickListenerC62326b(noticeTemplateBottomButton, bVar));
                return;
            }
            return;
        }
        noticeTemplateBottomButton.setOnClickListener(new View$OnClickListenerC62325a(str, noticeTemplateBottomButton));
    }
}
