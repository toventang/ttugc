package com.p2082ss.android.ugc.aweme.question;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.AbstractC35485a;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.question.p3663e.C66520a;
import com.p2082ss.android.ugc.aweme.question.viewmodel.QuestionDetailViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.g */
public final class C66527g extends C35658s.AbstractC35665d {
    public static final C66528a Companion = new C66528a((byte) 0);

    /* renamed from: a */
    private WeakReference<ActivityC0945e> f149586a;

    /* renamed from: b */
    private Aweme f149587b;

    /* renamed from: c */
    private C66504c f149588c;

    /* renamed from: d */
    private String f149589d;

    static {
        Covode.recordClassIndex(78070);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final boolean sendCustomRequest(C39101b<? extends AbstractC39100a<?, ?>> bVar, int i) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.question.g$a */
    public static final class C66528a {
        static {
            Covode.recordClassIndex(78071);
        }

        private C66528a() {
        }

        public /* synthetic */ C66528a(byte b) {
            this();
        }
    }

    public final WeakReference<ActivityC0945e> getActivity() {
        return this.f149586a;
    }

    public final C66504c getQuestion() {
        return this.f149588c;
    }

    public final String getSource() {
        return this.f149589d;
    }

    public final Aweme getToJumpAweme() {
        return this.f149587b;
    }

    /* renamed from: com.ss.android.ugc.aweme.question.g$b */
    public static final class C66529b extends C39101b<C66520a> {

        /* renamed from: a */
        final /* synthetic */ C66527g f149590a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f149591b;

        static {
            Covode.recordClassIndex(78072);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
        /* renamed from: c */
        public final void mo57528c() {
            C66504c question;
            String str;
            String str2;
            C66520a aVar;
            List<Aweme> a;
            Aweme aweme;
            Aweme video;
            List<Aweme> a2;
            Aweme aweme2;
            if (this.f92286h != null && this.f92287i != null) {
                AbstractC39085b bVar = this.f92286h;
                C89219l.m154716b(bVar, "");
                int i = ((AbstractC39100a) bVar).mListQueryType;
                boolean z = false;
                if (i == 1) {
                    AbstractC39085b bVar2 = this.f92286h;
                    C89219l.m154716b(bVar2, "");
                    if (((AbstractC39100a) bVar2).isDataEmpty()) {
                        AbstractC39085b bVar3 = this.f92286h;
                        C89219l.m154716b(bVar3, "");
                        List<Aweme> a3 = ((C66520a) bVar3).mo105505a();
                        AbstractC39085b bVar4 = this.f92286h;
                        C89219l.m154716b(bVar4, "");
                        ((AbstractC39102c) this.f92287i).mo59512a(a3, ((AbstractC39100a) bVar4).isHasMore());
                        ((AbstractC39102c) this.f92287i).mo59525f();
                        return;
                    }
                    C66504c question2 = this.f149590a.getQuestion();
                    String str3 = null;
                    if (!(question2 == null || question2.getVideo() == null || (question = this.f149590a.getQuestion()) == null || question.getCreator() == null)) {
                        C66520a aVar2 = (C66520a) this.f92286h;
                        if (aVar2 == null || (a2 = aVar2.mo105505a()) == null || (aweme2 = a2.get(0)) == null) {
                            str = null;
                        } else {
                            str = aweme2.getAid();
                        }
                        C66504c question3 = this.f149590a.getQuestion();
                        if (question3 == null || (video = question3.getVideo()) == null) {
                            str2 = null;
                        } else {
                            str2 = video.getAid();
                        }
                        if (!(!C89219l.m154714a((Object) str, (Object) str2) || (aVar = (C66520a) this.f92286h) == null || (a = aVar.mo105505a()) == null || (aweme = a.get(0)) == null)) {
                            ActivityC0945e eVar = this.f149591b;
                            if (eVar != null) {
                                str3 = eVar.getString(R.string.dm5);
                            }
                            aweme.setLabelMusicStarterText(str3);
                        }
                    }
                    AbstractC39085b bVar5 = this.f92286h;
                    C89219l.m154716b(bVar5, "");
                    List<Aweme> a4 = ((C66520a) bVar5).mo105505a();
                    AbstractC39085b bVar6 = this.f92286h;
                    C89219l.m154716b(bVar6, "");
                    ((AbstractC39102c) this.f92287i).mo59512a(a4, ((AbstractC39100a) bVar6).isHasMore());
                } else if (i == 2) {
                    AbstractC39085b bVar7 = this.f92286h;
                    C89219l.m154716b(bVar7, "");
                    List<Aweme> a5 = ((C66520a) bVar7).mo105505a();
                    AbstractC39085b bVar8 = this.f92286h;
                    C89219l.m154716b(bVar8, "");
                    ((AbstractC39102c) this.f92287i).mo59523c(a5, !((AbstractC39100a) bVar8).isNewDataEmpty());
                } else if (i == 4) {
                    AbstractC39102c cVar = (AbstractC39102c) this.f92287i;
                    AbstractC39085b bVar9 = this.f92286h;
                    C89219l.m154716b(bVar9, "");
                    List<Aweme> a6 = ((C66520a) bVar9).mo105505a();
                    AbstractC39085b bVar10 = this.f92286h;
                    C89219l.m154716b(bVar10, "");
                    if (((AbstractC39100a) bVar10).isHasMore()) {
                        AbstractC39085b bVar11 = this.f92286h;
                        C89219l.m154716b(bVar11, "");
                        if (!((AbstractC39100a) bVar11).isNewDataEmpty()) {
                            z = true;
                        }
                    }
                    cVar.mo59517b(a6, z);
                }
            }
        }

        C66529b(C66527g gVar, ActivityC0945e eVar) {
            this.f149590a = gVar;
            this.f149591b = eVar;
        }
    }

    public final void setActivity(WeakReference<ActivityC0945e> weakReference) {
        this.f149586a = weakReference;
    }

    public final void setQuestion(C66504c cVar) {
        this.f149588c = cVar;
    }

    public final void setToJumpAweme(Aweme aweme) {
        this.f149587b = aweme;
    }

    public final void setSource(String str) {
        C89219l.m154721d(str, "");
        this.f149589d = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35665d
    public final void onJumpToDetail(String str) {
        C89219l.m154721d(str, "");
        super.onJumpToDetail(str);
    }

    public C66527g(C66504c cVar, String str) {
        C89219l.m154721d(str, "");
        this.f149588c = cVar;
        this.f149589d = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35665d
    public final int getDetailAwemeViewType(int i, Aweme aweme) {
        if (aweme == null || aweme.getNewLiveRoomData() == null) {
            return 0;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35658s.C35664c getJumpToVideoParam(C35658s.C35664c cVar, Aweme aweme) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aweme, "");
        this.f149587b = aweme;
        cVar.f84147a = "qa_detail";
        cVar.f84148b = "question_id";
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C39101b<? extends AbstractC39100a<?, ?>> getPresenter(int i, ActivityC0945e eVar) {
        C66520a aVar = new C66520a();
        if (eVar != null) {
            QuestionDetailViewModel a = QuestionDetailViewModel.C66578a.m118326a(eVar);
            C89219l.m154721d(aVar, "");
            a.f149693b.setValue(new C89378p<>(Integer.valueOf(i), aVar));
        }
        aVar.f149569b.f149579d = this.f149588c;
        String str = this.f149589d;
        if (!TextUtils.isEmpty(str)) {
            aVar.f149568a = str;
        }
        C66529b bVar = new C66529b(this, eVar);
        bVar.mo67838a((AbstractC39085b) aVar);
        return bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C66527g(C66504c cVar, String str, int i, C89214g gVar) {
        this(cVar, (i & 2) != 0 ? "" : str);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35665d
    public final AbstractC35485a onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, AbstractC35500d dVar) {
        C89219l.m154721d(viewGroup, "");
        return new C66536h(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.w3, viewGroup, false), str, dVar);
    }
}
