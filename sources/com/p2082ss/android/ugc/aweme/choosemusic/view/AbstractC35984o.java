package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.o */
public abstract class AbstractC35984o extends C33937a {

    /* renamed from: b */
    protected Context f84967b;

    /* renamed from: c */
    public List<C36050s> f84968c = new ArrayList();

    /* renamed from: d */
    LinearLayout f84969d;

    /* renamed from: e */
    LinearLayout f84970e;

    /* renamed from: f */
    TextView f84971f;

    /* renamed from: g */
    View f84972g;

    /* renamed from: h */
    public boolean f84973h;

    /* renamed from: i */
    public boolean f84974i;

    /* renamed from: j */
    private int f84975j;

    /* renamed from: k */
    private C35754b f84976k;

    static {
        Covode.recordClassIndex(43230);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63097a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63098a(C36050s sVar);

    public AbstractC35984o(View view, int i) {
        super(view);
        this.f84967b = view.getContext();
        this.f84969d = (LinearLayout) view.findViewById(R.id.cci);
        this.f84970e = (LinearLayout) view.findViewById(R.id.ccj);
        this.f84971f = (TextView) view.findViewById(R.id.f7d);
        this.f84972g = view.findViewById(R.id.fhv);
        this.f84975j = i;
        this.f84971f.getPaint().setFakeBoldText(true);
        mo63097a();
        C35754b bVar = new C35754b("change_music_page", "attached_song", "", C35936b.f84812a);
        this.f84976k = bVar;
        bVar.f84348b = "prop";
    }

    /* renamed from: a */
    public final void mo63138a(List<MusicModel> list, int i, int i2, boolean z, String str, AbstractC35989s sVar, AbstractC60731k<C35757c> kVar) {
        boolean z2;
        String str2;
        if (this.f84974i) {
            this.f84971f.setText(R.string.f71);
        } else if (this.f84973h) {
            this.f84971f.setText(R.string.f6w);
        } else if (z) {
            this.f84971f.setText(R.string.dm4);
        } else {
            this.f84971f.setText(R.string.f6x);
        }
        int size = list.size() - this.f84970e.getChildCount();
        this.f84976k.f84352f = str;
        LayoutInflater from = LayoutInflater.from(this.f84967b);
        for (int i3 = 0; i3 < size; i3++) {
            C36050s sVar2 = new C36050s(C1764a.m5927a(from, R.layout.a_t, this.f84970e, false), this.f84975j);
            this.f84968c.add(sVar2);
            mo63098a(sVar2);
            this.f84970e.addView(sVar2.itemView);
        }
        for (int i4 = 0; i4 < this.f84968c.size(); i4++) {
            C36050s sVar3 = this.f84968c.get(i4);
            MusicModel musicModel = list.get(i4);
            if (-2 == i && i4 == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            sVar3.mo63154a(musicModel, false, false, z2, 0, i4, this.f84976k);
            sVar3.mo63153a(sVar, kVar);
            MusicModel musicModel2 = list.get(i4);
            C35754b bVar = this.f84976k;
            if (musicModel2 != null) {
                str2 = musicModel2.getMusicId();
            } else {
                str2 = "";
            }
            C35936b.m73312a(bVar, str2, i4);
        }
    }
}
