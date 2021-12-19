package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.base.widget.C34745b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity */
public final class ImageChooseUploadActivity extends ActivityC17312a {

    /* renamed from: i */
    public static AbstractC47983c f111091i;

    /* renamed from: j */
    public static final C47967a f111092j = new C47967a((byte) 0);

    /* renamed from: a */
    public DialogC81438i f111093a;

    /* renamed from: b */
    public RecyclerView f111094b;

    /* renamed from: c */
    public TextView f111095c;

    /* renamed from: d */
    public TextView f111096d;

    /* renamed from: e */
    public C47984d f111097e;

    /* renamed from: f */
    public List<C48000f> f111098f;

    /* renamed from: g */
    public final AbstractC89183m<View, String, C89391z> f111099g = new C47973g(this);

    /* renamed from: h */
    public final AbstractC89172b<List<C48000f>, C89391z> f111100h = new C47972f(this);

    /* renamed from: k */
    private boolean f111101k;

    /* renamed from: l */
    private TextView f111102l;

    /* renamed from: m */
    private Boolean f111103m = true;

    /* renamed from: n */
    private int f111104n = 1;

    /* renamed from: o */
    private long f111105o = Long.MAX_VALUE;

    /* renamed from: p */
    private final int f111106p = 4;

    /* renamed from: q */
    private String f111107q = "";

    /* renamed from: r */
    private SparseArray f111108r;

    static {
        Covode.recordClassIndex(56681);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f111108r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f111108r == null) {
            this.f111108r = new SparseArray();
        }
        View view = (View) this.f111108r.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f111108r.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$a */
    public static final class C47967a {
        static {
            Covode.recordClassIndex(56682);
        }

        private C47967a() {
        }

        public /* synthetic */ C47967a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$b */
    static final class CallableC47968b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f111109a;

        static {
            Covode.recordClassIndex(56683);
        }

