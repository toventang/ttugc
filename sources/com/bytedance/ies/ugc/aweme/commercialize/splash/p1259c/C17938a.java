package com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.C17957a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1261e.C17960a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17970f;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17978b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17982f;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17983g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17993j;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C18001k;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.C18009d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18027h;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18031k;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18137d;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.C24261b;
import com.facebook.fresco.animation.p1867c.AbstractC24295b;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.p2092ad.splash.AbstractC29369a;
import com.p2082ss.android.p2092ad.splash.AbstractC29372aa;
import com.p2082ss.android.p2092ad.splash.AbstractC29374b;
import com.p2082ss.android.p2092ad.splash.AbstractC29382c;
import com.p2082ss.android.p2092ad.splash.AbstractC29629d;
import com.p2082ss.android.p2092ad.splash.AbstractC29635e;
import com.p2082ss.android.p2092ad.splash.AbstractC29670k;
import com.p2082ss.android.p2092ad.splash.AbstractC29672m;
import com.p2082ss.android.p2092ad.splash.AbstractC29675p;
import com.p2082ss.android.p2092ad.splash.AbstractC29681s;
import com.p2082ss.android.p2092ad.splash.AbstractC29683u;
import com.p2082ss.android.p2092ad.splash.AbstractC29686x;
import com.p2082ss.android.p2092ad.splash.C29666h;
import com.p2082ss.android.p2092ad.splash.C29673n;
import com.p2082ss.android.p2092ad.splash.C29679r;
import com.p2082ss.android.p2092ad.splash.C29687y;
import com.p2082ss.android.p2092ad.splash.core.C29525j;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29516i;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29385c;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38006d;
import com.p2082ss.android.ugc.aweme.commercialize.track.C38526b;
import com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38583c;
import com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.utils.C80271br;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a */
public class C17938a {

    /* renamed from: a */
    public static volatile boolean f42757a;

    /* renamed from: b */
    private static volatile boolean f42758b;

    /* renamed from: c */
    private static volatile AbstractC29683u f42759c;

    /* renamed from: d */
    private static volatile boolean f42760d = true;

    /* renamed from: e */
    private static volatile boolean f42761e;

    /* renamed from: f */
    private static final Object f42762f = new Object();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a$a */
    public static class C17950a implements AbstractC29672m {
        static {
            Covode.recordClassIndex(20566);
        }

        private C17950a() {
        }

        /* synthetic */ C17950a(byte b) {
            this();
        }

