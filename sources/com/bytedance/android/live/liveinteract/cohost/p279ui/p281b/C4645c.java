package com.bytedance.android.live.liveinteract.cohost.p279ui.p281b;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4588x;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5685d;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89247c;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c */
public final class C4645c extends AbstractC11293v implements C4469d.AbstractC4473d, C4469d.AbstractC4474e, C4480f.AbstractC4483c {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f12309a = {new C89225r(C4645c.class, "mDialogParams", "getMDialogParams()Lcom/bytedance/android/live/liveinteract/cohost/business/contract/LinkDialogContract$LinkDialogParams;", 0)};

    /* renamed from: c */
    public static final C4647b f12310c = new C4647b((byte) 0);

    /* renamed from: b */
    public View f12311b;

    /* renamed from: d */
    private final C11221ak.EnumC11222a f12312d = C11221ak.EnumC11222a.PANEL_LINK;

    /* renamed from: e */
    private final AbstractC89244h f12313e = C89250i.m154773a((AbstractC89171a) new C4648c(this));

    /* renamed from: f */
    private final AbstractC89249e f12314f;

    /* renamed from: g */
    private C4588x.EnumC4589a f12315g;

    /* renamed from: h */
    private C4469d.AbstractC4472c f12316h;

    /* renamed from: i */
    private final AbstractC1204m f12317i;

    /* renamed from: j */
    private HashMap f12318j;

    static {
        Covode.recordClassIndex(5222);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f12318j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f12318j == null) {
            this.f12318j = new HashMap();
        }
        View view = (View) this.f12318j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f12318j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final void mo10395b(C4480f.C4481a aVar) {
        this.f12314f.mo143655a(f12309a[0], aVar);
    }

    /* renamed from: g */
    public final C4480f.AbstractC4482b mo10396g() {
        return (C4480f.AbstractC4482b) this.f12313e.getValue();
    }

