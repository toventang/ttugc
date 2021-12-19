package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.a */
public final class C54246a extends RecyclerView.AbstractC1350a<C54264g> {

    /* renamed from: c */
    public static final C54247a f124268c = new C54247a((byte) 0);

    /* renamed from: a */
    final List<C54251c> f124269a = new ArrayList();

    /* renamed from: b */
    public final Context f124270b;

    static {
        Covode.recordClassIndex(63936);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C54264g onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m99498a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.a$a */
    public static final class C54247a {
        static {
            Covode.recordClassIndex(63937);
        }

        private C54247a() {
        }

        public /* synthetic */ C54247a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f124269a.size();
    }

    /* renamed from: a */
    public final void mo91334a() {
        this.f124269a.clear();
        notifyDataSetChanged();
    }

    public C54246a(Context context) {
        C89219l.m154721d(context, "");
        this.f124270b = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C54264g gVar, int i) {
        UrlModel avatarThumb;
        C54264g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        C54251c cVar = this.f124269a.get(i);
        C89219l.m154721d(cVar, "");
        int i2 = cVar.f124275a;
        if (i2 == 0) {
            IMUser iMUser = cVar.f124276b;
            if (!(iMUser == null || (avatarThumb = iMUser.getAvatarThumb()) == null)) {
                View view = gVar2.itemView;
                C89219l.m154716b(view, "");
                C34577e.m70592a((RemoteImageView) view.findViewById(R.id.on), avatarThumb);
            }
            View view2 = gVar2.itemView;
            C89219l.m154716b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.c8p);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else if (i2 == 1) {
            View view3 = gVar2.itemView;
            C89219l.m154716b(view3, "");
            View view4 = gVar2.itemView;
            C89219l.m154716b(view4, "");
            ((AvatarImageView) view3.findViewById(R.id.on)).setImageDrawable(C0643b.m2369a(view4.getContext(), (int) R.drawable.aqe));
            C17191a.C17192a aVar = new C17191a.C17192a();
            aVar.mo27180c("+");
            aVar.mo27177a(String.valueOf(cVar.f124277c));
            View view5 = gVar2.itemView;
            C89219l.m154716b(view5, "");
            TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.c8p);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(aVar.f40973a);
            View view6 = gVar2.itemView;
            C89219l.m154716b(view6, "");
            TuxTextView tuxTextView3 = (TuxTextView) view6.findViewById(R.id.c8p);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(0);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m99498a(C54246a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4439);
        C89219l.m154721d(viewGroup, "");
        Context context = aVar.f124270b;
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(context), R.layout.a51, viewGroup, false);
        C89219l.m154716b(a2, "");
        C54264g gVar = new C54264g(a2);
        try {
            if (gVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(gVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) gVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(gVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = gVar.getClass().getName();
        MethodCollector.m26664o(4439);
        return gVar;
    }
}
