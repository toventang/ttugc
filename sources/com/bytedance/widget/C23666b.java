package com.bytedance.widget;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.widget.b */
public final class C23666b extends Fragment {

    /* renamed from: d */
    public static final String f56012d = C23666b.class.getCanonicalName();

    /* renamed from: e */
    public static final C23667a f56013e = new C23667a((byte) 0);

    /* renamed from: a */
    public Fragment f56014a;

    /* renamed from: b */
    final List<Object> f56015b = new ArrayList();

    /* renamed from: c */
    final Set<AbstractC89171a<C89391z>> f56016c = new LinkedHashSet();

    /* renamed from: f */
    private final HashMap<Integer, Widget> f56017f = new HashMap<>();

    /* renamed from: g */
    private final Map<AbstractC1196i, C23669c> f56018g = new WeakHashMap();

    /* renamed from: h */
    private HashMap f56019h;

    /* renamed from: com.bytedance.widget.b$a */
    public static final class C23667a {
        static {
            Covode.recordClassIndex(27769);
        }

        private C23667a() {
        }

        /* renamed from: com.bytedance.widget.b$a$a */
        public static final class C23668a extends AbstractC0952i.AbstractC0954b {

            /* renamed from: a */
            final /* synthetic */ C23666b f56020a;

            static {
                Covode.recordClassIndex(27770);
            }

            C23668a(C23666b bVar) {
                this.f56020a = bVar;
            }

            @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
            public final void onFragmentViewDestroyed(AbstractC0952i iVar, Fragment fragment) {
                C89219l.m154719c(iVar, "");
                C89219l.m154719c(fragment, "");
                if (fragment == this.f56020a.f56014a) {
                    iVar.mo3554a(this);
                    fragment.getChildFragmentManager().mo3552a().mo3455a(this.f56020a).mo3478e();
                    C23666b bVar = this.f56020a;
                    Iterator<T> it = bVar.f56016c.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                    bVar.f56016c.clear();
                }
            }
        }

        public /* synthetic */ C23667a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final Context mo39094a() {
        Context requireContext = requireContext();
        C89219l.m154709a((Object) requireContext, "");
        return requireContext;
    }

    /* renamed from: b */
    public final Object mo39098b() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        Object requireHost = requireHost();
        C89219l.m154709a(requireHost, "");
        return requireHost;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f56019h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(27768);
    }

    /* renamed from: a */
    public final C23669c mo39095a(AbstractC1196i iVar) {
        C89219l.m154719c(iVar, "");
        return this.f56018g.get(iVar);
    }

    /* renamed from: a */
    public final void mo39097a(Widget widget) {
        C89219l.m154719c(widget, "");
        Iterator<T> it = this.f56015b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (widget.f56006f) {
            widget.f56006f = false;
        }
    }

    /* renamed from: a */
    public final void mo39096a(AbstractC1196i iVar, C23669c cVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(cVar, "");
        this.f56018g.put(iVar, cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f56017f.get(Integer.valueOf(i));
        this.f56017f.remove(Integer.valueOf(i));
    }
}
