package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.ScrollView;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.C17031d;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2545c.C37703a;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80420fc;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d */
public final class C37712d extends AbstractC37710b implements AbstractC17046h.AbstractC17048b {

    /* renamed from: l */
    public static final C37713a f89089l = new C37713a((byte) 0);

    /* renamed from: a */
    public PdpLogHelper f89090a;

    /* renamed from: b */
    final AbstractC89244h f89091b = C89250i.m154773a((AbstractC89171a) new C37730k(this));

    /* renamed from: c */
    public AbstractC89171a<C89391z> f89092c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f89093d;

    /* renamed from: e */
    final AbstractC89244h f89094e = C89250i.m154773a((AbstractC89171a) new C37714b(this));

    /* renamed from: f */
    public AbstractC16208i f89095f;

    /* renamed from: g */
    public View f89096g;

    /* renamed from: h */
    public float f89097h;

    /* renamed from: i */
    public BottomSheetBehavior<View> f89098i;

    /* renamed from: j */
    public int f89099j = 4;

    /* renamed from: k */
    public Integer f89100k;

    /* renamed from: m */
    private final AbstractC89244h f89101m = C89250i.m154773a((AbstractC89171a) new C37732m(this));

    /* renamed from: n */
    private final AbstractC89244h f89102n = C89250i.m154773a((AbstractC89171a) new C37719f(this));

    /* renamed from: o */
    private final AbstractC89244h f89103o = C89250i.m154773a((AbstractC89171a) new C37731l(this));

    /* renamed from: p */
    private final AbstractC89244h f89104p = C89250i.m154773a((AbstractC89171a) new C37715c(this));

    /* renamed from: q */
    private final AbstractC89244h f89105q = C89250i.m154773a((AbstractC89171a) new C37733n(this));

    /* renamed from: r */
    private C17031d f89106r;

    /* renamed from: s */
    private long f89107s;

    /* renamed from: t */
    private String f89108t;

    /* renamed from: u */
    private HashMap f89109u;

    static {
        Covode.recordClassIndex(45152);
    }

    /* renamed from: d */
    private final C37703a m76333d() {
        return (C37703a) this.f89101m.getValue();
    }

    /* renamed from: e */
    private final String m76334e() {
        return (String) this.f89103o.getValue();
    }

