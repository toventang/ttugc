package com.p2082ss.android.ugc.aweme.shortvideo.p3836i;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.f */
public final class C71879f extends C71876c implements AbstractC71874a {

    /* renamed from: a */
    public static final C71880a f161066a = new C71880a((byte) 0);

    /* renamed from: b */
    private final Keva f161067b = Keva.getRepo("CameraFilterStrategy_Repo");

    static {
        Covode.recordClassIndex(84428);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.f$a */
    public static final class C71880a {
        static {
            Covode.recordClassIndex(84429);
        }

        private C71880a() {
        }

        public /* synthetic */ C71880a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71876c
    /* renamed from: c */
    public final int mo113529c() {
        return C63244g.m114602a().mo73277e().getFrontCameraFilter(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71874a
    /* renamed from: b */
    public final boolean mo113523b() {
        return !C89219l.m154714a((Object) this.f161067b.getString("CameraFilter_Selected_Filter", ""), (Object) "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71874a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo113521a() {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71879f.mo113521a():java.lang.String");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71874a
    /* renamed from: a */
    public final void mo113522a(String str) {
        C89219l.m154721d(str, "");
        this.f161067b.storeString("CameraFilter_Selected_Filter", str);
    }

    /* renamed from: a */
    private static FilterBean m126936a(AbstractC50707o oVar) {
        Collection collection;
        List list;
        FilterBean filterBean;
        Map.Entry entry = (Map.Entry) C89070n.m154565c((Iterable) C50687a.m94982b(C63238c.m114593c().mo86076c().getValue()).entrySet());
        if (entry == null || (collection = (Collection) entry.getValue()) == null || collection.isEmpty() || (list = (List) entry.getValue()) == null || (filterBean = (FilterBean) C89070n.m154583g(list)) == null || !C50691c.m94989a(oVar, filterBean)) {
            return null;
        }
        return filterBean;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71876c
    /* renamed from: a */
    public final int mo113528a(int i, AbstractC50707o oVar) {
        C89219l.m154721d(oVar, "");
        FilterBean a = m126936a(oVar);
        if (a != null) {
            return a.getId();
        }
        return C50691c.m94986a(oVar.mo86071f(), 0).getId();
    }
}
