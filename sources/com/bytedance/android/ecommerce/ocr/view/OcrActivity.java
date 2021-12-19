package com.bytedance.android.ecommerce.ocr.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.C0569a;
import androidx.core.content.C0643b;
import com.bytedance.android.ecommerce.p153a.p155b.C2740b;
import com.bytedance.android.ecommerce.p157c.AbstractC2769d;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.view.DialogC2903a;
import com.bytedance.android.ecommerce.view.OcrScanView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;

public class OcrActivity extends ActivityC0218d implements AbstractC2769d {

    /* renamed from: g */
    private static int f8558g = 250;

    /* renamed from: a */
    public OcrCameraPreview f8559a;

    /* renamed from: b */
    public OcrTitleView f8560b;

    /* renamed from: c */
    public boolean f8561c;

    /* renamed from: d */
    public boolean f8562d;

    /* renamed from: e */
    public FrameLayout f8563e;

    /* renamed from: f */
    private final String f8564f = "OcrActivity";

    /* renamed from: h */
    private ImageView f8565h;

    /* renamed from: i */
    private boolean f8566i;

    /* renamed from: j */
    private C2892b f8567j;

    /* renamed from: k */
    private OcrScanView f8568k;

    /* renamed from: l */
    private TextView f8569l;

    /* renamed from: m */
    private boolean f8570m;

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(3306);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        this.f8559a.mo7493d();
    }

    public void finish() {
        super.finish();
        if (!this.f8570m) {
            C2778c.f8362a.mo7379k().mo7348a(0, 105, "user cancel", (C2740b) null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
        if (Build.VERSION.SDK_INT < 23) {
            this.f8559a.mo7485c();
        } else if (C0643b.m2367a(this, "android.permission.CAMERA") == 0) {
            this.f8559a.mo7485c();
        } else if (!this.f8566i) {
            C0569a.m2182a(this, new String[]{"android.permission.CAMERA"}, f8558g);
            this.f8566i = true;
        } else if (this.f8561c) {
            mo7348a(0, 104, "User denied camera permission", null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo7475a(int i) {
        this.f8559a.mo7491a(i);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.f8567j = new C2892b(this);
        setContentView(R.layout.bt);
        C2892b bVar = this.f8567j;
        if (bVar.mo7525a()) {
            bVar.f8616b = new C2899e(bVar.f8615a);
            bVar.f8616b.f8631b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: IPUT  
                  (wrap: com.bytedance.android.ecommerce.ocr.view.b$1 : 0x002c: CONSTRUCTOR  (r0v31 com.bytedance.android.ecommerce.ocr.view.b$1) = (r3v0 'bVar' com.bytedance.android.ecommerce.ocr.view.b) call: com.bytedance.android.ecommerce.ocr.view.b.1.<init>(com.bytedance.android.ecommerce.ocr.view.b):void type: CONSTRUCTOR)
                  (wrap: com.bytedance.android.ecommerce.ocr.view.e : 0x0028: IGET  (r1v5 com.bytedance.android.ecommerce.ocr.view.e) = (r3v0 'bVar' com.bytedance.android.ecommerce.ocr.view.b) com.bytedance.android.ecommerce.ocr.view.b.b com.bytedance.android.ecommerce.ocr.view.e)
                 com.bytedance.android.ecommerce.ocr.view.e.b com.bytedance.android.ecommerce.ocr.view.e$a in method: com.bytedance.android.ecommerce.ocr.view.OcrActivity.onCreate(android.os.Bundle):void, file: classes8.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: CONSTRUCTOR  (r0v31 com.bytedance.android.ecommerce.ocr.view.b$1) = (r3v0 'bVar' com.bytedance.android.ecommerce.ocr.view.b) call: com.bytedance.android.ecommerce.ocr.view.b.1.<init>(com.bytedance.android.ecommerce.ocr.view.b):void type: CONSTRUCTOR in method: com.bytedance.android.ecommerce.ocr.view.OcrActivity.onCreate(android.os.Bundle):void, file: classes8.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.ecommerce.ocr.view.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 23 more
                */
            /*
            // Method dump skipped, instructions count: 197
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.view.OcrActivity.onCreate(android.os.Bundle):void");
        }

        @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != f8558g) {
                return;
            }
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f8559a.mo7485c();
            } else if (!isFinishing()) {
                String a = C2778c.f8362a.mo7376h().mo7403a("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_usernotice");
                String a2 = C2778c.f8362a.mo7376h().mo7403a("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_userok");
                String a3 = C2778c.f8362a.mo7376h().mo7403a("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_usercancel");
                C28823 r1 = new DialogC2903a.AbstractC2906a() {
                    /* class com.bytedance.android.ecommerce.ocr.view.OcrActivity.C28823 */

                    static {
                        Covode.recordClassIndex(3309);
                    }

                    @Override // com.bytedance.android.ecommerce.view.DialogC2903a.AbstractC2906a
                    /* renamed from: a */
                    public final void mo7483a() {
                        OcrActivity.this.finish();
                    }

                    @Override // com.bytedance.android.ecommerce.view.DialogC2903a.AbstractC2906a
                    /* renamed from: b */
                    public final void mo7484b() {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", OcrActivity.this.getPackageName(), null));
                        OcrActivity ocrActivity = OcrActivity.this;
                        C84349a.m145093a(intent, ocrActivity);
                        ocrActivity.startActivity(intent);
                        OcrActivity.this.f8561c = true;
                    }
                };
                DialogC2903a aVar = new DialogC2903a(this);
                aVar.f8654b = a;
                aVar.f8655c = a3;
                aVar.f8656d = a2;
                aVar.f8653a = r1;
                aVar.show();
            }
        }

        @Override // com.bytedance.android.ecommerce.p157c.AbstractC2769d
        /* renamed from: a */
        public final void mo7348a(int i, int i2, String str, C2740b bVar) {
            try {
                C2778c.f8362a.mo7379k().mo7348a(i, i2, str, bVar);
            } finally {
                this.f8570m = true;
                finish();
            }
        }
    }
