package com.bytedance.android.livesdk.chatroom.p492g;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p219a.C3894c;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.C24261b;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.trill.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.g */
public final class C7577g {

    /* renamed from: com.bytedance.android.livesdk.chatroom.g.g$a */
    public interface AbstractC7582a {
        static {
            Covode.recordClassIndex(8355);
        }

        /* renamed from: a */
        void mo13827a();

        /* renamed from: a */
        void mo13828a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(8350);
    }

    /* renamed from: a */
    public static AbstractC88979t<Bitmap> m15569a(ImageModel imageModel) {
        return AbstractC88979t.m154294a(new C7583h(imageModel));
    }

    /* renamed from: a */
    public static Rect m15568a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        order.get();
        order.get();
        order.get();
        order.getInt();
        order.getInt();
        Rect rect = new Rect();
        rect.left = order.getInt();
        rect.right = order.getInt();
        rect.top = order.getInt();
        rect.bottom = order.getInt();
        return rect;
    }

    /* renamed from: b */
    public static C24636b[] m15576b(ImageModel imageModel) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C3894c cVar = new C3894c();
        for (String str : imageModel.getUrls()) {
            if (!C13627m.m24498a(str)) {
                C24639c a = C24639c.m47149a(Uri.parse(str));
                cVar.mo9259a(a);
                arrayList.add(a.mo40483a());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (C24636b[]) arrayList.toArray(new C24636b[arrayList.size()]);
    }

    /* renamed from: c */
    public static Drawable m15577c(ImageModel imageModel) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        C24185e eVar = (C24185e) C24182c.m45843b().mo39823a(m15576b(imageModel));
        eVar.f57306j = true;
        AbstractC24195a c = eVar.mo39827e();
        C24246a a = new C24247b(C3966y.m9655a()).mo39973a();
        C3966y.m9669e();
        C24261b a2 = C24261b.m46095a(a);
        a2.mo40001a(c);
        return a2.mo40008f();
    }

    /* renamed from: b */
    public static void m15575b(HSImageView hSImageView, ImageModel imageModel) {
        C3951p.m9631b(hSImageView, imageModel, R.drawable.bqr, 2);
    }

    /* renamed from: a */
    public static void m15573a(HSImageView hSImageView, ImageModel imageModel) {
        C3941k.m9609a(hSImageView, imageModel, C3941k.m9596a(), null, null, false);
    }

    /* renamed from: a */
    public static byte[] m15574a(byte[] bArr, float f) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.allocate(bArr.length).order(ByteOrder.nativeOrder());
        ByteBuffer order2 = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order2.get() == 0) {
            return null;
        }
        order.put((byte) 1);
        int i = order2.get();
        int[] iArr = new int[i];
        int i2 = order2.get();
        int[] iArr2 = new int[i2];
        int i3 = order2.get();
        int[] iArr3 = new int[i3];
        order.put((byte) i);
        order.put((byte) i2);
        order.put((byte) i3);
        order.putInt(order2.getInt());
        order.putInt(order2.getInt());
        order.putInt((int) (((float) order2.getInt()) * f));
        order.putInt((int) (((float) order2.getInt()) * f));
        order.putInt((int) (((float) order2.getInt()) * f));
        order.putInt((int) (((float) order2.getInt()) * f));
        order.putInt(order2.getInt());
        iArr[0] = order2.getInt();
        iArr[1] = order2.getInt();
        order.putInt((int) (((float) iArr[0]) * f));
        order.putInt((int) (((float) iArr[1]) * f));
        iArr2[0] = order2.getInt();
        iArr2[1] = order2.getInt();
        order.putInt((int) (((float) iArr2[0]) * f));
        order.putInt((int) (((float) iArr2[1]) * f));
        for (int i4 = 0; i4 < i3; i4++) {
            order.putInt(order2.getInt());
        }
        return order.array();
    }

    /* renamed from: a */
    public static void m15570a(ImageView imageView, ImageModel imageModel, int i) {
        C3951p.m9624a(imageView, imageModel, 0, 0, i, null);
    }

    /* renamed from: a */
    public static void m15572a(ImageView imageView, ImageModel imageModel, C3951p.AbstractC3953a aVar) {
        C3951p.m9624a(imageView, imageModel, -1, -1, -1, aVar);
    }

    /* renamed from: a */
    public static void m15571a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        C3951p.m9624a(imageView, imageModel, i, i2, i3, null);
    }
}
