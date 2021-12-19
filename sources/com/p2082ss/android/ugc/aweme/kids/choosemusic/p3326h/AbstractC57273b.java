package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
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
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.b */
public abstract class AbstractC57273b extends C33937a {

    /* renamed from: b */
    protected Context f130464b;

    /* renamed from: c */
    public List<C57320o> f130465c = new ArrayList();

    /* renamed from: d */
    LinearLayout f130466d;

    /* renamed from: e */
    TextView f130467e;

    /* renamed from: f */
    LinearLayout f130468f;

    /* renamed from: g */
    View f130469g;

    /* renamed from: h */
    int f130470h;

    /* renamed from: i */
    C57171a f130471i;

    static {
        Covode.recordClassIndex(67178);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94473a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94475a(C57320o oVar);

    /* renamed from: a */
    public final void mo94476a(final String str) {
        String a;
        SpannableString spannableString;
        int measuredWidth = this.f130467e.getMeasuredWidth();
        if (measuredWidth == 0) {
            this.f130467e.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57273b.RunnableC572741 */

                static {
                    Covode.recordClassIndex(67179);
                }

                public final void run() {
                    AbstractC57273b.this.mo94476a(str);
                }
            });
            return;
        }
        String concat = "#".concat(String.valueOf(str));
        TextPaint paint = this.f130467e.getPaint();
        String string = this.f130464b.getString(R.string.f6v);
        float measureText = ((float) measuredWidth) - paint.measureText(string.replace("%s", ""));
        if (paint.measureText(concat) > measureText) {
            a = C1764a.m5928a(string, new Object[]{TextUtils.ellipsize(concat, paint, measureText, TextUtils.TruncateAt.END)});
            spannableString = new SpannableString(a);
        } else {
            a = C1764a.m5928a(string, new Object[]{concat});
            spannableString = new SpannableString(a);
        }
        spannableString.setSpan(new StyleSpan(1), string.indexOf("%s"), ((string.indexOf("%s") + 2) + a.length()) - string.length(), 17);
        this.f130467e.setText(spannableString);
    }

    public AbstractC57273b(View view, int i) {
        super(view);
        this.f130464b = view.getContext();
        this.f130466d = (LinearLayout) view.findViewById(R.id.cci);
        this.f130467e = (TextView) view.findViewById(R.id.f7d);
        this.f130468f = (LinearLayout) view.findViewById(R.id.ccj);
        this.f130469g = view.findViewById(R.id.fhv);
        this.f130470h = i;
        mo94473a();
        this.f130471i = new C57171a("change_music_page", "attached_song", "", C57268c.f130442a);
    }

    /* renamed from: a */
    public final void mo94474a(Challenge challenge, List<MusicModel> list, int i, int i2, String str, AbstractC57287k kVar, AbstractC57080c<C57192b> cVar) {
        boolean z;
        String str2;
        if (challenge != null) {
            LayoutInflater from = LayoutInflater.from(this.f130464b);
            mo94476a(challenge.getChallengeName());
            this.f130471i.f130165g = str;
            int size = list.size() - this.f130468f.getChildCount();
            for (int i3 = 0; i3 < size; i3++) {
                C57320o oVar = new C57320o(C1764a.m5927a(from, R.layout.ade, this.f130468f, false), this.f130470h);
                this.f130465c.add(oVar);
                mo94475a(oVar);
                this.f130468f.addView(oVar.itemView);
            }
            for (int i4 = 0; i4 < this.f130465c.size(); i4++) {
                C57320o oVar2 = this.f130465c.get(i4);
                MusicModel musicModel = list.get(i4);
                if (i == -2 && i4 == i2) {
                    z = true;
                } else {
                    z = false;
                }
                oVar2.mo94502a(musicModel, false, z, 0, i4, this.f130471i);
                oVar2.mo94501a(kVar, cVar);
                MusicModel musicModel2 = list.get(i4);
                C57171a aVar = this.f130471i;
                if (musicModel2 != null) {
                    str2 = musicModel2.getMusicId();
                } else {
                    str2 = "";
                }
                C57268c.m103827a(aVar, str2, i4, true);
            }
            String shootWay = AVExternalServiceImpl.m113114a().publishService().getShootWay();
            AVChallenge curChallenge = AVExternalServiceImpl.m113114a().publishService().getCurChallenge();
            if (TextUtils.equals(shootWay, "challenge") && curChallenge != null && !C13603b.m24435a((Collection) list) && curChallenge.isCommerce) {
                ArrayList arrayList = new ArrayList();
                for (MusicModel musicModel3 : list) {
                    if (musicModel3 != null) {
                        arrayList.add(musicModel3.getMusicId());
                    }
                }
                C12290b.m22060a("music_recommendations_monitor", 0, new C33743c().mo59976a("shoot_way", shootWay).mo59976a("challenge_id", curChallenge.cid).mo59976a("music_ids", arrayList.toString()).mo59977a());
            }
        }
    }
}
