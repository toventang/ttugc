package com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39633a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39638c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.b */
final class C39636b implements C39638c.AbstractC39640a {

    /* renamed from: a */
    final C39633a f93419a;

    /* renamed from: b */
    final AbstractC39649e f93420b;

    /* renamed from: c */
    List<WeakReference<RecyclerView>> f93421c = new ArrayList();

    /* renamed from: d */
    final IdentityHashMap<RecyclerView.ViewHolder, C39638c> f93422d = new IdentityHashMap<>();

    /* renamed from: e */
    List<C39638c> f93423e = new ArrayList();

    /* renamed from: f */
    final AbstractC39641d f93424f;

    /* renamed from: g */
    private C39637a f93425g = new C39637a();

    /* renamed from: h */
    private final C39633a.C39634a.EnumC39635a f93426h;

    static {
        Covode.recordClassIndex(47355);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.b$a */
    static class C39637a {

        /* renamed from: a */
        C39638c f93427a;

        /* renamed from: b */
        int f93428b;

        /* renamed from: c */
        boolean f93429c;

        static {
            Covode.recordClassIndex(47356);
        }

        C39637a() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39638c.AbstractC39640a
    /* renamed from: a */
    public final void mo69048a() {
        this.f93419a.notifyDataSetChanged();
    }

    /* renamed from: b */
    public final boolean mo69053b() {
        if (this.f93426h != C39633a.C39634a.EnumC39635a.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69049a(C39637a aVar) {
        aVar.f93429c = false;
        aVar.f93427a = null;
        aVar.f93428b = -1;
        this.f93425g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo69044a(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        int size = this.f93423e.size();
        for (int i = 0; i < size; i++) {
            if (this.f93423e.get(i).f93432c == aVar) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo69045a(C39638c cVar) {
        C39638c next;
        Iterator<C39638c> it = this.f93423e.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != cVar) {
            i += next.f93434e;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C39637a mo69046a(int i) {
        C39637a aVar;
        if (this.f93425g.f93429c) {
            aVar = new C39637a();
        } else {
            this.f93425g.f93429c = true;
            aVar = this.f93425g;
        }
        Iterator<C39638c> it = this.f93423e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C39638c next = it.next();
            if (next.f93434e > i2) {
                aVar.f93427a = next;
                aVar.f93428b = i2;
                break;
            }
            i2 -= next.f93434e;
        }
        if (aVar.f93427a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for ".concat(String.valueOf(i)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C39638c mo69047a(RecyclerView.ViewHolder viewHolder) {
        C39638c cVar = this.f93422d.get(viewHolder);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    C39636b(C39633a aVar, C39633a.C39634a aVar2) {
        this.f93419a = aVar;
        if (aVar2.f93416a) {
            this.f93420b = new AbstractC39649e.C39650a();
        } else {
            this.f93420b = new AbstractC39649e.C39652b();
        }
        this.f93426h = aVar2.f93417b;
        if (aVar2.f93417b == C39633a.C39634a.EnumC39635a.NO_STABLE_IDS) {
            this.f93424f = new AbstractC39641d.C39644b();
        } else if (aVar2.f93417b == C39633a.C39634a.EnumC39635a.ISOLATED_STABLE_IDS) {
            this.f93424f = new AbstractC39641d.C39642a();
        } else if (aVar2.f93417b == C39633a.C39634a.EnumC39635a.SHARED_STABLE_IDS) {
            this.f93424f = new AbstractC39641d.C39646c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39638c.AbstractC39640a
    /* renamed from: b */
    public final void mo69052b(C39638c cVar, int i, int i2) {
        this.f93419a.notifyItemRangeRemoved(i + mo69045a(cVar), i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39638c.AbstractC39640a
    /* renamed from: c */
    public final void mo69054c(C39638c cVar, int i, int i2) {
        int a = mo69045a(cVar);
        this.f93419a.notifyItemMoved(i + a, i2 + a);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39638c.AbstractC39640a
    /* renamed from: a */
    public final void mo69050a(C39638c cVar, int i, int i2) {
        this.f93419a.notifyItemRangeInserted(i + mo69045a(cVar), i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39638c.AbstractC39640a
    /* renamed from: a */
    public final void mo69051a(C39638c cVar, int i, int i2, Object obj) {
        this.f93419a.notifyItemRangeChanged(i + mo69045a(cVar), i2, obj);
    }
}
