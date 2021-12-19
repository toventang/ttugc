package com.p2082ss.ttvideoengine;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.ttm.player.C86275p;
import com.p2082ss.ttm.player.IMediaDataSource;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4420m.C86573a;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.ap */
public final class C86347ap {

    /* renamed from: a */
    HandlerThread f193428a;

    /* renamed from: b */
    Handler f193429b;

    /* renamed from: c */
    public Lock f193430c;

    /* renamed from: d */
    public Parcel f193431d;

    /* renamed from: e */
    Handler f193432e;

    /* renamed from: f */
    public Lock f193433f;

    /* renamed from: g */
    Parcel f193434g;

    /* renamed from: h */
    List<Condition> f193435h;

    /* renamed from: i */
    C86313ai f193436i;

    /* renamed from: j */
    private boolean f193437j;

    static {
        Covode.recordClassIndex(101575);
    }

    /* renamed from: a */
    public final boolean mo137317a(boolean z) {
        if (!this.f193437j || !z) {
            Lock lock = this.f193430c;
            if (lock != null) {
                lock.lock();
                if (this.f193429b == null || Looper.myLooper() == this.f193429b.getLooper()) {
                    this.f193430c.unlock();
                } else {
                    this.f193430c.unlock();
                    return true;
                }
            }
            return false;
        }
        C86641i.m150110a("TTVideoEngineLooperThread", "mIsHandlingMainMsg return false, thread:" + Looper.myLooper().getThread());
        return false;
    }

