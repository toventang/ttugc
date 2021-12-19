package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66103d;
import com.p2082ss.android.ugc.aweme.qna.fragment.C66104e;
import com.p2082ss.android.ugc.aweme.qna.fragment.EnumC66276w;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66297i;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66045h;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaQuestionsTabViewModel */
public final class QnaQuestionsTabViewModel extends QnaViewModel implements AbstractC66103d {

    /* renamed from: a */
    public final C66045h f149193a;

    /* renamed from: b */
    public final LiveData<C66278b<List<C66293f>>> f149194b;

    /* renamed from: c */
    public final LiveData<C66278b<EnumC66276w>> f149195c;

    /* renamed from: d */
    public final LiveData<C66278b<EnumC66276w>> f149196d;

    /* renamed from: e */
    public final LiveData<C66278b<Long>> f149197e;

    /* renamed from: f */
    public final LiveData<C66278b<C66297i>> f149198f;

    /* renamed from: g */
    public final C1213t<C66278b<C66356b>> f149199g;

    /* renamed from: h */
    public final LiveData<C66278b<C66104e>> f149200h;

    /* renamed from: l */
    private final C1213t<C66278b<C66356b>> f149201l;

    /* renamed from: m */
    private final C1213t<C66278b<C66104e>> f149202m;

    static {
        Covode.recordClassIndex(77868);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f149193a.f148719n.mo142944a();
    }

    public QnaQuestionsTabViewModel() {
        C66045h hVar = new C66045h();
        this.f149193a = hVar;
        this.f149194b = hVar.f148707b;
        this.f149195c = hVar.f148708c;
        this.f149196d = hVar.f148709d;
        this.f149197e = hVar.f148712g;
        this.f149198f = hVar.f148710e;
        C1213t<C66278b<C66356b>> tVar = new C1213t<>();
        this.f149201l = tVar;
        this.f149199g = tVar;
        C1213t<C66278b<C66104e>> tVar2 = new C1213t<>();
        this.f149202m = tVar2;
        this.f149200h = tVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66103d
    /* renamed from: a */
    public final void mo105144a(C66104e eVar) {
        C89219l.m154721d(eVar, "");
        this.f149202m.setValue(new C66278b<>(eVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public final void mo105254a(C66356b bVar) {
        C89219l.m154721d(bVar, "");
        this.f149201l.setValue(new C66278b<>(bVar));
    }

    /* renamed from: a */
    public final void mo105257a(String str, String str2, String str3, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f149193a.mo105102a(str, str2, str3, z, z2);
    }
}
