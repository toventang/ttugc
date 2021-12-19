package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55233v;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.GroupListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.GroupListCell */
public final class GroupListCell extends PowerCell<C55598c> {

    /* renamed from: a */
    final AbstractC89244h f126812a = C89250i.m154773a((AbstractC89171a) new C55578a(this));

    static {
        Covode.recordClassIndex(65351);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.GroupListCell$a */
    static final class C55578a extends AbstractC89220m implements AbstractC89171a<GroupListViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupListCell f126813a;

        static {
            Covode.recordClassIndex(65352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55578a(GroupListCell groupListCell) {
            super(0);
            this.f126813a = groupListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GroupListViewModel invoke() {
            return PowerCell.m32713b(this.f126813a, GroupListViewModel.class);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        this.itemView.setOnClickListener(new View$OnClickListenerC55579b(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a57, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.GroupListCell$b */
    static final class View$OnClickListenerC55579b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupListCell f126814a;

        static {
            Covode.recordClassIndex(65353);
        }

        View$OnClickListenerC55579b(GroupListCell groupListCell) {
            this.f126814a = groupListCell;
        }

        public final void onClick(View view) {
            C55598c cVar;
            IMConversation iMConversation;
            GroupListViewModel groupListViewModel;
            ClickAgent.onClick(view);
            if (this.f126814a.f42160d != null && (cVar = (C55598c) this.f126814a.f42160d) != null && (iMConversation = cVar.f126829a) != null && (groupListViewModel = (GroupListViewModel) this.f126814a.f126812a.getValue()) != null) {
                C89219l.m154721d(iMConversation, "");
                groupListViewModel.f126858c.setValue(iMConversation);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C55598c cVar) {
        C55598c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        View view = this.itemView;
        TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.acb);
        C89219l.m154716b(tuxCheckBox, "");
        tuxCheckBox.setVisibility(8);
        C34577e.m70592a((RemoteImageView) view.findViewById(R.id.on), cVar2.f126829a.getDisplayAvatar());
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.cpq);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(cVar2.f126829a.getDisplayName());
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.akb);
        C89219l.m154716b(tuxTextView2, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        tuxTextView2.setText(context.getResources().getQuantityString(R.plurals.cu, cVar2.f126829a.getConversationMemberCount(), Integer.valueOf(cVar2.f126829a.getConversationMemberCount())));
        C89219l.m154716b(view, "");
        C55233v.m101004a(view);
    }
}
