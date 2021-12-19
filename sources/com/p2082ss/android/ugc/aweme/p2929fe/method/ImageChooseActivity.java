package com.p2082ss.android.ugc.aweme.p2929fe.method;

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
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C47984d;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C48000f;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ImageChooseActivity */
public final class ImageChooseActivity extends ActivityC17312a {

    /* renamed from: i */
    public static AbstractC47983c f110805i;

    /* renamed from: j */
    public static final C47835a f110806j = new C47835a((byte) 0);

    /* renamed from: a */
    public DialogC81438i f110807a;

    /* renamed from: b */
    public RecyclerView f110808b;

    /* renamed from: c */
    public TextView f110809c;

    /* renamed from: d */
    public TextView f110810d;

    /* renamed from: e */
    public C47984d f110811e;

    /* renamed from: f */
    public List<C48000f> f110812f;

    /* renamed from: g */
    public final AbstractC89183m<View, String, C89391z> f110813g = new C47841g(this);

    /* renamed from: h */
    public final AbstractC89172b<List<C48000f>, C89391z> f110814h = new C47840f(this);

    /* renamed from: k */
    private boolean f110815k;

    /* renamed from: l */
    private TextView f110816l;

    /* renamed from: m */
    private Boolean f110817m = true;

    /* renamed from: n */
    private int f110818n = 1;

    /* renamed from: o */
    private long f110819o = Long.MAX_VALUE;

    /* renamed from: p */
    private final int f110820p = 4;

    /* renamed from: q */
    private String f110821q = "";

    /* renamed from: r */
    private SparseArray f110822r;

    static {
        Covode.recordClassIndex(56484);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f110822r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f110822r == null) {
            this.f110822r = new SparseArray();
        }
        View view = (View) this.f110822r.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f110822r.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ImageChooseActivity$a */
    public static final class C47835a {
        static {
            Covode.recordClassIndex(56485);
        }

        private C47835a() {
        }

        public /* synthetic */ C47835a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ImageChooseActivity$b */
    static final class CallableC47836b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ImageChooseActivity f110823a;

        static {
            Covode.recordClassIndex(56486);
        }