        @Override // com.p2082ss.android.p2092ad.splash.AbstractC29672m
        /* renamed from: a */
        public final void mo28691a(String str, String str2, long j, JSONObject jSONObject) {
            C17867d.m33078a();
            if (TextUtils.equals(str2, "click")) {
                C39162r.m79456a(str, str2, String.valueOf(j), 0, jSONObject);
                return;
            }
            C18129a.C18130a a = C18129a.m33747a(str, str2, String.valueOf(j), "", "0");
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a.mo28900b(next, jSONObject.opt(next));
                }
            }
            a.mo28902c();
            if (C18137d.m33765b()) {
                C39162r.m79456a(str, str2, String.valueOf(j), 0, jSONObject);
            } else if (C18137d.m33764a()) {
                try {
                    jSONObject.put("_ad_staging_flag", "1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C39162r.m79456a(str, str2, String.valueOf(j), 0, jSONObject);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a$b */
    public static class C17951b implements AbstractC29686x {
        static {
            Covode.recordClassIndex(20567);
        }

        private C17951b() {
        }

        /* synthetic */ C17951b(byte b) {
            this();
        }

        @Override // com.p2082ss.android.p2092ad.splash.AbstractC29686x
        /* renamed from: a */
        public final void mo28692a(ImageView imageView, String str, int i, AbstractC29675p pVar) {
            C17964b.f42782a = false;
            if (!C29657l.m59760a(str)) {
                if (((long) i) == 1) {
                    Context a = C17867d.m33078a();
                    C24185e b = C24182c.m45843b();
                    b.f57299c = (REQUEST) C24639c.m47149a(Uri.parse("file://".concat(String.valueOf(str)))).mo40483a();
                    b.f57303g = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0036: IPUT  
                          (wrap: com.bytedance.ies.ugc.aweme.commercialize.splash.f.a$1 : 0x0033: CONSTRUCTOR  (r0v10 com.bytedance.ies.ugc.aweme.commercialize.splash.f.a$1) = (r11v0 'pVar' com.ss.android.ad.splash.p) call: com.bytedance.ies.ugc.aweme.commercialize.splash.f.a.1.<init>(com.ss.android.ad.splash.p):void type: CONSTRUCTOR)
                          (r1v2 'b' com.facebook.drawee.a.a.e)
                         com.facebook.drawee.c.b.g com.facebook.drawee.c.d in method: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.b.a(android.widget.ImageView, java.lang.String, int, com.ss.android.ad.splash.p):void, file: classes7.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: CONSTRUCTOR  (r0v10 com.bytedance.ies.ugc.aweme.commercialize.splash.f.a$1) = (r11v0 'pVar' com.ss.android.ad.splash.p) call: com.bytedance.ies.ugc.aweme.commercialize.splash.f.a.1.<init>(com.ss.android.ad.splash.p):void type: CONSTRUCTOR in method: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.b.a(android.widget.ImageView, java.lang.String, int, com.ss.android.ad.splash.p):void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 28 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.ugc.aweme.commercialize.splash.f.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 32 more
                        */
                    /*
                    // Method dump skipped, instructions count: 112
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C17951b.mo28692a(android.widget.ImageView, java.lang.String, int, com.ss.android.ad.splash.p):void");
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29686x
                /* renamed from: a */
                public final void mo28693a(ImageView imageView, String str, int i, String str2, AbstractC29675p pVar) {
                    Bitmap a;
                    C17964b.f42782a = false;
                    if (!C29657l.m59760a(str)) {
                        Context a2 = C17867d.m33078a();
                        if (((long) i) == 1) {
                            byte[] a3 = C29673n.m59808c(a2).mo51685a(str, str2);
                            if (a3 != null) {
                                C24185e b = C24182c.m45843b();
                                b.f57299c = (REQUEST) C24639c.m47149a(Uri.parse("data:image/gif;base64," + Base64.encodeToString(a3, 2))).mo40483a();
                                b.f57303g = new C24202c<AbstractC24457f>(pVar) {
                                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179478 */

                                    /* renamed from: a */
                                    final /* synthetic */ AbstractC29675p f42767a;

                                    static {
                                        Covode.recordClassIndex(20563);
                                    }

                                    {
                                        this.f42767a = r1;
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                                    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                                    public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                                        if (animatable != null) {
                                            try {
                                                C24290a aVar = (C24290a) animatable;
                                                aVar.mo40069a(new C38006d(aVar.f57588d, 1));
                                                aVar.mo40070a(new AbstractC24295b() {
                                                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179478.C179481 */

                                                    static {
                                                        Covode.recordClassIndex(20564);
                                                    }

                                                    @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
                                                    /* renamed from: a */
                                                    public final void mo9284a(C24290a aVar, int i) {
                                                    }

                                                    @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
                                                    /* renamed from: c */
                                                    public final void mo9286c(C24290a aVar) {
                                                    }

                                                    @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
                                                    /* renamed from: a */
                                                    public final void mo9283a(C24290a aVar) {
                                                        if (C179478.this.f42767a != null) {
                                                            C179478.this.f42767a.mo51418a();
                                                        }
                                                    }

                                                    @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
                                                    /* renamed from: b */
                                                    public final void mo9285b(C24290a aVar) {
                                                        if (C179478.this.f42767a != null) {
                                                            C179478.this.f42767a.mo51419b();
                                                        }
                                                    }
                                                });
                                                animatable.start();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                };
                                b.f57306j = false;
                                AbstractC24195a c = b.mo39827e();
                                C24261b a4 = C24261b.m46095a(new C24247b(imageView.getResources()).mo39973a());
                                a4.mo40001a(c);
                                Drawable f = a4.mo40008f();
                                if (f != null) {
                                    imageView.setImageDrawable(f);
                                } else {
                                    pVar.mo51420c();
                                }
                            } else {
                                pVar.mo51420c();
                            }
                        } else {
                            byte[] a5 = C29673n.m59808c(a2).mo51685a(str, str2);
                            if (a5 == null || (a = C17938a.m33343a(a5, C13628n.m24504a(a2), C13628n.m24521b(a2))) == null) {
                                pVar.mo51420c();
                            } else {
                                imageView.setImageBitmap(a);
                            }
                        }
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a$c */
            public static class C17952c implements AbstractC29372aa {
                static {
                    Covode.recordClassIndex(20568);
                }

                private C17952c() {
                }

                /* synthetic */ C17952c(byte b) {
                    this();
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa
                /* renamed from: a */
                public final C29516i mo28694a(String str) {
                    String c = RawURLGetter.m78123c();
                    try {
                        String a = C38526b.m78142a(str, System.currentTimeMillis(), c);
                        C51423a.m95784a(3, null, "TrackUrlResponse_sendTrackUrl trackUrl = ".concat(String.valueOf(a)));
                        C22099u<String> execute = C17970f.m33449b().executeGet(0, a, c).execute();
                        C29516i.C29517a aVar = new C29516i.C29517a();
                        aVar.f70284b = execute.f52261a.f52040b;
                        aVar.f70283a = c;
                        return aVar.mo51615a();
                    } catch (Exception e) {
                        e.printStackTrace();
                        C51423a.m95790a((Throwable) new C17956e(e));
                        C29516i.C29517a aVar2 = new C29516i.C29517a();
                        aVar2.f70284b = -1;
                        aVar2.f70283a = c;
                        return aVar2.mo51615a();
                    }
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa
                /* renamed from: b */
                public final C29687y mo28699b(String str) {
                    if (C17957a.m33426a().mo28636f()) {
                        return null;
                    }
                    try {
                        C51423a.m95784a(3, null, "SplashAdResponse_sendStockUrl".concat(String.valueOf(str)));
                        try {
                            JSONObject jSONObject = new JSONObject((String) C17970f.m33448a().executeGet(0, str).execute().f52262b);
                            C29687y.C29688a aVar = new C29687y.C29688a();
                            aVar.f70830b = true;
                            aVar.f70829a = jSONObject;
                            return new C29687y(aVar);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            return null;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        C51423a.m95790a((Throwable) new C17956e(e2));
                        return null;
                    }
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa
                /* renamed from: a */
                public final C29687y mo28696a(String str, JSONObject jSONObject) {
                    try {
                        C51423a.m95784a(3, null, "SplashAdResponse_sendSplashAckUrl url path = ".concat(String.valueOf(str)));
                        JSONObject jSONObject2 = new JSONObject((String) C17970f.m33448a().executePost(0, C38583c.f91178a + str, new TypedByteArray("application/json", jSONObject.toString().getBytes("UTF-8"), new String[0])).execute().f52262b);
                        C29687y.C29688a aVar = new C29687y.C29688a();
                        aVar.f70830b = true;
                        aVar.f70829a = jSONObject2;
                        return new C29687y(aVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                        C51423a.m95790a((Throwable) new C17956e(e));
                        return null;
                    }
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa
                /* renamed from: a */
                public final C29687y mo28695a(String str, String str2) {
                    T t;
                    if (C29657l.m59760a(str) || C17957a.m33426a().mo28636f()) {
                        return null;
                    }
                    boolean z = false;
                    try {
                        String b = C17957a.m33426a().mo28626b();
                        if (!TextUtils.isEmpty(b)) {
                            str = str + "&user_id=" + b;
                        }
                        String str3 = str + "&gaid=" + URLEncoder.encode(C17957a.m33426a().mo28630c());
                        String c = RawURLGetter.m78123c();
                        if (!TextUtils.isEmpty(c)) {
                            str3 = str3 + "&ad_user_agent=" + URLEncoder.encode(c);
                        }
                        String str4 = C38583c.f91178a + (str3 + "&cmpl_enc=" + C17957a.m33426a().mo28634e());
                        C51423a.m95791b(3, null, "SplashAdResponse_loadAdMessage url = ".concat(String.valueOf(str4)));
                        t = C17970f.m33448a().executePost(0, str4, str2).execute().f52262b;
                        if (t == null) {
                            t = "";
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        C51423a.m95790a((Throwable) new C17956e(e));
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(t);
                        C29687y.C29688a aVar = new C29687y.C29688a();
                        if (!TextUtils.isEmpty(t)) {
                            z = true;
                        }
                        aVar.f70830b = z;
                        aVar.f70829a = jSONObject;
                        return new C29687y(aVar);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        return null;
                    }
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa
                /* renamed from: a */
                public final boolean mo28698a(String str, String str2, C29666h hVar) {
                    if (C29657l.m59760a(str) || C29657l.m59760a(str2)) {
                        return false;
                    }
                    if (new File(str2).exists()) {
                        return true;
                    }
                    return C17938a.m33351a(str, str2, hVar);
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa
                /* renamed from: a */
                public final void mo28697a(String str, String str2, C29666h hVar, AbstractC29372aa.AbstractC29373a aVar) {
                    C179499 r4 = new IDownloadListener(aVar, hVar, str) {
                        /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179499 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC29372aa.AbstractC29373a f42769a;

                        /* renamed from: b */
                        final /* synthetic */ C29666h f42770b;

                        /* renamed from: c */
                        final /* synthetic */ String f42771c;

                        static {
                            Covode.recordClassIndex(20565);
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onCanceled(DownloadInfo downloadInfo) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFirstStart(DownloadInfo downloadInfo) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFirstSuccess(DownloadInfo downloadInfo) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onPause(DownloadInfo downloadInfo) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onPrepare(DownloadInfo downloadInfo) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onStart(DownloadInfo downloadInfo) {
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            AbstractC29372aa.AbstractC29373a aVar = this.f42769a;
                            if (aVar != null) {
                                aVar.mo51353a();
                            }
                            C17960a.m33434b(true, Long.valueOf(this.f42770b.f70739a), this.f42770b.f70740b, null);
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            AbstractC29372aa.AbstractC29373a aVar = this.f42769a;
                            if (aVar != null) {
                                aVar.mo51354b();
                            }
                            C17960a.m33434b(false, Long.valueOf(this.f42770b.f70739a), this.f42770b.f70740b, baseException.getErrorMessage());
                        }

                        {
                            this.f42769a = r1;
                            this.f42770b = r2;
                            this.f42771c = r3;
                        }
                    };
                    int lastIndexOf = str2.lastIndexOf("/") + 1;
                    String substring = str2.substring(lastIndexOf);
                    String substring2 = str2.substring(0, lastIndexOf);
                    AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                    with.f100629f = substring2;
                    with.f100626c = substring;
                    AbstractC43167a a = with.mo73400a("ad_splash_init_manager");
                    a.f100601D = r4;
                    a.mo73409f();
                }
            }

            /* renamed from: a */
            public static boolean m33351a(String str, String str2, C29666h hVar) {
                MethodCollector.m26663i(2073);
                File file = new File(str2);
                String str3 = str2 + ".tmp";
                try {
                    if (!TextUtils.isEmpty(str3)) {
                        int lastIndexOf = str3.lastIndexOf("/") + 1;
                        if (C17957a.m33426a().mo28624a(C17867d.m33078a(), str, str3.substring(0, lastIndexOf), str3.substring(lastIndexOf))) {
                            File file2 = new File(str3);
                            if (file2.renameTo(file)) {
                                C17960a.m33433a(true, Long.valueOf(hVar.f70739a), hVar.f70740b, null);
                                MethodCollector.m26664o(2073);
                                return true;
                            }
                            if (file2.exists()) {
                                m33350a(file2);
                            }
                            C17960a.m33433a(false, Long.valueOf(hVar.f70739a), hVar.f70740b, null);
                            MethodCollector.m26664o(2073);
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    C17960a.m33433a(false, Long.valueOf(hVar.f70739a), hVar.f70740b, th.getMessage());
                }
                MethodCollector.m26664o(2073);
                return false;
            }

            /* renamed from: a */
            private static boolean m33350a(File file) {
                MethodCollector.m26663i(2087);
                try {
                    C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                    if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                        C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                    }
                    if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                        C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                        MethodCollector.m26664o(2087);
                        return false;
                    }
                } catch (Throwable unused) {
                }
                boolean delete = file.delete();
                MethodCollector.m26664o(2087);
                return delete;
            }

            static {
                Covode.recordClassIndex(20554);
            }

            /* renamed from: a */
            public static boolean m33349a() {
                m33354c();
                return f42760d;
            }

            /* renamed from: b */
            static long m33352b() {
                return SettingsManager.m29616a().mo25395a("splash_preload_delay", 0L);
            }

            /* renamed from: d */
            private static boolean m33357d() {
                return C34822d.m71158a(C17867d.m33078a(), "file_splash_ad_preload", 0).getBoolean("key_splash_ad_preload_delay", true);
            }

            /* renamed from: c */
            private static void m33354c() {
                MethodCollector.m26663i(1831);
                if (!f42761e) {
                    synchronized (f42762f) {
                        try {
                            if (!f42761e) {
                                f42760d = Keva.getRepo("ab_repo_cold_boot").getBoolean("splash_ad_enable", true);
                                if (C17983g.m33504c() && C80271br.m139139a()) {
                                    f42760d = false;
                                }
                                f42761e = true;
                            }
                        } finally {
                            MethodCollector.m26664o(1831);
                        }
                    }
                    return;
                }
                MethodCollector.m26664o(1831);
            }

            /* renamed from: a */
            public static AbstractC29683u m33344a(Context context) {
                m33355c(context);
                return f42759c;
            }

            /* renamed from: d */
            private static Context m33356d(Context context) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    return C58003a.f132199a;
                }
                return applicationContext;
            }

            /* renamed from: b */
            public static AbstractC29681s m33353b(Context context) {
                m33355c(context);
                C29525j.m59177a(context, null);
                return C29673n.f70751a;
            }

            /* renamed from: g */
            private static File m33360g(Context context) {
                if (C58016d.f132220a != null && C58016d.f132224e) {
                    return C58016d.f132220a;
                }
                File externalCacheDir = context.getExternalCacheDir();
                C58016d.f132220a = externalCacheDir;
                return externalCacheDir;
            }

            /* renamed from: e */
            private static void m33358e(Context context) {
                HashMap<String, String> hashMap;
                if (!m33349a() || C16048b.m29633a().mo25421a(true, "splash_param_optimize_enabled", true)) {
                    hashMap = null;
                } else {
                    hashMap = C17957a.m33426a().mo28615a();
                }
                m33346a(context, hashMap, m33349a());
            }

            /* renamed from: f */
            private static String m33359f(Context context) {
                System.currentTimeMillis();
                String str = m33360g(context).getParent() + "/splashCache/";
                System.currentTimeMillis();
                return str;
            }

            /* renamed from: c */
            private static void m33355c(Context context) {
                MethodCollector.m26663i(1833);
                if (f42758b) {
                    MethodCollector.m26664o(1833);
                    return;
                }
                synchronized (C17938a.class) {
                    try {
                        if (!f42758b) {
                            m33358e(context);
                            f42759c = C29673n.m59806a(context);
                            m33345a(m33356d(context), f42759c);
                            C18009d.m33520a();
                            C18031k.m33600a();
                            C18031k.m33601b();
                            f42758b = true;
                            MethodCollector.m26664o(1833);
                        }
                    } finally {
                        MethodCollector.m26664o(1833);
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[Catch:{ JSONException -> 0x0048 }] */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[Catch:{ JSONException -> 0x0048 }] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static void m33347a(com.p2082ss.android.p2092ad.splash.C29679r.C29680a r5) {
                /*
                    java.lang.String r1 = com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17981e.m33500a()
                    boolean r0 = com.p2082ss.android.p2092ad.splash.p2109f.C29657l.m59760a(r1)
                    if (r0 != 0) goto L_0x0014
                    org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0010 }
                    r4.<init>(r1)     // Catch:{ JSONException -> 0x0010 }
                    goto L_0x0015
                L_0x0010:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0014:
                    r4 = 0
                L_0x0015:
                    boolean r0 = r4 instanceof org.json.JSONObject
                    if (r0 != 0) goto L_0x001e
                    org.json.JSONObject r4 = new org.json.JSONObject
                    r4.<init>()
                L_0x001e:
                    com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.m29616a()     // Catch:{ JSONException -> 0x0048 }
                    java.lang.String r0 = "enable_splash_show_count_for_empty"
                    r3 = 1
                    boolean r0 = r1.mo25400a(r0, r3)     // Catch:{ JSONException -> 0x0048 }
                    if (r0 == 0) goto L_0x0030
                    java.lang.String r0 = "enable_add_show_count_for_empty_array"
                    r4.put(r0, r3)     // Catch:{ JSONException -> 0x0048 }
                L_0x0030:
                    com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.m29616a()     // Catch:{ JSONException -> 0x0048 }
                    java.lang.String r1 = "splash_disappear_time"
                    r0 = 0
                    int r0 = r2.mo25394a(r1, r0)     // Catch:{ JSONException -> 0x0048 }
                    if (r0 == 0) goto L_0x0042
                    java.lang.String r0 = "enable_post_stop_video"
                    r4.put(r0, r3)     // Catch:{ JSONException -> 0x0048 }
                L_0x0042:
                    java.lang.String r0 = "enable_cold_launch_interval"
                    r4.put(r0, r3)     // Catch:{ JSONException -> 0x0048 }
                    goto L_0x004c
                L_0x0048:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x004c:
                    r5.f70826s = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.m33347a(com.ss.android.ad.splash.r$a):void");
            }

            /* renamed from: a */
            private static void m33345a(final Context context, AbstractC29683u uVar) {
                long b;
                long a = SettingsManager.m29616a().mo25395a("splash_stock_delay_millis_time", InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                boolean d = m33357d();
                int i = C17867d.f42590n;
                C179402 r8 = new AbstractC29374b() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179402 */

                    static {
                        Covode.recordClassIndex(20556);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29374b
                    /* renamed from: a */
                    public final HashMap<String, String> mo28666a() {
                        if (C16048b.m29633a().mo25421a(true, "splash_param_optimize_enabled", true)) {
                            return C17957a.m33426a().mo28615a();
                        }
                        return super.mo28666a();
                    }
                };
                if (!C17993j.m33509c()) {
                    C17970f.m33448a();
                    C17970f.m33449b();
                }
                AbstractC29683u a2 = uVar.mo51688b(SettingsManager.m29616a().mo25400a("splash_support_timeout", false)).mo51678a(new C17951b((byte) 0)).mo51669a(new C17952c((byte) 0)).mo51680a(C16048b.m29633a().mo25421a(true, "aweme_splash_first_launch_enabled", false)).mo51668a(TimeUnit.DAYS.toMillis(10)).mo51690c(a).mo51694d().mo51702i().mo51677a(new C17950a((byte) 0));
                if (d) {
                    b = 15000;
                } else {
                    b = m33352b();
                }
                a2.mo51686b(b).mo51670a(r8).mo51697e(SettingsManager.m29616a().mo25400a("enable_splash_valid_time_check", false)).mo51698f(SettingsManager.m29616a().mo25400a("enable_splash_new_first_view_logic", true)).mo51679a(new JSONArray((Collection) C18001k.m33512a()), i).mo51696e().mo51674a(new AbstractC29629d() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179413 */

                    static {
                        Covode.recordClassIndex(20557);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29629d
                    /* renamed from: a */
                    public final void mo28667a(List<? extends AbstractC29383a> list) {
                        if (list != null && !list.isEmpty()) {
                            C1731i.m5640b(new CallableC17955d(list), C1731i.f5562a);
                        }
                    }
                }).mo51695d(SettingsManager.m29616a().mo25400a("splash_new_view", true));
                uVar.mo51671a(new AbstractC29382c() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179424 */

                    /* renamed from: a */
                    final /* synthetic */ boolean f42764a = false;

                    static {
                        Covode.recordClassIndex(20558);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29382c
                    /* renamed from: a */
                    public final void mo28668a(String str, String str2, Throwable th, JSONObject jSONObject) {
                        if (this.f42764a) {
                            super.mo28668a(str, str2, th, jSONObject);
                            C17957a.m33426a().mo28620a(str2);
                            ALog.m59865d(str, str2);
                        }
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29382c
                    /* renamed from: b */
                    public final void mo28669b(String str, String str2, Throwable th, JSONObject jSONObject) {
                        if (this.f42764a) {
                            super.mo28669b(str, str2, th, jSONObject);
                            C17957a.m33426a().mo28620a(str2);
                            ALog.m59869i(str, str2);
                        }
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29382c
                    /* renamed from: c */
                    public final void mo28670c(String str, String str2, Throwable th, JSONObject jSONObject) {
                        if (this.f42764a) {
                            super.mo28670c(str, str2, th, jSONObject);
                            C17957a.m33426a().mo28620a(str2);
                            ALog.m59871w(str, str2);
                        }
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29382c
                    /* renamed from: d */
                    public final void mo28671d(String str, String str2, Throwable th, JSONObject jSONObject) {
                        if (this.f42764a) {
                            super.mo28671d(str, str2, th, jSONObject);
                            C17957a.m33426a().mo28620a(str2);
                        }
                        ALog.m59866e(str, str2);
                    }
                });
                uVar.mo51675a(C17953b.f42772a);
                AbstractC29505b d2 = C17957a.m33426a().mo28632d();
                if (d2 != null) {
                    uVar.mo51673a(d2);
                }
                m33348a(uVar, d);
                uVar.mo51692c(C17982f.m33501a());
                uVar.mo51672a(C17957a.m33426a().mo28614a(context));
                uVar.mo51683a(C16048b.m29633a().mo25412a(true, "splash_download_async_type", 0));
                uVar.mo51676a(new AbstractC29670k() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179435 */

                    static {
                        Covode.recordClassIndex(20559);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29670k
                    /* renamed from: a */
                    public final void mo28672a(String str, JSONObject jSONObject) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList.add("https://mon.tiktokv.com/monitor/appmonitor/v2/settings");
                        arrayList2.add("https://mon.tiktokv.com/monitor/collect/");
                        SDKMonitorUtils.m27204a(str, arrayList);
                        SDKMonitorUtils.m27205b(str, arrayList2);
                        Context applicationContext = context.getApplicationContext();
                        if (C58003a.f132201c && applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                        SDKMonitorUtils.m27203a(applicationContext, str, jSONObject, new C14827k.AbstractC14835a() {
                            /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179435.C179441 */

                            static {
                                Covode.recordClassIndex(20560);
                            }

                            @Override // com.bytedance.framwork.core.sdkmonitor.C14827k.AbstractC14835a
                            /* renamed from: a */
                            public final Map<String, String> mo21830a() {
                                HashMap hashMap = new HashMap();
                                hashMap.put("oversea", "1");
                                return hashMap;
                            }
                        });
                    }
                });
                uVar.mo51701h();
                try {
                    uVar.mo51691c(m33359f(context));
                    uVar.mo51687b(C17964b.m33439a());
                } catch (Exception e) {
                    C51423a.m95790a((Throwable) e);
                }
                C29673n.m59807b(context).mo51681a(new AbstractC29635e() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179456 */

                    static {
                        Covode.recordClassIndex(20561);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29635e
                    /* renamed from: a */
                    public final int mo28673a(int i) {
                        if (i == 4) {
                            return R.drawable.bl5;
                        }
                        return 2131233898;
                    }
                }).mo51705l().mo51708o().mo51707n().mo51709p().mo51711r().mo51710q().mo51706m();
            }

            /* renamed from: a */
            private static void m33348a(AbstractC29683u uVar, boolean z) {
                if (z) {
                    C17957a.m33426a().mo28618a(new C17954c(uVar));
                    C34822d.m71158a(C17867d.m33078a(), "file_splash_ad_preload", 0).edit().putBoolean("key_splash_ad_preload_delay", false).apply();
                }
            }

            /* renamed from: a */
            private static int m33341a(BitmapFactory.Options options, int i, int i2) {
                int i3 = options.outWidth;
                int i4 = options.outHeight;
                int i5 = i3 / 2;
                int i6 = i4 / 2;
                int i7 = 1;
                while (i5 / i7 >= i && i6 / i7 >= i2) {
                    i7 *= 2;
                }
                return i7;
            }

            /* renamed from: a */
            private static void m33346a(final Context context, HashMap<String, String> hashMap, boolean z) {
                C179391 r1 = new AbstractC29385c() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179391 */

                    static {
                        Covode.recordClassIndex(20555);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29385c
                    /* renamed from: a */
                    public final void mo28664a(List<String> list) {
                        C18027h a = C18027h.m33593a();
                        C17957a.m33426a();
                        if (C18027h.m33596d()) {
                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: filter by low device");
                        } else if (C18027h.f42906a == null) {
                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: filter by preference null");
                        } else if (C13603b.m24435a((Collection) list)) {
                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: splash ids null");
                        } else {
                            boolean z = false;
                            for (String str : list) {
                                Aweme a2 = C18027h.f42906a.mo28753a(str);
                                if (a2 != null) {
                                    C18129a.m33746a("draw_ad", "download_video_count_splash_sdk", a2.getAwemeRawAd()).mo28901b();
                                    if ((!z || C16048b.m29633a().mo25412a(true, "awesome_splash_preload_optimize", 0) == 0) && a.mo28762a(a2)) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29385c
                    /* renamed from: a */
                    public final boolean mo28665a(AbstractC29383a aVar, boolean z) {
                        boolean z2;
                        AwemeSplashInfo splashInfo;
                        C18027h.m33593a();
                        String t = aVar.mo51376t();
                        C17957a.m33426a();
                        if (C18027h.m33596d()) {
                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: filter by low device");
                        } else {
                            Aweme aweme = C18027h.f42906a.mo28754a().get(t);
                            if (aweme == null) {
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme null");
                            } else {
                                String str = "1";
                                if (C37699a.m76205H(aweme)) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme past data".concat(String.valueOf(t)));
                                    C18129a.C18130a a = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", "5");
                                    if (!C17975i.f42802b) {
                                        str = "2";
                                    }
                                    a.mo28897a("awemelaunch", str).mo28901b();
                                    C17960a.m33431a(false, aweme, "5");
                                    C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                } else if (!C17957a.m33426a().mo28629b(aweme)) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme not vaild".concat(String.valueOf(t)));
                                    C18129a.m33746a("draw_ad", "data_invalid", aweme.getAwemeRawAd()).mo28901b();
                                    C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                } else if (C17964b.f42783b) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: open from push");
                                    C18129a.C18130a a2 = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", "2").mo28897a("ad_show_fail_type2_reason", C18027h.m33595c());
                                    if (!C17975i.f42802b) {
                                        str = "2";
                                    }
                                    a2.mo28897a("awemelaunch", str).mo28901b();
                                    C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                    C17960a.m33431a(false, aweme, "2");
                                } else if (!C17975i.f42802b && C37699a.m76314s(aweme) && aweme.getAwemeRawAd().getSplashInfo() != null && aweme.getAwemeRawAd().getSplashInfo().isDisableHotStartShow()) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: disable hot start");
                                    C18129a.C18130a a3 = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", "7").mo28897a("ad_show_fail_type2_reason", C18027h.m33595c());
                                    if (!C17975i.f42802b) {
                                        str = "2";
                                    }
                                    a3.mo28897a("awemelaunch", str).mo28901b();
                                    C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                    C17960a.m33431a(false, aweme, "7");
                                } else if (C17975i.f42802b && !C17975i.f42803c) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: not from launcher");
                                    C18129a.C18130a a4 = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", "2").mo28897a("ad_show_fail_type2_reason", C18027h.m33595c());
                                    if (!C17975i.f42802b) {
                                        str = "2";
                                    }
                                    a4.mo28897a("awemelaunch", str).mo28901b();
                                    C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                    C17960a.m33431a(false, aweme, "2");
                                } else if (!C17975i.f42806f) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: main activity not on feed");
                                    C18129a.C18130a a5 = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", "2").mo28897a("ad_show_fail_type2_reason", C18027h.m33595c());
                                    if (!C17975i.f42802b) {
                                        str = "2";
                                    }
                                    a5.mo28897a("awemelaunch", str).mo28901b();
                                    C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                    C17960a.m33431a(false, aweme, "2");
                                } else if (C17975i.f42802b || C17957a.m33426a().mo28647q()) {
                                    AwemeSplashInfo m = C37699a.m76308m(aweme);
                                    if (m == null) {
                                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme splash info null");
                                        C18129a.m33746a("draw_ad", "data_invalid", aweme.getAwemeRawAd()).mo28901b();
                                        C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                    } else if (m.isInvalidAd()) {
                                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme data invalid");
                                        C18129a.C18130a a6 = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", "4");
                                        if (!C17975i.f42802b) {
                                            str = "2";
                                        }
                                        a6.mo28897a("awemelaunch", str).mo28901b();
                                        C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                        C17960a.m33431a(false, aweme, "4");
                                    } else {
                                        Video video = aweme.getVideo();
                                        if (video == null) {
                                            C18129a.m33746a("draw_ad", "data_invalid", aweme.getAwemeRawAd()).mo28901b();
                                        } else {
                                            VideoUrlModel playAddr = video.getPlayAddr();
                                            if (playAddr == null || C13603b.m24435a((Collection) playAddr.getUrlList())) {
                                                C18129a.m33746a("draw_ad", "data_invalid", aweme.getAwemeRawAd()).mo28901b();
                                            } else if (TextUtils.isEmpty(C17975i.m33458a(aweme.getAid()))) {
                                                C18129a.C18130a a7 = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", str);
                                                if (!C17975i.f42802b) {
                                                    str = "2";
                                                }
                                                a7.mo28897a("awemelaunch", str).mo28901b();
                                            } else if (m.getHotShowType() != 1 || !C17975i.f42807g) {
                                                C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", true).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                                if (z) {
                                                    if (C17975i.f42802b && C17978b.m33498a()) {
                                                        C17957a.m33426a().mo28635e(aweme);
                                                    }
                                                    C17975i.f42808h = t;
                                                    C17975i.f42804d = t;
                                                    AwemeRawAd n = C37699a.m76309n(aweme);
                                                    if (!(n == null || (splashInfo = n.getSplashInfo()) == null || !splashInfo.isDisableHotStartShow())) {
                                                        C17975i.f42805e = n.getAdId();
                                                    }
                                                }
                                                z2 = true;
                                                C17960a.m33431a(true, aweme, null);
                                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView data ready");
                                                aVar.mo51376t();
                                                return z2;
                                            } else {
                                                C18129a.C18130a a8 = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", "2").mo28897a("ad_show_fail_type2_reason", C18027h.m33595c());
                                                if (!C17975i.f42802b) {
                                                    str = "2";
                                                }
                                                a8.mo28897a("awemelaunch", str).mo28901b();
                                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: not right scene because comment/share/dislike panel is showing");
                                                C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                                C17960a.m33431a(false, aweme, "2");
                                            }
                                        }
                                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: data not available");
                                        C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                    }
                                } else {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: main activity not on top");
                                    C18129a.C18130a a9 = C18129a.m33746a("draw_ad", "show_failed", aweme.getAwemeRawAd()).mo28897a("ad_show_fail_type", "2").mo28897a("ad_show_fail_type2_reason", C18027h.m33595c());
                                    if (!C17975i.f42802b) {
                                        str = "2";
                                    }
                                    a9.mo28897a("awemelaunch", str).mo28901b();
                                    C18129a.m33746a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).mo28897a("splash_id", C37699a.m76206I(aweme)).mo28897a("splash_ready", false).mo28897a("show_immediately", Boolean.valueOf(z)).mo28901b();
                                    C17960a.m33431a(false, aweme, "2");
                                }
                            }
                        }
                        z2 = false;
                        aVar.mo51376t();
                        return z2;
                    }
                };
                C29679r.C29680a aVar = new C29679r.C29680a();
                aVar.f70822o = new AbstractC29369a() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a.C179467 */

                    static {
                        Covode.recordClassIndex(20562);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: e */
                    public final String mo28678e() {
                        return C17867d.f42595s;
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: a */
                    public final String mo28674a() {
                        return String.valueOf(C17867d.f42590n);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: b */
                    public final String mo28675b() {
                        return C17867d.m33081b();
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: c */
                    public final String mo28676c() {
                        return C17867d.m33085f();
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: j */
                    public final String mo28683j() {
                        return C17867d.m33085f();
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: d */
                    public final String mo28677d() {
                        return String.valueOf(C17867d.m33083d());
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: g */
                    public final String mo28680g() {
                        return C17957a.m33426a().mo28643m();
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: h */
                    public final String mo28681h() {
                        return C17957a.m33426a().mo28644n();
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: i */
                    public final String mo28682i() {
                        return C17957a.m33426a().mo28645o();
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29665g, com.p2082ss.android.p2092ad.splash.AbstractC29369a
                    /* renamed from: f */
                    public final String mo28679f() {
                        return new StringBuilder().append(C17867d.m33087h()).toString();
                    }
                };
                aVar.f70815h = hashMap;
                aVar.f70816i = r1;
                boolean z2 = true;
                aVar.f70817j = true;
                if (C16048b.m29633a().mo25412a(true, "splash_download_async_type", 0) == 0) {
                    z2 = false;
                }
                aVar.f70824q = z2;
                aVar.f70819l = z;
                m33347a(aVar);
                C29525j.m59177a(context, aVar.mo51940a());
            }

            /* renamed from: a */
            public static Bitmap m33342a(String str, int i, int i2) {
                MethodCollector.m26663i(1945);
                if (TextUtils.isEmpty(str)) {
                    MethodCollector.m26664o(1945);
                    return null;
                } else if (i <= 0 || i2 <= 0) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    MethodCollector.m26664o(1945);
                    return decodeFile;
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str, options);
                    options.inSampleSize = m33341a(options, i, i2);
                    options.inJustDecodeBounds = false;
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    try {
                        decodeFile2 = BitmapFactory.decodeFile(str, options);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    MethodCollector.m26664o(1945);
                    return decodeFile2;
                }
            }

            /* renamed from: a */
            public static Bitmap m33343a(byte[] bArr, int i, int i2) {
                MethodCollector.m26663i(1940);
                if (bArr == null) {
                    MethodCollector.m26664o(1940);
                    return null;
                } else if (i <= 0 || i2 <= 0) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    MethodCollector.m26664o(1940);
                    return decodeByteArray;
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    options.inSampleSize = m33341a(options, i, i2);
                    options.inJustDecodeBounds = false;
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    try {
                        decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    MethodCollector.m26664o(1940);
                    return decodeByteArray2;
                }
            }
        }
