package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.view.SurfaceHolder;
import androidx.core.app.ActivityC0580d;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.camera.AbstractC29994a;
import com.p2082ss.android.medialib.model.Enigma;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.medialib.model.TdPoint;
import com.p2082ss.android.medialib.p2158qr.ScanSettings;
import com.p2082ss.android.ugc.asve.context.AbstractC31033b;
import com.p2082ss.android.ugc.asve.context.AbstractC31034c;
import com.p2082ss.android.ugc.asve.context.C31032a;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31020c;
import com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a;
import com.p2082ss.android.ugc.asve.recorder.C31117a;
import com.p2082ss.android.ugc.asve.recorder.camera.C31165b;
import com.p2082ss.android.ugc.asve.recorder.camera.C31181c;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65347aq;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.property.C65425dh;
import com.p2082ss.android.ugc.aweme.property.C65493p;
import com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.p2082ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVEnigma;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVEnigmaResult;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVScanSettings;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVTdPoint;
import com.p2082ss.android.ugc.aweme.setting.C68339r;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73430n;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72770ar;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.vesdk.C85378ay;
import com.p2082ss.android.vesdk.VECameraSettings;
import com.p2082ss.android.vesdk.runtime.VERuntime;

/* renamed from: com.ss.android.ugc.aweme.dt */
public final class C43243dt implements IQRCodeScanner {

    /* renamed from: a */
    public C31117a f100964a;

    /* renamed from: b */
    public IQRCodeScanner.OnEnigmaScanListener f100965b;

    /* renamed from: c */
    private Integer f100966c = -1;

