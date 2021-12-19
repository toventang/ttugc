package com.p2082ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.strategy.ISelectBitrateListener;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoader;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.p2082ss.mediakit.medialoader.AVMDLStartCompleteListener;
import com.p2082ss.mediakit.net.AVMDLDNSParser;
import com.p2082ss.ttvideoengine.C86307af;
import com.p2082ss.ttvideoengine.C86377bf;
import com.p2082ss.ttvideoengine.p4409c.C86381b;
import com.p2082ss.ttvideoengine.p4411e.C86418d;
import com.p2082ss.ttvideoengine.p4412f.C86437e;
import com.p2082ss.ttvideoengine.p4415h.AbstractC86469k;
import com.p2082ss.ttvideoengine.p4415h.AbstractC86479p;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4417j.C86537q;
import com.p2082ss.ttvideoengine.p4418k.C86555h;
import com.p2082ss.ttvideoengine.p4419l.C86565a;
import com.p2082ss.ttvideoengine.p4419l.C86567b;
import com.p2082ss.ttvideoengine.p4419l.C86568c;
import com.p2082ss.ttvideoengine.p4419l.C86570e;
import com.p2082ss.ttvideoengine.p4421n.p4424c.C86590a;
import com.p2082ss.ttvideoengine.p4421n.p4424c.C86591b;
import com.p2082ss.ttvideoengine.p4425o.C86594a;
import com.p2082ss.ttvideoengine.p4428q.AbstractC86612a;
import com.p2082ss.ttvideoengine.p4428q.C86617e;
import com.p2082ss.ttvideoengine.p4430s.C86630a;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import com.p2082ss.ttvideoengine.p4430s.C86643k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.d */
public final class C86385d implements AVMDLDataLoaderListener, AVMDLStartCompleteListener {

    /* renamed from: A */
    private volatile boolean f193542A;

    /* renamed from: B */
    private C86399g f193543B;

    /* renamed from: C */
    private C86377bf f193544C;

    /* renamed from: D */
    private Exception f193545D;

    /* renamed from: E */
    private String f193546E;

    /* renamed from: F */
    private int f193547F;

    /* renamed from: G */
    private int f193548G;

    /* renamed from: H */
    private boolean f193549H;

    /* renamed from: I */
    private int f193550I;

    /* renamed from: J */
    private int f193551J;

    /* renamed from: K */
    private int f193552K;

    /* renamed from: L */
    private int f193553L;

    /* renamed from: M */
    private boolean f193554M;

    /* renamed from: N */
    private int f193555N;

    /* renamed from: O */
    private String f193556O;

    /* renamed from: P */
    private int f193557P;

    /* renamed from: Q */
    private int f193558Q;

    /* renamed from: R */
    private int f193559R;

    /* renamed from: S */
    private int f193560S;

    /* renamed from: T */
    private int f193561T;

    /* renamed from: U */
    private boolean f193562U;

    /* renamed from: V */
    private int f193563V;

    /* renamed from: W */
    private int f193564W;

    /* renamed from: X */
    private int f193565X;

    /* renamed from: Y */
    private int f193566Y;

    /* renamed from: Z */
    private int f193567Z;

    /* renamed from: a */
    public volatile AbstractC86564l f193568a;

    /* renamed from: aa */
    private final C86570e f193569aa;

    /* renamed from: b */
    public AbstractC86411e f193570b;

    /* renamed from: c */
    AbstractC86353as f193571c;

    /* renamed from: d */
    public volatile int f193572d;

    /* renamed from: e */
    public C86399g f193573e;

    /* renamed from: f */
    public C86399g f193574f;

    /* renamed from: g */
    public C86399g f193575g;

    /* renamed from: h */
    HashMap<String, ArrayList<C86313ai>> f193576h;

    /* renamed from: i */
    final ReentrantLock f193577i;

    /* renamed from: j */
    public AVMDLDataLoader f193578j;

    /* renamed from: k */
    public AVMDLDataLoaderConfigure f193579k;

    /* renamed from: l */
    public Context f193580l;

    /* renamed from: m */
    public C86390c f193581m;

    /* renamed from: n */
    public AbstractC86469k f193582n;

    /* renamed from: o */
    public AbstractC86479p f193583o;

    /* renamed from: p */
    public long f193584p;

    /* renamed from: q */
    public boolean f193585q;

    /* renamed from: r */
    public final ReentrantLock f193586r;

    /* renamed from: s */
    public int f193587s;

    /* renamed from: t */
    public AbstractC86311ag f193588t;

    /* renamed from: u */
    public WeakReference<AbstractC86311ag> f193589u;

    /* renamed from: v */
    public int f193590v;

    /* renamed from: w */
    public boolean f193591w;

    /* renamed from: x */
    public C86403k f193592x;

    /* renamed from: y */
    public int f193593y;

    /* renamed from: z */
    public int f193594z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.d$l */
    public interface AbstractC86405l {
        static {
            Covode.recordClassIndex(101633);
        }

        /* renamed from: a */
        void mo137423a(C86392d dVar);
    }

    static {
        Covode.recordClassIndex(101613);
    }

    /* renamed from: b */
    private static String m148974b(long j) {
        int i = (int) j;
        if (i == 0) {
            return "default";
        }
        if (i == 1) {
            return "cellular";
        }
        if (i != 2) {
            return null;
        }
        return "wifi";
    }

    /* renamed from: b */
    public final void mo137374b(int i) {
        m148969a(this, 512, i);
    }

