package com.p2082ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.extract.C78549k;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.util.Date;
import java.util.Locale;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.photo.m */
final /* synthetic */ class C62878m implements AbstractC88983w {

    /* renamed from: a */
    private final PhotoModule f142601a;

    /* renamed from: b */
    private final int f142602b;

    /* renamed from: c */
    private final int f142603c;

    static {
        Covode.recordClassIndex(73710);
    }

    C62878m(PhotoModule photoModule, int i, int i2) {
        this.f142601a = photoModule;
        this.f142602b = i;
        this.f142603c = i2;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        PhotoModule photoModule = this.f142601a;
        int i = this.f142602b;
        int i2 = this.f142603c;
        C62857b bVar = photoModule.f142538c;
        String str = bVar.f142551c == Bitmap.CompressFormat.JPEG ? ".jpeg" : ".png";
        Locale locale = Locale.getDefault();
        String concat = "%s/IMG_%s".concat(str);
        StringBuilder append = new StringBuilder().append(bVar.f142552d.format(new Date())).append("_");
        int i3 = C62857b.f142549a + 1;
        C62857b.f142549a = i3;
        String a = C1764a.m5929a(locale, concat, new Object[]{bVar.f142550b, append.append(i3).append("_frame").toString()});
        C84902i.m145896b(a);
        int i4 = C78549k.f176544a[0];
        if (i4 < i) {
            double d = (double) i4;
            double d2 = (double) i2;
            Double.isNaN(d2);
            double d3 = (double) i;
            Double.isNaN(d3);
            Double.isNaN(d);
            i2 = (int) (d * ((d2 * 1.0d) / d3));
        } else {
            i4 = i;
        }
        photoModule.f142536a.mo56599a(a, i4, i2, false, Bitmap.CompressFormat.JPEG, (AbstractC89172b<? super Integer, C89391z>) new C62880o(vVar, a), false);
    }
}
