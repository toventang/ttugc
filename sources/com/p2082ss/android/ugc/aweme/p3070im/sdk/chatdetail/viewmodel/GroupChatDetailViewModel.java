package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel;

import android.app.Activity;
import android.util.Pair;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.ApplyStatusCode;
import com.bytedance.p1399im.core.proto.ConversationApplyInfo;
import com.bytedance.p1399im.core.proto.GroupRole;
import com.p2082ss.android.ugc.aweme.friends.service.IFollowService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54005c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC53999d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC54000e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54606a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54610b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54611c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54612d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54613e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.BlockResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.C55244a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55337a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55340b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3200b.p3202b.C55370a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel */
public final class GroupChatDetailViewModel extends AbstractC1174ac {

    /* renamed from: f */
    public static final C54758a f125503f = new C54758a((byte) 0);

    /* renamed from: a */
    public C54613e f125504a = new C54613e((List) null, false, 7);

    /* renamed from: b */
    public String f125505b;

    /* renamed from: c */
    public final C54763ad f125506c;

    /* renamed from: d */
    public final String f125507d;

    /* renamed from: e */
    public final AbstractC17427b f125508e;

    /* renamed from: g */
    private final AbstractC89244h f125509g = C89250i.m154773a((AbstractC89171a) new C54800n(this));

    /* renamed from: h */
    private final AbstractC89244h f125510h = C89250i.m154773a((AbstractC89171a) new C54785b(this));

    /* renamed from: i */
    private final AbstractC89244h f125511i = C89250i.m154773a((AbstractC89171a) C54786c.f125548a);

    static {
        Covode.recordClassIndex(64476);
    }

    /* renamed from: a */
    public final long mo91831a() {
        return ((Number) this.f125509g.getValue()).longValue();
    }

    /* renamed from: b */
    public final C55244a<C54610b> mo91836b() {
        return (C55244a) this.f125510h.getValue();
    }

