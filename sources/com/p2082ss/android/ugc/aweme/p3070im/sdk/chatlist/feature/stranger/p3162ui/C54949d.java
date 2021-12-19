package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.stranger.p3162ui;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1417i.AbstractC19719c;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3149a.AbstractC54866a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54871c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54859g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.d */
public final class C54949d extends C54946a implements AbstractC19719c {

    /* renamed from: c */
    public static final C54951a f125779c = new C54951a((byte) 0);

    /* renamed from: a */
    final AbstractC89516am f125780a;

    /* renamed from: b */
    public final AbstractC89507ah f125781b;

    /* renamed from: d */
    private final AbstractC89244h f125782d;

    /* renamed from: e */
    private final TuxStatusView.C23263c f125783e;

    /* renamed from: f */
    private final TuxStatusView f125784f;

    /* renamed from: g */
    private final AbstractC89171a<C89391z> f125785g;

    /* renamed from: h */
    private final AbstractC89507ah f125786h;

    static {
        Covode.recordClassIndex(64673);
    }

    /* renamed from: m */
    private final List<C19638h> m100568m() {
        return (List) this.f125782d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.d$a */
    public static final class C54951a {
        static {
            Covode.recordClassIndex(64675);
        }

        private C54951a() {
        }

        public /* synthetic */ C54951a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.d$b */
    static final class C54952b extends AbstractC89220m implements AbstractC89171a<List<C19638h>> {

        /* renamed from: a */
        public static final C54952b f125788a = new C54952b();

        static {
            Covode.recordClassIndex(64676);
        }

        C54952b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C19638h> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: l */
    public final void mo91932l() {
        C33744d a = new C33744d().mo59980a("chat_cnt", mo63369e().size());
        List e = mo63369e();
        C89219l.m154716b(e, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            AbstractC56237a aVar = (AbstractC56237a) obj;
            C89219l.m154716b(aVar, "");
            if (aVar.f128238q > 0) {
                arrayList.add(obj);
            }
        }
        C39162r.m79460a("message_box_status", a.mo59980a("unread_chat_cnt", arrayList.size()).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.d$d */
    public static final class C54955d implements AbstractC89172b<List<C54859g>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54949d f125797a;

        /* renamed from: b */
        final /* synthetic */ boolean f125798b;

        static {
            Covode.recordClassIndex(64679);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<C54859g> list) {
            mo91933a(list);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo91933a(List<C54859g> list) {
            C89219l.m154721d(list, "");
            C56244a.m102191c("StrangerListAdapter", "onLoadMore invoke: " + this.f125797a.mo63369e().size() + ", " + list.size());
            this.f125797a.mo67829d(this.f125798b);
            if (!this.f125798b) {
                this.f125797a.ap_();
                this.f125797a.mo91932l();
            } else {
                this.f125797a.aq_();
            }
            this.f125797a.mo63369e().addAll(list);
            C54949d dVar = this.f125797a;
            dVar.mo62376b(dVar.mo63369e());
        }

        C54955d(C54949d dVar, boolean z) {
            this.f125797a = dVar;
            this.f125798b = z;
        }
    }

    /* renamed from: e */
    public static List<C54859g> m100567e(List<? extends C19638h> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C54859g b = m100566b((C19638h) it.next());
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.p1399im.core.p1417i.AbstractC19719c
    /* renamed from: a */
    public final void mo31663a(List<C19638h> list) {
        Integer num;
        StringBuilder append = new StringBuilder("onQuery: ").append(mo63369e().size()).append(", ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C56244a.m102191c("StrangerListAdapter", append.append(num).toString());
        if (list != null) {
            m100568m().addAll(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.d$c */
    public static final class C54953c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f125789a;

        /* renamed from: b */
        final /* synthetic */ C54949d f125790b;

        /* renamed from: c */
        final /* synthetic */ List f125791c;

        /* renamed from: d */
        final /* synthetic */ List f125792d;

        /* renamed from: e */
        final /* synthetic */ C54955d f125793e;

        static {
            Covode.recordClassIndex(64677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54953c(C54949d dVar, List list, List list2, C54955d dVar2, AbstractC89124d dVar3) {
            super(2, dVar3);
            this.f125790b = dVar;
            this.f125791c = list;
            this.f125792d = list2;
            this.f125793e = dVar2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54953c(this.f125790b, this.f125791c, this.f125792d, this.f125793e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54953c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            ListIterator listIterator;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f125789a;
            if (i == 0) {
                C89382r.m154942a(obj);
                List list = this.f125791c;
                List list2 = this.f125792d;
                if (!(list2 == null || (listIterator = list2.listIterator()) == null)) {
                    while (listIterator.hasNext()) {
                        C19638h hVar = (C19638h) listIterator.next();
                        if (list.contains(hVar.getConversationId())) {
                            C56244a.m102193e("StrangerListAdapter", "filter: " + hVar.getConversationId());
                            listIterator.remove();
                        }
                    }
                }
                final List<C54859g> e = C54949d.m100567e(this.f125792d);
                AbstractC89507ah ahVar = this.f125790b.f125781b;
                C549541 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.stranger.p3162ui.C54949d.C54953c.C549541 */

                    /* renamed from: a */
                    int f125794a;

                    /* renamed from: b */
                    final /* synthetic */ C54953c f125795b;

                    static {
                        Covode.recordClassIndex(64678);
                    }

                    {
                        this.f125795b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* renamed from: b */
                        private static C54859g m100566b(C19638h hVar) {
                            C54859g gVar = null;
                            if (hVar == null) {
                                return null;
                            }
                            if (!hVar.isStranger() || !hVar.isSingleChat()) {
                                C56244a.m102193e("StrangerListAdapter", "convert not stranger: " + (hVar.getConversationId() + ", " + hVar.isStranger() + ", " + hVar.isSingleChat()));
                                return null;
                            }
                            AbstractC56237a a = C54871c.m100470a(hVar);
                            if (a instanceof C54859g) {
                                gVar = a;
                            }
                            return gVar;
                        }

                        @Override // com.bytedance.p1399im.core.p1417i.AbstractC19719c
                        /* renamed from: a */
                        public final void mo31662a(C19672u uVar) {
                            C56244a.m102191c("StrangerListAdapter", "onRefreshFailed: " + uVar + ", localSize=" + m100568m().size());
                            if (!m100568m().isEmpty()) {
                                mo31664a(m100568m(), false);
                                return;
                            }
                            mo63369e().clear();
                            if (this.f92274v) {
                                mo67829d(false);
                                notifyDataSetChanged();
                            }
                            this.f125784f.setVisibility(0);
                            this.f125784f.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), this.f125785g));
                        }

                        @Override // com.bytedance.p1399im.core.p1417i.AbstractC19719c
                        /* renamed from: a */
                        public final void mo31660a(C19638h hVar) {
                            String str;
                            String conversationId;
                            StringBuilder append = new StringBuilder("onDelete: ").append(mo63369e().size()).append(", ");
                            String str2 = null;
                            if (hVar != null) {
                                str = hVar.getConversationId();
                            } else {
                                str = null;
                            }
                            C56244a.m102191c("StrangerListAdapter", append.append(str).toString());
                            if (hVar != null && (conversationId = hVar.getConversationId()) != null && conversationId.length() != 0) {
                                int i = -1;
                                List e = mo63369e();
                                C89219l.m154716b(e, "");
                                int size = e.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        break;
                                    }
                                    Object obj = mo63369e().get(i2);
                                    C89219l.m154716b(obj, "");
                                    String bL_ = ((AbstractC56237a) obj).bL_();
                                    if (hVar == null) {
                                        C89219l.m154715b();
                                    }
                                    if (C89219l.m154714a((Object) bL_, (Object) hVar.getConversationId())) {
                                        i = i2;
                                        break;
                                    }
                                    i2++;
                                }
                                StringBuilder append2 = new StringBuilder("onDelete: ").append(mo63369e().size()).append(", ");
                                if (hVar != null) {
                                    str2 = hVar.getConversationId();
                                }
                                C56244a.m102191c("StrangerListAdapter", append2.append(str2).append(", ").append(i).toString());
                                if (i >= 0) {
                                    mo63369e().remove(i);
                                    notifyDataSetChanged();
                                }
                                if (mo63369e() == null || mo63369e().isEmpty()) {
                                    this.f125784f.setVisibility(0);
                                    this.f125784f.setStatus(this.f125783e);
                                }
                            }
                        }

                        @Override // com.bytedance.p1399im.core.p1417i.AbstractC19719c
                        /* renamed from: b */
                        public final void mo31665b(List<C19638h> list, boolean z) {
                            List<AbstractC56237a> e = mo63369e();
                            C89219l.m154716b(e, "");
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) e, 10));
                            for (AbstractC56237a aVar : e) {
                                C89219l.m154716b(aVar, "");
                                arrayList.add(aVar.bL_());
                            }
                            ArrayList arrayList2 = arrayList;
                            C56244a.m102191c("StrangerListAdapter", new StringBuilder("onLoadMore: ").append(mo63369e().size()).append(", ").append(list != null ? Integer.valueOf(list.size()) : null).append(", ").append(z).toString());
                            AbstractC89568bz unused = C89624i.m155555a(this.f125780a, null, null, new C54953c(this, arrayList2, list, new C54955d(this, z), null), 3);
                        }

                        @Override // com.bytedance.p1399im.core.p1417i.AbstractC19719c
                        /* renamed from: a */
                        public final void mo31661a(C19638h hVar, int i) {
                            C54859g b = m100566b(hVar);
                            String str = null;
                            if (b == null) {
                                StringBuilder sb = new StringBuilder("onUpdate session null: ");
                                if (hVar != null) {
                                    str = hVar.getConversationId();
                                }
                                C56244a.m102193e("StrangerListAdapter", sb.append(str).toString());
                                return;
                            }
                            int i2 = -1;
                            int i3 = 0;
                            List e = mo63369e();
                            C89219l.m154716b(e, "");
                            int size = e.size();
                            while (true) {
                                if (i3 >= size) {
                                    break;
                                }
                                Object obj = mo63369e().get(i3);
                                C89219l.m154716b(obj, "");
                                if (C89219l.m154714a((Object) ((AbstractC56237a) obj).bL_(), (Object) b.bL_())) {
                                    i2 = i3;
                                    break;
                                }
                                i3++;
                            }
                            StringBuilder append = new StringBuilder("onUpdate: ").append(mo63369e().size()).append(", ");
                            if (hVar != null) {
                                str = hVar.getConversationId();
                            }
                            C56244a.m102191c("StrangerListAdapter", append.append(str).append(", ").append(i2).append(", ").append(i).toString());
                            if (i2 >= 0) {
                                mo63369e().set(i2, b);
                                notifyItemChanged(i2);
                            }
                        }

                        @Override // com.bytedance.p1399im.core.p1417i.AbstractC19719c
                        /* renamed from: a */
                        public final void mo31664a(List<C19638h> list, boolean z) {
                            Integer num;
                            List<C54859g> e = m100567e(list);
                            StringBuilder append = new StringBuilder("onRefresh: ").append(mo63369e().size()).append(", ");
                            if (list != null) {
                                num = Integer.valueOf(list.size());
                            } else {
                                num = null;
                            }
                            C56244a.m102191c("StrangerListAdapter", append.append(num).append(", ").append(e.size()).append(", ").append(z).toString());
                            this.f125784f.setVisibility(8);
                            mo63369e().clear();
                            if (e.isEmpty()) {
                                if (this.f92274v) {
                                    mo67829d(false);
                                }
                                this.f125784f.setVisibility(0);
                                this.f125784f.setStatus(this.f125783e);
                            } else {
                                mo67829d(C55076b.m100725d().needSessionListShowMore());
                                mo63369e().addAll(e);
                            }
                            mo67829d(z);
                            if (!z) {
                                ap_();
                                mo91932l();
                            } else {
                                mo67829d(true);
                                aq_();
                            }
                            notifyDataSetChanged();
                        }

                        public /* synthetic */ C54949d(TuxStatusView tuxStatusView, ActivityC0218d dVar, AbstractC54866a aVar, AbstractC89171a aVar2) {
                            this(tuxStatusView, dVar, aVar, aVar2, C89546bf.f203266a, C89652o.f203399a);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        private C54949d(TuxStatusView tuxStatusView, ActivityC0218d dVar, AbstractC54866a aVar, AbstractC89171a<C89391z> aVar2, AbstractC89507ah ahVar, AbstractC89507ah ahVar2) {
                            super(dVar, aVar);
                            C89219l.m154721d(tuxStatusView, "");
                            C89219l.m154721d(dVar, "");
                            C89219l.m154721d(aVar, "");
                            C89219l.m154721d(aVar2, "");
                            C89219l.m154721d(ahVar, "");
                            C89219l.m154721d(ahVar2, "");
                            this.f125784f = tuxStatusView;
                            this.f125785g = aVar2;
                            this.f125786h = ahVar;
                            this.f125781b = ahVar2;
                            this.f125782d = C89250i.m154773a((AbstractC89171a) C54952b.f125788a);
                            this.f125780a = C89517an.m155448a(ahVar);
                            mo62377b_(new ArrayList());
                            tuxStatusView.mo37867a();
                            mo67829d(true);
                            TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C549501.f125787a));
                            String string = dVar.getString(R.string.chf);
                            C89219l.m154716b(string, "");
                            TuxStatusView.C23263c a2 = a.mo37879a(string);
                            String string2 = dVar.getString(R.string.che);
                            C89219l.m154716b(string2, "");
                            this.f125783e = a2.mo37878a((CharSequence) string2);
                        }
                    }
