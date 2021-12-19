package com.bytedance.android.p126a.p127a.p135h;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.p126a.p127a.C2610a;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.android.p126a.p127a.p130c.C2620a;
import com.bytedance.android.p126a.p127a.p133f.C2633a;
import com.bytedance.android.p126a.p127a.p134g.AbstractC2637a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.bytedance.android.a.a.h.e */
public final class C2644e {

    /* renamed from: a */
    public static volatile C2644e f7932a = new C2644e();

    /* renamed from: b */
    public Set<Network> f7933b = new HashSet();

    /* renamed from: c */
    private boolean f7934c;

    /* renamed from: d */
    private Context f7935d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.a.a.h.e$a */
    public class C2645a extends ConnectivityManager.NetworkCallback {
        static {
            Covode.recordClassIndex(3033);
        }

        public final void onUnavailable() {
            super.onUnavailable();
            C2644e.this.f7933b.clear();
            C2640a.m7643a("onUnavailable");
        }

        private C2645a() {
        }

        public final void onLost(Network network) {
            super.onLost(network);
            C2644e.this.mo7162a(network);
        }

        public final void onAvailable(Network network) {
            String str;
            super.onAvailable(network);
            C2644e eVar = C2644e.this;
            boolean isEmpty = eVar.f7933b.isEmpty();
            Iterator<Network> it = eVar.f7933b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(network)) {
                        break;
                    }
                } else {
                    eVar.f7933b.add(network);
                    break;
                }
            }
            boolean z = !eVar.f7933b.isEmpty();
            if (isEmpty && z) {
                C2610a aVar = C2628e.m7607d().f7907d;
                for (AbstractC2637a aVar2 : aVar.f7855a.values()) {
                    if (aVar2 != null) {
                        C2620a.m7588a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0052: INVOKE  
                              (wrap: com.bytedance.android.a.a.a$1 : 0x004f: CONSTRUCTOR  (r0v17 com.bytedance.android.a.a.a$1) = (r3v0 'aVar' com.bytedance.android.a.a.a), (r1v4 'aVar2' com.bytedance.android.a.a.g.a) call: com.bytedance.android.a.a.a.1.<init>(com.bytedance.android.a.a.a, com.bytedance.android.a.a.g.a):void type: CONSTRUCTOR)
                             type: STATIC call: com.bytedance.android.a.a.c.a.a(com.bytedance.android.a.a.c.c):void in method: com.bytedance.android.a.a.h.e.a.onAvailable(android.net.Network):void, file: classes2.dex
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
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: CONSTRUCTOR  (r0v17 com.bytedance.android.a.a.a$1) = (r3v0 'aVar' com.bytedance.android.a.a.a), (r1v4 'aVar2' com.bytedance.android.a.a.g.a) call: com.bytedance.android.a.a.a.1.<init>(com.bytedance.android.a.a.a, com.bytedance.android.a.a.g.a):void type: CONSTRUCTOR in method: com.bytedance.android.a.a.h.e.a.onAvailable(android.net.Network):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 29 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.a.a.a, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 35 more
                            */
                        /*
                        // Method dump skipped, instructions count: 128
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p126a.p127a.p135h.C2644e.C2645a.onAvailable(android.net.Network):void");
                    }

                    /* synthetic */ C2645a(C2644e eVar, byte b) {
                        this();
                    }

                    public final void onLosing(Network network, int i) {
                        super.onLosing(network, i);
                        C2644e.this.mo7162a(network);
                        C2640a.m7643a("onLosing:" + network.toString());
                    }
                }

                static {
                    Covode.recordClassIndex(3032);
                }

                private C2644e() {
                }

                /* renamed from: c */
                private static boolean m7654c() {
                    C2633a aVar;
                    if (Build.VERSION.SDK_INT >= 21 && (aVar = C2628e.m7607d().f7906c) != null) {
                        return aVar.f7924g;
                    }
                    return false;
                }

                /* renamed from: a */
                public final boolean mo7163a() {
                    boolean z = true;
                    if (m7654c()) {
                        return !this.f7933b.isEmpty();
                    }
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) m7653a(this.f7935d, "connectivity");
                        if (connectivityManager == null) {
                            return false;
                        }
                        NetworkInfo a = m7652a(connectivityManager);
                        if (a == null || !a.isConnected()) {
                            z = false;
                        }
                        return z;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                    }
                }

                /* renamed from: b */
                public final int mo7164b() {
                    NetworkInfo a;
                    if (m7654c()) {
                        if (this.f7933b.isEmpty()) {
                            return -1;
                        }
                    } else if (!mo7163a()) {
                        return -1;
                    }
                    ConnectivityManager connectivityManager = (ConnectivityManager) m7653a(this.f7935d, "connectivity");
                    if (connectivityManager == null || (a = m7652a(connectivityManager)) == null || !a.isConnected()) {
                        return -1;
                    }
                    int type = a.getType();
                    if (type == 1) {
                        return 0;
                    }
                    if (type != 0) {
                        return 1;
                    }
                    switch (a.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        case 16:
                            return 2;
                        case 3:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        case 15:
                        case 17:
                            return 3;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                            return 4;
                        case 19:
                        default:
                            String subtypeName = a.getSubtypeName();
                            if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                                return 3;
                            }
                            return 1;
                        case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                            return 5;
                    }
                }

                /* renamed from: a */
                private static NetworkInfo m7652a(ConnectivityManager connectivityManager) {
                    try {
                        return connectivityManager.getActiveNetworkInfo();
                    } catch (Exception e) {
                        C51423a.m95790a((Throwable) e);
                        return C61338a.m111034a();
                    }
                }

                /* renamed from: a */
                public final synchronized void mo7161a(Context context) {
                    MethodCollector.m26663i(3495);
                    this.f7935d = context;
                    if (!m7654c() || this.f7934c) {
                        MethodCollector.m26664o(3495);
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) m7653a(C2628e.m7607d().f7905b, "connectivity");
                        if (connectivityManager == null) {
                            C2628e.m7607d().f7906c.f7924g = false;
                            MethodCollector.m26664o(3495);
                            return;
                        }
                        NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addCapability(12);
                        if (Build.VERSION.SDK_INT >= 28) {
                            addCapability.addCapability(21);
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            addCapability.addCapability(16);
                        }
                        connectivityManager.registerNetworkCallback(addCapability.build(), new C2645a(this, (byte) 0));
                    }
                    this.f7934c = true;
                    MethodCollector.m26664o(3495);
                }

                /* renamed from: a */
                public final void mo7162a(Network network) {
                    String str;
                    boolean z = !this.f7933b.isEmpty();
                    Iterator<Network> it = this.f7933b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Network next = it.next();
                        if (next.equals(network)) {
                            this.f7933b.remove(next);
                            break;
                        }
                    }
                    boolean isEmpty = this.f7933b.isEmpty();
                    StringBuilder append = new StringBuilder("onNetworkUnavailable: ").append(network.toString());
                    if (!z || !isEmpty) {
                        str = "";
                    } else {
                        str = ". network become lost!!!";
                    }
                    C2640a.m7643a(append.append(str).toString());
                }

                /* renamed from: a */
                private static Object m7653a(Context context, String str) {
                    Object obj;
                    MethodCollector.m26663i(3621);
                    if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                        if (!C58027i.f132247b && "connectivity".equals(str)) {
                            try {
                                new C21708b().mo35361a();
                                C58027i.f132247b = true;
                                obj = context.getSystemService(str);
                            } catch (Throwable unused) {
                            }
                        }
                        obj = context.getSystemService(str);
                    } else if (C58027i.f132246a) {
                        synchronized (ClipboardManager.class) {
                            try {
                                obj = context.getSystemService(str);
                                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                    try {
                                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                        declaredField.setAccessible(true);
                                        declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                                    } catch (Exception e) {
                                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                                    }
                                }
                                C58027i.f132246a = false;
                            } finally {
                                MethodCollector.m26664o(3621);
                            }
                        }
                    } else {
                        obj = context.getSystemService(str);
                    }
                    return obj;
                }
            }
