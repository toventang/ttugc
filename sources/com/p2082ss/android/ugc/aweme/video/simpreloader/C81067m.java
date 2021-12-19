package com.p2082ss.android.ugc.aweme.video.simpreloader;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.C80825d;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.C80826e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simpreloader.m */
public final class C81067m {

    /* renamed from: c */
    public static final AbstractC89244h f181186c = C89250i.m154773a((AbstractC89171a) C81071b.f181196a);

    /* renamed from: d */
    public static final C80825d f181187d = C80826e.m140220a();

    /* renamed from: e */
    public static final C81070a f181188e = new C81070a((byte) 0);

    /* renamed from: a */
    public final Executor f181189a;

    /* renamed from: b */
    public Handler f181190b;

    /* renamed from: f */
    private final ArrayList<C81062i> f181191f = new ArrayList<>();

    /* renamed from: g */
    private String f181192g = "";

    /* renamed from: h */
    private final HandlerThread f181193h;

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.m$a */
    public static final class C81070a {
        static {
            Covode.recordClassIndex(94391);
        }

        /* renamed from: a */
        public static C81067m m140763a() {
            return (C81067m) C81067m.f181186c.getValue();
        }

        private C81070a() {
        }

        public /* synthetic */ C81070a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.m$b */
    static final class C81071b extends AbstractC89220m implements AbstractC89171a<C81067m> {

        /* renamed from: a */
        public static final C81071b f181196a = new C81071b();

        static {
            Covode.recordClassIndex(94392);
        }

        C81071b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C81067m invoke() {
            return new C81067m();
        }
    }

    static {
        Covode.recordClassIndex(94388);
    }

