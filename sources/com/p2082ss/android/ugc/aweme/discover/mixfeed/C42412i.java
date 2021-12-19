package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18079b;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18087e;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.discover.api.C41854a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42427n;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.AbstractC42442b;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42097l;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67603e;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67604f;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67607i;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a.C67598e;
import java.util.ArrayList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.i */
public final class C42412i extends C42439u {

    /* renamed from: a */
    public int f98813a = -1;

    /* renamed from: b */
    public transient boolean f98814b;

    /* renamed from: c */
    public AbstractC42442b f98815c;

    /* renamed from: d */
    long f98816d;

    /* renamed from: e */
    public long f98817e;

    /* renamed from: r */
    private transient boolean f98818r;

    /* renamed from: s */
    private transient boolean f98819s = true;

    /* renamed from: t */
    private transient boolean f98820t;

    static {
        Covode.recordClassIndex(50357);
    }

    /* renamed from: l */
    private void m84782l() {
        mo71283d();
        if (this.mData != null && ((C42426m) this.mData).f98850c != null) {
            ((C42426m) this.mData).f98850c.clear();
        }
    }

    /* renamed from: a */
    public final void mo71607a(final int i) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f98813a = i;
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.C42412i.RunnableC424164 */

                static {
                    Covode.recordClassIndex(50361);
                }

