package com.p2082ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41225a;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41227b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.z */
public final class C41321z implements AbstractC41239l, AbstractC41262aa, AbstractC41262aa.AbstractC41263a, AbstractC41262aa.AbstractC41264b, AbstractC56190b.AbstractC56191a {

    /* renamed from: a */
    public static final C41322a f96432a = new C41322a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f96433b = C89250i.m154773a((AbstractC89171a) new C41323b(this));

    /* renamed from: c */
    private final AbstractC89244h f96434c = C89250i.m154773a((AbstractC89171a) C41324c.f96447a);

    /* renamed from: d */
    private final AbstractC89244h f96435d = C89250i.m154773a((AbstractC89171a) C41325d.f96448a);

    /* renamed from: e */
    private int f96436e = 1;

    /* renamed from: f */
    private AbstractC56190b.C56193c f96437f;

    /* renamed from: g */
    private boolean f96438g;

    /* renamed from: h */
    private boolean f96439h;

    /* renamed from: i */
    private AbstractC41267ad f96440i;

    /* renamed from: j */
    private long f96441j;

    /* renamed from: k */
    private boolean f96442k = true;

    /* renamed from: l */
    private final AbstractC56190b f96443l;

    /* renamed from: m */
    private final Aweme f96444m;

    /* renamed from: n */
    private final boolean f96445n;

    static {
        Covode.recordClassIndex(49209);
    }

    /* renamed from: a */
    private final C41225a m83175a() {
        return (C41225a) this.f96433b.getValue();
    }

    /* renamed from: b */
    private final C41227b m83176b() {
        return (C41227b) this.f96434c.getValue();
    }

