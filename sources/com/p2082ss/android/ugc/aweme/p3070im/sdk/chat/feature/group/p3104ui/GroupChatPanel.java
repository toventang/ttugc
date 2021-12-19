package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.p1400a.p1401a.C19464a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53732a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53770z;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53771a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54004b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC53999d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53982a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53998c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC53997b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.p3105a.C54063a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.view.C54072a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.view.GroupChatBlockedView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3130ui.ChatTopTip;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55337a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4589j.C88939d;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel */
public final class GroupChatPanel extends BaseChatPanel implements AbstractC33974au {

    /* renamed from: a */
    public final GroupChatViewModel f123889a;

    /* renamed from: u */
    private final C88411a f123890u = new C88411a();

    /* renamed from: v */
    private final C54004b f123891v;

    static {
        Covode.recordClassIndex(63721);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    public final void onDestroy() {
        super.onDestroy();
        this.f123890u.mo142944a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    /* renamed from: a */
    public final AbstractC54386c mo91153a() {
        C53709a aVar = this.f124648r;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.GroupSessionInfo");
        return new C54063a((C54004b) aVar, this.f124647q);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    public final void onCreate() {
        super.onCreate();
        ((ChatTopTip) this.f124647q.findViewById(R.id.a4b)).mo91440a(this.f123891v);
        C88934a.m154195a(C88939d.m154203a(this.f124644n.f125105b, null, null, new C54050a(this), 3), this.f123890u);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel$b */
    static final class C54051b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f123895a;

        /* renamed from: b */
        final /* synthetic */ C19638h f123896b;

        static {
            Covode.recordClassIndex(63725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54051b(GroupChatPanel groupChatPanel, C19638h hVar) {
            super(0);
            this.f123895a = groupChatPanel;
            this.f123896b = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            Map<String, String> ext;
            C19639i coreInfo = this.f123896b.getCoreInfo();
            if (coreInfo == null || (ext = coreInfo.getExt()) == null) {
                str = null;
            } else {
                str = ext.get("ban_status");
            }
            if (C89219l.m154714a((Object) str, (Object) "1")) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f123895a.f124633c, "aweme://webview");
                String a = SettingsManager.m29616a().mo25398a("community_guidelines_url", "https://www.tiktok.com/community-guidelines");
                C89219l.m154716b(a, "");
                buildRoute.withParam(Uri.parse(a)).open();
            } else {
                AbstractC17420a a2 = AbstractC17420a.C17421a.m32276a();
                String conversationId = this.f123896b.getConversationId();
                C89219l.m154716b(conversationId, "");
                a2.mo27732c(conversationId, new AbstractC19479b<String>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.GroupChatPanel.C54051b.C540521 */

                    /* renamed from: a */
                    final /* synthetic */ C54051b f123897a;

                    static {
                        Covode.recordClassIndex(63726);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f123897a = r1;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final /* synthetic */ void mo27861a(String str) {
                        C89219l.m154721d(str, "");
                    }

                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final void mo27860a(C19672u uVar) {
                        Integer num;
                        StringBuilder append = new StringBuilder("GroupChatNotMemberView deleteConversation ").append(this.f123897a.f123896b.getConversationId()).append(" fail ,");
                        String str = null;
                        if (uVar != null) {
                            num = Integer.valueOf(uVar.f46728a);
                        } else {
                            num = null;
                        }
                        StringBuilder append2 = append.append(num).append(", ");
                        if (uVar != null) {
                            str = uVar.f46730c;
                        }
                        C56244a.m102193e("GroupChatPanel", append2.append(str).toString());
                    }
                });
            }
            this.f123895a.f124635e.finish();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    /* renamed from: b */
    public final void mo91155b() {
        super.mo91155b();
        int i = C54062a.f123914a[this.f124642l.ordinal()];
        if (i == 1) {
            mo91486c().mo91245b(8);
            GroupChatBlockedView groupChatBlockedView = (GroupChatBlockedView) this.f124647q.findViewById(R.id.bc4);
            C89219l.m154716b(groupChatBlockedView, "");
            groupChatBlockedView.setVisibility(0);
        } else if (i == 2) {
            mo91486c().mo91245b(0);
            GroupChatBlockedView groupChatBlockedView2 = (GroupChatBlockedView) this.f124647q.findViewById(R.id.bc4);
            C89219l.m154716b(groupChatBlockedView2, "");
            groupChatBlockedView2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel$a */
    static final class C54050a extends AbstractC89220m implements AbstractC89172b<AbstractC53732a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f123894a;

        static {
            Covode.recordClassIndex(63724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54050a(GroupChatPanel groupChatPanel) {
            super(1);
            this.f123894a = groupChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC53732a aVar) {
            AbstractC53732a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2 instanceof C53770z) {
                GroupChatViewModel groupChatViewModel = this.f123894a.f123889a;
                C53770z zVar = (C53770z) aVar2;
                C19638h hVar = zVar.f123322a;
                int i = zVar.f123323b;
                C89219l.m154721d(hVar, "");
                groupChatViewModel.f123932b.setValue(hVar);
                if (i == 4) {
                    groupChatViewModel.f123934d.setValue(true);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    /* renamed from: a */
    public final void mo91154a(int i, int i2, Intent intent) {
        super.mo91154a(i, i2, intent);
        if (i == 16 && i2 == 2097) {
            this.f123889a.f123934d.setValue(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupChatPanel(AbstractC1204m mVar, View view, C54004b bVar, GroupChatViewModel groupChatViewModel) {
        super(mVar, view, bVar);
        Long valueOf;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(groupChatViewModel, "");
        this.f123891v = bVar;
        this.f123889a = groupChatViewModel;
        groupChatViewModel.f123934d.observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.GroupChatPanel.C540481 */

            /* renamed from: a */
            final /* synthetic */ GroupChatPanel f123892a;

            static {
                Covode.recordClassIndex(63722);
            }

            {
                this.f123892a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f123892a.f124635e.finish();
            }
        });
        groupChatViewModel.f123933c.observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.GroupChatPanel.C540492 */

            /* renamed from: a */
            final /* synthetic */ GroupChatPanel f123893a;

            static {
                Covode.recordClassIndex(63723);
            }

            {
                this.f123893a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                String str;
                String valueOf;
                C19638h value = this.f123893a.f123889a.f123932b.getValue();
                if (value != null) {
                    String str2 = "";
                    C89219l.m154716b(value, str2);
                    if (C89219l.m154714a(obj, (Object) false)) {
                        GroupChatPanel groupChatPanel = this.f123893a;
                        groupChatPanel.mo91483a(EnumC53771a.GroupBlocked);
                        GroupChatBlockedView groupChatBlockedView = (GroupChatBlockedView) groupChatPanel.f124647q.findViewById(R.id.bc4);
                        C89219l.m154716b(groupChatBlockedView, str2);
                        C54051b bVar = new C54051b(groupChatPanel, value);
                        C89219l.m154721d(groupChatBlockedView, str2);
                        C89219l.m154721d(bVar, str2);
                        TuxTextView tuxTextView = (TuxTextView) groupChatBlockedView.mo9603b(R.id.ev5);
                        tuxTextView.setVisibility(0);
                        tuxTextView.setText(str2);
                        TuxTextView tuxTextView2 = (TuxTextView) groupChatBlockedView.mo9603b(R.id.ery);
                        tuxTextView2.setText(tuxTextView2.getContext().getString(R.string.c5t));
                        if (value.getCoreInfo() == null) {
                            TuxTextView tuxTextView3 = (TuxTextView) groupChatBlockedView.mo9603b(R.id.ev5);
                            C89219l.m154716b(tuxTextView3, str2);
                            tuxTextView3.setVisibility(8);
                        } else if (value.isDissolved()) {
                            EnumC53997b bVar2 = EnumC53997b.AT_MOST_DB;
                            String conversationId = value.getConversationId();
                            C19639i coreInfo = value.getCoreInfo();
                            if (!(coreInfo == null || (valueOf = String.valueOf(coreInfo.getOwner())) == null)) {
                                str2 = valueOf;
                            }
                            C19639i coreInfo2 = value.getCoreInfo();
                            if (coreInfo2 != null) {
                                str = coreInfo2.getSecOwner();
                            } else {
                                str = null;
                            }
                            C53982a.m99198a(bVar2, new C53998c(conversationId, str2, str), new C54072a.C54073a(groupChatBlockedView));
                        } else if (!value.isMember()) {
                            TuxTextView tuxTextView4 = (TuxTextView) groupChatBlockedView.mo9603b(R.id.ev5);
                            C89219l.m154716b(tuxTextView4, str2);
                            tuxTextView4.setText(groupChatBlockedView.getContext().getString(R.string.c66));
                        } else {
                            C19639i coreInfo3 = value.getCoreInfo();
                            C89219l.m154716b(coreInfo3, str2);
                            if (C89219l.m154714a((Object) coreInfo3.getExt().get("ban_status"), (Object) "1")) {
                                C19639i coreInfo4 = value.getCoreInfo();
                                C89219l.m154716b(coreInfo4, str2);
                                String str3 = coreInfo4.getExt().get("ban_expiry");
                                if (str3 != null) {
                                    long parseLong = Long.parseLong(str3);
                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                    C89219l.m154721d(timeUnit, str2);
                                    String string = groupChatBlockedView.getContext().getString(R.string.c86, BDDateFormat.m23653a(C80187aa.C80188a.m139007b(), timeUnit.toMillis(parseLong)));
                                    C89219l.m154716b(string, str2);
                                    TuxTextView tuxTextView5 = (TuxTextView) groupChatBlockedView.mo9603b(R.id.ev5);
                                    C89219l.m154716b(tuxTextView5, str2);
                                    tuxTextView5.setText(string);
                                    TuxTextView tuxTextView6 = (TuxTextView) groupChatBlockedView.mo9603b(R.id.ery);
                                    C89219l.m154716b(tuxTextView6, str2);
                                    tuxTextView6.setText(groupChatBlockedView.getContext().getString(R.string.c87));
                                }
                            }
                        }
                        ((TuxTextView) groupChatBlockedView.mo9603b(R.id.ery)).setOnClickListener(new C54072a.View$OnClickListenerC54075b(bVar));
                    } else if (C89219l.m154714a(obj, (Object) true)) {
                        this.f123893a.mo91483a(EnumC53771a.Input);
                    }
                }
            }
        });
        C53982a.f123797d.mo91083a(bVar.getConversationId(), (AbstractC53999d) null);
        C19638h value = groupChatViewModel.f123932b.getValue();
        if (value != null && (valueOf = Long.valueOf(value.getConversationShortId())) != null) {
            valueOf.longValue();
            C19464a.m36302a();
            C19464a.m36303a(valueOf.longValue(), C19489e.AbstractC19490a.f46181b, new C55337a.C55338a(valueOf));
        }
    }
}
