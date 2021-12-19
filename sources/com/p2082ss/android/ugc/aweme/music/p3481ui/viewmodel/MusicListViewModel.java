package com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3485d.C61162e;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicListViewModel */
public final class MusicListViewModel extends CommonListViewModel<Object, MusicListState> {

    /* renamed from: b */
    public static final C61220a f138999b = new C61220a((byte) 0);

    /* renamed from: a */
    public final C61162e f139000a = new C61162e();

    static {
        Covode.recordClassIndex(71829);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicListViewModel$a */
    public static final class C61220a {
        static {
            Covode.recordClassIndex(71830);
        }

        private C61220a() {
        }

        public /* synthetic */ C61220a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: a */
    public final AbstractC89172b<MusicListState, AbstractC88979t<C89378p<List<Object>, C20465o>>> mo33725a() {
        return new C61223c(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: b */
    public final AbstractC89172b<MusicListState, AbstractC88979t<C89378p<List<Object>, C20465o>>> mo33726b() {
        return new C61221b(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new MusicListState(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicListViewModel$b */
    static final class C61221b extends AbstractC89220m implements AbstractC89172b<MusicListState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ MusicListViewModel f139001a;

        static {
            Covode.recordClassIndex(71831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61221b(MusicListViewModel musicListViewModel) {
            super(1);
            this.f139001a = musicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C20465o>> invoke(MusicListState musicListState) {
            MusicListState musicListState2 = musicListState;
            C89219l.m154721d(musicListState2, "");
            AbstractC88979t d = C61162e.m110783a(this.f139001a.f139000a, musicListState2.getMusicId(), (long) ((ListState) musicListState2.getSubstate()).getPayload().f48407b, 0, 4).mo143292d(C612221.f139002a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicListViewModel$c */
    static final class C61223c extends AbstractC89220m implements AbstractC89172b<MusicListState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ MusicListViewModel f139003a;

        static {
            Covode.recordClassIndex(71833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61223c(MusicListViewModel musicListViewModel) {
            super(1);
            this.f139003a = musicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C20465o>> invoke(MusicListState musicListState) {
            int i;
            MusicListState musicListState2 = musicListState;
            C89219l.m154721d(musicListState2, "");
            if (C16048b.m29633a().mo25412a(true, "music_detail_more_sounds", 0) < 0) {
                i = 3;
            } else {
                i = 20;
            }
            AbstractC88979t d = C61162e.m110783a(this.f139003a.f139000a, musicListState2.getMusicId(), 0, i, 2).mo143292d(C612241.f139004a);
            C89219l.m154716b(d, "");
            return d;
        }
    }
}
