package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.model.C66299k;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaViewModel */
public abstract class QnaViewModel extends AbstractC1174ac implements AbstractC66363i {

    /* renamed from: a */
    private final C1213t<C66278b<C66358d>> f149214a;

    /* renamed from: b */
    private final C1213t<C66278b<C66355a>> f149215b;

    /* renamed from: c */
    private final C1213t<C66278b<C66357c>> f149216c;

    /* renamed from: i */
    public final LiveData<C66278b<C66358d>> f149217i;

    /* renamed from: j */
    public final LiveData<C66278b<C66355a>> f149218j;

    /* renamed from: k */
    public final LiveData<C66278b<C66357c>> f149219k;

    static {
        Covode.recordClassIndex(77872);
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public void mo105260a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public void mo105261a(String str, int i) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public void mo105262a(String str, boolean z, List<String> list) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: b */
    public void mo105263b() {
    }

    public QnaViewModel() {
        C1213t<C66278b<C66358d>> tVar = new C1213t<>();
        this.f149214a = tVar;
        this.f149217i = tVar;
        C1213t<C66278b<C66355a>> tVar2 = new C1213t<>();
        this.f149215b = tVar2;
        this.f149218j = tVar2;
        C1213t<C66278b<C66357c>> tVar3 = new C1213t<>();
        this.f149216c = tVar3;
        this.f149219k = tVar3;
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public final void mo105265a(C66358d dVar) {
        if (dVar != null) {
            this.f149214a.setValue(new C66278b<>(dVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public final void mo105264a(C66299k kVar, String str) {
        C89219l.m154721d(kVar, "");
        if (kVar.f149074b != null) {
            this.f149215b.postValue(new C66278b<>(new C66355a(kVar.f149074b, str)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public final void mo105266a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f149216c.setValue(new C66278b<>(new C66357c(str, str2)));
    }
}
