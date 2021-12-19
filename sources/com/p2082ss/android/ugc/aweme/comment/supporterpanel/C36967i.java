package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i */
public final class C36967i extends RecyclerView.AbstractC1350a<AbstractC36968a<?>> {

    /* renamed from: c */
    public static final C36969b f87067c = new C36969b((byte) 0);

    /* renamed from: a */
    public List<Object> f87068a = new ArrayList();

    /* renamed from: b */
    public boolean f87069b;

    static {
        Covode.recordClassIndex(44315);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ AbstractC36968a<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m74630a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$b */
    public static final class C36969b {
        static {
            Covode.recordClassIndex(44317);
        }

        private C36969b() {
        }

        public /* synthetic */ C36969b(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f87068a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$f */
    static final class RunnableC36974f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36967i f87074a;

        /* renamed from: b */
        final /* synthetic */ List f87075b;

        static {
            Covode.recordClassIndex(44322);
        }

        RunnableC36974f(C36967i iVar, List list) {
            this.f87074a = iVar;
            this.f87075b = list;
        }

        public final void run() {
            this.f87074a.f87068a.addAll(this.f87075b);
            this.f87074a.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$g */
    static final class RunnableC36975g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36967i f87076a;

        static {
            Covode.recordClassIndex(44323);
        }

        RunnableC36975g(C36967i iVar) {
            this.f87076a = iVar;
        }

        public final void run() {
            this.f87076a.f87068a.add("1");
            C36967i iVar = this.f87076a;
            iVar.notifyItemInserted(iVar.f87068a.size() - 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$h */
    static final class RunnableC36976h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36967i f87077a;

        static {
            Covode.recordClassIndex(44324);
        }

        RunnableC36976h(C36967i iVar) {
            this.f87077a = iVar;
        }

        public final void run() {
            this.f87077a.f87068a.add(1);
            C36967i iVar = this.f87077a;
            iVar.notifyItemInserted(iVar.f87068a.size() - 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$a */
    public static abstract class AbstractC36968a<T> extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(44316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AbstractC36968a(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$c */
    public final class C36970c extends AbstractC36968a<C36957d> {

        /* renamed from: a */
        final /* synthetic */ C36967i f87070a;

        static {
            Covode.recordClassIndex(44318);
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$c$a */
        static final class View$OnClickListenerC36971a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C36957d f87071a;

            static {
                Covode.recordClassIndex(44319);
            }

            View$OnClickListenerC36971a(C36957d dVar) {
                this.f87071a = dVar;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                C89219l.m154716b(view, "");
                SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/");
                User user = this.f87071a.f87034a;
                String str2 = null;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                SmartRoute withParam = buildRoute.withParam("uid", str);
                User user2 = this.f87071a.f87034a;
                if (user2 != null) {
                    str2 = user2.getSecUid();
                }
                withParam.withParam("sec_user_id", str2).withParam("profile_enterprise_type", 0).open();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36970c(C36967i iVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f87070a = iVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        Object obj = this.f87068a.get(i);
        if (obj instanceof C36957d) {
            return 0;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        if (obj instanceof String) {
            return 2;
        }
        throw new IllegalArgumentException("Invalid type of data ".concat(String.valueOf(i)));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$d */
    public final class C36972d extends AbstractC36968a<Object> {

        /* renamed from: a */
        final /* synthetic */ C36967i f87072a;

        static {
            Covode.recordClassIndex(44320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36972d(C36967i iVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f87072a = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.i$e */
    public final class C36973e extends AbstractC36968a<Object> {

        /* renamed from: a */
        final /* synthetic */ C36967i f87073a;

        static {
            Covode.recordClassIndex(44321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36973e(C36967i iVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f87073a = iVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(AbstractC36968a<?> aVar, int i) {
        String str;
        UrlModel avatarThumb;
        List<String> urlList;
        AbstractC36968a<?> aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        Object obj = this.f87068a.get(i);
        if (aVar2 instanceof C36970c) {
            C36970c cVar = (C36970c) aVar2;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.supporterpanel.GiftSender");
            C36957d dVar = (C36957d) obj;
            C89219l.m154721d(dVar, "");
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) cVar.itemView.findViewById(R.id.bat);
            TuxTextView tuxTextView = (TuxTextView) cVar.itemView.findViewById(R.id.baw);
            TuxTextView tuxTextView2 = (TuxTextView) cVar.itemView.findViewById(R.id.a_z);
            String str2 = null;
            if (smartAvatarImageView != null) {
                User user = dVar.f87034a;
                if (user == null || (avatarThumb = user.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null) {
                    str = null;
                } else {
                    str = urlList.get(0);
                }
                smartAvatarImageView.setImageURI(str);
            }
            if (tuxTextView != null) {
                User user2 = dVar.f87034a;
                if (user2 != null) {
                    str2 = user2.getUniqueId();
                }
                tuxTextView.setText(str2);
            }
            if (tuxTextView2 != null) {
                tuxTextView2.setText(dVar.f87036c);
            }
            smartAvatarImageView.setOnClickListener(new C36970c.View$OnClickListenerC36971a(dVar));
        } else if (aVar2 instanceof C36973e) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
            C89219l.m154721d(obj, "");
            ((TuxDualBallView) ((C36973e) aVar2).itemView.findViewById(R.id.bb4)).mo37884b();
        } else if (aVar2 instanceof C36972d) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
            C89219l.m154721d(obj, "");
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m74630a(C36967i iVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(9709);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 0) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.iw, viewGroup, false);
            C89219l.m154716b(a, "");
            viewHolder = new C36970c(iVar, a);
        } else if (i == 1) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.in, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C36973e(iVar, a2);
        } else if (i == 2) {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.im, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C36972d(iVar, a3);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid view type");
            MethodCollector.m26664o(9709);
            throw illegalArgumentException;
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(9709);
        return viewHolder;
    }
}
