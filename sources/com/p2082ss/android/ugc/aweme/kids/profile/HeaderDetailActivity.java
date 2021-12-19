package com.p2082ss.android.ugc.aweme.kids.profile;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.view.C24262c;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity */
public final class HeaderDetailActivity extends ActivityC17312a {

    /* renamed from: b */
    public static final C57741a f131736b = new C57741a((byte) 0);

    /* renamed from: a */
    public AbstractC57153a f131737a;

    /* renamed from: c */
    private float f131738c;

    /* renamed from: d */
    private ZoomAnimationUtils.ZoomInfo f131739d;

    /* renamed from: e */
    private String[] f131740e;

    /* renamed from: f */
    private HashMap f131741f;

    static {
        Covode.recordClassIndex(67723);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131741f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131741f == null) {
            this.f131741f = new HashMap();
        }
        View view = (View) this.f131741f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131741f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity$a */
    public static final class C57741a {
        static {
            Covode.recordClassIndex(67724);
        }

        private C57741a() {
        }

        public /* synthetic */ C57741a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m104467a(Activity activity, View view, AbstractC57153a aVar) {
            UrlModel userAvatar;
            if (!(aVar == null || (userAvatar = aVar.getUserAvatar()) == null || !C34717d.m70910b(userAvatar.getUrlList()))) {
                int size = userAvatar.getUrlList().size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = userAvatar.getUrlList().get(i);
                }
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, size);
                C89219l.m154721d(strArr2, "");
                Bundle bundle = new Bundle();
                if (view == null) {
                    C89219l.m154715b();
                }
                bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.m138997a(view));
                bundle.putStringArray("uri", strArr2);
                bundle.putFloat("wh_ratio", 1.0f);
                if (aVar != null) {
                    bundle.putSerializable("user", aVar);
                }
                C89219l.m154721d(bundle, "");
                if (activity != null) {
                    Intent intent = new Intent(activity, HeaderDetailActivity.class);
                    intent.putExtras(bundle);
                    C84349a.m145093a(intent, activity);
                    activity.startActivity(intent);
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.cc);
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

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity$b */
    static final class View$OnClickListenerC57742b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HeaderDetailActivity f131742a;

        static {
            Covode.recordClassIndex(67725);
        }

        View$OnClickListenerC57742b(HeaderDetailActivity headerDetailActivity) {
            this.f131742a = headerDetailActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131742a.onBackPressed();
        }
    }

    /* renamed from: a */
    private static String m104464a(List<String> list) {
        C24413h e = C24428k.m46551a().mo40247e();
        for (String str : list) {
            if (e.mo40231b(Uri.parse(str))) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C24636b m104463a(String str) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.f57756e = false;
        C24361b bVar = new C24361b(imageDecodeOptionsBuilder);
        C24639c a = C24639c.m47149a(Uri.parse(str));
        a.f58555f = bVar;
        int[] b = m104466b(str);
        if (b != null && b[0] > 0 && b[1] > 0) {
            C89219l.m154716b(a, "");
            a.f58553d = new C24363d(b[0], b[1]);
        }
        C24636b a2 = a.mo40483a();
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: b */
    private static int[] m104466b(String str) {
        int i;
        MethodCollector.m26663i(12544);
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        if (!C80720e.m139927b(parse.getPath())) {
            MethodCollector.m26664o(12544);
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(parse.getPath(), options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i2 > 720 || i3 > 1280) {
            int i4 = i2 >> 1;
            int i5 = i3 >> 1;
            i = 1;
            while (i4 / i > 720 && i5 / i > 1280) {
                i <<= 1;
            }
        } else {
            i = 1;
        }
        int[] iArr = {i2 >> i, i3 >> i};
        MethodCollector.m26664o(12544);
        return iArr;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.adm);
        overridePendingTransition(R.anim.cb, R.anim.cc);
        this.f131739d = (ZoomAnimationUtils.ZoomInfo) getIntent().getParcelableExtra("extra_zoom_info");
        this.f131740e = getIntent().getStringArrayExtra("uri");
        this.f131738c = getIntent().getFloatExtra("wh_ratio", 1.0f);
        Serializable serializableExtra = getIntent().getSerializableExtra("user");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.api.account.model.IKidsUser");
        this.f131737a = (AbstractC57153a) serializableExtra;
        FixedRatioFrameLayout fixedRatioFrameLayout = (FixedRatioFrameLayout) _$_findCachedViewById(R.id.b8j);
        C89219l.m154716b(fixedRatioFrameLayout, "");
        fixedRatioFrameLayout.setWhRatio(this.f131738c);
        C24262c cVar = (C24262c) _$_findCachedViewById(R.id.f_d);
        C89219l.m154716b(cVar, "");
        ((C24246a) cVar.getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57454d);
        m104465a((RemoteImageView) _$_findCachedViewById(R.id.f_d), this.f131740e);
        ((ConstraintLayout) _$_findCachedViewById(R.id.dnk)).setBackgroundColor(-16777216);
        ((ConstraintLayout) _$_findCachedViewById(R.id.dnk)).setOnClickListener(new View$OnClickListenerC57742b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m104465a(RemoteImageView remoteImageView, String[] strArr) {
        String str;
        UrlModel userAvatar;
        if (remoteImageView != null) {
            ArrayList arrayList = new ArrayList();
            if (!C34717d.m70909a(strArr)) {
                if (strArr == null) {
                    C89219l.m154715b();
                }
                for (String str2 : strArr) {
                    if (!C13627m.m24498a(str2)) {
                        arrayList.add(m104463a(str2));
                    }
                }
            }
            AbstractC57153a aVar = this.f131737a;
            REQUEST request = null;
            if (aVar == null || (userAvatar = aVar.getUserAvatar()) == null) {
                str = null;
            } else {
                List<String> urlList = userAvatar.getUrlList();
                C89219l.m154716b(urlList, "");
                str = m104464a(urlList);
            }
            if (!TextUtils.isEmpty(str)) {
                request = (REQUEST) m104463a(str);
            }
            if (C34717d.m70908a(arrayList)) {
                C34577e.m70591a(remoteImageView, 2131232314);
                return;
            }
            C24185e b = C24182c.m45843b();
            Object[] array = arrayList.toArray(new C24636b[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            C24185e eVar = (C24185e) b.mo39823a(array);
            eVar.f57309m = remoteImageView.getController();
            if (request != null) {
                eVar.f57300d = request;
            }
            remoteImageView.setController(eVar.mo39827e());
        }
    }
}
