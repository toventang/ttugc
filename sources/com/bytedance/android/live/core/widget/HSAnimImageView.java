package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3927c;
import com.bytedance.android.live.core.p218f.p220b.C3926e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.other.TTliveGeckoFileInfoReportEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.TTliveGeckoLoadResourceStateSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.fresco.animation.p1867c.AbstractC24295b;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import java.io.File;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class HSAnimImageView extends HSImageView {

    /* renamed from: d */
    public static int f11024d = -1;

    /* renamed from: e */
    public static int f11025e = -1;

    /* renamed from: f */
    public static int f11026f = -1;

    /* renamed from: g */
    public static int[] f11027g;

    /* renamed from: h */
    public static String[] f11028h;

    /* renamed from: i */
    public static final C4019a f11029i = new C4019a((byte) 0);

    /* renamed from: a */
    public AbstractC24295b f11030a;

    /* renamed from: b */
    public boolean f11031b = true;

    /* renamed from: c */
    public boolean f11032c;

    /* renamed from: j */
    private String f11033j = "";

    /* renamed from: k */
    private AbstractC24255a f11034k;

    /* renamed from: l */
    private C24290a f11035l;

    /* renamed from: a */
    public static final String m9804a(String str, String str2) {
        return f11029i.mo9399a(str, str2);
    }

    /* renamed from: b */
    public static final String m9805b(String str, String str2) {
        return f11029i.mo9400a(str, str2, false);
    }

    /* renamed from: com.bytedance.android.live.core.widget.HSAnimImageView$a */
    public static final class C4019a {
        static {
            Covode.recordClassIndex(4557);
        }

        private C4019a() {
        }

        public /* synthetic */ C4019a(byte b) {
            this();
        }

        /* renamed from: a */
        private static String m9812a(String str) {
            C89219l.m154721d(str, "");
            if (!TextUtils.isEmpty(str)) {
                return "file://".concat(String.valueOf(str));
            }
            return "";
        }

        /* renamed from: a */
        public final String mo9399a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return mo9400a(str, str2, false);
        }

        /* renamed from: d */
        private static boolean m9819d(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            File tTLiveGeckoResourceFile = ((IHostContext) C6193a.m13435a(IHostContext.class)).getTTLiveGeckoResourceFile(str, str2);
            if (tTLiveGeckoResourceFile != null) {
                return tTLiveGeckoResourceFile.exists();
            }
            return false;
        }

        /* renamed from: b */
        private static String m9815b(String str, String str2) {
            IHostContext iHostContext;
            File tTLiveGeckoResourceFile;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class)) == null || (tTLiveGeckoResourceFile = iHostContext.getTTLiveGeckoResourceFile(str, str2)) == null || !tTLiveGeckoResourceFile.exists()) {
                return "";
            }
            String absolutePath = tTLiveGeckoResourceFile.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            return m9812a(absolutePath);
        }

        /* renamed from: c */
        private static String m9818c(String str, String str2) {
            IHostContext iHostContext;
            String tTLiveGeckoCdnUrl;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class)) == null || (tTLiveGeckoCdnUrl = iHostContext.getTTLiveGeckoCdnUrl(str, str2)) == null) {
                return "";
            }
            return tTLiveGeckoCdnUrl;
        }

        /* renamed from: a */
        private static String m9811a(int i, String str, String str2) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                while (i >= 0) {
                    String[] strArr = HSAnimImageView.f11028h;
                    if (strArr == null) {
                        C89219l.m154710a("mArrayValue");
                    }
                    String str3 = strArr[i];
                    if (m9819d(str, str3 + File.separator + str2)) {
                        return str3;
                    }
                    i--;
                }
            }
            return "";
        }

        /* renamed from: b */
        private final String m9816b(String str, String str2, boolean z) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                m9814a(str, str2, "", "", z);
                return "";
            }
            String a = m9813a(str, str2, z, false);
            if (TextUtils.isEmpty(a)) {
                a = m9817b(str, str2, z, false);
            }
            m9814a(str, str2, "", a, z);
            return a;
        }

        /* renamed from: a */
        public final String mo9400a(String str, String str2, boolean z) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                m9814a(str, str2, "", "", z);
                return "";
            }
            int value = TTliveGeckoLoadResourceStateSetting.INSTANCE.getValue();
            if (value == 1) {
                return m9813a(str, str2, z, true);
            }
            if (value != 2) {
                return m9816b(str, str2, z);
            }
            return m9817b(str, str2, z, true);
        }

        /* renamed from: a */
        private static String m9813a(String str, String str2, boolean z, boolean z2) {
            String b;
            Context applicationContext;
            String str3 = "";
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                if (z2) {
                    m9814a(str, str2, str3, str3, z);
                }
                return str3;
            }
            if (z && (applicationContext = GlobalContext.getApplicationContext()) != null) {
                if (HSAnimImageView.f11024d <= 0) {
                    C3926e a = C3927c.m9564a(applicationContext);
                    HSAnimImageView.f11024d = a.f10805a;
                    HSAnimImageView.f11025e = a.f10806b;
                    HSAnimImageView.f11026f = a.f10807c;
                }
                if (HSAnimImageView.f11027g == null || HSAnimImageView.f11028h == null) {
                    HSAnimImageView.f11027g = new int[]{120, 160, 240, 320, 480, 640};
                    HSAnimImageView.f11028h = new String[]{"ldpi", "mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi"};
                }
                int[] iArr = HSAnimImageView.f11027g;
                if (iArr == null) {
                    C89219l.m154710a("mArrayKey");
                }
                int length = iArr.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int[] iArr2 = HSAnimImageView.f11027g;
                    if (iArr2 == null) {
                        C89219l.m154710a("mArrayKey");
                    }
                    if (iArr2[i2] >= HSAnimImageView.f11024d) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    int[] iArr3 = HSAnimImageView.f11027g;
                    if (iArr3 == null) {
                        C89219l.m154710a("mArrayKey");
                    }
                    int length2 = iArr3.length;
                    int i3 = i;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        String[] strArr = HSAnimImageView.f11028h;
                        if (strArr == null) {
                            C89219l.m154710a("mArrayValue");
                        }
                        String str4 = strArr[i3];
                        if (m9819d(str, str4 + File.separator + str2)) {
                            str3 = str4;
                            break;
                        }
                        i3++;
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = m9811a(i, str, str2);
                }
            }
            if (TextUtils.isEmpty(str3)) {
                b = m9815b(str, str2);
            } else {
                b = m9815b(str, str3 + File.separator + str2);
            }
            if (z2) {
                m9814a(str, str2, str3, b, z);
            }
            return b;
        }

        /* renamed from: b */
        private static String m9817b(String str, String str2, boolean z, boolean z2) {
            String c;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                if (z2) {
                    m9814a(str, str2, "", "", z);
                }
                return "";
            }
            if (z) {
                c = m9818c(str, "xhdpi" + File.separator + str2);
            } else {
                c = m9818c(str, str2);
            }
            if (z2) {
                m9814a(str, str2, "", c, z);
            }
            return c;
        }

        /* renamed from: a */
        private static void m9814a(String str, String str2, String str3, String str4, boolean z) {
            Context applicationContext;
            if (TTliveGeckoFileInfoReportEnableSetting.INSTANCE.getValue()) {
                HashMap hashMap = new HashMap();
                hashMap.put("channel", str);
                hashMap.put("filename", str2);
                hashMap.put("drawable", str3);
                hashMap.put("path", str4);
                hashMap.put("use_resolution", Integer.valueOf(!z ? 1 : 0));
                hashMap.put("is_use_resolution", Integer.valueOf(TextUtils.isEmpty(str3) ? 1 : 0));
                if ((HSAnimImageView.f11024d <= 0 || HSAnimImageView.f11025e <= 0 || HSAnimImageView.f11026f <= 0) && (applicationContext = GlobalContext.getApplicationContext()) != null) {
                    C3926e a = C3927c.m9564a(applicationContext);
                    HSAnimImageView.f11024d = a.f10805a;
                    HSAnimImageView.f11025e = a.f10806b;
                    HSAnimImageView.f11026f = a.f10807c;
                }
                hashMap.put("dpi", Integer.valueOf(HSAnimImageView.f11024d));
                hashMap.put("width", Integer.valueOf(HSAnimImageView.f11025e));
                hashMap.put("height", Integer.valueOf(HSAnimImageView.f11026f));
                C3868c.m9491a("ttlive_gecko_file_info_report", 1, hashMap);
            }
        }
    }

    public final C24290a getAnimatedDrawable2() {
        return this.f11035l;
    }

    public final boolean getUseWrapContent() {
        return this.f11032c;
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: b */
    public final void mo9391b() {
        this.f11031b = false;
        C24290a aVar = this.f11035l;
        if (aVar != null) {
            aVar.stop();
        }
    }

    /* renamed from: c */
    public final boolean mo9392c() {
        C24290a aVar = this.f11035l;
        if (aVar != null) {
            return aVar.isRunning();
        }
        return false;
    }

    static {
        Covode.recordClassIndex(4556);
    }

    /* renamed from: a */
    public final void mo9390a() {
        this.f11031b = true;
        if (this.f11034k == null) {
            C24185e a = C24182c.m45843b().mo39797a(this.f11033j);
            a.f57306j = false;
            a.f57303g = new C4020b(this);
            this.f11034k = a.mo39827e();
        }
        setController(this.f11034k);
    }

    public final void setAnimatedDrawable2(C24290a aVar) {
        this.f11035l = aVar;
    }

    public final void setAutoPlay(boolean z) {
        this.f11031b = z;
    }

    public final void setUseWrapContent(boolean z) {
        this.f11032c = z;
    }

    /* renamed from: com.bytedance.android.live.core.widget.HSAnimImageView$b */
    public static final class C4020b implements AbstractC24203d<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ HSAnimImageView f11036a;

        static {
            Covode.recordClassIndex(4558);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4020b(HSAnimImageView hSAnimImageView) {
            this.f11036a = hSAnimImageView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            AbstractC24457f fVar2 = fVar;
            if (this.f11036a.getUseWrapContent() && fVar2 != null) {
                HSAnimImageView hSAnimImageView = this.f11036a;
                int width = fVar2.getWidth();
                int height = fVar2.getHeight();
                int measuredWidth = hSAnimImageView.getMeasuredWidth();
                int measuredHeight = hSAnimImageView.getMeasuredHeight();
                if (measuredHeight > measuredWidth) {
                    measuredWidth = (width / height) * measuredHeight;
                } else {
                    measuredHeight = (height / width) * measuredWidth;
                }
                hSAnimImageView.getLayoutParams().height = measuredHeight;
                hSAnimImageView.getLayoutParams().width = measuredWidth;
                hSAnimImageView.setLayoutParams(hSAnimImageView.getLayoutParams());
            }
            if (animatable instanceof C24290a) {
                C24290a aVar = (C24290a) animatable;
                aVar.mo40070a(this.f11036a.f11030a);
                if (this.f11036a.f11031b) {
                    animatable.start();
                }
                this.f11036a.setAnimatedDrawable2(aVar);
            }
        }
    }

    public HSAnimImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final HSAnimImageView mo9388a(AbstractC24295b bVar) {
        C89219l.m154721d(bVar, "");
        this.f11030a = bVar;
        return this;
    }

    /* renamed from: a */
    public final HSAnimImageView mo9389a(String str) {
        C89219l.m154721d(str, "");
        this.f11033j = str;
        return this;
    }

    public HSAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
