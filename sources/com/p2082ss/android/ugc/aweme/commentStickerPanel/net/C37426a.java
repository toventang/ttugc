package com.p2082ss.android.ugc.aweme.commentStickerPanel.net;

import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37355b;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37356c;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37358e;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37364k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.a */
public final class C37426a {

    /* renamed from: a */
    public static CommentStickerPanelRequestApi f88331a = new CommentStickerPanelRequestApi();

    /* renamed from: b */
    public static final List<CommentVideoModel> f88332b;

    /* renamed from: c */
    public static final List<CommentVideoModel> f88333c;

    /* renamed from: d */
    public static boolean f88334d;

    /* renamed from: e */
    public static final C2563k<Boolean> f88335e = new C2563k<>();

    /* renamed from: f */
    public static String f88336f;

    /* renamed from: g */
    public static final C37426a f88337g = new C37426a();

    /* renamed from: h */
    private static final C2564l<List<Object>> f88338h;

    /* renamed from: i */
    private static final C2564l<List<Object>> f88339i;

    private C37426a() {
    }

    /* renamed from: a */
    public static boolean m75469a() {
        return f88332b.isEmpty();
    }

    /* renamed from: b */
    public static boolean m75470b() {
        return f88333c.isEmpty();
    }

    static {
        Covode.recordClassIndex(44811);
        ArrayList arrayList = new ArrayList();
        f88332b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f88333c = arrayList2;
        f88338h = new C2564l<>(arrayList);
        f88339i = new C2564l<>(arrayList2);
    }

    /* renamed from: a */
    public static CommentVideoModel m75468a(C37355b bVar) {
        String str;
        String str2;
        C89219l.m154721d(bVar, "");
        C37364k kVar = bVar.f88132a;
        UrlModel urlModel = null;
        if (kVar != null) {
            str = kVar.f88161a;
        } else {
            str = null;
        }
        C37364k kVar2 = bVar.f88132a;
        if (kVar2 != null) {
            str2 = kVar2.f88162b;
        } else {
            str2 = null;
        }
        C37364k kVar3 = bVar.f88132a;
        if (kVar3 != null) {
            urlModel = kVar3.f88163c;
        }
        return new CommentVideoModel(str, str2, urlModel, bVar.f88133b, bVar.f88134c, bVar.f88135d, bVar.f88138g, bVar.f88136e, bVar.f88137f, 0, null, 0, 0, null, null, null, 65024, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.a$b */
    public static final class C37428b extends AbstractC89220m implements AbstractC89172b<C37358e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f88341a;

        static {
            Covode.recordClassIndex(44813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37428b(AbstractC89172b bVar) {
            super(1);
            this.f88341a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37358e eVar) {
            Integer num;
            List<C37355b> list;
            C37358e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            List<C37356c> list2 = eVar2.f88148b;
            if (!(list2 == null || list2.size() != 1 || (num = list2.get(0).f88143e) == null || num.intValue() != 1 || (list = list2.get(0).f88139a) == null)) {
                List<CommentVideoModel> list3 = C37426a.f88333c;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C37426a.m75468a(it.next()));
                }
                list3.addAll(arrayList);
            }
            AbstractC89172b bVar = this.f88341a;
            if (bVar != null) {
                bVar.invoke(eVar2);
            }
            C37426a.f88335e.mo6999a((Boolean) true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.a$a */
    public static final class C37427a extends AbstractC89220m implements AbstractC89172b<C37358e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f88340a;

        static {
            Covode.recordClassIndex(44812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37427a(AbstractC89172b bVar) {
            super(1);
            this.f88340a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37358e eVar) {
            List<C37355b> list;
            C37358e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            List<C37356c> list2 = eVar2.f88148b;
            if (list2 != null) {
                for (C37356c cVar : list2) {
                    Integer num = cVar.f88143e;
                    if (num != null) {
                        if (num.intValue() == 1) {
                            List<C37355b> list3 = cVar.f88139a;
                            if (list3 != null) {
                                List<CommentVideoModel> list4 = C37426a.f88333c;
                                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list3, 10));
                                Iterator<T> it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(C37426a.m75468a(it.next()));
                                }
                                list4.addAll(arrayList);
                                C37426a.f88334d = true;
                            }
                        } else if (num.intValue() == 2 && (list = cVar.f88139a) != null) {
                            List<CommentVideoModel> list5 = C37426a.f88332b;
                            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(C37426a.m75468a(it2.next()));
                            }
                            list5.addAll(arrayList2);
                            C37426a.f88334d = true;
                        }
                    }
                }
                C37426a.f88335e.mo6999a((Boolean) true);
            }
            this.f88340a.invoke(eVar2);
            return C89391z.f203057a;
        }
    }
}
