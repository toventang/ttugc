package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46605i;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46643e;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.j */
final /* synthetic */ class C46511j implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private final List f108419a;

    /* renamed from: b */
    private final AbstractC46519p f108420b;

    /* renamed from: c */
    private final C46514m f108421c;

    /* renamed from: d */
    private final int f108422d;

    static {
        Covode.recordClassIndex(55096);
    }

    C46511j(List list, AbstractC46519p pVar, C46514m mVar, int i) {
        this.f108419a = list;
        this.f108420b = pVar;
        this.f108421c = mVar;
        this.f108422d = i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        List list = this.f108419a;
        AbstractC46519p pVar = this.f108420b;
        C46514m mVar = this.f108421c;
        int i2 = this.f108422d;
        C46447a aVar = (C46447a) list.get(i);
        if (aVar == null) {
            return;
        }
        if (aVar.f108221a == 2131231980) {
            pVar.mo79018b();
        } else if (aVar.f108221a == 2131231989) {
            pVar.mo79019c();
        } else if (aVar.f108221a == R.drawable.a7g) {
            pVar.mo79015a();
        } else if (aVar.mo78961a()) {
            if (aVar.f108224d instanceof C46605i) {
                C46605i iVar = (C46605i) aVar.f108224d;
                pVar.mo79017a(iVar.getPreviewEmoji() == null ? "" : iVar.getPreviewEmoji());
                return;
            }
            pVar.mo79016a(view.findViewById(R.id.aua), aVar, C46643e.m90037a(mVar, i2));
        } else if (!TextUtils.isEmpty(aVar.f108223c)) {
            pVar.mo79017a(aVar.f108223c);
        }
    }
}
