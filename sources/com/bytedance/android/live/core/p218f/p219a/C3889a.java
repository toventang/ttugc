package com.bytedance.android.live.core.p218f.p219a;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.p1857h.AbstractC24256b;
import com.facebook.drawee.view.C24261b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.f.a.a */
public final class C3889a {

    /* renamed from: A */
    private ColorFilter f10745A;

    /* renamed from: B */
    private List<Drawable> f10746B;

    /* renamed from: C */
    private Drawable f10747C;

    /* renamed from: D */
    private boolean f10748D;

    /* renamed from: E */
    private boolean f10749E;

    /* renamed from: F */
    private boolean f10750F;

    /* renamed from: G */
    private boolean f10751G;

    /* renamed from: a */
    public C24261b<AbstractC24256b> f10752a;

    /* renamed from: b */
    public AbstractC24203d f10753b;

    /* renamed from: c */
    public Uri f10754c;

    /* renamed from: d */
    public ImageModel f10755d;

    /* renamed from: e */
    public C24229q.AbstractC24231b f10756e;

    /* renamed from: f */
    public PointF f10757f;

    /* renamed from: g */
    public C24250e f10758g;

    /* renamed from: h */
    public boolean f10759h;

    /* renamed from: i */
    private Context f10760i;

    /* renamed from: j */
    private boolean f10761j;

    /* renamed from: k */
    private View$OnAttachStateChangeListenerC3891a f10762k;

    /* renamed from: l */
    private AbstractC24641d f10763l;

    /* renamed from: m */
    private Uri f10764m;

    /* renamed from: n */
    private C24363d f10765n;

    /* renamed from: o */
    private float f10766o;

    /* renamed from: p */
    private boolean f10767p;

    /* renamed from: q */
    private int f10768q;

    /* renamed from: r */
    private Drawable f10769r;

    /* renamed from: s */
    private Drawable f10770s;

    /* renamed from: t */
    private Drawable f10771t;

    /* renamed from: u */
    private Drawable f10772u;

    /* renamed from: v */
    private Drawable f10773v;

    /* renamed from: w */
    private C24229q.AbstractC24231b f10774w;

    /* renamed from: x */
    private C24229q.AbstractC24231b f10775x;

    /* renamed from: y */
    private C24229q.AbstractC24231b f10776y;

    /* renamed from: z */
    private C24229q.AbstractC24231b f10777z;

    static {
        Covode.recordClassIndex(4418);
    }

