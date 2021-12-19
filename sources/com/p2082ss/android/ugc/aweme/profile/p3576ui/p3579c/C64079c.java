package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.profile.widgets.View$OnClickListenerC64894k;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.c.c */
public final class C64079c extends RecyclerView.AbstractC1350a<C64081b> {

    /* renamed from: e */
    public static final C64080a f145385e = new C64080a((byte) 0);

    /* renamed from: a */
    final List<C80053c> f145386a = new ArrayList();

    /* renamed from: b */
    public final WeakReference<View$OnClickListenerC64894k.AbstractC64896b> f145387b;

    /* renamed from: c */
    public final C63511a f145388c;

    /* renamed from: d */
    public final ActivityC0945e f145389d;

    static {
        Covode.recordClassIndex(75523);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C64081b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m115989a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.c$a */
    public static final class C64080a {
        static {
            Covode.recordClassIndex(75524);
        }

        private C64080a() {
        }

        public /* synthetic */ C64080a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f145386a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.c$b */
    public static final class C64081b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final AvatarImageView f145390a;

        /* renamed from: b */
        public final TextView f145391b;

        /* renamed from: c */
        public final TextView f145392c;

        /* renamed from: d */
        public final ImageView f145393d;

        /* renamed from: e */
        public final TuxAlertBadge f145394e;

        static {
            Covode.recordClassIndex(75525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64081b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.nz);
            C89219l.m154716b(findViewById, "");
            this.f145390a = (AvatarImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.c94);
            C89219l.m154716b(findViewById2, "");
            this.f145391b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.c95);
            C89219l.m154716b(findViewById3, "");
            this.f145392c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.agq);
            C89219l.m154716b(findViewById4, "");
            this.f145393d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.cjd);
            C89219l.m154716b(findViewById5, "");
            this.f145394e = (TuxAlertBadge) findViewById5;
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m115989a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(7736);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ann, viewGroup, false);
        C89219l.m154716b(a2, "");
        C64081b bVar = new C64081b(a2);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(7736);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C64081b bVar, int i) {
        int i2;
        int a;
        C64081b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        C80053c cVar = this.f145386a.get(i);
        if (C89219l.m154714a((Object) cVar.f179384a, (Object) "-1")) {
            bVar2.f145390a.setImageResource(2131233439);
            bVar2.f145391b.setText(R.string.oq);
            bVar2.f145392c.setVisibility(8);
        } else {
            C34577e.m70608b(bVar2.f145390a, cVar.f179388e, -1, -1);
            bVar2.f145391b.setVisibility(0);
            bVar2.f145391b.setText(cVar.mo123504a());
            bVar2.f145392c.setText(cVar.f179387d);
        }
        ImageView imageView = bVar2.f145393d;
        String str = cVar.f179384a;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (C89219l.m154714a((Object) str, (Object) g.getCurUserId())) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        bVar2.f145394e.setVisibility(8);
        String str2 = cVar.f179384a;
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        if ((!C89219l.m154714a((Object) str2, (Object) g2.getCurUserId())) && (a = C61542b.m111457a(cVar.f179384a)) > 0) {
            bVar2.f145394e.setVisibility(0);
            bVar2.f145394e.setCount(a);
            bVar2.f145394e.setMaxCount(99);
        }
        View view = bVar2.itemView;
        WeakReference<View$OnClickListenerC64894k.AbstractC64896b> weakReference = this.f145387b;
        View view2 = bVar2.itemView;
        C89219l.m154716b(view2, "");
        Context context = view2.getContext();
        C89219l.m154716b(context, "");
        view.setOnClickListener(new View$OnClickListenerC64894k(weakReference, cVar, context, this.f145389d, this.f145388c));
    }

    public C64079c(WeakReference<View$OnClickListenerC64894k.AbstractC64896b> weakReference, C63511a aVar, ActivityC0945e eVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(eVar, "");
        this.f145387b = weakReference;
        this.f145388c = aVar;
        this.f145389d = eVar;
    }
}
