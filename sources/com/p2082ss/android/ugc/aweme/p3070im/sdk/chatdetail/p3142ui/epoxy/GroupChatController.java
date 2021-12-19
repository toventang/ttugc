package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.epoxy;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AbstractC1944n;
import com.airbnb.epoxy.AbstractC1956s;
import com.airbnb.epoxy.C1943m;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.proto.AckConversationApplyRequestBody;
import com.bytedance.p1399im.core.proto.ApplyStatusCode;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.core.proto.UpdateConversationAuditSwitchRequestBody;
import com.bytedance.p1399im.p1400a.p1401a.C19464a;
import com.bytedance.p1399im.p1400a.p1401a.p1402a.C19467a;
import com.bytedance.p1399im.p1400a.p1401a.p1402a.C19470d;
import com.bytedance.p1399im.p1400a.p1401a.p1402a.C19472f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54606a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54610b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54613e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a.C54619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54702e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54711g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54714i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54717k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54725n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54728p;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54731r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54734t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54738v;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55064c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController */
public final class GroupChatController extends Typed2EpoxyController<AbstractC17427b, C54610b> {
    public static final C54740a Companion = new C54740a((byte) 0);
    public C54734t addMemberModel;
    public C54738v approveModel;
    public final Context context;
    public C54734t dividerOne;
    public C54734t dividerThree;
    public C54734t dividerTwo;
    public C54731r endGroupModel;
    public C54714i groupMemberHeader;
    public C54728p groupMemberSeeMore;
    public C54711g groupTitleModel;
    public C54717k inviteModel;
    public C54731r leaveGroupModel;
    public C54738v muteModel;
    public C54738v pinModel;
    public C54717k reportModel;
    public C54731r reportSensitiveModel;
    public C54728p requestSeeMore;
    public final GroupChatDetailViewModel viewModel;

