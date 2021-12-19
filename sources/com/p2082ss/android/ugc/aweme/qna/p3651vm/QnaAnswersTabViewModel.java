package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66103d;
import com.p2082ss.android.ugc.aweme.qna.fragment.C66104e;
import com.p2082ss.android.ugc.aweme.qna.fragment.EnumC66276w;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66035c;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaAnswersTabViewModel */
public final class QnaAnswersTabViewModel extends QnaViewModel implements AbstractC66103d {

    /* renamed from: a */
    public final C66035c f149170a;

    /* renamed from: b */
    public final LiveData<C66278b<List<C66293f>>> f149171b;

    /* renamed from: c */
    public final LiveData<C66278b<EnumC66276w>> f149172c;

    /* renamed from: d */
    public final C1213t<C66278b<C66356b>> f149173d;

    /* renamed from: e */
    public final LiveData<C66278b<C66104e>> f149174e;

    /* renamed from: f */
    private final C1213t<C66278b<C66356b>> f149175f;

    /* renamed from: g */
    private final C1213t<C66278b<C66104e>> f149176g;

    static {
        Covode.recordClassIndex(77853);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f149170a.f148689h.mo142944a();
    }

    public QnaAnswersTabViewModel() {
        C66035c cVar = new C66035c();
        this.f149170a = cVar;
        this.f149171b = cVar.f148682a;
        this.f149172c = cVar.f148683b;
        C1213t<C66278b<C66356b>> tVar = new C1213t<>();
        this.f149175f = tVar;
        this.f149173d = tVar;
        C1213t<C66278b<C66104e>> tVar2 = new C1213t<>();
        this.f149176g = tVar2;
        this.f149174e = tVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66103d
    /* renamed from: a */
    public final void mo105144a(C66104e eVar) {
        C89219l.m154721d(eVar, "");
        this.f149176g.setValue(new C66278b<>(eVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public final void mo105254a(C66356b bVar) {
        C89219l.m154721d(bVar, "");
        this.f149175f.setValue(new C66278b<>(bVar));
    }

    /* renamed from: a */
    public final void mo105255a(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f149170a.mo105097a(str, str2, str3, z);
    }
}
