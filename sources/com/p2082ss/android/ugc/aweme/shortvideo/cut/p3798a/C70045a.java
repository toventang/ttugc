package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a;
import com.p2082ss.android.ugc.aweme.mediaplayer.C59194b;
import com.p2082ss.android.ugc.aweme.mediaplayer.C59200h;
import com.p2082ss.android.ugc.aweme.mediaplayer.C59201i;
import com.p2082ss.android.ugc.aweme.mediaplayer.C59202j;
import com.p2082ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a.C70050b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a */
public final class C70045a extends Fragment {

    /* renamed from: m */
    private static final double f156635m = ((double) EnumC78601i.FAST.value());

    /* renamed from: a */
    TextureView f156636a;

    /* renamed from: b */
    ImageView f156637b;

    /* renamed from: c */
    FrameLayout f156638c;

    /* renamed from: d */
    VideoEditView f156639d;

    /* renamed from: e */
    TextView f156640e;

    /* renamed from: f */
    boolean f156641f;

    /* renamed from: g */
    public MediaPlayerModule f156642g;

    /* renamed from: h */
    public CutMultiVideoViewModel f156643h;

    /* renamed from: i */
    public VideoEditViewModel f156644i;

    /* renamed from: j */
    public VideoShare2GifEditContext f156645j;

