package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.b */
public abstract class AbstractC35965b extends C33937a {

    /* renamed from: b */
    protected Context f84896b;

    /* renamed from: c */
    public List<C36050s> f84897c = new ArrayList();

    /* renamed from: d */
    LinearLayout f84898d;

    /* renamed from: e */
    TextView f84899e;

    /* renamed from: f */
    TextView f84900f;

    /* renamed from: g */
    LinearLayout f84901g;

    /* renamed from: h */
    View f84902h;

    /* renamed from: i */
    int f84903i;

    /* renamed from: j */
    C35754b f84904j;

    static {
        Covode.recordClassIndex(43211);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63100a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63101a(C36050s sVar);

    /* renamed from: a */
    private static void m73351a(List<MusicModel> list) {
        String shootWay = AVExternalServiceImpl.m113114a().publishService().getShootWay();
        AVChallenge curChallenge = AVExternalServiceImpl.m113114a().publishService().getCurChallenge();
        if (TextUtils.equals(shootWay, "challenge") && curChallenge != null && !C13603b.m24435a((Collection) list) && curChallenge.isCommerce) {
            ArrayList arrayList = new ArrayList();
            for (MusicModel musicModel : list) {
                if (musicModel != null) {
                    arrayList.add(musicModel.getMusicId());
                }
            }
            C12290b.m22060a("music_recommendations_monitor", 0, new C33743c().mo59976a("shoot_way", shootWay).mo59976a("challenge_id", curChallenge.cid).mo59976a("music_ids", arrayList.toString()).mo59977a());
        }
    }

    public AbstractC35965b(View view, int i) {
        super(view);
        this.f84896b = view.getContext();
        this.f84898d = (LinearLayout) view.findViewById(R.id.cci);
        this.f84899e = (TextView) view.findViewById(R.id.f7d);
        this.f84900f = (TextView) view.findViewById(R.id.ewy);
        this.f84901g = (LinearLayout) view.findViewById(R.id.ccj);
        this.f84902h = view.findViewById(R.id.fhv);
        this.f84903i = i;
        mo63100a();
        this.f84904j = new C35754b("change_music_page", "attached_song", "", C35936b.f84812a);
    }

    /* renamed from: a */
    public final void mo63102a(Challenge challenge, List<MusicModel> list, int i, int i2, String str, AbstractC35989s sVar, AbstractC60731k<C35757c> kVar) {
        boolean z;
        String str2;
        if (challenge != null) {
            LayoutInflater from = LayoutInflater.from(this.f84896b);
            String challengeName = challenge.getChallengeName();
            this.f84899e.setText(this.f84896b.getString(R.string.f6v).replace("%s", ""));
            if (C80471gb.m139483a(this.f84896b)) {
                this.f84900f.setGravity(5);
            }
            String concat = "#".concat(String.valueOf(challengeName));
            UrlModel a = CommerceChallengeServiceImpl.m75741e().mo65376a(concat, true, true);
            if (a != null) {
                concat = concat + " ";
            }
            SpannableString spannableString = new SpannableString(concat);
            spannableString.setSpan(new StyleSpan(1), 0, concat.length(), 17);
            if (a != null) {
                CommerceChallengeServiceImpl.m75741e().mo65388a(this.f84896b, challengeName, a, spannableString, this.f84900f, "basedon_music_hashtag");
            } else {
                this.f84900f.setText(spannableString);
            }
            this.f84904j.f84353g = str;
            int size = list.size() - this.f84901g.getChildCount();
            for (int i3 = 0; i3 < size; i3++) {
                C36050s sVar2 = new C36050s(C1764a.m5927a(from, R.layout.a_t, this.f84901g, false), this.f84903i);
                this.f84897c.add(sVar2);
                mo63101a(sVar2);
                this.f84901g.addView(sVar2.itemView);
            }
            for (int i4 = 0; i4 < this.f84897c.size(); i4++) {
                C36050s sVar3 = this.f84897c.get(i4);
                MusicModel musicModel = list.get(i4);
                if (i == -2 && i4 == i2) {
                    z = true;
                } else {
                    z = false;
                }
                sVar3.mo63154a(musicModel, false, false, z, 0, i4, this.f84904j);
                sVar3.mo63153a(sVar, kVar);
                MusicModel musicModel2 = list.get(i4);
                C35754b bVar = this.f84904j;
                if (musicModel2 != null) {
                    str2 = musicModel2.getMusicId();
                } else {
                    str2 = "";
                }
                C35936b.m73312a(bVar, str2, i4);
            }
            m73351a(list);
        }
    }
}
