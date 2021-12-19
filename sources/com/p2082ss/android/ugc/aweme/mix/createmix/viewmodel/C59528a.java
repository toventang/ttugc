package com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.a */
public final class C59528a implements AbstractC12853j {

    /* renamed from: a */
    public String f135832a;

    /* renamed from: b */
    public final String f135833b;

    /* renamed from: c */
    public final List<Aweme> f135834c;

    /* renamed from: d */
    public final ArrayList<String> f135835d;

    /* renamed from: e */
    public final String f135836e;

    /* renamed from: f */
    public final C12776a<EnumC59529b> f135837f;

    /* renamed from: g */
    public final AbstractC12783f<C59396b> f135838g;

    /* renamed from: h */
    public final AbstractC12783f<C59396b> f135839h;

    /* renamed from: i */
    public String f135840i;

    /* renamed from: j */
    public C12776a<Object> f135841j;

    /* renamed from: k */
    public boolean f135842k;

    static {
        Covode.recordClassIndex(69923);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59528a)) {
            return false;
        }
        C59528a aVar = (C59528a) obj;
        return C89219l.m154714a(this.f135832a, aVar.f135832a) && C89219l.m154714a(this.f135833b, aVar.f135833b) && C89219l.m154714a(this.f135834c, aVar.f135834c) && C89219l.m154714a(this.f135835d, aVar.f135835d) && C89219l.m154714a(this.f135836e, aVar.f135836e) && C89219l.m154714a(this.f135837f, aVar.f135837f) && C89219l.m154714a(this.f135838g, aVar.f135838g) && C89219l.m154714a(this.f135839h, aVar.f135839h) && C89219l.m154714a(this.f135840i, aVar.f135840i) && C89219l.m154714a(this.f135841j, aVar.f135841j) && this.f135842k == aVar.f135842k;
    }

    public final int hashCode() {
        String str = this.f135832a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f135833b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Aweme> list = this.f135834c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ArrayList<String> arrayList = this.f135835d;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str3 = this.f135836e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C12776a<EnumC59529b> aVar = this.f135837f;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC12783f<C59396b> fVar = this.f135838g;
        int hashCode7 = (hashCode6 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        AbstractC12783f<C59396b> fVar2 = this.f135839h;
        int hashCode8 = (hashCode7 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        String str4 = this.f135840i;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C12776a<Object> aVar2 = this.f135841j;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        int i2 = (hashCode9 + i) * 31;
        boolean z = this.f135842k;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "MixCreateState(enterFrom=" + this.f135832a + ", enterMethod=" + this.f135833b + ", mixVideos=" + this.f135834c + ", addedFeedsID=" + this.f135835d + ", mixName=" + this.f135836e + ", nextFragment=" + this.f135837f + ", createRequest=" + this.f135838g + ", addVideoRequest=" + this.f135839h + ", mixId=" + this.f135840i + ", positionChange=" + this.f135841j + ", isCreateFlag=" + this.f135842k + ")";
    }

    public /* synthetic */ C59528a() {
        this("", "", new ArrayList(), new ArrayList(), null, null, C12797s.f31127a, C12797s.f31127a, "", null, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.mix.createmix.viewmodel.b> */
    /* JADX WARN: Multi-variable type inference failed */
    private C59528a(String str, String str2, List<? extends Aweme> list, ArrayList<String> arrayList, String str3, C12776a<? extends EnumC59529b> aVar, AbstractC12783f<C59396b> fVar, AbstractC12783f<C59396b> fVar2, String str4, C12776a<Object> aVar2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar2, "");
        C89219l.m154721d(str4, "");
        this.f135832a = str;
        this.f135833b = str2;
        this.f135834c = list;
        this.f135835d = arrayList;
        this.f135836e = str3;
        this.f135837f = aVar;
        this.f135838g = fVar;
        this.f135839h = fVar2;
        this.f135840i = str4;
        this.f135841j = aVar2;
        this.f135842k = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C59528a m109166a(C59528a aVar, String str, String str2, List list, ArrayList arrayList, String str3, C12776a aVar2, AbstractC12783f fVar, AbstractC12783f fVar2, String str4, C12776a aVar3, boolean z, int i) {
        boolean z2 = z;
        ArrayList arrayList2 = arrayList;
        List list2 = list;
        String str5 = str2;
        String str6 = str;
        String str7 = str3;
        C12776a aVar4 = aVar2;
        AbstractC12783f fVar3 = fVar;
        AbstractC12783f fVar4 = fVar2;
        String str8 = str4;
        C12776a aVar5 = aVar3;
        if ((i & 1) != 0) {
            str6 = aVar.f135832a;
        }
        if ((i & 2) != 0) {
            str5 = aVar.f135833b;
        }
        if ((i & 4) != 0) {
            list2 = aVar.f135834c;
        }
        if ((i & 8) != 0) {
            arrayList2 = aVar.f135835d;
        }
        if ((i & 16) != 0) {
            str7 = aVar.f135836e;
        }
        if ((i & 32) != 0) {
            aVar4 = aVar.f135837f;
        }
        if ((i & 64) != 0) {
            fVar3 = aVar.f135838g;
        }
        if ((i & 128) != 0) {
            fVar4 = aVar.f135839h;
        }
        if ((i & 256) != 0) {
            str8 = aVar.f135840i;
        }
        if ((i & 512) != 0) {
            aVar5 = aVar.f135841j;
        }
        if ((i & 1024) != 0) {
            z2 = aVar.f135842k;
        }
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(fVar3, "");
        C89219l.m154721d(fVar4, "");
        C89219l.m154721d(str8, "");
        return new C59528a(str6, str5, list2, arrayList2, str7, aVar4, fVar3, fVar4, str8, aVar5, z2);
    }
}
