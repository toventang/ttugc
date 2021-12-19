package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2441cf.p2442a.C35468c;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import java.util.concurrent.ExecutorService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService */
public interface ISimPlayerService {

    /* renamed from: a */
    public static final Companion f181026a = Companion.f181027a;

    /* renamed from: com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService$a */
    public interface AbstractC80989a {
        static {
            Covode.recordClassIndex(94302);
        }

        /* renamed from: a */
        void mo117299a(String str);
    }

    static {
        Covode.recordClassIndex(94299);
    }

    /* renamed from: a */
    AbstractC81002f mo124396a();

    /* renamed from: a */
    AbstractC81002f mo124397a(boolean z, boolean z2);

    /* renamed from: a */
    void mo124398a(int i);

    /* renamed from: a */
    void mo124399a(AbstractC80989a aVar);

    /* renamed from: a */
    void mo124400a(ExecutorService executorService);

    /* renamed from: b */
    AbstractC63041i mo124401b();

    /* renamed from: c */
    void mo124402c();

    /* renamed from: com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService$Companion */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f181027a = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(94301);
        }

        public final ISimPlayerService get() {
            ISimPlayerService iSimPlayerService;
            ISimPlayerConfig a = C80716a.C80717a.f180462a.mo123864a();
            C89219l.m154709a((Object) a, "");
            int playerType = a.getPlayerType();
            if (playerType == 0) {
                iSimPlayerService = (ISimPlayerService) C35468c.m72529a("com.ss.android.ugc.aweme.video.simplayer.tt.TTSimPlayerServiceImpl");
                if (iSimPlayerService == null) {
                    iSimPlayerService = (ISimPlayerService) C35468c.m72529a("com.ss.android.ugc.aweme.video.simplayer.ttcrop.TTCropSimPlayerServiceImpl");
                }
                return iSimPlayerService;
            } else if (playerType != 1) {
                iSimPlayerService = (ISimPlayerService) C35468c.m72529a("com.ss.android.ugc.aweme.video.simplayer.exo.ExoSimPlayerServiceImpl");
            } else {
                iSimPlayerService = (ISimPlayerService) C35468c.m72529a("com.ss.android.ugc.aweme.video.simplayer.exo.ExoSimPlayerServiceImpl");
            }
            if (iSimPlayerService == null) {
                throw new IllegalStateException("cannot find match player service, please check config: getPlayerType. need:".concat(String.valueOf(playerType)));
            }
            return iSimPlayerService;
        }
    }
}