    /* renamed from: h */
    public final C4480f.C4481a mo10397h() {
        return (C4480f.C4481a) this.f12314f.mo23374a(this, f12309a[0]);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$b */
    public static final class C4647b {
        static {
            Covode.recordClassIndex(5224);
        }

        private C4647b() {
        }

        public /* synthetic */ C4647b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return this.f12312d;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4474e
    /* renamed from: e */
    public final AbstractC1204m mo10260e() {
        return this.f12317i;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f.AbstractC4483c
    /* renamed from: f */
    public final DataChannel mo10268f() {
        return this.f27010p;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$c */
    static final class C4648c extends AbstractC89220m implements AbstractC89171a<C4588x> {

        /* renamed from: a */
        final /* synthetic */ C4645c f12321a;

        static {
            Covode.recordClassIndex(5225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4648c(C4645c cVar) {
            super(0);
            this.f12321a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C4588x invoke() {
            return new C4588x(this.f12321a);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4473d
    /* renamed from: d */
    public final C4588x.EnumC4589a mo9929d() {
        C4588x.EnumC4589a aVar = this.f12315g;
        if (aVar == null) {
            C89219l.m154710a("mInitFragmentType");
        }
        return aVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4473d, com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4474e
    public final void dismiss() {
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28319c(C5685d.class);
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        mo10396g().mo10267c();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b8d);
        bVar.f27015b = R.style.a35;
        bVar.f27022i = -1;
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$d */
    static final class C4649d implements AbstractC0952i.AbstractC0955c {

        /* renamed from: a */
        final /* synthetic */ C4645c f12322a;

        static {
            Covode.recordClassIndex(5226);
        }

        C4649d(C4645c cVar) {
            this.f12322a = cVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0955c
        /* renamed from: a */
        public final void mo3582a() {
            C4469d.AbstractC4471b<?> b = this.f12322a.mo10396g().mo10266b();
            if (b != null && b.isViewValid() && this.f12322a.getDialog() != null) {
                C4645c cVar = this.f12322a;
                C4480f.C4481a d = b.mo10252d();
                C89219l.m154716b(d, "");
                cVar.mo10395b(d);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$h */
    static final class C4654h extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C4645c f12328a;

        static {
            Covode.recordClassIndex(5231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4654h(C4645c cVar) {
            super(0);
            this.f12328a = cVar;
        }

        /* renamed from: a */
        public final View invoke() {
            LiveAutoRtlImageView liveAutoRtlImageView = new LiveAutoRtlImageView(this.f12328a.getContext());
            liveAutoRtlImageView.setLayoutParams(new ViewGroup.LayoutParams(C3966y.m9653a(10.0f), C3966y.m9653a(18.0f)));
            liveAutoRtlImageView.setImageDrawable(C3966y.m9665c(2131234709));
            liveAutoRtlImageView.setOnClickListener(new View$OnClickListenerC4655a(this));
            return liveAutoRtlImageView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$h$a */
        public static final class View$OnClickListenerC4655a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C4654h f12329a;

            static {
                Covode.recordClassIndex(5232);
            }

            View$OnClickListenerC4655a(C4654h hVar) {
                this.f12329a = hVar;
            }

            public final void onClick(View view) {
                if (this.f12329a.f12328a.mo10396g().mo10264a()) {
                    this.f12329a.f12328a.getChildFragmentManager().mo3562c();
                }
            }
        }
    }

    /* renamed from: j */
    private final void m10766j() {
        m10767k();
        C4469d.AbstractC4471b<?> b = mo10396g().mo10266b();
        if (b != null) {
            AbstractC0976n a = getChildFragmentManager().mo3552a();
            a.mo3452a(R.anim.ed, R.anim.ee, R.anim.ed, R.anim.ee);
            a.mo3457a((String) null);
            a.mo3453a(R.id.b82, b);
            a.mo3467b();
        }
    }

    /* renamed from: k */
    private final void m10767k() {
        Context context;
        View currentFocus;
        if (this.f27009o && (context = getContext()) != null) {
            C89219l.m154716b(context, "");
            Dialog dialog = getDialog();
            if (dialog != null && (currentFocus = dialog.getCurrentFocus()) != null) {
                C89219l.m154716b(currentFocus, "");
                Object a = m10765a(context, "input_method");
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) a;
                if (inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: i */
    public final boolean mo10398i() {
        if (mo10397h().f12064c) {
            if (mo10396g().mo10264a()) {
                getChildFragmentManager().mo3562c();
            }
            return true;
        } else if (!mo10397h().f12067f) {
            return true;
        } else {
            AbstractC89171a<C89391z> aVar = mo10397h().f12068g;
            if (aVar == null) {
                return false;
            }
            aVar.invoke();
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$g */
    static final class C4653g extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4645c f12327a;

        static {
            Covode.recordClassIndex(5230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4653g(C4645c cVar) {
            super(1);
            this.f12327a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            mo10403a(view);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10403a(View view) {
            ViewGroup viewGroup;
            MethodCollector.m26663i(5565);
            View view2 = this.f12327a.f12311b;
            if (view2 == null || (viewGroup = (ViewGroup) view2.findViewById(R.id.c4m)) == null) {
                MethodCollector.m26664o(5565);
                return;
            }
            viewGroup.removeAllViews();
            if (view != null) {
                viewGroup.addView(view);
            }
            MethodCollector.m26664o(5565);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$i */
    static final class C4656i extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4645c f12330a;

        static {
            Covode.recordClassIndex(5233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4656i(C4645c cVar) {
            super(1);
            this.f12330a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            mo10406a(view);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10406a(View view) {
            ViewGroup viewGroup;
            MethodCollector.m26663i(6474);
            View view2 = this.f12330a.f12311b;
            if (view2 == null || (viewGroup = (ViewGroup) view2.findViewById(R.id.c5y)) == null) {
                MethodCollector.m26664o(6474);
                return;
            }
            viewGroup.removeAllViews();
            if (view != null) {
                viewGroup.addView(view);
            }
            MethodCollector.m26664o(6474);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$j */
    static final class C4657j extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4645c f12331a;

        static {
            Covode.recordClassIndex(5234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4657j(C4645c cVar) {
            super(1);
            this.f12331a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            mo10407a(str);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10407a(String str) {
            LiveTextView liveTextView;
            C89219l.m154721d(str, "");
            View view = this.f12331a.f12311b;
            if (view != null && (liveTextView = (LiveTextView) view.findViewById(R.id.f63)) != null) {
                liveTextView.setText(str);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$e */
    static final class View$OnClickListenerC4650e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4645c f12323a;

        static {
            Covode.recordClassIndex(5227);
        }

        View$OnClickListenerC4650e(C4645c cVar) {
            this.f12323a = cVar;
        }

        public final void onClick(View view) {
            if (this.f12323a.mo10397h().f12067f) {
                this.f12323a.dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4474e
    /* renamed from: a */
    public final void mo10257a(C4480f.C4481a aVar) {
        if (aVar != null) {
            mo10395b(aVar);
        } else {
            try {
                throw new IllegalArgumentException("Required value was null.".toString());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$f */
    static final class C4651f extends AbstractC89220m implements AbstractC89183m<Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4645c f12324a;

        static {
            Covode.recordClassIndex(5228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4651f(C4645c cVar) {
            super(2);
            this.f12324a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$f$a */
        public static final class C4652a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ ViewGroup.LayoutParams f12325a;

            /* renamed from: b */
            final /* synthetic */ ViewGroup f12326b;

            static {
                Covode.recordClassIndex(5229);
            }

            C4652a(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
                this.f12325a = layoutParams;
                this.f12326b = viewGroup;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                ViewGroup.LayoutParams layoutParams = this.f12325a;
                if (layoutParams != null) {
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (!(animatedValue instanceof Integer)) {
                        animatedValue = null;
                    }
                    Integer num = (Integer) animatedValue;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    layoutParams.height = i;
                }
                ViewGroup viewGroup = this.f12326b;
                if (viewGroup != null) {
                    viewGroup.setLayoutParams(this.f12325a);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Integer num2) {
            mo10401a(num.intValue(), num2.intValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10401a(int i, int i2) {
            ViewGroup viewGroup;
            if (i2 > 0) {
                View view = this.f12324a.f12311b;
                ViewGroup.LayoutParams layoutParams = null;
                if (view != null) {
                    viewGroup = (ViewGroup) view.findViewById(R.id.b82);
                    if (viewGroup != null) {
                        layoutParams = viewGroup.getLayoutParams();
                    }
                } else {
                    viewGroup = null;
                }
                if (i != 0) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(C3966y.m9653a((float) i), C3966y.m9653a((float) i2));
                    ofInt.addUpdateListener(new C4652a(layoutParams, viewGroup));
                    ofInt.setDuration(300L);
                    ofInt.start();
                    return;
                }
                if (layoutParams != null) {
                    layoutParams.height = C3966y.m9653a((float) i2);
                }
                if (viewGroup != null) {
                    viewGroup.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("error!!! Please manually set the height of the fragment inside the linkDialog");
        }
    }

    public C4645c(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f12317i = mVar;
        C4480f.C4481a aVar = new C4480f.C4481a();
        this.f12314f = new C4646a(aVar, aVar, this);
    }

    /* renamed from: b */
    public final C4469d.AbstractC4473d mo10394b(C4588x.EnumC4589a aVar, C4469d.AbstractC4472c cVar) {
        C89219l.m154721d(aVar, "");
        this.f12315g = aVar;
        this.f12316h = cVar;
        return this;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4474e
    /* renamed from: a */
    public final void mo10258a(C4588x.EnumC4589a aVar, C4469d.AbstractC4472c cVar) {
        C89219l.m154721d(aVar, "");
        if (mo10396g().mo10265a(aVar, cVar)) {
            m10766j();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f12311b = view;
        getChildFragmentManager().mo3556a(new C4649d(this));
        view.findViewById(R.id.cy_).setOnClickListener(new View$OnClickListenerC4650e(this));
        C4480f.AbstractC4482b g = mo10396g();
        C4588x.EnumC4589a aVar = this.f12315g;
        if (aVar == null) {
            C89219l.m154710a("mInitFragmentType");
        }
        g.mo10265a(aVar, this.f12316h);
        m10766j();
    }

    /* renamed from: a */
    private static Object m10765a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5810);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(5810);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$a */
    public static final class C4646a extends AbstractC89247c<C4480f.C4481a> {

        /* renamed from: a */
        final /* synthetic */ Object f12319a;

        /* renamed from: b */
        final /* synthetic */ C4645c f12320b;

        static {
            Covode.recordClassIndex(5223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4646a(Object obj, Object obj2, C4645c cVar) {
            super(obj2);
            this.f12319a = obj;
            this.f12320b = cVar;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, C4480f.C4481a aVar, C4480f.C4481a aVar2) {
            C89219l.m154721d(iVar, "");
            C4480f.C4481a aVar3 = aVar2;
            C4480f.C4481a aVar4 = aVar;
            C4645c cVar = this.f12320b;
            if (cVar.f27009o) {
                C4651f fVar = new C4651f(cVar);
                C4653g gVar = new C4653g(cVar);
                C4654h hVar = new C4654h(cVar);
                C4656i iVar2 = new C4656i(cVar);
                C4657j jVar = new C4657j(cVar);
                if (!C89219l.m154714a((Object) aVar4.f12062a, (Object) aVar3.f12062a)) {
                    jVar.mo10407a(aVar3.f12062a);
                }
                if (aVar4.f12063b != aVar3.f12063b) {
                    fVar.mo10401a(aVar4.f12063b, aVar3.f12063b);
                }
                if ((!C89219l.m154714a(aVar4.f12065d, aVar3.f12065d)) || aVar4.f12064c != aVar3.f12064c) {
                    if (aVar3.f12064c) {
                        gVar.mo10403a(hVar.invoke());
                    } else {
                        gVar.mo10403a(aVar3.f12065d);
                    }
                }
                if (!C89219l.m154714a(aVar4.f12066e, aVar3.f12066e)) {
                    iVar2.mo10406a(aVar3.f12066e);
                }
            }
        }
    }
}
