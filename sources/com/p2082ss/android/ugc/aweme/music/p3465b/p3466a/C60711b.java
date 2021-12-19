package com.p2082ss.android.ugc.aweme.music.p3465b.p3466a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60712b;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60717d;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60723f;
import com.p2082ss.android.ugc.aweme.music.p3465b.p3467b.AbstractC60713a;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60795d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.b.a.b */
public final class C60711b extends AbstractC39056b<List<AbstractC60713a>> {

    /* renamed from: a */
    public String f137945a;

    /* renamed from: b */
    public AbstractC60731k<C60795d> f137946b;

    /* renamed from: c */
    public int f137947c;

    /* renamed from: d */
    private AbstractC60712b f137948d;

    /* renamed from: e */
    private int f137949e;

    /* renamed from: f */
    private C60717d.EnumC60718a f137950f;

    /* renamed from: g */
    private int f137951g;

    static {
        Covode.recordClassIndex(71267);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        return new C60723f(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_l, viewGroup, false), this.f137948d, this.f137951g, this.f137950f, this.f137946b);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<AbstractC60713a> list, int i) {
        AbstractC60713a aVar = list.get(i);
        if (!(aVar instanceof MusicModel) || ((MusicModel) aVar).getDataType() != 1) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ void mo63164a(List<AbstractC60713a> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        boolean z;
        C60723f fVar = (C60723f) viewHolder;
        MusicModel musicModel = (MusicModel) list.get(i);
        String str = this.f137945a;
        if (i == this.f137947c) {
            z = true;
        } else {
            z = false;
        }
        fVar.mo98149a(musicModel, str, z, this.f137949e);
    }
}