    /* renamed from: a */
    public final ViewGroup mo65728a() {
        return (ViewGroup) this.f89104p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$a */
    public static final class C37713a {
        static {
            Covode.recordClassIndex(45153);
        }

        private C37713a() {
        }

        public /* synthetic */ C37713a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$d */
    public static final class C37716d implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f89112a;

        static {
            Covode.recordClassIndex(45156);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.C37712d.C37716d.C377171 */

                /* renamed from: a */
                public int f89113a;

                /* renamed from: b */
                final /* synthetic */ C37716d f89114b;

                static {
                    Covode.recordClassIndex(45157);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f89113a < this.f89114b.f89112a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f89114b.f89112a;
                    int i = this.f89113a;
                    this.f89113a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f89114b = r1;
                }
            };
        }

        public C37716d(ViewGroup viewGroup) {
            this.f89112a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$j */
    public static final class C37729j implements AbstractC37709a {

        /* renamed from: a */
        final /* synthetic */ C37712d f89126a;

        static {
            Covode.recordClassIndex(45169);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.AbstractC37709a
        /* renamed from: a */
        public final void mo65725a() {
            this.f89126a.f89100k = null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37729j(C37712d dVar) {
            this.f89126a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.AbstractC37709a
        /* renamed from: a */
        public final void mo65726a(boolean z) {
            ViewGroup a;
            boolean z2;
            View view = this.f89126a.f89096g;
            if (view != null && (a = this.f89126a.mo65728a()) != null) {
                if (z || (this.f89126a.f89099j == 3 && view.getScrollY() != 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a.requestDisallowInterceptTouchEvent(z2);
            }
        }
    }

    /* renamed from: b */
    public final void mo65729b() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f89098i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo43978c(3);
        }
    }

    /* renamed from: c */
    public final void mo65730c() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f89098i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo43978c(4);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f89109u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$b */
    static final class C37714b extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ C37712d f89110a;

        static {
            Covode.recordClassIndex(45154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37714b(C37712d dVar) {
            super(0);
            this.f89110a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.f89110a.getView();
            if (view != null) {
                return view.findViewById(R.id.aec);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$c */
    static final class C37715c extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ C37712d f89111a;

        static {
            Covode.recordClassIndex(45155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37715c(C37712d dVar) {
            super(0);
            this.f89111a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.f89111a.getView();
            if (view != null) {
                return view.findViewById(R.id.vc);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$f */
    static final class C37719f extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C37712d f89116a;

        static {
            Covode.recordClassIndex(45159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37719f(C37712d dVar) {
            super(0);
            this.f89116a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            Bundle arguments = this.f89116a.getArguments();
            if (arguments != null) {
                return Float.valueOf(arguments.getFloat("MAX_HEIGHT_RATIO"));
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$k */
    static final class C37730k extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C37712d f89127a;

        static {
            Covode.recordClassIndex(45170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37730k(C37712d dVar) {
            super(0);
            this.f89127a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            Bundle arguments = this.f89127a.getArguments();
            if (arguments != null) {
                return Float.valueOf(arguments.getFloat("PEEK_HEIGHT_RATIO"));
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$l */
    static final class C37731l extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C37712d f89128a;

        static {
            Covode.recordClassIndex(45171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37731l(C37712d dVar) {
            super(0);
            this.f89128a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f89128a.getArguments();
            if (arguments != null) {
                return arguments.getString("SCHEMA");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$m */
    static final class C37732m extends AbstractC89220m implements AbstractC89171a<C37703a> {

        /* renamed from: a */
        final /* synthetic */ C37712d f89129a;

        static {
            Covode.recordClassIndex(45172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37732m(C37712d dVar) {
            super(0);
            this.f89129a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C37703a invoke() {
            Serializable serializable;
            Bundle arguments = this.f89129a.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("PDP_AD_INFO");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C37703a)) {
                return null;
            }
            return serializable;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$n */
    static final class C37733n extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C37712d f89130a;

        static {
            Covode.recordClassIndex(45173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37733n(C37712d dVar) {
            super(0);
            this.f89130a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View view = this.f89130a.getView();
            if (view != null) {
                return view.findViewById(R.id.emn);
            }
            return null;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStart() {
        Bundle bundle;
        String logExtra;
        Long creativeId;
        super.onStart();
        String e = m76334e();
        if (e != null && this.f89095f == null) {
            this.f89108t = e;
            C89219l.m154716b(e, "");
            C37703a d = m76333d();
            String str = null;
            if (d == null || !d.isAd()) {
                bundle = null;
            } else {
                e = Uri.parse(m76334e()).buildUpon().appendQueryParameter("is_ad", "1").build().toString();
                C89219l.m154716b(e, "");
                str = AdLandPagePreloadServiceImpl.m68380f().mo59388e();
                bundle = new Bundle();
                C37703a d2 = m76333d();
                if (!(d2 == null || (creativeId = d2.getCreativeId()) == null)) {
                    bundle.putLong("ad_id", creativeId.longValue());
                }
                C37703a d3 = m76333d();
                if (!(d3 == null || (logExtra = d3.getLogExtra()) == null)) {
                    bundle.putString("bundle_download_app_log_extra", logExtra);
                }
            }
            C17031d dVar = this.f89106r;
            if (dVar == null) {
                C89219l.m154710a("bulletContainerFragment");
            }
            dVar.mo26838a(C35301c.m72247a(e, str), bundle, this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$h */
    static final class DialogInterface$OnShowListenerC37721h implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C37712d f89118a;

        static {
            Covode.recordClassIndex(45161);
        }

        DialogInterface$OnShowListenerC37721h(C37712d dVar) {
            this.f89118a = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$h$a */
        public static final class C37723a extends BottomSheetBehavior.AbstractC26607a {

            /* renamed from: a */
            final /* synthetic */ DialogInterface$OnShowListenerC37721h f89120a;

            static {
                Covode.recordClassIndex(45163);
            }

            C37723a(DialogInterface$OnShowListenerC37721h hVar) {
                this.f89120a = hVar;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
            /* renamed from: a */
            public final void mo37774a(View view, float f) {
                C89219l.m154721d(view, "");
                if (this.f89120a.f89118a.f89097h < 0.5f && f >= 0.5f) {
                    ViewGroup a = this.f89120a.f89118a.mo65728a();
                    if (a != null) {
                        a.post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.C37712d.DialogInterface$OnShowListenerC37721h.C37723a.RunnableC377241 */

                            /* renamed from: a */
                            final /* synthetic */ C37723a f89121a;

                            static {
                                Covode.recordClassIndex(45164);
                            }

                            {
                                this.f89121a = r1;
                            }

                            public final void run() {
                                this.f89121a.f89120a.f89118a.mo65729b();
                            }
                        });
                    }
                    this.f89120a.f89118a.f89100k = 3;
                }
                if (this.f89120a.f89118a.f89097h >= 0.5f && f < 0.5f) {
                    ViewGroup a2 = this.f89120a.f89118a.mo65728a();
                    if (a2 != null) {
                        a2.post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.C37712d.DialogInterface$OnShowListenerC37721h.C37723a.RunnableC377252 */

                            /* renamed from: a */
                            final /* synthetic */ C37723a f89122a;

                            static {
                                Covode.recordClassIndex(45165);
                            }

                            {
                                this.f89122a = r1;
                            }

                            public final void run() {
                                this.f89122a.f89120a.f89118a.mo65730c();
                            }
                        });
                    }
                    this.f89120a.f89118a.f89100k = 4;
                }
                this.f89120a.f89118a.f89097h = f;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
            /* renamed from: a */
            public final void mo37775a(View view, int i) {
                View view2;
                boolean z;
                ViewGroup a;
                Integer num;
                ViewGroup a2;
                C89219l.m154721d(view, "");
                if (i == 5) {
                    Dialog dialog = this.f89120a.f89118a.getDialog();
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    AbstractC89171a<C89391z> aVar = this.f89120a.f89118a.f89092c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
                if (i == 1 && (num = this.f89120a.f89118a.f89100k) != null && num.intValue() == 3 && (a2 = this.f89120a.f89118a.mo65728a()) != null) {
                    a2.post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.C37712d.DialogInterface$OnShowListenerC37721h.C37723a.RunnableC377263 */

                        /* renamed from: a */
                        final /* synthetic */ C37723a f89123a;

                        static {
                            Covode.recordClassIndex(45166);
                        }

                        {
                            this.f89123a = r1;
                        }

                        public final void run() {
                            this.f89123a.f89120a.f89118a.mo65729b();
                        }
                    });
                }
                if (i == 1) {
                    Integer num2 = this.f89120a.f89118a.f89100k;
                    if (!(num2 == null || num2.intValue() != 4 || (a = this.f89120a.f89118a.mo65728a()) == null)) {
                        a.post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.C37712d.DialogInterface$OnShowListenerC37721h.C37723a.RunnableC377274 */

                            /* renamed from: a */
                            final /* synthetic */ C37723a f89124a;

                            static {
                                Covode.recordClassIndex(45167);
                            }

                            {
                                this.f89124a = r1;
                            }

                            public final void run() {
                                this.f89124a.f89120a.f89118a.mo65730c();
                            }
                        });
                    }
                } else if (i == 5 || i == 4 || i == 3) {
                    this.f89120a.f89118a.f89099j = i;
                    PdpLogHelper pdpLogHelper = this.f89120a.f89118a.f89090a;
                    if (pdpLogHelper == null) {
                        C89219l.m154710a("pdpLogHelper");
                    }
                    pdpLogHelper.f89070a.onNext(Integer.valueOf(i));
                }
                ViewGroup viewGroup = (ViewGroup) this.f89120a.f89118a.f89094e.getValue();
                if (viewGroup != null) {
                    if (i != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    viewGroup.setEnabled(z);
                }
                if (i == 3 && (this.f89120a.f89118a.f89095f instanceof AbstractC16494c) && (view2 = this.f89120a.f89118a.f89096g) != null) {
                    view2.scrollBy(0, 1);
                }
            }
        }

        public final void onShow(DialogInterface dialogInterface) {
            float f;
            Window window;
            Dialog dialog = this.f89118a.getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                C80420fc.m139414a(window);
            }
            AbstractC89171a<C89391z> aVar = this.f89118a.f89092c;
            if (aVar != null) {
                aVar.invoke();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ViewGroup a = this.f89118a.mo65728a();
                if (a != null) {
                    a.setOutlineProvider(new ViewOutlineProvider(this) {
                        /* class com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.C37712d.DialogInterface$OnShowListenerC37721h.C377221 */

                        /* renamed from: a */
                        final /* synthetic */ DialogInterface$OnShowListenerC37721h f89119a;

                        static {
                            Covode.recordClassIndex(45162);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f89119a = r1;
                        }

                        public final void getOutline(View view, Outline outline) {
                            if (view != null) {
                                float b = C13628n.m24520b(this.f89119a.f89118a.getContext(), 8.0f);
                                if (outline != null) {
                                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) b), b);
                                }
                            }
                        }
                    });
                }
                ViewGroup a2 = this.f89118a.mo65728a();
                if (a2 != null) {
                    a2.setClipToOutline(true);
                }
            }
            ViewGroup a3 = this.f89118a.mo65728a();
            if (a3 != null) {
                this.f89118a.f89098i = BottomSheetBehavior.m52754a(a3);
                BottomSheetBehavior<View> bottomSheetBehavior = this.f89118a.f89098i;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.f62894h = true;
                }
                BottomSheetBehavior<View> bottomSheetBehavior2 = this.f89118a.f89098i;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.f62895i = false;
                }
                BottomSheetBehavior<View> bottomSheetBehavior3 = this.f89118a.f89098i;
                if (bottomSheetBehavior3 != null) {
                    float b = (float) C13628n.m24521b(this.f89118a.getContext());
                    Float f2 = (Float) this.f89118a.f89091b.getValue();
                    if (f2 != null) {
                        f = f2.floatValue();
                    } else {
                        f = 0.73f;
                    }
                    bottomSheetBehavior3.mo43976b((int) (b * f));
                }
                BottomSheetBehavior<View> bottomSheetBehavior4 = this.f89118a.f89098i;
                if (bottomSheetBehavior4 != null) {
                    bottomSheetBehavior4.f62901o = new C37723a(this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$e */
    public static final class View$OnTouchListenerC37718e implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C37712d f89115a;

        static {
            Covode.recordClassIndex(45158);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnTouchListenerC37718e(C37712d dVar) {
            this.f89115a = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f89115a.f89099j == 4) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$g */
    static final class View$OnClickListenerC37720g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37712d f89117a;

        static {
            Covode.recordClassIndex(45160);
        }

        View$OnClickListenerC37720g(C37712d dVar) {
            this.f89117a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f89117a.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        return new DialogC37711c(getActivity(), new C37729j(this), (byte) 0);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        C89219l.m154721d(dialogInterface, "");
        super.onDismiss(dialogInterface);
        AbstractC89171a<C89391z> aVar = this.f89093d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
        this.f89107s = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1196i lifecycle = getLifecycle();
        PdpLogHelper pdpLogHelper = this.f89090a;
        if (pdpLogHelper == null) {
            C89219l.m154710a("pdpLogHelper");
        }
        lifecycle.mo4012a(pdpLogHelper);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = (View) this.f89105q.getValue();
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC37720g(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface$OnShowListenerC37721h(this));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(DialogInterface$OnKeyListenerC37728i.f89125a);
        }
    }

    /* renamed from: a */
    private final View m76332a(ViewGroup viewGroup) {
        AbstractC16208i iVar;
        loop0:
        while (viewGroup != null && (iVar = this.f89095f) != null) {
            if (!(iVar instanceof AbstractC16494c)) {
                for (View view : new C37716d(viewGroup)) {
                    if (view instanceof ScrollView) {
                        view.setOnTouchListener(new View$OnTouchListenerC37718e(this));
                        return view;
                    } else if (view instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view;
                    }
                }
                break loop0;
            }
            Objects.requireNonNull(iVar, "null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.IWebKitContainerApi");
            return ((AbstractC16494c) iVar).mo26210n();
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
        if (this.f89090a == null) {
            C89219l.m154710a("pdpLogHelper");
        }
        PdpLogHelper.m76324a(-1, this.f89107s, this.f89108t);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C17031d dVar = new C17031d();
        C17031d.C17032a a = new C17031d.C17032a(dVar).mo26910a(BulletService.m71938f().mo61850a());
        ActivityC0945e requireActivity = requireActivity();
        Objects.requireNonNull(requireActivity, "null cannot be cast to non-null type android.app.Activity");
        C17031d.C17032a a2 = a.mo26911a(new BulletActivityWrapper(requireActivity));
        C37703a d = m76333d();
        if (d != null && d.isAd()) {
            a2.mo26912a(AdLandPagePreloadServiceImpl.m68380f().mo59388e());
        }
        a2.mo26913a();
        this.f89106r = dVar;
        AbstractC0976n a3 = getChildFragmentManager().mo3552a();
        C17031d dVar2 = this.f89106r;
        if (dVar2 == null) {
            C89219l.m154710a("bulletContainerFragment");
        }
        a3.mo3469b(R.id.zn, dVar2).mo3473c();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$i */
    static final class DialogInterface$OnKeyListenerC37728i implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        public static final DialogInterface$OnKeyListenerC37728i f89125a = new DialogInterface$OnKeyListenerC37728i();

        static {
            Covode.recordClassIndex(45168);
        }

        DialogInterface$OnKeyListenerC37728i() {
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                C89219l.m154716b(keyEvent, "");
                keyEvent.getAction();
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0o, viewGroup, false);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        C17031d dVar = this.f89106r;
        if (dVar == null) {
            C89219l.m154710a("bulletContainerFragment");
        }
        View view2 = dVar.getView();
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f89096g = m76332a((ViewGroup) view2);
        PdpLogHelper pdpLogHelper = this.f89090a;
        if (pdpLogHelper == null) {
            C89219l.m154710a("pdpLogHelper");
        }
        int i = this.f89099j;
        C89219l.m154721d(iVar, "");
        AbstractC88979t<Integer> c = pdpLogHelper.f89070a.mo143283c();
        Integer valueOf = Integer.valueOf(i);
        C88466b.m153697a((Object) valueOf, "item is null");
        int i2 = 0;
        AbstractC88412b a = AbstractC88979t.m154305a(AbstractC88979t.m154310b(valueOf), c).mo143266a(C88446a.f200695a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new PdpLogHelper.C37705b(pdpLogHelper, iVar), PdpLogHelper.C37707c.f89078a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, pdpLogHelper.f89071b);
        if (this.f89090a == null) {
            C89219l.m154710a("pdpLogHelper");
        }
        if (iVar.mo25769b() == EnumC16723b.LYNX) {
            i2 = 1;
        }
        PdpLogHelper.m76324a(i2, this.f89107s, this.f89108t);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
        C17031d dVar = this.f89106r;
        if (dVar == null) {
            C89219l.m154710a("bulletContainerFragment");
        }
        AbstractC17019c b = dVar.mo26909b();
        if (b != null) {
            b.mo25854a(iVar, uri, qVar);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        this.f89095f = iVar;
    }
}
