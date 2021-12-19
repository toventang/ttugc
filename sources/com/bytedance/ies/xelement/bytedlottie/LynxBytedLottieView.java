package com.bytedance.ies.xelement.bytedlottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.bytedlottie.p1365a.C19046a;
import com.bytedance.ies.xelement.bytedlottie.p1365a.C19047b;
import com.bytedance.ies.xelement.p1362a.AbstractC18943a;
import com.bytedance.ies.xelement.p1362a.C18945c;
import com.bytedance.ies.xelement.p1362a.EnumC18944b;
import com.bytedance.lottie.AbstractC20932a;
import com.bytedance.lottie.AbstractC21037d;
import com.bytedance.lottie.AbstractC21078f;
import com.bytedance.lottie.AbstractC21120l;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.C21094h;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.C21118j;
import com.bytedance.lottie.C21122n;
import com.bytedance.lottie.C21127q;
import com.bytedance.lottie.LottieAnimationView;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1878c.C24359g;
import com.facebook.imagepipeline.p1881f.AbstractC24436c;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28724b;
import com.lynx.tasm.p2062ui.image.p2064b.C28884b;
import com.lynx.tasm.utils.C28929m;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

public final class LynxBytedLottieView extends LynxUI<LottieAnimationView> implements AbstractC21037d {

    /* renamed from: y */
    public static final C19025b f45035y = new C19025b((byte) 0);

    /* renamed from: A */
    private Set<String> f45036A;

    /* renamed from: B */
    private boolean f45037B;

    /* renamed from: C */
    private AbstractC18943a<C18945c> f45038C;

    /* renamed from: D */
    private int f45039D;

    /* renamed from: E */
    private int f45040E;

    /* renamed from: a */
    public boolean f45041a;

    /* renamed from: b */
    public boolean f45042b;

    /* renamed from: c */
    public int f45043c;

    /* renamed from: d */
    public int f45044d;

    /* renamed from: e */
    public int f45045e;

    /* renamed from: f */
    public String f45046f;

    /* renamed from: g */
    public String f45047g;

    /* renamed from: h */
    public EnumC18944b f45048h;

    /* renamed from: i */
    public boolean f45049i;

    /* renamed from: j */
    public boolean f45050j;

    /* renamed from: k */
    public boolean f45051k;

    /* renamed from: l */
    public boolean f45052l;

    /* renamed from: m */
    public String f45053m;

    /* renamed from: n */
    public ReadableMap f45054n;

    /* renamed from: o */
    public final List<Integer> f45055o;

    /* renamed from: p */
    public final List<Integer> f45056p;

    /* renamed from: q */
    public final C19050b f45057q;

    /* renamed from: r */
    public C21088g f45058r;

    /* renamed from: s */
    public C19045a f45059s;

    /* renamed from: t */
    public String f45060t;

    /* renamed from: u */
    public ArrayList<C24117a<?>> f45061u;

    /* renamed from: v */
    public boolean f45062v;

    /* renamed from: w */
    public volatile boolean f45063w;

    /* renamed from: x */
    public AbstractC20932a f45064x;

    /* renamed from: z */
    private boolean f45065z;

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$a */
    public interface AbstractC19024a {
        static {
            Covode.recordClassIndex(21787);
        }

        /* renamed from: a */
        void mo30311a(Bitmap bitmap, String str);

        /* renamed from: a */
        void mo30312a(String str);
    }

