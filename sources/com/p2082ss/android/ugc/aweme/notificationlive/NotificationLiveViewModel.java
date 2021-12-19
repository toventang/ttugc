package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel */
public final class NotificationLiveViewModel extends JediViewModel<ResponseState> {

    /* renamed from: a */
    public static final C62506a f141774a = new C62506a((byte) 0);

    /* renamed from: b */
    private final C62590u f141775b = new C62590u();

    static {
        Covode.recordClassIndex(73299);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel$a */
    public static final class C62506a {
        static {
            Covode.recordClassIndex(73300);
        }

        private C62506a() {
        }

        public /* synthetic */ C62506a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ ResponseState mo23027d() {
        return new ResponseState(0, 0, null, null, 15, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel$b */
    static final class C62507b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NotificationLiveViewModel f141776a;

        static {
            Covode.recordClassIndex(73301);
        }

        C62507b(NotificationLiveViewModel notificationLiveViewModel) {
            this.f141776a = notificationLiveViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C62683w wVar = (C62683w) obj;
            this.f141776a.mo33689c(new AbstractC89172b<ResponseState, ResponseState>() {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel.C62507b.C625081 */

                static {
                    Covode.recordClassIndex(73302);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ ResponseState invoke(ResponseState responseState) {
                    ResponseState responseState2 = responseState;
                    C89219l.m154721d(responseState2, "");
                    return ResponseState.copy$default(responseState2, wVar.f142112a.f142115a, wVar.f142114c, null, new C62562r(), 4, null);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel$c */
    public static final class C62509c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NotificationLiveViewModel f141778a;

        static {
            Covode.recordClassIndex(73303);
        }

        C62509c(NotificationLiveViewModel notificationLiveViewModel) {
            this.f141778a = notificationLiveViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel$c$a */
        static final class C62510a extends AbstractC89220m implements AbstractC89172b<ResponseState, ResponseState> {

            /* renamed from: a */
            final /* synthetic */ C62683w f141779a;

            static {
                Covode.recordClassIndex(73304);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62510a(C62683w wVar) {
                super(1);
                this.f141779a = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ResponseState invoke(ResponseState responseState) {
                ResponseState responseState2 = responseState;
                C89219l.m154721d(responseState2, "");
                return ResponseState.copy$default(responseState2, this.f141779a.f142112a.f142115a, this.f141779a.f142114c, new C62562r(), null, 8, null);
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C62683w wVar = (C62683w) ((C20169f) obj).mo33486a();
            if (wVar != null) {
                this.f141778a.mo33689c(new C62510a(wVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo100459a(C62682v vVar) {
        C89219l.m154721d(vVar, "");
        AbstractC88412b d = this.f141775b.mo100528a(vVar).mo143289d(new C62507b(this));
        C89219l.m154716b(d, "");
        mo33680a(d);
    }

    /* renamed from: a */
    public final void mo100460a(String str) {
        C89219l.m154721d(str, "");
        AbstractC88412b d = C62590u.m113011a(str).mo143289d(new C62509c(this));
        C89219l.m154716b(d, "");
        mo33680a(d);
    }
}
