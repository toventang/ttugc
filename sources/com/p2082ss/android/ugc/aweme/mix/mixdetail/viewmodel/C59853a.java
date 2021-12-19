package com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a */
public final class C59853a implements AbstractC12853j {

    /* renamed from: a */
    public final List<Aweme> f136325a;

    /* renamed from: b */
    public final List<String> f136326b;

    /* renamed from: c */
    public final List<String> f136327c;

    /* renamed from: d */
    public final C12776a<Boolean> f136328d;

    /* renamed from: e */
    public final C12776a<Boolean> f136329e;

    /* renamed from: f */
    public final List<Aweme> f136330f;

    /* renamed from: g */
    public final List<String> f136331g;

    static {
        Covode.recordClassIndex(70258);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59853a)) {
            return false;
        }
        C59853a aVar = (C59853a) obj;
        return C89219l.m154714a(this.f136325a, aVar.f136325a) && C89219l.m154714a(this.f136326b, aVar.f136326b) && C89219l.m154714a(this.f136327c, aVar.f136327c) && C89219l.m154714a(this.f136328d, aVar.f136328d) && C89219l.m154714a(this.f136329e, aVar.f136329e) && C89219l.m154714a(this.f136330f, aVar.f136330f) && C89219l.m154714a(this.f136331g, aVar.f136331g);
    }

    public final int hashCode() {
        List<Aweme> list = this.f136325a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f136326b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f136327c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar = this.f136328d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar2 = this.f136329e;
        int hashCode5 = (hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        List<Aweme> list4 = this.f136330f;
        int hashCode6 = (hashCode5 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<String> list5 = this.f136331g;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "MixVideosManageState(mixVideos=" + this.f136325a + ", removeFeedsID=" + this.f136326b + ", addFeedsID=" + this.f136327c + ", onEditType=" + this.f136328d + ", onPlayListChanged=" + this.f136329e + ", addFeedsAweme=" + this.f136330f + ", removeFeedsIdForAddPage=" + this.f136331g + ")";
    }

    public /* synthetic */ C59853a() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new C12776a(true), new C12776a(false), new ArrayList(), new ArrayList());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private C59853a(List<? extends Aweme> list, List<String> list2, List<String> list3, C12776a<Boolean> aVar, C12776a<Boolean> aVar2, List<? extends Aweme> list4, List<String> list5) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f136325a = list;
        this.f136326b = list2;
        this.f136327c = list3;
        this.f136328d = aVar;
        this.f136329e = aVar2;
        this.f136330f = list4;
        this.f136331g = list5;
    }

    /* renamed from: a */
    public static /* synthetic */ C59853a m109311a(C59853a aVar, List list, List list2, List list3, C12776a aVar2, C12776a aVar3, List list4, List list5, int i) {
        List list6 = list5;
        List list7 = list4;
        C12776a aVar4 = aVar3;
        List list8 = list;
        List list9 = list2;
        List list10 = list3;
        C12776a aVar5 = aVar2;
        if ((i & 1) != 0) {
            list8 = aVar.f136325a;
        }
        if ((i & 2) != 0) {
            list9 = aVar.f136326b;
        }
        if ((i & 4) != 0) {
            list10 = aVar.f136327c;
        }
        if ((i & 8) != 0) {
            aVar5 = aVar.f136328d;
        }
        if ((i & 16) != 0) {
            aVar4 = aVar.f136329e;
        }
        if ((i & 32) != 0) {
            list7 = aVar.f136330f;
        }
        if ((i & 64) != 0) {
            list6 = aVar.f136331g;
        }
        C89219l.m154721d(aVar5, "");
        C89219l.m154721d(aVar4, "");
        return new C59853a(list8, list9, list10, aVar5, aVar4, list7, list6);
    }
}