    /* renamed from: a */
    public final C3889a mo9251a(String str) {
        this.f10754c = Uri.parse(str);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0208, code lost:
        if (r7 != -1) goto L_0x01e3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9252a(android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 534
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p218f.p219a.C3889a.mo9252a(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.f.a.a$1 */
    public static /* synthetic */ class C38901 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10778a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p218f.p219a.C3889a.C38901.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final C3889a mo9246a() {
        if (this.f10758g == null) {
            this.f10758g = new C24250e();
        }
        this.f10758g.f57500b = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.f.a.a$a */
    public class View$OnAttachStateChangeListenerC3891a implements View.OnAttachStateChangeListener, View.OnTouchListener {
        static {
            Covode.recordClassIndex(4420);
        }

        private View$OnAttachStateChangeListenerC3891a() {
        }

        public final void onViewAttachedToWindow(View view) {
            if (C3889a.this.f10752a != null) {
                C3889a.this.f10752a.mo40003b();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C3889a.this.f10752a != null) {
                C3889a.this.f10752a.mo40005c();
            }
        }

        /* synthetic */ View$OnAttachStateChangeListenerC3891a(C3889a aVar, byte b) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (C3889a.this.f10752a == null || !C3889a.this.f10752a.mo40002a(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static C3889a m9507a(Context context) {
        if (context != null) {
            return new C3889a(context);
        }
        throw new IllegalArgumentException("appContext == null");
    }

    /* renamed from: b */
    private static boolean m9511b(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    private C3889a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f10760i = applicationContext;
        this.f10762k = null;
        this.f10766o = 0.0f;
        this.f10767p = true;
        this.f10768q = 300;
        this.f10769r = null;
        this.f10774w = C24247b.f57476a;
        this.f10770s = null;
        this.f10775x = C24247b.f57476a;
        this.f10771t = null;
        this.f10776y = C24247b.f57476a;
        this.f10772u = null;
        this.f10777z = C24247b.f57476a;
        this.f10756e = C24247b.f57477b;
        this.f10757f = null;
        this.f10745A = null;
        this.f10773v = null;
        this.f10746B = null;
        this.f10747C = null;
        this.f10758g = null;
        this.f10748D = false;
        this.f10759h = false;
        this.f10749E = false;
        this.f10750F = false;
        this.f10751G = false;
        this.f10763l = null;
        this.f10753b = null;
        this.f10752a = null;
    }

    /* renamed from: a */
    public final C3889a mo9247a(int i) {
        this.f10769r = this.f10760i.getResources().getDrawable(i);
        return this;
    }

    /* renamed from: a */
    public final C3889a mo9249a(ImageView.ScaleType scaleType) {
        this.f10756e = m9508a(scaleType, C24247b.f57477b);
        return this;
    }

    /* renamed from: a */
    public final C3889a mo9250a(File file) {
        this.f10754c = Uri.fromFile(file);
        return this;
    }

    /* renamed from: a */
    public final C3889a mo9248a(int i, int i2) {
        this.f10765n = new C24363d(i, i2);
        return this;
    }

    /* renamed from: a */
    private static C24636b m9509a(Uri uri, C24363d dVar) {
        if (uri == null) {
            return null;
        }
        C24639c a = C24639c.m47149a(uri);
        if (dVar != null) {
            a.f58553d = dVar;
        }
        return a.mo40483a();
    }

    /* renamed from: a */
    private static C24229q.AbstractC24231b m9508a(ImageView.ScaleType scaleType, C24229q.AbstractC24231b bVar) {
        switch (C38901.f10778a[scaleType.ordinal()]) {
            case 1:
                return C24229q.AbstractC24231b.f57456f;
            case 2:
                return C24229q.AbstractC24231b.f57458h;
            case 3:
                return C24229q.AbstractC24231b.f57457g;
            case 4:
                return C24229q.AbstractC24231b.f57454d;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return C24229q.AbstractC24231b.f57453c;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return C24229q.AbstractC24231b.f57455e;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return C24229q.AbstractC24231b.f57452b;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return C24229q.AbstractC24231b.f57459i;
            default:
                return bVar;
        }
    }

    /* renamed from: a */
    private static C24636b[] m9510a(Uri uri, ImageModel imageModel, C24363d dVar, AbstractC24641d dVar2) {
        if (uri == null && (imageModel == null || C13617h.m24465a(imageModel.getUrls()))) {
            return new C24636b[0];
        }
        ArrayList arrayList = new ArrayList();
        C24636b a = m9509a(uri, dVar);
        if (a != null) {
            arrayList.add(a);
        }
        if (imageModel != null && !C13617h.m24465a(imageModel.getUrls())) {
            C3894c cVar = new C3894c();
            for (String str : imageModel.getUrls()) {
                if (!C13627m.m24498a(str)) {
                    C24639c a2 = C24639c.m47149a(Uri.parse(str));
                    if (dVar2 != null) {
                        a2.f58560k = dVar2;
                    }
                    if (dVar != null) {
                        a2.f58553d = dVar;
                    }
                    cVar.mo9259a(a2);
                    arrayList.add(a2.mo40483a());
                }
            }
        }
        if (arrayList.size() == 0) {
            return new C24636b[0];
        }
        return (C24636b[]) arrayList.toArray(new C24636b[arrayList.size()]);
    }
}
