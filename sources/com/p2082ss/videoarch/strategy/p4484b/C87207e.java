package com.p2082ss.videoarch.strategy.p4484b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.videoarch.strategy.LiveStrategyManager;
import com.p2082ss.videoarch.strategy.p4484b.p4485a.C87201a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.videoarch.strategy.b.e */
public final class C87207e {

    /* renamed from: a */
    public final Set<AbstractC87212a> f197470a = new HashSet();

    /* renamed from: b */
    public final Handler f197471b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C87200a f197472c;

    /* renamed from: d */
    public C87201a f197473d = null;

    /* renamed from: e */
    public boolean f197474e = false;

    /* renamed from: f */
    public int f197475f = 0;

    /* renamed from: g */
    public String f197476g = "";

    /* renamed from: h */
    public boolean f197477h = true;

    /* renamed from: i */
    private final C87213f f197478i;

    /* renamed from: j */
    private String f197479j = "\n    \"RecommendSettingsRequest\":{\n        \"Enabled\":true,\n        \"BusinessInfo\":{\n            \"ProjectKeys\":[\"live_stream_strategy_engine\"]\n        }\n    }";

    /* renamed from: com.ss.videoarch.strategy.b.e$a */
    public interface AbstractC87212a {
        static {
            Covode.recordClassIndex(103015);
        }

        /* renamed from: a */
        void mo141055a(C87201a aVar, String str);
    }

    static {
        Covode.recordClassIndex(103010);
    }

    /* renamed from: a */
    public final void mo141073a(final String str) {
        if (!this.f197474e) {
            this.f197474e = true;
            this.f197478i.mo141080a(new Runnable() {
                /* class com.p2082ss.videoarch.strategy.p4484b.C87207e.RunnableC872081 */

                static {
                    Covode.recordClassIndex(103011);
                }

                public final void run() {
                    final C87201a aVar;
                    try {
                        if (LiveStrategyManager.mDnsOptimizer != null) {
                            C87207e.this.f197476g = LiveStrategyManager.mDnsOptimizer.mo141082a(C87207e.this.f197477h, str);
                        }
                        C87200a aVar2 = C87207e.this.f197472c;
                        C87207e eVar = C87207e.this;
                        aVar = new C87201a(aVar2.mo141066a("/api/neptune/v3/sdk/PackLiveSDK", (Object) eVar.mo141075b(eVar.f197476g)));
                    } catch (Exception e) {
                        e.printStackTrace();
                        aVar = null;
                    }
                    if (C87207e.this.f197477h && aVar != null) {
                        C87207e.this.f197477h = false;
                    }
                    C87207e.this.f197471b.post(new Runnable() {
                        /* class com.p2082ss.videoarch.strategy.p4484b.C87207e.RunnableC872081.RunnableC872091 */

                        static {
                            Covode.recordClassIndex(103012);
                        }

                        public final void run() {
                            C87207e.this.f197474e = false;
                            if (aVar == null) {
                                C87207e eVar = C87207e.this;
                                int i = eVar.f197475f + 1;
                                eVar.f197475f = i;
                                if (i <= 5) {
                                    C87207e eVar2 = C87207e.this;
                                    String str = str;
                                    eVar2.f197471b.removeCallbacksAndMessages(null);
                                    eVar2.f197471b.postDelayed(new Runnable(str) {
                                        /* class com.p2082ss.videoarch.strategy.p4484b.C87207e.RunnableC872113 */

                                        /* renamed from: a */
                                        final /* synthetic */ String f197487a;

                                        static {
                                            Covode.recordClassIndex(103014);
                                        }

                                        public final void run() {
                                            C87207e.this.mo141073a(this.f197487a);
                                        }

                                        {
                                            this.f197487a = r2;
                                        }
                                    }, 10000);
                                    return;
                                }
                                return;
                            }
                            C87207e.this.f197475f = 0;
                            C87207e.this.f197473d = aVar;
                            for (AbstractC87212a aVar : C87207e.this.f197470a) {
                                aVar.mo141055a(C87207e.this.f197473d, str);
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: b */
    public final String mo141075b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(this.f197479j);
        if (!str.equals("")) {
            sb.append(",").append(str);
        }
        return sb.append("}").toString();
    }

    C87207e(C87213f fVar, C87200a aVar) {
        this.f197478i = fVar;
        this.f197472c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r3 == null) goto L_0x004f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141074a(final java.lang.String r6, final android.os.Handler r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.strategy.p4484b.C87207e.mo141074a(java.lang.String, android.os.Handler):void");
    }
}
