package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.al */
public final class View$OnClickListenerC62046al extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    private final View f140832a;

    /* renamed from: b */
    private final AvatarImageWithVerify f140833b;

    /* renamed from: c */
    private final TextView f140834c;

    /* renamed from: d */
    private final TextView f140835d;

    /* renamed from: e */
    private final RemoteImageView f140836e;

    /* renamed from: f */
    private PostNotice f140837f;

    static {
        Covode.recordClassIndex(72800);
    }

    /* renamed from: c */
    private static boolean m112233c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    /* renamed from: f */
    public final void mo100100f() {
        super.mo100146g();
        this.f140768h.mo100338a(this.f140984j, new C62047a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.al$a */
    static final class C62047a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62046al f140838a;

        static {
            Covode.recordClassIndex(72801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62047a(View$OnClickListenerC62046al alVar) {
            super(0);
            this.f140838a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = this.f140838a.f140985k;
            String str = this.f140838a.f140986l;
            C89219l.m154716b(str, "");
            C62259e.m112619a("create_aweme", i, str, this.f140838a.f140768h.mo100337a(), this.f140838a.f140984j.templateId);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62046al(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140832a = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f140833b = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById3, "");
        this.f140834c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById4, "");
        this.f140835d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById5, "");
        RemoteImageView remoteImageView = (RemoteImageView) findViewById5;
        this.f140836e = remoteImageView;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageWithVerify);
        C62023a.m112168a(remoteImageView);
        remoteImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
        avatarImageWithVerify.mo61285a();
        ((C24246a) remoteImageView.getHierarchy()).mo39966c(R.color.f);
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
    public final void mo100110a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62046al.mo100110a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        Aweme aweme;
        Integer num;
        String str;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112233c();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        PostNotice postNotice = this.f140837f;
        if (postNotice != null && (aweme = postNotice.getAweme()) != null) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == R.id.cuf) {
                    User author = aweme.getAuthor();
                    C89219l.m154716b(author, "");
                    String uid = author.getUid();
                    User author2 = aweme.getAuthor();
                    C89219l.m154716b(author2, "");
                    AbstractView$OnLongClickListenerC62118k.m112176b(uid, author2.getSecUid(), "message");
                    User author3 = aweme.getAuthor();
                    C89219l.m154716b(author3, "");
                    AbstractView$OnLongClickListenerC62118k.m112174a(author3.getUid(), "notification_page", "click_head");
                } else if (num.intValue() == R.id.cv7 || num.intValue() == R.id.cu9) {
                    C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://aweme/detail/" + aweme.getAid()).mo63248a("refer", "message").mo63249a());
                    String aid = aweme.getAid();
                    if (!TextUtils.isEmpty(aid)) {
                        MobClick value = new MobClick().setEventName("video_play").setLabelName("message").setValue(aid);
                        C33743c cVar = new C33743c();
                        User author4 = aweme.getAuthor();
                        C89219l.m154716b(author4, "");
                        C33743c a = cVar.mo59976a("request_id", author4.getRequestId());
                        if (aweme.getAllowGift()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        C39162r.onEvent(value.setJsonObject(a.mo59976a("is_giftable", str).mo59977a()));
                    }
                }
            }
        }
    }
}
