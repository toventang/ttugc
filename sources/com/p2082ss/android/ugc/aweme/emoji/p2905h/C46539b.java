package com.p2082ss.android.ugc.aweme.emoji.p2905h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.b */
public final class C46539b extends C46625c {
    static {
        Covode.recordClassIndex(55126);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b, com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c
    /* renamed from: a */
    public final int mo78964a() {
        return 2131231991;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b, com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c
    /* renamed from: i */
    public final boolean mo78974i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b, com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c
    /* renamed from: j */
    public final int mo78975j() {
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b, com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c
    /* renamed from: l */
    public final String mo78977l() {
        return "3";
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b, com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c
    /* renamed from: e */
    public final String mo78970e() {
        return C17867d.m33078a().getString(R.string.bm3);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b, com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c
    /* renamed from: g */
    public final int mo78972g() {
        if (this.f108728c == null || this.f108728c.size() == 0) {
            return 1;
        }
        return ((this.f108728c.size() - 1) / 8) + 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b, com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c
    /* renamed from: b */
    public final List<C46447a> mo78967b(int i) {
        ArrayList arrayList = new ArrayList(8);
        m89813a(arrayList, i);
        m89812a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static void m89812a(List<C46447a> list) {
        while (list.size() < 8) {
            list.add(new C46447a());
        }
    }

    /* renamed from: a */
    private void m89813a(List<C46447a> list, int i) {
        if (this.f108728c != null) {
            int min = Math.min(this.f108728c.size(), (i + 1) * 8);
            for (int i2 = i * 8; i2 < min; i2++) {
                C46534a aVar = (C46534a) this.f108728c.get(i2);
                C46447a aVar2 = new C46447a();
                if (aVar == null) {
                    C46534a aVar3 = new C46534a();
                    aVar3.setStickerType(2);
                    aVar2.f108224d = aVar3;
                    aVar2.f108221a = 2131231980;
                    aVar2.f108223c = C17867d.m33078a().getString(R.string.bm3);
                } else {
                    aVar2.f108223c = C46459a.m89690b(aVar);
                    aVar2.f108224d = aVar;
                }
                list.add(aVar2);
            }
        }
    }
}
