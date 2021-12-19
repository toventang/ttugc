package com.p2082ss.android.ugc.aweme.livewallpaper;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.service.wallpaper.WallpaperService;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34508e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.livewallpaper.C58821a;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.RunnableC58860j;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3416d.C58882c;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58905h;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58907i;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper */
public class AmeLiveWallpaper extends WallpaperService implements C58821a.AbstractC58825a {

    /* renamed from: a */
    public LiveWallPaperBean f133876a;

    /* renamed from: b */
    public ArrayList<C58819b> f133877b = new ArrayList<>();

    /* renamed from: c */
    private ContentResolver f133878c;

    /* renamed from: d */
    private AbstractC58900e f133879d;

    /* renamed from: e */
    private Handler f133880e = new HandlerC58818a(this);

    /* renamed from: f */
    private SimpleDateFormat f133881f = new SimpleDateFormat("yyyy-MM-dd");

    static {
        Covode.recordClassIndex(69128);
    }

    /* renamed from: c */
    private void m108023c() {
        this.f133880e.removeMessages(1);
    }

    public void onDestroy() {
        m108023c();
        super.onDestroy();
    }

    public WallpaperService.Engine onCreateEngine() {
        C58819b bVar = new C58819b(this, (byte) 0);
        this.f133877b.add(bVar);
        return bVar;
    }

    public void onCreate() {
        super.onCreate();
        this.f133878c = getContentResolver();
        this.f133879d = (AbstractC58900e) C34508e.m70493a(C17867d.m33078a(), AbstractC58900e.class);
        m108023c();
        mo96191a();
    }

