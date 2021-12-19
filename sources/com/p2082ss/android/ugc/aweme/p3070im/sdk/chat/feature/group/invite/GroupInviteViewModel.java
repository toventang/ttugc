package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55262b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel */
public final class GroupInviteViewModel extends JediViewModel<GroupInviteState> {

    /* renamed from: b */
    public static final C54007a f123835b = new C54007a((byte) 0);

    /* renamed from: a */
    public final C55371a f123836a;

    /* renamed from: c */
    private String f123837c;

    static {
        Covode.recordClassIndex(63679);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$a */
    public static final class C54007a {
        static {
            Covode.recordClassIndex(63680);
        }

        private C54007a() {
        }

        public /* synthetic */ C54007a(byte b) {
            this();
        }

        /* renamed from: a */
        public static GroupInviteViewModel m99231a(ActivityC0945e eVar, String str) {
            AbstractC1174ac a;
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(str, "");
            C1175ad a2 = C1181ae.m3881a(eVar, new C54046h(str, null));
            String str2 = "GroupInviteViewModel_" + str + '_' + System.currentTimeMillis();
            if (GroupInviteViewModel.class.equals(ScopeViewModel.class)) {
                a = a2.mo3984a(str2, GroupInviteViewModel.class);
            } else {
                a = a2.mo3984a(str2, GroupInviteViewModel.class);
                C1171ab.m3870a(a, a2);
            }
            C89219l.m154716b(a, "");
            return (GroupInviteViewModel) a;
        }
    }

    /* renamed from: b */
    public final void mo91138b() {
        mo33689c(C54009c.f123840a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        mo91139g();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ GroupInviteState mo23027d() {
        return new GroupInviteState(null, null, null, false, 15, null);
    }

    /* renamed from: a */
    public final void mo91135a() {
        AbstractC88979t<AcceptInviteCardResponse> a;
        AbstractC88979t<AcceptInviteCardResponse> b = C55262b.m101022b(this.f123837c);
        if (b != null && (a = b.mo143261a(C88391a.m153580a(C88392a.f200660a))) != null) {
            mo33682a(a, C54013f.f123847a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo91139g() {
        AbstractC88979t<InviteCardDetailInnerResponse> a;
        AbstractC88979t<InviteCardDetailInnerResponse> a2 = C55262b.m101020a(this.f123837c);
        if (a2 != null && (a = a2.mo143261a(C88391a.m153580a(C88392a.f200660a))) != null) {
            mo33682a(a, new C54012e(this));
        }
    }

    /* renamed from: a */
    public final void mo91136a(Context context) {
        C89219l.m154721d(context, "");
        mo33687b_(new C54010d(this, context));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$d */
    static final class C54010d extends AbstractC89220m implements AbstractC89172b<GroupInviteState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupInviteViewModel f123841a;

        /* renamed from: b */
        final /* synthetic */ Context f123842b;

        static {
            Covode.recordClassIndex(63683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54010d(GroupInviteViewModel groupInviteViewModel, Context context) {
            super(1);
            this.f123841a = groupInviteViewModel;
            this.f123842b = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$d$a */
        public static final class C54011a implements AbstractC19479b<C19638h> {

            /* renamed from: a */
            final /* synthetic */ String f123843a;

            /* renamed from: b */
            final /* synthetic */ C54010d f123844b;

            /* renamed from: c */
            final /* synthetic */ GroupInviteState f123845c;

            static {
                Covode.recordClassIndex(63684);
            }

            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final void mo27860a(C19672u uVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final /* synthetic */ void mo27861a(C19638h hVar) {
                ChatRoomActivity.C54401a.m99731a(C56245a.C56247b.m102212a(this.f123844b.f123842b, 3, this.f123843a).mo93271b("invite_card").f128281a);
            }

            C54011a(String str, C54010d dVar, GroupInviteState groupInviteState) {
                this.f123843a = str;
                this.f123844b = dVar;
                this.f123845c = groupInviteState;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(GroupInviteState groupInviteState) {
            String conversationId;
            long j;
            GroupInviteState groupInviteState2 = groupInviteState;
            C89219l.m154721d(groupInviteState2, "");
            C55371a group = groupInviteState2.getGroup();
            if (!(group == null || (conversationId = group.getConversationId()) == null)) {
                AbstractC17420a a = AbstractC17420a.C17421a.m32276a();
                String conversationShortId = groupInviteState2.getGroup().getConversationShortId();
                if (conversationShortId != null) {
                    j = Long.parseLong(conversationShortId);
                } else {
                    j = 0;
                }
                a.mo27724a(conversationId, j, C19489e.AbstractC19490a.f46181b, new C54011a(conversationId, this, groupInviteState2));
            }
            this.f123841a.mo91138b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$c */
    public static final class C54009c extends AbstractC89220m implements AbstractC89172b<GroupInviteState, GroupInviteState> {

        /* renamed from: a */
        public static final C54009c f123840a = new C54009c();

        static {
            Covode.recordClassIndex(63682);
        }

        C54009c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ GroupInviteState invoke(GroupInviteState groupInviteState) {
            GroupInviteState groupInviteState2 = groupInviteState;
            C89219l.m154721d(groupInviteState2, "");
            return GroupInviteState.copy$default(groupInviteState2, null, null, null, true, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$b */
    static final class C54008b extends AbstractC89220m implements AbstractC89172b<GroupInviteState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f123838a;

        /* renamed from: b */
        final /* synthetic */ String f123839b;

        static {
            Covode.recordClassIndex(63681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54008b(String str, String str2) {
            super(1);
            this.f123838a = str;
            this.f123839b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(GroupInviteState groupInviteState) {
            String conversationId;
            GroupInviteState groupInviteState2 = groupInviteState;
            String str = "";
            C89219l.m154721d(groupInviteState2, str);
            HashMap hashMap = new HashMap();
            hashMap.put("from_type", this.f123838a);
            hashMap.put("result", this.f123839b);
            C55371a group = groupInviteState2.getGroup();
            if (!(group == null || (conversationId = group.getConversationId()) == null)) {
                str = conversationId;
            }
            hashMap.put("conversation_id", str);
            C39162r.m79460a("click_share_pop", hashMap);
            return C89391z.f203057a;
        }
    }

    public GroupInviteViewModel(String str, C55371a aVar) {
        this.f123837c = str;
        this.f123836a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$f */
    static final class C54013f extends AbstractC89220m implements AbstractC89183m<GroupInviteState, AbstractC20362a<? extends AcceptInviteCardResponse>, GroupInviteState> {

        /* renamed from: a */
        public static final C54013f f123847a = new C54013f();

        static {
            Covode.recordClassIndex(63686);
        }

        C54013f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ GroupInviteState invoke(GroupInviteState groupInviteState, AbstractC20362a<? extends AcceptInviteCardResponse> aVar) {
            GroupInviteState groupInviteState2 = groupInviteState;
            AbstractC20362a<? extends AcceptInviteCardResponse> aVar2 = aVar;
            C89219l.m154721d(groupInviteState2, "");
            C89219l.m154721d(aVar2, "");
            return GroupInviteState.copy$default(groupInviteState2, null, null, aVar2, false, 11, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$e */
    public static final class C54012e extends AbstractC89220m implements AbstractC89183m<GroupInviteState, AbstractC20362a<? extends InviteCardDetailInnerResponse>, GroupInviteState> {

        /* renamed from: a */
        final /* synthetic */ GroupInviteViewModel f123846a;

        static {
            Covode.recordClassIndex(63685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54012e(GroupInviteViewModel groupInviteViewModel) {
            super(2);
            this.f123846a = groupInviteViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ GroupInviteState invoke(GroupInviteState groupInviteState, AbstractC20362a<? extends InviteCardDetailInnerResponse> aVar) {
            C55371a aVar2;
            T t;
            GroupInviteState groupInviteState2 = groupInviteState;
            AbstractC20362a<? extends InviteCardDetailInnerResponse> aVar3 = aVar;
            C89219l.m154721d(groupInviteState2, "");
            C89219l.m154721d(aVar3, "");
            C20372aj ajVar = null;
            if (aVar3 instanceof C20372aj) {
                ajVar = aVar3;
            }
            C20372aj ajVar2 = ajVar;
            if (ajVar2 == null || (t = ajVar2.f48256a) == null || (aVar2 = t.getGroup()) == null) {
                aVar2 = this.f123846a.f123836a;
            }
            return GroupInviteState.copy$default(groupInviteState2, aVar2, aVar3, null, false, 12, null);
        }
    }

    /* renamed from: a */
    public final void mo91137a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        mo33687b_(new C54008b(str2, str));
    }
}