    static {
        Covode.recordClassIndex(21784);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            float f = 0.0f;
            int i = -1;
            boolean z = true;
            boolean z2 = true;
            boolean z3 = true;
            int i2 = 1;
            int i3 = 0;
            boolean z4 = false;
            int i4 = 0;
            boolean z5 = false;
            boolean z6 = false;
            switch (nextKey.hashCode()) {
                case -1796070362:
                    if (nextKey.equals("playstatus")) {
                        setPlayStatus(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1566748085:
                    if (nextKey.equals("startframe")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setStartFrame(i3);
                        continue;
                    }
                    break;
                case -1489589134:
                    if (nextKey.equals("objectfit")) {
                        setObjectFit(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1001078227:
                    if (nextKey.equals("progress")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setProgress(f);
                        continue;
                    }
                    break;
                case -939482614:
                    if (nextKey.equals("only-local")) {
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, false);
                        }
                        setOnlyLocal(z6);
                        continue;
                    }
                    break;
                case -795328846:
                    if (nextKey.equals("keeplastframe")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setKeepLastFrame(z);
                        continue;
                    }
                    break;
                case -629825370:
                    if (nextKey.equals("loop-count")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 1);
                        }
                        setLoopCount(i2);
                        continue;
                    }
                    break;
                case -261882880:
                    if (nextKey.equals("src-format")) {
                        setSrcFormat(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 97533:
                    if (nextKey.equals("bid")) {
                        setBID(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSrc(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3271912:
                    if (nextKey.equals("json")) {
                        setJson(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3327652:
                    if (nextKey.equals("loop")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setLoop(z5);
                        continue;
                    }
                    break;
                case 109641799:
                    if (nextKey.equals("speed")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setSpeed(f);
                        continue;
                    }
                    break;
                case 110620997:
                    if (nextKey.equals("trace")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, true);
                        }
                        setTraceEnabled(z3);
                        continue;
                    }
                    break;
                case 508360187:
                    if (nextKey.equals("end-frame")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, -1);
                        }
                        setEndFrame2(i);
                        continue;
                    }
                    break;
                case 1327968322:
                    if (nextKey.equals("start-frame")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setStartFrame2(i4);
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        setAutoPlay(z2);
                        continue;
                    }
                    break;
                case 1688643203:
                    if (nextKey.equals("repetcount")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, -1);
                        }
                        setRepeat(i);
                        continue;
                    }
                    break;
                case 1731948914:
                    if (nextKey.equals("endframe")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, -1);
                        }
                        setEndFrame(i);
                        continue;
                    }
                    break;
                case 1821306136:
                    if (nextKey.equals("src-polyfill")) {
                        setSrcPolyfill(readableMap.getMap(nextKey));
                        continue;
                    }
                    break;
                case 1978397892:
                    if (nextKey.equals("auto-reverse")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, false);
                        }
                        setReverseMode(z4);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @AbstractC28525m(mo49059a = "trace", mo49064f = true)
    public final void setTraceEnabled(boolean z) {
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$b */
    public static final class C19025b {
        static {
            Covode.recordClassIndex(21788);
        }

        private C19025b() {
        }

        public /* synthetic */ C19025b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$p */
    public static final class C19043p extends C28724b {

        /* renamed from: a */
        final /* synthetic */ LynxBytedLottieView f45116a;

        /* renamed from: b */
        final /* synthetic */ Map f45117b;

        /* renamed from: c */
        final /* synthetic */ String f45118c;

        static {
            Covode.recordClassIndex(21806);
        }

        @Override // com.lynx.tasm.p2054c.C28724b
        /* renamed from: b */
        public final String mo30328b() {
            return "detail";
        }

        @Override // com.lynx.tasm.p2054c.C28724b
        /* renamed from: a */
        public final Map<String, Object> mo30096a() {
            return this.f45117b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19043p(LynxBytedLottieView lynxBytedLottieView, Map map, String str, int i, String str2) {
            super(i, str2);
            this.f45116a = lynxBytedLottieView;
            this.f45117b = map;
            this.f45118c = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011d A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30272a(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.mo30272a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo30275a(String str, Map<String, Object> map) {
        AbstractC28520j jVar;
        C28719c cVar;
        Set<String> set = this.f45036A;
        if (set != null && set.contains(str) && (jVar = this.mContext) != null && (cVar = jVar.f67064e) != null) {
            cVar.mo49834a(new C19043p(this, map, str, getSign(), str));
        }
    }

    @Override // com.bytedance.lottie.AbstractC21037d
    /* renamed from: a */
    public final void mo30271a(C21118j jVar, AbstractC21078f<Bitmap> fVar) {
        T t;
        C89219l.m154719c(fVar, "");
        if (TextUtils.isEmpty(this.f45046f) || jVar == null) {
            LLog.m56862d("byted-lottie", "fetchBitmap error mSrcUrl=`" + this.f45046f + "`, or asset is null");
        } else if (!this.f45051k) {
            LLog.m56862d("byted-lottie", "fetchBitmapAsync error, one bitmap is already fetch fail before this, and mSrcUrl=`" + this.f45046f + "`,");
        } else {
            String str = jVar.f50072d;
            C89219l.m154709a((Object) str, "");
            if (C89361p.m154874b(str, "data:", false)) {
                LLog.m56860b("byted-lottie", "fetchBitmapAsync with base64");
                fVar.mo30326a(C19046a.m35390a(jVar.f50072d));
            } else if (this.f45049i) {
                String c = mo30278c(jVar.f50073e + jVar.f50072d);
                m35357a(c, jVar, new C19034i(this, fVar, c));
            } else {
                String str2 = this.f45046f;
                if (str2 == null) {
                    return;
                }
                if (C89361p.m154874b(str2, "http://", false) || C89361p.m154874b(str2, "https://", false) || C89361p.m154874b(str2, "file:/", false) || C89361p.m154874b(str2, "asset://", false)) {
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    ReadableMap readableMap = this.f45054n;
                    if (readableMap == null || !readableMap.hasKey(jVar.f50071c) || (t = (T) (jVar.f50073e + readableMap.getString(jVar.f50071c))) == null) {
                        t = (T) (jVar.f50073e + jVar.f50072d);
                    }
                    eVar.element = t;
                    eVar.element = (C89361p.m154874b(eVar.element, "http://", false) || C89361p.m154874b(eVar.element, "https://", false)) ? eVar.element : (T) (str2 + '/' + ((String) eVar.element));
                    m35357a(eVar.element, jVar, new C19033h(eVar, this, jVar, fVar));
                    return;
                }
                mo30273a("use mSrcDir, the schema of mSrcDir is not supported, mSrcDir: " + this.f45046f, str2, 1);
                mo30275a("error", m35355a(1, "request resource from " + this.f45046f + " failed"));
                LLog.m56862d("byted-lottie", "fetchBitmap mSrcUrl=`" + this.f45046f + "`, url=`" + this.f45046f + "` not exists. lottieUrl is " + this.f45047g);
                fVar.mo30325a();
            }
        }
    }

    /* renamed from: a */
    public final void mo30274a(String str, String str2, C21118j jVar, AbstractC19024a aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(aVar, "");
        String a = C28621a.m57207a(this.mContext, str);
        LLog.m56860b("byted-lottie", "requestBitmap: ".concat(String.valueOf(a)));
        Uri parse = Uri.parse(a);
        if (parse == null || parse.getPath() == null) {
            this.f45051k = false;
            aVar.mo30312a("uri.path is null and uri is ".concat(String.valueOf(parse)));
            return;
        }
        C24639c a2 = C24639c.m47149a(parse).mo40484a(EnumC24362c.HIGH);
        C28884b.m57860a(a2);
        String path = parse.getPath();
        if (path != null && !jVar.f50074f) {
            C89219l.m154709a((Object) a2, "");
            a2.mo40485a(new C19041n(path, this, jVar, a2));
        }
        AbstractC24157c<C24117a<AbstractC24454c>> a3 = C24182c.m45844c().mo40224a(a2.mo40483a(), "byted-lottie");
        if (a3 == null) {
            aVar.mo30312a(str);
        } else {
            a3.mo39739a(new C19042o(this, a, aVar, jVar, str2, a3), C24065a.m45575a());
        }
    }

    /* renamed from: a */
    public final void mo30273a(String str, String str2, int i) {
        mo30275a("error", m35355a(i, str));
        this.f45057q.mo30339a(this.f45047g, str2, str);
        LLog.m56862d("byted-lottie", str);
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$c */
    public final class C19026c implements AbstractC20932a {

        /* renamed from: b */
        private final String f45067b;

        static {
            Covode.recordClassIndex(21789);
        }

        /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$c$a */
        static final class RunnableC19027a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C19026c f45068a;

            /* renamed from: b */
            final /* synthetic */ C21088g f45069b;

            static {
                Covode.recordClassIndex(21790);
            }

            RunnableC19027a(C19026c cVar, C21088g gVar) {
                this.f45068a = cVar;
                this.f45069b = gVar;
            }

            public final void run() {
                ((LottieAnimationView) LynxBytedLottieView.this.mView).setComposition(this.f45069b);
            }
        }

        @Override // com.bytedance.lottie.AbstractC20932a
        /* renamed from: a */
        public final void mo30313a(C21088g gVar) {
            C89219l.m154719c(gVar, "");
            String str = this.f45067b;
            if (str != null && C89219l.m154714a((Object) str, (Object) LynxBytedLottieView.this.f45047g)) {
                C28929m.m57947a(new RunnableC19027a(this, gVar));
            }
        }

        @Override // com.bytedance.lottie.AbstractC20932a
        /* renamed from: a */
        public final void mo30314a(String str) {
            String str2 = "";
            C89219l.m154719c(str, str2);
            String str3 = this.f45067b;
            if (str3 != null && C89219l.m154714a((Object) str3, (Object) LynxBytedLottieView.this.f45047g) && (!C89361p.m154870a((CharSequence) str))) {
                LynxBytedLottieView lynxBytedLottieView = LynxBytedLottieView.this;
                String str4 = lynxBytedLottieView.f45047g;
                if (str4 != null) {
                    str2 = str4;
                }
                lynxBytedLottieView.mo30273a(str, str2, 1);
            }
        }

        public C19026c(String str) {
            this.f45067b = str;
        }
    }

    @Override // com.bytedance.lottie.AbstractC20975c
    /* renamed from: b */
    public final Bitmap mo30276b() {
        LLog.m56862d("byted-lottie", "fetch bitmap should not be called!!!");
        return null;
    }

    /* renamed from: c */
    private final void m35358c() {
        if (this.f45046f != null) {
            this.f45046f = null;
            this.f45051k = true;
            ((LottieAnimationView) this.mView).setImageDrawable(null);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.mView;
            if (lottieAnimationView != null) {
                lottieAnimationView.setImageAssetDelegate(null);
                lottieAnimationView.mo34416h();
            }
        }
    }

    /* renamed from: d */
    private final void m35359d() {
        Iterator<C24117a<?>> it = this.f45061u.iterator();
        while (it.hasNext()) {
            C24117a.m45712c(it.next());
        }
        this.f45061u.clear();
    }

    public final void finalize() {
        MethodCollector.m26663i(2470);
        synchronized (this) {
            try {
                m35359d();
                this.f45063w = true;
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                MethodCollector.m26664o(2470);
                throw th;
            }
        }
        MethodCollector.m26664o(2470);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.f45042b && !this.f45065z && !this.f45037B && this.f45051k) {
            ((LottieAnimationView) this.mView).mo34398c();
        }
        this.f45037B = false;
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$m */
    public static final class C19040m implements AbstractC21078f<String> {

        /* renamed from: a */
        final /* synthetic */ C21088g f45104a;

        /* renamed from: b */
        final /* synthetic */ LynxBytedLottieView f45105b;

        static {
            Covode.recordClassIndex(21803);
        }

        @Override // com.bytedance.lottie.AbstractC21078f
        /* renamed from: a */
        public final void mo30325a() {
            this.f45105b.mo30275a("error", LynxBytedLottieView.m35355a(1, "fetch polyfill bitmap " + this.f45105b.f45054n + " failed"));
            LLog.m56862d("byted-lottie", "fetch polyfill Bitmap mSrcUrl=" + this.f45105b.f45046f + ", filePath=" + this.f45105b.f45054n + " not exists.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.lottie.AbstractC21078f
        /* renamed from: a */
        public final /* synthetic */ void mo30326a(String str) {
            int i;
            float f;
            C21088g composition;
            C89219l.m154719c(str, "");
            LynxBytedLottieView lynxBytedLottieView = this.f45105b;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView != null) {
                i = lottieAnimationView.getFrame();
            } else {
                i = 0;
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f45105b.mView;
            if (lottieAnimationView2 == null || (composition = lottieAnimationView2.getComposition()) == null) {
                f = 0.0f;
            } else {
                f = composition.mo34564b();
            }
            lynxBytedLottieView.mo30275a("ready", LynxBytedLottieView.m35354a(i, (int) f, this.f45105b.f45045e, this.f45105b.f45053m));
            this.f45105b.f45057q.mo30340b(this.f45105b.f45047g);
            if (this.f45105b.f45042b && this.f45105b.f45051k) {
                ((LottieAnimationView) this.f45105b.mView).mo34398c();
            }
        }

        C19040m(C21088g gVar, LynxBytedLottieView lynxBytedLottieView) {
            this.f45104a = gVar;
            this.f45105b = lynxBytedLottieView;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void destroy() {
        MethodCollector.m26663i(2466);
        super.destroy();
        ((LottieAnimationView) this.mView).mo34401f();
        ((LottieAnimationView) this.mView).mo34400e();
        ((LottieAnimationView) this.mView).mo34419j();
        ((LottieAnimationView) this.mView).mo34416h();
        synchronized (this) {
            try {
                m35359d();
                View view = this.mView;
                if (!(view instanceof LynxBytedLottieAnimationView)) {
                    view = null;
                }
                LynxBytedLottieAnimationView lynxBytedLottieAnimationView = (LynxBytedLottieAnimationView) view;
                if (lynxBytedLottieAnimationView != null) {
                    lynxBytedLottieAnimationView.setDestroyed(true);
                }
                this.f45063w = true;
            } finally {
                MethodCollector.m26664o(2466);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$j */
    public static final class CallableC19035j<V> implements Callable<C21122n<String>> {

        /* renamed from: a */
        final /* synthetic */ LynxBytedLottieView f45084a;

        /* renamed from: b */
        final /* synthetic */ ReadableMap f45085b;

        /* renamed from: c */
        final /* synthetic */ AbstractC21078f f45086c;

        /* renamed from: d */
        final /* synthetic */ C21088g f45087d;

        static {
            Covode.recordClassIndex(21798);
        }

        CallableC19035j(LynxBytedLottieView lynxBytedLottieView, ReadableMap readableMap, AbstractC21078f fVar, C21088g gVar) {
            this.f45084a = lynxBytedLottieView;
            this.f45085b = readableMap;
            this.f45086c = fVar;
            this.f45087d = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C21122n<String> call() {
            ReadableMapKeySetIterator keySetIterator = this.f45085b.keySetIterator();
            HashMap hashMap = new HashMap();
            if (this.f45085b.size() == 0) {
                this.f45086c.mo30326a("");
                return new C21122n("");
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f45085b.size());
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                String string = this.f45085b.getString(nextKey);
                C21118j jVar = this.f45087d.f49971c.get(nextKey);
                if (jVar != null) {
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = (T) (jVar.f50073e + string);
                    eVar.element = (C89361p.m154874b(eVar.element, "http://", false) || C89361p.m154874b(eVar.element, "https://", false)) ? eVar.element : (T) (this.f45084a.f45046f + '/' + ((String) eVar.element));
                    LynxBytedLottieView lynxBytedLottieView = this.f45084a;
                    String c = lynxBytedLottieView.mo30278c(eVar.element);
                    C89219l.m154709a((Object) nextKey, "");
                    lynxBytedLottieView.mo30274a(c, nextKey, jVar, new C19036a(eVar, this, string, nextKey, hashMap, atomicInteger));
                }
            }
            return new C21122n("");
        }

        /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$j$a */
        public static final class C19036a implements AbstractC19024a {

            /* renamed from: a */
            final /* synthetic */ C89233z.C89238e f45088a;

            /* renamed from: b */
            final /* synthetic */ CallableC19035j f45089b;

            /* renamed from: c */
            final /* synthetic */ String f45090c;

            /* renamed from: d */
            final /* synthetic */ String f45091d;

            /* renamed from: e */
            final /* synthetic */ HashMap f45092e;

            /* renamed from: f */
            final /* synthetic */ AtomicInteger f45093f;

            static {
                Covode.recordClassIndex(21799);
            }

            @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.AbstractC19024a
            /* renamed from: a */
            public final void mo30312a(String str) {
                C89219l.m154719c(str, "");
                if (!C89361p.m154870a((CharSequence) str)) {
                    this.f45089b.f45084a.mo30273a("fetch polyfill bitmap failed, map: " + this.f45089b.f45085b + ", path: " + ((String) this.f45088a.element) + ", msg: " + str, this.f45088a.element, 1);
                }
                this.f45089b.f45086c.mo30325a();
            }

            @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.AbstractC19024a
            /* renamed from: a */
            public final void mo30311a(final Bitmap bitmap, final String str) {
                C89219l.m154719c(bitmap, "");
                C89219l.m154719c(str, "");
                C28929m.m57947a(new Runnable(this) {
                    /* class com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.CallableC19035j.C19036a.RunnableC190371 */

                    /* renamed from: a */
                    final /* synthetic */ C19036a f45094a;

                    static {
                        Covode.recordClassIndex(21800);
                    }

                    {
                        this.f45094a = r1;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap */
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void run() {
                        this.f45094a.f45092e.put(str, bitmap);
                        if (this.f45094a.f45093f.decrementAndGet() == 0) {
                            for (Map.Entry entry : this.f45094a.f45092e.entrySet()) {
                                Object key = entry.getKey();
                                Bitmap bitmap = (Bitmap) entry.getValue();
                                C21118j jVar = this.f45094a.f45089b.f45087d.f49971c.get(key);
                                if (jVar != null) {
                                    jVar.f50075g = bitmap;
                                }
                            }
                            this.f45094a.f45089b.f45086c.mo30326a("");
                        }
                    }
                });
            }

            C19036a(C89233z.C89238e eVar, CallableC19035j jVar, String str, String str2, HashMap hashMap, AtomicInteger atomicInteger) {
                this.f45088a = eVar;
                this.f45089b = jVar;
                this.f45090c = str;
                this.f45091d = str2;
                this.f45092e = hashMap;
                this.f45093f = atomicInteger;
            }
        }
    }

    /* renamed from: a */
    public final void mo30269a() {
        ReadableMap readableMap;
        C21088g gVar = this.f45058r;
        if (gVar != null && (readableMap = this.f45054n) != null) {
            m35356a(gVar, readableMap, new C19040m(gVar, this));
        }
    }

    @AbstractC28525m(mo49059a = "end-frame", mo49063e = -1)
    public final void setEndFrame2(int i) {
        setEndFrame(i);
    }

    @AbstractC28525m(mo49059a = "keeplastframe", mo49064f = true)
    public final void setKeepLastFrame(boolean z) {
        this.f45041a = z;
    }

    @AbstractC28525m(mo49059a = "only-local", mo49064f = false)
    public final void setOnlyLocal(boolean z) {
        this.f45062v = z;
    }

    @AbstractC28525m(mo49059a = "start-frame", mo49063e = 0)
    public final void setStartFrame2(int i) {
        setStartFrame(i);
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$e */
    public static final class C19029e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ LynxBytedLottieView f45072a;

        static {
            Covode.recordClassIndex(21792);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19029e(LynxBytedLottieView lynxBytedLottieView) {
            this.f45072a = lynxBytedLottieView;
        }

        public final void onAnimationCancel(Animator animator) {
            int i;
            float f;
            C21088g composition;
            LynxBytedLottieView lynxBytedLottieView = this.f45072a;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView != null) {
                i = lottieAnimationView.getFrame();
            } else {
                i = 0;
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f45072a.mView;
            if (lottieAnimationView2 == null || (composition = lottieAnimationView2.getComposition()) == null) {
                f = 0.0f;
            } else {
                f = composition.mo34564b();
            }
            lynxBytedLottieView.mo30275a("cancel", LynxBytedLottieView.m35354a(i, (int) f, this.f45072a.f45045e, this.f45072a.f45053m));
            this.f45072a.f45056p.clear();
        }

        public final void onAnimationStart(Animator animator) {
            float f;
            C21088g composition;
            int i = 0;
            this.f45072a.f45045e = 0;
            LynxBytedLottieView lynxBytedLottieView = this.f45072a;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView != null) {
                i = lottieAnimationView.getFrame();
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f45072a.mView;
            if (lottieAnimationView2 == null || (composition = lottieAnimationView2.getComposition()) == null) {
                f = 0.0f;
            } else {
                f = composition.mo34564b();
            }
            lynxBytedLottieView.mo30275a("start", LynxBytedLottieView.m35354a(i, (int) f, this.f45072a.f45045e, this.f45072a.f45053m));
        }

        public final void onAnimationEnd(Animator animator) {
            int i;
            float f;
            Float f2;
            Float f3;
            float minFrame;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f45072a.mView;
            if (lottieAnimationView != null) {
                if (this.f45072a.f45041a) {
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f45072a.mView;
                    C89219l.m154709a((Object) lottieAnimationView2, "");
                    minFrame = lottieAnimationView2.getMaxFrame();
                } else {
                    LottieAnimationView lottieAnimationView3 = (LottieAnimationView) this.f45072a.mView;
                    C89219l.m154709a((Object) lottieAnimationView3, "");
                    minFrame = lottieAnimationView3.getMinFrame();
                }
                lottieAnimationView.setFrame((int) minFrame);
            }
            LynxBytedLottieView lynxBytedLottieView = this.f45072a;
            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView4 != null) {
                i = lottieAnimationView4.getFrame();
            } else {
                i = 0;
            }
            LottieAnimationView lottieAnimationView5 = (LottieAnimationView) this.f45072a.mView;
            C89219l.m154709a((Object) lottieAnimationView5, "");
            C21088g composition = lottieAnimationView5.getComposition();
            if (composition != null) {
                f = composition.mo34564b();
            } else {
                f = 0.0f;
            }
            lynxBytedLottieView.mo30275a("completion", LynxBytedLottieView.m35354a(i, (int) f, this.f45072a.f45045e, this.f45072a.f45053m));
            C19050b bVar = this.f45072a.f45057q;
            String str = this.f45072a.f45047g;
            String str2 = this.f45072a.f45060t;
            Float valueOf = Float.valueOf(this.f45072a.f45059s.mo30331a());
            C21088g gVar = this.f45072a.f45058r;
            Float f4 = null;
            if (gVar != null) {
                f2 = Float.valueOf(gVar.f49979k);
            } else {
                f2 = null;
            }
            C21088g gVar2 = this.f45072a.f45058r;
            if (gVar2 != null) {
                f3 = Float.valueOf(gVar2.mo34564b());
            } else {
                f3 = null;
            }
            C21088g gVar3 = this.f45072a.f45058r;
            if (gVar3 != null) {
                f4 = Float.valueOf(gVar3.mo34559a());
            }
            bVar.mo30338a(str, str2, valueOf, f2, f3, f4, false);
            this.f45072a.f45056p.clear();
        }

        public final void onAnimationRepeat(Animator animator) {
            int i;
            float f;
            Float f2;
            Float f3;
            this.f45072a.f45045e++;
            LynxBytedLottieView lynxBytedLottieView = this.f45072a;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView != null) {
                i = lottieAnimationView.getFrame();
            } else {
                i = 0;
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f45072a.mView;
            C89219l.m154709a((Object) lottieAnimationView2, "");
            C21088g composition = lottieAnimationView2.getComposition();
            if (composition != null) {
                f = composition.mo34564b();
            } else {
                f = 0.0f;
            }
            lynxBytedLottieView.mo30275a("repeat", LynxBytedLottieView.m35354a(i, (int) f, this.f45072a.f45045e, this.f45072a.f45053m));
            C19050b bVar = this.f45072a.f45057q;
            String str = this.f45072a.f45047g;
            String str2 = this.f45072a.f45060t;
            Float valueOf = Float.valueOf(this.f45072a.f45059s.mo30331a());
            C21088g gVar = this.f45072a.f45058r;
            Float f4 = null;
            if (gVar != null) {
                f2 = Float.valueOf(gVar.f49979k);
            } else {
                f2 = null;
            }
            C21088g gVar2 = this.f45072a.f45058r;
            if (gVar2 != null) {
                f3 = Float.valueOf(gVar2.mo34564b());
            } else {
                f3 = null;
            }
            C21088g gVar3 = this.f45072a.f45058r;
            if (gVar3 != null) {
                f4 = Float.valueOf(gVar3.mo34559a());
            }
            bVar.mo30338a(str, str2, valueOf, f2, f3, f4, true);
        }
    }

    public /* synthetic */ LynxBytedLottieView(AbstractC28520j jVar) {
        this(jVar, "");
    }

    /* renamed from: a */
    public final void mo30270a(AbstractC18943a<C18945c> aVar) {
        C89219l.m154719c(aVar, "");
        this.f45038C = aVar;
    }

    @AbstractC28525m(mo49059a = "bid")
    public final void setBID(String str) {
        C89219l.m154719c(str, "");
        this.f45060t = str;
    }

    /* renamed from: a */
    private static Context m35352a(AbstractC28520j jVar) {
        Context applicationContext = jVar.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setEvents(Map<String, C28723a> map) {
        Set<String> set;
        super.setEvents(map);
        if (map != null) {
            set = map.keySet();
        } else {
            set = null;
        }
        this.f45036A = set;
    }

    @AbstractC28525m(mo49059a = "repetcount", mo49063e = -1)
    public final void setRepeat(int i) {
        if (i < 0) {
            i = -1;
        }
        View view = this.mView;
        C89219l.m154709a((Object) view, "");
        ((LottieAnimationView) view).setRepeatCount(i);
    }

    @AbstractC28525m(mo49059a = "src-format")
    public final void setSrcFormat(String str) {
        if (str != null && !C89361p.m154870a((CharSequence) str)) {
            m35358c();
            m35360d(str);
        }
    }

    @AbstractC28525m(mo49059a = "src-polyfill")
    public final void setSrcPolyfill(ReadableMap readableMap) {
        C89219l.m154719c(readableMap, "");
        this.f45054n = readableMap;
        mo30269a();
    }

    @AbstractC28525m(mo49059a = "startframe", mo49063e = 0)
    public final void setStartFrame(int i) {
        this.f45039D = i;
        ((LottieAnimationView) this.mView).setMinFrame(i);
    }

    /* renamed from: a */
    private static File m35353a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    @AbstractC28525m(mo49059a = "autoplay", mo49064f = true)
    public final void setAutoPlay(boolean z) {
        this.f45042b = z;
        View view = this.mView;
        if (view != null) {
            ((LynxBytedLottieAnimationView) view).setMAutoPlay(z);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @AbstractC28525m(mo49059a = "endframe", mo49063e = -1)
    public final void setEndFrame(int i) {
        if (i < 0) {
            this.f45040E = Integer.MAX_VALUE;
            ((LottieAnimationView) this.mView).setMaxFrame(Integer.MAX_VALUE);
            return;
        }
        this.f45040E = i;
        ((LottieAnimationView) this.mView).setMaxFrame(i);
    }

    @AbstractC28525m(mo49059a = "loop", mo49064f = false)
    public final void setLoop(boolean z) {
        if (z) {
            View view = this.mView;
            C89219l.m154709a((Object) view, "");
            ((LottieAnimationView) view).setRepeatCount(-1);
            return;
        }
        View view2 = this.mView;
        C89219l.m154709a((Object) view2, "");
        ((LottieAnimationView) view2).setRepeatCount(0);
    }

    @AbstractC28525m(mo49059a = "loop-count", mo49063e = 1)
    public final void setLoopCount(int i) {
        if (i <= 0) {
            View view = this.mView;
            C89219l.m154709a((Object) view, "");
            ((LottieAnimationView) view).setRepeatCount(-1);
            return;
        }
        View view2 = this.mView;
        C89219l.m154709a((Object) view2, "");
        ((LottieAnimationView) view2).setRepeatCount(i - 1);
    }

    @AbstractC28525m(mo49059a = "progress")
    public final void setProgress(float f) {
        if (f >= 0.0f || f <= 1.0f) {
            View view = this.mView;
            C89219l.m154709a((Object) view, "");
            ((LottieAnimationView) view).setProgress(f);
        }
    }

    @AbstractC28525m(mo49059a = "auto-reverse")
    public final void setReverseMode(boolean z) {
        if (z) {
            View view = this.mView;
            C89219l.m154709a((Object) view, "");
            ((LottieAnimationView) view).setRepeatMode(2);
            return;
        }
        View view2 = this.mView;
        C89219l.m154709a((Object) view2, "");
        ((LottieAnimationView) view2).setRepeatMode(1);
    }

    @AbstractC28525m(mo49059a = "speed")
    public final void setSpeed(float f) {
        boolean z;
        View view = this.mView;
        C89219l.m154709a((Object) view, "");
        ((LottieAnimationView) view).setSpeed(f);
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f45041a = z;
    }

    /* renamed from: b */
    public final void mo30277b(String str) {
        int b = C89361p.m154909b((CharSequence) str, '/');
        if (b <= 0) {
            LLog.m56862d("byted-lottie", "uri is error:".concat(String.valueOf(str)));
        } else if (str != null) {
            String substring = str.substring(0, b);
            C89219l.m154709a((Object) substring, "");
            this.f45046f = substring;
            ((LottieAnimationView) this.mView).setImageAssetDelegate(this);
        } else {
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ LottieAnimationView createView(Context context) {
        LynxBytedLottieAnimationView lynxBytedLottieAnimationView = new LynxBytedLottieAnimationView(context);
        if (Build.VERSION.SDK_INT > 19) {
            lynxBytedLottieAnimationView.mo34396b();
            lynxBytedLottieAnimationView.mo34394a(true);
        }
        lynxBytedLottieAnimationView.mo34390a();
        lynxBytedLottieAnimationView.mo34391a(new C19029e(this));
        lynxBytedLottieAnimationView.mo34395a(new C19030f(this, lynxBytedLottieAnimationView));
        lynxBytedLottieAnimationView.mo34392a(new C19032g(this));
        return lynxBytedLottieAnimationView;
    }

    @AbstractC28525m(mo49059a = "json")
    public final void setJson(String str) {
        if (str != null && str.length() != 0) {
            ((LottieAnimationView) this.mView).setImageAssetDelegate(this);
            ((LottieAnimationView) this.mView).mo34393a(str);
            if (this.f45065z || !this.f45042b) {
                ((LottieAnimationView) this.mView).mo34416h();
            } else {
                ((LottieAnimationView) this.mView).mo34398c();
            }
            this.f45065z = false;
            this.f45042b = true;
        }
    }

    @AbstractC28525m(mo49059a = "objectfit")
    public final void setObjectFit(String str) {
        ImageView.ScaleType scaleType;
        C89219l.m154719c(str, "");
        int hashCode = str.hashCode();
        if (hashCode != 94852023) {
            if (hashCode == 951526612 && str.equals("contain")) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
                View view = this.mView;
                C89219l.m154709a((Object) view, "");
                ((LottieAnimationView) view).setScaleType(scaleType);
            }
        } else if (str.equals("cover")) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
            View view2 = this.mView;
            C89219l.m154709a((Object) view2, "");
            ((LottieAnimationView) view2).setScaleType(scaleType);
        }
        scaleType = ImageView.ScaleType.CENTER;
        View view22 = this.mView;
        C89219l.m154709a((Object) view22, "");
        ((LottieAnimationView) view22).setScaleType(scaleType);
    }

    @AbstractC28525m(mo49059a = "playstatus")
    public final void setPlayStatus(String str) {
        C89219l.m154719c(str, "");
        if (C89219l.m154714a((Object) "play", (Object) str)) {
            ((LottieAnimationView) this.mView).mo34398c();
            this.f45037B = true;
            this.f45065z = false;
        } else if (C89219l.m154714a((Object) "pause", (Object) str)) {
            ((LottieAnimationView) this.mView).mo34416h();
            this.f45065z = true;
        }
    }

    @AbstractC28525m(mo49059a = "src")
    public final void setSrc(String str) {
        MethodCollector.m26663i(122);
        if (str == null || C89361p.m154870a((CharSequence) str)) {
            MethodCollector.m26664o(122);
            return;
        }
        m35358c();
        ((LottieAnimationView) this.mView).setImageDrawable(null);
        synchronized (this) {
            try {
                m35359d();
            } catch (Throwable th) {
                MethodCollector.m26664o(122);
                throw th;
            }
        }
        ((LottieAnimationView) this.mView).setMinFrame(this.f45039D);
        ((LottieAnimationView) this.mView).setMaxFrame(this.f45040E);
        m35360d(str);
        MethodCollector.m26664o(122);
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$d */
    public static final class C19028d extends AbsDownloadListener {

        /* renamed from: a */
        private final WeakReference<LynxBytedLottieView> f45070a;

        /* renamed from: b */
        private final Uri f45071b;

        static {
            Covode.recordClassIndex(21791);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            LynxBytedLottieView lynxBytedLottieView = this.f45070a.get();
            if (lynxBytedLottieView != null) {
                String uuid = UUID.randomUUID().toString();
                C89219l.m154709a((Object) uuid, "");
                lynxBytedLottieView.f45053m = uuid;
                StringBuilder sb = new StringBuilder();
                C89219l.m154709a((Object) lynxBytedLottieView, "");
                AbstractC28520j jVar = lynxBytedLottieView.mContext;
                C89219l.m154709a((Object) jVar, "");
                Context applicationContext = jVar.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                C89219l.m154709a((Object) applicationContext, "");
                if (C58016d.f132221b == null || !C58016d.f132224e) {
                    C58016d.f132221b = applicationContext.getCacheDir();
                }
                File file = C58016d.f132221b;
                C89219l.m154709a((Object) file, "");
                C21094h.m39744a(sb.append(file.getAbsolutePath()).append('/').append(this.f45071b.getLastPathSegment()).toString(), lynxBytedLottieView, lynxBytedLottieView.f45064x);
            }
        }

        public C19028d(LynxBytedLottieView lynxBytedLottieView, Uri uri) {
            C89219l.m154719c(lynxBytedLottieView, "");
            C89219l.m154719c(uri, "");
            this.f45071b = uri;
            this.f45070a = new WeakReference<>(lynxBytedLottieView);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            LynxBytedLottieView lynxBytedLottieView = this.f45070a.get();
            if (lynxBytedLottieView != null) {
                StringBuilder append = new StringBuilder("byted-lottie setSrc Failed, directUrl is ").append(this.f45071b.getPath()).append(", error msg is ");
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                } else {
                    str = null;
                }
                String sb = append.append(str).toString();
                String str2 = lynxBytedLottieView.f45047g;
                if (str2 == null) {
                    str2 = "";
                }
                lynxBytedLottieView.mo30273a(sb, str2, 1);
                C89219l.m154709a((Object) lynxBytedLottieView, "");
                lynxBytedLottieView.mContext.mo49039a(lynxBytedLottieView.f45047g, "lottie", sb);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$o */
    public static final class C19042o extends AbstractC24436c {

        /* renamed from: a */
        final /* synthetic */ LynxBytedLottieView f45110a;

        /* renamed from: b */
        final /* synthetic */ String f45111b;

        /* renamed from: c */
        final /* synthetic */ AbstractC19024a f45112c;

        /* renamed from: d */
        final /* synthetic */ C21118j f45113d;

        /* renamed from: e */
        final /* synthetic */ String f45114e;

        /* renamed from: f */
        final /* synthetic */ AbstractC24157c f45115f;

        static {
            Covode.recordClassIndex(21805);
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
            String str;
            if (cVar == null) {
                C89219l.m154707a();
            }
            Throwable e = cVar.mo39748e();
            StringBuilder append = new StringBuilder("requestBitmap failed! url: ").append(this.f45111b).append(" Reason: ");
            String str2 = null;
            if (e != null) {
                str = e.getMessage();
            } else {
                str = null;
            }
            LLog.m56860b("byted-lottie", append.append(str).toString());
            AbstractC19024a aVar = this.f45112c;
            StringBuilder sb = new StringBuilder(" error msg is ");
            if (e != null) {
                str2 = e.getMessage();
            }
            aVar.mo30312a(sb.append(str2).append('}').toString());
            cVar.mo39750g();
        }

        @Override // com.facebook.imagepipeline.p1881f.AbstractC24436c
        /* renamed from: a */
        public final void mo30327a(C24117a<Bitmap> aVar) {
            MethodCollector.m26663i(12);
            LLog.m56860b("byted-lottie", "requestBitmap success. url: " + this.f45111b);
            if (aVar != null) {
                synchronized (this.f45110a) {
                    try {
                        if (this.f45110a.f45063w) {
                            this.f45112c.mo30312a("the lottie-view is destroyed already.");
                            return;
                        }
                        LynxBytedLottieView lynxBytedLottieView = this.f45110a;
                        int i = this.f45113d.f50069a;
                        int i2 = this.f45113d.f50070b;
                        String str = this.f45111b;
                        C89219l.m154709a((Object) str, "");
                        C24117a<Bitmap> a = lynxBytedLottieView.mo30268a(aVar, i, i2, str);
                        if (a != null) {
                            this.f45110a.f45061u.add(a);
                            try {
                                Bitmap a2 = a.mo39695a();
                                if (a2 != null) {
                                    this.f45112c.mo30311a(a2, this.f45114e);
                                } else {
                                    LLog.m56862d("byted-lottie", "requestBitmapSync, onNewResultImpl");
                                    this.f45112c.mo30312a(this.f45114e);
                                }
                            } catch (Exception e) {
                                LLog.m56862d("byted-lottie", "requestBitmapSync, onNewResultImpl, error is ".concat(String.valueOf(e)));
                                this.f45112c.mo30312a(this.f45114e);
                            }
                        } else {
                            this.f45112c.mo30312a("failed when scaleBitmap");
                        }
                    } finally {
                        MethodCollector.m26664o(12);
                    }
                }
            }
            this.f45115f.mo39750g();
            MethodCollector.m26664o(12);
            this.f45115f.mo39750g();
            MethodCollector.m26664o(12);
        }

        C19042o(LynxBytedLottieView lynxBytedLottieView, String str, AbstractC19024a aVar, C21118j jVar, String str2, AbstractC24157c cVar) {
            this.f45110a = lynxBytedLottieView;
            this.f45111b = str;
            this.f45112c = aVar;
            this.f45113d = jVar;
            this.f45114e = str2;
            this.f45115f = cVar;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$f */
    static final class C19030f implements AbstractC21120l {

        /* renamed from: a */
        final /* synthetic */ LynxBytedLottieView f45073a;

        /* renamed from: b */
        final /* synthetic */ LynxBytedLottieAnimationView f45074b;

        static {
            Covode.recordClassIndex(21793);
        }

        C19030f(LynxBytedLottieView lynxBytedLottieView, LynxBytedLottieAnimationView lynxBytedLottieAnimationView) {
            this.f45073a = lynxBytedLottieView;
            this.f45074b = lynxBytedLottieAnimationView;
        }

        @Override // com.bytedance.lottie.AbstractC21120l
        /* renamed from: a */
        public final void mo30320a(C21088g gVar) {
            C21088g composition;
            C21088g composition2;
            this.f45073a.f45058r = gVar;
            C21127q performanceTracker = this.f45074b.getPerformanceTracker();
            if (performanceTracker != null) {
                performanceTracker.f50115a = true;
            }
            C21127q performanceTracker2 = this.f45074b.getPerformanceTracker();
            if (performanceTracker2 != null) {
                performanceTracker2.mo34626a(new C21127q.AbstractC21129a(this) {
                    /* class com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.C19030f.C190311 */

                    /* renamed from: a */
                    final /* synthetic */ C19030f f45075a;

                    static {
                        Covode.recordClassIndex(21794);
                    }

                    {
                        this.f45075a = r1;
                    }

                    @Override // com.bytedance.lottie.C21127q.AbstractC21129a
                    /* renamed from: a */
                    public final void mo30321a() {
                        C19045a aVar = this.f45075a.f45073a.f45059s;
                        long nanoTime = System.nanoTime();
                        if (aVar.f45119a != 0) {
                            aVar.f45120b[aVar.f45121c] = nanoTime - aVar.f45119a;
                            aVar.f45121c++;
                            aVar.f45122d++;
                        }
                        aVar.f45119a = nanoTime;
                        if (aVar.f45121c == aVar.f45120b.length && aVar.f45120b.length != 0) {
                            double d = 0.0d;
                            long[] jArr = aVar.f45120b;
                            int length = jArr.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                double d2 = (double) jArr[i];
                                Double.isNaN(d2);
                                d += d2;
                                aVar.f45120b[i2] = 0;
                                i++;
                                i2++;
                            }
                            double d3 = aVar.f45123e;
                            double d4 = (double) (aVar.f45122d - aVar.f45121c);
                            Double.isNaN(d4);
                            double d5 = (double) aVar.f45122d;
                            Double.isNaN(d5);
                            aVar.f45123e = ((d3 * d4) + d) / d5;
                            aVar.f45121c = 0;
                        }
                    }
                });
            }
            C89219l.m154709a((Object) gVar, "");
            if (gVar.f49981m) {
                this.f45073a.mo30269a();
                return;
            }
            float f = 0.0f;
            int i = 0;
            if (gVar.f49980l) {
                LynxBytedLottieView lynxBytedLottieView = this.f45073a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
                if (lottieAnimationView != null) {
                    i = lottieAnimationView.getFrame();
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f45073a.mView;
                if (!(lottieAnimationView2 == null || (composition2 = lottieAnimationView2.getComposition()) == null)) {
                    f = composition2.mo34564b();
                }
                lynxBytedLottieView.mo30275a("ready", LynxBytedLottieView.m35354a(i, (int) f, this.f45073a.f45045e, this.f45073a.f45053m));
                this.f45073a.f45057q.mo30340b(this.f45073a.f45047g);
                if (this.f45073a.f45042b && this.f45073a.f45051k) {
                    ((LottieAnimationView) this.f45073a.mView).mo34398c();
                    return;
                }
                return;
            }
            LynxBytedLottieView lynxBytedLottieView2 = this.f45073a;
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) lynxBytedLottieView2.mView;
            if (lottieAnimationView3 != null) {
                i = lottieAnimationView3.getFrame();
            }
            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) this.f45073a.mView;
            if (!(lottieAnimationView4 == null || (composition = lottieAnimationView4.getComposition()) == null)) {
                f = composition.mo34564b();
            }
            lynxBytedLottieView2.mo30275a("error", LynxBytedLottieView.m35354a(i, (int) f, this.f45073a.f45045e, this.f45073a.f45053m));
            LLog.m56862d("byted-lottie", "lottieComposition Loaded, but bitmap is not ready, lottieUrl is " + this.f45073a.f45047g + ", mSrcDir is " + this.f45073a.f45046f);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$g */
    static final class C19032g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LynxBytedLottieView f45076a;

        static {
            Covode.recordClassIndex(21795);
        }

        C19032g(LynxBytedLottieView lynxBytedLottieView) {
            this.f45076a = lynxBytedLottieView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f45076a.mView;
            C89219l.m154709a((Object) lottieAnimationView, "");
            C21088g composition = lottieAnimationView.getComposition();
            if (composition != null) {
                C89219l.m154709a((Object) valueAnimator, "");
                if (valueAnimator.getAnimatedValue() != null && this.f45076a.f45050j) {
                    try {
                        LynxBytedLottieView lynxBytedLottieView = this.f45076a;
                        float f = composition.f49977i;
                        float b = composition.mo34564b();
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue != null) {
                            lynxBytedLottieView.f45043c = C89241a.m154730a(f + (b * ((Float) animatedValue).floatValue()));
                            this.f45076a.f45044d = (int) composition.mo34564b();
                            if (this.f45076a.f45056p.size() < this.f45076a.f45055o.size() && (intValue = this.f45076a.f45055o.get(this.f45076a.f45056p.size()).intValue()) <= this.f45076a.f45043c) {
                                this.f45076a.f45056p.add(Integer.valueOf(intValue));
                                LynxBytedLottieView lynxBytedLottieView2 = this.f45076a;
                                lynxBytedLottieView2.mo30275a("update", LynxBytedLottieView.m35354a(lynxBytedLottieView2.f45043c, this.f45076a.f45044d, this.f45076a.f45045e, this.f45076a.f45053m));
                                return;
                            }
                            return;
                        }
                        throw new C89388w("null cannot be cast to non-null type");
                    } catch (Exception e) {
                        e.printStackTrace();
                        LLog.m56862d("byted-lottie", e.toString());
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$h */
    public static final class C19033h implements AbstractC19024a {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f45077a;

        /* renamed from: b */
        final /* synthetic */ LynxBytedLottieView f45078b;

        /* renamed from: c */
        final /* synthetic */ C21118j f45079c;

        /* renamed from: d */
        final /* synthetic */ AbstractC21078f f45080d;

        static {
            Covode.recordClassIndex(21796);
        }

        @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.AbstractC19024a
        /* renamed from: a */
        public final void mo30312a(String str) {
            C89219l.m154719c(str, "");
            this.f45078b.f45051k = false;
            if (!C89361p.m154870a((CharSequence) str)) {
                this.f45078b.mo30273a("use mSrcDir, mSrcUrl: " + this.f45078b.f45046f + ", path: " + ((String) this.f45077a.element) + ", msg: " + str, this.f45077a.element, 1);
            }
            String str2 = "request resource from " + ((String) this.f45077a.element) + " failed";
            this.f45078b.mo30275a("error", LynxBytedLottieView.m35355a(1, str2));
            this.f45078b.f45057q.mo30339a(this.f45078b.f45047g, this.f45077a.element, str2);
            LLog.m56862d("byted-lottie", "fetchBitmap failed, mSrcUrl=`" + this.f45078b.f45046f + "`, url=`" + ((String) this.f45077a.element) + '`');
            this.f45080d.mo30325a();
        }

        @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.AbstractC19024a
        /* renamed from: a */
        public final void mo30311a(Bitmap bitmap, String str) {
            C89219l.m154719c(bitmap, "");
            C89219l.m154719c(str, "");
            this.f45080d.mo30326a(bitmap);
        }

        C19033h(C89233z.C89238e eVar, LynxBytedLottieView lynxBytedLottieView, C21118j jVar, AbstractC21078f fVar) {
            this.f45077a = eVar;
            this.f45078b = lynxBytedLottieView;
            this.f45079c = jVar;
            this.f45080d = fVar;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$i */
    public static final class C19034i implements AbstractC19024a {

        /* renamed from: a */
        final /* synthetic */ LynxBytedLottieView f45081a;

        /* renamed from: b */
        final /* synthetic */ AbstractC21078f f45082b;

        /* renamed from: c */
        final /* synthetic */ String f45083c;

        static {
            Covode.recordClassIndex(21797);
        }

        @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.AbstractC19024a
        /* renamed from: a */
        public final void mo30312a(String str) {
            C89219l.m154719c(str, "");
            this.f45081a.f45051k = false;
            if (!C89361p.m154870a((CharSequence) str)) {
                this.f45081a.mo30273a("useXResourceFrom: " + this.f45081a.f45048h + ", mSrcUrl: " + this.f45081a.f45046f + ", path: " + this.f45083c + ", msg: " + str, this.f45083c, 1);
            }
            this.f45081a.mo30275a("error", LynxBytedLottieView.m35355a(1, "fetch bitmap failed, useXResourceFrom: " + this.f45081a.f45048h + ", path: " + this.f45083c));
            LLog.m56862d("byted-lottie", "fetchBitmap mSrcUrl=`" + this.f45081a.f45046f + "`, filePath=`" + this.f45083c + "` not exists.");
            this.f45082b.mo30325a();
        }

        @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.AbstractC19024a
        /* renamed from: a */
        public final void mo30311a(Bitmap bitmap, String str) {
            C89219l.m154719c(bitmap, "");
            C89219l.m154719c(str, "");
            this.f45082b.mo30326a(bitmap);
        }

        C19034i(LynxBytedLottieView lynxBytedLottieView, AbstractC21078f fVar, String str) {
            this.f45081a = lynxBytedLottieView;
            this.f45082b = fVar;
            this.f45083c = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$k */
    public static final class C19038k extends AbstractC89220m implements AbstractC89172b<C18945c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f45097a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18943a f45098b;

        /* renamed from: c */
        final /* synthetic */ LynxBytedLottieView f45099c;

        /* renamed from: d */
        final /* synthetic */ String f45100d;

        static {
            Covode.recordClassIndex(21801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19038k(String str, AbstractC18943a aVar, LynxBytedLottieView lynxBytedLottieView, String str2) {
            super(1);
            this.f45097a = str;
            this.f45098b = aVar;
            this.f45099c = lynxBytedLottieView;
            this.f45100d = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C18945c cVar) {
            C18945c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            this.f45099c.mo30277b(this.f45097a);
            this.f45099c.f45049i = true;
            this.f45099c.f45048h = cVar2.f44844d;
            EnumC18944b bVar = cVar2.f44844d;
            if (bVar != null) {
                int i = C19052c.f45139a[bVar.ordinal()];
                if (i == 1) {
                    LLog.m56860b("byted-lottie", "load resource success from builtin: " + cVar2.f44842b);
                    String str = cVar2.f44842b;
                    if (str != null) {
                        this.f45099c.mo30277b(str);
                        this.f45099c.f45052l = true;
                        AbstractC28520j jVar = this.f45099c.mContext;
                        LynxBytedLottieView lynxBytedLottieView = this.f45099c;
                        C21094h.m39742a(jVar, str, null, lynxBytedLottieView, lynxBytedLottieView.f45064x);
                    }
                } else if (i == 2) {
                    LLog.m56860b("byted-lottie", "load resource success from gecko: " + cVar2.f44842b);
                    String str2 = cVar2.f44842b;
                    if (str2 != null) {
                        this.f45099c.mo30277b(str2);
                        this.f45099c.f45052l = true;
                        LynxBytedLottieView lynxBytedLottieView2 = this.f45099c;
                        C21094h.m39744a(str2, lynxBytedLottieView2, lynxBytedLottieView2.f45064x);
                    }
                } else if (i == 3) {
                    LLog.m56860b("byted-lottie", "load resource success from gecko: " + cVar2.f44842b);
                    String str3 = cVar2.f44842b;
                    if (str3 != null) {
                        this.f45099c.f45052l = false;
                        LynxBytedLottieView lynxBytedLottieView3 = this.f45099c;
                        C21094h.m39744a(str3, lynxBytedLottieView3, lynxBytedLottieView3.f45064x);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    private final void m35360d(String str) {
        String str2;
        String str3;
        String uri;
        if (C89361p.m154874b(str, "./", false)) {
            str2 = C28621a.m57207a(this.mContext, str);
        } else {
            str2 = str;
        }
        if (!C89219l.m154714a((Object) this.f45047g, (Object) str2)) {
            LLog.m56860b("byted-lottie", "start load lottie: ".concat(String.valueOf(str2)));
            this.f45047g = str2;
            this.f45057q.mo30337a(str2);
            this.f45064x = new C19026c(this.f45047g);
            View view = this.mView;
            if (!(view instanceof LynxBytedLottieAnimationView)) {
                view = null;
            }
            LynxBytedLottieAnimationView lynxBytedLottieAnimationView = (LynxBytedLottieAnimationView) view;
            if (lynxBytedLottieAnimationView != null) {
                lynxBytedLottieAnimationView.setSrcUrl(this.f45047g);
            }
            AbstractC18943a<C18945c> aVar = this.f45038C;
            if (!(aVar == null || (str3 = this.f45047g) == null)) {
                this.f45048h = null;
                boolean a = C89219l.m154714a(getProps().get("only-local"), (Object) true);
                this.f45062v = a;
                if (a) {
                    uri = Uri.parse(str3).buildUpon().appendQueryParameter("dynamic", "2").appendQueryParameter("onlyLocal", "1").build().toString();
                } else {
                    uri = Uri.parse(str3).buildUpon().appendQueryParameter("dynamic", "2").build().toString();
                }
                C89219l.m154709a((Object) uri, "");
                aVar.mo30064a(uri, new C19038k(str3, aVar, this, str), new C19039l(aVar, this, str));
                if (C89391z.f203057a != null) {
                    return;
                }
            }
            mo30272a(str);
        }
    }

    /* renamed from: c */
    public final String mo30278c(String str) {
        String str2;
        EnumC18944b bVar = this.f45048h;
        if (bVar != null) {
            int i = C19052c.f45140b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (C89361p.m154874b(str, "http://", false) || C89361p.m154874b(str, "https://", false)) {
                        str2 = C28621a.m57207a(this.mContext, str);
                    } else {
                        str2 = this.f45046f + '/' + str;
                    }
                    C89219l.m154709a((Object) str2, "");
                    if (!C89361p.m154874b(str2, "file:", false)) {
                        str2 = "file:".concat(String.valueOf(str2));
                    }
                    C89219l.m154709a((Object) str2, "");
                    return str2;
                } else if (i == 3 && !C89361p.m154874b(str, "http://", false) && !C89361p.m154874b(str, "https://", false)) {
                    return this.f45046f + '/' + str;
                } else {
                    return str;
                }
            } else if (C89361p.m154874b(str, "http://", false) || C89361p.m154874b(str, "https://", false)) {
                return str;
            } else {
                return this.f45046f + '/' + str;
            }
        }
        return str;
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$q */
    public static final class C19044q<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(21807);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.intValue()), Integer.valueOf(t2.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$l */
    public static final class C19039l extends AbstractC89220m implements AbstractC89183m<Throwable, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC18943a f45101a;

        /* renamed from: b */
        final /* synthetic */ LynxBytedLottieView f45102b;

        /* renamed from: c */
        final /* synthetic */ String f45103c;

        static {
            Covode.recordClassIndex(21802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19039l(AbstractC18943a aVar, LynxBytedLottieView lynxBytedLottieView, String str) {
            super(2);
            this.f45101a = aVar;
            this.f45102b = lynxBytedLottieView;
            this.f45103c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Throwable th, Boolean bool) {
            Throwable th2 = th;
            boolean booleanValue = bool.booleanValue();
            String str = "";
            C89219l.m154719c(th2, str);
            String str2 = "request resource failed, errorMsg is \n " + String.valueOf(th2.getMessage());
            if (this.f45102b.f45062v) {
                LynxBytedLottieView lynxBytedLottieView = this.f45102b;
                String str3 = lynxBytedLottieView.f45047g;
                if (str3 != null) {
                    str = str3;
                }
                lynxBytedLottieView.mo30273a(str2, str, 4);
            } else if (booleanValue) {
                this.f45102b.mo30272a(this.f45103c);
            } else {
                LynxBytedLottieView lynxBytedLottieView2 = this.f45102b;
                String str4 = lynxBytedLottieView2.f45047g;
                if (str4 != null) {
                    str = str4;
                }
                lynxBytedLottieView2.mo30273a(str2, str, 1);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView$n */
    public static final class C19041n extends AbstractC24635a {

        /* renamed from: a */
        final /* synthetic */ String f45106a;

        /* renamed from: b */
        final /* synthetic */ LynxBytedLottieView f45107b;

        /* renamed from: c */
        final /* synthetic */ C21118j f45108c;

        /* renamed from: d */
        final /* synthetic */ C24639c f45109d;

        static {
            Covode.recordClassIndex(21804);
        }

        @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
        public final C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
            Throwable th;
            C24117a<Bitmap> aVar;
            Exception e;
            C89219l.m154719c(bitmap, "");
            C89219l.m154719c(fVar, "");
            LLog.m56860b("byted-lottie", "some memory is wasted, recreate the bitmap with 565");
            C24117a<Bitmap> aVar2 = null;
            try {
                aVar = fVar.mo40148a(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
                try {
                    new Canvas(aVar.mo39695a()).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    C24117a<Bitmap> b = C24117a.m45711b(aVar);
                    C24117a.m45712c(aVar);
                    return b;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        this.f45107b.mo30273a("error happened when change bitmap from ARG_8888 to RGB_565, imagePath is " + this.f45106a, this.f45106a, 3);
                        C24117a.m45712c(aVar);
                        return super.process(bitmap, fVar);
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        C24117a.m45712c(aVar2);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                aVar = null;
                e.printStackTrace();
                this.f45107b.mo30273a("error happened when change bitmap from ARG_8888 to RGB_565, imagePath is " + this.f45106a, this.f45106a, 3);
                C24117a.m45712c(aVar);
                return super.process(bitmap, fVar);
            } catch (Throwable th3) {
                th = th3;
                C24117a.m45712c(aVar2);
                throw th;
            }
        }

        C19041n(String str, LynxBytedLottieView lynxBytedLottieView, C21118j jVar, C24639c cVar) {
            this.f45106a = str;
            this.f45107b = lynxBytedLottieView;
            this.f45108c = jVar;
            this.f45109d = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LynxBytedLottieView(AbstractC28520j jVar, String str) {
        super(jVar);
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(str, "");
        this.f45041a = true;
        this.f45042b = true;
        this.f45044d = -1;
        this.f45050j = true;
        this.f45051k = true;
        this.f45053m = "";
        this.f45055o = new ArrayList();
        this.f45056p = new ArrayList();
        this.f45057q = new C19050b(str);
        this.f45059s = new C19045a();
        this.f45060t = "";
        this.f45061u = new ArrayList<>();
        this.f45040E = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static Map<String, Object> m35355a(int i, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        return linkedHashMap;
    }

    @AbstractC28528p
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            View view = this.mView;
            if (view == null) {
                C89219l.m154707a();
            }
            javaOnlyMap.putInt("data", (int) ((LottieAnimationView) view).getDuration());
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @AbstractC28528p
    public final void isAnimating(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            View view = this.mView;
            C89219l.m154709a((Object) view, "");
            javaOnlyMap.putBoolean("data", ((LottieAnimationView) view).mo34402g());
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @AbstractC28528p
    public final void listenAnimationUpdate(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            javaOnlyMap.putBoolean("data", true);
            this.f45050j = readableMap.getBoolean("isListen");
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @AbstractC28528p
    public final void pause(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            try {
                ((LottieAnimationView) this.mView).mo34417i();
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void play(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        String uuid = UUID.randomUUID().toString();
        C89219l.m154709a((Object) uuid, "");
        this.f45053m = uuid;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            try {
                ((LottieAnimationView) this.mView).mo34398c();
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void resume(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        String uuid = UUID.randomUUID().toString();
        C89219l.m154709a((Object) uuid, "");
        this.f45053m = uuid;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            try {
                ((LottieAnimationView) this.mView).mo34399d();
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
        if (this.mView == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void seek(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            int i = readableMap.getInt("frame");
            View view = this.mView;
            C89219l.m154709a((Object) view, "");
            ((LottieAnimationView) view).setFrame(i);
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @AbstractC28528p
    public final void stop(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            try {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.mView;
                if (lottieAnimationView != null) {
                    lottieAnimationView.mo34416h();
                    Drawable drawable = lottieAnimationView.getDrawable();
                    if (!(drawable instanceof C21106i)) {
                        drawable = null;
                    }
                    C21106i iVar = (C21106i) drawable;
                    if (iVar != null) {
                        iVar.stop();
                    }
                }
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @AbstractC28528p
    public final void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        int i = readableMap.getInt("frame");
        if (!this.f45055o.contains(Integer.valueOf(i))) {
            this.f45055o.add(Integer.valueOf(i));
            List<Integer> list = this.f45055o;
            if (list.size() > 1) {
                C89070n.m154530a((List) list, (Comparator) new C19044q());
            }
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, "already subscribeUpdateEvent with " + i + " frame");
        }
    }

    @AbstractC28528p
    public final void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        int i = readableMap.getInt("frame");
        if (this.f45055o.contains(Integer.valueOf(i))) {
            this.f45055o.remove(Integer.valueOf(i));
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, i + " frame is not subscribed");
        }
    }

    /* renamed from: a */
    private final void m35356a(C21088g gVar, ReadableMap readableMap, AbstractC21078f<String> fVar) {
        new C19047b(new CallableC19035j(this, readableMap, fVar, gVar));
    }

    /* renamed from: a */
    private void m35357a(String str, C21118j jVar, AbstractC19024a aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(aVar, "");
        mo30274a(str, str, jVar, aVar);
    }

    /* renamed from: a */
    public static Map<String, Object> m35354a(int i, int i2, int i3, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("current", Integer.valueOf(i));
        linkedHashMap.put("total", Integer.valueOf(i2));
        linkedHashMap.put("loopIndex", Integer.valueOf(i3));
        linkedHashMap.put("animationID", str);
        return linkedHashMap;
    }

    /* renamed from: a */
    public final C24117a<Bitmap> mo30268a(C24117a<Bitmap> aVar, int i, int i2, String str) {
        C24117a<Bitmap> aVar2;
        MethodCollector.m26663i(2195);
        Bitmap a = aVar.mo39695a();
        try {
            C89219l.m154709a((Object) a, "");
            if (a.getWidth() == i && a.getHeight() == i2) {
                aVar2 = aVar.mo39697c();
            } else {
                aVar2 = C24117a.m45707a(Bitmap.createScaledBitmap(a, i, i2, false), C24359g.m46366a());
            }
        } catch (Exception e) {
            e.printStackTrace();
            mo30273a("scale image failed, and detail is ".concat(String.valueOf(e)), str, 2);
            aVar2 = null;
        }
        MethodCollector.m26664o(2195);
        return aVar2;
    }
}