    public C81067m() {
        HandlerThread handlerThread = new HandlerThread("VideoCoverPreloader");
        this.f181193h = handlerThread;
        this.f181189a = new ExecutorC81072c(this);
        if (f181187d.f180767a) {
            handlerThread.start();
            this.f181190b = new Handler(this, handlerThread.getLooper()) {
                /* class com.p2082ss.android.ugc.aweme.video.simpreloader.C81067m.HandlerC810681 */

                /* renamed from: a */
                final /* synthetic */ C81067m f181194a;

                static {
                    Covode.recordClassIndex(94389);
                }

                public final void handleMessage(Message message) {
                    C89219l.m154721d(message, "");
                    switch (message.what) {
                        case 1:
                            C81067m mVar = this.f181194a;
                            Object obj = message.obj;
                            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.video.simpreloader.AddMediaMsg");
                            mVar.mo124526a((C81052a) obj);
                            break;
                        case 2:
                            C81067m mVar2 = this.f181194a;
                            Object obj2 = message.obj;
                            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            mVar2.mo124527a((String) obj2);
                            break;
                        case 3:
                            C81067m mVar3 = this.f181194a;
                            Object obj3 = message.obj;
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            mVar3.mo124529b((String) obj3);
                            break;
                        case 4:
                            C81067m mVar4 = this.f181194a;
                            Object obj4 = message.obj;
                            Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            mVar4.mo124531d((String) obj4);
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            C81067m mVar5 = this.f181194a;
                            Object obj5 = message.obj;
                            Objects.requireNonNull(obj5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                            mVar5.mo124525a((Aweme) obj5);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            C81067m mVar6 = this.f181194a;
                            Object obj6 = message.obj;
                            Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.String");
                            mVar6.mo124533f((String) obj6);
                            break;
                    }
                    super.handleMessage(message);
                }

                {
                    this.f181194a = r2;
                }
            };
            AbstractC80918i b = C80937s.m140453b();
            C89219l.m154716b(b, "");
            b.mo124082e().mo124008a(new AbstractC80921k(this) {
                /* class com.p2082ss.android.ugc.aweme.video.simpreloader.C81067m.C810692 */

                /* renamed from: a */
                final /* synthetic */ C81067m f181195a;

                static {
                    Covode.recordClassIndex(94390);
                }

                @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k
                /* renamed from: a */
                public final void mo80918a(C84241i iVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k
                /* renamed from: a */
                public final void mo80919a(List<C84241i> list) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f181195a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k
                /* renamed from: a */
                public final void mo80917a(Pair<C84241i, String> pair) {
                    String str;
                    Handler handler;
                    Message obtainMessage;
                    C84241i iVar;
                    C81067m mVar = this.f181195a;
                    if (pair == null || (iVar = (C84241i) pair.first) == null) {
                        str = null;
                    } else {
                        str = iVar.getSourceId();
                    }
                    if (C81067m.f181187d.f180767a && C81067m.f181187d.f180769c && str != null && str.length() != 0 && (handler = mVar.f181190b) != null && (obtainMessage = handler.obtainMessage(2, str)) != null) {
                        obtainMessage.sendToTarget();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.m$c */
    static final class ExecutorC81072c implements Executor {

        /* renamed from: a */
        final /* synthetic */ C81067m f181197a;

        static {
            Covode.recordClassIndex(94393);
        }

        ExecutorC81072c(C81067m mVar) {
            this.f181197a = mVar;
        }

        public final void execute(Runnable runnable) {
            Handler handler = this.f181197a.f181190b;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: g */
    private final int m140750g(String str) {
        int size = this.f181191f.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, this.f181191f.get(i).f181179a)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final void mo124530c(String str) {
        Handler handler;
        Message obtainMessage;
        if (f181187d.f180767a && str != null && str.length() != 0 && (handler = this.f181190b) != null && (obtainMessage = handler.obtainMessage(4, str)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: e */
    public final void mo124532e(String str) {
        Handler handler;
        Message obtainMessage;
        if (f181187d.f180767a && str != null && str.length() != 0 && (handler = this.f181190b) != null && (obtainMessage = handler.obtainMessage(6, str)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo124525a(Aweme aweme) {
        String aid = aweme.getAid();
        C89219l.m154716b(aid, "");
        this.f181192g = aid;
        if (this.f181191f.size() != 0 && C80662ac.m139888a(aweme)) {
            ArrayList<C81062i> arrayList = this.f181191f;
            C81062i iVar = arrayList.get(arrayList.size() - 1);
            C89219l.m154716b(iVar, "");
            iVar.mo124520a(this.f181192g);
        }
    }

    /* renamed from: b */
    public final void mo124529b(String str) {
        if (this.f181191f.size() != 0) {
            ArrayList<C81062i> arrayList = this.f181191f;
            C81062i iVar = arrayList.get(arrayList.size() - 1);
            C89219l.m154716b(iVar, "");
            C81062i iVar2 = iVar;
            if (C89219l.m154714a((Object) str, (Object) this.f181192g)) {
                iVar2.mo124520a(str);
            }
        }
    }

    /* renamed from: d */
    public final void mo124531d(String str) {
        if (this.f181191f.size() != 0) {
            ArrayList<C81062i> arrayList = this.f181191f;
            C81062i iVar = arrayList.get(arrayList.size() - 1);
            C89219l.m154716b(iVar, "");
            C81062i iVar2 = iVar;
            if (C89219l.m154714a((Object) str, (Object) this.f181192g)) {
                iVar2.mo124522c();
            }
        }
    }

    /* renamed from: f */
    public final void mo124533f(String str) {
        int i;
        int g = m140750g(str);
        if (g != -1 && g < this.f181191f.size() && this.f181191f.size() - 1 >= g) {
            while (true) {
                this.f181191f.get(i).mo124522c();
                this.f181191f.get(i).mo124523d();
                this.f181191f.remove(i);
                if (i != g) {
                    i--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo124527a(String str) {
        if (this.f181191f.size() != 0) {
            ArrayList<C81062i> arrayList = this.f181191f;
            C81062i iVar = arrayList.get(arrayList.size() - 1);
            C89219l.m154716b(iVar, "");
            C81062i iVar2 = iVar;
            if (iVar2.mo124521b(str) > iVar2.mo124521b(this.f181192g)) {
                iVar2.mo124520a(this.f181192g);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r4 == -1) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124526a(com.p2082ss.android.ugc.aweme.video.simpreloader.C81052a r7) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simpreloader.C81067m.mo124526a(com.ss.android.ugc.aweme.video.simpreloader.a):void");
    }

    /* renamed from: a */
    public final void mo124528a(List<? extends Aweme> list, boolean z, String str) {
        Handler handler;
        Message obtainMessage;
        if (f181187d.f180767a && list != null && !list.isEmpty() && str != null && str.length() != 0 && (handler = this.f181190b) != null && (obtainMessage = handler.obtainMessage(1, new C81052a(new ArrayList(list), z, str))) != null) {
            obtainMessage.sendToTarget();
        }
    }
}
