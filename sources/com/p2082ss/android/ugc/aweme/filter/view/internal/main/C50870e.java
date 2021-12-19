package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.widget.SeekBar;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.e */
public final class C50870e {

    /* renamed from: a */
    public AbstractC89172b<? super C84966b, C89391z> f117364a;

    /* renamed from: b */
    public boolean f117365b;

    /* renamed from: c */
    public RecyclerView.AbstractC1356f f117366c;

    /* renamed from: d */
    public AbstractC89172b<? super SeekBar, C89391z> f117367d;

    /* renamed from: e */
    public AbstractC89172b<? super TabLayout, C89391z> f117368e;

    /* renamed from: f */
    public C50885g f117369f;

    static {
        Covode.recordClassIndex(60045);
    }

    public C50870e() {
        this(false, null, null, 63);
    }

    private C50870e(boolean z, RecyclerView.AbstractC1356f fVar, C50885g gVar) {
        C89219l.m154721d(gVar, "");
        this.f117364a = null;
        this.f117365b = z;
        this.f117366c = fVar;
        this.f117367d = null;
        this.f117368e = null;
        this.f117369f = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C50870e(boolean z, RecyclerView.AbstractC1356f fVar, C50885g gVar, int i) {
        this((i & 2) != 0 ? true : z, (i & 4) != 0 ? new C1434i() : fVar, (i & 32) != 0 ? new C50885g(0, false, null, 7) : gVar);
    }
}
