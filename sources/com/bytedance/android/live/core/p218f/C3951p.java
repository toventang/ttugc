package com.bytedance.android.live.core.p218f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.p219a.C3889a;
import com.bytedance.android.livesdk.chatroom.p492g.EnumC7584i;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24250e;
import java.util.Collection;

/* renamed from: com.bytedance.android.live.core.f.p */
public final class C3951p {

    /* renamed from: com.bytedance.android.live.core.f.p$b */
    public interface AbstractC3955b {
        static {
            Covode.recordClassIndex(4484);
        }

        /* renamed from: a */
        void mo9305a();

        /* renamed from: a */
        void mo9306a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(4480);
    }

    /* renamed from: a */
    public static void m9627a(ImageView imageView, ImageModel imageModel, int i, AbstractC3953a aVar) {
        m9632b(imageView, imageModel, -1, -1, i, aVar);
    }

    /* renamed from: a */
    public static boolean m9629a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                int i = Build.VERSION.SDK_INT;
                return !activity.isDestroyed() && !activity.isFinishing();
            } else if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
                return true;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m9628a(ImageView imageView, ImageModel imageModel, EnumC7584i iVar) {
        PointF pointF;
        if (imageModel != null && !C13603b.m24435a((Collection) imageModel.getUrls()) && imageView != null && m9629a(imageView.getContext())) {
            C3889a a = C3889a.m9507a(imageView.getContext()).mo9251a(m9619a(imageModel));
            a.f10755d = imageModel;
            C3889a a2 = a.mo9249a(ImageView.ScaleType.CENTER_CROP);
            if (iVar != null) {
                a2.f10756e = C3967z.f10871a;
                int i = C39521.f10856a[iVar.ordinal()];
                if (i == 1) {
                    pointF = new PointF(0.5f, 0.0f);
                } else if (i != 2) {
                    pointF = new PointF(0.5f, 0.5f);
                } else {
                    pointF = new PointF(0.5f, 1.0f);
                }
                a2.f10757f = pointF;
            }
            a2.f10753b = new C3941k.C3945b(imageModel, null);
            a2.mo9252a(imageView);
        }
    }

    /* renamed from: com.bytedance.android.live.core.f.p$a */
    public interface AbstractC3953a {
        static {
            Covode.recordClassIndex(4482);
        }

        /* renamed from: a */
        void mo9301a(ImageModel imageModel);

        /* renamed from: a */
        void mo9302a(ImageModel imageModel, int i, int i2);

        /* renamed from: a */
        void mo9303a(ImageModel imageModel, Exception exc);

        /* renamed from: com.bytedance.android.live.core.f.p$a$a */
        public static class C3954a implements AbstractC3953a {

            /* renamed from: a */
            public long f10857a = -1;

            /* renamed from: b */
            private long f10858b = -1;

            static {
                Covode.recordClassIndex(4483);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo9304a(boolean z) {
            }

            /* renamed from: a */
            private void m9636a() {
                this.f10857a = SystemClock.elapsedRealtime() - this.f10858b;
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9301a(ImageModel imageModel) {
                this.f10858b = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9303a(ImageModel imageModel, Exception exc) {
                m9636a();
                mo9304a(false);
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9302a(ImageModel imageModel, int i, int i2) {
                m9636a();
                mo9304a(true);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.f.p$1 */
    static /* synthetic */ class C39521 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10856a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 4481(0x1181, float:6.279E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.chatroom.g.i[] r0 = com.bytedance.android.livesdk.chatroom.p492g.EnumC7584i.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.live.core.p218f.C3951p.C39521.f10856a = r2
                com.bytedance.android.livesdk.chatroom.g.i r0 = com.bytedance.android.livesdk.chatroom.p492g.EnumC7584i.TOP     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.live.core.p218f.C3951p.C39521.f10856a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.chatroom.g.i r0 = com.bytedance.android.livesdk.chatroom.p492g.EnumC7584i.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p218f.C3951p.C39521.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m9619a(ImageModel imageModel) {
        if (imageModel == null || C13617h.m24465a(imageModel.getUrls())) {
            return "";
        }
        return imageModel.getUrls().get(0);
    }

    /* renamed from: b */
    public static void m9630b(ImageView imageView, ImageModel imageModel) {
        if (imageModel != null && !C13603b.m24435a((Collection) imageModel.getUrls())) {
            m9622a(imageView, imageModel, 0);
        }
    }

    /* renamed from: a */
    public static void m9621a(ImageView imageView, ImageModel imageModel) {
        if (imageView != null && m9629a(imageView.getContext())) {
            C3889a a = C3889a.m9507a(imageView.getContext());
            a.f10755d = imageModel;
            C3889a a2 = a.mo9246a().mo9249a(ImageView.ScaleType.CENTER_CROP);
            a2.f10753b = new C3941k.C3945b(null, null);
            a2.mo9252a(imageView);
        }
    }

    /* renamed from: a */
    public static void m9622a(ImageView imageView, ImageModel imageModel, int i) {
        m9632b(imageView, imageModel, -1, -1, i, null);
    }

    /* renamed from: a */
    public static void m9620a(ImageView imageView, int i, int i2, int i3) {
        if (imageView != null && m9629a(imageView.getContext())) {
            C3889a a = C3889a.m9507a(imageView.getContext());
            a.f10754c = new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
            C3889a a2 = a.mo9246a().mo9249a(ImageView.ScaleType.CENTER_CROP);
            a2.f10753b = new C3941k.C3945b(null, null);
            if (i2 > 0 && i3 > 0) {
                a2.mo9248a(i2, i3);
            }
            a2.mo9252a(imageView);
        }
    }

    /* renamed from: b */
    public static void m9631b(ImageView imageView, ImageModel imageModel, int i, int i2) {
        if (imageView != null && imageModel != null && m9629a(imageView.getContext())) {
            C3889a a = C3889a.m9507a(imageView.getContext()).mo9251a(m9619a(imageModel));
            int a2 = C3966y.m9653a((float) i2);
            if (a.f10758g == null) {
                a.f10758g = new C24250e();
            }
            a.f10758g.mo39978a((float) a2);
            a.f10755d = imageModel;
            C3889a a3 = a.mo9249a(ImageView.ScaleType.CENTER_CROP);
            a3.mo9247a(i);
            a3.f10753b = new C3941k.C3945b(imageModel, null);
            a3.mo9252a(imageView);
        }
    }

    /* renamed from: a */
    public static void m9623a(ImageView imageView, ImageModel imageModel, int i, int i2) {
        if (imageView != null && imageModel != null && !C13603b.m24435a((Collection) imageModel.getUrls()) && m9629a(imageView.getContext())) {
            m9632b(imageView, imageModel, i, i2, -1, null);
        }
    }

    /* renamed from: b */
    public static void m9632b(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, AbstractC3953a aVar) {
        m9626a(imageView, imageModel, i, i2, false, i3, aVar);
    }

    /* renamed from: a */
    public static void m9624a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, AbstractC3953a aVar) {
        if (imageView != null && m9629a(imageView.getContext())) {
            C3889a a = C3889a.m9507a(imageView.getContext());
            a.f10755d = imageModel;
            C3889a a2 = a.mo9246a().mo9249a(ImageView.ScaleType.CENTER_CROP);
            if (i > 0 && i2 > 0) {
                a2.mo9248a(i, i2);
            }
            if (i3 > 0) {
                a2.mo9247a(i3);
            }
            if (aVar != null) {
                a2.f10753b = new C3941k.C3945b(imageModel, aVar);
            } else {
                a2.f10753b = new C3941k.C3945b(null, null);
            }
            a2.mo9252a(imageView);
        }
    }

    /* renamed from: a */
    public static void m9626a(ImageView imageView, ImageModel imageModel, int i, int i2, boolean z, int i3, AbstractC3953a aVar) {
        m9625a(imageView, imageModel, i, i2, z, i3, ImageView.ScaleType.CENTER_CROP, aVar);
    }

    /* renamed from: a */
    public static void m9625a(ImageView imageView, ImageModel imageModel, int i, int i2, boolean z, int i3, ImageView.ScaleType scaleType, AbstractC3953a aVar) {
        if (imageModel == null) {
            if (aVar != null) {
                aVar.mo9303a(imageModel, new IllegalArgumentException("imageModel == null"));
            }
        } else if (C13603b.m24435a((Collection) imageModel.getUrls())) {
            if (aVar != null) {
                aVar.mo9303a(imageModel, new IllegalArgumentException("CollectionUtils.isEmpty(imageModel.urls)"));
            }
        } else if (imageView != null && m9629a(imageView.getContext())) {
            C3889a a = C3889a.m9507a(imageView.getContext()).mo9251a(m9619a(imageModel));
            a.f10755d = imageModel;
            C3889a a2 = a.mo9249a(scaleType);
            if (i > 0 && i2 > 0) {
                a2.mo9248a(i, i2);
            }
            if (i3 > 0) {
                a2.mo9247a(i3);
            }
            if (z) {
                a2.f10759h = true;
            }
            a2.f10753b = new C3941k.C3945b(imageModel, aVar);
            a2.mo9252a(imageView);
        } else if (aVar != null) {
            aVar.mo9303a(imageModel, new IllegalArgumentException("!isActivityOK(view.getContext())"));
        }
    }
}
