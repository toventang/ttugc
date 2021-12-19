package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ba */
public final class View$OnClickListenerC62089ba extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a */
    public C51086a f140934a;

    /* renamed from: b */
    public User f140935b;

    /* renamed from: c */
    private final AbstractC89244h f140936c;

    /* renamed from: d */
    private final AbstractC89244h f140937d;

    /* renamed from: e */
    private final AbstractC89244h f140938e;

    /* renamed from: f */
    private final AbstractC89244h f140939f;

    /* renamed from: g */
    private final AbstractC89244h f140940g;

    /* renamed from: h */
    private final AbstractC89244h f140941h;

    /* renamed from: i */
    private final String f140942i = "notification";

    static {
        Covode.recordClassIndex(72843);
    }

    /* renamed from: e */
    private final ConstraintLayout m112285e() {
        return (ConstraintLayout) this.f140936c.getValue();
    }

    /* renamed from: a */
    public final AvatarImageWithVerify mo100127a() {
        return (AvatarImageWithVerify) this.f140937d.getValue();
    }

    /* renamed from: b */
    public final TuxTextView mo100128b() {
        return (TuxTextView) this.f140938e.getValue();
    }

    /* renamed from: c */
    public final TuxTextView mo100129c() {
        return (TuxTextView) this.f140939f.getValue();
    }

    /* renamed from: d */
    public final MutualRelationView mo100130d() {
        return (MutualRelationView) this.f140940g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ba$a */
    static final class C62090a extends AbstractC89220m implements AbstractC89171a<AvatarImageWithVerify> {

        /* renamed from: a */
        final /* synthetic */ View f140943a;

        static {
            Covode.recordClassIndex(72844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62090a(View view) {
            super(0);
            this.f140943a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageWithVerify invoke() {
            return this.f140943a.findViewById(R.id.cuf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ba$b */
    static final class C62091b extends AbstractC89220m implements AbstractC89171a<NotificationFollowUserBtn> {

        /* renamed from: a */
        final /* synthetic */ View f140944a;

        static {
            Covode.recordClassIndex(72845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62091b(View view) {
            super(0);
            this.f140944a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationFollowUserBtn invoke() {
            return this.f140944a.findViewById(R.id.cud);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ba$c */
    static final class C62092c extends AbstractC89220m implements AbstractC89171a<MutualRelationView> {

        /* renamed from: a */
        final /* synthetic */ View f140945a;

        static {
            Covode.recordClassIndex(72846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62092c(View view) {
            super(0);
            this.f140945a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MutualRelationView invoke() {
            return this.f140945a.findViewById(R.id.cp5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ba$d */
    static final class C62093d extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ View f140946a;

        static {
            Covode.recordClassIndex(72847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62093d(View view) {
            super(0);
            this.f140946a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f140946a.findViewById(R.id.cv7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ba$e */
    static final class C62094e extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f140947a;

        static {
            Covode.recordClassIndex(72848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62094e(View view) {
            super(0);
            this.f140947a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f140947a.findViewById(R.id.cu7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ba$f */
    static final class C62095f extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f140948a;

        static {
            Covode.recordClassIndex(72849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62095f(View view) {
            super(0);
            this.f140948a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f140948a.findViewById(R.id.cuw);
        }
    }

    /* renamed from: f */
    private static boolean m112286f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62089ba(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f140936c = C89250i.m154773a((AbstractC89171a) new C62093d(view));
        this.f140937d = C89250i.m154773a((AbstractC89171a) new C62090a(view));
        this.f140938e = C89250i.m154773a((AbstractC89171a) new C62095f(view));
        this.f140939f = C89250i.m154773a((AbstractC89171a) new C62094e(view));
        this.f140940g = C89250i.m154773a((AbstractC89171a) new C62092c(view));
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) new C62091b(view));
        this.f140941h = a;
        NotificationFollowUserBtn notificationFollowUserBtn = (NotificationFollowUserBtn) a.getValue();
        C89219l.m154716b(notificationFollowUserBtn, "");
        notificationFollowUserBtn.setVisibility(8);
        ConstraintLayout e = m112285e();
        C89219l.m154716b(e, "");
        C62266j.m112647b(e);
        m112285e().setOnClickListener(this);
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
    public final void onClick(android.view.View r11) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62089ba.onClick(android.view.View):void");
    }
}
