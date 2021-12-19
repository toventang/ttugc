package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17445c;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17432d;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c */
public final class C53647c implements AbstractC17425d, AbstractC56190b {

    /* renamed from: a */
    public static final C53648a f123085a = new C53648a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f123086b = C89250i.m154773a((AbstractC89171a) C53649b.f123097a);

    /* renamed from: c */
    private final List<C19538ai> f123087c;

    /* renamed from: d */
    private final AbstractC89244h f123088d = C89250i.m154773a((AbstractC89171a) C53650c.f123098a);

    /* renamed from: e */
    private AbstractC17432d f123089e;

    /* renamed from: f */
    private int f123090f;

    /* renamed from: g */
    private final long f123091g;

    /* renamed from: h */
    private boolean f123092h;

    /* renamed from: i */
    private boolean f123093i;

    /* renamed from: j */
    private AbstractC56190b.AbstractC56191a f123094j;

    /* renamed from: k */
    private final String f123095k;

    /* renamed from: l */
    private final C19538ai f123096l;

    static {
        Covode.recordClassIndex(63227);
    }

    /* renamed from: d */
    private final HashSet<String> m98904d() {
        return (HashSet) this.f123086b.getValue();
    }

    /* renamed from: e */
    private final List<C19538ai> m98905e() {
        return (List) this.f123088d.getValue();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27789a(int i, C19538ai aiVar) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27790a(int i, C19538ai aiVar, C19600ay ayVar) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27791a(int i, C19587an anVar) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27792a(C19538ai aiVar) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27793a(C19538ai aiVar, Map map, Map map2) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27794a(C19538ai aiVar, boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c$a */
    public static final class C53648a {
        static {
            Covode.recordClassIndex(63228);
        }

        private C53648a() {
        }

        public /* synthetic */ C53648a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b
    /* renamed from: a */
    public final void mo90216a(String str) {
        C89219l.m154721d(str, "");
        m98904d().add(str);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27795a(List<C19538ai> list, int i, C19593ar arVar) {
        C89219l.m154721d(arVar, "");
        C56244a.m102190b("IMAwemeIdProvider", "onGetMessage: " + (list != null ? Integer.valueOf(list.size()) : null) + ' ' + i + "  " + arVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27796a(List<C19538ai> list, int i, String str) {
        C56244a.m102190b("IMAwemeIdProvider", "onQueryMessage: " + (list != null ? Integer.valueOf(list.size()) : null));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27798a(List<C19538ai> list, boolean z) {
        C56244a.m102190b("IMAwemeIdProvider", "onLoadOlder: " + (list != null ? Integer.valueOf(list.size()) : null) + ", " + m98905e().size() + ", " + z);
        if (z) {
            this.f123093i = list != null && !list.isEmpty() && list.size() >= 7;
            List<C19538ai> g = C89070n.m154584g((Iterable) m98901a(list));
            if (g != null && !g.isEmpty()) {
                m98905e().addAll(0, g);
            }
            AbstractC56190b.AbstractC56191a aVar = this.f123094j;
            if (aVar != null) {
                aVar.mo70584b(m98903c(g, this.f123093i));
            }
            this.f123090f = 0;
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27797a(List<C19538ai> list, Map<String, Map<String, String>> map) {
        C56244a.m102190b("IMAwemeIdProvider", "onUpdateMessage: " + (list != null ? Integer.valueOf(list.size()) : null));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c$b */
    static final class C53649b extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C53649b f123097a = new C53649b();

        static {
            Covode.recordClassIndex(63229);
        }

        C53649b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c$c */
    static final class C53650c extends AbstractC89220m implements AbstractC89171a<List<C19538ai>> {

        /* renamed from: a */
        public static final C53650c f123098a = new C53650c();

        static {
            Covode.recordClassIndex(63230);
        }

        C53650c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C19538ai> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: f */
    private final boolean m98906f() {
        if (this.f123090f != 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b
    /* renamed from: a */
    public final void mo90213a() {
        C56244a.m102190b("IMAwemeIdProvider", "unregister");
        AbstractC17432d dVar = this.f123089e;
        if (dVar != null) {
            dVar.mo27753a();
        }
        m98905e().clear();
        this.f123090f = 0;
        this.f123094j = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b
    /* renamed from: b */
    public final void mo90217b() {
        C56244a.m102190b("IMAwemeIdProvider", "refresh");
        if (!m98906f()) {
            boolean z = true;
            List<C19538ai> a = m98900a(this.f123091g, 1);
            boolean z2 = false;
            if ((!a.isEmpty()) && (!m98905e().isEmpty())) {
                if (m98905e().indexOf(C89070n.m154586h((List) a)) >= m98905e().size() - 1) {
                    z = false;
                }
                z2 = z;
            }
            AbstractC56190b.AbstractC56191a aVar = this.f123094j;
            if (aVar != null) {
                aVar.mo70583a(m98903c(a, z2));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b
    /* renamed from: c */
    public final AbstractC56190b.C56193c mo90219c() {
        AbstractC56190b.C56192b bVar;
        ArrayList<C19538ai> arrayList = new ArrayList();
        arrayList.add(this.f123096l);
        ArrayList arrayList2 = new ArrayList();
        for (C19538ai aiVar : arrayList) {
            BaseContent b = EnumC53772b.C53814f.m99071b(aiVar);
            BaseContent baseContent = null;
            if (b instanceof ShareAwemeContent) {
                baseContent = b;
            }
            if (baseContent != null) {
                ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b;
                if (!m98904d().contains(shareAwemeContent.getItemId())) {
                    String itemId = shareAwemeContent.getItemId();
                    C89219l.m154716b(itemId, "");
                    bVar = new AbstractC56190b.C56192b(itemId, aiVar.getIndex());
                }
            } else if ((b instanceof CommentContent) && b != null) {
                CommentContent commentContent = (CommentContent) b;
                if (!m98904d().contains(commentContent.getAwemeId())) {
                    String awemeId = commentContent.getAwemeId();
                    C89219l.m154716b(awemeId, "");
                    bVar = new AbstractC56190b.C56192b(awemeId, aiVar.getIndex());
                }
            }
            arrayList2.add(bVar);
        }
        ArrayList arrayList3 = arrayList2;
        boolean z = true;
        boolean z2 = false;
        if ((!arrayList.isEmpty()) && (!m98905e().isEmpty())) {
            if (m98905e().indexOf(C89070n.m154586h((List) arrayList)) >= m98905e().size() - 1) {
                z = false;
            }
            z2 = z;
        }
        return new AbstractC56190b.C56193c(arrayList3, z2);
    }

    /* renamed from: c */
    private final int m98902c(long j) {
        int i = 0;
        for (T t : m98905e()) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (t.getIndex() == j) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: a */
    private static List<C19538ai> m98901a(List<C19538ai> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if ((t2.getMsgType() == 8 || t2.getMsgType() == 40) && !t2.isRecalled() && !t2.isDeleted()) {
                arrayList.add(t);
            }
        }
        return C89070n.m154585g((Collection) arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b
    /* renamed from: b */
    public final void mo90218b(long j) {
        C56244a.m102190b("IMAwemeIdProvider", "loadOlder: " + j + ", " + this.f123093i);
        if (!m98906f()) {
            List<C19538ai> a = m98900a(j, 2);
            if (!a.isEmpty()) {
                AbstractC56190b.AbstractC56191a aVar = this.f123094j;
                if (aVar != null) {
                    aVar.mo70584b(m98903c(a, true));
                }
            } else if (this.f123093i) {
                this.f123090f = 2;
                AbstractC17432d dVar = this.f123089e;
                if (dVar != null) {
                    dVar.mo27755b();
                }
            } else {
                AbstractC56190b.AbstractC56191a aVar2 = this.f123094j;
                if (aVar2 != null) {
                    aVar2.mo70584b(m98903c(null, false));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b
    /* renamed from: a */
    public final void mo90214a(long j) {
        C56244a.m102190b("IMAwemeIdProvider", "loadNewer: " + j + ", " + this.f123092h);
        if (!m98906f()) {
            List<C19538ai> a = m98900a(j, 3);
            boolean z = true;
            boolean z2 = false;
            if ((!a.isEmpty()) && (!m98905e().isEmpty())) {
                if (m98905e().indexOf(C89070n.m154586h((List) a)) >= m98905e().size() - 1) {
                    z = false;
                }
                z2 = z;
            }
            AbstractC56190b.AbstractC56191a aVar = this.f123094j;
            if (aVar != null) {
                aVar.mo70585c(m98903c(a, z2));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b
    /* renamed from: a */
    public final void mo90215a(AbstractC56190b.AbstractC56191a aVar) {
        C89219l.m154721d(aVar, "");
        C56244a.m102190b("IMAwemeIdProvider", "register: startIndex: " + this.f123091g);
        String str = this.f123095k;
        C89219l.m154721d(str, "");
        AbstractC17432d a = C17445c.f41787a.mo27876a(str, new int[]{8});
        a.mo27754a(this);
        a.mo27756c().addAll(this.f123087c);
        this.f123089e = a;
        List<C19538ai> list = this.f123087c;
        m98905e().clear();
        if (list != null && !list.isEmpty()) {
            m98905e().addAll(C89070n.m154584g((Iterable) list));
        }
        this.f123092h = true;
        this.f123093i = true;
        this.f123094j = aVar;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: b */
    public final void mo27799b(List<C19538ai> list, boolean z) {
        Integer num;
        StringBuilder sb = new StringBuilder("onLoadNewer: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C56244a.m102190b("IMAwemeIdProvider", sb.append(num).toString());
    }

    /* renamed from: a */
    private final List<C19538ai> m98900a(long j, int i) {
        int i2;
        if (m98905e().size() <= 0) {
            return new ArrayList();
        }
        int c = m98902c(j);
        if (c < 0) {
            return new ArrayList();
        }
        int size = m98905e().size();
        if (i == 1) {
            int max = Math.max(0, c - 3);
            c = Math.min(max + 7, size);
            i2 = Math.min(max, Math.max(0, c - 7));
            return m98905e().subList(i2, c);
        } else if (i != 2) {
            if (i == 3 && c != size - 1) {
                i2 = c + 1;
                c = Math.min(i2 + 7, size);
                if (i2 >= 0 && c >= 0) {
                    return m98905e().subList(i2, c);
                }
            }
        } else if (c != 0) {
            i2 = Math.max(0, c - 7);
            return m98905e().subList(i2, c);
        }
        return new ArrayList();
    }

    /* renamed from: c */
    private final AbstractC56190b.C56193c m98903c(List<C19538ai> list, boolean z) {
        AbstractC56190b.C56192b bVar;
        CommentContent commentContent;
        String awemeId;
        C56244a.m102190b("IMAwemeIdProvider", new StringBuilder("packResponse: ").append(list != null ? Integer.valueOf(list.size()) : null).toString());
        if (list == null || list.isEmpty()) {
            return new AbstractC56190b.C56193c(C89086z.INSTANCE, z);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            BaseContent b = EnumC53772b.C53814f.m99071b(t);
            if ((!(b instanceof ShareAwemeContent) ? null : b) != null) {
                ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b;
                String itemId = shareAwemeContent.getItemId();
                if (!(itemId == null || itemId.length() == 0 || m98904d().contains(shareAwemeContent.getItemId()))) {
                    String itemId2 = shareAwemeContent.getItemId();
                    C89219l.m154716b(itemId2, "");
                    bVar = new AbstractC56190b.C56192b(itemId2, t.getIndex());
                }
            } else if (!(!(b instanceof CommentContent) || b == null || (awemeId = (commentContent = (CommentContent) b).getAwemeId()) == null || awemeId.length() == 0 || m98904d().contains(commentContent.getAwemeId()))) {
                String awemeId2 = commentContent.getAwemeId();
                C89219l.m154716b(awemeId2, "");
                bVar = new AbstractC56190b.C56192b(awemeId2, t.getIndex());
            }
            arrayList.add(bVar);
        }
        return new AbstractC56190b.C56193c(arrayList, z);
    }

    public C53647c(String str, C19538ai aiVar, List<C19538ai> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(list, "");
        this.f123095k = str;
        this.f123096l = aiVar;
        this.f123091g = aiVar.getIndex();
        this.f123092h = true;
        this.f123093i = true;
        this.f123087c = m98901a(list);
    }
}
