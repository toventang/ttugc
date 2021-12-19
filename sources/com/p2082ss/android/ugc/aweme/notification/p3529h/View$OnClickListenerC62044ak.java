package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.utils.C62268k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ak */
public final class View$OnClickListenerC62044ak extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    private final View f140823a;

    /* renamed from: b */
    private final View f140824b;

    /* renamed from: c */
    private final AvatarImageWithVerify f140825c;

    /* renamed from: d */
    private final AvatarImageView f140826d;

    /* renamed from: e */
    private final AvatarImageView f140827e;

    /* renamed from: f */
    private final TextView f140828f;

    /* renamed from: q */
    private final TextView f140829q;

    /* renamed from: r */
    private CheckProfileNotice f140830r;

    static {
        Covode.recordClassIndex(72798);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: c */
    private static boolean m112229c() {
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
        this.f140768h.mo100338a(this.f140984j, new C62045a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ak$a */
    static final class C62045a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62044ak f140831a;

        static {
            Covode.recordClassIndex(72799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62045a(View$OnClickListenerC62044ak akVar) {
            super(0);
            this.f140831a = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = this.f140831a.f140985k;
            String str = this.f140831a.f140986l;
            C89219l.m154716b(str, "");
            C62259e.m112619a("check_profile", i, str, this.f140831a.f140768h.mo100337a(), this.f140831a.f140984j.templateId);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62044ak(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140823a = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        this.f140824b = findViewById2;
        View findViewById3 = view.findViewById(R.id.cuh);
        C89219l.m154716b(findViewById3, "");
        this.f140825c = (AvatarImageWithVerify) findViewById3;
        View findViewById4 = view.findViewById(R.id.cuj);
        C89219l.m154716b(findViewById4, "");
        this.f140826d = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cuk);
        C89219l.m154716b(findViewById5, "");
        this.f140827e = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById6, "");
        this.f140828f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById7, "");
        this.f140829q = (TextView) findViewById7;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(findViewById2);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
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
    public final void mo100109a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62044ak.mo100109a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112229c();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        CheckProfileNotice checkProfileNotice = this.f140830r;
        if (checkProfileNotice != null && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.cuf) {
                List<User> users = checkProfileNotice.getUsers();
                if (users == null) {
                    return;
                }
                if (users.size() == 1) {
                    AbstractView$OnLongClickListenerC62118k.m112176b(((User) C89070n.m154579f((List) users)).getUid(), ((User) C89070n.m154579f((List) users)).getSecUid(), "message");
                    AbstractView$OnLongClickListenerC62118k.m112174a(((User) C89070n.m154579f((List) users)).getUid(), "notification_page", "click_head");
                    return;
                }
                C62268k.m112648a(view.getContext());
            } else if (valueOf.intValue() == R.id.cv7) {
                mo100143a("check_profile", getLayoutPosition());
                C62268k.m112648a(view.getContext());
            }
        }
    }
}
