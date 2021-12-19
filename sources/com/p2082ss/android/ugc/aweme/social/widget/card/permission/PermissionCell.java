package com.p2082ss.android.ugc.aweme.social.widget.card.permission;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.keva.Keva;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74755b;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74760e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74776b;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell */
public abstract class PermissionCell<T extends C74808c> extends PowerCell<T> implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public SocialCardVM f168111a;

    /* renamed from: b */
    final AbstractC89244h f168112b = C89250i.m154773a((AbstractC89171a) new C74797a(this));

    /* renamed from: j */
    public T f168113j;

    /* renamed from: k */
    public final boolean f168114k;

    /* renamed from: l */
    private final AbstractC89244h f168115l = C89250i.m154773a((AbstractC89171a) new C74802e(this));

    /* renamed from: m */
    private View f168116m;

    static {
        Covode.recordClassIndex(87648);
    }

    /* renamed from: a */
    public final SocialCardVM mo117852a() {
        return (SocialCardVM) this.f168115l.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo117847a(TuxButton tuxButton) {
        C89219l.m154721d(tuxButton, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo117848a(TuxIconView tuxIconView) {
        C89219l.m154721d(tuxIconView, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo117850a(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo117853b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo117849b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo117851b(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell$a */
    static final class C74797a extends AbstractC89220m implements AbstractC89171a<C23208a> {

        /* renamed from: a */
        final /* synthetic */ PermissionCell f168117a;

        static {
            Covode.recordClassIndex(87649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74797a(PermissionCell permissionCell) {
            super(0);
            this.f168117a = permissionCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23208a invoke() {
            return new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.b4w).mo37789b(1).mo37787a(new AbstractC89172b<View, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell.C74797a.C747981 */

                /* renamed from: a */
                final /* synthetic */ C74797a f168118a;

                static {
                    Covode.recordClassIndex(87650);
                }

                {
                    this.f168118a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(View view) {
                    C89219l.m154721d(view, "");
                    this.f168118a.f168117a.mo117852a().mo117916b(PermissionCell.m131338a(this.f168118a.f168117a));
                    return C89391z.f203057a;
                }
            })).mo37800b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell$e */
    static final class C74802e extends AbstractC89220m implements AbstractC89171a<SocialCardVM> {

        /* renamed from: a */
        final /* synthetic */ PermissionCell f168123a;

        static {
            Covode.recordClassIndex(87654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74802e(PermissionCell permissionCell) {
            super(0);
            this.f168123a = permissionCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SocialCardVM invoke() {
            Object obj = this.f168123a.f168111a;
            if (obj != null || (obj = PowerCell.m32713b(this.f168123a, SocialCardVM.class)) != null || (obj = PowerCell.m32711a(this.f168123a, SocialCardVM.class)) != null) {
                return obj;
            }
            throw new IllegalStateException("Where am I? the activity is null!");
        }
    }

    public void onGlobalLayout() {
        View view = this.f168116m;
        if (view == null) {
            C89219l.m154710a("container");
        }
        if (view.getGlobalVisibleRect(new Rect())) {
            SocialCardVM a = mo117852a();
            T t = this.f168113j;
            if (t == null) {
                C89219l.m154710a("permissionItem");
            }
            a.mo117911a((AbstractC17641a) t);
            View view2 = this.f168116m;
            if (view2 == null) {
                C89219l.m154710a("container");
            }
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo23350a(T t) {
        C89219l.m154721d(t, "");
        this.f168113j = t;
    }

    /* renamed from: a */
    public static final /* synthetic */ C74808c m131338a(PermissionCell permissionCell) {
        T t = permissionCell.f168113j;
        if (t == null) {
            C89219l.m154710a("permissionItem");
        }
        return t;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell$d */
    static final class View$OnClickListenerC74801d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermissionCell f168122a;

        static {
            Covode.recordClassIndex(87653);
        }

        View$OnClickListenerC74801d(PermissionCell permissionCell) {
            this.f168122a = permissionCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f168122a.mo117852a().mo117916b(PermissionCell.m131338a(this.f168122a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell<T extends com.ss.android.ugc.aweme.social.widget.card.permission.c> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void mo117854b(Object obj) {
        C89219l.m154721d(obj, "");
        mo23350a((C74808c) obj);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell$c */
    static final class View$OnLongClickListenerC74800c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ PermissionCell f168120a;

        /* renamed from: b */
        final /* synthetic */ View f168121b;

        static {
            Covode.recordClassIndex(87652);
        }

        View$OnLongClickListenerC74800c(PermissionCell permissionCell, View view) {
            this.f168120a = permissionCell;
            this.f168121b = view;
        }

        public final boolean onLongClick(View view) {
            Context context = ((ViewGroup) this.f168121b).getContext();
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (eVar == null) {
                return false;
            }
            ((DialogInterface$OnCancelListenerC0944d) this.f168120a.f168112b.getValue()).show(eVar.getSupportFragmentManager(), PermissionCell.m131338a(this.f168120a).f168131a.name());
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell$b */
    static final class View$OnClickListenerC74799b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermissionCell f168119a;

        static {
            Covode.recordClassIndex(87651);
        }

        View$OnClickListenerC74799b(PermissionCell permissionCell) {
            this.f168119a = permissionCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SocialCardVM a = this.f168119a.mo117852a();
            C74808c a2 = PermissionCell.m131338a(this.f168119a);
            C89219l.m154721d(a2, "");
            C74755b b = a.mo117914b();
            EnumC74761f fVar = a2.f168131a;
            C89219l.m154721d(fVar, "");
            b.mo117809b();
            Keva a3 = b.mo117807a();
            a3.storeInt(C74755b.m131260a("key_exp_count_", fVar), 0);
            a3.storeInt(C74755b.m131260a("key_delete_count_", fVar), 0);
            a3.storeLong(C74755b.m131260a("key_delete_hide_ts_", fVar), -1);
            a3.storeLong(C74755b.m131260a("key_auto_hide_ts_", fVar), -1);
            AbstractC74788j jVar = a.f168264e;
            if (jVar != null) {
                jVar.mo86628a(a2.f168131a, EnumC74760e.ON_CLICK, null);
            }
            EnumC74761f fVar2 = a2.f168131a;
            Map<String, String> map = a.f168265f;
            C89219l.m154721d(fVar2, "");
            C74776b.m131282a(fVar2, "find_friends", map);
            a.f168278s.postValue(a2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), mo117853b(), viewGroup, false);
        C89219l.m154716b(a, "");
        this.f168116m = a;
        if (a == null) {
            C89219l.m154710a("container");
        }
        TuxIconView tuxIconView = (TuxIconView) a.findViewById(R.id.d0o);
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.d0w);
        TuxTextView tuxTextView2 = (TuxTextView) a.findViewById(R.id.d0l);
        TuxButton tuxButton = (TuxButton) a.findViewById(R.id.d0m);
        TuxIconView tuxIconView2 = (TuxIconView) a.findViewById(R.id.d0k);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        mo117849b(viewGroup2);
        C89219l.m154716b(tuxIconView, "");
        mo117848a(tuxIconView);
        C89219l.m154716b(tuxTextView, "");
        mo117850a(tuxTextView);
        C89219l.m154716b(tuxTextView2, "");
        mo117851b(tuxTextView2);
        if (tuxIconView2 != null) {
            C89219l.m154721d(tuxIconView2, "");
        }
        C89219l.m154716b(tuxButton, "");
        mo117847a(tuxButton);
        viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(this);
        a.setOnClickListener(new View$OnClickListenerC74799b(this));
        if (this.f168114k) {
            a.setOnLongClickListener(new View$OnLongClickListenerC74800c(this, a));
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
        } else if (tuxIconView2 != null) {
            tuxIconView2.setOnClickListener(new View$OnClickListenerC74801d(this));
        }
        View view = this.f168116m;
        if (view == null) {
            C89219l.m154710a("container");
        }
        return view;
    }
}
