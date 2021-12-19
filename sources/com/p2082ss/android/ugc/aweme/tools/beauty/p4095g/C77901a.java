package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.tools.beauty.data.BeautySyncData;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.a */
public final class C77901a {

    /* renamed from: a */
    static final Keva f174776a;

    /* renamed from: b */
    static final List<BeautySyncData> f174777b = new ArrayList();

    /* renamed from: c */
    public static AbstractC78051c f174778c;

    /* renamed from: d */
    public static final C77901a f174779d = new C77901a();

    private C77901a() {
    }

    static {
        Covode.recordClassIndex(90990);
        Keva repo = Keva.getRepo("ulike_repo");
        C89219l.m154716b(repo, "");
        f174776a = repo;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.a$a */
    static final class C77902a extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        public static final C77902a f174780a = new C77902a();

        static {
            Covode.recordClassIndex(90991);
        }

        C77902a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            m136038a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m136038a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            C77901a.f174777b.add(new BeautySyncData(composerBeauty.getEffect().getEffectId(), composerBeauty.getEffect().getResourceId(), composerBeauty.getCategoryId(), composerBeauty.getParentId()));
        }
    }

    /* renamed from: a */
    static BeautySyncData m136036a(String str) {
        List<BeautySyncData> list;
        T t;
        if (!TextUtils.isEmpty(str) && (list = f174777b) != null && !list.isEmpty() && list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.getEffectId(), (Object) str)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }

    /* renamed from: a */
    static void m136037a(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (T t : set) {
            if (C89361p.m154929e((CharSequence) t, (CharSequence) "key_selected_album")) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList<String[]> arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            Object[] objArr = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            C41093a.m82765c("convert selected key:".concat(String.valueOf(str)));
            List c = C89361p.m154921c(str, new String[]{"_"});
            if (c.size() < 6) {
                C41093a.m82764b("bad selected key:".concat(String.valueOf(str)));
            } else {
                Object obj = c.get(0);
                if (C89219l.m154714a((Object) "live", obj)) {
                    C41093a.m82764b("not record selected key:".concat(String.valueOf(str)));
                } else {
                    objArr = new String[]{str, obj, "key_selected_album", c.get(5)};
                }
            }
            arrayList3.add(objArr);
        }
        for (String[] strArr : arrayList3) {
            if (!(strArr == null || strArr.length == 0 || strArr.length != 4)) {
                String str2 = strArr[0];
                BeautySyncData a = m136036a(strArr[3]);
                if (a != null) {
                    String str3 = strArr[1] + '_' + strArr[2] + '_' + a.getResourceId();
                    Keva keva = f174776a;
                    if (!keva.contains(str3)) {
                        String string = keva.getString(str2, "");
                        C89219l.m154716b(string, "");
                        BeautySyncData a2 = m136036a(string);
                        if (a2 != null) {
                            keva.storeString(str3, a2.getResourceId());
                            C41093a.m82765c("convert selected key:" + str3 + " val:" + a2.getResourceId());
                        }
                    }
                }
            }
        }
    }
}
