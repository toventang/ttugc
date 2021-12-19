package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
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
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.choosemusic.C35699a;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35890aj;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35896ap;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35897aq;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.C35836c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36025q;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.p2082ss.android.ugc.aweme.discover.model.MusicTitleModel;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60709a;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60825c;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60830h;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.b */
public final class C35703b extends AbstractC39060f<MusicModel> {

    /* renamed from: A */
    private AbstractC60709a f84214A;

    /* renamed from: B */
    private boolean f84215B;

    /* renamed from: C */
    private AbstractC35989s f84216C = new AbstractC35989s() {
        /* class com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b.C357052 */

        static {
            Covode.recordClassIndex(42937);
        }

        /* renamed from: a */
        private static boolean m72886a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s
        /* renamed from: a */
        public final void mo62753a(C36050s sVar, View view, MusicModel musicModel, int i) {
            String str;
            String str2;
            String str3;
            if (musicModel != null && view != null && view.getContext() != null) {
                if (!TextUtils.isEmpty(musicModel.getSearchKeyWords())) {
                    C35836c.m73228g().mo62941b(new MusicSearchHistory(musicModel.getSearchKeyWords()));
                }
                view.getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m72886a();
                }
                if (!C58029j.f132256h) {
                    new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                    return;
                }
                int id = view.getId();
                C35703b.this.f84222e.f84355i = musicModel.getLogPb();
                C35703b.this.f84222e.f84356j = musicModel.getSearchId();
                if (id == R.id.bxo) {
                    Activity j = C17873f.m33102j();
                    if (j != null) {
                        j.getString(R.string.bs5);
                    }
                    if (!AccountService.m65215a().mo57069e().isLogin()) {
                        C35699a.m72864a(C17873f.m33102j(), C35937c.m73325a(i), "click_favorite_music");
                        return;
                    }
                    sVar.mo63159e();
                    C35936b.m73320a(sVar.f85025u, musicModel.getMusicId(), C35703b.this.f84222e, sVar.f85028x, musicModel.getLogPb());
                    C35754b bVar = C35703b.this.f84222e;
                    if (bVar != null) {
                        str = bVar.f84347a;
                    } else {
                        str = null;
                    }
                    if (TextUtils.equals("search_music", str)) {
                        AbstractC41955b f = SearchServiceImpl.m119336t().mo106217f();
                        if (bVar == null || (str2 = bVar.f84347a) == null) {
                            str2 = "";
                        }
                        int position = sVar.getPosition();
                        if (sVar.f85025u) {
                            str3 = "click_favourite_button";
                        } else {
                            str3 = "click_cancel_favourite";
                        }
                        f.mo71116a(str2, musicModel, position, str3);
                    }
                } else if (id == R.id.bxq) {
                    if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(R.string.dau);
                        }
                        new C79459a(view.getContext()).mo123052a(offlineDesc).mo123053a();
                    } else if (C60826d.m110428a(musicModel, view.getContext(), true)) {
                        String uuid = UUID.randomUUID().toString();
                        C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://music/detail/" + musicModel.getMusicId()).mo63248a("process_id", uuid).mo63249a());
                        C35936b.m73315a(C35703b.this.f84222e, musicModel.getMusicId(), false, uuid);
                    }
                } else if (id == R.id.cey || id == R.id.dma) {
                    if (C60826d.m110428a(musicModel, view.getContext(), true) && C35703b.this.f84218a != null) {
                        C34822d.m71158a(view.getContext(), "av_settings.xml", 0);
                        C35703b.this.f84218a.mo62881b(musicModel);
                        C35936b.m73313a(C35703b.this.f84222e, musicModel.getMusicId(), sVar.getLayoutPosition(), musicModel.getLogPb());
                    }
                } else if (id == R.id.cds) {
                    C35703b.this.mo62746a(sVar, musicModel);
                }
            }
        }
    };

    /* renamed from: D */
    private RecyclerView.AbstractC1353c f84217D = new RecyclerView.AbstractC1353c() {
        /* class com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b.C357063 */

        static {
            Covode.recordClassIndex(42938);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            super.mo4655a();
            C35703b.this.mo62750d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            C35703b.this.mo62750d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            C35703b.this.mo62750d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            C35703b.this.mo62750d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            C35703b.this.mo62750d();
        }
    };

    /* renamed from: a */
    public AbstractC35827b f84218a;

    /* renamed from: b */
    RecyclerView f84219b;

    /* renamed from: c */
    int f84220c = -1;

    /* renamed from: d */
    public String f84221d;

    /* renamed from: e */
    public C35754b f84222e;

    /* renamed from: f */
    public boolean f84223f;

    /* renamed from: g */
    public boolean f84224g;

    /* renamed from: h */
    public boolean f84225h = true;

    /* renamed from: i */
    public int f84226i;

    /* renamed from: j */
    public C35890aj f84227j;

    /* renamed from: k */
    String f84228k = "";

    /* renamed from: w */
    private AbstractC60731k<C35757c> f84229w;

    /* renamed from: x */
    private String f84230x;

    /* renamed from: y */
    private boolean f84231y;

    /* renamed from: z */
    private boolean f84232z;

    static {
        Covode.recordClassIndex(42935);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void ap_() {
        super.ap_();
        C39162r.m79460a("music_search_feedback_show", new C33744d().mo59983a("enter_from", "video_shoot_page").f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final int mo60933c() {
        if (!this.f84215B) {
            return super.mo60933c();
        }
        if (this.f92236l == null) {
            return 0;
        }
        return this.f92236l.size() + 1;
    }

    /* renamed from: a */
    public final void mo62745a() {
        if (this.f84220c < 0) {
            this.f84230x = null;
            return;
        }
        MediaPlayer a = C60825c.m110422a();
        int i = this.f84220c;
        if (i != -1) {
            RecyclerView.ViewHolder f = this.f84219b.mo4451f(i);
            if (f instanceof C36050s) {
                ((AbstractC35998a) f).mo63155a(false, false);
            }
            int i2 = this.f84220c;
            this.f84220c = -1;
            this.f84230x = null;
            if (f == null) {
                notifyItemChanged(i2);
            }
        }
        if (a != null && a.isPlaying()) {
            a.pause();
        }
        AbstractC35827b bVar = this.f84218a;
        if (bVar != null) {
            bVar.mo62875a((MusicModel) null);
        }
    }

    /* renamed from: d */
    public final void mo62750d() {
        int i = -1;
        if (TextUtils.isEmpty(this.f84230x) || C13603b.m24435a((Collection) mo63369e())) {
            this.f84220c = -1;
            return;
        }
        for (MusicModel musicModel : mo63369e()) {
            i++;
            if (musicModel != null && TextUtils.equals(musicModel.getMusicId(), this.f84230x)) {
                this.f84220c = i;
                return;
            }
        }
        this.f84220c = i;
    }

    /* renamed from: a */
    public final void mo62747a(boolean z) {
        if (this.f84220c >= 0) {
            this.f84219b.post(new RunnableC35710f(this, z));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f84219b = recyclerView;
        registerAdapterDataObserver(this.f84217D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.f84217D);
        this.f84219b = null;
    }

    public C35703b(AbstractC60731k<C35757c> kVar) {
        this.f84229w = kVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        Object obj;
        if (!this.f84215B) {
            obj = this.f92236l.get(i);
        } else if (i == 0) {
            return 2;
        } else {
            obj = this.f92236l.get(i - 1);
        }
        if (obj instanceof DynamicMusicModel) {
            return 5;
        }
        if (obj instanceof MusicTitleModel) {
            return 6;
        }
        if (obj instanceof C35897aq) {
            return 3;
        }
        if (obj instanceof C35896ap) {
            return 4;
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
        MethodCollector.m26663i(959);
        try {
            z = C52912c.f121688a.f121689b.getShowMusicFeedbackEntrance().booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (this.f84231y && z) {
            RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
            try {
                this.f84228k = C52912c.f121688a.f121689b.getFeConfigCollection().getMusicFaq().getSchema();
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString("");
            C357041 r2 = new ClickableSpan() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b.C357041 */

                static {
                    Covode.recordClassIndex(42936);
                }

                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    C60830h.C60831a a = C60830h.m110432a(C35703b.this.f84228k);
                    a.mo98236a("enter_from", "video_shoot_page");
                    C36125t.m73598a(C36125t.m73591a(), a.mo98235a().toString());
                    C39162r.m79460a("music_search_feedback_click", new C33744d().mo59983a("enter_from", "video_shoot_page").f79943a);
                }
            };
            if (spannableString.length() > 9) {
                spannableString.setSpan(r2, 9, spannableString.length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(viewGroup.getContext(), R.color.ng)), 9, spannableString.length(), 33);
            }
            TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, (ViewGroup) null);
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setTextColor(C0643b.m2378c(viewGroup.getContext(), R.color.c6));
            textView.setPadding(0, 20, 0, 0);
            DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
            dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(textView));
            MethodCollector.m26664o(959);
            return a_;
        } else if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            RecyclerView.ViewHolder a_2 = super.mo62748a_(viewGroup);
            TextView textView2 = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, (ViewGroup) null);
            textView2.setText(viewGroup.getContext().getText(R.string.anc));
            if (Build.VERSION.SDK_INT >= 23) {
                textView2.setTextColor(viewGroup.getContext().getColor(R.color.c6));
            } else {
                textView2.setTextColor(viewGroup.getContext().getResources().getColor(R.color.c6));
            }
            textView2.setPadding((int) C13628n.m24520b(viewGroup.getContext(), 16.0f), (int) C13628n.m24520b(viewGroup.getContext(), 17.0f), (int) C13628n.m24520b(viewGroup.getContext(), 16.0f), 0);
            DmtStatusView dmtStatusView2 = (DmtStatusView) a_2.itemView;
            dmtStatusView2.setBuilder(dmtStatusView2.mo27381c().mo27406b(textView2));
            MethodCollector.m26664o(959);
            return a_2;
        } else {
            RecyclerView.ViewHolder a_3 = super.mo62748a_(viewGroup);
            MethodCollector.m26664o(959);
            return a_3;
        }
    }

    public C35703b(AbstractC60731k<C35757c> kVar, AbstractC60709a aVar) {
        this.f84229w = kVar;
        this.f84231y = false;
        this.f84215B = true;
        this.f84214A = aVar;
    }

    public C35703b(AbstractC60731k<C35757c> kVar, boolean z) {
        this.f84229w = kVar;
        this.f84231y = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            C36050s sVar = new C36050s(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_t, viewGroup, false), this.f84226i);
            sVar.mo63153a(this.f84216C, this.f84229w);
            return sVar;
        } else if (i == 2) {
            return this.f84214A.mo63147a(viewGroup);
        } else {
            if (i == 3) {
                return C67446h.f151111a.mo106217f().mo71107a(viewGroup).mo70833b();
            }
            if (i == 4) {
                return C67446h.f151111a.mo106217f().mo71122d(viewGroup);
            }
            if (i == 5) {
                return C67446h.f151111a.mo106217f().mo71119b(viewGroup).mo70833b();
            }
            if (i != 6) {
                return new C36025q(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa1, viewGroup, false));
            }
            return C67446h.f151111a.mo106217f().mo71120c(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo62746a(C36050s sVar, MusicModel musicModel) {
        sVar.getPosition();
        if (this.f84220c == sVar.getPosition()) {
            if (this.f84218a != null) {
                mo62745a();
            }
            C35699a.m72865a(sVar, musicModel, this.f84222e, this.f84232z);
            this.f84232z = !this.f84232z;
        } else if (this.f84218a != null) {
            mo62745a();
            this.f84220c = sVar.getPosition();
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                MediaPlayer a = C60825c.m110422a();
                try {
                    a.reset();
                    if (musicModel.getLocalPath().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                        a.setDataSource(this.f84219b.getContext(), Uri.parse(musicModel.getLocalPath()));
                    } else {
                        a.setDataSource(musicModel.getLocalPath());
                    }
                    a.setAudioStreamType(3);
                    a.prepareAsync();
                    a.setOnPreparedListener(new C35708d(sVar));
                    a.setOnErrorListener(C35709e.f84238a);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                this.f84218a.mo62874a(new C35707c(this));
                this.f84218a.mo62877a(musicModel, this.f84222e);
                C35936b.f84814c = sVar.getPosition();
            }
            C35699a.m72865a(sVar, musicModel, this.f84222e, false);
            this.f84232z = true;
        }
        this.f84230x = musicModel.getMusicId();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017f  */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60186a(androidx.recyclerview.widget.RecyclerView.ViewHolder r15, int r16) {
        /*
        // Method dump skipped, instructions count: 576
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b.mo60186a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
