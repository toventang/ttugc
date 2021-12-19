package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.android.widget.C12249d;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55191a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.C55946a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55956g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55967b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.C56055a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74722b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel */
public final class ShareTextBoxViewModel extends AbstractC1174ac implements AbstractC55948b {

    /* renamed from: l */
    public static final C56139a f128035l = new C56139a((byte) 0);

    /* renamed from: a */
    public final LiveData<Integer> f128036a;

    /* renamed from: b */
    public final LiveData<C56143a> f128037b;

    /* renamed from: c */
    public final LiveData<C56144b> f128038c;

    /* renamed from: d */
    public final LiveData<Float> f128039d;

    /* renamed from: e */
    public final LiveData<Boolean> f128040e;

    /* renamed from: f */
    public final LiveData<List<User>> f128041f;

    /* renamed from: g */
    final C12249d<Boolean> f128042g;

    /* renamed from: h */
    public final LiveData<Boolean> f128043h;

    /* renamed from: i */
    public final SharePackage f128044i;

    /* renamed from: j */
    public final AbstractC56263a f128045j;

    /* renamed from: k */
    final C1213t<Boolean> f128046k;

    /* renamed from: m */
    private C56055a f128047m;

    /* renamed from: n */
    private final C1213t<Integer> f128048n;

    /* renamed from: o */
    private final C1213t<C56143a> f128049o;

    /* renamed from: p */
    private final C1213t<C56144b> f128050p;

    /* renamed from: q */
    private final C1213t<Float> f128051q;

    /* renamed from: r */
    private final C1213t<Boolean> f128052r;

    /* renamed from: s */
    private final C1213t<List<User>> f128053s;

    /* renamed from: t */
    private List<? extends IMContact> f128054t;

    /* renamed from: u */
    private final AbstractC56264b f128055u;

    /* renamed from: v */
    private final AbstractC55948b f128056v;

