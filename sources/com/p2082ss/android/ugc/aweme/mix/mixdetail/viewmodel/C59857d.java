package com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d */
public final class C59857d implements AbstractC12853j {

    /* renamed from: a */
    public final List<Aweme> f136333a;

    /* renamed from: b */
    public final C12776a<Aweme> f136334b;

    /* renamed from: c */
    public final C12776a<Boolean> f136335c;

    /* renamed from: d */
    public final int f136336d;

    /* renamed from: e */
    public final boolean f136337e;

    /* renamed from: f */
    public final int f136338f;

    /* renamed from: g */
    public final C59867d f136339g;

    /* renamed from: h */
    public final AbstractC12783f<C59858e> f136340h;

    /* renamed from: i */
    public final C12776a<C89391z> f136341i;

    static {
        Covode.recordClassIndex(70262);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59857d)) {
            return false;
        }
        C59857d dVar = (C59857d) obj;
        return C89219l.m154714a(this.f136333a, dVar.f136333a) && C89219l.m154714a(this.f136334b, dVar.f136334b) && C89219l.m154714a(this.f136335c, dVar.f136335c) && this.f136336d == dVar.f136336d && this.f136337e == dVar.f136337e && this.f136338f == dVar.f136338f && C89219l.m154714a(this.f136339g, dVar.f136339g) && C89219l.m154714a(this.f136340h, dVar.f136340h) && C89219l.m154714a(this.f136341i, dVar.f136341i);
    }

    public final int hashCode() {
        List<Aweme> list = this.f136333a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C12776a<Aweme> aVar = this.f136334b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar2 = this.f136335c;
        int hashCode3 = (((hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.f136336d) * 31;
        boolean z = this.f136337e;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (((hashCode3 + i2) * 31) + this.f136338f) * 31;
        C59867d dVar = this.f136339g;
        int hashCode4 = (i5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        AbstractC12783f<C59858e> fVar = this.f136340h;
        int hashCode5 = (hashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C12776a<C89391z> aVar3 = this.f136341i;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "MixVideosState(mixVideos=" + this.f136333a + ", selectVideoChange=" + this.f136334b + ", mixDeleteAction=" + this.f136335c + ", pullType=" + this.f136336d + ", openBottomDialog=" + this.f136337e + ", requestStatus=" + this.f136338f + ", mixDetail=" + this.f136339g + ", panelState=" + this.f136340h + ", clickMixVideosDialog=" + this.f136341i + ")";
    }

    public /* synthetic */ C59857d() {
        this(null, null, null, 1, false, 0, null, C12797s.f31127a, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private C59857d(List<? extends Aweme> list, C12776a<? extends Aweme> aVar, C12776a<Boolean> aVar2, int i, boolean z, int i2, C59867d dVar, AbstractC12783f<C59858e> fVar, C12776a<C89391z> aVar3) {
        C89219l.m154721d(fVar, "");
        this.f136333a = list;
        this.f136334b = aVar;
        this.f136335c = aVar2;
        this.f136336d = i;
        this.f136337e = z;
        this.f136338f = i2;
        this.f136339g = dVar;
        this.f136340h = fVar;
        this.f136341i = aVar3;
    }

    /* renamed from: a */
    public static /* synthetic */ C59857d m109313a(C59857d dVar, List list, C12776a aVar, C12776a aVar2, int i, boolean z, int i2, C59867d dVar2, AbstractC12783f fVar, C12776a aVar3, int i3) {
        C12776a aVar4 = aVar3;
        AbstractC12783f fVar2 = fVar;
        C59867d dVar3 = dVar2;
        int i4 = i2;
        boolean z2 = z;
        List list2 = list;
        C12776a aVar5 = aVar;
        C12776a aVar6 = aVar2;
        int i5 = i;
        if ((i3 & 1) != 0) {
            list2 = dVar.f136333a;
        }
        if ((i3 & 2) != 0) {
            aVar5 = dVar.f136334b;
        }
        if ((i3 & 4) != 0) {
            aVar6 = dVar.f136335c;
        }
        if ((i3 & 8) != 0) {
            i5 = dVar.f136336d;
        }
        if ((i3 & 16) != 0) {
            z2 = dVar.f136337e;
        }
        if ((i3 & 32) != 0) {
            i4 = dVar.f136338f;
        }
        if ((i3 & 64) != 0) {
            dVar3 = dVar.f136339g;
        }
        if ((i3 & 128) != 0) {
            fVar2 = dVar.f136340h;
        }
        if ((i3 & 256) != 0) {
            aVar4 = dVar.f136341i;
        }
        C89219l.m154721d(fVar2, "");
        return new C59857d(list2, aVar5, aVar6, i5, z2, i4, dVar3, fVar2, aVar4);
    }
}