        CallableC47968b(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f111109a = imageChooseUploadActivity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return AVExternalServiceImpl.m113114a().infoService().getMediaLoaderImages(this.f111109a);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        super.onBackPressed();
        mo79965a("cancel_image_choose");
        AbstractC47983c cVar = f111091i;
        if (cVar != null) {
            cVar.mo61896g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$h */
    static final class CallableC47974h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f111115a;

        static {
            Covode.recordClassIndex(56689);
        }

        CallableC47974h(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f111115a = imageChooseUploadActivity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC47983c cVar = ImageChooseUploadActivity.f111091i;
            if (cVar == null) {
                return null;
            }
            cVar.mo61895a(this.f111115a.f111098f, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p2929fe.method.upload.ImageChooseUploadActivity.CallableC47974h.C479751 */

                /* renamed from: a */
                final /* synthetic */ CallableC47974h f111116a;

                static {
                    Covode.recordClassIndex(56690);
                }

                {
                    this.f111116a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    DialogC81438i iVar = this.f111116a.f111115a.f111093a;
                    if (iVar != null) {
                        iVar.dismiss();
                    }
                    this.f111116a.f111115a.finish();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AbstractC47983c cVar = f111091i;
        if (cVar != null) {
            cVar.mo61897l();
        }
        f111091i = null;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$d */
    static final class View$OnClickListenerC47970d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f111111a;

        static {
            Covode.recordClassIndex(56685);
        }

        View$OnClickListenerC47970d(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f111111a = imageChooseUploadActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC47983c cVar = ImageChooseUploadActivity.f111091i;
            if (cVar != null) {
                cVar.mo61896g();
            }
            this.f111111a.finish();
            this.f111111a.mo79965a("cancel_image_choose");
        }
    }

    /* renamed from: a */
    public final void mo79965a(String str) {
        C39162r.m79460a(str, new C33744d().mo59983a("enter_from", this.f111107q).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$e */
    static final class View$OnClickListenerC47971e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f111112a;

        static {
            Covode.recordClassIndex(56686);
        }

        View$OnClickListenerC47971e(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f111112a = imageChooseUploadActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ImageChooseUploadActivity imageChooseUploadActivity = this.f111112a;
            if (!C34717d.m70908a(imageChooseUploadActivity.f111098f)) {
                C47984d dVar = imageChooseUploadActivity.f111097e;
                if (dVar == null || !dVar.f111135d) {
                    C47984d dVar2 = imageChooseUploadActivity.f111097e;
                    if (dVar2 != null) {
                        dVar2.f111135d = true;
                    }
                    DialogC81438i iVar = imageChooseUploadActivity.f111093a;
                    if (iVar != null) {
                        iVar.dismiss();
                    }
                    imageChooseUploadActivity.f111093a = new DialogC81438i(imageChooseUploadActivity, imageChooseUploadActivity.getString(R.string.h47));
                    DialogC81438i iVar2 = imageChooseUploadActivity.f111093a;
                    if (iVar2 != null) {
                        iVar2.show();
                    }
                    C1731i.m5640b(new CallableC47974h(imageChooseUploadActivity), C1731i.f5562a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$f */
    static final class C47972f extends AbstractC89220m implements AbstractC89172b<List<? extends C48000f>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f111113a;

        static {
            Covode.recordClassIndex(56687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47972f(ImageChooseUploadActivity imageChooseUploadActivity) {
            super(1);
            this.f111113a = imageChooseUploadActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.fe.method.upload.f> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C48000f> list) {
            int i;
            List<? extends C48000f> list2 = list;
            if (C34717d.m70910b(list2)) {
                TextView textView = this.f111113a.f111095c;
                if (textView != null) {
                    ImageChooseUploadActivity imageChooseUploadActivity = this.f111113a;
                    Object[] objArr = new Object[1];
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    objArr[0] = Integer.valueOf(i);
                    textView.setText(imageChooseUploadActivity.getString(R.string.a7k, objArr));
                }
                TextView textView2 = this.f111113a.f111095c;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else {
                TextView textView3 = this.f111113a.f111095c;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            this.f111113a.f111098f = list2;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$c */
    static final class C47969c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f111110a;

        static {
            Covode.recordClassIndex(56684);
        }

        C47969c(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f111110a = imageChooseUploadActivity;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<List<MediaModel>> iVar) {
            RecyclerView.AbstractC1356f fVar;
            C89219l.m154716b(iVar, "");
            if (C34717d.m70908a(iVar.mo5545d())) {
                DialogC81438i iVar2 = this.f111110a.f111093a;
                if (iVar2 != null) {
                    iVar2.dismiss();
                }
                TextView textView = this.f111110a.f111096d;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f111110a.f111096d;
                if (textView2 != null) {
                    textView2.setText(this.f111110a.getResources().getString(R.string.dg0));
                }
            } else {
                TextView textView3 = this.f111110a.f111096d;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                DialogC81438i iVar3 = this.f111110a.f111093a;
                if (iVar3 != null) {
                    iVar3.dismiss();
                }
                C47984d dVar = this.f111110a.f111097e;
                if (dVar != null) {
                    List<MediaModel> d = iVar.mo5545d();
                    C89219l.m154716b(d, "");
                    dVar.mo80009a(d);
                }
                RecyclerView recyclerView = this.f111110a.f111094b;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f111110a.f111097e);
                }
                RecyclerView recyclerView2 = this.f111110a.f111094b;
                if (recyclerView2 != null) {
                    fVar = recyclerView2.getItemAnimator();
                } else {
                    fVar = null;
                }
                if (!(fVar instanceof AbstractC1391ab)) {
                    fVar = null;
                }
                AbstractC1391ab abVar = (AbstractC1391ab) fVar;
                if (abVar != null) {
                    abVar.f4621m = false;
                }
                C47984d dVar2 = this.f111110a.f111097e;
                if (dVar2 != null) {
                    dVar2.f111136e = this.f111110a.f111099g;
                }
                C47984d dVar3 = this.f111110a.f111097e;
                if (dVar3 != null) {
                    dVar3.f111137f = this.f111110a.f111100h;
                }
            }
            return null;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.v0);
        this.f111093a = new DialogC81438i(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dod);
        this.f111094b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager((Context) null, this.f111106p));
        }
        RecyclerView recyclerView2 = this.f111094b;
        if (recyclerView2 != null) {
            recyclerView2.mo4402a(new C34745b(this.f111106p, (int) C13628n.m24520b(this, 1.0f)));
        }
        this.f111096d = (TextView) findViewById(R.id.f06);
        this.f111095c = (TextView) findViewById(R.id.f54);
        TextView textView = (TextView) findViewById(R.id.et6);
        this.f111102l = textView;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC47970d(this));
        }
        TextView textView2 = this.f111095c;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC47971e(this));
        }
        if (getIntent().hasExtra("shouldWithCamera")) {
            this.f111103m = Boolean.valueOf(getIntent().getBooleanExtra("shouldWithCamera", true));
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.f111104n = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent().hasExtra("maxFileSize")) {
            this.f111105o = getIntent().getLongExtra("maxFileSize", Long.MAX_VALUE);
        }
        if (getIntent().hasExtra("needBase64Response")) {
            this.f111101k = getIntent().getBooleanExtra("needBase64Response", false);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from") && !TextUtils.isEmpty(m90959a(getIntent(), "enter_from"))) {
            String a = m90959a(getIntent(), "enter_from");
            if (a == null) {
                C89219l.m154715b();
            }
            this.f111107q = a;
        }
        this.f111097e = new C47984d(this, this.f111106p, this.f111104n, this.f111105o, this.f111101k, this.f111103m);
        DialogC81438i iVar = this.f111093a;
        if (iVar != null) {
            iVar.show();
        }
        C1731i.m5640b(new CallableC47968b(this), C1731i.f5562a).mo5534a(new C47969c(this), C1731i.f5564c, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m90959a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$g */
    static final class C47973g extends AbstractC89220m implements AbstractC89183m<View, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f111114a;

        static {
            Covode.recordClassIndex(56688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47973g(ImageChooseUploadActivity imageChooseUploadActivity) {
            super(2);
            this.f111114a = imageChooseUploadActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, String str) {
            View view2 = view;
            String str2 = str;
            C89219l.m154721d(view2, "");
            if (!TextUtils.isEmpty(str2)) {
                ICrossPlatformLegacyService f = CrossPlatformLegacyServiceImpl.m65225f();
                ImageChooseUploadActivity imageChooseUploadActivity = this.f111114a;
                f.mo57036a(imageChooseUploadActivity, view2, (((float) C13628n.m24504a(imageChooseUploadActivity)) * 1.0f) / ((float) C13628n.m24521b(this.f111114a)), str2);
            }
            return C89391z.f203057a;
        }
    }
}
