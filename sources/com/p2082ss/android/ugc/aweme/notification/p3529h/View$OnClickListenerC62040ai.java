package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ai */
public final class View$OnClickListenerC62040ai extends AbstractC62159w implements View.OnClickListener {

    /* renamed from: a */
    private final View f140809a;

    /* renamed from: b */
    private final AvatarImageWithVerify f140810b;

    /* renamed from: c */
    private final TextView f140811c;

    /* renamed from: d */
    private final TextView f140812d;

    /* renamed from: e */
    private FollowApproveNotice f140813e;

    static {
        Covode.recordClassIndex(72794);
    }

    /* renamed from: h */
    private static boolean m112222h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w
    /* renamed from: c */
    public final User mo100067c() {
        FollowApproveNotice followApproveNotice = this.f140813e;
        if (followApproveNotice != null) {
            return followApproveNotice.getUser();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62040ai(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140809a = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f140810b = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById3, "");
        this.f140811c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById4, "");
        this.f140812d = (TextView) findViewById4;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageWithVerify);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: a */
    public final void mo100107a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8) {
        /*
            r7 = this;
            java.lang.String r6 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r6)
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r0 = r8.followApproveNotice
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r0 = r8.followApproveNotice
            r7.f140813e = r0
            if (r0 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.profile.model.User r5 = r0.getUser()
            if (r5 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.utils.UserVerify r4 = new com.ss.android.ugc.aweme.utils.UserVerify
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r5.getAvatarThumb()
            java.lang.String r2 = r5.getCustomVerify()
            java.lang.String r1 = r5.getEnterpriseVerifyReason()
            int r0 = r5.getVerificationType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r3, r2, r1, r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r7.f140810b
            r0.setUserData(r4)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r7.f140810b
            r0.mo61285a()
            android.widget.TextView r0 = r7.f140811c
            com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p.m112342a(r7, r0, r5)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            android.content.Context r0 = r7.f140983i
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r6)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131826439(0x7f111707, float:1.9285762E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            r7.mo100141a(r2, r8)
            android.widget.TextView r0 = r7.f140812d
            r0.setText(r2)
        L_0x005e:
            com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w.m112404a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62040ai.mo100107a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        User user;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112222h();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        FollowApproveNotice followApproveNotice = this.f140813e;
        if (followApproveNotice != null && (user = followApproveNotice.getUser()) != null) {
            AbstractView$OnLongClickListenerC62118k.m112176b(user.getUid(), user.getSecUid(), "message");
            AbstractView$OnLongClickListenerC62118k.m112174a(user.getUid(), "notification_page", "click_head");
        }
    }
}
