package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.utils.C62264h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.i */
public final class View$OnClickListenerC62107i extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a */
    public C51086a f140960a;

    /* renamed from: b */
    public User f140961b;

    /* renamed from: c */
    public final String f140962c = "notification_page";

    /* renamed from: d */
    private final AbstractC89244h f140963d;

    /* renamed from: e */
    private final AbstractC89244h f140964e;

    /* renamed from: f */
    private final AbstractC89244h f140965f;

    /* renamed from: g */
    private final AbstractC89244h f140966g;

    /* renamed from: h */
    private final AbstractC89244h f140967h;

    /* renamed from: i */
    private final AbstractC89244h f140968i;

    static {
        Covode.recordClassIndex(72861);
    }

    /* renamed from: f */
    private final ConstraintLayout m112299f() {
        return (ConstraintLayout) this.f140963d.getValue();
    }

    /* renamed from: a */
    public final AvatarImageWithVerify mo100135a() {
        return (AvatarImageWithVerify) this.f140964e.getValue();
    }

    /* renamed from: b */
    public final TuxTextView mo100136b() {
        return (TuxTextView) this.f140965f.getValue();
    }

    /* renamed from: c */
    public final TuxTextView mo100137c() {
        return (TuxTextView) this.f140966g.getValue();
    }

    /* renamed from: d */
    public final MutualRelationView mo100138d() {
        return (MutualRelationView) this.f140967h.getValue();
    }

    /* renamed from: e */
    public final NotificationFollowUserBtn mo100139e() {
        return (NotificationFollowUserBtn) this.f140968i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.i$a */
    static final class C62110a extends AbstractC89220m implements AbstractC89171a<AvatarImageWithVerify> {

        /* renamed from: a */
        final /* synthetic */ View f140972a;

        static {
            Covode.recordClassIndex(72864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62110a(View view) {
            super(0);
            this.f140972a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageWithVerify invoke() {
            return this.f140972a.findViewById(R.id.cuf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.i$b */
    static final class C62111b extends AbstractC89220m implements AbstractC89171a<NotificationFollowUserBtn> {

        /* renamed from: a */
        final /* synthetic */ View f140973a;

        static {
            Covode.recordClassIndex(72865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62111b(View view) {
            super(0);
            this.f140973a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationFollowUserBtn invoke() {
            return this.f140973a.findViewById(R.id.cud);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.i$c */
    static final class C62112c extends AbstractC89220m implements AbstractC89171a<MutualRelationView> {

        /* renamed from: a */
        final /* synthetic */ View f140974a;

        static {
            Covode.recordClassIndex(72866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62112c(View view) {
            super(0);
            this.f140974a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MutualRelationView invoke() {
            return this.f140974a.findViewById(R.id.cp5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.i$d */
    static final class C62113d extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ View f140975a;

        static {
            Covode.recordClassIndex(72867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62113d(View view) {
            super(0);
            this.f140975a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f140975a.findViewById(R.id.cv7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.i$e */
    static final class C62114e extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f140976a;

        static {
            Covode.recordClassIndex(72868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62114e(View view) {
            super(0);
            this.f140976a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f140976a.findViewById(R.id.cu7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.i$f */
    static final class C62115f extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f140977a;

        static {
            Covode.recordClassIndex(72869);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62115f(View view) {
            super(0);
            this.f140977a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f140977a.findViewById(R.id.cuw);
        }
    }

    /* renamed from: g */
    private static boolean m112300g() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62107i(final View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f140963d = C89250i.m154773a((AbstractC89171a) new C62113d(view));
        this.f140964e = C89250i.m154773a((AbstractC89171a) new C62110a(view));
        this.f140965f = C89250i.m154773a((AbstractC89171a) new C62115f(view));
        this.f140966g = C89250i.m154773a((AbstractC89171a) new C62114e(view));
        this.f140967h = C89250i.m154773a((AbstractC89171a) new C62112c(view));
        this.f140968i = C89250i.m154773a((AbstractC89171a) new C62111b(view));
        ConstraintLayout f = m112299f();
        C89219l.m154716b(f, "");
        C62266j.m112647b(f);
        C62262g.m112634a(mo100139e());
        m112299f().setOnClickListener(this);
        mo100139e().setOnClickListener(this);
        C51086a aVar = new C51086a(mo100139e(), new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62107i.C621081 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62107i f140969a;

            static {
                Covode.recordClassIndex(72862);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                return this.f140969a.f140962c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f140969a = r1;
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
            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            /* renamed from: a */
            public final void mo63346a(int r13, com.p2082ss.android.ugc.aweme.profile.model.User r14) {
                /*
                // Method dump skipped, instructions count: 184
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62107i.C621081.mo63346a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
        this.f140960a = aVar;
        aVar.f117879e = new C51086a.AbstractC51090c(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62107i.C621092 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62107i f140970a;

            static {
                Covode.recordClassIndex(72863);
            }

            {
                this.f140970a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
            /* renamed from: a */
            public final boolean mo63341a(int i) {
                boolean z;
                Context context = view.getContext();
                User user = this.f140970a.f140961b;
                C89219l.m154716b(this.f140970a.mo100139e(), "");
                if (!NotificationFollowUserBtn.m95704b() || !C56203d.m102113b()) {
                    z = false;
                } else {
                    z = true;
                }
                return C62264h.m112640a(context, user, null, null, "like_list", z, 12);
            }
        };
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
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62107i.onClick(android.view.View):void");
    }
}
