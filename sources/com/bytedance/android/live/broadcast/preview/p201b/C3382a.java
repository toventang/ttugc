package com.bytedance.android.live.broadcast.preview.p201b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.adminsetting.AbstractC2915b;
import com.bytedance.android.live.broadcast.C3242h;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordView;
import com.bytedance.android.live.broadcast.api.blockword.C3042b;
import com.bytedance.android.live.broadcast.p182a.AbstractC3006a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p254k.AbstractC4372a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.b.a */
public final class C3382a extends AbstractC3006a {

    /* renamed from: a */
    private final AbstractC89244h f9605a = C11831d.m20835a(C3390e.f9619a);

    /* renamed from: b */
    private final AbstractC89244h f9606b = C11831d.m20835a(C3386c.f9615a);

    /* renamed from: c */
    private final AbstractC89244h f9607c = C11831d.m20835a(C3383a.f9611a);

    /* renamed from: d */
    private final AbstractC89244h f9608d = C11831d.m20835a(new C3387d(this));

    /* renamed from: e */
    private final View$OnLayoutChangeListenerC3384b f9609e = new View$OnLayoutChangeListenerC3384b(this);

    /* renamed from: f */
    private HashMap f9610f;

    static {
        Covode.recordClassIndex(3866);
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3006a, com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f9610f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3006a, com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f9610f == null) {
            this.f9610f = new HashMap();
        }
        View view = (View) this.f9610f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f9610f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final C3395c mo8704c() {
        return (C3395c) this.f9605a.getValue();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.live.broadcast.p182a.AbstractC3006a, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$e */
    static final class C3390e extends AbstractC89220m implements AbstractC89171a<C3395c> {

        /* renamed from: a */
        public static final C3390e f9619a = new C3390e();

        static {
            Covode.recordClassIndex(3874);
        }

        C3390e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C3395c invoke() {
            return new C3395c();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$b */
    public static final class View$OnLayoutChangeListenerC3384b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3382a f9612a;

        /* renamed from: b */
        private final AbstractC89244h f9613b = C89250i.m154773a((AbstractC89171a) C3385a.f9614a);

        static {
            Covode.recordClassIndex(3868);
        }

        /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$b$a */
        static final class C3385a extends AbstractC89220m implements AbstractC89171a<Float> {

            /* renamed from: a */
            public static final C3385a f9614a = new C3385a();

            static {
                Covode.recordClassIndex(3869);
            }

            C3385a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(((float) C3966y.m9662b()) * 0.75f);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnLayoutChangeListenerC3384b(C3382a aVar) {
            this.f9612a = aVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z;
            int i9;
            int i10;
            int i11;
            int i12;
            C89219l.m154721d(view, "");
            if (this.f9612a.f27009o) {
                int i13 = 0;
                if (((float) i4) < ((Number) this.f9613b.getValue()).floatValue()) {
                    z = true;
                } else {
                    z = false;
                }
                C3395c c = this.f9612a.mo8704c();
                if (c.isViewValid()) {
                    ((BlockWordView) c.mo8167a(R.id.tb)).mo8255a(z);
                    LinearLayout linearLayout = (LinearLayout) c.mo8167a(R.id.a9g);
                    C89219l.m154716b(linearLayout, "");
                    int i14 = 8;
                    if (z) {
                        i9 = 8;
                    } else {
                        i9 = 0;
                    }
                    linearLayout.setVisibility(i9);
                    ConstraintLayout constraintLayout = (ConstraintLayout) c.mo8167a(R.id.ded);
                    C89219l.m154716b(constraintLayout, "");
                    if (z || c.f9624b == 0) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    constraintLayout.setVisibility(i10);
                    LinearLayout linearLayout2 = (LinearLayout) c.mo8167a(R.id.cl5);
                    C89219l.m154716b(linearLayout2, "");
                    if (z) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    linearLayout2.setVisibility(i11);
                    LinearLayout linearLayout3 = (LinearLayout) c.mo8167a(R.id.b_y);
                    C89219l.m154716b(linearLayout3, "");
                    if (z || !c.f9625c) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    linearLayout3.setVisibility(i12);
                    LiveTextView liveTextView = (LiveTextView) c.mo8167a(R.id.f5z);
                    C89219l.m154716b(liveTextView, "");
                    if (!z) {
                        i14 = 0;
                    }
                    liveTextView.setVisibility(i14);
                    BlockWordView blockWordView = (BlockWordView) c.mo8167a(R.id.tb);
                    C89219l.m154716b(blockWordView, "");
                    ViewGroup.LayoutParams layoutParams = blockWordView.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (z) {
                        i13 = C3966y.m9653a(30.0f);
                    }
                    layoutParams2.topMargin = i13;
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$a */
    static final class C3383a extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C3383a f9611a = new C3383a();

        static {
            Covode.recordClassIndex(3867);
        }

        C3383a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return ((AbstractC4372a) C6193a.m13435a(AbstractC4372a.class)).getAddModeratorFragment();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$c */
    static final class C3386c extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C3386c f9615a = new C3386c();

        static {
            Covode.recordClassIndex(3870);
        }

        C3386c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return ((AbstractC4372a) C6193a.m13435a(AbstractC4372a.class)).getModeratorListFragment();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$d */
    static final class C3387d extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ C3382a f9616a;

        static {
            Covode.recordClassIndex(3871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3387d(C3382a aVar) {
            super(0);
            this.f9616a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return ((AbstractC2915b) C6193a.m13435a(AbstractC2915b.class)).getMuteDurationSettingFragment(new View.OnClickListener(this) {
                /* class com.bytedance.android.live.broadcast.preview.p201b.C3382a.C3387d.View$OnClickListenerC33881 */

                /* renamed from: a */
                final /* synthetic */ C3387d f9617a;

                static {
                    Covode.recordClassIndex(3872);
                }

                {
                    this.f9617a = r1;
                }

                public final void onClick(View view) {
                    DataChannel dataChannel = this.f9617a.f9616a.f27010p;
                    if (dataChannel != null) {
                        dataChannel.mo28315b(C9136r.class, C9137s.m17356a(EnumC9135q.GUIDE));
                    }
                }
            }, C33892.f9618a);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5_);
        bVar.f27015b = R.style.a2c;
        bVar.mo18055a(new ColorDrawable(0));
        bVar.f27020g = 80;
        bVar.f27022i = -1;
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C6805b<Boolean> bVar = AbstractC6804a.f17002by;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            C6805b<Boolean> bVar2 = AbstractC6804a.f17002by;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) false);
            Context a2 = C4054a.m9853a(getContext());
            C89219l.m154716b(a2, "");
            C11279p.m19997a(new DialogC3408d(a2));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$f */
    static final class View$OnClickListenerC3391f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3382a f9620a;

        static {
            Covode.recordClassIndex(3875);
        }

        View$OnClickListenerC3391f(C3382a aVar) {
            this.f9620a = aVar;
        }

        public final void onClick(View view) {
            this.f9620a.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3042b.f8881a = true;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$h */
    static final class C3393h extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3382a f9621a;

        static {
            Covode.recordClassIndex(3877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3393h(C3382a aVar) {
            super(1);
            this.f9621a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f9621a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$g */
    static final /* synthetic */ class C3392g extends C89217j implements AbstractC89172b<EnumC9135q, C89391z> {
        static {
            Covode.recordClassIndex(3876);
        }

        C3392g(C3382a aVar) {
            super(1, aVar, C3382a.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC9135q qVar) {
            EnumC9135q qVar2 = qVar;
            C89219l.m154721d(qVar2, "");
            ((C3382a) this.receiver).mo8703a(qVar2);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C3042b.f8881a = false;
        if (this.f27009o) {
            C3395c c = mo8704c();
            if (c.isViewValid()) {
                ((BlockWordView) c.mo8167a(R.id.tb)).mo8250a();
            }
        }
    }

    /* renamed from: a */
    public final void mo8703a(EnumC9135q qVar) {
        Fragment fragment;
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        if (qVar.getGoNextPage()) {
            a.mo3451a(R.anim.er, R.anim.en);
        } else {
            a.mo3451a(R.anim.em, R.anim.es);
        }
        int i = C3394b.f9622a[qVar.ordinal()];
        if (i == 1) {
            fragment = mo8704c();
        } else if (i == 2) {
            fragment = (Fragment) this.f9606b.getValue();
        } else if (i == 3) {
            fragment = (Fragment) this.f9607c.getValue();
        } else if (i == 4) {
            fragment = (Fragment) this.f9608d.getValue();
        } else {
            return;
        }
        if (fragment != null) {
            a.mo3469b(R.id.b82, fragment).mo3467b();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        View decorView;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.addOnLayoutChangeListener(this.f9609e);
        }
        mo8166a_(R.id.cy6).setOnClickListener(new View$OnClickListenerC3391f(this));
        getChildFragmentManager().mo3552a().mo3453a(R.id.b82, mo8704c()).mo3467b();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C9136r.class, (AbstractC89172b) new C3392g(this)).mo28309a((AbstractC1204m) this, C3242h.class, (AbstractC89172b) new C3393h(this));
        }
    }
}
