package com.bytedance.android.ecommerce.ocr.p167b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.ecommerce.ocr.p166a.AbstractC2868k;
import com.bytedance.android.ecommerce.ocr.p166a.C2846b;
import com.bytedance.android.ecommerce.ocr.view.C2901f;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.android.ecommerce.p153a.p154a.C2735b;
import com.bytedance.android.ecommerce.p153a.p155b.C2740b;
import com.bytedance.android.ecommerce.p157c.AbstractC2766a;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p165k.C2829d;
import com.bytedance.android.ecommerce.p165k.C2840k;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bytedance.android.ecommerce.ocr.b.b */
public final class C2873b {

    /* renamed from: f */
    public static int f8539f = 10001;

    /* renamed from: g */
    public static int f8540g = 10002;

    /* renamed from: a */
    public volatile boolean f8541a;

    /* renamed from: b */
    public final Object f8542b = new Object();

    /* renamed from: c */
    public HandlerThread f8543c;

    /* renamed from: d */
    public Handler f8544d;

    /* renamed from: e */
    public C2872a f8545e;

    /* renamed from: h */
    public final Handler.Callback f8546h = new Handler.Callback() {
        /* class com.bytedance.android.ecommerce.ocr.p167b.C2873b.C28741 */

        static {
            Covode.recordClassIndex(3300);
        }

        public final boolean handleMessage(Message message) {
            int i;
            int i2;
            int i3;
            int i4;
            MethodCollector.m26663i(4458);
            if (message.what == C2873b.f8539f) {
                C2901f fVar = (C2901f) message.obj;
                C2873b bVar = C2873b.this;
                if (bVar.f8541a) {
                    try {
                        byte[] bArr = fVar.f8640a;
                        if (bArr != null) {
                            int i5 = fVar.f8642c;
                            int i6 = fVar.f8641b;
                            if (bVar.f8545e != null) {
                                i = bVar.f8545e.mo7469a(1, i5);
                                i2 = bVar.f8545e.mo7469a(0, i6);
                                i3 = bVar.f8545e.mo7469a(2, i6);
                                i4 = bVar.f8545e.mo7469a(3, i5);
                                if (i3 > i5 || i4 > i6) {
                                    i3 = i5;
                                    i4 = i6;
                                }
                            } else {
                                i3 = i5;
                                i4 = i6;
                                i = 0;
                                i2 = 0;
                            }
                            if (i6 * i5 <= bArr.length) {
                                int i7 = fVar.f8642c;
                                int i8 = fVar.f8641b;
                                new BitmapFactory.Options().inJustDecodeBounds = true;
                                YuvImage yuvImage = new YuvImage(bArr, 17, i7, i8, null);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                yuvImage.compressToJpeg(new Rect(0, 0, i7, i8), 100, byteArrayOutputStream);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                Bitmap createBitmap = Bitmap.createBitmap(C2829d.m8098a(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options), 90.0f), i2, i, i3, i4);
                                if (createBitmap.getByteCount() > 4194304) {
                                    createBitmap = C2829d.m8099a(createBitmap, 4194304);
                                }
                                createBitmap.getByteCount();
                                C2735b a = C2778c.f8362a.mo7379k().mo7393a();
                                if (TextUtils.isEmpty(a.f8158f)) {
                                    bVar.mo7471a(0, 101, "nonce is empty", null);
                                } else {
                                    a.f8159g = Base64.encodeToString(C2829d.m8100a(createBitmap), 0);
                                    createBitmap.getByteCount();
                                    RunnableC13596e.m24423a(new Runnable(a, createBitmap) {
                                        /* class com.bytedance.android.ecommerce.ocr.p167b.C2873b.RunnableC28763 */

                                        /* renamed from: a */
                                        final /* synthetic */ C2735b f8553a;

                                        /* renamed from: b */
                                        final /* synthetic */ Bitmap f8554b;

                                        static {
                                            Covode.recordClassIndex(3302);
                                        }

                                        public final void run() {
                                            C2778c.f8362a.mo7371c().mo7396a(this.f8553a, new AbstractC2766a() {
                                                /* class com.bytedance.android.ecommerce.ocr.p167b.C2873b.RunnableC28763.C28771 */

                                                static {
                                                    Covode.recordClassIndex(3303);
                                                }

                                                @Override // com.bytedance.android.ecommerce.p157c.AbstractC2766a
                                                /* renamed from: a */
                                                public final void mo7350a(boolean z, String str, C2740b bVar) {
                                                    MethodCollector.m26663i(4375);
                                                    if (!z) {
                                                        try {
                                                            C2873b.this.mo7471a(0, 107, str, bVar);
                                                            MethodCollector.m26664o(4375);
                                                        } catch (Throwable unused) {
                                                            MethodCollector.m26664o(4375);
                                                        }
                                                    } else {
                                                        if (bVar != null && bVar.f8203m) {
                                                            Bitmap bitmap = RunnableC28763.this.f8554b;
                                                            int i = bVar.f8199i.f8182c;
                                                            int i2 = bVar.f8199i.f8183d;
                                                            int i3 = bVar.f8199i.f8186g - bVar.f8199i.f8182c;
                                                            int i4 = bVar.f8199i.f8185f - bVar.f8199i.f8187h;
                                                            Bitmap bitmap2 = null;
                                                            if (i + i3 > bitmap.getWidth()) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i2 + i4 > bitmap.getHeight()) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i < 0) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i2 < 0) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i3 < 0) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i4 < 0) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else {
                                                                bitmap2 = Bitmap.createBitmap(bitmap, i, i2, i3, i4);
                                                            }
                                                            bVar.f8204n = bitmap2;
                                                            if (bVar.f8199i.f8189j) {
                                                                bVar.f8204n = C2829d.m8098a(bVar.f8204n, 180.0f);
                                                            }
                                                            if (bVar.f8204n != null) {
                                                                C2873b.this.mo7471a(1, 1, "success", bVar);
                                                            }
                                                        }
                                                        MethodCollector.m26664o(4375);
                                                    }
                                                }
                                            });
                                        }

                                        {
                                            this.f8553a = r2;
                                            this.f8554b = r3;
                                        }
                                    });
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                bVar.f8544d.sendMessageDelayed(bVar.f8544d.obtainMessage(C2873b.f8540g), 1000);
            } else if (message.what == C2873b.f8540g) {
                C2873b.this.mo7472b();
            }
            MethodCollector.m26664o(4458);
            return true;
        }
    };

    /* renamed from: i */
    private C2846b f8547i;

    /* renamed from: j */
    private final ThreadLocal<Long> f8548j = new ThreadLocal<>();

    /* renamed from: k */
    private OcrActivity f8549k;

    /* renamed from: l */
    private final AbstractC2868k f8550l = new AbstractC2868k() {
        /* class com.bytedance.android.ecommerce.ocr.p167b.C2873b.C28752 */

        static {
            Covode.recordClassIndex(3301);
        }

        @Override // com.bytedance.android.ecommerce.ocr.p166a.AbstractC2868k
        /* renamed from: a */
        public final void mo7459a() {
            C2873b.this.mo7472b();
        }

        @Override // com.bytedance.android.ecommerce.ocr.p166a.AbstractC2868k
        /* renamed from: a */
        public final void mo7460a(C2901f fVar) {
            MethodCollector.m26663i(4290);
            synchronized (C2873b.this.f8542b) {
                try {
                    if (C2873b.this.f8541a) {
                        C2873b.this.f8544d.obtainMessage(C2873b.f8539f, fVar).sendToTarget();
                    }
                } finally {
                    MethodCollector.m26664o(4290);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(3299);
    }

    /* renamed from: a */
    public final void mo7470a() {
        MethodCollector.m26663i(3405);
        C2840k.m8119a();
        synchronized (this.f8542b) {
            try {
                this.f8541a = false;
            } finally {
                MethodCollector.m26664o(3405);
            }
        }
    }

    /* renamed from: b */
    public final void mo7472b() {
        C2846b bVar = this.f8547i;
        if (bVar != null && bVar.f8467f) {
            C2846b bVar2 = this.f8547i;
            bVar2.f8469h.post(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: INVOKE  
                  (wrap: android.os.Handler : 0x000c: IGET  (r1v0 android.os.Handler) = (r3v0 'bVar2' com.bytedance.android.ecommerce.ocr.a.b) com.bytedance.android.ecommerce.ocr.a.b.h android.os.Handler)
                  (wrap: com.bytedance.android.ecommerce.ocr.a.b$3 : 0x0010: CONSTRUCTOR  (r0v2 com.bytedance.android.ecommerce.ocr.a.b$3) = 
                  (r3v0 'bVar2' com.bytedance.android.ecommerce.ocr.a.b)
                  (wrap: com.bytedance.android.ecommerce.ocr.a.k : 0x000a: IGET  (r2v0 com.bytedance.android.ecommerce.ocr.a.k) = (r4v0 'this' com.bytedance.android.ecommerce.ocr.b.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.android.ecommerce.ocr.b.b.l com.bytedance.android.ecommerce.ocr.a.k)
                 call: com.bytedance.android.ecommerce.ocr.a.b.3.<init>(com.bytedance.android.ecommerce.ocr.a.b, com.bytedance.android.ecommerce.ocr.a.k):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.bytedance.android.ecommerce.ocr.b.b.b():void, file: classes8.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: CONSTRUCTOR  (r0v2 com.bytedance.android.ecommerce.ocr.a.b$3) = 
                  (r3v0 'bVar2' com.bytedance.android.ecommerce.ocr.a.b)
                  (wrap: com.bytedance.android.ecommerce.ocr.a.k : 0x000a: IGET  (r2v0 com.bytedance.android.ecommerce.ocr.a.k) = (r4v0 'this' com.bytedance.android.ecommerce.ocr.b.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.android.ecommerce.ocr.b.b.l com.bytedance.android.ecommerce.ocr.a.k)
                 call: com.bytedance.android.ecommerce.ocr.a.b.3.<init>(com.bytedance.android.ecommerce.ocr.a.b, com.bytedance.android.ecommerce.ocr.a.k):void type: CONSTRUCTOR in method: com.bytedance.android.ecommerce.ocr.b.b.b():void, file: classes8.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.ecommerce.ocr.a.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                this = this;
                com.bytedance.android.ecommerce.ocr.a.b r0 = r4.f8547i
                if (r0 == 0) goto L_0x0016
                boolean r0 = r0.f8467f
                if (r0 == 0) goto L_0x0016
                com.bytedance.android.ecommerce.ocr.a.b r3 = r4.f8547i
                com.bytedance.android.ecommerce.ocr.a.k r2 = r4.f8550l
                android.os.Handler r1 = r3.f8469h
                com.bytedance.android.ecommerce.ocr.a.b$3 r0 = new com.bytedance.android.ecommerce.ocr.a.b$3
                r0.<init>(r2)
                r1.post(r0)
            L_0x0016:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.p167b.C2873b.mo7472b():void");
        }

        public C2873b(C2846b bVar, OcrActivity ocrActivity) {
            C2840k.m8119a();
            this.f8547i = bVar;
            this.f8549k = ocrActivity;
        }

        /* renamed from: a */
        public final void mo7471a(int i, int i2, String str, C2740b bVar) {
            this.f8544d.removeMessages(f8540g);
            OcrActivity ocrActivity = this.f8549k;
            if (ocrActivity != null) {
                ocrActivity.mo7348a(i, i2, str, bVar);
                this.f8549k = null;
            }
        }
    }
