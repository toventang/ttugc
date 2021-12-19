package com.p2082ss.android.ugc.aweme.mix.pickcandidate;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59397c;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel */
public final class MultiVideoViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public List<Aweme> f136405a = new ArrayList();

    /* renamed from: b */
    public List<C59905a> f136406b = new ArrayList();

    /* renamed from: c */
    public List<Aweme> f136407c = new ArrayList();

    /* renamed from: d */
    public C1213t<Integer> f136408d = new C1213t<>();

    /* renamed from: e */
    public C1213t<Integer> f136409e = new C1213t<>();

    /* renamed from: f */
    public boolean f136410f;

    /* renamed from: g */
    public boolean f136411g = true;

    /* renamed from: h */
    public boolean f136412h;

    /* renamed from: i */
    public C1213t<Integer> f136413i = new C1213t<>();

    /* renamed from: j */
    public List<String> f136414j = new ArrayList();

    /* renamed from: k */
    public String f136415k = "";

    /* renamed from: l */
    private final AbstractC89244h f136416l = C89250i.m154773a((AbstractC89171a) new C59899b(this));

    static {
        Covode.recordClassIndex(70308);
    }

    /* renamed from: a */
    public final AbstractC17692b<C59397c> mo97287a() {
        return (AbstractC17692b) this.f136416l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$a */
    public enum EnumC59898a {
        SUCCESS(0),
        EMPTY(1),
        ERROR(2);
        

        /* renamed from: b */
        private int f136418b;

        public final int getStatus() {
            return this.f136418b;
        }

        static {
            Covode.recordClassIndex(70309);
        }

        public final void setStatus(int i) {
            this.f136418b = i;
        }

        private EnumC59898a(int i) {
            this.f136418b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b */
    static final class C59899b extends AbstractC89220m implements AbstractC89171a<C599001> {

        /* renamed from: a */
        final /* synthetic */ MultiVideoViewModel f136419a;

        static {
            Covode.recordClassIndex(70310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59899b(MultiVideoViewModel multiVideoViewModel) {
            super(0);
            this.f136419a = multiVideoViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C599001 invoke() {
            C17693c cVar = new C17693c();
            cVar.f42320b = false;
            cVar.f42321c = LoadingFooterCell.class;
            return new AbstractC17692b<C59397c>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel.C59899b.C599001 */

                /* renamed from: a */
                final /* synthetic */ C59899b f136420a;

                static {
                    Covode.recordClassIndex(70311);
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b$1$b */
                static final class C59902b<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ AbstractC89124d f136423a;

                    static {
                        Covode.recordClassIndex(70313);
                    }

                    C59902b(AbstractC89124d dVar) {
                        this.f136423a = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f136423a.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(((Throwable) obj).getMessage()))));
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b$1$d */
                static final class C59904d<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ C599001 f136426a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC89124d f136427b;

                    static {
                        Covode.recordClassIndex(70315);
                    }

                    C59904d(C599001 r1, AbstractC89124d dVar) {
                        this.f136426a = r1;
                        this.f136427b = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f136427b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(((Throwable) obj).getMessage()))));
                        this.f136426a.f136420a.f136419a.f136409e.postValue(Integer.valueOf(EnumC59898a.ERROR.getStatus()));
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<C59397c>> dVar) {
                    C89219l.m154721d(dVar, "");
                    C89219l.m154716b(MixFeedApi.C59385a.m109095a().getMixCandidateFeeds(0).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59903c(this, dVar), new C59904d(this, dVar)), "");
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b$1$a */
                static final class C59901a<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ C599001 f136421a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC89124d f136422b;

                    static {
                        Covode.recordClassIndex(70312);
                    }

                    C59901a(C599001 r1, AbstractC89124d dVar) {
                        this.f136421a = r1;
                        this.f136422b = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C59397c cVar = (C59397c) obj;
                        List<Aweme> mixVideos = cVar.getMixVideos();
                        if (mixVideos != null) {
                            for (Aweme aweme : mixVideos) {
                                this.f136421a.f136420a.f136419a.f136405a.add(aweme);
                            }
                        }
                        this.f136421a.f136420a.f136419a.f136406b.addAll(this.f136421a.f136420a.f136419a.mo97288a(cVar.getMixVideos()));
                        this.f136421a.f136420a.f136419a.f136410f = cVar.getHasMore();
                        if (cVar.getHasMore()) {
                            this.f136422b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32840a(null, cVar, this.f136421a.f136420a.f136419a.mo97288a(cVar.getMixVideos()))));
                        } else {
                            this.f136422b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(this.f136421a.f136420a.f136419a.mo97288a(cVar.getMixVideos()))));
                        }
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b$1$c */
                static final class C59903c<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ C599001 f136424a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC89124d f136425b;

                    static {
                        Covode.recordClassIndex(70314);
                    }

                    C59903c(C599001 r1, AbstractC89124d dVar) {
                        this.f136424a = r1;
                        this.f136425b = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C59397c cVar = (C59397c) obj;
                        List<Aweme> mixVideos = cVar.getMixVideos();
                        if (mixVideos != null) {
                            for (Aweme aweme : mixVideos) {
                                this.f136424a.f136420a.f136419a.f136405a.add(aweme);
                            }
                        }
                        List<C59905a> a = this.f136424a.f136420a.f136419a.mo97288a(cVar.getMixVideos());
                        this.f136424a.f136420a.f136419a.f136406b.addAll(a);
                        this.f136424a.f136420a.f136419a.f136410f = cVar.getHasMore();
                        if (cVar.getHasMore()) {
                            this.f136424a.f136420a.f136419a.f136409e.postValue(Integer.valueOf(EnumC59898a.SUCCESS.getStatus()));
                            this.f136425b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32840a(null, cVar, a)));
                            return;
                        }
                        if (cVar.getMixVideos() != null) {
                            List<Aweme> mixVideos2 = cVar.getMixVideos();
                            if (mixVideos2 == null) {
                                C89219l.m154715b();
                            }
                            if (!mixVideos2.isEmpty()) {
                                this.f136424a.f136420a.f136419a.f136409e.postValue(Integer.valueOf(EnumC59898a.SUCCESS.getStatus()));
                                this.f136425b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(a)));
                            }
                        }
                        this.f136424a.f136420a.f136419a.f136409e.postValue(Integer.valueOf(EnumC59898a.EMPTY.getStatus()));
                        this.f136425b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(a)));
                    }
                }

                {
                    this.f136420a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    C59397c cVar = (C59397c) obj;
                    C89219l.m154721d(dVar, "");
                    C89219l.m154721d(cVar, "");
                    if (this.f136420a.f136419a.f136411g && cVar.getHasMore()) {
                        C89219l.m154716b(MixFeedApi.C59385a.m109095a().getMixCandidateFeeds(cVar.getMaxCursor()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59901a(this, dVar), new C59902b(dVar)), "");
                    }
                }
            };
        }
    }

    /* renamed from: b */
    public final void mo97290b() {
        mo97287a().f42330c.mo28163e();
    }

    /* renamed from: a */
    private void m109341a(int i) {
        this.f136408d.postValue(Integer.valueOf(i));
    }

    /* renamed from: b */
    private void m109342b(int i) {
        this.f136413i.postValue(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo97289a(Aweme aweme) {
        if (aweme != null) {
            this.f136407c.add(aweme);
            m109341a(this.f136407c.size());
            if (this.f136413i.getValue() != null) {
                Integer value = this.f136413i.getValue();
                if (value == null) {
                    C89219l.m154715b();
                }
                m109342b(value.intValue() + 1);
            }
        }
    }

    /* renamed from: b */
    public final void mo97291b(Aweme aweme) {
        if (aweme != null) {
            this.f136407c.remove(aweme);
            m109341a(this.f136407c.size());
            if (this.f136413i.getValue() != null) {
                Integer value = this.f136413i.getValue();
                if (value == null) {
                    C89219l.m154715b();
                }
                m109342b(value.intValue() - 1);
            }
        }
    }

    /* renamed from: a */
    public final List<C59905a> mo97288a(List<? extends Aweme> list) {
        UrlModel urlModel;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                C59905a aVar = new C59905a();
                Video video = aweme.getVideo();
                if (video != null) {
                    urlModel = video.getCover();
                } else {
                    urlModel = null;
                }
                aVar.f136428a = urlModel;
                aVar.f136430c = aweme.playlistBlocked;
                aVar.f136434g = aweme.playlistBlocked;
                PlayListInfo playListInfo = aweme.playlist_info;
                if (playListInfo != null) {
                    if (C89361p.m154872a(playListInfo.getMixId(), this.f136415k, false)) {
                        aVar.f136433f = true;
                        aVar.f136429b = true;
                    } else {
                        aVar.f136431d = true;
                        aVar.f136430c = true;
                    }
                }
                aVar.f136432e = aweme;
                for (Aweme aweme2 : this.f136407c) {
                    if (C89219l.m154714a(aweme, aweme2)) {
                        aVar.f136429b = true;
                        aVar.f136433f = true;
                    }
                }
                for (String str : this.f136414j) {
                    if (C89219l.m154714a((Object) aweme.getAid(), (Object) str)) {
                        aVar.f136431d = false;
                        aVar.f136430c = false;
                        aVar.f136433f = false;
                        aVar.f136429b = false;
                    }
                }
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
