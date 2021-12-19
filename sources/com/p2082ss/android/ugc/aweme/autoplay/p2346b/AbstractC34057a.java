package com.p2082ss.android.ugc.aweme.autoplay.p2346b;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.ecom.live.C67425b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.b.a */
public abstract class AbstractC34057a extends AbstractC34151g {

    /* renamed from: a */
    public String f80530a = "";

    /* renamed from: b */
    public C67568r f80531b;

    /* renamed from: c */
    public C34105h f80532c;

    /* renamed from: d */
    public List<C67425b> f80533d = new ArrayList();

    static {
        Covode.recordClassIndex(40991);
    }

    /* renamed from: a */
    public abstract void mo60345a(List<? extends Aweme> list, C42410g gVar, Long l, boolean z);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC34057a(RecyclerView recyclerView) {
        super(recyclerView);
        C89219l.m154721d(recyclerView, "");
    }

    /* renamed from: a */
    public static /* synthetic */ void m69631a(AbstractC34057a aVar, List list, C42410g gVar, Long l, boolean z, int i) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        aVar.mo60345a(list, gVar, l, z);
    }
}
