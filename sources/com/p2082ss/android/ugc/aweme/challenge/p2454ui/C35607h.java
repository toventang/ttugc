package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.AbstractC35485a;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.C35520a;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80454fs;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.h */
public final class C35607h extends C35658s.AbstractC35665d {
    public static final C35608a Companion = new C35608a((byte) 0);

    /* renamed from: a */
    private WeakReference<ActivityC0945e> f83989a;

    /* renamed from: b */
    private transient AbstractC89171a<C89378p<Long, String>> f83990b;

    /* renamed from: c */
    private Aweme f83991c;

    /* renamed from: d */
    private String f83992d;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.h$b */
    public static final class C35609b extends C39101b<C35520a> {

        /* renamed from: a */
        final /* synthetic */ C35607h f83993a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f83994b;

        static {
            Covode.recordClassIndex(42833);
        }

        /* renamed from: com.ss.android.ugc.aweme.challenge.ui.h$b$a */
        public static final class C35610a implements C80454fs.AbstractC80455a {
            static {
                Covode.recordClassIndex(42834);
            }

            C35610a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.C80454fs.AbstractC80455a
            /* renamed from: a */
            public final void mo62626a(String str, Map<String, String> map) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(map, "");
                C39162r.m79460a(str, map);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00dd, code lost:
            if (((com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a) r0).isNewDataEmpty() == false) goto L_0x00df;
         */
        @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo57528c() {
            /*
            // Method dump skipped, instructions count: 229
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35607h.C35609b.mo57528c():void");
        }

        C35609b(C35607h hVar, C89233z.C89238e eVar) {
            this.f83993a = hVar;
            this.f83994b = eVar;
        }
    }

    static {
        Covode.recordClassIndex(42831);
    }

    public C35607h() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final boolean sendCustomRequest(C39101b<? extends AbstractC39100a<?, ?>> bVar, int i) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.h$a */
    public static final class C35608a {
        static {
            Covode.recordClassIndex(42832);
        }

        private C35608a() {
        }

        public /* synthetic */ C35608a(byte b) {
            this();
        }
    }

    public final WeakReference<ActivityC0945e> getActivity() {
        return this.f83989a;
    }

    public final AbstractC89171a<C89378p<Long, String>> getPreloadInfoInvoke() {
        return this.f83990b;
    }

    public final String getSource() {
        return this.f83992d;
    }

    public final Aweme getToJumpAweme() {
        return this.f83991c;
    }

    public final void setActivity(WeakReference<ActivityC0945e> weakReference) {
        this.f83989a = weakReference;
    }

    public final void setPreloadInfoInvoke(AbstractC89171a<C89378p<Long, String>> aVar) {
        this.f83990b = aVar;
    }

    public final void setToJumpAweme(Aweme aweme) {
        this.f83991c = aweme;
    }

    public final void setSource(String str) {
        C89219l.m154721d(str, "");
        this.f83992d = str;
    }

    public C35607h(String str) {
        C89219l.m154721d(str, "");
        this.f83992d = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35665d
    public final void onJumpToDetail(String str) {
        C89219l.m154721d(str, "");
        super.onJumpToDetail(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35665d
    public final int getDetailAwemeViewType(int i, Aweme aweme) {
        if (aweme == null || aweme.getNewLiveRoomData() == null) {
            return 0;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C39101b<? extends AbstractC39100a<?, ?>> getPresenter(int i, ActivityC0945e eVar) {
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        T t = (T) new C35520a();
        if (eVar != null) {
            ChallengeDetailViewModel a = ChallengeDetailViewModel.C35676a.m72830a(eVar);
            C89219l.m154721d(t, "");
            a.f84177b.setValue(new C89378p<>(Integer.valueOf(i), t));
        }
        eVar2.element = t;
        eVar2.element.mo62417a(this.f83992d);
        C35609b bVar = new C35609b(this, eVar2);
        bVar.mo67838a((AbstractC39085b) eVar2.element);
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35658s.C35664c getJumpToVideoParam(C35658s.C35664c cVar, Aweme aweme) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aweme, "");
        C39162r.m79460a("feed_enter", new C33744d().mo59983a("enter_from", "challenge").mo59983a("group_id", aweme.getAid()).mo59983a("tag_id", cVar.f84150d).mo59983a("search_id", C35520a.f83761a.get(aweme.getAid())).mo59983a("rank_index", String.valueOf(cVar.f84152f)).mo59983a("process_id", cVar.f84151e).f79943a);
        this.f83991c = aweme;
        cVar.f84147a = "from_challenge";
        cVar.f84148b = "challenge_id";
        return cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35607h(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35665d
    public final AbstractC35485a onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, AbstractC35500d dVar) {
        C89219l.m154721d(viewGroup, "");
        if (i != 1) {
            return new C35611i(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.w3, viewGroup, false), str, dVar);
        }
        AbstractC35485a createLiveChallengeDetailViewHolder = C35671y.f84158a.createLiveChallengeDetailViewHolder();
        C89219l.m154716b(createLiveChallengeDetailViewHolder, "");
        return createLiveChallengeDetailViewHolder;
    }
}
