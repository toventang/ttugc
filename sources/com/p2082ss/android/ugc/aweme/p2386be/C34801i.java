package com.p2082ss.android.ugc.aweme.p2386be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.table.cell.EnumC23292b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.be.i */
public class C34801i extends AbstractC34793a {

    /* renamed from: c */
    private final String f82214c;

    /* renamed from: d */
    private final EnumC23292b f82215d;

    /* renamed from: e */
    private final C22999a f82216e;

    /* renamed from: f */
    private final boolean f82217f;

    /* renamed from: g */
    private final boolean f82218g;

    /* renamed from: h */
    private final String f82219h;

    /* renamed from: i */
    private final boolean f82220i;

    /* renamed from: j */
    private final boolean f82221j;

    /* renamed from: k */
    private final View.OnClickListener f82222k;

    /* renamed from: l */
    private final View.OnClickListener f82223l;

    /* renamed from: m */
    private final Object f82224m;

    static {
        Covode.recordClassIndex(41797);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: a */
    public boolean mo61500a() {
        return this.f82218g;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: b */
    public boolean mo61501b() {
        return this.f82217f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: c */
    public Object mo61502c() {
        return this.f82224m;
    }

    /* renamed from: d */
    public String mo61503d() {
        return this.f82214c;
    }

    /* renamed from: e */
    public EnumC23292b mo61504e() {
        return this.f82215d;
    }

    /* renamed from: f */
    public C22999a mo61506f() {
        return this.f82216e;
    }

    /* renamed from: g */
    public String mo61507g() {
        return this.f82219h;
    }

    /* renamed from: h */
    public boolean mo61508h() {
        return this.f82220i;
    }

    /* renamed from: i */
    public boolean mo61510i() {
        return this.f82221j;
    }

    /* renamed from: j */
    public View.OnClickListener mo61515j() {
        return this.f82223l;
    }

    public boolean equals(Object obj) {
        String str = this.f82132b;
        String str2 = null;
        if (!(obj instanceof C34801i)) {
            obj = null;
        }
        AbstractC34793a aVar = (AbstractC34793a) obj;
        if (aVar != null) {
            str2 = aVar.f82132b;
        }
        return C89219l.m154714a((Object) str, (Object) str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C34801i(String str, EnumC23292b bVar, C22999a aVar, boolean z, boolean z2, String str2, boolean z3, boolean z4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        super(z2, z, null, null, 8);
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f82214c = str;
        this.f82215d = bVar;
        this.f82216e = aVar;
        this.f82217f = z;
        this.f82218g = z2;
        this.f82219h = str2;
        this.f82220i = z3;
        this.f82221j = z4;
        this.f82222k = onClickListener;
        this.f82223l = onClickListener2;
        this.f82224m = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34801i(String str, EnumC23292b bVar, C22999a aVar, boolean z, boolean z2, String str2, boolean z3, boolean z4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i) {
        this(str, (i & 2) != 0 ? EnumC23292b.NORMAL : bVar, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : onClickListener, (i & 512) == 0 ? onClickListener2 : null);
    }
}
