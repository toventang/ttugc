package com.p2082ss.android.ugc.aweme.feed.assem.base;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.assem.arch.p795b.AbstractC12658i;
import com.bytedance.assem.arch.p795b.AbstractC12711w;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.base.a */
public abstract class AbstractC48491a<RECEIVER extends AbstractC22876d> extends AbstractC12711w<RECEIVER> implements AbstractC12658i<VideoItemParams> {

    /* renamed from: u */
    private SparseArray f112237u;

    static {
        Covode.recordClassIndex(57266);
    }

    /* renamed from: H */
    public View mo80494H() {
        if (this.f112237u == null) {
            this.f112237u = new SparseArray();
        }
        View view = (View) this.f112237u.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112237u.put(R.id.dii, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public void mo20466a() {
    }

    /* renamed from: a */
    public void mo20469b(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* renamed from: b */
    public boolean mo20470c(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20468a(VideoItemParams videoItemParams, List list) {
        C89219l.m154721d(videoItemParams, "");
    }
}
