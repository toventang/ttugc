package com.p2082ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.experiment.C46847dp;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.multi.maker.C60216a;
import com.p2082ss.android.ugc.aweme.multi.maker.C60221b;
import com.p2082ss.android.ugc.aweme.multi.maker.C60222c;
import com.p2082ss.android.ugc.aweme.multi.maker.C60230d;
import com.p2082ss.android.ugc.aweme.multi.maker.C60235f;
import com.p2082ss.android.ugc.aweme.multi.maker.C60239g;
import com.p2082ss.android.ugc.aweme.multi.maker.C60240h;
import com.p2082ss.android.ugc.aweme.multi.maker.C60245i;
import com.p2082ss.android.ugc.aweme.multi.maker.C60248j;
import com.p2082ss.android.ugc.aweme.multi.maker.C60252k;
import com.p2082ss.android.ugc.aweme.multi.maker.C60253l;
import com.p2082ss.android.ugc.aweme.multi.maker.C60257m;
import com.p2082ss.android.ugc.aweme.multi.maker.C60265n;
import com.p2082ss.android.ugc.aweme.multi.maker.C60273p;
import com.p2082ss.android.ugc.aweme.multi.maker.C60280q;
import com.p2082ss.android.ugc.aweme.multi.maker.C60283r;
import com.p2082ss.android.ugc.aweme.multi.maker.C60287s;
import com.p2082ss.android.ugc.aweme.multi.maker.C60289t;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.h */
public final class C60207h {

    /* renamed from: a */
    public static final C60207h f137242a = new C60207h();

    private C60207h() {
    }

    static {
        Covode.recordClassIndex(70736);
    }

    /* renamed from: a */
    public static ArrayList<AnchorCommonStruct> m109760a(List<AnchorCommonStruct> list) {
        C89219l.m154721d(list, "");
        ArrayList<AnchorCommonStruct> arrayList = new ArrayList<>();
        for (T t : list) {
            if (!m109762a(t, arrayList)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.h$a */
    public static final class C60208a<T> implements Comparator {
        static {
            Covode.recordClassIndex(70737);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.mo97873c()), Integer.valueOf(t2.mo97873c()));
        }
    }

    /* renamed from: a */
    private static boolean m109762a(AnchorCommonStruct anchorCommonStruct, List<AnchorCommonStruct> list) {
        for (T t : list) {
            if (t != null) {
                if (!C46847dp.m90162a() || C80580in.m139689d()) {
                    if (C89219l.m154714a((Object) anchorCommonStruct.getId(), (Object) t.getId()) && C89219l.m154714a((Object) anchorCommonStruct.getKeyword(), (Object) t.getKeyword()) && anchorCommonStruct.getType() == EnumC31359ab.PROP.getTYPE()) {
                    }
                } else if (C89219l.m154714a((Object) anchorCommonStruct.getId(), (Object) t.getId()) && C89219l.m154714a((Object) anchorCommonStruct.getKeyword(), (Object) t.getKeyword())) {
                    if ((C60273p.C60274a.m109958a(anchorCommonStruct.getExtra()) == 3 || C60273p.C60274a.m109958a(t.getExtra()) == 3) && !C89219l.m154714a((Object) anchorCommonStruct.getExtra(), (Object) t.getExtra())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<AbstractC60201c> m109761a(Aweme aweme, boolean z, AbstractC60200b bVar) {
        AbstractC60201c cVar;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(bVar, "");
        ArrayList<AbstractC60201c> d = C89070n.m154525d(new C60253l(), new C60257m(), new C60283r(), new C60289t(), new C60287s(), new C60245i(), new C60239g(), new C60273p(), new C60221b(), new C60235f(), new C60240h(), new C60248j(), new C60252k(), new C60265n(), new C60230d(), new C60280q(), new C60222c(), new C60216a());
        ArrayList arrayList = new ArrayList();
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null) {
            anchors = C89086z.INSTANCE;
        }
        ArrayList<AnchorCommonStruct> a = m109760a(new ArrayList(anchors));
        for (AbstractC60201c cVar2 : d) {
            if (!a.isEmpty()) {
                if (!(cVar2 instanceof AbstractC60189a)) {
                    cVar = null;
                } else {
                    cVar = cVar2;
                }
                AbstractC60189a aVar = (AbstractC60189a) cVar;
                if (aVar != null) {
                    aVar.f137204b = z;
                }
                cVar2.mo97869a(bVar);
                EnumC60206g a2 = cVar2.mo97888a(a);
                while (a2 == EnumC60206g.PROCEED) {
                    arrayList.add(cVar2);
                    cVar2 = cVar2.mo97897i();
                    cVar2.mo97869a(bVar);
                    a2 = cVar2.mo97888a(a);
                }
                if (a2 == EnumC60206g.DONE) {
                    arrayList.add(cVar2);
                }
            }
        }
        return C89070n.m154585g((Collection) C89070n.m154553a((Iterable) arrayList, (Comparator) new C60208a()));
    }
}
