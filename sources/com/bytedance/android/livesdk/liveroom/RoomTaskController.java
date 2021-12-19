package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.live.base.model.live.C2981d;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.live.api.LIveTaskApi;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.model.C11836b;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;

public class RoomTaskController implements ISubController {
    private List<AbstractC88412b> taskDisposable = new ArrayList();

    static {
        Covode.recordClassIndex(10246);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestory() {
        for (AbstractC88412b bVar : this.taskDisposable) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
        List<C11836b> liveActivityTasksSetting = ((IHostAction) C6193a.m13435a(IHostAction.class)).getLiveActivityTasksSetting();
        EnterRoomConfig enterRoomConfig = C11870f.C11871a.f28404a.mo19010a().f28391b;
        if (!(liveActivityTasksSetting == null || liveActivityTasksSetting.size() <= 0 || enterRoomConfig == null || enterRoomConfig.f28233c == null || !C13627m.m24499a("referral_task", enterRoomConfig.f28233c.f28293J))) {
            for (final C11836b bVar : liveActivityTasksSetting) {
                if (bVar.f28199b.intValue() == 2) {
                    this.taskDisposable.add(AbstractC88979t.m154285a(bVar.f28200c.longValue(), TimeUnit.SECONDS, C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f<Long>() {
                        /* class com.bytedance.android.livesdk.liveroom.RoomTaskController.C93131 */

                        static {
                            Covode.recordClassIndex(10247);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Long l) {
                            if (bVar.f28201d != null) {
                                for (String str : bVar.f28201d) {
                                    ((LIveTaskApi) C5805e.m12718a().mo11572a(LIveTaskApi.class)).report(str, new HashMap()).mo143267a((AbstractC88434g<? super C5832d<C2981d>, ? extends AbstractC88984x<? extends R>>) new AbstractC88434g<C5832d<C2981d>, AbstractC88984x<?>>() {
                                        /* class com.bytedance.android.livesdk.liveroom.RoomTaskController.C93131.C93141 */

                                        static {
                                            Covode.recordClassIndex(10248);
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // p4560f.p4561a.p4567d.AbstractC88434g
                                        public final /* synthetic */ AbstractC88984x<?> apply(C5832d<C2981d> dVar) {
                                            C5832d<C2981d> dVar2 = dVar;
                                            if (((C2981d) dVar2.data).f8751a == 0 || ((C2981d) dVar2.data).f8751a == 51) {
                                                return AbstractC88979t.m154310b(dVar2);
                                            }
                                            return AbstractC88979t.m154302a(new Exception("retry"));
                                        }
                                    }, false).mo143302g(C11195i.m19837a((long) ((int) ((Math.random() * 1001.0d) + 4000.0d)))).mo143254a(C9319e.f22755a, C9320f.f22756a);
                                }
                            }
                        }
                    }));
                }
            }
        }
    }
}