                public final void run() {
                    C42412i.this.f98813a = i;
                }
            });
        }
    }

    /* renamed from: e */
    private void m84781e(C42426m mVar) {
        this.f98815c.mo71652k();
        this.mData = mVar;
        m84780d(mVar);
        handleData(mVar);
        mo71607a(0);
        if (this.mNotifyListeners != null) {
            for (AbstractC39159o oVar : this.mNotifyListeners) {
                oVar.mo57528c();
            }
        }
    }

    /* renamed from: d */
    private void m84780d(C42426m mVar) {
        int size;
        String requestId;
        C18087e eVar;
        int size2;
        if (!this.f98820t) {
            C67603e d = C67605g.m119730a(this.f98113i).mo106577a(this.f98817e).mo106588d((int) (this.f98817e - this.f98816d));
            if (this.mData == null) {
                size = 0;
            } else {
                size = ((C42426m) this.mData).f98850c.size();
            }
            C67603e c = d.mo106586c(size);
            String str = "";
            if (this.mData == null) {
                requestId = str;
            } else {
                requestId = ((SearchApiResult) this.mData).getRequestId();
            }
            C67603e a = c.mo106580a(requestId).mo106579a((AbstractC33631g) this.mData);
            C18087e eVar2 = null;
            if (mVar == null) {
                eVar = null;
            } else {
                eVar = mVar.f98857k;
            }
            a.mo106578a(eVar).mo106583b(0);
            C67592a.f151371d.mo106562c();
            C67607i f = C67606h.m119736a(this.f98113i).mo106596a(this.f98817e).mo106609f((int) (this.f98817e - this.f98816d));
            if (this.mData == null) {
                size2 = 0;
            } else {
                size2 = ((C42426m) this.mData).f98850c.size();
            }
            C67607i e = f.mo106608e(size2);
            if (this.mData != null) {
                str = ((SearchApiResult) this.mData).getRequestId();
            }
            C67607i a2 = e.mo106599a(str).mo106598a((AbstractC33631g) this.mData);
            if (mVar != null) {
                eVar2 = mVar.f98857k;
            }
            a2.mo106597a(eVar2).mo106604c(0);
            this.f98820t = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo71608a(C42426m mVar) {
        int i;
        MethodCollector.m26663i(8174);
        if (!(mVar == null || mVar.f98850c == null)) {
            for (C42411h hVar : mVar.f98850c) {
                hVar.f98809s = mVar.f98858l;
            }
        }
        this.f98815c.mo71653l();
        if (this.f98813a == 4 || this.f98814b) {
            MethodCollector.m26664o(8174);
            return;
        }
        C67598e eVar = C67592a.f151370c;
        Integer valueOf = Integer.valueOf(mVar.f98855i);
        if (eVar.f151409d == null) {
            eVar.f151409d = valueOf;
            if (valueOf != null) {
                i = valueOf.intValue();
            } else {
                i = -2;
            }
            eVar.mo106552a("is_hit_trunk", Integer.valueOf(i));
        }
        if (mVar.f98856j == 2) {
            this.f98818r = true;
            C67592a.f151371d.f151396o = true;
            mo71607a(1);
            this.f98815c.mo71651g();
            this.mData = mVar;
            mo71643c(mVar);
            C42445x.m84847a();
            C42445x.m84848a(mVar.f98850c);
            C42445x.f98920c.mo71654b(mVar.f98850c);
            C41854a.m83838a(mVar.f98851e);
            mo71276a_(mVar.f98850c);
            this.f98815c.mo71648d();
            MethodCollector.m26664o(8174);
            return;
        }
        if (mVar.f98855i == -1) {
            this.f98815c.mo71650f();
            C41854a.f97649a = null;
            C67603e a = C67605g.m119730a(this.f98113i);
            if (!C89219l.m154714a(a, C67604f.f151447a)) {
                a.f151434n = 0;
            }
            mo71607a(2);
            m84782l();
            C42445x.m84847a();
        }
        if (mVar.f98855i == 0) {
            if (this.mData == null || ((C42426m) this.mData).f98850c == null || ((C42426m) this.mData).f98850c.size() <= 0) {
                C67605g.m119730a(this.f98113i).f151438r = 2;
                MethodCollector.m26664o(8174);
                return;
            }
            m84780d(mVar);
            C67603e c = C67605g.m119730a(this.f98113i).mo106585c();
            if (!C89219l.m154714a(c, C67604f.f151447a)) {
                c.f151434n = 1;
            }
            this.f98815c.mo71652k();
            this.f98815c.mo71649e();
            mo71607a(3);
        }
        if (mVar.f98856j == 4) {
            if (!this.f98818r && this.f98819s && getItems().size() > 0) {
                m84782l();
                C41854a.f97649a = null;
            }
            if (this.f98818r && this.f98813a == 1) {
                m84782l();
                C41854a.f97649a = null;
                C67605g.m119730a(this.f98113i).f151438r = 3;
            }
            C67592a.f151371d.f151396o = false;
            this.f98819s = false;
            List items = getItems();
            List<C42411h> list = mVar.f98850c;
            if (list == null) {
                MethodCollector.m26664o(8174);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(items);
            mo71643c(mVar);
            C41854a.m83838a(mVar.f98851e);
            arrayList.addAll(list);
            mo71607a(4);
            mVar.f98850c = arrayList;
            m84781e(mVar);
        }
        MethodCollector.m26664o(8174);
    }

    /* renamed from: a */
    public final void mo71609a(final Exception exc, final C1731i<C18079b<C42426m>> iVar) {
        String message;
        C67592a.f151371d.mo106562c();
        this.f98114j = null;
        if (exc == null && iVar.mo5546e() == null) {
            C67605g.m119730a(this.f98113i).mo106587d().mo106583b(1);
            C67592a.f151370c.mo106568a(6, 5, "CHUNK_REQUEST_FAIL");
        } else {
            C67603e b = C67605g.m119730a(this.f98113i).mo106587d().mo106583b(1);
            if (exc.getMessage() != null) {
                message = exc.getMessage();
            } else {
                message = iVar.mo5546e().getMessage();
            }
            b.mo106584b(message);
            C67592a.f151370c.mo106572a(exc);
        }
        if (this.f98813a == 1 || this.mData == null) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.C42412i.RunnableC424153 */

                static {
                    Covode.recordClassIndex(50360);
                }

                public final void run() {
                    C42412i.this.mIsLoading = false;
                    C42412i.this.f98116l = false;
                    AbstractC42442b bVar = C42412i.this.f98815c;
                    Exception exc = exc;
                    if (exc == null) {
                        exc = iVar.mo5546e();
                    }
                    bVar.mo71646a(1, exc);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.C42439u
    /* renamed from: a */
    public final void mo71610a(String str, int i, int i2, int i3, String str2, int i4, C67437b bVar, String str3, String str4) {
        String str5;
        C1731i<?> second;
        if (i != 0) {
            super.mo71610a(str, i, i2, i3, str2, i4, bVar, str3, str4);
            return;
        }
        mo71279a(1, "trunkV2 new request");
        this.f98909f = str;
        this.f98910g = i4;
        this.f98112h = bVar;
        if (this.f98113i == null || this.f98113i.getSugUserId() == null || this.f98113i.getSugUserId().equals("")) {
            str5 = "";
        } else {
            str5 = this.f98113i.getSugUserId();
        }
        C42427n a = new C42427n.C42428a().mo71624a(str).mo71621a(i).mo71626b(i2).mo71628c(i3).mo71627b(str2).mo71630d(i4).mo71622a(this.f98112h).mo71631d(mo71284e()).mo71632e(this.f98118n).mo71623a(this.f98113i).mo71633e(str3).mo71636h(str5).mo71634f(C41854a.m83837a()).mo71629c(str4).mo71625a();
        C89219l.m154721d(a, "");
        C89219l.m154721d(a, "");
        C89378p<C42427n, C1731i<?>> pVar = C42097l.f98145a.get(a);
        if (pVar != null) {
            C67605g.m119730a(a.f98860a).mo106589e();
            C67606h.m119736a(a.f98860a).mo106605d();
        } else {
            pVar = null;
        }
        C42097l.m84311a(a);
        if (pVar == null) {
            second = null;
        } else {
            a = pVar.getFirst();
            second = pVar.getSecond();
        }
        this.mIsLoading = true;
        if (second == null) {
            second = a.mo71617b();
        }
        this.f98114j = a;
        mo71607a(0);
        this.f98819s = true;
        this.f98818r = false;
        this.f98820t = false;
        this.f98116l = true;
        this.f98117m = true;
        this.f98814b = false;
        C67592a.f151371d.mo106560a((Integer) 1);
        second.mo5537b(new C42417j(this, a));
        second.mo5534a(new AbstractC1729g<C18079b<C42426m>, Object>() {
            /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.C42412i.C424142 */

            static {
                Covode.recordClassIndex(50359);
            }

            @Override // p077b.AbstractC1729g
            public final Object then(C1731i<C18079b<C42426m>> iVar) {
                if (C42412i.this.mHandler == null || iVar == null) {
                    C42412i.this.f98116l = false;
                    return null;
                }
                if (iVar.mo5539b()) {
                    C42412i.this.f98116l = false;
                    C42412i.this.mo71607a(0);
                } else if (iVar.mo5544c()) {
                    C42412i.this.f98116l = false;
                    C42412i.this.mo71609a(iVar.mo5546e(), iVar);
                }
                return null;
            }
        }, C1731i.f5564c, null);
    }
}
