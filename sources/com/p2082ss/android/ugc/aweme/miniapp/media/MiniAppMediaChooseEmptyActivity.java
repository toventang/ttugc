package com.p2082ss.android.ugc.aweme.miniapp.media;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.C59309a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity */
public class MiniAppMediaChooseEmptyActivity extends ActivityC0945e {

    /* renamed from: a */
    private Fragment f135505a;

    /* renamed from: b */
    private C59285b f135506b;

    /* renamed from: c */
    private int f135507c;

    static {
        Covode.recordClassIndex(69656);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStop() {
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bm);
        this.f135505a = getSupportFragmentManager().mo3549a(R.id.b8a);
        MiniAppMediaChooseEmptyArg miniAppMediaChooseEmptyArg = (MiniAppMediaChooseEmptyArg) RouteArgExtension.INSTANCE.navArg(this, C59284a.f135508a).getValue();
        this.f135506b = new C59285b(this, this.f135505a);
        this.f135507c = miniAppMediaChooseEmptyArg.getCurrentType();
        int chooseNum = miniAppMediaChooseEmptyArg.getChooseNum();
        int i = this.f135507c;
        if (i == 1) {
            this.f135506b.f135509a.mo102355e(6);
        } else if (i == 2) {
            C59285b bVar = this.f135506b;
            bVar.f135509a.f144597i = chooseNum;
            bVar.f135509a.mo102346a(6);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap createBitmap;
        Intent intent2 = intent;
        MethodCollector.m26663i(6941);
        super.onActivityResult(i, i2, intent2);
        setResult(i, intent2);
        if (intent2 == null) {
            intent2 = new Intent();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = this.f135507c;
        if (i3 != 1) {
            if (i3 == 2) {
                arrayList.addAll(this.f135506b.mo96879a(intent2));
            }
        } else if (i2 != 0) {
            C59285b bVar = this.f135506b;
            String h = bVar.f135509a.mo102359h();
            Bitmap decodeFile = BitmapFactory.decodeFile(h);
            if (decodeFile == null) {
                createBitmap = null;
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) C59285b.m108984a(h));
                createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            }
            arrayList.add(new C59309a.C59310a(bVar.mo96878a(createBitmap), "", 0, 0, 0, 0, ""));
        }
        setResult(11, intent2);
        intent2.putExtra("key_media_list", arrayList);
        C59320c.C59324a.f135560a.mo96989a().handleActivityImageResult(i, i2, intent2);
        finish();
        MethodCollector.m26664o(6941);
    }
}
