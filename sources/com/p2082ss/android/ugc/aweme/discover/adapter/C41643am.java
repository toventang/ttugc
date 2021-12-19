package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42639ae;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.am */
public final class C41643am extends AbstractC41742q<SearchUser> implements AbstractC42639ae {

    /* renamed from: g */
    public C67568r f97136g;

    /* renamed from: h */
    private AbstractC51187d f97137h;

    /* renamed from: i */
    private RecyclerView.ViewHolder f97138i;

    /* renamed from: j */
    private String f97139j;

    static {
        Covode.recordClassIndex(49556);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42639ae
    /* renamed from: b_ */
    public final void mo62377b_(List<SearchUser> list) {
        if (this.f97370f != null) {
            this.f97370f.f150937a = Integer.MIN_VALUE;
        }
        super.mo62377b_(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f97138i = mo61482b(recyclerView, 0);
    }

    public C41643am(AbstractC57066a.AbstractC57068b bVar, AbstractC51187d dVar) {
        this.f97369e = bVar;
        this.f97137h = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder = this.f97138i;
        if (viewHolder == null) {
            return View$OnClickListenerC41644an.C41648c.m83625a(viewGroup, this.f97137h);
        }
        this.f97138i = null;
        return viewHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x039f, code lost:
        if (r7 == false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03a3, code lost:
        if (r10.f151748f == 1) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03a5, code lost:
        r6 = r10.f151744b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03a7, code lost:
        if (r6 != null) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03a9, code lost:
        p4600h.p4611f.p4613b.C89219l.m154710a("productListView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03ae, code lost:
        r6.mo4413b(0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ec A[ADDED_TO_REGION] */
    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61483b(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
        // Method dump skipped, instructions count: 1642
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.C41643am.mo61483b(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public C41643am(C67678d dVar, AbstractC57066a.AbstractC57068b bVar, AbstractC51187d dVar2, AbstractC67363b bVar2, String str) {
        super(dVar, bVar, bVar2);
        this.f97137h = dVar2;
        this.f97139j = str;
    }
}
