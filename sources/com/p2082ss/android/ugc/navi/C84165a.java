package com.p2082ss.android.ugc.navi;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.JsonReader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.AbstractC34936bt;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.p4317j.C84122a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.navi.a */
public final class C84165a extends RecyclerView.AbstractC1350a<C84168c> {

    /* renamed from: d */
    public static final C84166a f187835d = new C84166a((byte) 0);

    /* renamed from: a */
    public final List<AbstractC34936bt> f187836a;

    /* renamed from: b */
    public final User f187837b;

    /* renamed from: c */
    public final AbstractC84167b f187838c;

    /* renamed from: e */
    private final int f187839e;

    /* renamed from: f */
    private final int f187840f = 1;

    /* renamed from: g */
    private final int f187841g = 2;

    /* renamed from: h */
    private final Context f187842h;

    /* renamed from: com.ss.android.ugc.navi.a$b */
    public interface AbstractC84167b {
        static {
            Covode.recordClassIndex(98069);
        }

        /* renamed from: a */
        void mo56065a(View view);

        /* renamed from: a */
        void mo56066a(View view, String str);

        /* renamed from: d */
        void mo56072d();
    }

    static {
        Covode.recordClassIndex(98067);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C84168c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m144753a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.navi.a$a */
    public static final class C84166a {
        static {
            Covode.recordClassIndex(98068);
        }

        private C84166a() {
        }

        public /* synthetic */ C84166a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<AbstractC34936bt> list = this.f187836a;
        if (list != null) {
            return list.size() + 2;
        }
        return 2;
    }

    /* renamed from: com.ss.android.ugc.navi.a$d */
    static final class View$OnClickListenerC84171d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C84165a f187850a;

        /* renamed from: b */
        final /* synthetic */ C84168c f187851b;

        static {
            Covode.recordClassIndex(98073);
        }

        View$OnClickListenerC84171d(C84165a aVar, C84168c cVar) {
            this.f187850a = aVar;
            this.f187851b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f187850a.f187838c.mo56065a(this.f187851b.f187847e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i == 0) {
            return this.f187841g;
        }
        if (i != 1) {
            return this.f187840f;
        }
        return this.f187839e;
    }

    /* renamed from: com.ss.android.ugc.navi.a$f */
    static final class View$OnClickListenerC84173f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C84165a f187853a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34936bt f187854b;

        static {
            Covode.recordClassIndex(98075);
        }

        View$OnClickListenerC84173f(C84165a aVar, AbstractC34936bt btVar) {
            this.f187853a = aVar;
            this.f187854b = btVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC84167b bVar = this.f187853a.f187838c;
            C89219l.m154716b(view, "");
            String a = this.f187854b.mo61818a();
            if (a == null) {
                C89219l.m154715b();
            }
            bVar.mo56066a(view, a);
        }
    }

    /* renamed from: com.ss.android.ugc.navi.a$e */
    static final class View$OnClickListenerC84172e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C84165a f187852a;

        static {
            Covode.recordClassIndex(98074);
        }

