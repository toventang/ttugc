package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel */
public final class ShareDialogViewModel extends AbstractC1174ac {

    /* renamed from: j */
    public static final C56165a f128110j = new C56165a((byte) 0);

    /* renamed from: a */
    public final LiveData<String> f128111a;

    /* renamed from: b */
    public final LiveData<List<IMContact>> f128112b;

    /* renamed from: c */
    public final LiveData<List<IMContact>> f128113c;

    /* renamed from: d */
    public final C1213t<List<IMContact>> f128114d;

    /* renamed from: e */
    public final C1213t<Boolean> f128115e;

    /* renamed from: f */
    public final C1213t<Boolean> f128116f;

    /* renamed from: g */
    public final C1213t<Boolean> f128117g;

    /* renamed from: h */
    public final LiveData<Boolean> f128118h;

    /* renamed from: i */
    public final AbstractC55960b f128119i;

    /* renamed from: k */
    private final AbstractC89244h f128120k;

    /* renamed from: l */
    private final C1213t<Integer> f128121l;

    /* renamed from: m */
    private final List<IMContact> f128122m;

    /* renamed from: n */
    private final SharePackage f128123n;

    /* renamed from: o */
    private final AbstractC56264b f128124o;

    static {
        Covode.recordClassIndex(65966);
    }

    /* renamed from: a */
    public final Set<String> mo93013a() {
        return (Set) this.f128120k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel$a */
    public static final class C56165a {
        static {
            Covode.recordClassIndex(65967);
        }

        private C56165a() {
        }

        public /* synthetic */ C56165a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel$b */
    static final class C56166b extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C56166b f128125a = new C56166b();

        static {
            Covode.recordClassIndex(65968);
        }

        C56166b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: d */
    public final void mo93018d() {
        this.f128119i.mo92832d();
    }

    /* renamed from: c */
    public final String mo93017c() {
        String value = this.f128111a.getValue();
        if (value == null) {
            return "";
        }
        return value;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f128119i.mo92834f();
    }

    /* renamed from: b */
    public final boolean mo93016b() {
        Integer value = this.f128121l.getValue();
        if (value != null && value.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo93014a(int i) {
        this.f128121l.setValue(Integer.valueOf(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel$c */
    static final class C56167c<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ ShareDialogViewModel f128126a;

        static {
            Covode.recordClassIndex(65969);
        }

        C56167c(ShareDialogViewModel shareDialogViewModel) {
            this.f128126a = shareDialogViewModel;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            boolean z;
            int i;
            List list = (List) obj;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                IMContact iMContact = (IMContact) next;
                if ((iMContact instanceof IMUser) && ((IMUser) iMContact).getFollowStatus() == 2) {
                    arrayList.add(next);
                }
            }
            List n = C89070n.m154594n(arrayList);
            Iterator it2 = n.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                IMContact iMContact2 = (IMContact) next2;
                if ((iMContact2 instanceof IMUser) && IMUser.isSelf(((IMUser) iMContact2).getUid())) {
                    if (next2 != null) {
                        i = n.size() - 1;
                    }
                }
            }
            i = n.size();
            if (i <= 3 && !C51648a.f118980a.mo87338r()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static List<IMContact> m102030a(List<IMContact> list) {
        C89219l.m154721d(list, "");
        if (C56202c.m102111a()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<IMContact> it = list.iterator();
            while (it.hasNext()) {
                IMContact next = it.next();
                if (next instanceof IMConversation) {
                    it.remove();
                    arrayList.add(next);
                } else if (!(!(next instanceof IMUser) || next.getType() == 0 || next.getType() == 3)) {
                    it.remove();
                    arrayList2.add(next);
                }
            }
            list.addAll(0, arrayList);
            list.addAll(0, arrayList2);
        }
        return list;
    }

    /* renamed from: b */
    public final void mo93015b(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        this.f128114d.setValue(list);
        ArrayList<IMContact> arrayList = new ArrayList();
        for (T t : list) {
            if (!this.f128122m.contains(t)) {
                arrayList.add(t);
            }
        }
        for (IMContact iMContact : arrayList) {
            m102031a(iMContact);
        }
        this.f128122m.clear();
        this.f128122m.addAll(list);
    }

    /* renamed from: a */
    private final void m102031a(IMContact iMContact) {
        IMContact iMContact2;
        String str;
        int i;
        SharePackage sharePackage = this.f128123n;
        if (!mo93016b()) {
            List<IMContact> value = this.f128113c.getValue();
            if (value != null) {
                i = value.indexOf(iMContact);
            } else {
                i = 0;
            }
            sharePackage.f155492i.putInt("rank_num", i);
        }
        Bundle bundle = sharePackage.f155492i;
        StringBuilder sb = new StringBuilder();
        boolean z = iMContact instanceof IMUser;
        Integer num = null;
        if (!z) {
            iMContact2 = null;
        } else {
            iMContact2 = iMContact;
        }
        IMUser iMUser = (IMUser) iMContact2;
        if (iMUser != null) {
            num = Integer.valueOf(iMUser.getFollowStatus());
        }
        bundle.putString("relation_tag", sb.append(String.valueOf(num)).toString());
        sharePackage.f155492i.remove("rank_num");
        AbstractC56264b bVar = this.f128124o;
        if (bVar != null) {
            bVar.mo90147a("chat_mergeIM", sharePackage);
        }
        C55708a.m101453a(C55708a.f127082a, sharePackage, iMContact, false, "chat_list", 0, null, null, 112);
        if (C55339a.m101149a(this.f128123n)) {
            if (z) {
                str = "user";
            } else {
                str = "group";
            }
            C54603a.m100113c(str);
        }
    }

    public /* synthetic */ ShareDialogViewModel(SharePackage sharePackage, AbstractC55960b bVar) {
        this(sharePackage, bVar, null);
    }

    public ShareDialogViewModel(SharePackage sharePackage, AbstractC55960b bVar, AbstractC56264b bVar2) {
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(bVar, "");
        this.f128123n = sharePackage;
        this.f128119i = bVar;
        this.f128124o = bVar2;
        this.f128120k = C89250i.m154773a((AbstractC89171a) C56166b.f128125a);
        this.f128111a = bVar.mo92828a();
        this.f128112b = bVar.mo92830b();
        LiveData<List<IMContact>> c = bVar.mo92831c();
        this.f128113c = c;
        this.f128114d = new C1213t<>();
        this.f128115e = new C1213t<>();
        this.f128116f = new C1213t<>();
        this.f128117g = new C1213t<>();
        LiveData<Boolean> a = C1169aa.m3869a(c, new C56167c(this));
        C89219l.m154716b(a, "");
        this.f128118h = a;
        this.f128121l = new C1213t<>();
        this.f128122m = new ArrayList();
    }
}
