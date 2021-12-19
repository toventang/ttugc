package com.p2082ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.m */
public final class C31082m extends AbstractC31077h {

    /* renamed from: a */
    public String f74463a;

    /* renamed from: b */
    public String[] f74464b;

    /* renamed from: c */
    public String[] f74465c;

    /* renamed from: d */
    public String f74466d;

    /* renamed from: e */
    public int f74467e;

    /* renamed from: f */
    public int f74468f;

    /* renamed from: g */
    public boolean f74469g;

    /* renamed from: h */
    public int f74470h;

    static {
        Covode.recordClassIndex(37712);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31077h
    /* renamed from: a */
    public final int mo56408a(C85581w wVar, boolean z) {
        C89219l.m154721d(wVar, "");
        if (z) {
            return wVar.mo131616a(this.f74463a, this.f74464b, this.f74465c);
        }
        return wVar.mo131617a(this.f74463a, this.f74464b, this.f74465c, this.f74466d, this.f74467e, this.f74468f);
    }

    private C31082m(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(strArr2, "");
        this.f74463a = str;
        this.f74464b = strArr;
        this.f74465c = strArr2;
        this.f74466d = str2;
        this.f74467e = i;
        this.f74468f = i2;
        this.f74469g = false;
        this.f74470h = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31082m(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, int i3) {
        this(str, strArr, strArr2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
    }
}
