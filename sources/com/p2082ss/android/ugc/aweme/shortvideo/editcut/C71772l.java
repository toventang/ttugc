package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.utils.C80332db;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.l */
public final class C71772l {
    static {
        Covode.recordClassIndex(84317);
    }

    /* renamed from: a */
    public static final <T> boolean m126683a(List<T> list, int i, int i2) {
        C89219l.m154721d(list, "");
        if (i == i2 || i < 0 || i2 < 0 || i > list.size() - 1 || i2 > list.size() - 1) {
            return false;
        }
        list.add(i2, list.remove(i));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.l$a */
    public static final class C71773a implements AbstractC85304ab {

        /* renamed from: a */
        final /* synthetic */ SimpleDraweeView f160822a;

        /* renamed from: b */
        final /* synthetic */ C80332db f160823b;

        /* renamed from: c */
        final /* synthetic */ String f160824c;

        static {
            Covode.recordClassIndex(84318);
        }

        C71773a(SimpleDraweeView simpleDraweeView, C80332db dbVar, String str) {
            this.f160822a = simpleDraweeView;
            this.f160823b = dbVar;
            this.f160824c = str;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            MethodCollector.m26663i(12182);
            final Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            C1731i.m5640b(new Callable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71772l.C71773a.CallableC717741 */

                /* renamed from: a */
                final /* synthetic */ C71773a f160825a;

                static {
                    Covode.recordClassIndex(84319);
                }

                {
                    this.f160825a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    C80332db dbVar = this.f160825a.f160823b;
                    if (dbVar != null) {
                        String str = this.f160825a.f160824c;
                        Bitmap bitmap = createBitmap;
                        C89219l.m154716b(bitmap, "");
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(bitmap, "");
                        if (dbVar.f179862c) {
                            dbVar.f179860a.put(str, bitmap);
                        }
                    }
                    this.f160825a.f160822a.setImageBitmap(createBitmap);
                    return C89391z.f203057a;
                }
            }, C1731i.f5564c);
            MethodCollector.m26664o(12182);
            return false;
        }
    }

    /* renamed from: a */
    public static final void m126682a(SimpleDraweeView simpleDraweeView, String str, Drawable drawable, int i, C80332db dbVar) {
        boolean z;
        Bitmap a;
        C89219l.m154721d(simpleDraweeView, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(drawable, "");
        simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((C24246a) simpleDraweeView.getHierarchy()).mo39953a(1, drawable);
        Uri d = C84896h.m145871d(str);
        boolean a2 = C89219l.m154714a((Object) d.getScheme(), (Object) "file");
        if (C84896h.m145869b(str) || C89159j.m154654e(new File(str)).length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (C84896h.m145866a(str, z) || !a2) {
            C84402a.m145166a(simpleDraweeView, d, i, i);
        } else if (dbVar == null || (a = dbVar.mo123709a(str)) == null || a.isRecycled()) {
            VEUtils.getVideoFrames(d.toString(), new int[]{0}, -1, i, false, new C71773a(simpleDraweeView, dbVar, str));
        } else {
            simpleDraweeView.setImageBitmap(a);
        }
    }
}
