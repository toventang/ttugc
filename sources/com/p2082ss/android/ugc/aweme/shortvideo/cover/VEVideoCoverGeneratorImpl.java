package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.vesdk.C85581w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl */
public class VEVideoCoverGeneratorImpl implements AbstractC33974au, AbstractC69978a {

    /* renamed from: a */
    private int[] f156393a;

    /* renamed from: b */
    int f156394b;

    /* renamed from: c */
    protected int f156395c;

    /* renamed from: d */
    AbstractC31071f f156396d;

    /* renamed from: e */
    List<Long> f156397e;

    /* renamed from: f */
    C85581w.EnumC85602a f156398f;

    /* renamed from: g */
    private String f156399g;

    /* renamed from: h */
    private boolean f156400h;

    /* renamed from: i */
    private final String f156401i;

    static {
        Covode.recordClassIndex(82391);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a
    /* renamed from: a */
    public final int mo110421a() {
        return this.f156394b;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a
    /* renamed from: b */
    public final void mo110423b() {
        this.f156395c = -1;
        this.f156393a = null;
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f156396d.mo56395z();
        List<Long> list = this.f156397e;
        String str = this.f156399g;
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        if (!list.isEmpty()) {
            C84401c.f188720d.mo73300a("tool_performance_fetch_frames", new C84425b().mo129404a("duration", C89070n.m154600t(list)).mo129403a("count", list.size()).mo129406a("scene", str).f188764a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int[] mo110424a(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a
    /* renamed from: a */
    public final void mo110422a(int i, int i2, AbstractC69978a.AbstractC69979a aVar) {
        int i3 = i;
        int i4 = i2;
        if (this.f156395c <= 0 || this.f156400h) {
            this.f156395c = this.f156396d.mo56368j();
        }
        if (this.f156393a == null || this.f156400h) {
            this.f156393a = mo110424a(this.f156395c, this.f156394b);
        }
        int[] iArr = this.f156393a;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        if (i4 > i3 && i3 != -1) {
            i4 = -1;
        } else if (i4 != -1) {
            i3 = -1;
        } else {
            i4 = -1;
        }
        C1731i.m5640b(new CallableC70000s(this, iArr, i3, i4, aVar, atomicInteger, System.currentTimeMillis()), C1731i.f5562a);
    }

    public VEVideoCoverGeneratorImpl(AbstractC31071f fVar, AbstractC1204m mVar, int i, C85581w.EnumC85602a aVar, String str) {
        this(fVar, mVar, i, aVar, str, (byte) 0);
    }

    private VEVideoCoverGeneratorImpl(AbstractC31071f fVar, AbstractC1204m mVar, int i, C85581w.EnumC85602a aVar, String str, byte b) {
        this.f156397e = new ArrayList();
        this.f156401i = "VEVideoCoverGeneratorImpl";
        mVar.getLifecycle().mo4012a(this);
        this.f156396d = fVar;
        this.f156394b = i;
        this.f156398f = aVar;
        this.f156399g = str;
        this.f156400h = false;
    }
}
