package com.p2082ss.android.ugc.aweme.question.p3661c;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.question.C66517d;
import com.p2082ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.p2082ss.android.ugc.aweme.question.p3666h.p3667a.C66539c;
import com.p2082ss.android.ugc.aweme.views.MultiAvatarView;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.question.c.b */
public final class C66510b {

    /* renamed from: a */
    public C66504c f149526a;

    /* renamed from: b */
    public C66539c f149527b;

    /* renamed from: c */
    public final IQAInvitationService f149528c;

    /* renamed from: d */
    public boolean f149529d;

    /* renamed from: e */
    public final Activity f149530e;

    /* renamed from: f */
    public final View f149531f;

    /* renamed from: g */
    public final MultiAvatarView f149532g;

    /* renamed from: h */
    private final QuestionDetailParam f149533h;

    static {
        Covode.recordClassIndex(78053);
    }

    /* renamed from: a */
    public static final /* synthetic */ C66504c m118262a(C66510b bVar) {
        C66504c cVar = bVar.f149526a;
        if (cVar == null) {
            C89219l.m154710a("mData");
        }
        return cVar;
    }

    public C66510b(Activity activity, View view, MultiAvatarView multiAvatarView, QuestionDetailParam questionDetailParam) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(multiAvatarView, "");
        this.f149530e = activity;
        this.f149531f = view;
        this.f149532g = multiAvatarView;
        this.f149533h = questionDetailParam;
        IQAInvitationService b = QAInvitationService.m117786b();
        C89219l.m154716b(b, "");
        this.f149528c = b;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        multiAvatarView.mo125016a(a, C89241a.m154730a(TypedValue.applyDimension(1, 13.5f, system2.getDisplayMetrics())));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.question.p3661c.C66510b.View$OnClickListenerC665111 */

            /* renamed from: a */
            final /* synthetic */ C66510b f149534a;

            static {
                Covode.recordClassIndex(78054);
            }

            {
                this.f149534a = r1;
            }

            public final void onClick(View view) {
                long j;
                List<User> list;
                String uid;
                List<User> inviterList;
                String str;
                List<User> inviterList2;
                User user;
                List<User> inviterList3;
                User user2;
                List<User> inviterList4;
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200)) {
                    C66517d inviteInfo = C66510b.m118262a(this.f149534a).getInviteInfo();
                    if (inviteInfo == null || (inviterList4 = inviteInfo.getInviterList()) == null || !inviterList4.isEmpty()) {
                        C66517d inviteInfo2 = C66510b.m118262a(this.f149534a).getInviteInfo();
                        if (inviteInfo2 == null || (inviterList = inviteInfo2.getInviterList()) == null || inviterList.size() != 1) {
                            try {
                                IQAInvitationService iQAInvitationService = this.f149534a.f149528c;
                                Activity activity = this.f149534a.f149530e;
                                C66539c cVar = this.f149534a.f149527b;
                                if (cVar == null) {
                                    C89219l.m154710a("mHeaderParam");
                                }
                                String str2 = cVar.f149612d;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Long id = C66510b.m118262a(this.f149534a).getId();
                                long j2 = 0;
                                if (id != null) {
                                    j = id.longValue();
                                } else {
                                    j = 0;
                                }
                                User creator = C66510b.m118262a(this.f149534a).getCreator();
                                if (!(creator == null || (uid = creator.getUid()) == null)) {
                                    j2 = Long.parseLong(uid);
                                }
                                C66517d inviteInfo3 = C66510b.m118262a(this.f149534a).getInviteInfo();
                                if (inviteInfo3 == null || (list = inviteInfo3.getInviterList()) == null) {
                                    list = C89086z.INSTANCE;
                                }
                                iQAInvitationService.mo105002a(activity, "click_invitation", str2, j, j2, list);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            SmartRoute buildRoute = SmartRouter.buildRoute(C17867d.m33078a(), "aweme://user/profile/");
                            C66517d inviteInfo4 = C66510b.m118262a(this.f149534a).getInviteInfo();
                            String str3 = null;
                            if (inviteInfo4 == null || (inviterList3 = inviteInfo4.getInviterList()) == null || (user2 = inviterList3.get(0)) == null) {
                                str = null;
                            } else {
                                str = user2.getUid();
                            }
                            SmartRoute withParam = buildRoute.withParam("uid", str);
                            C66517d inviteInfo5 = C66510b.m118262a(this.f149534a).getInviteInfo();
                            if (!(inviteInfo5 == null || (inviterList2 = inviteInfo5.getInviterList()) == null || (user = inviterList2.get(0)) == null)) {
                                str3 = user.getSecUid();
                            }
                            withParam.withParam("sec_user_id", str3).withParam("enter_from", "qa_detail").open();
                        }
                    }
                }
            }
        });
    }
}