    /* renamed from: a */
    public final boolean mo137316a(int i, long j, Object obj) {
        return m148883b(i, j, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ap$c */
    public static class RunnableC86350c implements Runnable {

        /* renamed from: a */
        WeakReference<Handler> f193442a;

        /* renamed from: b */
        Message f193443b;

        static {
            Covode.recordClassIndex(101578);
        }

        public final void run() {
            Handler handler;
            WeakReference<Handler> weakReference = this.f193442a;
            if (weakReference != null && (handler = weakReference.get()) != null) {
                handler.handleMessage(this.f193443b);
            }
        }

        RunnableC86350c(Handler handler, Message message) {
            this.f193442a = new WeakReference<>(handler);
            this.f193443b = message;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137308a() {
        Lock lock = this.f193430c;
        if (lock != null) {
            lock.lock();
            List<Condition> list = this.f193435h;
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < this.f193435h.size(); i++) {
                    this.f193435h.get(i).signalAll();
                }
                this.f193435h.clear();
            }
            Handler handler = this.f193429b;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f193429b.getLooper().quit();
                this.f193429b = null;
            }
            this.f193430c.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo137320b() {
        Looper mainLooper;
        if (this.f193429b == null) {
            return false;
        }
        Handler handler = this.f193432e;
        if (handler == null || handler.getLooper() == null || this.f193432e.getLooper().getThread() == null || this.f193432e.getLooper().getThread().isAlive()) {
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            Handler handler2 = this.f193432e;
            if (handler2 != null && handler2.getLooper() != mainLooper) {
                return true;
            }
            if (this.f193432e != null) {
                C86641i.m150113b("TTVideoEngineLooperThread", "mainHandler looper:" + this.f193432e.getLooper());
            }
            return false;
        }
        C86641i.m150115c("TTVideoEngineLooperThread", "main looper thread is not alive, return false");
        return false;
    }

    C86347ap(C86313ai aiVar) {
        this.f193436i = aiVar;
    }

    /* renamed from: a */
    public final void mo137309a(int i) {
        mo137312a(i, 0, 0, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ap$b */
    public class HandlerC86349b extends Handler {

        /* renamed from: b */
        private WeakReference<C86313ai> f193441b;

        static {
            Covode.recordClassIndex(101577);
        }

        public final void handleMessage(Message message) {
            Map map;
            Condition condition;
            Object obj;
            C86313ai aiVar = this.f193441b.get();
            if (aiVar == null) {
                C86641i.m150115c("TTVideoEngineLooperThread", "engine is null, return.");
                return;
            }
            if (message.obj != null) {
                map = (Map) message.obj;
                if (map.containsKey("msgCond")) {
                    condition = (Condition) map.get("msgCond");
                } else {
                    condition = null;
                }
                if (map.containsKey("paramObj")) {
                    obj = map.get("paramObj");
                } else {
                    obj = null;
                }
            } else {
                map = null;
                condition = null;
                obj = null;
            }
            int i = message.what;
            if (i != 600) {
                boolean z = false;
                switch (i) {
                    case 400:
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16747a(aiVar, message.arg1);
                        }
                        if (aiVar.f192873J != null) {
                            int i2 = message.arg1;
                            break;
                        }
                        break;
                    case 401:
                        int i3 = message.arg1;
                        if (message.arg2 == 1 || i3 != 3) {
                            if (aiVar.f192874K != null) {
                                aiVar.f192874K.mo16751b(aiVar, i3);
                            }
                            AbstractC86362aw awVar = aiVar.f192873J;
                            break;
                        }
                    case 402:
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16748a(aiVar, message.arg1, message.arg2);
                        }
                        if (aiVar.f192873J != null) {
                            int i4 = message.arg1;
                            int i5 = message.arg2;
                            break;
                        }
                        break;
                    case 403:
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16753c(aiVar, message.arg1);
                        }
                        if (aiVar.f192873J != null) {
                            int i6 = message.arg1;
                            break;
                        }
                        break;
                    case 404:
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16746a(aiVar);
                        }
                        AbstractC86362aw awVar2 = aiVar.f192873J;
                        break;
                    case 405:
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16750b(aiVar);
                        }
                        AbstractC86362aw awVar3 = aiVar.f192873J;
                        break;
                    case 406:
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.equals(aiVar.f193014cg)) {
                                if (aiVar.f192874K != null) {
                                    C86641i.m150110a("TTVideoEngineLooperThread", "notify render start");
                                    aiVar.f192874K.mo16752c(aiVar);
                                }
                                if (aiVar.f192873J != null) {
                                    C86641i.m150110a("TTVideoEngineLooperThread", "notify render start");
                                    break;
                                }
                            } else {
                                C86641i.m150115c("TTVideoEngineLooperThread", "MSG_NOTIFY_RENDER_START engine:" + aiVar + ", traceId not same, should be:" + str + ", now:" + aiVar.f193014cg);
                                break;
                            }
                        }
                        break;
                    case 407:
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16755d(aiVar, message.arg1);
                        }
                        if (aiVar.f192873J != null) {
                            int i7 = message.arg1;
                            break;
                        }
                        break;
                    case 408:
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16754d(aiVar);
                        }
                        AbstractC86362aw awVar4 = aiVar.f192873J;
                        break;
                    case 409:
                        C86633c cVar = (C86633c) obj;
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16749a(cVar);
                        }
                        AbstractC86362aw awVar5 = aiVar.f192873J;
                        break;
                    case 410:
                        if (aiVar.f192874K != null) {
                            aiVar.f192874K.mo16745a(message.arg1);
                        }
                        if (aiVar.f192873J != null) {
                            int i8 = message.arg1;
                            break;
                        }
                        break;
                    case 411:
                        C86535p pVar = (C86535p) obj;
                        if (aiVar.f192877N != null) {
                            aiVar.f192877N.mo51861a(pVar);
                            C86347ap.this.f193434g.setDataPosition(0);
                            C86347ap.this.f193434g.writeInt(0);
                            break;
                        }
                        break;
                    case 412:
                        if (aiVar.f192878O != null) {
                            aiVar.f192878O.mo101150a((C86365az) obj);
                            break;
                        }
                        break;
                    case 413:
                        if (map != null && map.containsKey("paramObj1")) {
                            map.get("paramObj1");
                        }
                        AbstractC86362aw awVar6 = aiVar.f192873J;
                        break;
                    case 414:
                        if (message.arg1 == 1) {
                            z = true;
                        }
                        if (aiVar.f192879P != null) {
                            aiVar.f192879P.mo30452a(z);
                            aiVar.f192879P = null;
                            break;
                        }
                        break;
                    case 415:
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            ((Integer) map2.get("bufferStartAction")).intValue();
                            String str2 = (String) map2.get("traceid");
                            if (str2 == aiVar.f193014cg) {
                                if (aiVar.f192883T != null) {
                                    aiVar.f192883T.mo101148a(message.arg1);
                                }
                                if (aiVar.f192884U != null) {
                                    int i9 = message.arg1;
                                    int i10 = message.arg2;
                                }
                                if (aiVar.f192873J != null) {
                                    int i11 = message.arg1;
                                    int i12 = message.arg2;
                                    break;
                                }
                            } else {
                                C86641i.m150115c("TTVideoEngineLooperThread", "MSG_NOTIFY_BUFFER_START engine:" + aiVar + ", traceId not same, should be:" + str2 + ", now:" + aiVar.f193014cg);
                                break;
                            }
                        }
                        break;
                    case 416:
                        if (aiVar.f192883T != null) {
                            aiVar.f192883T.mo101149b(message.arg1);
                        }
                        if (aiVar.f192884U != null) {
                            int i13 = message.arg1;
                        }
                        if (aiVar.f192873J != null) {
                            int i14 = message.arg1;
                            break;
                        }
                        break;
                    case 417:
                        EnumC86649v vVar = (EnumC86649v) obj;
                        if (aiVar.f192881R != null) {
                            aiVar.f192881R.mo101147a(vVar, message.arg1);
                        }
                        if (aiVar.f192873J != null) {
                            int i15 = message.arg1;
                            break;
                        }
                        break;
                    case 418:
                        if (aiVar.f192886W != null) {
                            int i16 = message.arg1;
                            int i17 = message.arg2;
                        }
                        if (aiVar.f192873J != null) {
                            int i18 = message.arg1;
                            int i19 = message.arg2;
                            break;
                        }
                        break;
                    case 419:
                        if (aiVar.f192873J != null) {
                            aiVar.f192873J.mo101151a(aiVar);
                            break;
                        }
                        break;
                    default:
                        C86641i.m150115c("TTVideoEngineLooperThread", "unknown message: " + message.what);
                        break;
                }
            } else {
                if (aiVar.f192885V != null) {
                    int i20 = message.arg1;
                    int i21 = message.arg2;
                }
                if (aiVar.f192873J != null) {
                    int i22 = message.arg1;
                    int i23 = message.arg2;
                }
            }
            C86347ap.m148882a(C86347ap.this.f193433f, condition);
        }

        public HandlerC86349b(C86313ai aiVar) {
            this.f193441b = new WeakReference<>(aiVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ap$a */
    public class HandlerC86348a extends Handler {

        /* renamed from: b */
        private WeakReference<C86313ai> f193439b;

        static {
            Covode.recordClassIndex(101576);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: java.lang.String[] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v38, resolved type: androidx.core.f.d */
        /* JADX DEBUG: Multi-variable search result rejected for r0v42, resolved type: java.lang.String */
        /* JADX DEBUG: Multi-variable search result rejected for r0v47, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMessage(Message message) {
            Map map;
            Object obj;
            Condition condition;
            boolean z;
            String str;
            String str2;
            C86313ai aiVar = this.f193439b.get();
            if (aiVar == null) {
                C86641i.m150115c("TTVideoEngineLooperThread", "engine is null, return.");
                return;
            }
            Map<Integer, String> map2 = null;
            r0 = null;
            String str3 = null;
            r0 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            map2 = null;
            if (message.obj != null) {
                map = (Map) message.obj;
                if (map.containsKey("msgCond")) {
                    condition = (Condition) map.get("msgCond");
                } else {
                    condition = null;
                }
                if (map.containsKey("paramObj")) {
                    obj = map.get("paramObj");
                } else {
                    obj = null;
                }
            } else {
                map = null;
                obj = null;
                condition = null;
            }
            int i = message.what;
            if (i != 300) {
                if (i != 301) {
                    boolean z2 = true;
                    switch (i) {
                        case 1:
                            aiVar.mo137144H();
                            break;
                        case 2:
                            aiVar.mo137147K();
                            break;
                        case 3:
                            aiVar.mo137148L();
                            break;
                        case 4:
                            aiVar.mo137149M();
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            aiVar.mo137150N();
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            int i2 = message.arg1;
                            aiVar.mo137263o();
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            aiVar.mo137165a(message.arg1, false);
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_configResolution invalid param");
                                break;
                            } else {
                                EnumC86649v vVar = (EnumC86649v) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    map2 = (Map) map.get("paramObj1");
                                }
                                aiVar.mo137179a(vVar, map2);
                                break;
                            }
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_setPlayerVolume invalid param");
                                break;
                            } else {
                                float floatValue = ((Float) obj).floatValue();
                                if (map != null && map.containsKey("paramObj1")) {
                                    aiVar.mo137191b(floatValue, ((Float) map.get("paramObj1")).floatValue());
                                    break;
                                } else {
                                    aiVar.mo137191b(floatValue, floatValue);
                                    break;
                                }
                            }
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            if (message.arg1 != 1) {
                                z2 = false;
                            }
                            aiVar.mo137232f(z2);
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            C86641i.m150110a("TTVideoEngine", "_pause ");
                            if (aiVar.f193370r) {
                                if (aiVar.f192923ah != null) {
                                    C86641i.m150110a("TTVideoEngine", "player will pause by interruption");
                                    aiVar.f192923ah.mo16719g();
                                    aiVar.f193374v = 2;
                                    break;
                                }
                            } else {
                                aiVar.f193371s = true;
                                break;
                            }
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetDataSource invalid param");
                                break;
                            } else {
                                aiVar.mo137180a((FileDescriptor) obj);
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetDataSource invalid param");
                                break;
                            } else {
                                aiVar.mo137273y();
                                aiVar.f192967bc = (IMediaDataSource) obj;
                                if (aiVar.f192920ae != null) {
                                    aiVar.f192920ae.mo137570b(7, (String) null);
                                    break;
                                }
                            }
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetVideoID invalid param");
                                break;
                            } else {
                                aiVar.mo137227e((String) obj);
                                break;
                            }
                        case 15:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetVideoID invalid param");
                                break;
                            } else {
                                C86573a aVar = (C86573a) obj;
                                int i3 = aVar.f195061e;
                                if (i3 == 0) {
                                    aiVar.f192927al = EnumC86649v.Standard;
                                } else if (i3 == 1) {
                                    aiVar.f192927al = EnumC86649v.High;
                                } else if (i3 == 2) {
                                    aiVar.f192927al = EnumC86649v.SuperHigh;
                                } else if (i3 == 3) {
                                    aiVar.f192927al = EnumC86649v.ExtremelyHigh;
                                } else if (i3 != 4) {
                                    aiVar.mo137219d(aVar.f195057a);
                                    break;
                                } else {
                                    aiVar.f192927al = EnumC86649v.FourK;
                                }
                                aiVar.mo137273y();
                                if (aiVar.f192901aL != null && !aiVar.f192901aL.equals(aVar)) {
                                    aiVar.mo137141E();
                                    aiVar.f192896aG = false;
                                    aiVar.f192908aS = true;
                                    aiVar.f192910aU = true;
                                    aiVar.f192909aT = true;
                                    aiVar.f192864A = 0;
                                    aiVar.f192933ar = false;
                                    aiVar.f192941az = 0;
                                    aiVar.f192922ag = null;
                                    aiVar.f192932aq = null;
                                }
                                aiVar.f193372t = false;
                                aiVar.f192900aK = true;
                                aiVar.f192901aL = aVar;
                                aiVar.f192965ba = 0;
                                aiVar.f192930ao.clear();
                                aiVar.f192865B = aVar.f195057a;
                                aiVar.f192920ae.mo137570b(3, aiVar.f192865B);
                                aiVar.f192892aC = null;
                                aiVar.f192893aD = null;
                                C86641i.m150110a("TTVideoEngine", "set preloaderitem");
                                break;
                            }
                        case 16:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetVideoModel invalid param");
                                break;
                            } else {
                                aiVar.mo137197b((C86535p) obj);
                                break;
                            }
                        case 17:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetPlayItem invalid param");
                                break;
                            } else {
                                C86351aq aqVar = (C86351aq) obj;
                                if (System.currentTimeMillis() / 1000 > aqVar.f193447d) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!TextUtils.isEmpty(aqVar.f193444a) && !z) {
                                    aiVar.mo137273y();
                                    if (!aqVar.equals(aiVar.f192903aN)) {
                                        if (aiVar.f192903aN != null) {
                                            aiVar.mo137141E();
                                        }
                                        aiVar.f192902aM = true;
                                        aiVar.f192908aS = true;
                                        aiVar.f192910aU = true;
                                        aiVar.f192909aT = true;
                                        aiVar.f192864A = 0;
                                        aiVar.f192933ar = false;
                                        aiVar.f192941az = 0;
                                        aiVar.f192932aq = null;
                                    }
                                    aiVar.f193372t = false;
                                    aiVar.f192903aN = aqVar;
                                    aiVar.f192965ba = 0;
                                    if (aqVar.f193446c != null) {
                                        aiVar.f192927al = aqVar.f193446c;
                                    }
                                    aiVar.f192865B = aqVar.f193445b;
                                    aiVar.f192920ae.mo137570b(2, aqVar.f193445b);
                                    aiVar.f192930ao.clear();
                                    aiVar.f192892aC = null;
                                    aiVar.f192893aD = null;
                                    break;
                                } else {
                                    aiVar.mo137219d(aqVar.f193445b);
                                    break;
                                }
                            }
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetLocalURL invalid param");
                                break;
                            } else {
                                aiVar.mo137235g((String) obj);
                                break;
                            }
                        case 19:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetDirectURL invalid param");
                                break;
                            } else {
                                String str7 = (String) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    String str8 = (String) map.get("paramObj1");
                                    aiVar.mo137245i(str7);
                                    aiVar.f192892aC = str8;
                                    aiVar.f192893aD = str8;
                                    break;
                                } else {
                                    aiVar.mo137245i(str7);
                                    break;
                                }
                            }
                            break;
                        case C84224v.f188239U:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                break;
                            } else {
                                String[] strArr = (String[]) obj;
                                if (map != null) {
                                    if (map.containsKey("paramObj1")) {
                                        str2 = (String) map.get("paramObj1");
                                    } else {
                                        str2 = null;
                                    }
                                    if (map.containsKey("paramObj2")) {
                                        str5 = (String) map.get("paramObj2");
                                    }
                                    str = str5;
                                    str6 = str2;
                                } else {
                                    str = null;
                                }
                                aiVar.mo137189a(strArr, str6, str);
                                break;
                            }
                        case 21:
                            if (obj == null) {
                                C86641i.m150115c("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                break;
                            } else {
                                if (map != null && map.containsKey("paramObj1")) {
                                    str4 = (String) map.get("paramObj1");
                                }
                                String[] strArr2 = {obj};
                                if (!TextUtils.isEmpty(strArr2[0])) {
                                    if (!TextUtils.isEmpty(str4) && aiVar.f192969bf != 0) {
                                        aiVar.mo137142F();
                                        String a = C86640h.m150081a(aiVar.f192916aa, str4);
                                        String a2 = aiVar.mo137157a(a, aiVar.f192865B, (long) aiVar.f192972bi, strArr2, EnumC86649v.Undefine, aiVar.f192894aE, null, str4, null);
                                        if (!aiVar.f193018cl.contains(a)) {
                                            aiVar.f193018cl.add(a);
                                        }
                                        if (!TextUtils.isEmpty(a2)) {
                                            aiVar.mo137241h(a2);
                                            break;
                                        } else {
                                            aiVar.mo137241h(strArr2[0]);
                                            break;
                                        }
                                    } else {
                                        aiVar.mo137241h(strArr2[0]);
                                        break;
                                    }
                                } else {
                                    C86641i.m150117e("TTVideoEngine", "invalid urls list, it is empty");
                                    break;
                                }
                            }
                            break;
                        case 22:
                            aiVar.mo137145I();
                            break;
                        case 23:
                            aiVar.mo137146J();
                            break;
                        case 24:
                            aiVar.mo137155S();
                            break;
                        default:
                            switch (i) {
                                case 50:
                                    if (message.arg1 != 1) {
                                        z2 = false;
                                    }
                                    aiVar.mo137201b(z2, message.arg2);
                                    break;
                                case 51:
                                    if (obj == null) {
                                        C86641i.m150115c("TTVideoEngineLooperThread", "_setUnSupportSampleRates invalid param");
                                        break;
                                    } else {
                                        aiVar.mo137202b((int[]) obj);
                                        break;
                                    }
                                case 52:
                                    int i4 = message.arg1;
                                    if (aiVar.f192923ah != null) {
                                        aiVar.f192923ah.mo16687a(79, i4);
                                        break;
                                    }
                                    break;
                                case 53:
                                    if (obj == null) {
                                        C86641i.m150115c("TTVideoEngineLooperThread", "_doSetPlaybackParams invalid param");
                                        break;
                                    } else {
                                        aiVar.mo137196b((C86275p) obj);
                                        break;
                                    }
                                case 54:
                                    aiVar.mo137209c((Surface) obj);
                                    break;
                                case 55:
                                    aiVar.mo137169a((SurfaceHolder) obj);
                                    break;
                                case 56:
                                    aiVar.mo137195b((Surface) obj, message.arg1);
                                    break;
                                case 57:
                                    String str9 = (String) obj;
                                    if (map != null && map.containsKey("paramObj1")) {
                                        str3 = (String) map.get("paramObj1");
                                    }
                                    aiVar.mo137212c(str9, str3);
                                    break;
                                default:
                                    switch (i) {
                                        case 101:
                                            aiVar.mo137240h(message.arg1, message.arg2);
                                            break;
                                        case 102:
                                            if (obj == null) {
                                                C86641i.m150115c("TTVideoEngineLooperThread", "_doSetLongOption invalid param for key:" + message.arg1);
                                                break;
                                            } else {
                                                aiVar.mo137216d(message.arg1, ((Long) obj).longValue());
                                                break;
                                            }
                                        case 103:
                                            int l = aiVar.mo137254l(message.arg1);
                                            C86347ap.this.f193431d.setDataPosition(0);
                                            C86347ap.this.f193431d.writeInt(l);
                                            break;
                                        case 104:
                                            long m = aiVar.mo137257m(message.arg1);
                                            C86347ap.this.f193431d.setDataPosition(0);
                                            C86347ap.this.f193431d.writeLong(m);
                                            break;
                                        default:
                                            switch (i) {
                                                case 106:
                                                    float n = aiVar.mo137260n(message.arg1);
                                                    C86347ap.this.f193431d.setDataPosition(0);
                                                    C86347ap.this.f193431d.writeFloat(n);
                                                    break;
                                                case 107:
                                                    String o = aiVar.mo137262o(message.arg1);
                                                    C86347ap.this.f193431d.setDataPosition(0);
                                                    C86347ap.this.f193431d.writeString(o);
                                                    break;
                                                case 108:
                                                    if (obj == null) {
                                                        C86641i.m150115c("TTVideoEngineLooperThread", "_doSetStrungOption invalid param for key:" + message.arg1);
                                                        break;
                                                    } else {
                                                        aiVar.mo137225e(message.arg1, (String) obj);
                                                        break;
                                                    }
                                                default:
                                                    switch (i) {
                                                        case 150:
                                                            boolean p = aiVar.mo137264p();
                                                            C86347ap.this.f193431d.setDataPosition(0);
                                                            C86347ap.this.f193431d.writeInt(p ? 1 : 0);
                                                            break;
                                                        case 151:
                                                            int O = aiVar.mo137151O();
                                                            C86347ap.this.f193431d.setDataPosition(0);
                                                            C86347ap.this.f193431d.writeInt(O);
                                                            break;
                                                        case 152:
                                                            int u = aiVar.mo137269u();
                                                            C86347ap.this.f193431d.setDataPosition(0);
                                                            C86347ap.this.f193431d.writeInt(u);
                                                            break;
                                                        case 153:
                                                            int v = aiVar.mo137270v();
                                                            C86347ap.this.f193431d.setDataPosition(0);
                                                            C86347ap.this.f193431d.writeInt(v);
                                                            break;
                                                        case 154:
                                                            JSONObject P = aiVar.mo137152P();
                                                            C86347ap.this.f193431d.setDataPosition(0);
                                                            C86347ap.this.f193431d.writeValue(P);
                                                            break;
                                                        case 155:
                                                            boolean g = aiVar.mo137237g();
                                                            C86347ap.this.f193431d.setDataPosition(0);
                                                            C86347ap.this.f193431d.writeInt(g ? 1 : 0);
                                                            break;
                                                        case 156:
                                                            C86347ap.this.f193431d.writeInt(aiVar.mo137153Q() ? 1 : 0);
                                                            break;
                                                        case 157:
                                                            C86347ap.this.f193431d.writeInt(aiVar.mo137154R() ? 1 : 0);
                                                            break;
                                                        default:
                                                            C86641i.m150115c("TTVideoEngineLooperThread", "unknown message: " + message.what);
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else if (obj != null) {
                    aiVar.mo137226e((C86535p) obj);
                } else {
                    C86641i.m150115c("TTVideoEngineLooperThread", "_doParseDNSComplete no model");
                }
            } else if (obj != null) {
                aiVar.mo137256l((String) obj);
            } else {
                C86641i.m150115c("TTVideoEngineLooperThread", "_doParseDNSComplete invalid param");
            }
            C86347ap.m148882a(C86347ap.this.f193430c, condition);
        }

        public HandlerC86348a(C86313ai aiVar, Looper looper) {
            super(looper);
            this.f193439b = new WeakReference<>(aiVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137315a(Object obj) {
        if (this.f193432e != null) {
            HashMap hashMap = new HashMap();
            Condition newCondition = this.f193433f.newCondition();
            Message obtainMessage = this.f193432e.obtainMessage(411, 0, 0);
            hashMap.put("paramObj", obj);
            hashMap.put("msgCond", newCondition);
            try {
                this.f193433f.lock();
                this.f193437j = true;
                obtainMessage.obj = hashMap;
                obtainMessage.sendToTarget();
                newCondition.await();
                this.f193437j = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.f193433f.unlock();
                throw th;
            }
            this.f193433f.unlock();
        }
    }

    /* renamed from: a */
    static void m148882a(Lock lock, Condition condition) {
        if (condition != null) {
            lock.lock();
            condition.signal();
            lock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137310a(int i, int i2) {
        mo137312a(i, i2, 0, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137311a(int i, int i2, int i3) {
        mo137312a(i, i2, i3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r7.f193436i.f192864A == 5) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        if (r7.f193436i.f192864A == 5) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r7.f193435h.remove(r2);
        r7.f193430c.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        r1 = r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m148883b(int r8, long r9, java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86347ap.m148883b(int, long, java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137318b(int i, int i2, int i3, Object obj) {
        mo137319b(i, i2, i3, obj, null);
    }

    /* renamed from: a */
    public final void mo137312a(int i, int i2, int i3, Object obj) {
        mo137313a(i, i2, i3, obj, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137319b(int i, int i2, int i3, Object obj, Object obj2) {
        if (this.f193432e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            Message obtainMessage = this.f193432e.obtainMessage(i, i2, i3);
            obtainMessage.obj = hashMap;
            obtainMessage.sendToTarget();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137313a(int i, int i2, int i3, Object obj, Object obj2) {
        mo137314a(i, i2, i3, obj, obj2, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137314a(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        Handler handler;
        if (this.f193436i.f192864A != 5 && (handler = this.f193429b) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            if (obj3 != null) {
                hashMap.put("paramObj2", obj3);
            }
            Message obtainMessage = handler.obtainMessage(i, i2, i3);
            obtainMessage.obj = hashMap;
            obtainMessage.sendToTarget();
        }
    }
}