    static {
        Covode.recordClassIndex(65939);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel$a */
    public static final class C56139a {
        static {
            Covode.recordClassIndex(65940);
        }

        private C56139a() {
        }

        public /* synthetic */ C56139a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private final boolean m102013c() {
        if (this.f128054t.size() <= 15) {
            return true;
        }
        this.f128049o.setValue(new C56143a());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel$d */
    public static final class C56142d implements AbstractC55947a {

        /* renamed from: a */
        final /* synthetic */ ShareTextBoxViewModel f128061a;

        /* renamed from: b */
        final /* synthetic */ String f128062b;

        /* renamed from: c */
        final /* synthetic */ List f128063c;

        /* renamed from: d */
        final /* synthetic */ String f128064d;

        static {
            Covode.recordClassIndex(65943);
        }

        C56142d(ShareTextBoxViewModel shareTextBoxViewModel, String str, List list, String str2) {
            this.f128061a = shareTextBoxViewModel;
            this.f128062b = str;
            this.f128063c = list;
            this.f128064d = str2;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a
        /* renamed from: a */
        public final void mo92815a() {
            AbstractC56263a aVar = this.f128061a.f128045j;
            if (aVar != null) {
                aVar.mo92900a(this.f128061a.f128044i);
            }
            C55712b.m101459a(this.f128061a.f128044i, this.f128062b, this.f128063c);
            if (this.f128063c.size() > 1) {
                C55940a.m101783a(this.f128061a.f128044i, (BaseContent) null, this.f128063c.size());
            }
            C55956g.m101813a(this.f128064d, this.f128061a.f128044i, C89070n.m154585g((Collection) this.f128063c));
        }
    }

    /* renamed from: a */
    private List<IMContact> m102009a() {
        List<? extends IMContact> list = this.f128054t;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!(t instanceof C74721a)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final void m102011b() {
        C56055a aVar = this.f128047m;
        if (aVar != null && aVar.f127842b) {
            this.f128050p.postValue(new C56144b(R.string.c61));
        } else if (this.f128054t.size() <= 1) {
            this.f128050p.postValue(new C56144b(R.string.ch4));
        } else {
            this.f128050p.postValue(new C56144b(R.string.fic, this.f128054t.size()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: b */
    public final void mo92817b(boolean z) {
        AbstractC55948b bVar = this.f128056v;
        if (bVar != null) {
            bVar.mo92817b(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: c */
    public final void mo92818c(boolean z) {
        AbstractC55948b bVar = this.f128056v;
        if (bVar != null) {
            bVar.mo92818c(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: a */
    public final void mo92816a(boolean z) {
        m102011b();
        AbstractC55948b bVar = this.f128056v;
        if (bVar != null) {
            bVar.mo92816a(z);
        }
    }

    /* renamed from: d */
    public final void mo92998d(boolean z) {
        AbstractC55948b bVar = this.f128056v;
        if (bVar != null) {
            bVar.mo92818c(z);
        }
        this.f128052r.setValue(Boolean.valueOf(z));
        if (!z) {
            C56055a aVar = this.f128047m;
            if (aVar != null) {
                aVar.f127843c = false;
            }
            m102011b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel$c */
    public static final class C56141c extends AbstractC89220m implements AbstractC89172b<C19638h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ShareTextBoxViewModel f128058a;

        /* renamed from: b */
        final /* synthetic */ String f128059b;

        /* renamed from: c */
        final /* synthetic */ boolean f128060c;

        static {
            Covode.recordClassIndex(65942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56141c(ShareTextBoxViewModel shareTextBoxViewModel, String str, boolean z) {
            super(1);
            this.f128058a = shareTextBoxViewModel;
            this.f128059b = str;
            this.f128060c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19638h hVar) {
            C19638h hVar2 = hVar;
            this.f128058a.mo92998d(false);
            if (hVar2 != null) {
                this.f128058a.f128044i.f155492i.putBoolean("is_new_group", true);
                this.f128058a.mo92997a(C89070n.m154524c(C55082e.m100743b(hVar2)), this.f128059b, this.f128060c);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m102012b(List<? extends IMContact> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof C74721a) {
                arrayList.add(t);
            }
        }
        List<C74721a> a = C89070n.m154553a((Iterable) arrayList, (Comparator) C56140b.f128057a);
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        for (C74721a aVar : a) {
            arrayList2.add(C74722b.m131180a(aVar));
        }
        ArrayList arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            if (!list.isEmpty()) {
                this.f128044i.f155492i.putBoolean("show_tips_until_cancel", true);
                this.f128053s.postValue(arrayList3);
                return;
            }
            this.f128053s.setValue(arrayList3);
        }
    }

    /* renamed from: a */
    public final void mo92996a(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        this.f128054t = list;
        m102011b();
        C56055a aVar = this.f128047m;
        if (aVar != null) {
            aVar.mo92913a(list);
        }
        List<? extends IMContact> list2 = this.f128054t;
        if (list2 == null || list2.isEmpty()) {
            this.f128051q.setValue(Float.valueOf(0.5f));
        } else {
            this.f128051q.setValue(Float.valueOf(1.0f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel$b */
    public static final class C56140b<T> implements Comparator {

        /* renamed from: a */
        public static final C56140b f128057a = new C56140b();

        static {
            Covode.recordClassIndex(65941);
        }

        C56140b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C74721a) obj).getSortIndex() - ((C74721a) obj2).getSortIndex();
        }
    }

    /* renamed from: a */
    private final void m102010a(SharePackage sharePackage, int i) {
        C56055a aVar = this.f128047m;
        if (aVar == null || !aVar.f127842b) {
            sharePackage.f155492i.putInt("is_create_group_chat", 0);
        } else {
            sharePackage.f155492i.putInt("is_create_group_chat", 1);
        }
        sharePackage.f155492i.putInt("friends_shared_cnt", i);
    }

    /* renamed from: a */
    public final void mo92995a(String str, boolean z) {
        Boolean bool;
        List<? extends IMContact> list = this.f128054t;
        if (list != null && !list.isEmpty()) {
            AbstractC56264b bVar = this.f128055u;
            if (bVar != null && !bVar.mo90149a(this.f128044i)) {
                C56244a.m102185a("ShareTextBoxViewModel", "cancel share by callback");
            } else if (str == null || str.length() <= 6000) {
                C56055a aVar = this.f128047m;
                if (aVar != null && aVar.f127842b) {
                    C56055a aVar2 = this.f128047m;
                    if (aVar2 != null) {
                        bool = Boolean.valueOf(aVar2.mo92914a(new C56141c(this, str, z)));
                    } else {
                        bool = null;
                    }
                    if (C89219l.m154714a((Object) bool, (Object) true)) {
                        mo92998d(true);
                    }
                } else if (m102013c()) {
                    m102012b(this.f128054t);
                    List<IMContact> a = m102009a();
                    if (!a.isEmpty()) {
                        mo92997a(a, str, z);
                    }
                }
            } else {
                this.f128048n.setValue(Integer.valueOf((int) R.string.cey));
            }
        }
    }

    /* renamed from: a */
    public final void mo92997a(List<? extends IMContact> list, String str, boolean z) {
        boolean z2;
        C89219l.m154721d(list, "");
        this.f128046k.setValue(true);
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        AbstractC56263a aVar = this.f128045j;
        if (aVar != null) {
            aVar.mo92901b(this.f128044i);
        }
        C55946a.m101789a(this.f128044i, list);
        m102010a(this.f128044i, C55191a.m100904a(list));
        C56142d dVar = new C56142d(this, str, list, uuid);
        boolean z3 = !C89070n.m154544a((Iterable<?>) list, IMConversation.class).isEmpty();
        SharePackage sharePackage = this.f128044i;
        if (z3 || !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        C55949a.m101804a((List<IMContact>) list, str, sharePackage, uuid, z2, (AbstractC55947a) dVar);
        if (C55339a.m101149a(this.f128044i)) {
            C54603a.m100101a(list.size());
        }
    }

    public /* synthetic */ ShareTextBoxViewModel(SharePackage sharePackage, AbstractC56264b bVar, AbstractC55948b bVar2, C1213t tVar, C55967b bVar3) {
        this(sharePackage, null, bVar, bVar2, tVar, bVar3, false);
    }

    public ShareTextBoxViewModel(SharePackage sharePackage, AbstractC56263a aVar, AbstractC56264b bVar, AbstractC55948b bVar2, C1213t<Boolean> tVar, C55967b bVar3, boolean z) {
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(bVar3, "");
        this.f128044i = sharePackage;
        this.f128045j = aVar;
        this.f128055u = bVar;
        this.f128056v = bVar2;
        this.f128046k = tVar;
        C1213t<Integer> tVar2 = new C1213t<>();
        this.f128048n = tVar2;
        this.f128036a = tVar2;
        C1213t<C56143a> tVar3 = new C1213t<>();
        this.f128049o = tVar3;
        this.f128037b = tVar3;
        C1213t<C56144b> tVar4 = new C1213t<>();
        this.f128050p = tVar4;
        this.f128038c = tVar4;
        C1213t<Float> tVar5 = new C1213t<>();
        this.f128051q = tVar5;
        this.f128039d = tVar5;
        C1213t<Boolean> tVar6 = new C1213t<>();
        this.f128052r = tVar6;
        this.f128040e = tVar6;
        C1213t<List<User>> tVar7 = new C1213t<>();
        this.f128053s = tVar7;
        this.f128041f = tVar7;
        C12249d<Boolean> dVar = new C12249d<>();
        this.f128042g = dVar;
        this.f128043h = dVar;
        this.f128054t = C89086z.INSTANCE;
        if (C55213i.m100955a()) {
            C56055a aVar2 = new C56055a(bVar3, sharePackage, this, z);
            aVar2.mo92917c();
            this.f128047m = aVar2;
        }
    }
}
