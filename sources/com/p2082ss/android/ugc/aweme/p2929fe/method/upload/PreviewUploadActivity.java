package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.VideoView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity */
public final class PreviewUploadActivity extends ActivityC17312a {

    /* renamed from: a */
    public String f111117a;

    /* renamed from: b */
    private SparseArray f111118b;

    static {
        Covode.recordClassIndex(56691);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f111118b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f111118b == null) {
            this.f111118b = new SparseArray();
        }
        View view = (View) this.f111118b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f111118b.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        if (_$_findCachedViewById(R.id.fe8) != null) {
            ((VideoView) _$_findCachedViewById(R.id.fe8)).suspend();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", true);
        super.onResume();
        if (_$_findCachedViewById(R.id.fe8) != null) {
            VideoView videoView = (VideoView) _$_findCachedViewById(R.id.fe8);
            C89219l.m154716b(videoView, "");
            if (!videoView.isPlaying()) {
                ((VideoView) _$_findCachedViewById(R.id.fe8)).start();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (_$_findCachedViewById(R.id.fe8) != null) {
            VideoView videoView = (VideoView) _$_findCachedViewById(R.id.fe8);
            C89219l.m154716b(videoView, "");
            if (videoView.isPlaying()) {
                ((VideoView) _$_findCachedViewById(R.id.fe8)).pause();
            }
        }
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

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$b */
    static final class View$OnClickListenerC47977b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f111120a;

        static {
            Covode.recordClassIndex(56693);
        }

        View$OnClickListenerC47977b(PreviewUploadActivity previewUploadActivity) {
            this.f111120a = previewUploadActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Intent intent = new Intent();
            intent.putExtra("filePath", this.f111120a.f111117a);
            this.f111120a.setResult(-1, intent);
            this.f111120a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$c */
    static final class View$OnClickListenerC47978c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f111121a;

        static {
            Covode.recordClassIndex(56694);
        }

        View$OnClickListenerC47978c(PreviewUploadActivity previewUploadActivity) {
            this.f111121a = previewUploadActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Intent intent = new Intent();
            intent.putExtra("filePath", this.f111121a.f111117a);
            this.f111121a.setResult(0, intent);
            this.f111121a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$a */
    static final class C47976a implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f111119a;

        static {
            Covode.recordClassIndex(56692);
        }

        C47976a(PreviewUploadActivity previewUploadActivity) {
            this.f111119a = previewUploadActivity;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            TuxTextView tuxTextView = (TuxTextView) this.f111119a._$_findCachedViewById(R.id.f9s);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) this.f111119a._$_findCachedViewById(R.id.f9r);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            C89219l.m154716b(mediaPlayer, "");
            mediaPlayer.setLooping(true);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.v1);
        String a = m90961a(getIntent(), "filePath");
        this.f111117a = a;
        if (a != null) {
            VideoView videoView = (VideoView) _$_findCachedViewById(R.id.fe8);
            videoView.setVisibility(0);
            videoView.setVideoPath(this.f111117a);
            videoView.setOnPreparedListener(new C47976a(this));
        }
        ((TuxTextView) _$_findCachedViewById(R.id.f9s)).setOnClickListener(new View$OnClickListenerC47977b(this));
        ((TuxTextView) _$_findCachedViewById(R.id.f9r)).setOnClickListener(new View$OnClickListenerC47978c(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m90961a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
