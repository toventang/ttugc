package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.C23035c;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.bytedance.tux.dialog.p1715d.C23045a;
import com.bytedance.tux.dialog.p1716e.C23055f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.GroupInviteState;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55373c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b */
public final class C55341b implements AbstractC20527q {

    /* renamed from: a */
    public GroupInviteViewModel f126555a;

    /* renamed from: b */
    public C55371a f126556b;

    /* renamed from: c */
    public Set<C23013a> f126557c = new LinkedHashSet();

    /* renamed from: d */
    public final ActivityC0945e f126558d;

    /* renamed from: e */
    private final C88411a f126559e = new C88411a();

    static {
        Covode.recordClassIndex(65106);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f126558d.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: a */
    private final void m101160a() {
        Iterator<T> it = this.f126557c.iterator();
        while (it.hasNext()) {
            it.next().dismiss();
        }
        this.f126557c.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b$a */
    public static final class C55342a extends AbstractC89220m implements AbstractC89172b<GroupInviteState, GroupInviteState> {

        /* renamed from: a */
        public static final C55342a f126560a = new C55342a();

        static {
            Covode.recordClassIndex(65107);
        }

        C55342a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ GroupInviteState invoke(GroupInviteState groupInviteState) {
            C89219l.m154721d(groupInviteState, "");
            return groupInviteState;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b$f */
    public static final class C55354f extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55341b f126573a;

        static {
            Covode.recordClassIndex(65119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55354f(C55341b bVar) {
            super(1);
            this.f126573a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C89219l.m154721d(aVar, "");
            this.f126573a.f126557c.remove(aVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ GroupInviteViewModel m101159a(C55341b bVar) {
        GroupInviteViewModel groupInviteViewModel = bVar.f126555a;
        if (groupInviteViewModel == null) {
            C89219l.m154710a("invitationCheckViewModel");
        }
        return groupInviteViewModel;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b$e */
    public static final class C55353e extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C55353e f126572a = new C55353e();

        static {
            Covode.recordClassIndex(65118);
        }

        C55353e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.cfq, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    public C55341b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f126558d = eVar;
    }

    /* renamed from: a */
    public final void mo92405a(String str) {
        if (str != null && str.length() != 0) {
            m101160a();
            this.f126559e.mo142944a();
            ActivityC0945e eVar = this.f126558d;
            if (str == null) {
                str = "";
            }
            GroupInviteViewModel a = GroupInviteViewModel.C54007a.m99231a(eVar, str);
            a.mo33686a_(C55342a.f126560a);
            this.f126555a = a;
            C88934a.m154195a(AbstractC20468h.C20469a.m38667a(this, a, C55355c.f126574a, (C20370ah) null, (AbstractC89183m) null, (AbstractC89172b) null, new C55343b(this), 14), this.f126559e);
            GroupInviteViewModel groupInviteViewModel = this.f126555a;
            if (groupInviteViewModel == null) {
                C89219l.m154710a("invitationCheckViewModel");
            }
            C88934a.m154195a(AbstractC20468h.C20469a.m38667a(this, groupInviteViewModel, C55356d.f126575a, (C20370ah) null, new C55352d(this), (AbstractC89172b) null, new C55349c(this), 10), this.f126559e);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b$d */
    public static final class C55352d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55341b f126571a;

        static {
            Covode.recordClassIndex(65117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55352d(C55341b bVar) {
            super(2);
            this.f126571a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            new C23144b(this.f126571a.f126558d).mo37640e(R.string.dck).mo37637b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b$c */
    public static final class C55349c extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, AcceptInviteCardResponse, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55341b f126568a;

        static {
            Covode.recordClassIndex(65114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55349c(C55341b bVar) {
            super(2);
            this.f126568a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, AcceptInviteCardResponse acceptInviteCardResponse) {
            AcceptInviteCardResponse acceptInviteCardResponse2 = acceptInviteCardResponse;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(acceptInviteCardResponse2, "");
            if (acceptInviteCardResponse2.getInviteError() == null) {
                Integer inviteeGroupStatus = acceptInviteCardResponse2.getInviteeGroupStatus();
                if (inviteeGroupStatus != null) {
                    if (inviteeGroupStatus.intValue() == 3) {
                        C55341b.m101159a(this.f126568a).mo91136a(this.f126568a.f126558d);
                    } else if (inviteeGroupStatus.intValue() == 2) {
                        ((TuxIconView) C1764a.m5927a(LayoutInflater.from(this.f126568a.f126558d), R.layout.a4k, null, false).findViewById(R.id.bj_)).setTintColor(C0643b.m2378c(this.f126568a.f126558d, R.color.bz));
                        C23013a a = ((C23023b) C23028c.m43435a((C23023b) C23035c.m43448a(this.f126568a.f126558d).mo37482a(false).mo37483b(R.string.c6v), C553501.f126569a).mo37481a(new AbstractC89172b<C23013a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55341b.C55349c.C553512 */

                            /* renamed from: a */
                            final /* synthetic */ C55349c f126570a;

                            static {
                                Covode.recordClassIndex(65116);
                            }

                            {
                                this.f126570a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23013a aVar) {
                                C89219l.m154721d(aVar, "");
                                this.f126570a.f126568a.f126557c.remove(aVar);
                                return C89391z.f203057a;
                            }
                        })).mo37405a();
                        this.f126568a.f126557c.add(a);
                        a.mo37396b().show();
                    }
                }
            } else {
                this.f126568a.mo92404a(acceptInviteCardResponse2.getInviteError(), false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo92404a(C55373c cVar, boolean z) {
        String str;
        String str2 = null;
        View a = C1764a.m5927a(LayoutInflater.from(this.f126558d), R.layout.a4k, null, false);
        ((TuxIconView) a.findViewById(R.id.bj_)).setTintColor(C0643b.m2378c(this.f126558d, R.color.bz));
        C23023b bVar = (C23023b) C23035c.m43448a(this.f126558d).mo37482a(false);
        if (!(!z || (str = cVar.f126609b) == null || str.length() == 0)) {
            C89219l.m154716b(a, "");
            bVar = C23055f.m43473a(bVar, a, null).mo37411b(cVar.f126609b);
        }
        C23013a a2 = ((C23023b) C23028c.m43435a(bVar.mo37413d(cVar.f126610c), C55353e.f126572a).mo37481a(new C55354f(this))).mo37405a();
        this.f126557c.add(a2);
        a2.mo37396b().show();
        C89378p[] pVarArr = new C89378p[2];
        C55371a aVar = this.f126556b;
        if (aVar != null) {
            str2 = aVar.getConversationId();
        }
        pVarArr[0] = C89387v.m154943a(str2, "conversation_id");
        pVarArr[1] = C89387v.m154943a(cVar.f126608a, "error_code");
        C39162r.m79462a("show_invalid_share", pVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b$b */
    public static final class C55343b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, InviteCardDetailInnerResponse, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55341b f126561a;

        static {
            Covode.recordClassIndex(65108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55343b(C55341b bVar) {
            super(2);
            this.f126561a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, InviteCardDetailInnerResponse inviteCardDetailInnerResponse) {
            String str;
            String str2;
            int i;
            int i2;
            Integer groupSize;
            Integer groupSize2;
            final InviteCardDetailInnerResponse inviteCardDetailInnerResponse2 = inviteCardDetailInnerResponse;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(inviteCardDetailInnerResponse2, "");
            this.f126561a.f126556b = inviteCardDetailInnerResponse2.getGroup();
            if (inviteCardDetailInnerResponse2.getInviteError() != null) {
                this.f126561a.mo92404a(inviteCardDetailInnerResponse2.getInviteError(), true);
            } else {
                Integer inviteeGroupStatus = inviteCardDetailInnerResponse2.getInviteeGroupStatus();
                if (inviteeGroupStatus != null) {
                    if (inviteeGroupStatus.intValue() == 3) {
                        C55341b.m101159a(this.f126561a).mo91136a(this.f126561a.f126558d);
                    } else if (inviteeGroupStatus.intValue() == 0 || inviteeGroupStatus.intValue() == 2 || inviteeGroupStatus.intValue() == 1) {
                        LayoutInflater from = LayoutInflater.from(this.f126561a.f126558d);
                        View a = C1764a.m5927a(from, R.layout.a4j, null, false);
                        RemoteImageView remoteImageView = (RemoteImageView) a.findViewById(R.id.bjb);
                        C55371a group = inviteCardDetailInnerResponse2.getGroup();
                        if (group != null) {
                            str = group.getAvatarUrl();
                        } else {
                            str = null;
                        }
                        C34577e.m70608b(remoteImageView, str, -1, -1);
                        View a2 = C1764a.m5927a(from, R.layout.a4i, null, false);
                        View findViewById = a2.findViewById(R.id.bjm);
                        C89219l.m154716b(findViewById, "");
                        TuxTextView tuxTextView = (TuxTextView) findViewById;
                        C55371a group2 = inviteCardDetailInnerResponse2.getGroup();
                        if (group2 != null) {
                            str2 = group2.getName();
                        } else {
                            str2 = null;
                        }
                        tuxTextView.setText(str2);
                        View findViewById2 = a2.findViewById(R.id.bjl);
                        C89219l.m154716b(findViewById2, "");
                        TuxTextView tuxTextView2 = (TuxTextView) findViewById2;
                        Resources resources = this.f126561a.f126558d.getResources();
                        C55371a group3 = inviteCardDetailInnerResponse2.getGroup();
                        if (group3 == null || (groupSize2 = group3.getGroupSize()) == null) {
                            i = 0;
                        } else {
                            i = groupSize2.intValue();
                        }
                        Object[] objArr = new Object[1];
                        C55371a group4 = inviteCardDetailInnerResponse2.getGroup();
                        if (group4 == null || (groupSize = group4.getGroupSize()) == null) {
                            i2 = 0;
                        } else {
                            i2 = groupSize.intValue();
                        }
                        objArr[0] = Integer.valueOf(i2);
                        tuxTextView2.setText(resources.getQuantityString(R.plurals.cu, i, objArr));
                        View findViewById3 = a2.findViewById(R.id.bjk);
                        C89219l.m154716b(findViewById3, "");
                        TuxTextView tuxTextView3 = (TuxTextView) findViewById3;
                        C17191a.C17192a aVar = new C17191a.C17192a();
                        Resources resources2 = this.f126561a.f126558d.getResources();
                        C89219l.m154716b(resources2, "");
                        String[] strArr = new String[1];
                        String inviterName = inviteCardDetailInnerResponse2.getInviterName();
                        if (inviterName == null) {
                            inviterName = "";
                        }
                        strArr[0] = inviterName;
                        tuxTextView3.setText(aVar.mo27176a(resources2, R.string.c6q, strArr).f40973a);
                        C89219l.m154716b(a, "");
                        C23023b a3 = C23055f.m43473a((C23023b) new C23023b(this.f126561a.f126558d).mo37482a(false), a, null);
                        C89219l.m154716b(a2, "");
                        C89219l.m154719c(a3, "");
                        C89219l.m154719c(a2, "");
                        a3.mo37408a(new C23045a(a2));
                        C23013a a4 = ((C23023b) C23032e.m43444a(a3, new AbstractC89172b<C23029d, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55341b.C55343b.C553441 */

                            /* renamed from: a */
                            final /* synthetic */ C55343b f126562a;

                            static {
                                Covode.recordClassIndex(65109);
                            }

                            {
                                this.f126562a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23029d dVar) {
                                C23029d dVar2 = dVar;
                                C89219l.m154721d(dVar2, "");
                                Integer inviteeGroupStatus = inviteCardDetailInnerResponse2.getInviteeGroupStatus();
                                if (inviteeGroupStatus != null && inviteeGroupStatus.intValue() == 2) {
                                    dVar2.mo37423a(R.string.c5i, C553462.f126565a);
                                    dVar2.f54521a.get(0).mo37430a(false);
                                } else {
                                    dVar2.mo37423a(R.string.c5g, new AbstractC89172b<C23024a, C89391z>(this) {
                                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55341b.C55343b.C553441.C553451 */

                                        /* renamed from: a */
                                        final /* synthetic */ C553441 f126564a;

                                        static {
                                            Covode.recordClassIndex(65110);
                                        }

                                        {
                                            this.f126564a = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                            C89219l.m154721d(aVar, "");
                                            C55341b.m101159a(this.f126564a.f126562a.f126561a).mo91135a();
                                            C55341b.m101159a(this.f126564a.f126562a.f126561a).mo91137a("join", "out_app");
                                            return C89391z.f203057a;
                                        }
                                    });
                                }
                                dVar2.mo37425b(R.string.c5h, new AbstractC89172b<C23024a, C89391z>(this) {
                                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55341b.C55343b.C553441.C553473 */

                                    /* renamed from: a */
                                    final /* synthetic */ C553441 f126566a;

                                    static {
                                        Covode.recordClassIndex(65112);
                                    }

                                    {
                                        this.f126566a = r2;
                                    }

                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                        C89219l.m154721d(aVar, "");
                                        C55341b.m101159a(this.f126566a.f126562a.f126561a).mo91137a("ignore", "out_app");
                                        return C89391z.f203057a;
                                    }
                                });
                                return C89391z.f203057a;
                            }
                        }).mo37481a(new AbstractC89172b<C23013a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55341b.C55343b.C553482 */

                            /* renamed from: a */
                            final /* synthetic */ C55343b f126567a;

                            static {
                                Covode.recordClassIndex(65113);
                            }

                            {
                                this.f126567a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23013a aVar) {
                                C89219l.m154721d(aVar, "");
                                this.f126567a.f126561a.f126557c.remove(aVar);
                                return C89391z.f203057a;
                            }
                        })).mo37405a();
                        this.f126561a.f126557c.add(a4);
                        a4.mo37396b().show();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