    @Override // com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final long getInt64Value(int i, long j) {
        return 0;
    }

    /* renamed from: a */
    public static C86385d m148958a() {
        return C86400h.f193679a;
    }

    /* renamed from: a */
    public final void mo137369a(String str) {
        AbstractC86411e eVar = this.f193570b;
        if (eVar != null) {
            eVar.mo124250a(8, 0, 0, str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo137366a(AbstractC86479p pVar) {
        MethodCollector.m26663i(3661);
        this.f193583o = pVar;
        MethodCollector.m26664o(3661);
    }

    /* renamed from: a */
    public final void mo137367a(C86611q qVar) {
        this.f193586r.lock();
        try {
            m148971a(qVar.f195148a, qVar.f195150c, qVar.f195153f, (C86648u) null, qVar);
        } finally {
            this.f193586r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo137368a(C86648u uVar) {
        if (uVar == null || uVar.f195286a == null || uVar.f195287b == null) {
            C86641i.m150117e("DataLoaderHelper", "[preload] addTask videoModel input invalid");
            if (uVar != null) {
                uVar.mo137917a();
                return;
            }
            return;
        }
        C86590a aVar = C86313ai.f192840bS;
        String str = null;
        if (uVar.f195294i > 0 && aVar != null && uVar.f195287b == EnumC86649v.Auto) {
            String m = uVar.f195286a.mo137760m();
            if (!TextUtils.isEmpty(m)) {
                C86617e.C86621c.f195187a.mo137879b().addMedia(m, null, null, false);
                HashMap hashMap = new HashMap();
                String str2 = aVar.f195100b;
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("extra_config", str2);
                }
                C86591b bVar = new C86591b();
                bVar.f195103c = uVar.f195286a;
                Map<String, Integer> a = C86617e.C86621c.f195187a.mo137875a(uVar.f195286a, 2, hashMap, bVar);
                if (a != null) {
                    int intValue = a.get("video").intValue();
                    C86641i.m150110a("DataLoaderHelper", "[GearStrategy] gear strategy addTask videoBitrate=" + intValue + " audioBitrate=" + a.get(DataType.AUDIO).intValue());
                    List<C86534o> b = uVar.f195286a.mo137745b();
                    if (intValue > 0 && b != null) {
                        EnumC86649v vVar = uVar.f195287b;
                        HashMap hashMap2 = new HashMap();
                        Iterator<C86534o> it = b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C86534o next = it.next();
                            if (next != null && next.mo137723a() != C86537q.f194868b && next.mo137729c() != null && ((long) next.mo137724a(3)) == ((long) intValue)) {
                                vVar = next.mo137729c();
                                if (!TextUtils.isEmpty(next.mo137726b(32))) {
                                    hashMap2.put(32, next.mo137726b(32));
                                }
                            }
                        }
                        uVar.f195287b = vVar;
                        if (hashMap2.size() > 0) {
                            uVar.f195295j = hashMap2;
                        }
                    }
                }
            }
        }
        C86534o a2 = uVar.f195286a.mo137739a(uVar.f195287b, uVar.f195295j, true);
        if (a2 != null) {
            str = a2.mo137726b(15);
        }
        if (TextUtils.isEmpty(str)) {
            C86641i.m150117e("DataLoaderHelper", "[preload] key invalid.");
            uVar.mo137917a();
            return;
        }
        String b2 = uVar.f195286a.mo137744b(2);
        if (TextUtils.isEmpty(b2)) {
            C86641i.m150117e("DataLoaderHelper", "[preload] videoId invalid.");
            uVar.mo137917a();
            return;
        }
        this.f193586r.lock();
        try {
            m148971a(str, b2, uVar.f195288c, uVar, (C86611q) null);
        } finally {
            this.f193586r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo137371a(String str, String str2, String str3, long j) {
        if (TextUtils.isEmpty(str3)) {
            C86641i.m150117e("DataLoaderHelper", "[preload] url invalid.");
            return;
        }
        mo137367a(new C86611q(str, str2, j, new String[]{str3}));
    }

    /* renamed from: a */
    public final void mo137372a(String str, String str2, String[] strArr, long j, String str3) {
        if (strArr == null || strArr.length == 0) {
            C86641i.m150117e("DataLoaderHelper", "urls invalid.");
        } else {
            mo137367a(new C86611q(str, str2, j, strArr, str3));
        }
    }

    /* renamed from: a */
    public final void mo137360a(int i) {
        int i2;
        this.f193586r.lock();
        if (this.f193579k.mLoaderType == i || (i2 = this.f193563V) == i) {
            this.f193586r.unlock();
        } else if (i2 > 0) {
            this.f193586r.unlock();
        } else {
            try {
                this.f193578j.setIntValue(7227, i);
            } catch (Exception unused) {
                C86641i.m150113b("DataLoaderHelper", "set backup loader type failed");
            } finally {
                this.f193586r.unlock();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        com.p2082ss.ttvideoengine.p4430s.C86641i.m150117e("DataLoaderHelper", "setLongValue failed, key: " + r4 + ", value: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r3.f193586r.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137361a(int r4, long r5) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86385d.mo137361a(int, long):void");
    }

    /* renamed from: a */
    public final void mo137363a(int i, String str, long j) {
        if (this.f193572d != 0) {
            C86641i.m150113b("DataLoaderHelper", "dataloader not started, not allow set play info");
        } else if (this.f193565X > 0) {
            this.f193586r.lock();
            if (this.f193569aa.f195043a > 0 && this.f193569aa.f195044b > 0) {
                C86570e eVar = this.f193569aa;
                eVar.f195045c.lock();
                if (!eVar.f195046d.containsKey(str)) {
                    if (eVar.f195046d.size() >= 2) {
                        eVar.f195046d.clear();
                    }
                    C86570e.C86571a aVar = new C86570e.C86571a();
                    aVar.f195050d = str;
                    eVar.f195046d.put(str, aVar);
                }
                C86570e.C86571a aVar2 = eVar.f195046d.get(str);
                if (aVar2 != null) {
                    if (i == 22) {
                        aVar2.f195049c = j;
                    } else if (i == 23) {
                        aVar2.f195048b = j;
                        eVar.mo137825a(str);
                    } else if (i == 25) {
                        C86570e.m149836a("buffering", str);
                    } else if (i == 27) {
                        aVar2.f195047a = j;
                        eVar.mo137825a(str);
                    }
                }
                eVar.f195045c.unlock();
            }
            this.f193586r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo137362a(int i, String str) {
        C86641i.m150113b("DataLoaderHelper", "setStringValue key = " + i + ", value = " + str);
        this.f193586r.lock();
        if (i == 0) {
            this.f193579k.mCacheDir = str;
        } else if (i == 102) {
            this.f193579k.mNetCacheDir = str;
        } else if (i == 111) {
            this.f193579k.mDownloadDir = str;
        } else if (i == 514) {
            this.f193579k.mLiveContainerString = str;
        } else if (i == 1149) {
            this.f193579k.mNetSchedulerConfigStr = str;
        } else if (i == 1165) {
            this.f193579k.mDynamicPreconnectConfigStr = str;
        } else if (i == 1500) {
            this.f193579k.mMdlExtensionOptsStr = str;
        } else if (i == 2101) {
            this.f193579k.mVdpExtGlobalInfo = str;
        } else if (i == 9010) {
            this.f193579k.mSocketTraingCenterConfigStr = str;
        } else if (i == 9012) {
            this.f193579k.mP2PConfigStr = str;
        } else if (i == 107) {
            AVMDLDNSParser.setStringValue(8, str);
        } else if (i == 108) {
            AVMDLDNSParser.setStringValue(9, str);
        } else if (i == 1106) {
            this.f193579k.mVdpABTestId = str;
        } else if (i != 1107) {
            switch (i) {
                case 9002:
                    this.f193579k.mSettingsDomain = str;
                    break;
                case 9003:
                    this.f193579k.mDmDomain = str;
                    break;
                case 9004:
                    this.f193579k.mForesightDomain = str;
                    break;
                case 9005:
                    this.f193579k.mDomains = str;
                    break;
                case 9006:
                    try {
                        this.f193579k.mKeyDomain = str;
                        break;
                    } catch (Exception unused) {
                        break;
                    } catch (Throwable th) {
                        this.f193586r.unlock();
                        throw th;
                    }
                case 9007:
                    this.f193579k.mKeyToken = str;
                    break;
            }
        } else {
            this.f193579k.mVdpGroupId = str;
        }
        this.f193586r.unlock();
    }

    /* renamed from: a */
    public final void mo137373a(JSONObject jSONObject, long j) {
        String next;
        if (jSONObject == null) {
            C86641i.m150117e("DataLoaderHelper", "ip direct info invalid");
        } else if (C86555h.f195012a == -1 || 1000 * j >= C86555h.f195012a) {
            this.f193586r.lock();
            try {
                Iterator<String> keys = jSONObject.keys();
                do {
                    next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    String str = "";
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        str = str + optJSONArray.optString(i);
                        if (i < optJSONArray.length() - 1) {
                            str = str + ",";
                        }
                    }
                    AVMDLDNSParser.updateDNSInfo(next, str, j);
                    if (!keys.hasNext()) {
                        break;
                    }
                } while (!TextUtils.isEmpty(next));
            } catch (Exception e) {
                C86641i.m150117e("DataLoaderHelper", e.toString());
            } finally {
                this.f193586r.unlock();
            }
        } else {
            C86641i.m150117e("DataLoaderHelper", "network did change, dnsinfo is invalid");
        }
    }

    /* renamed from: a */
    public static void m148967a(C86392d dVar) {
        if (dVar != null && !dVar.f193626p) {
            dVar.f193626p = true;
            if (dVar.mo137405c() != null) {
                dVar.mo137405c();
            }
        }
    }

    /* renamed from: a */
    private static String[] m148973a(String[] strArr) {
        if (strArr == null || strArr.length == 0 || C86381b.C86382a.f193539a.mo137355e() == 1) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = C86640h.m150091b(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    /* renamed from: a */
    public final String mo137358a(String str, String str2, long j, String[] strArr, EnumC86649v vVar, String str3, C86534o oVar, String str4, String str5, boolean z, boolean z2, String str6) {
        if (this.f193572d != 0 || TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        String[] a = m148973a((String[]) strArr.clone());
        boolean z3 = false;
        for (int i = 0; i < a.length; i++) {
            if (!m148982n(a[i])) {
                C86641i.m150113b("DataLoaderHelper", "not support");
                return a[i];
            }
        }
        if (this.f193578j == null) {
            C86641i.m150117e("DataLoaderHelper", "start mdl first");
            return null;
        }
        if (this.f193561T == 1) {
            String lowerCase = a[0].toLowerCase();
            if (z2 || lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8") || lowerCase.contains(".m3u?") || lowerCase.endsWith(".m3u")) {
                z3 = true;
            }
            if (z3) {
                z = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        this.f193586r.lock();
        try {
            String localAddr = this.f193578j.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                C86641i.m150117e("DataLoaderHelper", "local host error");
                return null;
            }
            String a2 = m148961a(str, str2, 0, j, a, str4, str5, z3, str6);
            if (TextUtils.isEmpty(a2)) {
                this.f193586r.unlock();
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = this.f193548G;
            this.f193548G = i2 + 1;
            StringBuffer stringBuffer2 = new StringBuffer();
            C86641i.m150110a("DataLoaderHelper", "proxy url, mInvalidMdlProcotol: " + this.f193585q);
            if (z || this.f193585q || !this.f193549H) {
                stringBuffer.append("http://");
                stringBuffer.append(localAddr);
                stringBuffer.append("/");
                stringBuffer.append(i2);
            } else {
                stringBuffer.append("mdl://");
                stringBuffer.append("id");
                stringBuffer.append(i2);
                stringBuffer.append("/");
            }
            stringBuffer.append(a2);
            stringBuffer2.append(a2);
            String auth = this.f193578j.getAuth(a2);
            if (!TextUtils.isEmpty(auth)) {
                stringBuffer.append("&ah=");
                stringBuffer.append(auth);
                stringBuffer2.append("&ah=");
                stringBuffer2.append(auth);
            }
            String stringBuffer3 = stringBuffer.toString();
            C86641i.m150110a("DataLoaderHelper", "_proxyUrl: ".concat(String.valueOf(stringBuffer3)));
            this.f193586r.unlock();
            C86392d c = this.f193543B.mo137420c(str2);
            if (c == null) {
                c = new C86392d();
            }
            C86392d.C86394b b = c.mo137403b(str);
            if (b != null) {
                b.f193634a = str;
                c.f193611a = str2;
                b.f193635b = stringBuffer3;
                b.f193636c = vVar;
                b.f193637d = str3;
                b.f193638e = oVar;
                b.f193639f = a;
                b.f193646m = str4;
                b.f193640g = str5;
                this.f193543B.mo137414a(c);
            }
            return stringBuffer3;
        } finally {
            this.f193586r.unlock();
        }
    }

    /* renamed from: a */
    public final String mo137359a(String str, String str2, String[] strArr, int i) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        return m148960a(str, str2, 0L, 0L, strArr, (String) null, (String) null, 0, (String) null, false, (String) null, i);
    }

    /* renamed from: a */
    private void m148971a(String str, String str2, long j, C86648u uVar, C86611q qVar) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            C86641i.m150117e("DataLoaderHelper", "[preload] key invalid.");
        } else if (this.f193578j == null || this.f193572d != 0) {
            C86641i.m150117e("DataLoaderHelper", "[preload] need load mdl first.");
        } else if (this.f193574f.mo137415a(str) || this.f193573e.mo137415a(str)) {
            C86641i.m150113b("DataLoaderHelper", "[preload] add the same key task.");
        } else {
            EnumC86649v vVar = EnumC86649v.Undefine;
            if (!(uVar == null || uVar.f195287b == null)) {
                vVar = uVar.f195287b;
            }
            String str4 = "unknown";
            if (qVar != null) {
                if (!TextUtils.isEmpty(qVar.f195151d)) {
                    str4 = qVar.f195151d;
                }
                if (!TextUtils.isEmpty(qVar.f195152e)) {
                    str3 = qVar.f195152e;
                }
                str3 = null;
            } else if (uVar != null) {
                if (!TextUtils.isEmpty(uVar.f195296k)) {
                    str4 = uVar.f195296k;
                }
                if (!TextUtils.isEmpty(uVar.f195297l)) {
                    str3 = uVar.f195297l;
                }
                str3 = null;
            } else {
                str4 = null;
                str3 = null;
            }
            C86392d dVar = new C86392d();
            dVar.mo137402a(str, vVar, j);
            dVar.f193611a = str2;
            dVar.f193622l = null;
            dVar.f193624n = uVar;
            dVar.f193625o = qVar;
            dVar.f193628r = str4;
            dVar.f193629s = str3;
            if (qVar != null) {
                dVar.f193618h = qVar.f195154g;
            }
            if (uVar != null) {
                dVar.f193612b = uVar.f195286a;
                dVar.f193618h = uVar.f195298m;
                dVar.f193615e = uVar.f195289d / 1000.0f;
                dVar.f193616f = uVar.f195290e;
                dVar.f193617g = uVar.f195291f;
            }
            if (dVar.f193622l != null) {
                dVar.f193621k = new C86402j(this);
                dVar.f193618h = dVar.f193622l.f195202j;
            }
            if (this.f193573e.mo137414a(dVar)) {
                m148981l();
            } else {
                dVar.mo137401a(-1002);
            }
        }
    }

    /* renamed from: a */
    private void m148970a(C86534o oVar, C86392d dVar) {
        if (oVar == null || dVar == null) {
            C86641i.m150117e("DataLoaderHelper", "[preload] prepare url info fail. info or taskItem is null");
            return;
        }
        String[] b = oVar.mo137727b();
        String b2 = oVar.mo137726b(15);
        C86392d.C86394b b3 = dVar.mo137403b(b2);
        if (b == null || b.length <= 0) {
            C86641i.m150117e("DataLoaderHelper", "[preload] url info, urls info invalid");
            dVar.mo137401a(-100001);
            return;
        }
        String[] strArr = (String[]) b.clone();
        boolean z = false;
        if (dVar.f193622l != null) {
            z = dVar.f193622l.f195199g;
        } else if (dVar.f193624n != null) {
            z = dVar.f193624n.f195293h;
        }
        String[] a = m148972a(z, strArr);
        String str = null;
        if (dVar.f193622l != null && dVar.f193622l.f195208p != null && !TextUtils.isEmpty(b2)) {
            String a2 = dVar.f193622l.f195208p.mo137864a();
            if (!TextUtils.isEmpty(a2) && a2.contains(b2)) {
                str = a2;
            }
            if (!TextUtils.isEmpty(str)) {
                b2 = C86640h.m150081a(this.f193580l, str);
            }
        } else if (!(dVar.f193624n == null || dVar.f193624n.f195299n == null || TextUtils.isEmpty(b2))) {
            String a3 = dVar.f193624n.f195299n.mo137864a();
            if (!TextUtils.isEmpty(a3) && a3.contains(b2)) {
                str = a3;
            }
            if (!TextUtils.isEmpty(str)) {
                b2 = C86640h.m150081a(this.f193580l, str);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        String b4 = oVar.mo137726b(28);
        String str2 = "";
        if (b4 == null) {
            b4 = str2;
        }
        String b5 = oVar.mo137726b(29);
        if (b5 != null) {
            str2 = b5;
        }
        int a4 = oVar.mo137724a(3);
        stringBuffer.append("fileId=");
        stringBuffer.append(b4);
        stringBuffer.append("&bitrate=");
        stringBuffer.append(a4);
        stringBuffer.append("&pcrc=");
        stringBuffer.append(C86640h.m150106h(str2));
        stringBuffer.append("&tag=");
        stringBuffer.append(C86640h.m150106h(dVar.f193628r));
        if (!TextUtils.isEmpty(dVar.f193629s)) {
            stringBuffer.append("&stag=");
            stringBuffer.append(C86640h.m150106h(dVar.f193629s));
        }
        if (b3 == null && (b3 = dVar.mo137403b(b2)) == null) {
            dVar.mo137401a(-100001);
            return;
        }
        b3.f193634a = b2;
        b3.f193638e = oVar;
        b3.f193637d = oVar.mo137726b(5);
        b3.f193636c = oVar.mo137729c();
        b3.f193639f = a;
        b3.f193646m = str;
        b3.f193640g = stringBuffer.toString();
        C86641i.m150113b("DataLoaderHelper", "[preload] prepare url info. videoId = " + dVar.f193611a + ", key is " + b2 + ", resolution = " + b3.f193636c.toString());
    }

    /* renamed from: a */
    private static String[] m148972a(boolean z, String[] strArr) {
        if (!z) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = C86640h.m150091b(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    /* renamed from: a */
    private void m148966a(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (this.f193550I != 0) {
            long j = aVMDLDataLoaderNotifyInfo.code;
            long j2 = aVMDLDataLoaderNotifyInfo.parameter;
            if (j > 0 && j2 > 0) {
                double d = (double) j;
                Double.isNaN(d);
                double d2 = (double) j2;
                Double.isNaN(d2);
                C84116g.m144636e().mo124225a((8.0d * d) / (d2 / 1000.0d), d, j2);
            }
        }
    }

    /* renamed from: a */
    public final void mo137365a(C86313ai aiVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f193577i.lock();
                ArrayList<C86313ai> arrayList = this.f193576h.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f193576h.put(str, arrayList);
                }
                if (!arrayList.contains(aiVar)) {
                    arrayList.add(aiVar);
                    C86641i.m150110a("DataLoaderHelper", "add engine ref,rawKey = " + str + " engine ref count: " + arrayList.size());
                }
            } finally {
                this.f193577i.unlock();
            }
        }
    }

    /* renamed from: a */
    public final void mo137370a(String str, String str2) {
        AVMDLDNSParser.getInstance().setBackUpIP(str, str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f193560S = 1;
        }
    }

    /* renamed from: a */
    private void m148968a(C86392d dVar, C86392d.C86394b bVar) {
        if (dVar == null || bVar == null) {
            C86641i.m150117e("DataLoaderHelper", "[preload] start mdl preload task fail. track is null");
            return;
        }
        C86641i.m150110a("DataLoaderHelper", "[preload] start mdl preload task.  key = " + bVar.f193634a);
        String str = bVar.f193647n;
        String str2 = bVar.f193634a;
        if (dVar.f193625o != null && dVar.f193625o.f195156i != null) {
            bVar.f193635b = m148959a(str2, dVar.f193611a, dVar.f193618h);
            if (!TextUtils.isEmpty(bVar.f193635b)) {
                this.f193575g.mo137421d(str2);
                this.f193575g.mo137414a(dVar);
                if (bVar.f193642i > 0 && bVar.f193642i < bVar.f193641h + 102400) {
                    bVar.f193643j += bVar.f193642i;
                    bVar.f193642i = 0;
                }
                C86641i.m150110a("DataLoaderHelper", "[preload] preload offset " + bVar.f193642i + " header size = " + bVar.f193641h + " preload size = " + bVar.f193643j);
                if (bVar.f193642i > 0) {
                    if (bVar.f193641h > 0) {
                        this.f193578j.preloadResource(bVar.f193635b, (int) bVar.f193641h);
                    }
                    this.f193578j.preloadResource(bVar.f193635b, (int) bVar.f193642i, (int) bVar.f193643j);
                } else {
                    this.f193578j.preloadResource(bVar.f193635b, (int) bVar.f193643j);
                }
            } else {
                dVar.mo137401a(-100001);
            }
            C86641i.m150110a("DataLoaderHelper", C1764a.m5928a("[preload] exect preload task by provider mode, key is %s; videoId = %s proxyurl:%s", new Object[]{str2, dVar.f193611a, bVar.f193635b}));
        } else if (bVar.f193639f != null) {
            String[] strArr = bVar.f193639f;
            boolean a = dVar.f193612b != null ? dVar.f193612b.mo137743a(AbstractC86517e.EnumC86518a.HLS) : false;
            if (strArr.length > 0 && strArr[0].toLowerCase().contains(".m3u")) {
                a = true;
            }
            if (dVar.f193628r != null) {
                if (bVar.f193640g == null) {
                    bVar.f193640g = "tag=" + C86640h.m150106h(dVar.f193628r);
                } else {
                    bVar.f193640g += "&tag=" + C86640h.m150106h(dVar.f193628r);
                }
            }
            if (dVar.f193629s != null) {
                if (bVar.f193640g == null) {
                    bVar.f193640g = "stag=" + C86640h.m150106h(dVar.f193629s);
                } else {
                    bVar.f193640g += "&stag=" + C86640h.m150106h(dVar.f193629s);
                }
            }
            bVar.f193635b = m148962a(str2, dVar.f193611a, bVar.f193642i, strArr, bVar.f193646m, bVar.f193640g, dVar.f193618h, str, a);
            if (!TextUtils.isEmpty(bVar.f193635b)) {
                this.f193575g.mo137421d(str2);
                this.f193575g.mo137414a(dVar);
                if (bVar.f193642i > 0 && bVar.f193642i < bVar.f193641h + 102400) {
                    bVar.f193643j += bVar.f193642i;
                    bVar.f193642i = 0;
                }
                C86641i.m150110a("DataLoaderHelper", "[preload] preload offset " + bVar.f193642i + " header size = " + bVar.f193641h + " preload size = " + bVar.f193643j);
                if (bVar.f193642i > 0) {
                    if (bVar.f193641h > 0) {
                        this.f193578j.preloadResource(bVar.f193635b, (int) bVar.f193641h);
                    }
                    this.f193578j.preloadResource(bVar.f193635b, (int) bVar.f193642i, (int) bVar.f193643j);
                } else {
                    this.f193578j.preloadResource(bVar.f193635b, (int) bVar.f193643j);
                }
                C86641i.m150110a("DataLoaderHelper", C1764a.m5928a("[preload] exect preload task ,key is %s; videoId = %s", new Object[]{bVar.f193634a, dVar.f193611a}));
                return;
            }
            dVar.mo137401a(-100001);
        } else {
            dVar.mo137401a(-100001);
        }
    }

    /* renamed from: a */
    public static void m148969a(C86385d dVar, int i, int i2) {
        if (!C58029j.m104845a()) {
            dVar.m148965a(i, i2);
            C58029j.m104845a();
        } else if (i != 12) {
            dVar.m148965a(i, i2);
        } else {
            dVar.m148965a(i, i2);
            Keva.getRepo("ab_repo_cold_boot").storeInt("dataloader_key_int_preload_stragety", i2);
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$d */
    public class C86392d {

        /* renamed from: a */
        public String f193611a;

        /* renamed from: b */
        public AbstractC86517e f193612b;

        /* renamed from: c */
        public C86633c f193613c;

        /* renamed from: d */
        public long f193614d;

        /* renamed from: e */
        public float f193615e;

        /* renamed from: f */
        public long f193616f;

        /* renamed from: g */
        public long f193617g;

        /* renamed from: h */
        public int f193618h;

        /* renamed from: i */
        public EnumC86649v f193619i = EnumC86649v.Undefine;

        /* renamed from: j */
        public C86437e f193620j;

        /* renamed from: k */
        public AbstractC86405l f193621k;

        /* renamed from: l */
        public C86624r f193622l;

        /* renamed from: m */
        public String f193623m;

        /* renamed from: n */
        public C86648u f193624n;

        /* renamed from: o */
        public C86611q f193625o;

        /* renamed from: p */
        public boolean f193626p;

        /* renamed from: q */
        public C86567b f193627q;

        /* renamed from: r */
        public String f193628r;

        /* renamed from: s */
        public String f193629s;

        /* renamed from: t */
        public List<C86394b> f193630t = new CopyOnWriteArrayList();

        static {
            Covode.recordClassIndex(101620);
        }

        /* renamed from: b */
        public final void mo137404b() {
            C86437e eVar = this.f193620j;
            if (eVar != null) {
                eVar.f193803e = new C86393a(this);
            }
        }

        /* renamed from: a */
        public final void mo137400a() {
            if (this.f193622l != null && this.f193630t.size() == 1) {
                this.f193630t.remove(0);
            }
        }

        /* renamed from: c */
        public final AbstractC86509j mo137405c() {
            C86611q qVar = this.f193625o;
            if (qVar != null && qVar.f195157j != null) {
                return this.f193625o.f195157j;
            }
            C86624r rVar = this.f193622l;
            if (rVar != null) {
                return rVar.f195209q;
            }
            C86648u uVar = this.f193624n;
            if (uVar != null) {
                return uVar.f195300o;
            }
            C86567b bVar = this.f193627q;
            if (bVar != null) {
                return bVar.f195032d;
            }
            return null;
        }

        /* renamed from: com.ss.ttvideoengine.d$d$b */
        public class C86394b {

            /* renamed from: a */
            public String f193634a;

            /* renamed from: b */
            public String f193635b;

            /* renamed from: c */
            public EnumC86649v f193636c = EnumC86649v.Undefine;

            /* renamed from: d */
            public String f193637d;

            /* renamed from: e */
            public C86534o f193638e;

            /* renamed from: f */
            public String[] f193639f;

            /* renamed from: g */
            public String f193640g;

            /* renamed from: h */
            public long f193641h;

            /* renamed from: i */
            public long f193642i;

            /* renamed from: j */
            public long f193643j;

            /* renamed from: k */
            public long f193644k;

            /* renamed from: l */
            public long f193645l;

            /* renamed from: m */
            public String f193646m;

            /* renamed from: n */
            public String f193647n;

            static {
                Covode.recordClassIndex(101622);
            }

            public C86394b() {
            }
        }

        public C86392d() {
        }

        /* renamed from: b */
        public final C86394b mo137403b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C86394b a = mo137399a(str);
            if (a != null) {
                return a;
            }
            C86394b bVar = new C86394b();
            bVar.f193634a = str;
            this.f193630t.add(bVar);
            return bVar;
        }

        /* renamed from: a */
        public final C86394b mo137399a(String str) {
            if (this.f193630t.size() > 0) {
                for (int i = 0; i < this.f193630t.size(); i++) {
                    C86394b bVar = this.f193630t.get(i);
                    if (bVar.f193634a.equals(str)) {
                        return bVar;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo137401a(int i) {
            if (mo137405c() != null) {
                new C86633c("kTTVideoErrorDomainDataLoaderPreload", i);
                mo137405c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.ttvideoengine.d$d$a */
        public class C86393a implements C86437e.AbstractC86441a {

            /* renamed from: b */
            private final WeakReference<C86392d> f193633b;

            static {
                Covode.recordClassIndex(101621);
            }

            @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
            /* renamed from: a */
            public final void mo137285a(C86633c cVar) {
            }

            @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
            /* renamed from: a */
            public final void mo137286a(String str) {
            }

            public C86393a(C86392d dVar) {
                this.f193633b = new WeakReference<>(dVar);
            }

            @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
            /* renamed from: a */
            public final void mo137284a(C86535p pVar, C86633c cVar) {
                C86392d dVar = this.f193633b.get();
                if (dVar != null) {
                    dVar.f193612b = pVar;
                    dVar.f193613c = cVar;
                    if (dVar.f193621k != null) {
                        dVar.f193621k.mo137423a(dVar);
                    }
                }
            }

            @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
            /* renamed from: a */
            public final void mo137283a(int i, String str) {
                C86392d dVar = this.f193633b.get();
                if (dVar != null) {
                    if (!(i == 0 || i == 10)) {
                        dVar.f193613c = new C86633c("kTTVideoErrorDomainFetchingInfo", -7996);
                    }
                    if (dVar.f193621k != null) {
                        dVar.f193621k.mo137423a(dVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo137402a(String str, EnumC86649v vVar, long j) {
            if (this.f193630t.size() == 0) {
                C86394b bVar = new C86394b();
                bVar.f193634a = str;
                bVar.f193636c = vVar;
                bVar.f193643j = j;
                this.f193630t.add(bVar);
            } else {
                C86641i.m150117e("DataLoaderHelper", "[preload] DataLoaderTaskItem setup fail");
            }
            this.f193619i = vVar;
            this.f193614d = j;
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$h */
    public static class C86400h {

        /* renamed from: a */
        public static C86385d f193679a = new C86385d((byte) 0);

        static {
            Covode.recordClassIndex(101628);
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$c */
    public class C86390c {

        /* renamed from: a */
        public Timer f193606a;

        /* renamed from: b */
        public C86391a f193607b;

        static {
            Covode.recordClassIndex(101618);
        }

        /* renamed from: com.ss.ttvideoengine.d$c$a */
        public class C86391a extends TimerTask {

            /* renamed from: b */
            private AVMDLDataLoader f193610b;

            static {
                Covode.recordClassIndex(101619);
            }

            public final void run() {
                try {
                    AVMDLDataLoader aVMDLDataLoader = this.f193610b;
                    if (aVMDLDataLoader != null) {
                        aVMDLDataLoader.onLogInfo(70, 0, aVMDLDataLoader.getStringValue(1011));
                    }
                } catch (Exception unused) {
                }
            }

            public C86391a(AVMDLDataLoader aVMDLDataLoader) {
                this.f193610b = aVMDLDataLoader;
            }
        }

        private C86390c() {
        }

        /* synthetic */ C86390c(C86385d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$e */
    public class C86395e {

        /* renamed from: a */
        public String f193649a;

        /* renamed from: b */
        public int f193650b;

        /* renamed from: c */
        public List<C86396a> f193651c;

        /* renamed from: d */
        protected boolean f193652d;

        static {
            Covode.recordClassIndex(101623);
        }

        /* renamed from: com.ss.ttvideoengine.d$e$a */
        public class C86396a {

            /* renamed from: a */
            public String f193654a;

            /* renamed from: b */
            public long f193655b;

            /* renamed from: c */
            public long f193656c;

            /* renamed from: d */
            public EnumC86649v f193657d = EnumC86649v.Undefine;

            /* renamed from: e */
            public List<C86397a> f193658e;

            /* renamed from: f */
            public String f193659f;

            /* renamed from: g */
            public C86633c f193660g;

            static {
                Covode.recordClassIndex(101624);
            }

            /* renamed from: a */
            public final long mo137411a() {
                List<C86397a> list = this.f193658e;
                if (list == null || list.size() <= 0) {
                    return 0;
                }
                List<C86397a> list2 = this.f193658e;
                return list2.get(list2.size() - 1).f193663b;
            }

            /* renamed from: b */
            public final boolean mo137412b() {
                long j;
                long j2 = this.f193656c;
                if (j2 > 0) {
                    j = Math.min(j2, this.f193655b);
                } else {
                    j = this.f193655b;
                }
                C86397a aVar = null;
                List<C86397a> list = this.f193658e;
                if (list != null) {
                    aVar = list.get(list.size() - 1);
                }
                if (this.f193660g != null) {
                    return true;
                }
                if (aVar == null || this.f193655b <= 0 || aVar.f193662a + aVar.f193663b < j) {
                    return false;
                }
                return true;
            }

            /* renamed from: com.ss.ttvideoengine.d$e$a$a */
            public class C86397a {

                /* renamed from: a */
                public long f193662a;

                /* renamed from: b */
                public long f193663b;

                static {
                    Covode.recordClassIndex(101625);
                }

                public C86397a() {
                }
            }

            public C86396a() {
            }
        }

        /* renamed from: a */
        public final long mo137406a() {
            long j = 0;
            if (this.f193651c != null) {
                for (int i = 0; i < this.f193651c.size(); i++) {
                    j += this.f193651c.get(i).mo137411a();
                }
            }
            return j;
        }

        /* renamed from: b */
        public final boolean mo137409b() {
            if (this.f193650b != 2) {
                C86641i.m150113b("DataLoaderHelper", "task is not a preload task");
                return false;
            }
            if (this.f193651c != null) {
                for (int i = 0; i < this.f193651c.size(); i++) {
                    C86396a aVar = this.f193651c.get(i);
                    if (!(aVar == null || aVar.mo137412b())) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo137410c() {
            boolean z;
            int i;
            if (this.f193651c != null) {
                z = true;
                i = 0;
                for (int i2 = 0; i2 < this.f193651c.size(); i2++) {
                    C86396a aVar = this.f193651c.get(i2);
                    if (aVar == null || aVar.mo137412b()) {
                        i++;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = true;
                i = 0;
            }
            if (!this.f193652d) {
                if (z || (i > 0 && this.f193650b == 1)) {
                    return true;
                }
                return false;
            } else if (z || (i >= 2 && this.f193650b == 1)) {
                return true;
            } else {
                return false;
            }
        }

        public C86395e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C86396a mo137407a(String str) {
            List<C86396a> list;
            if (!TextUtils.isEmpty(str) && (list = this.f193651c) != null) {
                for (C86396a aVar : list) {
                    if (aVar.f193654a.equals(str)) {
                        return aVar;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo137408a(C86392d dVar) {
            this.f193649a = dVar.f193611a;
            if (this.f193651c == null) {
                this.f193651c = new ArrayList();
            }
            Iterator<C86392d.C86394b> it = dVar.f193630t.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C86392d.C86394b next = it.next();
                C86396a a = mo137407a(next.f193634a);
                if (a == null) {
                    a = new C86396a();
                    z = false;
                }
                a.f193654a = next.f193634a;
                a.f193655b = next.f193644k;
                a.f193657d = next.f193636c;
                long j = next.f193645l;
                if (a.f193658e == null) {
                    a.f193658e = new ArrayList();
                }
                if (a.f193658e.size() == 0) {
                    a.f193658e.add(new C86396a.C86397a());
                }
                a.f193658e.get(0).f193662a = 0;
                a.f193658e.get(0).f193663b = j;
                a.f193659f = next.f193646m;
                a.f193656c = next.f193643j;
                if (next.f193638e != null) {
                    if (next.f193638e.mo137723a() == C86537q.f194867a) {
                        i2++;
                    } else if (next.f193638e.mo137723a() == C86537q.f194868b) {
                        i++;
                    }
                }
                if (!z) {
                    this.f193651c.add(a);
                }
            }
            if (i > 0 && i2 > 0) {
                this.f193652d = true;
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$g */
    public class C86399g {

        /* renamed from: a */
        public long f193675a;

        /* renamed from: c */
        private final ReentrantLock f193677c;

        /* renamed from: d */
        private final ArrayList<C86392d> f193678d;

        static {
            Covode.recordClassIndex(101627);
        }

        /* renamed from: a */
        public final long mo137413a() {
            this.f193677c.lock();
            long size = (long) this.f193678d.size();
            this.f193677c.unlock();
            return size;
        }

        /* renamed from: d */
        public final ArrayList<C86392d> mo137422d() {
            try {
                this.f193677c.lock();
                ArrayList<C86392d> arrayList = new ArrayList<>();
                arrayList.addAll(this.f193678d);
                return arrayList;
            } finally {
                this.f193677c.unlock();
            }
        }

        /* renamed from: e */
        private Boolean m149043e() {
            boolean z = false;
            if (this.f193675a < 1) {
                return false;
            }
            if (((long) this.f193678d.size()) >= this.f193675a) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: b */
        public final C86392d mo137416b() {
            this.f193677c.lock();
            if (this.f193678d.size() == 0) {
                this.f193677c.unlock();
                return null;
            }
            ArrayList<C86392d> arrayList = this.f193678d;
            C86392d dVar = arrayList.get(arrayList.size() - 1);
            this.f193677c.unlock();
            return dVar;
        }

        /* renamed from: c */
        public final C86392d mo137419c() {
            this.f193677c.lock();
            if (this.f193678d.size() == 0) {
                this.f193677c.unlock();
                return null;
            }
            ArrayList<C86392d> arrayList = this.f193678d;
            C86392d dVar = arrayList.get(arrayList.size() - 1);
            this.f193678d.remove(dVar);
            this.f193677c.unlock();
            return dVar;
        }

        private C86399g() {
            this.f193677c = new ReentrantLock();
            this.f193678d = new ArrayList<>();
            this.f193675a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo137414a(C86392d dVar) {
            Boolean bool;
            if (dVar == null || dVar.f193630t.size() == 0) {
                return false;
            }
            Boolean.valueOf(false);
            this.f193677c.lock();
            if (m149043e().booleanValue()) {
                bool = false;
            } else {
                this.f193678d.add(dVar);
                bool = true;
            }
            this.f193677c.unlock();
            return bool.booleanValue();
        }

        /* renamed from: d */
        public final C86392d mo137421d(String str) {
            C86392d dVar = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f193677c.lock();
            int i = 0;
            while (true) {
                if (i >= this.f193678d.size()) {
                    break;
                }
                C86392d dVar2 = this.f193678d.get(i);
                if (dVar2.mo137399a(str) != null) {
                    dVar = dVar2;
                    this.f193678d.remove(dVar);
                    break;
                }
                i++;
            }
            this.f193677c.unlock();
            return dVar;
        }

        /* renamed from: a */
        public final boolean mo137415a(String str) {
            int i = 0;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Boolean bool = false;
            this.f193677c.lock();
            while (true) {
                if (i >= this.f193678d.size()) {
                    break;
                } else if (this.f193678d.get(i).mo137399a(str) != null) {
                    bool = true;
                    break;
                } else {
                    i++;
                }
            }
            this.f193677c.unlock();
            return bool.booleanValue();
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.ttvideoengine.C86385d.C86392d mo137417b(com.p2082ss.ttvideoengine.C86385d.C86392d r4) {
            /*
                r3 = this;
                java.lang.String r0 = r4.f193611a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0011
                java.lang.String r0 = r4.f193611a
                com.ss.ttvideoengine.d$d r2 = r3.mo137420c(r0)
                if (r2 == 0) goto L_0x0012
                return r2
            L_0x0011:
                r2 = 0
            L_0x0012:
                java.util.List<com.ss.ttvideoengine.d$d$b> r0 = r4.f193630t
                java.util.Iterator r1 = r0.iterator()
            L_0x0018:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x002c
                java.lang.Object r0 = r1.next()
                com.ss.ttvideoengine.d$d$b r0 = (com.p2082ss.ttvideoengine.C86385d.C86392d.C86394b) r0
                java.lang.String r0 = r0.f193634a
                com.ss.ttvideoengine.d$d r2 = r3.mo137421d(r0)
                if (r2 == 0) goto L_0x0018
            L_0x002c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86385d.C86399g.mo137417b(com.ss.ttvideoengine.d$d):com.ss.ttvideoengine.d$d");
        }

        /* renamed from: c */
        public final C86392d mo137420c(String str) {
            C86392d dVar = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f193677c.lock();
            int i = 0;
            while (true) {
                if (i >= this.f193678d.size()) {
                    break;
                }
                C86392d dVar2 = this.f193678d.get(i);
                if (!TextUtils.isEmpty(dVar2.f193611a) && dVar2.f193611a.equals(str)) {
                    dVar = dVar2;
                    this.f193678d.remove(dVar);
                    break;
                }
                i++;
            }
            this.f193677c.unlock();
            return dVar;
        }

        /* renamed from: b */
        public final C86392d mo137418b(String str) {
            C86392d dVar = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f193677c.lock();
            int i = 0;
            while (true) {
                if (i >= this.f193678d.size()) {
                    break;
                }
                C86392d dVar2 = this.f193678d.get(i);
                if (dVar2.mo137399a(str) != null) {
                    dVar = dVar2;
                    break;
                }
                i++;
            }
            this.f193677c.unlock();
            return dVar;
        }

        /* synthetic */ C86399g(C86385d dVar, byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo137380c() {
        boolean z;
        this.f193586r.lock();
        try {
            if (this.f193572d == 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f193586r.unlock();
        }
    }

    /* renamed from: g */
    public final void mo137389g() {
        this.f193586r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f193578j;
            if (aVMDLDataLoader != null) {
                aVMDLDataLoader.clearNetinfoCache();
            }
        } catch (Throwable unused) {
        }
        this.f193586r.unlock();
    }

    /* renamed from: i */
    public final long mo137392i() {
        return this.f193574f.mo137413a() + this.f193575g.mo137413a() + this.f193573e.mo137413a();
    }

    /* renamed from: com.ss.ttvideoengine.d$k */
    public static class C86403k {

        /* renamed from: a */
        private HandlerThread f193684a;

        /* renamed from: b */
        private Handler f193685b;

        static {
            Covode.recordClassIndex(101631);
        }

        public C86403k() {
            try {
                HandlerThread handlerThread = new HandlerThread("vclould.engine.preload.media");
                this.f193684a = handlerThread;
                handlerThread.start();
                this.f193685b = new Handler(this.f193684a.getLooper()) {
                    /* class com.p2082ss.ttvideoengine.C86385d.C86403k.HandlerC864041 */

                    static {
                        Covode.recordClassIndex(101632);
                    }

                    public final void handleMessage(Message message) {
                        if (message != null) {
                            try {
                                if (!(message.obj instanceof ArrayList)) {
                                    C86641i.m150113b("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                                    return;
                                }
                                ArrayList arrayList = (ArrayList) message.obj;
                                if (arrayList == null) {
                                    C86641i.m150113b("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                                    return;
                                }
                                C86385d dVar = (C86385d) arrayList.get(0);
                                switch (message.what) {
                                    case 111:
                                        if (arrayList.size() == 3) {
                                            C86568c cVar = (C86568c) arrayList.get(1);
                                            String str = (String) arrayList.get(2);
                                            if (dVar != null && cVar != null) {
                                                C86401i iVar = null;
                                                if (cVar.f195034f != null) {
                                                    iVar = new C86401i(cVar.f195034f);
                                                }
                                                String m = cVar.f195033e.mo137760m();
                                                if (cVar.f195035g != null) {
                                                    JSONObject n = cVar.f195033e.mo137761n();
                                                    try {
                                                        n.put("sc_extra", new JSONObject(cVar.f195035g));
                                                        m = n.toString();
                                                    } catch (JSONException unused) {
                                                    }
                                                }
                                                C86617e.C86621c.f195187a.mo137879b().addMedia(m, iVar, str, cVar.f195036h);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 112:
                                        if (arrayList.size() == 3) {
                                            String str2 = (String) arrayList.get(1);
                                            String str3 = (String) arrayList.get(2);
                                            if (dVar != null) {
                                                C86617e.C86621c.f195187a.mo137879b().removeMedia(str2, str3);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 113:
                                        if (arrayList.size() == 3) {
                                            String str4 = (String) arrayList.get(1);
                                            int intValue = ((Integer) arrayList.get(2)).intValue();
                                            if (dVar != null) {
                                                C86617e.C86621c.f195187a.mo137879b().removeAllMedia(str4, intValue);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 114:
                                        if (arrayList.size() == 3) {
                                            String str5 = (String) arrayList.get(1);
                                            int intValue2 = ((Integer) arrayList.get(2)).intValue();
                                            if (dVar != null) {
                                                C86617e.C86621c.f195187a.mo137879b().focusMedia(str5, intValue2);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                };
            } catch (Throwable unused) {
                this.f193684a = null;
                this.f193685b = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final String mo137387f() {
        AVMDLDataLoader aVMDLDataLoader;
        this.f193586r.lock();
        try {
            if (this.f193546E == null && (aVMDLDataLoader = this.f193578j) != null) {
                this.f193546E = aVMDLDataLoader.getStringValue(11);
            }
            String str = this.f193546E;
            this.f193586r.unlock();
            return str;
        } catch (Exception unused) {
            this.f193586r.unlock();
            return null;
        } catch (Throwable th) {
            this.f193586r.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo137390h() {
        if (this.f193578j == null || this.f193572d != 0) {
            C86641i.m150117e("DataLoaderHelper", "need start mdl first");
            return;
        }
        this.f193586r.lock();
        try {
            m148980k();
            this.f193586r.unlock();
        } catch (Throwable unused) {
            this.f193586r.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo137383d() {
        if (this.f193565X > 0 && this.f193569aa.f195043a > 0 && this.f193569aa.f195044b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo137385e() {
        if (this.f193572d != 0) {
            C86641i.m150113b("DataLoaderHelper", "dataloader not started, not allow set play info");
        } else if (this.f193566Y > 0) {
            this.f193586r.lock();
            this.f193578j.setIntValue(7410, C86307af.m148603a().f192813b);
            this.f193578j.setIntValue(7409, C86307af.C86308a.m148612a().mo137130c());
            this.f193586r.unlock();
        }
    }

    @Override // com.p2082ss.mediakit.medialoader.AVMDLStartCompleteListener
    public final void onStartComplete() {
        C86641i.m150113b("DataLoaderHelper", "MediaDataLoader start complete");
        C86594a.m149985a().mo137863b().mo137861a(C86594a.f195109f);
        int i = C86307af.m148603a().f192812a;
        this.f193590v = i;
        AVMDLDataLoader aVMDLDataLoader = this.f193578j;
        if (aVMDLDataLoader != null) {
            aVMDLDataLoader.setIntValue(7219, i);
            if (!C86617e.C86621c.f195187a.mo137879b().isRunning()) {
                C86641i.m150113b("DataLoaderHelper", "strategy center running failed, set mdl preload strategy back " + this.f193594z);
                this.f193578j.setIntValue(1030, this.f193594z);
            }
        }
    }

    private C86385d() {
        this.f193572d = 1;
        this.f193573e = new C86399g(this, (byte) 0);
        this.f193574f = new C86399g(this, (byte) 0);
        this.f193575g = new C86399g(this, (byte) 0);
        this.f193543B = new C86399g(this, (byte) 0);
        this.f193576h = new HashMap<>();
        this.f193577i = new ReentrantLock();
        this.f193578j = null;
        this.f193579k = null;
        this.f193580l = null;
        this.f193544C = null;
        this.f193545D = null;
        this.f193546E = null;
        this.f193581m = null;
        this.f193582n = null;
        this.f193583o = null;
        this.f193547F = 0;
        this.f193584p = -1;
        this.f193585q = true;
        this.f193548G = 0;
        this.f193549H = false;
        this.f193586r = new ReentrantLock();
        this.f193587s = 0;
        this.f193550I = 0;
        this.f193551J = 0;
        this.f193588t = null;
        this.f193589u = null;
        this.f193590v = -1;
        this.f193552K = 0;
        this.f193553L = 0;
        this.f193554M = false;
        this.f193555N = 1;
        this.f193556O = null;
        this.f193557P = 0;
        this.f193558Q = 0;
        this.f193559R = 0;
        this.f193560S = 0;
        this.f193561T = 0;
        this.f193591w = false;
        this.f193592x = null;
        this.f193562U = true;
        this.f193563V = 0;
        this.f193593y = 0;
        this.f193594z = 0;
        this.f193564W = 0;
        this.f193565X = 0;
        this.f193566Y = 0;
        this.f193567Z = 0;
        this.f193569aa = new C86570e();
        this.f193544C = C86377bf.m148936a();
        this.f193572d = 1;
        this.f193579k = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    /* renamed from: j */
    private boolean m148979j() {
        String c;
        if (this.f193568a == null) {
            return true;
        }
        if (this.f193552K == 1 && this.f193580l != null) {
            try {
                String str = this.f193580l.getApplicationInfo().dataDir + "/lib";
                if (!(str == null || (c = C86640h.m150096c(new File(str + File.separatorChar + "libavmdl.so"))) == null)) {
                    C86641i.m150117e("DataLoaderHelper", "libavmdl md5: ".concat(String.valueOf(c)));
                }
            } catch (Exception unused) {
            }
        }
        if (this.f193568a != null && !this.f193542A) {
            if (this.f193564W == 1) {
                try {
                    this.f193542A = this.f193568a.mo137819a();
                } catch (Exception unused2) {
                    this.f193542A = false;
                }
            }
            C86641i.m150113b("DataLoaderHelper", "try to load avmdl: " + this.f193542A);
            if (!this.f193542A) {
                this.f193542A = this.f193568a.mo137819a();
            }
        }
        return this.f193542A;
    }

    /* renamed from: k */
    private void m148980k() {
        ArrayList arrayList = new ArrayList();
        if (this.f193574f.mo137413a() > 0) {
            while (true) {
                C86392d c = this.f193574f.mo137419c();
                if (c == null) {
                    break;
                } else if (c.f193618h >= 10000) {
                    arrayList.add(c);
                } else {
                    if (c.f193620j != null) {
                        c.f193620j.mo137469a();
                    }
                    m148967a(c);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                this.f193574f.mo137414a((C86392d) arrayList.get(i));
            }
            arrayList.clear();
        }
        if (this.f193573e.mo137413a() > 0) {
            while (true) {
                C86392d c2 = this.f193573e.mo137419c();
                if (c2 == null) {
                    break;
                } else if (c2.f193618h >= 10000) {
                    arrayList.add(c2);
                } else {
                    if (c2.f193620j != null) {
                        c2.f193620j.mo137469a();
                    }
                    m148967a(c2);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.f193573e.mo137414a((C86392d) arrayList.get(i2));
            }
            arrayList.clear();
        }
        if (this.f193575g.mo137413a() > 0) {
            boolean z = false;
            while (true) {
                C86392d c3 = this.f193575g.mo137419c();
                if (c3 == null) {
                    break;
                } else if (c3.f193618h >= 10000) {
                    arrayList.add(c3);
                } else {
                    m148967a(c3);
                    z = true;
                }
            }
            if (z) {
                this.f193578j.cancelAll();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.f193575g.mo137414a((C86392d) arrayList.get(i3));
            }
            arrayList.clear();
        }
    }

    /* renamed from: b */
    public final boolean mo137377b() {
        boolean z;
        boolean z2;
        if (this.f193578j != null) {
            return true;
        }
        if (!m148979j()) {
            C86641i.m150117e("DataLoaderHelper", C1764a.m5928a("library load fail", new Object[0]));
            return false;
        }
        if (this.f193568a == null && this.f193564W == 1 && this.f193570b != null) {
            C86641i.m150113b("DataLoaderHelper", "try to load mdlv2");
            AVMDLDataLoader.loadAVMDLBaseLibrary();
            this.f193570b.mo124257b();
            C86641i.m150113b("DataLoaderHelper", "load mdlv2: false");
        }
        if (this.f193568a != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f193547F != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (AVMDLDataLoader.init(z, z2) != 0) {
            C86641i.m150117e("DataLoaderHelper", C1764a.m5928a("library has not been loaded", new Object[0]));
            return false;
        }
        C86641i.m150117e("P2PLIB", C1764a.m5928a("loadertype:%d NeedDLLoadP2PLib:%d, liveloaderType: %d", new Object[]{Integer.valueOf(this.f193579k.mLoaderType), Integer.valueOf(this.f193547F), Integer.valueOf(this.f193579k.mLiveLoaderType)}));
        if (this.f193547F == 0 && ((this.f193579k.mLoaderType > 0 || (this.f193579k.mLiveLoaderType != 10000 && this.f193579k.mLiveLoaderType >= 7)) && this.f193570b != null)) {
            C86641i.m150117e("P2PLIB", "try to load p2p lib");
            this.f193570b.mo124257b();
            C86641i.m150117e("P2PLIB", C1764a.m5928a("load p2p lib result:%d", new Object[]{0}));
        }
        try {
            AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
            this.f193578j = instance;
            instance.setConfigure(this.f193579k);
            this.f193578j.setListener(this);
            this.f193578j.setStartCompleteListener(this);
            this.f193581m = new C86390c(this, (byte) 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    private void m148981l() {
        String str;
        String str2;
        C86377bf.C86378a a;
        MethodCollector.m26663i(4398);
        if (this.f193578j == null) {
            C86641i.m150117e("DataLoaderHelper", "[preload] need load mdl first.");
            MethodCollector.m26664o(4398);
            return;
        }
        C86392d b = this.f193573e.mo137416b();
        if (b == null) {
            MethodCollector.m26664o(4398);
        } else if (this.f193574f.mo137414a(b)) {
            this.f193573e.mo137419c();
            if (b.f193612b == null && b.f193625o == null) {
                b.mo137400a();
                HashMap hashMap = new HashMap();
                if (b.f193622l != null && b.f193622l.f195196d.equals("bytevc2")) {
                    hashMap.put("codec_type", "4");
                } else if (b.f193622l != null && b.f193622l.f195196d.equals("bytevc1")) {
                    hashMap.put("codec_type", "3");
                }
                if (b.f193622l != null && b.f193622l.f195197e) {
                    hashMap.put("format_type", "dash");
                }
                if (b.f193622l != null && b.f193622l.f195198f) {
                    hashMap.put("ssl", "1");
                }
                String str3 = null;
                if (b.f193622l == null || b.f193622l.f195206n == null) {
                    str = null;
                    str2 = null;
                } else {
                    str = b.f193622l.f195206n.mo137915a();
                    str2 = b.f193622l.f195206n.mo137916b();
                    if (b.f193622l.f195200h) {
                        str = C86640h.m150097c(str);
                    }
                    b.f193623m = str;
                }
                if (this.f193570b != null && TextUtils.isEmpty(b.f193623m)) {
                    if (b.f193622l.f195200h) {
                        str = C86640h.m150097c((String) null);
                    } else {
                        str = null;
                    }
                    b.f193623m = C86643k.m150120a(str);
                    str2 = null;
                }
                int c = C86307af.C86308a.m148612a().mo137130c();
                if (c != -1) {
                    str = str + C1764a.m5928a("&%s=%s", new Object[]{"network_score", Integer.valueOf(c)});
                    b.f193623m = C86643k.m150120a(str);
                }
                String a2 = C86643k.m150120a(str);
                synchronized (C86624r.class) {
                    try {
                        a = this.f193544C.mo137342a(b.f193611a, a2);
                    } finally {
                        MethodCollector.m26664o(4398);
                    }
                }
                if (a == null || a.f193514c) {
                    if (b.f193622l != null) {
                        b.f193620j = new C86437e(this.f193580l, b.f193622l.mo137882a());
                        b.mo137404b();
                        b.f193620j.f193804f = b.f193622l.f195204l;
                        b.f193620j.f193805g = b.f193622l.f195193a;
                        b.f193620j.mo137476a(true);
                        C86437e eVar = b.f193620j;
                        if (!(b.f193622l.f195195c == 2 || b.f193622l.f195195c == 4)) {
                            str3 = str2;
                        }
                        eVar.mo137473a(a2, str3, b.f193622l.f195195c);
                    }
                    return;
                }
                b.f193612b = a.f193512a;
                C86641i.m150110a("DataLoaderHelper", C1764a.m5928a("[preload] get videoModel , videoId = %s", new Object[]{b.f193611a}));
                mo137375b(b);
                MethodCollector.m26664o(4398);
                return;
            }
            mo137375b(b);
            MethodCollector.m26664o(4398);
        } else {
            MethodCollector.m26664o(4398);
        }
    }

    /* synthetic */ C86385d(byte b) {
        this();
    }

    /* renamed from: com.ss.ttvideoengine.d$a */
    public class C86388a {

        /* renamed from: a */
        public String f193598a;

        /* renamed from: b */
        public long f193599b;

        /* renamed from: c */
        public long f193600c;

        static {
            Covode.recordClassIndex(101616);
        }

        public C86388a() {
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$b */
    public class C86389b {

        /* renamed from: a */
        public long f193602a;

        /* renamed from: b */
        public long f193603b;

        /* renamed from: c */
        public String f193604c;

        static {
            Covode.recordClassIndex(101617);
        }

        public C86389b() {
        }
    }

    /* renamed from: m */
    public final void mo137397m(String str) {
        this.f193543B.mo137421d(str);
    }

    /* renamed from: com.ss.ttvideoengine.d$f */
    public class C86398f {

        /* renamed from: a */
        public String f193665a;

        /* renamed from: b */
        public String f193666b;

        /* renamed from: c */
        public String f193667c;

        /* renamed from: d */
        public long f193668d;

        /* renamed from: e */
        public long f193669e;

        /* renamed from: f */
        public EnumC86649v f193670f = EnumC86649v.Undefine;

        /* renamed from: g */
        public String f193671g;

        /* renamed from: h */
        public C86534o f193672h;

        /* renamed from: i */
        public int f193673i;

        static {
            Covode.recordClassIndex(101626);
        }

        public C86398f() {
        }
    }

    /* renamed from: a */
    public final void mo137364a(long j) {
        AbstractC86411e eVar = this.f193570b;
        if (eVar != null) {
            eVar.mo124250a(9, 0, j, "");
        }
    }

    /* renamed from: e */
    public static void m148977e(int i) {
        if (i == 1) {
            i = 1;
        } else if (i >= 4) {
            i = 5;
        }
        C86617e eVar = C86617e.C86621c.f195187a;
        eVar.mo137879b().setIntValue(10000, i);
        eVar.f195177n = i;
    }

    /* renamed from: d */
    public final long mo137382d(String str) {
        long j = 0;
        if (this.f193572d != 0) {
            return 0;
        }
        this.f193586r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f193578j;
            if (aVMDLDataLoader != null) {
                long tryQuickGetCacheSize = aVMDLDataLoader.tryQuickGetCacheSize(str);
                if (tryQuickGetCacheSize > 0) {
                    j = tryQuickGetCacheSize;
                }
            }
        } catch (Throwable unused) {
        }
        this.f193586r.unlock();
        return j;
    }

    @Override // com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getCheckSumInfo(String str) {
        try {
            if (this.f193570b == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f193570b.mo124248a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final C86388a mo137394j(String str) {
        C86389b f = mo137386f(str);
        if (f == null) {
            return null;
        }
        C86388a aVar = new C86388a();
        aVar.f193599b = f.f193602a;
        aVar.f193600c = f.f193603b;
        aVar.f193598a = f.f193604c;
        return aVar;
    }

    /* renamed from: b */
    public final void mo137376b(String str) {
        if (this.f193572d == 0 && !TextUtils.isEmpty(str)) {
            this.f193586r.lock();
            try {
                Uri parse = Uri.parse(str);
                int port = parse.getPort();
                if (port == -1) {
                    port = 80;
                    if (str.startsWith("https")) {
                        port = 443;
                    }
                }
                AVMDLDataLoader aVMDLDataLoader = this.f193578j;
                if (aVMDLDataLoader != null) {
                    aVMDLDataLoader.preConnectByHost(parse.getHost(), port);
                }
            } finally {
                this.f193586r.unlock();
            }
        }
    }

    /* renamed from: c */
    public final long mo137378c(int i) {
        long j;
        this.f193586r.lock();
        long j2 = -1;
        if (i != 1003) {
            if (i == 1152) {
                j = this.f193579k.mMonitorTimeInternal;
            } else if (i != 1153) {
                this.f193586r.unlock();
                return -1;
            } else {
                try {
                    j = this.f193579k.mMonitorMinAllowLoadSize;
                } catch (Throwable th) {
                    this.f193586r.unlock();
                    throw th;
                }
            }
            this.f193586r.unlock();
            return j;
        }
        if (this.f193549H) {
            j2 = this.f193584p;
        }
        this.f193586r.unlock();
        return j2;
    }

    /* renamed from: d */
    public final int mo137381d(int i) {
        if (!C58029j.m104845a()) {
            C58029j.m104845a();
            return m148978f(i);
        } else if (i != 12) {
            return m148978f(i);
        } else {
            return Keva.getRepo("ab_repo_cold_boot").getInt("dataloader_key_int_preload_stragety", -1);
        }
    }

    /* renamed from: e */
    public final String mo137384e(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.f193586r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f193578j;
            if (aVMDLDataLoader != null) {
                str2 = aVMDLDataLoader.getStringValueByStr(str, 1010);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f193586r.unlock();
            throw th;
        }
        this.f193586r.unlock();
        return str2;
    }

    /* renamed from: g */
    public final long mo137388g(String str) {
        this.f193586r.lock();
        long j = 0;
        try {
            if (this.f193578j != null) {
                long cacheSize = this.f193578j.getCacheSize(C86640h.m150081a(this.f193580l, str), str);
                if (cacheSize > 0) {
                    j = cacheSize;
                }
            }
        } catch (Throwable unused) {
        }
        this.f193586r.unlock();
        return j;
    }

    /* renamed from: i */
    public final long mo137393i(String str) {
        long j = 0;
        if (this.f193572d != 0) {
            return 0;
        }
        this.f193586r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f193578j;
            if (aVMDLDataLoader != null) {
                long cacheSize = aVMDLDataLoader.getCacheSize(str);
                if (cacheSize > 0) {
                    j = cacheSize;
                }
            }
        } catch (Throwable unused) {
        }
        this.f193586r.unlock();
        return j;
    }

    /* renamed from: l */
    public final boolean mo137396l(String str) {
        boolean z = false;
        if (this.f193572d != 0) {
            return false;
        }
        this.f193586r.lock();
        try {
            if (this.f193578j != null) {
                if (!TextUtils.isEmpty(str)) {
                    this.f193578j.downloadResource(str);
                    C86641i.m150110a("DataLoaderHelper", "[downloader] start download resource = ".concat(String.valueOf(str)));
                    z = true;
                }
            }
        } catch (Throwable unused) {
        }
        this.f193586r.unlock();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.d$j */
    public class C86402j implements AbstractC86405l {

        /* renamed from: b */
        private final WeakReference<C86385d> f193683b;

        static {
            Covode.recordClassIndex(101630);
        }

        @Override // com.p2082ss.ttvideoengine.C86385d.AbstractC86405l
        /* renamed from: a */
        public final void mo137423a(C86392d dVar) {
            C86385d dVar2 = this.f193683b.get();
            if (dVar2 != null && dVar != null) {
                if (!(dVar.f193612b == null || dVar.mo137405c() == null)) {
                    dVar.mo137405c();
                    dVar.f193619i = dVar.f193622l.f195194b;
                }
                if (!(dVar.f193622l == null || dVar.f193622l.f195207o == null)) {
                    dVar.f193619i = dVar.f193622l.f195194b;
                }
                if (dVar.f193622l != null && !dVar.f193622l.f195203k) {
                    dVar2.mo137375b(dVar);
                }
                if (dVar.f193613c != null) {
                    if (dVar2.f193570b != null) {
                        dVar2.f193570b.mo124254a(dVar.f193611a, dVar.f193613c);
                    }
                    if (dVar.mo137405c() != null) {
                        dVar.mo137405c();
                    }
                }
            }
        }

        public C86402j(C86385d dVar) {
            this.f193683b = new WeakReference<>(dVar);
        }
    }

    /* renamed from: b */
    private static String[] m148975b(String[] strArr) {
        if (strArr == null || strArr.length <= 1) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            String str = strArr[i];
            Boolean bool = true;
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (((String) arrayList.get(size)).equals(str)) {
                    bool = false;
                    break;
                } else {
                    size--;
                }
            }
            if (bool.booleanValue()) {
                arrayList.add(str);
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    /* renamed from: n */
    private boolean m148982n(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("mdl://") && !lowerCase.startsWith("http://127.0.0.1") && !lowerCase.startsWith("http://localhost") && !lowerCase.startsWith("file://") && !lowerCase.startsWith("/") && !lowerCase.endsWith(".mpd") && !lowerCase.contains(".mpd?") && (((this.f193561T == 1 && this.f193591w) || (!lowerCase.contains(".m3u8?") && !lowerCase.endsWith(".m3u8"))) && !lowerCase.contains(".m3u?") && !lowerCase.endsWith(".m3u"))) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private ArrayList<C86313ai> m148983o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            this.f193577i.lock();
            ArrayList<C86313ai> arrayList = this.f193576h.get(str);
            if (arrayList != null) {
                ArrayList<C86313ai> arrayList2 = new ArrayList<>();
                arrayList2.addAll(arrayList);
                C86641i.m150110a("DataLoaderHelper", "get engine ref,rawKey = " + str + " engine ref count: " + arrayList2.size());
                return arrayList2;
            }
            this.f193577i.unlock();
            return null;
        } finally {
            this.f193577i.unlock();
        }
    }

    /* renamed from: c */
    public final JSONObject mo137379c(String str) {
        String cDNLog;
        if (this.f193572d != 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.f193586r.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.f193578j;
            if (!(aVMDLDataLoader == null || (cDNLog = aVMDLDataLoader.getCDNLog(str)) == null)) {
                JSONObject jSONObject = new JSONObject(cDNLog);
                C86641i.m150113b("DataLoaderHelper", "get cdn log suc" + jSONObject.toString());
                this.f193586r.unlock();
                return jSONObject;
            }
        } catch (Exception e) {
            C86641i.m150113b("DataLoaderHelper", "get log exception" + e.toString());
        } catch (Throwable th) {
            this.f193586r.unlock();
            throw th;
        }
        this.f193586r.unlock();
        return null;
    }

    /* renamed from: f */
    public final C86389b mo137386f(String str) {
        C86389b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.f193586r.lock();
        try {
            if (this.f193578j != null) {
                if (this.f193572d == 0) {
                    String stringCacheInfo = this.f193578j.getStringCacheInfo(str);
                    if (stringCacheInfo != null) {
                        String[] split = stringCacheInfo.split(",");
                        if (split.length >= 4) {
                            C86389b bVar2 = new C86389b();
                            bVar2.f193604c = split[3];
                            if (!TextUtils.isEmpty(split[0])) {
                                bVar2.f193603b = Long.valueOf(split[0]).longValue();
                            }
                            if (!TextUtils.isEmpty(split[1])) {
                                bVar2.f193602a = Long.valueOf(split[1]).longValue();
                            }
                            C86641i.m150113b("DataLoaderHelper", "get cache info.");
                            bVar = bVar2;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f193586r.unlock();
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo137391h(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f193586r.lock();
            try {
                if (this.f193578j == null) {
                    C86641i.m150117e("DataLoaderHelper", "mInnerDataLoader == null");
                } else {
                    C86641i.m150110a("DataLoaderHelper", " force remove mdl file. key ".concat(String.valueOf(str)));
                    this.f193578j.forceRemoveFileCache(str);
                }
            } catch (Throwable unused) {
            }
            this.f193586r.unlock();
        }
    }

    /* renamed from: k */
    public final String mo137395k(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("mdl://")) {
                return str;
            }
            int indexOf = str.indexOf("?");
            if (indexOf == -1) {
                return null;
            }
            String localAddr = this.f193578j.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("http://");
            stringBuffer.append(localAddr);
            stringBuffer.append(str.substring(indexOf));
            String stringBuffer2 = stringBuffer.toString();
            C86641i.m150117e("DataLoaderHelper", "_proxyUrl: ".concat(String.valueOf(stringBuffer2)));
            return stringBuffer2;
        } catch (Exception unused) {
            C86641i.m150117e("DataLoaderHelper", "get proxy url failed: ".concat(String.valueOf(str)));
            return str;
        }
    }

    /* renamed from: a */
    private static String m148963a(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            sb.append(str).append(": ").append(hashMap.get(str)).append("\r\n");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private int m148978f(int i) {
        int i2;
        this.f193586r.lock();
        if (i == 7) {
            i2 = this.f193579k.mEnableExternDNS;
        } else if (i == 8) {
            i2 = this.f193579k.mEnableSocketReuse;
        } else if (i == 12) {
            i2 = this.f193593y;
        } else if (i == 90) {
            i2 = this.f193579k.mDNSMainType;
        } else if (i == 103) {
            i2 = AVMDLDNSParser.getIntValue(4);
        } else if (i == 105) {
            i2 = AVMDLDNSParser.getIntValue(6);
        } else if (i == 1001) {
            i2 = this.f193579k.mEnablePreconnect;
        } else if (i == 1008) {
            i2 = this.f193590v;
        } else if (i == 1150) {
            i2 = this.f193579k.mEnableIOManager;
        } else if (i == 9009) {
            i2 = this.f193591w;
        } else if (i == 100) {
            i2 = this.f193579k.mMaxTlsVersion;
        } else if (i == 101) {
            i2 = this.f193579k.mEnableSessionReuse;
        } else if (i == 114) {
            i2 = this.f193559R;
        } else if (i != 115) {
            i2 = -1;
        } else {
            try {
                i2 = this.f193560S;
            } catch (Throwable th) {
                this.f193586r.unlock();
                throw th;
            }
        }
        this.f193586r.unlock();
        return i2 == 1 ? 1 : 0;
    }

    /* renamed from: c */
    private void m148976c(C86392d dVar) {
        ArrayList<C86392d> d = this.f193543B.mo137422d();
        for (int i = 0; i < d.size(); i++) {
            C86392d dVar2 = d.get(i);
            if (!TextUtils.isEmpty(dVar2.f193611a) && !TextUtils.isEmpty(dVar.f193611a) && dVar2.f193611a.equals(dVar.f193611a)) {
                return;
            }
        }
        this.f193586r.lock();
        C86570e eVar = this.f193569aa;
        String str = dVar.f193611a;
        eVar.f195045c.lock();
        if (!eVar.f195046d.containsKey(str)) {
            if (eVar.f195046d.size() >= 2) {
                eVar.f195046d.clear();
            }
            eVar.f195046d.put(str, new C86570e.C86571a());
        }
        C86641i.m150113b("PreloadUtil", "key :" + str + " cache end.");
        C86570e.C86571a aVar = eVar.f195046d.get(str);
        if (aVar != null) {
            aVar.f195051e = true;
            if (!aVar.f195052f) {
                C86641i.m150113b("PreloadUtil", "cached video trigger preload " + str + " cache end ");
                C86400h.f193679a.mo137364a(aVar.f195047a);
                aVar.f195052f = true;
            }
        } else {
            C86641i.m150113b("PreloadUtil", "key :" + str + " play info null");
        }
        eVar.f195045c.unlock();
        this.f193586r.unlock();
        ArrayList<C86313ai> o = m148983o(dVar.f193611a);
        if (!(o == null || o.size() == 0)) {
            for (int i2 = 0; i2 < o.size(); i2++) {
                C86313ai aiVar = o.get(i2);
                if (aiVar.f192878O != null) {
                    C86641i.m150110a("TTVideoEngine", "notify cache end. source id: " + aiVar.f192975bl);
                    C86365az azVar = new C86365az();
                    azVar.f193468a = "mdlcacheend";
                    if (aiVar.f193015ch.mo137320b()) {
                        aiVar.f193015ch.mo137318b(412, 0, 0, azVar);
                    } else {
                        aiVar.f192878O.mo101150a(azVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m148964a(JSONObject jSONObject) {
        try {
            long a = C86372bd.f193500a.mo137334a();
            if (a > 0) {
                jSONObject.put("_play_waste_data", a);
            }
            long b = C86372bd.f193500a.mo137337b();
            if (b > 0) {
                jSONObject.put("_play_consumed_data", b);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0307  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137375b(com.p2082ss.ttvideoengine.C86385d.C86392d r32) {
        /*
        // Method dump skipped, instructions count: 1290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86385d.mo137375b(com.ss.ttvideoengine.d$d):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        String str;
        C86392d b;
        String str2;
        int i;
        String str3;
        boolean z;
        C86399g gVar;
        C86392d dVar;
        String str4;
        int i2;
        String str5;
        if (aVMDLDataLoaderNotifyInfo != null) {
            int i3 = aVMDLDataLoaderNotifyInfo.what;
            if (i3 != 8) {
                if (i3 == 24) {
                    AbstractC86411e eVar = this.f193570b;
                    if (eVar != null) {
                        eVar.mo124250a(30, 0, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i3 == 70) {
                    aVMDLDataLoaderNotifyInfo.jsonLog = m148964a(aVMDLDataLoaderNotifyInfo.jsonLog);
                    AbstractC86479p pVar = this.f193583o;
                    if (pVar != null) {
                        pVar.mo137482a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    AbstractC86411e eVar2 = this.f193570b;
                    if (eVar2 != null) {
                        eVar2.mo124251a(3, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                    }
                    C86641i.m150113b("DataLoaderHelper", "heart beat msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                    return;
                } else if (i3 == 700) {
                    C86641i.m150113b("DataLoaderHelper", "KeyIsSpeedTestSampledByTime " + aVMDLDataLoaderNotifyInfo.code);
                    AbstractC86353as asVar = this.f193571c;
                    if (asVar != null) {
                        asVar.mo137135a(aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.logExtraJsonStr);
                    }
                    if (this.f193553L == 1) {
                        this.f193570b.mo124250a(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i3 == 702) {
                    AbstractC86353as asVar2 = this.f193571c;
                    if (asVar2 != null) {
                        asVar2.mo137136a(aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i3 == 901) {
                    C86641i.m150113b("multinetwork", C1764a.m5928a("target network:%d current network:%d", new Object[]{Long.valueOf(aVMDLDataLoaderNotifyInfo.parameter), Long.valueOf(aVMDLDataLoaderNotifyInfo.code)}));
                    String b2 = m148974b(aVMDLDataLoaderNotifyInfo.parameter);
                    String b3 = m148974b(aVMDLDataLoaderNotifyInfo.code);
                    if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(b3) && this.f193570b != null) {
                        C86641i.m150113b("multinetwork", "do callback target: " + b2 + " current: " + b3);
                        C86641i.m150113b("multinetwork", "end do callback target: " + b2 + " current: " + b3);
                        return;
                    }
                    return;
                } else if (i3 == 10) {
                    AbstractC86479p pVar2 = this.f193583o;
                    if (pVar2 != null) {
                        pVar2.mo137482a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    AbstractC86411e eVar3 = this.f193570b;
                    if (eVar3 != null) {
                        eVar3.mo124251a(4, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        C86641i.m150113b("DataLoaderHelper", "live loader log msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                } else if (i3 != 11) {
                    switch (i3) {
                        case 0:
                            AbstractC86479p pVar3 = this.f193583o;
                            if (pVar3 != null) {
                                pVar3.mo137482a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                return;
                            }
                            AbstractC86411e eVar4 = this.f193570b;
                            if (eVar4 != null) {
                                eVar4.mo124251a(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            }
                            if (this.f193582n != null && !this.f193562U) {
                                return;
                            }
                            return;
                        case 1:
                            AbstractC86479p pVar4 = this.f193583o;
                            if (pVar4 != null) {
                                pVar4.mo137482a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                return;
                            }
                            AbstractC86411e eVar5 = this.f193570b;
                            if (eVar5 != null) {
                                eVar5.mo124251a(1, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            }
                            if (this.f193582n != null && !this.f193562U) {
                                return;
                            }
                            return;
                        case 2:
                            AbstractC86411e eVar6 = this.f193570b;
                            if (eVar6 != null) {
                                eVar6.mo124250a(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                            }
                            m148966a(aVMDLDataLoaderNotifyInfo);
                            return;
                        case 3:
                        case 4:
                            C86641i.m150113b("DataLoaderHelper", "KeyIsFileCacheProgress log = " + aVMDLDataLoaderNotifyInfo.logInfo + ", task type = " + aVMDLDataLoaderNotifyInfo.parameter + " code = " + ((int) aVMDLDataLoaderNotifyInfo.code));
                            if (aVMDLDataLoaderNotifyInfo.logInfo == null) {
                                return;
                            }
                            if (aVMDLDataLoaderNotifyInfo.parameter == 3) {
                                C86418d.f193745a.mo137449a(aVMDLDataLoaderNotifyInfo.logInfo);
                                return;
                            }
                            if (aVMDLDataLoaderNotifyInfo.parameter == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!TextUtils.isEmpty(aVMDLDataLoaderNotifyInfo.logInfo)) {
                                String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                                if (split.length >= 4) {
                                    try {
                                        long longValue = Long.valueOf(split[0]).longValue();
                                        long longValue2 = Long.valueOf(split[1]).longValue();
                                        if (longValue2 > 0 || aVMDLDataLoaderNotifyInfo.what == 4) {
                                            String str6 = split[2];
                                            String str7 = split[3];
                                            if (z) {
                                                dVar = this.f193575g.mo137418b(str6);
                                                if (dVar == null) {
                                                    C86641i.m150110a("DataLoaderHelper", "[preload] preload temItem == null return " + aVMDLDataLoaderNotifyInfo.logInfo);
                                                    if (aVMDLDataLoaderNotifyInfo.what == 4) {
                                                        C86398f fVar = new C86398f();
                                                        fVar.f193669e = longValue;
                                                        fVar.f193668d = longValue2;
                                                        fVar.f193665a = str6;
                                                        fVar.f193673i = 2;
                                                        fVar.f193667c = str7;
                                                        AbstractC86411e eVar7 = this.f193570b;
                                                        if (eVar7 != null) {
                                                            eVar7.mo124253a(fVar);
                                                            C86641i.m150110a("DataLoaderHelper", " task progress. cache end. key = ".concat(String.valueOf(str6)));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                gVar = this.f193575g;
                                            } else {
                                                dVar = this.f193543B.mo137418b(str6);
                                                if (dVar == null) {
                                                    C86641i.m150110a("DataLoaderHelper", "[preload] play temItem == null return " + aVMDLDataLoaderNotifyInfo.logInfo);
                                                    return;
                                                }
                                                gVar = this.f193543B;
                                            }
                                            C86392d.C86394b a = dVar.mo137399a(str6);
                                            if (a != null) {
                                                a.f193644k = longValue2;
                                                a.f193645l = longValue;
                                                a.f193646m = str7;
                                            }
                                            if (TextUtils.isEmpty(dVar.f193611a)) {
                                                str4 = str6;
                                            } else {
                                                str4 = dVar.f193611a;
                                            }
                                            C86395e a2 = C86565a.C86566a.f195028a.mo137820a(str4);
                                            if (a2 == null) {
                                                a2 = new C86395e();
                                            }
                                            a2.f193649a = dVar.f193611a;
                                            if (z) {
                                                i2 = 2;
                                            } else {
                                                i2 = 1;
                                            }
                                            a2.f193650b = i2;
                                            a2.mo137408a(dVar);
                                            if (!(longValue2 != longValue || a == null || a.f193638e == null)) {
                                                StringBuilder sb = new StringBuilder("[preload] ");
                                                if (a.f193638e.mo137723a() == C86537q.f194868b) {
                                                    str5 = "Audio";
                                                } else {
                                                    str5 = "Video";
                                                }
                                                C86641i.m150110a("DataLoaderHelper", sb.append(str5).append(" cache complete key: ").append(str6).toString());
                                            }
                                            AbstractC86411e eVar8 = this.f193570b;
                                            if (eVar8 != null) {
                                                eVar8.mo124252a(a2);
                                            }
                                            C86565a.C86566a.f195028a.mo137821a(str4, a2);
                                            if (a2.mo137410c() || ((z && a2.mo137409b()) || aVMDLDataLoaderNotifyInfo.what == 4)) {
                                                gVar.mo137421d(str6);
                                                C86565a.C86566a.f195028a.mo137822b(str4);
                                                if (!z) {
                                                    C86641i.m150110a("DataLoaderHelper", "[preload] notify vid cache end key: ".concat(String.valueOf(str4)));
                                                    m148976c(dVar);
                                                }
                                                C86398f fVar2 = new C86398f();
                                                fVar2.f193669e = longValue;
                                                fVar2.f193668d = longValue2;
                                                fVar2.f193665a = str6;
                                                fVar2.f193667c = str7;
                                                fVar2.f193670f = a.f193636c;
                                                fVar2.f193671g = a.f193637d;
                                                fVar2.f193672h = a.f193638e;
                                                fVar2.f193666b = dVar.f193611a;
                                                fVar2.f193673i = a2.f193650b;
                                                if (dVar.mo137405c() != null && z) {
                                                    dVar.mo137405c();
                                                    C86641i.m150110a("DataLoaderHelper", "[preload] notify end cache size = " + a2.mo137406a());
                                                }
                                                AbstractC86411e eVar9 = this.f193570b;
                                                if (eVar9 != null) {
                                                    eVar9.mo124253a(fVar2);
                                                    C86641i.m150110a("DataLoaderHelper", " task progress. cache end. key = " + str6 + ", rawKey = " + str4);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        C86641i.m150110a("DataLoaderHelper", "[preload] mediaSize <= 0 return " + aVMDLDataLoaderNotifyInfo.logInfo);
                                        return;
                                    } catch (Exception unused) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            AbstractC86411e eVar10 = this.f193570b;
                            if (eVar10 != null) {
                                eVar10.mo124250a(20, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                return;
                            }
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            try {
                                JSONObject a3 = C86630a.m150043a(aVMDLDataLoaderNotifyInfo.jsonLog);
                                if (a3 != null) {
                                    AbstractC86411e eVar11 = this.f193570b;
                                    if (eVar11 != null) {
                                        eVar11.mo124256a(a3);
                                    }
                                    C86641i.m150113b("avmdlcdnlog", "receive log:".concat(String.valueOf(a3)));
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        default:
                            switch (i3) {
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                    if (this.f193570b != null && aVMDLDataLoaderNotifyInfo.jsonLog != null) {
                                        this.f193570b.mo124251a(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    }
                                    return;
                                case ABRConfig.ABR_SELECT_SCENE:
                                    C86641i.m150110a("DataLoaderHelper", "MDL Alog: " + aVMDLDataLoaderNotifyInfo.logInfo);
                                    return;
                                case 15:
                                    AbstractC86479p pVar5 = this.f193583o;
                                    if (pVar5 != null) {
                                        pVar5.mo137482a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    } else if (this.f193570b != null && aVMDLDataLoaderNotifyInfo.jsonLog != null) {
                                        this.f193570b.mo124255a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    } else {
                                        return;
                                    }
                                case 16:
                                    AbstractC86411e eVar12 = this.f193570b;
                                    if (eVar12 != null) {
                                        eVar12.mo124251a(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i3) {
                                        case 19:
                                            AbstractC86479p pVar6 = this.f193583o;
                                            if (pVar6 != null) {
                                                pVar6.mo137482a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                return;
                                            }
                                            AbstractC86411e eVar13 = this.f193570b;
                                            if (eVar13 != null) {
                                                eVar13.mo124251a(7, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                return;
                                            }
                                            return;
                                        case C84224v.f188239U:
                                            break;
                                        case 21:
                                            if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                                                C86418d.f193745a.mo137449a(aVMDLDataLoaderNotifyInfo.logInfo);
                                                return;
                                            }
                                            return;
                                        case 22:
                                            if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                                                String str8 = aVMDLDataLoaderNotifyInfo.logInfo;
                                                C86418d dVar2 = C86418d.f193745a;
                                                if (!TextUtils.isEmpty(str8) && dVar2.f193754j != null) {
                                                    dVar2.f193754j.sendMessage(Message.obtain(dVar2.f193754j, 2, str8));
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            switch (i3) {
                                                case 1000:
                                                case 1001:
                                                case 1002:
                                                case 1003:
                                                    AbstractC86479p pVar7 = this.f193583o;
                                                    if (pVar7 != null) {
                                                        pVar7.mo137482a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                        return;
                                                    }
                                                    AbstractC86411e eVar14 = this.f193570b;
                                                    if (eVar14 != null) {
                                                        eVar14.mo124251a(10, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    return;
                                            }
                                    }
                            }
                    }
                } else {
                    AbstractC86479p pVar8 = this.f193583o;
                    if (pVar8 != null) {
                        pVar8.mo137482a(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    AbstractC86411e eVar15 = this.f193570b;
                    if (eVar15 != null) {
                        eVar15.mo124251a(5, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        C86641i.m150113b("DataLoaderHelper", "live loader log sample msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    return;
                }
            }
            String str9 = "kTTVideoErrorDomainDataLoaderPreload";
            if (aVMDLDataLoaderNotifyInfo.logInfo != null && aVMDLDataLoaderNotifyInfo.parameter == 3) {
                String str10 = aVMDLDataLoaderNotifyInfo.logInfo;
                long j = aVMDLDataLoaderNotifyInfo.code;
                C86418d dVar3 = C86418d.f193745a;
                int i4 = (int) j;
                long j2 = aVMDLDataLoaderNotifyInfo.parameter;
                if (i4 != -5000) {
                    if (i4 == -4000) {
                        str3 = "request invalid.";
                    } else if (i4 == -2000) {
                        str3 = "media data content length invalid";
                    } else if (i4 == -3001) {
                        i = -9944;
                        str3 = "server invalid. response status code >= 500";
                    } else if (i4 != -3000) {
                        switch (i4) {
                            case -1002:
                                str3 = "Waiting for too many tasks, > 20";
                                break;
                            case -1001:
                                str3 = "add the same key task.";
                                break;
                            case -1000:
                                str3 = "create preload task fail.";
                                break;
                            default:
                                str3 = "task fail. reply task error.";
                                break;
                        }
                    } else {
                        if (!C86555h.m149815b(this.f193580l)) {
                            i = -9960;
                        } else {
                            i = -9945;
                        }
                        str3 = "url invalid. response status code >= 400";
                    }
                    i = i4;
                } else {
                    i = -9948;
                    str3 = "write file fail.";
                }
                if (j2 == 3) {
                    str9 = "kTTVideoErrorDomainDownload";
                }
                C86633c cVar = new C86633c(str9, i, i4, "key = " + str10 + ", reason = " + str3);
                if (!TextUtils.isEmpty(str10) && dVar3.f193754j != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str10);
                    arrayList.add(cVar);
                    dVar3.f193754j.sendMessage(Message.obtain(dVar3.f193754j, 1, arrayList));
                }
            } else if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                C86641i.m150110a("DataLoaderHelper", " task fail log = " + aVMDLDataLoaderNotifyInfo.logInfo + ", code = " + aVMDLDataLoaderNotifyInfo.code + ", task type = " + aVMDLDataLoaderNotifyInfo.parameter);
                String[] split2 = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                if (split2.length > 0 && (b = this.f193575g.mo137418b((str = split2[0]))) != null) {
                    C86399g gVar2 = this.f193575g;
                    C86633c cVar2 = new C86633c(str9, (int) aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.logInfo);
                    if (TextUtils.isEmpty(b.f193611a)) {
                        str2 = str;
                    } else {
                        str2 = b.f193611a;
                    }
                    C86395e a4 = C86565a.C86566a.f195028a.mo137820a(str2);
                    if (a4 == null) {
                        a4 = new C86395e();
                    }
                    a4.f193649a = b.f193611a;
                    a4.f193650b = (int) aVMDLDataLoaderNotifyInfo.parameter;
                    a4.mo137408a(b);
                    C86395e.C86396a a5 = a4.mo137407a(str);
                    if (a5 != null) {
                        a5.f193660g = cVar2;
                    }
                    AbstractC86411e eVar16 = this.f193570b;
                    if (eVar16 != null) {
                        eVar16.mo124252a(a4);
                    }
                    C86565a.C86566a.f195028a.mo137821a(str2, a4);
                    if (a4.mo137410c() || a4.mo137409b()) {
                        gVar2.mo137421d(str);
                        C86641i.m150110a("DataLoaderHelper", "pop all task item. videoId = " + b.f193611a + " key = " + str);
                        C86565a.C86566a.f195028a.mo137822b(str2);
                        if (this.f193570b != null) {
                            C86398f fVar3 = new C86398f();
                            fVar3.f193673i = (int) aVMDLDataLoaderNotifyInfo.parameter;
                            fVar3.f193666b = b.f193611a;
                            fVar3.f193665a = str;
                            if (!(b.f193625o == null || b.f193625o.f195149b == null)) {
                                fVar3.f193667c = b.f193625o.f195149b;
                                fVar3.f193665a = null;
                            }
                            this.f193570b.mo124253a(fVar3);
                        }
                        if (b.mo137405c() != null && aVMDLDataLoaderNotifyInfo.parameter == 2) {
                            b.mo137405c();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$i */
    class C86401i implements ISelectBitrateListener {

        /* renamed from: b */
        private AbstractC86612a f193681b;

        static {
            Covode.recordClassIndex(101629);
        }

        C86401i(AbstractC86612a aVar) {
            this.f193681b = aVar;
        }

        @Override // com.bytedance.vcloud.strategy.ISelectBitrateListener
        public final String selectBitrateJsonString(String str, int i) {
            Map<String, Integer> a;
            AbstractC86612a aVar = this.f193681b;
            if (aVar == null || (a = aVar.mo137872a()) == null) {
                return null;
            }
            return new JSONObject(a).toString();
        }
    }

    /* renamed from: a */
    private void m148965a(int i, int i2) {
        this.f193586r.lock();
        C86641i.m150113b("DataLoaderHelper", "setIntValue key = " + i + ", value = " + i2);
        boolean z = true;
        if (i == 1) {
            this.f193579k.mMaxCacheSize = i2;
        } else if (i == 2) {
            this.f193579k.mRWTimeOut = i2;
        } else if (i == 3) {
            this.f193579k.mOpenTimeOut = i2;
        } else if (i == 4) {
            this.f193579k.mTryCount = i2;
        } else if (i == 5) {
            this.f193579k.mLoaderType = i2;
        } else if (i == 7) {
            this.f193579k.mEnableExternDNS = i2;
        } else if (i == 8) {
            this.f193579k.mEnableSocketReuse = i2;
        } else if (i == 9) {
            this.f193579k.mSocketIdleTimeOut = i2;
        } else if (i == 55) {
            this.f193579k.mMaxCacheAge = i2;
        } else if (i == 56) {
            this.f193579k.mEnableMaxCacheAgeForAllDir = i2;
        } else if (i == 60) {
            this.f193579k.mEnablePreloadReUse = i2;
        } else if (i == 61) {
            this.f193587s = i2;
        } else if (i == 109) {
            C86381b.C86382a.f193539a.f193526l = i2;
        } else if (i == 110) {
            C86381b.C86382a.f193539a.f193530p = i2;
        } else if (i == 112) {
            this.f193579k.mSpeedSampleInterval = i2;
        } else if (i != 113) {
            switch (i) {
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    this.f193579k.mPreloadParallelNum = i2;
                    AVMDLDataLoader aVMDLDataLoader = this.f193578j;
                    if (aVMDLDataLoader != null) {
                        aVMDLDataLoader.setIntValue(102, i2);
                        break;
                    }
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    if (i2 >= 100) {
                        this.f193594z = this.f193579k.mPreloadStrategy;
                        this.f193579k.mPreloadStrategy = 100;
                    } else {
                        this.f193594z = this.f193579k.mPreloadStrategy;
                        this.f193579k.mPreloadStrategy = i2;
                    }
                    this.f193593y = i2;
                    if (i2 == 200) {
                        this.f193579k.mEnableIOManager = 1;
                        break;
                    }
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    this.f193579k.mCheckSumLevel = i2;
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    this.f193579k.mTestSpeedTypeVersion = i2;
                    break;
                case 15:
                    this.f193547F = i2;
                    break;
                case 16:
                    this.f193579k.mLoaderFactoryP2PLevel = i2;
                    break;
                case 17:
                    C86641i.m150110a("DataLoaderHelper", "set write file notify intervalMS ".concat(String.valueOf(i2)));
                    this.f193579k.mWriteFileNotifyIntervalMS = i2;
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    this.f193555N = i2;
                    break;
                case 19:
                    this.f193557P = i2;
                    break;
                case C84224v.f188239U:
                    this.f193558Q = i2;
                    break;
                case 21:
                    this.f193579k.mEnableDownloaderLog = i2;
                    break;
                case 22:
                    this.f193579k.mEnableTTNetLoader = i2;
                    break;
                case 23:
                    this.f193579k.mTTNetLoaderCronetBufSizeKB = i2;
                    break;
                case 30:
                    this.f193579k.mEncryptVersion = i2;
                    break;
                case 50:
                    this.f193579k.mIsCloseFileCache = i2;
                    break;
                case 80:
                    this.f193579k.mPreloadWaitListType = i2;
                    break;
                case 119:
                    C86594a.m149985a().mo137862a(i2);
                    break;
                case 121:
                    this.f193579k.mUseNewSpeedTestForSingle = i2;
                    break;
                case 200:
                    this.f193579k.mEnableEventInfo = i2;
                    break;
                case 500:
                    this.f193579k.mLiveP2pAllow = i2;
                    break;
                case 501:
                    this.f193579k.mLiveLoaderType = i2;
                    break;
                case 502:
                    this.f193579k.mLiveLoaderEnable = i2;
                    break;
                case 505:
                    this.f193579k.mLiveWatchDurationThreshold = i2;
                    break;
                case 506:
                    this.f193579k.mLiveCacheThresholdHttpToP2p = i2;
                    break;
                case 507:
                    this.f193579k.mLiveCacheThresholdP2pToHttp = i2;
                    break;
                case 508:
                    this.f193579k.mLiveMaxTrySwitchP2pTimes = i2;
                    break;
                case 509:
                    this.f193579k.mLiveWaitP2pReadyThreshold = i2;
                    break;
                case 510:
                    this.f193579k.mLiveMobileUploadAllow = i2;
                    break;
                case 511:
                    this.f193579k.mLiveMobileDownloadAllow = i2;
                    break;
                case 512:
                    this.f193579k.mAlogEnable = i2;
                    AVMDLDataLoader aVMDLDataLoader2 = this.f193578j;
                    if (aVMDLDataLoader2 != null) {
                        aVMDLDataLoader2.setIntValue(7225, i2);
                        break;
                    }
                    break;
                case 513:
                    this.f193579k.mLiveRecvDataTimeout = i2;
                    break;
                case 1000:
                    if (this.f193551J == 1) {
                        mo137389g();
                        AVMDLDataLoader aVMDLDataLoader3 = this.f193578j;
                        if (aVMDLDataLoader3 != null) {
                            aVMDLDataLoader3.setIntValue(7217, 1);
                            break;
                        }
                    }
                    break;
                case 1001:
                    this.f193579k.mEnablePreconnect = i2;
                    break;
                case 1002:
                    this.f193579k.mPreconnectNum = i2;
                    break;
                case 1004:
                    if (i2 == 0) {
                        z = false;
                    }
                    this.f193585q = z;
                    C86641i.m150110a("DataLoaderHelper", "setIntValue: mInvalidMdlProcotol: " + this.f193585q);
                    break;
                case 1005:
                    if (i2 != 1) {
                        z = false;
                    }
                    this.f193549H = z;
                    C86641i.m150110a("DataLoaderHelper", "config DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE: " + this.f193549H);
                    break;
                case 1006:
                    this.f193579k.mRingBufferSizeKB = i2;
                    break;
                case 1007:
                    this.f193579k.mEnableFileCacheV2 = i2;
                    break;
                case 1009:
                    this.f193579k.mEnableFileRingBuffer = i2;
                    break;
                case 1010:
                    this.f193579k.mEnableUseFileExtendLoaderBuffer = i2;
                    break;
                case 1011:
                    this.f193551J = i2;
                    break;
                case 1100:
                    this.f193550I = i2;
                    break;
                case 1101:
                    this.f193579k.mEnableLoaderPreempt = i2;
                    break;
                case 1102:
                    this.f193579k.mAccessCheckLevel = i2;
                    break;
                case 1103:
                    this.f193579k.mNextDownloadThreshold = i2;
                    break;
                case 1104:
                    AVMDLDataLoader aVMDLDataLoader4 = this.f193578j;
                    if (aVMDLDataLoader4 != null) {
                        aVMDLDataLoader4.setIntValue(7219, i2);
                        break;
                    }
                    break;
                case 1105:
                    this.f193579k.mSocketSendBufferKB = i2;
                    break;
                case 1108:
                    this.f193579k.mEnableSyncDnsForPcdn = i2;
                    break;
                case 1109:
                    AVMDLDataLoader aVMDLDataLoader5 = this.f193578j;
                    if (aVMDLDataLoader5 != null) {
                        aVMDLDataLoader5.setIntValue(7227, i2);
                        break;
                    }
                    break;
                case 1110:
                    this.f193579k.mXYLibValue = i2;
                    break;
                case 1111:
                    this.f193579k.mCheckPreloadLevel = i2;
                    break;
                case 1112:
                    this.f193553L = i2;
                    break;
                case 1113:
                    if (i2 == 0) {
                        z = false;
                    }
                    this.f193554M = z;
                    break;
                case 1115:
                    this.f193579k.mMaxIPV6Num = i2;
                    break;
                case 1116:
                    this.f193579k.mMaxIPV4Num = i2;
                    break;
                case 1117:
                    this.f193579k.mForbidByPassCookie = i2;
                    break;
                case 1118:
                    this.f193579k.mEnableLazyBufferpool = i2;
                    break;
                case 1119:
                    this.f193579k.mSessionTimeout = i2;
                    break;
                case 1120:
                    this.f193579k.mEnableNewBufferpool = i2;
                    break;
                case 1121:
                    this.f193579k.mNewBufferPoolBlockSize = i2;
                    break;
                case 1122:
                    this.f193579k.mNewBufferPoolResidentSize = i2;
                    break;
                case 1123:
                    this.f193579k.mNewBufferPoolGrowBlockCount = i2;
                    break;
                case 1124:
                    this.f193579k.mEnablePlayInfoCache = i2;
                    break;
                case 1125:
                    this.f193579k.mControlCDNRangeType = i2;
                    break;
                case 1126:
                    this.f193579k.mEnableP2PPreDown = i2;
                    break;
                case 1127:
                    this.f193579k.mEnablePlayLog = i2;
                    break;
                case 1128:
                    this.f193579k.mEnableNetScheduler = i2;
                    break;
                case 1129:
                    this.f193579k.mNetSchedulerBlockAllNetErr = i2;
                    break;
                case 1130:
                    this.f193579k.mNetSchedulerBlockErrCount = i2;
                    break;
                case 1131:
                    this.f193579k.mNetSChedulerBlockDurationMs = i2;
                    break;
                case 1132:
                    this.f193579k.mFirstRangeLeftThreshold = i2;
                    break;
                case 1133:
                    this.f193579k.mIsAllowTryTheLastUrl = i2;
                    break;
                case 1134:
                    this.f193579k.mEnableCacheReqRange = i2;
                    break;
                case 1135:
                    this.f193579k.mEnableLoaderSeek = i2;
                    break;
                case 1136:
                    this.f193579k.mP2PPreDownPeerCount = i2;
                    break;
                case 1137:
                    this.f193579k.mEnableDynamicTimeout = i2;
                    break;
                case 1138:
                    this.f193579k.mSocketInitialTimeout = i2;
                    break;
                case 1139:
                    this.f193579k.mMaxSocketReuseCount = i2;
                    break;
                case 1140:
                    AVMDLDNSParser.setIntValue(10, i2);
                    break;
                case 1141:
                    AVMDLDNSParser.setIntValue(2, i2);
                    break;
                case 1143:
                    this.f193579k.mP2PFirstRangeLoaderType = i2;
                    break;
                case 1145:
                    this.f193579k.mMaxAliveHostNum = i2;
                    break;
                case 1146:
                    this.f193579k.mFileExtendSizeKB = i2;
                    break;
                case 1147:
                    this.f193579k.mMinAllowSpeed = i2;
                    break;
                case 1148:
                    this.f193579k.mNetSchedulerBlockHostIpErrCount = i2;
                    break;
                case 1150:
                    this.f193579k.mEnableIOManager = i2;
                    break;
                case 1151:
                    this.f193579k.mEnableOwnVDPPreloadNotify = i2;
                    break;
                case 1154:
                    this.f193564W = i2;
                    break;
                case 1155:
                    this.f193567Z = i2;
                    break;
                case 1156:
                    if (i2 > 0) {
                        this.f193569aa.f195043a = (long) i2;
                        break;
                    }
                    break;
                case 1157:
                    if (i2 > 0) {
                        this.f193569aa.f195044b = (long) i2;
                        break;
                    }
                    break;
                case 1158:
                    this.f193579k.mMaxFileMemCacheSize = i2;
                    break;
                case 1159:
                    this.f193579k.mMaxFileMemCacheNum = i2;
                    break;
                case 1160:
                    if (i2 >= 0) {
                        this.f193579k.mEnableEarlyData = i2;
                        break;
                    }
                    break;
                case 1161:
                    if (i2 > 0) {
                        this.f193579k.mSocketRecvBufferSize = i2;
                        break;
                    }
                    break;
                case 1162:
                    if (i2 > 0) {
                        this.f193579k.mEnableSpeedPredict = i2;
                        break;
                    }
                    break;
                case 1163:
                    this.f193565X = i2;
                    break;
                case 1164:
                    this.f193579k.mEnableUseOriginalUrl = i2;
                    break;
                case 1166:
                    this.f193579k.mEnableLoaderLogExtractUrls = i2;
                    break;
                case 1167:
                    this.f193579k.mMaxLoaderLogNum = i2;
                    break;
                case 1168:
                    this.f193579k.mCheckContentTypeMethod = i2;
                    break;
                case 1169:
                    this.f193579k.mCloseThreadPool = i2;
                    break;
                case 1170:
                    this.f193566Y = i2;
                    break;
                case 1501:
                    this.f193579k.mEnableCellularUp = i2;
                    break;
                case LiveNetAdaptiveHurryTimeSetting.DEFAULT:
                    this.f193579k.mEnableStorageModule = i2;
                    break;
                case 2001:
                    this.f193579k.mStoPlayDldWinSizeKBNM = i2;
                    break;
                case 2002:
                    this.f193579k.mStoPlayDldWinSizeKBLS = i2;
                    break;
                case 2003:
                    this.f193579k.mStoRingBufferSizeKB = i2;
                    break;
                case 2004:
                    this.f193579k.mStoIoWriteLimitKBTh1 = i2;
                    break;
                case 2005:
                    this.f193579k.mStoIoWriteLimitKBTh2 = i2;
                    break;
                case 2006:
                    this.f193579k.mStoMaxIdleTimeSec = i2;
                    break;
                case 2100:
                    if (i2 >= 0) {
                        this.f193579k.mEnableP2pUpload = i2;
                        break;
                    }
                    break;
                case 2102:
                    if (i2 >= 0) {
                        this.f193579k.mDevDiskSizeMB = i2;
                        break;
                    }
                    break;
                case 2104:
                    if (i2 >= 0) {
                        this.f193579k.mDevMemorySizeMB = i2;
                        break;
                    }
                    break;
                case 9000:
                    this.f193552K = i2;
                    break;
                case 9001:
                    this.f193579k.mIgnorePlayInfo = i2;
                    break;
                case 9008:
                    this.f193561T = i2;
                    break;
                default:
                    switch (i) {
                        case 63:
                            this.f193579k.mMaxIpCountEachDomain = i2;
                            break;
                        case 64:
                            this.f193579k.mEnableIpBucket = i2;
                            break;
                        case 65:
                            this.f193579k.mErrorStateTrustTime = i2;
                            break;
                        case 66:
                            this.f193579k.mOnlyUseCdn = i2;
                            break;
                        default:
                            switch (i) {
                                case 90:
                                    this.f193579k.mDNSMainType = i2;
                                    AVMDLDNSParser.setIntValue(0, i2);
                                    break;
                                case 91:
                                    this.f193579k.mDNSBackType = i2;
                                    AVMDLDNSParser.setIntValue(1, i2);
                                    break;
                                case 92:
                                    this.f193579k.mMainToBackUpDelayedTime = i2;
                                    AVMDLDNSParser.setIntValue(3, i2);
                                    break;
                                case 93:
                                    this.f193579k.mEnableBenchMarkIOSpeed = i2;
                                    break;
                                case 94:
                                    this.f193579k.mSpeedCoefficientValue = i2;
                                    break;
                                case 95:
                                    C86381b.C86382a.f193539a.f193527m = i2;
                                    break;
                                case 96:
                                    C86381b.C86382a.f193539a.f193523i = i2;
                                    break;
                                case 97:
                                    C86381b.C86382a.f193539a.f193524j = i2;
                                    break;
                                case 98:
                                    C86381b.C86382a.f193539a.f193525k = i2;
                                    break;
                                case 99:
                                    C86381b.C86382a.f193539a.f193528n = i2;
                                    break;
                                case HandlerC21534a.f51116a:
                                    this.f193579k.mMaxTlsVersion = i2;
                                    break;
                                case 101:
                                    this.f193579k.mEnableSessionReuse = i2;
                                    break;
                                default:
                                    switch (i) {
                                        case 103:
                                            AVMDLDNSParser.setIntValue(4, i2);
                                            break;
                                        case 104:
                                            AVMDLDNSParser.setIntValue(5, i2);
                                            break;
                                        case 105:
                                            try {
                                                AVMDLDNSParser.setIntValue(6, i2);
                                                break;
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                                break;
                                            } catch (Throwable th) {
                                                this.f193586r.unlock();
                                                throw th;
                                            }
                                        case 106:
                                            AVMDLDNSParser.setIntValue(7, 1);
                                            break;
                                    }
                            }
                    }
            }
        } else {
            this.f193579k.mGlobalSpeedSampleInterval = i2;
            AVMDLDataLoader aVMDLDataLoader6 = this.f193578j;
            if (aVMDLDataLoader6 != null) {
                aVMDLDataLoader6.setIntValue(7370, i2);
            }
        }
        this.f193586r.unlock();
    }

    /* renamed from: a */
    private static String m148959a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String h = C86640h.m150106h(str);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        String h2 = C86640h.m150106h(str2);
        if (!TextUtils.isEmpty(h2)) {
            str = h2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(str);
        stringBuffer.append("&k=");
        stringBuffer.append(h);
        stringBuffer.append("&pv=");
        stringBuffer.append(1);
        if (i > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i);
        }
        return stringBuffer.toString();
    }

    @Override // com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getStringValue(int i, long j, String str) {
        String str2 = str;
        C86641i.m150110a("DataLoaderHelper", "[preload] getStringValue, key = ".concat(String.valueOf(str2)));
        String str3 = null;
        if (i == 1506) {
            C86399g gVar = this.f193575g;
            C86392d b = gVar != null ? gVar.mo137418b(str2) : null;
            C86641i.m150110a("DataLoaderHelper", "[preload] getStringValue, key = ".concat(String.valueOf(str2)));
            if (!(b == null || b.f193625o == null || b.f193625o.f195156i == null)) {
                String c = b.f193625o.f195156i.mo124263c();
                String[] a = b.f193625o.f195156i.mo124261a();
                C86392d.C86394b a2 = b.mo137399a(str2);
                long b2 = b.f193625o.f195156i.mo124262b();
                String d = b.f193625o.f195156i.mo124264d();
                if (b.f193628r != null) {
                    str3 = "tag=" + C86640h.m150106h(b.f193628r);
                }
                str3 = m148961a(c, c, a2.f193642i, b2, a, d, str3, false, (String) null);
                if (!TextUtils.isEmpty(c)) {
                    str2 = c;
                }
                a2.f193634a = str2;
                C86641i.m150110a("DataLoaderHelper", C1764a.m5928a("[preload] get proxxy url from url: %s", new Object[]{str3}));
            }
        } else if (i == 1509 && this.f193570b != null && !TextUtils.isEmpty(str2)) {
            HashMap<String, String> a3 = this.f193570b.mo124249a();
            if (a3 == null || a3.size() == 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (String str4 : a3.keySet()) {
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(a3.get(str4))) {
                    sb.append(str4).append(": ").append(a3.get(str4)).append("\r\n");
                }
            }
            C86641i.m150110a("DataLoaderHelper", C1764a.m5928a("[customheader] get custom header:%s url: %s", new Object[]{str2, sb.toString()}));
            return sb.toString();
        }
        return str3;
    }

    /* renamed from: a */
    private String m148961a(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, boolean z, String str5) {
        return m148960a(str, str2, j, j2, strArr, str3, str4, 0, (String) null, z, str5, 0);
    }

    /* renamed from: a */
    private String m148962a(String str, String str2, long j, String[] strArr, String str3, String str4, int i, String str5, boolean z) {
        return m148960a(str, str2, j, 0, strArr, str3, str4, i, str5, z, (String) null, 0);
    }

    /* renamed from: a */
    private String m148960a(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, int i, String str5, boolean z, String str6, int i2) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        if (j2 <= 0) {
            j2 = 0;
        }
        for (String str7 : strArr2) {
            if (!m148982n(str7)) {
                return null;
            }
        }
        String[] b = m148975b(strArr2);
        String h = C86640h.m150106h(str);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        TextUtils.isEmpty(str2);
        String[] a = m148973a(b);
        C86641i.m150110a("DataLoaderHelper", "preloadProxyQuery: key = " + str + ", rawKey = " + str2);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        String h2 = C86640h.m150106h(str);
        if (TextUtils.isEmpty(h2)) {
            h2 = "videoId";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(h2);
        stringBuffer.append("&k=");
        stringBuffer.append(h);
        if (j2 > 0) {
            stringBuffer.append("&s=");
            stringBuffer.append(j + j2);
        }
        if (i > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i);
        }
        if (!TextUtils.isEmpty(str3)) {
            String h3 = C86640h.m150106h(str3);
            if (!TextUtils.isEmpty(h3)) {
                stringBuffer.append("&p=");
                stringBuffer.append(h3);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            String h4 = C86640h.m150106h(str5);
            if (!TextUtils.isEmpty(h4)) {
                stringBuffer.append("&h=");
                stringBuffer.append(h4);
            }
        }
        if (z) {
            stringBuffer.append("&ft=1");
        }
        if (i2 > 0) {
            stringBuffer.append("&ev=".concat(String.valueOf(i2)));
        }
        if (!TextUtils.isEmpty(str6)) {
            String h5 = C86640h.m150106h(str6);
            if (!TextUtils.isEmpty(h5)) {
                stringBuffer.append("&dtk=");
                stringBuffer.append(h5);
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i3 = 0; i3 < a.length; i3++) {
            String i4 = C86640h.m150107i(a[i3]);
            StringBuffer stringBuffer3 = new StringBuffer();
            if (!TextUtils.isEmpty(i4)) {
                stringBuffer3.append("&u");
                stringBuffer3.append(i3);
                stringBuffer3.append("=");
                stringBuffer3.append(i4);
            }
            if (stringBuffer.length() + stringBuffer2.length() + stringBuffer3.length() + 32 > 3096) {
                break;
            }
            stringBuffer2.append(stringBuffer3);
        }
        if (stringBuffer2.length() <= 0) {
            return null;
        }
        stringBuffer.append(stringBuffer2);
        if (!TextUtils.isEmpty(str4) && stringBuffer.length() + str4.length() + 33 <= 3096) {
            stringBuffer.append("&");
            stringBuffer.append(str4);
        }
        return stringBuffer.toString();
    }
}