    static {
        Covode.recordClassIndex(64456);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$a */
    public static final class C54740a {
        static {
            Covode.recordClassIndex(64457);
        }

        private C54740a() {
        }

        public /* synthetic */ C54740a(byte b) {
            this();
        }
    }

    public final C54734t getAddMemberModel() {
        C54734t tVar = this.addMemberModel;
        if (tVar == null) {
            C89219l.m154710a("addMemberModel");
        }
        return tVar;
    }

    public final C54738v getApproveModel() {
        C54738v vVar = this.approveModel;
        if (vVar == null) {
            C89219l.m154710a("approveModel");
        }
        return vVar;
    }

    public final C54734t getDividerOne() {
        C54734t tVar = this.dividerOne;
        if (tVar == null) {
            C89219l.m154710a("dividerOne");
        }
        return tVar;
    }

    public final C54734t getDividerThree() {
        C54734t tVar = this.dividerThree;
        if (tVar == null) {
            C89219l.m154710a("dividerThree");
        }
        return tVar;
    }

    public final C54734t getDividerTwo() {
        C54734t tVar = this.dividerTwo;
        if (tVar == null) {
            C89219l.m154710a("dividerTwo");
        }
        return tVar;
    }

    public final C54731r getEndGroupModel() {
        C54731r rVar = this.endGroupModel;
        if (rVar == null) {
            C89219l.m154710a("endGroupModel");
        }
        return rVar;
    }

    public final C54714i getGroupMemberHeader() {
        C54714i iVar = this.groupMemberHeader;
        if (iVar == null) {
            C89219l.m154710a("groupMemberHeader");
        }
        return iVar;
    }

    public final C54728p getGroupMemberSeeMore() {
        C54728p pVar = this.groupMemberSeeMore;
        if (pVar == null) {
            C89219l.m154710a("groupMemberSeeMore");
        }
        return pVar;
    }

    public final C54711g getGroupTitleModel() {
        C54711g gVar = this.groupTitleModel;
        if (gVar == null) {
            C89219l.m154710a("groupTitleModel");
        }
        return gVar;
    }

    public final C54717k getInviteModel() {
        C54717k kVar = this.inviteModel;
        if (kVar == null) {
            C89219l.m154710a("inviteModel");
        }
        return kVar;
    }

    public final C54731r getLeaveGroupModel() {
        C54731r rVar = this.leaveGroupModel;
        if (rVar == null) {
            C89219l.m154710a("leaveGroupModel");
        }
        return rVar;
    }

    public final C54738v getMuteModel() {
        C54738v vVar = this.muteModel;
        if (vVar == null) {
            C89219l.m154710a("muteModel");
        }
        return vVar;
    }

    public final C54738v getPinModel() {
        C54738v vVar = this.pinModel;
        if (vVar == null) {
            C89219l.m154710a("pinModel");
        }
        return vVar;
    }

    public final C54717k getReportModel() {
        C54717k kVar = this.reportModel;
        if (kVar == null) {
            C89219l.m154710a("reportModel");
        }
        return kVar;
    }

    public final C54731r getReportSensitiveModel() {
        C54731r rVar = this.reportSensitiveModel;
        if (rVar == null) {
            C89219l.m154710a("reportSensitiveModel");
        }
        return rVar;
    }

    public final C54728p getRequestSeeMore() {
        C54728p pVar = this.requestSeeMore;
        if (pVar == null) {
            C89219l.m154710a("requestSeeMore");
        }
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$b */
    public static final class C54741b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54006a f125479a;

        /* renamed from: b */
        final /* synthetic */ GroupChatController f125480b;

        /* renamed from: c */
        final /* synthetic */ C54610b f125481c;

        static {
            Covode.recordClassIndex(64458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54741b(C54006a aVar, GroupChatController groupChatController, C54610b bVar) {
            super(0);
            this.f125479a = aVar;
            this.f125480b = groupChatController;
            this.f125481c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125480b.viewModel;
            C54006a aVar = this.f125479a;
            C89219l.m154721d(aVar, "");
            groupChatDetailViewModel.mo91837b(new GroupChatDetailViewModel.C54766af(aVar));
            C54603a.m100105a("click_member_setting", new C89378p[0]);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$d */
    public static final class C54743d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54606a f125485a;

        /* renamed from: b */
        final /* synthetic */ GroupChatController f125486b;

        /* renamed from: c */
        final /* synthetic */ C54610b f125487c;

        static {
            Covode.recordClassIndex(64460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54743d(C54606a aVar, GroupChatController groupChatController, C54610b bVar) {
            super(0);
            this.f125485a = aVar;
            this.f125486b = groupChatController;
            this.f125487c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125486b.viewModel;
            Long.valueOf(this.f125485a.f125162e);
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", groupChatDetailViewModel.f125507d);
            C39162r.m79460a("show_group_request", hashMap);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$r */
    public static final class C54757r extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125502a;

        static {
            Covode.recordClassIndex(64474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54757r(GroupChatController groupChatController) {
            super(0);
            this.f125502a = groupChatController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125502a.viewModel;
            String str = groupChatDetailViewModel.f125507d;
            C89219l.m154721d(str, "");
            C19638h c = AbstractC17427b.C17428a.m32308a(str).mo27749c();
            if (c != null && c.getMemberCount() >= C55080c.m100733d(c)) {
                groupChatDetailViewModel.mo91837b(new GroupChatDetailViewModel.C54787d(groupChatDetailViewModel));
            } else {
                groupChatDetailViewModel.mo91837b(GroupChatDetailViewModel.C54788e.f125550a);
            }
            C54603a.m100105a("click_add_member", new C89378p[0]);
            return C89391z.f203057a;
        }
    }

    public final void setAddMemberModel(C54734t tVar) {
        C89219l.m154721d(tVar, "");
        this.addMemberModel = tVar;
    }

    public final void setApproveModel(C54738v vVar) {
        C89219l.m154721d(vVar, "");
        this.approveModel = vVar;
    }

    public final void setDividerOne(C54734t tVar) {
        C89219l.m154721d(tVar, "");
        this.dividerOne = tVar;
    }

    public final void setDividerThree(C54734t tVar) {
        C89219l.m154721d(tVar, "");
        this.dividerThree = tVar;
    }

    public final void setDividerTwo(C54734t tVar) {
        C89219l.m154721d(tVar, "");
        this.dividerTwo = tVar;
    }

    public final void setEndGroupModel(C54731r rVar) {
        C89219l.m154721d(rVar, "");
        this.endGroupModel = rVar;
    }

    public final void setGroupMemberHeader(C54714i iVar) {
        C89219l.m154721d(iVar, "");
        this.groupMemberHeader = iVar;
    }

    public final void setGroupMemberSeeMore(C54728p pVar) {
        C89219l.m154721d(pVar, "");
        this.groupMemberSeeMore = pVar;
    }

    public final void setGroupTitleModel(C54711g gVar) {
        C89219l.m154721d(gVar, "");
        this.groupTitleModel = gVar;
    }

    public final void setInviteModel(C54717k kVar) {
        C89219l.m154721d(kVar, "");
        this.inviteModel = kVar;
    }

    public final void setLeaveGroupModel(C54731r rVar) {
        C89219l.m154721d(rVar, "");
        this.leaveGroupModel = rVar;
    }

    public final void setMuteModel(C54738v vVar) {
        C89219l.m154721d(vVar, "");
        this.muteModel = vVar;
    }

    public final void setPinModel(C54738v vVar) {
        C89219l.m154721d(vVar, "");
        this.pinModel = vVar;
    }

    public final void setReportModel(C54717k kVar) {
        C89219l.m154721d(kVar, "");
        this.reportModel = kVar;
    }

    public final void setReportSensitiveModel(C54731r rVar) {
        C89219l.m154721d(rVar, "");
        this.reportSensitiveModel = rVar;
    }

    public final void setRequestSeeMore(C54728p pVar) {
        C89219l.m154721d(pVar, "");
        this.requestSeeMore = pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$g */
    public static final class View$OnClickListenerC54746g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125491a;

        static {
            Covode.recordClassIndex(64463);
        }

        View$OnClickListenerC54746g(GroupChatController groupChatController) {
            this.f125491a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125491a.viewModel.mo91834a(GroupChatDetailViewModel.C54759aa.f125512a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$i */
    public static final class View$OnClickListenerC54748i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125493a;

        static {
            Covode.recordClassIndex(64465);
        }

        View$OnClickListenerC54748i(GroupChatController groupChatController) {
            this.f125493a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125493a.viewModel.mo91842f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$j */
    public static final class View$OnClickListenerC54749j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125494a;

        static {
            Covode.recordClassIndex(64466);
        }

        View$OnClickListenerC54749j(GroupChatController groupChatController) {
            this.f125494a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125494a.viewModel.mo91841e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$n */
    public static final class View$OnClickListenerC54753n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125498a;

        static {
            Covode.recordClassIndex(64470);
        }

        View$OnClickListenerC54753n(GroupChatController groupChatController) {
            this.f125498a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125498a.viewModel.mo91842f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$o */
    public static final class View$OnClickListenerC54754o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125499a;

        static {
            Covode.recordClassIndex(64471);
        }

        View$OnClickListenerC54754o(GroupChatController groupChatController) {
            this.f125499a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125499a.viewModel.mo91841e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$f */
    public static final class View$OnClickListenerC54745f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125490a;

        static {
            Covode.recordClassIndex(64462);
        }

        View$OnClickListenerC54745f(GroupChatController groupChatController) {
            this.f125490a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C54619b.C54620a.m100131a(this.f125490a.viewModel.f125507d, null);
            C54603a.m100109b("group_setting");
            C54603a.m100114d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$h */
    public static final class View$OnClickListenerC54747h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125492a;

        static {
            Covode.recordClassIndex(64464);
        }

        View$OnClickListenerC54747h(GroupChatController groupChatController) {
            this.f125492a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity a = C69124b.m122223a(this.f125492a.context);
            if (a != null) {
                this.f125492a.viewModel.mo91832a(a);
                C54603a.m100104a("group_chat_setting", "", "im");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$m */
    public static final class View$OnClickListenerC54752m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125497a;

        static {
            Covode.recordClassIndex(64469);
        }

        View$OnClickListenerC54752m(GroupChatController groupChatController) {
            this.f125497a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity a = C69124b.m122223a(this.f125497a.context);
            if (a != null) {
                this.f125497a.viewModel.mo91832a(a);
                C54603a.m100104a("group_chat_setting", "", "im");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$q */
    public static final class C54756q extends AbstractC89220m implements AbstractC89172b<IMUser, C89391z> {

        /* renamed from: a */
        public static final C54756q f125501a = new C54756q();

        static {
            Covode.recordClassIndex(64473);
        }

        C54756q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            if (iMUser2 != null) {
                C54881c.m100492a(iMUser2.getUid(), "chat_request");
                C53615d.m98863a(iMUser2.getUid(), "chat_request", null);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$e */
    public static final class View$OnClickListenerC54744e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125488a;

        /* renamed from: b */
        final /* synthetic */ C54610b f125489b;

        static {
            Covode.recordClassIndex(64461);
        }

        View$OnClickListenerC54744e(GroupChatController groupChatController, C54610b bVar) {
            this.f125488a = groupChatController;
            this.f125489b = bVar;
        }

        public final void onClick(View view) {
            int i;
            List<C54606a> list;
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125488a.viewModel;
            C54613e eVar = this.f125489b.f125178g;
            if (eVar == null || (list = eVar.f125196a) == null) {
                i = 0;
            } else {
                i = list.size();
            }
            if (i < groupChatDetailViewModel.f125504a.f125196a.size()) {
                groupChatDetailViewModel.mo91834a(new GroupChatDetailViewModel.C54760ab(groupChatDetailViewModel));
                return;
            }
            C19464a a = C19464a.m36302a();
            long a2 = groupChatDetailViewModel.mo91831a();
            GroupChatDetailViewModel.C54761ac acVar = new GroupChatDetailViewModel.C54761ac(groupChatDetailViewModel);
            boolean z = C19483d.m36365a().mo31141b().f46235aQ;
            C19512f.m36450a("imsdk", "loadMoreAuditList", (Throwable) null);
            new C19470d(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: INVOKE  
                  (wrap: com.bytedance.im.a.a.a.d : 0x0050: CONSTRUCTOR  (r4v1 com.bytedance.im.a.a.a.d) = 
                  (wrap: com.bytedance.im.a.a.a$2 : 0x004d: CONSTRUCTOR  (r0v9 com.bytedance.im.a.a.a$2) = 
                  (r3v0 'a' com.bytedance.im.a.a.a)
                  (r2v0 'acVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac)
                 call: com.bytedance.im.a.a.a.2.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                 call: com.bytedance.im.a.a.a.d.<init>(com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                  (wrap: long : 0x0053: IGET  (r5v1 long) = (r3v0 'a' com.bytedance.im.a.a.a) com.bytedance.im.a.a.a.c long)
                  (r7v0 'a2' long)
                  (r9v0 'z' boolean)
                 type: VIRTUAL call: com.bytedance.im.a.a.a.d.a(long, long, boolean):void in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController.e.onClick(android.view.View):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: CONSTRUCTOR  (r4v1 com.bytedance.im.a.a.a.d) = 
                  (wrap: com.bytedance.im.a.a.a$2 : 0x004d: CONSTRUCTOR  (r0v9 com.bytedance.im.a.a.a$2) = 
                  (r3v0 'a' com.bytedance.im.a.a.a)
                  (r2v0 'acVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac)
                 call: com.bytedance.im.a.a.a.2.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                 call: com.bytedance.im.a.a.a.d.<init>(com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController.e.onClick(android.view.View):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 18 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: CONSTRUCTOR  (r0v9 com.bytedance.im.a.a.a$2) = 
                  (r3v0 'a' com.bytedance.im.a.a.a)
                  (r2v0 'acVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac)
                 call: com.bytedance.im.a.a.a.2.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController.e.onClick(android.view.View):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 24 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.a.a.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 30 more
                */
            /*
                this = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r11)
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController r0 = r10.f125488a
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel r5 = r0.viewModel
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b r0 = r10.f125489b
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e r0 = r0.f125178g
                r4 = 0
                if (r0 == 0) goto L_0x0029
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a> r0 = r0.f125196a
                if (r0 == 0) goto L_0x0029
                int r1 = r0.size()
            L_0x0016:
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e r0 = r5.f125504a
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a> r0 = r0.f125196a
                int r0 = r0.size()
                if (r1 >= r0) goto L_0x002b
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ab r0 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ab
                r0.<init>(r5)
                r5.mo91834a(r0)
                return
            L_0x0029:
                r1 = 0
                goto L_0x0016
            L_0x002b:
                com.bytedance.im.a.a.a r3 = com.bytedance.p1399im.p1400a.p1401a.C19464a.m36302a()
                long r7 = r5.mo91831a()
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac r2 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac
                r2.<init>(r5)
                com.bytedance.im.core.a.d r0 = com.bytedance.p1399im.core.p1404a.C19483d.m36365a()
                com.bytedance.im.core.a.f r0 = r0.mo31141b()
                boolean r9 = r0.f46235aQ
                java.lang.String r1 = "imsdk"
                java.lang.String r0 = "loadMoreAuditList"
                com.bytedance.p1399im.core.p1407c.C19512f.m36450a(r1, r0, r4)
                com.bytedance.im.a.a.a.d r4 = new com.bytedance.im.a.a.a.d
                com.bytedance.im.a.a.a$2 r0 = new com.bytedance.im.a.a.a$2
                r0.<init>(r2)
                r4.<init>(r0)
                long r5 = r3.f46130c
                r4.mo31131a(r5, r7, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.epoxy.GroupChatController.View$OnClickListenerC54744e.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$k */
    public static final class View$OnClickListenerC54750k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125495a;

        static {
            Covode.recordClassIndex(64467);
        }

        View$OnClickListenerC54750k(GroupChatController groupChatController) {
            this.f125495a = groupChatController;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125495a.viewModel;
            groupChatDetailViewModel.mo91845i();
            C54610b value = groupChatDetailViewModel.mo91836b().getValue();
            if (value == null || !value.f125173b) {
                z = false;
            } else {
                z = true;
            }
            groupChatDetailViewModel.mo91834a(new GroupChatDetailViewModel.C54779ao(z));
            C89378p[] pVarArr = new C89378p[1];
            if (z) {
                str = "off";
            } else {
                str = "on";
            }
            pVarArr[0] = C89387v.m154943a(str, "status");
            C54603a.m100105a("mute_messages", pVarArr);
            AbstractC17427b bVar = groupChatDetailViewModel.f125508e;
            bVar.mo27748b(!z, new GroupChatDetailViewModel.C54776an(bVar, groupChatDetailViewModel, z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$l */
    public static final class View$OnClickListenerC54751l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125496a;

        static {
            Covode.recordClassIndex(64468);
        }

        View$OnClickListenerC54751l(GroupChatController groupChatController) {
            this.f125496a = groupChatController;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125496a.viewModel;
            groupChatDetailViewModel.mo91845i();
            C54610b value = groupChatDetailViewModel.mo91836b().getValue();
            if (value == null || !value.f125174c) {
                z = false;
            } else {
                z = true;
            }
            groupChatDetailViewModel.mo91834a(new GroupChatDetailViewModel.C54783aq(z));
            C89378p[] pVarArr = new C89378p[1];
            if (z) {
                str = "off";
            } else {
                str = "on";
            }
            pVarArr[0] = C89387v.m154943a(str, "status");
            C54603a.m100105a("pin_to_top", pVarArr);
            AbstractC17427b bVar = groupChatDetailViewModel.f125508e;
            bVar.mo27742a(!z, new GroupChatDetailViewModel.C54780ap(bVar, groupChatDetailViewModel, z));
        }
    }

    public final void scrollToRequestInfoModel(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        for (AbstractC1956s<?> sVar : getAdapter().f5822f.f5778f) {
            if (sVar.f5838a == 15587) {
                Integer valueOf = Integer.valueOf(getAdapter().mo5713a(sVar));
                if (!(valueOf.intValue() == -1 || valueOf == null)) {
                    int intValue = valueOf.intValue();
                    RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.mo4354a(recyclerView, (RecyclerView.C1378s) null, intValue);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$c */
    public static final class C54742c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54606a f125482a;

        /* renamed from: b */
        final /* synthetic */ GroupChatController f125483b;

        /* renamed from: c */
        final /* synthetic */ C54610b f125484c;

        static {
            Covode.recordClassIndex(64459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54742c(C54606a aVar, GroupChatController groupChatController, C54610b bVar) {
            super(1);
            this.f125482a = aVar;
            this.f125483b = groupChatController;
            this.f125484c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            String obj;
            ApplyStatusCode applyStatusCode;
            String str;
            Boolean bool2 = bool;
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125483b.viewModel;
            C54606a aVar = this.f125482a;
            C89219l.m154716b(bool2, "");
            boolean booleanValue = bool2.booleanValue();
            C89219l.m154721d(aVar, "");
            C55357e.C55358a.m101168a();
            long j = aVar.f125162e;
            Map<String, String> map = aVar.f125168k;
            if (map == null) {
                map = C89041ag.m154415a();
            }
            GroupChatDetailViewModel.C54815v vVar = new GroupChatDetailViewModel.C54815v(groupChatDetailViewModel, aVar);
            C89219l.m154721d(map, "");
            C89219l.m154721d(vVar, "");
            C19464a.m36302a();
            C19467a aVar2 = new C19467a(vVar);
            StringBuilder append = new StringBuilder("ACKConversationApplyHandler, applyId = ").append(j).append(" &status = ").append(booleanValue).append(" &bizExt = ");
            if (map == null) {
                obj = null;
            } else {
                obj = map.toString();
            }
            C19512f.m36450a("imsdk", append.append(obj).toString(), (Throwable) null);
            AckConversationApplyRequestBody.Builder apply_id = new AckConversationApplyRequestBody.Builder().apply_id(Long.valueOf(j));
            if (booleanValue) {
                applyStatusCode = ApplyStatusCode.AGREE;
            } else {
                applyStatusCode = ApplyStatusCode.DENY;
            }
            AckConversationApplyRequestBody.Builder apply_status = apply_id.apply_status(applyStatusCode);
            if (map != null && !map.isEmpty()) {
                apply_status.bizExt(map);
            }
            aVar2.mo31798a(0, new RequestBody.Builder().addExtension(2025, AckConversationApplyRequestBody.ADAPTER, apply_status.build()).build(), null, new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", groupChatDetailViewModel.f125507d);
            if (booleanValue) {
                str = "accept";
            } else {
                str = "delete";
            }
            hashMap.put("result", str);
            C39162r.m79460a("handle_group_request", hashMap);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController$p */
    public static final class View$OnClickListenerC54755p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatController f125500a;

        static {
            Covode.recordClassIndex(64472);
        }

        View$OnClickListenerC54755p(GroupChatController groupChatController) {
            this.f125500a = groupChatController;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125500a.viewModel;
            groupChatDetailViewModel.mo91845i();
            C54610b value = groupChatDetailViewModel.mo91836b().getValue();
            if (value == null || !value.f125176e) {
                z = false;
            } else {
                z = true;
                if (groupChatDetailViewModel.mo91844h()) {
                    groupChatDetailViewModel.mo91837b(GroupChatDetailViewModel.C54771ak.f125527a);
                    return;
                }
            }
            groupChatDetailViewModel.mo91834a(new GroupChatDetailViewModel.C54772al(z));
            C89378p[] pVarArr = new C89378p[1];
            if (z) {
                str = "off";
            } else {
                str = "on";
            }
            pVarArr[0] = C89387v.m154943a(str, "status");
            C54603a.m100105a("approval_require_join", pVarArr);
            C19464a.m36302a();
            long a = groupChatDetailViewModel.mo91831a();
            int i = C19489e.AbstractC19490a.f46181b;
            boolean z2 = !z;
            C19472f fVar = new C19472f(new GroupChatDetailViewModel.C54773am(groupChatDetailViewModel, z));
            C19512f.m36450a("imsdk", "UpdateConversationAuditSwitchHandler, conversationShortId = " + a + " &conversationType = " + i + " &openAuditSwitch = " + z2, (Throwable) null);
            fVar.mo31798a(0, new RequestBody.Builder().addExtension(2023, UpdateConversationAuditSwitchRequestBody.ADAPTER, new UpdateConversationAuditSwitchRequestBody.Builder().conv_short_id(Long.valueOf(a)).conversation_type(Integer.valueOf(i)).switch_status(Boolean.valueOf(z2)).build()).build(), null, new Object[0]);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupChatController(GroupChatDetailViewModel groupChatDetailViewModel, Context context2) {
        super(C1943m.m6166a(), C1943m.m6166a());
        C89219l.m154721d(groupChatDetailViewModel, "");
        C89219l.m154721d(context2, "");
        this.viewModel = groupChatDetailViewModel;
        this.context = context2;
    }

    /* access modifiers changed from: protected */
    public final void buildModels(AbstractC17427b bVar, C54610b bVar2) {
        int i;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C19638h c = bVar.mo27749c();
        if (c != null) {
            i = c.getMemberCount();
        } else {
            i = 0;
        }
        boolean a = C55339a.m101152a(bVar2.f125177f);
        String str = this.viewModel.f125507d;
        C89219l.m154721d(str, "");
        C54603a.f125153c = str;
        C54603a.m100107a(a);
        C54711g gVar = this.groupTitleModel;
        if (gVar == null) {
            C89219l.m154710a("groupTitleModel");
        }
        gVar.mo91739a(bVar).mo91740a(bVar2).mo91741a(this.viewModel);
        if (C55064c.m100703a()) {
            C54717k kVar = this.inviteModel;
            if (kVar == null) {
                C89219l.m154710a("inviteModel");
            }
            kVar.mo91748d(R.string.c77).mo91746a((View.OnClickListener) new View$OnClickListenerC54745f(this));
        }
        if (!C56202c.m102111a()) {
            C54738v vVar = this.muteModel;
            if (vVar == null) {
                C89219l.m154710a("muteModel");
            }
            vVar.mo91781a(bVar2.f125173b).mo91783d(R.string.cfd).mo91780a((View.OnClickListener) new View$OnClickListenerC54750k(this));
            C54738v vVar2 = this.pinModel;
            if (vVar2 == null) {
                C89219l.m154710a("pinModel");
            }
            vVar2.mo91781a(bVar2.f125174c).mo91783d(R.string.chw).mo91780a((View.OnClickListener) new View$OnClickListenerC54751l(this));
        }
        if (C55052e.m100675f()) {
            C54731r rVar = this.reportSensitiveModel;
            if (rVar == null) {
                C89219l.m154710a("reportSensitiveModel");
            }
            rVar.mo91773d(R.string.fa_).mo91771a((View.OnClickListener) new View$OnClickListenerC54752m(this));
            C54731r rVar2 = this.leaveGroupModel;
            if (rVar2 == null) {
                C89219l.m154710a("leaveGroupModel");
            }
            rVar2.mo91773d(R.string.c5t).mo91774e(R.string.c5u).mo91771a((View.OnClickListener) new View$OnClickListenerC54753n(this));
            if (C55339a.m101152a(bVar2.f125177f)) {
                C54731r rVar3 = this.endGroupModel;
                if (rVar3 == null) {
                    C89219l.m154710a("endGroupModel");
                }
                rVar3.mo91773d(R.string.c5v).mo91774e(R.string.c5w).mo91771a((View.OnClickListener) new View$OnClickListenerC54754o(this));
            }
        }
        if (a) {
            C54738v vVar3 = this.approveModel;
            if (vVar3 == null) {
                C89219l.m154710a("approveModel");
            }
            vVar3.mo91781a(bVar2.f125176e).mo91783d(R.string.c5l).mo91780a((View.OnClickListener) new View$OnClickListenerC54755p(this));
        }
        C54613e eVar = bVar2.f125178g;
        if (eVar != null) {
            if ((!eVar.f125196a.isEmpty()) || eVar.f125197b) {
                C54734t tVar = this.dividerOne;
                if (tVar == null) {
                    C89219l.m154710a("dividerOne");
                }
                tVar.mo91778d(R.layout.a7y);
            }
            if (!eVar.f125196a.isEmpty()) {
                new C54714i().mo91743a(this.context.getString(R.string.c5o)).mo91744b(15587L).mo5787a((AbstractC1944n) this);
                for (T t : eVar.f125196a) {
                    new C54725n().mo91762b(t.f125162e).mo91759a((C54606a) t).mo91761a((AbstractC89172b<? super Boolean, C89391z>) new C54742c(t, this, bVar2)).mo91763b((AbstractC89172b<? super IMUser, C89391z>) C54756q.f125501a).mo91760a((AbstractC89171a<C89391z>) new C54743d(t, this, bVar2)).mo5787a((AbstractC1944n) this);
                }
            }
            if (eVar.f125197b) {
                C54728p pVar = this.requestSeeMore;
                if (pVar == null) {
                    C89219l.m154710a("requestSeeMore");
                }
                pVar.mo91767a(this.context.getString(R.string.c8l)).mo91766a((View.OnClickListener) new View$OnClickListenerC54744e(this, bVar2));
            }
        }
        C54734t tVar2 = this.dividerTwo;
        if (tVar2 == null) {
            C89219l.m154710a("dividerTwo");
        }
        tVar2.mo91778d(R.layout.a7y);
        C54714i iVar = this.groupMemberHeader;
        if (iVar == null) {
            C89219l.m154710a("groupMemberHeader");
        }
        iVar.mo91743a(this.context.getString(R.string.c8i, Integer.valueOf(i)));
        C54734t tVar3 = this.addMemberModel;
        if (tVar3 == null) {
            C89219l.m154710a("addMemberModel");
        }
        tVar3.mo91778d(R.layout.a7z).mo91776a((AbstractC89171a<C89391z>) new C54757r(this));
        int i2 = 0;
        for (T t2 : bVar2.f125177f) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            T t3 = t2;
            if (i2 < bVar2.f125172a) {
                new C54702e().mo91727b((CharSequence) t3.getUid()).mo91725a((C54006a) t3).mo91726a((AbstractC89171a<C89391z>) new C54741b(t3, this, bVar2)).mo5787a((AbstractC1944n) this);
            }
            i2 = i3;
        }
        if (bVar2.f125177f.size() > bVar2.f125172a) {
            C54728p pVar2 = this.groupMemberSeeMore;
            if (pVar2 == null) {
                C89219l.m154710a("groupMemberSeeMore");
            }
            pVar2.mo91767a(this.context.getString(R.string.c7_, Integer.valueOf(bVar2.f125177f.size() - bVar2.f125172a))).mo91766a((View.OnClickListener) new View$OnClickListenerC54746g(this));
        }
        if (!C55052e.m100675f()) {
            C54734t tVar4 = this.dividerThree;
            if (tVar4 == null) {
                C89219l.m154710a("dividerThree");
            }
            tVar4.mo91778d(R.layout.a7y);
            C54717k kVar2 = this.reportModel;
            if (kVar2 == null) {
                C89219l.m154710a("reportModel");
            }
            kVar2.mo91748d(R.string.fa_).mo91746a((View.OnClickListener) new View$OnClickListenerC54747h(this));
            C54731r rVar4 = this.leaveGroupModel;
            if (rVar4 == null) {
                C89219l.m154710a("leaveGroupModel");
            }
            rVar4.mo91773d(R.string.c5t).mo91774e(R.string.c5u).mo91771a((View.OnClickListener) new View$OnClickListenerC54748i(this));
            if (C55339a.m101152a(bVar2.f125177f)) {
                C54731r rVar5 = this.endGroupModel;
                if (rVar5 == null) {
                    C89219l.m154710a("endGroupModel");
                }
                rVar5.mo91773d(R.string.c5v).mo91774e(R.string.c5w).mo91771a((View.OnClickListener) new View$OnClickListenerC54749j(this));
            }
        }
    }
}