    /* renamed from: a */
    public final void mo96191a() {
        if (!this.f133881f.format(new Date(System.currentTimeMillis())).equals(this.f133881f.format(Long.valueOf(C58905h.m108243c())))) {
            C58905h.m108247g();
            String[] b = C58905h.m108242b();
            if (b == null || b.length <= 0) {
                C58905h.m108241a(new String[]{new StringBuilder().append(System.currentTimeMillis()).toString()});
            } else {
                if (!this.f133881f.format(new Date(Long.parseLong(b[b.length - 1]))).equals(this.f133881f.format(new Date(System.currentTimeMillis())))) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(b));
                    arrayList.add(new StringBuilder().append(System.currentTimeMillis()).toString());
                    C58905h.m108241a((String[]) arrayList.toArray(new String[0]));
                }
            }
        }
        this.f133880e.sendEmptyMessageDelayed(1, TimeUnit.HOURS.toMillis((long) C58905h.m108244d()));
    }

    /* renamed from: b */
    public final void mo96193b() {
        ContentResolver contentResolver;
        ContentResolver contentResolver2 = this.f133878c;
        if (contentResolver2 != null) {
            this.f133876a = C58882c.m108181a(contentResolver2.getType(WallPaperDataProvider.f133890f));
        }
        if (this.f133876a == null) {
            this.f133876a = LiveWallPaperBean.buildEmptyBean();
        }
        try {
            if (TextUtils.isEmpty(this.f133876a.getVideoPath())) {
                this.f133876a.setVideoPath(this.f133879d.mo60965c(""));
            }
            if (!C80720e.m139927b(this.f133876a.getVideoPath()) && (contentResolver = this.f133878c) != null) {
                this.f133876a.setVideoPath(contentResolver.getType(WallPaperDataProvider.f133891g));
            }
            C1764a.m5928a("current video path: %s", new Object[]{this.f133876a.getVideoPath()});
            if (this.f133876a.getWidth() <= 0) {
                this.f133876a.setWidth(this.f133879d.mo60956a());
            }
            if (this.f133876a.getHeight() <= 0) {
                this.f133876a.setHeight(this.f133879d.mo60961b());
            }
            if (TextUtils.isEmpty(this.f133876a.getSource())) {
                this.f133876a.setSource(this.f133879d.mo60968e(""));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper$a */
    static class HandlerC58818a extends Handler {

        /* renamed from: a */
        private WeakReference<AmeLiveWallpaper> f133882a;

        static {
            Covode.recordClassIndex(69129);
        }

        public HandlerC58818a(AmeLiveWallpaper ameLiveWallpaper) {
            this.f133882a = new WeakReference<>(ameLiveWallpaper);
        }

        public final void handleMessage(Message message) {
            AmeLiveWallpaper ameLiveWallpaper;
            if (message.what == 1 && (ameLiveWallpaper = this.f133882a.get()) != null) {
                ameLiveWallpaper.mo96191a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper$b */
    class C58819b extends WallpaperService.Engine {

        /* renamed from: a */
        C58821a f133883a;

        static {
            Covode.recordClassIndex(69130);
        }

        private C58819b() {
            super(AmeLiveWallpaper.this);
            this.f133883a = new C58821a(AmeLiveWallpaper.this);
        }

        public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
            super.onSurfaceDestroyed(surfaceHolder);
            this.f133883a.mo96213a();
            AmeLiveWallpaper.this.f133877b.remove(this);
        }

        public final void onVisibilityChanged(boolean z) {
            super.onVisibilityChanged(z);
            C58821a aVar = this.f133883a;
            aVar.f133906g = z;
            if (z) {
                aVar.mo96220d();
            } else {
                aVar.mo96219c();
            }
        }

        public final void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            super.onSurfaceCreated(surfaceHolder);
            AmeLiveWallpaper.this.mo96193b();
            if (!C80720e.m139927b(AmeLiveWallpaper.this.f133876a.getVideoPath())) {
                Context applicationContext = AmeLiveWallpaper.this.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                SmartRouter.buildRoute(applicationContext, "//livewallpaper").addFlags(268435456).open();
                return;
            }
            this.f133883a.f133905f = AmeLiveWallpaper.this.f133876a;
            this.f133883a.mo96216a(surfaceHolder, AmeLiveWallpaper.this.f133876a.getVideoPath(), AmeLiveWallpaper.this.f133876a.getWidth(), AmeLiveWallpaper.this.f133876a.getHeight());
        }

        /* synthetic */ C58819b(AmeLiveWallpaper ameLiveWallpaper, byte b) {
            this();
        }

        public final void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f133883a.mo96215a(surfaceHolder, i2, i3);
        }

        public final Bundle onCommand(String str, int i, int i2, int i3, Bundle bundle, boolean z) {
            C58821a aVar;
            C89219l.m154721d(str, "");
            boolean z2 = false;
            if (!C89219l.m154714a((Object) "android.wallpaper.tap", (Object) str)) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C58907i.f134090a <= 300) {
                int i4 = i - C58907i.f134091b;
                int i5 = i2 - C58907i.f134092c;
                if ((i4 * i4) + (i5 * i5) < 10000) {
                    z2 = true;
                }
            }
            C58907i.f134090a = currentTimeMillis;
            C58907i.f134091b = i;
            C58907i.f134092c = i2;
            if (!z2 || !C58905h.m108245e() || (aVar = this.f133883a) == null || aVar.f133905f == null) {
                return null;
            }
            aVar.f133905f.setForceToPause(!aVar.f133905f.isForceToPause());
            if (aVar.f133905f.isForceToPause()) {
                aVar.mo96219c();
            } else {
                aVar.mo96220d();
            }
            C39162r.m79460a("double_tap_wallpaper", new C33744d().mo59980a("action", !aVar.f133905f.isForceToPause()).f79943a);
            return null;
        }
    }

    /* renamed from: a */
    private static String m108022a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.C58821a.AbstractC58825a
    /* renamed from: a */
    public final void mo96192a(boolean z, String str, String str2) {
        if (this.f133878c != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("result", Boolean.valueOf(z));
            contentValues.put("source", str);
            contentValues.put("message", str2);
            try {
                this.f133878c.insert(WallPaperDataProvider.f133892h, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
                C51423a.m95787a("LiveWallPaper insert failed " + e.getMessage());
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        if (intent != null) {
            if ("action_update_volume".equals(m108022a(intent, "action"))) {
                float a = C58901f.m108217a(C58905h.m108246f());
                Iterator<C58819b> it = this.f133877b.iterator();
                while (it.hasNext()) {
                    it.next().f133883a.mo96214a(a);
                }
                return super.onStartCommand(intent, i, i2);
            }
            this.f133876a = C58882c.m108181a(m108022a(intent, "wallpaper_json"));
        }
        LiveWallPaperBean liveWallPaperBean = this.f133876a;
        if (liveWallPaperBean == null || !C80720e.m139927b(liveWallPaperBean.getVideoPath()) || this.f133876a.getWidth() <= 0 || this.f133876a.getHeight() <= 0) {
            mo96193b();
        }
        Iterator<C58819b> it2 = this.f133877b.iterator();
        while (it2.hasNext()) {
            C58819b next = it2.next();
            if (AmeLiveWallpaper.this.f133876a != null && !TextUtils.isEmpty(AmeLiveWallpaper.this.f133876a.getSource())) {
                next.f133883a.f133905f = AmeLiveWallpaper.this.f133876a;
                C58821a aVar = next.f133883a;
                String videoPath = AmeLiveWallpaper.this.f133876a.getVideoPath();
                int width = AmeLiveWallpaper.this.f133876a.getWidth();
                int height = AmeLiveWallpaper.this.f133876a.getHeight();
                if (!C80720e.m139927b(videoPath)) {
                    aVar.mo96217a(false, "onRefresh video is not exists");
                } else if (aVar.f133903d != null) {
                    Surface surface = aVar.f133903d.getSurface();
                    Rect surfaceFrame = aVar.f133903d.getSurfaceFrame();
                    int height2 = surfaceFrame.height();
                    int width2 = surfaceFrame.width();
                    Pair<Float, Float> a2 = C58821a.m108030a(width2, height2, width, height);
                    if (aVar.f133901b != null) {
                        aVar.f133901b.release();
                        aVar.f133901b = null;
                    }
                    if (aVar.f133904e != null) {
                        aVar.f133904e.release();
                        aVar.f133904e = null;
                    }
                    if (aVar.f133902c != null) {
                        aVar.f133902c.mo96287d();
                    }
                    if (aVar.f133900a != null) {
                        aVar.f133900a.release();
                    }
                    aVar.f133902c = new RunnableC58860j(surface);
                    aVar.f133902c.f133988n = a2;
                    aVar.f133902c.mo96288e();
                    aVar.f133900a = aVar.f133902c.mo96289f();
                    if (aVar.f133900a != null) {
                        aVar.f133900a.setDefaultBufferSize(width2, height2);
                        surface = new Surface(aVar.f133900a);
                    }
                    aVar.f133904e = surface;
                    aVar.f133901b = new MediaPlayer();
                    try {
                        aVar.f133901b.setSurface(surface);
                        aVar.f133901b.setDataSource(videoPath);
                        aVar.f133901b.setLooping(true);
                        aVar.mo96218b();
                        aVar.f133901b.prepare();
                        aVar.f133901b.start();
                        aVar.f133901b.setOnInfoListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0155: INVOKE  
                              (wrap: android.media.MediaPlayer : 0x014e: IGET  (r1v5 android.media.MediaPlayer) = (r4v0 'aVar' com.ss.android.ugc.aweme.livewallpaper.a) com.ss.android.ugc.aweme.livewallpaper.a.b android.media.MediaPlayer)
                              (wrap: com.ss.android.ugc.aweme.livewallpaper.a$2 : 0x0152: CONSTRUCTOR  (r0v44 com.ss.android.ugc.aweme.livewallpaper.a$2) = (r4v0 'aVar' com.ss.android.ugc.aweme.livewallpaper.a) call: com.ss.android.ugc.aweme.livewallpaper.a.2.<init>(com.ss.android.ugc.aweme.livewallpaper.a):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.media.MediaPlayer.setOnInfoListener(android.media.MediaPlayer$OnInfoListener):void in method: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper.onStartCommand(android.content.Intent, int, int):int, file: classes5.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:239)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0152: CONSTRUCTOR  (r0v44 com.ss.android.ugc.aweme.livewallpaper.a$2) = (r4v0 'aVar' com.ss.android.ugc.aweme.livewallpaper.a) call: com.ss.android.ugc.aweme.livewallpaper.a.2.<init>(com.ss.android.ugc.aweme.livewallpaper.a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper.onStartCommand(android.content.Intent, int, int):int, file: classes5.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 36 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.livewallpaper.a, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 42 more
                            */
                        /*
                        // Method dump skipped, instructions count: 414
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper.onStartCommand(android.content.Intent, int, int):int");
                    }
                }
