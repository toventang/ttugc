package com.bytedance.p1399im.core.p1408d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20009m;
import com.bytedance.p1399im.core.p1407c.C19512f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.d.aj */
public final class C19541aj implements AbstractC19671t, AbstractC19674v {

    /* renamed from: a */
    public String f46384a;

    /* renamed from: b */
    public int[] f46385b;

    /* renamed from: c */
    public final int f46386c;

    /* renamed from: d */
    public final C20009m f46387d;

    /* renamed from: e */
    public AbstractC19674v f46388e;

    /* renamed from: f */
    public boolean f46389f = true;

    /* renamed from: g */
    public boolean f46390g;

    /* renamed from: h */
    private boolean f46391h;

    /* renamed from: i */
    private boolean f46392i;

    static {
        Covode.recordClassIndex(22385);
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27789a(int i, C19538ai aiVar) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27790a(int i, C19538ai aiVar, C19600ay ayVar) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27791a(int i, C19587an anVar) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27793a(C19538ai aiVar, Map<String, List<C19536ag>> map, Map<String, List<C19536ag>> map2) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27794a(C19538ai aiVar, boolean z) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27795a(List<C19538ai> list, int i, C19593ar arVar) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27797a(List<C19538ai> list, Map<String, Map<String, String>> map) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27798a(List<C19538ai> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            this.f46387d.appendList(list);
        }
        AbstractC19674v vVar = this.f46388e;
        if (vVar != null) {
            vVar.mo27798a(list, z);
        }
    }

    /* renamed from: a */
    public final void mo31304a() {
        if (C19522aa.m36471a().mo31186a(this.f46384a)) {
            C19512f.m36457b("imsdk", "MessageBrowserModel loadOlderMessageList checking now", (Throwable) null);
            this.f46391h = true;
        } else if (this.f46390g) {
            C19512f.m36457b("imsdk", "MessageBrowserModel loadOlderMessageList querying now", (Throwable) null);
        } else {
            this.f46390g = true;
            final ArrayList arrayList = new ArrayList(this.f46387d);
            RunnableC19987d.m37728a(new AbstractC19986c<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19541aj.C195443 */

                static {
                    Covode.recordClassIndex(22388);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
                    if (r1 != Long.MAX_VALUE) goto L_0x0078;
                 */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.util.List<com.bytedance.p1399im.core.p1408d.C19538ai> mo31187a() {
                    /*
                    // Method dump skipped, instructions count: 141
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1408d.C19541aj.C195443.mo31187a():java.lang.Object");
                }
            }, new AbstractC19985b<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19541aj.C195454 */

                static {
                    Covode.recordClassIndex(22389);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(List<C19538ai> list) {
                    List<C19538ai> list2 = list;
                    C19512f.m36457b("imsdk", "MessageBrowserModel loadOlderMessageList onCallback, result:" + list2.size(), (Throwable) null);
                    C19541aj.this.f46390g = false;
                    C19541aj.this.mo27798a(list2, true);
                }
            });
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27792a(C19538ai aiVar) {
        AbstractC19674v vVar;
        if (this.f46387d.remove(aiVar) && (vVar = this.f46388e) != null) {
            vVar.mo27792a(aiVar);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19671t
    /* renamed from: a */
    public final void mo31305a(String str) {
        if (TextUtils.equals(this.f46384a, str)) {
            C19512f.m36457b("imsdk", "MessageBrowserModel onLeakRepairEnd, mRequestLoadOlder:" + this.f46391h + ", mRequestLoadNewer" + this.f46392i, (Throwable) null);
            if (this.f46391h) {
                mo31304a();
            } else if (!this.f46392i) {
            } else {
                if (C19522aa.m36471a().mo31186a(this.f46384a)) {
                    C19512f.m36457b("imsdk", "MessageBrowserModel loadNewerMessageList checking now", (Throwable) null);
                    this.f46392i = true;
                } else if (this.f46389f || this.f46390g) {
                    C19512f.m36457b("imsdk", "MessageBrowserModel loadNewerMessageList uptonew or querying:" + this.f46390g, (Throwable) null);
                } else {
                    this.f46390g = true;
                    final ArrayList arrayList = new ArrayList(this.f46387d);
                    RunnableC19987d.m37728a(new AbstractC19986c<List<C19538ai>>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19541aj.C195421 */

                        static {
                            Covode.recordClassIndex(22386);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
                            if (r2 != Long.MAX_VALUE) goto L_0x0092;
                         */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final /* synthetic */ java.util.List<com.bytedance.p1399im.core.p1408d.C19538ai> mo31187a() {
                            /*
                            // Method dump skipped, instructions count: 206
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1408d.C19541aj.C195421.mo31187a():java.lang.Object");
                        }
                    }, new AbstractC19985b<List<C19538ai>>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19541aj.C195432 */

                        static {
                            Covode.recordClassIndex(22387);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                        /* renamed from: a */
                        public final /* synthetic */ void mo31188a(List<C19538ai> list) {
                            List<C19538ai> list2 = list;
                            C19512f.m36457b("imsdk", "MessageBrowserModel loadNewerMessageList onCallback, result:" + list2.size(), (Throwable) null);
                            C19541aj.this.f46390g = false;
                            if (!list2.isEmpty()) {
                                Collections.reverse(list2);
                                C19541aj.this.f46387d.addList(list2);
                                C19541aj.this.mo27799b(list2, true);
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: b */
    public final void mo27799b(List<C19538ai> list, boolean z) {
        AbstractC19674v vVar = this.f46388e;
        if (vVar != null) {
            vVar.mo27799b(list, z);
        }
    }

    public C19541aj(String str, int[] iArr, int i) {
        this.f46384a = str;
        this.f46385b = iArr;
        this.f46386c = i;
        this.f46387d = new C20009m();
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27796a(List<C19538ai> list, int i, String str) {
        AbstractC19674v vVar = this.f46388e;
        if (vVar != null) {
            vVar.mo27796a(list, i, str);
        }
    }
}
