package com.p2082ss.android.ugc.aweme.music.p3465b.p3466a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
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

/* renamed from: com.ss.android.ugc.aweme.music.b.a.a */
public final class C60710a extends AbstractC39056b<List<AbstractC60713a>> {

    /* renamed from: a */
    public String f137937a;

    /* renamed from: b */
    public AbstractC60731k<C60795d> f137938b;

    /* renamed from: c */
    public int f137939c;

    /* renamed from: d */
    private C60723f f137940d;

    /* renamed from: e */
    private AbstractC60712b f137941e;

    /* renamed from: f */
    private int f137942f;

    /* renamed from: g */
    private C60717d.EnumC60718a f137943g;

    /* renamed from: h */
    private int f137944h;

    static {
        Covode.recordClassIndex(71266);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        return new C60723f(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_l, viewGroup, false), this.f137941e, this.f137944h, this.f137943g, this.f137938b);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<AbstractC60713a> list, int i) {
        AbstractC60713a aVar = list.get(i);
        if (!(aVar instanceof MusicModel) || ((MusicModel) aVar).getDataType() != 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ void mo63164a(List<AbstractC60713a> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        boolean z;
        List<AbstractC60713a> list3 = list;
        C60723f fVar = (C60723f) viewHolder;
        this.f137940d = fVar;
        MusicModel musicModel = (MusicModel) list3.get(i);
        String str = this.f137937a;
        if (this.f137939c == i) {
            z = true;
        } else {
            z = false;
        }
        fVar.mo98149a(musicModel, str, z, this.f137942f);
        C39162r.m79460a("show_music", new C33744d().mo59983a("music_id", ((MusicModel) list3.get(i)).getMusicId()).mo59983a("enter_from", "challenge_bonding").f79943a);
    }
}
