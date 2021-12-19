package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46595g;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.q */
public final class C46615q extends C46448b {

    /* renamed from: b */
    protected int f108698b;

    /* renamed from: c */
    private Context f108699c;

    /* renamed from: d */
    private C46595g f108700d = C46595g.C46596a.m89935a();

    /* renamed from: e */
    private int f108701e;

    static {
        Covode.recordClassIndex(55205);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: a */
    public final int mo78964a() {
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: h */
    public final int mo78973h() {
        return 20;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: j */
    public final int mo78975j() {
        return 5;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: l */
    public final String mo78977l() {
        return "5";
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: k */
    public final int mo78976k() {
        m89957n();
        return this.f108698b;
    }

    /* renamed from: n */
    private void m89957n() {
        if (this.f108698b == 0) {
            this.f108698b = C46595g.m89934b(this.f108701e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: g */
    public final int mo78972g() {
        m89957n();
        int i = this.f108698b;
        if (i == 0) {
            return 1;
        }
        return ((i - 1) / 20) + 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: c */
    public final String mo78968c() {
        String previewEmoji;
        int i = this.f108701e;
        C46597h.f108651e.mo79191a(i);
        List<C46605i> list = C46597h.f108650d.get(Integer.valueOf(i));
        if (list == null || list.size() <= 0 || (previewEmoji = list.get(0).getPreviewEmoji()) == null) {
            return "😃";
        }
        return previewEmoji;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: m */
    public final List<C46447a> mo78978m() {
        ArrayList arrayList = new ArrayList();
        List<C46605i> a = C46595g.m89932a(this.f108701e);
        if (a == null) {
            return arrayList;
        }
        for (C46605i iVar : a) {
            C46447a aVar = new C46447a();
            aVar.f108223c = iVar.getPreviewEmoji();
            aVar.f108224d = iVar;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C46605i> m89956a(List<C46447a> list) {
        if (list == null || list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C46447a aVar : list) {
            C46534a aVar2 = aVar.f108224d;
            if (aVar2 instanceof C46605i) {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: b */
    public final List<C46447a> mo78967b(int i) {
        ArrayList arrayList = new ArrayList();
        List<C46605i> a = C46595g.m89933a(this.f108701e, i * 20);
        if (a == null) {
            return arrayList;
        }
        for (C46605i iVar : a) {
            C46447a aVar = new C46447a();
            aVar.f108223c = iVar.getPreviewEmoji();
            aVar.f108224d = iVar;
            arrayList.add(aVar);
        }
        C46447a aVar2 = new C46447a();
        aVar2.f108221a = R.drawable.a7g;
        arrayList.add(aVar2);
        return arrayList;
    }

    public C46615q(Context context, int i) {
        this.f108699c = context;
        this.f108701e = i;
    }
}