    /* renamed from: c */
    private final List<Aweme> m83178c() {
        return (List) this.f96435d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void bindPreLoadView(AbstractC49992x xVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return 7000;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.z$a */
    public static final class C41322a {
        static {
            Covode.recordClassIndex(49210);
        }

        private C41322a() {
        }

        public /* synthetic */ C41322a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.z$c */
    static final class C41324c extends AbstractC89220m implements AbstractC89171a<C41227b> {

        /* renamed from: a */
        public static final C41324c f96447a = new C41324c();

        static {
            Covode.recordClassIndex(49212);
        }

        C41324c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41227b invoke() {
            return new C41227b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.z$d */
    static final class C41325d extends AbstractC89220m implements AbstractC89171a<List<Aweme>> {

        /* renamed from: a */
        public static final C41325d f96448a = new C41325d();

        static {
            Covode.recordClassIndex(49213);
        }

        C41325d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<Aweme> invoke() {
            return new ArrayList();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        return m83175a();
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.z$b */
    static final class C41323b extends AbstractC89220m implements AbstractC89171a<C41225a> {

        /* renamed from: a */
        final /* synthetic */ C41321z f96446a;

        static {
            Covode.recordClassIndex(49211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41323b(C41321z zVar) {
            super(0);
            this.f96446a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41225a invoke() {
            return new C41225a(this.f96446a.getPageType(0));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        m83178c().isEmpty();
        return m83178c().isEmpty();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        if (!this.f96438g) {
            m83176b().mo67842j();
        }
        if (this.f96438g || m83176b().mo67842j()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
        this.f96440i = null;
        m83178c().clear();
        m83176b().ck_();
        m83176b().mo67840h();
        this.f96443l.mo90213a();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void setPreLoad(boolean z) {
        this.f96439h = z;
    }

    /* renamed from: d */
    private final void m83181d(AbstractC56190b.C56193c cVar) {
        this.f96437f = cVar;
        this.f96438g = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.f96445n && this.f96444m != null) {
            this.f96442k = true;
        }
        return true;
    }

    /* renamed from: a */
    private final long m83174a(boolean z) {
        Object h;
        if (m83178c().isEmpty()) {
            return -1;
        }
        if (z) {
            h = C89070n.m154579f((List) m83178c());
        } else {
            h = C89070n.m154586h((List) m83178c());
        }
        try {
            String aid = ((Aweme) h).getAid();
            C89219l.m154716b(aid, "");
            return Long.parseLong(aid);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    private static String m83180d(List<AbstractC56190b.C56192b> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f128188a).append(",");
        }
        C89361p.m154894a((CharSequence) sb, (CharSequence) ",");
        sb.append("]");
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        this.f96440i = adVar;
        m83176b().mo67839a_(this);
        m83176b().mo67838a(m83175a());
        this.f96443l.mo90215a(this);
    }

    /* renamed from: c */
    private final void m83179c(List<Aweme> list) {
        List<AbstractC56190b.C56192b> list2;
        int i = 0;
        if (!(list == null || list.isEmpty())) {
            int size = list.size();
            AbstractC56190b.C56193c cVar = this.f96437f;
            if (!(cVar == null || (list2 = cVar.f128190a) == null || size != list2.size())) {
                AbstractC56190b.C56193c cVar2 = this.f96437f;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                List<AbstractC56190b.C56192b> list3 = cVar2.f128190a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                list.clear();
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    Aweme aweme = (Aweme) obj;
                    Aweme aweme2 = new Aweme();
                    AbstractC56190b.C56192b bVar = list3.get(i);
                    C89219l.m154714a((Object) aweme.getAid(), (Object) bVar.f128188a);
                    aweme2.setAid(String.valueOf(bVar.f128189b));
                    aweme2.setAwemeType(13);
                    aweme2.setForwardItem(aweme);
                    list.add(aweme2);
                    i = i2;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b.AbstractC56191a
    /* renamed from: a */
    public final void mo70583a(AbstractC56190b.C56193c cVar) {
        C89219l.m154721d(cVar, "");
        m83181d(cVar);
        if (cVar.f128190a.isEmpty()) {
            m83178c().clear();
            AbstractC41267ad adVar = this.f96440i;
            if (adVar != null) {
                adVar.mo59512a(m83178c(), cVar.f128191b);
                return;
            }
            return;
        }
        m83176b().mo57616a(m83180d(cVar.f128190a), "", "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b.AbstractC56191a
    /* renamed from: b */
    public final void mo70584b(AbstractC56190b.C56193c cVar) {
        C89219l.m154721d(cVar, "");
        m83181d(cVar);
        if (cVar.f128190a.isEmpty()) {
            AbstractC41267ad adVar = this.f96440i;
            if (adVar != null) {
                adVar.mo70483c(this.f96439h);
            }
            this.f96439h = false;
            AbstractC41267ad adVar2 = this.f96440i;
            if (adVar2 != null) {
                adVar2.mo59523c(m83178c(), cVar.f128191b);
                return;
            }
            return;
        }
        m83176b().mo57616a(m83180d(cVar.f128190a), "", "");
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l
    /* renamed from: c_ */
    public final void mo70484c_(Exception exc) {
        if (!(exc instanceof C34480a) || ((C34480a) exc).getErrorCode() != 2053) {
            boolean z = this.f96439h;
            this.f96437f = null;
            AbstractC41267ad adVar = this.f96440i;
            if (adVar != null) {
                adVar.mo70483c(z);
            }
            this.f96439h = false;
            if (!z) {
                int i = this.f96436e;
                if (i == 1) {
                    AbstractC41267ad adVar2 = this.f96440i;
                    if (adVar2 != null) {
                        adVar2.mo59516b(exc);
                    }
                } else if (i != 2) {
                    AbstractC41267ad adVar3 = this.f96440i;
                    if (adVar3 != null) {
                        adVar3.mo59522c(exc);
                    }
                } else {
                    AbstractC41267ad adVar4 = this.f96440i;
                    if (adVar4 != null) {
                        adVar4.mo59511a(exc);
                    }
                }
            }
        } else {
            mo70473a((List<Aweme>) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        C89219l.m154721d(str, "");
        this.f96443l.mo90216a(str);
        int size = m83178c().size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Aweme forwardItem = m83178c().get(i).getForwardItem();
            C89219l.m154716b(forwardItem, "");
            if (!TextUtils.equals(forwardItem.getAid(), str)) {
                i++;
            } else if (i >= 0) {
                m83178c().remove(i);
                this.f96441j = System.currentTimeMillis();
                AbstractC41267ad adVar = this.f96440i;
                if (adVar == null) {
                    return true;
                }
                adVar.mo62671b(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m83177b(List<Aweme> list) {
        if (this.f96437f != null) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAid());
            }
            List g = C89070n.m154585g((Collection) arrayList);
            ArrayList arrayList2 = new ArrayList();
            AbstractC56190b.C56193c cVar = this.f96437f;
            if (cVar == null) {
                C89219l.m154715b();
            }
            arrayList2.addAll(cVar.f128190a);
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                AbstractC56190b.C56192b bVar = (AbstractC56190b.C56192b) obj;
                int size = g.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        Aweme aweme = new Aweme();
                        AwemeStatus awemeStatus = new AwemeStatus();
                        aweme.setCanPlay(false);
                        awemeStatus.setDelete(true);
                        aweme.setStatus(awemeStatus);
                        User user = new User();
                        user.setAdFake(false);
                        aweme.setAuthor(user);
                        aweme.setAid(bVar.f128188a);
                        list.add(i, aweme);
                        g.add(i, bVar.f128188a);
                        break;
                    }
                    if (TextUtils.equals((CharSequence) g.get(i3), bVar.f128188a) && i == i3) {
                        break;
                    }
                    i3++;
                }
                i = i2;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l
    /* renamed from: a */
    public final void mo70473a(List<Aweme> list) {
        boolean z;
        if (list != null) {
            Integer.valueOf(list.size());
        }
        AbstractC56190b.C56193c cVar = this.f96437f;
        if (cVar != null) {
            z = cVar.f128191b;
        } else {
            z = false;
        }
        AbstractC41267ad adVar = this.f96440i;
        if (adVar != null) {
            adVar.mo70483c(this.f96439h);
        }
        this.f96439h = false;
        if (list == null) {
            list = new ArrayList<>();
        }
        m83177b(list);
        m83179c(list);
        this.f96437f = null;
        int i = this.f96436e;
        if (i == 1) {
            m83178c().clear();
            m83178c().addAll(list);
            AbstractC41267ad adVar2 = this.f96440i;
            if (adVar2 != null) {
                adVar2.mo59512a(m83178c(), z);
            }
        } else if (i != 2) {
            m83178c().addAll(list);
            AbstractC41267ad adVar3 = this.f96440i;
            if (adVar3 != null) {
                adVar3.mo59517b(m83178c(), z);
            }
        } else {
            m83178c().addAll(0, list);
            AbstractC41267ad adVar4 = this.f96440i;
            if (adVar4 != null) {
                adVar4.mo59523c(m83178c(), !list.isEmpty());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b.AbstractC56191a
    /* renamed from: c */
    public final void mo70585c(AbstractC56190b.C56193c cVar) {
        C89219l.m154721d(cVar, "");
        m83181d(cVar);
        if (cVar.f128190a.isEmpty()) {
            AbstractC41267ad adVar = this.f96440i;
            if (adVar != null) {
                adVar.mo70483c(this.f96439h);
            }
            this.f96439h = false;
            AbstractC41267ad adVar2 = this.f96440i;
            if (adVar2 != null) {
                adVar2.mo59517b(m83178c(), cVar.f128191b);
                return;
            }
            return;
        }
        m83176b().mo57616a(m83180d(cVar.f128190a), "", "");
    }

    public C41321z(AbstractC56190b bVar, Aweme aweme, boolean z) {
        C89219l.m154721d(bVar, "");
        this.f96443l = bVar;
        this.f96444m = aweme;
        this.f96445n = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        if (!isLoading() && System.currentTimeMillis() - this.f96441j >= 500) {
            AbstractC41267ad adVar = this.f96440i;
            if (adVar != null) {
                adVar.mo70483c(this.f96439h);
            }
            this.f96436e = i;
            this.f96438g = true;
            if (this.f96445n && this.f96442k && this.f96444m != null) {
                this.f96442k = false;
                m83181d(this.f96443l.mo90219c());
                ArrayList arrayList = new ArrayList();
                Aweme aweme = this.f96444m;
                if (aweme == null) {
                    C89219l.m154715b();
                }
                arrayList.add(aweme);
                mo70473a(arrayList);
            } else if (i == 1) {
                this.f96443l.mo90217b();
            } else if (i != 2) {
                this.f96443l.mo90214a(m83174a(false));
            } else {
                this.f96443l.mo90218b(m83174a(true));
            }
        }
    }
}
