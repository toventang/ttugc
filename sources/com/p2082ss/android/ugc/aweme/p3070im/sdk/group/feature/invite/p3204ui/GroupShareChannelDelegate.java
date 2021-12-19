package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.viewmodel.GroupSharePackage;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.viewmodel.GroupShareViewModel;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69576b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.GroupShareChannelDelegate */
public final class GroupShareChannelDelegate {

    /* renamed from: a */
    public final PowerList f126611a;

    static {
        Covode.recordClassIndex(65139);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.GroupShareChannelDelegate$ShareChannelCell */
    public static final class ShareChannelCell extends PowerCell<C55377a> {

        /* renamed from: a */
        final AbstractC89244h f126612a = C89250i.m154773a((AbstractC89171a) new C55376c(this));

        /* renamed from: b */
        final AbstractC89244h f126613b = C89250i.m154773a((AbstractC89171a) new C55375b(this));

        static {
            Covode.recordClassIndex(65140);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.GroupShareChannelDelegate$ShareChannelCell$c */
        static final class C55376c extends AbstractC89220m implements AbstractC89171a<GroupShareViewModel> {

            /* renamed from: a */
            final /* synthetic */ ShareChannelCell f126618a;

            static {
                Covode.recordClassIndex(65143);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55376c(ShareChannelCell shareChannelCell) {
                super(0);
                this.f126618a = shareChannelCell;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ GroupShareViewModel invoke() {
                return PowerCell.m32713b(this.f126618a, GroupShareViewModel.class);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.GroupShareChannelDelegate$ShareChannelCell$b */
        static final class C55375b extends AbstractC89220m implements AbstractC89171a<AbstractC69645h> {

            /* renamed from: a */
            final /* synthetic */ ShareChannelCell f126617a;

            static {
                Covode.recordClassIndex(65142);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55375b(ShareChannelCell shareChannelCell) {
                super(0);
                this.f126617a = shareChannelCell;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AbstractC69645h invoke() {
                GroupSharePackage groupSharePackage;
                C55377a aVar = (C55377a) this.f126617a.f42160d;
                if (aVar == null || (groupSharePackage = aVar.f126620b) == null) {
                    return null;
                }
                return groupSharePackage.mo87088a(aVar.f126619a);
            }
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        /* renamed from: a */
        public final View mo23349a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6q, viewGroup, false);
            C89219l.m154716b(a, "");
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.GroupShareChannelDelegate$ShareChannelCell$a */
        static final class View$OnClickListenerC55374a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC69581b f126614a;

            /* renamed from: b */
            final /* synthetic */ String f126615b;

            /* renamed from: c */
            final /* synthetic */ ShareChannelCell f126616c;

            static {
                Covode.recordClassIndex(65141);
            }

            View$OnClickListenerC55374a(AbstractC69581b bVar, String str, ShareChannelCell shareChannelCell) {
                this.f126614a = bVar;
                this.f126615b = str;
                this.f126616c = shareChannelCell;
            }

            public final void onClick(View view) {
                AbstractC69645h hVar;
                ClickAgent.onClick(view);
                if (!C69576b.m122788a(view, 1200) && (hVar = (AbstractC69645h) this.f126616c.f126613b.getValue()) != null) {
                    AbstractC69581b bVar = this.f126614a;
                    View view2 = this.f126616c.itemView;
                    C89219l.m154716b(view2, "");
                    Context context = view2.getContext();
                    C89219l.m154716b(context, "");
                    bVar.mo61913a(hVar, context);
                    GroupShareViewModel groupShareViewModel = (GroupShareViewModel) this.f126616c.f126612a.getValue();
                    if (groupShareViewModel != null) {
                        groupShareViewModel.mo92456b();
                    }
                    String str = this.f126615b;
                    C89219l.m154721d(str, "");
                    C39162r.m79462a("share_group_via", C89387v.m154943a(C54603a.f125153c, "conversation_id"), C89387v.m154943a(C54603a.f125152b, "previous_page"), C89387v.m154943a(Integer.valueOf(C54603a.f125154d), "is_master"), C89387v.m154943a(str, "platform"));
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
        @Override // com.bytedance.ies.powerlist.PowerCell
        /* renamed from: a */
        public final /* synthetic */ void mo23350a(C55377a aVar) {
            C55377a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            AbstractC69581b bVar = aVar2.f126619a;
            String b = bVar.mo109553b();
            View view = this.itemView;
            C89219l.m154716b(view, "");
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.dxh);
            C89219l.m154716b(remoteImageView, "");
            bVar.mo109556a(remoteImageView, false);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.dxi);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(b);
            this.itemView.setOnClickListener(new View$OnClickListenerC55374a(bVar, b, this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.GroupShareChannelDelegate$a */
    public static final class C55377a implements AbstractC17641a {

        /* renamed from: a */
        public final AbstractC69581b f126619a;

        /* renamed from: b */
        public final GroupSharePackage f126620b;

        static {
            Covode.recordClassIndex(65144);
        }

        @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
        /* renamed from: c */
        public final Object mo28111c(AbstractC17641a aVar) {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55377a)) {
                return false;
            }
            C55377a aVar = (C55377a) obj;
            return C89219l.m154714a(this.f126619a, aVar.f126619a) && C89219l.m154714a(this.f126620b, aVar.f126620b);
        }

        public final int hashCode() {
            AbstractC69581b bVar = this.f126619a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            GroupSharePackage groupSharePackage = this.f126620b;
            if (groupSharePackage != null) {
                i = groupSharePackage.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "ShareGroupItem(channel=" + this.f126619a + ", sharePackage=" + this.f126620b + ")";
        }

        @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
        /* renamed from: a */
        public final boolean mo28109a(AbstractC17641a aVar) {
            return aVar.equals(this);
        }

        @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
        /* renamed from: b */
        public final boolean mo28110b(AbstractC17641a aVar) {
            return aVar.equals(this);
        }

        public C55377a(AbstractC69581b bVar, GroupSharePackage groupSharePackage) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(groupSharePackage, "");
            this.f126619a = bVar;
            this.f126620b = groupSharePackage;
        }
    }

    public GroupShareChannelDelegate(PowerList powerList) {
        C89219l.m154721d(powerList, "");
        this.f126611a = powerList;
        powerList.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        powerList.setLayoutManager(linearLayoutManager);
        powerList.mo28083a(ShareChannelCell.class);
    }
}
