package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.g */
public abstract class AbstractC57282g extends C33937a {

    /* renamed from: b */
    protected Context f130499b;

    /* renamed from: c */
    public List<C57320o> f130500c = new ArrayList();

    /* renamed from: d */
    LinearLayout f130501d;

    /* renamed from: e */
    LinearLayout f130502e;

    /* renamed from: f */
    TextView f130503f;

    /* renamed from: g */
    View f130504g;

    /* renamed from: h */
    public boolean f130505h;

    /* renamed from: i */
    public boolean f130506i;

    /* renamed from: j */
    private int f130507j;

    /* renamed from: k */
    private C57171a f130508k;

    static {
        Covode.recordClassIndex(67187);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94485a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94486a(C57320o oVar);

    public AbstractC57282g(View view, int i) {
        super(view);
        this.f130499b = view.getContext();
        this.f130501d = (LinearLayout) view.findViewById(R.id.cci);
        this.f130502e = (LinearLayout) view.findViewById(R.id.ccj);
        this.f130503f = (TextView) view.findViewById(R.id.f7d);
        this.f130504g = view.findViewById(R.id.fhv);
        this.f130507j = i;
        this.f130503f.getPaint().setFakeBoldText(true);
        mo94485a();
        C57171a aVar = new C57171a("change_music_page", "attached_song", "", C57268c.f130442a);
        this.f130508k = aVar;
        aVar.f130160b = "prop";
    }

    /* renamed from: a */
    public final void mo94487a(List<MusicModel> list, int i, int i2, boolean z, String str, AbstractC57287k kVar, AbstractC57080c<C57192b> cVar) {
        boolean z2;
        String str2;
        if (this.f130506i) {
            this.f130503f.setText(R.string.f71);
        } else if (this.f130505h) {
            this.f130503f.setText(R.string.f6w);
        } else if (z) {
            this.f130503f.setText(R.string.dm4);
        } else {
            this.f130503f.setText(R.string.f6x);
        }
        int size = list.size() - this.f130502e.getChildCount();
        this.f130508k.f130164f = str;
        LayoutInflater from = LayoutInflater.from(this.f130499b);
        for (int i3 = 0; i3 < size; i3++) {
            C57320o oVar = new C57320o(C1764a.m5927a(from, R.layout.ade, this.f130502e, false), this.f130507j);
            this.f130500c.add(oVar);
            mo94486a(oVar);
            this.f130502e.addView(oVar.itemView);
        }
        for (int i4 = 0; i4 < this.f130500c.size(); i4++) {
            C57320o oVar2 = this.f130500c.get(i4);
            MusicModel musicModel = list.get(i4);
            if (-2 == i && i4 == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            oVar2.mo94502a(musicModel, false, z2, 0, i4, this.f130508k);
            oVar2.mo94501a(kVar, cVar);
            MusicModel musicModel2 = list.get(i4);
            C57171a aVar = this.f130508k;
            if (musicModel2 != null) {
                str2 = musicModel2.getMusicId();
            } else {
                str2 = "";
            }
            C57268c.m103827a(aVar, str2, i4, true);
        }
    }
}