        CallableC47836b(ImageChooseActivity imageChooseActivity) {
            this.f110823a = imageChooseActivity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return AVExternalServiceImpl.m113114a().infoService().getMediaLoaderImages(this.f110823a);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        super.onBackPressed();
        mo79901a("cancel_image_choose");
        AbstractC47983c cVar = f110805i;
        if (cVar != null) {
            cVar.mo61896g();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AbstractC47983c cVar = f110805i;
        if (cVar != null) {
            cVar.mo61897l();
        }
        f110805i = null;
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

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ImageChooseActivity$d */
    static final class View$OnClickListenerC47838d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseActivity f110825a;

        static {
            Covode.recordClassIndex(56488);
        }

        View$OnClickListenerC47838d(ImageChooseActivity imageChooseActivity) {
            this.f110825a = imageChooseActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC47983c cVar = ImageChooseActivity.f110805i;
            if (cVar != null) {
                cVar.mo61896g();
            }
            this.f110825a.finish();
            this.f110825a.mo79901a("cancel_image_choose");
        }
    }

    /* renamed from: a */
    public final void mo79901a(String str) {
        C39162r.m79460a(str, new C33744d().mo59983a("enter_from", this.f110821q).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ImageChooseActivity$e */
    static final class View$OnClickListenerC47839e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseActivity f110826a;

        static {
            Covode.recordClassIndex(56489);
        }

        View$OnClickListenerC47839e(ImageChooseActivity imageChooseActivity) {
            this.f110826a = imageChooseActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ImageChooseActivity imageChooseActivity = this.f110826a;
            if (!C34717d.m70908a(imageChooseActivity.f110812f)) {
                C47984d dVar = imageChooseActivity.f110811e;
                if (dVar == null || !dVar.f111135d) {
                    C47984d dVar2 = imageChooseActivity.f110811e;
                    if (dVar2 != null) {
                        dVar2.f111135d = true;
                    }
                    DialogC81438i iVar = imageChooseActivity.f110807a;
                    if (iVar != null) {
                        iVar.dismiss();
                    }
                    Intent intent = new Intent();
                    List<C48000f> list = imageChooseActivity.f110812f;
                    if (list == null) {
                        C89219l.m154715b();
                    }
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f111197a);
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    intent.putExtra("images", (String[]) array);
                    imageChooseActivity.setResult(41312, intent);
                    imageChooseActivity.finish();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ImageChooseActivity$f */
    static final class C47840f extends AbstractC89220m implements AbstractC89172b<List<? extends C48000f>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseActivity f110827a;

        static {
            Covode.recordClassIndex(56490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47840f(ImageChooseActivity imageChooseActivity) {
            super(1);
            this.f110827a = imageChooseActivity;
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
                TextView textView = this.f110827a.f110809c;
                if (textView != null) {
                    ImageChooseActivity imageChooseActivity = this.f110827a;
                    Object[] objArr = new Object[1];
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    objArr[0] = Integer.valueOf(i);
                    textView.setText(imageChooseActivity.getString(R.string.a7k, objArr));
                }
                TextView textView2 = this.f110827a.f110809c;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else {
                TextView textView3 = this.f110827a.f110809c;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            this.f110827a.f110812f = list2;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ImageChooseActivity$c */
    static final class C47837c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ ImageChooseActivity f110824a;

        static {
            Covode.recordClassIndex(56487);
        }

        C47837c(ImageChooseActivity imageChooseActivity) {
            this.f110824a = imageChooseActivity;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<List<MediaModel>> iVar) {
            RecyclerView.AbstractC1356f fVar;
            C89219l.m154716b(iVar, "");
            if (C34717d.m70908a(iVar.mo5545d())) {
                DialogC81438i iVar2 = this.f110824a.f110807a;
                if (iVar2 != null) {
                    iVar2.dismiss();
                }
                TextView textView = this.f110824a.f110810d;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f110824a.f110810d;
                if (textView2 != null) {
                    textView2.setText(this.f110824a.getResources().getString(R.string.dg0));
                }
            } else {
                TextView textView3 = this.f110824a.f110810d;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                DialogC81438i iVar3 = this.f110824a.f110807a;
                if (iVar3 != null) {
                    iVar3.dismiss();
                }
                C47984d dVar = this.f110824a.f110811e;
                if (dVar != null) {
                    List<MediaModel> d = iVar.mo5545d();
                    C89219l.m154716b(d, "");
                    dVar.mo80009a(d);
                }
                RecyclerView recyclerView = this.f110824a.f110808b;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f110824a.f110811e);
                }
                RecyclerView recyclerView2 = this.f110824a.f110808b;
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
                C47984d dVar2 = this.f110824a.f110811e;
                if (dVar2 != null) {
                    dVar2.f111136e = this.f110824a.f110813g;
                }
                C47984d dVar3 = this.f110824a.f110811e;
                if (dVar3 != null) {
                    dVar3.f111137f = this.f110824a.f110814h;
                }
            }
            return null;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.v0);
        this.f110807a = new DialogC81438i(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dod);
        this.f110808b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager((Context) null, this.f110820p));
        }
        RecyclerView recyclerView2 = this.f110808b;
        if (recyclerView2 != null) {
            recyclerView2.mo4402a(new C34745b(this.f110820p, (int) C13628n.m24520b(this, 1.0f)));
        }
        this.f110810d = (TextView) findViewById(R.id.f06);
        this.f110809c = (TextView) findViewById(R.id.f54);
        TextView textView = (TextView) findViewById(R.id.et6);
        this.f110816l = textView;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC47838d(this));
        }
        TextView textView2 = this.f110809c;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC47839e(this));
        }
        if (getIntent().hasExtra("shouldWithCamera")) {
            this.f110817m = Boolean.valueOf(getIntent().getBooleanExtra("shouldWithCamera", true));
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.f110818n = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent().hasExtra("maxFileSize")) {
            this.f110819o = getIntent().getLongExtra("maxFileSize", Long.MAX_VALUE);
        }
        if (getIntent().hasExtra("needBase64Response")) {
            this.f110815k = getIntent().getBooleanExtra("needBase64Response", false);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from")) {
            String a = m90852a(getIntent(), "enter_from");
            if (a == null) {
                a = "";
            }
            this.f110821q = a;
        }
        this.f110811e = new C47984d(this, this.f110820p, this.f110818n, this.f110819o, this.f110815k, this.f110817m);
        DialogC81438i iVar = this.f110807a;
        if (iVar != null) {
            iVar.show();
        }
        C1731i.m5640b(new CallableC47836b(this), C1731i.f5562a).mo5534a(new C47837c(this), C1731i.f5564c, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m90852a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ImageChooseActivity$g */
    static final class C47841g extends AbstractC89220m implements AbstractC89183m<View, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseActivity f110828a;

        static {
            Covode.recordClassIndex(56491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47841g(ImageChooseActivity imageChooseActivity) {
            super(2);
            this.f110828a = imageChooseActivity;
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
                ImageChooseActivity imageChooseActivity = this.f110828a;
                f.mo57036a(imageChooseActivity, view2, (((float) C13628n.m24504a(imageChooseActivity)) * 1.0f) / ((float) C13628n.m24521b(this.f110828a)), str2);
            }
            return C89391z.f203057a;
        }
    }
}
