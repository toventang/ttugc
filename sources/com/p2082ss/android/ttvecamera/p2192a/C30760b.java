package com.p2082ss.android.ttvecamera.p2192a;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.CameraConfig;
import com.google.p1970ar.core.CameraConfigFilter;
import com.p2082ss.android.ttvecamera.C30806e;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.C30966n;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2192a.C30756a;
import com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b;
import com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.a.b */
public class C30760b extends AbstractC30813b {

    /* renamed from: a */
    public static final String f73633a = C30760b.class.getSimpleName();

    /* renamed from: b */
    public volatile boolean f73634b;

    /* renamed from: c */
    public C30756a f73635c;

    /* renamed from: d */
    public long f73636d;

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55632a(float f, C30933l.AbstractC30955p pVar) {
        return -421;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55633a(C30966n nVar) {
        return -412;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55634a(boolean z) {
        return -416;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final void mo55640a(String str) {
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: b */
    public final void mo55642b(float f, C30933l.AbstractC30955p pVar) {
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30812a
    /* renamed from: b */
    public final void mo55643b(int i) {
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: e */
    public final int mo55646e() {
        return -412;
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a.AbstractC30792a
    /* renamed from: f */
    public final int mo55647f() {
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a.AbstractC30792a
    /* renamed from: g */
    public final int mo55648g() {
        return 0;
    }

    /* renamed from: c */
    public final void mo55644c() {
        C30756a aVar = this.f73635c;
        if (aVar != null) {
            aVar.mo55616a();
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: h */
    public final Rect mo55649h() {
        return new Rect();
    }

    static {
        Covode.recordClassIndex(37385);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55631a() {
        C30862c cVar = this.f73830z.f73852t;
        if (this.f73792C == null || cVar == null) {
            C30969o.m63687b(f73633a, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        C30756a aVar = this.f73635c;
        if (!(aVar == null || aVar.f73623f == null)) {
            CameraConfigFilter cameraConfigFilter = new CameraConfigFilter(aVar.f73623f);
            cameraConfigFilter.setTargetFps(EnumSet.of(CameraConfig.TargetFps.TARGET_FPS_30));
            List<CameraConfig> supportedCameraConfigs = aVar.f73623f.getSupportedCameraConfigs(cameraConfigFilter);
            if (!supportedCameraConfigs.isEmpty()) {
                aVar.f73624g = supportedCameraConfigs;
                if (Build.VERSION.SDK_INT >= 21) {
                    ArrayList arrayList = new ArrayList();
                    for (CameraConfig cameraConfig : supportedCameraConfigs) {
                        arrayList.add(new TEFrameSizei(cameraConfig.getTextureSize().getWidth(), cameraConfig.getTextureSize().getHeight()));
                    }
                    if (cVar.f73930b.f73924j) {
                        cVar.mo55893a(arrayList, (TEFrameSizei) null);
                        this.f73790A.f74192p = cVar.mo55897e();
                        if (this.f73790A.f74192p != null) {
                            this.f73829y.mo55846a(50, 0, this.f73790A.f74192p.toString());
                        }
                    } else {
                        cVar.mo55893a(arrayList, this.f73790A.f74192p);
                        this.f73790A.f74193q = cVar.mo55898f();
                    }
                    this.f73635c.mo55617a(cVar.f73930b.f73922h);
                    if (cVar.mo55891a() == 1) {
                        if (cVar.mo55896d() == null) {
                            C30969o.m63689d(f73633a, "SurfaceTexture is null.");
                            return -100;
                        }
                        cVar.mo55896d().setDefaultBufferSize(this.f73790A.f74192p.f73616a, this.f73790A.f74192p.f73617b);
                    }
                    return 0;
                }
            }
        }
        return -1;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: b */
    public final void mo55641b() {
        MethodCollector.m26663i(13257);
        if (this.f73817aa && !this.f73810U) {
            long currentTimeMillis = System.currentTimeMillis() - this.f73636d;
            C30756a aVar = this.f73635c;
            if (aVar != null && currentTimeMillis > 0) {
                long d = aVar.mo55622d() - currentTimeMillis;
                if (d > 0) {
                    C30969o.m63689d(f73633a, "close session, but first preview not arrive...wait: ".concat(String.valueOf(d)));
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        this.f73817aa = false;
        this.f73634b = false;
        if (this.f73830z.f73852t == null || this.f73830z.f73852t.f73930b == null) {
            C30969o.m63688c(f73633a, "ProviderManager or Provider is null!");
        } else {
            this.f73830z.f73852t.f73930b.mo55881a((Object) null);
        }
        C30756a aVar2 = this.f73635c;
        if (aVar2 != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (aVar2.f73623f != null) {
                aVar2.f73623f.pause();
            }
            C30969o.m63686a(C30756a.f73618a, "pause consume = " + (System.currentTimeMillis() - currentTimeMillis2));
        }
        C30969o.m63686a(f73633a, "ARCore session paused");
        super.mo55641b();
        MethodCollector.m26664o(13257);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: d */
    public final int mo55645d() {
        List<Surface> asList;
        Handler handler;
        C30862c cVar = this.f73830z.f73852t;
        if (this.f73792C == null || cVar == null) {
            C30969o.m63687b(f73633a, "CameraDevice or ProviderManager is null!");
            return -100;
        } else if (this.f73635c == null) {
            return -1;
        } else {
            int a = mo55631a();
            if (a != 0) {
                return a;
            }
            AbstractC30857b bVar = cVar.f73930b;
            int i = bVar.mo55886i();
            if (i != -1) {
                C30756a aVar = this.f73635c;
                if (aVar.f73623f != null) {
                    aVar.f73623f.setCameraTextureName(i);
                }
            }
            C30756a aVar2 = this.f73635c;
            bVar.mo55874a(aVar2.f73622e == null ? null : aVar2.f73622e.getSurfaceTexture());
            this.f73826v = this.f73792C.createCaptureRequest(3);
            int c = cVar.f73930b.mo55876c();
            if (c == 2) {
                asList = Arrays.asList(cVar.mo55894b());
            } else if (c != 8) {
                asList = null;
            } else {
                asList = Arrays.asList(cVar.mo55895c());
                if (asList.size() > 1) {
                    asList.remove(0);
                }
            }
            C30756a aVar3 = this.f73635c;
            List<Surface> arCoreSurfaces = aVar3.f73622e == null ? null : aVar3.f73622e.getArCoreSurfaces();
            if (asList != null) {
                C30756a aVar4 = this.f73635c;
                String str = this.f73790A.f74139F;
                if (aVar4.f73622e != null) {
                    aVar4.f73622e.setAppSurfaces(str, asList);
                }
                arCoreSurfaces.addAll(asList);
            }
            for (Surface surface : arCoreSurfaces) {
                this.f73826v.addTarget(surface);
            }
            if (this.f73790A.f74153T) {
                this.f73826v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo55711a(new Range<>(Integer.valueOf(this.f73806Q.f73613a / this.f73790A.f74180d.f73615c), Integer.valueOf(this.f73806Q.f73614b / this.f73790A.f74180d.f73615c))));
            }
            this.f73810U = false;
            this.f73811V = System.currentTimeMillis();
            if (this.f73790A.f74188l) {
                handler = mo55832x();
            } else {
                handler = this.f73793D;
            }
            this.f73827w = null;
            CameraCaptureSession.StateCallback r0 = new CameraCaptureSession.StateCallback() {
                /* class com.p2082ss.android.ttvecamera.p2192a.C30760b.C307632 */

                static {
                    Covode.recordClassIndex(37388);
                }

                public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                    C30760b.this.mo55638a(cameraCaptureSession, 6, (Object) null);
                }

                public final void onClosed(CameraCaptureSession cameraCaptureSession) {
                    C30760b.this.mo55638a(cameraCaptureSession, 5, (Object) null);
                }

                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    C30760b.this.mo55638a(cameraCaptureSession, 1, (Object) null);
                    C30969o.m63686a(C30760b.f73633a, "onConfigureFailed...");
                    C30760b.this.f73830z.mo55798f(4);
                }

                public final void onReady(CameraCaptureSession cameraCaptureSession) {
                    C30969o.m63686a(C30760b.f73633a, "onReady...");
                    if (C30760b.this.f73817aa) {
                        C30760b.this.mo55638a(cameraCaptureSession, 4, (Object) null);
                    } else {
                        C30969o.m63689d(C30760b.f73633a, "onReady...session not alive");
                    }
                }

                public final void onActive(CameraCaptureSession cameraCaptureSession) {
                    C30969o.m63686a(C30760b.f73633a, "onActive..." + C30760b.this.f73817aa);
                    if (!C30760b.this.f73817aa) {
                        C30969o.m63689d(C30760b.f73633a, "onActive...session not alive");
                    } else if (C30760b.this.f73635c != null && C30760b.this.f73635c.f73623f != null) {
                        C30760b.this.f73635c.mo55619a(C30760b.this.f73820ad);
                        C30760b.this.f73634b = true;
                        C30760b.this.f73830z.f73852t.f73930b.mo55881a(C30760b.this.f73635c.f73623f);
                    }
                }

                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C30760b.this.mo55638a(cameraCaptureSession, 0, (Object) null);
                    C30760b.this.mo55638a(cameraCaptureSession, 3, (Object) null);
                    C30760b.this.f73636d = System.currentTimeMillis();
                    C30969o.m63686a(C30760b.f73633a, "onConfigured...createSessionConsume = ".concat(String.valueOf(C30760b.this.f73636d - C30760b.this.f73811V)));
                    if (C30760b.this.f73792C == null) {
                        C30969o.m63689d(C30760b.f73633a, "onConfigured...device has closed...");
                        cameraCaptureSession.close();
                        C30760b.this.mo55833y();
                        return;
                    }
                    C30760b.this.f73817aa = true;
                    C30760b.this.f73827w = cameraCaptureSession;
                    try {
                        int m = C30760b.this.mo55724m();
                        if (m != 0) {
                            C30760b.this.f73829y.mo55847a(m, "updateCapture : something wrong.");
                            C30969o.m63689d(C30760b.f73633a, "update capture failed, device: " + C30760b.this.f73792C);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                    C30760b.this.mo55638a(cameraCaptureSession, 7, surface);
                }
            };
            this.f73819ac = r0;
            mo55717a(arCoreSurfaces, r0, handler, false);
            if (this.f73827w == null) {
                mo55834z();
            }
            return 0;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final Rect mo55635a(float f) {
        return new Rect();
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final String mo55636a(int i) {
        String c;
        C30756a aVar = this.f73635c;
        if (aVar == null || (c = aVar.mo55621c()) == null) {
            return null;
        }
        this.f73824t = this.f73828x.getCameraCharacteristics(c);
        C30933l lVar = this.f73790A;
        int i2 = 1;
        if (((Integer) this.f73824t.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            i2 = 0;
        }
        lVar.f74181e = i2;
        return c;
    }

    /* renamed from: a */
    public final void mo55637a(Context context, Handler handler) {
        if (this.f73825u.mo55860d()) {
            C30756a aVar = C30756a.C30759a.f73632a;
            this.f73635c = aVar;
            aVar.mo55618a(context, this.f73790A);
            this.f73635c.f73620c = handler;
        }
    }

    /* renamed from: a */
    public final void mo55638a(CameraCaptureSession cameraCaptureSession, int i, Object obj) {
        C30756a aVar;
        if (cameraCaptureSession != null && (aVar = this.f73635c) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar.f73621d == null && aVar.f73622e != null && Build.VERSION.SDK_INT >= 21) {
                aVar.f73621d = aVar.f73622e.createARSessionStateCallback(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: IPUT  
                      (wrap: android.hardware.camera2.CameraCaptureSession$StateCallback : 0x0021: INVOKE  (r0v23 android.hardware.camera2.CameraCaptureSession$StateCallback) = 
                      (wrap: com.google.ar.core.SharedCamera : 0x0018: IGET  (r2v3 com.google.ar.core.SharedCamera) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) com.ss.android.ttvecamera.a.a.e com.google.ar.core.SharedCamera)
                      (wrap: com.ss.android.ttvecamera.a.a$1 : 0x001c: CONSTRUCTOR  (r1v4 com.ss.android.ttvecamera.a.a$1) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) call: com.ss.android.ttvecamera.a.a.1.<init>(com.ss.android.ttvecamera.a.a):void type: CONSTRUCTOR)
                      (wrap: android.os.Handler : 0x001f: IGET  (r0v22 android.os.Handler) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) com.ss.android.ttvecamera.a.a.c android.os.Handler)
                     type: VIRTUAL call: com.google.ar.core.SharedCamera.createARSessionStateCallback(android.hardware.camera2.CameraCaptureSession$StateCallback, android.os.Handler):android.hardware.camera2.CameraCaptureSession$StateCallback)
                      (r4v0 'aVar' com.ss.android.ttvecamera.a.a)
                     com.ss.android.ttvecamera.a.a.d android.hardware.camera2.CameraCaptureSession$StateCallback in method: com.ss.android.ttvecamera.a.b.a(android.hardware.camera2.CameraCaptureSession, int, java.lang.Object):void, file: classes8.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: INVOKE  (r0v23 android.hardware.camera2.CameraCaptureSession$StateCallback) = 
                      (wrap: com.google.ar.core.SharedCamera : 0x0018: IGET  (r2v3 com.google.ar.core.SharedCamera) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) com.ss.android.ttvecamera.a.a.e com.google.ar.core.SharedCamera)
                      (wrap: com.ss.android.ttvecamera.a.a$1 : 0x001c: CONSTRUCTOR  (r1v4 com.ss.android.ttvecamera.a.a$1) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) call: com.ss.android.ttvecamera.a.a.1.<init>(com.ss.android.ttvecamera.a.a):void type: CONSTRUCTOR)
                      (wrap: android.os.Handler : 0x001f: IGET  (r0v22 android.os.Handler) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) com.ss.android.ttvecamera.a.a.c android.os.Handler)
                     type: VIRTUAL call: com.google.ar.core.SharedCamera.createARSessionStateCallback(android.hardware.camera2.CameraCaptureSession$StateCallback, android.os.Handler):android.hardware.camera2.CameraCaptureSession$StateCallback in method: com.ss.android.ttvecamera.a.b.a(android.hardware.camera2.CameraCaptureSession, int, java.lang.Object):void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r1v4 com.ss.android.ttvecamera.a.a$1) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) call: com.ss.android.ttvecamera.a.a.1.<init>(com.ss.android.ttvecamera.a.a):void type: CONSTRUCTOR in method: com.ss.android.ttvecamera.a.b.a(android.hardware.camera2.CameraCaptureSession, int, java.lang.Object):void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ttvecamera.a.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 167
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.p2192a.C30760b.mo55638a(android.hardware.camera2.CameraCaptureSession, int, java.lang.Object):void");
            }

            /* renamed from: a */
            public final void mo55639a(CameraDevice cameraDevice, int i, int i2) {
                C30756a aVar;
                if (cameraDevice != null && (aVar = this.f73635c) != null) {
                    CameraDevice.StateCallback b = aVar.mo55620b();
                    if (b == null) {
                        C30969o.m63688c(f73633a, "on device proxy failed, state: " + i + ", arg1: " + i2);
                    } else if (i == 0) {
                        b.onOpened(cameraDevice);
                    } else if (i == 1) {
                        b.onDisconnected(cameraDevice);
                    } else if (i == 3) {
                        b.onError(cameraDevice, i2);
                    } else if (i == 4) {
                        try {
                            b.onClosed(cameraDevice);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            public C30760b(C30806e eVar, Context context, CameraManager cameraManager, Handler handler) {
                super(eVar, context, handler);
                this.f73828x = cameraManager;
                this.f73820ad = new CameraCaptureSession.CaptureCallback() {
                    /* class com.p2082ss.android.ttvecamera.p2192a.C30760b.C307611 */

                    static {
                        Covode.recordClassIndex(37386);
                    }

                    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        MethodCollector.m26663i(9182);
                        if (!C30760b.this.f73810U) {
                            C30760b.this.mo55833y();
                            C30760b.this.f73810U = true;
                            C30969o.m63686a(C30760b.f73633a, "first preview frame callback arrived! consume = ".concat(String.valueOf(System.currentTimeMillis() - C30760b.this.f73813X)));
                            if (C30760b.this.f73635c != null) {
                                C30756a aVar = C30760b.this.f73635c;
                                long currentTimeMillis = System.currentTimeMillis() - aVar.f73626i;
                                synchronized (aVar.f73625h) {
                                    try {
                                        if (aVar.f73627j.size() > C30756a.f73619b) {
                                            aVar.f73627j.remove(0);
                                        }
                                        aVar.f73627j.add(Long.valueOf(currentTimeMillis));
                                    } catch (Throwable th) {
                                        MethodCollector.m26664o(9182);
                                        throw th;
                                    }
                                }
                            }
                        }
                        if (!C30760b.this.f73634b) {
                            C30969o.m63689d(C30760b.f73633a, "discardSurfaceTextureOnFrameAvailable");
                            MethodCollector.m26664o(9182);
                            return;
                        }
                        if (!C30760b.this.f73790A.f74188l) {
                            C30760b.this.f73830z.f73852t.f73930b.mo55885h();
                        } else if (C30760b.this.f73793D != null) {
                            C30760b.this.f73793D.post(new Runnable() {
                                /* class com.p2082ss.android.ttvecamera.p2192a.C30760b.C307611.RunnableC307621 */

                                static {
                                    Covode.recordClassIndex(37387);
                                }

                                public final void run() {
                                    if (C30760b.this.f73634b) {
                                        C30760b.this.f73830z.f73852t.f73930b.mo55885h();
                                    } else {
                                        C30969o.m63689d(C30760b.f73633a, "inner discardSurfaceTextureOnFrameAvailable");
                                    }
                                }
                            });
                            MethodCollector.m26664o(9182);
                            return;
                        }
                        MethodCollector.m26664o(9182);
                    }
                };
            }
        }
