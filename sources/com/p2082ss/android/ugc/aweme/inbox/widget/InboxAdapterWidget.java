package com.p2082ss.android.ugc.aweme.inbox.widget;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget */
public abstract class InboxAdapterWidget implements AbstractC1204m, AbstractC33974au {

    /* renamed from: g */
    public static final List<EnumC56518b> f128851g = C89070n.m154522b(EnumC56518b.EMPTY, EnumC56518b.SUCCESS, EnumC56518b.FAIL);

    /* renamed from: h */
    public static final C56517a f128852h = new C56517a((byte) 0);

    /* renamed from: a */
    private final C1213t<Boolean> f128853a = new C1213t<>();

    /* renamed from: b */
    private final LiveData<Boolean> f128854b;

    /* renamed from: d */
    public final Map<String, String> f128855d = new LinkedHashMap();

    /* renamed from: e */
    public final Fragment f128856e;

    /* renamed from: f */
    public final LiveData<EnumC56518b> f128857f;

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget$b */
    public enum EnumC56518b {
        EMPTY,
        SUCCESS,
        FAIL,
        LOADING;

        static {
            Covode.recordClassIndex(66339);
        }
    }

    /* renamed from: a */
    public abstract int mo87485a(int i);

    /* renamed from: a */
    public void mo87487a(int i, C56520b bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo93313a(C1175ad.AbstractC1177b bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: f */
    public abstract LiveData<EnumC56518b> mo87492f();

    /* renamed from: g */
    public abstract RecyclerView.AbstractC1350a<?> mo87493g();

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.f128856e.getLifecycle();
    }

    /* renamed from: h */
    public abstract void mo87494h();

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget$a */
    public static final class C56517a {
        static {
            Covode.recordClassIndex(66338);
        }

        private C56517a() {
        }

        public /* synthetic */ C56517a(byte b) {
            this();
        }
    }

    public C1213t<Boolean> bw_() {
        return this.f128853a;
    }

    /* renamed from: e */
    public LiveData<Boolean> mo87491e() {
        return this.f128854b;
    }

    static {
        Covode.recordClassIndex(66337);
    }

    public String toString() {
        return "[widget: (" + getClass().getSimpleName() + ")] state: " + mo87492f().getValue() + ", isExpanded: " + bw_().getValue();
    }

    public InboxAdapterWidget(Fragment fragment, LiveData<EnumC56518b> liveData) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        this.f128856e = fragment;
        this.f128857f = liveData;
    }
}
