package com.p2082ss.android.ugc.aweme.inbox;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.LiveData;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.android.widget.C12249d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.InboxFragmentVM */
public final class InboxFragmentVM extends AbstractC1174ac {

    /* renamed from: e */
    public static final C56283a f128389e = new C56283a((byte) 0);

    /* renamed from: a */
    final C12249d<Integer> f128390a;

    /* renamed from: b */
    public final LiveData<EnumC56513u> f128391b;

    /* renamed from: c */
    public final LiveData<Integer> f128392c;

    /* renamed from: d */
    public final LiveData<InboxAdapterWidget.EnumC56518b> f128393d;

    /* renamed from: f */
    private final C12249d<EnumC56513u> f128394f;

    static {
        Covode.recordClassIndex(66098);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFragmentVM$a */
    public static final class C56283a {
        static {
            Covode.recordClassIndex(66099);
        }

        private C56283a() {
        }

        public /* synthetic */ C56283a(byte b) {
            this();
        }
    }

    public InboxFragmentVM() {
        C12249d<EnumC56513u> dVar = new C12249d<>();
        this.f128394f = dVar;
        C12249d<Integer> dVar2 = new C12249d<>();
        this.f128390a = dVar2;
        this.f128391b = dVar;
        this.f128392c = dVar2;
        LiveData<InboxAdapterWidget.EnumC56518b> a = C1169aa.m3869a(dVar, C56284b.f128395a);
        C89219l.m154716b(a, "");
        this.f128393d = a;
    }

    /* renamed from: a */
    public final void mo93311a(EnumC56513u uVar) {
        C89219l.m154721d(uVar, "");
        this.f128394f.setValue(uVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFragmentVM$b */
    static final class C56284b<I, O> implements AbstractC0189a {

        /* renamed from: a */
        public static final C56284b f128395a = new C56284b();

        static {
            Covode.recordClassIndex(66100);
        }

        C56284b() {
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            EnumC56513u uVar = (EnumC56513u) obj;
            if (uVar != null) {
                int i = C56497n.f128815a[uVar.ordinal()];
                if (i == 1) {
                    return InboxAdapterWidget.EnumC56518b.SUCCESS;
                }
                if (i == 2) {
                    return InboxAdapterWidget.EnumC56518b.FAIL;
                }
                if (i == 3) {
                    return InboxAdapterWidget.EnumC56518b.EMPTY;
                }
                if (i == 4 || i == 5) {
                    return InboxAdapterWidget.EnumC56518b.LOADING;
                }
            }
            return InboxAdapterWidget.EnumC56518b.LOADING;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo93312a(Collection<? extends InboxAdapterWidget> collection, int i, boolean z) {
        int i2 = 0;
        for (T t : collection) {
            int itemCount = t.mo87493g().getItemCount();
            for (int i3 = 0; i3 < itemCount; i3++) {
                int a = t.mo87485a(i3);
                if (a == -1) {
                    continue;
                    break;
                }
                int i4 = a + i2;
                if (i4 > i || (z && i4 >= i)) {
                    this.f128390a.postValue(Integer.valueOf(i4));
                    return true;
                }
            }
            i2 += itemCount;
        }
        return false;
    }
}
