package com.p2082ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.p2351av.C34261a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66621e;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.base.widget.d */
public final class C34752d extends ConstraintLayout implements AbstractC66617b {

    /* renamed from: g */
    public AbstractC66619c f82075g;

    /* renamed from: h */
    C88411a f82076h;

    /* renamed from: i */
    String f82077i;

    /* renamed from: j */
    Map<String, String> f82078j;

    /* renamed from: k */
    final String f82079k;

    /* renamed from: l */
    private EnumC66621e f82080l;

    /* renamed from: m */
    private C56520b f82081m;

    /* renamed from: n */
    private boolean f82082n;

    /* renamed from: o */
    private SparseArray f82083o;

    static {
        Covode.recordClassIndex(41748);
    }

    /* renamed from: b */
    private View m70986b(int i) {
        if (this.f82083o == null) {
            this.f82083o = new SparseArray();
        }
        View view = (View) this.f82083o.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82083o.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b
    public final View getContainer() {
        return this;
    }

    /* renamed from: c */
    private final boolean m70987c() {
        C56520b bVar = this.f82081m;
        if (bVar == null || bVar.f128860b == -1) {
            return false;
        }
        RemoteImageView remoteImageView = (RemoteImageView) m70986b(R.id.d0f);
        C89219l.m154716b(remoteImageView, "");
        RemoteImageView remoteImageView2 = (RemoteImageView) m70986b(R.id.d0f);
        C89219l.m154716b(remoteImageView2, "");
        ViewGroup.LayoutParams layoutParams = remoteImageView2.getLayoutParams();
        layoutParams.width = bVar.f128860b;
        layoutParams.height = bVar.f128860b;
        remoteImageView.setLayoutParams(layoutParams);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b
    /* renamed from: b */
    public final void mo9139b() {
        TuxIconView tuxIconView = (TuxIconView) m70986b(R.id.d0h);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b
    public final void setActionListener(AbstractC66619c cVar) {
        C89219l.m154721d(cVar, "");
        this.f82075g = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b
    public final void setEnterFrom(String str) {
        C89219l.m154721d(str, "");
        this.f82077i = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b
    public final void setUFRSubscription(C88411a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82076h = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.d$a */
    static final class C34753a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C34752d f82084a;

        /* renamed from: b */
        final /* synthetic */ EnumC66622f f82085b;

        static {
            Covode.recordClassIndex(41749);
        }

        C34753a(C34752d dVar, EnumC66622f fVar) {
            this.f82084a = dVar;
            this.f82085b = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC66619c cVar;
            if (((C79546d) obj).f178516a == EnumC79549g.AUTHORIZED && (cVar = this.f82084a.f82075g) != null) {
                cVar.mo91925b(this.f82085b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.d$b */
    static final class C34754b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C34752d f82086a;

        /* renamed from: b */
        final /* synthetic */ EnumC66622f f82087b;

        static {
            Covode.recordClassIndex(41750);
        }

        C34754b(C34752d dVar, EnumC66622f fVar) {
            this.f82086a = dVar;
            this.f82087b = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            new C23144b(this.f82086a).mo37640e(R.string.clf).mo37637b();
            C39109f.m79401a("PermissionItemView", "UFR error!", (Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.d$d */
    static final class View$OnClickListenerC34756d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34752d f82090a;

        /* renamed from: b */
        final /* synthetic */ EnumC66622f f82091b;

        static {
            Covode.recordClassIndex(41752);
        }

        View$OnClickListenerC34756d(C34752d dVar, EnumC66622f fVar) {
            this.f82090a = dVar;
            this.f82091b = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EnumC66622f fVar = this.f82091b;
            C89219l.m154721d(fVar, "");
            C34261a.m70044a().mo87020a(fVar, C89387v.m154943a(true, Long.valueOf(System.currentTimeMillis())));
            fVar.name();
            AbstractC66619c cVar = this.f82090a.f82075g;
            if (cVar != null) {
                cVar.mo91926c(this.f82091b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.d$c */
    static final class View$OnClickListenerC34755c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34752d f82088a;

        /* renamed from: b */
        final /* synthetic */ EnumC66622f f82089b;

        static {
            Covode.recordClassIndex(41751);
        }

        View$OnClickListenerC34755c(C34752d dVar, EnumC66622f fVar) {
            this.f82088a = dVar;
            this.f82089b = fVar;
        }

        public final void onClick(View view) {
            Class<? extends AbstractC79495a> f;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                AbstractC66619c cVar = this.f82088a.f82075g;
                if (cVar != null) {
                    cVar.mo91924a(this.f82089b);
                }
                C34752d dVar = this.f82088a;
                EnumC66622f fVar = this.f82089b;
                C88411a aVar = dVar.f82076h;
                if (aVar != null) {
                    if (fVar == EnumC66622f.CONTACT) {
                        f = C51648a.f118980a.mo87320c();
                    } else {
                        f = C51648a.f118980a.mo87326f();
                    }
                    Context context = dVar.getContext();
                    C89219l.m154716b(context, "");
                    User b = C80580in.m139683b();
                    C89219l.m154716b(b, "");
                    AbstractC88412b a = C79515b.m138229a(context, f, b.getUid(), dVar.f82077i, dVar.f82079k, true, true, dVar.f82078j).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C34753a(dVar, fVar), new C34754b(dVar, fVar));
                    C89219l.m154716b(a, "");
                    C88934a.m154195a(a, aVar);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b
    public final void setUFRExternalParams(Map<String, String> map) {
        C89219l.m154721d(map, "");
        this.f82078j = map;
        if (!this.f82082n && C89219l.m154714a((Object) "bottom", (Object) map.get("position"))) {
            this.f82082n = true;
            TuxButton tuxButton = (TuxButton) m70986b(R.id.d0m);
            C89219l.m154716b(tuxButton, "");
            TuxButton tuxButton2 = (TuxButton) m70986b(R.id.d0m);
            C89219l.m154716b(tuxButton2, "");
            ViewGroup.LayoutParams layoutParams = tuxButton2.getLayoutParams();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, 120.0f, system.getDisplayMetrics()));
            tuxButton.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C34752d(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6942);
        this.f82077i = "";
        this.f82080l = EnumC66621e.INBOX_SMALL;
        this.f82079k = "click";
        LayoutInflater.from(context).inflate(R.layout.aah, this);
        setLayoutParams(new ConstraintLayout.C0547a(-1, -2));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        C23163i.m43660a((View) this, valueOf, valueOf2, valueOf3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics()))), false, 16);
        MethodCollector.m26664o(6942);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b
    /* renamed from: a */
    public final void mo61458a(C56520b bVar) {
        boolean z;
        C56520b bVar2;
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f82081m, bVar)) {
            this.f82081m = bVar;
            m70987c();
            if (bVar.f128863e != -1) {
                z = true;
            } else {
                z = false;
            }
            C56520b bVar3 = null;
            if (z) {
                bVar2 = bVar;
            } else {
                bVar2 = null;
            }
            if (bVar2 != null) {
                ((TuxTextView) m70986b(R.id.d0w)).setTuxFont(bVar2.f128863e);
            }
            if (bVar.f128864f != -1) {
                ((TuxTextView) m70986b(R.id.d0w)).mo37697a((float) bVar.f128864f);
            }
            if (bVar.f128865g != -1) {
                bVar3 = bVar;
            }
            if (bVar3 != null) {
                ((TuxTextView) m70986b(R.id.d0l)).setTuxFont(bVar3.f128865g);
            }
            if (bVar.f128866h != -1) {
                ((TuxTextView) m70986b(R.id.d0l)).mo37697a((float) bVar.f128866h);
            }
            if (bVar.f128867i != -1) {
                ((TuxTextView) m70986b(R.id.d0l)).setTextColor(bVar.f128867i);
            }
            if (bVar.f128868j != -1) {
                TuxTextView tuxTextView = (TuxTextView) m70986b(R.id.d0l);
                C89219l.m154716b(tuxTextView, "");
                if (tuxTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    TuxTextView tuxTextView2 = (TuxTextView) m70986b(R.id.d0l);
                    C89219l.m154716b(tuxTextView2, "");
                    TuxTextView tuxTextView3 = (TuxTextView) m70986b(R.id.d0l);
                    C89219l.m154716b(tuxTextView3, "");
                    ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = bVar.f128868j;
                    tuxTextView2.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public final void setStyle(EnumC66621e eVar) {
        C89219l.m154721d(eVar, "");
        if (this.f82080l != eVar) {
            this.f82080l = eVar;
            if (!m70987c()) {
                if (C34757e.f82092a[eVar.ordinal()] != 1) {
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system2.getDisplayMetrics())));
                    Resources system3 = Resources.getSystem();
                    C89219l.m154709a((Object) system3, "");
                    Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())));
                    Resources system4 = Resources.getSystem();
                    C89219l.m154709a((Object) system4, "");
                    C23163i.m43660a((View) this, valueOf, valueOf2, valueOf3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system4.getDisplayMetrics()))), false, 16);
                    RemoteImageView remoteImageView = (RemoteImageView) m70986b(R.id.d0f);
                    C89219l.m154716b(remoteImageView, "");
                    RemoteImageView remoteImageView2 = (RemoteImageView) m70986b(R.id.d0f);
                    C89219l.m154716b(remoteImageView2, "");
                    ViewGroup.LayoutParams layoutParams = remoteImageView2.getLayoutParams();
                    Resources system5 = Resources.getSystem();
                    C89219l.m154709a((Object) system5, "");
                    layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system5.getDisplayMetrics()));
                    Resources system6 = Resources.getSystem();
                    C89219l.m154709a((Object) system6, "");
                    layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system6.getDisplayMetrics()));
                    remoteImageView.setLayoutParams(layoutParams);
                    return;
                }
                Resources system7 = Resources.getSystem();
                C89219l.m154709a((Object) system7, "");
                Integer valueOf4 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system7.getDisplayMetrics())));
                Resources system8 = Resources.getSystem();
                C89219l.m154709a((Object) system8, "");
                Integer valueOf5 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system8.getDisplayMetrics())));
                Resources system9 = Resources.getSystem();
                C89219l.m154709a((Object) system9, "");
                Integer valueOf6 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system9.getDisplayMetrics())));
                Resources system10 = Resources.getSystem();
                C89219l.m154709a((Object) system10, "");
                C23163i.m43660a((View) this, valueOf4, valueOf5, valueOf6, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system10.getDisplayMetrics()))), false, 16);
                RemoteImageView remoteImageView3 = (RemoteImageView) m70986b(R.id.d0f);
                C89219l.m154716b(remoteImageView3, "");
                RemoteImageView remoteImageView4 = (RemoteImageView) m70986b(R.id.d0f);
                C89219l.m154716b(remoteImageView4, "");
                ViewGroup.LayoutParams layoutParams2 = remoteImageView4.getLayoutParams();
                Resources system11 = Resources.getSystem();
                C89219l.m154709a((Object) system11, "");
                layoutParams2.width = C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system11.getDisplayMetrics()));
                Resources system12 = Resources.getSystem();
                C89219l.m154709a((Object) system12, "");
                layoutParams2.height = C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system12.getDisplayMetrics()));
                remoteImageView3.setLayoutParams(layoutParams2);
            }
        }
    }

    public /* synthetic */ C34752d(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b
    /* renamed from: a */
    public final void mo61459a(EnumC66622f fVar, EnumC66621e eVar, int i) {
        int i2;
        C89219l.m154721d(fVar, "");
        if (eVar != null) {
            setStyle(eVar);
        }
        if (fVar == EnumC66622f.CONTACT) {
            if (i == 1 || i == 2) {
                i2 = R.raw.icon_color_contact;
            } else {
                i2 = R.raw.icon_color_contact_circle;
            }
            C34577e.m70591a((RemoteImageView) m70986b(R.id.d0f), i2);
            ((TuxTextView) m70986b(R.id.d0w)).setText(R.string.atc);
            ((TuxTextView) m70986b(R.id.d0l)).setText(R.string.atb);
        } else if (fVar == EnumC66622f.FACEBOOK) {
            C34577e.m70591a((RemoteImageView) m70986b(R.id.d0f), (int) R.raw.icon_color_facebook_circle);
            ((TuxTextView) m70986b(R.id.d0w)).setText(R.string.bse);
            ((TuxTextView) m70986b(R.id.d0l)).setText(R.string.bsd);
        }
        setOnClickListener(new View$OnClickListenerC34755c(this, fVar));
        ((TuxIconView) m70986b(R.id.d0h)).setOnClickListener(new View$OnClickListenerC34756d(this, fVar));
    }
}