    static {
        Covode.recordClassIndex(51445);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void release() {
        C31117a aVar = this.f100964a;
        if (aVar != null) {
            aVar.mo56550h().mo56233c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stop() {
        C31117a aVar = this.f100964a;
        if (aVar != null) {
            aVar.mo56550h().mo56232b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stopPicScan() {
        C31117a aVar = this.f100964a;
        if (aVar != null) {
            aVar.mo56550h().mo56223a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void closeLight() {
        C31117a aVar = this.f100964a;
        if (aVar != null) {
            aVar.mo56545c().mo56663b(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF.ordinal());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void openLight() {
        C31117a aVar = this.f100964a;
        if (aVar != null) {
            aVar.mo56545c().mo56663b(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH.ordinal());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void pauseEffectAudio(boolean z) {
        this.f100964a.mo56550h().mo56229a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void zoomByRatio(float f) {
        C31117a aVar = this.f100964a;
        if (aVar != null) {
            aVar.mo56545c().mo56670b(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void setScanListener(IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener) {
        this.f100965b = onEnigmaScanListener;
        C31117a aVar = this.f100964a;
        if (aVar != null) {
            aVar.mo56550h().mo56226a(new AbstractC31049a.AbstractC31051b() {
                /* class com.p2082ss.android.ugc.aweme.C43243dt.C432484 */

                static {
                    Covode.recordClassIndex(51450);
                }

                @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a.AbstractC31051b
                /* renamed from: a */
                public final void mo56234a(int i) {
                    if (C43243dt.this.f100965b != null) {
                        C43243dt.this.f100965b.onFail(i);
                    }
                }

                @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a.AbstractC31051b
                /* renamed from: a */
                public final void mo56235a(EnigmaResult enigmaResult) {
                    AVTdPoint[] aVTdPointArr;
                    if (C43243dt.this.f100965b != null) {
                        IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener = C43243dt.this.f100965b;
                        AVEnigmaResult aVEnigmaResult = null;
                        if (enigmaResult != null) {
                            AVEnigmaResult aVEnigmaResult2 = new AVEnigmaResult();
                            aVEnigmaResult2.zoomFactor = enigmaResult.zoomFactor;
                            Enigma[] result = enigmaResult.getResult();
                            if (result != null) {
                                AVEnigma[] aVEnigmaArr = new AVEnigma[result.length];
                                for (int i = 0; i < result.length; i++) {
                                    AVEnigma aVEnigma = new AVEnigma();
                                    aVEnigma.setText(result[i].getText());
                                    aVEnigma.setType(result[i].getType());
                                    TdPoint[] points = result[i].getPoints();
                                    if (points == null) {
                                        aVTdPointArr = null;
                                    } else {
                                        aVTdPointArr = new AVTdPoint[points.length];
                                        for (int i2 = 0; i2 < points.length; i2++) {
                                            AVTdPoint aVTdPoint = new AVTdPoint();
                                            aVTdPoint.setX(points[i2].getX());
                                            aVTdPoint.setY(points[i2].getY());
                                            aVTdPointArr[i2] = aVTdPoint;
                                        }
                                    }
                                    aVEnigma.setPoints(aVTdPointArr);
                                    aVEnigmaArr[i] = aVEnigma;
                                }
                                aVEnigmaResult2.setResult(aVEnigmaArr);
                            }
                            aVEnigmaResult = aVEnigmaResult2;
                        }
                        onEnigmaScanListener.onSuccess(aVEnigmaResult);
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void processTouchEvent(float f, float f2) {
        this.f100964a.mo56550h().mo56224a(f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void enableCameraScan(boolean z, long j) {
        if (this.f100964a != null && !C65369bi.m117065a()) {
            this.f100964a.mo56550h().mo56230a(z, j);
        }
    }

    public C43243dt(Context context, final SurfaceHolder surfaceHolder) {
        C31117a aVar;
        C63238c.m114590a(C71815es.m126788a());
        C31165b.f74716b = C65493p.m117218a();
        C31181c.f74765a = C65347aq.m117033a();
        C31182a a = new C73430n().mo115073a();
        if (C65369bi.m117065a()) {
            VERuntime.EnumC85549a.INSTANCE.f191667b.f191650i = true;
        }
        C31117a a2 = C31117a.C31118a.m64349a((ActivityC0580d) context, new AbstractC31033b() {
            /* class com.p2082ss.android.ugc.aweme.C43243dt.C432441 */

            static {
                Covode.recordClassIndex(51446);
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31033b, com.p2082ss.android.ugc.asve.context.AbstractC31040h
            /* renamed from: c */
            public final boolean mo56156c() {
                return true;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31033b, com.p2082ss.android.ugc.asve.context.AbstractC31040h
            /* renamed from: a */
            public final boolean mo56154a() {
                return C65425dh.f147580a;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31033b, com.p2082ss.android.ugc.asve.context.AbstractC31040h
            /* renamed from: d */
            public final SurfaceHolder mo56157d() {
                return surfaceHolder;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31033b, com.p2082ss.android.ugc.asve.context.AbstractC31040h
            /* renamed from: b */
            public final boolean mo56155b() {
                return C68339r.m120619a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31033b, com.p2082ss.android.ugc.asve.context.AbstractC31040h
            /* renamed from: o */
            public final AbstractC31034c mo56168o() {
                return new C31032a() {
                    /* class com.p2082ss.android.ugc.aweme.C43243dt.C432441.C432451 */

                    static {
                        Covode.recordClassIndex(51447);
                    }

                    @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
                    /* renamed from: i */
                    public final boolean mo56146i() {
                        return false;
                    }

                    @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
                    /* renamed from: a */
                    public final EnumC31020c mo56138a() {
                        return EnumC31020c.AS_CAMERA_LENS_BACK;
                    }
                };
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31033b, com.p2082ss.android.ugc.asve.context.AbstractC31040h
            /* renamed from: z */
            public final boolean mo56179z() {
                return C65369bi.m117065a();
            }
        }, a);
        this.f100964a = a2;
        a2.mo56545c().mo56647a(new C72770ar(""));
        this.f100964a.mo56545c().mo56643a(new AbstractC29994a() {
            /* class com.p2082ss.android.ugc.aweme.C43243dt.C432462 */

            static {
                Covode.recordClassIndex(51448);
            }

            @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
            /* renamed from: a */
            public final void mo52822a(int i) {
            }

            @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
            /* renamed from: a */
            public final void mo52823a(int i, int i2, String str) {
                if (C43243dt.this.f100965b != null) {
                    C43243dt.this.f100965b.onFail(-1000);
                }
            }
        });
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            /* class com.p2082ss.android.ugc.aweme.C43243dt.SurfaceHolder$CallbackC432473 */

            static {
                Covode.recordClassIndex(51449);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (C43243dt.this.f100964a != null) {
                    C43243dt.this.f100964a.mo56545c().mo56642a(EnumC31020c.AS_CAMERA_LENS_BACK.ordinal(), (AbstractC29994a) null, (PrivacyCert) null);
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (C43243dt.this.f100964a != null) {
                    C43243dt.this.f100964a.mo56545c().mo56654a(false, (PrivacyCert) null);
                }
            }
        });
        if (surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid() && (aVar = this.f100964a) != null) {
            aVar.mo56545c().mo56642a(EnumC31020c.AS_CAMERA_LENS_BACK.ordinal(), (AbstractC29994a) null, (PrivacyCert) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startPicScan(String str, AVScanSettings aVScanSettings, long j) {
        C31117a aVar = this.f100964a;
        if (aVar != null) {
            AbstractC31049a h = aVar.mo56550h();
            ScanSettings scanSettings = new ScanSettings();
            scanSettings.width = aVScanSettings.width;
            scanSettings.height = aVScanSettings.height;
            scanSettings.detectModelDir = aVScanSettings.detectModelDir;
            scanSettings.detectRectLeft = aVScanSettings.detectRectLeft;
            scanSettings.detectRectTop = aVScanSettings.detectRectTop;
            scanSettings.detectRectWidth = aVScanSettings.detectRectWidth;
            scanSettings.detectRectHeight = aVScanSettings.detectRectHeight;
            scanSettings.enableDetectRect = aVScanSettings.enableDetectRect;
            scanSettings.detectRequirement = aVScanSettings.detectRequirement;
            scanSettings.buildChainFlag = aVScanSettings.buildChainFlag;
            h.mo56228a(str, scanSettings, j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void switchEffectWithTag(String str, int i, int i2, String str2) {
        this.f100964a.mo56550h().mo56227a(str, i, i2, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startScan(Context context, AVCameraParams aVCameraParams, SurfaceHolder surfaceHolder, AVScanSettings aVScanSettings) {
        C63238c.m114594d();
        C85378ay.m146870a(DownloadableModelSupport.getInstance().getResourceFinder());
        if (this.f100964a == null) {
            return;
        }
        if (C65369bi.m117065a()) {
            this.f100966c = Integer.valueOf(this.f100964a.mo56550h().mo56231b(aVScanSettings.detectRectLeft, aVScanSettings.detectRectTop, aVScanSettings.detectRectWidth, aVScanSettings.detectRectHeight));
        } else {
            this.f100964a.mo56550h().mo56225a(aVScanSettings.detectRectLeft, aVScanSettings.detectRectTop, aVScanSettings.detectRectWidth, aVScanSettings.detectRectHeight);
        }
    }
}