        View$OnClickListenerC84172e(C84165a aVar) {
            this.f187852a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C80537hk.m139613a(this.f187852a.f187837b.naviId)) {
                AbstractC84167b bVar = this.f187852a.f187838c;
                C89219l.m154716b(view, "");
                String str = this.f187852a.f187837b.naviId;
                if (str == null) {
                    C89219l.m154715b();
                }
                bVar.mo56066a(view, str);
                return;
            }
            this.f187852a.f187838c.mo56072d();
        }
    }

    /* renamed from: com.ss.android.ugc.navi.a$c */
    public static final class C84168c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final SmartCircleImageView f187843a;

        /* renamed from: b */
        public final GeckoLottieView f187844b;

        /* renamed from: c */
        public final View f187845c;

        /* renamed from: d */
        public final ImageView f187846d;

        /* renamed from: e */
        public View f187847e;

        static {
            Covode.recordClassIndex(98070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84168c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.cr5);
            C89219l.m154716b(findViewById, "");
            this.f187843a = (SmartCircleImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.cha);
            C89219l.m154716b(findViewById2, "");
            this.f187844b = (GeckoLottieView) findViewById2;
            View findViewById3 = view.findViewById(R.id.cq_);
            C89219l.m154716b(findViewById3, "");
            this.f187845c = findViewById3;
            View findViewById4 = view.findViewById(R.id.cr6);
            C89219l.m154716b(findViewById4, "");
            ImageView imageView = (ImageView) findViewById4;
            this.f187846d = imageView;
            View findViewById5 = view.findViewById(R.id.cr4);
            C89219l.m154716b(findViewById5, "");
            this.f187847e = findViewById5;
            C22999a a = C23005c.m43393a(C841691.f187848a);
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C23001b a2 = a.mo37368a(context);
            C23008e a3 = C23009f.m43397a(C841702.f187849a);
            Context context2 = view.getContext();
            C89219l.m154716b(context2, "");
            imageView.setImageDrawable(C23163i.m43657a(a2, a3.mo37389a(context2)));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m144753a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6751);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.az2, viewGroup, false);
        C89219l.m154716b(a2, "");
        C84168c cVar = new C84168c(a2);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = cVar.getClass().getName();
        MethodCollector.m26664o(6751);
        return cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C84168c cVar, int i) {
        C84168c cVar2 = cVar;
        String str = "";
        C89219l.m154721d(cVar2, str);
        if (getItemViewType(i) == this.f187841g) {
            GeckoLottieView geckoLottieView = cVar2.f187844b;
            C89219l.m154721d("share_navi_create_btn_animation.json", str);
            C89219l.m154721d("navi_lottie", str);
            C89219l.m154721d("share_navi_create_btn_animation_fallback.json", str);
            if (!C84122a.m144659a()) {
                geckoLottieView.setAnimation("share_navi_create_btn_animation_fallback.json");
            } else {
                C89219l.m154721d("share_navi_create_btn_animation.json", str);
                C89219l.m154721d("navi_lottie", str);
                String b = C80333dc.m139277b(C84122a.f187729b, C84122a.f187728a);
                if (b != null) {
                    if ("navi_lottie".length() == 0) {
                        str = b + File.separator + "share_navi_create_btn_animation.json";
                    } else {
                        str = b + File.separator + "navi_lottie" + File.separator + "share_navi_create_btn_animation.json";
                    }
                }
                geckoLottieView.mo5829a(new JsonReader(new FileReader(str)), str);
            }
            cVar2.f187845c.setVisibility(8);
            cVar2.f187847e.setVisibility(0);
            cVar2.f187847e.setOnClickListener(new View$OnClickListenerC84171d(this, cVar2));
        } else {
            cVar2.f187845c.setVisibility(0);
            cVar2.f187847e.setVisibility(8);
        }
        if (getItemViewType(i) == this.f187839e) {
            UrlModel avatarVideoUri = this.f187837b.getAvatarVideoUri();
            if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
                C20766v a = C20761r.m39060a(C34735v.m70965a(C80630u.m139797a(this.f187837b)));
                a.f49092E = cVar2.f187843a;
                a.mo34186c();
            } else {
                C20766v a2 = C20761r.m39057a(Uri.parse(avatarVideoUri.getUrlList().get(0)));
                a2.f49098K = true;
                a2.f49106c = true;
                a2.f49092E = cVar2.f187843a;
                a2.mo34186c();
            }
            cVar2.f187846d.setOnClickListener(new View$OnClickListenerC84172e(this));
        }
        if (getItemViewType(i) == this.f187840f) {
            List<AbstractC34936bt> list = this.f187836a;
            if (list == null) {
                C89219l.m154715b();
            }
            AbstractC34936bt btVar = list.get(i - 2);
            try {
                if (btVar.mo61820c() != null) {
                    cVar2.f187843a.setBackgroundColor(Color.parseColor(btVar.mo61820c()));
                }
            } catch (Exception unused) {
            }
            String b2 = btVar.mo61819b();
            if (b2 != null) {
                C20766v a3 = C20761r.m39057a(Uri.parse(b2));
                a3.f49092E = cVar2.f187843a;
                a3.f49125v = EnumC20767w.CENTER_INSIDE;
                a3.mo34186c();
            }
            cVar2.f187846d.setOnClickListener(new View$OnClickListenerC84173f(this, btVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.bt> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84165a(Context context, List<? extends AbstractC34936bt> list, User user, AbstractC84167b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(bVar, "");
        this.f187842h = context;
        this.f187836a = list;
        this.f187837b = user;
        this.f187838c = bVar;
    }
}
