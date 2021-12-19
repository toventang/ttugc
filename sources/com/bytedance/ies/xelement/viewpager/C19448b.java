package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.viewpager.C19450c;
import com.google.android.material.tabs.TabLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.viewpager.b */
public final class C19448b extends CoordinatorLayout {

    /* renamed from: h */
    private HashMap f46078h;

    static {
        Covode.recordClassIndex(22280);
    }

    /* renamed from: b */
    public final View mo31074b(int i) {
        if (this.f46078h == null) {
            this.f46078h = new HashMap();
        }
        View view = (View) this.f46078h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f46078h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo31075d(View view) {
        ((CustomAppBarLayout) mo31074b(R.id.ki)).addView(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19448b(Context context) {
        super(context);
        C89219l.m154719c(context, "");
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.bjx, this, true);
        C89219l.m154709a((Object) a, "");
        a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.b$a */
    public static final class C19449a implements C19450c.AbstractC19454d {

        /* renamed from: a */
        final /* synthetic */ C19448b f46079a;

        /* renamed from: b */
        final /* synthetic */ View f46080b;

        static {
            Covode.recordClassIndex(22281);
        }

        C19449a(C19448b bVar, View view) {
            this.f46079a = bVar;
            this.f46080b = view;
        }

        @Override // com.bytedance.ies.xelement.viewpager.C19450c.AbstractC19454d
        /* renamed from: a */
        public final void mo31076a(TabLayout tabLayout, boolean z) {
            C89219l.m154719c(tabLayout, "");
            ((C19450c) this.f46080b).mo31079a((View) tabLayout);
            C19448b bVar = this.f46079a;
            C89219l.m154719c(tabLayout, "");
            CustomAppBarLayout customAppBarLayout = (CustomAppBarLayout) bVar.mo31074b(R.id.ki);
            C89219l.m154709a((Object) customAppBarLayout, "");
            int childCount = customAppBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = ((CustomAppBarLayout) bVar.mo31074b(R.id.ki)).getChildAt(i);
                if (childAt instanceof TabLayout) {
                    TabLayout tabLayout2 = (TabLayout) childAt;
                    if (tabLayout2 != null) {
                        ((CustomAppBarLayout) bVar.mo31074b(R.id.ki)).removeView(tabLayout2);
                    }
                } else {
                    i++;
                }
            }
            bVar.mo31075d((View) tabLayout);
            ((CustomAppBarLayout) this.f46079a.findViewById(R.id.ki)).setIsEnableTabbarDrag(z);
        }
    }
}
