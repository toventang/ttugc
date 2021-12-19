package com.p2082ss.android.vesdk.p4387c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.presenter.C30031g;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85410d;
import com.p2082ss.android.vesdk.VEARCoreParam;
import com.p2082ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p2082ss.android.vesdk.p4385a.C85298a;
import com.p2082ss.android.vesdk.p4385a.C85299b;
import com.p2082ss.android.vesdk.p4385a.C85300c;
import com.p2082ss.android.vesdk.p4385a.C85301d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.c.b */
public class C85402b implements AbstractC85401a {

    /* renamed from: a */
    public static final String f191181a = C85402b.class.getSimpleName();

    /* renamed from: b */
    C85410d f191182b;

    /* renamed from: c */
    public C30031g f191183c;

    /* renamed from: d */
    private List<C85300c> f191184d = new ArrayList();

    /* renamed from: e */
    private List<VEBaseFilterParam> f191185e = new ArrayList();

    static {
        Covode.recordClassIndex(99514);
    }

    @Override // com.p2082ss.android.vesdk.p4387c.AbstractC85401a
    /* renamed from: a */
    public final void mo130892a(VEARCoreParam vEARCoreParam) {
        if (vEARCoreParam == null) {
            C85315al.m146641c(f191181a, "ARCore param is null");
        }
        this.f191183c.mo53267a(vEARCoreParam);
    }

    @Override // com.p2082ss.android.vesdk.p4387c.AbstractC85401a
    /* renamed from: a */
    public final int mo130891a(final VEBaseFilterParam vEBaseFilterParam) {
        this.f191185e.add(vEBaseFilterParam);
        this.f191182b.mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.p4387c.C85402b.RunnableC854031 */

            /* renamed from: b */
            final /* synthetic */ int f191187b = 0;

            static {
                Covode.recordClassIndex(99515);
            }

            public final void run() {
                if (C85402b.this.f191182b.f191269u == 3) {
                    C85315al.m146642d(C85402b.f191181a, "addTrackFilter in status:" + C85402b.this.f191182b.f191269u);
                } else if (vEBaseFilterParam.filterType == 1 && TextUtils.equals(vEBaseFilterParam.filterName, "loudness balance") && this.f191187b == 0) {
                    C85402b.this.f191183c.mo53278a(true, ((VEAudioLoudnessBalanceFilter) vEBaseFilterParam).targetLoudness);
                }
            }
        });
        return this.f191185e.size() - 1;
    }

    @Override // com.p2082ss.android.vesdk.p4387c.AbstractC85401a
    /* renamed from: a */
    public final int mo130889a(int i) {
        if (i < 0 || i >= this.f191185e.size()) {
            return 0;
        }
        final VEBaseFilterParam vEBaseFilterParam = this.f191185e.get(i);
        if (vEBaseFilterParam == null) {
            return -1;
        }
        this.f191182b.mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.p4387c.C85402b.RunnableC854042 */

            static {
                Covode.recordClassIndex(99516);
            }

            public final void run() {
                if (C85402b.this.f191182b.f191269u == 3) {
                    C85315al.m146642d(C85402b.f191181a, "removeTrackFilter in status:" + C85402b.this.f191182b.f191269u);
                } else if (vEBaseFilterParam.filterType == 1 && TextUtils.equals(vEBaseFilterParam.filterName, "loudness balance")) {
                    C85402b.this.f191183c.mo53278a(false, 0.0d);
                }
            }
        });
        this.f191185e.set(i, null);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.p4387c.AbstractC85401a
    /* renamed from: a */
    public final int mo130890a(final C85300c cVar) {
        this.f191184d.add(cVar);
        if (cVar.f190883c == 7) {
            C85301d dVar = (C85301d) cVar;
            this.f191183c.mo53279a(true, dVar.f190887b, dVar.f190888f, dVar.f190889g, dVar.f190890h, dVar.f190891i, dVar.f190892j, dVar.f190893k, dVar.f190894l, dVar.f190895m, dVar.f190896n, false);
        } else if (cVar.f190883c == 100) {
            this.f191182b.mo131017b(new Runnable() {
                /* class com.p2082ss.android.vesdk.p4387c.C85402b.RunnableC854053 */

                /* renamed from: b */
                final /* synthetic */ int f191192b = 0;

                static {
                    Covode.recordClassIndex(99517);
                }

                public final void run() {
                    if (C85402b.this.f191182b.f191269u == 3) {
                        C85315al.m146642d(C85402b.f191181a, "addTrackAlgorithm in status:" + C85402b.this.f191182b.f191269u);
                    } else if (cVar.f190883c == 100 && cVar.f190884d == "audio mic detect delay" && this.f191192b == 0) {
                        C85298a aVar = (C85298a) cVar;
                        C85402b.this.f191183c.mo53281a(true, aVar.f190884d, aVar.f190880a);
                    }
                }
            });
        } else if (cVar.f190883c == 8) {
            this.f191182b.mo131017b(new Runnable() {
                /* class com.p2082ss.android.vesdk.p4387c.C85402b.RunnableC854064 */

                static {
                    Covode.recordClassIndex(99518);
                }

                public final void run() {
                    if (cVar.f190883c == 8) {
                        C85299b bVar = (C85299b) cVar;
                        C85402b.this.f191183c.mo53309b(true, bVar.f190881a, bVar.f190882b);
                    }
                }
            });
        }
        return this.f191184d.size() - 1;
    }

    @Override // com.p2082ss.android.vesdk.p4387c.AbstractC85401a
    /* renamed from: b */
    public final int mo130893b(int i) {
        if (i < 0 || i >= this.f191184d.size()) {
            return 0;
        }
        final C85300c cVar = this.f191184d.get(i);
        if (cVar == null) {
            return -1;
        }
        if (cVar.f190883c == 7) {
            C85301d dVar = (C85301d) cVar;
            this.f191183c.mo53279a(false, dVar.f190887b, dVar.f190888f, dVar.f190889g, dVar.f190890h, dVar.f190891i, dVar.f190892j, dVar.f190893k, dVar.f190894l, dVar.f190895m, dVar.f190896n, false);
        } else if (cVar.f190883c == 100) {
            this.f191182b.mo131017b(new Runnable() {
                /* class com.p2082ss.android.vesdk.p4387c.C85402b.RunnableC854075 */

                static {
                    Covode.recordClassIndex(99519);
                }

                public final void run() {
                    if (C85402b.this.f191182b.f191269u == 3) {
                        C85315al.m146642d(C85402b.f191181a, "removeTrackAlgorithm in status:" + C85402b.this.f191182b.f191269u);
                    } else if (cVar.f190884d == "audio mic detect delay") {
                        C85402b.this.f191183c.mo53281a(false, cVar.f190884d, "");
                    }
                }
            });
        } else if (cVar.f190883c == 8) {
            this.f191182b.mo131017b(new Runnable() {
                /* class com.p2082ss.android.vesdk.p4387c.C85402b.RunnableC854086 */

                static {
                    Covode.recordClassIndex(99520);
                }

                public final void run() {
                    if (cVar.f190883c == 8) {
                        C85299b bVar = (C85299b) cVar;
                        C85402b.this.f191183c.mo53309b(false, bVar.f190881a, bVar.f190882b);
                    }
                }
            });
        }
        this.f191184d.set(i, null);
        return 0;
    }

    public C85402b(C30031g gVar, C85410d dVar) {
        this.f191183c = gVar;
        this.f191182b = dVar;
    }
}
