package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a */
public class C76210a<DATA> extends RecyclerView.ViewHolder {

    /* renamed from: f */
    public DATA f171207f;

    /* renamed from: g */
    public EnumC84444c f171208g = EnumC84444c.UNKNOWN;

    /* renamed from: h */
    public int f171209h = -1;

    static {
        Covode.recordClassIndex(89160);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119155a(DATA data, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119153a(DATA data, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: a */
    public void mo119158a(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76210a(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: b */
    public final void mo119947b(DATA data, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(cVar, "");
        this.f171207f = data;
        this.f171208g = cVar;
        mo119153a(data, cVar, num);
    }

    /* renamed from: a */
    public final void mo119946a(DATA data, EnumC84444c cVar, Integer num, int i, int i2) {
        C89219l.m154721d(cVar, "");
        this.f171207f = data;
        this.f171208g = cVar;
        this.f171209h = i2;
        mo119155a(data, i);
        mo119153a(data, cVar, num);
    }
}