    /* renamed from: c */
    public final C1213t<C54005c<C54611c>> mo91838c() {
        return (C1213t) this.f125511i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$a */
    public static final class C54758a {
        static {
            Covode.recordClassIndex(64477);
        }

        private C54758a() {
        }

        public /* synthetic */ C54758a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$c */
    static final class C54786c extends AbstractC89220m implements AbstractC89171a<C1213t<C54005c<? extends C54611c>>> {

        /* renamed from: a */
        public static final C54786c f125548a = new C54786c();

        static {
            Covode.recordClassIndex(64505);
        }

        C54786c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C54005c<? extends C54611c>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: j */
    private final void m100379j() {
        mo91837b(C54770aj.f125526a);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$u */
    public static final class C54812u implements IFollowService.AbstractC51636a {

        /* renamed from: a */
        final /* synthetic */ IMUser f125574a;

        /* renamed from: b */
        final /* synthetic */ GroupChatDetailViewModel f125575b;

        static {
            Covode.recordClassIndex(64531);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.service.IFollowService.AbstractC51636a
        /* renamed from: a */
        public final void mo87343a(Exception exc) {
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.service.IFollowService.AbstractC51636a
        /* renamed from: a */
        public final void mo87342a() {
            this.f125575b.mo91839c(new AbstractC89172b<C54610b, C54610b>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.C54812u.C548131 */

                /* renamed from: a */
                final /* synthetic */ C54812u f125576a;

                static {
                    Covode.recordClassIndex(64532);
                }

                {
                    this.f125576a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0085  */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54610b invoke(com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54610b r18) {
                    /*
                    // Method dump skipped, instructions count: 146
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.C54812u.C548131.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }

        public C54812u(IMUser iMUser, GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125574a = iMUser;
            this.f125575b = groupChatDetailViewModel;
        }
    }

    /* renamed from: e */
    public final void mo91841e() {
        mo91837b(C54801o.f125563a);
        C54603a.m100105a("click_end_group", new C89378p[0]);
    }

    /* renamed from: g */
    public final void mo91843g() {
        this.f125508e.mo27736a(new C54794j(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ai */
    public static final class C54769ai extends AbstractC89220m implements AbstractC89171a<C54610b> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125524a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f125525b;

        static {
            Covode.recordClassIndex(64488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54769ai(GroupChatDetailViewModel groupChatDetailViewModel, AbstractC89172b bVar) {
            super(0);
            this.f125524a = groupChatDetailViewModel;
            this.f125525b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C54610b invoke() {
            AbstractC89172b bVar = this.f125525b;
            C54610b value = this.f125524a.mo91836b().getValue();
            if (value == null) {
                value = new C54610b(0, false, false, (C54612d) null, false, (List) null, 127);
            }
            return bVar.invoke(value);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$n */
    static final class C54800n extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125562a;

        static {
            Covode.recordClassIndex(64519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54800n(GroupChatDetailViewModel groupChatDetailViewModel) {
            super(0);
            this.f125562a = groupChatDetailViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j;
            C19638h c = this.f125562a.f125508e.mo27749c();
            if (c != null) {
                j = c.getConversationShortId();
            } else {
                j = 0;
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: h */
    public final boolean mo91844h() {
        C54613e eVar;
        C54610b value = mo91836b().getValue();
        if (value == null || (eVar = value.f125178g) == null || (!eVar.f125197b && !C17453a.m32408a(eVar.f125196a))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo91845i() {
        C54612d dVar;
        C54610b value = mo91836b().getValue();
        if (value != null && (dVar = value.f125175d) != null && dVar.f125194c) {
            mo91834a(C54811t.f125573a);
        }
    }

    /* renamed from: d */
    public final void mo91840d() {
        String str = this.f125505b;
        mo91845i();
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        if (C89361p.m154910b((CharSequence) str).toString().length() == 0) {
            mo91834a(C54802p.f125564a);
            return;
        }
        mo91834a(C54803q.f125565a);
        AbstractC17427b bVar = this.f125508e;
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        bVar.mo27738a(C89361p.m154910b((CharSequence) str).toString(), new C54804r(this));
    }

    /* renamed from: f */
    public final void mo91842f() {
        C54610b value = mo91836b().getValue();
        if (value != null) {
            C54603a.m100105a("click_leave_group", new C89378p[0]);
            if (!C55339a.m101152a(value.f125177f) || value.f125177f.size() <= 1) {
                m100379j();
            } else if (mo91844h()) {
                mo91837b(C54820y.f125585a);
            } else {
                mo91837b(C54821z.f125586a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$b */
    static final class C54785b extends AbstractC89220m implements AbstractC89171a<C55244a<C54610b>> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125547a;

        static {
            Covode.recordClassIndex(64504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54785b(GroupChatDetailViewModel groupChatDetailViewModel) {
            super(0);
            this.f125547a = groupChatDetailViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55244a<C54610b> invoke() {
            boolean z;
            boolean z2;
            boolean z3;
            String str;
            C19639i coreInfo;
            C1213t tVar = new C1213t();
            C19638h c = this.f125547a.f125508e.mo27749c();
            if (c == null || !c.isMute()) {
                z = false;
            } else {
                z = true;
            }
            C19638h c2 = this.f125547a.f125508e.mo27749c();
            if (c2 == null || !c2.isStickTop()) {
                z2 = false;
            } else {
                z2 = true;
            }
            Boolean a = C55337a.m101143a(this.f125547a.mo91831a());
            if (a != null) {
                z3 = a.booleanValue();
            } else {
                z3 = true;
            }
            C19638h c3 = this.f125547a.f125508e.mo27749c();
            if (c3 == null || (coreInfo = c3.getCoreInfo()) == null) {
                str = null;
            } else {
                str = coreInfo.getName();
            }
            if (str == null) {
                str = "";
            }
            tVar.setValue(new C54610b(0, z, z2, new C54612d(str, C55339a.m101150a(this.f125547a.f125507d), 8), z3, (List) null, 97));
            C89219l.m154721d(tVar, "");
            return new C55244a(tVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac */
    public static final class C54761ac implements AbstractC19479b<Pair<Boolean, List<ConversationApplyInfo>>> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125514a;

        static {
            Covode.recordClassIndex(64480);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C54761ac(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125514a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C56244a.m102193e("GroupChatDetailVM", "loadMoreRequest error: ".concat(String.valueOf(uVar)));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(Pair<Boolean, List<ConversationApplyInfo>> pair) {
            C54613e eVar;
            Pair<Boolean, List<ConversationApplyInfo>> pair2 = pair;
            if (pair2 != null) {
                C54610b value = this.f125514a.mo91836b().getValue();
                if (value == null || (eVar = value.f125178g) == null) {
                    eVar = new C54613e((List) null, false, 7);
                }
                this.f125514a.mo91834a(new C54762a(eVar, pair2));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac$a */
        static final class C54762a extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

            /* renamed from: a */
            final /* synthetic */ C54613e f125515a;

            /* renamed from: b */
            final /* synthetic */ Pair f125516b;

            static {
                Covode.recordClassIndex(64481);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54762a(C54613e eVar, Pair pair) {
                super(1);
                this.f125515a = eVar;
                this.f125516b = pair;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54610b invoke(C54610b bVar) {
                C54610b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                List g = C89070n.m154585g((Collection) this.f125515a.f125196a);
                Object obj = this.f125516b.second;
                C89219l.m154716b(obj, "");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    ConversationApplyInfo conversationApplyInfo = (ConversationApplyInfo) obj2;
                    if (conversationApplyInfo.apply_status == ApplyStatusCode.APPLYING || conversationApplyInfo.apply_status == ApplyStatusCode.INVALID) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<ConversationApplyInfo> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (ConversationApplyInfo conversationApplyInfo2 : arrayList2) {
                    arrayList3.add(new C54606a().mo91671a(conversationApplyInfo2));
                }
                g.addAll(arrayList3);
                Object obj3 = this.f125516b.first;
                C89219l.m154716b(obj3, "");
                return C54610b.m100122a(bVar2, 0, false, false, null, false, null, new C54613e(g, ((Boolean) obj3).booleanValue(), 4), 63);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ad */
    public static final class C54763ad implements AbstractC53999d {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125517a;

        static {
            Covode.recordClassIndex(64482);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54763ad(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125517a = groupChatDetailViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ad$a */
        static final class C54764a extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

            /* renamed from: a */
            final /* synthetic */ List f125518a;

            static {
                Covode.recordClassIndex(64483);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54764a(List list) {
                super(1);
                this.f125518a = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54610b invoke(C54610b bVar) {
                C54610b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                return C54610b.m100122a(bVar2, 0, false, false, null, false, this.f125518a, null, 95);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC53999d
        /* renamed from: a */
        public final void mo91089a(String str, List<C54006a> list, EnumC54000e eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(eVar, "");
            this.f125517a.mo91834a(new C54764a(list));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$h */
    public static final class C54791h implements AbstractC19479b<C19537ah> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125553a;

        static {
            Covode.recordClassIndex(64510);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo27861a(C19537ah ahVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54791h(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125553a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C55340b.m101158a(C17867d.m33078a(), uVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$i */
    public static final class C54792i implements AbstractC19479b<String> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125554a;

        static {
            Covode.recordClassIndex(64511);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C54792i(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125554a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C55340b.m101158a(C17867d.m33078a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(String str) {
            this.f125554a.mo91837b(C54793a.f125555a);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$i$a */
        static final class C54793a extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

            /* renamed from: a */
            public static final C54793a f125555a = new C54793a();

            static {
                Covode.recordClassIndex(64512);
            }

            C54793a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54611c invoke(C54611c cVar) {
                C54611c cVar2 = cVar;
                C89219l.m154721d(cVar2, "");
                return C54611c.m100123a(cVar2, false, false, null, true, false, false, null, null, null, null, false, null, false, 8183);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$j */
    public static final class C54794j implements AbstractC19479b<String> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125556a;

        static {
            Covode.recordClassIndex(64513);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54794j(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125556a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C55340b.m101158a(C17867d.m33078a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(String str) {
            this.f125556a.mo91837b(C54795a.f125557a);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$j$a */
        static final class C54795a extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

            /* renamed from: a */
            public static final C54795a f125557a = new C54795a();

            static {
                Covode.recordClassIndex(64514);
            }

            C54795a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54611c invoke(C54611c cVar) {
                C54611c cVar2 = cVar;
                C89219l.m154721d(cVar2, "");
                return C54611c.m100123a(cVar2, false, false, null, true, false, false, null, null, null, null, false, null, false, 8183);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$k */
    public static final class C54796k implements AbstractC19479b<List<? extends C19537ah>> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125558a;

        static {
            Covode.recordClassIndex(64515);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C54796k(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125558a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C55340b.m101158a(C17867d.m33078a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo27861a(List<? extends C19537ah> list) {
            this.f125558a.mo91834a(C54797a.f125559a);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$k$a */
        static final class C54797a extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

            /* renamed from: a */
            public static final C54797a f125559a = new C54797a();

            static {
                Covode.recordClassIndex(64516);
            }

            C54797a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54610b invoke(C54610b bVar) {
                C54610b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                return C54610b.m100122a(bVar2, 0, false, false, null, false, null, null, 127);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$r */
    public static final class C54804r implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125566a;

        static {
            Covode.recordClassIndex(64523);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54804r(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125566a = groupChatDetailViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$r$b */
        static final class C54806b extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

            /* renamed from: a */
            final /* synthetic */ String f125568a;

            static {
                Covode.recordClassIndex(64525);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54806b(String str) {
                super(1);
                this.f125568a = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54611c invoke(C54611c cVar) {
                C54611c cVar2 = cVar;
                C89219l.m154721d(cVar2, "");
                return C54611c.m100123a(cVar2, false, false, this.f125568a, false, false, false, null, null, null, null, false, null, false, 8187);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$r$c */
        static final class C54807c extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

            /* renamed from: a */
            public static final C54807c f125569a = new C54807c();

            static {
                Covode.recordClassIndex(64526);
            }

            C54807c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54611c invoke(C54611c cVar) {
                C54611c cVar2 = cVar;
                C89219l.m154721d(cVar2, "");
                return C54611c.m100123a(cVar2, false, false, null, false, false, false, null, null, null, null, false, null, true, 4095);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$r$a */
        static final class C54805a extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

            /* renamed from: a */
            final /* synthetic */ C54804r f125567a;

            static {
                Covode.recordClassIndex(64524);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54805a(C54804r rVar) {
                super(1);
                this.f125567a = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54610b invoke(C54610b bVar) {
                C19639i coreInfo;
                String name;
                C54610b bVar2 = bVar;
                String str = "";
                C89219l.m154721d(bVar2, str);
                C19638h c = this.f125567a.f125566a.f125508e.mo27749c();
                if (!(c == null || (coreInfo = c.getCoreInfo()) == null || (name = coreInfo.getName()) == null)) {
                    str = name;
                }
                return C54610b.m100122a(bVar2, 0, false, false, new C54612d(str, C55339a.m101150a(this.f125567a.f125566a.f125507d), false, false), false, null, null, 119);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$r$d */
        static final class C54808d extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

            /* renamed from: a */
            final /* synthetic */ C55370a f125570a;

            static {
                Covode.recordClassIndex(64527);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54808d(C55370a aVar) {
                super(1);
                this.f125570a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54611c invoke(C54611c cVar) {
                String statusMsg;
                C54611c cVar2 = cVar;
                String str = "";
                C89219l.m154721d(cVar2, str);
                C55370a aVar = this.f125570a;
                if (!(aVar == null || (statusMsg = aVar.getStatusMsg()) == null)) {
                    str = statusMsg;
                }
                return C54611c.m100123a(cVar2, false, false, str, false, false, false, null, null, null, null, false, null, false, 8187);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$r$e */
        static final class C54809e extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

            /* renamed from: a */
            final /* synthetic */ C19638h f125571a;

            static {
                Covode.recordClassIndex(64528);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54809e(C19638h hVar) {
                super(1);
                this.f125571a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54610b invoke(C54610b bVar) {
                C19639i coreInfo;
                String name;
                C54610b bVar2 = bVar;
                String str = "";
                C89219l.m154721d(bVar2, str);
                C19638h hVar = this.f125571a;
                if (!(hVar == null || (coreInfo = hVar.getCoreInfo()) == null || (name = coreInfo.getName()) == null)) {
                    str = name;
                }
                return C54610b.m100122a(bVar2, 0, false, false, new C54612d(str, true, false, false), false, null, null, 119);
            }
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            Integer statusCode;
            this.f125566a.mo91834a(new C54805a(this));
            String str = null;
            if (uVar != null) {
                str = uVar.f46732e;
            }
            C55370a aVar = (C55370a) C55214j.m100957a(str, C55370a.class);
            if (!(aVar == null || (statusCode = aVar.getStatusCode()) == null)) {
                if (statusCode.intValue() == 7602) {
                    String statusMsg = aVar.getStatusMsg();
                    if (statusMsg != null) {
                        this.f125566a.mo91837b(new C54806b(statusMsg));
                        return;
                    }
                    return;
                } else if (statusCode.intValue() == 7601) {
                    this.f125566a.mo91837b(C54807c.f125569a);
                    return;
                }
            }
            this.f125566a.mo91837b(new C54808d(aVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            String str;
            C19639i coreInfo;
            C19638h hVar2 = hVar;
            this.f125566a.mo91834a(new C54809e(hVar2));
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125566a;
            if (hVar2 == null || (coreInfo = hVar2.getCoreInfo()) == null) {
                str = null;
            } else {
                str = coreInfo.getName();
            }
            if (str == null) {
                str = "";
            }
            groupChatDetailViewModel.f125505b = str;
            String str2 = this.f125566a.f125507d;
            C89219l.m154721d(str2, "");
            C19638h c = AbstractC17427b.C17428a.m32308a(str2).mo27749c();
            if (c != null && c.isGroupChat() && c.getCoreInfo() != null) {
                C19639i coreInfo2 = c.getCoreInfo();
                C89219l.m154716b(coreInfo2, "");
                if (coreInfo2.getExt() != null) {
                    C19639i coreInfo3 = c.getCoreInfo();
                    C89219l.m154716b(coreInfo3, "");
                    Map<String, String> ext = coreInfo3.getExt();
                    C89219l.m154716b(ext, "");
                    ext.put("a:group_name_modified", "1");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$w */
    public static final class C54816w implements AbstractC19479b<Pair<Boolean, List<? extends ConversationApplyInfo>>> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125580a;

        static {
            Covode.recordClassIndex(64535);
        }

        public C54816w(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125580a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C56244a.m102193e("GroupChatDetailVM", "init group requests error: ".concat(String.valueOf(uVar)));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(Pair<Boolean, List<? extends ConversationApplyInfo>> pair) {
            final boolean z;
            Pair<Boolean, List<? extends ConversationApplyInfo>> pair2 = pair;
            if (pair2 != null) {
                Object obj = pair2.second;
                C89219l.m154716b(obj, "");
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) obj).iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ConversationApplyInfo conversationApplyInfo = (ConversationApplyInfo) next;
                    if (conversationApplyInfo.apply_status == ApplyStatusCode.APPLYING || conversationApplyInfo.apply_status == ApplyStatusCode.INVALID) {
                        arrayList.add(next);
                    }
                }
                ArrayList<ConversationApplyInfo> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (ConversationApplyInfo conversationApplyInfo2 : arrayList2) {
                    arrayList3.add(new C54606a().mo91671a(conversationApplyInfo2));
                }
                final ArrayList arrayList4 = arrayList3;
                GroupChatDetailViewModel groupChatDetailViewModel = this.f125580a;
                C54613e eVar = groupChatDetailViewModel.f125504a;
                Object obj2 = pair2.first;
                C89219l.m154716b(obj2, "");
                groupChatDetailViewModel.f125504a = C54613e.m100125a(eVar, arrayList4, ((Boolean) obj2).booleanValue(), false, 4);
                if (arrayList4.size() <= 5) {
                    Object obj3 = pair2.first;
                    C89219l.m154716b(obj3, "");
                    if (!((Boolean) obj3).booleanValue()) {
                        z = false;
                    }
                }
                this.f125580a.mo91834a(new AbstractC89172b<C54610b, C54610b>() {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.C54816w.C548171 */

                    static {
                        Covode.recordClassIndex(64536);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C54610b invoke(C54610b bVar) {
                        C54610b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        List list = arrayList4;
                        return C54610b.m100122a(bVar2, 0, false, false, null, false, null, new C54613e(list.subList(0, C89271h.m154772c(list.size(), 5)), z, 4), 63);
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$x */
    public static final class C54818x implements AbstractC19479b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125583a;

        static {
            Covode.recordClassIndex(64537);
        }

        public C54818x(GroupChatDetailViewModel groupChatDetailViewModel) {
            this.f125583a = groupChatDetailViewModel;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C55340b.m101158a(C17867d.m33078a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(Boolean bool) {
            final Boolean bool2 = bool;
            C55337a.m101144a(this.f125583a.mo91831a(), C89219l.m154714a((Object) bool2, (Object) true));
            this.f125583a.mo91834a(new AbstractC89172b<C54610b, C54610b>() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.C54818x.C548191 */

                static {
                    Covode.recordClassIndex(64538);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C54610b invoke(C54610b bVar) {
                    C54610b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    return C54610b.m100122a(bVar2, 0, false, false, null, C89219l.m154714a((Object) bool2, (Object) true), null, null, 111);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$an */
    public static final class C54776an implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC17427b f125533a;

        /* renamed from: b */
        final /* synthetic */ GroupChatDetailViewModel f125534b;

        /* renamed from: c */
        final /* synthetic */ boolean f125535c;

        static {
            Covode.recordClassIndex(64495);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            final C19638h hVar2 = hVar;
            this.f125534b.mo91839c(new AbstractC89172b<C54610b, C54610b>() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.C54776an.C547771 */

                static {
                    Covode.recordClassIndex(64496);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C54610b invoke(C54610b bVar) {
                    boolean z;
                    C54610b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    C19638h hVar = hVar2;
                    if (hVar == null || !hVar.isMute()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return C54610b.m100122a(bVar2, 0, z, false, null, false, null, null, 125);
                }
            });
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            this.f125534b.mo91839c(new AbstractC89172b<C54610b, C54610b>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.C54776an.C547782 */

                /* renamed from: a */
                final /* synthetic */ C54776an f125537a;

                static {
                    Covode.recordClassIndex(64497);
                }

                {
                    this.f125537a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C54610b invoke(C54610b bVar) {
                    boolean z;
                    C54610b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    C19638h c = this.f125537a.f125533a.mo27749c();
                    if (c == null || !c.isMute()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return C54610b.m100122a(bVar2, 0, z, false, null, false, null, null, 125);
                }
            });
            C55340b.m101158a(C17867d.m33078a(), uVar);
        }

        public C54776an(AbstractC17427b bVar, GroupChatDetailViewModel groupChatDetailViewModel, boolean z) {
            this.f125533a = bVar;
            this.f125534b = groupChatDetailViewModel;
            this.f125535c = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ap */
    public static final class C54780ap implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC17427b f125539a;

        /* renamed from: b */
        final /* synthetic */ GroupChatDetailViewModel f125540b;

        /* renamed from: c */
        final /* synthetic */ boolean f125541c;

        static {
            Covode.recordClassIndex(64499);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            final C19638h hVar2 = hVar;
            this.f125540b.mo91839c(new AbstractC89172b<C54610b, C54610b>() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.C54780ap.C547811 */

                static {
                    Covode.recordClassIndex(64500);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C54610b invoke(C54610b bVar) {
                    boolean z;
                    C54610b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    C19638h hVar = hVar2;
                    if (hVar == null || !hVar.isStickTop()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return C54610b.m100122a(bVar2, 0, false, z, null, false, null, null, 123);
                }
            });
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            this.f125540b.mo91839c(new AbstractC89172b<C54610b, C54610b>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.C54780ap.C547822 */

                /* renamed from: a */
                final /* synthetic */ C54780ap f125543a;

                static {
                    Covode.recordClassIndex(64501);
                }

                {
                    this.f125543a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C54610b invoke(C54610b bVar) {
                    boolean z;
                    C54610b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    C19638h c = this.f125543a.f125539a.mo27749c();
                    if (c == null || !c.isStickTop()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return C54610b.m100122a(bVar2, 0, false, z, null, false, null, null, 123);
                }
            });
            C55340b.m101158a(C17867d.m33078a(), uVar);
        }

        public C54780ap(AbstractC17427b bVar, GroupChatDetailViewModel groupChatDetailViewModel, boolean z) {
            this.f125539a = bVar;
            this.f125540b = groupChatDetailViewModel;
            this.f125541c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$m */
    public static final class C54799m<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C54799m f125561a = new C54799m();

        static {
            Covode.recordClassIndex(64518);
        }

        C54799m() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C56244a.m102188a(th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$am */
    public static final class C54773am implements AbstractC19479b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125529a;

        /* renamed from: b */
        final /* synthetic */ boolean f125530b;

        static {
            Covode.recordClassIndex(64492);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$am$a */
        static final class C54774a extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

            /* renamed from: a */
            final /* synthetic */ C54773am f125531a;

            static {
                Covode.recordClassIndex(64493);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54774a(C54773am amVar) {
                super(1);
                this.f125531a = amVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54610b invoke(C54610b bVar) {
                C54610b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                return C54610b.m100122a(bVar2, 0, false, false, null, this.f125531a.f125530b, null, null, 111);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$am$b */
        static final class C54775b extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

            /* renamed from: a */
            final /* synthetic */ Boolean f125532a;

            static {
                Covode.recordClassIndex(64494);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54775b(Boolean bool) {
                super(1);
                this.f125532a = bool;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C54610b invoke(C54610b bVar) {
                C54610b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                return C54610b.m100122a(bVar2, 0, false, false, null, C89219l.m154714a((Object) this.f125532a, (Object) true), null, null, 111);
            }
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C55340b.m101158a(C17867d.m33078a(), uVar);
            this.f125529a.mo91839c(new C54774a(this));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(Boolean bool) {
            Boolean bool2 = bool;
            C55337a.m101144a(this.f125529a.mo91831a(), C89219l.m154714a((Object) bool2, (Object) true));
            this.f125529a.mo91839c(new C54775b(bool2));
        }

        public C54773am(GroupChatDetailViewModel groupChatDetailViewModel, boolean z) {
            this.f125529a = groupChatDetailViewModel;
            this.f125530b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$aa */
    public static final class C54759aa extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        public static final C54759aa f125512a = new C54759aa();

        static {
            Covode.recordClassIndex(64478);
        }

        C54759aa() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 100, false, false, null, false, null, null, 126);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ae */
    public static final class C54765ae extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        public static final C54765ae f125519a = new C54765ae();

        static {
            Covode.recordClassIndex(64484);
        }

        C54765ae() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, false, false, null, false, null, null, 127);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$af */
    public static final class C54766af extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        final /* synthetic */ C54006a f125520a;

        static {
            Covode.recordClassIndex(64485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54766af(C54006a aVar) {
            super(1);
            this.f125520a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, false, false, null, false, false, false, this.f125520a, null, null, null, false, null, false, 8127);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ah */
    public static final class C54768ah extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        final /* synthetic */ C54006a f125523a;

        static {
            Covode.recordClassIndex(64487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54768ah(C54006a aVar) {
            super(1);
            this.f125523a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, false, false, null, false, false, false, null, null, null, this.f125523a, false, null, false, 7679);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$aj */
    public static final class C54770aj extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        public static final C54770aj f125526a = new C54770aj();

        static {
            Covode.recordClassIndex(64489);
        }

        C54770aj() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, false, true, null, false, false, false, null, null, null, null, false, null, false, 8189);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$al */
    public static final class C54772al extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        final /* synthetic */ boolean f125528a;

        static {
            Covode.recordClassIndex(64491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54772al(boolean z) {
            super(1);
            this.f125528a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, false, false, null, !this.f125528a, null, null, 111);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ao */
    public static final class C54779ao extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        final /* synthetic */ boolean f125538a;

        static {
            Covode.recordClassIndex(64498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54779ao(boolean z) {
            super(1);
            this.f125538a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, !this.f125538a, false, null, false, null, null, 125);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$aq */
    public static final class C54783aq extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        final /* synthetic */ boolean f125544a;

        static {
            Covode.recordClassIndex(64502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54783aq(boolean z) {
            super(1);
            this.f125544a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, false, !this.f125544a, null, false, null, null, 123);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ar */
    public static final class C54784ar extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125545a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125546b;

        static {
            Covode.recordClassIndex(64503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54784ar(GroupChatDetailViewModel groupChatDetailViewModel, C54006a aVar) {
            super(1);
            this.f125545a = groupChatDetailViewModel;
            this.f125546b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, false, false, null, false, false, false, null, this.f125546b, null, null, false, null, false, 8063);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$e */
    public static final class C54788e extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        public static final C54788e f125550a = new C54788e();

        static {
            Covode.recordClassIndex(64507);
        }

        C54788e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, false, false, null, false, false, false, null, null, null, null, true, null, false, 7167);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$g */
    public static final class C54790g extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        final /* synthetic */ C54006a f125552a;

        static {
            Covode.recordClassIndex(64509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54790g(C54006a aVar) {
            super(1);
            this.f125552a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, false, false, null, false, false, false, null, null, this.f125552a, null, false, null, false, 7935);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$o */
    public static final class C54801o extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        public static final C54801o f125563a = new C54801o();

        static {
            Covode.recordClassIndex(64520);
        }

        C54801o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, true, false, null, false, false, false, null, null, null, null, false, null, false, 8190);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$p */
    public static final class C54802p extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        public static final C54802p f125564a = new C54802p();

        static {
            Covode.recordClassIndex(64521);
        }

        C54802p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, false, false, null, false, null, null, 127);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$q */
    public static final class C54803q extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        public static final C54803q f125565a = new C54803q();

        static {
            Covode.recordClassIndex(64522);
        }

        C54803q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, false, false, C54612d.m100124a(bVar2.f125175d, null, false, false, true, 7), false, null, null, 119);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$s */
    public static final class C54810s extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        public static final C54810s f125572a = new C54810s();

        static {
            Covode.recordClassIndex(64529);
        }

        C54810s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, false, false, C54612d.m100124a(bVar2.f125175d, null, false, true, false, 11), false, null, null, 119);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$t */
    public static final class C54811t extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        public static final C54811t f125573a = new C54811t();

        static {
            Covode.recordClassIndex(64530);
        }

        C54811t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, false, false, C54612d.m100124a(bVar2.f125175d, null, false, false, false, 11), false, null, null, 119);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$z */
    public static final class C54821z extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        public static final C54821z f125586a = new C54821z();

        static {
            Covode.recordClassIndex(64540);
        }

        C54821z() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, false, false, null, false, false, true, null, null, null, null, false, null, false, 8159);
        }
    }

    /* renamed from: a */
    public final void mo91832a(Activity activity) {
        C89219l.m154721d(activity, "");
        C53688g.m98963a(C53688g.m98959a(String.valueOf(mo91831a())), activity, "5");
    }

    /* renamed from: b */
    public final void mo91837b(AbstractC89172b<? super C54611c, C54611c> bVar) {
        C89219l.m154721d(bVar, "");
        mo91845i();
        mo91838c().setValue(new C54005c<>(bVar.invoke(new C54611c())));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ab */
    public static final class C54760ab extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125513a;

        static {
            Covode.recordClassIndex(64479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54760ab(GroupChatDetailViewModel groupChatDetailViewModel) {
            super(1);
            this.f125513a = groupChatDetailViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C54610b.m100122a(bVar2, 0, false, false, null, false, null, new C54613e(this.f125513a.f125504a.f125196a, this.f125513a.f125504a.f125197b, 4), 63);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ag */
    static final class C54767ag extends AbstractC89220m implements AbstractC89172b<C54610b, C54610b> {

        /* renamed from: a */
        final /* synthetic */ C54613e f125521a;

        /* renamed from: b */
        final /* synthetic */ C54606a f125522b;

        static {
            Covode.recordClassIndex(64486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54767ag(C54613e eVar, C54606a aVar) {
            super(1);
            this.f125521a = eVar;
            this.f125522b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54610b invoke(C54610b bVar) {
            C54610b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C54613e eVar = this.f125521a;
            List g = C89070n.m154585g((Collection) eVar.f125196a);
            g.remove(this.f125522b);
            return C54610b.m100122a(bVar2, 0, false, false, null, false, null, C54613e.m100125a(eVar, g, false, false, 6), 63);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ak */
    public static final class C54771ak extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        public static final C54771ak f125527a = new C54771ak();

        static {
            Covode.recordClassIndex(64490);
        }

        C54771ak() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            String string = C17867d.m33078a().getString(R.string.c7o, Arrays.copyOf(new Object[0], 0));
            C89219l.m154716b(string, "");
            return C54611c.m100123a(cVar2, false, false, string, false, true, false, null, null, null, null, false, null, false, 8171);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$d */
    public static final class C54787d extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125549a;

        static {
            Covode.recordClassIndex(64506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54787d(GroupChatDetailViewModel groupChatDetailViewModel) {
            super(1);
            this.f125549a = groupChatDetailViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C54611c.m100123a(cVar2, false, false, C55339a.m101147a(C55080c.m100733d(this.f125549a.f125508e.mo27749c())), false, false, false, null, null, null, null, false, null, false, 8187);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$f */
    public static final class C54789f extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        public static final C54789f f125551a = new C54789f();

        static {
            Covode.recordClassIndex(64508);
        }

        C54789f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            String string = C17867d.m33078a().getString(R.string.c7o, Arrays.copyOf(new Object[0], 0));
            C89219l.m154716b(string, "");
            return C54611c.m100123a(cVar2, false, false, string, false, true, false, null, null, null, null, false, null, false, 8171);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$l */
    public static final class C54798l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ IMUser f125560a;

        static {
            Covode.recordClassIndex(64517);
        }

        C54798l(IMUser iMUser) {
            this.f125560a = iMUser;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            BlockResponse blockResponse = (BlockResponse) obj;
            IMUser iMUser = this.f125560a;
            C89219l.m154716b(blockResponse, "");
            boolean z = true;
            if (blockResponse.getBlockStaus() != 1) {
                z = false;
            }
            iMUser.setBlock(z);
            if (this.f125560a.isBlock()) {
                this.f125560a.setFollowStatus(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$v */
    public static final class C54815v implements AbstractC19479b<ConversationApplyInfo> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailViewModel f125578a;

        /* renamed from: b */
        final /* synthetic */ C54606a f125579b;

        static {
            Covode.recordClassIndex(64534);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C56244a.m102193e("GroupChatDetailVM", "handle Apply Info: " + this.f125579b.f125162e + " fail");
            C55340b.m101158a(C17867d.m33078a(), uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(ConversationApplyInfo conversationApplyInfo) {
            C54613e eVar;
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125578a;
            C54606a aVar = this.f125579b;
            C54610b value = groupChatDetailViewModel.mo91836b().getValue();
            if (value == null || (eVar = value.f125178g) == null) {
                eVar = new C54613e((List) null, false, 7);
            }
            groupChatDetailViewModel.mo91834a(new C54767ag(eVar, aVar));
        }

        public C54815v(GroupChatDetailViewModel groupChatDetailViewModel, C54606a aVar) {
            this.f125578a = groupChatDetailViewModel;
            this.f125579b = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$y */
    public static final class C54820y extends AbstractC89220m implements AbstractC89172b<C54611c, C54611c> {

        /* renamed from: a */
        public static final C54820y f125585a = new C54820y();

        static {
            Covode.recordClassIndex(64539);
        }

        C54820y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C54611c invoke(C54611c cVar) {
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            String string = C17867d.m33078a().getString(R.string.c74, Arrays.copyOf(new Object[0], 0));
            C89219l.m154716b(string, "");
            return C54611c.m100123a(cVar2, false, false, string, false, true, false, null, null, null, null, false, null, false, 8171);
        }
    }

    /* renamed from: a */
    public static void m100378a(C54006a aVar) {
        C89219l.m154721d(aVar, "");
        IMUser user = aVar.getUser();
        if (user != null) {
            C55257a.m101013a(user.getUid(), user.getSecUid(), !user.isBlock()).mo143231a(new C54798l(user), C54799m.f125561a);
        }
    }

    /* renamed from: c */
    public final void mo91839c(AbstractC89172b<? super C54610b, C54610b> bVar) {
        C89219l.m154721d(bVar, "");
        C55244a<C54610b> b = mo91836b();
        C54769ai aiVar = new C54769ai(this, bVar);
        C89219l.m154721d(aiVar, "");
        b.mo92220a().removeCallbacksAndMessages(null);
        b.mo92220a().postDelayed(new C55244a.RunnableC55248c(b, aiVar), 1000);
    }

    /* renamed from: a */
    public final void mo91833a(IMUser iMUser) {
        if (iMUser != null) {
            AbstractC17427b bVar = this.f125508e;
            String uid = iMUser.getUid();
            C89219l.m154716b(uid, "");
            bVar.mo27737a(uid, GroupRole.OWNER.getValue(), C89041ag.m154415a(), new C54791h(this));
        }
    }

    /* renamed from: a */
    public final void mo91834a(AbstractC89172b<? super C54610b, C54610b> bVar) {
        C89219l.m154721d(bVar, "");
        C55244a<C54610b> b = mo91836b();
        C54610b value = mo91836b().getValue();
        if (value == null) {
            value = new C54610b(0, false, false, (C54612d) null, false, (List) null, 127);
        }
        b.setValue(bVar.invoke(value));
    }

    /* renamed from: a */
    public final void mo91835a(String str) {
        C89219l.m154721d(str, "");
        mo91834a(C54810s.f125572a);
        C54603a.m100105a("edit_group_name", C89387v.m154943a(str, "enter_method"));
    }

    public GroupChatDetailViewModel(String str, AbstractC17427b bVar) {
        C19639i coreInfo;
        String name;
        String str2 = "";
        C89219l.m154721d(str, str2);
        C89219l.m154721d(bVar, str2);
        this.f125507d = str;
        this.f125508e = bVar;
        C19638h c = bVar.mo27749c();
        if (!(c == null || (coreInfo = c.getCoreInfo()) == null || (name = coreInfo.getName()) == null)) {
            str2 = name;
        }
        this.f125505b = str2;
        this.f125506c = new C54763ad(this);
    }
}
