package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.p2082ss.android.ugc.aweme.qna.fragment.EnumC66276w;
import com.p2082ss.android.ugc.aweme.qna.model.C66288a;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66297i;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66026b;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66061b;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.List;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel */
public final class QnaSuggestedTabViewModel extends QnaViewModel {

    /* renamed from: a */
    public final C66026b f149204a;

    /* renamed from: b */
    public final LiveData<C66278b<List<C66293f>>> f149205b;

    /* renamed from: c */
    public final LiveData<C66278b<EnumC66276w>> f149206c;

    /* renamed from: d */
    public final LiveData<C66278b<C66297i>> f149207d;

    /* renamed from: e */
    public final LiveData<C66278b<Integer>> f149208e;

    /* renamed from: f */
    public final C1213t<C66278b<C66288a>> f149209f;

    /* renamed from: g */
    public final C1213t<C66278b<String>> f149210g;

    /* renamed from: h */
    public final C1213t<C66278b<C89378p<QaStruct, Boolean>>> f149211h;

    /* renamed from: l */
    private final C1213t<C66278b<Integer>> f149212l;

    /* renamed from: m */
    private final C1213t<C66278b<C89378p<QaStruct, Boolean>>> f149213m;

    static {
        Covode.recordClassIndex(77871);
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i
    /* renamed from: a */
    public final void mo105254a(C66356b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i, com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaViewModel
    /* renamed from: b */
    public final void mo105263b() {
        this.f149204a.mo105083a();
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f149204a.f148650h.mo142944a();
    }

    /* renamed from: a */
    public final void mo105259a() {
        if (C66061b.m117872b()) {
            this.f149204a.mo105083a();
        } else {
            this.f149204a.mo105092b();
        }
    }

    public QnaSuggestedTabViewModel() {
        C66026b bVar = new C66026b();
        this.f149204a = bVar;
        this.f149205b = bVar.f148651i;
        this.f149206c = bVar.f148653k;
        this.f149207d = bVar.f148655m;
        C1213t<C66278b<Integer>> tVar = new C1213t<>();
        this.f149212l = tVar;
        this.f149208e = tVar;
        this.f149209f = bVar.f148652j;
        this.f149210g = bVar.f148654l;
        C1213t<C66278b<C89378p<QaStruct, Boolean>>> tVar2 = new C1213t<>();
        this.f149213m = tVar2;
        this.f149211h = tVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i, com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaViewModel
    /* renamed from: a */
    public final void mo105260a(String str) {
        C89219l.m154721d(str, "");
        this.f149204a.mo105086a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i, com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaViewModel
    /* renamed from: a */
    public final void mo105261a(String str, int i) {
        int i2;
        C89219l.m154721d(str, "");
        C66026b bVar = this.f149204a;
        C89219l.m154721d(str, "");
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        bVar.mo105087a(str, i2);
        bVar.f148650h.mo142945a(QnaApiV2.C66002a.m117822a().sflQuestion(Long.parseLong(str), i2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C66026b.C66032f(bVar, str, i2), new C66026b.C66033g(bVar, str, i)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
        if (r13 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r13 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        r13 = "";
     */
    @Override // com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i, com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaViewModel
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105262a(java.lang.String r20, boolean r21, java.util.List<java.lang.String> r22) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaSuggestedTabViewModel.mo105262a(java.lang.String, boolean, java.util.List):void");
    }
}
