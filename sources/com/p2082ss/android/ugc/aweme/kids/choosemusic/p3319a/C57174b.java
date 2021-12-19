package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57258t;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.AbstractC57298a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57318m;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57078a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57146b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60830h;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.b */
public final class C57174b extends AbstractC39060f<MusicModel> {

    /* renamed from: A */
    private AbstractC57287k f130179A = new AbstractC57287k() {
        /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b.C571762 */

        static {
            Covode.recordClassIndex(67077);
        }

        /* renamed from: a */
        private static boolean m103624a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k
        /* renamed from: a */
        public final void mo94379a(C57320o oVar, View view, MusicModel musicModel) {
            if (musicModel != null && view != null && view.getContext() != null) {
                view.getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m103624a();
                }
                if (!C58029j.f132256h) {
                    new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                    return;
                }
                int id = view.getId();
                C57174b.this.f130185e.f130167i = musicModel.getLogPb();
                if (id == R.id.bxo) {
                    Activity j = C17873f.m33102j();
                    if (j != null) {
                        j.getString(R.string.bs5);
                    }
                    oVar.mo94506d();
                    boolean z = oVar.f130553s;
                    String musicId = musicModel.getMusicId();
                    C57171a aVar = C57174b.this.f130185e;
                    musicModel.getLogPb();
                    C57268c.m103830a(z, musicId, aVar);
                } else if (id == R.id.bxq) {
                    if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(R.string.dau);
                        }
                        new C79459a(view.getContext()).mo123052a(offlineDesc).mo123053a();
                    } else if (C57147c.m103544a(musicModel, view.getContext(), true)) {
                        C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://music/detail/" + musicModel.getMusicId()).mo63248a("process_id", UUID.randomUUID().toString()).mo63249a());
                    }
                } else if (id == R.id.cey) {
                    if (C57147c.m103544a(musicModel, view.getContext(), true) && C57174b.this.f130181a != null) {
                        C34822d.m71158a(view.getContext(), "av_settings.xml", 0);
                        C57174b.this.f130181a.mo94419b(musicModel);
                        C57171a aVar2 = C57174b.this.f130185e;
                        String musicId2 = musicModel.getMusicId();
                        int layoutPosition = oVar.getLayoutPosition();
                        musicModel.getLogPb();
                        C57268c.m103826a(aVar2, musicId2, layoutPosition);
                    }
                } else if (id == R.id.cds) {
                    if (C57174b.this.f130183c == oVar.getPosition()) {
                        if (C57174b.this.f130181a != null) {
                            C57174b.this.mo94375l();
                        }
                    } else if (C57174b.this.f130181a != null) {
                        C57174b.this.mo94375l();
                        C57174b.this.f130183c = oVar.getPosition();
                        if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                            MediaPlayer a = C57146b.m103541a();
                            try {
                                a.reset();
                                a.setDataSource(musicModel.getLocalPath());
                                a.setAudioStreamType(3);
                                a.prepareAsync();
                                a.setOnPreparedListener(new C57178c(oVar));
                                a.setOnErrorListener(C57179d.f130200a);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else {
                            C57174b.this.f130181a.mo94415a(new C57181f(this));
                            C57174b.this.f130181a.mo94417a(musicModel, C57174b.this.f130185e);
                            C57268c.f130443b = oVar.getPosition();
                        }
                    }
                    C57174b.this.f130184d = musicModel.getMusicId();
                    C57174b bVar = C57174b.this;
                    bVar.f130189i = !bVar.f130189i;
                }
            }
        }
    };

    /* renamed from: B */
    private RecyclerView.AbstractC1353c f130180B = new RecyclerView.AbstractC1353c() {
        /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b.C571773 */

        static {
            Covode.recordClassIndex(67078);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            super.mo4655a();
            C57174b.this.mo94376m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            C57174b.this.mo94376m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            C57174b.this.mo94376m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            C57174b.this.mo94376m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            C57174b.this.mo94376m();
        }
    };

    /* renamed from: a */
    public AbstractC57234b f130181a;

    /* renamed from: b */
    RecyclerView f130182b;

    /* renamed from: c */
    public int f130183c = -1;

    /* renamed from: d */
    public String f130184d;

    /* renamed from: e */
    public C57171a f130185e;

    /* renamed from: f */
    public boolean f130186f;

    /* renamed from: g */
    public boolean f130187g = true;

    /* renamed from: h */
    public int f130188h;

    /* renamed from: i */
    public boolean f130189i;

    /* renamed from: j */
    public C57258t f130190j;

    /* renamed from: k */
    String f130191k = "";

    /* renamed from: w */
    private AbstractC57080c<C57192b> f130192w;

    /* renamed from: x */
    private boolean f130193x;

    /* renamed from: y */
    private AbstractC57078a f130194y;

    /* renamed from: z */
    private boolean f130195z;

    static {
        Covode.recordClassIndex(67075);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void ap_() {
        super.ap_();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final int mo60933c() {
        if (!this.f130195z) {
            return super.mo60933c();
        }
        if (this.f92236l == null) {
            return 0;
        }
        return this.f92236l.size() + 1;
    }

    /* renamed from: l */
    public final void mo94375l() {
        if (this.f130183c >= 0) {
            MediaPlayer a = C57146b.m103541a();
            int i = this.f130183c;
            if (i != -1) {
                RecyclerView.ViewHolder f = this.f130182b.mo4451f(i);
                if (f instanceof C57320o) {
                    ((AbstractC57298a) f).mo94503a(false, false);
                }
                int i2 = this.f130183c;
                this.f130183c = -1;
                this.f130184d = null;
                if (f == null) {
                    notifyItemChanged(i2);
                }
            }
            if (a != null && a.isPlaying()) {
                a.pause();
            }
            AbstractC57234b bVar = this.f130181a;
            if (bVar != null) {
                bVar.mo94416a((MusicModel) null);
            }
        }
    }

    /* renamed from: m */
    public final void mo94376m() {
        int i = -1;
        if (TextUtils.isEmpty(this.f130184d) || C13603b.m24435a((Collection) mo63369e())) {
            this.f130183c = -1;
            return;
        }
        for (MusicModel musicModel : mo63369e()) {
            i++;
            if (musicModel != null && TextUtils.equals(musicModel.getMusicId(), this.f130184d)) {
                this.f130183c = i;
                return;
            }
        }
        this.f130183c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f130182b = recyclerView;
        registerAdapterDataObserver(this.f130180B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.f130180B);
        this.f130182b = null;
    }

    public C57174b(AbstractC57080c<C57192b> cVar) {
        this.f130192w = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        Object obj;
        if (!this.f130195z) {
            obj = this.f92236l.get(i);
        } else if (i == 0) {
            return 2;
        } else {
            obj = this.f92236l.get(i - 1);
        }
        if (obj != null) {
            return 0;
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        boolean z;
        MethodCollector.m26663i(7482);
        try {
            z = C52912c.f121688a.f121689b.getShowMusicFeedbackEntrance().booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (!this.f130193x || !z) {
            RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
            MethodCollector.m26664o(7482);
            return a_;
        }
        RecyclerView.ViewHolder a_2 = super.mo62748a_(viewGroup);
        try {
            this.f130191k = C52912c.f121688a.f121689b.getFeConfigCollection().getMusicFaq().getSchema();
        } catch (Exception unused2) {
        }
        SpannableString spannableString = new SpannableString("");
        C571751 r1 = new ClickableSpan() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b.C571751 */

            static {
                Covode.recordClassIndex(67076);
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                C60830h.C60831a a = C60830h.m110432a(C57174b.this.f130191k);
                a.mo98236a("enter_from", "video_shoot_page");
                C36125t.m73598a(C36125t.m73591a(), a.mo98235a().toString());
            }
        };
        if (spannableString.length() > 9) {
            spannableString.setSpan(r1, 9, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(viewGroup.getContext(), R.color.ng)), 9, spannableString.length(), 33);
        }
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, (ViewGroup) null);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(C0643b.m2378c(viewGroup.getContext(), R.color.c6));
        textView.setPadding(0, 20, 0, 0);
        DmtStatusView dmtStatusView = (DmtStatusView) a_2.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(textView));
        MethodCollector.m26664o(7482);
        return a_2;
    }

    public C57174b(AbstractC57080c<C57192b> cVar, byte b) {
        this.f130192w = cVar;
        this.f130193x = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            C57320o oVar = new C57320o(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ade, viewGroup, false), this.f130188h);
            oVar.mo94501a(this.f130179A, this.f130192w);
            return oVar;
        } else if (i != 2) {
            return new C57318m(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa1, viewGroup, false));
        } else {
            return this.f130194y.mo94238a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0173  */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60186a(androidx.recyclerview.widget.RecyclerView.ViewHolder r13, int r14) {
        /*
        // Method dump skipped, instructions count: 446
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b.mo60186a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
