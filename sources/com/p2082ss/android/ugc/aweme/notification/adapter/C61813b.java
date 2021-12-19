package com.p2082ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.notification.LikeListDetailActivity;
import com.p2082ss.android.ugc.aweme.notification.bean.C61878k;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62101f;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62103h;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62170y;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62107i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.b */
public final class C61813b extends AbstractC39060f<User> {

    /* renamed from: f */
    public static final C61814a f140313f = new C61814a((byte) 0);

    /* renamed from: a */
    public UrlModel f140314a;

    /* renamed from: b */
    public String f140315b;

    /* renamed from: c */
    public String f140316c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f140317d;

    /* renamed from: e */
    public int f140318e;

    static {
        Covode.recordClassIndex(72549);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.b$a */
    public static final class C61814a {
        static {
            Covode.recordClassIndex(72550);
        }

        private C61814a() {
        }

        public /* synthetic */ C61814a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.b$c */
    static final class C61816c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C61816c f140324a = new C61816c();

        static {
            Covode.recordClassIndex(72552);
        }

        C61816c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    private C61813b() {
        this.f140318e = 0;
        this.f140317d = C61816c.f140324a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.b$b */
    public static final class C61815b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61813b f140319a;

        /* renamed from: b */
        final /* synthetic */ List f140320b;

        /* renamed from: c */
        final /* synthetic */ List f140321c;

        /* renamed from: d */
        final /* synthetic */ int f140322d;

        /* renamed from: e */
        final /* synthetic */ List f140323e;

        static {
            Covode.recordClassIndex(72551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61815b(C61813b bVar, List list, List list2, int i, List list3) {
            super(0);
            this.f140319a = bVar;
            this.f140320b = list;
            this.f140321c = list2;
            this.f140322d = i;
            this.f140323e = list3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = 0;
            while (this.f140321c.size() + i < this.f140319a.f140318e + this.f140322d && i < this.f140320b.size()) {
                this.f140323e.add(this.f140320b.get(i));
                i++;
            }
            if (i < this.f140320b.size()) {
                this.f140323e.add(new C61878k(1));
                List list = this.f140323e;
                List list2 = this.f140320b;
                list.addAll(list2.subList(i, list2.size()));
            }
            return C89391z.f203057a;
        }
    }

    public /* synthetic */ C61813b(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final void mo63366c(List<User> list) {
        super.mo63366c(m111875a(list, true));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<User> list) {
        List<User> a = m111875a(list, false);
        a.add(0, new C62101f());
        super.mo62377b_(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        if (mo63369e().get(i) instanceof C62101f) {
            return 15;
        }
        if (mo63369e().get(i) instanceof C61878k) {
            return 14;
        }
        return super.mo60936c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        LikeListDetailActivity likeListDetailActivity = null;
        if (!(viewHolder instanceof View$OnClickListenerC62107i)) {
            viewHolder = null;
        }
        View$OnClickListenerC62107i iVar = (View$OnClickListenerC62107i) viewHolder;
        if (iVar != null) {
            View view = iVar.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            if (context instanceof LikeListDetailActivity) {
                likeListDetailActivity = context;
            }
            LikeListDetailActivity likeListDetailActivity2 = likeListDetailActivity;
            if (likeListDetailActivity2 != null) {
                likeListDetailActivity2.mo99801a(iVar.getAdapterPosition(), "show", iVar.f140961b);
            }
        }
        C56386j.m102364b();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        int c = C0643b.m2378c(viewGroup.getContext(), R.color.c5);
        mo67819f(c);
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(61);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c);
        tuxTextView.setText(R.string.cer);
        Context context2 = viewGroup.getContext();
        C89219l.m154716b(context2, "");
        TuxTextView tuxTextView2 = new TuxTextView(context2, null, 0, 6);
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextColor(c);
        tuxTextView2.setText(R.string.cfm);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(tuxTextView2));
        C89219l.m154716b(a_, "");
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i == 14) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.lc, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C62170y(a);
        } else if (i != 15) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.kt, viewGroup, false);
            C89219l.m154716b(a2, "");
            return new View$OnClickListenerC62107i(a2);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.k9, viewGroup, false);
            C89219l.m154716b(a3, "");
            return new C62103h(a3, this.f140314a, this.f140315b, this.f140316c, this.f140317d);
        }
    }

    /* renamed from: a */
    private final List<User> m111875a(List<User> list, boolean z) {
        int i;
        boolean z2;
        if (this.f140318e == 0) {
            if (list == null) {
                return new ArrayList();
            }
            return list;
        } else if (list == null || list.isEmpty()) {
            return new ArrayList();
        } else {
            List e = mo63369e();
            if (e == null) {
                e = new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator a = C89070n.m154598r(e).mo2926a();
            while (true) {
                if (!a.hasNext()) {
                    i = 0;
                    break;
                }
                User user = (User) a.next();
                if ((user instanceof C61878k) && ((C61878k) user).getType() == 0) {
                    i = 1;
                    break;
                }
            }
            Iterator a2 = C89070n.m154598r(e).mo2926a();
            while (true) {
                if (!a2.hasNext()) {
                    z2 = false;
                    break;
                }
                User user2 = (User) a2.next();
                if ((user2 instanceof C61878k) && ((C61878k) user2).getType() == 1) {
                    z2 = true;
                    break;
                }
            }
            C61815b bVar = new C61815b(this, list, e, i, arrayList);
            if (!z) {
                if (i == 0) {
                    arrayList.add(new C61878k(0));
                }
                bVar.invoke();
            } else if (i != 0) {
                if (z2 || e.size() + list.size() < this.f140318e + i) {
                    arrayList.addAll(list);
                    return arrayList;
                }
                bVar.invoke();
            }
            return arrayList;
        }
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
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.adapter.C61813b.mo60186a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
