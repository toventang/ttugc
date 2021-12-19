package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.AbstractC55903a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.C55908c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.C55910d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55966a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.viewmodel.ShareDialogViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d */
public final class C55882d extends AbstractC55875b<IMContact> {

    /* renamed from: i */
    public static final C55883a f127388i = new C55883a((byte) 0);

    /* renamed from: d */
    public boolean f127389d;

    /* renamed from: e */
    public boolean f127390e;

    /* renamed from: f */
    public LinearLayoutManager f127391f;

    /* renamed from: g */
    final SharePackage f127392g;

    /* renamed from: h */
    public final ShareDialogViewModel f127393h;

    /* renamed from: j */
    private AbstractC89187q<? super Integer, ? super Integer, ? super View, C89391z> f127394j;

    /* renamed from: k */
    private final boolean f127395k;

    /* renamed from: w */
    private final boolean f127396w;

    static {
        Covode.recordClassIndex(65672);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d$a */
    public static final class C55883a {
        static {
            Covode.recordClassIndex(65673);
        }

        private C55883a() {
        }

        public /* synthetic */ C55883a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.q<? super java.lang.Integer, ? super java.lang.Integer, ? super android.view.View, h.z>, h.f.a.q<java.lang.Integer, java.lang.Integer, android.view.View, h.z> */
    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55875b
    /* renamed from: o */
    public final AbstractC89187q<Integer, Integer, View, C89391z> mo92738o() {
        return this.f127394j;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55875b
    /* renamed from: p */
    public final SharePackage mo92739p() {
        return this.f127392g;
    }

    /* renamed from: a */
    public final void mo92746a(boolean z) {
        if (z != this.f127389d) {
            this.f127389d = z;
            notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public final void mo92749e(boolean z) {
        if (z != this.f127390e) {
            this.f127390e = z;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.f127391f = (LinearLayoutManager) layoutManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo92736b(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        if (!this.f127389d) {
            return false;
        }
        if ((!(iMContact instanceof IMUser) || !IMUser.isFriend(((IMUser) iMContact).getFollowStatus())) && !(iMContact instanceof C55966a)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55875b
    /* renamed from: c */
    public final int mo60936c(int i) {
        List n = mo92318n();
        if (n == null || n.isEmpty() || i < mo92317m()) {
            return super.mo60936c(i);
        }
        Integer valueOf = Integer.valueOf(i - mo92317m());
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= n.size() || valueOf == null) {
            return super.mo60936c(i);
        }
        if (n.get(valueOf.intValue()) instanceof C55966a) {
            return 2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        IMUser iMUser = null;
        if (!(viewHolder instanceof C55910d)) {
            viewHolder = null;
        }
        C55910d dVar = (C55910d) viewHolder;
        if (dVar != null) {
            boolean z = this.f127396w;
            SharePackage sharePackage = this.f127392g;
            if (!dVar.f127468l.mo93016b()) {
                IMContact iMContact = dVar.f127466j;
                if (iMContact instanceof IMUser) {
                    iMUser = iMContact;
                }
                IMUser iMUser2 = iMUser;
                if (iMUser2 != null) {
                    if (!dVar.f127468l.mo93013a().contains(iMUser2.getUid())) {
                        C55940a.m101781a(iMUser2, dVar.f127467k, "column", sharePackage, z, C55940a.C55941a.f127577a);
                        Set<String> a = dVar.f127468l.mo93013a();
                        String uid = iMUser2.getUid();
                        C89219l.m154716b(uid, "");
                        a.add(uid);
                    }
                }
            }
        }
    }

    public /* synthetic */ C55882d(SharePackage sharePackage, ShareDialogViewModel shareDialogViewModel) {
        this(sharePackage, shareDialogViewModel, true, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55875b
    /* renamed from: b */
    public final AbstractC55903a<IMContact> mo92735b(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i != 2) {
            return new C55910d(viewGroup, this.f127393h, this.f127395k);
        }
        return new C55908c(viewGroup, this.f127393h);
    }

    /* renamed from: a */
    public final boolean mo92748a(IMContact iMContact, View view) {
        IMUser a;
        if ((iMContact instanceof IMConversation) || (a = C55083f.m100745a(iMContact)) == null || C89219l.m154714a((Object) a.getUid(), (Object) C55197c.m100919b().toString()) || a.getFollowStatus() == 2) {
            return true;
        }
        String str = this.f127392g.f155487d;
        int hashCode = str.hashCode();
        if (hashCode != 102340) {
            if (hashCode == 110986 && str.equals("pic")) {
                new C23144b(view).mo37640e(R.string.cfr).mo37637b();
                return false;
            }
        } else if (str.equals("gif")) {
            new C23144b(view).mo37640e(R.string.cdp).mo37637b();
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d$b */
    static final class C55884b extends AbstractC89220m implements AbstractC89187q<Integer, Integer, View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55882d f127397a;

        static {
            Covode.recordClassIndex(65674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55884b(C55882d dVar) {
            super(3);
            this.f127397a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
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
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ p4600h.C89391z invoke(java.lang.Integer r12, java.lang.Integer r13, android.view.View r14) {
            /*
            // Method dump skipped, instructions count: 268
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55882d.C55884b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C55882d(SharePackage sharePackage, ShareDialogViewModel shareDialogViewModel, boolean z, boolean z2) {
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(shareDialogViewModel, "");
        this.f127392g = sharePackage;
        this.f127393h = shareDialogViewModel;
        this.f127395k = z;
        this.f127396w = z2;
        this.f127394j = new C55884b(this);
    }
}