    /* renamed from: k */
    public Handler f156646k = new Handler(Looper.getMainLooper()) {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.C70045a.HandlerC700461 */

        static {
            Covode.recordClassIndex(82466);
        }

        public final void handleMessage(Message message) {
            int i;
            super.handleMessage(message);
            if (message.what == 0) {
                CutMultiVideoViewModel cutMultiVideoViewModel = C70045a.this.f156643h;
                long longValue = ((Long) message.obj).longValue();
                List<VideoSegment> j = C70045a.this.f156644i.mo111231j();
                cutMultiVideoViewModel.f156530b.setValue(Long.valueOf(longValue));
                int i2 = 0;
                if (cutMultiVideoViewModel.f156529a.getValue() != null) {
                    i = cutMultiVideoViewModel.f156529a.getValue().f2751b.intValue();
                } else {
                    i = 0;
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < j.size(); i3++) {
                    if (!j.get(i3).f156717i) {
                        arrayList.add(j.get(i3));
                    }
                }
                long j2 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    j2 += ((VideoSegment) arrayList.get(i4)).f156710b;
                    if (j2 > longValue) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                }
                if (longValue > 0) {
                    cutMultiVideoViewModel.f156529a.setValue(C0692e.m2449a(Integer.valueOf(i), Integer.valueOf(i2)));
                }
            }
        }
    };

    /* renamed from: l */
    public Runnable f156647l = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.C70045a.RunnableC700472 */

        static {
            Covode.recordClassIndex(82467);
        }

        public final void run() {
            if (C70045a.this.f156642g != null) {
                C70045a.this.f156646k.obtainMessage(0, Long.valueOf(C70045a.this.f156642g.f134714b.mo96719f())).sendToTarget();
                C70045a.this.f156646k.postDelayed(C70045a.this.f156647l, 30);
            }
        }
    };

    /* renamed from: n */
    private AbstractC1214u<C59201i> f156648n = new C70056b(this);

    static {
        Covode.recordClassIndex(82465);
        C63244g.m114602a().mo73293u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo110513b() {
        if (getActivity() != null) {
            new C23144b(this).mo37640e(R.string.dpn).mo37637b();
            getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo110512a() {
        this.f156640e.setText(getString(R.string.d5c, C1764a.m5929a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.f156639d.getSelectedTime())})));
        C0692e<Long, Long> singleVideoPlayBoundary = this.f156639d.getSingleVideoPlayBoundary();
        if (singleVideoPlayBoundary != null && singleVideoPlayBoundary.f2750a != null && singleVideoPlayBoundary.f2751b != null) {
            this.f156645j.f154204m = singleVideoPlayBoundary.f2750a.longValue();
            this.f156645j.f154205n = singleVideoPlayBoundary.f2751b.longValue();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            mo110513b();
            return;
        }
        this.f156643h = (CutMultiVideoViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        this.f156644i = (VideoEditViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getArguments().getParcelable("extra_edit_context");
        this.f156645j = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null) {
            mo110513b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC59193a bVar;
        super.onViewCreated(view, bundle);
        this.f156636a = (TextureView) view.findViewById(R.id.eh3);
        this.f156637b = (ImageView) view.findViewById(R.id.d2o);
        this.f156638c = (FrameLayout) view.findViewById(R.id.b5s);
        this.f156639d = (VideoEditView) view.findViewById(R.id.fcg);
        this.f156640e = (TextView) view.findViewById(R.id.f5w);
        this.f156636a.setOnClickListener(new View$OnClickListenerC70057c(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f156636a.setClipToOutline(true);
            this.f156636a.setOutlineProvider(new C70050b(C71812ep.m126783a(4.0d, C63247i.f143610a)));
        }
        this.f156638c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.C70045a.ViewTreeObserver$OnGlobalLayoutListenerC700483 */

            static {
                Covode.recordClassIndex(82468);
            }

            public final void onGlobalLayout() {
                int i;
                if (C70045a.this.f156645j != null) {
                    C70045a.this.f156638c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int height = C70045a.this.f156638c.getHeight();
                    int width = C70045a.this.f156638c.getWidth();
                    int[] b = C69823b.m123389b(C70045a.this.f156645j.f154192a);
                    if (b[0] == 0) {
                        int i2 = b[2];
                        int i3 = b[3];
                        C70045a.this.f156645j.f154198g = i2;
                        C70045a.this.f156645j.f154199h = i3;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        if (i2 < i3) {
                            layoutParams.width = (i2 * height) / i3;
                            layoutParams.height = height;
                            layoutParams.leftMargin = (width - layoutParams.width) / 2;
                            layoutParams.topMargin = 0;
                        } else {
                            layoutParams.width = width;
                            layoutParams.height = (i3 * width) / i2;
                            layoutParams.topMargin = (height - layoutParams.height) / 2;
                            if (layoutParams.topMargin >= 0) {
                                i = layoutParams.topMargin;
                            } else {
                                i = 0;
                            }
                            layoutParams.topMargin = i;
                            layoutParams.leftMargin = 0;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        layoutParams.setMarginStart(layoutParams.leftMargin);
                        C70045a.this.f156645j.f154200i = layoutParams.width;
                        C70045a.this.f156645j.f154201j = layoutParams.height;
                        C70045a.this.f156638c.setLayoutParams(layoutParams);
                    }
                }
            }
        });
        this.f156639d.setMinVideoLength(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        this.f156639d.setMaxVideoLength(15000);
        if (this.f156639d.mo111140a(getActivity(), this.f156643h, this.f156645j.f154192a) || getActivity() == null) {
            this.f156644i.f157678c.observe(this, new C70058d(this));
            this.f156644i.f157680e.observe(this, new C70059e(this));
            this.f156644i.f157679d.observe(this, new C70060f(this));
            this.f156644i.f157681f.observe(this, new C70061g(this));
            this.f156644i.f157682g.observe(this, new C70062h(this));
            this.f156644i.f157687l.observe(this, new C70063i(this));
            try {
                if (C16048b.m29633a().mo25421a(true, "remove_ies_media_player", false)) {
                    String str = C70638dj.f158102e + "video2gif_workspace";
                    C80720e.m139938e(str);
                    bVar = new C59202j(str, this.f156636a);
                } else {
                    bVar = new C59194b(getActivity());
                }
                C59200h hVar = new C59200h();
                hVar.f134731c = true;
                hVar.f134729a = (float) f156635m;
                hVar.f134730b = 0.0f;
                hVar.f134733e = this.f156639d.getMaxCutDuration();
                MediaPlayerModule mediaPlayerModule = new MediaPlayerModule(bVar, hVar);
                this.f156642g = mediaPlayerModule;
                mediaPlayerModule.f134713a = this.f156645j.f154192a;
                this.f156642g.f134720h.observe(this, this.f156648n);
                MediaPlayerModule mediaPlayerModule2 = this.f156642g;
                TextureView textureView = this.f156636a;
                mediaPlayerModule2.f134719g = textureView.getSurfaceTextureListener();
                textureView.setSurfaceTextureListener(mediaPlayerModule2);
                getLifecycle().mo4012a(this.f156642g);
            } catch (Exception e) {
                e.printStackTrace();
                mo110513b();
            }
        } else {
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.a1s, viewGroup, false);
    }
}
