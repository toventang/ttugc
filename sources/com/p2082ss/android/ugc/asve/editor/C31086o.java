package com.p2082ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEMVParams;
import com.p2082ss.android.vesdk.VESize;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.o */
public final class C31086o extends AbstractC31077h {

    /* renamed from: a */
    public String f74473a;

    /* renamed from: b */
    public String[] f74474b;

    /* renamed from: c */
    public String[] f74475c;

    /* renamed from: d */
    public String f74476d;

    /* renamed from: e */
    public int f74477e;

    /* renamed from: f */
    public int f74478f;

    /* renamed from: g */
    public boolean f74479g;

    /* renamed from: h */
    public int f74480h;

    /* renamed from: i */
    public VEMVParams.EnumC85259a f74481i;

    /* renamed from: j */
    public VESize f74482j;

    static {
        Covode.recordClassIndex(37725);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31077h
    /* renamed from: a */
    public final int mo56408a(C85581w wVar, boolean z) {
        C89219l.m154721d(wVar, "");
        VEMVParams vEMVParams = new VEMVParams();
        vEMVParams.mvPath = this.f74473a;
        vEMVParams.resourcesFilePaths = this.f74474b;
        vEMVParams.resourcesTypes = this.f74475c;
        vEMVParams.bgmPath = this.f74476d;
        vEMVParams.bgmTrimIn = this.f74477e;
        vEMVParams.bgmTrimOut = this.f74478f;
        vEMVParams.resMV = this.f74481i;
        vEMVParams.customRenderRes = this.f74482j;
        if (z) {
            return wVar.mo131659b(vEMVParams);
        }
        return wVar.mo131599a(vEMVParams);
    }

    private C31086o(String str, String[] strArr, String[] strArr2, VEMVParams.EnumC85259a aVar, VESize vESize) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(strArr2, "");
        C89219l.m154721d(aVar, "");
        this.f74473a = str;
        this.f74474b = strArr;
        this.f74475c = strArr2;
        this.f74476d = null;
        this.f74477e = 0;
        this.f74478f = 0;
        this.f74479g = false;
        this.f74480h = 0;
        this.f74481i = aVar;
        this.f74482j = vESize;
    }

    public /* synthetic */ C31086o(String str, String[] strArr, String[] strArr2, VEMVParams.EnumC85259a aVar, VESize vESize, byte b) {
        this(str, strArr, strArr2, aVar, vESize);
    }
}
