package com.bytedance.android.livesdk.p433ac;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.p405s.AbstractC6095a;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p405s.p406a.C6096a;
import com.bytedance.android.live.p405s.p406a.C6098b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ac.i */
public final class C6598i extends C10935a {

    /* renamed from: a */
    public int f16497a = 10;

    /* renamed from: b */
    public C6584b f16498b;

    /* renamed from: c */
    private final AbstractC89244h f16499c = C11831d.m20835a(new C6602d(this));

    /* renamed from: d */
    private final AbstractC89244h f16500d = C11831d.m20835a(new C6601c(this));

    /* renamed from: e */
    private final C6600b f16501e = new C6600b(this);

    /* renamed from: f */
    private HashMap f16502f;

    /* renamed from: com.bytedance.android.livesdk.ac.i$h */
    final /* synthetic */ class C6606h implements AbstractC88433f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f16509a;

        static {
            Covode.recordClassIndex(7342);
        }

        C6606h(AbstractC89172b bVar) {
            this.f16509a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154716b(this.f16509a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(7334);
    }

    /* renamed from: b */
    private final long m14093b() {
        return ((Number) this.f16499c.getValue()).longValue();
    }

    /* renamed from: c */
    private final boolean m14094c() {
        return ((Boolean) this.f16500d.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final View mo12751a(int i) {
        if (this.f16502f == null) {
            this.f16502f = new HashMap();
        }
        View view = (View) this.f16502f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16502f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    private static boolean m14095d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16502f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: e */
    private static boolean m14096e() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean d = m14095d();
        C58029j.f132253e = d;
        return d;
    }

    /* renamed from: com.bytedance.android.livesdk.ac.i$c */
    static final class C6601c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C6598i f16505a;

        static {
            Covode.recordClassIndex(7337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6601c(C6598i iVar) {
            super(0);
            this.f16505a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean bool;
            if (!C11279p.m20022c()) {
                DataChannel a = C17846f.m33055a(this.f16505a);
                if (a != null) {
                    bool = (Boolean) a.mo28318b(C9119ed.class);
                } else {
                    bool = null;
                }
                if (!C11279p.m20012a(bool)) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.i$d */
    static final class C6602d extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        final /* synthetic */ C6598i f16506a;

        static {
            Covode.recordClassIndex(7338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6602d(C6598i iVar) {
            super(0);
            this.f16506a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j;
            Room room;
            if (C11279p.m20022c()) {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                j = b.mo13161c();
            } else {
                DataChannel a = C17846f.m33055a(this.f16506a);
                if (a == null || (room = (Room) a.mo28318b(C9093de.class)) == null) {
                    j = 0;
                } else {
                    j = room.getOwnerUserId();
                }
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: a */
    public final void mo12752a() {
        getContext();
        if (!m14096e()) {
            C11226ao.m19882a(getContext(), (int) R.string.edd);
            return;
        }
        ((LoadingStatusView) mo12751a(R.id.dn5)).setStatus(0);
        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).fetchAdminList(this.f16501e, m14093b());
    }

    /* renamed from: com.bytedance.android.livesdk.ac.i$a */
    static final class View$OnClickListenerC6599a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6598i f16503a;

        static {
            Covode.recordClassIndex(7335);
        }

        View$OnClickListenerC6599a(C6598i iVar) {
            this.f16503a = iVar;
        }

        public final void onClick(View view) {
            this.f16503a.mo12752a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.i$b */
    public static final class C6600b implements AbstractC6095a {

        /* renamed from: a */
        final /* synthetic */ C6598i f16504a;

        static {
            Covode.recordClassIndex(7336);
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6095a
        /* renamed from: a */
        public final void mo11957a(boolean z, long j) {
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6095a
        /* renamed from: b */
        public final void mo11958b(Exception exc) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6600b(C6598i iVar) {
            this.f16504a = iVar;
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6095a
        /* renamed from: a */
        public final void mo11956a(C6098b bVar, Exception exc) {
            if (!this.f16504a.isViewValid()) {
                return;
            }
            if (exc != null || bVar == null) {
                if (C6598i.m14092a(this.f16504a).getItemCount() == 0) {
                    ((LoadingStatusView) this.f16504a.mo12751a(R.id.dn5)).setStatus(2);
                }
                C11264f.m19957a(this.f16504a.getContext(), exc);
            } else if (!C13603b.m24435a((Collection) bVar.f15238a)) {
                ((LoadingStatusView) this.f16504a.mo12751a(R.id.dn5)).mo12206a();
                this.f16504a.f16497a = bVar.f15239b;
                C6598i.m14092a(this.f16504a).mo12741a(bVar.f15238a);
                C6598i iVar = this.f16504a;
                List<C6096a> list = bVar.f15238a;
                C89219l.m154716b(list, "");
                iVar.mo12753a(list);
            } else {
                ((LoadingStatusView) this.f16504a.mo12751a(R.id.dn5)).setStatus(1);
                this.f16504a.mo12753a(C89086z.INSTANCE);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.i$g */
    static final /* synthetic */ class C6605g extends C89217j implements AbstractC89172b<C6590f, C89391z> {
        static {
            Covode.recordClassIndex(7341);
        }

        C6605g(C6598i iVar) {
            super(1, iVar, C6598i.class, "onEvent", "onEvent(Lcom/bytedance/android/livesdk/moderator/AdminSetEvent;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C6590f fVar) {
            ((C6598i) this.receiver).onEvent(fVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C6584b m14092a(C6598i iVar) {
        C6584b bVar = iVar.f16498b;
        if (bVar == null) {
            C89219l.m154710a("mAdminAdapter");
        }
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.ac.i$e */
    static final class View$OnClickListenerC6603e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6598i f16507a;

        static {
            Covode.recordClassIndex(7339);
        }

        View$OnClickListenerC6603e(C6598i iVar) {
            this.f16507a = iVar;
        }

        public final void onClick(View view) {
            DataChannel a = C17846f.m33055a(this.f16507a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17357b(EnumC9135q.MANAGE_MODERATOR));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.i$f */
    static final class View$OnClickListenerC6604f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6598i f16508a;

        static {
            Covode.recordClassIndex(7340);
        }

        View$OnClickListenerC6604f(C6598i iVar) {
            this.f16508a = iVar;
        }

        public final void onClick(View view) {
            DataChannel a = C17846f.m33055a(this.f16508a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17356a(EnumC9135q.GUIDE));
            }
        }
    }

    /* renamed from: a */
    public final void mo12753a(List<C6096a> list) {
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            a.mo28315b(C6597h.class, list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    public final void onEvent(C6590f fVar) {
        Iterable iterable;
        if (fVar != null) {
            DataChannel a = C17846f.m33055a(this);
            if (a == null || (iterable = (List) a.mo28318b(C6597h.class)) == null) {
                iterable = C89086z.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (((C6096a) obj).f15231a != fVar.f16488b) {
                    arrayList.add(obj);
                }
            }
            mo12753a(arrayList);
            if (isViewValid() && !fVar.f16487a) {
                C6584b bVar = this.f16498b;
                if (bVar == null) {
                    C89219l.m154710a("mAdminAdapter");
                }
                bVar.mo12740a(fVar.f16488b);
                C6584b bVar2 = this.f16498b;
                if (bVar2 == null) {
                    C89219l.m154710a("mAdminAdapter");
                }
                if (bVar2.getItemCount() == 0) {
                    ((LoadingStatusView) mo12751a(R.id.dn5)).setStatus(1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r0 == null) goto L_0x0055;
     */
    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p433ac.C6598i.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b6m, viewGroup, false);
    }
}
