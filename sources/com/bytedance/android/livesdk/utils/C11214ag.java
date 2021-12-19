package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.AbstractC5799b;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.model.AbstractC11837c;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.utils.ag */
public final class C11214ag {

    /* renamed from: a */
    public static final C11214ag f26857a = new C11214ag();

    private C11214ag() {
    }

    static {
        Covode.recordClassIndex(12842);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.ag$c */
    public static final class C11217c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C11217c f26862a = new C11217c();

        static {
            Covode.recordClassIndex(12845);
        }

        C11217c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C3854a.m9455a(6, "NinePatchUtil", th.getStackTrace());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.ag$a */
    public static final class C11215a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f26858a;

        static {
            Covode.recordClassIndex(12843);
        }

        C11215a(String str) {
            this.f26858a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Bitmap apply(Integer num) {
            AbstractC11837c<C11835a> downloadFile;
            MethodCollector.m26663i(12027);
            C89219l.m154721d(num, "");
            try {
                C5809h a = C5809h.m12739a();
                String str = this.f26858a;
                ArrayList arrayList = new ArrayList();
                if (a.f14661b != null) {
                    AbstractC5799b.C5800a a2 = a.f14661b.mo11566a(new AbstractC5799b.C5800a(str, arrayList));
                    downloadFile = ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).downloadFile(false, Integer.MAX_VALUE, a2.f14640a, a2.f14641b, null);
                } else {
                    downloadFile = ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).downloadFile(false, Integer.MAX_VALUE, str, arrayList, null);
                }
                C11835a a3 = downloadFile.mo18908a();
                C89219l.m154716b(a3, "");
                Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(a3.f28196e));
                MethodCollector.m26664o(12027);
                return decodeStream;
            } catch (Exception e) {
                C3854a.m9455a(6, "NinePatchUtil", e.getStackTrace());
                C3854a.m9453a(6, "NinePatchUtil", e.getMessage());
                MethodCollector.m26664o(12027);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.ag$b */
    public static final class C11216b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f26859a;

        /* renamed from: b */
        final /* synthetic */ View f26860b;

        /* renamed from: c */
        final /* synthetic */ Runnable f26861c;

        static {
            Covode.recordClassIndex(12844);
        }

        C11216b(boolean z, View view, Runnable runnable) {
            this.f26859a = z;
            this.f26860b = view;
            this.f26861c = runnable;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Rect rect = null;
            if (bitmap != null) {
                byte[] ninePatchChunk = bitmap.getNinePatchChunk();
                if (ninePatchChunk != null) {
                    ByteBuffer order = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
                    if (order.get() != 0) {
                        order.get();
                        order.get();
                        order.get();
                        C89219l.m154716b(order, "");
                        order.getInt();
                        order.getInt();
                        rect = new Rect();
                        rect.left = order.getInt();
                        rect.right = order.getInt();
                        rect.top = order.getInt();
                        rect.bottom = order.getInt();
                    }
                }
                if (!(bitmap == null || bitmap.getNinePatchChunk() == null || rect == null)) {
                    NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(C3966y.m9655a(), bitmap, bitmap.getNinePatchChunk(), rect, null);
                    int i = Build.VERSION.SDK_INT;
                    ninePatchDrawable.setAutoMirrored(this.f26859a);
                    this.f26860b.setBackground(ninePatchDrawable);
                    if (!this.f26859a || !C6229a.m13521a(C3966y.m9669e())) {
                        this.f26860b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                    } else {
                        this.f26860b.setPadding(rect.right, rect.top, rect.left, rect.bottom);
                    }
                    Runnable runnable = this.f26861c;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            if (bitmap != null) {
                C3854a.m9453a(6, "NinePatchUtil", "downloaded bitmap is null.");
            } else {
                C3854a.m9453a(6, "NinePatchUtil", "no ninepatch chunk found in bitmap.");
            }
        }
    }

    /* renamed from: a */
    public static void m19870a(ImageModel imageModel, View view, boolean z, Runnable runnable) {
        String str;
        C89219l.m154721d(imageModel, "");
        C89219l.m154721d(view, "");
        if (!C13617h.m24465a(imageModel.getUrls())) {
            List<String> urls = imageModel.getUrls();
            if (urls != null) {
                str = urls.get(0);
            } else {
                str = null;
            }
            AbstractC88979t.m154310b((Object) 0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C11215a(str)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C11216b(z, view, runnable), C11217c.f26862a);
        }
    }
}
