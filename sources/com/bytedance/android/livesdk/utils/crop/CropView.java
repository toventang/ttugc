package com.bytedance.android.livesdk.utils.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3932e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.utils.C11235c;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

public final class CropView extends FrameLayout {

    /* renamed from: g */
    public static final C11238a f26887g = new C11238a((byte) 0);

    /* renamed from: a */
    public PinchImageView f26888a;

    /* renamed from: b */
    public PreviewBoxView f26889b;

    /* renamed from: c */
    Bitmap f26890c;

    /* renamed from: d */
    public Rect f26891d;

    /* renamed from: e */
    int f26892e;

    /* renamed from: f */
    int f26893f;

    /* renamed from: h */
    private SwitchModeFrameLayout f26894h;

    static {
        Covode.recordClassIndex(12866);
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.CropView$a */
    public static final class C11238a {
        static {
            Covode.recordClassIndex(12867);
        }

        private C11238a() {
        }

        public /* synthetic */ C11238a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.CropView$d */
    static final class RunnableC11241d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CropView f26897a;

        static {
            Covode.recordClassIndex(12870);
        }

        RunnableC11241d(CropView cropView) {
            this.f26897a = cropView;
        }

        public final void run() {
            CropView.m19913a(this.f26897a).mo18015a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.CropView$e */
    static final class CallableC11242e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ CropView f26898a;

        static {
            Covode.recordClassIndex(12871);
        }

        CallableC11242e(CropView cropView) {
            this.f26898a = cropView;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            File file;
            C89378p pVar;
            MethodCollector.m26663i(9978);
            CropView cropView = this.f26898a;
            Context context = cropView.getContext();
            String str = null;
            if (!C3932e.m9576a() || !C3932e.m9580b()) {
                file = null;
            } else {
                file = new File(C3932e.m9574a(context), "picture");
                C3932e.m9577a(file);
                C3854a.m9453a(3, "file_path", "picture" + " cache path:" + file.getAbsolutePath());
            }
            File file2 = new File(file, "crop_" + System.currentTimeMillis() + ".png");
            PinchImageView pinchImageView = cropView.f26888a;
            if (pinchImageView == null) {
                C89219l.m154710a("mCoverImage");
            }
            Bitmap bitmap = cropView.f26890c;
            if (bitmap == null) {
                C89219l.m154710a("mOriginalBitmap");
            }
            RectF a = pinchImageView.mo17987a((RectF) null);
            Rect rect = cropView.f26891d;
            if (rect == null) {
                pVar = new C89378p(bitmap, Integer.valueOf((int) R.string.gj8));
            } else {
                float width = ((float) bitmap.getWidth()) / a.width();
                float height = ((float) bitmap.getHeight()) / a.height();
                int b = C89271h.m154769b((int) ((((float) rect.left) - a.left) * width), 0);
                int b2 = C89271h.m154769b((int) ((((float) rect.top) - a.top) * height), 0);
                int c = C89271h.m154772c((int) (((float) rect.width()) * width), bitmap.getWidth() - b);
                int c2 = C89271h.m154772c((int) (((float) rect.height()) * height), bitmap.getHeight() - b2);
                if (c < cropView.f26892e || c2 < cropView.f26893f) {
                    pVar = new C89378p(null, Integer.valueOf((int) R.string.guf));
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, b, b2, c, c2);
                    if (createBitmap != null) {
                        CropView.m19915a(bitmap, b, b2, createBitmap);
                    }
                    pVar = new C89378p(createBitmap, Integer.valueOf((int) R.string.gj8));
                }
            }
            Bitmap bitmap2 = (Bitmap) pVar.getFirst();
            if (bitmap2 == null) {
                C89378p pVar2 = new C89378p(null, pVar.getSecond());
                MethodCollector.m26664o(9978);
                return pVar2;
            }
            if (BitmapUtils.saveBitmapToSD(bitmap2, file2.getParent(), file2.getName())) {
                str = file2.getAbsolutePath();
            }
            C89378p pVar3 = new C89378p(str, Integer.valueOf((int) R.string.gj8));
            MethodCollector.m26664o(9978);
            return pVar3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.CropView$b */
    public static final class C11239b extends SwitchModeFrameLayout.C11254a {

        /* renamed from: a */
        final /* synthetic */ CropView f26895a;

        static {
            Covode.recordClassIndex(12868);
        }

        C11239b(CropView cropView) {
            this.f26895a = cropView;
        }

        @Override // com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout.AbstractC11255b, com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout.C11254a
        /* renamed from: a */
        public final void mo17983a(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            if (motionEvent.getAction() == 0) {
                PreviewBoxView a = CropView.m19913a(this.f26895a);
                if (a.f26928b != null && a.f26928b.isStarted()) {
                    a.f26928b.cancel();
                }
                if (Math.abs(a.f26932f - 0.5f) >= Float.MIN_NORMAL) {
                    a.f26932f = 0.5f;
                    a.setAlpha(a.f26932f);
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f26895a.f26891d == null) {
                    CropView cropView = this.f26895a;
                    cropView.f26891d = CropView.m19913a(cropView).getVisibleRect();
                }
                CropView.m19913a(this.f26895a).mo18015a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PreviewBoxView m19913a(CropView cropView) {
        PreviewBoxView previewBoxView = cropView.f26889b;
        if (previewBoxView == null) {
            C89219l.m154710a("mCoverWindow");
        }
        return previewBoxView;
    }

    public final void setOriginPath(String str) {
        if (str != null) {
            int readPictureDegree = BitmapUtils.readPictureDegree(str);
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, 1080, 1080);
            if (bitmapFromSD != null) {
                m19914a(bitmapFromSD, readPictureDegree);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.CropView$f */
    static final class C11243f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f26899a;

        static {
            Covode.recordClassIndex(12872);
        }

        C11243f(AbstractC89172b bVar) {
            this.f26899a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            CharSequence charSequence;
            C89219l.m154716b(iVar, "");
            if (iVar.mo5535a() && (charSequence = (CharSequence) ((C89378p) iVar.mo5545d()).getFirst()) != null && charSequence.length() != 0) {
                AbstractC89172b bVar = this.f26899a;
                Object first = ((C89378p) iVar.mo5545d()).getFirst();
                if (first == null) {
                    C89219l.m154715b();
                }
                bVar.invoke(first);
                return null;
            } else if (iVar.mo5535a()) {
                C11226ao.m19882a(C3966y.m9669e(), ((Number) ((C89378p) iVar.mo5545d()).getSecond()).intValue());
                return null;
            } else {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gj8);
                return null;
            }
        }
    }

    /* renamed from: a */
    private final int m19912a(Uri uri) {
        FileDescriptor fileDescriptor;
        MethodCollector.m26663i(12019);
        try {
            Context context = getContext();
            C89219l.m154716b(context, "");
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor == null || (fileDescriptor = openFileDescriptor.getFileDescriptor()) == null) {
                MethodCollector.m26664o(12019);
                return 0;
            }
            int attributeInt = new ExifInterface(fileDescriptor).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                MethodCollector.m26664o(12019);
                return LiveFeedRefreshTimeSetting.DEFAULT;
            } else if (attributeInt == 6) {
                MethodCollector.m26664o(12019);
                return 90;
            } else if (attributeInt != 8) {
                MethodCollector.m26664o(12019);
                return 0;
            } else {
                MethodCollector.m26664o(12019);
                return 270;
            }
        } catch (IOException unused) {
            MethodCollector.m26664o(12019);
            return 0;
        }
    }

    public final void setOriginUri(Uri uri) {
        int i;
        if (uri != null) {
            try {
                Context context = getContext();
                C89219l.m154716b(context, "");
                Bitmap decodeBitmap = BitmapUtils.decodeBitmap(context.getContentResolver(), uri, 1080, 1080);
                if (decodeBitmap == null) {
                    C11279p.m20005a();
                    return;
                }
                String a = C11235c.m19906a(getContext(), uri);
                if (a != null && !C89361p.m154870a((CharSequence) a)) {
                    i = BitmapUtils.readPictureDegree(a);
                } else if (Build.VERSION.SDK_INT >= 24) {
                    i = m19912a(uri);
                } else {
                    i = BitmapUtils.readPictureDegree(uri.getPath());
                }
                m19914a(decodeBitmap, i);
            } catch (Exception unused) {
                C11279p.m20005a();
            }
        }
    }

    /* renamed from: a */
    private final void m19914a(Bitmap bitmap, int i) {
        Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmap, i);
        C89219l.m154716b(rotateBitmap, "");
        this.f26890c = rotateBitmap;
        PinchImageView pinchImageView = this.f26888a;
        if (pinchImageView == null) {
            C89219l.m154710a("mCoverImage");
        }
        Bitmap bitmap2 = this.f26890c;
        if (bitmap2 == null) {
            C89219l.m154710a("mOriginalBitmap");
        }
        pinchImageView.setImageBitmap(bitmap2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12021);
        View inflate = View.inflate(getContext(), R.layout.b52, this);
        View findViewById = inflate.findViewById(R.id.agc);
        C89219l.m154716b(findViewById, "");
        this.f26894h = (SwitchModeFrameLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.buj);
        C89219l.m154716b(findViewById2, "");
        this.f26888a = (PinchImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.bur);
        C89219l.m154716b(findViewById3, "");
        this.f26889b = (PreviewBoxView) findViewById3;
        SwitchModeFrameLayout switchModeFrameLayout = this.f26894h;
        if (switchModeFrameLayout == null) {
            C89219l.m154710a("mCropContainer");
        }
        switchModeFrameLayout.setBackgroundColor(C3966y.m9663b((int) R.color.xb));
        switchModeFrameLayout.setIntercepter(new C11239b(this));
        PreviewBoxView previewBoxView = this.f26889b;
        if (previewBoxView == null) {
            C89219l.m154710a("mCoverWindow");
        }
        previewBoxView.f26930d = 0;
        previewBoxView.f26931e = 1.0f;
        previewBoxView.f26929c = (int) C11227ap.m19885a(previewBoxView.getContext(), 16.0f);
        previewBoxView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC11240c(this));
        previewBoxView.postDelayed(new RunnableC11241d(this), 1000);
        MethodCollector.m26664o(12021);
    }

    /* renamed from: a */
    static boolean m19915a(Bitmap bitmap, int i, int i2, Bitmap bitmap2) {
        int c = C89271h.m154772c(bitmap2.getWidth(), bitmap.getWidth() - i);
        int c2 = C89271h.m154772c(bitmap2.getHeight(), bitmap.getHeight() - i2);
        for (int i3 = 0; i3 < c; i3++) {
            for (int b = C89271h.m154769b(c2 - 10, 0); b < c2; b++) {
                try {
                    if (bitmap.getPixel(i + i3, i2 + b) != bitmap2.getPixel(i3, b)) {
                        return false;
                    }
                } catch (IllegalArgumentException | IllegalStateException unused) {
                }
            }
        }
        return true;
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.CropView$c */
    static final class View$OnLayoutChangeListenerC11240c implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ CropView f26896a;

        static {
            Covode.recordClassIndex(12869);
        }

        View$OnLayoutChangeListenerC11240c(CropView cropView) {
            this.f26896a = cropView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f26896a.f26891d == null) {
                CropView cropView = this.f26896a;
                cropView.f26891d = CropView.m19913a(cropView).getVisibleRect();
                PinchImageView pinchImageView = this.f26896a.f26888a;
                if (pinchImageView == null) {
                    C89219l.m154710a("mCoverImage");
                }
                pinchImageView.setDisplayWindowRect(this.f26896a.f26891d);
            }
        }
    }
}
